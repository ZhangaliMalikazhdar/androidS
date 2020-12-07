package com.example.f8

import android.os.Parcel
import android.os.Parcelable

data class User(var name:String):
    Parcelable {
    constructor(parcel: Parcel):this(
        parcel.readString()!!
    ){}

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        p0?.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<User>{
        override fun createFromParcel(parcel: Parcel):User{
            return User(parcel)
        }
        override fun newArray(size: Int):Array<User?>{
            return arrayOfNulls(size)
        }
    }
}