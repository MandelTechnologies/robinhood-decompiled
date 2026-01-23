package com.robinhood.android.equities.shortinterest.p117ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.shortinterest.ShortInterestSectionViewState;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: ShortInterestSection.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, m3636d2 = {ShortInterestSection.ShortInterestSectionComposableTestTag, "", "ShortInterestSection", "", "viewState", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-short-interest_externalDebug", "scrubState", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ShortInterestSection {
    public static final String ShortInterestSectionComposableTestTag = "ShortInterestSectionComposableTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortInterestSection$lambda$0(ShortInterestSectionViewState shortInterestSectionViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShortInterestSection(shortInterestSectionViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShortInterestSection$lambda$10(ShortInterestSectionViewState shortInterestSectionViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShortInterestSection(shortInterestSectionViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShortInterestSection(final ShortInterestSectionViewState viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-314103721);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-314103721, i3, -1, "com.robinhood.android.equities.shortinterest.ui.ShortInterestSection (ShortInterestSection.kt:35)");
                }
                if (!(viewState instanceof ShortInterestSectionViewState.Disabled)) {
                    composerStartRestartGroup.startReplaceGroup(1269985532);
                    Spacer2.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                } else {
                    if (!(viewState instanceof ShortInterestSectionViewState.Ready)) {
                        composerStartRestartGroup.startReplaceGroup(-1205958648);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1270182475);
                    final ChartGroupDto chart = ((ShortInterestSectionViewState.Ready) viewState).getSection().getChart();
                    if (chart == null) {
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ShortInterestSection.ShortInterestSection$lambda$0(viewState, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    modifier3 = modifier4;
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), ShortInterestSectionComposableTestTag);
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    composerStartRestartGroup.endReplaceGroup();
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Measurer2(density);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final Measurer2 measurer2 = (Measurer2) objRememberedValue;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ConstraintLayoutScope();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                    final int i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt$ShortInterestSection$$inlined$ConstraintLayout$2
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
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i5);
                                snapshotState2.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt$ShortInterestSection$$inlined$ConstraintLayout$2.1
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
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        snapshotState = snapshotState2;
                        composerStartRestartGroup.updateRememberedValue(measurePolicy);
                        objRememberedValue6 = measurePolicy;
                    } else {
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        snapshotState = snapshotState2;
                    }
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt$ShortInterestSection$$inlined$ConstraintLayout$3
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
                                snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                constraintSetForInlineDsl.setKnownDirty(true);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    final Function0 function0 = (Function0) objRememberedValue7;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt$ShortInterestSection$$inlined$ConstraintLayout$4
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
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt$ShortInterestSection$$inlined$ConstraintLayout$5
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
                            snapshotState3.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer2.startReplaceGroup(814066609);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue9 = composer2.rememberedValue();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objRememberedValue9 == companion2.getEmpty()) {
                                objRememberedValue9 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composer2.updateRememberedValue(objRememberedValue9);
                            }
                            SnapshotState snapshotState4 = (SnapshotState) objRememberedValue9;
                            composer2.endReplaceGroup();
                            ShortInterestSectionViewState.Ready ready = (ShortInterestSectionViewState.Ready) viewState;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                            Object objRememberedValue10 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue10 == companion2.getEmpty()) {
                                objRememberedValue10 = new ShortInterestSection2(constraintLayoutBaseScope4Component2);
                                composer2.updateRememberedValue(objRememberedValue10);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), 0.0f, composer2, 0, 1);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            ShortInterestSectionTopContent.ShortInterestSectionTopContent(ready, PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM() + bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM()), 7, null), composer2, 0, 0);
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1);
                            Object objRememberedValue11 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue11 == companion2.getEmpty()) {
                                objRememberedValue11 = new ShortInterestSection3(constraintLayoutBaseScope4Component1);
                                composer2.updateRememberedValue(objRememberedValue11);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11), 0.0f, 1, null), 0.0f, composer2, 0, 1);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ChartGroupDto chartGroupDto = chart;
                            composer2.startReplaceGroup(5004770);
                            Object objRememberedValue12 = composer2.rememberedValue();
                            if (objRememberedValue12 == companion2.getEmpty()) {
                                objRememberedValue12 = new ShortInterestSection4(snapshotState4);
                                composer2.updateRememberedValue(objRememberedValue12);
                            }
                            composer2.endReplaceGroup();
                            ShortInterestChart.ShortInterestChart(chartGroupDto, (Function1) objRememberedValue12, null, composer2, 48, 4);
                            composer2.endNode();
                            ChartGroupDto chartGroupDto2 = chart;
                            ScrubState scrubStateShortInterestSection$lambda$9$lambda$2 = ShortInterestSection.ShortInterestSection$lambda$9$lambda$2(snapshotState4);
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue13 = composer2.rememberedValue();
                            if (objRememberedValue13 == companion2.getEmpty()) {
                                objRememberedValue13 = ShortInterestSection5.INSTANCE;
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceGroup();
                            ShortInterestChartCursorTrack.ShortInterestChartCursorTrack(chartGroupDto2, scrubStateShortInterestSection$lambda$9$lambda$2, SizeKt.fillMaxWidth$default(constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue13), 0.0f, 1, null), composer2, ScrubState.$stable << 3, 0);
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
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShortInterestSection.ShortInterestSection$lambda$10(viewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(viewState instanceof ShortInterestSectionViewState.Disabled)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubState ShortInterestSection$lambda$9$lambda$2(SnapshotState<ScrubState> snapshotState) {
        return snapshotState.getValue();
    }
}
