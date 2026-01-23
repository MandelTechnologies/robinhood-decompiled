package com.robinhood.android.charts.cursor;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartCursorDataHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onPrimaryValueClick;
    final /* synthetic */ CursorData.DisplayText $primaryValue;

    ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$1(Function0<Unit> function0, CursorData.DisplayText displayText) {
        this.$onPrimaryValueClick = function0;
        this.$primaryValue = displayText;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        float fM21594getXlargeD9Ej5fM;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(796985602, i, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:88)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onPrimaryValueClick);
        final Function0<Unit> function0 = this.$onPrimaryValueClick;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$1.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        if (this.$primaryValue.getStyle() == null) {
            composer.startReplaceGroup(1398996776);
            fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
            composer.endReplaceGroup();
        } else {
            long jM7662getFontSizeXSAIIZE = this.$primaryValue.getStyle().m7662getFontSizeXSAIIZE();
            long sp = TextUnit2.getSp(32);
            TextUnit2.m8083checkArithmeticNB67dxo(jM7662getFontSizeXSAIIZE, sp);
            if (Float.compare(TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(sp)) >= 0) {
                composer.startReplaceGroup(1399000584);
                fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
                composer.endReplaceGroup();
            } else {
                long jM7662getFontSizeXSAIIZE2 = this.$primaryValue.getStyle().m7662getFontSizeXSAIIZE();
                long sp2 = TextUnit2.getSp(24);
                TextUnit2.m8083checkArithmeticNB67dxo(jM7662getFontSizeXSAIIZE2, sp2);
                if (Float.compare(TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(sp2)) >= 0) {
                    composer.startReplaceGroup(1399003847);
                    fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1399006056);
                    fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
                    composer.endReplaceGroup();
                }
            }
        }
        PrivacyText3.PrivacyText(function02, SizeKt.m5156height3ABfNKs(companion, fM21594getXlargeD9Ej5fM), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
