package com.robinhood.android.dashboard.lib.chart;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboard.lib.header.brokerage.BrokerageAccountHeader;
import com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponent;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.performancechart.PerformanceChartComposable;
import com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DashboardChart.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"DashboardPerformanceChart", "", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "isEmbedded", "", "showFxTooltip", "modifier", "Landroidx/compose/ui/Modifier;", "highlightBigNumberForFtux", "highlightChartForFtux", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;ZZLandroidx/compose/ui/Modifier;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;II)V", "DashboardChart", "state", "Lcom/robinhood/models/home/component/DashboardComponent$Chart;", "duxo", "Lcom/robinhood/android/dashboard/lib/chart/DashboardChartDuxo;", "(Lcom/robinhood/models/home/component/DashboardComponent$Chart;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/chart/DashboardChartDuxo;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "viewState", "Lcom/robinhood/android/dashboard/lib/chart/DashboardChartViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.chart.DashboardChartKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardChart4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardChart$lambda$5(DashboardComponent.Chart chart, boolean z, Modifier modifier, DashboardChartDuxo dashboardChartDuxo, Boolean bool, Boolean bool2, int i, int i2, Composer composer, int i3) {
        DashboardChart(chart, z, modifier, dashboardChartDuxo, bool, bool2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardPerformanceChart$lambda$1(HomeDashboardType homeDashboardType, boolean z, boolean z2, Modifier modifier, Boolean bool, Boolean bool2, int i, int i2, Composer composer, int i3) {
        DashboardPerformanceChart(homeDashboardType, z, z2, modifier, bool, bool2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardPerformanceChart(final HomeDashboardType homeDashboardType, final boolean z, final boolean z2, Modifier modifier, Boolean bool, Boolean bool2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Boolean bool3;
        int i5;
        Boolean bool4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        final Boolean bool5;
        final Boolean bool6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1937381135);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(homeDashboardType) ? 4 : 2) | i;
        } else {
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
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    bool3 = bool;
                    i3 |= composerStartRestartGroup.changed(bool3) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        bool4 = bool2;
                        i3 |= composerStartRestartGroup.changed(bool4) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        Boolean bool7 = i4 == 0 ? null : bool3;
                        Boolean bool8 = i5 == 0 ? null : bool4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1937381135, i3, -1, "com.robinhood.android.dashboard.lib.chart.DashboardPerformanceChart (DashboardChart.kt:31)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        PerformanceChartComposable.PerformanceChartComposable(homeDashboardType.getAccountNumber(), PerformanceChartType.HISTORICAL_PORTFOLIO, null, modifier2, z2, null, z2 ? DashboardChart.INSTANCE.m13200getLambda$551656420$lib_account_home_externalDebug() : null, null, false, ComposableLambda3.rememberComposableLambda(-671318415, true, new Function4<Row5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$DashboardPerformanceChart$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, String str, Composer composer2, Integer num) {
                                invoke(row5, str, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 PerformanceChartComposable, String str, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                                if ((i7 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-671318415, i7, -1, "com.robinhood.android.dashboard.lib.chart.DashboardPerformanceChart.<anonymous>.<anonymous> (DashboardChart.kt:49)");
                                }
                                if (z) {
                                    UpsellPillComponent.UpsellPillComponent(homeDashboardType, null, null, null, composer2, 0, 14);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, null, bool7, bool8, composerStartRestartGroup, (i3 & 7168) | 805306800 | ((i3 << 6) & 57344), i3 & 516096, 15776);
                        Modifier modifier4 = modifier2;
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        bool5 = bool7;
                        bool6 = bool8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        bool5 = bool3;
                        bool6 = bool4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DashboardChart4.DashboardPerformanceChart$lambda$1(homeDashboardType, z, z2, modifier3, bool5, bool6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                bool4 = bool2;
                if ((74899 & i3) == 74898) {
                    if (i6 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        PerformanceChartComposable.PerformanceChartComposable(homeDashboardType.getAccountNumber(), PerformanceChartType.HISTORICAL_PORTFOLIO, null, modifier2, z2, null, z2 ? DashboardChart.INSTANCE.m13200getLambda$551656420$lib_account_home_externalDebug() : null, null, false, ComposableLambda3.rememberComposableLambda(-671318415, true, new Function4<Row5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$DashboardPerformanceChart$1$1
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, String str, Composer composer2, Integer num) {
                                invoke(row5, str, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 PerformanceChartComposable, String str, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                                if ((i7 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-671318415, i7, -1, "com.robinhood.android.dashboard.lib.chart.DashboardPerformanceChart.<anonymous>.<anonymous> (DashboardChart.kt:49)");
                                }
                                if (z) {
                                    UpsellPillComponent.UpsellPillComponent(homeDashboardType, null, null, null, composer2, 0, 14);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, null, bool7, bool8, composerStartRestartGroup, (i3 & 7168) | 805306800 | ((i3 << 6) & 57344), i3 & 516096, 15776);
                        Modifier modifier42 = modifier2;
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        bool5 = bool7;
                        bool6 = bool8;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            bool3 = bool;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            bool4 = bool2;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        bool3 = bool;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        bool4 = bool2;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardChart(final DashboardComponent.Chart state, final boolean z, Modifier modifier, DashboardChartDuxo dashboardChartDuxo, Boolean bool, Boolean bool2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DashboardChartDuxo dashboardChartDuxo2;
        int i4;
        Boolean bool3;
        int i5;
        Boolean bool4;
        Boolean bool5;
        int i6;
        final Boolean bool6;
        DashboardChartDuxo dashboardChartDuxo3;
        Modifier modifier3;
        Boolean bool7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Continuation continuation;
        SortingHatQueryArgs sortingHatQuery;
        Boolean bool8;
        Boolean bool9;
        DashboardChartDuxo dashboardChartDuxo4;
        Modifier modifier4;
        int i7;
        Continuation continuation2;
        DashboardComponent.Chart chart;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier5;
        final DashboardChartDuxo dashboardChartDuxo5;
        final Boolean bool10;
        final Boolean bool11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1824487556);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    dashboardChartDuxo2 = dashboardChartDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(dashboardChartDuxo2) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    dashboardChartDuxo2 = dashboardChartDuxo;
                }
                i3 |= i9;
            } else {
                dashboardChartDuxo2 = dashboardChartDuxo;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    bool3 = bool;
                    i3 |= composerStartRestartGroup.changed(bool3) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        bool4 = bool2;
                        i3 |= composerStartRestartGroup.changed(bool4) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier6 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 8) == 0) {
                                String str = state.getDashboardType().getKey() + "_chart";
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardChartDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$DashboardChart$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$DashboardChart$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                DashboardChartDuxo dashboardChartDuxo6 = (DashboardChartDuxo) baseDuxo;
                                i3 &= -7169;
                                bool5 = null;
                                dashboardChartDuxo2 = dashboardChartDuxo6;
                            } else {
                                bool5 = null;
                            }
                            i6 = i3;
                            bool6 = i4 == 0 ? bool5 : bool;
                            dashboardChartDuxo3 = dashboardChartDuxo2;
                            modifier3 = modifier6;
                            bool7 = i5 == 0 ? bool5 : bool2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            dashboardChartDuxo3 = dashboardChartDuxo2;
                            bool7 = bool4;
                            i6 = i3;
                            modifier3 = modifier2;
                            bool6 = bool3;
                            bool5 = null;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1824487556, i6, -1, "com.robinhood.android.dashboard.lib.chart.DashboardChart (DashboardChart.kt:73)");
                        }
                        int i10 = i6;
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-167734253);
                        if (z) {
                            continuation = null;
                            BrokerageAccountHeader.BrokerageAccountHeader(PerformanceChartReadyComposable.highlightIfNotNull(Modifier.INSTANCE, bool6), null, composerStartRestartGroup, 0, 2);
                        } else {
                            continuation = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        sortingHatQuery = DashboardChart$lambda$2(snapshotState4CollectAsStateWithLifecycle).getSortingHatQuery();
                        if (sortingHatQuery == null) {
                            composerStartRestartGroup.startReplaceGroup(-904459528);
                            final Boolean bool12 = bool7;
                            Continuation continuation3 = continuation;
                            bool8 = bool6;
                            bool9 = bool12;
                            Composer composer3 = composerStartRestartGroup;
                            MenuOfOptionsComposableKt.MenuOfOptionsComposable(sortingHatQuery, null, null, true, ComposableLambda3.rememberComposableLambda(-97004330, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$DashboardChart$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i11) {
                                    if ((i11 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-97004330, i11, -1, "com.robinhood.android.dashboard.lib.chart.DashboardChart.<anonymous>.<anonymous> (DashboardChart.kt:89)");
                                    }
                                    DashboardChart4.DashboardPerformanceChart(state.getDashboardType(), z, DashboardChart4.DashboardChart$lambda$2(snapshotState4CollectAsStateWithLifecycle).getShowFxTooltip(), null, bool6, bool12, composer4, 0, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), DashboardChart.INSTANCE.m13199getLambda$1098060201$lib_account_home_externalDebug(), composer3, 224256, 6);
                            composer3.endReplaceGroup();
                            chart = state;
                            modifier4 = modifier3;
                            dashboardChartDuxo4 = dashboardChartDuxo3;
                            composer2 = composer3;
                            i7 = -1633490746;
                            continuation2 = continuation3;
                        } else {
                            bool8 = bool6;
                            bool9 = bool7;
                            Continuation continuation4 = continuation;
                            composerStartRestartGroup.startReplaceGroup(-903774211);
                            HomeDashboardType dashboardType = state.getDashboardType();
                            boolean showFxTooltip = DashboardChart$lambda$2(snapshotState4CollectAsStateWithLifecycle).getShowFxTooltip();
                            Modifier modifier7 = modifier3;
                            int i11 = i10 & 112;
                            dashboardChartDuxo4 = dashboardChartDuxo3;
                            modifier4 = modifier7;
                            Composer composer4 = composerStartRestartGroup;
                            i7 = -1633490746;
                            continuation2 = continuation4;
                            chart = state;
                            DashboardPerformanceChart(dashboardType, z, showFxTooltip, null, null, null, composer4, i11, 56);
                            composer2 = composer4;
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.startReplaceGroup(i7);
                        zChangedInstance = composer2.changedInstance(dashboardChartDuxo4) | composer2.changedInstance(chart);
                        objRememberedValue = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DashboardChart6(dashboardChartDuxo4, chart, continuation2);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(chart, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, i10 & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        dashboardChartDuxo5 = dashboardChartDuxo4;
                        bool10 = bool8;
                        bool11 = bool9;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        dashboardChartDuxo5 = dashboardChartDuxo2;
                        bool10 = bool3;
                        bool11 = bool4;
                        composer2 = composerStartRestartGroup;
                        chart = state;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final DashboardComponent.Chart chart2 = chart;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.chart.DashboardChartKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DashboardChart4.DashboardChart$lambda$5(chart2, z, modifier5, dashboardChartDuxo5, bool10, bool11, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                bool4 = bool2;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        i6 = i3;
                        bool6 = i4 == 0 ? bool5 : bool;
                        dashboardChartDuxo3 = dashboardChartDuxo2;
                        modifier3 = modifier6;
                        if (i5 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i6;
                        final SnapshotState4<DashboardChartViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(dashboardChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-167734253);
                            if (z) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            sortingHatQuery = DashboardChart$lambda$2(snapshotState4CollectAsStateWithLifecycle2).getSortingHatQuery();
                            if (sortingHatQuery == null) {
                            }
                            composer2.endNode();
                            composer2.startReplaceGroup(i7);
                            zChangedInstance = composer2.changedInstance(dashboardChartDuxo4) | composer2.changedInstance(chart);
                            objRememberedValue = composer2.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new DashboardChart6(dashboardChartDuxo4, chart, continuation2);
                                composer2.updateRememberedValue(objRememberedValue);
                                composer2.endReplaceGroup();
                                EffectsKt.LaunchedEffect(chart, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, i102 & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier5 = modifier4;
                                dashboardChartDuxo5 = dashboardChartDuxo4;
                                bool10 = bool8;
                                bool11 = bool9;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            bool3 = bool;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            bool4 = bool2;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        bool3 = bool;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        bool4 = bool2;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DashboardChartViewState DashboardChart$lambda$2(SnapshotState4<DashboardChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
