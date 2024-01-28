package com.ozanyazici.hiltkotlin

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

//Constructor Injection
//Hilt içindeki "scope"lar, bağımlılıkların hangi yaşam döngüsüne bağlı olduğunu belirlemek için kullanılır.
//Scopeların bir hiyerarşisi vardır dökümantasyondan bakılabilir.
@ActivityScoped
class Musician
    @Inject
    constructor(instrument: Instrument, band: Band) {

    fun sing() {
        println("vuuuuuuuu")
    }
}