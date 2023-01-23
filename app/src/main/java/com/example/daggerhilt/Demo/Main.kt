package com.example.daggerhilt.Demo

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.components.SingletonComponent
import java.util.jar.Attributes.Name
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

//interface  One{
//
//    fun getName()
//
//}
//
//class ImplementOne @Inject constructor(private val name:String) : One{
//    override fun getName() {
//       Log.d("main","my name is $name")
//    }
//
//}
//
//class Main @Inject constructor(private val one: One){
//    fun getName(){
//        one.getName()
//    }
//}
//
////@Module
////@InstallIn(SingletonComponent::class)
////abstract class AppModule{
////
////
////    @Binds
////    @Singleton
////    abstract  fun binding(implementOne: ImplementOne):One
////}
//
//@Module
//@InstallIn(SingletonComponent::class)
//class AppModul
//{
//    @Provides
//    @Singleton
//    fun getName():String="Dinesh"
//
//    @Provides
//    @Singleton
//    fun binding(name: String):One=ImplementOne(name)
//}

class Main @Inject constructor(
    @FName
    private val fName:String,
    @LName
    private val lName:String
                        ){
    fun getName(){
        Log.d("main","my name is $fName $lName")
    }

}

@Module
@InstallIn(SingletonComponent::class)
class ModuleApp{
    @Provides
    @FName
    fun getFName():String="Dinesh"

    @Provides
    @LName
    fun getLName():String="prajapati"
}
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName

