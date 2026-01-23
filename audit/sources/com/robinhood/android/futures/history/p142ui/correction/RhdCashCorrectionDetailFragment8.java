package com.robinhood.android.futures.history.p142ui.correction;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.futures.history.p142ui.correction.RhdCashCorrectionDetailDuxo4;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.Instant;

/* compiled from: RhdCashCorrectionDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/futures/history/ui/correction/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/futures/history/ui/correction/RhdCashCorrectionViewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-futures-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.correction.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class RhdCashCorrectionDetailFragment8 implements PreviewParameterProvider<RhdCashCorrectionDetailDuxo4> {
    private final Sequence<RhdCashCorrectionDetailDuxo4> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public RhdCashCorrectionDetailFragment8() {
        UUID uuid = new UUID(0L, 0L);
        UUID uuid2 = new UUID(1L, 0L);
        FuturesCashCorrection.Status status = FuturesCashCorrection.Status.CONFIRMED;
        Currency currency = Currencies.USD;
        BigDecimal TEN = BigDecimal.TEN;
        Intrinsics.checkNotNullExpressionValue(TEN, "TEN");
        Money money = new Money(currency, TEN);
        Money.Direction direction = Money.Direction.CREDIT;
        FuturesCashCorrection.Reason reason = FuturesCashCorrection.Reason.WRITE_OFF;
        Instant EPOCH = Instant.EPOCH;
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        this.values = SequencesKt.sequenceOf(RhdCashCorrectionDetailDuxo4.Loading.INSTANCE, new RhdCashCorrectionDetailDuxo4.Loaded(new FuturesCashCorrection(uuid, uuid2, status, money, direction, reason, EPOCH, EPOCH, FuturesContractType.OUTRIGHTS)));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<RhdCashCorrectionDetailDuxo4> getValues() {
        return this.values;
    }
}
