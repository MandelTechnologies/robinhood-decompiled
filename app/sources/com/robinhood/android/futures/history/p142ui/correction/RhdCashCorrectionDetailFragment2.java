package com.robinhood.android.futures.history.p142ui.correction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.history.p142ui.correction.RhdCashCorrectionDetailDuxo4;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: RhdCashCorrectionDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.history.ui.correction.ComposableSingletons$RhdCashCorrectionDetailFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhdCashCorrectionDetailFragment2 {
    public static final RhdCashCorrectionDetailFragment2 INSTANCE = new RhdCashCorrectionDetailFragment2();

    /* renamed from: lambda$-400845533, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8983lambda$400845533 = ComposableLambda3.composableLambdaInstance(-400845533, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.correction.ComposableSingletons$RhdCashCorrectionDetailFragmentKt$lambda$-400845533$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-400845533, i, -1, "com.robinhood.android.futures.history.ui.correction.ComposableSingletons$RhdCashCorrectionDetailFragmentKt.lambda$-400845533.<anonymous> (RhdCashCorrectionDetailFragment.kt:94)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1726071208 = ComposableLambda3.composableLambdaInstance(1726071208, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.history.ui.correction.ComposableSingletons$RhdCashCorrectionDetailFragmentKt$lambda$1726071208$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1726071208, i, -1, "com.robinhood.android.futures.history.ui.correction.ComposableSingletons$RhdCashCorrectionDetailFragmentKt.lambda$1726071208.<anonymous> (RhdCashCorrectionDetailFragment.kt:103)");
            }
            UUID uuid = new UUID(0L, 0L);
            UUID uuid2 = new UUID(1L, 0L);
            FuturesCashCorrection.Status status = FuturesCashCorrection.Status.UNSPECIFIED;
            Currency currency = Currencies.USD;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Money money = new Money(currency, ZERO);
            Money.Direction direction = Money.Direction.CREDIT;
            FuturesCashCorrection.Reason reason = FuturesCashCorrection.Reason.UNSPECIFIED;
            Instant EPOCH = Instant.EPOCH;
            Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
            Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
            RhdCashCorrectionDetailFragment5.CashCorrectionDetail(new RhdCashCorrectionDetailDuxo4.Loaded(new FuturesCashCorrection(uuid, uuid2, status, money, direction, reason, EPOCH, EPOCH, FuturesContractType.OUTRIGHTS)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-400845533$feature_futures_history_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14657getLambda$400845533$feature_futures_history_externalDebug() {
        return f8983lambda$400845533;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1726071208$feature_futures_history_externalDebug() {
        return lambda$1726071208;
    }
}
