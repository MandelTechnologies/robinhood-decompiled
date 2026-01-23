package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
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
import black_widow.contracts.mobile_app_chart.proto.p024v1.DifferenceCloudDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDisplayTypeDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineColor;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineColorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineValue;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineValueDto;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionRow5;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheet;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoToggleRow;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: PlotSettings.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001au\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a{\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\u0006\u0010\"\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b'\u0010(\u001a;\u0010+\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b+\u0010,\u001a5\u00101\u001a\u00020\u00062\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060#2\b\b\u0002\u0010/\u001a\u00020.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060#H\u0003¢\u0006\u0004\b1\u00102\u001a\u008d\u0001\u0010<\u001a\u00020\u00062\u0006\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\u00042 \u0010:\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u000208\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020\u0006072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060#2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b<\u0010=\u001a\u0015\u0010?\u001a\u00020>*\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b?\u0010@¨\u0006E²\u0006\u000e\u0010A\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010B\u001a\u0004\u0018\u00010\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010C\u001a\u0004\u0018\u0001098\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010D\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "plots", "Lkotlin/Function1;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/SettingsKeyboardState;", "", "showKeyboard", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "availableColorPickerColors", "Lkotlin/Function2;", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineValue;", "onPlotUpdated", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "indicator", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventDescriptor", "plotSettings", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function2;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "title", "", "thickness", "", "visible", "editDisplayType", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;", "lineDisplayType", "hideColorPicker", "Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColorDto;", "lineColors", "showLineToggle", "Lkotlin/Function0;", "onToggleVisibility", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet;", "onPlotParameterSelected", "PlotSettingsRow", "(Ljava/lang/String;Ljava/lang/Integer;ZZLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDisplayTypeDto;ZLkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "internalVisibility", "onCheckedChange", "PlotRowTitleSection", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "content", "PlotParameterDropDown", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "plotBottomSheet", "line", "onThicknessSelected", "onDisplayTypeSelected", "Lkotlin/Function3;", "Lrh_server_driven_ui/v1/ThemedColor;", "", "onLineColorUpdated", "onDismissRequest", "PlotBottomSheetComposable", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/PlotBottomSheet;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "toBwComposeColor", "(Lrh_server_driven_ui/v1/ThemedColorDto;Landroidx/compose/runtime/Composer;I)J", "plotBottomSheetState", "currentColor", "currentOpacity", "lineThickness", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PlotSettingsKt {

    /* compiled from: PlotSettings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorDto.values().length];
            try {
                iArr[ColorDto.COLOR_UV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorDto.COLOR_X_RAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlotBottomSheetComposable$lambda$37(PlotBottomSheet plotBottomSheet, IndicatorLineDto indicatorLineDto, ImmutableList immutableList, Function1 function1, Function1 function12, Function3 function3, Function0 function0, IndicatorStateDto indicatorStateDto, int i, Composer composer, int i2) {
        PlotBottomSheetComposable(plotBottomSheet, indicatorLineDto, immutableList, function1, function12, function3, function0, indicatorStateDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlotParameterDropDown$lambda$24(Function0 function0, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        PlotParameterDropDown(function0, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlotRowTitleSection$lambda$19(String str, boolean z, boolean z2, Function1 function1, int i, Composer composer, int i2) {
        PlotRowTitleSection(str, z, z2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlotSettingsRow$lambda$17(String str, Integer num, boolean z, boolean z2, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, boolean z3, ImmutableList immutableList, boolean z4, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        PlotSettingsRow(str, num, z, z2, indicatorLineDisplayTypeDto, z3, immutableList, z4, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: PlotSettings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$2 */
    static final class C108652 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<ThemedColorDto> $availableColorPickerColors;
        final /* synthetic */ IndicatorLineDto $differenceCloudLine;
        final /* synthetic */ IndicatorStateDto $indicator;
        final /* synthetic */ Function2<String, LineValue, Unit> $onPlotUpdated;

        /* JADX WARN: Multi-variable type inference failed */
        C108652(IndicatorLineDto indicatorLineDto, Function2<? super String, ? super LineValue, Unit> function2, ImmutableList<ThemedColorDto> immutableList, IndicatorStateDto indicatorStateDto) {
            this.$differenceCloudLine = indicatorLineDto;
            this.$onPlotUpdated = function2;
            this.$availableColorPickerColors = immutableList;
            this.$indicator = indicatorStateDto;
        }

        private static final PlotBottomSheet invoke$lambda$1(SnapshotState<PlotBottomSheet> snapshotState) {
            return snapshotState.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(Function2 function2, IndicatorLineDto indicatorLineDto) {
            String title = indicatorLineDto.getTitle();
            DifferenceCloudDto difference_cloud = indicatorLineDto.getDifference_cloud();
            black_widow.contracts.mobile_app_chart.proto.p024v1.ColorDto color = difference_cloud != null ? difference_cloud.getColor() : null;
            DifferenceCloudDto difference_cloud2 = indicatorLineDto.getDifference_cloud();
            boolean z = false;
            if (difference_cloud2 != null && difference_cloud2.is_visible()) {
                z = true;
            }
            function2.invoke(title, new LineValueDto(new LineValueDto.ValueDto.DifferenceCloud(new DifferenceCloudDto(color, !z))).toProto());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState, PlotBottomSheet it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(it);
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            black_widow.contracts.mobile_app_chart.proto.p024v1.ColorDto color;
            black_widow.contracts.mobile_app_chart.proto.p024v1.ColorDto color2;
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1666896372, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.plotSettings.<anonymous> (PlotSettings.kt:205)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Double opacity = null;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(PlotBottomSheet.Closed.INSTANCE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            DifferenceCloudDto difference_cloud = this.$differenceCloudLine.getDifference_cloud();
            ThemedColorDto color3 = (difference_cloud == null || (color2 = difference_cloud.getColor()) == null) ? null : color2.getColor();
            DifferenceCloudDto difference_cloud2 = this.$differenceCloudLine.getDifference_cloud();
            if (difference_cloud2 != null && (color = difference_cloud2.getColor()) != null) {
                opacity = color.getOpacity();
            }
            LineColorDto lineColorDto = new LineColorDto(color3, null, opacity, null, 10, null);
            String strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicator_plot_settings_difference_cloud_title, composer, 0);
            DifferenceCloudDto difference_cloud3 = this.$differenceCloudLine.getDifference_cloud();
            boolean z = difference_cloud3 != null && difference_cloud3.is_visible();
            boolean zIs_editable = this.$differenceCloudLine.is_editable();
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(lineColorDto);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onPlotUpdated) | composer.changedInstance(this.$differenceCloudLine);
            final Function2<String, LineValue, Unit> function2 = this.$onPlotUpdated;
            final IndicatorLineDto indicatorLineDto = this.$differenceCloudLine;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PlotSettingsKt.C108652.invoke$lambda$4$lambda$3(function2, indicatorLineDto);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PlotSettingsKt.C108652.invoke$lambda$6$lambda$5(snapshotState, (PlotBottomSheet) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            PlotSettingsKt.PlotSettingsRow(strStringResource, null, z, zIs_editable, null, false, immutableList3PersistentListOf, true, function0, (Function1) objRememberedValue3, composer, 818110512);
            if (!Intrinsics.areEqual(invoke$lambda$1(snapshotState), PlotBottomSheet.Closed.INSTANCE)) {
                PlotBottomSheet plotBottomSheetInvoke$lambda$1 = invoke$lambda$1(snapshotState);
                IndicatorLineDto indicatorLineDto2 = new IndicatorLineDto(null, null, null, null, null, null, extensions2.persistentListOf(lineColorDto), null, null, null, null, null, Boolean.TRUE, false, false, null, null, null, null, null, false, null, null, null, 16773055, null);
                ImmutableList<ThemedColorDto> immutableList = this.$availableColorPickerColors;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PlotSettingsKt.C108652.invoke$lambda$8$lambda$7(((Integer) obj).intValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function1 function1 = (Function1) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue5 = composer.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$2$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PlotSettingsKt.C108652.invoke$lambda$10$lambda$9((IndicatorLineDisplayTypeDto) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function1 function12 = (Function1) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(this.$onPlotUpdated) | composer.changedInstance(this.$differenceCloudLine);
                final Function2<String, LineValue, Unit> function22 = this.$onPlotUpdated;
                final IndicatorLineDto indicatorLineDto3 = this.$differenceCloudLine;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function3() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$2$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return PlotSettingsKt.C108652.invoke$lambda$12$lambda$11(function22, indicatorLineDto3, ((Integer) obj).intValue(), (ThemedColor) obj2, (Double) obj3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                Function3 function3 = (Function3) objRememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue7 = composer.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$2$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PlotSettingsKt.C108652.invoke$lambda$14$lambda$13(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                PlotSettingsKt.PlotBottomSheetComposable(plotBottomSheetInvoke$lambda$1, indicatorLineDto2, immutableList, function1, function12, function3, (Function0) objRememberedValue7, this.$indicator, composer, 1600512);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(int i) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(IndicatorLineDisplayTypeDto it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(Function2 function2, IndicatorLineDto indicatorLineDto, int i, ThemedColor color, Double d) {
            Intrinsics.checkNotNullParameter(color, "color");
            function2.invoke(indicatorLineDto.getTitle(), new LineValueDto(new LineValueDto.ValueDto.DifferenceCloud(new DifferenceCloudDto(new black_widow.contracts.mobile_app_chart.proto.p024v1.ColorDto(ThemedColorDto.INSTANCE.fromProto(color), d), true))).toProto());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13(SnapshotState snapshotState) {
            snapshotState.setValue(PlotBottomSheet.Closed.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThemedColorDto PlotBottomSheetComposable$lambda$26(SnapshotState<ThemedColorDto> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double PlotBottomSheetComposable$lambda$29(SnapshotState<Double> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer PlotBottomSheetComposable$lambda$32(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndicatorLineDisplayTypeDto PlotBottomSheetComposable$lambda$35(SnapshotState<IndicatorLineDisplayTypeDto> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean PlotSettingsRow$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlotBottomSheet plotSettings$lambda$9$lambda$1(SnapshotState<PlotBottomSheet> snapshotState) {
        return snapshotState.getValue();
    }

    public static final void plotSettings(LazyListScope lazyListScope, final List<IndicatorLineDto> plots, final Function1<? super SettingsKeyboardState, Unit> showKeyboard, final ImmutableList<ThemedColorDto> availableColorPickerColors, final Function2<? super String, ? super LineValue, Unit> onPlotUpdated, final IndicatorStateDto indicator, final EventLogger eventLogger, final UserInteractionEventDescriptor eventDescriptor) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(plots, "plots");
        Intrinsics.checkNotNullParameter(showKeyboard, "showKeyboard");
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        Intrinsics.checkNotNullParameter(onPlotUpdated, "onPlotUpdated");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        final boolean z = plots.size() > 1;
        final PlotSettingsKt$plotSettings$$inlined$items$default$1 plotSettingsKt$plotSettings$$inlined$items$default$1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(IndicatorLineDto indicatorLineDto) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((IndicatorLineDto) obj);
            }
        };
        Object obj = null;
        lazyListScope.items(plots.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return plotSettingsKt$plotSettings$$inlined$items$default$1.invoke(plots.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Integer thickness;
                String value;
                Object obj2;
                Integer num;
                int i4;
                final IndicatorLineDto indicatorLineDto;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                IndicatorLineDto indicatorLineDto2 = (IndicatorLineDto) plots.get(i);
                composer.startReplaceGroup(910679375);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(PlotBottomSheet.Closed.INSTANCE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composer.endReplaceGroup();
                String title = indicatorLineDto2.getTitle();
                Boolean hide_thickness_selector = indicatorLineDto2.getHide_thickness_selector();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(hide_thickness_selector, bool) || indicatorLineDto2.getColors().size() != 1) {
                    thickness = null;
                    value = null;
                } else {
                    thickness = indicatorLineDto2.getThickness();
                    value = null;
                }
                boolean zIs_editable = indicatorLineDto2.is_editable();
                boolean zAreEqual = Intrinsics.areEqual(indicatorLineDto2.getVisible(), bool);
                IndicatorLineDisplayTypeDto line_display_type = indicatorLineDto2.getLine_display_type_options().size() > 1 ? indicatorLineDto2.getLine_display_type() : value;
                IndicatorLineDisplayTypeDto line_display_type2 = indicatorLineDto2.getLine_display_type();
                if (line_display_type2 != null) {
                    value = line_display_type2.getValue();
                }
                boolean zAreEqual2 = Intrinsics.areEqual(value, "VOLUME_HISTOGRAM");
                ImmutableList immutableList = extensions2.toImmutableList(indicatorLineDto2.getColors());
                Integer num2 = thickness;
                IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto = line_display_type;
                boolean z2 = z;
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changedInstance(indicatorLineDto2) | composer.changedInstance(indicator) | composer.changedInstance(eventDescriptor) | composer.changed(showKeyboard) | composer.changed(onPlotUpdated);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    final EventLogger eventLogger2 = eventLogger;
                    final IndicatorStateDto indicatorStateDto = indicator;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = eventDescriptor;
                    num = num2;
                    final Function1 function1 = showKeyboard;
                    final Function2 function2 = onPlotUpdated;
                    i4 = -1224400529;
                    indicatorLineDto = indicatorLineDto2;
                    obj2 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            EventLogger eventLogger3 = eventLogger2;
                            Component component = new Component(Component.ComponentType.DROPDOWN_OPTION, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null);
                            String title2 = indicatorLineDto.getTitle();
                            Boolean visible = indicatorLineDto.getVisible();
                            Boolean bool2 = Boolean.TRUE;
                            EventLogger.DefaultImpls.logTap$default(eventLogger3, null, null, component, null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, new LegendAdvancedChartsContext.IndicatorSettings(null, title2, String.valueOf(!Intrinsics.areEqual(visible, bool2)), null, 9, null), null, 0.0d, null, null, 31487, null).getContext(), false, 43, null);
                            function1.invoke(Closed.INSTANCE);
                            function2.invoke(indicatorLineDto.getTitle(), new LineValue(null, null, Boolean.valueOf(!Intrinsics.areEqual(indicatorLineDto.getVisible(), bool2)), null, null, null, 59, null));
                        }
                    };
                    composer.updateRememberedValue(obj2);
                } else {
                    num = num2;
                    i4 = -1224400529;
                    obj2 = objRememberedValue2;
                    indicatorLineDto = indicatorLineDto2;
                }
                Function0 function0 = (Function0) obj2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(showKeyboard);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    final Function1 function12 = showKeyboard;
                    objRememberedValue3 = new Function1<PlotBottomSheet, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$1$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PlotBottomSheet plotBottomSheet) {
                            invoke2(plotBottomSheet);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PlotBottomSheet it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            function12.invoke(Closed.INSTANCE);
                            snapshotState.setValue(it);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                int i5 = i4;
                PlotSettingsKt.PlotSettingsRow(title, num, zAreEqual, zIs_editable, indicatorLineDisplayTypeDto, zAreEqual2, immutableList, z2, function0, (Function1) objRememberedValue3, composer, 0);
                composer.startReplaceGroup(-2048776591);
                if (!Intrinsics.areEqual(PlotSettingsKt.plotSettings$lambda$9$lambda$1(snapshotState), PlotBottomSheet.Closed.INSTANCE)) {
                    PlotBottomSheet plotBottomSheetPlotSettings$lambda$9$lambda$1 = PlotSettingsKt.plotSettings$lambda$9$lambda$1(snapshotState);
                    ImmutableList immutableList2 = availableColorPickerColors;
                    composer.startReplaceGroup(i5);
                    boolean zChangedInstance2 = composer.changedInstance(eventLogger) | composer.changedInstance(indicatorLineDto) | composer.changedInstance(indicator) | composer.changedInstance(eventDescriptor) | composer.changed(onPlotUpdated);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                        final EventLogger eventLogger3 = eventLogger;
                        final IndicatorStateDto indicatorStateDto2 = indicator;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor2 = eventDescriptor;
                        final Function2 function22 = onPlotUpdated;
                        final IndicatorLineDto indicatorLineDto3 = indicatorLineDto;
                        Object obj3 = new Function1<Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$1$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num3) {
                                invoke(num3.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i6) {
                                EventLogger eventLogger4 = eventLogger3;
                                Component component = new Component(Component.ComponentType.DROPDOWN_OPTION, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null);
                                LegendAdvancedChartsContext.IndicatorSettings indicatorSettings = new LegendAdvancedChartsContext.IndicatorSettings(null, indicatorLineDto3.getTitle(), String.valueOf(i6), null, 9, null);
                                EventLogger.DefaultImpls.logTap$default(eventLogger4, null, null, component, null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor2, null, null, null, null, null, null, 0.0d, false, indicatorStateDto2.getId(), null, indicatorSettings, null, 0.0d, null, null, 31487, null).getContext(), false, 43, null);
                                function22.invoke(indicatorLineDto3.getTitle(), new LineValue(Integer.valueOf(i6), null, null, null, null, null, 62, null));
                            }
                        };
                        composer.updateRememberedValue(obj3);
                        objRememberedValue4 = obj3;
                    }
                    Function1 function13 = (Function1) objRememberedValue4;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(i5);
                    boolean zChangedInstance3 = composer.changedInstance(eventLogger) | composer.changedInstance(indicatorLineDto) | composer.changedInstance(indicator) | composer.changedInstance(eventDescriptor) | composer.changed(onPlotUpdated);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                        final EventLogger eventLogger4 = eventLogger;
                        final IndicatorStateDto indicatorStateDto3 = indicator;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor3 = eventDescriptor;
                        final Function2 function23 = onPlotUpdated;
                        final IndicatorLineDto indicatorLineDto4 = indicatorLineDto;
                        Object obj4 = new Function1<IndicatorLineDisplayTypeDto, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$1$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto2) {
                                invoke2(indicatorLineDisplayTypeDto2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IndicatorLineDisplayTypeDto it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                EventLogger eventLogger5 = eventLogger4;
                                Component component = new Component(Component.ComponentType.DROPDOWN_OPTION, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null);
                                LegendAdvancedChartsContext.IndicatorSettings indicatorSettings = new LegendAdvancedChartsContext.IndicatorSettings(null, indicatorLineDto4.getTitle(), it.getValue(), null, 9, null);
                                EventLogger.DefaultImpls.logTap$default(eventLogger5, null, null, component, null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor3, null, null, null, null, null, null, 0.0d, false, indicatorStateDto3.getId(), null, indicatorSettings, null, 0.0d, null, null, 31487, null).getContext(), false, 43, null);
                                function23.invoke(indicatorLineDto4.getTitle(), new LineValue(null, null, null, it.getValue(), null, null, 55, null));
                            }
                        };
                        composer.updateRememberedValue(obj4);
                        objRememberedValue5 = obj4;
                    }
                    Function1 function14 = (Function1) objRememberedValue5;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer.changed(onPlotUpdated) | composer.changedInstance(indicatorLineDto);
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                        final Function2 function24 = onPlotUpdated;
                        objRememberedValue6 = new Function3<Integer, ThemedColor, Double, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$1$5$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num3, ThemedColor themedColor, Double d) {
                                invoke(num3.intValue(), themedColor, d);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i6, ThemedColor color, Double d) {
                                Intrinsics.checkNotNullParameter(color, "color");
                                function24.invoke(indicatorLineDto.getTitle(), new LineValue(null, new LineColor(color, Integer.valueOf(i6), d, null, null, 24, null), null, null, null, null, 61, null));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    Function3 function3 = (Function3) objRememberedValue6;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$plotSettings$1$6$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotState.setValue(PlotBottomSheet.Closed.INSTANCE);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    composer.endReplaceGroup();
                    PlotSettingsKt.PlotBottomSheetComposable(plotBottomSheetPlotSettings$lambda$9$lambda$1, indicatorLineDto, immutableList2, function13, function14, function3, (Function0) objRememberedValue7, indicator, composer, 1572864);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        Iterator<T> it = plots.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((IndicatorLineDto) next).is_linked_data_series(), Boolean.TRUE)) {
                obj = next;
                break;
            }
        }
        IndicatorLineDto indicatorLineDto = (IndicatorLineDto) obj;
        if (indicatorLineDto != null) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1666896372, true, new C108652(indicatorLineDto, onPlotUpdated, availableColorPickerColors, indicator)), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlotBottomSheetComposable$lambda$27(SnapshotState<ThemedColorDto> snapshotState, ThemedColorDto themedColorDto) {
        snapshotState.setValue(themedColorDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlotBottomSheetComposable$lambda$30(SnapshotState<Double> snapshotState, Double d) {
        snapshotState.setValue(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlotBottomSheetComposable$lambda$33(SnapshotState<Integer> snapshotState, Integer num) {
        snapshotState.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlotBottomSheetComposable$lambda$36(SnapshotState<IndicatorLineDisplayTypeDto> snapshotState, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto) {
        snapshotState.setValue(indicatorLineDisplayTypeDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PlotSettingsRow(final String str, final Integer num, final boolean z, final boolean z2, final IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, final boolean z3, final ImmutableList<LineColorDto> immutableList, final boolean z4, final Function0<Unit> function0, final Function1<? super PlotBottomSheet, Unit> function1, Composer composer, final int i) {
        int i2;
        boolean z5;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1552729195);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z5 = z;
            i2 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
        } else {
            z5 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(indicatorLineDisplayTypeDto) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1552729195, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsRow (PlotSettings.kt:289)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z6 = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z5), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Modifier.Companion companion = Modifier.INSTANCE;
            int i3 = i2;
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
            boolean zPlotSettingsRow$lambda$12 = PlotSettingsRow$lambda$12(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(snapshotState) | ((i3 & 234881024) == 67108864);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PlotSettingsKt.PlotSettingsRow$lambda$16$lambda$15$lambda$14(hapticFeedback, focusManager, function0, snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            PlotRowTitleSection(str, z4, zPlotSettingsRow$lambda$12, (Function1) objRememberedValue2, composerStartRestartGroup, (i3 & 14) | ((i3 >> 18) & 112));
            AnimatedVisibilityKt.AnimatedVisibility(column6, PlotSettingsRow$lambda$12(snapshotState) && !(z3 && num == null && (indicatorLineDisplayTypeDto == null || !z2)), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-105998627, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotSettingsRow$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num2) {
                    invoke(animatedVisibilityScope, composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i4) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-105998627, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsRow.<anonymous>.<anonymous> (PlotSettings.kt:311)");
                    }
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
                    final boolean z7 = z3;
                    final ImmutableList<LineColorDto> immutableList2 = immutableList;
                    final Integer num2 = num;
                    final Function1<PlotBottomSheet, Unit> function12 = function1;
                    final IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto2 = indicatorLineDisplayTypeDto;
                    final boolean z8 = z2;
                    BoxWithConstraints.BoxWithConstraints(modifierM5146paddingqDBjuR0$default, null, false, ComposableLambda3.rememberComposableLambda(1173821767, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotSettingsRow$1$2.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer4, Integer num3) {
                            invoke(boxWithConstraints4, composer4, num3.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer4, int i5) {
                            int i6;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i5 & 6) == 0) {
                                i6 = i5 | (composer4.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1173821767, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsRow.<anonymous>.<anonymous>.<anonymous> (PlotSettings.kt:312)");
                            }
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5103getMaxWidthD9Ej5fM() - C2002Dp.m7995constructorimpl(17)) / 3);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            FlowLayoutKt.FlowRow(modifierFillMaxWidth$default, arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i7).m21593getSmallD9Ej5fM()), arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i7).m21595getXsmallD9Ej5fM()), null, 0, 0, ComposableLambda3.rememberComposableLambda(1750446082, true, new AnonymousClass1(z7, immutableList2, num2, fM7995constructorimpl, function12, indicatorLineDisplayTypeDto2, z8), composer4, 54), composer4, 1572870, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: PlotSettings.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotSettingsRow$1$2$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<FlowRowScope, Composer, Integer, Unit> {
                            final /* synthetic */ float $dropdownBoxSize;
                            final /* synthetic */ boolean $editDisplayType;
                            final /* synthetic */ boolean $hideColorPicker;
                            final /* synthetic */ ImmutableList<LineColorDto> $lineColors;
                            final /* synthetic */ IndicatorLineDisplayTypeDto $lineDisplayType;
                            final /* synthetic */ Function1<PlotBottomSheet, Unit> $onPlotParameterSelected;
                            final /* synthetic */ Integer $thickness;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(boolean z, ImmutableList<LineColorDto> immutableList, Integer num, float f, Function1<? super PlotBottomSheet, Unit> function1, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, boolean z2) {
                                this.$hideColorPicker = z;
                                this.$lineColors = immutableList;
                                this.$thickness = num;
                                this.$dropdownBoxSize = f;
                                this.$onPlotParameterSelected = function1;
                                this.$lineDisplayType = indicatorLineDisplayTypeDto;
                                this.$editDisplayType = z2;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
                                invoke(flowRowScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, LineColorDto lineColorDto, int i) {
                                function1.invoke(new PlotBottomSheet.Color(lineColorDto, i));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3(Function1 function1) {
                                function1.invoke(PlotBottomSheet.LineThickness.INSTANCE);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1750446082, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlotSettings.kt:319)");
                                }
                                composer.startReplaceGroup(-1448492913);
                                if (!this.$hideColorPicker) {
                                    final ImmutableList<LineColorDto> immutableList = this.$lineColors;
                                    float f = this.$dropdownBoxSize;
                                    final Function1<PlotBottomSheet, Unit> function1 = this.$onPlotParameterSelected;
                                    final int i2 = 0;
                                    for (LineColorDto lineColorDto : immutableList) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        final LineColorDto lineColorDto2 = lineColorDto;
                                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, f);
                                        composer.startReplaceGroup(-1746271574);
                                        boolean zChanged = composer.changed(function1) | composer.changedInstance(lineColorDto2) | composer.changed(i2);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007b: CONSTRUCTOR (r5v5 'objRememberedValue' java.lang.Object) = 
                                                  (r9v0 'function1' kotlin.jvm.functions.Function1<com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheet, kotlin.Unit> A[DONT_INLINE])
                                                  (r1v6 'lineColorDto2' black_widow.contracts.mobile_app_chart.proto.v1.LineColorDto A[DONT_INLINE])
                                                  (r0v10 'i2' int A[DONT_INLINE])
                                                 A[MD:(kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.LineColorDto, int):void (m)] (LINE:325) call: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotSettingsRow$1$2$1$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.LineColorDto, int):void type: CONSTRUCTOR in method: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt.PlotSettingsRow.1.2.1.1.invoke(androidx.compose.foundation.layout.FlowRowScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
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
                                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
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
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotSettingsRow$1$2$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 37 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 332
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotSettingsRow$1$2.C108641.AnonymousClass1.invoke(androidx.compose.foundation.layout.FlowRowScope, androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$6$lambda$5(Function1 function1) {
                                            function1.invoke(PlotBottomSheet.DisplayType.INSTANCE);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer3, 54), composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573254, 28);
                        composer2 = composerStartRestartGroup;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composer2, i4).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PlotSettingsKt.PlotSettingsRow$lambda$17(str, num, z, z2, indicatorLineDisplayTypeDto, z3, immutableList, z4, function0, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }

                private static final void PlotSettingsRow$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
                    snapshotState.setValue(Boolean.valueOf(z));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit PlotSettingsRow$lambda$16$lambda$15$lambda$14(HapticFeedback hapticFeedback, FocusManager focusManager, Function0 function0, SnapshotState snapshotState, boolean z) {
                    hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                    focusManager.clearFocus(true);
                    PlotSettingsRow$lambda$13(snapshotState, true ^ PlotSettingsRow$lambda$12(snapshotState));
                    function0.invoke();
                    return Unit.INSTANCE;
                }

                private static final void PlotRowTitleSection(final String str, final boolean z, final boolean z2, final Function1<? super Boolean, Unit> function1, Composer composer, final int i) {
                    String str2;
                    int i2;
                    boolean z3;
                    Composer composerStartRestartGroup = composer.startRestartGroup(-772194170);
                    if ((i & 6) == 0) {
                        str2 = str;
                        i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
                    } else {
                        str2 = str;
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        z3 = z2;
                        i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                    } else {
                        z3 = z2;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    }
                    if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-772194170, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotRowTitleSection (PlotSettings.kt:414)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, i2 & 14, 0, 8184);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1580913825);
                        if (z) {
                            SwitchKt.Switch(z3, function1, null, null, false, BentoToggleRow.INSTANCE.create(true, ToggleRowStyle.m22032copydaRQuJA$default(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getToggleRow(composerStartRestartGroup, 0), 0L, 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8183, null), composerStartRestartGroup, (ToggleRowStyle.$stable << 3) | 390).switchColors(composerStartRestartGroup, BentoToggleRow.$stable), null, composerStartRestartGroup, (i2 >> 6) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 92);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PlotSettingsKt.PlotRowTitleSection$lambda$19(str, z, z2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x01e9  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0231  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x023b  */
                /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void PlotParameterDropDown(final Function0<Unit> function0, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
                    int i3;
                    Modifier modifier2;
                    final FocusManager focusManager;
                    final HapticFeedback hapticFeedback;
                    boolean zChangedInstance;
                    Object objRememberedValue;
                    int currentCompositeKeyHash;
                    Composer composerM6388constructorimpl;
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
                    int currentCompositeKeyHash2;
                    Composer composerM6388constructorimpl2;
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
                    final Modifier modifier3;
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
                    Composer composerStartRestartGroup = composer.startRestartGroup(-425911097);
                    if ((i2 & 1) != 0) {
                        i3 = i | 6;
                    } else if ((i & 6) == 0) {
                        i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    int i4 = i2 & 2;
                    if (i4 == 0) {
                        if ((i & 48) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
                        }
                        if ((i2 & 4) == 0) {
                            i3 |= 384;
                        } else if ((i & 384) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                        }
                        if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-425911097, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotParameterDropDown (PlotSettings.kt:446)");
                            }
                            focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | composerStartRestartGroup.changedInstance(focusManager) | ((i3 & 14) != 4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PlotSettingsKt.PlotParameterDropDown$lambda$21$lambda$20(hapticFeedback, focusManager, function0);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                            Modifier modifier5 = modifier4;
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(modifierM4893clickableXHw0xAI$default, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4))), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion.getCenterVertically();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                            composerStartRestartGroup.endNode();
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), null, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PlotSettingsKt.PlotParameterDropDown$lambda$24(function0, modifier3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 48;
                    modifier2 = modifier;
                    if ((i2 & 4) == 0) {
                    }
                    if ((i3 & 147) != 146) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                        hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback) | composerStartRestartGroup.changedInstance(focusManager) | ((i3 & 14) != 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PlotSettingsKt.PlotParameterDropDown$lambda$21$lambda$20(hapticFeedback, focusManager, function0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                            Modifier modifier52 = modifier4;
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(modifierM4893clickableXHw0xAI$default2, fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21427getFg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4))), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), C2002Dp.m7995constructorimpl(10));
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getSpaceBetween(), centerVertically3, composerStartRestartGroup, 54);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                Alignment.Vertical centerVertically22 = companion4.getCenterVertically();
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically22, composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                                    composerStartRestartGroup.endNode();
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), null, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 56);
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit PlotParameterDropDown$lambda$21$lambda$20(HapticFeedback hapticFeedback, FocusManager focusManager, Function0 function0) {
                    hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                    focusManager.clearFocus(true);
                    function0.invoke();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void PlotBottomSheetComposable(final PlotBottomSheet plotBottomSheet, IndicatorLineDto indicatorLineDto, final ImmutableList<ThemedColorDto> immutableList, final Function1<? super Integer, Unit> function1, final Function1<? super IndicatorLineDisplayTypeDto, Unit> function12, final Function3<? super Integer, ? super ThemedColor, ? super Double, Unit> function3, final Function0<Unit> function0, final IndicatorStateDto indicatorStateDto, Composer composer, final int i) {
                    int i2;
                    ImmutableList<ThemedColorDto> immutableList2;
                    IndicatorStateDto indicatorStateDto2;
                    IndicatorLineDto indicatorLineDto2;
                    Composer composer2;
                    EventLogger eventLogger;
                    Composer composerStartRestartGroup = composer.startRestartGroup(-186317083);
                    if ((i & 6) == 0) {
                        i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(plotBottomSheet) : composerStartRestartGroup.changedInstance(plotBottomSheet) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= composerStartRestartGroup.changedInstance(indicatorLineDto) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        immutableList2 = immutableList;
                        i2 |= composerStartRestartGroup.changedInstance(immutableList2) ? 256 : 128;
                    } else {
                        immutableList2 = immutableList;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i2 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    if ((12582912 & i) == 0) {
                        indicatorStateDto2 = indicatorStateDto;
                        i2 |= composerStartRestartGroup.changedInstance(indicatorStateDto2) ? 8388608 : 4194304;
                    } else {
                        indicatorStateDto2 = indicatorStateDto;
                    }
                    int i3 = i2;
                    if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        indicatorLineDto2 = indicatorLineDto;
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-186317083, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheetComposable (PlotSettings.kt:488)");
                        }
                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                        if (plotBottomSheet instanceof PlotBottomSheet.Color) {
                            composerStartRestartGroup.startReplaceGroup(-1473722337);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged = composerStartRestartGroup.changed(indicatorLineDto);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(indicatorLineDto.getColors().get(((PlotBottomSheet.Color) plotBottomSheet).getIndex()).getColor(), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                objRememberedValue = snapshotStateMutableStateOf$default;
                            }
                            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged2 = composerStartRestartGroup.changed(indicatorLineDto);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                eventLogger = current;
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Intrinsics.areEqual(indicatorLineDto.getSupport_opacity(), Boolean.TRUE) ? ((PlotBottomSheet.Color) plotBottomSheet).getLine().getOpacity() : null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                eventLogger = current;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            indicatorLineDto2 = indicatorLineDto;
                            SelectionBottomSheet3.SelectionBottomSheet(StringResources_androidKt.stringResource(C10963R.string.indicator_settings_plot_color, composerStartRestartGroup, 0), function0, (PlotBottomSheet.Color) plotBottomSheet, (Function4<? super RhModalBottomSheet5, ? super PlotBottomSheet.Color, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-873967893, true, new C108611(immutableList2, eventLogger, indicatorLineDto, indicatorStateDto2, userInteractionEventDescriptor, snapshotState, function3, plotBottomSheet, (SnapshotState) objRememberedValue2), composerStartRestartGroup, 54), (Modifier) null, false, composer2, ((i3 >> 15) & 112) | 199680, 16);
                            composer2.endReplaceGroup();
                        } else {
                            indicatorLineDto2 = indicatorLineDto;
                            if (Intrinsics.areEqual(plotBottomSheet, PlotBottomSheet.LineThickness.INSTANCE)) {
                                composerStartRestartGroup.startReplaceGroup(-1470466407);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChanged3 = composerStartRestartGroup.changed(indicatorLineDto2);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(indicatorLineDto2.getThickness(), null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                SelectionBottomSheet3.SelectionBottomSheet(StringResources_androidKt.stringResource(C10963R.string.indicator_settings_plot_thickness_bottomsheet_title, composerStartRestartGroup, 0), function0, (ImmutableList) extensions2.toPersistentList(new PrimitiveRanges2(1, 5)), (Function4) ComposableLambda3.rememberComposableLambda(-797699602, true, new C108622((SnapshotState) objRememberedValue3, hapticFeedback, function1), composerStartRestartGroup, 54), (Modifier) null, false, composer2, ((i3 >> 15) & 112) | 3072, 48);
                                composer2.endReplaceGroup();
                            } else if (Intrinsics.areEqual(plotBottomSheet, PlotBottomSheet.DisplayType.INSTANCE)) {
                                composerStartRestartGroup.startReplaceGroup(-1468897156);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChanged4 = composerStartRestartGroup.changed(indicatorLineDto2);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(indicatorLineDto2.getLine_display_type(), null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                SelectionBottomSheet3.SelectionBottomSheet(StringResources_androidKt.stringResource(C10963R.string.indicator_settings_plot_display_type_bottomsheet_title, composerStartRestartGroup, 0), function0, (ImmutableList) extensions2.toPersistentList(indicatorLineDto2.getLine_display_type_options()), (Function4) ComposableLambda3.rememberComposableLambda(-1606469530, true, new C108633((SnapshotState) objRememberedValue4, hapticFeedback, function12), composerStartRestartGroup, 54), (Modifier) null, false, composer2, ((i3 >> 15) & 112) | 3072, 48);
                                composer2.endReplaceGroup();
                            } else {
                                composer2 = composerStartRestartGroup;
                                if (!Intrinsics.areEqual(plotBottomSheet, PlotBottomSheet.Closed.INSTANCE)) {
                                    composer2.startReplaceGroup(1337935267);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-1467352643);
                                composer2.endReplaceGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final IndicatorLineDto indicatorLineDto3 = indicatorLineDto2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PlotSettingsKt.PlotBottomSheetComposable$lambda$37(plotBottomSheet, indicatorLineDto3, immutableList, function1, function12, function3, function0, indicatorStateDto, i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }

                /* compiled from: PlotSettings.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotBottomSheetComposable$1 */
                static final class C108611 implements Function4<RhModalBottomSheet5, PlotBottomSheet.Color, Composer, Integer, Unit> {
                    final /* synthetic */ ImmutableList<ThemedColorDto> $availableColorPickerColors;
                    final /* synthetic */ SnapshotState<ThemedColorDto> $currentColor$delegate;
                    final /* synthetic */ SnapshotState<Double> $currentOpacity$delegate;
                    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ IndicatorStateDto $indicator;
                    final /* synthetic */ IndicatorLineDto $line;
                    final /* synthetic */ Function3<Integer, ThemedColor, Double, Unit> $onLineColorUpdated;
                    final /* synthetic */ PlotBottomSheet $plotBottomSheet;

                    /* JADX WARN: Multi-variable type inference failed */
                    C108611(ImmutableList<ThemedColorDto> immutableList, EventLogger eventLogger, IndicatorLineDto indicatorLineDto, IndicatorStateDto indicatorStateDto, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<ThemedColorDto> snapshotState, Function3<? super Integer, ? super ThemedColor, ? super Double, Unit> function3, PlotBottomSheet plotBottomSheet, SnapshotState<Double> snapshotState2) {
                        this.$availableColorPickerColors = immutableList;
                        this.$eventLogger = eventLogger;
                        this.$line = indicatorLineDto;
                        this.$indicator = indicatorStateDto;
                        this.$eventDescriptor = userInteractionEventDescriptor;
                        this.$currentColor$delegate = snapshotState;
                        this.$onLineColorUpdated = function3;
                        this.$plotBottomSheet = plotBottomSheet;
                        this.$currentOpacity$delegate = snapshotState2;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, PlotBottomSheet.Color color, Composer composer, Integer num) {
                        invoke(rhModalBottomSheet5, color, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 SelectionBottomSheet, PlotBottomSheet.Color it, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(SelectionBottomSheet, "$this$SelectionBottomSheet");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-873967893, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheetComposable.<anonymous> (PlotSettings.kt:510)");
                        }
                        long bwComposeColor = PlotSettingsKt.toBwComposeColor(PlotSettingsKt.PlotBottomSheetComposable$lambda$26(this.$currentColor$delegate), composer, 0);
                        Double dPlotBottomSheetComposable$lambda$29 = PlotSettingsKt.PlotBottomSheetComposable$lambda$29(this.$currentOpacity$delegate);
                        ImmutableList<ThemedColorDto> immutableList = this.$availableColorPickerColors;
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$line) | composer.changedInstance(this.$indicator) | composer.changedInstance(this.$eventDescriptor) | composer.changed(this.$currentColor$delegate) | composer.changed(this.$onLineColorUpdated) | composer.changedInstance(this.$plotBottomSheet) | composer.changed(this.$currentOpacity$delegate);
                        final EventLogger eventLogger = this.$eventLogger;
                        final IndicatorLineDto indicatorLineDto = this.$line;
                        final IndicatorStateDto indicatorStateDto = this.$indicator;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                        final Function3<Integer, ThemedColor, Double, Unit> function3 = this.$onLineColorUpdated;
                        final PlotBottomSheet plotBottomSheet = this.$plotBottomSheet;
                        final SnapshotState<ThemedColorDto> snapshotState = this.$currentColor$delegate;
                        final SnapshotState<Double> snapshotState2 = this.$currentOpacity$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Function1 function1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotBottomSheetComposable$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PlotSettingsKt.C108611.invoke$lambda$1$lambda$0(eventLogger, indicatorLineDto, indicatorStateDto, userInteractionEventDescriptor, function3, plotBottomSheet, snapshotState, snapshotState2, (ThemedColorDto) obj);
                                }
                            };
                            composer.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        }
                        Function1 function12 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$line) | composer.changedInstance(this.$indicator) | composer.changedInstance(this.$eventDescriptor) | composer.changed(this.$currentOpacity$delegate) | composer.changed(this.$currentColor$delegate) | composer.changed(this.$onLineColorUpdated) | composer.changedInstance(this.$plotBottomSheet);
                        final EventLogger eventLogger2 = this.$eventLogger;
                        final IndicatorLineDto indicatorLineDto2 = this.$line;
                        final IndicatorStateDto indicatorStateDto2 = this.$indicator;
                        final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                        final SnapshotState<Double> snapshotState3 = this.$currentOpacity$delegate;
                        final SnapshotState<ThemedColorDto> snapshotState4 = this.$currentColor$delegate;
                        final Function3<Integer, ThemedColor, Double, Unit> function32 = this.$onLineColorUpdated;
                        final PlotBottomSheet plotBottomSheet2 = this.$plotBottomSheet;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Function1 function13 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotBottomSheetComposable$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PlotSettingsKt.C108611.invoke$lambda$4$lambda$3(eventLogger2, indicatorLineDto2, indicatorStateDto2, userInteractionEventDescriptor2, snapshotState3, snapshotState4, function32, plotBottomSheet2, ((Double) obj).doubleValue());
                                }
                            };
                            composer.updateRememberedValue(function13);
                            objRememberedValue2 = function13;
                        }
                        composer.endReplaceGroup();
                        ColorPicker.m11912ColorPickereuL9pac(bwComposeColor, dPlotBottomSheetComposable$lambda$29, immutableList, function12, (Function1) objRememberedValue2, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, IndicatorLineDto indicatorLineDto, IndicatorStateDto indicatorStateDto, UserInteractionEventDescriptor userInteractionEventDescriptor, Function3 function3, PlotBottomSheet plotBottomSheet, SnapshotState snapshotState, SnapshotState snapshotState2, ThemedColorDto color) {
                        Intrinsics.checkNotNullParameter(color, "color");
                        EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.CHIP_GRID, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, new LegendAdvancedChartsContext.IndicatorSettings(null, indicatorLineDto.getTitle(), color.toString(), null, 9, null), null, 0.0d, null, null, 31487, null).getContext(), false, 43, null);
                        PlotSettingsKt.PlotBottomSheetComposable$lambda$27(snapshotState, color);
                        Integer index = ((PlotBottomSheet.Color) plotBottomSheet).getLine().getIndex();
                        function3.invoke(Integer.valueOf(index != null ? index.intValue() : 0), color.toProto(), PlotSettingsKt.PlotBottomSheetComposable$lambda$29(snapshotState2));
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, IndicatorLineDto indicatorLineDto, IndicatorStateDto indicatorStateDto, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState snapshotState, SnapshotState snapshotState2, Function3 function3, PlotBottomSheet plotBottomSheet, double d) {
                        EventLogger.DefaultImpls.logTap$default(eventLogger, null, null, new Component(Component.ComponentType.SLIDER, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, new LegendAdvancedChartsContext.IndicatorSettings(null, indicatorLineDto.getTitle(), String.valueOf(d), null, 9, null), null, 0.0d, null, null, 31487, null).getContext(), false, 43, null);
                        PlotSettingsKt.PlotBottomSheetComposable$lambda$30(snapshotState, Double.valueOf(d));
                        ThemedColorDto themedColorDtoPlotBottomSheetComposable$lambda$26 = PlotSettingsKt.PlotBottomSheetComposable$lambda$26(snapshotState2);
                        if (themedColorDtoPlotBottomSheetComposable$lambda$26 != null) {
                            Integer index = ((PlotBottomSheet.Color) plotBottomSheet).getLine().getIndex();
                            function3.invoke(Integer.valueOf(index != null ? index.intValue() : 0), themedColorDtoPlotBottomSheetComposable$lambda$26.toProto(), Double.valueOf(d));
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: PlotSettings.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotBottomSheetComposable$2 */
                static final class C108622 implements Function4<RhModalBottomSheet5, Integer, Composer, Integer, Unit> {
                    final /* synthetic */ HapticFeedback $hapticFeedback;
                    final /* synthetic */ SnapshotState<Integer> $lineThickness$delegate;
                    final /* synthetic */ Function1<Integer, Unit> $onThicknessSelected;

                    /* JADX WARN: Multi-variable type inference failed */
                    C108622(SnapshotState<Integer> snapshotState, HapticFeedback hapticFeedback, Function1<? super Integer, Unit> function1) {
                        this.$lineThickness$delegate = snapshotState;
                        this.$hapticFeedback = hapticFeedback;
                        this.$onThicknessSelected = function1;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Integer num, Composer composer, Integer num2) {
                        invoke(rhModalBottomSheet5, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 SelectionBottomSheet, final int i, Composer composer, int i2) {
                        int i3;
                        Intrinsics.checkNotNullParameter(SelectionBottomSheet, "$this$SelectionBottomSheet");
                        if ((i2 & 48) == 0) {
                            i3 = (composer.changed(i) ? 32 : 16) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-797699602, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheetComposable.<anonymous> (PlotSettings.kt:566)");
                        }
                        Integer numPlotBottomSheetComposable$lambda$32 = PlotSettingsKt.PlotBottomSheetComposable$lambda$32(this.$lineThickness$delegate);
                        boolean z = numPlotBottomSheetComposable$lambda$32 != null && numPlotBottomSheetComposable$lambda$32.intValue() == i;
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged = composer.changed(this.$lineThickness$delegate) | ((i3 & 112) == 32) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onThicknessSelected);
                        final HapticFeedback hapticFeedback = this.$hapticFeedback;
                        final Function1<Integer, Unit> function1 = this.$onThicknessSelected;
                        final SnapshotState<Integer> snapshotState = this.$lineThickness$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotBottomSheetComposable$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PlotSettingsKt.C108622.invoke$lambda$1$lambda$0(i, hapticFeedback, function1, snapshotState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        SelectionRow5.SelectionRow(z, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(1505112659, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt.PlotBottomSheetComposable.2.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                invoke(row5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 SelectionRow, Composer composer2, int i4) {
                                Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                                if ((i4 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1505112659, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheetComposable.<anonymous>.<anonymous> (PlotSettings.kt:574)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i5 = BentoTheme.$stable;
                                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5171sizeVpY3zN4(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(i)), bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), null, 2, null), composer2, 0);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10963R.string.indicator_settings_plot_thickness, new Object[]{Integer.valueOf(i)}, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), null, false, null, composer, 384, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(int i, HapticFeedback hapticFeedback, Function1 function1, SnapshotState snapshotState) {
                        PlotSettingsKt.PlotBottomSheetComposable$lambda$33(snapshotState, Integer.valueOf(i));
                        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
                        function1.invoke(Integer.valueOf(i));
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: PlotSettings.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotBottomSheetComposable$3 */
                static final class C108633 implements Function4<RhModalBottomSheet5, IndicatorLineDisplayTypeDto, Composer, Integer, Unit> {
                    final /* synthetic */ HapticFeedback $hapticFeedback;
                    final /* synthetic */ SnapshotState<IndicatorLineDisplayTypeDto> $lineDisplayType$delegate;
                    final /* synthetic */ Function1<IndicatorLineDisplayTypeDto, Unit> $onDisplayTypeSelected;

                    /* JADX WARN: Multi-variable type inference failed */
                    C108633(SnapshotState<IndicatorLineDisplayTypeDto> snapshotState, HapticFeedback hapticFeedback, Function1<? super IndicatorLineDisplayTypeDto, Unit> function1) {
                        this.$lineDisplayType$delegate = snapshotState;
                        this.$hapticFeedback = hapticFeedback;
                        this.$onDisplayTypeSelected = function1;
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, Composer composer, Integer num) {
                        invoke(rhModalBottomSheet5, indicatorLineDisplayTypeDto, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 SelectionBottomSheet, final IndicatorLineDisplayTypeDto it, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(SelectionBottomSheet, "$this$SelectionBottomSheet");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1606469530, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheetComposable.<anonymous> (PlotSettings.kt:599)");
                        }
                        boolean zAreEqual = Intrinsics.areEqual(PlotSettingsKt.PlotBottomSheetComposable$lambda$35(this.$lineDisplayType$delegate), it);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged = composer.changed(this.$lineDisplayType$delegate) | composer.changedInstance(it) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onDisplayTypeSelected);
                        final HapticFeedback hapticFeedback = this.$hapticFeedback;
                        final Function1<IndicatorLineDisplayTypeDto, Unit> function1 = this.$onDisplayTypeSelected;
                        final SnapshotState<IndicatorLineDisplayTypeDto> snapshotState = this.$lineDisplayType$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt$PlotBottomSheetComposable$3$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PlotSettingsKt.C108633.invoke$lambda$1$lambda$0(it, hapticFeedback, function1, snapshotState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        SelectionRow5.SelectionRow(zAreEqual, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(875542987, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotSettingsKt.PlotBottomSheetComposable.3.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                                invoke(row5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 SelectionRow, Composer composer2, int i2) {
                                Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                                if ((i2 & 17) == 16 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(875542987, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.PlotBottomSheetComposable.<anonymous>.<anonymous> (PlotSettings.kt:607)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(it.getPng_icon(), null, null, null, 0, null, composer2, 0, 62), (String) null, SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), 0, 2, null), composer2, 48, 56);
                                TextKt.m6028Text4IGK_g(it.getLabel(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), null, false, null, composer, 384, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(IndicatorLineDisplayTypeDto indicatorLineDisplayTypeDto, HapticFeedback hapticFeedback, Function1 function1, SnapshotState snapshotState) {
                        PlotSettingsKt.PlotBottomSheetComposable$lambda$36(snapshotState, indicatorLineDisplayTypeDto);
                        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
                        function1.invoke(indicatorLineDisplayTypeDto);
                        return Unit.INSTANCE;
                    }
                }

                public static final long toBwComposeColor(ThemedColorDto themedColorDto, Composer composer, int i) {
                    Composer composer2;
                    long jM21346getNightUv0d7_KjU;
                    composer.startReplaceGroup(-2105111659);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2105111659, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.toBwComposeColor (PlotSettings.kt:633)");
                    }
                    ColorDto light = themedColorDto != null ? themedColorDto.getLight() : null;
                    int i2 = light != null ? WhenMappings.$EnumSwitchMapping$0[light.ordinal()] : -1;
                    if (i2 == 1) {
                        composer2 = composer;
                        composer2.startReplaceGroup(-82699046);
                        if (BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getIsDay()) {
                            jM21346getNightUv0d7_KjU = BentoColor.INSTANCE.m21247getDayUv0d7_KjU();
                        } else {
                            jM21346getNightUv0d7_KjU = BentoColor.INSTANCE.m21346getNightUv0d7_KjU();
                        }
                        composer2.endReplaceGroup();
                    } else if (i2 == 2) {
                        composer2 = composer;
                        composer2.startReplaceGroup(-82694850);
                        if (BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getIsDay()) {
                            jM21346getNightUv0d7_KjU = BentoColor.INSTANCE.m21253getDayXray0d7_KjU();
                        } else {
                            jM21346getNightUv0d7_KjU = BentoColor.INSTANCE.m21352getNightXray0d7_KjU();
                        }
                        composer2.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-82690962);
                        composer2 = composer;
                        jM21346getNightUv0d7_KjU = SduiColors2.m18897toComposeColorDefaultediJQMabo(themedColorDto, 0L, composer2, i & 14, 1);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return jM21346getNightUv0d7_KjU;
                }
            }
