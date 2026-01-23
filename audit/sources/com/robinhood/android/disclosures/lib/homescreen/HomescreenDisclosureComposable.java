package com.robinhood.android.disclosures.lib.homescreen;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.disclosures.lib.C14229R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomescreenDisclosureComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.disclosures.lib.homescreen.ComposableSingletons$HomescreenDisclosureComposableKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class HomescreenDisclosureComposable {
    public static final HomescreenDisclosureComposable INSTANCE = new HomescreenDisclosureComposable();

    /* renamed from: lambda$-894273589, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f8875lambda$894273589 = ComposableLambda3.composableLambdaInstance(-894273589, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.disclosures.lib.homescreen.ComposableSingletons$HomescreenDisclosureComposableKt$lambda$-894273589$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-894273589, i, -1, "com.robinhood.android.disclosures.lib.homescreen.ComposableSingletons$HomescreenDisclosureComposableKt.lambda$-894273589.<anonymous> (HomescreenDisclosureComposable.kt:130)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, HomescreenDisclosureComposable3.HOMESCREEN_DISCLOSURE_DISCLAIMER_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C14229R.string.watchlist_disclosure_disclaimer_label, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 48, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-894273589$lib_disclosures_externalDebug, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m13367getLambda$894273589$lib_disclosures_externalDebug() {
        return f8875lambda$894273589;
    }
}
