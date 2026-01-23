package com.robinhood.android.futures.detail.p140ui.ftux;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Close2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesDetailFtuxTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxTopBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesDetailFtuxTopBar {
    public static final FuturesDetailFtuxTopBar INSTANCE = new FuturesDetailFtuxTopBar();

    /* renamed from: lambda$-544871760, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8978lambda$544871760 = ComposableLambda3.composableLambdaInstance(-544871760, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxTopBarKt$lambda$-544871760$1
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
                ComposerKt.traceEventStart(-544871760, i, -1, "com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxTopBarKt.lambda$-544871760.<anonymous> (FuturesDetailFtuxTopBar.kt:20)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-321547682, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8977lambda$321547682 = ComposableLambda3.composableLambdaInstance(-321547682, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxTopBarKt$lambda$-321547682$1
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
                ComposerKt.traceEventStart(-321547682, i, -1, "com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxTopBarKt.lambda$-321547682.<anonymous> (FuturesDetailFtuxTopBar.kt:25)");
            }
            IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-321547682$feature_futures_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14593getLambda$321547682$feature_futures_detail_externalDebug() {
        return f8977lambda$321547682;
    }

    /* renamed from: getLambda$-544871760$feature_futures_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14594getLambda$544871760$feature_futures_detail_externalDebug() {
        return f8978lambda$544871760;
    }
}
