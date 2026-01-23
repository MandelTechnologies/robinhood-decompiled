package com.robinhood.shared.tradeladder.p398ui.ladder.shared.loading;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Loading.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.ComposableSingletons$LoadingKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Loading2 {
    public static final Loading2 INSTANCE = new Loading2();

    /* renamed from: lambda$-818853748, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9518lambda$818853748 = ComposableLambda3.composableLambdaInstance(-818853748, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.loading.ComposableSingletons$LoadingKt$lambda$-818853748$1
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
                ComposerKt.traceEventStart(-818853748, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.loading.ComposableSingletons$LoadingKt.lambda$-818853748.<anonymous> (Loading.kt:195)");
            }
            Loading4.Loading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-818853748$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26137getLambda$818853748$lib_trade_ladder_externalDebug() {
        return f9518lambda$818853748;
    }
}
