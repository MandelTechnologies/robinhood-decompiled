package com.robinhood.android.deeplink.targets.cash;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CashManagementDeepLinkActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.deeplink.targets.cash.ComposableSingletons$CashManagementDeepLinkActivityKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CashManagementDeepLinkActivity2 {
    public static final CashManagementDeepLinkActivity2 INSTANCE = new CashManagementDeepLinkActivity2();

    /* renamed from: lambda$-1286166489, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8868lambda$1286166489 = ComposableLambda3.composableLambdaInstance(-1286166489, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.deeplink.targets.cash.ComposableSingletons$CashManagementDeepLinkActivityKt$lambda$-1286166489$1
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
                ComposerKt.traceEventStart(-1286166489, i, -1, "com.robinhood.android.deeplink.targets.cash.ComposableSingletons$CashManagementDeepLinkActivityKt.lambda$-1286166489.<anonymous> (CashManagementDeepLinkActivity.kt:64)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1597035231 = ComposableLambda3.composableLambdaInstance(1597035231, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.deeplink.targets.cash.ComposableSingletons$CashManagementDeepLinkActivityKt$lambda$1597035231$1
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
                ComposerKt.traceEventStart(1597035231, i, -1, "com.robinhood.android.deeplink.targets.cash.ComposableSingletons$CashManagementDeepLinkActivityKt.lambda$1597035231.<anonymous> (CashManagementDeepLinkActivity.kt:63)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CashManagementDeepLinkActivity2.INSTANCE.m13270getLambda$1286166489$lib_deeplink_targets_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1286166489$lib_deeplink_targets_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13270getLambda$1286166489$lib_deeplink_targets_externalDebug() {
        return f8868lambda$1286166489;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1597035231$lib_deeplink_targets_externalDebug() {
        return lambda$1597035231;
    }
}
