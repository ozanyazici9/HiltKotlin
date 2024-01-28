package com.ozanyazici.hiltkotlin

import javax.inject.Inject

class ClassExample
//Gerekli olan bağımlılıkları burada olduğu gibi primary constructorda da isteyebilirim,
//mainActivityde olduğu gibi field ınjection da yapabilirim.

//MyInterface in içinde oluşturduğum anotasyonları kullanarak hangi sınıftan ne oluşturacağını bilr hale getirdik.
@Inject
constructor(@FirstImplementor private val myInterfaceImplementor: MyInterface,
            @SecondImplementor private val mySecondInterfaceImplementor: MyInterface)
{
    fun myFunction() : String {
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun secondFunction() : String {
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}