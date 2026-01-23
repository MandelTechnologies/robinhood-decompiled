package com.robinhood.android.cash.transaction.p079ui.rhytransaction;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.cash.transaction.p079ui.rhytransaction.RhyTransactionDetailViewState;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransaction;
import com.robinhood.models.p320db.bonfire.InnerRhyTransaction;
import com.robinhood.models.p320db.bonfire.RhyTransaction;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.Instant;

/* compiled from: RhyTransactionDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.rhytransaction.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes7.dex */
final class RhyTransactionDetailComposable3 implements PreviewParameterProvider<RhyTransactionDetailViewState> {
    private final Sequence<RhyTransactionDetailViewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public RhyTransactionDetailComposable3() {
        RhyTransactionDetailViewState.Loading loading = new RhyTransactionDetailViewState.Loading(null, 1, null);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        UUID uuidRandomUUID3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
        UUID uuidRandomUUID4 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID4, "randomUUID(...)");
        HistoryTransactionType historyTransactionType = HistoryTransactionType.TAX_WITHHOLDING_FEDERAL;
        Money money = new Money(Currencies.USD, new BigDecimal("100.00"));
        Money.Direction direction = Money.Direction.DEBIT;
        ApiRhyTransaction.Action action = ApiRhyTransaction.Action.COMPLETE;
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        Instant instantNow2 = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow2, "now(...)");
        this.values = SequencesKt.sequenceOf(loading, new RhyTransactionDetailViewState.Loaded(new RhyTransaction(uuidRandomUUID, new InnerRhyTransaction(uuidRandomUUID2, uuidRandomUUID3, uuidRandomUUID4, historyTransactionType, money, direction, "Federal Tax Withholding", action, instantNow, instantNow2), null)));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<RhyTransactionDetailViewState> getValues() {
        return this.values;
    }
}
