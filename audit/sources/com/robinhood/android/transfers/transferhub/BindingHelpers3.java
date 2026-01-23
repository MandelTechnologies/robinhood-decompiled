package com.robinhood.android.transfers.transferhub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BindingHelpers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.transferhub.ComposableSingletons$BindingHelpersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BindingHelpers3 {
    public static final BindingHelpers3 INSTANCE = new BindingHelpers3();

    /* renamed from: lambda$-2140149642, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9286lambda$2140149642 = ComposableLambda3.composableLambdaInstance(-2140149642, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.ComposableSingletons$BindingHelpersKt$lambda$-2140149642$1
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
                ComposerKt.traceEventStart(-2140149642, i, -1, "com.robinhood.android.transfers.transferhub.ComposableSingletons$BindingHelpersKt.lambda$-2140149642.<anonymous> (BindingHelpers.kt:78)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2140149642$feature_transfer_hub_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19732getLambda$2140149642$feature_transfer_hub_externalDebug() {
        return f9286lambda$2140149642;
    }
}
