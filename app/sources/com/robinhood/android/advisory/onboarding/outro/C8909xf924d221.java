package com.robinhood.android.advisory.onboarding.outro;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.advisory.onboarding.outro.FirstDepositNumberVisual;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.retirement.contributions.ContributionProgressRing;
import com.robinhood.android.retirement.contributions.ContributionProgressRingState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$1 */
/* loaded from: classes7.dex */
public final class C8909xf924d221 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ BigDecimal $depositAmount$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ StringResource $footerDescription$inlined;
    final /* synthetic */ StringResource $footerTitle$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ FirstDepositNumberVisual $visual$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8909xf924d221(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, BigDecimal bigDecimal, FirstDepositNumberVisual firstDepositNumberVisual, StringResource stringResource, StringResource stringResource2) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$depositAmount$inlined = bigDecimal;
        this.$visual$inlined = firstDepositNumberVisual;
        this.$footerTitle$inlined = stringResource;
        this.$footerDescription$inlined = stringResource2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        ConstraintLayoutScope constraintLayoutScope;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        ConstraintLayoutScope constraintLayoutScope2;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope3 = this.$scope;
        composer.startReplaceGroup(-950744102);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        String str2 = Formats.getPriceFormat().format(this.$depositAmount$inlined);
        FirstDepositNumberVisual firstDepositNumberVisual = this.$visual$inlined;
        if (firstDepositNumberVisual instanceof FirstDepositNumberVisual.Retirement) {
            composer.startReplaceGroup(-950512874);
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C8918xc3adf98f(constraintLayoutBaseScope4Component2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ContributionProgressRing.m18111ContributionProgressRinguFdPcIQ(new ContributionProgressRingState(((FirstDepositNumberVisual.Retirement) this.$visual$inlined).getRingPercentage(), str2, ApiRetirementMatchResponse3.UNSPECIFIED, null), C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM(), constraintLayoutScope3.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), composer, ContributionProgressRingState.$stable | 48, 0);
            composer.endReplaceGroup();
            constraintLayoutScope = constraintLayoutScope3;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
            str = null;
        } else {
            if (!Intrinsics.areEqual(firstDepositNumberVisual, FirstDepositNumberVisual.Deposit.INSTANCE)) {
                composer.startReplaceGroup(1770451939);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-949561050);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new C8919xc3adfd50(constraintLayoutBaseScope4Component2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            str = null;
            constraintLayoutScope = constraintLayoutScope3;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
            BentoText2.m20747BentoText38GnDrw(str2, modifierConstrainAs, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getBookCoverCapsuleLarge(), composer, 0, 0, 8184);
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(1770506602);
        StringResource stringResource = this.$footerTitle$inlined;
        String string2 = stringResource == null ? str : StringResource2.getString(stringResource, composer, StringResource.$stable);
        composer.endReplaceGroup();
        composer.startReplaceGroup(1770507625);
        if (string2 == null) {
            constraintLayoutScope2 = constraintLayoutScope;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
        } else {
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(5004770);
            ConstraintLayoutBaseScope4 constraintLayoutBaseScope44 = constraintLayoutBaseScope42;
            boolean zChanged3 = composer.changed(constraintLayoutBaseScope44);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new C8920x9032055e(constraintLayoutBaseScope44);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
            constraintLayoutScope2 = constraintLayoutScope4;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope44;
            BentoText2.m20747BentoText38GnDrw(string2, constraintLayoutScope4.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4, (Function1) objRememberedValue3), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i3).getTextM(), composer, 24576, 0, 8168);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(1770527946);
        StringResource stringResource2 = this.$footerDescription$inlined;
        String string3 = stringResource2 == null ? str : StringResource2.getString(stringResource2, composer, StringResource.$stable);
        composer.endReplaceGroup();
        composer.startReplaceGroup(1770529295);
        if (string3 != null) {
            Modifier.Companion companion4 = Modifier.INSTANCE;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = C8921x90401cdf.INSTANCE;
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope43, (Function1) objRememberedValue4);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(string3, PaddingKt.m5145paddingqDBjuR0(modifierConstrainAs2, bentoTheme3.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme3.getColors(composer, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer, i4).getTextM(), composer, 0, 0, 8184);
        }
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope5 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope5.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
