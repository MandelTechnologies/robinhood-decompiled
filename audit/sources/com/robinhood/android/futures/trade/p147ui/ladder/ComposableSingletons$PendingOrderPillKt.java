package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PendingOrderPill.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$PendingOrderPillKt {
    public static final ComposableSingletons$PendingOrderPillKt INSTANCE = new ComposableSingletons$PendingOrderPillKt();
    private static Function2<Composer, Integer, Unit> lambda$801049632 = ComposableLambda3.composableLambdaInstance(801049632, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$PendingOrderPillKt$lambda$801049632$1
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
                ComposerKt.traceEventStart(801049632, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$PendingOrderPillKt.lambda$801049632.<anonymous> (PendingOrderPill.kt:197)");
            }
            FuturesOrderSide futuresOrderSide = FuturesOrderSide.BUY;
            PendingOrderPillKt.m14856PillnjYn8yo(futuresOrderSide, StringResource.INSTANCE.invoke("+500 LMT"), ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14884topBackgroundColorvNxB06k(futuresOrderSide), ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14882getTopLoadingBackgroundColor0d7_KjU(), null, null, null, false, composer, (StringResource.$stable << 3) | 12582918, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2121507782 = ComposableLambda3.composableLambdaInstance(2121507782, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$PendingOrderPillKt$lambda$2121507782$1
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
                ComposerKt.traceEventStart(2121507782, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$PendingOrderPillKt.lambda$2121507782.<anonymous> (PendingOrderPill.kt:211)");
            }
            FuturesOrderSide futuresOrderSide = FuturesOrderSide.BUY;
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("LMT");
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ARROW_UP_16;
            PendingOrderPillKt.m14856PillnjYn8yo(futuresOrderSide, stringResourceInvoke, ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14884topBackgroundColorvNxB06k(futuresOrderSide), ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill().m14882getTopLoadingBackgroundColor0d7_KjU(), null, null, serverToBentoAssetMapper2, false, composer, (StringResource.$stable << 3) | 14155782, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2121507782$feature_futures_trade_externalDebug() {
        return lambda$2121507782;
    }

    public final Function2<Composer, Integer, Unit> getLambda$801049632$feature_futures_trade_externalDebug() {
        return lambda$801049632;
    }
}
