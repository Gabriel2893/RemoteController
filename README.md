# <img align="center" alt="RemoteController" height="50" width="50" src="https://github.com/Gabriel2893/RemoteController/assets/146888502/4320370c-94b8-4715-ac33-27a3ae86fe6c"> Remote Controller simulation application using Java (JSE) 

> [!NOTE]
> Objective: Simplified Remote Controller system

 ## 📝How the code was written

the code was written using a principle of “Object-Oriented-Programming” (OOP) : <i>Encapsulation</i>  and <i>Abstraction</i> <br>
And was also consumed the concepts of [Clean Code](https://blog.codacy.com/what-is-clean-code) just like:

* Avoid Hard-Coded Numbers
* Use Meaningful and Descriptive Names

## 👨‍💻Firtly the abstract methods were created in the interface class called [Controller](https://github.com/Gabriel2893/RemoteController/blob/master/src/main/java/org/example/Controller.java):

*  `turnOn();` : 
*  `turnOff();` :
*  `openMenu();` :
*  `closeMenu();` :
*  `volumeUp();` :
*  `volumeDown();` :
*  `mueteOn();` :
*  `muteOff();` :
*  `play();` :
*  `pause();` :

## 🎨 The next step was to creat the class [RemoteController](https://github.com/Gabriel2893/RemoteController/blob/master/src/main/java/org/example/RemoteController.java), implement the interface, define the attributes and make a constructor metlhod:
      
      public RemoteController() {
          this.volume = 50;
          this.on = false;
          this.playing = false;

when a new *RemoteController* is created it will begins by defaut with:
* Volume 50
* Power On
* playing nothing (Off)
  












 





















  


 
