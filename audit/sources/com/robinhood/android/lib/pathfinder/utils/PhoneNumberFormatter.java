package com.robinhood.android.lib.pathfinder.utils;

import android.telephony.PhoneNumberUtils;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneNumberFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "", "<init>", "()V", "trimNonDigitBits", "", InquiryField.FloatField.TYPE2, "formatDisplayNumber", "throwIfNumberIsInvalid", "", "formatDisplayNumberStrict", "locale", "Ljava/util/Locale;", "getNumberLengthMinMax", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter$MinMax;", "MinMax", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PhoneNumberFormatter {
    public static final int $stable = 0;

    public static /* synthetic */ String formatDisplayNumber$default(PhoneNumberFormatter phoneNumberFormatter, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return phoneNumberFormatter.formatDisplayNumber(str, z);
    }

    public final String formatDisplayNumber(String number, boolean throwIfNumberIsInvalid) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        return formatDisplayNumber(US, number, throwIfNumberIsInvalid);
    }

    public final String formatDisplayNumberStrict(Locale locale, String number) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(number, "number");
        String displayNumber = formatDisplayNumber(locale, number, true);
        if (displayNumber != null) {
            return displayNumber;
        }
        throw new IllegalArgumentException("This must be a dev bug, fix it ASAP!");
    }

    public final MinMax getNumberLengthMinMax(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return Intrinsics.areEqual(locale, Locale.US) ? new MinMax(10, 10) : new MinMax(0, 0);
    }

    static /* synthetic */ String formatDisplayNumber$default(PhoneNumberFormatter phoneNumberFormatter, Locale locale, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return phoneNumberFormatter.formatDisplayNumber(locale, str, z);
    }

    private final String formatDisplayNumber(Locale locale, String number, boolean throwIfNumberIsInvalid) {
        String number2 = PhoneNumberUtils.formatNumber(number, locale.getCountry());
        if (number2 != null) {
            return number2;
        }
        if (!throwIfNumberIsInvalid) {
            return number;
        }
        throw new IllegalArgumentException(number + " is invalid");
    }

    /* compiled from: PhoneNumberFormatter.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter$MinMax;", "", "min", "", AnalyticsStrings.MAX_WELCOME_TAG, "<init>", "(II)V", "getMin", "()I", "getMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MinMax {
        public static final int $stable = 0;
        private final int max;
        private final int min;

        public static /* synthetic */ MinMax copy$default(MinMax minMax, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = minMax.min;
            }
            if ((i3 & 2) != 0) {
                i2 = minMax.max;
            }
            return minMax.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMin() {
            return this.min;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMax() {
            return this.max;
        }

        public final MinMax copy(int min, int max) {
            return new MinMax(min, max);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MinMax)) {
                return false;
            }
            MinMax minMax = (MinMax) other;
            return this.min == minMax.min && this.max == minMax.max;
        }

        public int hashCode() {
            return (Integer.hashCode(this.min) * 31) + Integer.hashCode(this.max);
        }

        public String toString() {
            return "MinMax(min=" + this.min + ", max=" + this.max + ")";
        }

        public MinMax(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public final int getMin() {
            return this.min;
        }

        public final int getMax() {
            return this.max;
        }
    }

    public final String trimNonDigitBits(String number) throws IOException {
        if (number == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = number.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = number.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
