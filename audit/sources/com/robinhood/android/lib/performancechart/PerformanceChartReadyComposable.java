package com.robinhood.android.lib.performancechart;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.aura.DynamicChartAura;
import com.robinhood.android.aura.DynamicChartAuraState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.C10974R;
import com.robinhood.android.charts.candlestick.CandlestickLegendChart;
import com.robinhood.android.charts.candlestick.UtilKt;
import com.robinhood.android.charts.model.LegendItem;
import com.robinhood.android.charts.segmented.SegmentedLineAnimation;
import com.robinhood.android.charts.span.SpanSelector3;
import com.robinhood.android.charts.span.SpanSelector5;
import com.robinhood.android.charts.util.StaleState2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.fxswitcher.ftux.constants.FxSwitcherFtuxAnimationConstants;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.PerformanceChartSpanOption;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.contracts.PerformanceChartSettingsContract;
import com.robinhood.android.rosetta.portfolio.PerformanceChartContextExt;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.Point;
import com.robinhood.models.serverdriven.experimental.api.Segment;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceChartReadyComposable.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u008c\u0002\u0010 \u001a\u00020\u00102\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b20\u0010\u0012\u001a,\u0012\u0004\u0012\u00020\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\u0002\b\u00112!\u0010\u0015\u001a\u001d\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\u0002\b\u00112\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00100\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00002\u001b\b\u0002\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016¢\u0006\u0002\b\u00112#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\u0002\b\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b \u0010!\u001a\u001d\u0010%\u001a\u0004\u0018\u00010\u0006*\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&\u001a%\u0010+\u001a\u00060)j\u0002`*2\b\u0010'\u001a\u0004\u0018\u00010\u00142\u0006\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,\u001a)\u00100\u001a\u00020\u0000*\u00020\u00002\u0006\u0010.\u001a\u00020-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0001¢\u0006\u0004\b0\u00101\u001a5\u00108\u001a\u00020\u0010*\u0002022\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\b\u00107\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b8\u00109\u001aG\u0010>\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-2\n\u0010:\u001a\u00060)j\u0002`*2\u0006\u0010;\u001a\u00020\u00012\b\b\u0001\u0010=\u001a\u00020<2\b\b\u0002\u0010\u001b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b>\u0010?\u001a!\u0010C\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\"0@2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bC\u0010D\"\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G\"\u0014\u0010H\u001a\u00020\u00148\u0000X\u0081T¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006O²\u0006\f\u0010J\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\u0010\u0010K\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010L\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\f\u0010M\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010N\u001a\u00020<8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "isHighlighted", "highlightIfNotNull", "(Landroidx/compose/ui/Modifier;Ljava/lang/Boolean;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/AnimationSpec;", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "animationSpec", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;", "state", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/RowScope;", "Lcom/robinhood/models/util/Money;", "Lkotlin/ParameterName;", "name", "usdAmount", "", "Lkotlin/ExtensionFunctionType;", "fxTooltipContent", "Landroidx/compose/foundation/layout/ColumnScope;", "", "headerContent", "Lkotlin/Function1;", "onSpanSelected", "Lkotlin/Function0;", "onBigNumberClicked", "auraEnabled", "modifier", "trailingButtonOverride", "trailingChartValuesContent", "highlightBigNumberForFtux", "highlightChartForFtux", "PerformanceChartReadyComposable", "(Landroidx/compose/animation/core/AnimationSpec;Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;III)V", "Lcom/robinhood/models/serverdriven/experimental/api/Line;", "Lcom/robinhood/android/charts/model/Point;", "targetPoint", "getClosestHorizontalPoint", "(Lcom/robinhood/models/serverdriven/experimental/api/Line;Lcom/robinhood/android/charts/model/Point;)Lcom/robinhood/models/serverdriven/experimental/api/Point;", "span", "chartState", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "chartContext", "(Ljava/lang/String;Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;)Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "chartType", "onFocus", "chartEducationTourId", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Lcom/robinhood/android/navigation/Navigator;", "Landroid/content/Context;", "context", "accountNumber", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "launchChartSettings", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "eventContext", "showTooltip", "", "tooltipTextId", "PerformanceChartSettingsButton", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/rosetta/eventlogging/Context;ZILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "pageDirection", "lineForAura", "(Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/Direction;)Lcom/robinhood/models/serverdriven/experimental/api/Line;", "Lcom/robinhood/rosetta/eventlogging/Component;", "spanSelectorComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", PerformanceChartReadyComposable.PerformanceChartSettingsDialogTag, "Ljava/lang/String;", "isStale", "scrubPointState", "didScrub", "hasDefaultDisplayTertiaryValue", "graphHeaderHeight", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformanceChartReadyComposable {
    public static final String PerformanceChartSettingsDialogTag = "PerformanceChartSettingsDialogTag";
    private static final Component spanSelectorComponent = new Component(Component.ComponentType.SPAN_SELECTOR, null, null, 6, null);

    /* compiled from: PerformanceChartReadyComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PerformanceChartType.values().length];
            try {
                iArr[PerformanceChartType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceChartType.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartReadyComposable$lambda$6(AnimationSpec animationSpec, PerformanceChartStateProvider3.Ready ready, Function4 function4, Function4 function42, Function1 function1, Function0 function0, boolean z, Modifier modifier, Function3 function3, Function4 function43, Boolean bool, Boolean bool2, int i, int i2, int i3, Composer composer, int i4) {
        PerformanceChartReadyComposable(animationSpec, ready, function4, function42, function1, function0, z, modifier, function3, function43, bool, bool2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartSettingsButton$lambda$17(String str, PerformanceChartType performanceChartType, Context context, boolean z, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        PerformanceChartSettingsButton(str, performanceChartType, context, z, i, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final boolean PerformanceChartReadyComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final Modifier highlightIfNotNull(Modifier modifier, final Boolean bool) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt.highlightIfNotNull.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(808296924);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(808296924, i, -1, "com.robinhood.android.lib.performancechart.highlightIfNotNull.<anonymous> (PerformanceChartReadyComposable.kt:90)");
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    Object obj = FxSwitcherFtuxAnimationConstants.INSTANCE;
                    float f = bool2.booleanValue() ? 1.0f : 0.1f;
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = Animatable2.Animatable$default(1.0f, 0.0f, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Animatable animatable = (Animatable) objRememberedValue;
                    composer.endReplaceGroup();
                    Float fValueOf = Float.valueOf(f);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(obj) | composer.changedInstance(animatable) | composer.changed(f);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new PerformanceChartReadyComposable5(animatable, f, null);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                    composed = Alpha.alpha(composed, ((Number) animatable.getValue()).floatValue());
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PerformanceChartReadyComposable(final AnimationSpec<Point> animationSpec, final PerformanceChartStateProvider3.Ready state, final Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function4, final Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function42, final Function1<? super String, Unit> onSpanSelected, final Function0<Unit> onBigNumberClicked, final boolean z, Modifier modifier, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function43, Boolean bool, Boolean bool2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function44;
        int i5;
        Modifier modifier2;
        int i6;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        boolean zChanged;
        PerformanceChartModel performanceChartModel;
        final Component component;
        boolean z2;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final EventLogger eventLogger;
        final Screen screen;
        Composer composer2;
        final Boolean bool3;
        final Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function45;
        final Boolean bool4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        Intrinsics.checkNotNullParameter(onBigNumberClicked, "onBigNumberClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1450944264);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(animationSpec) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                function44 = function4;
                i4 |= composerStartRestartGroup.changedInstance(function44) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function42) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onSpanSelected) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onBigNumberClicked) ? 131072 : 65536;
                }
                if ((i3 & 64) == 0) {
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
                    }
                    i5 = i3 & 128;
                    if (i5 == 0) {
                        i4 |= 12582912;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                    }
                    i6 = i3 & 256;
                    if (i6 == 0) {
                        i4 |= 100663296;
                        function32 = function3;
                    } else {
                        function32 = function3;
                        if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                        }
                    }
                    i7 = i3 & 512;
                    if (i7 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function43) ? 536870912 : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i10 = i2 | 6;
                        i9 = i8;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (composerStartRestartGroup.changed(bool) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 == 0) {
                        i10 |= 48;
                        i12 = i11;
                    } else if ((i2 & 48) == 0) {
                        i12 = i11;
                        i10 |= composerStartRestartGroup.changed(bool2) ? 32 : 16;
                    } else {
                        i12 = i11;
                    }
                    int i13 = i10;
                    if ((i4 & 306783379) != 306783378 && (i13 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function45 = function43;
                        bool3 = bool;
                        bool4 = bool2;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                    } else {
                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i6 != 0) {
                            function32 = null;
                        }
                        Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function46 = i7 == 0 ? null : function43;
                        Boolean bool5 = i9 == 0 ? null : bool;
                        final Boolean bool6 = i12 == 0 ? null : bool2;
                        if (ComposerKt.isTraceInProgress()) {
                            modifier3 = modifier5;
                        } else {
                            modifier3 = modifier5;
                            ComposerKt.traceEventStart(1450944264, i4, i13, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable (PerformanceChartReadyComposable.kt:120)");
                        }
                        composerStartRestartGroup.startReplaceGroup(-1506909972);
                        PerformanceChartModel performanceChartModelCopy$default = animationSpec == null ? PerformanceChartModel.copy$default(state.getChartModel(), null, null, null, null, null, false, false, null, null, null, null, null, null, SegmentedLineAnimation.animateSduiLineList(extensions2.toImmutableList(state.getChartModel().getLines()), animationSpec, composerStartRestartGroup, (i4 << 3) & 112, 0), null, null, null, null, null, null, null, null, 4186111, null) : state.getChartModel();
                        composerStartRestartGroup.endReplaceGroup();
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        Screen screen2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                        PerformanceChartType chartType = state.getChartType();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(chartType.ordinal());
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            performanceChartModel = performanceChartModelCopy$default;
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            }
                            component = (Component) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z2 = (57344 & i4) == 16384;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PerformanceChartReadyComposable.PerformanceChartReadyComposable$lambda$2$lambda$1(onSpanSelected);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final Function0 function0 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            boolean zIsStale = state.isStale();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged2 = composerStartRestartGroup.changed(zIsStale);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(state.isStale()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen2) | composerStartRestartGroup.changedInstance(component) | composerStartRestartGroup.changedInstance(state);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new PerformanceChartReadyComposable2(current, screen2, component, state, null);
                                eventLogger = current;
                                screen = screen2;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                eventLogger = current;
                                screen = screen2;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(screen, component, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                            final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33 = function32;
                            final Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function47 = function44;
                            final Modifier modifier6 = modifier3;
                            final PerformanceChartModel performanceChartModel2 = performanceChartModel;
                            composer2 = composerStartRestartGroup;
                            final Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function48 = function46;
                            final Boolean bool7 = bool5;
                            StaleState2.m12176StaleStateProvider3IgeMak(PerformanceChartReadyComposable$lambda$4(snapshotState), 0L, ComposableLambda3.rememberComposableLambda(329446640, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt.PerformanceChartReadyComposable.2

                                /* compiled from: PerformanceChartReadyComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$WhenMappings */
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

                                /* compiled from: PerformanceChartReadyComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $auraEnabled;
                                    final /* synthetic */ PerformanceChartModel $chartModel;
                                    final /* synthetic */ Component $eventComponent;
                                    final /* synthetic */ EventLogger $eventLogger;
                                    final /* synthetic */ Screen $eventScreen;
                                    final /* synthetic */ Function4<Row5, Money, Composer, Integer, Unit> $fxTooltipContent;
                                    final /* synthetic */ Function4<Column5, String, Composer, Integer, Unit> $headerContent;
                                    final /* synthetic */ Boolean $highlightBigNumberForFtux;
                                    final /* synthetic */ Boolean $highlightChartForFtux;
                                    final /* synthetic */ Modifier $modifier;
                                    final /* synthetic */ Function0<Unit> $onBigNumberClicked;
                                    final /* synthetic */ Function0<Unit> $onEducationFocus;
                                    final /* synthetic */ Function1<String, Unit> $onSpanSelected;
                                    final /* synthetic */ PerformanceChartStateProvider3.Ready $state;
                                    final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $trailingButtonOverride;
                                    final /* synthetic */ Function4<Row5, String, Composer, Integer, Unit> $trailingChartValuesContent;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass1(Modifier modifier, PerformanceChartModel performanceChartModel, PerformanceChartStateProvider3.Ready ready, Function0<Unit> function0, Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function4, Function0<Unit> function02, Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function42, Boolean bool, Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function43, boolean z, Boolean bool2, EventLogger eventLogger, Screen screen, Component component, Function1<? super String, Unit> function1, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3) {
                                        this.$modifier = modifier;
                                        this.$chartModel = performanceChartModel;
                                        this.$state = ready;
                                        this.$onEducationFocus = function0;
                                        this.$headerContent = function4;
                                        this.$onBigNumberClicked = function02;
                                        this.$fxTooltipContent = function42;
                                        this.$highlightBigNumberForFtux = bool;
                                        this.$trailingChartValuesContent = function43;
                                        this.$auraEnabled = z;
                                        this.$highlightChartForFtux = bool2;
                                        this.$eventLogger = eventLogger;
                                        this.$eventScreen = screen;
                                        this.$eventComponent = component;
                                        this.$onSpanSelected = function1;
                                        this.$trailingButtonOverride = function3;
                                    }

                                    private static final com.robinhood.android.charts.model.Point invoke$lambda$25$lambda$1(SnapshotState<com.robinhood.android.charts.model.Point> snapshotState) {
                                        return snapshotState.getValue();
                                    }

                                    private static final boolean invoke$lambda$25$lambda$11(SnapshotState4<Boolean> snapshotState4) {
                                        return snapshotState4.getValue().booleanValue();
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final boolean invoke$lambda$25$lambda$4(SnapshotState<Boolean> snapshotState) {
                                        return snapshotState.getValue().booleanValue();
                                    }

                                    /* JADX WARN: Type inference failed for: r0v20 */
                                    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0] */
                                    /* JADX WARN: Type inference failed for: r0v26 */
                                    /* JADX WARN: Type inference failed for: r14v5 */
                                    /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r14v7 */
                                    /* JADX WARN: Type inference failed for: r15v10 */
                                    /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
                                    /* JADX WARN: Type inference failed for: r15v15 */
                                    public final void invoke(Composer composer, int i) {
                                        int i2;
                                        Object next;
                                        CursorData defaultDisplay;
                                        EventLogger eventLogger;
                                        Boolean bool;
                                        Screen screen;
                                        boolean z;
                                        ?? r0;
                                        ?? r14;
                                        Point point;
                                        ?? r15;
                                        Composer composer2 = composer;
                                        if ((i & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-927386986, i, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous>.<anonymous> (PerformanceChartReadyComposable.kt:170)");
                                        }
                                        Modifier modifier = this.$modifier;
                                        final PerformanceChartModel performanceChartModel = this.$chartModel;
                                        PerformanceChartStateProvider3.Ready ready = this.$state;
                                        Function0<Unit> function0 = this.$onEducationFocus;
                                        Function4<Column5, String, Composer, Integer, Unit> function4 = this.$headerContent;
                                        Function0<Unit> function02 = this.$onBigNumberClicked;
                                        Function4<Row5, Money, Composer, Integer, Unit> function42 = this.$fxTooltipContent;
                                        Boolean bool2 = this.$highlightBigNumberForFtux;
                                        PerformanceChartStateProvider3.Ready ready2 = ready;
                                        Function4<Row5, String, Composer, Integer, Unit> function43 = this.$trailingChartValuesContent;
                                        boolean z2 = this.$auraEnabled;
                                        Boolean bool3 = this.$highlightChartForFtux;
                                        EventLogger eventLogger2 = this.$eventLogger;
                                        Screen screen2 = this.$eventScreen;
                                        Component component = this.$eventComponent;
                                        Function1<String, Unit> function1 = this.$onSpanSelected;
                                        Function3<Row5, Composer, Integer, Unit> function3 = this.$trailingButtonOverride;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        int i3 = 0;
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer2.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer2.rememberedValue();
                                        Composer.Companion companion2 = Composer.INSTANCE;
                                        if (objRememberedValue == companion2.getEmpty()) {
                                            i2 = 2;
                                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                            composer2.updateRememberedValue(objRememberedValue);
                                        } else {
                                            i2 = 2;
                                        }
                                        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (objRememberedValue2 == companion2.getEmpty()) {
                                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i2, null);
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                                        composer2.endReplaceGroup();
                                        Iterator<T> it = performanceChartModel.getLines().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                if (((Line) next).is_primary()) {
                                                    break;
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        Line line = (Line) next;
                                        com.robinhood.android.charts.model.Point pointInvoke$lambda$25$lambda$1 = invoke$lambda$25$lambda$1(snapshotState);
                                        composer2.startReplaceGroup(-1633490746);
                                        boolean zChanged = composer2.changed(line) | composer2.changed(pointInvoke$lambda$25$lambda$1);
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            Point closestHorizontalPoint = line != null ? PerformanceChartReadyComposable.getClosestHorizontalPoint(line, invoke$lambda$25$lambda$1(snapshotState)) : null;
                                            composer2.updateRememberedValue(closestHorizontalPoint);
                                            objRememberedValue3 = closestHorizontalPoint;
                                        }
                                        Point point2 = (Point) objRememberedValue3;
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(-1633490746);
                                        boolean zChanged2 = composer2.changed(point2) | composer2.changed(performanceChartModel);
                                        Object objRememberedValue4 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            if (point2 == null || (defaultDisplay = point2.getCursor_data()) == null) {
                                                defaultDisplay = performanceChartModel.getDefaultDisplay();
                                            }
                                            objRememberedValue4 = defaultDisplay;
                                            composer2.updateRememberedValue(objRememberedValue4);
                                        }
                                        CursorData cursorData = (CursorData) objRememberedValue4;
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(1849434622);
                                        Object objRememberedValue5 = composer2.rememberedValue();
                                        Composer.Companion companion3 = Composer.INSTANCE;
                                        if (objRememberedValue5 == companion3.getEmpty()) {
                                            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Boolean.valueOf(PerformanceChartReadyComposable.C205002.AnonymousClass1.invoke$lambda$25$lambda$10$lambda$9(performanceChartModel));
                                                }
                                            });
                                            composer2.updateRememberedValue(objRememberedValue5);
                                        }
                                        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue5;
                                        composer2.endReplaceGroup();
                                        ImmutableList<PerformanceChartBenchmarkV2> activeBenchmarks = ready2.getActiveBenchmarks();
                                        composer2.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer2.changed(activeBenchmarks);
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (zChanged3 || objRememberedValue6 == companion3.getEmpty()) {
                                            objRememberedValue6 = Boolean.valueOf(!ready2.getActiveBenchmarks().isEmpty());
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        }
                                        boolean zBooleanValue = ((Boolean) objRememberedValue6).booleanValue();
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(1849434622);
                                        Object objRememberedValue7 = composer2.rememberedValue();
                                        if (objRememberedValue7 == companion3.getEmpty()) {
                                            objRememberedValue7 = SnapshotIntState3.mutableIntStateOf(0);
                                            composer2.updateRememberedValue(objRememberedValue7);
                                        }
                                        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue7;
                                        composer2.endReplaceGroup();
                                        com.robinhood.android.charts.model.Point pointInvoke$lambda$25$lambda$12 = invoke$lambda$25$lambda$1(snapshotState);
                                        Point point3 = pointInvoke$lambda$25$lambda$12 != null ? new Point(pointInvoke$lambda$25$lambda$12.getX(), pointInvoke$lambda$25$lambda$12.getY(), null, 4, null) : null;
                                        if (performanceChartModel.getLegendData().isEmpty() || point3 == null) {
                                            composer2.startReplaceGroup(-494388150);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            composer2.startReplaceGroup(5004770);
                                            Object objRememberedValue8 = composer2.rememberedValue();
                                            if (objRememberedValue8 == companion3.getEmpty()) {
                                                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return PerformanceChartReadyComposable.C205002.AnonymousClass1.invoke$lambda$25$lambda$21$lambda$20(snapshotIntState2, (LayoutCoordinates) obj);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue8);
                                            }
                                            composer2.endReplaceGroup();
                                            eventLogger = eventLogger2;
                                            bool = bool3;
                                            screen = screen2;
                                            Modifier modifierEducationTourId$default = ModifiersKt.educationTourId$default(OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue8), EducationTourElementIds.PERFORMANCE_CHART_TITLE, null, function0, false, false, 26, null);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierEducationTourId$default);
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                            if (composer2.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                            Column6 column62 = Column6.INSTANCE;
                                            composer2.startReplaceGroup(-1921898268);
                                            if (function4 != null) {
                                                function4.invoke(column62, ready2.getActiveSpan(), composer2, 6);
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            composer2.endReplaceGroup();
                                            z = zBooleanValue;
                                            r0 = 0;
                                            r14 = 1;
                                            point = point2;
                                            r15 = 0;
                                            PerformanceChartValuesSection.PerformanceChartValuesSection(ready2, cursorData, z, function0, function02, function42, PerformanceChartReadyComposable.highlightIfNotNull(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, composer2, 6, 1), bool2), function43, composer2, 0, 0);
                                            composer2 = composer2;
                                            ready2 = ready2;
                                            composer2.endNode();
                                            composer2.endReplaceGroup();
                                            Unit unit2 = Unit.INSTANCE;
                                        } else {
                                            composer2.startReplaceGroup(-495753669);
                                            List<ChartLegendItem> legendList = UtilKt.getLegendList(performanceChartModel.getLegendData(), point3);
                                            if (legendList != null) {
                                                Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer2, 6, 1), 0.0f, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()), 1, null);
                                                composer2.startReplaceGroup(953858275);
                                                List<ChartLegendItem> list = legendList;
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                for (ChartLegendItem chartLegendItem : list) {
                                                    ThemedColor color = chartLegendItem.getColor();
                                                    composer2.startReplaceGroup(953862076);
                                                    int i4 = i3;
                                                    Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer2, i4);
                                                    composer2.endReplaceGroup();
                                                    String title = chartLegendItem.getTitle();
                                                    Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer2, i4);
                                                    Intrinsics.checkNotNull(composeColor2);
                                                    arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                                                    i3 = 0;
                                                }
                                                composer2.endReplaceGroup();
                                                CandlestickLegendChart.CandlestickLegendChart(modifierM5155defaultMinSizeVpY3zN4$default, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), arrayList, 1, composer, 3072, 0);
                                                composer2 = composer;
                                                Unit unit3 = Unit.INSTANCE;
                                            }
                                            composer2.endReplaceGroup();
                                            z = zBooleanValue;
                                            bool = bool3;
                                            eventLogger = eventLogger2;
                                            screen = screen2;
                                            point = point2;
                                            r0 = 0;
                                            r14 = 1;
                                            r15 = 0;
                                        }
                                        boolean zInvoke$lambda$25$lambda$11 = invoke$lambda$25$lambda$11(snapshotState4);
                                        com.robinhood.android.charts.model.Point pointInvoke$lambda$25$lambda$13 = invoke$lambda$25$lambda$1(snapshotState);
                                        composer2.startReplaceGroup(-1746271574);
                                        boolean zChanged4 = composer2.changed(zInvoke$lambda$25$lambda$11) | composer2.changed(z) | composer2.changed(pointInvoke$lambda$25$lambda$13);
                                        Object objRememberedValue9 = composer2.rememberedValue();
                                        if (zChanged4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = Boolean.valueOf((!z || (invoke$lambda$25$lambda$11(snapshotState4) && invoke$lambda$25$lambda$1(snapshotState) == null)) ? r15 : r14);
                                            composer2.updateRememberedValue(objRememberedValue9);
                                        }
                                        boolean zBooleanValue2 = ((Boolean) objRememberedValue9).booleanValue();
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(953939610);
                                        if (zBooleanValue2) {
                                            BenchmarkCursorsRow.m15840BenchmarkCursorsRowFJfuzF0(ready2.getActiveBenchmarks(), extensions2.toImmutableList(performanceChartModel.getLines()), invoke$lambda$25$lambda$1(snapshotState), null, 0.0f, composer, com.robinhood.android.charts.model.Point.$stable << 6, 24);
                                            composer2 = composer;
                                        }
                                        composer2.endReplaceGroup();
                                        SduiCursorData2.SduiLabelTrack(r0, point, composer2, r15, r14);
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r15);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, r15);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion6);
                                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                        if (composer2.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor3);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer2.startReplaceGroup(-2009411768);
                                        if (z2) {
                                            DynamicChartAura.DynamicChartAura(new DynamicChartAuraState(performanceChartModel.getPageDirection(), PerformanceChartReadyComposable.lineForAura(performanceChartModel.getLines(), performanceChartModel.getPageDirection()), C2002Dp.m7995constructorimpl(60), 0.0f, null, 24, null), com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(companion6), null, composer2, DynamicChartAuraState.$stable, 4);
                                        }
                                        Composer composer3 = composer2;
                                        composer3.endReplaceGroup();
                                        PerformanceChartStateProvider3.Ready ready3 = ready2;
                                        PerformanceChartActionHandler.PerformanceChartActionHandler(r0, ComposableLambda3.rememberComposableLambda(1180407564, r14, new PerformanceChartReadyComposable3(ready3, function0, bool, performanceChartModel, eventLogger, screen, component, snapshotState, snapshotState2), composer3, 54), composer3, 48, r14);
                                        composer3.endNode();
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(StaleState2.m12177orStaleek8zF_U(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU(), composer3, r15), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(695805050, r14, new PerformanceChartReadyComposable4(performanceChartModel, ready3, function1, eventLogger, screen, function0, bool, function3, snapshotState2), composer3, 54), composer, 805306368, 510);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final void invoke$lambda$25$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
                                        snapshotState.setValue(Boolean.valueOf(z));
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final boolean invoke$lambda$25$lambda$10$lambda$9(PerformanceChartModel performanceChartModel) {
                                        CursorData defaultDisplay = performanceChartModel.getDefaultDisplay();
                                        return (defaultDisplay != null ? defaultDisplay.getTertiary_value() : null) != null;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$25$lambda$21$lambda$20(SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        snapshotIntState2.setIntValue((int) (it.mo7241getSizeYbymL2g() & 4294967295L));
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i14) {
                                    BentoTheme4 bentoTheme4;
                                    if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(329446640, i14, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous> (PerformanceChartReadyComposable.kt:164)");
                                    }
                                    int i15 = WhenMappings.$EnumSwitchMapping$0[performanceChartModel2.getPageDirection().ordinal()];
                                    if (i15 == 1) {
                                        bentoTheme4 = BentoTheme4.POSITIVE;
                                    } else {
                                        if (i15 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bentoTheme4 = BentoTheme4.NEGATIVE;
                                    }
                                    BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-927386986, true, new AnonymousClass1(modifier6, performanceChartModel2, state, function0, function42, onBigNumberClicked, function47, bool7, function48, z, bool6, eventLogger, screen, component, onSpanSelected, function33), composer3, 54), composer3, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            bool3 = bool7;
                            function45 = function48;
                            bool4 = bool6;
                            modifier4 = modifier6;
                            function32 = function33;
                        } else {
                            performanceChartModel = performanceChartModelCopy$default;
                        }
                        objRememberedValue4 = new Component(Component.ComponentType.PERFORMANCE_CHART, state.getChartType().toString(), null, 4, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        component = (Component) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((57344 & i4) == 16384) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PerformanceChartReadyComposable.PerformanceChartReadyComposable$lambda$2$lambda$1(onSpanSelected);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            final Function0<Unit> function02 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            boolean zIsStale2 = state.isStale();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged2 = composerStartRestartGroup.changed(zIsStale2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(state.isStale()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen2) | composerStartRestartGroup.changedInstance(component) | composerStartRestartGroup.changedInstance(state);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    objRememberedValue3 = new PerformanceChartReadyComposable2(current, screen2, component, state, null);
                                    eventLogger = current;
                                    screen = screen2;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(screen, component, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
                                    final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function332 = function32;
                                    final Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function472 = function44;
                                    final Modifier modifier62 = modifier3;
                                    final PerformanceChartModel performanceChartModel22 = performanceChartModel;
                                    composer2 = composerStartRestartGroup;
                                    final Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function482 = function46;
                                    final Boolean bool72 = bool5;
                                    StaleState2.m12176StaleStateProvider3IgeMak(PerformanceChartReadyComposable$lambda$4(snapshotState2), 0L, ComposableLambda3.rememberComposableLambda(329446640, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt.PerformanceChartReadyComposable.2

                                        /* compiled from: PerformanceChartReadyComposable.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$WhenMappings */
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

                                        /* compiled from: PerformanceChartReadyComposable.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1, reason: invalid class name */
                                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                            final /* synthetic */ boolean $auraEnabled;
                                            final /* synthetic */ PerformanceChartModel $chartModel;
                                            final /* synthetic */ Component $eventComponent;
                                            final /* synthetic */ EventLogger $eventLogger;
                                            final /* synthetic */ Screen $eventScreen;
                                            final /* synthetic */ Function4<Row5, Money, Composer, Integer, Unit> $fxTooltipContent;
                                            final /* synthetic */ Function4<Column5, String, Composer, Integer, Unit> $headerContent;
                                            final /* synthetic */ Boolean $highlightBigNumberForFtux;
                                            final /* synthetic */ Boolean $highlightChartForFtux;
                                            final /* synthetic */ Modifier $modifier;
                                            final /* synthetic */ Function0<Unit> $onBigNumberClicked;
                                            final /* synthetic */ Function0<Unit> $onEducationFocus;
                                            final /* synthetic */ Function1<String, Unit> $onSpanSelected;
                                            final /* synthetic */ PerformanceChartStateProvider3.Ready $state;
                                            final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $trailingButtonOverride;
                                            final /* synthetic */ Function4<Row5, String, Composer, Integer, Unit> $trailingChartValuesContent;

                                            /* JADX WARN: Multi-variable type inference failed */
                                            AnonymousClass1(Modifier modifier, PerformanceChartModel performanceChartModel, PerformanceChartStateProvider3.Ready ready, Function0<Unit> function0, Function4<? super Column5, ? super String, ? super Composer, ? super Integer, Unit> function4, Function0<Unit> function02, Function4<? super Row5, ? super Money, ? super Composer, ? super Integer, Unit> function42, Boolean bool, Function4<? super Row5, ? super String, ? super Composer, ? super Integer, Unit> function43, boolean z, Boolean bool2, EventLogger eventLogger, Screen screen, Component component, Function1<? super String, Unit> function1, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3) {
                                                this.$modifier = modifier;
                                                this.$chartModel = performanceChartModel;
                                                this.$state = ready;
                                                this.$onEducationFocus = function0;
                                                this.$headerContent = function4;
                                                this.$onBigNumberClicked = function02;
                                                this.$fxTooltipContent = function42;
                                                this.$highlightBigNumberForFtux = bool;
                                                this.$trailingChartValuesContent = function43;
                                                this.$auraEnabled = z;
                                                this.$highlightChartForFtux = bool2;
                                                this.$eventLogger = eventLogger;
                                                this.$eventScreen = screen;
                                                this.$eventComponent = component;
                                                this.$onSpanSelected = function1;
                                                this.$trailingButtonOverride = function3;
                                            }

                                            private static final com.robinhood.android.charts.model.Point invoke$lambda$25$lambda$1(SnapshotState<com.robinhood.android.charts.model.Point> snapshotState) {
                                                return snapshotState.getValue();
                                            }

                                            private static final boolean invoke$lambda$25$lambda$11(SnapshotState4<Boolean> snapshotState4) {
                                                return snapshotState4.getValue().booleanValue();
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final boolean invoke$lambda$25$lambda$4(SnapshotState<Boolean> snapshotState) {
                                                return snapshotState.getValue().booleanValue();
                                            }

                                            /* JADX WARN: Type inference failed for: r0v20 */
                                            /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0] */
                                            /* JADX WARN: Type inference failed for: r0v26 */
                                            /* JADX WARN: Type inference failed for: r14v5 */
                                            /* JADX WARN: Type inference failed for: r14v6, types: [boolean, int] */
                                            /* JADX WARN: Type inference failed for: r14v7 */
                                            /* JADX WARN: Type inference failed for: r15v10 */
                                            /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
                                            /* JADX WARN: Type inference failed for: r15v15 */
                                            public final void invoke(Composer composer, int i) {
                                                int i2;
                                                Object next;
                                                CursorData defaultDisplay;
                                                EventLogger eventLogger;
                                                Boolean bool;
                                                Screen screen;
                                                boolean z;
                                                ?? r0;
                                                ?? r14;
                                                Point point;
                                                ?? r15;
                                                Composer composer2 = composer;
                                                if ((i & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-927386986, i, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous>.<anonymous> (PerformanceChartReadyComposable.kt:170)");
                                                }
                                                Modifier modifier = this.$modifier;
                                                final PerformanceChartModel performanceChartModel = this.$chartModel;
                                                PerformanceChartStateProvider3.Ready ready = this.$state;
                                                Function0<Unit> function0 = this.$onEducationFocus;
                                                Function4<Column5, String, Composer, Integer, Unit> function4 = this.$headerContent;
                                                Function0<Unit> function02 = this.$onBigNumberClicked;
                                                Function4<Row5, Money, Composer, Integer, Unit> function42 = this.$fxTooltipContent;
                                                Boolean bool2 = this.$highlightBigNumberForFtux;
                                                PerformanceChartStateProvider3.Ready ready2 = ready;
                                                Function4<Row5, String, Composer, Integer, Unit> function43 = this.$trailingChartValuesContent;
                                                boolean z2 = this.$auraEnabled;
                                                Boolean bool3 = this.$highlightChartForFtux;
                                                EventLogger eventLogger2 = this.$eventLogger;
                                                Screen screen2 = this.$eventScreen;
                                                Component component = this.$eventComponent;
                                                Function1<String, Unit> function1 = this.$onSpanSelected;
                                                Function3<Row5, Composer, Integer, Unit> function3 = this.$trailingButtonOverride;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                int i3 = 0;
                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier);
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue = composer2.rememberedValue();
                                                Composer.Companion companion2 = Composer.INSTANCE;
                                                if (objRememberedValue == companion2.getEmpty()) {
                                                    i2 = 2;
                                                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                } else {
                                                    i2 = 2;
                                                }
                                                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (objRememberedValue2 == companion2.getEmpty()) {
                                                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i2, null);
                                                    composer2.updateRememberedValue(objRememberedValue2);
                                                }
                                                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                                                composer2.endReplaceGroup();
                                                Iterator<T> it = performanceChartModel.getLines().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        if (((Line) next).is_primary()) {
                                                            break;
                                                        }
                                                    } else {
                                                        next = null;
                                                        break;
                                                    }
                                                }
                                                Line line = (Line) next;
                                                com.robinhood.android.charts.model.Point pointInvoke$lambda$25$lambda$1 = invoke$lambda$25$lambda$1(snapshotState);
                                                composer2.startReplaceGroup(-1633490746);
                                                boolean zChanged = composer2.changed(line) | composer2.changed(pointInvoke$lambda$25$lambda$1);
                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    Point closestHorizontalPoint = line != null ? PerformanceChartReadyComposable.getClosestHorizontalPoint(line, invoke$lambda$25$lambda$1(snapshotState)) : null;
                                                    composer2.updateRememberedValue(closestHorizontalPoint);
                                                    objRememberedValue3 = closestHorizontalPoint;
                                                }
                                                Point point2 = (Point) objRememberedValue3;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(-1633490746);
                                                boolean zChanged2 = composer2.changed(point2) | composer2.changed(performanceChartModel);
                                                Object objRememberedValue4 = composer2.rememberedValue();
                                                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    if (point2 == null || (defaultDisplay = point2.getCursor_data()) == null) {
                                                        defaultDisplay = performanceChartModel.getDefaultDisplay();
                                                    }
                                                    objRememberedValue4 = defaultDisplay;
                                                    composer2.updateRememberedValue(objRememberedValue4);
                                                }
                                                CursorData cursorData = (CursorData) objRememberedValue4;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue5 = composer2.rememberedValue();
                                                Composer.Companion companion3 = Composer.INSTANCE;
                                                if (objRememberedValue5 == companion3.getEmpty()) {
                                                    objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return Boolean.valueOf(PerformanceChartReadyComposable.C205002.AnonymousClass1.invoke$lambda$25$lambda$10$lambda$9(performanceChartModel));
                                                        }
                                                    });
                                                    composer2.updateRememberedValue(objRememberedValue5);
                                                }
                                                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue5;
                                                composer2.endReplaceGroup();
                                                ImmutableList<PerformanceChartBenchmarkV2> activeBenchmarks = ready2.getActiveBenchmarks();
                                                composer2.startReplaceGroup(5004770);
                                                boolean zChanged3 = composer2.changed(activeBenchmarks);
                                                Object objRememberedValue6 = composer2.rememberedValue();
                                                if (zChanged3 || objRememberedValue6 == companion3.getEmpty()) {
                                                    objRememberedValue6 = Boolean.valueOf(!ready2.getActiveBenchmarks().isEmpty());
                                                    composer2.updateRememberedValue(objRememberedValue6);
                                                }
                                                boolean zBooleanValue = ((Boolean) objRememberedValue6).booleanValue();
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                Object objRememberedValue7 = composer2.rememberedValue();
                                                if (objRememberedValue7 == companion3.getEmpty()) {
                                                    objRememberedValue7 = SnapshotIntState3.mutableIntStateOf(0);
                                                    composer2.updateRememberedValue(objRememberedValue7);
                                                }
                                                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue7;
                                                composer2.endReplaceGroup();
                                                com.robinhood.android.charts.model.Point pointInvoke$lambda$25$lambda$12 = invoke$lambda$25$lambda$1(snapshotState);
                                                Point point3 = pointInvoke$lambda$25$lambda$12 != null ? new Point(pointInvoke$lambda$25$lambda$12.getX(), pointInvoke$lambda$25$lambda$12.getY(), null, 4, null) : null;
                                                if (performanceChartModel.getLegendData().isEmpty() || point3 == null) {
                                                    composer2.startReplaceGroup(-494388150);
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    composer2.startReplaceGroup(5004770);
                                                    Object objRememberedValue8 = composer2.rememberedValue();
                                                    if (objRememberedValue8 == companion3.getEmpty()) {
                                                        objRememberedValue8 = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$$ExternalSyntheticLambda1
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return PerformanceChartReadyComposable.C205002.AnonymousClass1.invoke$lambda$25$lambda$21$lambda$20(snapshotIntState2, (LayoutCoordinates) obj);
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(objRememberedValue8);
                                                    }
                                                    composer2.endReplaceGroup();
                                                    eventLogger = eventLogger2;
                                                    bool = bool3;
                                                    screen = screen2;
                                                    Modifier modifierEducationTourId$default = ModifiersKt.educationTourId$default(OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue8), EducationTourElementIds.PERFORMANCE_CHART_TITLE, null, function0, false, false, 26, null);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierEducationTourId$default);
                                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                                    if (composer2.getApplier() == null) {
                                                        Composables.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor2);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                                    Column6 column62 = Column6.INSTANCE;
                                                    composer2.startReplaceGroup(-1921898268);
                                                    if (function4 != null) {
                                                        function4.invoke(column62, ready2.getActiveSpan(), composer2, 6);
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    composer2.endReplaceGroup();
                                                    z = zBooleanValue;
                                                    r0 = 0;
                                                    r14 = 1;
                                                    point = point2;
                                                    r15 = 0;
                                                    PerformanceChartValuesSection.PerformanceChartValuesSection(ready2, cursorData, z, function0, function02, function42, PerformanceChartReadyComposable.highlightIfNotNull(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, composer2, 6, 1), bool2), function43, composer2, 0, 0);
                                                    composer2 = composer2;
                                                    ready2 = ready2;
                                                    composer2.endNode();
                                                    composer2.endReplaceGroup();
                                                    Unit unit2 = Unit.INSTANCE;
                                                } else {
                                                    composer2.startReplaceGroup(-495753669);
                                                    List<ChartLegendItem> legendList = UtilKt.getLegendList(performanceChartModel.getLegendData(), point3);
                                                    if (legendList != null) {
                                                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer2, 6, 1), 0.0f, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(snapshotIntState2.getIntValue()), 1, null);
                                                        composer2.startReplaceGroup(953858275);
                                                        List<ChartLegendItem> list = legendList;
                                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                        for (ChartLegendItem chartLegendItem : list) {
                                                            ThemedColor color = chartLegendItem.getColor();
                                                            composer2.startReplaceGroup(953862076);
                                                            int i4 = i3;
                                                            Color composeColor = color == null ? null : SduiColors2.toComposeColor(color, composer2, i4);
                                                            composer2.endReplaceGroup();
                                                            String title = chartLegendItem.getTitle();
                                                            Color composeColor2 = SduiColors2.toComposeColor(chartLegendItem.getValue_color(), composer2, i4);
                                                            Intrinsics.checkNotNull(composeColor2);
                                                            arrayList.add(new LegendItem(chartLegendItem.getId(), composeColor, title, chartLegendItem.getValue(), composeColor2.getValue(), null, 32, null));
                                                            i3 = 0;
                                                        }
                                                        composer2.endReplaceGroup();
                                                        CandlestickLegendChart.CandlestickLegendChart(modifierM5155defaultMinSizeVpY3zN4$default, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), arrayList, 1, composer, 3072, 0);
                                                        composer2 = composer;
                                                        Unit unit3 = Unit.INSTANCE;
                                                    }
                                                    composer2.endReplaceGroup();
                                                    z = zBooleanValue;
                                                    bool = bool3;
                                                    eventLogger = eventLogger2;
                                                    screen = screen2;
                                                    point = point2;
                                                    r0 = 0;
                                                    r14 = 1;
                                                    r15 = 0;
                                                }
                                                boolean zInvoke$lambda$25$lambda$11 = invoke$lambda$25$lambda$11(snapshotState4);
                                                com.robinhood.android.charts.model.Point pointInvoke$lambda$25$lambda$13 = invoke$lambda$25$lambda$1(snapshotState);
                                                composer2.startReplaceGroup(-1746271574);
                                                boolean zChanged4 = composer2.changed(zInvoke$lambda$25$lambda$11) | composer2.changed(z) | composer2.changed(pointInvoke$lambda$25$lambda$13);
                                                Object objRememberedValue9 = composer2.rememberedValue();
                                                if (zChanged4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue9 = Boolean.valueOf((!z || (invoke$lambda$25$lambda$11(snapshotState4) && invoke$lambda$25$lambda$1(snapshotState) == null)) ? r15 : r14);
                                                    composer2.updateRememberedValue(objRememberedValue9);
                                                }
                                                boolean zBooleanValue2 = ((Boolean) objRememberedValue9).booleanValue();
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(953939610);
                                                if (zBooleanValue2) {
                                                    BenchmarkCursorsRow.m15840BenchmarkCursorsRowFJfuzF0(ready2.getActiveBenchmarks(), extensions2.toImmutableList(performanceChartModel.getLines()), invoke$lambda$25$lambda$1(snapshotState), null, 0.0f, composer, com.robinhood.android.charts.model.Point.$stable << 6, 24);
                                                    composer2 = composer;
                                                }
                                                composer2.endReplaceGroup();
                                                SduiCursorData2.SduiLabelTrack(r0, point, composer2, r15, r14);
                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r15);
                                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, r15);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion6);
                                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor3);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer2.startReplaceGroup(-2009411768);
                                                if (z2) {
                                                    DynamicChartAura.DynamicChartAura(new DynamicChartAuraState(performanceChartModel.getPageDirection(), PerformanceChartReadyComposable.lineForAura(performanceChartModel.getLines(), performanceChartModel.getPageDirection()), C2002Dp.m7995constructorimpl(60), 0.0f, null, 24, null), com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(companion6), null, composer2, DynamicChartAuraState.$stable, 4);
                                                }
                                                Composer composer3 = composer2;
                                                composer3.endReplaceGroup();
                                                PerformanceChartStateProvider3.Ready ready3 = ready2;
                                                PerformanceChartActionHandler.PerformanceChartActionHandler(r0, ComposableLambda3.rememberComposableLambda(1180407564, r14, new PerformanceChartReadyComposable3(ready3, function0, bool, performanceChartModel, eventLogger, screen, component, snapshotState, snapshotState2), composer3, 54), composer3, 48, r14);
                                                composer3.endNode();
                                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(StaleState2.m12177orStaleek8zF_U(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21368getAccent0d7_KjU(), composer3, r15), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(695805050, r14, new PerformanceChartReadyComposable4(performanceChartModel, ready3, function1, eventLogger, screen, function0, bool, function3, snapshotState2), composer3, 54), composer, 805306368, 510);
                                                composer.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                invoke(composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final void invoke$lambda$25$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
                                                snapshotState.setValue(Boolean.valueOf(z));
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final boolean invoke$lambda$25$lambda$10$lambda$9(PerformanceChartModel performanceChartModel) {
                                                CursorData defaultDisplay = performanceChartModel.getDefaultDisplay();
                                                return (defaultDisplay != null ? defaultDisplay.getTertiary_value() : null) != null;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$25$lambda$21$lambda$20(SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                snapshotIntState2.setIntValue((int) (it.mo7241getSizeYbymL2g() & 4294967295L));
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i14) {
                                            BentoTheme4 bentoTheme4;
                                            if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(329446640, i14, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous> (PerformanceChartReadyComposable.kt:164)");
                                            }
                                            int i15 = WhenMappings.$EnumSwitchMapping$0[performanceChartModel22.getPageDirection().ordinal()];
                                            if (i15 == 1) {
                                                bentoTheme4 = BentoTheme4.POSITIVE;
                                            } else {
                                                if (i15 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                bentoTheme4 = BentoTheme4.NEGATIVE;
                                            }
                                            BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-927386986, true, new AnonymousClass1(modifier62, performanceChartModel22, state, function02, function42, onBigNumberClicked, function472, bool72, function482, z, bool6, eventLogger, screen, component, onSpanSelected, function332), composer3, 54), composer3, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 384, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    bool3 = bool72;
                                    function45 = function482;
                                    bool4 = bool6;
                                    modifier4 = modifier62;
                                    function32 = function332;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PerformanceChartReadyComposable.PerformanceChartReadyComposable$lambda$6(animationSpec, state, function4, function42, onSpanSelected, onBigNumberClicked, z, modifier4, function32, function45, bool3, bool4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 1572864;
                i5 = i3 & 128;
                if (i5 == 0) {
                }
                i6 = i3 & 256;
                if (i6 == 0) {
                }
                i7 = i3 & 512;
                if (i7 == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                i11 = i3 & 2048;
                if (i11 == 0) {
                }
                int i132 = i10;
                if ((i4 & 306783379) != 306783378) {
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1506909972);
                    if (animationSpec == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    Screen screen22 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                    PerformanceChartType chartType2 = state.getChartType();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(chartType2.ordinal());
                    Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                    objRememberedValue42 = new Component(Component.ComponentType.PERFORMANCE_CHART, state.getChartType().toString(), null, 4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue42);
                    component = (Component) objRememberedValue42;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((57344 & i4) == 16384) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            i5 = i3 & 128;
            if (i5 == 0) {
            }
            i6 = i3 & 256;
            if (i6 == 0) {
            }
            i7 = i3 & 512;
            if (i7 == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            i11 = i3 & 2048;
            if (i11 == 0) {
            }
            int i1322 = i10;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function44 = function4;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        i11 = i3 & 2048;
        if (i11 == 0) {
        }
        int i13222 = i10;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartReadyComposable$lambda$2$lambda$1(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public static final Point getClosestHorizontalPoint(Line line, com.robinhood.android.charts.model.Point point) {
        Intrinsics.checkNotNullParameter(line, "<this>");
        if (point == null) {
            return null;
        }
        List<Segment> segments = line.getSegments();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Segment) it.next()).getPoints());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            float fAbs = Math.abs(((Point) next).getX() - point.getX());
            do {
                Object next2 = it2.next();
                float fAbs2 = Math.abs(((Point) next2).getX() - point.getX());
                if (Float.compare(fAbs, fAbs2) > 0) {
                    next = next2;
                    fAbs = fAbs2;
                }
            } while (it2.hasNext());
        }
        return (Point) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context chartContext(String str, PerformanceChartStateProvider3.Ready ready) {
        PerformanceChartContext.ChartView contextType;
        PerformanceChartContext.Span contextType2 = PerformanceChartContextExt.toContextType((PerformanceChartSpanOption) PerformanceChartSpanOption.INSTANCE.fromServerValue(str));
        PerformanceChartStyle chartStyle = ready.getChartStyle();
        if (chartStyle == null || (contextType = PerformanceChartContextExt.getContextType(chartStyle)) == null) {
            contextType = PerformanceChartContext.ChartView.CHART_VIEW_UNSPECIFIED;
        }
        PerformanceChartContext.ChartView chartView = contextType;
        PerformanceChartContext.ChartType contextType3 = PerformanceChartContextExt.getContextType(ready.getChartType());
        ImmutableList<PerformanceChartBenchmarkV2> activeBenchmarks = ready.getActiveBenchmarks();
        ArrayList arrayList = new ArrayList();
        for (PerformanceChartBenchmarkV2 performanceChartBenchmarkV2 : activeBenchmarks) {
            if (performanceChartBenchmarkV2.isSelected()) {
                arrayList.add(performanceChartBenchmarkV2);
            }
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PerformanceChartContext(contextType2, chartView, contextType3, CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartReadyComposable.chartContext$lambda$10((PerformanceChartBenchmarkV2) obj);
            }
        }, 30, null), ready.getChartModel().isPrivacyEnabled(), null, 32, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -129, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence chartContext$lambda$10(PerformanceChartBenchmarkV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    public static final Modifier chartEducationTourId(Modifier modifier, PerformanceChartType chartType, Function0<Unit> onFocus) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(onFocus, "onFocus");
        int i = WhenMappings.$EnumSwitchMapping$0[chartType.ordinal()];
        if (i != 1) {
            return i != 2 ? modifier : ModifiersKt.educationTourId$default(modifier, EducationTourElementIds.OPTIONS_PERFORMANCE_CHART, null, onFocus, false, true, 10, null);
        }
        return ModifiersKt.educationTourId$default(modifier, EducationTourElementIds.EQUITIES_PERFORMANCE_CHART, null, onFocus, false, true, 10, null);
    }

    public static final void launchChartSettings(Navigator navigator, android.content.Context context, String accountNumber, PerformanceChartType chartType, Screen screen) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        if (appCompatActivityFindActivityBaseContext == null || (supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager()) == null) {
            return;
        }
        if (screen == null) {
            screen = new Screen(null, null, null, null, 15, null);
        }
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new PerformanceChartSettingsContract.Key(screen, accountNumber, chartType, false), null, 2, null).show(supportFragmentManager, PerformanceChartSettingsDialogTag);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PerformanceChartSettingsButton(final String accountNumber, final PerformanceChartType chartType, final Context eventContext, final boolean z, final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        final android.content.Context context;
        final Navigator navigator;
        EventLogger current;
        Screen screen;
        boolean zChangedInstance;
        Object objRememberedValue;
        final EventLogger eventLogger;
        final Screen screen2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(1864606490);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(chartType.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(eventContext) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i6 = i3 & 32;
        if (i6 == 0) {
            if ((196608 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i5 = i4;
            if ((74899 & i5) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1864606490, i5, -1, "com.robinhood.android.lib.performancechart.PerformanceChartSettingsButton (PerformanceChartReadyComposable.kt:434)");
                }
                context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                SpanSelector5.BentoIcon bentoIcon = new SpanSelector5.BentoIcon(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16), StringResources_androidKt.stringResource(C10974R.string.chart_settings, composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i5 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i5 & 112) == 32) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(eventContext);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    eventLogger = current;
                    screen2 = screen;
                    Object obj = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PerformanceChartReadyComposable.PerformanceChartSettingsButton$lambda$13$lambda$12(navigator, context, accountNumber, chartType, screen2, eventLogger, eventContext);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                    objRememberedValue = obj;
                } else {
                    eventLogger = current;
                    screen2 = screen;
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource = StringResources_androidKt.stringResource(i, composerStartRestartGroup, (i5 >> 12) & 14);
                if (!z) {
                    strStringResource = null;
                }
                TooltipData.Layout layout = new TooltipData.Layout(RdsTooltipView.NibDirection.DOWN, 0.0f, null, null, 14, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PerformanceChartReadyComposable.PerformanceChartSettingsButton$lambda$16$lambda$15(eventLogger, screen2, (View) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SpanSelector3.ChartSpanTrailingButton(bentoIcon, function0, com.robinhood.tooltips.ModifiersKt.tooltip$default(modifier4, strStringResource, layout, new TooltipData.Behavior(null, null, (Function1) objRememberedValue2, null, 11, null), null, false, 24, null), composer2, SpanSelector5.BentoIcon.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return PerformanceChartReadyComposable.PerformanceChartSettingsButton$lambda$17(accountNumber, chartType, eventContext, z, i, modifier3, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        modifier2 = modifier;
        i5 = i4;
        if ((74899 & i5) == 74898) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            SpanSelector5.BentoIcon bentoIcon2 = new SpanSelector5.BentoIcon(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16), StringResources_androidKt.stringResource(C10974R.string.chart_settings, composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = ((i5 & 14) != 4) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | ((i5 & 112) == 32) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(eventContext);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                eventLogger = current;
                screen2 = screen;
                Object obj2 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PerformanceChartReadyComposable.PerformanceChartSettingsButton$lambda$13$lambda$12(navigator, context, accountNumber, chartType, screen2, eventLogger, eventContext);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj2);
                objRememberedValue = obj2;
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource2 = StringResources_androidKt.stringResource(i, composerStartRestartGroup, (i5 >> 12) & 14);
                if (!z) {
                }
                TooltipData.Layout layout2 = new TooltipData.Layout(RdsTooltipView.NibDirection.DOWN, 0.0f, null, null, 14, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj22) {
                            return PerformanceChartReadyComposable.PerformanceChartSettingsButton$lambda$16$lambda$15(eventLogger, screen2, (View) obj22);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    SpanSelector3.ChartSpanTrailingButton(bentoIcon2, function02, com.robinhood.tooltips.ModifiersKt.tooltip$default(modifier4, strStringResource2, layout2, new TooltipData.Behavior(null, null, (Function1) objRememberedValue2, null, 11, null), null, false, 24, null), composer2, SpanSelector5.BentoIcon.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartSettingsButton$lambda$13$lambda$12(Navigator navigator, android.content.Context context, String str, PerformanceChartType performanceChartType, Screen screen, EventLogger eventLogger, Context context2) {
        launchChartSettings(navigator, context, str, performanceChartType, screen);
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.PERFORMANCE_CHART_SETTINGS, null, null, 6, null), null, context2, false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartSettingsButton$lambda$16$lambda$15(EventLogger eventLogger, Screen screen, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "portfolio-returns-comparison", null, 4, null), null, null, 25, null);
        return Unit.INSTANCE;
    }

    public static final Line lineForAura(List<Line> list, Direction pageDirection) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pageDirection, "pageDirection");
        Line line = new Line(null, CollectionsKt.emptyList(), pageDirection, false, 9, null);
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                return (Line) CollectionsKt.first((List) list);
            }
            List<Line> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                next = null;
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (((Line) next2).is_primary()) {
                    break;
                }
            }
            Line line2 = (Line) next2;
            if (line2 != null) {
                return line2;
            }
            Iterator<T> it2 = list2.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int size = ((Line) next).getSegments().size();
                    do {
                        Object next3 = it2.next();
                        int size2 = ((Line) next3).getSegments().size();
                        if (size < size2) {
                            next = next3;
                            size = size2;
                        }
                    } while (it2.hasNext());
                }
            }
            Line line3 = (Line) next;
            if (line3 != null) {
                return line3;
            }
        }
        return line;
    }
}
