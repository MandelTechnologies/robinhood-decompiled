package com.withpersona.sdk2.inquiry.steps.p423ui.components.utils;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryCodeUtils.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/CountryCodeMetadata;", "", "", "prefix", "countryCode", "pattern", "defaultFlagEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlagEmoji", "()Ljava/lang/String;", "getCountryName", "getFullOptionText", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrefix", "getCountryCode", "getPattern", "getDefaultFlagEmoji", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CountryCodeMetadata {
    private final String countryCode;
    private final String defaultFlagEmoji;
    private final String pattern;
    private final String prefix;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryCodeMetadata)) {
            return false;
        }
        CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) other;
        return Intrinsics.areEqual(this.prefix, countryCodeMetadata.prefix) && Intrinsics.areEqual(this.countryCode, countryCodeMetadata.countryCode) && Intrinsics.areEqual(this.pattern, countryCodeMetadata.pattern) && Intrinsics.areEqual(this.defaultFlagEmoji, countryCodeMetadata.defaultFlagEmoji);
    }

    public int hashCode() {
        int iHashCode = ((this.prefix.hashCode() * 31) + this.countryCode.hashCode()) * 31;
        String str = this.pattern;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultFlagEmoji.hashCode();
    }

    public String toString() {
        return "CountryCodeMetadata(prefix=" + this.prefix + ", countryCode=" + this.countryCode + ", pattern=" + this.pattern + ", defaultFlagEmoji=" + this.defaultFlagEmoji + ")";
    }

    public CountryCodeMetadata(String prefix, String countryCode, String str, String defaultFlagEmoji) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(defaultFlagEmoji, "defaultFlagEmoji");
        this.prefix = prefix;
        this.countryCode = countryCode;
        this.pattern = str;
        this.defaultFlagEmoji = defaultFlagEmoji;
    }

    public /* synthetic */ CountryCodeMetadata(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "🌐" : str4);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    private final String getFlagEmoji() {
        if (this.countryCode.length() != 2) {
            return this.defaultFlagEmoji;
        }
        String str = this.countryCode;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int iCodePointAt = Character.codePointAt(upperCase, 0) - (-127397);
        int iCodePointAt2 = Character.codePointAt(upperCase, 1) - (-127397);
        char[] chars = Character.toChars(iCodePointAt);
        Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
        char[] chars2 = Character.toChars(iCodePointAt2);
        Intrinsics.checkNotNullExpressionValue(chars2, "toChars(...)");
        return new String(ArraysKt.plus(chars, chars2));
    }

    public final String getFullOptionText() {
        return getFlagEmoji() + PlaceholderUtils.XXShortPlaceholderText + getCountryName() + PlaceholderUtils.XXShortPlaceholderText + this.prefix;
    }

    private final String getCountryName() {
        String displayCountry = new Locale("", this.countryCode).getDisplayCountry(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }
}
