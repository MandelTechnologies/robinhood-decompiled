package com.robinhood.android.futures.detail.p140ui.chart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class FuturesDetailChartSectionKt$DefaultChartHeader$1$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CursorData $activeCursorData;
    final /* synthetic */ ConstraintLayoutBaseScope4 $bidAsk;
    final /* synthetic */ ConstraintLayoutBaseScope4 $cursorData;
    final /* synthetic */ ConstraintLayoutBaseScope4 $name;
    final /* synthetic */ boolean $shouldAddScrimOverlayToChartComponents;
    final /* synthetic */ ConstraintLayoutScope $this_ConstraintLayout;

    FuturesDetailChartSectionKt$DefaultChartHeader$1$4(ConstraintLayoutScope constraintLayoutScope, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope4 constraintLayoutBaseScope42, ConstraintLayoutBaseScope4 constraintLayoutBaseScope43, CursorData cursorData, boolean z) {
        this.$this_ConstraintLayout = constraintLayoutScope;
        this.$cursorData = constraintLayoutBaseScope4;
        this.$name = constraintLayoutBaseScope42;
        this.$bidAsk = constraintLayoutBaseScope43;
        this.$activeCursorData = cursorData;
        this.$shouldAddScrimOverlayToChartComponents = z;
    }

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
            ComposerKt.traceEventStart(55392340, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<anonymous> (FuturesDetailChartSection.kt:319)");
        }
        ConstraintLayoutScope constraintLayoutScope = this.$this_ConstraintLayout;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = this.$cursorData;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$name) | composer.changed(this.$bidAsk);
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope42 = this.$name;
        final ConstraintLayoutBaseScope4 constraintLayoutBaseScope43 = this.$bidAsk;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<ConstrainScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$1$4$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                    invoke2(constrainScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constraintLayoutBaseScope42.getBottom(), 0.0f, 0.0f, 6, null);
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constraintLayoutBaseScope43.getTop(), 0.0f, 0.0f, 6, null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SduiCursorData2.SduiCursorDataHeader(this.$activeCursorData, constraintLayoutScope.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4, (Function1) objRememberedValue), null, null, null, false, false, this.$shouldAddScrimOverlayToChartComponents, false, composer, 196608, 348);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
