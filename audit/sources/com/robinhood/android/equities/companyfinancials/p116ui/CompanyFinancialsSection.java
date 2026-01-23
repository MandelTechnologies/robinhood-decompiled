package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartFillDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: CompanyFinancialsSection.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {CompanyFinancialsSection.CompanyFinancialsSectionComposableTestTag, "", "BAR_ANIMATION_DURATION", "", "LINE_REVEAL_ANIMATION_DURATION", "CompanyFinancialsSection", "", "viewState", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "onTimePeriodSelected", "Lkotlin/Function1;", "onScrubIndexChanged", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-company-financials_externalDebug", "shouldAnimateBars", "", "shouldAnimateLine", "scrubState", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "lastTimePeriod", "ignoreFirstNull"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CompanyFinancialsSection {
    public static final int BAR_ANIMATION_DURATION = 425;
    public static final String CompanyFinancialsSectionComposableTestTag = "CompanyFinancialsSectionComposableTestTag";
    public static final int LINE_REVEAL_ANIMATION_DURATION = 575;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsSection$lambda$0(CompanyFinancialsSectionViewState companyFinancialsSectionViewState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsSection(companyFinancialsSectionViewState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsSection$lambda$1(CompanyFinancialsSectionViewState companyFinancialsSectionViewState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsSection(companyFinancialsSectionViewState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompanyFinancialsSection$lambda$28(CompanyFinancialsSectionViewState companyFinancialsSectionViewState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompanyFinancialsSection(companyFinancialsSectionViewState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CompanyFinancialsSection(final CompanyFinancialsSectionViewState viewState, final Function1<? super String, Unit> onTimePeriodSelected, final Function1<? super Integer, Unit> onScrubIndexChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onTimePeriodSelected, "onTimePeriodSelected");
        Intrinsics.checkNotNullParameter(onScrubIndexChanged, "onScrubIndexChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1739927839);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTimePeriodSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrubIndexChanged) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier2 = (i2 & 8) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1739927839, i3, -1, "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSection (CompanyFinancialsSection.kt:47)");
            }
            if (viewState instanceof CompanyFinancialsSectionViewState.Disabled) {
                modifier = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                if (!(viewState instanceof CompanyFinancialsSectionViewState.Ready)) {
                    throw new NoWhenBranchMatchedException();
                }
                final ChartGroupDto chart = ((CompanyFinancialsSectionViewState.Ready) viewState).getSection().getChart();
                if (chart == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier3 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CompanyFinancialsSection.CompanyFinancialsSection$lambda$0(viewState, onTimePeriodSelected, onScrubIndexChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final Modifier modifier4 = modifier2;
                if (chart.getCharts().isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CompanyFinancialsSection.CompanyFinancialsSection$lambda$1(viewState, onTimePeriodSelected, onScrubIndexChanged, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                TweenSpec tweenSpecTween$default = CompanyFinancialsSection$lambda$3(snapshotState2) ? AnimationSpecKt.tween$default(BAR_ANIMATION_DURATION, 0, null, 6, null) : null;
                final TweenSpec tweenSpecTween$default2 = CompanyFinancialsSection$lambda$6(snapshotState3) ? AnimationSpecKt.tween$default(LINE_REVEAL_ANIMATION_DURATION, 0, null, 6, null) : null;
                List<ChartFillDto> fills = ((ChartDto) CollectionsKt.first((List) chart.getCharts())).getFills();
                ArrayList arrayList = new ArrayList();
                for (Object obj : fills) {
                    if (Intrinsics.areEqual(((ChartFillDto) obj).getIdentifier(), "animate")) {
                        arrayList.add(obj);
                    }
                }
                ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : fills) {
                    if (Intrinsics.areEqual(((ChartFillDto) obj2).getIdentifier(), Analytics3.EVENT_APPEAR)) {
                        arrayList2.add(obj2);
                    }
                }
                ImmutableList immutableList2 = extensions2.toImmutableList(arrayList2);
                ImmutableList<ChartFillDto> immutableListAnimateSduiBarFillList = CompanyFinancialsAnimations.animateSduiBarFillList(immutableList, tweenSpecTween$default, composerStartRestartGroup, 0, 0);
                List listPlus = CollectionsKt.plus((Collection) immutableListAnimateSduiBarFillList, (Iterable) CompanyFinancialsAnimations.animateSduiDotFillList(immutableList2, tweenSpecTween$default2, composerStartRestartGroup, 0));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : fills) {
                    ChartFillDto chartFillDto = (ChartFillDto) obj3;
                    if ((Intrinsics.areEqual(chartFillDto.getIdentifier(), "animate") || Intrinsics.areEqual(chartFillDto.getIdentifier(), Analytics3.EVENT_APPEAR)) ? false : true) {
                        arrayList3.add(obj3);
                    }
                }
                final List listPlus2 = CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList3);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(immutableListAnimateSduiBarFillList) | composerStartRestartGroup.changedInstance(immutableList);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    CompanyFinancialsSection2 companyFinancialsSection2 = new CompanyFinancialsSection2(immutableListAnimateSduiBarFillList, immutableList, snapshotState2, snapshotState3, null);
                    composerStartRestartGroup.updateRememberedValue(companyFinancialsSection2);
                    objRememberedValue3 = companyFinancialsSection2;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(immutableListAnimateSduiBarFillList, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), CompanyFinancialsSectionComposableTestTag);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final Measurer2 measurer2 = (Measurer2) objRememberedValue4;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue5;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue6;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion2.getEmpty()) {
                    objRememberedValue7 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue7;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion2.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue8;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                final int i4 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                boolean zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue9 == companion2.getEmpty()) {
                    objRememberedValue9 = new MeasurePolicy() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i5);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i5);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i5);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i5);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState5.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i4);
                            snapshotState4.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$$inlined$ConstraintLayout$2.1
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
                    snapshotState = snapshotState4;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    constraintSetForInlineDsl = constraintSetForInlineDsl2;
                    snapshotState = snapshotState4;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue9;
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion2.getEmpty()) {
                    objRememberedValue10 = new Function0<Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$$inlined$ConstraintLayout$3
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                final Function0 function0 = (Function0) objRememberedValue10;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue11 == companion2.getEmpty()) {
                    objRememberedValue11 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$$inlined$ConstraintLayout$4
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
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                modifier = modifier4;
                composer2 = composerStartRestartGroup;
                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue11, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        Object obj4;
                        SnapshotState snapshotState6;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i5, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState5.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer3.startReplaceGroup(-1949809456);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue12 = composer3.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue12 == companion3.getEmpty()) {
                            objRememberedValue12 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        SnapshotState snapshotState7 = (SnapshotState) objRememberedValue12;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue13 = composer3.rememberedValue();
                        if (objRememberedValue13 == companion3.getEmpty()) {
                            objRememberedValue13 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue13);
                        }
                        SnapshotState snapshotState8 = (SnapshotState) objRememberedValue13;
                        composer3.endReplaceGroup();
                        CompanyFinancialsSectionViewState.Ready ready = (CompanyFinancialsSectionViewState.Ready) viewState;
                        composer3.startReplaceGroup(-1224400529);
                        boolean zChanged2 = composer3.changed(onTimePeriodSelected);
                        Object objRememberedValue14 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue14 == companion3.getEmpty()) {
                            objRememberedValue14 = new CompanyFinancialsSection3(onTimePeriodSelected, snapshotState8, snapshotState2, snapshotState3);
                            composer3.updateRememberedValue(objRememberedValue14);
                        }
                        Function1 function1 = (Function1) objRememberedValue14;
                        composer3.endReplaceGroup();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue15 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue15 == companion3.getEmpty()) {
                            objRememberedValue15 = new CompanyFinancialsSection4(constraintLayoutBaseScope4Component2);
                            composer3.updateRememberedValue(objRememberedValue15);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue15), 0.0f, composer3, 0, 1);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        CompanyFinancialsSectionTopContent.CompanyFinancialsSectionTopContent(ready, function1, PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM() + bentoTheme.getSpacing(composer3, i6).m21595getXsmallD9Ej5fM()), 7, null), composer3, 0, 0);
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component1);
                        Object objRememberedValue16 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue16 == companion3.getEmpty()) {
                            objRememberedValue16 = new CompanyFinancialsSection5(constraintLayoutBaseScope4Component1);
                            composer3.updateRememberedValue(objRememberedValue16);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue16), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.COMPANY_FINANCIALS_CHART, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null), 0.0f, composer3, 0, 1);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceGroup(1849434622);
                        Object objRememberedValue17 = composer3.rememberedValue();
                        if (objRememberedValue17 == companion3.getEmpty()) {
                            obj4 = null;
                            objRememberedValue17 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue17);
                        } else {
                            obj4 = null;
                        }
                        SnapshotState snapshotState9 = (SnapshotState) objRememberedValue17;
                        composer3.endReplaceGroup();
                        ChartGroupDto chartGroupDto = chart;
                        ChartGroupDto chartGroupDtoCopy$default = ChartGroupDto.copy$default(chartGroupDto, CollectionsKt.listOf(ChartDto.copy$default((ChartDto) CollectionsKt.first((List) chartGroupDto.getCharts()), null, null, null, null, null, null, listPlus2, null, null, 447, null)), null, null, null, null, null, 62, null);
                        composer3.startReplaceGroup(-1224400529);
                        boolean zChangedInstance4 = composer3.changedInstance(userInteractionEventDescriptor) | composer3.changedInstance(current);
                        Object objRememberedValue18 = composer3.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue18 == companion3.getEmpty()) {
                            snapshotState6 = snapshotState7;
                            objRememberedValue18 = new CompanyFinancialsSection6(userInteractionEventDescriptor, current, snapshotState6, snapshotState9);
                            composer3.updateRememberedValue(objRememberedValue18);
                        } else {
                            snapshotState6 = snapshotState7;
                        }
                        composer3.endReplaceGroup();
                        SnapshotState snapshotState10 = snapshotState6;
                        Object obj5 = obj4;
                        CompanyFinancialsChart.CompanyFinancialsChart(chartGroupDtoCopy$default, (Function1) objRememberedValue18, onScrubIndexChanged, null, tweenSpecTween$default2, composer3, 0, 8);
                        composer3.endNode();
                        ChartGroupDto chartGroupDto2 = chart;
                        ScrubState scrubStateCompanyFinancialsSection$lambda$27$lambda$13 = CompanyFinancialsSection.CompanyFinancialsSection$lambda$27$lambda$13(snapshotState10);
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChangedInstance5 = composer3.changedInstance(viewState) | composer3.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue19 = composer3.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue19 == companion3.getEmpty()) {
                            objRememberedValue19 = new CompanyFinancialsSection7(viewState, constraintLayoutBaseScope4Component2);
                            composer3.updateRememberedValue(objRememberedValue19);
                        }
                        composer3.endReplaceGroup();
                        CompanyFinancialsChartCursorTrack.CompanyFinancialsChartCursorTrack(chartGroupDto2, scrubStateCompanyFinancialsSection$lambda$27$lambda$13, SizeKt.fillMaxWidth$default(constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue19), 0.0f, 1, obj5), composer3, ScrubState.$stable << 3, 0);
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
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier5 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CompanyFinancialsSection.CompanyFinancialsSection$lambda$28(viewState, onTimePeriodSelected, onScrubIndexChanged, modifier5, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CompanyFinancialsSection$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CompanyFinancialsSection$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubState CompanyFinancialsSection$lambda$27$lambda$13(SnapshotState<ScrubState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CompanyFinancialsSection$lambda$27$lambda$16(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CompanyFinancialsSection$lambda$27$lambda$25$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean CompanyFinancialsSection$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean CompanyFinancialsSection$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CompanyFinancialsSection$lambda$27$lambda$25$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}
