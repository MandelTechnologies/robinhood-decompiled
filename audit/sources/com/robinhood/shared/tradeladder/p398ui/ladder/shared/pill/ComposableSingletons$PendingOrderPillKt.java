package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PendingOrderPill.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$PendingOrderPillKt {
    public static final ComposableSingletons$PendingOrderPillKt INSTANCE = new ComposableSingletons$PendingOrderPillKt();

    /* renamed from: lambda$-252361258, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9522lambda$252361258 = ComposableLambda3.composableLambdaInstance(-252361258, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt$lambda$-252361258$1
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
                ComposerKt.traceEventStart(-252361258, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt.lambda$-252361258.<anonymous> (PendingOrderPill.kt:239)");
            }
            PillStyle orderPill = ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill();
            Side side = Side.START;
            PillStyle.PillVisualState pillVisualState = PillStyle.PillVisualState.ACTIVE;
            PendingOrderPillKt.m26159Pill0nlq0H8(side, pillVisualState, StringResource.INSTANCE.invoke("+500 LMT"), orderPill.m26270topBackgroundColorWaAFU9c(side, pillVisualState), orderPill.m26267getTopLoadingBackgroundColor0d7_KjU(), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26260borderWidthu2uoSUM(pillVisualState), null, null, null, false, composer, (StringResource.$stable << 6) | 54, 48, 1792);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2067168767, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9521lambda$2067168767 = ComposableLambda3.composableLambdaInstance(-2067168767, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt$lambda$-2067168767$1
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
                ComposerKt.traceEventStart(-2067168767, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt.lambda$-2067168767.<anonymous> (PendingOrderPill.kt:258)");
            }
            PillStyle orderPill = ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill();
            Side side = Side.START;
            PillStyle.PillVisualState pillVisualState = PillStyle.PillVisualState.OUTLINED;
            PendingOrderPillKt.m26159Pill0nlq0H8(side, pillVisualState, StringResource.INSTANCE.invoke("+500 LMT"), orderPill.m26270topBackgroundColorWaAFU9c(side, pillVisualState), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU(), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26260borderWidthu2uoSUM(pillVisualState), null, null, null, false, composer, (StringResource.$stable << 6) | 54, 48, 1792);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1508251408, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9520lambda$1508251408 = ComposableLambda3.composableLambdaInstance(-1508251408, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt$lambda$-1508251408$1
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
                ComposerKt.traceEventStart(-1508251408, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt.lambda$-1508251408.<anonymous> (PendingOrderPill.kt:277)");
            }
            PillStyle orderPill = ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill();
            Side side = Side.START;
            PillStyle.PillVisualState pillVisualState = PillStyle.PillVisualState.ACTIVE;
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("LMT");
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ARROW_UP_16;
            PendingOrderPillKt.m26159Pill0nlq0H8(side, pillVisualState, stringResourceInvoke, orderPill.m26270topBackgroundColorWaAFU9c(side, pillVisualState), orderPill.m26267getTopLoadingBackgroundColor0d7_KjU(), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26260borderWidthu2uoSUM(pillVisualState), null, null, serverToBentoAssetMapper2, false, composer, (StringResource.$stable << 6) | 54, 54, 768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$284242205 = ComposableLambda3.composableLambdaInstance(284242205, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt$lambda$284242205$1
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
                ComposerKt.traceEventStart(284242205, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$PendingOrderPillKt.lambda$284242205.<anonymous> (PendingOrderPill.kt:297)");
            }
            PillStyle orderPill = ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getOrderPill();
            Side side = Side.START;
            PillStyle.PillVisualState pillVisualState = PillStyle.PillVisualState.OUTLINED;
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke("LMT");
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ARROW_UP_16;
            PendingOrderPillKt.m26159Pill0nlq0H8(side, pillVisualState, stringResourceInvoke, orderPill.m26270topBackgroundColorWaAFU9c(side, pillVisualState), orderPill.m26267getTopLoadingBackgroundColor0d7_KjU(), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26269textColorWaAFU9c(side, pillVisualState), orderPill.m26260borderWidthu2uoSUM(pillVisualState), null, null, serverToBentoAssetMapper2, false, composer, (StringResource.$stable << 6) | 54, 54, 768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1508251408$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26151getLambda$1508251408$lib_trade_ladder_externalDebug() {
        return f9520lambda$1508251408;
    }

    /* renamed from: getLambda$-2067168767$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26152getLambda$2067168767$lib_trade_ladder_externalDebug() {
        return f9521lambda$2067168767;
    }

    /* renamed from: getLambda$-252361258$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26153getLambda$252361258$lib_trade_ladder_externalDebug() {
        return f9522lambda$252361258;
    }

    public final Function2<Composer, Integer, Unit> getLambda$284242205$lib_trade_ladder_externalDebug() {
        return lambda$284242205;
    }
}
