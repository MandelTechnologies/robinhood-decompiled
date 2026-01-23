package com.robinhood.android.optionschain.chainsettings;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Density3;
import androidx.compose.p011ui.viewinterop.AndroidViewBinding;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.dropdown.RdsDropdown;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode2;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLogging2;
import com.robinhood.android.optionschain.databinding.IncludeDefaultPriceDropdownBinding;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainSettingsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\u001aí\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u001b\u001a)\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u001d2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u001e\u001ak\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0004\b$\u0010%\u001aw\u0010&\u001a\u00020\u0001*\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\b\u0001\u0010+\u001a\u00020\u001a2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\"2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0004\b.\u0010/\u001aI\u00100\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u0002012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u00102\u001aY\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020)2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u00107\u001a)\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010:\u001a;\u0010;\u001a\u00020\u0001*\u00020'2\u0006\u0010(\u001a\u00020)2\b\b\u0001\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0004\b<\u0010=\"\u0010\u0010>\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u0010\u0010@\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u0010\u0010A\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u0010\u0010B\u001a\u00020\"X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?¨\u0006C²\u0006\n\u0010D\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020FX\u008a\u008e\u0002"}, m3636d2 = {"OptionChainSettings", "", "viewState", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsViewState;", "showBottomSheet", "Lkotlin/Function1;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownType;", "switchToSbsTooltipOnClick", "Lkotlin/Function0;", "switchToSbsTooltipOnAppear", "showCustomization", "Lkotlin/Function2;", "Lcom/robinhood/models/db/OrderSide;", "Lcom/robinhood/android/options/contracts/InitialHighlightedMetric;", "logTapCustomization", "Lcom/robinhood/android/optionschain/chainsettings/logging/OptionChainSettingsLoggingTapType;", "onToggleSideBySideChain", "", "onTableMetricCheckboxChecked", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "updatePnlChartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "onBidAskPriceLabelSettingShown", "modifier", "Landroidx/compose/ui/Modifier;", "onEnabledTableMetricsReordered", "", "(Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "OptionChainSettingsDropdownSection", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownViewState;", "(Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDropdownViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DisplaySettingsSection", "showSbsNewTag", "sbsNewTagHeightDp", "Landroidx/compose/ui/unit/Dp;", "onSbsNewTagHeightUpdated", "DisplaySettingsSection-HYR8e34", "(Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DisplaySettingsOption", "Landroidx/compose/foundation/layout/RowScope;", "title", "", "subtitle", "drawableId", "borderColor", "Landroidx/compose/ui/graphics/Color;", "DisplaySettingsOption-GtVWBeY", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;JLandroidx/compose/ui/Modifier;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ListMetricsSection", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsListMetricViewState;", "(Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsListMetricViewState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ListMetricContent", "orderSide", "metricLabelOne", "metricLabelTwo", "(Lcom/robinhood/models/db/OrderSide;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PnlChartTypeSection", "pnlChartType", "(Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PnlChartTypeOption", "PnlChartTypeOption-ww6aTOc", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;IJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SectionSpacing", "F", "DisplaySettingDemoImageHeight", "DisplaySettingDemoBorder", "DisplaySettingDemoRoundedCornerRadius", "feature-options-chain_externalDebug", "showAllTableMetrics", "overlayStartY", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainSettingsComposableKt {
    private static final float SectionSpacing = C2002Dp.m7995constructorimpl(32);
    private static final float DisplaySettingDemoImageHeight = C2002Dp.m7995constructorimpl(120);
    private static final float DisplaySettingDemoBorder = C2002Dp.m7995constructorimpl((float) 1.5d);
    private static final float DisplaySettingDemoRoundedCornerRadius = C2002Dp.m7995constructorimpl(8);

    /* compiled from: OptionChainSettingsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionChainSettingsPnlChartType.values().length];
            try {
                iArr2[OptionChainSettingsPnlChartType.BY_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionChainSettingsPnlChartType.OVER_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySettingsOption_GtVWBeY$lambda$41(Row5 row5, String str, String str2, int i, Function0 function0, long j, Modifier modifier, boolean z, float f, Function1 function1, int i2, int i3, Composer composer, int i4) {
        m17188DisplaySettingsOptionGtVWBeY(row5, str, str2, i, function0, j, modifier, z, f, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySettingsSection_HYR8e34$lambda$34(OptionChainSettingsViewState optionChainSettingsViewState, Function0 function0, Function0 function02, Function1 function1, boolean z, float f, Function1 function12, int i, Composer composer, int i2) {
        m17189DisplaySettingsSectionHYR8e34(optionChainSettingsViewState, function0, function02, function1, z, f, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListMetricContent$lambda$53(OrderSide orderSide, String str, String str2, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        ListMetricContent(orderSide, str, str2, function2, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListMetricsSection$lambda$43(OptionChainSettingsListMetricViewState optionChainSettingsListMetricViewState, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        ListMetricsSection(optionChainSettingsListMetricViewState, function2, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainSettings$lambda$14(OptionChainSettingsViewState optionChainSettingsViewState, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Function2 function22, Function1 function12, Function2 function23, Function1 function13, Function0 function03, Modifier modifier, Function2 function24, int i, int i2, int i3, Composer composer, int i4) {
        OptionChainSettings(optionChainSettingsViewState, function1, function0, function02, function2, function22, function12, function23, function13, function03, modifier, function24, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainSettingsDropdownSection$lambda$23(OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState, Function1 function1, int i, Composer composer, int i2) {
        OptionChainSettingsDropdownSection(optionChainSettingsDropdownViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlChartTypeOption_ww6aTOc$lambda$64(Row5 row5, String str, int i, long j, Function0 function0, int i2, Composer composer, int i3) {
        m17190PnlChartTypeOptionww6aTOc(row5, str, i, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlChartTypeSection$lambda$60(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Function1 function1, int i, Composer composer, int i2) {
        PnlChartTypeSection(optionChainSettingsPnlChartType, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final boolean OptionChainSettings$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionChainSettings$lambda$4(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    public static final void OptionChainSettings(final OptionChainSettingsViewState viewState, final Function1<? super OptionChainSettingsViewState2, Unit> showBottomSheet, final Function0<Unit> switchToSbsTooltipOnClick, final Function0<Unit> switchToSbsTooltipOnAppear, final Function2<? super OrderSide, ? super OptionChainCustomizationLaunchMode2, Unit> showCustomization, final Function2<? super OrderSide, ? super OptionChainSettingsLogging2, Unit> logTapCustomization, final Function1<? super Boolean, Unit> onToggleSideBySideChain, final Function2<? super OptionSideBySideChainMetric, ? super Boolean, Unit> onTableMetricCheckboxChecked, final Function1<? super OptionChainSettingsPnlChartType, Unit> updatePnlChartType, final Function0<Unit> onBidAskPriceLabelSettingShown, Modifier modifier, final Function2<? super Integer, ? super Integer, Unit> onEnabledTableMetricsReordered, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        final SnapshotFloatState2 snapshotFloatState2;
        Function0<Unit> function0;
        Composer composer3;
        final Modifier modifier2;
        ImmutableList<OptionChainSettingsTableMetricRowViewState> enabledTableRows;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(showBottomSheet, "showBottomSheet");
        Intrinsics.checkNotNullParameter(switchToSbsTooltipOnClick, "switchToSbsTooltipOnClick");
        Intrinsics.checkNotNullParameter(switchToSbsTooltipOnAppear, "switchToSbsTooltipOnAppear");
        Intrinsics.checkNotNullParameter(showCustomization, "showCustomization");
        Intrinsics.checkNotNullParameter(logTapCustomization, "logTapCustomization");
        Intrinsics.checkNotNullParameter(onToggleSideBySideChain, "onToggleSideBySideChain");
        Intrinsics.checkNotNullParameter(onTableMetricCheckboxChecked, "onTableMetricCheckboxChecked");
        Intrinsics.checkNotNullParameter(updatePnlChartType, "updatePnlChartType");
        Intrinsics.checkNotNullParameter(onBidAskPriceLabelSettingShown, "onBidAskPriceLabelSettingShown");
        Intrinsics.checkNotNullParameter(onEnabledTableMetricsReordered, "onEnabledTableMetricsReordered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1558875419);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(showBottomSheet) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(switchToSbsTooltipOnClick) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(switchToSbsTooltipOnAppear) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(showCustomization) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(logTapCustomization) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onToggleSideBySideChain) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onTableMetricCheckboxChecked) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(updatePnlChartType) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBidAskPriceLabelSettingShown) ? 536870912 : 268435456;
        }
        int i6 = i3 & 1024;
        if (i6 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onEnabledTableMetricsReordered) ? 32 : 16;
        }
        int i7 = i5;
        if ((i4 & 306783379) == 306783378 && (i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function0 = switchToSbsTooltipOnClick;
            composer3 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1558875419, i4, i7, "com.robinhood.android.optionschain.chainsettings.OptionChainSettings (OptionChainSettingsComposable.kt:89)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                objRememberedValue = snapshotStateMutableStateOf$default;
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            OptionChainSettingsViewState5 metricViewState = viewState.getMetricViewState();
            OptionChainSettingsTableMetricViewState optionChainSettingsTableMetricViewState = metricViewState instanceof OptionChainSettingsTableMetricViewState ? (OptionChainSettingsTableMetricViewState) metricViewState : null;
            Integer numValueOf = (optionChainSettingsTableMetricViewState == null || (enabledTableRows = optionChainSettingsTableMetricViewState.getEnabledTableRows()) == null) ? null : Integer.valueOf(enabledTableRows.size());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                SnapshotState snapshotStateMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default2);
                objRememberedValue2 = snapshotStateMutableStateOf$default2;
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startMovableGroup(864365031, composerStartRestartGroup.joinKey(numValueOf, Boolean.valueOf(OptionChainSettings$lambda$1(snapshotState))));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Boolean boolValueOf = Boolean.valueOf(viewState.getShouldShowSettingsSwitchToSbsTooltip());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i8 = i4 & 14;
            int i9 = i4 & 896;
            Modifier modifier4 = modifier3;
            boolean z = (i9 == 256) | (i8 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(viewState)));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new PointerInputEventHandler() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$1$1
                    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        Object objAwaitPointerEventScope;
                        return (viewState.getShouldShowSettingsSwitchToSbsTooltip() && (objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C242541(switchToSbsTooltipOnClick, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objAwaitPointerEventScope : Unit.INSTANCE;
                    }

                    /* compiled from: OptionChainSettingsComposable.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$1$1$1", m3645f = "OptionChainSettingsComposable.kt", m3646l = {116}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$1$1$1 */
                    static final class C242541 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Function0<Unit> $switchToSbsTooltipOnClick;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C242541(Function0<Unit> function0, Continuation<? super C242541> continuation) {
                            super(2, continuation);
                            this.$switchToSbsTooltipOnClick = function0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C242541 c242541 = new C242541(this.$switchToSbsTooltipOnClick, continuation);
                            c242541.L$0 = obj;
                            return c242541;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                            return ((C242541) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                            /*
                                r4 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r4.label
                                r2 = 1
                                if (r1 == 0) goto L1b
                                if (r1 != r2) goto L13
                                java.lang.Object r1 = r4.L$0
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                                kotlin.ResultKt.throwOnFailure(r5)
                                goto L2f
                            L13:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r0)
                                throw r5
                            L1b:
                                kotlin.ResultKt.throwOnFailure(r5)
                                java.lang.Object r5 = r4.L$0
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r5
                                r1 = r5
                            L23:
                                r4.L$0 = r1
                                r4.label = r2
                                r5 = 0
                                java.lang.Object r5 = androidx.compose.p011ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r5, r4, r2, r5)
                                if (r5 != r0) goto L2f
                                return r0
                            L2f:
                                androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p011ui.input.pointer.PointerEvent) r5
                                int r5 = r5.getType()
                                androidx.compose.ui.input.pointer.PointerEventType$Companion r3 = androidx.compose.p011ui.input.pointer.PointerEventType.INSTANCE
                                int r3 = r3.m7160getPress7fucELk()
                                boolean r5 = androidx.compose.p011ui.input.pointer.PointerEventType.m7156equalsimpl0(r5, r3)
                                if (r5 == 0) goto L23
                                kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r4.$switchToSbsTooltipOnClick
                                r5.invoke()
                                goto L23
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$1$1.C242541.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxWidth$default, boolValueOf, (PointerInputEventHandler) objRememberedValue4);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean z2 = (i9 == 256) | (i8 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(viewState))) | ((i4 & 7168) == 2048) | ((3670016 & i4) == 1048576) | ((i4 & 112) == 32) | ((1879048192 & i4) == 536870912) | ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((i7 & 112) == 32) | ((29360128 & i4) == 8388608) | ((234881024 & i4) == 67108864);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue5 == companion.getEmpty()) {
                composer2 = composerStartRestartGroup;
                snapshotFloatState2 = snapshotFloatState22;
                Function1 function1 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsComposableKt.OptionChainSettings$lambda$13$lambda$12$lambda$11(viewState, onEnabledTableMetricsReordered, onTableMetricCheckboxChecked, snapshotFloatState2, switchToSbsTooltipOnClick, switchToSbsTooltipOnAppear, onToggleSideBySideChain, snapshotState2, showBottomSheet, onBidAskPriceLabelSettingShown, showCustomization, logTapCustomization, snapshotState, updatePnlChartType, (ReorderableLazyListScope) obj);
                    }
                };
                function0 = switchToSbsTooltipOnClick;
                composer2.updateRememberedValue(function1);
                objRememberedValue5 = function1;
            } else {
                function0 = switchToSbsTooltipOnClick;
                composer2 = composerStartRestartGroup;
                snapshotFloatState2 = snapshotFloatState22;
            }
            composer2.endReplaceGroup();
            Composer composer4 = composer2;
            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierPointerInput, lazyListStateRememberLazyListState, null, false, null, null, null, false, (Function1) objRememberedValue5, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            composer3 = composer4;
            AnimatedVisibilityKt.AnimatedVisibility(viewState.getShouldShowSettingsSwitchToSbsTooltip(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, Easing3.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, Easing3.getFastOutLinearInEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambda3.rememberComposableLambda(88187258, true, new OptionChainSettingsComposableKt$OptionChainSettings$1$3(function0, snapshotFloatState2), composer3, 54), composer3, 196608, 18);
            composer3.endNode();
            composer3.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0<Unit> function02 = function0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsComposableKt.OptionChainSettings$lambda$14(viewState, showBottomSheet, function02, switchToSbsTooltipOnAppear, showCustomization, logTapCustomization, onToggleSideBySideChain, onTableMetricCheckboxChecked, updatePnlChartType, onBidAskPriceLabelSettingShown, modifier2, onEnabledTableMetricsReordered, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void OptionChainSettings$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionChainSettings$lambda$5(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainSettings$lambda$13$lambda$12$lambda$11(final OptionChainSettingsViewState optionChainSettingsViewState, Function2 function2, Function2 function22, SnapshotFloatState2 snapshotFloatState2, Function0 function0, Function0 function02, Function1 function1, SnapshotState snapshotState, final Function1 function12, final Function0 function03, final Function2 function23, final Function2 function24, final SnapshotState snapshotState2, final Function1 function13, ReorderableLazyListScope ReorderableLazyColumn) {
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-446320672, true, new OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$1(snapshotFloatState2, optionChainSettingsViewState, function0, function02, function1, snapshotState)), 3, null);
        ComposableSingletons$OptionChainSettingsComposableKt composableSingletons$OptionChainSettingsComposableKt = ComposableSingletons$OptionChainSettingsComposableKt.INSTANCE;
        LazyListScope.item$default(ReorderableLazyColumn, null, null, composableSingletons$OptionChainSettingsComposableKt.m17170getLambda$2063144183$feature_options_chain_externalDebug(), 3, null);
        if (optionChainSettingsViewState.getBidAskSettingState() != null) {
            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1755789467, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1755789467, i, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionChainSettingsComposable.kt:155)");
                    }
                    OptionChainSettingsComposableKt.OptionChainSettingsDropdownSection(optionChainSettingsViewState.getBidAskSettingState(), function12, composer, 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, OptionChainSettingsComposableKt.SectionSpacing), composer, 6);
                    Unit unit = Unit.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    boolean zChanged = composer.changed(function03);
                    Function0<Unit> function04 = function03;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$2$1$1(function04, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        OptionChainSettingsViewState5 metricViewState = optionChainSettingsViewState.getMetricViewState();
        if (metricViewState instanceof OptionChainSettingsListMetricViewState) {
            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(386820840, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(386820840, i, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionChainSettingsComposable.kt:169)");
                    }
                    OptionChainSettingsComposableKt.ListMetricsSection((OptionChainSettingsListMetricViewState) optionChainSettingsViewState.getMetricViewState(), function23, function24, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        } else {
            if (!(metricViewState instanceof OptionChainSettingsTableMetricViewState)) {
                throw new NoWhenBranchMatchedException();
            }
            OptionChainSettingsTableMetricsComposable3.optionChainSettingsTableMetricsSection(ReorderableLazyColumn, (OptionChainSettingsTableMetricViewState) optionChainSettingsViewState.getMetricViewState(), OptionChainSettings$lambda$1(snapshotState2), function2, function22, new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionChainSettingsComposableKt.OptionChainSettings$lambda$13$lambda$12$lambda$11$lambda$10(snapshotState2);
                }
            });
        }
        LazyListScope.item$default(ReorderableLazyColumn, null, null, composableSingletons$OptionChainSettingsComposableKt.getLambda$1826535336$feature_options_chain_externalDebug(), 3, null);
        LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1421247559, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$5
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421247559, i, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionChainSettingsComposable.kt:189)");
                }
                OptionChainSettingsComposableKt.OptionChainSettingsDropdownSection(optionChainSettingsViewState.getDefaultPricingSettingState(), function12, composer, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, OptionChainSettingsComposableKt.SectionSpacing), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1015959782, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$2$1$6
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1015959782, i, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettings.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionChainSettingsComposable.kt:197)");
                }
                OptionChainSettingsComposableKt.PnlChartTypeSection(optionChainSettingsViewState.getPnlChartType(), function13, composer, 0);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, OptionChainSettingsComposableKt.SectionSpacing), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainSettings$lambda$13$lambda$12$lambda$11$lambda$10(SnapshotState snapshotState) {
        OptionChainSettings$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionChainSettingsDropdownSection(OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState, final Function1<? super OptionChainSettingsViewState2, Unit> function1, Composer composer, final int i) {
        int i2;
        final OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState2 = optionChainSettingsDropdownViewState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2033333445);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(optionChainSettingsDropdownViewState2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2033333445, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDropdownSection (OptionChainSettingsComposable.kt:238)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(optionChainSettingsDropdownViewState2.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(-669686317);
            if (optionChainSettingsDropdownViewState.getShowNewTag()) {
                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(StringResources_androidKt.stringResource(C24135R.string.option_chain_table_settings_new_tag, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU()), null, false, null, null, composerStartRestartGroup, 12582912, 116);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function3() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return OptionChainSettingsComposableKt.OptionChainSettingsDropdownSection$lambda$22$lambda$17$lambda$16((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function3 function3 = (Function3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion4.getEmpty()) {
                optionChainSettingsDropdownViewState2 = optionChainSettingsDropdownViewState;
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsComposableKt.OptionChainSettingsDropdownSection$lambda$22$lambda$21$lambda$20(optionChainSettingsDropdownViewState2, function1, (IncludeDefaultPriceDropdownBinding) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                optionChainSettingsDropdownViewState2 = optionChainSettingsDropdownViewState;
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidViewBinding.AndroidViewBinding(function3, null, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsComposableKt.OptionChainSettingsDropdownSection$lambda$23(optionChainSettingsDropdownViewState2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IncludeDefaultPriceDropdownBinding OptionChainSettingsDropdownSection$lambda$22$lambda$17$lambda$16(LayoutInflater inflater, ViewGroup parent, boolean z) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return IncludeDefaultPriceDropdownBinding.inflate(inflater, parent, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainSettingsDropdownSection$lambda$22$lambda$21$lambda$20(final OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState, final Function1 function1, IncludeDefaultPriceDropdownBinding AndroidViewBinding) {
        Intrinsics.checkNotNullParameter(AndroidViewBinding, "$this$AndroidViewBinding");
        RdsDropdown root = AndroidViewBinding.getRoot();
        root.setHint(optionChainSettingsDropdownViewState.getHint());
        Intrinsics.checkNotNull(root);
        OnClickListeners.onClick(root, new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainSettingsComposableKt.m2326x5e427fee(function1, optionChainSettingsDropdownViewState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionChainSettingsDropdownSection$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18 */
    public static final Unit m2326x5e427fee(Function1 function1, OptionChainSettingsDropdownViewState optionChainSettingsDropdownViewState) {
        function1.invoke(optionChainSettingsDropdownViewState.getType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DisplaySettingsSection-HYR8e34, reason: not valid java name */
    public static final void m17189DisplaySettingsSectionHYR8e34(final OptionChainSettingsViewState optionChainSettingsViewState, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super Boolean, Unit> function1, final boolean z, final float f, final Function1<? super C2002Dp, Unit> function12, Composer composer, final int i) {
        int i2;
        long jM21427getFg30d7_KjU;
        long jM21427getFg30d7_KjU2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-245678406);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(optionChainSettingsViewState) : composerStartRestartGroup.changedInstance(optionChainSettingsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-245678406, i2, -1, "com.robinhood.android.optionschain.chainsettings.DisplaySettingsSection (OptionChainSettingsComposable.kt:284)");
            }
            Modifier modifierM26519popupTooltipBgaGok8 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierM26519popupTooltipBgaGok8, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_list_settings_option_title, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C24135R.string.option_chain_list_settings_option_subtitle, composerStartRestartGroup, 0);
            int i4 = C24135R.drawable.option_chain_settings_list;
            OptionChainSettingsViewState5 metricViewState = optionChainSettingsViewState.getMetricViewState();
            if (metricViewState instanceof OptionChainSettingsListMetricViewState) {
                composerStartRestartGroup.startReplaceGroup(262476414);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(metricViewState instanceof OptionChainSettingsTableMetricViewState)) {
                    composerStartRestartGroup.startReplaceGroup(262472978);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(262479257);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i5 = i2 & 7168;
            boolean z2 = i5 == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.DisplaySettingsSection_HYR8e34$lambda$33$lambda$25$lambda$24(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z3 = false;
            m17188DisplaySettingsOptionGtVWBeY(row6, strStringResource, strStringResource2, i4, (Function0) objRememberedValue, jM21427getFg30d7_KjU, null, false, 0.0f, null, composerStartRestartGroup, 6, 480);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(modifierM26519popupTooltipBgaGok8, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(262488157);
            composerStartRestartGroup.startReplaceGroup(262489317);
            if (optionChainSettingsViewState.getShouldShowSettingsSwitchToSbsTooltip()) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z4 = (i2 & 112) == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionChainSettingsComposableKt.m2324xa590ce9a(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function03 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z5 = (i2 & 896) == 256;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionChainSettingsComposableKt.m2325xcf5a341e(function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierM26519popupTooltipBgaGok8, (16232 & 1) != 0 ? Boolean.TRUE : null, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : function03, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : (Function0) objRememberedValue3, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : PopupPositioning.BELOW, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, ComposableSingletons$OptionChainSettingsComposableKt.INSTANCE.getLambda$363445837$feature_options_chain_externalDebug());
            }
            Modifier modifier = modifierM26519popupTooltipBgaGok8;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            String strStringResource3 = StringResources_androidKt.stringResource(C24135R.string.option_chain_table_settings_option_title, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C24135R.string.option_chain_table_settings_option_subtitle, composerStartRestartGroup, 0);
            int i6 = C24135R.drawable.option_chain_settings_table;
            OptionChainSettingsViewState5 metricViewState2 = optionChainSettingsViewState.getMetricViewState();
            if (metricViewState2 instanceof OptionChainSettingsTableMetricViewState) {
                composerStartRestartGroup.startReplaceGroup(262527902);
                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(metricViewState2 instanceof OptionChainSettingsListMetricViewState)) {
                    composerStartRestartGroup.startReplaceGroup(262524434);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(262530713);
                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j = jM21427getFg30d7_KjU2;
            composerStartRestartGroup.startReplaceGroup(5004770);
            if (i5 == 2048) {
                z3 = true;
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.DisplaySettingsSection_HYR8e34$lambda$33$lambda$32$lambda$31(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function04 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            int i7 = i2 << 9;
            m17188DisplaySettingsOptionGtVWBeY(row6, strStringResource3, strStringResource4, i6, function04, j, modifier, z, f, function12, composerStartRestartGroup, 6 | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), 0);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsComposableKt.DisplaySettingsSection_HYR8e34$lambda$34(optionChainSettingsViewState, function0, function02, function1, z, f, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySettingsSection_HYR8e34$lambda$33$lambda$25$lambda$24(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DisplaySettingsSection_HYR8e34$lambda$33$lambda$30$lambda$27$lambda$26 */
    public static final Unit m2324xa590ce9a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DisplaySettingsSection_HYR8e34$lambda$33$lambda$30$lambda$29$lambda$28 */
    public static final Unit m2325xcf5a341e(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySettingsSection_HYR8e34$lambda$33$lambda$32$lambda$31(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisplaySettingsOption_GtVWBeY$lambda$36$lambda$35(C2002Dp c2002Dp) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010c  */
    /* renamed from: DisplaySettingsOption-GtVWBeY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m17188DisplaySettingsOptionGtVWBeY(final Row5 row5, final String str, final String str2, final int i, final Function0<Unit> function0, final long j, Modifier modifier, boolean z, float f, Function1<? super C2002Dp, Unit> function1, Composer composer, final int i2, final int i3) {
        Row5 row52;
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        Function1<? super C2002Dp, Unit> function12;
        int currentCompositeKeyHash;
        boolean z3;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z4;
        Object objRememberedValue;
        Composer composer2;
        final float f2;
        final Function1<? super C2002Dp, Unit> function13;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626804111);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
            row52 = row5;
        } else {
            row52 = row5;
            if ((i2 & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(row52) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i3 & 2) == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                if ((i3 & 4) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= 1572864;
                } else {
                    if ((1572864 & i2) == 0) {
                        modifier2 = modifier;
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 12582912;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i8 = i7;
                            i4 |= composerStartRestartGroup.changed(f) ? 67108864 : 33554432;
                        }
                        i9 = i3 & 256;
                        if (i9 == 0) {
                            if ((i2 & 805306368) == 0) {
                                i10 = i9;
                                i4 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                            }
                            if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                if (i5 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i6 != 0) {
                                    z2 = false;
                                }
                                float fM7995constructorimpl = i8 == 0 ? C2002Dp.m7995constructorimpl(0) : f;
                                if (i10 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda15
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return OptionChainSettingsComposableKt.DisplaySettingsOption_GtVWBeY$lambda$36$lambda$35((C2002Dp) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    function12 = (Function1) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function12 = function1;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1626804111, i4, -1, "com.robinhood.android.optionschain.chainsettings.DisplaySettingsOption (OptionChainSettingsComposable.kt:351)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                int i11 = i4;
                                Modifier modifierThen = SizeKt.fillMaxWidth$default(Row5.weight$default(row52, companion, 1.0f, false, 2, null), 0.0f, 1, null).then(modifier2);
                                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                z3 = z2;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Modifier modifier4 = modifier2;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor2);
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, DisplaySettingDemoImageHeight), 0.0f, 1, null);
                                float f3 = DisplaySettingDemoRoundedCornerRadius;
                                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(modifierFillMaxWidth$default2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f3)), DisplaySettingDemoBorder, j, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f3));
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                z4 = (i11 & 57344) != 16384;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return OptionChainSettingsComposableKt.m2323x8db3d2(function0);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoImage.BentoImage(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i11 >> 9) & 14), StringResources_androidKt.stringResource(C24135R.string.option_chain_table_settings_option_subtitle, composerStartRestartGroup, 0), ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU, false, null, null, (Function0) objRememberedValue, 7, null), null, ContentScale.INSTANCE.getInside(), 0.0f, null, composerStartRestartGroup, 24576, 104);
                                composerStartRestartGroup.startReplaceGroup(-1308042853);
                                if (z3) {
                                    CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(Density3.Density(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity(), 1.0f)), ComposableLambda3.rememberComposableLambda(1119738362, true, new OptionChainSettingsComposableKt$DisplaySettingsOption$2$1$2(boxScopeInstance, fM7995constructorimpl, function12, (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                composer2 = composerStartRestartGroup;
                                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i12).m21595getXsmallD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i12).getTextM(), composer2, (i11 >> 3) & 14, 0, 8184);
                                BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i12).getTextS(), composer2, (i11 >> 6) & 14, 0, 8184);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f2 = fM7995constructorimpl;
                                function13 = function12;
                                z5 = z3;
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                z5 = z2;
                                modifier3 = modifier2;
                                f2 = f;
                                function13 = function1;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return OptionChainSettingsComposableKt.DisplaySettingsOption_GtVWBeY$lambda$41(row5, str, str2, i, function0, j, modifier3, z5, f2, function13, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i10 = i9;
                        if ((i4 & 306783379) == 306783378) {
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            int i112 = i4;
                            Modifier modifierThen2 = SizeKt.fillMaxWidth$default(Row5.weight$default(row52, companion4, 1.0f, false, 2, null), 0.0f, 1, null).then(modifier2);
                            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            z3 = z2;
                            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier42 = modifier2;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion4, DisplaySettingDemoImageHeight), 0.0f, 1, null);
                                    float f32 = DisplaySettingDemoRoundedCornerRadius;
                                    Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(Clip.clip(modifierFillMaxWidth$default22, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f32)), DisplaySettingDemoBorder, j, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f32));
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    if ((i112 & 57344) != 16384) {
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z4) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda16
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return OptionChainSettingsComposableKt.m2323x8db3d2(function0);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        composerStartRestartGroup.endReplaceGroup();
                                        BentoImage.BentoImage(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i112 >> 9) & 14), StringResources_androidKt.stringResource(C24135R.string.option_chain_table_settings_option_subtitle, composerStartRestartGroup, 0), ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU2, false, null, null, (Function0) objRememberedValue, 7, null), null, ContentScale.INSTANCE.getInside(), 0.0f, null, composerStartRestartGroup, 24576, 104);
                                        composerStartRestartGroup.startReplaceGroup(-1308042853);
                                        if (z3) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i122 = BentoTheme.$stable;
                                        composer2 = composerStartRestartGroup;
                                        BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i122).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i122).m21595getXsmallD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i122).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i122).getTextM(), composer2, (i112 >> 3) & 14, 0, 8184);
                                        BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i122).m21593getSmallD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i122).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i122).getTextS(), composer2, (i112 >> 6) & 14, 0, 8184);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        f2 = fM7995constructorimpl;
                                        function13 = function12;
                                        z5 = z3;
                                        modifier3 = modifier42;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    i9 = i3 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 2) == 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DisplaySettingsOption_GtVWBeY$lambda$40$lambda$39$lambda$38$lambda$37 */
    public static final Unit m2323x8db3d2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListMetricsSection(final OptionChainSettingsListMetricViewState optionChainSettingsListMetricViewState, Function2<? super OrderSide, ? super OptionChainCustomizationLaunchMode2, Unit> function2, Function2<? super OrderSide, ? super OptionChainSettingsLogging2, Unit> function22, Composer composer, final int i) {
        int i2;
        final Function2<? super OrderSide, ? super OptionChainCustomizationLaunchMode2, Unit> function23 = function2;
        final Function2<? super OrderSide, ? super OptionChainSettingsLogging2, Unit> function24 = function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(647798034);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(optionChainSettingsListMetricViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647798034, i2, -1, "com.robinhood.android.optionschain.chainsettings.ListMetricsSection (OptionChainSettingsComposable.kt:423)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metrics_section_title, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
            int i4 = i2 << 6;
            int i5 = (i4 & 57344) | (i4 & 7168) | 6;
            composerStartRestartGroup = composerStartRestartGroup;
            ListMetricContent(OrderSide.BUY, optionChainSettingsListMetricViewState.getBuySelectedMetricLabelOne(), optionChainSettingsListMetricViewState.getBuySelectedMetricLabelTwo(), function23, function24, composerStartRestartGroup, i5);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            function23 = function2;
            function24 = function22;
            ListMetricContent(OrderSide.SELL, optionChainSettingsListMetricViewState.getSellSelectedMetricLabelOne(), optionChainSettingsListMetricViewState.getSellSelectedMetricLabelTwo(), function23, function24, composerStartRestartGroup, i5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsComposableKt.ListMetricsSection$lambda$43(optionChainSettingsListMetricViewState, function23, function24, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ListMetricContent(final OrderSide orderSide, final String str, final String str2, Function2<? super OrderSide, ? super OptionChainCustomizationLaunchMode2, Unit> function2, Function2<? super OrderSide, ? super OptionChainSettingsLogging2, Unit> function22, Composer composer, final int i) {
        int i2;
        boolean z;
        String strStringResource;
        final Function2<? super OrderSide, ? super OptionChainCustomizationLaunchMode2, Unit> function23 = function2;
        final Function2<? super OrderSide, ? super OptionChainSettingsLogging2, Unit> function24 = function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1736310115);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(orderSide.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1736310115, i2, -1, "com.robinhood.android.optionschain.chainsettings.ListMetricContent (OptionChainSettingsComposable.kt:457)");
            }
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM();
            int i4 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(681105826);
                z = false;
                strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metrics_buy_title, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    composerStartRestartGroup.startReplaceGroup(681104217);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(681109283);
                strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metrics_sell_title, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                z = false;
            }
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8186);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i5 = 57344 & i2;
            int i6 = i2 & 14;
            int i7 = i2 & 7168;
            boolean z2 = (i6 == 4) | (i5 == 16384) | (i7 == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.ListMetricContent$lambda$52$lambda$46$lambda$45$lambda$44(function24, orderSide, function23);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metrics_customize_button, composerStartRestartGroup, 0), null, null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8172);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU();
            String strStringResource2 = StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metric1_title, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z3 = (i5 == 16384) | (i6 == 4) | (i7 == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.ListMetricContent$lambda$52$lambda$51$lambda$48$lambda$47(function24, orderSide, function23);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i8 = i2;
            OptionChainMetricCard.m17181MetricCardhYmLsZ8(row6, strStringResource2, str, jM21372getBg20d7_KjU, null, true, (Function0) objRememberedValue2, composerStartRestartGroup, 196614 | ((i2 << 3) & 896), 8);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            long jM21372getBg20d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU();
            String strStringResource3 = StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metric2_title, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z4 = (i5 == 16384) | (i6 == 4) | (i7 == 2048);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function23 = function2;
                function24 = function22;
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.ListMetricContent$lambda$52$lambda$51$lambda$50$lambda$49(function24, orderSide, function23);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                function23 = function2;
                function24 = function22;
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionChainMetricCard.m17181MetricCardhYmLsZ8(row6, strStringResource3, str2, jM21372getBg20d7_KjU2, null, true, (Function0) objRememberedValue3, composerStartRestartGroup, 196614 | (i8 & 896), 8);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsComposableKt.ListMetricContent$lambda$53(orderSide, str, str2, function23, function24, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListMetricContent$lambda$52$lambda$46$lambda$45$lambda$44(Function2 function2, OrderSide orderSide, Function2 function22) {
        function2.invoke(orderSide, OptionChainSettingsLogging2.BUTTON);
        function22.invoke(orderSide, OptionChainCustomizationLaunchMode2.METRIC_ONE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListMetricContent$lambda$52$lambda$51$lambda$48$lambda$47(Function2 function2, OrderSide orderSide, Function2 function22) {
        function2.invoke(orderSide, OptionChainSettingsLogging2.ROW);
        function22.invoke(orderSide, OptionChainCustomizationLaunchMode2.METRIC_ONE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListMetricContent$lambda$52$lambda$51$lambda$50$lambda$49(Function2 function2, OrderSide orderSide, Function2 function22) {
        function2.invoke(orderSide, OptionChainSettingsLogging2.ROW);
        function22.invoke(orderSide, OptionChainCustomizationLaunchMode2.METRIC_TWO);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PnlChartTypeSection(final OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, final Function1<? super OptionChainSettingsPnlChartType, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        long jM21456getPositive0d7_KjU;
        int i4;
        long jM21373getBg30d7_KjU;
        int i5;
        final Function1<? super OptionChainSettingsPnlChartType, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(808273400);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(optionChainSettingsPnlChartType.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function12 = function1;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(808273400, i2, -1, "com.robinhood.android.optionschain.chainsettings.PnlChartTypeSection (OptionChainSettingsComposable.kt:517)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            int i7 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.f4804xb4cc342a, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 24576, 0, 8168);
            composerStartRestartGroup = composerStartRestartGroup;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_simulated_return_pre_trade_pnl_chart_type_by_price, composerStartRestartGroup, 0);
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i8 = iArr[optionChainSettingsPnlChartType.ordinal()];
            if (i8 == 1) {
                i3 = i6;
                composerStartRestartGroup.startReplaceGroup(-2103944390);
                jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i8 != 2) {
                    composerStartRestartGroup.startReplaceGroup(-2103947509);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-2103941451);
                i3 = i6;
                jM21456getPositive0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j = jM21456getPositive0d7_KjU;
            if (bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay()) {
                i4 = C24135R.drawable.pnl_chart_type_by_price_day;
            } else {
                i4 = C24135R.drawable.pnl_chart_type_by_price_night;
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i9 = i7 & 112;
            boolean z = i9 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.PnlChartTypeSection$lambda$59$lambda$58$lambda$55$lambda$54(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            m17190PnlChartTypeOptionww6aTOc(row6, strStringResource, i4, j, (Function0) objRememberedValue, composerStartRestartGroup, 6);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C24135R.string.option_chain_simulated_return_pre_trade_pnl_chart_type_over_time, composerStartRestartGroup, 0);
            int i10 = iArr[optionChainSettingsPnlChartType.ordinal()];
            if (i10 == 1) {
                composerStartRestartGroup.startReplaceGroup(-2103917227);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i10 != 2) {
                    composerStartRestartGroup.startReplaceGroup(-2103920341);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-2103914438);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j2 = jM21373getBg30d7_KjU;
            if (bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay()) {
                i5 = C24135R.drawable.pnl_chart_type_over_time_day;
            } else {
                i5 = C24135R.drawable.pnl_chart_type_over_time_night;
            }
            int i11 = i5;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i9 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                function12 = function1;
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.PnlChartTypeSection$lambda$59$lambda$58$lambda$57$lambda$56(function12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                function12 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            m17190PnlChartTypeOptionww6aTOc(row6, strStringResource2, i11, j2, (Function0) objRememberedValue2, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsComposableKt.PnlChartTypeSection$lambda$60(optionChainSettingsPnlChartType, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlChartTypeSection$lambda$59$lambda$58$lambda$55$lambda$54(Function1 function1) {
        function1.invoke(OptionChainSettingsPnlChartType.BY_PRICE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlChartTypeSection$lambda$59$lambda$58$lambda$57$lambda$56(Function1 function1) {
        function1.invoke(OptionChainSettingsPnlChartType.OVER_TIME);
        return Unit.INSTANCE;
    }

    /* renamed from: PnlChartTypeOption-ww6aTOc, reason: not valid java name */
    private static final void m17190PnlChartTypeOptionww6aTOc(final Row5 row5, final String str, final int i, final long j, final Function0<Unit> function0, Composer composer, final int i2) {
        int i3;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-573871897);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(row5) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-573871897, i3, -1, "com.robinhood.android.optionschain.chainsettings.PnlChartTypeOption (OptionChainSettingsComposable.kt:571)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Row5.weight$default(row5, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, DisplaySettingDemoImageHeight), 0.0f, 1, null);
            float f = DisplaySettingDemoRoundedCornerRadius;
            Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Clip.clip(modifierFillMaxWidth$default2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f)), DisplaySettingDemoBorder, j, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (57344 & i3) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsComposableKt.PnlChartTypeOption_ww6aTOc$lambda$63$lambda$62$lambda$61(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoImage.BentoImage(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, (i3 >> 6) & 14), str2, ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU, false, null, null, (Function0) objRememberedValue, 7, null), null, ContentScale.INSTANCE.getInside(), 0.0f, null, composerStartRestartGroup, (i3 & 112) | 24576, 104);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, (i3 >> 3) & 14, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsComposableKt.PnlChartTypeOption_ww6aTOc$lambda$64(row5, str, i, j, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlChartTypeOption_ww6aTOc$lambda$63$lambda$62$lambda$61(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
