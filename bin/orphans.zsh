#!/bin/zsh

# Associative array to hold the status of whether a file is referenced
typeset -A referenced

# Initialize all .md files as not referenced
for file in *.md; do
  referenced[$file]=0
done

# Search for references of each file in other Markdown files
for file in *.md; do
  for check in *.md; do
    # Avoid checking the file against itself
    if [[ "$file" != "$check" ]]; then
      if grep -qF "($file)" "$check"; then
        referenced[$file]=1
        break
      fi
    fi
  done
done

# Print out files that are not referenced
for file in ${(k)referenced}; do
  if [[ ${referenced[$file]} -eq 0 ]]; then
    print -- "$file"
  fi
done

