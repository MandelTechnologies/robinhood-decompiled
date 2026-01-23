package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.utils.LoggingUtils5;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class PositionSectionKt$PositionSection$1$6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FuturesDetailViewState.PositionData $data;
    final /* synthetic */ ConstraintLayoutBaseScope4 $flatten;
    final /* synthetic */ Function0<Unit> $onFlattenClick;
    final /* synthetic */ ConstraintLayoutScope $this_ConstraintLayout;

    PositionSectionKt$PositionSection$1$6(FuturesDetailViewState.PositionData positionData, ConstraintLayoutScope constraintLayoutScope, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, Function0<Unit> function0) {
        this.$data = positionData;
        this.$this_ConstraintLayout = constraintLayoutScope;
        this.$flatten = constraintLayoutBaseScope4;
        this.$onFlattenClick = function0;
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
            ComposerKt.traceEventStart(1543040186, i, -1, "com.robinhood.android.futures.detail.ui.PositionSection.<anonymous>.<anonymous> (PositionSection.kt:124)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_flatten_button_label, composer, 0);
        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
        boolean zIsFlattenInProgress = this.$data.getFlattenButtonData().isFlattenInProgress();
        boolean zIsEnabled = this.$data.getFlattenButtonData().isEnabled();
        ConstraintLayoutScope constraintLayoutScope = this.$this_ConstraintLayout;
        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0));
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(modifierM5174width3ABfNKs, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), LoggingUtils5.buttonDescriptor(FuturesAnalyticsStrings.FUTURES_FDP_FLATTEN_BUTTON, composer, 6), true, false, false, this.$data.getFlattenButtonData().isEnabled(), false, null, 108, null);
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = this.$flatten;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<ConstrainScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$1$6$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                    invoke2(constrainScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                    ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                    constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8(this.$onFlattenClick, strStringResource, constraintLayoutScope.constrainAs(modifierAutoLogEvents$default, constraintLayoutBaseScope4, (Function1) objRememberedValue), null, type2, zIsEnabled, zIsFlattenInProgress, null, null, null, null, false, null, composer, 24576, 0, 8072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
