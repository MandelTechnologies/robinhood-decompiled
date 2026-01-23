package com.robinhood.shared.history;

import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryTransactionLoader.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"validateEquals", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "expected", "validateOneOf", "", "lib-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.HistoryTransactionLoaderKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HistoryTransactionLoader3 {
    public static final void validateEquals(HistoryTransactionType historyTransactionType, HistoryTransactionType expected) {
        Intrinsics.checkNotNullParameter(historyTransactionType, "<this>");
        Intrinsics.checkNotNullParameter(expected, "expected");
        if (historyTransactionType == expected) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect history item transaction type " + historyTransactionType + " - expected " + expected).toString());
    }

    public static final void validateOneOf(HistoryTransactionType historyTransactionType, Set<? extends HistoryTransactionType> expected) {
        Intrinsics.checkNotNullParameter(historyTransactionType, "<this>");
        Intrinsics.checkNotNullParameter(expected, "expected");
        if (expected.contains(historyTransactionType)) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect history item transaction type " + historyTransactionType + " - expected one of " + expected).toString());
    }
}
