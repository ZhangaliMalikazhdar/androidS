package com.example.f9

import android.os.Parcel
import android.os.Parcelable

data class Customer(var name:String,var description:String):
    Parcelable {
    constructor(parcel: Parcel):this(
        parcel.readString()!!,
        parcel.readString()!!
    ){}

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        p0?.writeString(name)
        p0?.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<Customer>{
        override fun createFromParcel(parcel: Parcel):Customer{
            return Customer(parcel)
        }
        override fun newArray(size: Int):Array<Customer?>{
            return arrayOfNulls(size)
        }
    }
}