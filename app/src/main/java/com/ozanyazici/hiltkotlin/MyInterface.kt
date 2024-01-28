package com.ozanyazici.hiltkotlin

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String
}
/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor) : MyInterface
 */

//Hilt modülleri, bağımlılıkların nasıl oluşturulacağını ve enjekte edileceğini belirlemek için kullanılır.
//Bu, uygulamanın bağımlılıkları nasıl yöneteceğini ve hangi implementasyonların
//hangi arayüzleri yerine getireceğini tanımlamak için kullanılır.
//Oluşturulacak nesnenin ayarlamalarını yaptığımız yer yani.

//Eğer iki normal sınıf arasında bağımlılık enjeksiyonu yapacaksanız,
//genellikle bir modül kullanmanıza gerek yoktur.
//Bunun yerine, doğrudan constructor enjeksiyonu kullanabilirsiniz.

//@InstallIn anotasyonu, bu modülün hangi bileşen içinde kullanılacağını belirtir.

//@Module anotasyonu, bu sınıfın bir Hilt modülü olduğunu belirtir.

//@Provides metodu, bir bağımlılığın nasıl oluşturulacağını belirtir.

//@Singleton anotasyonu, bu bağımlılığın tek bir örneğinin oluşturulması ve paylaşılması gerektiğini belirtir.
//Bu nedenle, InterfaceImplementor sınıfından oluşturulan nesne uygulama genelinde tek bir örnek olarak paylaşılır.

//Provides daha çok tercih ediliyor.
@InstallIn
@Module
class MyModule {
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction(): MyInterface {
        return InterfaceImplementor()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction(): MyInterface {
        return SecondInterfaceImplementor()
    }
}

//Aynı interface i implemente eden iki farklı sınıf var
//hilt hangisi için hangi nesneyi döndüreceğini anlamıyor bunun için kendi Notasyonumuzu yazıyoruz.

@Qualifier//(eleyici)
@Retention(AnnotationRetention.BINARY)//(alıkoyma, tutma)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor