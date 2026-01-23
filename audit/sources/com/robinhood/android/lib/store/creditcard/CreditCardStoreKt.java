package com.robinhood.android.lib.store.creditcard;

import com.robinhood.utils.datetime.LocalDates4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: CreditCardStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0001¨\u0006\u0004"}, m3636d2 = {"toMilli", "", "", "formattedSsn", "lib-store-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CreditCardStoreKt {
    public static final long toMilli(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern("MMddyyyy"));
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return LocalDates4.toEpochMillis$default(localDate, null, 1, null);
    }

    public static final String formattedSsn(String str) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i3 = i2 + 1;
            if (i2 == 3 || i2 == 5) {
                objValueOf = "-" + cCharAt;
            } else {
                objValueOf = Character.valueOf(cCharAt);
            }
            arrayList.add(objValueOf);
            i++;
            i2 = i3;
        }
        return CollectionsKt.joinToString$default(arrayList, "", "", null, 0, null, null, 60, null);
    }
}
