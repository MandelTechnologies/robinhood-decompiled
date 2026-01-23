package com.robinhood.android.advisory.projection.disclosure;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.projection.C9264R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryProjectionDisclosureFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.projection.disclosure.ComposableSingletons$AdvisoryProjectionDisclosureFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryProjectionDisclosureFragment4 {
    public static final AdvisoryProjectionDisclosureFragment4 INSTANCE = new AdvisoryProjectionDisclosureFragment4();

    /* renamed from: lambda$-1364614120, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8651lambda$1364614120 = ComposableLambda3.composableLambdaInstance(-1364614120, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.disclosure.ComposableSingletons$AdvisoryProjectionDisclosureFragmentKt$lambda$-1364614120$1
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
                ComposerKt.traceEventStart(-1364614120, i, -1, "com.robinhood.android.advisory.projection.disclosure.ComposableSingletons$AdvisoryProjectionDisclosureFragmentKt.lambda$-1364614120.<anonymous> (AdvisoryProjectionDisclosureFragment.kt:75)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C9264R.string.projection_disclosure_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Row5, Composer, Integer, Unit> lambda$425855363 = ComposableLambda3.composableLambdaInstance(425855363, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.disclosure.ComposableSingletons$AdvisoryProjectionDisclosureFragmentKt$lambda$425855363$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(425855363, i, -1, "com.robinhood.android.advisory.projection.disclosure.ComposableSingletons$AdvisoryProjectionDisclosureFragmentKt.lambda$425855363.<anonymous> (AdvisoryProjectionDisclosureFragment.kt:82)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1364614120$feature_projected_returns_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11227getLambda$1364614120$feature_projected_returns_externalDebug() {
        return f8651lambda$1364614120;
    }

    public final Function3<Row5, Composer, Integer, Unit> getLambda$425855363$feature_projected_returns_externalDebug() {
        return lambda$425855363;
    }
}
