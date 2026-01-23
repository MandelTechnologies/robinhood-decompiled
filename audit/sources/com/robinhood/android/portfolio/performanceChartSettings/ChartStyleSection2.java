package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.android.rosetta.portfolio.PerformanceChartContextExt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ChartStyleSection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ChartStyleSection", "", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "callbacks", "Lcom/robinhood/android/portfolio/performanceChartSettings/ChartStyleCallbacks;", "(Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;Lcom/robinhood/android/portfolio/performanceChartSettings/ChartStyleCallbacks;Landroidx/compose/runtime/Composer;I)V", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSectionKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ChartStyleSection2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartStyleSection$lambda$10(PerformanceChartSettingsV2 performanceChartSettingsV2, ChartStyleSection chartStyleSection, int i, Composer composer, int i2) {
        ChartStyleSection(performanceChartSettingsV2, chartStyleSection, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ChartStyleSection(final PerformanceChartSettingsV2 settings, final ChartStyleSection callbacks, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(613042581);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(settings) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(613042581, i2, -1, "com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSection (ChartStyleSection.kt:33)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i5 = i2 & 112;
            boolean zChangedInstance = (i5 == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartStyleSection2.ChartStyleSection$lambda$9$lambda$3$lambda$2(callbacks, current, userInteractionEventDescriptor);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            int i6 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25550R.string.chart_settings_style_header, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), StringResources_androidKt.stringResource(C25550R.string.chart_settings_style_info, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C25550R.string.chart_settings_style_performance, composerStartRestartGroup, 0), settings.getChartStyle() == PerformanceChartStyle.PERFORMANCE, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = (i5 == 32 || ((i6 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(settings);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartStyleSection2.ChartStyleSection$lambda$9$lambda$6$lambda$5(callbacks, current, userInteractionEventDescriptor, settings);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = BentoSelectionRowState.$stable;
            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue2, composerStartRestartGroup, i7 << 3, 1);
            String strStringResource = StringResources_androidKt.stringResource(C25550R.string.chart_settings_style_contribution, composerStartRestartGroup, 0);
            if (settings.getChartStyle() == PerformanceChartStyle.CONTRIBUTION) {
                i3 = -1224400529;
                z = true;
            } else {
                i3 = -1224400529;
                z = false;
            }
            BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, strStringResource, z, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(i3);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | (i5 == 32 || ((i6 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(settings);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartStyleSection2.ChartStyleSection$lambda$9$lambda$8$lambda$7(callbacks, current, userInteractionEventDescriptor, settings);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue3, composerStartRestartGroup, i7 << 3, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartStyleSection2.ChartStyleSection$lambda$10(settings, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ChartStyleSection$onStyleChanged(ChartStyleSection chartStyleSection, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, PerformanceChartSettingsV2 performanceChartSettingsV2, PerformanceChartStyle performanceChartStyle) {
        chartStyleSection.onStyleChanged(performanceChartStyle);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SELECT_PERFORMANCE_CHART_VIEW;
        Screen screen = userInteractionEventDescriptor.getScreen();
        Component component = userInteractionEventDescriptor.getComponent();
        PerformanceChartContext.Span span = PerformanceChartContext.Span.SPAN_UNSPECIFIED;
        PerformanceChartContext.ChartView contextType = PerformanceChartContextExt.getContextType(performanceChartStyle);
        PerformanceChartContext.ChartType contextType2 = PerformanceChartContextExt.getContextType(performanceChartSettingsV2.getChartType());
        List<PerformanceChartBenchmarkV2> benchmarks = performanceChartSettingsV2.getBenchmarks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : benchmarks) {
            if (((PerformanceChartBenchmarkV2) obj).isSelected()) {
                arrayList.add(obj);
            }
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PerformanceChartContext(span, contextType, contextType2, CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ChartStyleSectionKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ChartStyleSection2.ChartStyleSection$onStyleChanged$lambda$1((PerformanceChartBenchmarkV2) obj2);
            }
        }, 30, null), false, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -129, -1, -1, 16383, null), false, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence ChartStyleSection$onStyleChanged$lambda$1(PerformanceChartBenchmarkV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartStyleSection$lambda$9$lambda$3$lambda$2(ChartStyleSection chartStyleSection, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        chartStyleSection.onShowFaq();
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_PERFORMANCE_CHART_MANUAL, userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), null, null, false, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartStyleSection$lambda$9$lambda$6$lambda$5(ChartStyleSection chartStyleSection, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, PerformanceChartSettingsV2 performanceChartSettingsV2) {
        ChartStyleSection$onStyleChanged(chartStyleSection, eventLogger, userInteractionEventDescriptor, performanceChartSettingsV2, PerformanceChartStyle.PERFORMANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartStyleSection$lambda$9$lambda$8$lambda$7(ChartStyleSection chartStyleSection, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, PerformanceChartSettingsV2 performanceChartSettingsV2) {
        ChartStyleSection$onStyleChanged(chartStyleSection, eventLogger, userInteractionEventDescriptor, performanceChartSettingsV2, PerformanceChartStyle.CONTRIBUTION);
        return Unit.INSTANCE;
    }
}
