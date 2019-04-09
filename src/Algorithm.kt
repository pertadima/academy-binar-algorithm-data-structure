class Algorithm {
    fun ifControlFlow(sayaLapar: Boolean) {
        //if else conditional
        if (sayaLapar) {
            println("Saya harus makan")
        } else {
            println("Saya sudah kenyang")
        }

        //if else conditional as expression
        val toDo = if (sayaLapar) "Saya harus makan" else "Saya sudah kenyang"
        println(toDo)
    }

    //when conditional
    fun whenControlFlow(sayaLapar: Boolean) {
        when (sayaLapar) {
            true -> println("Saya harus makan")
            else -> println("Saya sudah kenyang")
        }
    }

    fun whenControlFlowConditional(sayaLapar: Boolean) {
        when {
            sayaLapar -> println("Saya harus makan")
            else -> println("Saya sudah kenyang")
        }
    }


    //check nilai
    fun checkNilai(nilai: Int) {
        when (nilai) {
            10, 9, 8 -> println("Nilai kamu sudah sangat bagus, tingkatkan !")
            7 -> println("Selamat kamu lulus, tapi jangan lupa terus belajar ya !")
            else -> println("Kamu tidak lulus, jangan putus asa dan lebih giat lagi ya !")
        }
    }

    //check nilai using range
    fun checkNilaiRange(nilai: Int) {
        when (nilai) {
            0 -> println("Kamu tidak lulus, kamu harus berjuang lebih keras lagi ya !")
            in 1..6 -> println("Selamat kamu lulus, tapi jangan lupa terus belajar ya !")
        }
    }

    //forloop
    fun simpleForLoop() {
        //Tampil 0 sampai 3
        for (i in 1..3) {
            println("INDEX : $i")
        }

        //Tampil 3 sampai 0
        for (i in 3 downTo 0) {
            println("INDEX PERULANGAN NEGATIF: $i")
        }

        //Tampil 6 sampai 0 setiap 2 step = 6,4,2,0
        for (i in 6 downTo 0 step 2) {
            println("INDEX PERULANGAN NEGATIF DENGGAN STEP: $i")
        }
    }

    //while and do while loop
    fun simpleWhileLoop(index: Int) {
        var curIndex = index
        while (curIndex != 0) {
            println("INDEX : $curIndex")
            curIndex--
        }
    }

    fun doWhileLoop(index: Int) {
        var curIndex = index
        do {
            println("INDEX : $curIndex")
            curIndex--
        } while (curIndex != 0)
    }
}