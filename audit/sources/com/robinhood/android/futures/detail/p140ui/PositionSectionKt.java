package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: PositionSection.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"PositionSection", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData;", "modifier", "Landroidx/compose/ui/Modifier;", "onFlattenClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PositionSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionSection$lambda$6(FuturesDetailViewState.PositionData positionData, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        PositionSection(positionData, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionSection(final FuturesDetailViewState.PositionData data, Modifier modifier, final Function0<Unit> onFlattenClick, Composer composer, final int i, final int i2) {
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
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onFlattenClick, "onFlattenClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1118633641);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(data) : composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onFlattenClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1118633641, i3, -1, "com.robinhood.android.futures.detail.ui.PositionSection (PositionSection.kt:31)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$2
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
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$2.1
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
                    composerStartRestartGroup.updateRememberedValue(measurePolicy);
                    objRememberedValue6 = measurePolicy;
                } else {
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$3
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
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$4
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
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState2.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer2.startReplaceGroup(535925772);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                        String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_positions_header, composer2, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i7).getDisplayCapsuleMedium();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 2, null);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new PositionSectionKt$PositionSection$1$1$1(constraintLayoutBaseScope4Component2);
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8188);
                        AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_positions_label, composer2, 0), null, 2, null);
                        StringResource position = data.getPosition();
                        int i8 = StringResource.$stable;
                        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(StringResources2.getText(position, composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                        float f = 0;
                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component1) | composer2.changed(constraintLayoutBaseScope4Component4);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new PositionSectionKt$PositionSection$1$2$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component4);
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                        int i9 = BentoDataRowState.$stable;
                        BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierConstrainAs, null, composer2, i9, 4);
                        BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_pending_orders_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(data.getPendingOrders(), composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                        Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged4 = composer2.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new PositionSectionKt$PositionSection$1$3$1(constraintLayoutBaseScope4Component2);
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        composer2.endReplaceGroup();
                        BentoDataRowKt.BentoDataRow(bentoDataRowState2, constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), null, composer2, i9, 4);
                        BentoDataRowState bentoDataRowState3 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_open_pnl_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(data.getOpenPnl(), composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                        Modifier modifierM5174width3ABfNKs3 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component5) | composer2.changed(constraintLayoutBaseScope4Component2) | composer2.changed(constraintLayoutBaseScope4Component6);
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new PositionSectionKt$PositionSection$1$4$1(constraintLayoutBaseScope4Component5, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component6);
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        composer2.endReplaceGroup();
                        BentoDataRowKt.BentoDataRow(bentoDataRowState3, constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), null, composer2, i9, 4);
                        BentoDataRowState bentoDataRowState4 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_day_pnl_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(data.getDayPnl(), composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                        Modifier modifierM5174width3ABfNKs4 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged6 = composer2.changed(constraintLayoutBaseScope4Component4);
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new PositionSectionKt$PositionSection$1$5$1(constraintLayoutBaseScope4Component4);
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        composer2.endReplaceGroup();
                        BentoDataRowKt.BentoDataRow(bentoDataRowState4, constraintLayoutScope2.constrainAs(modifierM5174width3ABfNKs4, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue13), null, composer2, i9, 4);
                        composer2.startReplaceGroup(-1090989266);
                        if (data.getFlattenButtonData() != null) {
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1543040186, true, new PositionSectionKt$PositionSection$1$6(data, constraintLayoutScope2, constraintLayoutBaseScope4Component6, onFlattenClick), composer2, 54), composer2, 6);
                        }
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            EffectsKt.SideEffect(function0, composer2, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PositionSectionKt.PositionSection$lambda$6(data, modifier3, onFlattenClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                MeasurePolicy measurePolicy3 = new MeasurePolicy() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$2
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
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$2.1
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
                composerStartRestartGroup.updateRememberedValue(measurePolicy3);
                objRememberedValue6 = measurePolicy3;
                MeasurePolicy measurePolicy22 = (MeasurePolicy) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                }
                final Function0 function02 = (Function0) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$4
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
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default2, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.PositionSectionKt$PositionSection$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            composer2.startReplaceGroup(535925772);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                            String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_positions_header, composer2, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i7).getDisplayCapsuleMedium();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 2, null);
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                            Object objRememberedValue9 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new PositionSectionKt$PositionSection$1$1$1(constraintLayoutBaseScope4Component2);
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope22.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8188);
                            AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_positions_label, composer2, 0), null, 2, null);
                            StringResource position = data.getPosition();
                            int i8 = StringResource.$stable;
                            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(StringResources2.getText(position, composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                            float f = 0;
                            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component1) | composer2.changed(constraintLayoutBaseScope4Component4);
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new PositionSectionKt$PositionSection$1$2$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component4);
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                            int i9 = BentoDataRowState.$stable;
                            BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierConstrainAs, null, composer2, i9, 4);
                            BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_pending_orders_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(data.getPendingOrders(), composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                            Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged4 = composer2.changed(constraintLayoutBaseScope4Component2);
                            Object objRememberedValue11 = composer2.rememberedValue();
                            if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue11 = new PositionSectionKt$PositionSection$1$3$1(constraintLayoutBaseScope4Component2);
                                composer2.updateRememberedValue(objRememberedValue11);
                            }
                            composer2.endReplaceGroup();
                            BentoDataRowKt.BentoDataRow(bentoDataRowState2, constraintLayoutScope22.constrainAs(modifierM5174width3ABfNKs2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), null, composer2, i9, 4);
                            BentoDataRowState bentoDataRowState3 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_open_pnl_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(data.getOpenPnl(), composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                            Modifier modifierM5174width3ABfNKs3 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChanged5 = composer2.changed(constraintLayoutBaseScope4Component5) | composer2.changed(constraintLayoutBaseScope4Component2) | composer2.changed(constraintLayoutBaseScope4Component6);
                            Object objRememberedValue12 = composer2.rememberedValue();
                            if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new PositionSectionKt$PositionSection$1$4$1(constraintLayoutBaseScope4Component5, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component6);
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            composer2.endReplaceGroup();
                            BentoDataRowKt.BentoDataRow(bentoDataRowState3, constraintLayoutScope22.constrainAs(modifierM5174width3ABfNKs3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), null, composer2, i9, 4);
                            BentoDataRowState bentoDataRowState4 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_day_pnl_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(data.getDayPnl(), composer2, i8), null, 2, null), null, bentoTheme.getTypography(composer2, i7).getTextL(), null, null, false, false, 3933, null);
                            Modifier modifierM5174width3ABfNKs4 = SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f));
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged6 = composer2.changed(constraintLayoutBaseScope4Component4);
                            Object objRememberedValue13 = composer2.rememberedValue();
                            if (zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new PositionSectionKt$PositionSection$1$5$1(constraintLayoutBaseScope4Component4);
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceGroup();
                            BentoDataRowKt.BentoDataRow(bentoDataRowState4, constraintLayoutScope22.constrainAs(modifierM5174width3ABfNKs4, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue13), null, composer2, i9, 4);
                            composer2.startReplaceGroup(-1090989266);
                            if (data.getFlattenButtonData() != null) {
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1543040186, true, new PositionSectionKt$PositionSection$1$6(data, constraintLayoutScope22, constraintLayoutBaseScope4Component6, onFlattenClick), composer2, 54), composer2, 6);
                            }
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function02, composer2, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), measurePolicy22, composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
