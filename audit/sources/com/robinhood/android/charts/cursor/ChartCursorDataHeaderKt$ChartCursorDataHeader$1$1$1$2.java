package com.robinhood.android.charts.cursor;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.Measured;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.compose.extensions.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: ChartCursorDataHeader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $clearSemanticsOnChildren;
    final /* synthetic */ String $displayCurrencyCode;
    final /* synthetic */ Function0<Unit> $onPrimaryValueClick;
    final /* synthetic */ CursorData.DisplayText $primaryText;
    final /* synthetic */ CursorData.DisplayText $primaryValue;

    ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$2(boolean z, Function0<Unit> function0, CursorData.DisplayText displayText, CursorData.DisplayText displayText2, String str) {
        this.$clearSemanticsOnChildren = z;
        this.$onPrimaryValueClick = function0;
        this.$primaryText = displayText;
        this.$primaryValue = displayText2;
        this.$displayCurrencyCode = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        TickerTextState.Style style;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1516572907, i, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:108)");
        }
        boolean z = this.$clearSemanticsOnChildren;
        final Function0<Unit> function0 = this.$onPrimaryValueClick;
        CursorData.DisplayText displayText = this.$primaryText;
        CursorData.DisplayText displayText2 = this.$primaryValue;
        String str = this.$displayCurrencyCode;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$2.invoke$lambda$6$lambda$1$lambda$0((Measured) obj));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierClearSemanticsIf = ModifiersKt.clearSemanticsIf(row6.alignBy(companion, (Function1<? super Measured, Integer>) objRememberedValue), z);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue2);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
        composer.endReplaceGroup();
        boolean z2 = function0 != null;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(function0);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$2.invoke$lambda$6$lambda$4$lambda$3(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierClearSemanticsIf, interactionSource3, null, z2, null, null, (Function0) objRememberedValue3, 24, null);
        String value = displayText.getValue();
        long jM12177orStaleek8zF_U = StaleState2.m12177orStaleek8zF_U(((Styles) composer.consume(Styles2.getLocalStyles())).getChart(composer, 0).m21729getTickerTextColor0d7_KjU(), composer, 0);
        if (displayText2.getStyle() == null) {
            style = TickerTextState.Style.DISPLAY_LARGE;
        } else {
            long jM7662getFontSizeXSAIIZE = displayText2.getStyle().m7662getFontSizeXSAIIZE();
            long sp = TextUnit2.getSp(32);
            TextUnit2.m8083checkArithmeticNB67dxo(jM7662getFontSizeXSAIIZE, sp);
            if (Float.compare(TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE), TextUnit.m8074getValueimpl(sp)) >= 0) {
                style = TickerTextState.Style.DISPLAY_LARGE;
            } else {
                long jM7662getFontSizeXSAIIZE2 = displayText2.getStyle().m7662getFontSizeXSAIIZE();
                long sp2 = TextUnit2.getSp(24);
                TextUnit2.m8083checkArithmeticNB67dxo(jM7662getFontSizeXSAIIZE2, sp2);
                if (Float.compare(TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE2), TextUnit.m8074getValueimpl(sp2)) >= 0) {
                    style = TickerTextState.Style.DISPLAY_MEDIUM;
                } else {
                    style = TickerTextState.Style.DISPLAY_LARGE;
                }
            }
        }
        WrappedTickerKt.TickerText(new TickerTextState(value, jM12177orStaleek8zF_U, style, z ? "" : displayText.getValue(), false, 16, null), modifierM4891clickableO2vRcR0$default, composer, TickerTextState.$stable, 0);
        composer.startReplaceGroup(-1664514667);
        if (str != null) {
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, row6.alignByBaseline(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null)), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 24576, 0, 8172);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$6$lambda$1$lambda$0(Measured it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MathKt.roundToInt(it.getMeasuredHeight() / 1.3d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$4$lambda$3(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
