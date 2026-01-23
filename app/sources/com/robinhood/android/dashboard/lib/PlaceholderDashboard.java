package com.robinhood.android.dashboard.lib;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PlaceholderDashboard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.ComposableSingletons$PlaceholderDashboardKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PlaceholderDashboard {
    public static final PlaceholderDashboard INSTANCE = new PlaceholderDashboard();

    /* renamed from: lambda$-92433503, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8862lambda$92433503 = ComposableLambda3.composableLambdaInstance(-92433503, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.ComposableSingletons$PlaceholderDashboardKt$lambda$-92433503$1
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
                ComposerKt.traceEventStart(-92433503, i, -1, "com.robinhood.android.dashboard.lib.ComposableSingletons$PlaceholderDashboardKt.lambda$-92433503.<anonymous> (PlaceholderDashboard.kt:36)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1955186060, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8860lambda$1955186060 = ComposableLambda3.composableLambdaInstance(-1955186060, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.ComposableSingletons$PlaceholderDashboardKt$lambda$-1955186060$1
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
                ComposerKt.traceEventStart(-1955186060, i, -1, "com.robinhood.android.dashboard.lib.ComposableSingletons$PlaceholderDashboardKt.lambda$-1955186060.<anonymous> (PlaceholderDashboard.kt:35)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(PlaceholderDashboard.INSTANCE.m13177getLambda$92433503$lib_account_home_externalDebug(), null, null, null, null, false, false, null, null, 0L, null, composer, 6, 0, 2046);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-532475433, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8861lambda$532475433 = ComposableLambda3.composableLambdaInstance(-532475433, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.ComposableSingletons$PlaceholderDashboardKt$lambda$-532475433$1
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
                ComposerKt.traceEventStart(-532475433, i, -1, "com.robinhood.android.dashboard.lib.ComposableSingletons$PlaceholderDashboardKt.lambda$-532475433.<anonymous> (PlaceholderDashboard.kt:107)");
            }
            PlaceholderDashboard5.PlaceholderDashboard(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1955186060$lib_account_home_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13175getLambda$1955186060$lib_account_home_externalDebug() {
        return f8860lambda$1955186060;
    }

    /* renamed from: getLambda$-532475433$lib_account_home_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13176getLambda$532475433$lib_account_home_externalDebug() {
        return f8861lambda$532475433;
    }

    /* renamed from: getLambda$-92433503$lib_account_home_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13177getLambda$92433503$lib_account_home_externalDebug() {
        return f8862lambda$92433503;
    }
}
