package com.robinhood.android.advisory.dashboard.overview.portfolio;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.dashboard.overview.PortfolioBreakdownState;
import com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdown2;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PortfolioBreakdown.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownKt$PortfolioBreakdownPieChart$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioBreakdown2 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
    final /* synthetic */ CategorySlice $activeSlice;
    final /* synthetic */ SnapshotState<Integer> $activeSliceIndex$delegate;
    final /* synthetic */ boolean $canDrillDown;
    final /* synthetic */ SnapshotState<Boolean> $drillDownActivated$delegate;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ PortfolioBreakdownState $state;

    PortfolioBreakdown2(CategorySlice categorySlice, PortfolioBreakdownState portfolioBreakdownState, SnapshotState<Boolean> snapshotState, SnapshotState<Integer> snapshotState2, boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
        this.$activeSlice = categorySlice;
        this.$state = portfolioBreakdownState;
        this.$drillDownActivated$delegate = snapshotState;
        this.$activeSliceIndex$delegate = snapshotState2;
        this.$canDrillDown = z;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
        invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1108951012, i, -1, "com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownPieChart.<anonymous>.<anonymous> (PortfolioBreakdown.kt:121)");
        }
        if (z && this.$activeSlice != null) {
            composer.startReplaceGroup(-128761056);
            CategorySlice categorySlice = this.$activeSlice;
            String accountNumber = this.$state.getAccountNumber();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$drillDownActivated$delegate);
            final SnapshotState<Boolean> snapshotState = this.$drillDownActivated$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownKt$PortfolioBreakdownPieChart$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PortfolioBreakdown2.invoke$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CategoryDrillDown.CategoryDrillDown(categorySlice, accountNumber, (Function0) objRememberedValue, null, composer, 0, 8);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-128359358);
            ImmutableList<CategorySlice> categorySlices = this.$state.getCategorySlices();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(categorySlices, 10));
            Iterator<CategorySlice> it = categorySlices.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(it.next().getAllocation()));
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.PORTFOLIO_CHART, PortfolioBreakdown.LOGGING_IDENTIFIER_PORTFOLIO_DONUT_CHART, null, 4, null), null, 47, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Integer numPortfolioBreakdownPieChart$lambda$5 = PortfolioBreakdown.PortfolioBreakdownPieChart$lambda$5(this.$activeSliceIndex$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(this.$activeSliceIndex$delegate);
            final SnapshotState<Integer> snapshotState2 = this.$activeSliceIndex$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownKt$PortfolioBreakdownPieChart$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PortfolioBreakdown2.invoke$lambda$4$lambda$3(snapshotState2, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$activeSlice) | composer.changed(this.$canDrillDown) | composer.changed(this.$drillDownActivated$delegate) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$eventLogger);
            final CategorySlice categorySlice2 = this.$activeSlice;
            final boolean z2 = this.$canDrillDown;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final EventLogger eventLogger = this.$eventLogger;
            final SnapshotState<Boolean> snapshotState3 = this.$drillDownActivated$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownKt$PortfolioBreakdownPieChart$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PortfolioBreakdown2.invoke$lambda$6$lambda$5(categorySlice2, z2, userInteractionEventDescriptor, eventLogger, snapshotState3);
                    }
                };
                composer.updateRememberedValue(function0);
                objRememberedValue3 = function0;
            }
            composer.endReplaceGroup();
            PortfolioDonutChart.PortfolioDonutChart(persistentList, function1, modifierAutoLogEvents$default, false, numPortfolioBreakdownPieChart$lambda$5, false, (Function0) objRememberedValue3, ComposableLambda3.rememberComposableLambda(1073670821, true, new C87185(this.$activeSlice, this.$state, this.$canDrillDown, this.$drillDownActivated$delegate, this.$eventDescriptor, this.$eventLogger), composer, 54), composer, 12582912, 40);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        PortfolioBreakdown.PortfolioBreakdownPieChart$lambda$11(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(CategorySlice categorySlice, boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState snapshotState) {
        if (categorySlice != null && z) {
            PortfolioBreakdown.PortfolioBreakdownPieChart$lambda$11(snapshotState, true);
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PORTFOLIO_CHART, categorySlice.getCategory().getServerValue(), null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PortfolioBreakdown.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownKt$PortfolioBreakdownPieChart$1$1$5 */
    static final class C87185 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ CategorySlice $activeSlice;
        final /* synthetic */ boolean $canDrillDown;
        final /* synthetic */ SnapshotState<Boolean> $drillDownActivated$delegate;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ PortfolioBreakdownState $state;

        C87185(CategorySlice categorySlice, PortfolioBreakdownState portfolioBreakdownState, boolean z, SnapshotState<Boolean> snapshotState, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
            this.$activeSlice = categorySlice;
            this.$state = portfolioBreakdownState;
            this.$canDrillDown = z;
            this.$drillDownActivated$delegate = snapshotState;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$eventLogger = eventLogger;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CategorySlice categorySlice, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState snapshotState) {
            PortfolioBreakdown.PortfolioBreakdownPieChart$lambda$11(snapshotState, true);
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PORTFOLIO_CHART, categorySlice.getCategory().getServerValue(), null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope PortfolioDonutChart, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PortfolioDonutChart, "$this$PortfolioDonutChart");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1073670821, i, -1, "com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownPieChart.<anonymous>.<anonymous>.<anonymous> (PortfolioBreakdown.kt:164)");
            }
            if (this.$activeSlice != null) {
                composer.startReplaceGroup(1106078641);
                String string2 = StringResource2.getString(this.$activeSlice.getAllocationString(), composer, StringResource.$stable);
                String str = this.$activeSlice.getDetails().getShortName() + PlaceholderUtils.XXShortPlaceholderText + string2;
                String assetsDescription = this.$state.getCanShowIndividualAssets() ? this.$activeSlice.getAssetsDescription() : null;
                Modifier modifierClip = Clip.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShape2.getCircleShape());
                boolean z = this.$canDrillDown;
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(this.$drillDownActivated$delegate) | composer.changedInstance(this.$activeSlice) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$eventLogger);
                final CategorySlice categorySlice = this.$activeSlice;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                final EventLogger eventLogger = this.$eventLogger;
                final SnapshotState<Boolean> snapshotState = this.$drillDownActivated$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.PortfolioBreakdownKt$PortfolioBreakdownPieChart$1$1$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PortfolioBreakdown2.C87185.invoke$lambda$1$lambda$0(categorySlice, userInteractionEventDescriptor, eventLogger, snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PortfolioBreakdown.PieChartInnerDescription(str, assetsDescription, ClickableKt.m4893clickableXHw0xAI$default(modifierClip, z, null, null, (Function0) objRememberedValue, 6, null), this.$canDrillDown, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1107735033);
                BentoText2.m20747BentoText38GnDrw(this.$state.getDefaultDescription(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 0, 0, 8126);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
