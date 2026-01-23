package com.robinhood.android.cash.disputes.extensions;

import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: LocalDates.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"j$/time/LocalDate", "", "toDatePickerFormat", "(Lj$/time/LocalDate;)J", "", "toDisputeResponseFormat", "(Lj$/time/LocalDate;)Ljava/lang/String;", "Lkotlin/Pair;", "getInitialTransactionSelectionDatePickerRange", "(Lj$/time/LocalDate;)Lkotlin/Pair;", "feature-cash-disputes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.extensions.LocalDatesKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LocalDates2 {
    public static final long toDatePickerFormat(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return LocalDates4.toEpochMillis$default(localDate, null, 1, null);
    }

    public static final String toDisputeResponseFormat(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return TemporalFormatter.INSTANCE.ofPatternResource(C10007R.string.date_response_format).format(localDate);
    }

    public static final Tuples2<LocalDate, LocalDate> getInitialTransactionSelectionDatePickerRange(LocalDate localDate) {
        LocalDate localDateMinusDays = LocalDate.now().minusDays(60L);
        if (localDate != null && localDate.isAfter(localDateMinusDays)) {
            return new Tuples2<>(localDate, LocalDate.now());
        }
        return new Tuples2<>(localDateMinusDays, LocalDate.now());
    }
}
