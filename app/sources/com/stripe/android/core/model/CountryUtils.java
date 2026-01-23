package com.stripe.android.core.model;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: CountryUtils.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/stripe/android/core/model/CountryUtils;", "", "<init>", "()V", "Ljava/util/Locale;", "currentLocale", "", "Lcom/stripe/android/core/model/Country;", "localizedCountries", "(Ljava/util/Locale;)Ljava/util/List;", "getSortedLocalizedCountries", "", "countryName", "Lcom/stripe/android/core/model/CountryCode;", "getCountryCodeByName", "(Ljava/lang/String;Ljava/util/Locale;)Lcom/stripe/android/core/model/CountryCode;", "countryCode", "getCountryByCode", "(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;", "getOrderedCountries", "name", "formatNameForSorting$stripe_core_release", "(Ljava/lang/String;)Ljava/lang/String;", "formatNameForSorting", "", "doesCountryUsePostalCode", "(Ljava/lang/String;)Z", "(Lcom/stripe/android/core/model/CountryCode;)Z", "", "supportedBillingCountries", "Ljava/util/Set;", "getSupportedBillingCountries", "()Ljava/util/Set;", "CARD_POSTAL_CODE_COUNTRIES", "cachedCountriesLocale", "Ljava/util/Locale;", "cachedOrderedLocalizedCountries", "Ljava/util/List;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CountryUtils {
    private static volatile Locale cachedCountriesLocale;
    public static final CountryUtils INSTANCE = new CountryUtils();
    private static final Set<String> supportedBillingCountries = SetsKt.setOf((Object[]) new String[]{"AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_AT, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_AU, "AW", "AX", "AZ", "BA", "BB", "BD", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_BE, "BF", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_BG, "BH", "BI", "BJ", "BL", "BM", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_BN, "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_CK, "CL", "CM", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_CN, "CO", "CR", "CV", "CW", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_CY, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_CZ, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_DE, "DJ", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_DK, "DM", "DO", "DZ", "EC", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_EE, "EG", "EH", "ER", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_ES, "ET", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_FI, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_FJ, "FK", "FO", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_FR, "GA", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_GB, "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_GR, "GS", "GT", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_GU, "GW", "GY", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_HK, "HN", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_HR, "HT", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_HU, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_ID, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_IE, "IL", "IM", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_IN, "IO", "IQ", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_IS, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_IT, "JE", "JM", "JO", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_JP, "KE", "KG", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_KH, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_KI, "KM", "KN", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_KR, "KW", "KY", "KZ", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_LA, "LB", "LC", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_LI, "LK", "LR", "LS", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_LT, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_LU, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_LV, "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_MN, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_MO, "MQ", "MR", "MS", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_MT, "MU", "MV", "MW", "MX", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_MY, "MZ", "NA", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_NC, "NE", "NG", "NI", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_NL, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_NO, "NP", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_NR, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_NU, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_NZ, "OM", "PA", "PE", "PF", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_PG, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_PH, "PK", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_PL, "PM", "PN", "PR", "PS", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_PT, "PY", "QA", "RE", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_RO, "RS", "RU", "RW", "SA", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_SB, "SC", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_SE, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_SG, "SH", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_SI, "SJ", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_SK, "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_TH, "TJ", "TK", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_TL, "TM", "TN", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_TO, "TR", "TT", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_TV, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_TW, "TZ", "UA", "UG", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_US, "UY", "UZ", "VA", "VC", "VE", "VG", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_VN, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_VU, "WF", com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_WS, "XK", "YE", "YT", "ZA", "ZM", "ZW"});
    private static final Set<String> CARD_POSTAL_CODE_COUNTRIES = SetsKt.setOf((Object[]) new String[]{com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_US, com.robinhood.iso.countrycode.CountryCode.COUNTRY_CODE_GB, "CA"});
    private static volatile List<Country> cachedOrderedLocalizedCountries = CollectionsKt.emptyList();

    private CountryUtils() {
    }

    private final List<Country> localizedCountries(Locale currentLocale) {
        Set<String> set = supportedBillingCountries;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (String str : set) {
            CountryCode countryCodeCreate = CountryCode.INSTANCE.create(str);
            String displayCountry = new Locale("", str).getDisplayCountry(currentLocale);
            Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
            arrayList.add(new Country(countryCodeCreate, displayCountry));
        }
        return arrayList;
    }

    public final /* synthetic */ CountryCode getCountryCodeByName(String countryName, Locale currentLocale) {
        Object next;
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Iterator<T> it = getSortedLocalizedCountries(currentLocale).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getName(), countryName)) {
                break;
            }
        }
        Country country = (Country) next;
        if (country != null) {
            return country.getCode();
        }
        return null;
    }

    public final /* synthetic */ Country getCountryByCode(CountryCode countryCode, Locale currentLocale) {
        Object next;
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Iterator<T> it = getSortedLocalizedCountries(currentLocale).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getCode(), countryCode)) {
                break;
            }
        }
        return (Country) next;
    }

    public final /* synthetic */ List getOrderedCountries(Locale currentLocale) {
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        return getSortedLocalizedCountries(currentLocale);
    }

    public final String formatNameForSorting$stripe_core_release(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strNormalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return new Regex("[^\\p{ASCII}]").replace(new Regex("[^A-Za-z ]").replace(new Regex("\\p{Mn}+").replace(strNormalize, ""), ""), "");
    }

    @Deprecated
    public final /* synthetic */ boolean doesCountryUsePostalCode(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Set<String> set = CARD_POSTAL_CODE_COUNTRIES;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public final /* synthetic */ boolean doesCountryUsePostalCode(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return CARD_POSTAL_CODE_COUNTRIES.contains(countryCode.getValue());
    }

    private final List<Country> getSortedLocalizedCountries(Locale currentLocale) {
        Object next;
        if (Intrinsics.areEqual(currentLocale, cachedCountriesLocale)) {
            return cachedOrderedLocalizedCountries;
        }
        cachedCountriesLocale = currentLocale;
        List<Country> listLocalizedCountries = localizedCountries(currentLocale);
        Iterator<T> it = listLocalizedCountries.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getCode(), CountryCode3.getCountryCode(currentLocale))) {
                break;
            }
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull(next);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLocalizedCountries) {
            if (!Intrinsics.areEqual(((Country) obj).getCode(), CountryCode3.getCountryCode(currentLocale))) {
                arrayList.add(obj);
            }
        }
        cachedOrderedLocalizedCountries = CollectionsKt.plus((Collection) listListOfNotNull, (Iterable) CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.stripe.android.core.model.CountryUtils$getSortedLocalizedCountries$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                CountryUtils countryUtils = CountryUtils.INSTANCE;
                return ComparisonsKt.compareValues(countryUtils.formatNameForSorting$stripe_core_release(((Country) t).getName()), countryUtils.formatNameForSorting$stripe_core_release(((Country) t2).getName()));
            }
        }));
        return cachedOrderedLocalizedCountries;
    }
}
