package p479j$.time.format;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes29.dex */
public final class DecimalStyle {

    /* renamed from: d */
    public static final DecimalStyle f6815d = new DecimalStyle('0', '-', '.');

    /* renamed from: e */
    public static final ConcurrentMap f6816e = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    public final char f6817a;

    /* renamed from: b */
    public final char f6818b;

    /* renamed from: c */
    public final char f6819c;

    /* renamed from: of */
    public static DecimalStyle m3557of(Locale locale) {
        DecimalStyle decimalStyle;
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f6816e;
        DecimalStyle decimalStyle2 = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle2 != null) {
            return decimalStyle2;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        if (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') {
            decimalStyle = f6815d;
        } else {
            decimalStyle = new DecimalStyle(zeroDigit, minusSign, decimalSeparator);
        }
        concurrentHashMap.putIfAbsent(locale, decimalStyle);
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    public DecimalStyle(char c, char c2, char c3) {
        this.f6817a = c;
        this.f6818b = c2;
        this.f6819c = c3;
    }

    /* renamed from: a */
    public final String m3558a(String str) {
        char c = this.f6817a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.f6817a == decimalStyle.f6817a && this.f6818b == decimalStyle.f6818b && this.f6819c == decimalStyle.f6819c;
    }

    public final int hashCode() {
        return this.f6817a + '+' + this.f6818b + this.f6819c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.f6817a + '+' + this.f6818b + this.f6819c + "]";
    }
}
