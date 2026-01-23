package com.robinhood.android.support.supporthub;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SupportHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$SupportHubComposableKt {
    public static final ComposableSingletons$SupportHubComposableKt INSTANCE = new ComposableSingletons$SupportHubComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1370541868 = ComposableLambda3.composableLambdaInstance(1370541868, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$SupportHubComposableKt$lambda$1370541868$1
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
                ComposerKt.traceEventStart(1370541868, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$SupportHubComposableKt.lambda$1370541868.<anonymous> (SupportHubComposable.kt:389)");
            }
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(6));
            String strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_qa_cta, composer, 0);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            long jM6716getBlack0d7_KjU = Color.INSTANCE.m6716getBlack0d7_KjU();
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5143paddingVpY3zN4, Color.m6701boximpl(jM6716getBlack0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 12607920, 0, 7976);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1370541868$feature_support_externalRelease() {
        return lambda$1370541868;
    }
}
