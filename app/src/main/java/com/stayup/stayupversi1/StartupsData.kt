package com.stayup.stayupversi1

object StartupsData {
    private val startupNames = arrayOf(
            "Gojek",
            "Tokopedia",
            "Traveloka",
            "Grab",
            "Bukalapak",
            "Kitabisa",
            "OVO",
            "Jenius",
            "Dana",
            "Ruangguru",
    )

    private val startupDetails = arrayOf(
            "Gojek merupakan sebuah perusahaan teknologi asal Indonesia yang melayani angkutan melalui jasa ojek. Perusahaan ini didirikan pada tahun 2010 di Jakarta oleh Nadiem Makarim. Saat ini, Gojek telah tersedia di 50 kota di Indonesia. Hingga bulan Juni 2016, aplikasi Gojek sudah diunduh sebanyak hampir 10 juta kali di Google Play pada sistem operasi Android, dan telah tersedia di App Store. Gojek juga mempunyai layanan pembayaran digital yang bernama Gopay. Selain di Indonesia, layanan Gojek kini telah tersedia di Thailand, Vietnam dan Singapura.",
            "Tokopedia merupakan perusahaan perdagangan elektronik atau sering disebut toko daring. Sejak didirikan pada tahun 2009, Tokopedia telah bertransformasi menjadi sebuah unicorn yang berpengaruh tidak hanya di Indonesia tetapi juga di Asia Tenggara. Hingga saat ini, Tokopedia termasuk marketplace yang paling banyak dikunjungi oleh masyarakat Indonesia. Tokopedia turut mendukung para pelaku Usaha Mikro Kecil dan Menengah (UMKM) dan perorangan untuk mengembangkan usaha mereka dengan memasarkan produk secara daring dengan Pemerintah dan pihak-pihak lainnya. Salah satu program kolaborasi yang diinisasi oleh Tokopedia adalah acara tahunan MAKERFEST yang diadakan sejak bulan Maret 2018.",
            "Traveloka adalah perusahaan yang menyediakan layanan pemesanan tiket pesawat dan hotel secara daring dengan fokus perjalanan domestik di Indonesia. Didirikan pada tahun 2012 oleh Ferry Unardi, Derianto Kusuma, dan Albert Zhang. Traveloka yang merupakan salah satu perusahaan rintisan (startup) berstatus unicorn asal Indonesia ini mengembangkan layanannya pada pemesanan tiket kereta api, bus, penyewaan mobil, hingga aktivitas wisata. Sejak tahun 2015, Traveloka mulai berekspansi ke sejumlah negara di Asia Tenggara seperti Singapura, Malaysia, Vietnam, Thailand, dan Filipina.",
            "Grab merupakan salah satu platform layanan on demand yang bermarkas di Singapura. Berawal dari layanan transportasi, perusahaan tersebut kini telah mempunyai layanan lain seperti pengantaran makanan dan pembayaran yang bisa diakses lewat aplikasi mobile. Pada awalnya, Grab didirikan di Malaysia, sebelum kemudian memindahkan kantor pusat mereka ke Singapura. Saat ini, Grab telah beroperasi di Asia Tenggara (kecuali Laos dan Brunei). Grab merupakan startup \"decacorn\" (sebutan untuk startup yang memiliki valuasi perusahaan sebesar US\$10 miliar) pertama di Asia Tenggara. Di Indonesia, Grab melayani pemesanan kendaraan seperti ojek (GrabBike), mobil (GrabCar), taksi (GrabTaksi), kurir (GrabExpress), pesan-antar makanan (GrabFood), dan carpooling (GrabHitch Car). Saat ini Grab tersedia di 125 kota di seluruh Indonesia, mulai dari Banda Aceh - Aceh hingga Jayapura - Papua.",
            "Bukalapak merupakan salah satu perusahaan e-commerce di Indonesia. Didirikan oleh Achmad Zaky, Nugroho Herucahyono, dan Muhamad Fajrin Rasyid pada tahun 2010, Bukalapak awalnya merupakan toko daring yang memungkinkan para pelaku Usaha Kecil dan Menengah (UKM) untuk merambah ke dunia maya. Perusahaan tersebut kini telah melakukan ekspansi ke berbagai lini bisnis lain, termasuk membantu meningkatkan penjualan para warung tradisional lewat layanan Mitra Bukalapak. Pada tahun 2017, Bukalapak menjadi salah satu startup unikorn asal tanah air. Pada tahun 2019, Bukalapak telah memiliki lebih dari 4,5 juta pedagang online, 70 juta pengguna aktif bulanan, 1,9 juta mitra warung, dan rata-rata dua juta transaksi per hari.",
            "Kitabisa adalah wadah untuk berdonasi dan menggalang dana secara online. Berawal dari keinginan membuat gerakan sosial, pada 2013 Alfatih Timur (Timmy) membuat Kitabisa sebagai wadah bagi siapapun yang ingin mewujudkan proyek sosialnya. Seiring waktu, Kitabisa bertransformasi menjadi platform galang dana dan berdonasi secara online. Perjalanan tak selalu mulus, namun semangat tak pernah tergerus. Kini, Kitabisa telah menghubungkan lebih dari 1 juta #OrangBaik dan menyalurkan Rp 500 milIar lebih donasi bagi pihak yang membutuhkan.",
            "OVO merupakan layanan keuangan digital asal Indonesia yang mempermudah pengguna untuk bertransaksi di merchant. Saat ini, OVO termasuk unikorn yang bernilai sekitar \$2,9 miliar pada Oktober 2019. Pendirian OVO dimulai pada tahun 2006, dengan PT Visionet Internasional yang dibentuk oleh PT Multipolar Tbk untuk memenuhi kebutuhan EDC Lippo Bank (telah digabungkan dengan Bank CIMB Niaga pada tanggal 1 November 2008). VisioNet pun mengembangkan variasi produk dan servis yang mereka tawarkan dari sekadar layanan terkelola IT hingga aplikasi dan hardware untuk kebutuhan IT bisnis. PT Visionet Internasional mengalami pengalihan ke perusahaan baru yaitu menjadi PT Visionet Data Internasional pada tahun 2016. Perjalanan OVO dimulai pada tahun 2016 sebagai aplikasi yang menawarkan pembayaran, poin loyalitas, dan layanan keuangan yang didukung oleh lengan digital Lippo Group. Namun ia mendapat izin untuk beroperasi sebagai perusahaan fintech di seluruh Indonesia pada 25 September 2017. OVO berekspansi ke toko luring pada awal 2019. OVO dilaporkan mengakuisisi perusahaan pinjaman peer-to-peer lokal Taralite pada awal 2019.",
            "Jenius adalah sebuah aplikasi perbankan digital. Aplikasi ini membantu penggunanya melakukan aktivitas finansial seperti menabung, bertransaksi, atau mengatur keuangan serta memungkinkan nasabah untuk memiliki rekening bank. Semua dilakukan dari satu tempat, dari ponsel, baik yang berbasis Android maupun iOS. Aplikasi ini diluncurkan oleh Bank BTPN pada 11 Agustus 2016, setelah menjalani masa pengembangan selama 18 bulan dengan total nilai investasi Rp500 miliar. Dalam operasinya, Jenius terkoneksi dengan ekosistem perbankan nasional dan sistem pembayaran internasional melalui kartu debit Visa dan Gerbang Pembayaran Nasional (GPN).",
            "Dana adalah layanan keuangan digital yang berbasis di Jakarta, Indonesia. Perjalanan Dana dimulai pada tahun 2018 sebagai aplikasi yang menawarkan pembayaran, poin loyalitas, dan layanan keuangan yang didukung oleh lengan digital KMK Online. Namun ia mendapat izin untuk beroperasi sebagai perusahaan fintech di seluruh Indonesia pada 5 Desember 2018.",
            "Ruangguru adalah sebuah perusahaan startup teknologi asal Indonesia yang berfokus pada pendidikan. Ruangguru menawarkan platform pembelajaran berbasis kurikulum sekolah melalui video tutorial interaktif oleh guru dan animasi di aplikasi ponsel dan komputer. Perusahaan ini didirikan oleh Adamas Belva Syah Devara dan Muhammad Iman Usman pada April 2017 dan telah memiliki 15 juta pengguna hingga tahun 2019.",
    )

    private val startupImages = intArrayOf(
            R.drawable.gojek,
            R.drawable.tokopedia,
            R.drawable.traveloka,
            R.drawable.grab,
            R.drawable.bukalapak,
            R.drawable.kitabisa,
            R.drawable.ovo,
            R.drawable.jenius,
            R.drawable.dana,
            R.drawable.ruangguru
    )

    val listData: ArrayList<Startup>
        get() {
            val list = arrayListOf<Startup>()
            for (position in startupNames.indices) {
                val startup = Startup()
                startup.name = startupNames[position]
                startup.detail = startupDetails[position]
                startup.image = startupImages[position]
                list.add(startup)
            }
            return list
        }
}