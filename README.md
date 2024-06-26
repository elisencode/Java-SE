[Learn JAVA Programming - Beginner to Master by Abdul Bari](https://www.udemy.com/course/java-se-programming/?couponCode=OT50624NEW)


```

$ java --version
java 22.0.1 2024-04-16
Java(TM) SE Runtime Environment (build 22.0.1+8-16)
Java HotSpot(TM) 64-Bit Server VM (build 22.0.1+8-16, mixed mode, sharing)

```

---


```

$ git checkout elisencode_javaSE

$ git push -u origin elisencode_javaSE

```

---

```
$ git status
On branch elisencode_javaSE
Your branch is up to date with 'origin/elisencode_javaSE'.

nothing to commit, working tree clean

$ git switch master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.

$ git status
On branch master
Your branch is up to date with 'origin/master'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	sec1_4_first_program/

nothing added to commit but untracked files present (use "git add" to track)

$ git branch
  elisencode_javaSE
* master

$ git remote -v
origin	git@github.com:elisencode/Java-SE.git (fetch)
origin	git@github.com:elisencode/Java-SE.git (push)

$ git pull --rebase git@github.com:elisencode/Java-SE.git

$ git status
On branch master
Your branch is ahead of 'origin/master' by 8 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean

$ git branch -a
  elisencode_javaSE
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/elisencode_javaSE
  remotes/origin/master

```

---

[How to Delete Local and Remote Git Branches](https://refine.dev/blog/git-delete-remote-branch-and-local-branch/#what-are-tracking-branches-and-how-to-delete-them)

[Git Cleanup: "git Remote Prune" Explained](https://betterprogramming.pub/git-cleanup-git-remote-prune-explained-679fadc53ba7)

```
$ git branch
  elisencode_javaSE
* master

$ git branch -d elisencode_javaSE 
Deleted branch elisencode_javaSE (was 63fdc68).

$ git branch -r
  origin/HEAD -> origin/master
  origin/elisencode_javaSE
  origin/master
  
$ git remote prune origin
Pruning origin
URL: git@github.com:elisencode/Java-SE.git
 * [pruned] origin/elisencode_javaSE

$ git branch -r
  origin/HEAD -> origin/master
  origin/master
```

