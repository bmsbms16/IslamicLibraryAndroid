package com.fekracomputers.islamiclibrary.utility;

import android.support.annotation.NonNull;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * بسم الله الرحمن الرحيم
 * Created by moda_ on 24/2/2017.
 */
public class ArabicUtilitiesTest {
    private final String full_page = "مُقَدّمَة\n" +
            "قَالَ الشَّيْخ الإِمَام الْعَالم الْعَلامَة الرباني حجَّة الْإِسْلَام رحْلَة الطالبين عُمْدَة الْمُحدثين زين الْمجَالِس فريد عصره ووحيد دهره محيي السّنة الغراء قامع أهل الْبدع والاهواء الشهَاب الثاقب أَبُو الْفضل أَحْمد بن عَليّ بن مُحَمَّد بن مُحَمَّد بن عَليّ الْعَسْقَلَانِي الشهير بِابْن حجر اثابه الله الْجنَّة بمنه وَكَرمه أَمِين الْحَمد لله الَّذِي شرح صُدُور أهل الْإِسْلَام للسّنة فانقادت لاتباعها وارتاحت لسماعها وامات نفوس أهل الطغيان بالبدعة بعد أَن تمادت فِي نزاعها وتغالت فِي ابتداعها وَأشْهد أَن لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ الْعَالم بانقياد الافئدة وامتناعها المطلع على ضمائر الْقُلُوب فِي حالتي افتراقها واجتماعها وَأشْهد أَن مُحَمَّدًا عَبده وَرَسُوله الَّذِي انخفضت بِحقِّهِ كلمة الْبَاطِل بعد ارتفاعها واتصلت بإرساله أنوار الْهدى وَظَهَرت حجتها بعد انقطاعها صلى الله عَلَيْهِ وَسلم مَا دَامَت السَّمَاء وَالْأَرْض هَذِه فِي سَموهَا وَهَذِه فِي اتساعها وعَلى آله وَصَحبه الَّذين كسروا جيوش المردة وفتحوا حصون قلاعها وهجروا فِي محبَّة داعيهم إِلَى الله الاوطار والاوطان وَلم يعاودوها بعد وداعها وحفظوا على أتباعهم اقواله وافعاله واحواله حَتَّى أمنت بهم السّنَن الشَّرِيفَة من ضياعها أما بعد فَإِن أولى مَا صرفت فِيهِ نفائس الْأَيَّام وَأَعْلَى مَا خص بمزيد الاهتمام الِاشْتِغَال بالعلوم الشَّرْعِيَّة المتلقاة عَن خير الْبَريَّة وَلَا يرتاب عَاقل فِي أَن مدارها على كتاب الله المقتفى وَسنة نبيه الْمُصْطَفى وَأَن بَاقِي الْعُلُوم أما الات لفهمهما وَهِي الضَّالة الْمَطْلُوبَة أَو أَجْنَبِيَّة عَنْهُمَا وَهِي الضارة المغلوبة وَقد رَأَيْت الإِمَام أَبَا عبد الله البُخَارِيّ فِي جَامعه الصَّحِيح قد تصدى للاقتباس من انوارهما البهية تقريرا واستنباطا وكرع من مناهلهما الروية انتزاعا وانتشاطا ورزق بِحسن نِيَّته السَّعَادَة فِيمَا جمع حَتَّى اذعن لَهُ الْمُخَالف والموافق وتلقى كَلَامه فِي التَّصْحِيح بِالتَّسْلِيمِ المطاوع والمفارق وَقد استخرت الله تَعَالَى فِي أَن أضم إِلَيْهِ نبذا شارحة لفوائده مُوضحَة لمقاصده كاشفة عَن مغزاه فِي تَقْيِيد اوابده واقتناص شوارده وأقدم بَين يَدي ذَلِك كُله مُقَدّمَة فِي تَبْيِين قَوَاعِده وتزيين فرائده جَامِعَة وجيزة دون الاسهاب وَفَوق الْقُصُور سهلة المأخذ تفتح المستغلق وتذلل الصعاب وتشرح الصُّدُور وينحصر القَوْل فِيهَا إِن شَاءَ الله تَعَالَى فِي عشرَة فُصُول الأول فِي بَيَان السَّبَب الْبَاعِث لَهُ على تصنيف هَذَا الْكتاب الثَّانِي فِي بَيَان مَوْضُوعه والكشف عَن مغزاه فِيهِ وَالْكَلَام على تَحْقِيق شُرُوطه وَتَقْرِير كَونه من أصح الْكتب المصنفة فِي الحَدِيث النَّبَوِيّ ويلتحق بِهِ الْكَلَام على تراجمه البديعة المنال المنيعة الْمِثَال الَّتِي انْفَرد بتدقيقه فِيهَا عَن نظرائه واشتهر بتحقيقه لَهَا عَن قرنائه";
    @NonNull
    String testCase = "<h2>هذا المستدرك</h2>\n" +
            "<p>ثم بعد أن جمعت فتاوى ورسائل مفتي الديار السعودية ورئيس قضائها والشئون الإسلامية سماحة الشيخ محمد بن إبراهيم آل الشيخ بأمر جلالة الملك فيصل بن عبد العزيز آل سعود رحمه الله وطبعت في مطبعة الحكومة بمكة المكرمة عام تسعة وتسعين وثلاثمائة وألف بأمره في ثلاثة عشر مجلدا وانتشرت، وانتفع الناس بها <a class=\"comment\" title=\"&#1608;&#1604;&#1607;&#1575;&#32;&#1601;&#1607;&#1585;&#1587;&#32;&#1593;&#1575;&#1605;&#32;&#1601;&#1610;&#32;&#1605;&#1580;&#1604;&#1583;&#32;&#1605;&#1582;&#1591;&#1608;&#1591;&#46;\">(?)</a> فكرت في البحث عن شيء «ما» لشيخ الإسلام أحمد ابن تيمية (قدس الله روحه) ، فتذكرت أني حين سافرت إلى بغداد للبحث عن فتاوى شيخ الإسلام عثرت على مجلد من «الدرر المضية من الفتاوى المصرية» وعدد مجلداتها ستة فيما ذكره ابن القيم رحمه الله ويقول العليمي سبعة <a class=\"comment\" title=\"&#1584;&#1603;&#1585;&#1607;&#1575;&#32;&#1575;&#1576;&#1606;&#32;&#1575;&#1604;&#1602;&#1610;&#1605;&#32;&#1601;&#1610;&#32;&#1575;&#1604;&#1606;&#1608;&#1606;&#1610;&#1577;&#32;&#1576;&#1602;&#1608;&#1604;&#1607;&#58;&#10;&#1608;&#1603;&#1584;&#1575;&#1603;&#32;&#1571;&#1580;&#1608;&#1576;&#1577;&#32;&#1604;&#1607;&#32;&#1605;&#1589;&#1585;&#1610;&#1577;&#32;&#46;&#46;&#46;&#32;&#1601;&#1610;&#32;&#1587;&#1578;&#32;&#1571;&#1587;&#1601;&#1575;&#1585;&#32;&#1603;&#1578;&#1576;&#1606;&#32;&#1587;&#1605;&#1575;&#1606;&#10;&#1608;&#1610;&#1602;&#1608;&#1604;&#32;&#1575;&#1604;&#1593;&#1604;&#1610;&#1605;&#1610;&#58;&#32;&#1573;&#1606;&#1607;&#1575;&#32;&#1587;&#1576;&#1593;&#32;&#1605;&#1580;&#1604;&#1583;&#1575;&#1578;&#32;&#40;&#1575;&#1604;&#1583;&#1585;&#32;&#1575;&#1604;&#1605;&#1606;&#1590;&#1583;&#32;&#1580;&#1600;&#50;&#47;&#52;&#55;&#56;&#41;\">(?)</a> ، وتبين أن الخمسة الباقية مفقودة رأيت بعد ذلك أن أرجع إلى مختصر هذه الفتاوى الذي اختصره بدر الدين محمد بن علي بن محمد البعلي الحنبلي المتوفى سنة 777 أو 778هـ وطبع في مطبعة أنصار السنة بمصر في عام 1368هـ لأجمع منها ما ليس في الجزء الأول الذي أدخلته في مجموع الفتاوى السابق، فوجدت فيه فتاوى كثيرة ليست في المجموع الأول، بلغ عددها سبعا وخمسين ومائتي مسألة قليل منها موجود في المجموع السابق لكن في هذا مع زيادة.</p>\n";

    @Test
    public void handleTatweela() throws Exception {
        assertEquals(ArabicUtilities.handleTatweela("بـــــــــــــــــــسم"),
                "بسم");
        assertEquals(ArabicUtilities.handleTatweela("هـ"),
                "هـ");

    }

    @Test
    public void cleanTextForSearchingIndexing() throws Exception {
        assertEquals(ArabicUtilities.cleanTextForSearchingIndexing(testCase),
                "هذا المستدرك ثم بعد ان جمعت فتاوي ورسائل مفتي الديار السعوديه ورئيس قضائها والشئون الاسلاميه سماحه الشيخ محمد بن ابراهيم ال الشيخ بامر جلاله الملك فيصل بن عبد العزيز ال سعود رحمه الله وطبعت في مطبعه الحكومه بمكه المكرمه عام تسعه وتسعين وثلاثمائه والف بامره في ثلاثه عشر مجلدا وانتشرت وانتفع الناس بها فكرت في البحث عن شيء ما لشيخ الاسلام احمد ابن تيميه قدس الله روحه فتذكرت اني حين سافرت الي بغداد للبحث عن فتاوي شيخ الاسلام عثرت علي مجلد من الدرر المضيه من الفتاوي المصريه وعدد مجلداتها سته فيما ذكره ابن القيم رحمه الله ويقول العليمي سبعه وتبين ان الخمسه الباقيه مفقوده رايت بعد ذلك ان ارجع الي مختصر هذه الفتاوي الذي اختصره بدر الدين محمد بن علي بن محمد البعلي الحنبلي المتوفي سنه او هـ وطبع في مطبعه انصار السنه بمصر في عام هـ لاجمع منها ما ليس في الجزء الاول الذي ادخلته في مجموع الفتاوي السابق فوجدت فيه فتاوي كثيره ليست في المجموع الاول بلغ عددها سبعا وخمسين ومائتي مساله قليل منها موجود في المجموع السابق لكن في هذا مع زياده ولها فهرس عام في مجلد مخطوط ذكرها ابن القيم في النونيه بقوله وكذاك اجوبه له مصريه في ست اسفار كتبن سمان ويقول العليمي انها سبع مجلدات الدر المنضد جـ ");
    }

    @Test
    public void cleanHtml() throws Exception {
        assertEquals(ArabicUtilities.cleanHtml(testCase),
                "هذا المستدرك\nثم بعد أن جمعت فتاوى ورسائل مفتي الديار السعودية ورئيس قضائها والشئون الإسلامية سماحة الشيخ محمد بن إبراهيم آل الشيخ بأمر جلالة الملك فيصل بن عبد العزيز آل سعود رحمه الله وطبعت في مطبعة الحكومة بمكة المكرمة عام تسعة وتسعين وثلاثمائة وألف بأمره في ثلاثة عشر مجلدا وانتشرت، وانتفع الناس بها (?) فكرت في البحث عن شيء «ما» لشيخ الإسلام أحمد ابن تيمية (قدس الله روحه) ، فتذكرت أني حين سافرت إلى بغداد للبحث عن فتاوى شيخ الإسلام عثرت على مجلد من «الدرر المضية من الفتاوى المصرية» وعدد مجلداتها ستة فيما ذكره ابن القيم رحمه الله ويقول العليمي سبعة (?) ، وتبين أن الخمسة الباقية مفقودة رأيت بعد ذلك أن أرجع إلى مختصر هذه الفتاوى الذي اختصره بدر الدين محمد بن علي بن محمد البعلي الحنبلي المتوفى سنة 777 أو 778هـ وطبع في مطبعة أنصار السنة بمصر في عام 1368هـ لأجمع منها ما ليس في الجزء الأول الذي أدخلته في مجموع الفتاوى السابق، فوجدت فيه فتاوى كثيرة ليست في المجموع الأول، بلغ عددها سبعا وخمسين ومائتي مسألة قليل منها موجود في المجموع السابق لكن في هذا مع زيادة.\n\nولها فهرس عام في مجلد مخطوط.\nذكرها ابن القيم في النونية بقوله:\nوكذاك أجوبة له مصرية ... في ست أسفار كتبن سمان\nويقول العليمي: إنها سبع مجلدات (الدر المنضد جـ2/478)");
    }

    @Test
    public void cleanTashkeel1() throws Exception {
    }

    @Test
    public void cleanTashkeel() throws Exception {
        String testStringWithTashkeel = "فَكَمْ نَدْ رَأَيْنَا مِنْ رِجَالٍ وَدَوْلَةٍ ... فَبَادُوا جَمِيعًا مُسْرِعِينَ وَزَالُوا";
        String testStringWithTashkeel2 = "خِلَافٌ يَصِحُّ تَخْرِيجُهُ عَلَى هَذِهِ الْقَاعِدَةِ لِأَنَّ قَوْلَهُ حَرَامٌ مُطْلَقٌ دَالٌّ عَلَى مُطْلَقِ التَّحْرِيمِ الدَّائِرِ بَيْنَ الرُّتَبِ الْمُخْتَلِفَةِ فَأَمْكَنَ حَمْلُهُ عَلَى أَعْلَاهَا أَوْ عَلَى أَدْنَاهَا وَيَلْحَقُ بِمَسْأَلَةِ الْحَرَامِ مَا مَعَهَا فِي مَذْهَبِ مَالِكٍ مِنْ الْأَلْفَاظِ نَحْوُ أَلْبَتَّةَ وَالْبَائِنِ وَحَبْلُك عَلَى غَارِبِك هَلْ يُحْمَلُ عَلَى أَعْلَى الرُّتَبِ وَهُوَ الثَّلَاثُ أَمْ لَا وَمِنْهَا مَسْأَلَةُ التَّيَمُّمِ فِي قَوْله تَعَالَى {فَتَيَمَّمُوا صَعِيدًا} [النساء: 43] فَقَوْلُهُ صَعِيدًا مَدْلُولُهُ أَمْرٌ كُلِّيٌّ يُمْكِنُ حَمْلُهُ عَلَى أَدْنَى الرُّتَبِ وَهُوَ مُطْلَقُ مَا يُسَمَّى صَعِيدًا تُرَابًا كَانَ أَوْ غَيْرَهُ مِنْ جِنْسِ الْأَرْضِ وَهُوَ مَذْهَبُ مَالِكٍ - رَحِمَهُ اللَّهُ - أَوْ أَعْلَى رُتَبِ الصَّعِيدِ وَهُوَ التُّرَابُ وَهُوَ مَذْهَبُ الشَّافِعِيِّ فَهَذِهِ الْمَسْأَلَةُ أَيْضًا حَسَنَةُ التَّخْرِيجِ عَلَى هَذِهِ الْقَاعِدَةِ مِنْ غَيْرِ مُعَارِضٍ مِنْ جِهَةِ اللَّفْظِ وَلَا الْمَعْنَى. " +
                "وَمِنْهَا قَوْلُهُ - عَلَيْهِ السَّلَامُ - «إذَا سَمِعْتُمْ الْمُؤَذِّنَ يُؤَذِّنُ فَقُولُوا مِثْلَ مَا يَقُولُ» وَالْمِثْلِيَّةُ فِي لِسَانِ الْعَرَبِ تَصْدُقُ بَيْنَ الشَّيْئَيْنِ بِأَيِّ وَصْفٍ كَانَ مِنْ غَيْرِ شُمُولٍ فَإِذَا قُلْت: زَيْدٌ مِثْلُ الْأَسَدِ كَفَى فِي ذَلِكَ الشُّجَاعَةُ دُونَ بَقِيَّةِ الْأَوْصَافِ وَكَذَلِكَ زَيْدٌ مِثْلُ عَمْرٍو يَصْدُقُ ذَلِكَ حَقِيقَةً بِمُشَارَكَتِهِمَا فِي صِفَةٍ وَاحِدَةٍ فَالْمِثْلُ الْمَذْكُورُ فِي الْأَذَانِ إنْ حُمِلَ عَلَى أَعْلَى الرُّتَبِ قَالَ: مِثْلَ مَا يَقُولُ إلَى آخِرِ الْأَذَانِ أَوْ عَلَى أَدْنَى الرُّتَبِ فَفِي التَّشَهُّدِ خَاصَّةً وَهُوَ مَشْهُورُ مَذْهَبِ مَالِكٍ فَهَذِهِ سِتُّ مَسَائِلَ تُنَبِّهُك عَلَى صِحَّةِ التَّخْرِيجِ عَلَى هَذِهِ الْقَاعِدَةِ وَالْمَسَائِلُ السَّابِقَةُ تُنَبِّهُك عَلَى التَّخْرِيجِ الْفَاسِدِ عَلَيْهَا لِأَنَّ الْأَوَّلَ مِنْ بَابِ الْأَجْزَاءِ وَهَذِهِ مِنْ بَابِ الْجُزْئِيَّاتِ فَقَدْ ظَهَرَ لَك الْفَرْقُ بَيْنَهُمَا وَالصَّحِيحُ مِنْ الْفَاسِدِ.";
        String testStringWithoutTashkeel = "فكم ند رأينا من رجال ودولة ... فبادوا جميعا مسرعين وزالوا";
        String testStringWithoutTashkeel2 = "خلاف يصح تخريجه على هذه القاعدة لأن قوله حرام مطلق دال على مطلق التحريم الدائر بين الرتب المختلفة فأمكن حمله على أعلاها أو على أدناها ويلحق بمسألة الحرام ما معها في مذهب مالك من الألفاظ نحو ألبتة والبائن وحبلك على غاربك هل يحمل على أعلى الرتب وهو الثلاث أم لا ومنها مسألة التيمم في قوله تعالى {فتيمموا صعيدا} [النساء: 43] فقوله صعيدا مدلوله أمر كلي يمكن حمله على أدنى الرتب وهو مطلق ما يسمى صعيدا ترابا كان أو غيره من جنس الأرض وهو مذهب مالك - رحمه الله - أو أعلى رتب الصعيد وهو التراب وهو مذهب الشافعي فهذه المسألة أيضا حسنة التخريج على هذه القاعدة من غير معارض من جهة اللفظ ولا المعنى. " +
                "ومنها قوله - عليه السلام - «إذا سمعتم المؤذن يؤذن فقولوا مثل ما يقول» والمثلية في لسان العرب تصدق بين الشيئين بأي وصف كان من غير شمول فإذا قلت: زيد مثل الأسد كفى في ذلك الشجاعة دون بقية الأوصاف وكذلك زيد مثل عمرو يصدق ذلك حقيقة بمشاركتهما في صفة واحدة فالمثل المذكور في الأذان إن حمل على أعلى الرتب قال: مثل ما يقول إلى آخر الأذان أو على أدنى الرتب ففي التشهد خاصة وهو مشهور مذهب مالك فهذه ست مسائل تنبهك على صحة التخريج على هذه القاعدة والمسائل السابقة تنبهك على التخريج الفاسد عليها لأن الأول من باب الأجزاء وهذه من باب الجزئيات فقد ظهر لك الفرق بينهما والصحيح من الفاسد.";
        assertEquals(testStringWithoutTashkeel, ArabicUtilities.cleanTashkeel(testStringWithTashkeel));
        assertEquals(testStringWithoutTashkeel2, ArabicUtilities.cleanTashkeel(testStringWithTashkeel2));
    }

    @Test
    public void checkStringBuilderAndRegexGivesTheSameResults() {
        assertEquals(ArabicUtilities.cleanTextForSearchingQuery(full_page), ArabicUtilities.cleanTextForSearchingWthStingBuilder(full_page));
    }

    @Test
    public void checkForTaMarbouta() {
        assertEquals("الصلاه", ArabicUtilities.cleanTextForSearchingQuery("الصلاة"));
    }

    @Test
    public void cleanTextForSearchingWthStingBuilder() throws Exception {

    }

    @Test
    public void prepareForPreAppendLam() throws Exception {
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("البخاري"), "للبخاري");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("محمد"), "لمحمد");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("اللبن"), "للبن");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("اللحم"), "للحم");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("الله"), "لله");
        assertEquals("ل" + ArabicUtilities.prepareForPrefixingLam("أبو بكر"), "لأبي بكر");
    }

    @Test
    public void startsWithDefiniteArticle() throws Exception {
        assertEquals(ArabicUtilities.startsWithDefiniteArticle("البخاري"), true);
        assertEquals(ArabicUtilities.startsWithDefiniteArticle("اللبن"), true);
        assertEquals(ArabicUtilities.startsWithDefiniteArticle("اللحم"), true);

    }

}