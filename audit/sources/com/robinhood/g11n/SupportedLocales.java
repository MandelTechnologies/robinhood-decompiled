package com.robinhood.g11n;

import com.robinhood.iso.countrycode.CountryCode;
import com.singular.sdk.internal.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportedLocales.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0002H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m3636d2 = {"rhcEuLocales", "", "Ljava/util/Locale;", "getRhcEuLocales", "()Ljava/util/List;", "sanitized", "preferredCountryCode", "", "lib-g11n_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.g11n.SupportedLocalesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SupportedLocales {
    private static final List<Locale> getRhcEuLocales() {
        return CollectionsKt.listOf((Object[]) new Locale[]{Locale.US, Locale.UK, new Locale("pl", CountryCode.COUNTRY_CODE_PL), new Locale("it", CountryCode.COUNTRY_CODE_IT), new Locale("lt", CountryCode.COUNTRY_CODE_LT), new Locale("de", CountryCode.COUNTRY_CODE_DE), new Locale("de", CountryCode.COUNTRY_CODE_AT), new Locale("bg", CountryCode.COUNTRY_CODE_BG), new Locale("el", CountryCode.COUNTRY_CODE_CY), new Locale(Constants.DID_SET_CUSTOM_SDID_KEY, CountryCode.COUNTRY_CODE_CZ), new Locale("da", CountryCode.COUNTRY_CODE_DK), new Locale("et", CountryCode.COUNTRY_CODE_EE), new Locale("es", CountryCode.COUNTRY_CODE_ES), new Locale("fi", CountryCode.COUNTRY_CODE_FI), new Locale("fr", CountryCode.COUNTRY_CODE_FR), new Locale("el", CountryCode.COUNTRY_CODE_GR), new Locale("hr", CountryCode.COUNTRY_CODE_HR), new Locale("hu", CountryCode.COUNTRY_CODE_HU), new Locale("en", CountryCode.COUNTRY_CODE_IE), new Locale("lv", CountryCode.COUNTRY_CODE_LV), new Locale("mt", CountryCode.COUNTRY_CODE_MT), new Locale("nl", CountryCode.COUNTRY_CODE_NL), new Locale("pt", CountryCode.COUNTRY_CODE_PT), new Locale("ro", CountryCode.COUNTRY_CODE_RO), new Locale("sv", CountryCode.COUNTRY_CODE_SE), new Locale("sl", CountryCode.COUNTRY_CODE_SI), new Locale("sk", CountryCode.COUNTRY_CODE_SK)});
    }

    public static final Locale sanitized(Locale locale) {
        String strPreferredCountryCode;
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return (Locales2.getCountryCode(locale) != null || (strPreferredCountryCode = preferredCountryCode(locale)) == null) ? locale : new Locale(locale.getLanguage(), strPreferredCountryCode);
    }

    private static final String preferredCountryCode(Locale locale) {
        Object next;
        Iterator<T> it = getRhcEuLocales().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Locale) next).getLanguage(), locale.getLanguage())) {
                break;
            }
        }
        Locale locale2 = (Locale) next;
        if (locale2 != null) {
            return locale2.getCountry();
        }
        return null;
    }
}
