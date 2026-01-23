package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesLadderScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$FuturesLadderScreenKt {
    public static final ComposableSingletons$FuturesLadderScreenKt INSTANCE = new ComposableSingletons$FuturesLadderScreenKt();

    /* renamed from: lambda$-490208677, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f9000lambda$490208677 = ComposableLambda3.composableLambdaInstance(-490208677, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$FuturesLadderScreenKt$lambda$-490208677$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-490208677, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$FuturesLadderScreenKt.lambda$-490208677.<anonymous> (FuturesLadderScreen.kt:336)");
            }
            float f = 10;
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, LadderRowKt.getLadderRowHeight()), C2002Dp.m7995constructorimpl(80)), 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, C2002Dp.m7995constructorimpl(f), 5, null), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1336892144, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8999lambda$1336892144 = ComposableLambda3.composableLambdaInstance(-1336892144, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$FuturesLadderScreenKt$lambda$-1336892144$1
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
                ComposerKt.traceEventStart(-1336892144, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$FuturesLadderScreenKt.lambda$-1336892144.<anonymous> (FuturesLadderScreen.kt:366)");
            }
            FuturesLadderScreenKt.LoadingLadderUi(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1336892144$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14759getLambda$1336892144$feature_futures_trade_externalDebug() {
        return f8999lambda$1336892144;
    }

    /* renamed from: getLambda$-490208677$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m14760getLambda$490208677$feature_futures_trade_externalDebug() {
        return f9000lambda$490208677;
    }
}
