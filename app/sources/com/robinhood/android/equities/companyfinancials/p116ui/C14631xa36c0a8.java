package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C14631xa36c0a8 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ ChartGroupDto $chartGroup$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ AnimationSpec $lineRevealAnimationSpec$inlined;
    final /* synthetic */ Function1 $onScrubIndexChanged$inlined;
    final /* synthetic */ Function1 $onTimePeriodSelected$inlined;
    final /* synthetic */ List $resFills$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $shouldAnimateBars$delegate$inlined;
    final /* synthetic */ SnapshotState $shouldAnimateLine$delegate$inlined;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ CompanyFinancialsSectionViewState $viewState$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14631xa36c0a8(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, CompanyFinancialsSectionViewState companyFinancialsSectionViewState, Function1 function1, ChartGroupDto chartGroupDto, SnapshotState snapshotState4, SnapshotState snapshotState5, List list, Function1 function12, AnimationSpec animationSpec) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$viewState$inlined = companyFinancialsSectionViewState;
        this.$onTimePeriodSelected$inlined = function1;
        this.$chartGroup$inlined = chartGroupDto;
        this.$shouldAnimateBars$delegate$inlined = snapshotState4;
        this.$shouldAnimateLine$delegate$inlined = snapshotState5;
        this.$resFills$inlined = list;
        this.$onScrubIndexChanged$inlined = function12;
        this.$lineRevealAnimationSpec$inlined = animationSpec;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SnapshotState snapshotState;
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
        composer.startReplaceGroup(-1949809456);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        CompanyFinancialsSectionViewState.Ready ready = (CompanyFinancialsSectionViewState.Ready) this.$viewState$inlined;
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$onTimePeriodSelected$inlined);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new CompanyFinancialsSection3(this.$onTimePeriodSelected$inlined, snapshotState3, this.$shouldAnimateBars$delegate$inlined, this.$shouldAnimateLine$delegate$inlined);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function1 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new CompanyFinancialsSection4(constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue4), 0.0f, composer, 0, 1);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        CompanyFinancialsSectionTopContent.CompanyFinancialsSectionTopContent(ready, function1, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM() + bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), 7, null), composer, 0, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new CompanyFinancialsSection5(constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue5), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.COMPANY_FINANCIALS_CHART, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null), 0.0f, composer, 0, 1);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue6);
        }
        SnapshotState snapshotState4 = (SnapshotState) objRememberedValue6;
        composer.endReplaceGroup();
        ChartGroupDto chartGroupDto = this.$chartGroup$inlined;
        ChartGroupDto chartGroupDtoCopy$default = ChartGroupDto.copy$default(chartGroupDto, CollectionsKt.listOf(ChartDto.copy$default((ChartDto) CollectionsKt.first((List) chartGroupDto.getCharts()), null, null, null, null, null, null, this.$resFills$inlined, null, null, 447, null)), null, null, null, null, null, 62, null);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
            snapshotState = snapshotState2;
            objRememberedValue7 = new CompanyFinancialsSection6(userInteractionEventDescriptor, current, snapshotState, snapshotState4);
            composer.updateRememberedValue(objRememberedValue7);
        } else {
            snapshotState = snapshotState2;
        }
        composer.endReplaceGroup();
        CompanyFinancialsChart.CompanyFinancialsChart(chartGroupDtoCopy$default, (Function1) objRememberedValue7, this.$onScrubIndexChanged$inlined, null, this.$lineRevealAnimationSpec$inlined, composer, 0, 8);
        composer.endNode();
        ChartGroupDto chartGroupDto2 = this.$chartGroup$inlined;
        ScrubState scrubStateCompanyFinancialsSection$lambda$27$lambda$13 = CompanyFinancialsSection.CompanyFinancialsSection$lambda$27$lambda$13(snapshotState);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$viewState$inlined) | composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new CompanyFinancialsSection7(this.$viewState$inlined, constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        CompanyFinancialsChartCursorTrack.CompanyFinancialsChartCursorTrack(chartGroupDto2, scrubStateCompanyFinancialsSection$lambda$27$lambda$13, SizeKt.fillMaxWidth$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue8), 0.0f, 1, null), composer, ScrubState.$stable << 3, 0);
        composer.endReplaceGroup();
        boolean zChangedInstance3 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState5 = this.$start;
        final SnapshotState snapshotState6 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$$inlined$ConstraintLayout$1.1
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
                    if (snapshotState5.getValue() == null || snapshotState6.getValue() == null) {
                        snapshotState5.setValue(constraintSet3);
                        snapshotState6.setValue(snapshotState5.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue9);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue9, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
