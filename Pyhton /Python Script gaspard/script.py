import re
import requests
from bs4 import BeautifulSoup

base_url = "https://www.barreau-montpellier.com/fr/annuaire/tableau"
page_number = 1
all_emails = []

while True:
    # Construction de l'URL pour chaque page
    url = base_url if page_number == 1 else f"{base_url}/page-{page_number}"
    response = requests.get(url)
    
    if response.status_code != 200:
        print(f"Impossible de récupérer la page {page_number}. Code de statut : {response.status_code}")
        break

    # Parse le contenu de la page avec BeautifulSoup
    soup = BeautifulSoup(response.content, 'html.parser')
    page_text = soup.get_text()
    
    # Extraction des emails sur la page actuelle
    emails = re.findall(r'\b[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b', page_text)
    all_emails.extend(emails)  # Ajoute tous les emails trouvés à la liste générale
    
    # Vérifie si un lien vers la page suivante existe
    next_page_link = soup.find('a', string=str(page_number + 1))
    
    if not next_page_link:  # Arrête la boucle si pas de page suivante
        print("Aucune page suivante trouvée.")
        break

    # Incrémente pour la page suivante
    page_number += 1

# Filtrage des emails pour ne garder que ceux avec les domaines spécifiés
allowed_domains = [
    "@gmail.com", "@laposte.net", "@orange.fr", "@sfr.fr", "@free.fr",
    "@bbox.fr", "@yahoo.fr", "@yahoo.com", "@outlook.fr", "@outlook.com",
    "@hotmail.fr", "@hotmail.com", "@protonmwail.com", "@icloud.com"
]

filtered_emails = [email for email in all_emails if any(email.endswith(domain) for domain in allowed_domains)]

# Affichage des résultats
if filtered_emails:
    print("Emails correspondant aux domaines spécifiés :")
    for idx, email in enumerate(filtered_emails, start=1):
        print(f"{email}")
else:
    print("Aucun email correspondant aux domaines spécifiés n'a été trouvé.")
