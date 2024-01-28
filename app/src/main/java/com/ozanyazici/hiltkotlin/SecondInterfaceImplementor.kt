package com.ozanyazici.hiltkotlin

import javax.inject.Inject

class SecondInterfaceImplementor
    @Inject
    constructor(): MyInterface {
    override fun myPrintFunction(): String {
        return "My Second Interface Implementor"
    }

    //@Inject, sınıfın diğer sınıflar tarafından kullanılabilir olduğunu ve bu sınıfın bağımlılıklarının
    //(diğer sınıflar tarafından sağlanan gerekli nesnelerin) otomatik olarak sağlanabileceğini bildirir.
}