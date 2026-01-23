package com.stripe.android.view;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateUtils.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/view/DateUtils;", "", "<init>", "()V", "", "expiryMonth", "expiryYear", "", "isExpiryDataValid", "(II)Z", "Ljava/util/Calendar;", "calendar", "(IILjava/util/Calendar;)Z", "inputYear", "convertTwoDigitYearToFour", "(I)I", "(ILjava/util/Calendar;)I", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();

    private DateUtils() {
    }

    @JvmStatic
    public static final boolean isExpiryDataValid(int expiryMonth, int expiryYear) {
        if (expiryYear < 100) {
            expiryYear = INSTANCE.convertTwoDigitYearToFour(expiryYear);
        }
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return isExpiryDataValid(expiryMonth, expiryYear, calendar);
    }

    @JvmStatic
    public static final boolean isExpiryDataValid(int expiryMonth, int expiryYear, Calendar calendar) {
        int i;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        if (1 > expiryMonth || expiryMonth >= 13 || expiryYear < 0 || expiryYear >= 9981 || expiryYear < (i = calendar.get(1))) {
            return false;
        }
        return expiryYear > i || expiryMonth >= calendar.get(2) + 1;
    }

    public final int convertTwoDigitYearToFour(int inputYear) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return convertTwoDigitYearToFour(inputYear, calendar);
    }

    public final int convertTwoDigitYearToFour(int inputYear, Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        int i = calendar.get(1);
        int i2 = i / 100;
        int i3 = i % 100;
        if (i3 > 80 && inputYear < 20) {
            i2++;
        } else if (i3 < 20 && inputYear > 80) {
            i2--;
        }
        return (i2 * 100) + inputYear;
    }
}
