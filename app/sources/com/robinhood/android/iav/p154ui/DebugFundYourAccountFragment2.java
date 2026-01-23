package com.robinhood.android.iav.p154ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DebugFundYourAccountFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DebugFundYourAccountFragment2 {
    public static final DebugFundYourAccountFragment2 INSTANCE = new DebugFundYourAccountFragment2();

    /* renamed from: lambda$-1843331102, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9031lambda$1843331102 = ComposableLambda3.composableLambdaInstance(-1843331102, false, DebugFundYourAccountFragment3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1394842583 = ComposableLambda3.composableLambdaInstance(1394842583, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt$lambda$1394842583$1
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
                ComposerKt.traceEventStart(1394842583, i, -1, "com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt.lambda$1394842583.<anonymous> (DebugFundYourAccountFragment.kt:22)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(DebugFundYourAccountFragment2.INSTANCE.m15255getLambda$1843331102$feature_iav_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2063860255 = ComposableLambda3.composableLambdaInstance(2063860255, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt$lambda$2063860255$1
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
                ComposerKt.traceEventStart(2063860255, i, -1, "com.robinhood.android.iav.ui.ComposableSingletons$DebugFundYourAccountFragmentKt.lambda$2063860255.<anonymous> (DebugFundYourAccountFragment.kt:21)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, DebugFundYourAccountFragment2.INSTANCE.getLambda$1394842583$feature_iav_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1843331102$feature_iav_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15255getLambda$1843331102$feature_iav_externalDebug() {
        return f9031lambda$1843331102;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1394842583$feature_iav_externalDebug() {
        return lambda$1394842583;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2063860255$feature_iav_externalDebug() {
        return lambda$2063860255;
    }
}
