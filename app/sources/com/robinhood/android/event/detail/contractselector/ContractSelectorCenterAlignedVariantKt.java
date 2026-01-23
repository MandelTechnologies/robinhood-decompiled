package com.robinhood.android.event.detail.contractselector;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ChainConstrainScope2;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope5;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
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
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ContractSelectorCenterAlignedVariant.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "state", "j$/time/Instant", "now", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "", "", "onTradeClicked", "ContractSelectorCenterAlignedVariant", "(Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;Lj$/time/Instant;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ContractSelectorRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "SixDpPadding", "F", "ButtonWidth", "ButtonHeight", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContractSelectorCenterAlignedVariantKt {
    private static final float SixDpPadding = C2002Dp.m7995constructorimpl(6);
    private static final float ButtonWidth = C2002Dp.m7995constructorimpl(72);
    private static final float ButtonHeight = C2002Dp.m7995constructorimpl(36);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorCenterAlignedVariant$lambda$8(ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState, Instant instant, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        ContractSelectorCenterAlignedVariant(contractSelectorRowTreatmentViewState, instant, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorRowPreview$lambda$9(int i, Composer composer, int i2) {
        ContractSelectorRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContractSelectorCenterAlignedVariant(final ContractSelectorRowTreatmentViewState state, final Instant now, Modifier modifier, final Function2<? super ContractSelectorButtonViewState, ? super Integer, Unit> onTradeClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i4;
        boolean zChanged;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(onTradeClicked, "onTradeClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1858892643);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(now) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTradeClicked) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1858892643, i3, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariant (ContractSelectorCenterAlignedVariant.kt:42)");
                }
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                measurer2 = (Measurer2) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$3
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
                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final Function0 function0 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composer2 = composerStartRestartGroup;
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5144paddingVpY3zN4$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        long jM21452getNegative0d7_KjU;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState2.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer3.startReplaceGroup(-1469436553);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                        ConstraintLayoutBaseScope5 constraintLayoutBaseScope5CreateHorizontalChain = constraintLayoutScope2.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3}, ConstraintLayoutBaseScope3.INSTANCE.getPacked());
                        ConstraintLayoutBaseScope.createVerticalChain$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, null, 2, null);
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component1) | composer3.changed(constraintLayoutBaseScope4Component6);
                        Object objRememberedValue9 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new C16136x79141c02(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component6);
                            composer3.updateRememberedValue(objRememberedValue9);
                        }
                        composer3.endReplaceGroup();
                        constraintLayoutScope2.constrain(constraintLayoutBaseScope5CreateHorizontalChain, (Function1<? super ChainConstrainScope2, Unit>) objRememberedValue9);
                        OpenInterestDeltaAnimationState openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation = DeltaAnimations.buildOpenInterestDeltaAnimation(state.getOpenInterestDelta(), state.isOpenInterestDeltaPositive(), now, composer3, 0);
                        ContractSelectorButtonViewState leftButtonState = state.getLeftButtonState();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue10 = composer3.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue10 == companion3.getEmpty()) {
                            objRememberedValue10 = C16137x79141fc3.INSTANCE;
                            composer3.updateRememberedValue(objRememberedValue10);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                        float f = ContractSelectorCenterAlignedVariantKt.ButtonWidth;
                        float f2 = ContractSelectorCenterAlignedVariantKt.ButtonHeight;
                        C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(f);
                        C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(f2);
                        Function2 function2 = onTradeClicked;
                        int i7 = StringResource.$stable;
                        ContractSelectorButton.m14138ContractSelectorButtonJEEbyFU(leftButtonState, c2002DpM7993boximpl, c2002DpM7993boximpl2, modifierConstrainAs, function2, composer3, i7 | 432, 0);
                        String contractName = state.getContractName();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme.getTypography(composer3, i8).getTextM();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                        composer3.startReplaceGroup(-1746271574);
                        boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component4) | composer3.changed(constraintLayoutBaseScope4Component1) | composer3.changed(constraintLayoutBaseScope4Component6);
                        Object objRememberedValue11 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                            objRememberedValue11 = new C16138x79142384(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component6);
                            composer3.updateRememberedValue(objRememberedValue11);
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(contractName, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM, composer3, 817889280, 0, 7484);
                        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                        DayNightColor contractColor = state.getContractColor();
                        composer3.startReplaceGroup(-878632967);
                        Color colorM6701boximpl = contractColor == null ? null : Color.m6701boximpl(contractColor.getColor(composer3, 0));
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-878633593);
                        long jM21426getFg20d7_KjU = colorM6701boximpl == null ? bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU() : colorM6701boximpl.getValue();
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component3) | composer3.changedInstance(state);
                        Object objRememberedValue12 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue12 == companion3.getEmpty()) {
                            objRememberedValue12 = new C16139x79142745(constraintLayoutBaseScope4Component3, state);
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue12), 0.0f, 0.0f, ContractSelectorCenterAlignedVariantKt.SixDpPadding, 0.0f, 11, null);
                        int i9 = BentoIcon4.Size12.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer3, i9 | 48, 48);
                        String openInterestDisplayText = state.getOpenInterestDisplayText();
                        if (openInterestDisplayText == null) {
                            openInterestDisplayText = "";
                        }
                        TickerTextState tickerTextState = new TickerTextState(openInterestDisplayText, openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation.m14394getAnimatedTextColor0d7_KjU(), TickerTextState.Style.REGULAR_SMALL, null, false, 24, null);
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component3) | composer3.changedInstance(state);
                        Object objRememberedValue13 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue13 == companion3.getEmpty()) {
                            objRememberedValue13 = new C16140x79142b06(constraintLayoutBaseScope4Component3, state);
                            composer3.updateRememberedValue(objRememberedValue13);
                        }
                        composer3.endReplaceGroup();
                        WrappedTickerKt.TickerText(tickerTextState, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue13), composer3, TickerTextState.$stable, 0);
                        Boolean boolIsOpenInterestDeltaPositive = state.isOpenInterestDeltaPositive();
                        Boolean bool = Boolean.TRUE;
                        BentoIcon4.Size12 size122 = new BentoIcon4.Size12(Intrinsics.areEqual(boolIsOpenInterestDeltaPositive, bool) ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
                        if (Intrinsics.areEqual(state.isOpenInterestDeltaPositive(), bool)) {
                            composer3.startReplaceGroup(-1466537868);
                            jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21456getPositive0d7_KjU();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1466474380);
                            jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21452getNegative0d7_KjU();
                            composer3.endReplaceGroup();
                        }
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged6 = composer3.changed(constraintLayoutBaseScope4Component4);
                        Object objRememberedValue14 = composer3.rememberedValue();
                        if (zChanged6 || objRememberedValue14 == companion3.getEmpty()) {
                            objRememberedValue14 = new C16141x79142ec7(constraintLayoutBaseScope4Component4);
                            composer3.updateRememberedValue(objRememberedValue14);
                        }
                        composer3.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size122, "open interest delta", jM21452getNegative0d7_KjU, Alpha.alpha(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue14), openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation.getIconAlpha()), null, false, composer3, i9 | 48, 48);
                        ContractSelectorButtonViewState rightButtonState = state.getRightButtonState();
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue15 = composer3.rememberedValue();
                        if (objRememberedValue15 == companion3.getEmpty()) {
                            objRememberedValue15 = C16142x79143288.INSTANCE;
                            composer3.updateRememberedValue(objRememberedValue15);
                        }
                        composer3.endReplaceGroup();
                        ContractSelectorButton.m14138ContractSelectorButtonJEEbyFU(rightButtonState, C2002Dp.m7993boximpl(ContractSelectorCenterAlignedVariantKt.ButtonWidth), C2002Dp.m7993boximpl(ContractSelectorCenterAlignedVariantKt.ButtonHeight), constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue15), onTradeClicked, composer3, i7 | 432, 0);
                        composer3.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            EffectsKt.SideEffect(function0, composer3, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant$lambda$8(state, now, modifier3, onTradeClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            measurer2 = (Measurer2) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
            i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i6) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                        final Map linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                snapshotState3 = snapshotState;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                final Function0 function02 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    composer2 = composerStartRestartGroup;
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5144paddingVpY3zN4$default2, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$ContractSelectorCenterAlignedVariant$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            long jM21452getNegative0d7_KjU;
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            composer3.startReplaceGroup(-1469436553);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                            ConstraintLayoutBaseScope5 constraintLayoutBaseScope5CreateHorizontalChain = constraintLayoutScope22.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3}, ConstraintLayoutBaseScope3.INSTANCE.getPacked());
                            ConstraintLayoutBaseScope.createVerticalChain$default(constraintLayoutScope22, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, null, 2, null);
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component1) | composer3.changed(constraintLayoutBaseScope4Component6);
                            Object objRememberedValue9 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new C16136x79141c02(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component6);
                                composer3.updateRememberedValue(objRememberedValue9);
                            }
                            composer3.endReplaceGroup();
                            constraintLayoutScope22.constrain(constraintLayoutBaseScope5CreateHorizontalChain, (Function1<? super ChainConstrainScope2, Unit>) objRememberedValue9);
                            OpenInterestDeltaAnimationState openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation = DeltaAnimations.buildOpenInterestDeltaAnimation(state.getOpenInterestDelta(), state.isOpenInterestDeltaPositive(), now, composer3, 0);
                            ContractSelectorButtonViewState leftButtonState = state.getLeftButtonState();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue10 = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue10 == companion3.getEmpty()) {
                                objRememberedValue10 = C16137x79141fc3.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue10);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10);
                            float f = ContractSelectorCenterAlignedVariantKt.ButtonWidth;
                            float f2 = ContractSelectorCenterAlignedVariantKt.ButtonHeight;
                            C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(f);
                            C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(f2);
                            Function2 function2 = onTradeClicked;
                            int i7 = StringResource.$stable;
                            ContractSelectorButton.m14138ContractSelectorButtonJEEbyFU(leftButtonState, c2002DpM7993boximpl, c2002DpM7993boximpl2, modifierConstrainAs, function2, composer3, i7 | 432, 0);
                            String contractName = state.getContractName();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            TextStyle textM = bentoTheme.getTypography(composer3, i8).getTextM();
                            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            composer3.startReplaceGroup(-1746271574);
                            boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component4) | composer3.changed(constraintLayoutBaseScope4Component1) | composer3.changed(constraintLayoutBaseScope4Component6);
                            Object objRememberedValue11 = composer3.rememberedValue();
                            if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                                objRememberedValue11 = new C16138x79142384(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component6);
                                composer3.updateRememberedValue(objRememberedValue11);
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(contractName, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM, composer3, 817889280, 0, 7484);
                            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                            DayNightColor contractColor = state.getContractColor();
                            composer3.startReplaceGroup(-878632967);
                            Color colorM6701boximpl = contractColor == null ? null : Color.m6701boximpl(contractColor.getColor(composer3, 0));
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-878633593);
                            long jM21426getFg20d7_KjU = colorM6701boximpl == null ? bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU() : colorM6701boximpl.getValue();
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component3) | composer3.changedInstance(state);
                            Object objRememberedValue12 = composer3.rememberedValue();
                            if (zChanged4 || objRememberedValue12 == companion3.getEmpty()) {
                                objRememberedValue12 = new C16139x79142745(constraintLayoutBaseScope4Component3, state);
                                composer3.updateRememberedValue(objRememberedValue12);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue12), 0.0f, 0.0f, ContractSelectorCenterAlignedVariantKt.SixDpPadding, 0.0f, 11, null);
                            int i9 = BentoIcon4.Size12.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer3, i9 | 48, 48);
                            String openInterestDisplayText = state.getOpenInterestDisplayText();
                            if (openInterestDisplayText == null) {
                                openInterestDisplayText = "";
                            }
                            TickerTextState tickerTextState = new TickerTextState(openInterestDisplayText, openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation.m14394getAnimatedTextColor0d7_KjU(), TickerTextState.Style.REGULAR_SMALL, null, false, 24, null);
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component3) | composer3.changedInstance(state);
                            Object objRememberedValue13 = composer3.rememberedValue();
                            if (zChanged5 || objRememberedValue13 == companion3.getEmpty()) {
                                objRememberedValue13 = new C16140x79142b06(constraintLayoutBaseScope4Component3, state);
                                composer3.updateRememberedValue(objRememberedValue13);
                            }
                            composer3.endReplaceGroup();
                            WrappedTickerKt.TickerText(tickerTextState, constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue13), composer3, TickerTextState.$stable, 0);
                            Boolean boolIsOpenInterestDeltaPositive = state.isOpenInterestDeltaPositive();
                            Boolean bool = Boolean.TRUE;
                            BentoIcon4.Size12 size122 = new BentoIcon4.Size12(Intrinsics.areEqual(boolIsOpenInterestDeltaPositive, bool) ? ServerToBentoAssetMapper2.STOCK_UP_12 : ServerToBentoAssetMapper2.STOCK_DOWN_12);
                            if (Intrinsics.areEqual(state.isOpenInterestDeltaPositive(), bool)) {
                                composer3.startReplaceGroup(-1466537868);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21456getPositive0d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-1466474380);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21452getNegative0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged6 = composer3.changed(constraintLayoutBaseScope4Component4);
                            Object objRememberedValue14 = composer3.rememberedValue();
                            if (zChanged6 || objRememberedValue14 == companion3.getEmpty()) {
                                objRememberedValue14 = new C16141x79142ec7(constraintLayoutBaseScope4Component4);
                                composer3.updateRememberedValue(objRememberedValue14);
                            }
                            composer3.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size122, "open interest delta", jM21452getNegative0d7_KjU, Alpha.alpha(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue14), openInterestDeltaAnimationStateBuildOpenInterestDeltaAnimation.getIconAlpha()), null, false, composer3, i9 | 48, 48);
                            ContractSelectorButtonViewState rightButtonState = state.getRightButtonState();
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue15 = composer3.rememberedValue();
                            if (objRememberedValue15 == companion3.getEmpty()) {
                                objRememberedValue15 = C16142x79143288.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue15);
                            }
                            composer3.endReplaceGroup();
                            ContractSelectorButton.m14138ContractSelectorButtonJEEbyFU(rightButtonState, C2002Dp.m7993boximpl(ContractSelectorCenterAlignedVariantKt.ButtonWidth), C2002Dp.m7993boximpl(ContractSelectorCenterAlignedVariantKt.ButtonHeight), constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue15), onTradeClicked, composer3, i7 | 432, 0);
                            composer3.endReplaceGroup();
                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function02, composer3, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), measurePolicy2, composer2, 48, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ContractSelectorRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-598049082);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-598049082, i, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorRowPreview (ContractSelectorCenterAlignedVariant.kt:166)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$ContractSelectorCenterAlignedVariantKt.INSTANCE.m14131getLambda$1739203970$feature_event_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorCenterAlignedVariantKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractSelectorCenterAlignedVariantKt.ContractSelectorRowPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
