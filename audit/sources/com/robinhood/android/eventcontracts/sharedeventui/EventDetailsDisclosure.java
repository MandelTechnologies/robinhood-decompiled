package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.disclosures.lib.C14229R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.AnnotatedStringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EventDetailsDisclosure.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$EventDetailsDisclosureKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailsDisclosure {
    public static final EventDetailsDisclosure INSTANCE = new EventDetailsDisclosure();
    private static Function2<Composer, Integer, Unit> lambda$1164126561 = ComposableLambda3.composableLambdaInstance(1164126561, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$EventDetailsDisclosureKt$lambda$1164126561$1
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
                ComposerKt.traceEventStart(1164126561, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$EventDetailsDisclosureKt.lambda$1164126561.<anonymous> (EventDetailsDisclosure.kt:49)");
            }
            int i2 = C14229R.string.gated_event_contract_disclosure;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i2, bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composer, 0, 12), null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer, i3).getTextS().plus(new TextStyle(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawScope2) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null)), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1164126561$lib_shared_event_ui_externalDebug() {
        return lambda$1164126561;
    }
}
