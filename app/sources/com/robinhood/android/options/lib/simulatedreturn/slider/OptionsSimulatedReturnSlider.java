package com.robinhood.android.options.lib.simulatedreturn.slider;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableState5;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.interaction.DragInteraction2;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextPainter2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSlider;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState5;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.OptionTooltipDisplayBehavior;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.tooltips.TooltipData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsSimulatedReturnSlider.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aw\u0010\u0017\u001a\u00020\u0001\"\b\b\u0000\u0010\u0018*\u00020\u00192\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#\u001a/\u0010$\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010%\u001a1\u0010&\u001a\u00020\u0001*\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\b\u001a\u00020\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020-2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010.\u001a\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000200H\u0002\"\u000e\u00104\u001a\u000205X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u000200X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u000200X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u000200X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u000200X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u000200X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u000200X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u000200X\u0082T¢\u0006\u0002\n\u0000¨\u0006>²\u0006\n\u0010?\u001a\u00020@X\u008a\u0084\u0002²\u0006\n\u0010A\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"OptionsSimulatedReturnSlider", "", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "nuxSliderTooltip", "Lcom/robinhood/models/db/OptionTooltip;", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "usePreTradeStyle", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "onSnappedPointerPositionUpdated", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "expandedForSnapshotTest", "isBottomSheetHiddenOrNull", "onSliderTooltipClicked", "Lkotlin/Function0;", "OptionsSimulatedReturnSlider-Hzv_svQ", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;Lcom/robinhood/models/db/OptionTooltip;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OptionsSimulatedReturnBaseSlider", "DS", "", "duxo", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDuxo;", "OptionsSimulatedReturnBaseSlider-lVb_Clg", "(ZLcom/robinhood/models/db/OptionTooltip;JLcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDuxo;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PriceSelector", "sliderTooltip", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;", "displayMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/PriceTooltipDisplayMode;", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;ZLcom/robinhood/android/options/lib/simulatedreturn/slider/PriceTooltipDisplayMode;Landroidx/compose/runtime/Composer;I)V", "PriceTooltip", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;ZLcom/robinhood/android/options/lib/simulatedreturn/slider/PriceTooltipDisplayMode;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "QuotePill", "Landroidx/compose/foundation/layout/BoxScope;", "state", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;", "onQuotePillTapped", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getSliderTextSize", "Landroidx/compose/ui/text/TextStyle;", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "dpToFloat", "", "context", "Landroid/content/Context;", "dpValue", OptionsSimulatedReturnSlider.PriceTooltipLabel, "", "BIG_TICK_HEIGHT_DP", "SMALL_TICK_HEIGHT_DP", "TICK_WIDTH_DP", "POSITION_PIN_RADIUS_DP", "POSITION_PIN_BG_RADIUS_DP", "POSITION_PIN_OVERLAP_THRESHOLD_DP", "QUOTE_PILL_BORDER_DP", "BIG_TICK_LABEL_BOTTOM_PADDING_DP", "lib-options-simulated-return_externalDebug", "sliderState", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderViewState;", "pressed", "dragged"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnSlider {
    private static final float BIG_TICK_HEIGHT_DP = 14.0f;
    private static final float BIG_TICK_LABEL_BOTTOM_PADDING_DP = 5.0f;
    private static final float POSITION_PIN_BG_RADIUS_DP = 3.0f;
    private static final double POSITION_PIN_OVERLAP_THRESHOLD_DP = 1.0d;
    private static final float POSITION_PIN_RADIUS_DP = 2.5f;
    private static final String PriceTooltipLabel = "PriceTooltipLabel";
    private static final float QUOTE_PILL_BORDER_DP = 1.5f;
    private static final float SMALL_TICK_HEIGHT_DP = 10.0f;
    private static final float TICK_WIDTH_DP = 1.0f;

    /* compiled from: OptionsSimulatedReturnSlider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsSimulatedReturnSliderViewState3.values().length];
            try {
                iArr[OptionsSimulatedReturnSliderViewState3.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedReturnSliderViewState3.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$32(boolean z, OptionTooltip optionTooltip, long j, OptionsSimulatedReturnSliderDuxo optionsSimulatedReturnSliderDuxo, Function1 function1, Modifier modifier, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        m16967OptionsSimulatedReturnBaseSliderlVb_Clg(z, optionTooltip, j, optionsSimulatedReturnSliderDuxo, function1, modifier, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsSimulatedReturnSlider_Hzv_svQ$lambda$4(OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, OptionTooltip optionTooltip, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, boolean z, long j, Function1 function1, Modifier modifier, boolean z2, boolean z3, Function0 function0, int i, int i2, Composer composer, int i3) {
        m16968OptionsSimulatedReturnSliderHzv_svQ(optionsSimulatedReturnSliderLaunchMode, optionTooltip, optionsSimulatedReturnLoggingState, z, j, function1, modifier, z2, z3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceSelector$lambda$33(SliderTooltip sliderTooltip, boolean z, OptionsSimulatedReturnSlider9 optionsSimulatedReturnSlider9, int i, Composer composer, int i2) {
        PriceSelector(sliderTooltip, z, optionsSimulatedReturnSlider9, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PriceTooltip$lambda$34(SliderTooltip sliderTooltip, boolean z, OptionsSimulatedReturnSlider9 optionsSimulatedReturnSlider9, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PriceTooltip(sliderTooltip, z, optionsSimulatedReturnSlider9, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuotePill$lambda$35(BoxScope boxScope, SliderQuotePillState sliderQuotePillState, boolean z, Function0 function0, int i, Composer composer, int i2) {
        QuotePill(boxScope, sliderQuotePillState, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuotePill$lambda$40(BoxScope boxScope, SliderQuotePillState sliderQuotePillState, boolean z, Function0 function0, int i, Composer composer, int i2) {
        QuotePill(boxScope, sliderQuotePillState, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final boolean OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$13(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSimulatedReturnSliderViewState OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(SnapshotState4<OptionsSimulatedReturnSliderViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /* renamed from: OptionsSimulatedReturnSlider-Hzv_svQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16968OptionsSimulatedReturnSliderHzv_svQ(final OptionsSimulatedReturnSliderLaunchMode launchMode, final OptionTooltip optionTooltip, final OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, final boolean z, final long j, final Function1<? super Double, Unit> onSnappedPointerPositionUpdated, Modifier modifier, boolean z2, boolean z3, final Function0<Unit> onSliderTooltipClicked, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        boolean z8;
        Modifier modifier3;
        final Modifier modifier4;
        final boolean z9;
        final boolean z10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(onSnappedPointerPositionUpdated, "onSnappedPointerPositionUpdated");
        Intrinsics.checkNotNullParameter(onSliderTooltipClicked, "onSliderTooltipClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(117834666);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(launchMode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(optionTooltip) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(optionsSimulatedReturnLoggingState) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onSnappedPointerPositionUpdated) ? 131072 : 65536;
                    }
                    i4 = i2 & 64;
                    if (i4 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                        i5 = i2 & 128;
                        if (i5 != 0) {
                            i3 |= 12582912;
                            z5 = z2;
                        } else {
                            z5 = z2;
                            if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
                            }
                        }
                        i6 = i2 & 256;
                        if (i6 != 0) {
                            i3 |= 100663296;
                            z6 = z3;
                        } else {
                            z6 = z3;
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changed(z6) ? 67108864 : 33554432;
                            }
                        }
                        if ((i2 & 512) == 0) {
                            i8 = (i & 805306368) == 0 ? composerStartRestartGroup.changedInstance(onSliderTooltipClicked) ? 536870912 : 268435456 : 805306368;
                            i7 = i3;
                            if ((306783379 & i7) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    z5 = false;
                                }
                                boolean z11 = i6 == 0 ? true : z6;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(117834666, i7, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSlider (OptionsSimulatedReturnSlider.kt:90)");
                                }
                                if (launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Price) {
                                    boolean z12 = z5;
                                    Modifier modifier6 = modifier5;
                                    z7 = z11;
                                    if (!(launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Time)) {
                                        composerStartRestartGroup.startReplaceGroup(1569983678);
                                        composerStartRestartGroup.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1425880887);
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsSimulatedReturnTimeSliderDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnSlider-Hzv_svQ$$inlined$duxo$2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnSlider-Hzv_svQ$$inlined$duxo$2.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo = (OptionsSimulatedReturnTimeSliderDuxo) baseDuxo;
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnTimeSliderDuxo) | ((i7 & 14) == 4) | composerStartRestartGroup.changedInstance(optionsSimulatedReturnLoggingState);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new OptionsSimulatedReturnSlider7(optionsSimulatedReturnTimeSliderDuxo, launchMode, optionsSimulatedReturnLoggingState, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i9 = i7 >> 3;
                                    EffectsKt.LaunchedEffect(launchMode, optionsSimulatedReturnLoggingState, (Function2) objRememberedValue2, composerStartRestartGroup, i9 & 112);
                                    Boolean boolValueOf = Boolean.valueOf(z7);
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnTimeSliderDuxo) | ((234881024 & i7) == 67108864);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new OptionsSimulatedReturnSlider8(optionsSimulatedReturnTimeSliderDuxo, z7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i7 >> 24) & 14);
                                    int i10 = ((i7 >> 9) & 14) | (i7 & 112);
                                    int i11 = i7 >> 6;
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    z8 = z12;
                                    modifier3 = modifier6;
                                    m16967OptionsSimulatedReturnBaseSliderlVb_Clg(z, optionTooltip, j, optionsSimulatedReturnTimeSliderDuxo, onSnappedPointerPositionUpdated, modifier3, z8, onSliderTooltipClicked, composerStartRestartGroup, (i11 & 29360128) | (i9 & 3670016) | i10 | (i11 & 896) | (57344 & i9) | (458752 & i9), 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(1424898838);
                                    composerStartRestartGroup.startReplaceGroup(-747520797);
                                    ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current2 == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsSimulatedReturnPriceSliderDuxo.class), current2, (String) null, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                                    final Lifecycle lifecycle2 = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo2) | composerStartRestartGroup.changedInstance(lifecycle2);
                                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnSlider-Hzv_svQ$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                                lifecycle2.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle3 = lifecycle2;
                                                return new DisposableEffectResult() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnSlider-Hzv_svQ$$inlined$duxo$1.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle3.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo = (OptionsSimulatedReturnPriceSliderDuxo) baseDuxo2;
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(optionsSimulatedReturnPriceSliderDuxo) | ((i7 & 14) == 4) | composerStartRestartGroup.changedInstance(optionsSimulatedReturnLoggingState);
                                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new OptionsSimulatedReturnSlider5(optionsSimulatedReturnPriceSliderDuxo, launchMode, optionsSimulatedReturnLoggingState, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i12 = i7 >> 3;
                                    EffectsKt.LaunchedEffect(launchMode, optionsSimulatedReturnLoggingState, (Function2) objRememberedValue5, composerStartRestartGroup, i12 & 112);
                                    Boolean boolValueOf2 = Boolean.valueOf(z11);
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance6 = ((i7 & 234881024) == 67108864) | composerStartRestartGroup.changedInstance(optionsSimulatedReturnPriceSliderDuxo);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new OptionsSimulatedReturnSlider6(optionsSimulatedReturnPriceSliderDuxo, z11, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (i7 >> 24) & 14);
                                    int i13 = ((i7 >> 9) & 14) | (i7 & 112);
                                    int i14 = i7 >> 6;
                                    int i15 = i13 | (i14 & 896) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (i14 & 29360128);
                                    z8 = z5;
                                    modifier3 = modifier5;
                                    z7 = z11;
                                    m16967OptionsSimulatedReturnBaseSliderlVb_Clg(z4, optionTooltip, j, optionsSimulatedReturnPriceSliderDuxo, onSnappedPointerPositionUpdated, modifier3, z8, onSliderTooltipClicked, composerStartRestartGroup, i15, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                z9 = z8;
                                z10 = z7;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z9 = z5;
                                z10 = z6;
                                modifier4 = modifier2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return OptionsSimulatedReturnSlider.OptionsSimulatedReturnSlider_Hzv_svQ$lambda$4(launchMode, optionTooltip, optionsSimulatedReturnLoggingState, z, j, onSnappedPointerPositionUpdated, modifier4, z9, z10, onSliderTooltipClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= i8;
                        i7 = i3;
                        if ((306783379 & i7) == 306783378) {
                            if (i4 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (launchMode instanceof OptionsSimulatedReturnSliderLaunchMode.Price) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            z9 = z8;
                            z10 = z7;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    modifier2 = modifier;
                    i5 = i2 & 128;
                    if (i5 != 0) {
                    }
                    i6 = i2 & 256;
                    if (i6 != 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    i3 |= i8;
                    i7 = i3;
                    if ((306783379 & i7) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i2 & 32) == 0) {
                }
                i4 = i2 & 64;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                i5 = i2 & 128;
                if (i5 != 0) {
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                }
                if ((i2 & 512) == 0) {
                }
                i3 |= i8;
                i7 = i3;
                if ((306783379 & i7) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i4 = i2 & 64;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            i6 = i2 & 256;
            if (i6 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            i3 |= i8;
            i7 = i3;
            if ((306783379 & i7) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        z4 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        i6 = i2 & 256;
        if (i6 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i3 |= i8;
        i7 = i3;
        if ((306783379 & i7) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0738  */
    /* renamed from: OptionsSimulatedReturnBaseSlider-lVb_Clg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <DS> void m16967OptionsSimulatedReturnBaseSliderlVb_Clg(final boolean z, final OptionTooltip optionTooltip, final long j, OptionsSimulatedReturnSliderDuxo<DS> optionsSimulatedReturnSliderDuxo, final Function1<? super Double, Unit> onSnappedPointerPositionUpdated, Modifier modifier, boolean z2, final Function0<Unit> onSliderTooltipClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z3;
        long j2;
        Modifier modifier3;
        Modifier modifierScrollable$default;
        SnapshotState4 snapshotState4;
        Brush brush;
        float f;
        int i4;
        SnapshotState snapshotState;
        Composer composer2;
        int i5;
        SnapshotState4<Boolean> snapshotState42;
        float f2;
        BentoTheme bentoTheme;
        TextStyle textStyle;
        long j3;
        int i6;
        long j4;
        Modifier.Companion companion;
        int i7;
        Object obj;
        boolean z4;
        Object objRememberedValue;
        boolean z5;
        Object objRememberedValue2;
        final boolean z6;
        Composer composer3;
        Long displayMilliseconds;
        final OptionsSimulatedReturnSliderDuxo<DS> duxo = optionsSimulatedReturnSliderDuxo;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onSnappedPointerPositionUpdated, "onSnappedPointerPositionUpdated");
        Intrinsics.checkNotNullParameter(onSliderTooltipClicked, "onSliderTooltipClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-792499471);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(optionTooltip) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSnappedPointerPositionUpdated) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
            }
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSliderTooltipClicked) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            z6 = z3;
        } else {
            Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier2;
            boolean z7 = i9 != 0 ? false : z3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-792499471, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnBaseSlider (OptionsSimulatedReturnSlider.kt:157)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Double snappedPointerPosition = OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState4CollectAsStateWithLifecycle).getSnappedPointerPosition();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((57344 & i3) == 16384);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new OptionsSimulatedReturnSlider2(snapshotState4CollectAsStateWithLifecycle, onSnappedPointerPositionUpdated, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(snappedPointerPosition, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i10 = i3 & 7168;
            boolean zChangedInstance = (i10 == 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(duxo))) | composerStartRestartGroup.changedInstance(view);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new OptionsSimulatedReturnSlider3(duxo, view, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            final TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
            final float fDpToFloat = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 10.0f);
            float fDpToFloat2 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), BIG_TICK_HEIGHT_DP);
            final float fDpToFloat3 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 1.0f);
            float fDpToFloat4 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), POSITION_PIN_RADIUS_DP);
            final float fDpToFloat5 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 3.0f);
            final float fDpToFloat6 = dpToFloat((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 5.0f);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i11 = BentoTheme.$stable;
            final long jM21373getBg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i11).m21373getBg30d7_KjU();
            final long jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU();
            final long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i11).m21425getFg0d7_KjU();
            long jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i11).m21427getFg30d7_KjU();
            long j5 = z ? jM21373getBg30d7_KjU : jM21425getFg0d7_KjU;
            TextStyle textS = bentoTheme2.getTypography(composerStartRestartGroup, i11).getTextS();
            long jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i11).m21427getFg30d7_KjU();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion2.getEmpty()) {
                j2 = jM21427getFg30d7_KjU2;
                objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                j2 = jM21427getFg30d7_KjU2;
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState4<Boolean> snapshotState4CollectIsDraggedAsState = DragInteraction2.collectIsDraggedAsState(interactionSource3, composerStartRestartGroup, 6);
            Brush.Companion companion3 = Brush.INSTANCE;
            Tuples2 tuples2M3642to = Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(j));
            Float fValueOf = Float.valueOf(0.1f);
            Color.Companion companion4 = Color.INSTANCE;
            Brush brushM6677horizontalGradient8A3gB4$default = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion3, new Tuples2[]{tuples2M3642to, Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion4.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.9f), Color.m6701boximpl(companion4.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(j))}, 0.0f, 0.0f, 0, 14, (Object) null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectIsDraggedAsState) | (i10 == 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(duxo)));
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue8 == companion2.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Float.valueOf(OptionsSimulatedReturnSlider.OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$15$lambda$14(snapshotFloatState2, duxo, snapshotState4CollectIsDraggedAsState, ((Float) obj2).floatValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            ScrollableState scrollableStateRememberScrollableState = ScrollableState5.rememberScrollableState((Function1) objRememberedValue8, composerStartRestartGroup, 0);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
            modifier3 = modifier4;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1461874836);
            Modifier.Companion companion7 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1461875876);
            if (OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState4CollectAsStateWithLifecycle).getDisabled()) {
                modifierScrollable$default = companion7;
            } else {
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion2.getEmpty()) {
                    objRememberedValue9 = new PointerInputEventHandler() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$3$1$1$1

                        /* compiled from: OptionsSimulatedReturnSlider.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$3$1$1$1$1", m3645f = "OptionsSimulatedReturnSlider.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$3$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ SnapshotState<Boolean> $pressed$delegate;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(SnapshotState<Boolean> snapshotState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$pressed$delegate = snapshotState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressed$delegate, continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
                            
                                if (androidx.compose.foundation.gestures.TapGestureDetector4.waitForUpOrCancellation$default(r1, null, r10, 1, null) == r0) goto L16;
                             */
                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                AnonymousClass1 anonymousClass1;
                                AwaitPointerEventScope awaitPointerEventScope;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                    this.L$0 = awaitPointerEventScope2;
                                    this.label = 1;
                                    anonymousClass1 = this;
                                    if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, anonymousClass1, 2, null) != coroutine_suspended) {
                                        awaitPointerEventScope = awaitPointerEventScope2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    anonymousClass1 = this;
                                    OptionsSimulatedReturnSlider.OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$12(anonymousClass1.$pressed$delegate, false);
                                    return Unit.INSTANCE;
                                }
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                anonymousClass1 = this;
                                OptionsSimulatedReturnSlider.OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$12(anonymousClass1.$pressed$delegate, true);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }

                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new AnonymousClass1(snapshotState2, null), continuation);
                            return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierScrollable$default = ScrollableKt.scrollable$default(SuspendingPointerInputFilterKt.pointerInput(companion7, unit, (PointerInputEventHandler) objRememberedValue9), scrollableStateRememberScrollableState, Orientation.Horizontal, false, false, null, interactionSource3, 28, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierScrollable$default);
            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1844036923);
            if (optionTooltip != null) {
                String content = optionTooltip.getContent();
                TooltipData.Layout layout = new TooltipData.Layout(RdsTooltipView.NibDirection.DOWN, -30.0f, null, null, 12, null);
                OptionTooltipDisplayBehavior displayBehavior = optionTooltip.getDisplayBehavior();
                if (displayBehavior != null) {
                    composer3 = composerStartRestartGroup;
                    displayMilliseconds = displayBehavior.getDisplayMilliseconds();
                } else {
                    composer3 = composerStartRestartGroup;
                    displayMilliseconds = null;
                }
                composer2 = composer3;
                brush = brushM6677horizontalGradient8A3gB4$default;
                snapshotState42 = snapshotState4CollectIsDraggedAsState;
                f = fDpToFloat4;
                i4 = i3;
                i5 = i10;
                f2 = fDpToFloat2;
                bentoTheme = bentoTheme2;
                textStyle = textS;
                j3 = jM21427getFg30d7_KjU;
                j4 = j2;
                i7 = 1;
                obj = null;
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                snapshotState = snapshotState2;
                i6 = i11;
                Modifier modifier5 = ModifiersKt.tooltip$default(companion7, content, layout, new TooltipData.Behavior(null, displayMilliseconds, null, onSliderTooltipClicked, 5, null), null, false, 24, null);
                companion = companion7;
                float f3 = 0;
                BoxKt.Box(SizeKt.wrapContentSize$default(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(modifier5, C2002Dp.m7995constructorimpl(f3)), C2002Dp.m7995constructorimpl(f3)), null, true, 1, null), composer2, 0);
            } else {
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                brush = brushM6677horizontalGradient8A3gB4$default;
                f = fDpToFloat4;
                i4 = i3;
                snapshotState = snapshotState2;
                composer2 = composerStartRestartGroup;
                i5 = i10;
                snapshotState42 = snapshotState4CollectIsDraggedAsState;
                f2 = fDpToFloat2;
                bentoTheme = bentoTheme2;
                textStyle = textS;
                j3 = jM21427getFg30d7_KjU;
                i6 = i11;
                j4 = j2;
                companion = companion7;
                i7 = 1;
                obj = null;
            }
            composer2.endReplaceGroup();
            PriceSelector(OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState4).getTooltip(), z, (OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$11(snapshotState) || OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$13(snapshotState42) || scrollableStateRememberScrollableState.isScrollInProgress() || z7) ? OptionsSimulatedReturnSlider9.EXPANDED : OptionsSimulatedReturnSlider9.NORMAL, composer2, (i4 << 3) & 112);
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, i7, obj), bentoTheme.getSpacing(composer2, i6).m21594getXlargeD9Ej5fM());
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue10 = composer2.rememberedValue();
            if (objRememberedValue10 == companion2.getEmpty()) {
                objRememberedValue10 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionsSimulatedReturnSlider.m2233xf3f477f1(snapshotFloatState2, (IntSize) obj2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue10);
            }
            composer2.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierM5156height3ABfNKs, (Function1) objRememberedValue10);
            composer2.startReplaceGroup(-1224400529);
            final TextStyle textStyle2 = textStyle;
            boolean zChanged3 = composer2.changed(snapshotState4) | composer2.changed(f2) | composer2.changed(jM21373getBg30d7_KjU) | composer2.changed(fDpToFloat3) | composer2.changed(textMeasurerRememberTextMeasurer) | composer2.changed(textStyle2) | composer2.changed(fDpToFloat6);
            final long j6 = j4;
            final float f4 = f;
            final SnapshotState4 snapshotState43 = snapshotState4;
            final long j7 = j3;
            boolean zChanged4 = zChanged3 | composer2.changed(j6) | composer2.changed(fDpToFloat) | composer2.changed(jM21425getFg0d7_KjU) | composer2.changed(f4) | composer2.changed(j7) | composer2.changed(jM21425getFg0d7_KjU2);
            final float f5 = f2;
            int i12 = i4;
            final long j8 = j5;
            boolean zChanged5 = ((i12 & 896) == 256) | zChanged4 | composer2.changed(fDpToFloat5) | composer2.changed(j8);
            final Brush brush2 = brush;
            boolean zChanged6 = composer2.changed(brush2) | zChanged5;
            Object objRememberedValue11 = composer2.rememberedValue();
            if (zChanged6 || objRememberedValue11 == companion2.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionsSimulatedReturnSlider.m2234xa8135267(j8, fDpToFloat3, brush2, f5, snapshotState43, jM21373getBg30d7_KjU, textMeasurerRememberTextMeasurer, textStyle2, fDpToFloat6, j6, fDpToFloat, jM21425getFg0d7_KjU, f4, j7, jM21425getFg0d7_KjU2, j, fDpToFloat5, (DrawScope) obj2);
                    }
                };
                composer2.updateRememberedValue(function1);
                objRememberedValue11 = function1;
            }
            composer2.endReplaceGroup();
            Canvas2.Canvas(modifierOnSizeChanged, (Function1) objRememberedValue11, composer2, 0);
            composer2.endNode();
            SliderQuotePillState startQuotePillState = OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState43).getStartQuotePillState();
            composer2.startReplaceGroup(5004770);
            int i13 = i5;
            if (i13 != 2048) {
                duxo = optionsSimulatedReturnSliderDuxo;
                z4 = (i12 & 4096) != 0 && composer2.changedInstance(duxo);
                objRememberedValue = composer2.rememberedValue();
                if (!z4 || objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsSimulatedReturnSlider.m2235x3fbb8e50(duxo);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                int i14 = 6 | ((i12 << 6) & 896);
                composerStartRestartGroup = composer2;
                QuotePill(boxScopeInstance, startQuotePillState, z, (Function0) objRememberedValue, composerStartRestartGroup, i14);
                SliderQuotePillState endQuotePillState = OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState43).getEndQuotePillState();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z5 = i13 != 2048 || ((i12 & 4096) != 0 && composerStartRestartGroup.changedInstance(duxo));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z5 || objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsSimulatedReturnSlider.m2236xa0479da9(duxo);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                QuotePill(boxScopeInstance, endQuotePillState, z, (Function0) objRememberedValue2, composerStartRestartGroup, i14);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z7;
            } else {
                duxo = optionsSimulatedReturnSliderDuxo;
            }
            objRememberedValue = composer2.rememberedValue();
            if (!z4) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsSimulatedReturnSlider.m2235x3fbb8e50(duxo);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
                composer2.endReplaceGroup();
                int i142 = 6 | ((i12 << 6) & 896);
                composerStartRestartGroup = composer2;
                QuotePill(boxScopeInstance, startQuotePillState, z, (Function0) objRememberedValue, composerStartRestartGroup, i142);
                SliderQuotePillState endQuotePillState2 = OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState43).getEndQuotePillState();
                composerStartRestartGroup.startReplaceGroup(5004770);
                if (i13 != 2048) {
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z5) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsSimulatedReturnSlider.m2236xa0479da9(duxo);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        QuotePill(boxScopeInstance, endQuotePillState2, z, (Function0) objRememberedValue2, composerStartRestartGroup, i142);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z6 = z7;
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final OptionsSimulatedReturnSliderDuxo<DS> optionsSimulatedReturnSliderDuxo2 = duxo;
            final Modifier modifier6 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OptionsSimulatedReturnSlider.OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$32(z, optionTooltip, j, optionsSimulatedReturnSliderDuxo2, onSnappedPointerPositionUpdated, modifier6, z6, onSliderTooltipClicked, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$15$lambda$14(SnapshotFloatState2 snapshotFloatState2, OptionsSimulatedReturnSliderDuxo optionsSimulatedReturnSliderDuxo, SnapshotState4 snapshotState4, float f) {
        OptionsSimulatedReturnSliderViewState2 optionsSimulatedReturnSliderViewState2;
        float floatValue = f / snapshotFloatState2.getFloatValue();
        if (OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$13(snapshotState4)) {
            optionsSimulatedReturnSliderViewState2 = OptionsSimulatedReturnSliderViewState2.DRAGGING;
        } else {
            optionsSimulatedReturnSliderViewState2 = OptionsSimulatedReturnSliderViewState2.FLINGING;
        }
        optionsSimulatedReturnSliderDuxo.onSliderDragged(floatValue, optionsSimulatedReturnSliderViewState2);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$31$lambda$26$lambda$19$lambda$18 */
    public static final Unit m2233xf3f477f1(SnapshotFloatState2 snapshotFloatState2, IntSize intSize) {
        snapshotFloatState2.setFloatValue((int) (intSize.getPackedValue() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$31$lambda$26$lambda$25$lambda$24 */
    public static final Unit m2234xa8135267(long j, float f, Brush brush, float f2, SnapshotState4 snapshotState4, long j2, TextMeasurer textMeasurer, TextStyle textStyle, float f3, long j3, float f4, long j4, float f5, long j5, long j6, long j7, float f6, DrawScope drawScope) {
        int i;
        char c;
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        char c2 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        ImmutableList<OptionsSimulatedReturnSliderViewState5> ticks = OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState4).getTicks();
        ArrayList arrayList = new ArrayList();
        for (OptionsSimulatedReturnSliderViewState5 optionsSimulatedReturnSliderViewState5 : ticks) {
            if (!(optionsSimulatedReturnSliderViewState5 instanceof OptionsSimulatedReturnSliderViewState5.PositionPin)) {
                arrayList.add(optionsSimulatedReturnSliderViewState5);
            }
        }
        ImmutableList<OptionsSimulatedReturnSliderViewState5> ticks2 = OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(snapshotState4).getTicks();
        ArrayList arrayList2 = new ArrayList();
        for (OptionsSimulatedReturnSliderViewState5 optionsSimulatedReturnSliderViewState52 : ticks2) {
            if (optionsSimulatedReturnSliderViewState52 instanceof OptionsSimulatedReturnSliderViewState5.PositionPin) {
                arrayList2.add(optionsSimulatedReturnSliderViewState52);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$31$lambda$26$lambda$25$lambda$24$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Float.valueOf(((OptionsSimulatedReturnSliderViewState5.PositionPin) t).getRelativePosition()), Float.valueOf(((OptionsSimulatedReturnSliderViewState5.PositionPin) t2).getRelativePosition()));
            }
        });
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 2;
            Float f7 = null;
            if (!it.hasNext()) {
                char c3 = c2;
                int i3 = 0;
                for (Object obj : listSortedWith) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    OptionsSimulatedReturnSliderViewState5.PositionPin positionPin = (OptionsSimulatedReturnSliderViewState5.PositionPin) obj;
                    float relativePosition = positionPin.getRelativePosition() * fIntBitsToFloat;
                    double d = f5 * 1.0d;
                    if (f7 == null || Math.abs(relativePosition - f7.floatValue()) >= d) {
                        Float fValueOf = Float.valueOf(relativePosition);
                        int i5 = i2;
                        long j8 = positionPin.isPast() ? j5 : j6;
                        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(positionPin.getRelativePosition() * fIntBitsToFloat) << c3) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
                        float f8 = fIntBitsToFloat2 - f2;
                        long jFloatToRawIntBits = Float.floatToRawIntBits(positionPin.getRelativePosition() * fIntBitsToFloat);
                        i = i5;
                        DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j8, jM6535constructorimpl, Offset.m6535constructorimpl((jFloatToRawIntBits << c3) | (Float.floatToRawIntBits(f8) & 4294967295L)), f, 0, null, 0.0f, null, 0, 496, null);
                        DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, j7, f6, Offset.m6535constructorimpl((Float.floatToRawIntBits(positionPin.getRelativePosition() * fIntBitsToFloat) << c3) | (Float.floatToRawIntBits(f8) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                        DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, j8, f5, Offset.m6535constructorimpl((Float.floatToRawIntBits(positionPin.getRelativePosition() * fIntBitsToFloat) << c3) | (Float.floatToRawIntBits(f8) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                        f7 = fValueOf;
                    } else {
                        i = i2;
                    }
                    i2 = i;
                    i3 = i4;
                }
                float f9 = fIntBitsToFloat / i2;
                DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(f9) << c3) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(f9) << c3) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), f, 0, null, 0.0f, null, 0, 496, null);
                DrawScope.m6957drawRectAsUm42w$default(drawScope, brush, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << c3) | (Float.floatToRawIntBits(fIntBitsToFloat2 - f2) & 4294967295L)), drawScope.mo6963getSizeNHjbRc(), 0.0f, null, null, 0, 120, null);
                return Unit.INSTANCE;
            }
            OptionsSimulatedReturnSliderViewState5 optionsSimulatedReturnSliderViewState53 = (OptionsSimulatedReturnSliderViewState5) it.next();
            if (optionsSimulatedReturnSliderViewState53 instanceof OptionsSimulatedReturnSliderViewState5.BigTick) {
                float f10 = fIntBitsToFloat2 - f2;
                c = c2;
                DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j2, Offset.m6535constructorimpl((Float.floatToRawIntBits(r23.getRelativePosition() * fIntBitsToFloat) << c2) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(r23.getRelativePosition() * fIntBitsToFloat) << c2) | (Float.floatToRawIntBits(f10) & 4294967295L)), f, 0, null, 0.0f, null, 0, 496, null);
                TextLayoutResult textLayoutResultM7624measurexDpz5zY$default = TextMeasurer.m7624measurexDpz5zY$default(textMeasurer, new AnnotatedString(((OptionsSimulatedReturnSliderViewState5.BigTick) optionsSimulatedReturnSliderViewState53).getDisplayPrice(), null, 2, null), textStyle, TextOverflow.INSTANCE.m7962getVisiblegIe3tQ8(), false, 0, null, 0L, null, null, null, false, 2040, null);
                long size = textLayoutResultM7624measurexDpz5zY$default.getSize();
                TextPainter2.m7631drawTextd8rzKo(drawScope, textLayoutResultM7624measurexDpz5zY$default, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j3, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 4) != 0 ? Offset.INSTANCE.m6553getZeroF1C5BW0() : Offset.m6546minusMKHz9U(Offset.m6535constructorimpl((Float.floatToRawIntBits(r23.getRelativePosition() * fIntBitsToFloat) << c) | (Float.floatToRawIntBits((f10 - f3) - ((int) (size & 4294967295L))) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(((int) (size >> c)) / 2.0f) << c) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 8) != 0 ? Float.NaN : 0.0f, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 16) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 32) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 64) == 0 ? null : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 128) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : 0);
            } else {
                c = c2;
                if (optionsSimulatedReturnSliderViewState53 instanceof OptionsSimulatedReturnSliderViewState5.SmallTick) {
                    OptionsSimulatedReturnSliderViewState5.SmallTick smallTick = (OptionsSimulatedReturnSliderViewState5.SmallTick) optionsSimulatedReturnSliderViewState53;
                    DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j2, Offset.m6535constructorimpl((Float.floatToRawIntBits(smallTick.getRelativePosition() * fIntBitsToFloat) << c) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2 - f4) & 4294967295L) | (Float.floatToRawIntBits(smallTick.getRelativePosition() * fIntBitsToFloat) << c)), f, 0, null, 0.0f, null, 0, 496, null);
                } else if (optionsSimulatedReturnSliderViewState53 instanceof OptionsSimulatedReturnSliderViewState5.CurrentPriceTick) {
                    OptionsSimulatedReturnSliderViewState5.CurrentPriceTick currentPriceTick = (OptionsSimulatedReturnSliderViewState5.CurrentPriceTick) optionsSimulatedReturnSliderViewState53;
                    DrawScope.m6951drawLineNGM6Ib0$default(drawScope, j4, Offset.m6535constructorimpl((Float.floatToRawIntBits(currentPriceTick.getRelativePosition() * fIntBitsToFloat) << c) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2 - f4) & 4294967295L) | (Float.floatToRawIntBits(currentPriceTick.getRelativePosition() * fIntBitsToFloat) << c)), f, 0, null, 0.0f, null, 0, 496, null);
                } else if (!(optionsSimulatedReturnSliderViewState53 instanceof OptionsSimulatedReturnSliderViewState5.PositionPin)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Canvas = drawScope;
            c2 = c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$31$lambda$28$lambda$27 */
    public static final Unit m2235x3fbb8e50(OptionsSimulatedReturnSliderDuxo optionsSimulatedReturnSliderDuxo) {
        optionsSimulatedReturnSliderDuxo.onSliderQuotePillTapped(OptionsSimulatedReturnSliderViewState3.START);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$31$lambda$30$lambda$29 */
    public static final Unit m2236xa0479da9(OptionsSimulatedReturnSliderDuxo optionsSimulatedReturnSliderDuxo) {
        optionsSimulatedReturnSliderDuxo.onSliderQuotePillTapped(OptionsSimulatedReturnSliderViewState3.END);
        return Unit.INSTANCE;
    }

    private static final void PriceSelector(final SliderTooltip sliderTooltip, final boolean z, final OptionsSimulatedReturnSlider9 optionsSimulatedReturnSlider9, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(809767684);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sliderTooltip) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(optionsSimulatedReturnSlider9.ordinal()) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(809767684, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.PriceSelector (OptionsSimulatedReturnSlider.kt:406)");
            }
            DimensionSubcomposeLayout.DimensionSubcomposeLayout(ComposableLambda3.rememberComposableLambda(1309858989, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt.PriceSelector.1
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
                        ComposerKt.traceEventStart(1309858989, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.PriceSelector.<anonymous> (OptionsSimulatedReturnSlider.kt:409)");
                    }
                    OptionsSimulatedReturnSlider.PriceTooltip(sliderTooltip, z, OptionsSimulatedReturnSlider9.MEASURING, null, composer2, 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(855408493, true, new Function3<Size, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt.PriceSelector.2

                /* compiled from: OptionsSimulatedReturnSlider.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$PriceSelector$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[OptionsSimulatedReturnSlider9.values().length];
                        try {
                            iArr[OptionsSimulatedReturnSlider9.EXPANDED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Size size, Composer composer2, Integer num) {
                    m16970invokePq9zytI(size.getPackedValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Pq9zytI, reason: not valid java name */
                public final void m16970invokePq9zytI(long j, Composer composer2, int i3) {
                    if ((i3 & 6) == 0) {
                        i3 |= composer2.changed(j) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(855408493, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.PriceSelector.<anonymous> (OptionsSimulatedReturnSlider.kt:416)");
                    }
                    OptionsSimulatedReturnSlider.PriceTooltip(sliderTooltip, z, optionsSimulatedReturnSlider9, WhenMappings.$EnumSwitchMapping$0[optionsSimulatedReturnSlider9.ordinal()] == 1 ? SizeKt.m5176widthInVpY3zN4$default(Modifier.INSTANCE, Dp5.m8024getWidthD9Ej5fM(((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5014toDpSizekrfVVM(j)), 0.0f, 2, null) : Modifier.INSTANCE, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnSlider.PriceSelector$lambda$33(sliderTooltip, z, optionsSimulatedReturnSlider9, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PriceTooltip(final SliderTooltip sliderTooltip, final boolean z, final OptionsSimulatedReturnSlider9 optionsSimulatedReturnSlider9, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM21425getFg0d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1294066675);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sliderTooltip) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changed(optionsSimulatedReturnSlider9.ordinal()) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1294066675, i3, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.PriceTooltip (OptionsSimulatedReturnSlider.kt:436)");
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(1942451535);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1942450672);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                CardKt.m5548CardFjzlyU(modifier2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), jM21425getFg0d7_KjU, 0L, null, C2002Dp.m7995constructorimpl(!z ? 0 : 1), ComposableLambda3.rememberComposableLambda(1635317898, true, new C233491(optionsSimulatedReturnSlider9, sliderTooltip, z), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 1572864, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsSimulatedReturnSlider.PriceTooltip$lambda$34(sliderTooltip, z, optionsSimulatedReturnSlider9, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z) {
            }
            composerStartRestartGroup.endReplaceGroup();
            CardKt.m5548CardFjzlyU(modifier2, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), jM21425getFg0d7_KjU, 0L, null, C2002Dp.m7995constructorimpl(!z ? 0 : 1), ComposableLambda3.rememberComposableLambda(1635317898, true, new C233491(optionsSimulatedReturnSlider9, sliderTooltip, z), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 1572864, 24);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: OptionsSimulatedReturnSlider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$PriceTooltip$1 */
    static final class C233491 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OptionsSimulatedReturnSlider9 $displayMode;
        final /* synthetic */ SliderTooltip $sliderTooltip;
        final /* synthetic */ boolean $usePreTradeStyle;

        C233491(OptionsSimulatedReturnSlider9 optionsSimulatedReturnSlider9, SliderTooltip sliderTooltip, boolean z) {
            this.$displayMode = optionsSimulatedReturnSlider9;
            this.$sliderTooltip = sliderTooltip;
            this.$usePreTradeStyle = z;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1635317898, i, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.PriceTooltip.<anonymous> (OptionsSimulatedReturnSlider.kt:443)");
            }
            OptionsSimulatedReturnSlider9 optionsSimulatedReturnSlider9 = this.$displayMode;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$PriceTooltip$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnSlider.C233491.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final SliderTooltip sliderTooltip = this.$sliderTooltip;
            final boolean z = this.$usePreTradeStyle;
            AnimatedContentKt.AnimatedContent(optionsSimulatedReturnSlider9, null, (Function1) objRememberedValue, null, OptionsSimulatedReturnSlider.PriceTooltipLabel, null, ComposableLambda3.rememberComposableLambda(-820879164, true, new Function4<AnimatedContentScope, OptionsSimulatedReturnSlider9, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt.PriceTooltip.1.2

                /* compiled from: OptionsSimulatedReturnSlider.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$PriceTooltip$1$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[OptionsSimulatedReturnSlider9.values().length];
                        try {
                            iArr[OptionsSimulatedReturnSlider9.NORMAL.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[OptionsSimulatedReturnSlider9.EXPANDED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[OptionsSimulatedReturnSlider9.MEASURING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, OptionsSimulatedReturnSlider9 optionsSimulatedReturnSlider92, Composer composer2, Integer num) {
                    invoke(animatedContentScope, optionsSimulatedReturnSlider92, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, OptionsSimulatedReturnSlider9 targetDisplayMode, Composer composer2, int i2) {
                    String priceText;
                    long jM21371getBg0d7_KjU;
                    long jM21371getBg0d7_KjU2;
                    long jM21371getBg0d7_KjU3;
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(targetDisplayMode, "targetDisplayMode");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-820879164, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.PriceTooltip.<anonymous>.<anonymous> (OptionsSimulatedReturnSlider.kt:450)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(5);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), fM7995constructorimpl);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    SliderTooltip sliderTooltip2 = sliderTooltip;
                    boolean z2 = z;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    int i4 = WhenMappings.$EnumSwitchMapping$0[targetDisplayMode.ordinal()];
                    if (i4 == 1) {
                        priceText = sliderTooltip2.getPriceText();
                    } else if (i4 == 2) {
                        priceText = sliderTooltip2.getPriceAndPercentageText();
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        priceText = sliderTooltip2.getMeasurePriceAndPercentageText();
                    }
                    if (z2) {
                        composer2.startReplaceGroup(-1562418692);
                        jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU();
                    } else {
                        composer2.startReplaceGroup(-1562417860);
                        jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU();
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(priceText, null, Color.m6701boximpl(jM21371getBg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, OptionsSimulatedReturnSlider.getSliderTextSize(z2, composer2, 0), composer2, 24576, 0, 8170);
                    if (targetDisplayMode == OptionsSimulatedReturnSlider9.NORMAL) {
                        composer2.startReplaceGroup(-1562410498);
                        composer2.endReplaceGroup();
                    } else if (targetDisplayMode == OptionsSimulatedReturnSlider9.EXPANDED && sliderTooltip2.getSymbolText().length() > 0) {
                        composer2.startReplaceGroup(-1562406271);
                        String symbolText = sliderTooltip2.getSymbolText();
                        if (z2) {
                            composer2.startReplaceGroup(-1562401828);
                            jM21371getBg0d7_KjU3 = bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(-1562400996);
                            jM21371getBg0d7_KjU3 = bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(symbolText, null, Color.m6701boximpl(jM21371getBg0d7_KjU3), null, null, null, null, 0, false, 0, 0, null, 0, OptionsSimulatedReturnSlider.getSliderTextSize(z2, composer2, 0), composer2, 0, 0, 8186);
                        composer2.endReplaceGroup();
                    } else if (targetDisplayMode == OptionsSimulatedReturnSlider9.MEASURING) {
                        composer2.startReplaceGroup(-1562394260);
                        String measureFullSymbolText = sliderTooltip2.getMeasureFullSymbolText();
                        if (z2) {
                            composer2.startReplaceGroup(-1562389476);
                            jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(-1562388644);
                            jM21371getBg0d7_KjU2 = bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(measureFullSymbolText, null, Color.m6701boximpl(jM21371getBg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, OptionsSimulatedReturnSlider.getSliderTextSize(z2, composer2, 0), composer2, 0, 0, 8186);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1189269880);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
        }
    }

    private static final void QuotePill(final BoxScope boxScope, final SliderQuotePillState sliderQuotePillState, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        boolean z2;
        Function0<Unit> function02;
        BoxScope boxScope2;
        Alignment bottomStart;
        Tuples2 tuples2M3642to;
        float fM7995constructorimpl;
        final long jM8033constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1073537028);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sliderQuotePillState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1073537028, i2, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.QuotePill (OptionsSimulatedReturnSlider.kt:493)");
            }
            if (sliderQuotePillState == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final boolean z3 = z2;
                    final Function0<Unit> function03 = function02;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsSimulatedReturnSlider.QuotePill$lambda$35(boxScope, sliderQuotePillState, z3, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            boxScope2 = boxScope;
            OptionsSimulatedReturnSliderViewState3 anchor = sliderQuotePillState.getAnchor();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i3 = iArr[anchor.ordinal()];
            if (i3 == 1) {
                bottomStart = Alignment.INSTANCE.getBottomStart();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bottomStart = Alignment.INSTANCE.getBottomEnd();
            }
            int i4 = iArr[sliderQuotePillState.getAnchor().ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(876946490);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                tuples2M3642to = Tuples4.m3642to(C2002Dp.m7993boximpl(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), C2002Dp.m7993boximpl(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    composerStartRestartGroup.startReplaceGroup(876944877);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(876949242);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                tuples2M3642to = Tuples4.m3642to(C2002Dp.m7993boximpl(bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), C2002Dp.m7993boximpl(bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()));
                composerStartRestartGroup.endReplaceGroup();
            }
            float value = ((C2002Dp) tuples2M3642to.component1()).getValue();
            float value2 = ((C2002Dp) tuples2M3642to.component2()).getValue();
            int i7 = iArr[sliderQuotePillState.getAnchor().ordinal()];
            if (i7 == 1) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(-12);
            } else if (i7 == 2) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(12);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = iArr[sliderQuotePillState.getAnchor().ordinal()];
            if (i8 == 1) {
                jM8033constructorimpl = IntOffset.m8033constructorimpl(((-50) << 32) | (4294967295L & 0));
            } else if (i8 == 2) {
                jM8033constructorimpl = IntOffset.m8033constructorimpl((50 << 32) | (4294967295L & 0));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1.5f);
            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(5.0f);
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
            boolean visibility = sliderQuotePillState.getVisibility();
            Modifier modifierM5124offsetVpY3zN4 = OffsetKt.m5124offsetVpY3zN4(boxScope2.align(Modifier.INSTANCE, bottomStart), fM7995constructorimpl, C2002Dp.m7995constructorimpl(-C2002Dp.m7995constructorimpl(BIG_TICK_HEIGHT_DP)));
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(jM8033constructorimpl);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnSlider.QuotePill$lambda$37$lambda$36(jM8033constructorimpl, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideIn$default(null, (Function1) objRememberedValue, 1, null));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(jM8033constructorimpl);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionsSimulatedReturnSlider.QuotePill$lambda$39$lambda$38(jM8033constructorimpl, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ExitTransition exitTransitionPlus = EnterExitTransitionKt.slideOut$default(null, (Function1) objRememberedValue2, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1940180012, true, new C233504(sliderQuotePillState, z, roundedCornerShapeM5327RoundedCornerShape0680j_4, function0, fM7995constructorimpl2, value, fM7995constructorimpl3, value2), composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(visibility, modifierM5124offsetVpY3zN4, enterTransitionPlus, exitTransitionPlus, (String) null, composableLambdaRememberComposableLambda, composer2, 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            boxScope2 = boxScope;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final BoxScope boxScope3 = boxScope2;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsSimulatedReturnSlider.QuotePill$lambda$40(boxScope3, sliderQuotePillState, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset QuotePill$lambda$37$lambda$36(long j, IntSize intSize) {
        return IntOffset.m8030boximpl(j);
    }

    /* compiled from: OptionsSimulatedReturnSlider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$QuotePill$4 */
    static final class C233504 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ float $borderWidth;
        final /* synthetic */ Function0<Unit> $onQuotePillTapped;
        final /* synthetic */ float $paddingEnd;
        final /* synthetic */ float $paddingStart;
        final /* synthetic */ RoundedCornerShape $pillShape;
        final /* synthetic */ float $pillVerticalPadding;
        final /* synthetic */ SliderQuotePillState $state;
        final /* synthetic */ boolean $usePreTradeStyle;

        C233504(SliderQuotePillState sliderQuotePillState, boolean z, RoundedCornerShape roundedCornerShape, Function0<Unit> function0, float f, float f2, float f3, float f4) {
            this.$state = sliderQuotePillState;
            this.$usePreTradeStyle = z;
            this.$pillShape = roundedCornerShape;
            this.$onQuotePillTapped = function0;
            this.$borderWidth = f;
            this.$paddingStart = f2;
            this.$pillVerticalPadding = f3;
            this.$paddingEnd = f4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            long jM21425getFg0d7_KjU;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1940180012, i, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.QuotePill.<anonymous> (OptionsSimulatedReturnSlider.kt:522)");
            }
            String text = this.$state.getText();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            TextStyle sliderTextSize = OptionsSimulatedReturnSlider.getSliderTextSize(this.$usePreTradeStyle, composer, 0);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            Modifier modifierClip = Clip.clip(Modifier.INSTANCE, this.$pillShape);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onQuotePillTapped);
            final Function0<Unit> function0 = this.$onQuotePillTapped;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$QuotePill$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsSimulatedReturnSlider.C233504.invoke$lambda$1$lambda$0(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null);
            float f = this.$borderWidth;
            if (this.$usePreTradeStyle) {
                composer.startReplaceGroup(497200111);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
            } else {
                composer.startReplaceGroup(497200974);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            }
            composer.endReplaceGroup();
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(modifierM4893clickableXHw0xAI$default, f, jM21425getFg0d7_KjU, this.$pillShape), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), this.$pillShape);
            float f2 = this.$paddingStart;
            float f3 = this.$pillVerticalPadding;
            BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5145paddingqDBjuR0(modifierM4871backgroundbw27NRU, f2, f3, this.$paddingEnd, f3), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, bold, null, null, 0, false, 0, 0, null, 0, sliderTextSize, composer, 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset QuotePill$lambda$39$lambda$38(long j, IntSize intSize) {
        return IntOffset.m8030boximpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle getSliderTextSize(boolean z, Composer composer, int i) {
        TextStyle textS;
        composer.startReplaceGroup(-1483329928);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1483329928, i, -1, "com.robinhood.android.options.lib.simulatedreturn.slider.getSliderTextSize (OptionsSimulatedReturnSlider.kt:551)");
        }
        if (z) {
            composer.startReplaceGroup(1036721334);
            textS = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextAnnotation();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1036778591);
            textS = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textS;
    }

    private static final float dpToFloat(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
