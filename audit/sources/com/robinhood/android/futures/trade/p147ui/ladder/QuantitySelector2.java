package com.robinhood.android.futures.trade.p147ui.ladder;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.RippleKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LongPressFastTrackGestureDetector;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
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

/* compiled from: QuantitySelector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"QuantitySelector", "", "buyingPowerDisplayText", "Lcom/robinhood/utils/resource/StringResource;", "quantity", "Ljava/math/BigDecimal;", "onQuantityUpdated", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/utils/resource/StringResource;Ljava/math/BigDecimal;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-trade_externalDebug", "rememberedQuantity"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuantitySelector2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantitySelector$lambda$14(StringResource stringResource, BigDecimal bigDecimal, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuantitySelector(stringResource, bigDecimal, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuantitySelector(final StringResource stringResource, final BigDecimal quantity, final Function1<? super BigDecimal, Unit> onQuantityUpdated, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Measurer2 measurer2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue7;
        final SnapshotState snapshotState3;
        boolean zChangedInstance;
        Object objRememberedValue8;
        final SnapshotState snapshotState4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState5;
        Object objRememberedValue9;
        boolean zChangedInstance2;
        Object objRememberedValue10;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(onQuantityUpdated, "onQuantityUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(204022870);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(quantity) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuantityUpdated) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(204022870, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.QuantitySelector (QuantitySelector.kt:34)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(quantity, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (!Intrinsics.areEqual(quantity, QuantitySelector$lambda$1(snapshotState))) {
                    snapshotState.setValue(quantity);
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue2, 6, null);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                measurer2 = (Measurer2) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState2 = (SnapshotState) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                snapshotState3 = (SnapshotState) objRememberedValue7;
                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                    final int i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$2
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
                            snapshotState3.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                            snapshotState2.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$2.1
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
                    snapshotState4 = snapshotState3;
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState5 = snapshotState2;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    snapshotState4 = snapshotState3;
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState5 = snapshotState2;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue8;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$3
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
                            snapshotState5.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                final Function0 function0 = (Function0) objRememberedValue9;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$4
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default, false, (Function1) objRememberedValue10, 1, null);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) throws Resources.NotFoundException {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState4.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer3.startReplaceGroup(646654151);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope3.Companion companion2 = ConstraintLayoutBaseScope3.INSTANCE;
                        constraintLayoutScope2.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component2}, companion2.getPacked());
                        constraintLayoutScope2.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component2}, companion2.getPacked());
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue11 = composer3.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue11 == companion3.getEmpty()) {
                            objRememberedValue11 = InteractionSource2.MutableInteractionSource();
                            composer3.updateRememberedValue(objRememberedValue11);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue11;
                        composer3.endReplaceGroup();
                        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.MINUS_12);
                        String strStringResource = StringResources_androidKt.stringResource(C17286R.string.futures_quantity_minus_btn, composer3, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), 0.0f, 11, null);
                        IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0L, 4, null);
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged = composer3.changed(onQuantityUpdated);
                        Object objRememberedValue12 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue12 == companion3.getEmpty()) {
                            objRememberedValue12 = new QuantitySelector3(onQuantityUpdated, snapshotState);
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierLongPressWithFastTrack$default = LongPressFastTrackGestureDetector.longPressWithFastTrack$default(modifierM5146paddingqDBjuR0$default, interactionSource3, indicationNodeFactoryM5624rippleH2RKhps$default, 0L, (Function0) objRememberedValue12, 4, (Object) null);
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue13 = composer3.rememberedValue();
                        if (objRememberedValue13 == companion3.getEmpty()) {
                            objRememberedValue13 = QuantitySelector4.INSTANCE;
                            composer3.updateRememberedValue(objRememberedValue13);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierLongPressWithFastTrack$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue13);
                        int i8 = BentoIcon4.Size16.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21425getFg0d7_KjU, modifierConstrainAs, null, false, composer3, i8, 48);
                        int iIntValue = quantity.intValue();
                        String strPluralStringResource = StringResources_androidKt.pluralStringResource(C17286R.plurals.futures_quantity_display, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, composer3, 0);
                        TextStyle textM = bentoTheme.getTypography(composer3, i7).getTextM();
                        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component4);
                        Object objRememberedValue14 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue14 == companion3.getEmpty()) {
                            objRememberedValue14 = new QuantitySelector5(constraintLayoutBaseScope4Component4);
                            composer3.updateRememberedValue(objRememberedValue14);
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(strPluralStringResource, constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue14), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8184);
                        composer3.startReplaceGroup(852193686);
                        StringResource stringResource2 = stringResource;
                        String text = stringResource2 == null ? null : StringResources4.getText(stringResource2, composer3, StringResource.$stable);
                        composer3.endReplaceGroup();
                        if (text == null) {
                            text = "";
                        }
                        TextStyle textM2 = bentoTheme.getTypography(composer3, i7).getTextM();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU();
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component3);
                        Object objRememberedValue15 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue15 == companion3.getEmpty()) {
                            objRememberedValue15 = new QuantitySelector6(constraintLayoutBaseScope4Component3);
                            composer3.updateRememberedValue(objRememberedValue15);
                        }
                        composer3.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue15), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer3, 0, 0, 8184);
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue16 = composer3.rememberedValue();
                        if (objRememberedValue16 == companion3.getEmpty()) {
                            objRememberedValue16 = InteractionSource2.MutableInteractionSource();
                            composer3.updateRememberedValue(objRememberedValue16);
                        }
                        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue16;
                        composer3.endReplaceGroup();
                        BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.PLUS_12);
                        String strStringResource2 = StringResources_androidKt.stringResource(C17286R.string.futures_quantity_plus_btn, composer3, 0);
                        long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default2 = RippleKt.m5624rippleH2RKhps$default(false, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0L, 4, null);
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged4 = composer3.changed(onQuantityUpdated);
                        Object objRememberedValue17 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue17 == companion3.getEmpty()) {
                            objRememberedValue17 = new QuantitySelector7(onQuantityUpdated, snapshotState);
                            composer3.updateRememberedValue(objRememberedValue17);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierLongPressWithFastTrack$default2 = LongPressFastTrackGestureDetector.longPressWithFastTrack$default(modifierM5146paddingqDBjuR0$default2, interactionSource32, indicationNodeFactoryM5624rippleH2RKhps$default2, 0L, (Function0) objRememberedValue17, 4, (Object) null);
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue18 = composer3.rememberedValue();
                        if (objRememberedValue18 == companion3.getEmpty()) {
                            objRememberedValue18 = QuantitySelector8.INSTANCE;
                            composer3.updateRememberedValue(objRememberedValue18);
                        }
                        composer3.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size162, strStringResource2, jM21425getFg0d7_KjU3, constraintLayoutScope2.constrainAs(modifierLongPressWithFastTrack$default2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18), null, false, composer3, i8, 48);
                        composer3.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            EffectsKt.SideEffect(function0, composer3, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                composer2 = composerStartRestartGroup;
                LayoutKt.MultiMeasureLayout(modifierSemantics$default, composableLambdaRememberComposableLambda, measurePolicy, composer2, 48, 0);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuantitySelector2.QuantitySelector$lambda$14(stringResource, quantity, onQuantityUpdated, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (!Intrinsics.areEqual(quantity, QuantitySelector$lambda$1(snapshotState))) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default2, false, null, null, (Function0) objRememberedValue2, 6, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            measurer2 = (Measurer2) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue5;
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
            }
            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue6;
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
            }
            snapshotState3 = (SnapshotState) objRememberedValue7;
            zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                final int i52 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                objRememberedValue8 = new MeasurePolicy() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$2
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
                        snapshotState3.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i52);
                        snapshotState2.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$2.1
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
                snapshotState4 = snapshotState3;
                constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                snapshotState5 = snapshotState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue8;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                }
                final Function0 function02 = (Function0) objRememberedValue9;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue10 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$4
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default2, false, (Function1) objRememberedValue10, 1, null);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) throws Resources.NotFoundException {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState4.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            composer3.startReplaceGroup(646654151);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope3.Companion companion2 = ConstraintLayoutBaseScope3.INSTANCE;
                            constraintLayoutScope22.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component2}, companion2.getPacked());
                            constraintLayoutScope22.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component2}, companion2.getPacked());
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue11 = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue11 == companion3.getEmpty()) {
                                objRememberedValue11 = InteractionSource2.MutableInteractionSource();
                                composer3.updateRememberedValue(objRememberedValue11);
                            }
                            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue11;
                            composer3.endReplaceGroup();
                            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.MINUS_12);
                            String strStringResource = StringResources_androidKt.stringResource(C17286R.string.futures_quantity_minus_btn, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), 0.0f, 11, null);
                            IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0L, 4, null);
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged = composer3.changed(onQuantityUpdated);
                            Object objRememberedValue12 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue12 == companion3.getEmpty()) {
                                objRememberedValue12 = new QuantitySelector3(onQuantityUpdated, snapshotState);
                                composer3.updateRememberedValue(objRememberedValue12);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierLongPressWithFastTrack$default = LongPressFastTrackGestureDetector.longPressWithFastTrack$default(modifierM5146paddingqDBjuR0$default, interactionSource3, indicationNodeFactoryM5624rippleH2RKhps$default, 0L, (Function0) objRememberedValue12, 4, (Object) null);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue13 = composer3.rememberedValue();
                            if (objRememberedValue13 == companion3.getEmpty()) {
                                objRememberedValue13 = QuantitySelector4.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue13);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(modifierLongPressWithFastTrack$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue13);
                            int i8 = BentoIcon4.Size16.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21425getFg0d7_KjU, modifierConstrainAs, null, false, composer3, i8, 48);
                            int iIntValue = quantity.intValue();
                            String strPluralStringResource = StringResources_androidKt.pluralStringResource(C17286R.plurals.futures_quantity_display, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, composer3, 0);
                            TextStyle textM = bentoTheme.getTypography(composer3, i7).getTextM();
                            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged2 = composer3.changed(constraintLayoutBaseScope4Component4);
                            Object objRememberedValue14 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue14 == companion3.getEmpty()) {
                                objRememberedValue14 = new QuantitySelector5(constraintLayoutBaseScope4Component4);
                                composer3.updateRememberedValue(objRememberedValue14);
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(strPluralStringResource, constraintLayoutScope22.constrainAs(companion4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue14), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8184);
                            composer3.startReplaceGroup(852193686);
                            StringResource stringResource2 = stringResource;
                            String text = stringResource2 == null ? null : StringResources4.getText(stringResource2, composer3, StringResource.$stable);
                            composer3.endReplaceGroup();
                            if (text == null) {
                                text = "";
                            }
                            TextStyle textM2 = bentoTheme.getTypography(composer3, i7).getTextM();
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU();
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component3);
                            Object objRememberedValue15 = composer3.rememberedValue();
                            if (zChanged3 || objRememberedValue15 == companion3.getEmpty()) {
                                objRememberedValue15 = new QuantitySelector6(constraintLayoutBaseScope4Component3);
                                composer3.updateRememberedValue(objRememberedValue15);
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope22.constrainAs(companion4, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue15), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer3, 0, 0, 8184);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue16 = composer3.rememberedValue();
                            if (objRememberedValue16 == companion3.getEmpty()) {
                                objRememberedValue16 = InteractionSource2.MutableInteractionSource();
                                composer3.updateRememberedValue(objRememberedValue16);
                            }
                            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue16;
                            composer3.endReplaceGroup();
                            BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.PLUS_12);
                            String strStringResource2 = StringResources_androidKt.stringResource(C17286R.string.futures_quantity_plus_btn, composer3, 0);
                            long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU();
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default2 = RippleKt.m5624rippleH2RKhps$default(false, bentoTheme.getSpacing(composer3, i7).m21592getMediumD9Ej5fM(), 0L, 4, null);
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged4 = composer3.changed(onQuantityUpdated);
                            Object objRememberedValue17 = composer3.rememberedValue();
                            if (zChanged4 || objRememberedValue17 == companion3.getEmpty()) {
                                objRememberedValue17 = new QuantitySelector7(onQuantityUpdated, snapshotState);
                                composer3.updateRememberedValue(objRememberedValue17);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierLongPressWithFastTrack$default2 = LongPressFastTrackGestureDetector.longPressWithFastTrack$default(modifierM5146paddingqDBjuR0$default2, interactionSource32, indicationNodeFactoryM5624rippleH2RKhps$default2, 0L, (Function0) objRememberedValue17, 4, (Object) null);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue18 = composer3.rememberedValue();
                            if (objRememberedValue18 == companion3.getEmpty()) {
                                objRememberedValue18 = QuantitySelector8.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue18);
                            }
                            composer3.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size162, strStringResource2, jM21425getFg0d7_KjU3, constraintLayoutScope22.constrainAs(modifierLongPressWithFastTrack$default2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18), null, false, composer3, i8, 48);
                            composer3.endReplaceGroup();
                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function02, composer3, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    composer2 = composerStartRestartGroup;
                    LayoutKt.MultiMeasureLayout(modifierSemantics$default2, composableLambdaRememberComposableLambda2, measurePolicy2, composer2, 48, 0);
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal QuantitySelector$lambda$1(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }
}
