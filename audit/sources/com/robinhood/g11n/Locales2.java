package com.robinhood.g11n;

import android.icu.text.DecimalFormatSymbols;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Locales.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a%\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006*\u00020\u00028F¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0010\u001a\u00020\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "Ljava/util/Locale;", "getCountryCode", "(Ljava/util/Locale;)Lcom/robinhood/iso/countrycode/CountryCode;", "decimalSeparator", "Lkotlin/Pair;", "", "Landroid/view/KeyEvent;", "getDecimalSeparator$annotations", "(Ljava/util/Locale;)V", "getDecimalSeparator", "(Ljava/util/Locale;)Lkotlin/Pair;", "monetaryDecimalSeparator", "getMonetaryDecimalSeparator", "(Ljava/util/Locale;)C", "monetaryGroupingSeparator", "getMonetaryGroupingSeparator", "findKeyEventsForCharInCharMap", "", "char", "keyCharacterMapType", "", "(CI)[Landroid/view/KeyEvent;", "lib-g11n_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.g11n.LocalesKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class Locales2 {
    public static /* synthetic */ void getDecimalSeparator$annotations(Locale locale) {
    }

    public static final CountryCode getCountryCode(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        CountryCode.Companion companion = CountryCode.INSTANCE;
        String country = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return companion.parseInstance(country);
    }

    public static final Tuples2<Character, KeyEvent> getDecimalSeparator(Locale locale) {
        KeyEvent[] keyEventArrFindKeyEventsForCharInCharMap;
        KeyEvent keyEvent;
        Intrinsics.checkNotNullParameter(locale, "<this>");
        char monetaryDecimalSeparator = getMonetaryDecimalSeparator(locale);
        int i = 0;
        KeyEvent keyEvent2 = new KeyEvent(0, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
        try {
            keyEventArrFindKeyEventsForCharInCharMap = findKeyEventsForCharInCharMap(monetaryDecimalSeparator, 1);
            if (keyEventArrFindKeyEventsForCharInCharMap == null && (keyEventArrFindKeyEventsForCharInCharMap = findKeyEventsForCharInCharMap(monetaryDecimalSeparator, -1)) == null) {
                keyEventArrFindKeyEventsForCharInCharMap = new KeyEvent[]{keyEvent2};
            }
        } catch (NullPointerException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, true, null, 4, null);
            keyEventArrFindKeyEventsForCharInCharMap = new KeyEvent[]{keyEvent2};
        }
        int length = keyEventArrFindKeyEventsForCharInCharMap.length;
        while (true) {
            if (i >= length) {
                keyEvent = null;
                break;
            }
            keyEvent = keyEventArrFindKeyEventsForCharInCharMap[i];
            if (keyEvent.getAction() == 0) {
                break;
            }
            i++;
        }
        if (keyEvent != null) {
            keyEvent2 = keyEvent;
        }
        return Tuples4.m3642to(Character.valueOf(monetaryDecimalSeparator), keyEvent2);
    }

    public static final char getMonetaryDecimalSeparator(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return DecimalFormatSymbols.getInstance(locale).getMonetaryDecimalSeparator();
    }

    public static final char getMonetaryGroupingSeparator(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "<this>");
        return DecimalFormatSymbols.getInstance(locale).getMonetaryGroupingSeparator();
    }

    private static final KeyEvent[] findKeyEventsForCharInCharMap(char c, int i) {
        return KeyCharacterMap.load(i).getEvents(new char[]{c});
    }
}
