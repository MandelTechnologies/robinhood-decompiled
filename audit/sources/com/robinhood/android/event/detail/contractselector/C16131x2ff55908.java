package com.robinhood.android.event.detail.contractselector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.ChainConstrainScope2;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope5;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.animation.DeltaAnimations;
import com.robinhood.android.eventcontracts.sharedeventui.animation.OpenInterestDeltaAnimationState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import p479j$.time.Instant;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C16131x2ff55908 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Instant $now$inlined;
    final /* synthetic */ Function2 $onTradeClicked$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ ContractSelectorRowTreatmentViewState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16131x2ff55908(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState, Instant instant, Function2 function2) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$state$inlined = contractSelectorRowTreatmentViewState;
        this.$now$inlined = instant;
        this.$onTradeClicked$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long jM21452getNegative0d7_KjU;
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
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(-1469436553);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope5 constraintLayoutBaseScope5CreateHorizontalChain = constraintLayoutScope.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3}, ConstraintLayoutBaseScope3.INSTANCE.getPacked());
        ConstraintLayoutBaseScope.createVerticalChain$default(constraintLayoutScope, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, null, 2, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(constraintLayoutBaseScope4Component6);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C16136x79141c02(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component6);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        constraintLayoutScope.constrain(constraintLayoutBaseScope5CreateHorizontalChain, (Function1<? super ChainConstrainScope2, Unit>) objRememberedValue);
        OpenInterestDeltaAnimationState openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation = DeltaAnimations.buildOpenInterestDeltaAnimation(this.$state$inlined.getOpenInterestDelta(), this.$state$inlined.isOpenInterestDeltaPositive(), this.$now$inlined, composer, 0);
        ContractSelectorButtonViewState leftButtonState = this.$state$inlined.getLeftButtonState();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = C16137x79141fc3.INSTANCE;
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2);
        float f = ContractSelectorCenterAlignedVariantKt.ButtonWidth;
        float f2 = ContractSelectorCenterAlignedVariantKt.ButtonHeight;
        C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(f);
        C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(f2);
        Function2 function2 = this.$onTradeClicked$inlined;
        int i2 = StringResource.$stable;
        ContractSelectorButton.m14138ContractSelectorButtonJEEbyFU(leftButtonState, c2002DpM7993boximpl, c2002DpM7993boximpl2, modifierConstrainAs, function2, composer, i2 | 432, 0);
        String contractName = this.$state$inlined.getContractName();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
        int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(constraintLayoutBaseScope4Component6);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new C16138x79142384(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component6);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(contractName, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM, composer, 817889280, 0, 7484);
        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
        DayNightColor contractColor = this.$state$inlined.getContractColor();
        composer.startReplaceGroup(-878632967);
        Color colorM6701boximpl = contractColor == null ? null : Color.m6701boximpl(contractColor.getColor(composer, 0));
        composer.endReplaceGroup();
        composer.startReplaceGroup(-878633593);
        long jM21426getFg20d7_KjU = colorM6701boximpl == null ? bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU() : colorM6701boximpl.getValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component3) | composer.changedInstance(this.$state$inlined);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new C16139x79142745(constraintLayoutBaseScope4Component3, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue4), 0.0f, 0.0f, ContractSelectorCenterAlignedVariantKt.SixDpPadding, 0.0f, 11, null);
        int i4 = BentoIcon4.Size12.$stable;
        BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer, i4 | 48, 48);
        String openInterestDisplayText = this.$state$inlined.getOpenInterestDisplayText();
        if (openInterestDisplayText == null) {
            openInterestDisplayText = "";
        }
        TickerTextState tickerTextState = new TickerTextState(openInterestDisplayText, openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation.m14394getAnimatedTextColor0d7_KjU(), TickerTextState.Style.REGULAR_SMALL, null, false, 24, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component3) | composer.changedInstance(this.$state$inlined);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new C16140x79142b06(constraintLayoutBaseScope4Component3, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        WrappedTickerKt.TickerText(tickerTextState, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue5), composer, TickerTextState.$stable, 0);
        Boolean boolIsOpenInterestDeltaPositive = this.$state$inlined.isOpenInterestDeltaPositive();
        Boolean bool = Boolean.TRUE;
        BentoIcon4.Size12 size122 = new BentoIcon4.Size12(Intrinsics.areEqual(boolIsOpenInterestDeltaPositive, bool) ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
        if (Intrinsics.areEqual(this.$state$inlined.isOpenInterestDeltaPositive(), bool)) {
            composer.startReplaceGroup(-1466537868);
            jM21452getNegative0d7_KjU = bentoTheme.getColors(composer, i3).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1466474380);
            jM21452getNegative0d7_KjU = bentoTheme.getColors(composer, i3).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged5 = composer.changed(constraintLayoutBaseScope4Component4);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = new C16141x79142ec7(constraintLayoutBaseScope4Component4);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(size122, "open interest delta", jM21452getNegative0d7_KjU, Alpha.alpha(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue6), openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation.getIconAlpha()), null, false, composer, i4 | 48, 48);
        ContractSelectorButtonViewState rightButtonState = this.$state$inlined.getRightButtonState();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = C16142x79143288.INSTANCE;
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        ContractSelectorButton.m14138ContractSelectorButtonJEEbyFU(rightButtonState, C2002Dp.m7993boximpl(ContractSelectorCenterAlignedVariantKt.ButtonWidth), C2002Dp.m7993boximpl(ContractSelectorCenterAlignedVariantKt.ButtonHeight), constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue7), this.$onTradeClicked$inlined, composer, i2 | 432, 0);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = new Function0<Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue8, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
