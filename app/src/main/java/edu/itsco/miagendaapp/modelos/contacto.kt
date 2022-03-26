package edu.itsco.miagendaapp.modelos

import android.os.Parcel
import android.os.Parcelable

class contacto: Parcelable {

    var nombre:String?
    var telefono:String?
    var email:String?

    constructor(parcel: Parcel){
        nombre = parcel.readString()
        telefono = parcel.readString()
        email = parcel.readString()
    }

    constructor(nombre:String,telefono:String,email:String){
        this.nombre=nombre
        this.telefono=telefono
        this.email=email
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(telefono)
        parcel.writeString(email)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<contacto> {
        override fun createFromParcel(parcel: Parcel): contacto {
            return contacto(parcel)
        }

        override fun newArray(size: Int): Array<contacto?> {
            return arrayOfNulls(size)
        }
    }
}