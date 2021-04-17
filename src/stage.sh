
commitMessage="$1"
if [[ -z "${commitMessage// }" ]]
    then
        echo "No commit message given."
        exit
fi
git add . 
git commit -m "$commitMessage"
currentBranch=$(git branch | sed -n -e 's/^\* \(.*\)/\1/p')
git push origin "$currentBranch"
echo "Changes staged and pushed to '$currentBranch'"
