/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_lab_question;
 interface Backend {
  public void connectServer();
}

class Frontend {

  public void responsive(String str) {
    System.out.println(str + " can also be used as frontend.");
  }
}

// Language extends Frontend class
// Language implements Backend interface
class Achieving_Multiple_Inheritance extends Frontend implements Backend {

  String language = "Java";

  // implement method of interface
  public void connectServer() {
    System.out.println(language + " can be used as backend language.");
  }

  public static void main(String[] args) {

    // create object of Language class
    Achieving_Multiple_Inheritance java = new Achieving_Multiple_Inheritance();

    java.connectServer();

    // call the inherited method of Frontend class
    java.responsive(java.language);
  }

}
