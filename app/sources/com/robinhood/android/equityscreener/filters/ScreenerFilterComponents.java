package com.robinhood.android.equityscreener.filters;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equityscreener.filters.ScreenerFilterComponents;
import com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelector;
import com.robinhood.android.equityscreener.indicators.IndicatorRangeSliderSelector5;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterParameters;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelection;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilterSelectionParameters;
import com.robinhood.models.serverdriven.experimental.api.ScreenerMoneyRangeFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerMoneyRangeFilterParameters;
import com.robinhood.models.serverdriven.experimental.api.ScreenerMultiSelectFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerMultiSelectFilterParameters;
import com.robinhood.models.serverdriven.experimental.api.ScreenerNumericRangeFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerNumericRangeFilterParameters;
import com.robinhood.models.serverdriven.experimental.api.ScreenerPercentRangeFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerPercentRangeFilterParameters;
import com.robinhood.models.serverdriven.experimental.api.ScreenerSingleSelectFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerSingleSelectFilterParameters;
import com.robinhood.models.serverdriven.experimental.api.SliderAlgorithm;
import com.robinhood.models.serverdriven.experimental.api.SliderValueTruncationMode;
import com.robinhood.utils.compose.TargetedScrollColumnScope;
import com.robinhood.utils.compose.TargetedScrollKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScreenerFilterComponents.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aO\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aK\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aE\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001as\u0010+\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010\u001f2\b\u0010*\u001a\u0004\u0018\u00010\u001f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b+\u0010,\u001ah\u00104\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2C\u00103\u001a?\u0012\u0004\u0012\u00020.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`0\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00000\u0006j\u0002`1\u0012\u0004\u0012\u00020\u00070-¢\u0006\u0002\b2H\u0007¢\u0006\u0004\b4\u00105*\"\u00106\"\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070\u0006*\"\u00107\"\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00000\u00062\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00000\u0006¨\u00068"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilterParameters;", "filterParams", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilter;", "currentFilterValues", "Lkotlin/Function1;", "", "onSelectFilterUpdated", "", "isSecondary", "SelectFilters", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilterParameters;Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilter;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilterSelectionParameters;", "options", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerMultiSelectFilter;", "currentScreenerFilter", "onSelectionClicked", "MultiSelectFilter", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/ScreenerMultiSelectFilter;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerSingleSelectFilter;", "SingleSelectFilter", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/ScreenerSingleSelectFilter;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilterSelection;", "activeItem", "PrimarySingleSelectFilter", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SecondarySingleSelectFilter", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/ScreenerSingleSelectFilter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "min", AnalyticsStrings.MAX_WELCOME_TAG, "Lcom/robinhood/android/equityscreener/indicators/DataType;", "type", "Lcom/robinhood/models/serverdriven/experimental/api/SliderAlgorithm;", "sliderAlgorithm", "Lcom/robinhood/models/serverdriven/experimental/api/SliderValueTruncationMode;", "truncation", "steps", "currentMin", "currentMax", "SliderRangeFilter", "(Landroidx/compose/ui/Modifier;FFLcom/robinhood/android/equityscreener/indicators/DataType;Lcom/robinhood/models/serverdriven/experimental/api/SliderAlgorithm;Lcom/robinhood/models/serverdriven/experimental/api/SliderValueTruncationMode;FLjava/lang/Float;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function3;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Lcom/robinhood/android/equityscreener/filters/OnOptionFocusedCallback;", "Lcom/robinhood/android/equityscreener/filters/CreateModifierCallback;", "Lkotlin/ExtensionFunctionType;", "content", "NestedSelectFilterLayout", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "OnOptionFocusedCallback", "CreateModifierCallback", "feature-equity-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScreenerFilterComponents {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiSelectFilter$lambda$7(Modifier modifier, List list, ScreenerMultiSelectFilter screenerMultiSelectFilter, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        MultiSelectFilter(modifier, list, screenerMultiSelectFilter, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NestedSelectFilterLayout$lambda$29(Modifier modifier, boolean z, Function5 function5, int i, int i2, Composer composer, int i3) {
        NestedSelectFilterLayout(modifier, z, function5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimarySingleSelectFilter$lambda$11(Modifier modifier, List list, SnapshotState snapshotState, Function1 function1, int i, int i2, Composer composer, int i3) {
        PrimarySingleSelectFilter(modifier, list, snapshotState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondarySingleSelectFilter$lambda$18(Modifier modifier, List list, ScreenerSingleSelectFilter screenerSingleSelectFilter, Function1 function1, int i, int i2, Composer composer, int i3) {
        SecondarySingleSelectFilter(modifier, list, screenerSingleSelectFilter, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectFilters$lambda$2(Modifier modifier, ScreenerFilterParameters screenerFilterParameters, ScreenerFilter screenerFilter, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        SelectFilters(modifier, screenerFilterParameters, screenerFilter, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleSelectFilter$lambda$9(Modifier modifier, List list, ScreenerSingleSelectFilter screenerSingleSelectFilter, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        SingleSelectFilter(modifier, list, screenerSingleSelectFilter, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderRangeFilter$lambda$23(Modifier modifier, float f, float f2, IndicatorRangeSliderSelector indicatorRangeSliderSelector, SliderAlgorithm sliderAlgorithm, SliderValueTruncationMode sliderValueTruncationMode, float f3, Float f4, Float f5, Function1 function1, int i, int i2, Composer composer, int i3) {
        SliderRangeFilter(modifier, f, f2, indicatorRangeSliderSelector, sliderAlgorithm, sliderValueTruncationMode, f3, f4, f5, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectFilters(Modifier modifier, final ScreenerFilterParameters screenerFilterParameters, final ScreenerFilter screenerFilter, final Function1<? super ScreenerFilter, Unit> onSelectFilterUpdated, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        boolean z3;
        Tuples2 tuples2M3642to;
        Tuples2 tuples2M3642to2;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSelectFilterUpdated, "onSelectFilterUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(1365699967);
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
            i3 |= composerStartRestartGroup.changedInstance(screenerFilterParameters) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenerFilter) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectFilterUpdated) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    z2 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1365699967, i3, -1, "com.robinhood.android.equityscreener.filters.SelectFilters (ScreenerFilterComponents.kt:56)");
                }
                if (!(screenerFilterParameters instanceof ScreenerMultiSelectFilterParameters)) {
                    composerStartRestartGroup.startReplaceGroup(-657150284);
                    MultiSelectFilter(modifier4, ((ScreenerMultiSelectFilterParameters) screenerFilterParameters).getOptions(), screenerFilter instanceof ScreenerMultiSelectFilter ? (ScreenerMultiSelectFilter) screenerFilter : null, onSelectFilterUpdated, z2, composerStartRestartGroup, i3 & 64526, 0);
                    z3 = z2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    z3 = z2;
                    if (screenerFilterParameters instanceof ScreenerNumericRangeFilterParameters) {
                        composerStartRestartGroup.startReplaceGroup(-656757390);
                        ScreenerNumericRangeFilterParameters screenerNumericRangeFilterParameters = (ScreenerNumericRangeFilterParameters) screenerFilterParameters;
                        ScreenerNumericRangeFilter screenerNumericRangeFilter = screenerFilter instanceof ScreenerNumericRangeFilter ? (ScreenerNumericRangeFilter) screenerFilter : null;
                        float min = screenerNumericRangeFilterParameters.getMin();
                        int i6 = i3;
                        float max = screenerNumericRangeFilterParameters.getMax();
                        Float max2 = null;
                        IndicatorRangeSliderSelector indicatorRangeSliderSelector = IndicatorRangeSliderSelector.NUMERIC;
                        SliderAlgorithm algorithm = screenerNumericRangeFilterParameters.getAlgorithm();
                        SliderValueTruncationMode truncation = screenerNumericRangeFilterParameters.getTruncation();
                        float step = screenerNumericRangeFilterParameters.getStep();
                        Float min2 = screenerNumericRangeFilter != null ? screenerNumericRangeFilter.getMin() : null;
                        if (screenerNumericRangeFilter != null) {
                            max2 = screenerNumericRangeFilter.getMax();
                        }
                        SliderRangeFilter(modifier4, min, max, indicatorRangeSliderSelector, algorithm, truncation, step, min2, max2, onSelectFilterUpdated, composerStartRestartGroup, (i6 & 14) | 3072 | ((i6 << 18) & 1879048192), 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        int i7 = i3;
                        if (screenerFilterParameters instanceof ScreenerSingleSelectFilterParameters) {
                            composerStartRestartGroup.startReplaceGroup(-656094734);
                            SingleSelectFilter(modifier4, ((ScreenerSingleSelectFilterParameters) screenerFilterParameters).getOptions(), screenerFilter instanceof ScreenerSingleSelectFilter ? (ScreenerSingleSelectFilter) screenerFilter : null, onSelectFilterUpdated, z3, composerStartRestartGroup, i7 & 64526, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (screenerFilterParameters instanceof ScreenerMoneyRangeFilterParameters) {
                            composerStartRestartGroup.startReplaceGroup(-655690587);
                            if (screenerFilter instanceof ScreenerMoneyRangeFilter) {
                                ScreenerMoneyRangeFilter screenerMoneyRangeFilter = (ScreenerMoneyRangeFilter) screenerFilter;
                                Money min3 = screenerMoneyRangeFilter.getMin();
                                Float fValueOf = min3 != null ? Float.valueOf(SelectFilters$toFloat(min3)) : null;
                                Money max3 = screenerMoneyRangeFilter.getMax();
                                tuples2M3642to2 = Tuples4.m3642to(fValueOf, max3 != null ? Float.valueOf(SelectFilters$toFloat(max3)) : null);
                            } else if (screenerFilter instanceof ScreenerNumericRangeFilter) {
                                ScreenerNumericRangeFilter screenerNumericRangeFilter2 = (ScreenerNumericRangeFilter) screenerFilter;
                                tuples2M3642to2 = Tuples4.m3642to(screenerNumericRangeFilter2.getMin(), screenerNumericRangeFilter2.getMax());
                            } else {
                                tuples2M3642to2 = Tuples4.m3642to(null, null);
                            }
                            Float f = (Float) tuples2M3642to2.component1();
                            Float f2 = (Float) tuples2M3642to2.component2();
                            ScreenerMoneyRangeFilterParameters screenerMoneyRangeFilterParameters = (ScreenerMoneyRangeFilterParameters) screenerFilterParameters;
                            SliderRangeFilter(modifier4, screenerMoneyRangeFilterParameters.getMin().getAmount().floatValue(), screenerMoneyRangeFilterParameters.getMax().getAmount().floatValue(), IndicatorRangeSliderSelector.DOLLARS, SliderAlgorithm.LINEAR, screenerMoneyRangeFilterParameters.getTruncation(), screenerMoneyRangeFilterParameters.getStep(), f, f2, onSelectFilterUpdated, composerStartRestartGroup, (i7 & 14) | 27648 | ((i7 << 18) & 1879048192), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (screenerFilterParameters instanceof ScreenerPercentRangeFilterParameters) {
                            composerStartRestartGroup.startReplaceGroup(-654663154);
                            if (screenerFilter instanceof ScreenerPercentRangeFilter) {
                                ScreenerPercentRangeFilter screenerPercentRangeFilter = (ScreenerPercentRangeFilter) screenerFilter;
                                tuples2M3642to = Tuples4.m3642to(screenerPercentRangeFilter.getMin(), screenerPercentRangeFilter.getMax());
                            } else if (screenerFilter instanceof ScreenerNumericRangeFilter) {
                                ScreenerNumericRangeFilter screenerNumericRangeFilter3 = (ScreenerNumericRangeFilter) screenerFilter;
                                tuples2M3642to = Tuples4.m3642to(screenerNumericRangeFilter3.getMin(), screenerNumericRangeFilter3.getMax());
                            } else {
                                tuples2M3642to = Tuples4.m3642to(null, null);
                            }
                            Float f3 = (Float) tuples2M3642to.component1();
                            Float f4 = (Float) tuples2M3642to.component2();
                            ScreenerPercentRangeFilterParameters screenerPercentRangeFilterParameters = (ScreenerPercentRangeFilterParameters) screenerFilterParameters;
                            SliderRangeFilter(modifier4, screenerPercentRangeFilterParameters.getMin(), screenerPercentRangeFilterParameters.getMax(), IndicatorRangeSliderSelector.PERCENTAGE, screenerPercentRangeFilterParameters.getAlgorithm(), null, screenerPercentRangeFilterParameters.getStep(), f3, f4, onSelectFilterUpdated, composerStartRestartGroup, 199680 | (i7 & 14) | ((i7 << 18) & 1879048192), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (screenerFilterParameters instanceof ScreenerNumericRangeFilter) {
                            composerStartRestartGroup.startReplaceGroup(-653862827);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (screenerFilterParameters instanceof ScreenerSingleSelectFilter) {
                            composerStartRestartGroup.startReplaceGroup(-653807275);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (screenerFilterParameters instanceof ScreenerMoneyRangeFilter) {
                            composerStartRestartGroup.startReplaceGroup(-653753707);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (screenerFilterParameters instanceof ScreenerMultiSelectFilter) {
                            composerStartRestartGroup.startReplaceGroup(-653699147);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (screenerFilterParameters instanceof ScreenerPercentRangeFilter) {
                            composerStartRestartGroup.startReplaceGroup(-653643595);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-653612843);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerFilterComponents.SelectFilters$lambda$2(modifier3, screenerFilterParameters, screenerFilter, onSelectFilterUpdated, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        z2 = z;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(screenerFilterParameters instanceof ScreenerMultiSelectFilterParameters)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z3;
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float SelectFilters$toFloat(Money money) {
        return money.getAmount().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MultiSelectFilter(Modifier modifier, final List<ScreenerFilterSelectionParameters> options, final ScreenerMultiSelectFilter screenerMultiSelectFilter, final Function1<? super ScreenerFilter, Unit> onSelectionClicked, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        boolean zChanged;
        Object objRememberedValue;
        List<ScreenerFilterSelection> listEmptyList;
        Object next;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onSelectionClicked, "onSelectionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1055107825);
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
            i3 |= composerStartRestartGroup.changedInstance(options) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenerMultiSelectFilter) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectionClicked) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z4 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1055107825, i3, -1, "com.robinhood.android.equityscreener.filters.MultiSelectFilter (ScreenerFilterComponents.kt:152)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(screenerMultiSelectFilter);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (screenerMultiSelectFilter != null || (listEmptyList = screenerMultiSelectFilter.getSelections()) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List<ScreenerFilterSelectionParameters> list = options;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (ScreenerFilterSelectionParameters screenerFilterSelectionParameters : list) {
                        Iterator<T> it = listEmptyList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (Intrinsics.areEqual(((ScreenerFilterSelection) next).getId(), screenerFilterSelectionParameters.getId())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        arrayList.add((ScreenerFilterSelection) next);
                    }
                    objRememberedValue = SnapshotStateKt.toMutableStateList(arrayList);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = (i3 & 14) | 384 | ((i3 >> 9) & 112);
                Modifier modifier5 = modifier4;
                NestedSelectFilterLayout(modifier5, z4, ComposableLambda3.rememberComposableLambda(-1960795091, true, new C157241(options, (List) objRememberedValue, z4, onSelectionClicked), composerStartRestartGroup, 54), composerStartRestartGroup, i6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                z3 = z4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerFilterComponents.MultiSelectFilter$lambda$7(modifier3, options, screenerMultiSelectFilter, onSelectionClicked, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        z2 = z;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(screenerMultiSelectFilter);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                if (screenerMultiSelectFilter != null) {
                    listEmptyList = CollectionsKt.emptyList();
                    List<ScreenerFilterSelectionParameters> list2 = options;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    while (r5.hasNext()) {
                    }
                    objRememberedValue = SnapshotStateKt.toMutableStateList(arrayList2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    int i62 = (i3 & 14) | 384 | ((i3 >> 9) & 112);
                    Modifier modifier52 = modifier4;
                    NestedSelectFilterLayout(modifier52, z4, ComposableLambda3.rememberComposableLambda(-1960795091, true, new C157241(options, (List) objRememberedValue, z4, onSelectionClicked), composerStartRestartGroup, 54), composerStartRestartGroup, i62, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    z3 = z4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MultiSelectFilter$updatedSelection(Function1<? super ScreenerFilter, Unit> function1, List<ScreenerFilterSelection> list) {
        function1.invoke(new ScreenerMultiSelectFilter(CollectionsKt.filterNotNull(list)));
    }

    /* compiled from: ScreenerFilterComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$MultiSelectFilter$1 */
    static final class C157241 implements Function5<Column5, Function1<? super Integer, ? extends Unit>, Function1<? super Integer, ? extends Modifier>, Composer, Integer, Unit> {
        final /* synthetic */ List<ScreenerFilterSelection> $checkedItems;
        final /* synthetic */ boolean $isSecondary;
        final /* synthetic */ Function1<ScreenerFilter, Unit> $onSelectionClicked;
        final /* synthetic */ List<ScreenerFilterSelectionParameters> $options;

        /* JADX WARN: Multi-variable type inference failed */
        C157241(List<ScreenerFilterSelectionParameters> list, List<ScreenerFilterSelection> list2, boolean z, Function1<? super ScreenerFilter, Unit> function1) {
            this.$options = list;
            this.$checkedItems = list2;
            this.$isSecondary = z;
            this.$onSelectionClicked = function1;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Function1<? super Integer, ? extends Unit> function1, Function1<? super Integer, ? extends Modifier> function12, Composer composer, Integer num) {
            invoke(column5, (Function1<? super Integer, Unit>) function1, function12, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(List list, int i, ScreenerFilterSelection screenerFilterSelection, Function1 function1, ScreenerFilter secondaryFilterValues) {
            Intrinsics.checkNotNullParameter(secondaryFilterValues, "secondaryFilterValues");
            list.set(i, ScreenerFilterSelection.copy$default(screenerFilterSelection, null, secondaryFilterValues, 1, null));
            ScreenerFilterComponents.MultiSelectFilter$updatedSelection(function1, list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Column5 NestedSelectFilterLayout, Function1<? super Integer, Unit> onOptionFocusedCallback, Function1<? super Integer, ? extends Modifier> createModifierCallback, Composer composer, int i) {
            int i2;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(NestedSelectFilterLayout, "$this$NestedSelectFilterLayout");
            Intrinsics.checkNotNullParameter(onOptionFocusedCallback, "onOptionFocusedCallback");
            Intrinsics.checkNotNullParameter(createModifierCallback, "createModifierCallback");
            int i3 = (i & 48) == 0 ? (composer2.changedInstance(onOptionFocusedCallback) ? 32 : 16) | i : i;
            if ((i & 384) == 0) {
                i3 |= composer2.changedInstance(createModifierCallback) ? 256 : 128;
            }
            int i4 = i3;
            if ((i4 & 1169) == 1168 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1960795091, i4, -1, "com.robinhood.android.equityscreener.filters.MultiSelectFilter.<anonymous> (ScreenerFilterComponents.kt:171)");
            }
            List<ScreenerFilterSelectionParameters> list = this.$options;
            final List<ScreenerFilterSelection> list2 = this.$checkedItems;
            boolean z = this.$isSecondary;
            Function1<ScreenerFilter, Unit> function1 = this.$onSelectionClicked;
            int i5 = 0;
            int i6 = 0;
            Composer composer3 = composer2;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ScreenerFilterSelectionParameters screenerFilterSelectionParameters = (ScreenerFilterSelectionParameters) obj;
                List<ScreenerFilterSelectionParameters> list3 = list;
                boolean z2 = z;
                final Function1<ScreenerFilter, Unit> function12 = function1;
                final int i8 = i6;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(96546820, true, new ScreenerFilterComponents2(screenerFilterSelectionParameters, list2, i6, list3, z2, function12), composer3, 54), composer3, 6);
                ScreenerFilterParameters secondary_filter = screenerFilterSelectionParameters.getSecondary_filter();
                composer3.startReplaceGroup(1166595126);
                if (secondary_filter == null) {
                    i2 = i5;
                } else {
                    final ScreenerFilterSelection screenerFilterSelection = list2.get(i8);
                    composer3.startReplaceGroup(-403557234);
                    if (screenerFilterSelection != null) {
                        composer3.startReplaceGroup(-1633490746);
                        int i9 = (composer3.changed(i8) ? 1 : 0) | ((i4 & 112) != 32 ? i5 : 1);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (i9 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ScreenerFilterComponents3(onOptionFocusedCallback, i8, null);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(screenerFilterSelection, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, i5);
                        Modifier modifierInvoke = createModifierCallback.invoke(Integer.valueOf(i8));
                        ScreenerFilterSelection screenerFilterSelection2 = list2.get(i8);
                        ScreenerFilter secondary_filter2 = screenerFilterSelection2 != null ? screenerFilterSelection2.getSecondary_filter() : null;
                        composer3.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer3.changedInstance(list2) | composer3.changed(i8) | composer3.changedInstance(screenerFilterSelection) | composer3.changed(function12);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (!zChangedInstance) {
                            Object obj2 = objRememberedValue2;
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                Function1 function13 = new Function1() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$MultiSelectFilter$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return ScreenerFilterComponents.C157241.invoke$lambda$4$lambda$3$lambda$2$lambda$1(list2, i8, screenerFilterSelection, function12, (ScreenerFilter) obj3);
                                    }
                                };
                                composer3.updateRememberedValue(function13);
                                obj2 = function13;
                            }
                            Function1 function14 = (Function1) obj2;
                            composer3.endReplaceGroup();
                            i2 = i5;
                            ScreenerFilterComponents.SelectFilters(modifierInvoke, secondary_filter, secondary_filter2, function14, false, composer3, 0, 16);
                        }
                    } else {
                        i2 = i5;
                    }
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                composer3 = composer;
                function1 = function12;
                i5 = i2;
                list = list3;
                z = z2;
                i6 = i7;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SingleSelectFilter(Modifier modifier, final List<ScreenerFilterSelectionParameters> options, final ScreenerSingleSelectFilter screenerSingleSelectFilter, final Function1<? super ScreenerFilter, Unit> onSelectionClicked, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onSelectionClicked, "onSelectionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1133792599);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(options) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenerSingleSelectFilter) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectionClicked) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    z2 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1133792599, i3, -1, "com.robinhood.android.equityscreener.filters.SingleSelectFilter (ScreenerFilterComponents.kt:222)");
                }
                if (!z2) {
                    composerStartRestartGroup.startReplaceGroup(1192795877);
                    modifier2 = modifier;
                    SecondarySingleSelectFilter(modifier2, options, screenerSingleSelectFilter, onSelectionClicked, composerStartRestartGroup, i3 & 8190, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier2 = modifier;
                    composerStartRestartGroup.startReplaceGroup(1193032686);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged = composerStartRestartGroup.changed(screenerSingleSelectFilter);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(screenerSingleSelectFilter != null ? screenerSingleSelectFilter.getSelection() : null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PrimarySingleSelectFilter(modifier2, options, (SnapshotState) objRememberedValue, onSelectionClicked, composerStartRestartGroup, i3 & 7294, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
            }
            final boolean z3 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerFilterComponents.SingleSelectFilter$lambda$9(modifier3, options, screenerSingleSelectFilter, onSelectionClicked, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        z2 = z;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z2) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
        }
        final boolean z32 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PrimarySingleSelectFilter(Modifier modifier, final List<ScreenerFilterSelectionParameters> list, final SnapshotState<ScreenerFilterSelection> snapshotState, final Function1<? super ScreenerFilter, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1620572195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(snapshotState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1620572195, i3, -1, "com.robinhood.android.equityscreener.filters.PrimarySingleSelectFilter (ScreenerFilterComponents.kt:248)");
            }
            TargetedScrollKt.TargetedScrollColumn(AnimationModifier.animateContentSize$default(modifier, null, null, 3, null), null, null, null, ComposableLambda3.rememberComposableLambda(-726965062, true, new C157261(list, snapshotState, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerFilterComponents.PrimarySingleSelectFilter$lambda$11(modifier2, list, snapshotState, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PrimarySingleSelectFilter$updateSelection(Function1<? super ScreenerFilter, Unit> function1, ScreenerFilterSelection screenerFilterSelection) {
        function1.invoke(new ScreenerSingleSelectFilter(screenerFilterSelection));
    }

    /* compiled from: ScreenerFilterComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$PrimarySingleSelectFilter$1 */
    static final class C157261 implements Function3<TargetedScrollColumnScope<Integer>, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<ScreenerFilterSelection> $activeItem;
        final /* synthetic */ Function1<ScreenerFilter, Unit> $onSelectionClicked;
        final /* synthetic */ List<ScreenerFilterSelectionParameters> $options;

        /* JADX WARN: Multi-variable type inference failed */
        C157261(List<ScreenerFilterSelectionParameters> list, SnapshotState<ScreenerFilterSelection> snapshotState, Function1<? super ScreenerFilter, Unit> function1) {
            this.$options = list;
            this.$activeItem = snapshotState;
            this.$onSelectionClicked = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(TargetedScrollColumnScope<Integer> targetedScrollColumnScope, Composer composer, Integer num) {
            invoke(targetedScrollColumnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(ScreenerFilterSelection screenerFilterSelection, Function1 function1, ScreenerFilter secondaryFilterValues) {
            Intrinsics.checkNotNullParameter(secondaryFilterValues, "secondaryFilterValues");
            ScreenerFilterComponents.PrimarySingleSelectFilter$updateSelection(function1, ScreenerFilterSelection.copy$default(screenerFilterSelection, null, secondaryFilterValues, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(TargetedScrollColumnScope<Integer> TargetedScrollColumn, Composer composer, int i) {
            int i2;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(TargetedScrollColumn, "$this$TargetedScrollColumn");
            int i3 = (i & 6) == 0 ? i | (composer2.changed(TargetedScrollColumn) ? 4 : 2) : i;
            if ((i3 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-726965062, i3, -1, "com.robinhood.android.equityscreener.filters.PrimarySingleSelectFilter.<anonymous> (ScreenerFilterComponents.kt:261)");
            }
            List<ScreenerFilterSelectionParameters> list = this.$options;
            SnapshotState<ScreenerFilterSelection> snapshotState = this.$activeItem;
            Function1<ScreenerFilter, Unit> function1 = this.$onSelectionClicked;
            int i4 = 0;
            int i5 = 0;
            Composer composer3 = composer2;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ScreenerFilterSelectionParameters screenerFilterSelectionParameters = (ScreenerFilterSelectionParameters) obj;
                String id = screenerFilterSelectionParameters.getId();
                ScreenerFilterSelection value = snapshotState.getValue();
                boolean zAreEqual = Intrinsics.areEqual(id, value != null ? value.getId() : null);
                SnapshotState<ScreenerFilterSelection> snapshotState2 = snapshotState;
                final Function1<ScreenerFilter, Unit> function12 = function1;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(937847761, true, new ScreenerFilterComponents4(screenerFilterSelectionParameters, i5, list, (screenerFilterSelectionParameters.getSecondary_filter() == null || !zAreEqual) ? i4 : 1, zAreEqual, snapshotState2, function12), composer3, 54), composer3, 6);
                ScreenerFilterParameters secondary_filter = screenerFilterSelectionParameters.getSecondary_filter();
                composer3.startReplaceGroup(1466280631);
                if (secondary_filter == null) {
                    i2 = i4;
                } else {
                    final ScreenerFilterSelection value2 = snapshotState2.getValue();
                    composer3.startReplaceGroup(1349254834);
                    if (Intrinsics.areEqual(value2 != null ? value2.getId() : null, screenerFilterSelectionParameters.getId())) {
                        composer3.startReplaceGroup(-1633490746);
                        int i7 = ((i3 & 14) != 4 ? i4 : 1) | (composer3.changed(i5) ? 1 : 0);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (i7 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ScreenerFilterComponents5(TargetedScrollColumn, i5, null);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(value2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, i4);
                        Modifier modifierRegisterAsScrollTarget = TargetedScrollColumn.registerAsScrollTarget(Modifier.INSTANCE, Integer.valueOf(i5));
                        ScreenerFilterSelection value3 = snapshotState2.getValue();
                        ScreenerFilter secondary_filter2 = value3 != null ? value3.getSecondary_filter() : null;
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChanged = composer3.changed(function12) | composer3.changedInstance(value2);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (!zChanged) {
                            Object obj2 = objRememberedValue2;
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                Function1 function13 = new Function1() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$PrimarySingleSelectFilter$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return ScreenerFilterComponents.C157261.invoke$lambda$4$lambda$3$lambda$2$lambda$1(value2, function12, (ScreenerFilter) obj3);
                                    }
                                };
                                composer3.updateRememberedValue(function13);
                                obj2 = function13;
                            }
                            composer3.endReplaceGroup();
                            i2 = i4;
                            ScreenerFilterComponents.SelectFilters(modifierRegisterAsScrollTarget, secondary_filter, secondary_filter2, (Function1) obj2, true, composer3, 24576, 0);
                        }
                    } else {
                        i2 = i4;
                    }
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                composer3 = composer;
                function1 = function12;
                i4 = i2;
                snapshotState = snapshotState2;
                i5 = i6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void SecondarySingleSelectFilter(Modifier modifier, final List<ScreenerFilterSelectionParameters> list, final ScreenerSingleSelectFilter screenerSingleSelectFilter, final Function1<? super ScreenerFilter, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-968118741);
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
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenerSingleSelectFilter) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-968118741, i3, -1, "com.robinhood.android.equityscreener.filters.SecondarySingleSelectFilter (ScreenerFilterComponents.kt:312)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(screenerSingleSelectFilter);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(screenerSingleSelectFilter != null ? screenerSingleSelectFilter.getSelection() : null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
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
            Modifier modifier5 = modifier4;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(ScrollKt.horizontalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, composerStartRestartGroup, 0, 1);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2134021595);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(874185374, true, new ScreenerFilterComponents6((ScreenerFilterSelectionParameters) it.next(), snapshotState, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerFilterComponents.SecondarySingleSelectFilter$lambda$18(modifier3, list, screenerSingleSelectFilter, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SecondarySingleSelectFilter$updateSelection$14(Function1<? super ScreenerFilter, Unit> function1, ScreenerFilterSelection screenerFilterSelection) {
        function1.invoke(new ScreenerSingleSelectFilter(screenerFilterSelection));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SliderRangeFilter(Modifier modifier, final float f, final float f2, final IndicatorRangeSliderSelector type2, final SliderAlgorithm sliderAlgorithm, final SliderValueTruncationMode sliderValueTruncationMode, final float f3, final Float f4, final Float f5, final Function1<? super ScreenerFilter, Unit> onSelectionClicked, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Object objRememberedValue;
        Composer.Companion companion;
        int i4;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        boolean z;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(sliderAlgorithm, "sliderAlgorithm");
        Intrinsics.checkNotNullParameter(onSelectionClicked, "onSelectionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(764544838);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(type2.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(sliderAlgorithm.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(sliderValueTruncationMode == null ? -1 : sliderValueTruncationMode.ordinal()) ? 131072 : 65536;
        }
        if ((i2 & 64) == 0) {
            if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changed(f5) ? 67108864 : 33554432;
            }
            if ((i2 & 512) == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSelectionClicked) ? 536870912 : 268435456;
            }
            if ((306783379 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(764544838, i3, -1, "com.robinhood.android.equityscreener.filters.SliderRangeFilter (ScreenerFilterComponents.kt:369)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    i4 = 2;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(f4, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i4 = 2;
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 != companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(f5, null, i4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                Float f6 = (Float) snapshotState.getValue();
                Float fValueOf = f6 == null ? Float.valueOf(RangesKt.coerceAtLeast(f6.floatValue(), f)) : null;
                Float f7 = (Float) snapshotState2.getValue();
                Float fValueOf2 = f7 == null ? Float.valueOf(RangesKt.coerceAtMost(f7.floatValue(), f2)) : null;
                Ranges3<Float> ranges3RangeTo = RangesKt.rangeTo(f, f2);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z = (1879048192 & i3) != 536870912;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ScreenerFilterComponents.SliderRangeFilter$lambda$22$lambda$21(snapshotState2, snapshotState, onSelectionClicked, (Float) obj, (Float) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector(modifierM5144paddingVpY3zN4$default, type2, ranges3RangeTo, sliderAlgorithm, fValueOf, fValueOf2, f3, sliderValueTruncationMode, (Function2) objRememberedValue3, composer2, ((i3 >> 6) & 112) | ((i3 >> 3) & 7168) | (3670016 & i3) | (29360128 & (i3 << 6)), 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerFilterComponents.SliderRangeFilter$lambda$23(modifier3, f, f2, type2, sliderAlgorithm, sliderValueTruncationMode, f3, f4, f5, onSelectionClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((306783379 & i3) == 306783378) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue != companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 != companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            Float f62 = (Float) snapshotState.getValue();
            if (f62 == null) {
            }
            Float f72 = (Float) snapshotState2.getValue();
            if (f72 == null) {
            }
            Ranges3<Float> ranges3RangeTo2 = RangesKt.rangeTo(f, f2);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((1879048192 & i3) != 536870912) {
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue3 = new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerFilterComponents.SliderRangeFilter$lambda$22$lambda$21(snapshotState2, snapshotState, onSelectionClicked, (Float) obj, (Float) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                IndicatorRangeSliderSelector5.IndicatorRangeSliderSelector(modifierM5144paddingVpY3zN4$default2, type2, ranges3RangeTo2, sliderAlgorithm, fValueOf, fValueOf2, f3, sliderValueTruncationMode, (Function2) objRememberedValue3, composer2, ((i3 >> 6) & 112) | ((i3 >> 3) & 7168) | (3670016 & i3) | (29360128 & (i3 << 6)), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SliderRangeFilter$lambda$22$lambda$21(SnapshotState snapshotState, SnapshotState snapshotState2, Function1 function1, Float f, Float f2) {
        snapshotState.setValue(f2);
        snapshotState2.setValue(f);
        function1.invoke(new ScreenerNumericRangeFilter(f, f2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NestedSelectFilterLayout(Modifier modifier, boolean z, final Function5<? super Column5, ? super Function1<? super Integer, Unit>, ? super Function1<? super Integer, ? extends Modifier>, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        boolean z3;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2098970638);
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
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2098970638, i3, -1, "com.robinhood.android.equityscreener.filters.NestedSelectFilterLayout (ScreenerFilterComponents.kt:404)");
                }
                if (!z3) {
                    composerStartRestartGroup.startReplaceGroup(-5177786);
                    Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(modifier4, null, null, 3, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ScreenerFilterComponents.NestedSelectFilterLayout$lambda$28$lambda$25$lambda$24(((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ScreenerFilterComponents.NestedSelectFilterLayout$lambda$28$lambda$27$lambda$26(((Integer) obj).intValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    content.invoke(column6, function1, (Function1) objRememberedValue2, composerStartRestartGroup, Integer.valueOf(((i3 << 3) & 7168) | 438));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-4969559);
                    TargetedScrollKt.TargetedScrollColumn(AnimationModifier.animateContentSize$default(modifier4, null, null, 3, null), null, null, null, ComposableLambda3.rememberComposableLambda(-1020234665, true, new C157252(content), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z4 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerFilterComponents.NestedSelectFilterLayout$lambda$29(modifier3, z4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z3) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NestedSelectFilterLayout$lambda$28$lambda$25$lambda$24(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier NestedSelectFilterLayout$lambda$28$lambda$27$lambda$26(int i) {
        return Modifier.INSTANCE;
    }

    /* compiled from: ScreenerFilterComponents.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$NestedSelectFilterLayout$2 */
    static final class C157252 implements Function3<TargetedScrollColumnScope<Integer>, Composer, Integer, Unit> {
        final /* synthetic */ Function5<Column5, Function1<? super Integer, Unit>, Function1<? super Integer, ? extends Modifier>, Composer, Integer, Unit> $content;

        /* JADX WARN: Multi-variable type inference failed */
        C157252(Function5<? super Column5, ? super Function1<? super Integer, Unit>, ? super Function1<? super Integer, ? extends Modifier>, ? super Composer, ? super Integer, Unit> function5) {
            this.$content = function5;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(TargetedScrollColumnScope<Integer> targetedScrollColumnScope, Composer composer, Integer num) {
            invoke(targetedScrollColumnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final TargetedScrollColumnScope<Integer> TargetedScrollColumn, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TargetedScrollColumn, "$this$TargetedScrollColumn");
            if ((i & 6) == 0) {
                i |= composer.changed(TargetedScrollColumn) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1020234665, i, -1, "com.robinhood.android.equityscreener.filters.NestedSelectFilterLayout.<anonymous> (ScreenerFilterComponents.kt:418)");
            }
            Function5<Column5, Function1<? super Integer, Unit>, Function1<? super Integer, ? extends Modifier>, Composer, Integer, Unit> function5 = this.$content;
            composer.startReplaceGroup(5004770);
            int i2 = i & 14;
            boolean z = i2 == 4;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$NestedSelectFilterLayout$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ScreenerFilterComponents.C157252.invoke$lambda$1$lambda$0(TargetedScrollColumn, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1<? super Integer, Unit> function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean z2 = i2 == 4;
            Object objRememberedValue2 = composer.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityscreener.filters.ScreenerFilterComponentsKt$NestedSelectFilterLayout$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ScreenerFilterComponents.C157252.invoke$lambda$3$lambda$2(TargetedScrollColumn, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            function5.invoke(TargetedScrollColumn, function1, (Function1) objRememberedValue2, composer, Integer.valueOf(i2));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(TargetedScrollColumnScope targetedScrollColumnScope, int i) {
            targetedScrollColumnScope.centerOn(Integer.valueOf(i));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Modifier invoke$lambda$3$lambda$2(TargetedScrollColumnScope targetedScrollColumnScope, int i) {
            return targetedScrollColumnScope.registerAsScrollTarget(Modifier.INSTANCE, Integer.valueOf(i));
        }
    }
}
