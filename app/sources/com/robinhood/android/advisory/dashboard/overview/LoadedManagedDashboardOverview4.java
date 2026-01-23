package com.robinhood.android.advisory.dashboard.overview;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartState;
import com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdown;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoadedManagedDashboardOverview.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$3, reason: use source file name */
/* loaded from: classes7.dex */
final class LoadedManagedDashboardOverview4 implements Function4<AnimatedContentScope, ManagedDashboardOverviewChartState, Composer, Integer, Unit> {
    final /* synthetic */ Function1<CursorData, Unit> $onCursorDataChanged;
    final /* synthetic */ Function1<String, Unit> $onPerformanceChartSpanSelected;
    final /* synthetic */ Function1<ManagedReturnsChartState.ReturnsBar, Unit> $onReturnsChartBarSelected;
    final /* synthetic */ Function1<String, Unit> $onReturnsChartSpanSelected;
    final /* synthetic */ SnapshotState<Boolean> $returnsBreakdownIsOpen$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    LoadedManagedDashboardOverview4(Function1<? super CursorData, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, Function1<? super ManagedReturnsChartState.ReturnsBar, Unit> function14, SnapshotState<Boolean> snapshotState) {
        this.$onCursorDataChanged = function1;
        this.$onPerformanceChartSpanSelected = function12;
        this.$onReturnsChartSpanSelected = function13;
        this.$onReturnsChartBarSelected = function14;
        this.$returnsBreakdownIsOpen$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ManagedDashboardOverviewChartState managedDashboardOverviewChartState, Composer composer, Integer num) {
        invoke(animatedContentScope, managedDashboardOverviewChartState, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope ManagedOverviewContentContainer, ManagedDashboardOverviewChartState chartState, Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(ManagedOverviewContentContainer, "$this$ManagedOverviewContentContainer");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-928185535, i, -1, "com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview.<anonymous>.<anonymous> (LoadedManagedDashboardOverview.kt:294)");
        }
        if (chartState instanceof PortfolioBreakdownState) {
            composer.startReplaceGroup(-575721684);
            PortfolioBreakdown.PortfolioBreakdownPieChart((PortfolioBreakdownState) chartState, TestTag3.testTag(Modifier.INSTANCE, LoadedManagedDashboardOverview.PortfolioBreakdownTestTag), composer, 48, 0);
            composer.endReplaceGroup();
        } else if (chartState instanceof ManagedPerformanceChartState) {
            composer.startReplaceGroup(-575409545);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, LoadedManagedDashboardOverview.PerformanceChartTestTag);
            ManagedPerformanceChartState managedPerformanceChartState = (ManagedPerformanceChartState) chartState;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onCursorDataChanged);
            final Function1<CursorData, Unit> function1 = this.$onCursorDataChanged;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoadedManagedDashboardOverview4.invoke$lambda$1$lambda$0(function1, (CursorData) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(this.$onCursorDataChanged);
            final Function1<CursorData, Unit> function13 = this.$onCursorDataChanged;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoadedManagedDashboardOverview4.invoke$lambda$3$lambda$2(function13);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ManagedPerformanceChart3.ManagedPerformanceChart(managedPerformanceChartState, function12, (Function0) objRememberedValue2, this.$onPerformanceChartSpanSelected, modifierTestTag, composer, 24576, 0);
            ReturnsBreakdown returnsBreakdown = managedPerformanceChartState.getReturnsBreakdown();
            if (!LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$13(this.$returnsBreakdownIsOpen$delegate) || returnsBreakdown == null) {
                composer2 = composer;
            } else {
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState = this.$returnsBreakdownIsOpen$delegate;
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoadedManagedDashboardOverview4.invoke$lambda$5$lambda$4(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                composer2 = composer;
                ReturnsBreakdownBottomSheet.ReturnsBreakdownBottomSheet(returnsBreakdown, (Function0) objRememberedValue3, ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, LoadedManagedDashboardOverview.LOGGING_IDENTIFIER_BREAKDOWN_BOTTOM_SHEET, null, 4, null), null, 47, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), composer2, 48, 0);
            }
            composer2.endReplaceGroup();
        } else {
            if (!(chartState instanceof ManagedReturnsChartState)) {
                composer.startReplaceGroup(1366901830);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-573649551);
            ManagedReturnsChart3.ManagedReturnsChart((ManagedReturnsChartState) chartState, this.$onReturnsChartSpanSelected, this.$onReturnsChartBarSelected, TestTag3.testTag(Modifier.INSTANCE, LoadedManagedDashboardOverview.ReturnsChartTestTag), composer, 3072, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, CursorData cursorData) {
        function1.invoke(cursorData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
        LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$14(snapshotState, false);
        return Unit.INSTANCE;
    }
}
