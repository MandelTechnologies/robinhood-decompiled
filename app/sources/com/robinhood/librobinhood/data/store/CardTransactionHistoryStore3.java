package com.robinhood.librobinhood.data.store;

import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardTransactionHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"cardTransactionTypes", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getCardTransactionTypes", "()Ljava/util/Set;", "lib-store-cash_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CardTransactionHistoryStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class CardTransactionHistoryStore3 {
    public static final Set<HistoryTransactionType> getCardTransactionTypes() {
        EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.PENDING_CARD_TRANSACTION, HistoryTransactionType.SETTLED_CARD_TRANSACTION, HistoryTransactionType.DECLINED_CARD_TRANSACTION);
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
        Set<HistoryTransactionType> setUnmodifiableSet = Collections.unmodifiableSet(enumSetOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }
}
