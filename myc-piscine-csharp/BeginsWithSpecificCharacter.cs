namespace CSharpDiscovery.Quest01
{
    public class BeginsWithSpecificCharacter_Exercice
    {
        public static bool BeginsWithSpecificCharacter(string str, char begin)
        {
            if (str[0] == begin)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
