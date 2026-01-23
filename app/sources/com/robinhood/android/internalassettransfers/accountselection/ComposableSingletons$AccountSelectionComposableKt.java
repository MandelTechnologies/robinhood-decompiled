package com.robinhood.android.internalassettransfers.accountselection;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$AccountSelectionComposableKt {
    public static final ComposableSingletons$AccountSelectionComposableKt INSTANCE = new ComposableSingletons$AccountSelectionComposableKt();

    /* renamed from: lambda$-852753901, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9038lambda$852753901 = ComposableLambda3.composableLambdaInstance(-852753901, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.accountselection.ComposableSingletons$AccountSelectionComposableKt$lambda$-852753901$1
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
                ComposerKt.traceEventStart(-852753901, i, -1, "com.robinhood.android.internalassettransfers.accountselection.ComposableSingletons$AccountSelectionComposableKt.lambda$-852753901.<anonymous> (AccountSelectionComposable.kt:463)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1777754088, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f9037lambda$1777754088 = ComposableLambda3.composableLambdaInstance(-1777754088, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.accountselection.ComposableSingletons$AccountSelectionComposableKt$lambda$-1777754088$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1777754088, i, -1, "com.robinhood.android.internalassettransfers.accountselection.ComposableSingletons$AccountSelectionComposableKt.lambda$-1777754088.<anonymous> (AccountSelectionComposable.kt:470)");
            }
            BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.2f, null, 0, 0L, 0L, false, composer, 6, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1777754088$feature_internal_asset_transfers_externalDebug */
    public final Function3<BoxScope, Composer, Integer, Unit> m2065x2d3390c7() {
        return f9037lambda$1777754088;
    }

    /* renamed from: getLambda$-852753901$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2066x5bfbae59() {
        return f9038lambda$852753901;
    }
}
