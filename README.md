# GR Code Club

Please work on a branch

## Setup

### Install all the apps and make sure they are all in the start menu and pinned to the task bar.
* Install [MCreator 2023.3](https://mcreator.net/download/2023-3)
* Install [Github Desktop](https://central.github.com/deployments/desktop/desktop/latest/win32)
* Install [Block Bench](https://www.blockbench.net/downloads)
* Install [Curseforge Standalone](https://www.curseforge.com/download/app)
* Install [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC)

### Github Desktop
* Log in to the correct account (`codeclub2023<machineNumber>`)
* Check out https://github.com/gr-codeclub/minecraft-codeclub main branch into C:\minecraft-codeclub
* Make sure the folder is empty other than the README.md and .gitignore.
* Make a new folder named `codeclub2023<machineNumber>`
* Make a new branch named `codeclub2023<machineNumber>`

### MCreator
* Open MCreator
* Click "New Workspace"
  * Change the settings
    * Mod name to `codeclub20233<machineNumber>`
    * Mod id to `codeclub20233<machineNumber>`
    * Mod java package name to `net.mcreator.codeclub2023<machineNumber>`
    * Workspace folder to `C:\minecraft-codeclub\codeclub20233`
* Let it import
* Click the little arrow on the far left to get to the files so you can change the gradle files.

#### settings.gradle

```groovy
pluginManagement {
    repositories {
        // Add this line
        maven { url = 'https://maven.parchmentmc.org' }
    }
}
```

#### build.gradle

##### Add the parchment plugin

In the plugins section add the parchment line

```groovy
plugins {
    // Add this line below the net.minecraftforge.gradle plugin
     id 'org.parchmentmc.librarian.forgegradle' version '1.+'
}
```

##### Set the mappings to use parchment

In the minecraft section change the mappings to parchment.

The mappings line will already be there but with "official" and the wrong version, change it so it looks like so it uses `channel: parchment` and the latest version matching version from [parchment](https://parchmentmc.org/docs/getting-started)

```groovy
minecraft {
     mappings channel: 'parchment', version: '2023.09.03-1.20.1'
 }
```

#### Run it

* Click the little build hammer in the top right
* Click the little green play button in the top right (this should start minecraft if all went well)
* Click Single PLayer
* Click Create New World
* Make sure it is set to Creative mode and that cheats are ON
* Click Generate
* Make sure you can load into the world, then save and exit.

### IntelliJ
* Open IntelliJ
* Install or update the Minecraft plugin
* Click new project and make sure Java 17 (Temurin) is there in the JDK dropdown. If not:
    * Choose download jdk
    * Choose version 17
    * Choose Eclipse Temurin as the Vendor
    * Hit download
* Restart IntelliJ and this time, open an existing project
    * Go and find your new MCreator project in `C:\minecraft-codeclub\codeclub2023<machineNumber>`
    * Choose Gradle as the project type NOT Eclipse.
    * Wait for it to import
        * If it fails, just make it try again by opening the build.gradle file and clicking the little elephant in the top right.
            * There is also a gradle sidebar where you can hit a refresh icon instead if this isn't working.
    * Click through the gradle sidebar on the right hand side 

### Curseforge
* Open Curseforge
* Clear any previous profiles
* Click "Create Custom Profile" and call it CodeClub2023
* Select versions matching the versions from MCreator (1.20.1 + Forge 47.1.0)
* Click create
* Click play
* Check in the top left you are signed in as the correct account `codeclub2023<machineNumber>`
    * If not, sign out if necessary, and sign in again
        * Use the Microsoft Login `codeclub2023<machineNumber>@outlook.com`
* If prompted to make a gamertag, do so. `codeclub2023<machineNumber>` ideally but it doesn't really matter.
* If your account does not already own Minecraft
    * Click on buy
    * Buy the Bedrock + Java Edition, we only care about Bedrock but they don't sell it separately any more. Don't get the Deluxe one.
    * You will need to restart the Minecraft launcher for it to realise you own it.
* Open Minecraft to make sure it launches successfully.

### Finishing off
Commit the project to your new branch and push it.

### Windows updates
Make sure it's up to date
