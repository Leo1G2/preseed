#!/bin/bash
echo "Entrez le message du commit : "
read commit_message
git add .
git commit -m "$commit_message"
git push
