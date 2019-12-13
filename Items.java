package com.company;

abstract class Items extends Objects implements ObjectsAction{
    String Items_designation;

   protected Items(String designation) {
    this.Items_designation=designation;
    this.designation=designation;
    }


}
