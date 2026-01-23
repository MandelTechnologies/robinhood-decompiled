package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesigninvesting.investingmonitor.C26507R;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestingMonitorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.ComposableSingletons$InvestingMonitorComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InvestingMonitorComposable {
    public static final InvestingMonitorComposable INSTANCE = new InvestingMonitorComposable();
    private static Function2<Composer, Integer, Unit> lambda$164519417 = ComposableLambda3.composableLambdaInstance(164519417, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.ComposableSingletons$InvestingMonitorComposableKt$lambda$164519417$1
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
                ComposerKt.traceEventStart(164519417, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.ComposableSingletons$InvestingMonitorComposableKt.lambda$164519417.<anonymous> (InvestingMonitorComposable.kt:232)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26507R.string.investing_monitor_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1279492315, reason: not valid java name */
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> f9206lambda$1279492315 = ComposableLambda3.composableLambdaInstance(-1279492315, false, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.ComposableSingletons$InvestingMonitorComposableKt$lambda$-1279492315$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1279492315, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.ComposableSingletons$InvestingMonitorComposableKt.lambda$-1279492315.<anonymous> (InvestingMonitorComposable.kt:237)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1205112978, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9205lambda$1205112978 = ComposableLambda3.composableLambdaInstance(-1205112978, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.ComposableSingletons$InvestingMonitorComposableKt$lambda$-1205112978$1
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
                ComposerKt.traceEventStart(-1205112978, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.ComposableSingletons$InvestingMonitorComposableKt.lambda$-1205112978.<anonymous> (InvestingMonitorComposable.kt:267)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.PLUS_24), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1205112978$feature_investing_monitor_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18002getLambda$1205112978$feature_investing_monitor_externalDebug() {
        return f9205lambda$1205112978;
    }

    /* renamed from: getLambda$-1279492315$feature_investing_monitor_externalDebug, reason: not valid java name */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m18003getLambda$1279492315$feature_investing_monitor_externalDebug() {
        return f9206lambda$1279492315;
    }

    public final Function2<Composer, Integer, Unit> getLambda$164519417$feature_investing_monitor_externalDebug() {
        return lambda$164519417;
    }
}
