package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.returns.ReturnsHubScreen4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ReturnsComparisonContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BenchmarksSection.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e\u001aF\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u0016H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"BenchmarksSection", "", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "showFtux", "", "callbacks", "Lcom/robinhood/android/portfolio/performanceChartSettings/ChartBenchmarksCallbacks;", "(Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;ZLcom/robinhood/android/portfolio/performanceChartSettings/ChartBenchmarksCallbacks;Landroidx/compose/runtime/Composer;I)V", "HeaderRow", "modifier", "Landroidx/compose/ui/Modifier;", "showNewChip", "showEdit", "(Landroidx/compose/ui/Modifier;ZZLcom/robinhood/android/portfolio/performanceChartSettings/ChartBenchmarksCallbacks;Landroidx/compose/runtime/Composer;II)V", "BenchmarkRow", ReturnsHubScreen4.LOGGING_IDENTIFIER_BENCHMARK_INFO_ICON, "Lcom/robinhood/android/models/portfolio/PerformanceChartBenchmarkV2;", "activeBenchmarkSymbols", "Lkotlinx/collections/immutable/ImmutableSet;", "", "onToggleBenchmark", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "benchmarkId", "(Lcom/robinhood/android/models/portfolio/PerformanceChartBenchmarkV2;Lkotlinx/collections/immutable/ImmutableSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BenchmarksSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkRow$lambda$14(PerformanceChartBenchmarkV2 performanceChartBenchmarkV2, ImmutableSet immutableSet, Function1 function1, int i, Composer composer, int i2) {
        BenchmarkRow(performanceChartBenchmarkV2, immutableSet, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarksSection$lambda$4(PerformanceChartSettingsV2 performanceChartSettingsV2, boolean z, BenchmarksSection7 benchmarksSection7, int i, Composer composer, int i2) {
        BenchmarksSection(performanceChartSettingsV2, z, benchmarksSection7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderRow$lambda$11(Modifier modifier, boolean z, boolean z2, BenchmarksSection7 benchmarksSection7, int i, int i2, Composer composer, int i3) {
        HeaderRow(modifier, z, z2, benchmarksSection7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BenchmarksSection(final PerformanceChartSettingsV2 settings, final boolean z, final BenchmarksSection7 callbacks, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(113158126);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(settings) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(113158126, i2, -1, "com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection (BenchmarksSection.kt:43)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1454566097, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$BenchmarksSection$1$1
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
                        ComposerKt.traceEventStart(-1454566097, i3, -1, "com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection.<anonymous>.<anonymous> (BenchmarksSection.kt:46)");
                    }
                    BenchmarksSection.HeaderRow(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), z && settings.getBenchmarks().isEmpty(), !settings.getBenchmarks().isEmpty(), callbacks, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (settings.getBenchmarks().isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(546061835);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25550R.string.chart_settings_benchmarks_ftux_description, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-605044918, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$BenchmarksSection$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        String strStringResource;
                        Object objRememberedValue;
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-605044918, i3, -1, "com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSection.<anonymous>.<anonymous> (BenchmarksSection.kt:64)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        if (z) {
                            composer2.startReplaceGroup(1084826605);
                            strStringResource = StringResources_androidKt.stringResource(C25550R.string.chart_settings_benchmarks_ftux_cta, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1084938732);
                            strStringResource = StringResources_androidKt.stringResource(C25550R.string.chart_settings_benchmarks_empty_cta, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        String str = strStringResource;
                        if (z) {
                            composer2.startReplaceGroup(1085088834);
                            BenchmarksSection7 benchmarksSection7 = callbacks;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(benchmarksSection7);
                            objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new BenchmarksSection4(benchmarksSection7);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                        } else {
                            composer2.startReplaceGroup(1085116765);
                            BenchmarksSection7 benchmarksSection72 = callbacks;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(benchmarksSection72);
                            objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new BenchmarksSection5(benchmarksSection72);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                        }
                        KFunction kFunction = (KFunction) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) kFunction, str, modifierM5146paddingqDBjuR0$default, null, null, false, null, composer2, 0, 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(546961610);
                for (PerformanceChartBenchmarkV2 performanceChartBenchmarkV2 : settings.getBenchmarks()) {
                    List<PerformanceChartBenchmarkV2> benchmarks = settings.getBenchmarks();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : benchmarks) {
                        if (((PerformanceChartBenchmarkV2) obj).isSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((PerformanceChartBenchmarkV2) it.next()).getSymbol());
                    }
                    ImmutableSet immutableSet = extensions2.toImmutableSet(arrayList2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = (i2 & 896) == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks));
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new BenchmarksSection6(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BenchmarkRow(performanceChartBenchmarkV2, immutableSet, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BenchmarksSection.BenchmarksSection$lambda$4(settings, z, callbacks, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderRow(Modifier modifier, final boolean z, final boolean z2, final BenchmarksSection7 benchmarksSection7, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2120249222);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(benchmarksSection7) : composerStartRestartGroup.changedInstance(benchmarksSection7) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2120249222, i3, -1, "com.robinhood.android.portfolio.performanceChartSettings.HeaderRow (BenchmarksSection.kt:97)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i5 = i3 & 7168;
            boolean z3 = i5 == 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(benchmarksSection7));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarksSection.HeaderRow$lambda$10$lambda$6$lambda$5(benchmarksSection7);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.BUTTON, "returns-comparison-faq-icon-button", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), "returns-comparison-faq-icon-button");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            int i6 = i3;
            Modifier modifier5 = modifier4;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25550R.string.chart_settings_benchmarks_header, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierAlign = row6.align(companion3, companion.getCenterVertically());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), StringResources_androidKt.stringResource(C25550R.string.chart_settings_benchmarks_header_info, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1409934828);
                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C25550R.string.chart_settings_benchmarks_header_new, composerStartRestartGroup, 0), null, Integer.valueOf(new BentoIcon4.Size12(ServerToBentoAssetMapper2.STAR_FILLED_12).getAsset().getResourceId()), null, null, false, null, null, composerStartRestartGroup, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1409643366);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.LINK_BUTTON, "returns-comparison-edit", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                String strStringResource = StringResources_androidKt.stringResource(C25550R.string.chart_settings_benchmarks_header_edit, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z4 = i5 == 2048 || ((i6 & 4096) != 0 && composerStartRestartGroup.changedInstance(benchmarksSection7));
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BenchmarksSection.HeaderRow$lambda$10$lambda$9$lambda$8(benchmarksSection7);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, strStringResource, modifierAutoLogEvents$default, null, null, false, null, composerStartRestartGroup, 0, 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1408968744);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarksSection.HeaderRow$lambda$11(modifier3, z, z2, benchmarksSection7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderRow$lambda$10$lambda$6$lambda$5(BenchmarksSection7 benchmarksSection7) {
        benchmarksSection7.onShowFaq();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderRow$lambda$10$lambda$9$lambda$8(BenchmarksSection7 benchmarksSection7) {
        benchmarksSection7.onEditBenchmarks();
        return Unit.INSTANCE;
    }

    private static final void BenchmarkRow(final PerformanceChartBenchmarkV2 performanceChartBenchmarkV2, final ImmutableSet<String> immutableSet, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-655627549);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(performanceChartBenchmarkV2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(immutableSet) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-655627549, i2, -1, "com.robinhood.android.portfolio.performanceChartSettings.BenchmarkRow (BenchmarksSection.kt:166)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            BentoToggleRowState.Start.Icon icon = new BentoToggleRowState.Start.Icon(ServerToBentoAssetMapper2.CHART_LINE_24, SduiColors2.toComposeColor(performanceChartBenchmarkV2.getColor(), composerStartRestartGroup, 0), null);
            String symbol = performanceChartBenchmarkV2.getSymbol();
            String displayValue = performanceChartBenchmarkV2.getDisplayValue();
            boolean zIsSelected = performanceChartBenchmarkV2.isSelected();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(performanceChartBenchmarkV2) | ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarksSection.BenchmarkRow$lambda$13$lambda$12(function1, performanceChartBenchmarkV2, immutableSet, current, userInteractionEventDescriptor, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoToggleRow3.BentoToggleRow(icon, symbol, displayValue, false, zIsSelected, null, false, null, (Function1) objRememberedValue, composer2, BentoToggleRowState.Start.Icon.$stable, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.performanceChartSettings.BenchmarksSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarksSection.BenchmarkRow$lambda$14(performanceChartBenchmarkV2, immutableSet, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkRow$lambda$13$lambda$12(Function1 function1, PerformanceChartBenchmarkV2 performanceChartBenchmarkV2, ImmutableSet immutableSet, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z) {
        Set setPlus;
        function1.invoke(performanceChartBenchmarkV2.getId());
        if (performanceChartBenchmarkV2.isSelected()) {
            setPlus = SetsKt.minus(immutableSet, performanceChartBenchmarkV2.getSymbol());
        } else {
            setPlus = SetsKt.plus(immutableSet, performanceChartBenchmarkV2.getSymbol());
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, performanceChartBenchmarkV2.isSelected() ? UserInteractionEventData.Action.TOGGLE_OFF : UserInteractionEventData.Action.TOGGLE_ON, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.TOGGLE, "symbol-toggle", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ReturnsComparisonContext(performanceChartBenchmarkV2.getSymbol(), CollectionsKt.joinToString$default(setPlus, ",", null, null, 0, null, null, 62, null), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1073741825, -1, -1, 16383, null), false, 40, null);
        return Unit.INSTANCE;
    }
}
