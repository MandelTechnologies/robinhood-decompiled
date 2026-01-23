package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.analytics.LadderLoggingUtils;
import com.robinhood.android.futures.trade.extensions.Analytics4;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.PreviewQuantityBarParameterProvider;
import com.robinhood.android.futures.trade.p147ui.ladder.QuantityBarStyle;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.ChartStyle;
import com.robinhood.compose.theme.style.CheckboxStyle;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.compose.theme.style.MarkdownSpannedTextStyle;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.compose.theme.style.PlaceholderStyle;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.compose.theme.style.TextStyle;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext;
import com.robinhood.utils.compose.extensions.Colors8;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderRow.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a§\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00102\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001aq\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u00152\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0003¢\u0006\u0002\u0010(\u001as\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0001¢\u0006\u0002\u00104\u001a\r\u00105\u001a\u00020\u0006H\u0003¢\u0006\u0002\u00106\u001as\u00107\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0003¢\u0006\u0002\u00104\u001aA\u00108\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0003¢\u0006\u0002\u00109\u001a\u001b\u0010:\u001a\b\u0012\u0004\u0012\u00020/0;2\u0006\u0010<\u001a\u00020=H\u0003¢\u0006\u0002\u0010>\u001a3\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020A2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0004\bD\u0010E\u001aI\u0010?\u001a\u00020\u00062\u0006\u0010F\u001a\u00020/2\u0006\u0010@\u001a\u00020A2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010G\u001a\u00020/2\u0006\u0010 \u001a\u00020!2\u0006\u0010H\u001a\u00020+2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0004\bI\u0010J\u001aA\u0010K\u001a\u00020\u00062\u0006\u0010F\u001a\u00020/2\u0006\u0010L\u001a\u00020A2\u0006\u0010M\u001a\u00020A2\u0006\u0010N\u001a\u00020O2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0004\bP\u0010Q\u001a1\u0010R\u001a\u00020\u00062\u0006\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020A2\u0006\u0010@\u001a\u00020A2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0004\bU\u0010V\u001a\u0017\u0010W\u001a\u00020\u00062\b\b\u0001\u0010X\u001a\u00020YH\u0003¢\u0006\u0002\u0010Z\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006[²\u0006\f\u0010\\\u001a\u0004\u0018\u00010]X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u0084\u0002"}, m3636d2 = {"ladderRowHeight", "Landroidx/compose/ui/unit/Dp;", "getLadderRowHeight", "()F", "F", "LadderRow", "", "ladderData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "rowIndex", "", "animateQuantityBarsEntry", "", "onRowClicked", "Lkotlin/Function0;", "onBuyClicked", "Lkotlin/Function2;", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "onSellClicked", "onPendingOrderSelected", "Lkotlin/Function1;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "onPendingOrderDownInitiated", "getIndexOfMiddleVisibleItem", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PendingOrderRow", "Landroidx/compose/foundation/layout/BoxScope;", "orderGroup", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "isSelected", "currentDragDirection", "Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "selectedPendingOrdersIndex", "alignment", "Landroidx/compose/ui/Alignment;", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow$Group;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;ZLcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V", "SelectedLadderRow", "priceText", "", "pnLText", "middleIndex", "targetRotation", "", "buyConfig", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;", "sellConfig", "onPriceClicked", "(Ljava/lang/String;Ljava/lang/String;IIFLcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow$OrderConfig;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SelectedLadderRowBackground", "(Landroidx/compose/runtime/Composer;I)V", "SelectedLadderRowContent", "DefaultLadderRow", "(Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "rememberTargetRotationState", "Landroidx/compose/runtime/State;", "ladderDisplayMode", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;", "(Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "QuantityBarRow", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "quantityBarData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$QuantityBar;", "QuantityBarRow-euL9pac", "(JZLcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$QuantityBar;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "widthFraction", "alpha", "quantityText", "QuantityBarRow-oC9nPe0", "(FJZFLcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "QuantityBar", "barBackgroundColor", "borderColor", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "QuantityBar-qi6gXK8", "(FJJLandroidx/compose/foundation/shape/RoundedCornerShape;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "QuantityText", "text", ResourceTypes.COLOR, "QuantityText-eopBjH0", "(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewQuantityBarRow", "parameters", "Lcom/robinhood/android/futures/trade/ui/ladder/PreviewQuantityBarParameterProvider$Parameters;", "(Lcom/robinhood/android/futures/trade/ui/ladder/PreviewQuantityBarParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "feature-futures-trade_externalDebug", "previousSelectedRowData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LadderRowKt {
    private static final float ladderRowHeight = C2002Dp.m7995constructorimpl(44);

    /* compiled from: LadderRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FuturesLadderDataState2.values().length];
            try {
                iArr[FuturesLadderDataState2.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesLadderDataState2.PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FuturesOrderSide.values().length];
            try {
                iArr2[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultLadderRow$lambda$31(FuturesLadderViewState.LadderData ladderData, int i, boolean z, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        DefaultLadderRow(ladderData, i, z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$8(FuturesLadderViewState.LadderData ladderData, int i, boolean z, Function0 function0, Function2 function2, Function2 function22, Function1 function1, Function1 function12, Function0 function02, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        LadderRow(ladderData, i, z, function0, function2, function22, function1, function12, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingOrderRow$lambda$13(BoxScope boxScope, FuturesLadderViewState.LadderData.PendingOrderRow.Group group, FuturesOrderSide futuresOrderSide, boolean z, LadderCustomGestureDetector ladderCustomGestureDetector, Integer num, Function1 function1, Function1 function12, Alignment alignment, int i, int i2, Composer composer, int i3) {
        PendingOrderRow(boxScope, group, futuresOrderSide, z, ladderCustomGestureDetector, num, function1, function12, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuantityBarRow$lambda$39(PreviewQuantityBarParameterProvider.Parameters parameters, int i, Composer composer, int i2) {
        PreviewQuantityBarRow(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityBarRow_euL9pac$lambda$32(long j, boolean z, FuturesLadderViewState.LadderData.QuantityBar quantityBar, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14824QuantityBarRoweuL9pac(j, z, quantityBar, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityBarRow_oC9nPe0$lambda$34(float f, long j, boolean z, float f2, FuturesOrderSide futuresOrderSide, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14825QuantityBarRowoC9nPe0(f, j, z, f2, futuresOrderSide, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityBar_qi6gXK8$lambda$37(float f, long j, long j2, RoundedCornerShape roundedCornerShape, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14823QuantityBarqi6gXK8(f, j, j2, roundedCornerShape, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityText_eopBjH0$lambda$38(String str, long j, long j2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14826QuantityTexteopBjH0(str, j, j2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRow$lambda$15(String str, String str2, int i, int i2, float f, FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig, FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig2, Function0 function0, Function0 function02, Function0 function03, int i3, Composer composer, int i4) {
        SelectedLadderRow(str, str2, i, i2, f, orderConfig, orderConfig2, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRowBackground$lambda$16(int i, Composer composer, int i2) {
        SelectedLadderRowBackground(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRowContent$lambda$22(String str, String str2, int i, int i2, float f, FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig, FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig2, Function0 function0, Function0 function02, Function0 function03, int i3, Composer composer, int i4) {
        SelectedLadderRowContent(str, str2, i, i2, f, orderConfig, orderConfig2, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$7$lambda$1$lambda$0(long j, PathEffect pathEffect, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), 0.0f, 0, pathEffect, 0.0f, null, 0, 472, null);
        return Unit.INSTANCE;
    }

    public static final float getLadderRowHeight() {
        return ladderRowHeight;
    }

    private static final float DefaultLadderRow$lambda$30$lambda$29(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesLadderViewState.LadderData.SelectedRow LadderRow$lambda$7$lambda$5(SnapshotState<FuturesLadderViewState.LadderData.SelectedRow> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v36, types: [int] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderRow(final FuturesLadderViewState.LadderData ladderData, final int i, final boolean z, final Function0<Unit> onRowClicked, final Function2<? super FuturesOrderType, ? super FuturesOrderTrigger, Unit> onBuyClicked, final Function2<? super FuturesOrderType, ? super FuturesOrderTrigger, Unit> onSellClicked, final Function1<? super FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> onPendingOrderSelected, final Function1<? super FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> onPendingOrderDownInitiated, final Function0<Integer> getIndexOfMiddleVisibleItem, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        FuturesLadderViewState.LadderData.AverageCostLineData avgCostLineData;
        boolean z3;
        boolean z4;
        FuturesLadderViewState.LadderData.PendingOrderRow.Group buys;
        Modifier modifier3;
        boolean z5;
        Modifier modifier4;
        ?? r6;
        int i6;
        Composer composer2;
        FuturesLadderViewState.LadderData.PendingOrderRow.Group sells;
        Object objRememberedValue;
        SnapshotState snapshotState;
        final Modifier modifier5;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ladderData, "ladderData");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Intrinsics.checkNotNullParameter(onBuyClicked, "onBuyClicked");
        Intrinsics.checkNotNullParameter(onSellClicked, "onSellClicked");
        Intrinsics.checkNotNullParameter(onPendingOrderSelected, "onPendingOrderSelected");
        Intrinsics.checkNotNullParameter(onPendingOrderDownInitiated, "onPendingOrderDownInitiated");
        Intrinsics.checkNotNullParameter(getIndexOfMiddleVisibleItem, "getIndexOfMiddleVisibleItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1312968046);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(ladderData) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onRowClicked) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onBuyClicked) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onSellClicked) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onPendingOrderSelected) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onPendingOrderDownInitiated) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(getIndexOfMiddleVisibleItem) ? 67108864 : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= 805306368;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                }
            }
            if ((i4 & 306783379) != 306783378 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1312968046, i4, -1, "com.robinhood.android.futures.trade.ui.ladder.LadderRow (LadderRow.kt:89)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment centerStart = companion.getCenterStart();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                float f = ladderRowHeight;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default, f);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1696196205);
                avgCostLineData = ladderData.getAvgCostLineData();
                if (avgCostLineData == null && avgCostLineData.getIndex() == i) {
                    final PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
                    final long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl((float) 1.5d));
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(ladderData.getAvgCostLineData().getOffsetMultiplier() * f) - C2002Dp.m7995constructorimpl(f * 0.5f));
                    z3 = true;
                    Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(modifierM5156height3ABfNKs2, 0.0f, fM7995constructorimpl, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) | composerStartRestartGroup.changedInstance(pathEffectDashPathEffect);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LadderRowKt.LadderRow$lambda$7$lambda$1$lambda$0(jM21425getFg0d7_KjU, pathEffectDashPathEffect, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z4 = false;
                    Canvas2.Canvas(modifierM5125offsetVpY3zN4$default, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                } else {
                    z3 = true;
                    z4 = false;
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = i4;
                DefaultLadderRow(ladderData, i, z2, onRowClicked, getIndexOfMiddleVisibleItem, composerStartRestartGroup, (i4 & 8190) | ((i4 >> 12) & 57344));
                FuturesLadderViewState.LadderData.PendingOrderRow pendingOrderRow = ladderData.getPendingOrders().get(Integer.valueOf(i));
                Integer selectedPendingOrdersRowIndex = ladderData.getSelectedPendingOrdersRowIndex();
                boolean z7 = (selectedPendingOrdersRowIndex != null && selectedPendingOrdersRowIndex.intValue() == i) ? z3 : z4;
                buys = pendingOrderRow == null ? pendingOrderRow.getBuys() : null;
                composerStartRestartGroup.startReplaceGroup(-1696156011);
                if (buys != null) {
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    r6 = z4;
                    i6 = 2;
                } else if (z7) {
                    FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders = ladderData.getSelectedPendingOrders();
                    if ((selectedPendingOrders != null ? selectedPendingOrders.getSide() : null) == FuturesOrderSide.BUY) {
                        modifier3 = modifier2;
                        z5 = z3;
                    }
                    modifier4 = modifier3;
                    r6 = z4;
                    i6 = 2;
                    PendingOrderRow(boxScopeInstance, buys, FuturesOrderSide.BUY, z5, ladderData.getPendingOrderDragDirection(), ladderData.getSelectedPendingOrdersIndex(), onPendingOrderSelected, onPendingOrderDownInitiated, null, composerStartRestartGroup, 390 | (i7 & 3670016) | (i7 & 29360128), 128);
                    composer2 = composerStartRestartGroup;
                    Unit unit = Unit.INSTANCE;
                } else {
                    modifier3 = modifier2;
                    z5 = z4;
                    modifier4 = modifier3;
                    r6 = z4;
                    i6 = 2;
                    PendingOrderRow(boxScopeInstance, buys, FuturesOrderSide.BUY, z5, ladderData.getPendingOrderDragDirection(), ladderData.getSelectedPendingOrdersIndex(), onPendingOrderSelected, onPendingOrderDownInitiated, null, composerStartRestartGroup, 390 | (i7 & 3670016) | (i7 & 29360128), 128);
                    composer2 = composerStartRestartGroup;
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                sells = pendingOrderRow == null ? pendingOrderRow.getSells() : null;
                composer2.startReplaceGroup(-1696134064);
                if (sells != null) {
                    FuturesOrderSide futuresOrderSide = FuturesOrderSide.SELL;
                    if (!z7) {
                        z6 = r6;
                        Composer composer3 = composer2;
                        PendingOrderRow(boxScopeInstance, sells, futuresOrderSide, z6, ladderData.getPendingOrderDragDirection(), ladderData.getSelectedPendingOrdersIndex(), onPendingOrderSelected, onPendingOrderDownInitiated, companion.getCenterEnd(), composer3, 100663686 | (i7 & 3670016) | (i7 & 29360128), 0);
                        composer2 = composer3;
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders2 = ladderData.getSelectedPendingOrders();
                        if ((selectedPendingOrders2 != null ? selectedPendingOrders2.getSide() : null) == futuresOrderSide) {
                            z6 = z3;
                        }
                        Composer composer32 = composer2;
                        PendingOrderRow(boxScopeInstance, sells, futuresOrderSide, z6, ladderData.getPendingOrderDragDirection(), ladderData.getSelectedPendingOrdersIndex(), onPendingOrderSelected, onPendingOrderDownInitiated, companion.getCenterEnd(), composer32, 100663686 | (i7 & 3670016) | (i7 & 29360128), 0);
                        composer2 = composer32;
                        Unit unit32 = Unit.INSTANCE;
                    }
                }
                composer2.endReplaceGroup();
                AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowFadedOut(i), (Modifier) null, LadderAnimations.getLadderFadeInAnimation(), LadderAnimations.getLadderFadeOutAnimation(), (String) null, ComposableSingletons$LadderRowKt.INSTANCE.getLambda$2034366580$feature_futures_trade_externalDebug(), composer2, 200064, 18);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, i6, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                if (ladderData.getSelectedRow() != null && !Intrinsics.areEqual(ladderData.getSelectedRow(), LadderRow$lambda$7$lambda$5(snapshotState))) {
                    snapshotState.setValue(ladderData.getSelectedRow());
                }
                AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowSelected(i), (Modifier) null, LadderAnimations.getLadderFadeInAnimation().plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(100, r6, null, 6, null), 0.8f, 0L, 4, null)), LadderAnimations.getLadderFadeOutAnimation().plus(EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(100, r6, null, 6, null), 0.8f, 0L, 4, null)), (String) null, ComposableLambda3.rememberComposableLambda(1750303197, z3, new LadderRowKt$LadderRow$1$4(ladderData, i, getIndexOfMiddleVisibleItem, onRowClicked, onBuyClicked, onSellClicked, snapshotState), composer2, 54), composer2, 200064, 18);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderRowKt.LadderRow$lambda$8(ladderData, i, z, onRowClicked, onBuyClicked, onSellClicked, onPendingOrderSelected, onPendingOrderDownInitiated, getIndexOfMiddleVisibleItem, modifier5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 384;
        z2 = z;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment centerStart2 = companion3.getCenterStart();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            float f2 = ladderRowHeight;
            Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(modifierFillMaxWidth$default2, f2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart2, false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1696196205);
                avgCostLineData = ladderData.getAvgCostLineData();
                if (avgCostLineData == null) {
                    z3 = true;
                    z4 = false;
                    composerStartRestartGroup.endReplaceGroup();
                    int i72 = i4;
                    DefaultLadderRow(ladderData, i, z2, onRowClicked, getIndexOfMiddleVisibleItem, composerStartRestartGroup, (i4 & 8190) | ((i4 >> 12) & 57344));
                    FuturesLadderViewState.LadderData.PendingOrderRow pendingOrderRow2 = ladderData.getPendingOrders().get(Integer.valueOf(i));
                    Integer selectedPendingOrdersRowIndex2 = ladderData.getSelectedPendingOrdersRowIndex();
                    if (selectedPendingOrdersRowIndex2 != null) {
                        if (pendingOrderRow2 == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1696156011);
                        if (buys != null) {
                        }
                        composer2.endReplaceGroup();
                        if (pendingOrderRow2 == null) {
                        }
                        composer2.startReplaceGroup(-1696134064);
                        if (sells != null) {
                        }
                        composer2.endReplaceGroup();
                        AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowFadedOut(i), (Modifier) null, LadderAnimations.getLadderFadeInAnimation(), LadderAnimations.getLadderFadeOutAnimation(), (String) null, ComposableSingletons$LadderRowKt.INSTANCE.getLambda$2034366580$feature_futures_trade_externalDebug(), composer2, 200064, 18);
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composer2.endReplaceGroup();
                        if (ladderData.getSelectedRow() != null) {
                            snapshotState.setValue(ladderData.getSelectedRow());
                        }
                        AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowSelected(i), (Modifier) null, LadderAnimations.getLadderFadeInAnimation().plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(100, r6, null, 6, null), 0.8f, 0L, 4, null)), LadderAnimations.getLadderFadeOutAnimation().plus(EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(100, r6, null, 6, null), 0.8f, 0L, 4, null)), (String) null, ComposableLambda3.rememberComposableLambda(1750303197, z3, new LadderRowKt$LadderRow$1$4(ladderData, i, getIndexOfMiddleVisibleItem, onRowClicked, onBuyClicked, onSellClicked, snapshotState), composer2, 54), composer2, 200064, 18);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PendingOrderRow(final BoxScope boxScope, final FuturesLadderViewState.LadderData.PendingOrderRow.Group group, final FuturesOrderSide futuresOrderSide, final boolean z, final LadderCustomGestureDetector ladderCustomGestureDetector, final Integer num, final Function1<? super FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> function1, final Function1<? super FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> function12, Alignment alignment, Composer composer, final int i, final int i2) {
        int i3;
        Alignment alignment2;
        final Alignment alignment3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-683442287);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(group) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(futuresOrderSide.ordinal()) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(ladderCustomGestureDetector == null ? -1 : ladderCustomGestureDetector.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 131072 : 65536;
        }
        if ((i2 & 32) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((i2 & 64) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 100663296;
            alignment2 = alignment;
        } else {
            alignment2 = alignment;
            if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changed(alignment2) ? 67108864 : 33554432;
            }
        }
        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            Alignment alignment4 = i4 != 0 ? null : alignment2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-683442287, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.PendingOrderRow (LadderRow.kt:213)");
            }
            Integer num2 = z ? num : null;
            LadderCustomGestureDetector ladderCustomGestureDetector2 = z ? ladderCustomGestureDetector : null;
            Modifier.Companion companion = Modifier.INSTANCE;
            Object[] objArr = {num, Boolean.valueOf(z), group};
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i5 = i3 & 112;
            Integer num3 = num2;
            int i6 = 458752 & i3;
            boolean z2 = ((i3 & 7168) == 2048) | (i5 == 32) | (i6 == 131072) | ((29360128 & i3) == 8388608);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LadderRowKt$PendingOrderRow$2$1(group, z, num, function12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, objArr, (PointerInputEventHandler) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z3 = (i5 == 32) | (i6 == 131072) | ((3670016 & i3) == 1048576);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderRowKt.PendingOrderRow$lambda$12$lambda$11(group, num, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = i3 >> 3;
            AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack(boxScope, futuresOrderSide, group, num3, ladderCustomGestureDetector2, modifierPointerInput, (Function0) objRememberedValue2, alignment4, composerStartRestartGroup, (i3 & 14) | (i7 & 112) | ((i3 << 3) & 896) | (i7 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            alignment3 = alignment4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            alignment3 = alignment2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.PendingOrderRow$lambda$13(boxScope, group, futuresOrderSide, z, ladderCustomGestureDetector, num, function1, function12, alignment3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingOrderRow$lambda$12$lambda$11(FuturesLadderViewState.LadderData.PendingOrderRow.Group group, Integer num, Function1 function1) {
        ImmutableList<FuturesLadderViewState.LadderData.UiPendingOrder> orders = group.getOrders();
        FuturesLadderViewState.LadderData.UiPendingOrder uiPendingOrder = orders.get(FuturesLadderViewState.LadderData.UiPendingOrder.INSTANCE.nextIndex(orders, num));
        if (orders.size() > 1) {
            function1.invoke(new FuturesLadderViewState.LadderData.SelectedPendingOrders.Single(uiPendingOrder));
        }
        return Unit.INSTANCE;
    }

    public static final void SelectedLadderRow(final String priceText, final String pnLText, final int i, final int i2, final float f, final FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig, final FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig2, final Function0<Unit> onPriceClicked, final Function0<Unit> onBuyClicked, final Function0<Unit> onSellClicked, Composer composer, final int i3) {
        int i4;
        int i5;
        int i6;
        float f2;
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig3;
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig4;
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(pnLText, "pnLText");
        Intrinsics.checkNotNullParameter(onPriceClicked, "onPriceClicked");
        Intrinsics.checkNotNullParameter(onBuyClicked, "onBuyClicked");
        Intrinsics.checkNotNullParameter(onSellClicked, "onSellClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-503469271);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(priceText) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(pnLText) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i;
            i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
        } else {
            i5 = i;
        }
        if ((i3 & 3072) == 0) {
            i6 = i2;
            i4 |= composerStartRestartGroup.changed(i6) ? 2048 : 1024;
        } else {
            i6 = i2;
        }
        if ((i3 & 24576) == 0) {
            f2 = f;
            i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        if ((196608 & i3) == 0) {
            orderConfig3 = orderConfig;
            i4 |= composerStartRestartGroup.changed(orderConfig3) ? 131072 : 65536;
        } else {
            orderConfig3 = orderConfig;
        }
        if ((1572864 & i3) == 0) {
            orderConfig4 = orderConfig2;
            i4 |= composerStartRestartGroup.changed(orderConfig4) ? 1048576 : 524288;
        } else {
            orderConfig4 = orderConfig2;
        }
        if ((12582912 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPriceClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBuyClicked) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSellClicked) ? 536870912 : 268435456;
        }
        if ((306783379 & i4) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-503469271, i4, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow (LadderRow.kt:271)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Modifier modifierClip = Clip.clip(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxSize$default, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21597getXxsmallD9Ej5fM()), RoundedCornerShape2.RoundedCornerShape(50));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClip);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SelectedLadderRowBackground(composerStartRestartGroup, 0);
            final Styles styles = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
            final int i8 = i5;
            final int i9 = i6;
            final float f3 = f2;
            final FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig5 = orderConfig3;
            final FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig6 = orderConfig4;
            CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$SelectedLadderRow$1$selectedLadderRowStyle$1
                private final /* synthetic */ Styles $$delegate_0;

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public AppBarStyle getAppBar(Composer composer2, int i10) {
                    composer2.startReplaceGroup(371500161);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(371500161, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-appBar> (LadderRow.kt:0)");
                    }
                    AppBarStyle appBar = this.$$delegate_0.getAppBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return appBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonBarStyle getButtonBar(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-156010944);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-156010944, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-buttonBar> (LadderRow.kt:0)");
                    }
                    ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return buttonBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CardStackStyle getCardStackStyle(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1493885927);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1493885927, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-cardStackStyle> (LadderRow.kt:0)");
                    }
                    CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return cardStackStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ChartStyle getChart(Composer composer2, int i10) {
                    composer2.startReplaceGroup(3146109);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(3146109, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-chart> (LadderRow.kt:0)");
                    }
                    ChartStyle chart = this.$$delegate_0.getChart(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return chart;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CheckboxStyle getCheckBox(Composer composer2, int i10) {
                    composer2.startReplaceGroup(1124749552);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1124749552, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-checkBox> (LadderRow.kt:0)");
                    }
                    CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return checkBox;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1952151806);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1952151806, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-circularProgressIndicator> (LadderRow.kt:0)");
                    }
                    CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return circularProgressIndicator;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CommunicationCardStyle getCommunicationCard(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-282701147);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-282701147, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-communicationCard> (LadderRow.kt:0)");
                    }
                    CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return communicationCard;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer2, int i10) {
                    composer2.startReplaceGroup(1003562263);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1003562263, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-expandableButtonTray> (LadderRow.kt:0)");
                    }
                    ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return expandableButtonTray;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public IconButtonStyle getIconButton(Composer composer2, int i10) {
                    composer2.startReplaceGroup(1288880744);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1288880744, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-iconButton> (LadderRow.kt:0)");
                    }
                    IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return iconButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public InfoBannerStyle getInfoBanner(Composer composer2, int i10) {
                    composer2.startReplaceGroup(483879225);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(483879225, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-infoBanner> (LadderRow.kt:0)");
                    }
                    InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return infoBanner;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer2, int i10) {
                    composer2.startReplaceGroup(1444368230);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1444368230, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (LadderRow.kt:0)");
                    }
                    LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return loadingPlaceholderStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer2, int i10) {
                    composer2.startReplaceGroup(2027108832);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2027108832, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-markdownSpannedText> (LadderRow.kt:0)");
                    }
                    MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return markdownSpannedText;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NavigationBarStyle getNavigationBarStyle(Composer composer2, int i10) {
                    composer2.startReplaceGroup(1932084672);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1932084672, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-navigationBarStyle> (LadderRow.kt:0)");
                    }
                    NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return navigationBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NumpadStyle getNumpad(Composer composer2, int i10) {
                    composer2.startReplaceGroup(602194214);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(602194214, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-numpad> (LadderRow.kt:0)");
                    }
                    NumpadStyle numpad = this.$$delegate_0.getNumpad(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return numpad;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PlaceholderStyle getPlaceholder(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1448958926);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1448958926, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-placeholder> (LadderRow.kt:0)");
                    }
                    PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return placeholder;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PogStyle getPog(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1603647193);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603647193, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-pog> (LadderRow.kt:0)");
                    }
                    PogStyle pog = this.$$delegate_0.getPog(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return pog;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ProgressBarStyle getProgressBarStyle(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1209816921);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1209816921, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-progressBarStyle> (LadderRow.kt:0)");
                    }
                    ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return progressBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RadioButtonStyle getRadioButton(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-459431924);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-459431924, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-radioButton> (LadderRow.kt:0)");
                    }
                    RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return radioButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RowStyle getRow(Composer composer2, int i10) {
                    composer2.startReplaceGroup(1114405881);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1114405881, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-row> (LadderRow.kt:0)");
                    }
                    RowStyle row = this.$$delegate_0.getRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return row;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public BentoSelectionRowStyle getSelectionRowStyle(Composer composer2, int i10) {
                    composer2.startReplaceGroup(1268177491);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1268177491, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-selectionRowStyle> (LadderRow.kt:0)");
                    }
                    BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return selectionRowStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public SpanButtonStyle getSpanButton(Composer composer2, int i10) {
                    composer2.startReplaceGroup(2061606167);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2061606167, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-spanButton> (LadderRow.kt:0)");
                    }
                    SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spanButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextStyle getText(Composer composer2, int i10) {
                    composer2.startReplaceGroup(2021945606);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2021945606, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-text> (LadderRow.kt:0)");
                    }
                    TextStyle text = this.$$delegate_0.getText(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return text;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextButtonStyle getTextButton(Composer composer2, int i10) {
                    composer2.startReplaceGroup(33060788);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(33060788, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-textButton> (LadderRow.kt:0)");
                    }
                    TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextInputStyle getTextInput(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1796368420);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1796368420, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-textInput> (LadderRow.kt:0)");
                    }
                    TextInputStyle textInput = this.$$delegate_0.getTextInput(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textInput;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ToggleRowStyle getToggleRow(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1168991099);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1168991099, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-toggleRow> (LadderRow.kt:0)");
                    }
                    ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return toggleRow;
                }

                {
                    this.$$delegate_0 = this.$currentLocalStyles;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonStyle getButton(Composer composer2, int i10) {
                    composer2.startReplaceGroup(-1225062527);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1225062527, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<no name provided>.<get-button> (LadderRow.kt:284)");
                    }
                    ButtonStyle button = this.$currentLocalStyles.getButton(composer2, 0);
                    ButtonStyle buttonStyleCopy$default = ButtonStyle.copy$default(button, ButtonStyle.Style.m21714copyd8LSEHM$default(button.getPrimary(), null, PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), 0.0f, null, 13, null), null, 2, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return buttonStyleCopy$default;
                }
            }), ComposableLambda3.rememberComposableLambda(-528475485, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$SelectedLadderRow$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    if ((i10 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-528475485, i10, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRow.<anonymous>.<anonymous> (LadderRow.kt:295)");
                    }
                    LadderRowKt.SelectedLadderRowContent(priceText, pnLText, i8, i9, f3, orderConfig5, orderConfig6, onPriceClicked, onBuyClicked, onSellClicked, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.SelectedLadderRow$lambda$15(priceText, pnLText, i, i2, f, orderConfig, orderConfig2, onPriceClicked, onBuyClicked, onSellClicked, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SelectedLadderRowBackground(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(524102835);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(524102835, i, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRowBackground (LadderRow.kt:312)");
            }
            LadderSelectedRowStyle selectedRow = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getSelectedRow();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            Brush.Companion companion = Brush.INSTANCE;
            BoxKt.Box(Background3.background$default(Blur.m6449blurF8QBwvs$default(BorderKt.m4878borderziNgDLE(modifierFillMaxSize$default, fM7995constructorimpl, Brush.Companion.m6678linearGradientmHitzGk$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(selectedRow.m14841getBuyBackgroundColor0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(selectedRow.m14842getSellBackgroundColor0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), RoundedCornerShape2.RoundedCornerShape(50)), C2002Dp.m7995constructorimpl(30), null, 2, null), Brush.Companion.m6678linearGradientmHitzGk$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(selectedRow.m14841getBuyBackgroundColor0d7_KjU()), Color.m6701boximpl(selectedRow.m14842getSellBackgroundColor0d7_KjU())}), 0L, 0L, 0, 14, (Object) null), null, 0.12f, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.SelectedLadderRowBackground$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void SelectedLadderRowContent(final String str, final String str2, final int i, final int i2, final float f, final FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig, final FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i3) {
        int i4;
        int i5;
        int i6;
        LadderStyle ladderStyle;
        Row6 row6;
        Object obj;
        ?? r5;
        int i7;
        int i8;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1951588626);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i;
            i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
        } else {
            i5 = i;
        }
        if ((i3 & 3072) == 0) {
            i6 = i2;
            i4 |= composerStartRestartGroup.changed(i6) ? 2048 : 1024;
        } else {
            i6 = i2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(orderConfig) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(orderConfig2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function03) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1951588626, i4, -1, "com.robinhood.android.futures.trade.ui.ladder.SelectedLadderRowContent (LadderRow.kt:354)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row62 = Row6.INSTANCE;
            LadderStyle ladderStyle2 = (LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle());
            composerStartRestartGroup.startReplaceGroup(2037088518);
            if (orderConfig == null) {
                composer2 = composerStartRestartGroup;
                ladderStyle = ladderStyle2;
                row6 = row62;
                i8 = 8388608;
                i7 = 1;
                obj = null;
                r5 = 0;
            } else {
                String strStringResource = StringResources_androidKt.stringResource(orderConfig.getLabel(), composerStartRestartGroup, 0);
                long jM14841getBuyBackgroundColor0d7_KjU = ladderStyle2.getSelectedRow().m14841getBuyBackgroundColor0d7_KjU();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU();
                ladderStyle = ladderStyle2;
                row6 = row62;
                obj = null;
                r5 = 0;
                i7 = 1;
                i8 = 8388608;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, ModifiersKt.autoLogEvents$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(0)), 0.3f, false, 2, null), 0.0f, 1, null), companion2.getCenterVertically(), false, 2, null), LadderLoggingUtils.ladderSelectedRowButtonDescriptor$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), FuturesOrderButtonContext.Side.BUY, Analytics4.toLoggingType(orderConfig), false, 4, null), true, false, false, true, false, null, 108, null), null, null, false, false, Color.m6701boximpl(jM14841getBuyBackgroundColor0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, LadderStyleKt.getTextMBold(bentoTheme.getTypography(composerStartRestartGroup, i9)), false, null, composerStartRestartGroup, (i4 >> 24) & 14, 0, 6776);
                composer2 = composerStartRestartGroup;
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
            float f2 = (float) r5;
            Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, i7, obj), C2002Dp.m7995constructorimpl(f2)), 0.4f, false, 2, null);
            composer2.startReplaceGroup(5004770);
            int i10 = (29360128 & i4) == i8 ? i7 : r5;
            Object objRememberedValue = composer2.rememberedValue();
            if (i10 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderRowKt.SelectedLadderRowContent$lambda$21$lambda$19$lambda$18(function0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            LadderRowPriceTextKt.m14833LadderRowPriceTextYod850M(str, str2, i5, i6, f, jM6725getTransparent0d7_KjU, false, true, true, SizeKt.wrapContentHeight$default(ClickableKt.m4893clickableXHw0xAI$default(modifierWeight$default, false, null, null, (Function0) objRememberedValue, 7, null), companion2.getCenterVertically(), r5, 2, obj), composer2, (i4 & 14) | 115015680 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4), 0);
            composer2.startReplaceGroup(2037145676);
            if (orderConfig2 != null) {
                String strStringResource2 = StringResources_androidKt.stringResource(orderConfig2.getLabel(), composer2, r5);
                long jM14842getSellBackgroundColor0d7_KjU = ladderStyle.getSelectedRow().m14842getSellBackgroundColor0d7_KjU();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i11 = BentoTheme.$stable;
                BentoButtonKt.m20586BentoButtonEikTQX8(function03, strStringResource2, ModifiersKt.autoLogEvents$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme2.getSpacing(composer2, i11).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(f2)), 0.3f, false, 2, null), 0.0f, i7, obj), companion2.getCenterVertically(), r5, 2, obj), LadderLoggingUtils.ladderSelectedRowButtonDescriptor$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), FuturesOrderButtonContext.Side.SELL, Analytics4.toLoggingType(orderConfig2), false, 4, null), true, false, false, true, false, null, 108, null), null, null, false, false, Color.m6701boximpl(jM14842getSellBackgroundColor0d7_KjU), Color.m6701boximpl(bentoTheme2.getColors(composer2, i11).m21371getBg0d7_KjU()), null, LadderStyleKt.getTextMBold(bentoTheme2.getTypography(composer2, i11)), false, null, composer2, (i4 >> 27) & 14, 0, 6776);
                Unit unit2 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LadderRowKt.SelectedLadderRowContent$lambda$22(str, str2, i, i2, f, orderConfig, orderConfig2, function0, function02, function03, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRowContent$lambda$21$lambda$19$lambda$18(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void DefaultLadderRow(final FuturesLadderViewState.LadderData ladderData, final int i, final boolean z, final Function0<Unit> function0, final Function0<Integer> function02, Composer composer, final int i2) {
        int i3;
        boolean z2;
        Integer orderDraggedOverIndex;
        Composer composerStartRestartGroup = composer.startRestartGroup(-353502504);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(ladderData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i4 = i3;
        if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-353502504, i4, -1, "com.robinhood.android.futures.trade.ui.ladder.DefaultLadderRow (LadderRow.kt:436)");
            }
            composerStartRestartGroup.startReplaceGroup(-413480982);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
            Integer orderDraggedOverIndex2 = ladderData.getOrderDraggedOverIndex();
            if (orderDraggedOverIndex2 != null && orderDraggedOverIndex2.intValue() == i) {
                jM21371getBg0d7_KjU = Colors8.m26601blendWithjxsXWHM(jM21371getBg0d7_KjU, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), 0.8f);
            }
            long j = jM21371getBg0d7_KjU;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            FuturesLadderViewState.LadderData.SelectedRow selectedRow = ladderData.getSelectedRow();
            if (selectedRow != null && selectedRow.getIndex() == i) {
                modifierFillMaxSize$default = Blur.m6449blurF8QBwvs$default(modifierFillMaxSize$default, C2002Dp.m7995constructorimpl(4), null, 2, null);
            }
            Modifier modifierM4872backgroundbw27NRU$default = modifierFillMaxSize$default;
            Integer orderDraggedOverIndex3 = ladderData.getOrderDraggedOverIndex();
            if (orderDraggedOverIndex3 != null && orderDraggedOverIndex3.intValue() == i) {
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4872backgroundbw27NRU$default, j, null, 2, null);
            }
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (i4 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderRowKt.DefaultLadderRow$lambda$28$lambda$27(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5143paddingVpY3zN4, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            boolean z4 = ladderData.getLastPriceIndex() == i || ((orderDraggedOverIndex = ladderData.getOrderDraggedOverIndex()) != null && orderDraggedOverIndex.intValue() == i);
            SnapshotState4<Float> snapshotState4RememberTargetRotationState = rememberTargetRotationState(ladderData.getLadderDisplayMode(), composerStartRestartGroup, 0);
            float f = 0;
            int i6 = (i4 >> 3) & 112;
            m14824QuantityBarRoweuL9pac(j, z2, ladderData.getVisibleBidQuantityBars().get(Integer.valueOf(i)), Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), composerStartRestartGroup, i6, 0);
            LadderRowPriceTextKt.m14833LadderRowPriceTextYod850M(ladderData.getRowDisplay(FuturesLadderDataState2.PRICE, i), ladderData.getRowDisplay(FuturesLadderDataState2.PNL, i), i, function02.invoke().intValue(), DefaultLadderRow$lambda$30$lambda$29(snapshotState4RememberTargetRotationState), j, ladderData.getLastPriceIndex() == i, !ladderData.isRowSelected(i), z4, null, composerStartRestartGroup, (i4 << 3) & 896, 512);
            composerStartRestartGroup = composerStartRestartGroup;
            m14824QuantityBarRoweuL9pac(j, z, ladderData.getVisibleAskQuantityBars().get(Integer.valueOf(i)), Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), composerStartRestartGroup, i6, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.DefaultLadderRow$lambda$31(ladderData, i, z, function0, function02, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultLadderRow$lambda$28$lambda$27(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState4<Float> rememberTargetRotationState(FuturesLadderDataState2 futuresLadderDataState2, Composer composer, int i) {
        float f;
        composer.startReplaceGroup(-665562981);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-665562981, i, -1, "com.robinhood.android.futures.trade.ui.ladder.rememberTargetRotationState (LadderRow.kt:495)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[futuresLadderDataState2.ordinal()];
        if (i2 == 1) {
            f = 0.0f;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 180.0f;
        }
        SnapshotState4<Float> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Float.valueOf(f), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4RememberUpdatedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: QuantityBarRow-euL9pac, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14824QuantityBarRoweuL9pac(final long j, final boolean z, final FuturesLadderViewState.LadderData.QuantityBar quantityBar, Modifier modifier, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        boolean z2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-800879090);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(quantityBar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-800879090, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.QuantityBarRow (LadderRow.kt:508)");
                }
                if (quantityBar == null) {
                    composerStartRestartGroup.startReplaceGroup(-445382554);
                    m14825QuantityBarRowoC9nPe0(quantityBar.getUiScaledQuantityFraction(), j2, z2, quantityBar.getAlpha(), quantityBar.getSide(), String.valueOf(quantityBar.getQuantity()), modifier4, composerStartRestartGroup, ((i3 << 3) & 1008) | ((i3 << 9) & 3670016), 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-444992791);
                    Spacer2.Spacer(modifier4, composerStartRestartGroup, (i3 >> 9) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderRowKt.QuantityBarRow_euL9pac$lambda$32(j, z, quantityBar, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (quantityBar == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0135  */
    /* renamed from: QuantityBarRow-oC9nPe0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14825QuantityBarRowoC9nPe0(final float f, long j, final boolean z, final float f2, final FuturesOrderSide futuresOrderSide, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        float f3;
        int i3;
        boolean z2;
        String str2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        long j2 = j;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1642819058);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(futuresOrderSide.ordinal()) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else {
                if ((i & 196608) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                if (i4 == 0) {
                    if ((1572864 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                    } else {
                        Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1642819058, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.QuantityBarRow (LadderRow.kt:533)");
                        }
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(futuresOrderSide != FuturesOrderSide.BUY ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        int i6 = i3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        QuantityBarStyle.Sided sided = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getQuantityBar().sided(futuresOrderSide);
                        i5 = WhenMappings.$EnumSwitchMapping$1[futuresOrderSide.ordinal()];
                        if (i5 != 1) {
                            modifier3 = modifier5;
                            composerStartRestartGroup.startReplaceGroup(95926271);
                            j2 = j;
                            m14826QuantityTexteopBjH0(str, sided.m14900getTextColor0d7_KjU(), j2, null, composerStartRestartGroup, ((i6 >> 15) & 14) | ((i6 << 3) & 896), 8);
                            m14823QuantityBarqi6gXK8(f, sided.m14890actualBarBackgroundColor5vOe2sY(j2, f2), sided.m14891actualBorderColor5vOe2sY(j2, f2), sided.getBarShape(), z, row6.weight(Modifier.INSTANCE, 1.0f, false), composerStartRestartGroup, (i6 & 14) | ((i6 << 6) & 57344), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (i5 != 2) {
                                composerStartRestartGroup.startReplaceGroup(-828190434);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(96623647);
                            m14823QuantityBarqi6gXK8(f3, sided.m14890actualBarBackgroundColor5vOe2sY(j2, f2), sided.m14891actualBorderColor5vOe2sY(j2, f2), sided.getBarShape(), z2, row6.weight(Modifier.INSTANCE, 1.0f, false), composerStartRestartGroup, (i6 & 14) | ((i6 << 6) & 57344), 0);
                            modifier3 = modifier5;
                            m14826QuantityTexteopBjH0(str2, sided.m14900getTextColor0d7_KjU(), j2, null, composerStartRestartGroup, ((i6 >> 15) & 14) | ((i6 << 3) & 896), 8);
                            composerStartRestartGroup.endReplaceGroup();
                            j2 = j;
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final long j3 = j2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LadderRowKt.QuantityBarRow_oC9nPe0$lambda$34(f, j3, z, f2, futuresOrderSide, str, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                modifier2 = modifier;
                if ((599187 & i3) != 599186) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(futuresOrderSide != FuturesOrderSide.BUY ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    int i62 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        QuantityBarStyle.Sided sided2 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getQuantityBar().sided(futuresOrderSide);
                        i5 = WhenMappings.$EnumSwitchMapping$1[futuresOrderSide.ordinal()];
                        if (i5 != 1) {
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i4 = i2 & 64;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        str2 = str;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0177  */
    /* renamed from: QuantityBar-qi6gXK8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14823QuantityBarqi6gXK8(final float f, final long j, final long j2, final RoundedCornerShape roundedCornerShape, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Animatable animatable;
        boolean z2;
        Object objRememberedValue2;
        Modifier modifierM4876borderxT4_qwU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1581518362);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(roundedCornerShape) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1581518362, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.QuantityBar (LadderRow.kt:583)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf = Float.valueOf(f);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(animatable);
                int i5 = i3 & 14;
                z2 = zChangedInstance | (i5 != 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LadderRowKt$QuantityBar$1$1(z, animatable, f, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i5);
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.fillMaxWidth(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 1, null), ((Number) animatable.getValue()).floatValue()), j, roundedCornerShape);
                if (j2 == 16) {
                    modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1), j2, roundedCornerShape);
                } else {
                    modifierM4876borderxT4_qwU = Modifier.INSTANCE;
                }
                BoxKt.Box(modifierM4871backgroundbw27NRU.then(modifierM4876borderxT4_qwU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderRowKt.QuantityBar_qi6gXK8$lambda$37(f, j, j2, roundedCornerShape, z, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i3 & 74899) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(f);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(animatable);
            int i52 = i3 & 14;
            z2 = zChangedInstance2 | (i52 != 4);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue2 = new LadderRowKt$QuantityBar$1$1(z, animatable, f, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i52);
                Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(SizeKt.fillMaxWidth(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 1, null), ((Number) animatable.getValue()).floatValue()), j, roundedCornerShape);
                if (j2 == 16) {
                }
                BoxKt.Box(modifierM4871backgroundbw27NRU2.then(modifierM4876borderxT4_qwU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: QuantityText-eopBjH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14826QuantityTexteopBjH0(final String str, long j, final long j2, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        long j3;
        long j4;
        int i4;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2026131324);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                j3 = j;
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(j4) ? 256 : 128;
                }
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2026131324, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.QuantityText (LadderRow.kt:633)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifier3, j4, null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(j3), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 0, 7672);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j5 = j3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderRowKt.QuantityText_eopBjH0$lambda$38(str, j5, j2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifier3, j4, null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(j3), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 0, 7672);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j3 = j;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PreviewQuantityBarRow(final PreviewQuantityBarParameterProvider.Parameters parameters, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1682084936);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(parameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1682084936, i2, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewQuantityBarRow (LadderRow.kt:681)");
            }
            PreviewLadderBentoTheme.PreviewLadderBentoTheme(parameters.isDay(), ComposableLambda3.rememberComposableLambda(-1895744199, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt.PreviewQuantityBarRow.1
                public final void invoke(Composer composer2, int i3) {
                    Composer composer3 = composer2;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1895744199, i3, -1, "com.robinhood.android.futures.trade.ui.ladder.PreviewQuantityBarRow.<anonymous> (LadderRow.kt:683)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer3, i4).m21595getXsmallD9Ej5fM());
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, bentoTheme.getColors(composer3, i4).m21371getBg0d7_KjU(), null, 2, null);
                    PreviewQuantityBarParameterProvider.Parameters parameters2 = parameters;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw("isDay: " + parameters2.isDay() + ", side: " + parameters2.getSide(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    composer3.startReplaceGroup(-1395707623);
                    Iterator it = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.1f), Float.valueOf(0.4f), Float.valueOf(0.8f), Float.valueOf(1.0f)}).iterator();
                    while (it.hasNext()) {
                        float fFloatValue = ((Number) it.next()).floatValue();
                        LadderRowKt.m14825QuantityBarRowoC9nPe0(fFloatValue, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), false, fFloatValue, parameters2.getSide(), String.valueOf((int) (100.0f * fFloatValue)), SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(42)), C2002Dp.m7995constructorimpl(300)), composer3, 1573248, 0);
                        composer3 = composer2;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderRowKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.PreviewQuantityBarRow$lambda$39(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
