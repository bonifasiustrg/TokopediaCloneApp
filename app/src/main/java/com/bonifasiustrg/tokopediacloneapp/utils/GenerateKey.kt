package com.bonifasiustrg.tokopediacloneapp.utils

import com.bonifasiustrg.tokopediacloneapp.model.ListCategory
import kotlin.random.Random

//generate unique key
val keys = mutableListOf<Int>()
fun itemKey(index: ListCategory): Int {
    while (true) {
        val key = Random.nextInt()
        if (!keys.contains(key)) {
            keys.add(key)
            return key
        }
    }
}