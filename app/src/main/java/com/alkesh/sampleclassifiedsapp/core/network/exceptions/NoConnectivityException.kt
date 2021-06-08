package com.alkesh.sampleclassifiedsapp.core.network.exceptions

import java.io.IOException

class NoConnectivityException : IOException() {
    override val message: String?
        get() = "No Internet Connection"

}