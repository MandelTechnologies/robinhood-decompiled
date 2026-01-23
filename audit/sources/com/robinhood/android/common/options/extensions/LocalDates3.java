package com.robinhood.android.common.options.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.Month2;

/* compiled from: LocalDates.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"j$/time/LocalDate", "Lkotlinx/datetime/LocalDate;", "toKotlinLocalDate", "(Lj$/time/LocalDate;)Lkotlinx/datetime/LocalDate;", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.extensions.LocalDatesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LocalDates3 {
    public static final LocalDate toKotlinLocalDate(p479j$.time.LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return new LocalDate(localDate.getYear(), Month2.Month(localDate.getMonthValue()), localDate.getDayOfMonth());
    }
}
