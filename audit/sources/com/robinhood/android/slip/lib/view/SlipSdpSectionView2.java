package com.robinhood.android.slip.lib.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipSdpSectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.lib.view.ComposableSingletons$SlipSdpSectionViewKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipSdpSectionView2 {
    public static final SlipSdpSectionView2 INSTANCE = new SlipSdpSectionView2();

    /* renamed from: lambda$-1166366492, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9250lambda$1166366492 = ComposableLambda3.composableLambdaInstance(-1166366492, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.view.ComposableSingletons$SlipSdpSectionViewKt$lambda$-1166366492$1
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
                ComposerKt.traceEventStart(-1166366492, i, -1, "com.robinhood.android.slip.lib.view.ComposableSingletons$SlipSdpSectionViewKt.lambda$-1166366492.<anonymous> (SlipSdpSectionView.kt:55)");
            }
            SlipSdpSectionView4.Loading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1166366492$feature_lib_slip_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18939getLambda$1166366492$feature_lib_slip_externalDebug() {
        return f9250lambda$1166366492;
    }
}
