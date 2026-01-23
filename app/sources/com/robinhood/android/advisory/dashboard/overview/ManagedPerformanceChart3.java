package com.robinhood.android.advisory.dashboard.overview;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.contracts.AdvisoryProjectionFragmentKey;
import com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart3;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.models.p080db.PerformanceChartSpans;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.SegmentedLineChart;
import com.robinhood.android.charts.span.SpanOptionsDynamicSelector;
import com.robinhood.android.lib.performancechart.PerformanceChartActionHandler;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions2;
import com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollInteraction;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.android.sdui.chartgroup.SduiChartLayeredStack2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ManagedPerformanceChart.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001aY\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002"}, m3636d2 = {"launchProjectedReturns", "", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "accountNumber", "", "ManagedPerformanceChart", "state", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedPerformanceChartState;", "onScrub", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "onScrubStopped", "Lkotlin/Function0;", "onSpanSelected", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/dashboard/overview/ManagedPerformanceChartState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug", "scrubPoint", "Lcom/robinhood/models/serverdriven/experimental/api/Point;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ManagedPerformanceChart3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagedPerformanceChart$lambda$3(ManagedPerformanceChartState managedPerformanceChartState, Function1 function1, Function0 function0, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ManagedPerformanceChart(managedPerformanceChartState, function1, function0, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void launchProjectedReturns(Navigator navigator, Context context, String accountNumber) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryProjectionFragmentKey(accountNumber, null, 2, null), false, false, false, false, null, false, null, null, 1020, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagedPerformanceChart(final ManagedPerformanceChartState managedPerformanceChartState, final Function1<? super CursorData, Unit> onScrub, final Function0<Unit> onScrubStopped, final Function1<? super String, Unit> onSpanSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Intrinsics.checkNotNullParameter(onScrubStopped, "onScrubStopped");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-671763027);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(managedPerformanceChartState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrub) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrubStopped) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSpanSelected) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-671763027, i3, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart (ManagedPerformanceChart.kt:66)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                PerformanceChartActionHandler.PerformanceChartActionHandler(null, ComposableLambda3.rememberComposableLambda(-2146175501, true, new C87021(modifier5, WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact, managedPerformanceChartState, onScrub, onScrubStopped, snapshotState, onSpanSelected, (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ManagedPerformanceChart3.ManagedPerformanceChart$lambda$3(managedPerformanceChartState, onScrub, onScrubStopped, onSpanSelected, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            PerformanceChartActionHandler.PerformanceChartActionHandler(null, ComposableLambda3.rememberComposableLambda(-2146175501, true, new C87021(modifier52, WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6) != WindowSize.Compact, managedPerformanceChartState, onScrub, onScrubStopped, snapshotState2, onSpanSelected, (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator()), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ManagedPerformanceChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1 */
    static final class C87021 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isCompactPhoneScreen;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function1<CursorData, Unit> $onScrub;
        final /* synthetic */ Function0<Unit> $onScrubStopped;
        final /* synthetic */ Function1<String, Unit> $onSpanSelected;
        final /* synthetic */ SnapshotState<Point> $scrubPoint$delegate;
        final /* synthetic */ ManagedPerformanceChartState $state;

        /* compiled from: ManagedPerformanceChart.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Direction.values().length];
                try {
                    iArr[Direction.f5855UP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Direction.DOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C87021(Modifier modifier, boolean z, ManagedPerformanceChartState managedPerformanceChartState, Function1<? super CursorData, Unit> function1, Function0<Unit> function0, SnapshotState<Point> snapshotState, Function1<? super String, Unit> function12, Navigator navigator, Context context) {
            this.$modifier = modifier;
            this.$isCompactPhoneScreen = z;
            this.$state = managedPerformanceChartState;
            this.$onScrub = function1;
            this.$onScrubStopped = function0;
            this.$scrubPoint$delegate = snapshotState;
            this.$onSpanSelected = function12;
            this.$navigator = navigator;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            BentoTheme4 bentoTheme4;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2146175501, i, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart.<anonymous> (ManagedPerformanceChart.kt:75)");
            }
            Modifier modifierAspectRatio$default = this.$modifier;
            if (this.$isCompactPhoneScreen) {
                modifierAspectRatio$default = AspectRatio3.aspectRatio$default(modifierAspectRatio$default, 1.0f, false, 2, null);
            }
            final ManagedPerformanceChartState managedPerformanceChartState = this.$state;
            boolean z = this.$isCompactPhoneScreen;
            final Function1<CursorData, Unit> function1 = this.$onScrub;
            final Function0<Unit> function0 = this.$onScrubStopped;
            final SnapshotState<Point> snapshotState = this.$scrubPoint$delegate;
            final Function1<String, Unit> function12 = this.$onSpanSelected;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAspectRatio$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (managedPerformanceChartState != null) {
                composer.startReplaceGroup(1822947106);
                composer.startReplaceGroup(-1326670427);
                Modifier modifierM5146paddingqDBjuR0$default = z ? PaddingKt.m5146paddingqDBjuR0$default(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE;
                composer.endReplaceGroup();
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion.getStart(), composer, 6);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Point pointManagedPerformanceChart$lambda$1 = ManagedPerformanceChart3.ManagedPerformanceChart$lambda$1(snapshotState);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                SduiCursorData2.SduiLabelTrack(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), pointManagedPerformanceChart$lambda$1, composer, 0, 0);
                List<Line> lines = managedPerformanceChartState.getModel().getLines();
                Point pointManagedPerformanceChart$lambda$12 = ManagedPerformanceChart3.ManagedPerformanceChart$lambda$1(snapshotState);
                composer.startReplaceGroup(-1799186269);
                ImmutableList<ChartAnnotation> immutableListBuildSparkleScrim = pointManagedPerformanceChart$lambda$12 == null ? null : PerformanceChartSparkleScrim.buildSparkleScrim(new com.robinhood.android.charts.model.Point(pointManagedPerformanceChart$lambda$12.getX(), pointManagedPerformanceChart$lambda$12.getY()), managedPerformanceChartState.getModel().getPageDirection(), composer, com.robinhood.android.charts.model.Point.$stable);
                composer.endReplaceGroup();
                if (immutableListBuildSparkleScrim == null) {
                    immutableListBuildSparkleScrim = extensions2.persistentListOf();
                }
                ImmutableList immutableListPersistentListOf = ManagedPerformanceChart3.ManagedPerformanceChart$lambda$1(snapshotState) != null ? extensions2.persistentListOf() : SduiChartLayeredStack2.toChartOverlays(managedPerformanceChartState.getModel().getOverlays());
                Modifier modifierFullWidthChartSize = ModifiersKt.fullWidthChartSize(companion3);
                ImmutableList<Fill> immutableListMapSduiFills = SduiChartMappersKt.mapSduiFills(managedPerformanceChartState.getModel().getFills(), composer, 0);
                ImmutableList<SegmentedLine> segmentedLines = SduiChartMappersKt.toSegmentedLines(lines, 0.0f, composer, 0, 1);
                ScrubLineType scrubLineType = ScrubLineType.SCRUB_LINE_INVISIBLE;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(managedPerformanceChartState) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ManagedPerformanceChart3.C87021.invoke$lambda$7$lambda$6$lambda$3$lambda$2(managedPerformanceChartState, function1, snapshotState, (com.robinhood.android.charts.model.Point) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function13 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ManagedPerformanceChart3.C87021.invoke$lambda$7$lambda$6$lambda$5$lambda$4(function0, snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                SegmentedLineChart.SegmentedLineChart(segmentedLines, modifierFullWidthChartSize, immutableListMapSduiFills, immutableListBuildSparkleScrim, immutableListPersistentListOf, null, function13, (Function0) objRememberedValue2, scrubLineType, false, null, composer, 100663296 | SegmentedLine.$stable | (Overlays.$stable << 12), 0, 1568);
                composer.endNode();
                final PerformanceChartSpans spans = managedPerformanceChartState.getModel().getSpans();
                int i2 = WhenMappings.$EnumSwitchMapping$0[managedPerformanceChartState.getModel().getPageDirection().ordinal()];
                if (i2 == 1) {
                    bentoTheme4 = BentoTheme4.POSITIVE;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bentoTheme4 = BentoTheme4.NEGATIVE;
                }
                BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(1518317918, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1518317918, i3, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart.<anonymous>.<anonymous>.<anonymous> (ManagedPerformanceChart.kt:140)");
                        }
                        SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(extensions2.toImmutableList(spans.getAvailableSpans()), managedPerformanceChartState.getActiveSpan(), function12, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(AccountTabScrollInteractions2.accountTabScrollInteraction(Modifier.INSTANCE, (AccountTabScrollInteractions) composer2.consume(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction())), 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, false, ComposableLambda3.rememberComposableLambda(-298378279, true, new C87031(navigator, context, managedPerformanceChartState), composer2, 54), composer2, 1572864, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ManagedPerformanceChart.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$2$2$1 */
                    static final class C87031 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ ManagedPerformanceChartState $state;

                        C87031(Navigator navigator, Context context, ManagedPerformanceChartState managedPerformanceChartState) {
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$state = managedPerformanceChartState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 SpanOptionsDynamicSelector, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(SpanOptionsDynamicSelector, "$this$SpanOptionsDynamicSelector");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-298378279, i, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagedPerformanceChart.kt:149)");
                            }
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$state);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            final ManagedPerformanceChartState managedPerformanceChartState = this.$state;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = 
                                      (r12v5 'navigator' com.robinhood.android.navigation.Navigator A[DONT_INLINE])
                                      (r0v2 'context' android.content.Context A[DONT_INLINE])
                                      (r1v0 'managedPerformanceChartState' com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartState A[DONT_INLINE])
                                     A[MD:(com.robinhood.android.navigation.Navigator, android.content.Context, com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartState):void (m)] (LINE:151) call: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$2$2$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.navigation.Navigator, android.content.Context, com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartState):void type: CONSTRUCTOR in method: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$2$2.1.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$2$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    java.lang.String r0 = "$this$SpanOptionsDynamicSelector"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                                    r10 = r12 & 17
                                    r0 = 16
                                    if (r10 != r0) goto L16
                                    boolean r10 = r11.getSkipping()
                                    if (r10 != 0) goto L12
                                    goto L16
                                L12:
                                    r11.skipToGroupEnd()
                                    return
                                L16:
                                    boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r10 == 0) goto L25
                                    r10 = -1
                                    java.lang.String r0 = "com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagedPerformanceChart.kt:149)"
                                    r1 = -298378279(0xffffffffee371bd9, float:-1.4167356E28)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r1, r12, r10, r0)
                                L25:
                                    r10 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
                                    r11.startReplaceGroup(r10)
                                    com.robinhood.android.navigation.Navigator r10 = r9.$navigator
                                    boolean r10 = r11.changedInstance(r10)
                                    android.content.Context r12 = r9.$context
                                    boolean r12 = r11.changedInstance(r12)
                                    r10 = r10 | r12
                                    com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartState r12 = r9.$state
                                    boolean r12 = r11.changedInstance(r12)
                                    r10 = r10 | r12
                                    com.robinhood.android.navigation.Navigator r12 = r9.$navigator
                                    android.content.Context r0 = r9.$context
                                    com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartState r1 = r9.$state
                                    java.lang.Object r2 = r11.rememberedValue()
                                    if (r10 != 0) goto L53
                                    androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r10 = r10.getEmpty()
                                    if (r2 != r10) goto L5b
                                L53:
                                    com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$2$2$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChartKt$ManagedPerformanceChart$1$2$2$1$$ExternalSyntheticLambda0
                                    r2.<init>(r12, r0, r1)
                                    r11.updateRememberedValue(r2)
                                L5b:
                                    r3 = r2
                                    kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                                    r11.endReplaceGroup()
                                    com.robinhood.android.advisory.dashboard.overview.ComposableSingletons$ManagedPerformanceChartKt r10 = com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart.INSTANCE
                                    kotlin.jvm.functions.Function3 r5 = r10.getLambda$1233940967$lib_advisory_dashboard_externalDebug()
                                    r7 = 384(0x180, float:5.38E-43)
                                    r8 = 2
                                    r4 = 0
                                    r6 = r11
                                    com.robinhood.android.advisory.dashboard.overview.GlowingGradientBorderButton.GlowingGradientBorderButton(r3, r4, r5, r6, r7, r8)
                                    boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r10 == 0) goto L78
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L78:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.advisory.dashboard.overview.ManagedPerformanceChart4.C87031.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, ManagedPerformanceChartState managedPerformanceChartState) {
                                ManagedPerformanceChart3.launchProjectedReturns(navigator, context, managedPerformanceChartState.getModel().getAccountNumber());
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer, 54), composer, 48);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1826792408);
                    Placeholders2.ChartPlaceholder(ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), false, composer, 0, 2);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6$lambda$3$lambda$2(ManagedPerformanceChartState managedPerformanceChartState, Function1 function1, SnapshotState snapshotState, com.robinhood.android.charts.model.Point point) {
                Intrinsics.checkNotNullParameter(point, "point");
                ManagedPerformanceChart3.ManagedPerformanceChart$lambda$2(snapshotState, CursorDataExtensions.reduceCursorDataForPoint(managedPerformanceChartState.getModel(), point));
                Point pointManagedPerformanceChart$lambda$1 = ManagedPerformanceChart3.ManagedPerformanceChart$lambda$1(snapshotState);
                function1.invoke(pointManagedPerformanceChart$lambda$1 != null ? pointManagedPerformanceChart$lambda$1.getCursor_data() : null);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(Function0 function0, SnapshotState snapshotState) {
                ManagedPerformanceChart3.ManagedPerformanceChart$lambda$2(snapshotState, null);
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Point ManagedPerformanceChart$lambda$1(SnapshotState<Point> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ManagedPerformanceChart$lambda$2(SnapshotState<Point> snapshotState, Point point) {
            snapshotState.setValue(point);
        }
    }
