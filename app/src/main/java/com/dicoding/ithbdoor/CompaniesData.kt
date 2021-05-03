package com.dicoding.ithbdoor
import java.util.*

object CompaniesData {
    private val companiesData = arrayOf(
        arrayOf(
            "Google",
            "Data Analysis",
            "Google was founded by Larry Page and Sergey Brin while they were students at Stanford University. " +
                    "The company was officially launched in September 1998 in a friend’s garage. " +
                    "In one of the most anticipated Initial Public Offerings (IPO) Google raised \$1.67 billion " +
                    "in August of 2004. Today, Google has over 12,000 employees in offices throughout the world.",
            "${R.drawable.google}",
            "Singapore, Singapore",
            "google@example.com"
        ),
        arrayOf(
            "Gojek",
            "Android Developer",
            "Gojek’s journey began in 2010 as a motorcycle ride-hailing call center in Indonesia. The homegrown app was then launched in 2015 with only three services: GoRide, GoSend, and GoMart.\n" +
                    "\n" +
                    "Since then, the app has evolved into a Super App, a multi-services platform with more than 20 services today. " +
                    "Gojek is now a leading technology group of platform serving millions of users in Southeast Asia.",
            "${R.drawable.gojek}",
            "Jakarta, Indonesia",
            "gojek@example.com"
        ),

        arrayOf(
            "Bank BCA",
            "Software Engineer",
            "PT Bank Central Asia Tbk, commonly known as Bank Central Asia (BCA) is an Indonesian bank founded on 21 February 1957. It is considered as the largest privately-owned bank in Indonesia.\n" +
                    "\n" +
                    "The Asian financial crisis in 1997 had a tremendous impact on Indonesia's entire banking system. In particular, it affected BCA's cash flow and even threatened its survival. " +
                    "A bank rush forced BCA to seek assistance from the Indonesian government. The Indonesian Bank Restructuring Agency took over control of the bank in 1998. Full recovery was accomplished later in the same year. In December 1998, " +
                    "third-party funds were back at the pre-crisis level. BCA's assets stood at Rp 67.93 trillion, as opposed to Rp 53.36 trillion in December 1997. Public confidence in BCA was fully restored, and BCA was released by IBRA to BI in 2001.",
            "${R.drawable.bca}",
            "Jakarta, Indonesia",
            "bca@example.com"
        ),

        arrayOf(
            "Dicoding",
            "Curriculum Developer",
            "Dicoding vision is to become the leading technology educational platform that encourages access to broader digital literacy for all. Dicoding has a mission to accelerate Indonesia's transition to a digital world through education on technology that transforms lives.\n" + "\n" +
                    "Now all nations are moving towards a digital world that is based on technological innovation in all aspects of life. We believe technology education is the foundation for every nation to be at the forefront of facing the digital world.",
            "${R.drawable.dicoding}",
            "Bandung, Indonesia",
            "dicoding@example.com"
        ),

        arrayOf(
            "Institut Teknologi Harapan Bangsa",
            "Digital Marketing Specialist",
            "Harapan Bangsa Institute of Technology was founded in 2002 under the auspices of the Petra Harapan Bangsa Foundation. Have faith in God and believe that ITHB was sent to prepare graduates who will become bright, " +
                    "and uphold biblical morals and integrity in making it happen.",
            "${R.drawable.ithb}",
            "Bandung, Indonesia",
            "ithb@example.com"
        ),

        arrayOf(
            "Jabar Digital Service",
            "Backend Developer",
            "One of Governor Ridwan Kamil's ideals in his administration is to turn West Java into a Digital Province. This concern stems from a problem that, according to him, is quite large in West Java, namely the rural-urban disparity in technology. The lack of supporting infrastructure in rural areas makes it difficult for villagers to enjoy the benefits offered by digital technology.\n" +
                    "\n" +
                    "This problem then gave birth to the idea of forming the Jabar Digital Service (JDS) or Technical Implementation Unit for Digital Service Management, Data and Geospatial Information - a unit under the West Java Province Communication and Information Office which is envisioned to narrow the digital divide, helping efficiency and accuracy of data and technology-based policy making, as well as revolutionizing the use of technology in the life of society and government in West Java.",
            "${R.drawable.jds}",
            "Bandung, Indonesia",
            "jds@example.com"
        ),
        arrayOf(
            "OCBC NISP Bank",
            "Penetration Tester",
            "Since 2005, OCBC Overseas Investments Pte. Ltd. has become the majority shareholder, with ownership at the end of 2019 of 85.1%. Recognized for its financial strength and stability, as the controlling shareholder, OCBC Bank always provides full support to Bank OCBC NISP for its commercial banking services.",
            "${R.drawable.ocbc}",
            "Singapore, Singapore",
            "ocbc@example.com"
        ),
        arrayOf(
            "Tokopedia",
            "Machine Learning Engineer",
            "Tokopedia is an Indonesian technology company specializing in e-commerce. It was founded in 2009 by William Tanuwijaya and Leontinus Alpha Edison. It is an Indonesian unicorn along with ride-hailing company Gojek, travel service firm Traveloka, e-commerce company Bukalapak and fintech company OVO.\n" +
                    "\n" +
                    "In 2019, according to a report by iPrice Group, Tokopedia was the most visited e-commerce website on a desktop in Indonesia between July and September with a total of 65,953,400 average monthly visits, securing 25% of the total market share.\n" +
                    "\n" +
                    "On December 15 2020, it was reported that they were considering going public through a SPAC-merger with Bridgetown Holdings (NASDAQ:BTWN) backed by Peter Thiel and Richard Li. The estimated valuation of the post-merger company is between 8 and 10 billion USD.",
            "${R.drawable.tokopedia}",
            "Jakarta, Indonesia",
            "tokopedia@example.com"
        ),

        arrayOf(
            "Toyota",
            "Supply Chain Manager",
            "Toyota Motor Corporation is a Japanese multinational automotive manufacturer headquartered in Toyota, Aichi, Japan. It was founded by Kiichiro Toyoda and incorporated on August 28, 1937. In 2017, Toyota's corporate structure consisted of 364,445 employees worldwide and, as of December 2019, was the tenth-largest company in the world by revenue. \n" +
                    "\n" +
                    "Toyota is the largest automobile manufacturer in the world followed by Volkswagen, based on 2020 unit sales. Toyota was the world's first automobile manufacturer to produce more than 10 million vehicles per year, which it has done since 2012, when it also reported the production of its 200 millionth vehicle.",
            "${R.drawable.toyota}",
            "Aichi, Japan",
            "toyota@example.com"
        ),
        arrayOf(
            "Traveloka",
            "Cloud Engineer",
            "Traveloka is Southeast Asia's leading technology company providing access for users to " +
                    "discover and purchase a wide range of transportation, accommodation, " +
                    "lifestyle, and financial services products. Traveloka’s comprehensive " +
                    "product portfolio includes transport booking services such as flight tickets, " +
                    "bus, trains, car rental, airport transfer, as well as access to the largest " +
                    "accommodation inventory in Southeast Asia, including hotels, apartments, guest houses, homestays, resorts, and villas, making Traveloka as a booking platform with widest selections of accommodation and packages.",
            "${R.drawable.traveloka}",
            "Singapore, Singapore",
            "traveloka@example.com"
        ),
        arrayOf(
            "Apple Inc.",
            "iOS Developer",
            "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops, and sells consumer electronics, computer software, and online services. It is considered one of the Big Five companies in the U.S. information technology industry, along with Amazon, Google, Microsoft, and Facebook. " +
                    "Its hardware products include the iPhone smartphone, the iPad tablet computer, " +
                    "the Mac personal computer, the iPod portable media player, the Apple Watch smartwatch, " +
                    "the Apple TV digital media player, the AirPods wireless earbuds, " +
                    "the AirPods Max headphones, and the HomePod smart speaker line. Apple's software " +
                    "includes iOS, iPadOS, macOS, watchOS, and tvOS operating systems, the iTunes media player, " +
                    "the Safari web browser, the Shazam music identifier, and the iLife and iWork creativity " +
                    "and productivity suites, as well as professional applications like Final Cut Pro X, " +
                    "Logic Pro, and Xcode.",
            "${R.drawable.apple}",
            "California, USA",
            "apple@example.com"
        ),
        arrayOf(
            "IBM",
            "Data Engineer",
            "International Business Machines Corporation (IBM) is an American multinational technology company headquartered in Armonk, New York, with operations in over 170 countries. The company began in 1911, founded in Endicott, New York, as the Computing-Tabulating-Recording Company (CTR) and was renamed \"International Business Machines\" in 1924. IBM is incorporated in New York.\n" +
                    "\n" +
                    "IBM produces and sells computer hardware, middleware and software, and provides hosting and consulting services in areas ranging from mainframe computers to nanotechnology. IBM is also a major research organization, holding the record for most U.S. patents generated by a business (as of 2020) for 28 consecutive years. Inventions by IBM include the automated teller machine (ATM), the floppy disk, the hard disk drive, the magnetic stripe card, the relational database, the SQL programming language, the UPC barcode, and dynamic random-access memory (DRAM). The IBM mainframe, exemplified by the System/360, was the dominant computing platform during the 1960s and 1970s.",
            "${R.drawable.ibm}",
            "New York, USA",
            "ibm@example.com"
        )
    )
    val listData: ArrayList<Company>
        get() {
            val list = ArrayList<Company>()
            for (index in companiesData) {
                val company = Company()
                company.name = index[0]
                company.field = index[1]
                company.detail = index[2]
                company.photo = index[3].toInt()
                company.location = index[4]
                company.sendEmail = index[5]
                list.add(company)
            }
            return list
        }
}