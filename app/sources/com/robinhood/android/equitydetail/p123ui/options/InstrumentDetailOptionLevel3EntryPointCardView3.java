package com.robinhood.android.equitydetail.p123ui.options;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
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

/* compiled from: InstrumentDetailOptionLevel3EntryPointCardView.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"InstrumentDetailOptionLevel3EntryPointCardComposable", "", "onCardCtaClicked", "Lkotlin/Function0;", "onCardDismissed", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InstrumentDetailOptionLevel3EntryPointCardView3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentDetailOptionLevel3EntryPointCardComposable$lambda$5(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InstrumentDetailOptionLevel3EntryPointCardComposable(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentDetailOptionLevel3EntryPointCardComposable(final Function0<Unit> onCardCtaClicked, final Function0<Unit> onCardDismissed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean isDay;
        long jM6705copywmQWz5c$default;
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
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCardCtaClicked, "onCardCtaClicked");
        Intrinsics.checkNotNullParameter(onCardDismissed, "onCardDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-795234749);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCardCtaClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardDismissed) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-795234749, i3, -1, "com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardComposable (InstrumentDetailOptionLevel3EntryPointCardView.kt:151)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                isDay = bentoTheme.getColors(composerStartRestartGroup, i6).getIsDay();
                int i7 = !isDay ? C15314R.drawable.option_level3_entry_point_card_day : C15314R.drawable.option_level3_entry_point_card_night;
                if (isDay) {
                    composerStartRestartGroup.startReplaceGroup(201697030);
                    jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i6).getNova(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(201635495);
                    jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i6).getJet(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    composerStartRestartGroup.endReplaceGroup();
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
                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
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
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$2.1
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
                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$3
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
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$4
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
                final long j = jM6705copywmQWz5c$default;
                final int i8 = i7;
                composer2 = composerStartRestartGroup;
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState2.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer3.startReplaceGroup(394523829);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
                        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope2.createGuidelineFromEnd(0.33f);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged2 = composer3.changed(verticalAnchorM8138createStartBarrier3ABfNKs$default) | composer3.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue9 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new InstrumentDetailOptionLevel3EntryPointCardView4(verticalAnchorM8138createStartBarrier3ABfNKs$default, constraintLayoutBaseScope4Component2);
                            composer3.updateRememberedValue(objRememberedValue9);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3_incentive_summary, composer3, 0), PaddingKt.m5142padding3ABfNKs(modifierConstrainAs, bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 4, 0, null, 0, bentoTheme2.getTypography(composer3, i10).getTextM(), composer3, 817889280, 0, 7548);
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue10 = composer3.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue10 == companion3.getEmpty()) {
                            objRememberedValue10 = InstrumentDetailOptionLevel3EntryPointCardView5.INSTANCE;
                            composer3.updateRememberedValue(objRememberedValue10);
                        }
                        composer3.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig(onCardCtaClicked, StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3, composer3, 0), PaddingKt.m5142padding3ABfNKs(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), null, false, null, composer3, BentoTextButton3.Icon.Size12.$stable << 9, 112);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, C2002Dp.m7995constructorimpl(0), 0.0f, bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged3 = composer3.changed(verticalAnchorCreateGuidelineFromEnd);
                        Object objRememberedValue11 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                            objRememberedValue11 = new InstrumentDetailOptionLevel3EntryPointCardView6(verticalAnchorCreateGuidelineFromEnd);
                            composer3.updateRememberedValue(objRememberedValue11);
                        }
                        composer3.endReplaceGroup();
                        ImageKt.Image(PainterResources_androidKt.painterResource(i8, composer3, 0), (String) null, constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM());
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue12 = composer3.rememberedValue();
                        if (objRememberedValue12 == companion3.getEmpty()) {
                            objRememberedValue12 = InstrumentDetailOptionLevel3EntryPointCardView7.INSTANCE;
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        composer3.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24), StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer3, 0), j, constraintLayoutScope2.constrainAs(modifierM5142padding3ABfNKs, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), onCardDismissed, false, composer3, BentoIcon4.Size24.$stable, 32);
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
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentDetailOptionLevel3EntryPointCardView3.InstrumentDetailOptionLevel3EntryPointCardComposable$lambda$5(onCardCtaClicked, onCardDismissed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            isDay = bentoTheme2.getColors(composerStartRestartGroup, i62).getIsDay();
            if (!isDay) {
            }
            if (isDay) {
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
                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i82);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i82);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i82);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i82);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j2) {
                        final Map linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j2, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i4);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$2.1
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
                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$4
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
                    final long j2 = jM6705copywmQWz5c$default;
                    final int i82 = i7;
                    composer2 = composerStartRestartGroup;
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default2, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardViewKt$InstrumentDetailOptionLevel3EntryPointCardComposable$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState2.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                            constraintLayoutScope2.reset();
                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                            composer3.startReplaceGroup(394523829);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope22, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
                            ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope22.createGuidelineFromEnd(0.33f);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer3.changed(verticalAnchorM8138createStartBarrier3ABfNKs$default) | composer3.changed(constraintLayoutBaseScope4Component2);
                            Object objRememberedValue9 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new InstrumentDetailOptionLevel3EntryPointCardView4(verticalAnchorM8138createStartBarrier3ABfNKs$default, constraintLayoutBaseScope4Component2);
                                composer3.updateRememberedValue(objRememberedValue9);
                            }
                            composer3.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3_incentive_summary, composer3, 0), PaddingKt.m5142padding3ABfNKs(modifierConstrainAs, bentoTheme22.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 4, 0, null, 0, bentoTheme22.getTypography(composer3, i10).getTextM(), composer3, 817889280, 0, 7548);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue10 = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue10 == companion3.getEmpty()) {
                                objRememberedValue10 = InstrumentDetailOptionLevel3EntryPointCardView5.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue10);
                            }
                            composer3.endReplaceGroup();
                            BentoTextButton2.m20715BentoTextButtonPIknLig(onCardCtaClicked, StringResources_androidKt.stringResource(C23386R.string.apply_for_options_level_3, composer3, 0), PaddingKt.m5142padding3ABfNKs(constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10), bentoTheme22.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), null, false, null, composer3, BentoTextButton3.Icon.Size12.$stable << 9, 112);
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, C2002Dp.m7995constructorimpl(0), 0.0f, bentoTheme22.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
                            composer3.startReplaceGroup(5004770);
                            boolean zChanged3 = composer3.changed(verticalAnchorCreateGuidelineFromEnd);
                            Object objRememberedValue11 = composer3.rememberedValue();
                            if (zChanged3 || objRememberedValue11 == companion3.getEmpty()) {
                                objRememberedValue11 = new InstrumentDetailOptionLevel3EntryPointCardView6(verticalAnchorCreateGuidelineFromEnd);
                                composer3.updateRememberedValue(objRememberedValue11);
                            }
                            composer3.endReplaceGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(i82, composer3, 0), (String) null, constraintLayoutScope22.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue11), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme22.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM());
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue12 = composer3.rememberedValue();
                            if (objRememberedValue12 == companion3.getEmpty()) {
                                objRememberedValue12 = InstrumentDetailOptionLevel3EntryPointCardView7.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue12);
                            }
                            composer3.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24), StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer3, 0), j2, constraintLayoutScope22.constrainAs(modifierM5142padding3ABfNKs, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue12), onCardDismissed, false, composer3, BentoIcon4.Size24.$stable, 32);
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
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
