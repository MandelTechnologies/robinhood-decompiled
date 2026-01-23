package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.iso.countrycode.CountryCode;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CountryCodeUtils.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006J\n\u0010\u0015\u001a\u00020\u0011*\u00020\u0006J\n\u0010\u0016\u001a\u00020\u0011*\u00020\u0006J\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005*\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011J\f\u0010\u001d\u001a\u00020\u0006*\u00020\fH\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010 \u001a\u00020\u0011H\u0002R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/CountryCodeUtils;", "", "<init>", "()V", "countryOptions", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "getCountryOptions", "()Ljava/util/List;", "countryOptions$delegate", "Lkotlin/Lazy;", "usCountryCodeMetadata", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/CountryCodeMetadata;", "getUsCountryCodeMetadata", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/CountryCodeMetadata;", "countryCodeToCountryMetadata", "", "", "DEFAULT_COUNTRY_OPTION", "getShortenedPrefixText", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "getCountryCode", "getPrefix", "splitValue", "getInitialSelectedOption", "countryCode", "parsePhoneNumberInfo", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/PhoneNumberInfo;", "inputNumber", "toOption", "generateOptions", "findCountryCodeByPrefix", "candidate", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CountryCodeUtils {
    private static final Option DEFAULT_COUNTRY_OPTION;
    public static final CountryCodeUtils INSTANCE;
    private static final Map<String, CountryCodeMetadata> countryCodeToCountryMetadata;

    /* renamed from: countryOptions$delegate, reason: from kotlin metadata */
    private static final Lazy countryOptions;
    private static final CountryCodeMetadata usCountryCodeMetadata;

    private CountryCodeUtils() {
    }

    static {
        CountryCodeUtils countryCodeUtils = new CountryCodeUtils();
        INSTANCE = countryCodeUtils;
        countryOptions = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CountryCodeUtils.countryOptions_delegate$lambda$0();
            }
        });
        CountryCodeMetadata countryCodeMetadata = new CountryCodeMetadata("+1", CountryCode.COUNTRY_CODE_US, "(###) ###-####", null, 8, null);
        usCountryCodeMetadata = countryCodeMetadata;
        countryCodeToCountryMetadata = MapsKt.mapOf(Tuples4.m3642to(CountryCode.COUNTRY_CODE_US, countryCodeMetadata), Tuples4.m3642to("CA", new CountryCodeMetadata("+1", "CA", "(###) ###-####", null, 8, null)), Tuples4.m3642to("AG", new CountryCodeMetadata("+1", "AG", "(###) ###-####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_AS, new CountryCodeMetadata("+1", CountryCode.COUNTRY_CODE_AS, "(###) ###-####", null, 8, null)), Tuples4.m3642to("AI", new CountryCodeMetadata("+1", "AI", "(###) ###-####", null, 8, null)), Tuples4.m3642to("BB", new CountryCodeMetadata("+1", "BB", "(###) ###-####", null, 8, null)), Tuples4.m3642to("BM", new CountryCodeMetadata("+1", "BM", "(###) ###-####", null, 8, null)), Tuples4.m3642to("BS", new CountryCodeMetadata("+1", "BS", "(###) ###-####", null, 8, null)), Tuples4.m3642to("DM", new CountryCodeMetadata("+1", "DM", "(###) ###-####", null, 8, null)), Tuples4.m3642to("DO", new CountryCodeMetadata("+1", "DO", "(###) ###-####", null, 8, null)), Tuples4.m3642to("GD", new CountryCodeMetadata("+1", "GD", "(###) ###-####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_GU, new CountryCodeMetadata("+1", CountryCode.COUNTRY_CODE_GU, "(###) ###-####", null, 8, null)), Tuples4.m3642to("JM", new CountryCodeMetadata("+1", "JM", "(###) ###-####", null, 8, null)), Tuples4.m3642to("KN", new CountryCodeMetadata("+1", "KN", "(###) ###-####", null, 8, null)), Tuples4.m3642to("KY", new CountryCodeMetadata("+1", "KY", "(###) ###-####", null, 8, null)), Tuples4.m3642to("LC", new CountryCodeMetadata("+1", "LC", "(###) ###-####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_MP, new CountryCodeMetadata("+1", CountryCode.COUNTRY_CODE_MP, "(###) ###-####", null, 8, null)), Tuples4.m3642to("MS", new CountryCodeMetadata("+1", "MS", "(###) ###-####", null, 8, null)), Tuples4.m3642to("PR", new CountryCodeMetadata("+1", "PR", "(###) ###-####", null, 8, null)), Tuples4.m3642to("SX", new CountryCodeMetadata("+1", "SX", "(###) ###-####", null, 8, null)), Tuples4.m3642to("TC", new CountryCodeMetadata("+1", "TC", "(###) ###-####", null, 8, null)), Tuples4.m3642to("TT", new CountryCodeMetadata("+1", "TT", "(###) ###-####", null, 8, null)), Tuples4.m3642to("VC", new CountryCodeMetadata("+1", "VC", "(###) ###-####", null, 8, null)), Tuples4.m3642to("VG", new CountryCodeMetadata("+1", "VG", "(###) ###-####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_VI, new CountryCodeMetadata("+1", CountryCode.COUNTRY_CODE_VI, "(###) ###-####", null, 8, null)), Tuples4.m3642to("EG", new CountryCodeMetadata("+20", "EG", "### ### ####", null, 8, null)), Tuples4.m3642to("SS", new CountryCodeMetadata("+211", "SS", "### ### ###", null, 8, null)), Tuples4.m3642to("MA", new CountryCodeMetadata("+212", "MA", "###-######", null, 8, null)), Tuples4.m3642to("EH", new CountryCodeMetadata("+212", "EH", "###-######", null, 8, null)), Tuples4.m3642to("DZ", new CountryCodeMetadata("+213", "DZ", "### ## ## ##", null, 8, null)), Tuples4.m3642to("TN", new CountryCodeMetadata("+216", "TN", "## ### ###", null, 8, null)), Tuples4.m3642to("LY", new CountryCodeMetadata("+218", "LY", "##-#######", null, 8, null)), Tuples4.m3642to("GM", new CountryCodeMetadata("+220", "GM", "### ####", null, 8, null)), Tuples4.m3642to("SN", new CountryCodeMetadata("+221", "SN", "## ### ## ##", null, 8, null)), Tuples4.m3642to("MR", new CountryCodeMetadata("+222", "MR", "## ## ## ##", null, 8, null)), Tuples4.m3642to("ML", new CountryCodeMetadata("+223", "ML", "## ## ## ##", null, 8, null)), Tuples4.m3642to("GN", new CountryCodeMetadata("+224", "GN", "### ## ## ##", null, 8, null)), Tuples4.m3642to("CI", new CountryCodeMetadata("+225", "CI", "## ## ## ##", null, 8, null)), Tuples4.m3642to("BF", new CountryCodeMetadata("+226", "BF", "## ## ## ##", null, 8, null)), Tuples4.m3642to("NE", new CountryCodeMetadata("+227", "NE", "## ## ## ##", null, 8, null)), Tuples4.m3642to("TG", new CountryCodeMetadata("+228", "TG", "## ## ## ##", null, 8, null)), Tuples4.m3642to("BJ", new CountryCodeMetadata("+229", "BJ", "## ## ## ##", null, 8, null)), Tuples4.m3642to("MU", new CountryCodeMetadata("+230", "MU", "#### ####", null, 8, null)), Tuples4.m3642to("LR", new CountryCodeMetadata("+231", "LR", "### ### ###", null, 8, null)), Tuples4.m3642to("SL", new CountryCodeMetadata("+232", "SL", "## ######", null, 8, null)), Tuples4.m3642to("GH", new CountryCodeMetadata("+233", "GH", "## ### ####", null, 8, null)), Tuples4.m3642to("NG", new CountryCodeMetadata("+234", "NG", "### ### ####", null, 8, null)), Tuples4.m3642to("TD", new CountryCodeMetadata("+235", "TD", "## ## ## ##", null, 8, null)), Tuples4.m3642to("CF", new CountryCodeMetadata("+236", "CF", "## ## ## ##", null, 8, null)), Tuples4.m3642to("CM", new CountryCodeMetadata("+237", "CM", "## ## ## ##", null, 8, null)), Tuples4.m3642to("CV", new CountryCodeMetadata("+238", "CV", "### ## ##", null, 8, null)), Tuples4.m3642to("ST", new CountryCodeMetadata("+239", "ST", "### ####", null, 8, null)), Tuples4.m3642to("GQ", new CountryCodeMetadata("+240", "GQ", "### ### ###", null, 8, null)), Tuples4.m3642to("GA", new CountryCodeMetadata("+241", "GA", "## ## ## ##", null, 8, null)), Tuples4.m3642to("CG", new CountryCodeMetadata("+242", "CG", "## ### ####", null, 8, null)), Tuples4.m3642to("CD", new CountryCodeMetadata("+243", "CD", "### ### ###", null, 8, null)), Tuples4.m3642to("AO", new CountryCodeMetadata("+244", "AO", "### ### ###", null, 8, null)), Tuples4.m3642to("GW", new CountryCodeMetadata("+245", "GW", "### ####", null, 8, null)), Tuples4.m3642to("IO", new CountryCodeMetadata("+246", "IO", "### ####", null, 8, null)), Tuples4.m3642to("AC", new CountryCodeMetadata("+247", "AC", null, null, 12, null)), Tuples4.m3642to("SC", new CountryCodeMetadata("+248", "SC", "# ### ###", null, 8, null)), Tuples4.m3642to("RW", new CountryCodeMetadata("+250", "RW", "### ### ###", null, 8, null)), Tuples4.m3642to("ET", new CountryCodeMetadata("+251", "ET", "## ### ####", null, 8, null)), Tuples4.m3642to("SO", new CountryCodeMetadata("+252", "SO", "## #######", null, 8, null)), Tuples4.m3642to("DJ", new CountryCodeMetadata("+253", "DJ", "## ## ## ##", null, 8, null)), Tuples4.m3642to("KE", new CountryCodeMetadata("+254", "KE", "## #######", null, 8, null)), Tuples4.m3642to("TZ", new CountryCodeMetadata("+255", "TZ", "### ### ###", null, 8, null)), Tuples4.m3642to("UG", new CountryCodeMetadata("+256", "UG", "### ######", null, 8, null)), Tuples4.m3642to("BI", new CountryCodeMetadata("+257", "BI", "## ## ## ##", null, 8, null)), Tuples4.m3642to("MZ", new CountryCodeMetadata("+258", "MZ", "## ### ####", null, 8, null)), Tuples4.m3642to("ZM", new CountryCodeMetadata("+260", "ZM", "## #######", null, 8, null)), Tuples4.m3642to("MG", new CountryCodeMetadata("+261", "MG", "## ## ### ##", null, 8, null)), Tuples4.m3642to("RE", new CountryCodeMetadata("+262", "RE", null, null, 12, null)), Tuples4.m3642to("TF", new CountryCodeMetadata("+262", "TF", null, null, 12, null)), Tuples4.m3642to("YT", new CountryCodeMetadata("+262", "YT", "### ## ## ##", null, 8, null)), Tuples4.m3642to("ZW", new CountryCodeMetadata("+263", "ZW", "## ### ####", null, 8, null)), Tuples4.m3642to("NA", new CountryCodeMetadata("+264", "NA", "## ### ####", null, 8, null)), Tuples4.m3642to("MW", new CountryCodeMetadata("+265", "MW", "### ## ## ##", null, 8, null)), Tuples4.m3642to("LS", new CountryCodeMetadata("+266", "LS", "#### ####", null, 8, null)), Tuples4.m3642to("BW", new CountryCodeMetadata("+267", "BW", "## ### ###", null, 8, null)), Tuples4.m3642to("SZ", new CountryCodeMetadata("+268", "SZ", "#### ####", null, 8, null)), Tuples4.m3642to("KM", new CountryCodeMetadata("+269", "KM", "### ## ##", null, 8, null)), Tuples4.m3642to("ZA", new CountryCodeMetadata("+27", "ZA", "## ### ####", null, 8, null)), Tuples4.m3642to("SH", new CountryCodeMetadata("+290", "SH", null, null, 12, null)), Tuples4.m3642to("TA", new CountryCodeMetadata("+290", "TA", null, null, 12, null)), Tuples4.m3642to("ER", new CountryCodeMetadata("+291", "ER", "# ### ###", null, 8, null)), Tuples4.m3642to("AW", new CountryCodeMetadata("+297", "AW", "### ####", null, 8, null)), Tuples4.m3642to("FO", new CountryCodeMetadata("+298", "FO", "######", null, 8, null)), Tuples4.m3642to("GL", new CountryCodeMetadata("+299", "GL", "## ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_GR, new CountryCodeMetadata("+30", CountryCode.COUNTRY_CODE_GR, "### ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_NL, new CountryCodeMetadata("+31", CountryCode.COUNTRY_CODE_NL, "# ########", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_BE, new CountryCodeMetadata("+32", CountryCode.COUNTRY_CODE_BE, "### ## ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_FR, new CountryCodeMetadata("+33", CountryCode.COUNTRY_CODE_FR, "# ## ## ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_ES, new CountryCodeMetadata("+34", CountryCode.COUNTRY_CODE_ES, "### ## ## ##", null, 8, null)), Tuples4.m3642to("GI", new CountryCodeMetadata("+350", "GI", "### #####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_PT, new CountryCodeMetadata("+351", CountryCode.COUNTRY_CODE_PT, "### ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_LU, new CountryCodeMetadata("+352", CountryCode.COUNTRY_CODE_LU, "## ## ## ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_IE, new CountryCodeMetadata("+353", CountryCode.COUNTRY_CODE_IE, "## ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_IS, new CountryCodeMetadata("+354", CountryCode.COUNTRY_CODE_IS, "### ####", null, 8, null)), Tuples4.m3642to("AL", new CountryCodeMetadata("+355", "AL", "## ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_MT, new CountryCodeMetadata("+356", CountryCode.COUNTRY_CODE_MT, "#### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_CY, new CountryCodeMetadata("+357", CountryCode.COUNTRY_CODE_CY, "## ######", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_FI, new CountryCodeMetadata("+358", CountryCode.COUNTRY_CODE_FI, "## ### ## ##", null, 8, null)), Tuples4.m3642to("AX", new CountryCodeMetadata("+358", "AX", null, null, 12, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_BG, new CountryCodeMetadata("+359", CountryCode.COUNTRY_CODE_BG, "### ### ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_HU, new CountryCodeMetadata("+36", CountryCode.COUNTRY_CODE_HU, "## ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_LT, new CountryCodeMetadata("+370", CountryCode.COUNTRY_CODE_LT, "### #####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_LV, new CountryCodeMetadata("+371", CountryCode.COUNTRY_CODE_LV, "## ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_EE, new CountryCodeMetadata("+372", CountryCode.COUNTRY_CODE_EE, "#### ####", null, 8, null)), Tuples4.m3642to("MD", new CountryCodeMetadata("+373", "MD", "### ## ###", null, 8, null)), Tuples4.m3642to("AM", new CountryCodeMetadata("+374", "AM", "## ######", null, 8, null)), Tuples4.m3642to("BY", new CountryCodeMetadata("+375", "BY", "## ###-##-##", null, 8, null)), Tuples4.m3642to("AD", new CountryCodeMetadata("+376", "AD", "### ###", null, 8, null)), Tuples4.m3642to("MC", new CountryCodeMetadata("+377", "MC", "# ## ## ## ##", null, 8, null)), Tuples4.m3642to("SM", new CountryCodeMetadata("+378", "SM", "## ## ## ##", null, 8, null)), Tuples4.m3642to("VA", new CountryCodeMetadata("+379", "VA", null, null, 12, null)), Tuples4.m3642to("UA", new CountryCodeMetadata("+380", "UA", "## ### ####", null, 8, null)), Tuples4.m3642to("RS", new CountryCodeMetadata("+381", "RS", "## #######", null, 8, null)), Tuples4.m3642to("ME", new CountryCodeMetadata("+382", "ME", "## ### ###", null, 8, null)), Tuples4.m3642to("XK", new CountryCodeMetadata("+383", "XK", "## ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_HR, new CountryCodeMetadata("+385", CountryCode.COUNTRY_CODE_HR, "## ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_SI, new CountryCodeMetadata("+386", CountryCode.COUNTRY_CODE_SI, "## ### ###", null, 8, null)), Tuples4.m3642to("BA", new CountryCodeMetadata("+387", "BA", "## ###-###", null, 8, null)), Tuples4.m3642to("MK", new CountryCodeMetadata("+389", "MK", "## ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_IT, new CountryCodeMetadata("+39", CountryCode.COUNTRY_CODE_IT, "## #### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_RO, new CountryCodeMetadata("+40", CountryCode.COUNTRY_CODE_RO, "## ### ####", null, 8, null)), Tuples4.m3642to("CH", new CountryCodeMetadata("+41", "CH", "## ### ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_CZ, new CountryCodeMetadata("+420", CountryCode.COUNTRY_CODE_CZ, "### ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_SK, new CountryCodeMetadata("+421", CountryCode.COUNTRY_CODE_SK, "### ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_LI, new CountryCodeMetadata("+423", CountryCode.COUNTRY_CODE_LI, "### ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_AT, new CountryCodeMetadata("+43", CountryCode.COUNTRY_CODE_AT, "### ######", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_GB, new CountryCodeMetadata("+44", CountryCode.COUNTRY_CODE_GB, "#### ######", null, 8, null)), Tuples4.m3642to("GG", new CountryCodeMetadata("+44", "GG", "#### ######", null, 8, null)), Tuples4.m3642to("JE", new CountryCodeMetadata("+44", "JE", "#### ######", null, 8, null)), Tuples4.m3642to("IM", new CountryCodeMetadata("+44", "IM", "#### ######", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_DK, new CountryCodeMetadata("+45", CountryCode.COUNTRY_CODE_DK, "## ## ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_SE, new CountryCodeMetadata("+46", CountryCode.COUNTRY_CODE_SE, "##-### ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_NO, new CountryCodeMetadata("+47", CountryCode.COUNTRY_CODE_NO, "### ## ###", null, 8, null)), Tuples4.m3642to("BV", new CountryCodeMetadata("+47", "BV", null, null, 12, null)), Tuples4.m3642to("SJ", new CountryCodeMetadata("+47", "SJ", "## ## ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_PL, new CountryCodeMetadata("+48", CountryCode.COUNTRY_CODE_PL, "## ### ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_DE, new CountryCodeMetadata("+49", CountryCode.COUNTRY_CODE_DE, "### #######", null, 8, null)), Tuples4.m3642to("FK", new CountryCodeMetadata("+500", "FK", null, null, 12, null)), Tuples4.m3642to("GS", new CountryCodeMetadata("+500", "GS", null, null, 12, null)), Tuples4.m3642to("BZ", new CountryCodeMetadata("+501", "BZ", "###-####", null, 8, null)), Tuples4.m3642to("GT", new CountryCodeMetadata("+502", "GT", "#### ####", null, 8, null)), Tuples4.m3642to("SV", new CountryCodeMetadata("+503", "SV", "#### ####", null, 8, null)), Tuples4.m3642to("HN", new CountryCodeMetadata("+504", "HN", "####-####", null, 8, null)), Tuples4.m3642to("NI", new CountryCodeMetadata("+505", "NI", "#### ####", null, 8, null)), Tuples4.m3642to("CR", new CountryCodeMetadata("+506", "CR", "#### ####", null, 8, null)), Tuples4.m3642to("PA", new CountryCodeMetadata("+507", "PA", "####-####", null, 8, null)), Tuples4.m3642to("PM", new CountryCodeMetadata("+508", "PM", "## ## ##", null, 8, null)), Tuples4.m3642to("HT", new CountryCodeMetadata("+509", "HT", "## ## ####", null, 8, null)), Tuples4.m3642to("PE", new CountryCodeMetadata("+51", "PE", "### ### ###", null, 8, null)), Tuples4.m3642to("MX", new CountryCodeMetadata("+52", "MX", "### ### ####", null, 8, null)), Tuples4.m3642to("AR", new CountryCodeMetadata("+54", "AR", "## ##-####-####", null, 8, null)), Tuples4.m3642to("BR", new CountryCodeMetadata("+55", "BR", "## #####-####", null, 8, null)), Tuples4.m3642to("CL", new CountryCodeMetadata("+56", "CL", "# #### ####", null, 8, null)), Tuples4.m3642to("CO", new CountryCodeMetadata("+57", "CO", "### #######", null, 8, null)), Tuples4.m3642to("VE", new CountryCodeMetadata("+58", "VE", "###-#######", null, 8, null)), Tuples4.m3642to("BL", new CountryCodeMetadata("+590", "BL", "### ## ## ##", null, 8, null)), Tuples4.m3642to("MF", new CountryCodeMetadata("+590", "MF", null, null, 12, null)), Tuples4.m3642to("GP", new CountryCodeMetadata("+590", "GP", "### ## ## ##", null, 8, null)), Tuples4.m3642to("BO", new CountryCodeMetadata("+591", "BO", "########", null, 8, null)), Tuples4.m3642to("GY", new CountryCodeMetadata("+592", "GY", "### ####", null, 8, null)), Tuples4.m3642to("EC", new CountryCodeMetadata("+593", "EC", "## ### ####", null, 8, null)), Tuples4.m3642to("GF", new CountryCodeMetadata("+594", "GF", "### ## ## ##", null, 8, null)), Tuples4.m3642to("PY", new CountryCodeMetadata("+595", "PY", "## #######", null, 8, null)), Tuples4.m3642to("MQ", new CountryCodeMetadata("+596", "MQ", "### ## ## ##", null, 8, null)), Tuples4.m3642to("SR", new CountryCodeMetadata("+597", "SR", "###-####", null, 8, null)), Tuples4.m3642to("UY", new CountryCodeMetadata("+598", "UY", "#### ####", null, 8, null)), Tuples4.m3642to("CW", new CountryCodeMetadata("+599", "CW", "# ### ####", null, 8, null)), Tuples4.m3642to("BQ", new CountryCodeMetadata("+599", "BQ", "### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_MY, new CountryCodeMetadata("+60", CountryCode.COUNTRY_CODE_MY, "##-### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_AU, new CountryCodeMetadata("+61", CountryCode.COUNTRY_CODE_AU, "### ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_ID, new CountryCodeMetadata("+62", CountryCode.COUNTRY_CODE_ID, "###-###-###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_PH, new CountryCodeMetadata("+63", CountryCode.COUNTRY_CODE_PH, "#### ######", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_NZ, new CountryCodeMetadata("+64", CountryCode.COUNTRY_CODE_NZ, "## ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_SG, new CountryCodeMetadata("+65", CountryCode.COUNTRY_CODE_SG, "#### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_TH, new CountryCodeMetadata("+66", CountryCode.COUNTRY_CODE_TH, "## ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_TL, new CountryCodeMetadata("+670", CountryCode.COUNTRY_CODE_TL, "#### ####", null, 8, null)), Tuples4.m3642to("AQ", new CountryCodeMetadata("+672", "AQ", "## ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_BN, new CountryCodeMetadata("+673", CountryCode.COUNTRY_CODE_BN, "### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_NR, new CountryCodeMetadata("+674", CountryCode.COUNTRY_CODE_NR, "### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_PG, new CountryCodeMetadata("+675", CountryCode.COUNTRY_CODE_PG, "### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_TO, new CountryCodeMetadata("+676", CountryCode.COUNTRY_CODE_TO, "### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_SB, new CountryCodeMetadata("+677", CountryCode.COUNTRY_CODE_SB, "### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_VU, new CountryCodeMetadata("+678", CountryCode.COUNTRY_CODE_VU, "### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_FJ, new CountryCodeMetadata("+679", CountryCode.COUNTRY_CODE_FJ, "### ####", null, 8, null)), Tuples4.m3642to("WF", new CountryCodeMetadata("+681", "WF", "## ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_CK, new CountryCodeMetadata("+682", CountryCode.COUNTRY_CODE_CK, "## ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_NU, new CountryCodeMetadata("+683", CountryCode.COUNTRY_CODE_NU, null, null, 12, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_WS, new CountryCodeMetadata("+685", CountryCode.COUNTRY_CODE_WS, null, null, 12, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_KI, new CountryCodeMetadata("+686", CountryCode.COUNTRY_CODE_KI, null, null, 12, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_NC, new CountryCodeMetadata("+687", CountryCode.COUNTRY_CODE_NC, "########", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_TV, new CountryCodeMetadata("+688", CountryCode.COUNTRY_CODE_TV, null, null, 12, null)), Tuples4.m3642to("PF", new CountryCodeMetadata("+689", "PF", "## ## ##", null, 8, null)), Tuples4.m3642to("TK", new CountryCodeMetadata("+690", "TK", null, null, 12, null)), Tuples4.m3642to("RU", new CountryCodeMetadata("+7", "RU", "### ###-##-##", null, 8, null)), Tuples4.m3642to("KZ", new CountryCodeMetadata("+7", "KZ", null, null, 12, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_JP, new CountryCodeMetadata("+81", CountryCode.COUNTRY_CODE_JP, "##-####-####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_KR, new CountryCodeMetadata("+82", CountryCode.COUNTRY_CODE_KR, "##-####-####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_VN, new CountryCodeMetadata("+84", CountryCode.COUNTRY_CODE_VN, "## ### ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_HK, new CountryCodeMetadata("+852", CountryCode.COUNTRY_CODE_HK, "#### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_MO, new CountryCodeMetadata("+853", CountryCode.COUNTRY_CODE_MO, "#### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_KH, new CountryCodeMetadata("+855", CountryCode.COUNTRY_CODE_KH, "## ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_LA, new CountryCodeMetadata("+856", CountryCode.COUNTRY_CODE_LA, "## ## ### ###", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_CN, new CountryCodeMetadata("+86", CountryCode.COUNTRY_CODE_CN, "### #### ####", null, 8, null)), Tuples4.m3642to("PN", new CountryCodeMetadata("+872", "PN", null, null, 12, null)), Tuples4.m3642to("BD", new CountryCodeMetadata("+880", "BD", "####-######", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_TW, new CountryCodeMetadata("+886", CountryCode.COUNTRY_CODE_TW, "### ### ###", null, 8, null)), Tuples4.m3642to("TR", new CountryCodeMetadata("+90", "TR", "### ### ####", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_IN, new CountryCodeMetadata("+91", CountryCode.COUNTRY_CODE_IN, "## ## ######", null, 8, null)), Tuples4.m3642to("PK", new CountryCodeMetadata("+92", "PK", "### #######", null, 8, null)), Tuples4.m3642to("AF", new CountryCodeMetadata("+93", "AF", "## ### ####", null, 8, null)), Tuples4.m3642to("LK", new CountryCodeMetadata("+94", "LK", "## # ######", null, 8, null)), Tuples4.m3642to("MM", new CountryCodeMetadata("+95", "MM", "# ### ####", null, 8, null)), Tuples4.m3642to("MV", new CountryCodeMetadata("+960", "MV", "###-####", null, 8, null)), Tuples4.m3642to("LB", new CountryCodeMetadata("+961", "LB", "## ### ###", null, 8, null)), Tuples4.m3642to("JO", new CountryCodeMetadata("+962", "JO", "# #### ####", null, 8, null)), Tuples4.m3642to("IQ", new CountryCodeMetadata("+964", "IQ", "### ### ####", null, 8, null)), Tuples4.m3642to("KW", new CountryCodeMetadata("+965", "KW", "### #####", null, 8, null)), Tuples4.m3642to("SA", new CountryCodeMetadata("+966", "SA", "## ### ####", null, 8, null)), Tuples4.m3642to("YE", new CountryCodeMetadata("+967", "YE", "### ### ###", null, 8, null)), Tuples4.m3642to("OM", new CountryCodeMetadata("+968", "OM", "#### ####", null, 8, null)), Tuples4.m3642to("PS", new CountryCodeMetadata("+970", "PS", "### ### ###", null, 8, null)), Tuples4.m3642to("AE", new CountryCodeMetadata("+971", "AE", "## ### ####", null, 8, null)), Tuples4.m3642to("IL", new CountryCodeMetadata("+972", "IL", "##-###-####", null, 8, null)), Tuples4.m3642to("BH", new CountryCodeMetadata("+973", "BH", "#### ####", null, 8, null)), Tuples4.m3642to("QA", new CountryCodeMetadata("+974", "QA", "#### ####", null, 8, null)), Tuples4.m3642to("BT", new CountryCodeMetadata("+975", "BT", "## ## ## ##", null, 8, null)), Tuples4.m3642to(CountryCode.COUNTRY_CODE_MN, new CountryCodeMetadata("+976", CountryCode.COUNTRY_CODE_MN, "#### ####", null, 8, null)), Tuples4.m3642to("NP", new CountryCodeMetadata("+977", "NP", "###-#######", null, 8, null)), Tuples4.m3642to("TJ", new CountryCodeMetadata("+992", "TJ", "### ## ####", null, 8, null)), Tuples4.m3642to("TM", new CountryCodeMetadata("+993", "TM", "## ##-##-##", null, 8, null)), Tuples4.m3642to("AZ", new CountryCodeMetadata("+994", "AZ", "## ### ## ##", null, 8, null)), Tuples4.m3642to("GE", new CountryCodeMetadata("+995", "GE", "### ## ## ##", null, 8, null)), Tuples4.m3642to("KG", new CountryCodeMetadata("+996", "KG", "### ### ###", null, 8, null)), Tuples4.m3642to("UZ", new CountryCodeMetadata("+998", "UZ", "## ### ## ##", null, 8, null)));
        DEFAULT_COUNTRY_OPTION = countryCodeUtils.toOption(countryCodeMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List countryOptions_delegate$lambda$0() {
        return INSTANCE.generateOptions();
    }

    public final List<Option> getCountryOptions() {
        return (List) countryOptions.getValue();
    }

    public final CountryCodeMetadata getUsCountryCodeMetadata() {
        return usCountryCodeMetadata;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getShortenedPrefixText(Option option) {
        Intrinsics.checkNotNullParameter(option, "option");
        List listSplit$default = StringsKt.split$default((CharSequence) option.getText(), new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
        String text = (String) CollectionsKt.getOrNull(listSplit$default, 0);
        if (text == null) {
            text = DEFAULT_COUNTRY_OPTION.getText();
        }
        String str = (String) CollectionsKt.lastOrNull(listSplit$default);
        if (str == null) {
            str = "";
        } else {
            if (!StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
                str = null;
            }
            if (str == null) {
            }
        }
        return StringsKt.trim(text + PlaceholderUtils.XXShortPlaceholderText + str).toString();
    }

    public final String getCountryCode(Option option) {
        Intrinsics.checkNotNullParameter(option, "<this>");
        String upperCase = StringsKt.trim((String) CollectionsKt.first((List) splitValue(option))).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public final String getPrefix(Option option) {
        Intrinsics.checkNotNullParameter(option, "<this>");
        return StringsKt.trim((String) CollectionsKt.last((List) splitValue(option))).toString();
    }

    private final List<String> splitValue(Option option) {
        return StringsKt.split$default((CharSequence) StringsKt.trim(option.getValue()).toString(), new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
    }

    public final Option getInitialSelectedOption(String countryCode) {
        Option option;
        if (countryCode == null || countryCode.length() != 2) {
            return DEFAULT_COUNTRY_OPTION;
        }
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        CountryCodeMetadata countryCodeMetadata = countryCodeToCountryMetadata.get(upperCase);
        return (countryCodeMetadata == null || (option = toOption(countryCodeMetadata)) == null) ? DEFAULT_COUNTRY_OPTION : option;
    }

    public final PhoneNumberInfo parsePhoneNumberInfo(String inputNumber) {
        Object next;
        Intrinsics.checkNotNullParameter(inputNumber, "inputNumber");
        String string2 = StringsKt.trim(inputNumber).toString();
        if (!StringsKt.startsWith$default(string2, "+", false, 2, (Object) null)) {
            string2 = "+" + string2;
        }
        String countryCode = usCountryCodeMetadata.getCountryCode();
        int i = 4;
        while (true) {
            if (1 >= i) {
                break;
            }
            if (string2.length() >= i) {
                String strSubstring = string2.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                List<CountryCodeMetadata> listFindCountryCodeByPrefix = findCountryCodeByPrefix(strSubstring);
                if (!listFindCountryCodeByPrefix.isEmpty()) {
                    if (listFindCountryCodeByPrefix.size() == 1) {
                        countryCode = listFindCountryCodeByPrefix.get(0).getCountryCode();
                    } else {
                        Iterator<T> it = listFindCountryCodeByPrefix.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            String countryCode2 = ((CountryCodeMetadata) next).getCountryCode();
                            String country = Locale.getDefault().getCountry();
                            Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
                            if (countryCode2.contentEquals(country)) {
                                break;
                            }
                        }
                        CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) next;
                        if (countryCodeMetadata == null || (countryCode = countryCodeMetadata.getCountryCode()) == null) {
                            countryCode = ((CountryCodeMetadata) CollectionsKt.first((List) listFindCountryCodeByPrefix)).getCountryCode();
                        }
                    }
                }
            }
            i--;
        }
        CountryCodeMetadata countryCodeMetadata2 = countryCodeToCountryMetadata.get(countryCode);
        String prefix = countryCodeMetadata2 != null ? countryCodeMetadata2.getPrefix() : null;
        if (prefix == null || prefix.length() == 0) {
            return new PhoneNumberInfo(countryCode, StringsKt.trim(StringsKt.drop(string2, 1)).toString());
        }
        return new PhoneNumberInfo(countryCode, StringsKt.trim(StringsKt.drop(string2, prefix.length())).toString());
    }

    private final Option toOption(CountryCodeMetadata countryCodeMetadata) {
        String fullOptionText = countryCodeMetadata.getFullOptionText();
        String upperCase = countryCodeMetadata.getCountryCode().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new Option(fullOptionText, upperCase + PlaceholderUtils.XXShortPlaceholderText + countryCodeMetadata.getPrefix());
    }

    private final List<Option> generateOptions() {
        Option option = toOption(usCountryCodeMetadata);
        Map<String, CountryCodeMetadata> map = countryCodeToCountryMetadata;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CountryCodeMetadata> entry : map.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), option.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.toOption((CountryCodeMetadata) ((Map.Entry) it.next()).getValue()));
        }
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(option), (Iterable) CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeUtils$generateOptions$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((Option) t).getText(), ((Option) t2).getText());
            }
        }));
    }

    private final List<CountryCodeMetadata> findCountryCodeByPrefix(String candidate) {
        Collection<CountryCodeMetadata> collectionValues = countryCodeToCountryMetadata.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (Intrinsics.areEqual(((CountryCodeMetadata) obj).getPrefix(), candidate)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
