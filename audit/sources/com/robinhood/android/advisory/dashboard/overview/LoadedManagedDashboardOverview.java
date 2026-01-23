package com.robinhood.android.advisory.dashboard.overview;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcher4;
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewViewState;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartState;
import com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.tooltips.popup.PopupPositioning;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: LoadedManagedDashboardOverview.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a`\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0091\u0001\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00142\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\r0\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\r0\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010 \u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#\"\u001a\u0010$\u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b$\u0010!\u0012\u0004\b%\u0010#\"\u001a\u0010&\u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b&\u0010!\u0012\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010!¨\u00062²\u0006\u000e\u0010*\u001a\u00020)8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020+8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020+8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010.\u001a\u00020+8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020+8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00101\u001a\u0004\u0018\u0001008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "activeIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewChartState;", "charts", "", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "ManagedOverviewContentContainer", "(ILkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState$Loaded;", "state", "Lkotlin/Function1;", "onPerformanceChartSpanSelected", "onReturnsChartSpanSelected", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "onReturnsChartBarSelected", "Lkotlin/Function0;", "onTogglePrivacy", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "onCursorDataChanged", "onReturnsChartShown", "LoadedManagedDashboardOverview", "(Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState$Loaded;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PerformanceChartTestTag", "Ljava/lang/String;", "getPerformanceChartTestTag$annotations", "()V", "PortfolioBreakdownTestTag", "getPortfolioBreakdownTestTag$annotations", "ReturnsChartTestTag", "getReturnsChartTestTag$annotations", "LOGGING_IDENTIFIER_BREAKDOWN_BOTTOM_SHEET", "Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "activeChartType", "", "returnsBreakdownIsOpen", "returnsTimeRangeTooltipIsVisible", "isExpanded", "hasInteracted", "Lkotlinx/coroutines/Job;", "collapseJob", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LoadedManagedDashboardOverview {
    public static final String LOGGING_IDENTIFIER_BREAKDOWN_BOTTOM_SHEET = "advisory_performance_breakdown";
    public static final String PerformanceChartTestTag = "managed_performance_chart";
    public static final String PortfolioBreakdownTestTag = "managed_portfolio_breakdown";
    public static final String ReturnsChartTestTag = "managed_returns_chart";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedManagedDashboardOverview$lambda$33(ManagedDashboardOverviewViewState.Loaded loaded, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedManagedDashboardOverview(loaded, function1, function12, function13, function0, function14, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$0(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$1(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$2(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$3(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagedOverviewContentContainer$lambda$6(int i, ImmutableList immutableList, String str, Modifier modifier, Alignment alignment, Function4 function4, int i2, int i3, Composer composer, int i4) {
        ManagedOverviewContentContainer(i, immutableList, str, modifier, alignment, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPerformanceChartTestTag$annotations() {
    }

    public static /* synthetic */ void getPortfolioBreakdownTestTag$annotations() {
    }

    public static /* synthetic */ void getReturnsChartTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagedOverviewContentContainer(final int i, final ImmutableList<? extends ManagedDashboardOverviewChartState> charts, final String label, Modifier modifier, Alignment alignment, final Function4<? super AnimatedContentScope, ? super ManagedDashboardOverviewChartState, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        int i5;
        Alignment alignment2;
        Object objRememberedValue;
        final Alignment alignment3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(charts, "charts");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1530174364);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(charts) : composerStartRestartGroup.changedInstance(charts) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(label) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    alignment2 = alignment;
                    i4 |= composerStartRestartGroup.changed(alignment2) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
                }
                if ((74899 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1530174364, i4, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedOverviewContentContainer (LoadedManagedDashboardOverview.kt:78)");
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LoadedManagedDashboardOverview.ManagedOverviewContentContainer$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i7 = (i4 & 14) | 1573248 | ((i4 >> 6) & 112) | ((i4 >> 3) & 7168) | ((i4 << 6) & 57344);
                    Modifier modifier4 = modifier3;
                    Alignment alignment4 = topStart;
                    AnimatedContentKt.AnimatedContent(numValueOf, modifier4, (Function1) objRememberedValue, alignment4, label, null, ComposableLambda3.rememberComposableLambda(1111855974, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt.ManagedOverviewContentContainer.2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer2, Integer num2) {
                            invoke(animatedContentScope, num.intValue(), composer2, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, int i8, Composer composer2, int i9) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1111855974, i9, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedOverviewContentContainer.<anonymous> (LoadedManagedDashboardOverview.kt:92)");
                            }
                            content.invoke(AnimatedContent, charts.get(i8), composer2, Integer.valueOf(i9 & 14));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, i7, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    alignment3 = alignment4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    alignment3 = alignment2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LoadedManagedDashboardOverview.ManagedOverviewContentContainer$lambda$6(i, charts, label, modifier2, alignment3, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            alignment2 = alignment;
            if ((i3 & 32) != 0) {
            }
            if ((74899 & i4) != 74898) {
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Integer numValueOf2 = Integer.valueOf(i);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i72 = (i4 & 14) | 1573248 | ((i4 >> 6) & 112) | ((i4 >> 3) & 7168) | ((i4 << 6) & 57344);
                Modifier modifier42 = modifier3;
                Alignment alignment42 = topStart;
                AnimatedContentKt.AnimatedContent(numValueOf2, modifier42, (Function1) objRememberedValue, alignment42, label, null, ComposableLambda3.rememberComposableLambda(1111855974, true, new Function4<AnimatedContentScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt.ManagedOverviewContentContainer.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Integer num, Composer composer2, Integer num2) {
                        invoke(animatedContentScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, int i8, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1111855974, i9, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedOverviewContentContainer.<anonymous> (LoadedManagedDashboardOverview.kt:92)");
                        }
                        content.invoke(AnimatedContent, charts.get(i8), composer2, Integer.valueOf(i9 & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, i72, 32);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                alignment3 = alignment42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        if ((i3 & 32) != 0) {
        }
        if ((74899 & i4) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform ManagedOverviewContentContainer$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Number) AnimatedContent.getTargetState()).intValue() > ((Number) AnimatedContent.getInitialState()).intValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(LoadedManagedDashboardOverview.ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$0(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(LoadedManagedDashboardOverview.ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$1(((Integer) obj).intValue()));
                }
            }, 1, null));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(LoadedManagedDashboardOverview.ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$2(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(LoadedManagedDashboardOverview.ManagedOverviewContentContainer$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadedManagedDashboardOverview$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadedManagedDashboardOverview$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean LoadedManagedDashboardOverview$lambda$19(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadedManagedDashboardOverview$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Job LoadedManagedDashboardOverview$lambda$25(SnapshotState<Job> snapshotState) {
        return snapshotState.getValue();
    }

    private static final AdvisoryChartSwitcher LoadedManagedDashboardOverview$lambda$9(SnapshotState<AdvisoryChartSwitcher> snapshotState) {
        return snapshotState.getValue();
    }

    public static final void LoadedManagedDashboardOverview(final ManagedDashboardOverviewViewState.Loaded state, final Function1<? super String, Unit> onPerformanceChartSpanSelected, final Function1<? super String, Unit> onReturnsChartSpanSelected, final Function1<? super ManagedReturnsChartState.ReturnsBar, Unit> onReturnsChartBarSelected, final Function0<Unit> onTogglePrivacy, final Function1<? super CursorData, Unit> onCursorDataChanged, final Function0<Unit> onReturnsChartShown, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        final CoroutineScope coroutineScope;
        boolean z;
        SnapshotState snapshotState;
        int i6;
        final SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        int i7;
        final SnapshotState snapshotState4;
        final Modifier modifier3;
        SnapshotState snapshotState5;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPerformanceChartSpanSelected, "onPerformanceChartSpanSelected");
        Intrinsics.checkNotNullParameter(onReturnsChartSpanSelected, "onReturnsChartSpanSelected");
        Intrinsics.checkNotNullParameter(onReturnsChartBarSelected, "onReturnsChartBarSelected");
        Intrinsics.checkNotNullParameter(onTogglePrivacy, "onTogglePrivacy");
        Intrinsics.checkNotNullParameter(onCursorDataChanged, "onCursorDataChanged");
        Intrinsics.checkNotNullParameter(onReturnsChartShown, "onReturnsChartShown");
        Composer composerStartRestartGroup = composer.startRestartGroup(97454620);
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
            i3 |= composerStartRestartGroup.changedInstance(onPerformanceChartSpanSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReturnsChartSpanSelected) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReturnsChartBarSelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTogglePrivacy) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCursorDataChanged) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReturnsChartShown) ? 1048576 : 524288;
        }
        int i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i8 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(97454620, i3, -1, "com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview (LoadedManagedDashboardOverview.kt:106)");
            }
            int i9 = i3;
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$8$lambda$7(state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier4 = modifier2;
            final SnapshotState snapshotState6 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            Iterator<ManagedDashboardOverviewChartState> it = state.getAvailableCharts().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else {
                    if (it.next().getType() == LoadedManagedDashboardOverview$lambda$9(snapshotState6)) {
                        i4 = i10;
                        break;
                    }
                    i10++;
                }
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState7 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                objRememberedValue3 = snapshotStateMutableStateOf$default;
            }
            final SnapshotState snapshotState8 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            SnapshotState snapshotState9 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                i5 = 2;
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                i5 = 2;
            }
            SnapshotState snapshotState10 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotState3.mutableStateOf$default(null, null, i5, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            SnapshotState snapshotState11 = (SnapshotState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue7;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
            String defaultValueText = state.getDefaultValueText();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i11 = BentoTheme.$stable;
            ChartCursorDataHeaderKt.ChartCursorDataHeader(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, new CursorData.DisplayText(defaultValueText, bentoTheme.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU(), null, null), state.getHasPrivacy(), false, false, null, onTogglePrivacy, null, composerStartRestartGroup, (CursorData.DisplayText.$stable << 3) | ((i9 << 6) & 3670016), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            int i12 = i4;
            ManagedOverviewContentContainer(i12, state.getAvailableCharts(), "managed_account_sub_header_data_transition", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(Row6.INSTANCE, companion4, 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, ComposableLambda3.rememberComposableLambda(-1845576419, true, new Function4<AnimatedContentScope, ManagedDashboardOverviewChartState, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ManagedDashboardOverviewChartState managedDashboardOverviewChartState, Composer composer2, Integer num) {
                    invoke(animatedContentScope, managedDashboardOverviewChartState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope ManagedOverviewContentContainer, ManagedDashboardOverviewChartState chartState, Composer composer2, int i13) {
                    com.robinhood.android.charts.cursor.CursorData cursorDataBolded;
                    Intrinsics.checkNotNullParameter(ManagedOverviewContentContainer, "$this$ManagedOverviewContentContainer");
                    Intrinsics.checkNotNullParameter(chartState, "chartState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1845576419, i13, -1, "com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview.<anonymous>.<anonymous>.<anonymous> (LoadedManagedDashboardOverview.kt:152)");
                    }
                    if (chartState instanceof PortfolioBreakdownState) {
                        composer2.startReplaceGroup(-1690628964);
                        BentoText2.m20747BentoText38GnDrw(((PortfolioBreakdownState) chartState).getPortfolioBreakdownDescription(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), null, null, null, null, null, 0, false, 0, 2, null, 0, null, composer2, 0, 6, 15356);
                        composer2.endReplaceGroup();
                    } else {
                        if (chartState instanceof ManagedPerformanceChartState) {
                            composer2.startReplaceGroup(-1690140373);
                            com.robinhood.models.serverdriven.experimental.api.CursorData defaultDisplay = ((ManagedPerformanceChartState) chartState).getModel().getDefaultDisplay();
                            com.robinhood.models.serverdriven.experimental.api.CursorData activeCursorData = state.getActiveCursorData();
                            if (activeCursorData != null) {
                                defaultDisplay = activeCursorData;
                            }
                            composer2.startReplaceGroup(222577776);
                            com.robinhood.android.charts.cursor.CursorData composableModel = defaultDisplay == null ? null : SduiCursorData2.toComposableModel(defaultDisplay, composer2, 0);
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(222579365);
                            cursorDataBolded = composableModel != null ? CursorDataExtensions.bolded(composableModel, composer2, com.robinhood.android.charts.cursor.CursorData.$stable) : null;
                            composer2.endReplaceGroup();
                            ChartCursorDataHeaderKt.ChartCursorDataSubheader(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), null, null, null, cursorDataBolded, false, ComposableLambda3.rememberComposableLambda(-1978265070, true, new AnonymousClass1(state, snapshotState7), composer2, 54), false, false, composer2, (com.robinhood.android.charts.cursor.CursorData.$stable << 12) | 1572864, 430);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(chartState instanceof ManagedReturnsChartState)) {
                                composer2.startReplaceGroup(222560929);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1688310102);
                            com.robinhood.models.serverdriven.experimental.api.CursorData defaultCursorData = ((ManagedReturnsChartState) chartState).getDefaultCursorData();
                            composer2.startReplaceGroup(222632560);
                            com.robinhood.android.charts.cursor.CursorData composableModel2 = defaultCursorData == null ? null : SduiCursorData2.toComposableModel(defaultCursorData, composer2, 0);
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(222634149);
                            cursorDataBolded = composableModel2 != null ? CursorDataExtensions.bolded(composableModel2, composer2, com.robinhood.android.charts.cursor.CursorData.$stable) : null;
                            composer2.endReplaceGroup();
                            ChartCursorDataHeaderKt.ChartCursorDataSubheader(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), null, null, null, cursorDataBolded, false, ComposableLambda3.rememberComposableLambda(2096921619, true, new AnonymousClass2(chartState, cursorDataBolded, snapshotState8), composer2, 54), false, false, composer2, (com.robinhood.android.charts.cursor.CursorData.$stable << 12) | 1572864, 430);
                            composer2.endReplaceGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: LoadedManagedDashboardOverview.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<Row5, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<Boolean> $returnsBreakdownIsOpen$delegate;
                    final /* synthetic */ ManagedDashboardOverviewViewState.Loaded $state;

                    AnonymousClass1(ManagedDashboardOverviewViewState.Loaded loaded, SnapshotState<Boolean> snapshotState) {
                        this.$state = loaded;
                        this.$returnsBreakdownIsOpen$delegate = snapshotState;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                        invoke(row5, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 ChartCursorDataSubheader, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(ChartCursorDataSubheader, "$this$ChartCursorDataSubheader");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1978265070, i, -1, "com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadedManagedDashboardOverview.kt:171)");
                        }
                        if (this.$state.getShowReturnsBreakdownIcon()) {
                            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16);
                            String strStringResource = StringResources_androidKt.stringResource(C8626R.string.returns_breakdown_title, composer, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU();
                            Modifier modifierClip = Clip.clip(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(1), 6, null), RoundedCornerShape2.getCircleShape());
                            composer.startReplaceGroup(5004770);
                            final SnapshotState<Boolean> snapshotState = this.$returnsBreakdownIsOpen$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007d: CONSTRUCTOR (r14v6 'objRememberedValue' java.lang.Object) = (r12v14 'snapshotState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE]) A[MD:(androidx.compose.runtime.MutableState):void (m)] (LINE:187) call: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1.1.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 31 more
                                    */
                                /*
                                    this = this;
                                    java.lang.String r0 = "$this$ChartCursorDataSubheader"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                                    r12 = r14 & 17
                                    r0 = 16
                                    if (r12 != r0) goto L16
                                    boolean r12 = r13.getSkipping()
                                    if (r12 != 0) goto L12
                                    goto L16
                                L12:
                                    r13.skipToGroupEnd()
                                    return
                                L16:
                                    boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r12 == 0) goto L25
                                    r12 = -1
                                    java.lang.String r0 = "com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadedManagedDashboardOverview.kt:171)"
                                    r1 = -1978265070(0xffffffff8a161212, float:-7.225636E-33)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r1, r14, r12, r0)
                                L25:
                                    com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewViewState$Loaded r12 = r11.$state
                                    boolean r12 = r12.getShowReturnsBreakdownIcon()
                                    if (r12 == 0) goto L9c
                                    com.robinhood.compose.bento.component.BentoIcons$Size16 r0 = new com.robinhood.compose.bento.component.BentoIcons$Size16
                                    com.robinhood.android.libdesignsystem.serverui.IconAsset r12 = com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2.INFO_16
                                    r0.<init>(r12)
                                    int r12 = com.robinhood.android.advisory.dashboard.C8626R.string.returns_breakdown_title
                                    r14 = 0
                                    java.lang.String r1 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r12, r13, r14)
                                    com.robinhood.compose.bento.theme.BentoTheme r12 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                    int r14 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                    com.robinhood.compose.bento.theme.BentoColors r2 = r12.getColors(r13, r14)
                                    long r2 = r2.m21368getAccent0d7_KjU()
                                    androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p011ui.Modifier.INSTANCE
                                    com.robinhood.compose.bento.theme.BentoSpacing r12 = r12.getSpacing(r13, r14)
                                    float r5 = r12.m21595getXsmallD9Ej5fM()
                                    r12 = 1
                                    float r12 = (float) r12
                                    float r8 = androidx.compose.p011ui.unit.C2002Dp.m7995constructorimpl(r12)
                                    r9 = 6
                                    r10 = 0
                                    r6 = 0
                                    r7 = 0
                                    androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r4, r5, r6, r7, r8, r9, r10)
                                    androidx.compose.foundation.shape.RoundedCornerShape r14 = androidx.compose.foundation.shape.RoundedCornerShape2.getCircleShape()
                                    androidx.compose.ui.Modifier r4 = androidx.compose.p011ui.draw.Clip.clip(r12, r14)
                                    r12 = 5004770(0x4c5de2, float:7.013177E-39)
                                    r13.startReplaceGroup(r12)
                                    androidx.compose.runtime.MutableState<java.lang.Boolean> r12 = r11.$returnsBreakdownIsOpen$delegate
                                    java.lang.Object r14 = r13.rememberedValue()
                                    androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r5 = r5.getEmpty()
                                    if (r14 != r5) goto L83
                                    com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$1$$ExternalSyntheticLambda0 r14 = new com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$1$$ExternalSyntheticLambda0
                                    r14.<init>(r12)
                                    r13.updateRememberedValue(r14)
                                L83:
                                    r8 = r14
                                    kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
                                    r13.endReplaceGroup()
                                    r9 = 7
                                    r10 = 0
                                    r5 = 0
                                    r6 = 0
                                    r7 = 0
                                    androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ClickableKt.m4893clickableXHw0xAI$default(r4, r5, r6, r7, r8, r9, r10)
                                    int r8 = com.robinhood.compose.bento.component.BentoIcon4.Size16.$stable
                                    r9 = 48
                                    r5 = 0
                                    r6 = 0
                                    r7 = r13
                                    com.robinhood.compose.bento.component.BentoIcon2.m20644BentoIconFU0evQE(r0, r1, r2, r4, r5, r6, r7, r8, r9)
                                L9c:
                                    boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r12 == 0) goto La5
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                La5:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview2.AnonymousClass1.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$14(snapshotState, true);
                                return Unit.INSTANCE;
                            }
                        }

                        /* compiled from: LoadedManagedDashboardOverview.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                            final /* synthetic */ ManagedDashboardOverviewChartState $chartState;
                            final /* synthetic */ SnapshotState<Boolean> $returnsTimeRangeTooltipIsVisible$delegate;
                            final /* synthetic */ com.robinhood.android.charts.cursor.CursorData $uiCursorData;

                            AnonymousClass2(ManagedDashboardOverviewChartState managedDashboardOverviewChartState, com.robinhood.android.charts.cursor.CursorData cursorData, SnapshotState<Boolean> snapshotState) {
                                this.$chartState = managedDashboardOverviewChartState;
                                this.$uiCursorData = cursorData;
                                this.$returnsTimeRangeTooltipIsVisible$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                invoke(row5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 ChartCursorDataSubheader, Composer composer, int i) {
                                CursorData.SubDisplayText secondaryValue;
                                CursorData.IconDisplayText main;
                                Intrinsics.checkNotNullParameter(ChartCursorDataSubheader, "$this$ChartCursorDataSubheader");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2096921619, i, -1, "com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadedManagedDashboardOverview.kt:202)");
                                }
                                String learnMore = ((ManagedReturnsChartState) this.$chartState).getLearnMore();
                                if (learnMore != null && learnMore.length() != 0) {
                                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16);
                                    String strStringResource = StringResources_androidKt.stringResource(C8626R.string.returns_chart_subheader_info_icon_description, composer, 0);
                                    com.robinhood.android.charts.cursor.CursorData cursorData = this.$uiCursorData;
                                    Color colorM6701boximpl = (cursorData == null || (secondaryValue = cursorData.getSecondaryValue()) == null || (main = secondaryValue.getMain()) == null) ? null : Color.m6701boximpl(main.m12002getColor0d7_KjU());
                                    composer.startReplaceGroup(802032484);
                                    long jM21368getAccent0d7_KjU = colorM6701boximpl == null ? BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU() : colorM6701boximpl.getValue();
                                    composer.endReplaceGroup();
                                    long jM12177orStaleek8zF_U = StaleState2.m12177orStaleek8zF_U(jM21368getAccent0d7_KjU, composer, 0);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierClip = Clip.clip(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, C2002Dp.m7995constructorimpl(1), 6, null), RoundedCornerShape2.getCircleShape());
                                    boolean zLoadedManagedDashboardOverview$lambda$16 = LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$16(this.$returnsTimeRangeTooltipIsVisible$delegate);
                                    PopupPositioning popupPositioning = PopupPositioning.BELOW;
                                    float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM();
                                    Boolean boolValueOf = Boolean.valueOf(zLoadedManagedDashboardOverview$lambda$16);
                                    composer.startReplaceGroup(5004770);
                                    final SnapshotState<Boolean> snapshotState = this.$returnsTimeRangeTooltipIsVisible$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion2 = Composer.INSTANCE;
                                    if (objRememberedValue == companion2.getEmpty()) {
                                        objRememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d5: CONSTRUCTOR (r9v9 'objRememberedValue' java.lang.Object) = (r6v1 'snapshotState' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE]) A[MD:(androidx.compose.runtime.MutableState):void (m)] (LINE:224) call: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$2$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1.2.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
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
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 31 more
                                            */
                                        /*
                                            Method dump skipped, instructions count: 330
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview2.AnonymousClass2.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
                                        LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$17(snapshotState, false);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
                                        LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$17(snapshotState, true);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 196992, 16);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.startReplaceGroup(1522287613);
                            if (state.getAvailableCharts().size() > 1) {
                                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 11, null);
                                ImmutableList<ManagedDashboardOverviewChartState> availableCharts = state.getAvailableCharts();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(availableCharts, 10));
                                for (ManagedDashboardOverviewChartState managedDashboardOverviewChartState : availableCharts) {
                                    arrayList.add(new AdvisoryChartSwitcher4.Chart(managedDashboardOverviewChartState.getType(), managedDashboardOverviewChartState.getShowUnreadIndicator()));
                                }
                                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                                boolean zLoadedManagedDashboardOverview$lambda$19 = LoadedManagedDashboardOverview$lambda$19(snapshotState9);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChanged = composerStartRestartGroup.changed(snapshotState6) | composerStartRestartGroup.changedInstance(state) | ((i9 & 3670016) == 1048576) | ((i9 & 7168) == 2048) | composerStartRestartGroup.changedInstance(coroutineScope2);
                                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    coroutineScope = coroutineScope2;
                                    snapshotState5 = snapshotState10;
                                    snapshotState = snapshotState7;
                                    snapshotState2 = snapshotState9;
                                    z = true;
                                    i7 = 54;
                                    snapshotState4 = snapshotState11;
                                    Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return LoadedManagedDashboardOverview.m1731xde690e40(state, onReturnsChartShown, onReturnsChartBarSelected, snapshotState2, snapshotState6, coroutineScope, snapshotState4, ((Integer) obj).intValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function1);
                                    objRememberedValue8 = function1;
                                } else {
                                    snapshotState5 = snapshotState10;
                                    coroutineScope = coroutineScope2;
                                    snapshotState = snapshotState7;
                                    snapshotState2 = snapshotState9;
                                    z = true;
                                    i7 = 54;
                                    snapshotState4 = snapshotState11;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                i6 = -1224400529;
                                snapshotState3 = snapshotState5;
                                AdvisoryChartSwitcher2.AdvisoryDashboardSwitcher(persistentList, i12, (Function1) objRememberedValue8, modifierM5146paddingqDBjuR0$default, zLoadedManagedDashboardOverview$lambda$19, composerStartRestartGroup, 0, 0);
                                i12 = i12;
                                composerStartRestartGroup = composerStartRestartGroup;
                            } else {
                                coroutineScope = coroutineScope2;
                                z = true;
                                snapshotState = snapshotState7;
                                i6 = -1224400529;
                                snapshotState2 = snapshotState9;
                                snapshotState3 = snapshotState10;
                                i7 = 54;
                                snapshotState4 = snapshotState11;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            ImmutableList<ManagedDashboardOverviewChartState> availableCharts2 = state.getAvailableCharts();
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            Unit unit = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(i6);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope);
                            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new PointerInputEventHandler() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$2$1

                                    /* compiled from: LoadedManagedDashboardOverview.kt */
                                    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$2$1$1", m3645f = "LoadedManagedDashboardOverview.kt", m3646l = {}, m3647m = "invokeSuspend")
                                    /* renamed from: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$LoadedManagedDashboardOverview$1$2$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SnapshotState<Job> $collapseJob$delegate;
                                        final /* synthetic */ CoroutineScope $coroutineScope;
                                        final /* synthetic */ SnapshotState<Boolean> $hasInteracted$delegate;
                                        final /* synthetic */ SnapshotState<Boolean> $isExpanded$delegate;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(SnapshotState<Boolean> snapshotState, CoroutineScope coroutineScope, SnapshotState<Job> snapshotState2, SnapshotState<Boolean> snapshotState3, Continuation<? super AnonymousClass1> continuation) {
                                            super(3, continuation);
                                            this.$hasInteracted$delegate = snapshotState;
                                            this.$coroutineScope = coroutineScope;
                                            this.$collapseJob$delegate = snapshotState2;
                                            this.$isExpanded$delegate = snapshotState3;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                            return m11006invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                                        }

                                        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                        public final Object m11006invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                            return new AnonymousClass1(this.$hasInteracted$delegate, this.$coroutineScope, this.$collapseJob$delegate, this.$isExpanded$delegate, continuation).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            if (this.label == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                if (!LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$22(this.$hasInteracted$delegate)) {
                                                    LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$23(this.$hasInteracted$delegate, true);
                                                    LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$scheduleCollapse(this.$coroutineScope, this.$collapseJob$delegate, this.$isExpanded$delegate);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    }

                                    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                        Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, new AnonymousClass1(snapshotState3, coroutineScope, snapshotState4, snapshotState2, null), null, continuation, 11, null);
                                        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ManagedOverviewContentContainer(i12, availableCharts2, "managed_account_overview_transition", SuspendingPointerInputFilterKt.pointerInput(companion5, unit, (PointerInputEventHandler) objRememberedValue9), null, ComposableLambda3.rememberComposableLambda(-928185535, z, new LoadedManagedDashboardOverview4(onCursorDataChanged, onPerformanceChartSpanSelected, onReturnsChartSpanSelected, onReturnsChartBarSelected, snapshotState), composerStartRestartGroup, i7), composerStartRestartGroup, 196992, 16);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverviewKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return LoadedManagedDashboardOverview.LoadedManagedDashboardOverview$lambda$33(state, onPerformanceChartSpanSelected, onReturnsChartSpanSelected, onReturnsChartBarSelected, onTogglePrivacy, onCursorDataChanged, onReturnsChartShown, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final SnapshotState LoadedManagedDashboardOverview$lambda$8$lambda$7(ManagedDashboardOverviewViewState.Loaded loaded) {
                        return SnapshotState3.mutableStateOf$default(((ManagedDashboardOverviewChartState) CollectionsKt.first((List) loaded.getAvailableCharts())).getType(), null, 2, null);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void LoadedManagedDashboardOverview$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
                        snapshotState.setValue(Boolean.valueOf(z));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void LoadedManagedDashboardOverview$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
                        snapshotState.setValue(Boolean.valueOf(z));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void LoadedManagedDashboardOverview$lambda$20(SnapshotState<Boolean> snapshotState, boolean z) {
                        snapshotState.setValue(Boolean.valueOf(z));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void LoadedManagedDashboardOverview$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
                        snapshotState.setValue(Boolean.valueOf(z));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void LoadedManagedDashboardOverview$scheduleCollapse(CoroutineScope coroutineScope, SnapshotState<Job> snapshotState, SnapshotState<Boolean> snapshotState2) {
                        Job jobLoadedManagedDashboardOverview$lambda$25 = LoadedManagedDashboardOverview$lambda$25(snapshotState);
                        if (jobLoadedManagedDashboardOverview$lambda$25 != null) {
                            Job.DefaultImpls.cancel$default(jobLoadedManagedDashboardOverview$lambda$25, null, 1, null);
                        }
                        snapshotState.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LoadedManagedDashboardOverview5(snapshotState2, null), 3, null));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* renamed from: LoadedManagedDashboardOverview$lambda$32$lambda$30$lambda$29$lambda$28 */
                    public static final Unit m1731xde690e40(ManagedDashboardOverviewViewState.Loaded loaded, Function0 function0, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, CoroutineScope coroutineScope, SnapshotState snapshotState3, int i) {
                        if (LoadedManagedDashboardOverview$lambda$19(snapshotState)) {
                            snapshotState2.setValue(loaded.getAvailableCharts().get(i).getType());
                            if (LoadedManagedDashboardOverview$lambda$9(snapshotState2) == AdvisoryChartSwitcher.RETURNS) {
                                function0.invoke();
                            }
                            function1.invoke(null);
                        } else {
                            LoadedManagedDashboardOverview$lambda$20(snapshotState, true);
                        }
                        LoadedManagedDashboardOverview$scheduleCollapse(coroutineScope, snapshotState3, snapshotState);
                        return Unit.INSTANCE;
                    }
                }
