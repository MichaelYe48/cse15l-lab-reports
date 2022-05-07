# Week 6 Lab Report

## Streamlining ssh Configuration

![Image](configfile.png)

```
michaelye@Michaels-MacBook-Air-3 cse15l-lab-reports % echo this is how I edited the ssh config file
this is how I edited the ssh config file
michaelye@Michaels-MacBook-Air-3 cse15l-lab-reports % vi ~/.ssh/config
```

![Image](edittingUsingVI.png)

To edit my config file, I used vim and pasted the following code in:

```Host cse
    HostName ieng6.ucsd.edu
    User cs15lsp22zzz (use your username)
```

---

This is the command `ssh cse`

![Image](sshcse.png)

I typed `ssh cse` with `cse` replacing the old `cs15lsp22anq@ieng6.ucsd.edu`.

---

This is the command `scp labreport3.txt cse:~/cse15l-lab-reports`
![Image](scpcse.png)

I used the scp command to move a new file I created into the cse15l-lab-reports directory of the ieng6 server.

## Setup Github Access from ieng6

![Image](localpubkey.png)

![Image](githubpubkey.png)

After making the public key on my local computer, I copied the contents in the public key file and pasted it into a new ssh key in github.

---

![Image](private.png)

After using the `ssh-keygen` command during which I made a id_rsa_github file, I got the private key file in my .ssh directory.

---

![Image](.png)

sentence

---

[Commit Link]()

sentence

## Copy whole directories with `scp -r`

![Image](fix3.png)

sentence

---

![Image](thirderror.png)

sentence

---

![Image](thirderror.png)

sentence


