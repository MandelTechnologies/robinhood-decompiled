package com.robinhood.shared.onboarding.tin;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TinsOverviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.onboarding.tin.ComposableSingletons$TinsOverviewFragmentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TinsOverviewFragment2 {
    public static final TinsOverviewFragment2 INSTANCE = new TinsOverviewFragment2();

    /* renamed from: lambda$-1465976874, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9463lambda$1465976874 = ComposableLambda3.composableLambdaInstance(-1465976874, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.tin.ComposableSingletons$TinsOverviewFragmentKt$lambda$-1465976874$1
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
                ComposerKt.traceEventStart(-1465976874, i, -1, "com.robinhood.shared.onboarding.tin.ComposableSingletons$TinsOverviewFragmentKt.lambda$-1465976874.<anonymous> (TinsOverviewFragment.kt:139)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39254R.string.tins_overview_app_bar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1426176015, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f9462lambda$1426176015 = ComposableLambda3.composableLambdaInstance(-1426176015, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.onboarding.tin.ComposableSingletons$TinsOverviewFragmentKt$lambda$-1426176015$1
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
                ComposerKt.traceEventStart(-1426176015, i, -1, "com.robinhood.shared.onboarding.tin.ComposableSingletons$TinsOverviewFragmentKt.lambda$-1426176015.<anonymous> (TinsOverviewFragment.kt:146)");
            }
            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(1, 1.0f, 5, null, 0L, 0L, false, composer, 438, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1426176015$feature_tin_externalDebug, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m25559getLambda$1426176015$feature_tin_externalDebug() {
        return f9462lambda$1426176015;
    }

    /* renamed from: getLambda$-1465976874$feature_tin_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25560getLambda$1465976874$feature_tin_externalDebug() {
        return f9463lambda$1465976874;
    }
}
