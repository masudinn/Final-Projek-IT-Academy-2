package com.example.recyclerview

object ModelData {
    private val name = arrayOf(
        "Tomat",
        "Cabai",
        "Jahe",
        "Kunyit",
        "Serai",
        "Wortel",
        "Kangkung",
        "Bayam",
        "Sawi",
        "Melon"
    )


    private  val nameDetail = arrayOf(
        "Tomat (Solanum lycopersicum) adalah salah satu tanaman hortikultura yang sangat populer dan memiliki nilai ekonomi tinggi. Tanaman ini termasuk dalam keluarga Solanaceae dan berasal dari wilayah Amerika Tengah dan Selatan. Tomat dikenal sebagai tanaman buah yang serbaguna dan banyak digunakan dalam masakan di seluruh dunia.",
        "Cabai (Capsicum spp.) adalah salah satu tanaman hortikultura penting yang dibudidayakan untuk buahnya yang pedas. Tanaman ini termasuk dalam keluarga Solanaceae dan memiliki berbagai varietas dengan tingkat kepedasan, warna, dan ukuran yang beragam. Cabai merupakan bahan utama dalam banyak masakan di seluruh dunia dan memiliki nilai ekonomi yang tinggi.",
        "Jahe (Zingiber officinale) adalah salah satu tanaman hortikultura yang masuk dalam kelompok tanaman rempah dan obat. Tanaman ini berasal dari keluarga Zingiberaceae dan telah dikenal sejak ribuan tahun lalu karena kegunaan kuliner, kesehatan, dan pengobatannya. Jahe memiliki rimpang yang harum dan pedas, yang menjadi bagian utama yang dimanfaatkan.",
        "Kunyit (Curcuma longa) adalah tanaman hortikultura yang tergolong dalam keluarga Zingiberaceae. Tanaman ini terkenal karena rimpangnya yang berwarna kuning oranye cerah, yang digunakan sebagai bahan rempah, pewarna alami, dan obat tradisional. Kunyit telah dibudidayakan selama ribuan tahun, terutama di Asia Selatan dan Tenggara.",
        "Serai (Cymbopogon citratus), juga dikenal sebagai serai wangi, adalah tanaman hortikultura yang sering digunakan sebagai bumbu dapur, bahan herbal, dan minyak esensial. Tanaman ini berasal dari keluarga Poaceae (rumput-rumputan) dan tumbuh subur di daerah tropis. Serai memiliki aroma khas yang menyegarkan, dengan nuansa lemon, yang berasal dari kandungan senyawa sitral dalam daunnya.",
        "Wortel (Daucus carota) adalah tanaman hortikultura yang termasuk dalam keluarga Apiaceae, yang dikenal luas sebagai sumber pangan sehat dan bergizi. Tanaman ini biasanya tumbuh dengan baik di daerah yang memiliki iklim sedang dan tanah yang subur serta gembur. Akar utama wortel yang berwarna oranye, meskipun ada varietas lain yang berwarna merah, putih, atau ungu, adalah bagian yang dikonsumsi.",
        "Kangkung (Ipomoea aquatica) adalah tanaman hortikultura yang termasuk dalam keluarga Convolvulaceae. Tanaman ini sering ditemukan di daerah tropis dan subtropis, tumbuh dengan baik di area yang lembab atau di sekitar perairan seperti sawah, rawa, atau tepian sungai. Kangkung dikenal sebagai sayuran yang mudah tumbuh, cepat panen, dan kaya akan manfaat kesehatan.",
        "Bayam (Amaranthus spp.) adalah tanaman hortikultura yang termasuk dalam keluarga Amaranthaceae, yang tumbuh subur di daerah tropis dan subtropis. Bayam dikenal sebagai salah satu sayuran daun yang kaya gizi dan banyak digunakan dalam berbagai jenis masakan, baik sebagai sayur bening, tumis, atau bahan tambahan dalam salad. Tanaman ini mudah dibudidayakan dan cepat tumbuh, membuatnya menjadi pilihan populer untuk pertanian skala kecil maupun besar.",
        "Sawi (Brassica rapa) adalah tanaman hortikultura yang termasuk dalam keluarga Brassicaceae, yang juga mencakup tanaman seperti kubis, brokoli, dan kol. Sawi tumbuh subur di daerah tropis dan subtropis, serta menjadi salah satu sayuran daun yang banyak digunakan dalam masakan sehari-hari, seperti sayur bening, tumisan, atau sebagai bahan tambahan dalam salad.",
        "Melon (Cucumis melo) adalah tanaman hortikultura yang termasuk dalam keluarga Cucurbitaceae, yang juga mencakup tanaman seperti semangka, timun, dan labu. Tanaman ini tumbuh subur di daerah yang memiliki iklim hangat dan membutuhkan ruang yang cukup luas untuk berkembang dengan baik. Melon dikenal karena buahnya yang manis, berair, dan menyegarkan, yang menjadikannya populer sebagai camilan atau bahan tambahan dalam salad buah dan minuman."
    )

    private val nameImages = intArrayOf(
        R.drawable.ahmad_dahlan,
        R.drawable.ahmad_yani,
        R.drawable.bung_tomo,
        R.drawable.gatot_subroto,
        R.drawable.ki_hadjar_dewantara,
        R.drawable.mohammad_hatta,
        R.drawable.sudirman,
        R.drawable.sukarno,
        R.drawable.supomo,
        R.drawable.tan_malaka)

    val listData : ArrayList<Model> get() {
        val list = arrayListOf<Model>()
        for (position in name.indices){
            val data = Model()
            data.name = name[position]
            data.detail = nameDetail[position]
            data.photo = nameImages[position]
            list.add(data)
        }
        return list
    }

}
