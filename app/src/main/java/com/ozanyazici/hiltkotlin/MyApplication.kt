package com.ozanyazici.hiltkotlin

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
//Hilti kullanmaya başlamak için bu sınıfı yazmamız gerekli.
//@HiltAndroidApp işareti, Hilt'in uygulama seviyesinde bağımlılık enjeksiyonunu başlatmasını sağlar.
//Bu işaret, genellikle uygulamanın Application sınıfına eklenir ve
//Hilt'in uygulama başlatıldığında otomatik olarak başlatılmasını ve bağımlılıkların yönetilmesini sağlar.
@HiltAndroidApp
class MyApplication : Application() {
}