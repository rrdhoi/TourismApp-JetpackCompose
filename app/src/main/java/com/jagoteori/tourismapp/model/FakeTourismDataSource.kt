package com.jagoteori.tourismapp.model

import com.jagoteori.tourismapp.R

object FakeTourismDataSource {
    private val dummySchedule = listOf(
        Schedule(
            id = 1,
            day = "MONDAY",
            date = "12 APRIL 2021",
            isAvailable = true,
            isSelected = false,
        ),
        Schedule(
            id = 2,
            day = "TUESDAY",
            date = "13 MAY 2021",
            isAvailable = true,
            isSelected = false,
        ),
        Schedule(
            id = 3,
            day = "WEDNESDAY",
            date = "14 JUNE 2021",
            isAvailable = false,
            isSelected = false,
        ),
        Schedule(
            id = 4,
            day = "THURSDAY",
            date = "15 JULY 2021",
            isAvailable = false,
            isSelected = false,
        ),
        Schedule(
            id = 5,
            day = "FRIDAY",
            date = "16 AUGUST 2021",
            isAvailable = true,
            isSelected = false,
        ),
    )

    val dummyTourism = listOf(
        Tourism(
            id = 1,
            name = "Aogashima",
            location = "Tokyo, Jepang",
            rate = "4.8",
            description =
            "Pulau Aogashima ini memang masih hijau, bersih, dan memiliki kawah gunung berapi yang masih aktif, meskipun masih aktif tempat ini juga memiliki penduduk sekitar 200 penduduk, yang uniknya masyarakat di sekitar pulau ini jauh sekali dengan dunia modern, mereka biasanya melakukan aktifitas mendaki dan yang paling asik adalah mereka biasanya sauna di uap panas yang ada di sekitar bagian tengah Pulau Augashima.",
            ticketPrice = "\$ 25",
            picture = R.drawable.image_destination1,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 2,
            name = "Antelope Canyon",
            location = "Amerika Serikat",
            rate = "4.2",
            description =
            "Tempat ini memang menjadi tempat yang indah karena saat dinding Antelope Canyon ini terpantul cahaya maka memberikan warna-warna yang indah, hal ini lah yang menarik wisatan dari seluruh dunia, biasanya mereka disini melakukan aktifitas mendaki dan berkemah untuk melihat bagaimana indahnya Antelope Cayon saat terpantul matahari.",
            ticketPrice = "\$ 12",
            picture = R.drawable.image_destination2,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 3,
            name = "Beachy Head",
            location = "London, Inggris",
            rate = "4.5",
            description =
            "Jalan Asia Afrika di Bandung memiliki kaitan yang sangat erat dengan pendirian kota Kembang ini. Karena pada saat itu, Gubernur Jenderal Herman Willem Deaendels dari Belanda menancapkan tongkatnya saat memerintahkan pendirian kota ini, yang kemudian diabadikan menjadi tugu Bandung Nol Kilometer.",
            ticketPrice = "\$ 15",
            picture = R.drawable.image_destination3,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 4,
            name = "Turquoise Lake",
            location = "Cina",
            rate = "4.7",
            description =
            "Danau yang cantik ini memang memiliki pemandangan yang sangat luar biasa dari permukaan danau ini anda bisa melihat betapa jernihnya air ini bagaikan di negeri dongeng anda bisa berkaca dari atas permukaan danau ini. Karena keindahan dari Crystalline Turquoise Lake akhirnya pada tahun 1992 UNESCO menjadikan kawasan ini sebagai cagar alam di Negara Cina yang menjadi situs warisan dunia.",
            ticketPrice = "\$ 18",
            picture = R.drawable.image_destination4,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 5,
            name = "Kota Bern",
            location = "Amtsbezirke, Swiss",
            rate = "4.5",
            description =
            "Kota terindah di dunia ini menjad ibu kota Negara Swiss, untuk anda yang belum tau Swiss itu sebenarnya berada di Eropa Tengah. Nah kenapa di beri nama Kota Bern? karena penamaan dari Kota Bern sendiri memiliki arti yaitu Bern dalam bahasa Jerman artinya Beruang, makanya saat anda berada di Kota Bern maka anda bisa melihat beberapa Simbol beruang pada kota ini.",
            ticketPrice = "\$ 12",
            picture = R.drawable.image_destination5,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 6,
            name = "Sa Pa",
            location = "Lao Cai, Vietnam",
            rate = "4.3",
            description =
            "tempat wisata terindah dunia Sa Pa ini memang menyuguhkan pemandangan sangat indah, disini anda bisa melihat pemandangan yang indah mirip dengan lukisan, anda bisa melihat pegunungan yang berjejer rapi, hamparan sawah yang hijau di lereng gunung, dan disekitar Sa Pa anda bisa melihat berwarna-warni tanaman yang meberikan kesan pemandangan alam yang masih asri, memang Sa Pa ini pantas disebut sebagai surga tersembunyi di Vietnam bagi wisatawan yang sudah pernah berkunjung ketempat ini.",
            ticketPrice = "\$ 22",
            picture = R.drawable.image_destination6,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 7,
            name = "Sydney",
            location = "South Wales, Australia",
            rate = "4.4",
            description =
            "Sydney menawarkan destinasi yang cocok dijadikan referensi tempat hiburan saat berlibur yakni Taronga Zoo yang berada di Bradleys Head Road. Selain melihat secara langsung, anda juga dapat menyaksikan pertunjukan hewan dan berswafoto dengan mereka",
            ticketPrice = "\$ 27",
            picture = R.drawable.image_destination7,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 8,
            name = "Raja Ampat",
            location = "Indonesia",
            rate = "4.9",
            description =
            "Raja Ampat memang menjadi Pulau yang Indah di Indonesia dan diakui oleh dunia bahwa Raja Ampat menjadi Pulau yang sangat indah dan menjadi surganya bagi para penyelam disini anda bisa melihat 80% biota laut di seluruh dunia pada satu tempat, makanya banggalah guys jadi orang Indonesia karena kita memiliki Raja Ampat yang sangat kaya akan biota laut.",
            ticketPrice = "\$ 19",
            picture = R.drawable.image_destination8,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 9,
            name = "Manarola",
            location = "La Spezia, Italia",
            rate = "4.2",
            description =
            "Manarola di Italia ini adalah desa nelayan yang berada di atas bukit yang indah, selain berada di atas bukit yang indah di Manarola terdapat bangunan-bangunan yang kuno yang menarik perhatian wisatawan untuk berkunjung ke Manarola.",
            ticketPrice = "\$ 20",
            picture = R.drawable.image_destination9,
            isFavorite = false,
            schedule = dummySchedule
        ),
        Tourism(
            id = 10,
            name = "Sudiang",
            location = "Makassar, Indonesia",
            rate = "5.0",
            description =
            "Sudiang itu salah satu nama kelurahan di Makassar. Letaknya ada di ujung utara Kota Makassar dan jadi perbatasan antara Kota Makassar dengan Kabupaten Maros.",
            ticketPrice = "\$ 100",
            picture = R.drawable._017_06_02,
            isFavorite = false,
            schedule = dummySchedule
        ),
    )


}