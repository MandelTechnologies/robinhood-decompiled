package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

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
import androidx.compose.p011ui.graphics.Shape;
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
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
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
import com.robinhood.shared.tradeladder.extensions.Format3;
import com.robinhood.shared.tradeladder.p398ui.ladder.animations.LadderAnimations2;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderDisplayMode;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill.AnimatedPendingOrderPillStackKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows.PreviewQuantityBarParameterProvider;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderSelectedRowStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.QuantityBarStyle;
import com.robinhood.utils.compose.extensions.Colors8;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderRow.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a÷\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u00182\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00060\u00182\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u001d2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u001d2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u001dH\u0001¢\u0006\u0002\u0010!\u001a\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010%\u001a\u0085\u0001\u0010&\u001a\u00020\u0006*\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u001d2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0003¢\u0006\u0002\u00102\u001ak\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u0002052\u0006\u0010\t\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0001¢\u0006\u0002\u0010=\u001ak\u0010>\u001a\u00020\u00062\u0006\u00104\u001a\u0002052\u0006\u0010\t\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0003¢\u0006\u0002\u0010=\u001a\u0087\u0001\u0010?\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u00104\u001a\u0002052\b\u0010@\u001a\u0004\u0018\u00010\u00102\b\u0010A\u001a\u0004\u0018\u00010\u00102\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\f2\u0006\u0010F\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\b\b\u0002\u0010G\u001a\u00020\fH\u0001¢\u0006\u0002\u0010H\u001a\u001b\u0010I\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KH\u0003¢\u0006\u0002\u0010M\u001a\u001b\u0010N\u001a\b\u0012\u0004\u0012\u0002080O2\u0006\u0010B\u001a\u00020CH\u0003¢\u0006\u0002\u0010P\u001a;\u0010Q\u001a\u00020\u00062\u0006\u0010R\u001a\u00020L2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010S\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0004\bT\u0010U\u001aU\u0010Q\u001a\u00020\u00062\u0006\u0010V\u001a\u0002082\u0006\u0010R\u001a\u00020L2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010W\u001a\u0002082\u0006\u0010*\u001a\u00020+2\b\u0010X\u001a\u0004\u0018\u0001052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010G\u001a\u00020\fH\u0001¢\u0006\u0004\bY\u0010Z\u001aK\u0010[\u001a\u00020\u00062\u0006\u0010V\u001a\u0002082\u0006\u0010\\\u001a\u00020L2\u0006\u0010]\u001a\u00020L2\u0006\u0010^\u001a\u00020_2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010G\u001a\u00020\fH\u0003¢\u0006\u0004\b`\u0010a\u001a1\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u0002052\u0006\u0010d\u001a\u00020L2\u0006\u0010R\u001a\u00020L2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0004\be\u0010f\u001a\u0017\u0010g\u001a\u00020\u00062\b\b\u0001\u0010h\u001a\u00020iH\u0003¢\u0006\u0002\u0010j\u001a\r\u0010k\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010l\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003¨\u0006m²\u0006\n\u0010D\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010E\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010F\u001a\u00020\fX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\f\u0010A\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u0084\u0002²\u0006\f\u0010n\u001a\u0004\u0018\u00010oX\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\fX\u008a\u0084\u0002²\u0006\f\u0010p\u001a\u0004\u0018\u00010qX\u008a\u008e\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002²\u0006\n\u0010r\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u0084\u0002"}, m3636d2 = {"ladderRowHeight", "Landroidx/compose/ui/unit/Dp;", "getLadderRowHeight", "()F", "F", "LadderRow", "", "ladderData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData;", "rowIndex", "", "animateQuantityBarsEntry", "", "shortenQuantityBarValues", "visibleAskQuantityBars", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$QuantityBar;", "visibleBidQuantityBars", "getIndexOfMiddleVisibleItem", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onRowClicked", "onStartOrderClicked", "Lkotlin/Function2;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "onEndOrderClicked", "onPendingOrderSelected", "Lkotlin/Function1;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "onPendingOrderClicked", "onPendingOrderDownInitiated", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData;IZZLkotlinx/collections/immutable/ImmutableMap;Lkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "AverageCostLine", "averageCostLineData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$AverageCostLineData;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$AverageCostLineData;Landroidx/compose/runtime/Composer;I)V", "PendingOrderRow", "Landroidx/compose/foundation/layout/BoxScope;", "orderGroup", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;", "side", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;", "isSelected", "currentDragDirection", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "selectedPendingOrdersIndex", "alignment", "Landroidx/compose/ui/Alignment;", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow$Group;Lcom/robinhood/shared/tradeladder/ui/ladder/models/Side;ZLcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;II)V", "SelectedLadderRow", "priceText", "", "middleIndex", "targetRotation", "", "startOrderConfig", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedRow$OrderConfig;", "endOrderConfig", "onPriceClicked", "(Ljava/lang/String;IIFLcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedRow$OrderConfig;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedRow$OrderConfig;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SelectedLadderRowContent", "DefaultLadderRow", "quantityBidBarData", "quantityAskBarData", "ladderDisplayMode", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;", "dragOverItem", "isRowSelected", "isLastPriceRow", "showPlaceholder", "(ILjava/lang/String;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$QuantityBar;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$QuantityBar;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;ZZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;III)V", "SelectedLadderRowBackground", "gradientColors", "Lkotlinx/collections/immutable/PersistentList;", "Landroidx/compose/ui/graphics/Color;", "(Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/Composer;I)V", "rememberTargetRotationState", "Landroidx/compose/runtime/State;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "QuantityBarRow", "backgroundColor", "quantityBarData", "QuantityBarRow-yWKOrZg", "(JZZLcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$QuantityBar;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "widthFraction", "alpha", "quantityText", "QuantityBarRow-Y2L_72g", "(FJZFLcom/robinhood/shared/tradeladder/ui/ladder/models/Side;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "QuantityBar", "barBackgroundColor", "borderColor", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "QuantityBar-K2djEUw", "(FJJLandroidx/compose/foundation/shape/RoundedCornerShape;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "QuantityText", "text", ResourceTypes.COLOR, "QuantityText-eopBjH0", "(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewQuantityBarRow", "parameters", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/rows/PreviewQuantityBarParameterProvider$Parameters;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/rows/PreviewQuantityBarParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "PreviewQuantityBarRowFormatted", "(Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug", "pendingOrdersOfRow", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow;", "previousSelectedRowData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedRow;", "selectedPriceText"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class LadderRowKt {
    private static final float ladderRowHeight = C2002Dp.m7995constructorimpl(44);

    /* compiled from: LadderRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LadderDisplayMode.values().length];
            try {
                iArr[LadderDisplayMode.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LadderDisplayMode.PNL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Side.values().length];
            try {
                iArr2[Side.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Side.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AverageCostLine$lambda$53(LadderState.LadderData.AverageCostLineData averageCostLineData, int i, Composer composer, int i2) {
        AverageCostLine(averageCostLineData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultLadderRow$lambda$77(int i, String str, LadderState.LadderData.QuantityBar quantityBar, LadderState.LadderData.QuantityBar quantityBar2, LadderDisplayMode ladderDisplayMode, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function02, boolean z6, int i2, int i3, int i4, Composer composer, int i5) {
        DefaultLadderRow(i, str, quantityBar, quantityBar2, ladderDisplayMode, z, z2, z3, z4, z5, function0, function02, z6, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$47(LadderState.LadderData ladderData, int i, boolean z, boolean z2, ImmutableMap immutableMap, ImmutableMap immutableMap2, Function0 function0, Modifier modifier, Function0 function02, Function2 function2, Function2 function22, Function1 function1, Function1 function12, Function1 function13, int i2, int i3, int i4, Composer composer, int i5) {
        LadderRow(ladderData, i, z, z2, immutableMap, immutableMap2, function0, modifier, function02, function2, function22, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingOrderRow$lambda$58(BoxScope boxScope, LadderState.LadderData.PendingOrderRow.Group group, Side side, boolean z, LadderCustomGestureDetector3 ladderCustomGestureDetector3, Integer num, Function1 function1, Function1 function12, Function1 function13, Alignment alignment, int i, int i2, Composer composer, int i3) {
        PendingOrderRow(boxScope, group, side, z, ladderCustomGestureDetector3, num, function1, function12, function13, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuantityBarRow$lambda$87(PreviewQuantityBarParameterProvider.Parameters parameters, int i, Composer composer, int i2) {
        PreviewQuantityBarRow(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuantityBarRowFormatted$lambda$88(int i, Composer composer, int i2) {
        PreviewQuantityBarRowFormatted(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityBarRow_Y2L_72g$lambda$82(float f, long j, boolean z, float f2, Side side, String str, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        m26201QuantityBarRowY2L_72g(f, j, z, f2, side, str, modifier, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityBarRow_yWKOrZg$lambda$80(long j, boolean z, boolean z2, LadderState.LadderData.QuantityBar quantityBar, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m26202QuantityBarRowyWKOrZg(j, z, z2, quantityBar, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityBar_K2djEUw$lambda$85(float f, long j, long j2, RoundedCornerShape roundedCornerShape, boolean z, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        m26200QuantityBarK2djEUw(f, j, j2, roundedCornerShape, z, modifier, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityText_eopBjH0$lambda$86(String str, long j, long j2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m26203QuantityTexteopBjH0(str, j, j2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRow$lambda$60(String str, int i, int i2, float f, LadderState.LadderData.SelectedRow.OrderConfig orderConfig, LadderState.LadderData.SelectedRow.OrderConfig orderConfig2, Function0 function0, Function0 function02, Function0 function03, int i3, Composer composer, int i4) {
        SelectedLadderRow(str, i, i2, f, orderConfig, orderConfig2, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRowBackground$lambda$79(ImmutableList3 immutableList3, int i, Composer composer, int i2) {
        SelectedLadderRowBackground(immutableList3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRowContent$lambda$68(String str, int i, int i2, float f, LadderState.LadderData.SelectedRow.OrderConfig orderConfig, LadderState.LadderData.SelectedRow.OrderConfig orderConfig2, Function0 function0, Function0 function02, Function0 function03, int i3, Composer composer, int i4) {
        SelectedLadderRowContent(str, i, i2, f, orderConfig, orderConfig2, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AverageCostLine$lambda$52$lambda$49$lambda$48(long j, PathEffect pathEffect, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), 0.0f, 0, pathEffect, 0.0f, null, 0, 472, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AverageCostLine$lambda$52$lambda$51$lambda$50(long j, PathEffect pathEffect, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6951drawLineNGM6Ib0$default(Canvas, j, Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), 0.0f, 0, pathEffect, 0.0f, null, 0, 472, null);
        return Unit.INSTANCE;
    }

    private static final float DefaultLadderRow$lambda$76$lambda$75(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final boolean LadderRow$lambda$14(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean LadderRow$lambda$17(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean LadderRow$lambda$20(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final LadderState.LadderData.QuantityBar LadderRow$lambda$23(SnapshotState4<LadderState.LadderData.QuantityBar> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LadderState.LadderData.QuantityBar LadderRow$lambda$26(SnapshotState4<LadderState.LadderData.QuantityBar> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final String LadderRow$lambda$30(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LadderState.LadderData.PendingOrderRow LadderRow$lambda$46$lambda$33(SnapshotState4<LadderState.LadderData.PendingOrderRow> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean LadderRow$lambda$46$lambda$38$lambda$37(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean LadderRow$lambda$46$lambda$42$lambda$41(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderState.LadderData.SelectedRow LadderRow$lambda$46$lambda$44(SnapshotState<LadderState.LadderData.SelectedRow> snapshotState) {
        return snapshotState.getValue();
    }

    public static final float getLadderRowHeight() {
        return ladderRowHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$3$lambda$2(OrderType orderType, OrderTrigger orderTrigger) {
        Intrinsics.checkNotNullParameter(orderType, "<unused var>");
        Intrinsics.checkNotNullParameter(orderTrigger, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$5$lambda$4(OrderType orderType, OrderTrigger orderTrigger) {
        Intrinsics.checkNotNullParameter(orderType, "<unused var>");
        Intrinsics.checkNotNullParameter(orderTrigger, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$7$lambda$6(LadderState.LadderData.SelectedPendingOrders it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$9$lambda$8(LadderState.LadderData.SelectedPendingOrders it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderRow$lambda$11$lambda$10(LadderState.LadderData.SelectedPendingOrders it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderRow(final LadderState.LadderData ladderData, final int i, final boolean z, final boolean z2, final ImmutableMap<Integer, LadderState.LadderData.QuantityBar> visibleAskQuantityBars, final ImmutableMap<Integer, LadderState.LadderData.QuantityBar> visibleBidQuantityBars, final Function0<Integer> getIndexOfMiddleVisibleItem, Modifier modifier, Function0<Unit> function0, Function2<? super OrderType, ? super OrderTrigger, Unit> function2, Function2<? super OrderType, ? super OrderTrigger, Unit> function22, Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function1, Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function12, Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function13, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        Modifier modifier2;
        int i7;
        Function0<Unit> function02;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Function2<? super OrderType, ? super OrderTrigger, Unit> function23;
        Function2<? super OrderType, ? super OrderTrigger, Unit> function24;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function14;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function15;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function16;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChanged3;
        Object objRememberedValue3;
        boolean zChanged4;
        Object objRememberedValue4;
        boolean zChanged5;
        Object objRememberedValue5;
        boolean zChanged6;
        Object objRememberedValue6;
        boolean zChanged7;
        SnapshotState4 snapshotState4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged8;
        Object objRememberedValue7;
        boolean zChanged9;
        Object objRememberedValue8;
        LadderState.LadderData.PendingOrderRow.Group startOrders;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function17;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function18;
        BoxScopeInstance boxScopeInstance;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function19;
        LadderState.LadderData.PendingOrderRow.Group endOrders;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function110;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function111;
        Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function112;
        Object objRememberedValue9;
        SnapshotState snapshotState;
        final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function113;
        final Function2<? super OrderType, ? super OrderTrigger, Unit> function25;
        final Function2<? super OrderType, ? super OrderTrigger, Unit> function26;
        final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function114;
        final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function115;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(ladderData, "ladderData");
        Intrinsics.checkNotNullParameter(visibleAskQuantityBars, "visibleAskQuantityBars");
        Intrinsics.checkNotNullParameter(visibleBidQuantityBars, "visibleBidQuantityBars");
        Intrinsics.checkNotNullParameter(getIndexOfMiddleVisibleItem, "getIndexOfMiddleVisibleItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(613732633);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(ladderData) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                z3 = z;
                i5 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z4 = z2;
                    i5 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(visibleAskQuantityBars) ? 16384 : 8192;
                }
                if ((i4 & 32) != 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(visibleBidQuantityBars) ? 131072 : 65536;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(getIndexOfMiddleVisibleItem) ? 1048576 : 524288;
                }
                i6 = i4 & 128;
                if (i6 != 0) {
                    i5 |= 12582912;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                    }
                }
                i7 = i4 & 256;
                if (i7 != 0) {
                    i5 |= 100663296;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i2 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                    }
                }
                i8 = i4 & 512;
                if (i8 == 0) {
                    if ((i2 & 805306368) == 0) {
                        i9 = i8;
                        i5 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    }
                    i10 = i4 & 1024;
                    if (i10 == 0) {
                        i12 = i3 | 6;
                        i11 = i10;
                    } else if ((i3 & 6) == 0) {
                        i11 = i10;
                        i12 = i3 | (composerStartRestartGroup.changedInstance(function22) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i3;
                    }
                    i13 = i4 & 2048;
                    if (i13 == 0) {
                        i12 |= 48;
                        i14 = i13;
                    } else if ((i3 & 48) == 0) {
                        i14 = i13;
                        i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
                    } else {
                        i14 = i13;
                    }
                    int i20 = i12;
                    i15 = i4 & 4096;
                    if (i15 == 0) {
                        i16 = i20 | 384;
                    } else if ((i3 & 384) == 0) {
                        i16 = i20 | (composerStartRestartGroup.changedInstance(function12) ? 256 : 128);
                    } else {
                        i16 = i20;
                    }
                    i17 = i4 & 8192;
                    if (i17 == 0) {
                        i18 = i7;
                        i19 = i16 | 3072;
                    } else {
                        int i21 = i16;
                        if ((i3 & 3072) == 0) {
                            i21 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
                        }
                        i18 = i7;
                        i19 = i21;
                    }
                    if ((i5 & 306783379) != 306783378 && (i19 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function25 = function2;
                        function26 = function22;
                        function113 = function1;
                        function115 = function13;
                        function03 = function02;
                        modifier3 = modifier2;
                        function114 = function12;
                    } else {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i18 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                            }
                            function02 = (Function0) objRememberedValue10;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (i9 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue11 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return LadderRowKt.LadderRow$lambda$3$lambda$2((OrderType) obj, (OrderTrigger) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function23 = (Function2) objRememberedValue11;
                        } else {
                            function23 = function2;
                        }
                        if (i11 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return LadderRowKt.LadderRow$lambda$5$lambda$4((OrderType) obj, (OrderTrigger) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function24 = (Function2) objRememberedValue12;
                        } else {
                            function24 = function22;
                        }
                        if (i14 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return LadderRowKt.LadderRow$lambda$7$lambda$6((LadderState.LadderData.SelectedPendingOrders) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function14 = (Function1) objRememberedValue13;
                        } else {
                            function14 = function1;
                        }
                        if (i15 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue14 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return LadderRowKt.LadderRow$lambda$9$lambda$8((LadderState.LadderData.SelectedPendingOrders) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function15 = (Function1) objRememberedValue14;
                        } else {
                            function15 = function12;
                        }
                        if (i17 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue15 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda19
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return LadderRowKt.LadderRow$lambda$11$lambda$10((LadderState.LadderData.SelectedPendingOrders) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function16 = (Function1) objRememberedValue15;
                        } else {
                            function16 = function13;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(613732633, i5, i19, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRow (LadderRow.kt:104)");
                        }
                        Integer orderDraggedOverIndex = ladderData.getOrderDraggedOverIndex();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(orderDraggedOverIndex);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(LadderRowKt.LadderRow$lambda$13$lambda$12(ladderData, i));
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        LadderState.LadderData.SelectedRow selectedRow = ladderData.getSelectedRow();
                        int i22 = i19;
                        Integer numValueOf = selectedRow == null ? Integer.valueOf(selectedRow.getIndex()) : null;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(ladderData.isRowSelected(i));
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        int lastPriceIndex = ladderData.getLastPriceIndex();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged3 = composerStartRestartGroup.changed(lastPriceIndex);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda22
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(LadderRowKt.LadderRow$lambda$19$lambda$18(ladderData, i));
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState4 snapshotState44 = (SnapshotState4) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged4 = composerStartRestartGroup.changed(visibleBidQuantityBars);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LadderRowKt.LadderRow$lambda$22$lambda$21(visibleBidQuantityBars, i);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        SnapshotState4 snapshotState45 = (SnapshotState4) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged5 = composerStartRestartGroup.changed(visibleAskQuantityBars);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LadderRowKt.LadderRow$lambda$25$lambda$24(visibleAskQuantityBars, i);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        SnapshotState4 snapshotState46 = (SnapshotState4) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        LadderState.LadderData.AverageCostLineData avgCostLineData = ladderData.getAvgCostLineData();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged6 = composerStartRestartGroup.changed(avgCostLineData);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = ladderData.getAvgCostLineData();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        LadderState.LadderData.AverageCostLineData averageCostLineData = (LadderState.LadderData.AverageCostLineData) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged7 = composerStartRestartGroup.changed(ladderData);
                        Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                        if (zChanged7) {
                            snapshotState4 = snapshotState46;
                            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                            }
                            SnapshotState4 snapshotState47 = (SnapshotState4) objRememberedValue16;
                            composerStartRestartGroup.endReplaceGroup();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment centerStart = companion.getCenterStart();
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ladderRowHeight);
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
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier5 = modifier4;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-389135971);
                            if (averageCostLineData == null && averageCostLineData.getIndex() == i) {
                                AverageCostLine(averageCostLineData, composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i23 = i5 << 18;
                            Function0<Unit> function04 = function02;
                            DefaultLadderRow(i, LadderRow$lambda$30(snapshotState47), LadderRow$lambda$23(snapshotState45), LadderRow$lambda$26(snapshotState4), ladderData.getLadderDisplayMode(), LadderRow$lambda$14(snapshotState42), LadderRow$lambda$17(snapshotState43), LadderRow$lambda$20(snapshotState44), z3, z4, function04, getIndexOfMiddleVisibleItem, false, composerStartRestartGroup, ((i5 >> 3) & 14) | (i23 & 234881024) | (i23 & 1879048192), ((i5 >> 24) & 14) | ((i5 >> 15) & 112), 4096);
                            Map<Integer, LadderState.LadderData.PendingOrderRow> pendingOrders = ladderData.getPendingOrders();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged8 = composerStartRestartGroup.changed(pendingOrders);
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged8 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LadderRowKt.LadderRow$lambda$46$lambda$32$lambda$31(ladderData, i);
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            SnapshotState4 snapshotState48 = (SnapshotState4) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                            Integer selectedPendingOrdersRowIndex = ladderData.getSelectedPendingOrdersRowIndex();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged9 = composerStartRestartGroup.changed(selectedPendingOrdersRowIndex);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged9 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                Integer selectedPendingOrdersRowIndex2 = ladderData.getSelectedPendingOrdersRowIndex();
                                objRememberedValue8 = Boolean.valueOf(selectedPendingOrdersRowIndex2 != null && selectedPendingOrdersRowIndex2.intValue() == i);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            final boolean zBooleanValue = ((Boolean) objRememberedValue8).booleanValue();
                            composerStartRestartGroup.endReplaceGroup();
                            LadderState.LadderData.PendingOrderRow pendingOrderRowLadderRow$lambda$46$lambda$33 = LadderRow$lambda$46$lambda$33(snapshotState48);
                            startOrders = pendingOrderRowLadderRow$lambda$46$lambda$33 == null ? pendingOrderRowLadderRow$lambda$46$lambda$33.getStartOrders() : null;
                            composerStartRestartGroup.startReplaceGroup(-389099063);
                            if (startOrders != null) {
                                boxScopeInstance = boxScopeInstance2;
                                function19 = function14;
                                function18 = function15;
                                function17 = function16;
                            } else {
                                LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = ladderData.getSelectedPendingOrders();
                                Side side = selectedPendingOrders != null ? selectedPendingOrders.getSide() : null;
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChanged10 = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changed(side == null ? -1 : side.ordinal());
                                Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                                if (zChanged10 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue17 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(LadderRowKt.LadderRow$lambda$46$lambda$38$lambda$36$lambda$35(zBooleanValue, ladderData));
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i24 = i22 << 15;
                                int i25 = 390 | (i24 & 3670016) | (i24 & 29360128) | (i24 & 234881024);
                                function17 = function16;
                                Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function116 = function14;
                                function18 = function15;
                                boxScopeInstance = boxScopeInstance2;
                                PendingOrderRow(boxScopeInstance, startOrders, Side.START, LadderRow$lambda$46$lambda$38$lambda$37((SnapshotState4) objRememberedValue17), ladderData.getPendingOrderDragDirection(), ladderData.getSelectedPendingOrdersIndex(), function116, function18, function17, null, composerStartRestartGroup, i25, 256);
                                function19 = function116;
                                composerStartRestartGroup = composerStartRestartGroup;
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            LadderState.LadderData.PendingOrderRow pendingOrderRowLadderRow$lambda$46$lambda$332 = LadderRow$lambda$46$lambda$33(snapshotState48);
                            endOrders = pendingOrderRowLadderRow$lambda$46$lambda$332 == null ? pendingOrderRowLadderRow$lambda$46$lambda$332.getEndOrders() : null;
                            composerStartRestartGroup.startReplaceGroup(-389071790);
                            if (endOrders != null) {
                                function110 = function19;
                                function111 = function18;
                                function112 = function17;
                            } else {
                                LadderState.LadderData.SelectedPendingOrders selectedPendingOrders2 = ladderData.getSelectedPendingOrders();
                                Side side2 = selectedPendingOrders2 != null ? selectedPendingOrders2.getSide() : null;
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChanged11 = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changed(side2 != null ? side2.ordinal() : -1);
                                Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                                if (zChanged11 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue18 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(LadderRowKt.LadderRow$lambda$46$lambda$42$lambda$40$lambda$39(zBooleanValue, ladderData));
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Composer composer2 = composerStartRestartGroup;
                                Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function117 = function19;
                                int i26 = i22 << 15;
                                PendingOrderRow(boxScopeInstance, endOrders, Side.END, LadderRow$lambda$46$lambda$42$lambda$41((SnapshotState4) objRememberedValue18), ladderData.getPendingOrderDragDirection(), ladderData.getSelectedPendingOrdersIndex(), function117, function18, function17, companion.getCenterEnd(), composer2, (29360128 & i26) | (i26 & 3670016) | 805306758 | (i26 & 234881024), 0);
                                function110 = function117;
                                function111 = function18;
                                function112 = function17;
                                composerStartRestartGroup = composer2;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowFadedOut(i), (Modifier) null, LadderAnimations2.getLadderFadeInAnimation(), LadderAnimations2.getLadderFadeOutAnimation(), (String) null, ComposableSingletons$LadderRowKt.INSTANCE.getLambda$2096591991$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 200064, 18);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            }
                            snapshotState = (SnapshotState) objRememberedValue9;
                            composerStartRestartGroup.endReplaceGroup();
                            if (ladderData.getSelectedRow() != null && !Intrinsics.areEqual(ladderData.getSelectedRow(), LadderRow$lambda$46$lambda$44(snapshotState))) {
                                snapshotState.setValue(ladderData.getSelectedRow());
                            }
                            Function2<? super OrderType, ? super OrderTrigger, Unit> function27 = function23;
                            Function2<? super OrderType, ? super OrderTrigger, Unit> function28 = function24;
                            AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowSelected(i), (Modifier) null, LadderAnimations2.getLadderFadeInAnimation().plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.8f, 0L, 4, null)), LadderAnimations2.getLadderFadeOutAnimation().plus(EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.8f, 0L, 4, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1030718802, true, new LadderRowKt$LadderRow$7$3(ladderData, i, getIndexOfMiddleVisibleItem, function04, function27, function28, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function113 = function110;
                            function25 = function27;
                            function26 = function28;
                            function114 = function111;
                            function115 = function112;
                            function03 = function04;
                            modifier3 = modifier5;
                        } else {
                            snapshotState4 = snapshotState46;
                        }
                        objRememberedValue16 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LadderRowKt.LadderRow$lambda$29$lambda$28(ladderData, i);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                        SnapshotState4 snapshotState472 = (SnapshotState4) objRememberedValue16;
                        composerStartRestartGroup.endReplaceGroup();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment centerStart2 = companion3.getCenterStart();
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ladderRowHeight);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart2, false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Modifier modifier52 = modifier4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-389135971);
                            if (averageCostLineData == null) {
                                composerStartRestartGroup.endReplaceGroup();
                                int i232 = i5 << 18;
                                Function0<Unit> function042 = function02;
                                DefaultLadderRow(i, LadderRow$lambda$30(snapshotState472), LadderRow$lambda$23(snapshotState45), LadderRow$lambda$26(snapshotState4), ladderData.getLadderDisplayMode(), LadderRow$lambda$14(snapshotState42), LadderRow$lambda$17(snapshotState43), LadderRow$lambda$20(snapshotState44), z3, z4, function042, getIndexOfMiddleVisibleItem, false, composerStartRestartGroup, ((i5 >> 3) & 14) | (i232 & 234881024) | (i232 & 1879048192), ((i5 >> 24) & 14) | ((i5 >> 15) & 112), 4096);
                                Map<Integer, LadderState.LadderData.PendingOrderRow> pendingOrders2 = ladderData.getPendingOrders();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChanged8 = composerStartRestartGroup.changed(pendingOrders2);
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged8) {
                                    objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LadderRowKt.LadderRow$lambda$46$lambda$32$lambda$31(ladderData, i);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    SnapshotState4 snapshotState482 = (SnapshotState4) objRememberedValue7;
                                    composerStartRestartGroup.endReplaceGroup();
                                    Integer selectedPendingOrdersRowIndex3 = ladderData.getSelectedPendingOrdersRowIndex();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    zChanged9 = composerStartRestartGroup.changed(selectedPendingOrdersRowIndex3);
                                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged9) {
                                        Integer selectedPendingOrdersRowIndex22 = ladderData.getSelectedPendingOrdersRowIndex();
                                        if (selectedPendingOrdersRowIndex22 != null) {
                                            objRememberedValue8 = Boolean.valueOf(selectedPendingOrdersRowIndex22 != null && selectedPendingOrdersRowIndex22.intValue() == i);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                            final boolean zBooleanValue2 = ((Boolean) objRememberedValue8).booleanValue();
                                            composerStartRestartGroup.endReplaceGroup();
                                            LadderState.LadderData.PendingOrderRow pendingOrderRowLadderRow$lambda$46$lambda$333 = LadderRow$lambda$46$lambda$33(snapshotState482);
                                            if (pendingOrderRowLadderRow$lambda$46$lambda$333 == null) {
                                            }
                                            composerStartRestartGroup.startReplaceGroup(-389099063);
                                            if (startOrders != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            LadderState.LadderData.PendingOrderRow pendingOrderRowLadderRow$lambda$46$lambda$3322 = LadderRow$lambda$46$lambda$33(snapshotState482);
                                            if (pendingOrderRowLadderRow$lambda$46$lambda$3322 == null) {
                                            }
                                            composerStartRestartGroup.startReplaceGroup(-389071790);
                                            if (endOrders != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowFadedOut(i), (Modifier) null, LadderAnimations2.getLadderFadeInAnimation(), LadderAnimations2.getLadderFadeOutAnimation(), (String) null, ComposableSingletons$LadderRowKt.INSTANCE.getLambda$2096591991$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 200064, 18);
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            snapshotState = (SnapshotState) objRememberedValue9;
                                            composerStartRestartGroup.endReplaceGroup();
                                            if (ladderData.getSelectedRow() != null) {
                                                snapshotState.setValue(ladderData.getSelectedRow());
                                            }
                                            Function2<? super OrderType, ? super OrderTrigger, Unit> function272 = function23;
                                            Function2<? super OrderType, ? super OrderTrigger, Unit> function282 = function24;
                                            AnimatedVisibilityKt.AnimatedVisibility(ladderData.isRowSelected(i), (Modifier) null, LadderAnimations2.getLadderFadeInAnimation().plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.8f, 0L, 4, null)), LadderAnimations2.getLadderFadeOutAnimation().plus(EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.8f, 0L, 4, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1030718802, true, new LadderRowKt$LadderRow$7$3(ladderData, i, getIndexOfMiddleVisibleItem, function042, function272, function282, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                                            composerStartRestartGroup.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function113 = function110;
                                            function25 = function272;
                                            function26 = function282;
                                            function114 = function111;
                                            function115 = function112;
                                            function03 = function042;
                                            modifier3 = modifier52;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LadderRowKt.LadderRow$lambda$47(ladderData, i, z, z2, visibleAskQuantityBars, visibleBidQuantityBars, getIndexOfMiddleVisibleItem, modifier3, function03, function25, function26, function113, function114, function115, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 805306368;
                i9 = i8;
                i10 = i4 & 1024;
                if (i10 == 0) {
                }
                i13 = i4 & 2048;
                if (i13 == 0) {
                }
                int i202 = i12;
                i15 = i4 & 4096;
                if (i15 == 0) {
                }
                i17 = i4 & 8192;
                if (i17 == 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                    if (i6 == 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Integer orderDraggedOverIndex2 = ladderData.getOrderDraggedOverIndex();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(orderDraggedOverIndex2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(LadderRowKt.LadderRow$lambda$13$lambda$12(ladderData, i));
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        LadderState.LadderData.SelectedRow selectedRow2 = ladderData.getSelectedRow();
                        int i222 = i19;
                        if (selectedRow2 == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(ladderData.isRowSelected(i));
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            SnapshotState4 snapshotState432 = (SnapshotState4) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            int lastPriceIndex2 = ladderData.getLastPriceIndex();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged3 = composerStartRestartGroup.changed(lastPriceIndex2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda22
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Boolean.valueOf(LadderRowKt.LadderRow$lambda$19$lambda$18(ladderData, i));
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                SnapshotState4 snapshotState442 = (SnapshotState4) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChanged4 = composerStartRestartGroup.changed(visibleBidQuantityBars);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged4) {
                                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda23
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LadderRowKt.LadderRow$lambda$22$lambda$21(visibleBidQuantityBars, i);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    SnapshotState4 snapshotState452 = (SnapshotState4) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    zChanged5 = composerStartRestartGroup.changed(visibleAskQuantityBars);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged5) {
                                        objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return LadderRowKt.LadderRow$lambda$25$lambda$24(visibleAskQuantityBars, i);
                                            }
                                        });
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        SnapshotState4 snapshotState462 = (SnapshotState4) objRememberedValue5;
                                        composerStartRestartGroup.endReplaceGroup();
                                        LadderState.LadderData.AverageCostLineData avgCostLineData2 = ladderData.getAvgCostLineData();
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        zChanged6 = composerStartRestartGroup.changed(avgCostLineData2);
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged6) {
                                            objRememberedValue6 = ladderData.getAvgCostLineData();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                            LadderState.LadderData.AverageCostLineData averageCostLineData2 = (LadderState.LadderData.AverageCostLineData) objRememberedValue6;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                            zChanged7 = composerStartRestartGroup.changed(ladderData);
                                            Object objRememberedValue162 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged7) {
                                            }
                                            objRememberedValue162 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda10
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return LadderRowKt.LadderRow$lambda$29$lambda$28(ladderData, i);
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue162);
                                            SnapshotState4 snapshotState4722 = (SnapshotState4) objRememberedValue162;
                                            composerStartRestartGroup.endReplaceGroup();
                                            Alignment.Companion companion32 = Alignment.INSTANCE;
                                            Alignment centerStart22 = companion32.getCenterStart();
                                            Modifier modifierM5156height3ABfNKs22 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ladderRowHeight);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart22, false);
                                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs22);
                                            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Modifier modifier522 = modifier4;
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            i6 = i4 & 128;
            if (i6 != 0) {
            }
            i7 = i4 & 256;
            if (i7 != 0) {
            }
            i8 = i4 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i4 & 1024;
            if (i10 == 0) {
            }
            i13 = i4 & 2048;
            if (i13 == 0) {
            }
            int i2022 = i12;
            i15 = i4 & 4096;
            if (i15 == 0) {
            }
            i17 = i4 & 8192;
            if (i17 == 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i4 & 8) == 0) {
        }
        z4 = z2;
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        i6 = i4 & 128;
        if (i6 != 0) {
        }
        i7 = i4 & 256;
        if (i7 != 0) {
        }
        i8 = i4 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i4 & 1024;
        if (i10 == 0) {
        }
        i13 = i4 & 2048;
        if (i13 == 0) {
        }
        int i20222 = i12;
        i15 = i4 & 4096;
        if (i15 == 0) {
        }
        i17 = i4 & 8192;
        if (i17 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderRow$lambda$13$lambda$12(LadderState.LadderData ladderData, int i) {
        Integer orderDraggedOverIndex = ladderData.getOrderDraggedOverIndex();
        return orderDraggedOverIndex != null && orderDraggedOverIndex.intValue() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderRow$lambda$19$lambda$18(LadderState.LadderData ladderData, int i) {
        return ladderData.getLastPriceIndex() == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final LadderState.LadderData.QuantityBar LadderRow$lambda$22$lambda$21(ImmutableMap immutableMap, int i) {
        return (LadderState.LadderData.QuantityBar) immutableMap.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final LadderState.LadderData.QuantityBar LadderRow$lambda$25$lambda$24(ImmutableMap immutableMap, int i) {
        return (LadderState.LadderData.QuantityBar) immutableMap.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LadderRow$lambda$29$lambda$28(LadderState.LadderData ladderData, int i) {
        return ladderData.getPriceText().invoke(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LadderState.LadderData.PendingOrderRow LadderRow$lambda$46$lambda$32$lambda$31(LadderState.LadderData ladderData, int i) {
        return ladderData.getPendingOrders().get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderRow$lambda$46$lambda$38$lambda$36$lambda$35(boolean z, LadderState.LadderData ladderData) {
        if (!z) {
            return false;
        }
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = ladderData.getSelectedPendingOrders();
        return (selectedPendingOrders != null ? selectedPendingOrders.getSide() : null) == Side.START;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LadderRow$lambda$46$lambda$42$lambda$40$lambda$39(boolean z, LadderState.LadderData ladderData) {
        if (!z) {
            return false;
        }
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = ladderData.getSelectedPendingOrders();
        return (selectedPendingOrders != null ? selectedPendingOrders.getSide() : null) == Side.END;
    }

    private static final void AverageCostLine(final LadderState.LadderData.AverageCostLineData averageCostLineData, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(432345224);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(averageCostLineData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432345224, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.AverageCostLine (LadderRow.kt:238)");
            }
            final PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
            final long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
            float f = ladderRowHeight;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(averageCostLineData.getOffsetMultiplier() * f) - C2002Dp.m7995constructorimpl(f * 0.5f));
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            float f2 = (float) 1.5d;
            Modifier modifierWeight$default = Row5.weight$default(row6, OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f2)), 0.0f, fM7995constructorimpl, 1, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) | composerStartRestartGroup.changedInstance(pathEffectDashPathEffect);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LadderRowKt.AverageCostLine$lambda$52$lambda$49$lambda$48(jM21425getFg0d7_KjU, pathEffectDashPathEffect, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierWeight$default, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierWeight$default2 = Row5.weight$default(row6, OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f2)), 0.0f, fM7995constructorimpl, 1, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(jM21425getFg0d7_KjU) | composerStartRestartGroup.changedInstance(pathEffectDashPathEffect);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LadderRowKt.AverageCostLine$lambda$52$lambda$51$lambda$50(jM21425getFg0d7_KjU, pathEffectDashPathEffect, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierWeight$default2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.AverageCostLine$lambda$53(averageCostLineData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PendingOrderRow(final BoxScope boxScope, final LadderState.LadderData.PendingOrderRow.Group group, final Side side, final boolean z, final LadderCustomGestureDetector3 ladderCustomGestureDetector3, final Integer num, final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function1, final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function12, final Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function13, Alignment alignment, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Alignment alignment2;
        boolean z2;
        Object objRememberedValue;
        boolean z3;
        Object objRememberedValue2;
        final Alignment alignment3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1603113812);
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
            i3 |= composerStartRestartGroup.changed(side.ordinal()) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(ladderCustomGestureDetector3 == null ? -1 : ladderCustomGestureDetector3.ordinal()) ? 16384 : 8192;
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
        if ((i2 & 128) == 0) {
            i5 = (100663296 & i) == 0 ? composerStartRestartGroup.changedInstance(function13) ? 67108864 : 33554432 : 100663296;
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 805306368;
                alignment2 = alignment;
            } else {
                alignment2 = alignment;
                if ((i & 805306368) == 0) {
                    i3 |= composerStartRestartGroup.changed(alignment2) ? 536870912 : 268435456;
                }
            }
            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Alignment alignment4 = i4 == 0 ? null : alignment2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1603113812, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PendingOrderRow (LadderRow.kt:287)");
                }
                LadderCustomGestureDetector3 ladderCustomGestureDetector32 = null;
                Integer num2 = z ? num : null;
                if (z) {
                    ladderCustomGestureDetector32 = ladderCustomGestureDetector3;
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Object[] objArr = {num, Boolean.valueOf(z), group};
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                int i6 = i3 & 112;
                Integer num3 = num2;
                int i7 = 458752 & i3;
                z2 = (i6 != 32) | ((i3 & 7168) != 2048) | (i7 != 131072) | ((i3 & 234881024) != 67108864);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LadderRowKt$PendingOrderRow$2$1(group, z, num, function13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, objArr, (PointerInputEventHandler) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z3 = (i6 != 32) | (i7 != 131072) | ((3670016 & i3) != 1048576) | ((29360128 & i3) == 8388608);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderRowKt.PendingOrderRow$lambda$57$lambda$56(group, num, function1, function12);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack(boxScope, side, group, num3, ladderCustomGestureDetector32, modifierPointerInput, (Function0) objRememberedValue2, alignment4, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (29360128 & (i3 >> 6)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                alignment3 = alignment4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                alignment3 = alignment2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderRowKt.PendingOrderRow$lambda$58(boxScope, group, side, z, ladderCustomGestureDetector3, num, function1, function12, function13, alignment3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= i5;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LadderCustomGestureDetector3 ladderCustomGestureDetector322 = null;
            if (z) {
            }
            if (z) {
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Object[] objArr2 = {num, Boolean.valueOf(z), group};
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i62 = i3 & 112;
            Integer num32 = num2;
            int i72 = 458752 & i3;
            z2 = (i62 != 32) | ((i3 & 7168) != 2048) | (i72 != 131072) | ((i3 & 234881024) != 67108864);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = new LadderRowKt$PendingOrderRow$2$1(group, z, num, function13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, objArr2, (PointerInputEventHandler) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z3 = (i62 != 32) | (i72 != 131072) | ((3670016 & i3) != 1048576) | ((29360128 & i3) == 8388608);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z3) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderRowKt.PendingOrderRow$lambda$57$lambda$56(group, num, function1, function12);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack(boxScope, side, group, num32, ladderCustomGestureDetector322, modifierPointerInput2, (Function0) objRememberedValue2, alignment4, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896) | (29360128 & (i3 >> 6)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    alignment3 = alignment4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingOrderRow$lambda$57$lambda$56(LadderState.LadderData.PendingOrderRow.Group group, Integer num, Function1 function1, Function1 function12) {
        ImmutableList<LadderState.LadderData.UiPendingOrder> orders = group.getOrders();
        LadderState.LadderData.UiPendingOrder uiPendingOrder = orders.get(AnimatedPendingOrderPillStackKt.nextIndex(orders, num));
        if (orders.size() > 1) {
            function1.invoke(new LadderState.LadderData.SelectedPendingOrders.Single(uiPendingOrder));
        } else {
            function12.invoke(new LadderState.LadderData.SelectedPendingOrders.Single((LadderState.LadderData.UiPendingOrder) CollectionsKt.first((List) orders)));
        }
        return Unit.INSTANCE;
    }

    public static final void SelectedLadderRow(final String priceText, final int i, final int i2, final float f, final LadderState.LadderData.SelectedRow.OrderConfig orderConfig, final LadderState.LadderData.SelectedRow.OrderConfig orderConfig2, final Function0<Unit> onPriceClicked, final Function0<Unit> onStartOrderClicked, final Function0<Unit> onEndOrderClicked, Composer composer, final int i3) {
        int i4;
        int i5;
        int i6;
        float f2;
        Color colorM26114getOverrideColorQN2ZGVo;
        Color colorM26114getOverrideColorQN2ZGVo2;
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(onPriceClicked, "onPriceClicked");
        Intrinsics.checkNotNullParameter(onStartOrderClicked, "onStartOrderClicked");
        Intrinsics.checkNotNullParameter(onEndOrderClicked, "onEndOrderClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1400530788);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(priceText) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i;
            i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i3 & 384) == 0) {
            i6 = i2;
            i4 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
        } else {
            i6 = i2;
        }
        if ((i3 & 3072) == 0) {
            f2 = f;
            i4 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(orderConfig) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(orderConfig2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPriceClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onStartOrderClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onEndOrderClicked) ? 67108864 : 33554432;
        }
        if ((38347923 & i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400530788, i4, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow (LadderRow.kt:350)");
            }
            LadderSelectedRowStyle selectedRow = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getSelectedRow();
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
            SelectedLadderRowBackground(extensions2.persistentListOf(Color.m6701boximpl((orderConfig == null || (colorM26114getOverrideColorQN2ZGVo2 = orderConfig.m26114getOverrideColorQN2ZGVo()) == null) ? selectedRow.m26244getStartBackgroundColor0d7_KjU() : colorM26114getOverrideColorQN2ZGVo2.getValue()), Color.m6701boximpl((orderConfig2 == null || (colorM26114getOverrideColorQN2ZGVo = orderConfig2.m26114getOverrideColorQN2ZGVo()) == null) ? selectedRow.m26243getEndBackgroundColor0d7_KjU() : colorM26114getOverrideColorQN2ZGVo.getValue())), composerStartRestartGroup, 0);
            final Styles styles = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
            final int i8 = i5;
            final int i9 = i6;
            final float f3 = f2;
            CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$SelectedLadderRow$1$selectedLadderRowStyle$1
                private final /* synthetic */ Styles $$delegate_0;

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public AppBarStyle getAppBar(Composer composer2, int i10) {
                    composer2.startReplaceGroup(432564924);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(432564924, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-appBar> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(300533947);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(300533947, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-buttonBar> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-1202103212);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1202103212, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-cardStackStyle> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-1368360776);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1368360776, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-chart> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-1544243349);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1544243349, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-checkBox> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(786018557);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(786018557, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-circularProgressIndicator> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-1189666848);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1189666848, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-communicationCard> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-2041111086);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2041111086, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-expandableButtonTray> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1567009507);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1567009507, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-iconButton> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1054663028);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1054663028, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-infoBanner> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(666628193);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(666628193, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-1960369061);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1960369061, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-markdownSpannedText> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1210693691);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1210693691, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-navigationBarStyle> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-1208749535);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1208749535, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-numpad> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-976928211);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-976928211, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-placeholder> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(691502562);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(691502562, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-pog> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1205271906);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1205271906, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-progressBarStyle> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(770748295);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(770748295, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-radioButton> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1400390708);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1400390708, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-row> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-1148947442);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1148947442, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-selectionRowStyle> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1126798802);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1126798802, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-spanButton> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1667705345);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1667705345, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-text> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1609841967);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1609841967, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-textButton> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(169997143);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(169997143, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-textInput> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(1784181184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1784181184, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-toggleRow> (LadderRow.kt:0)");
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
                    composer2.startReplaceGroup(-560853572);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-560853572, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<no name provided>.<get-button> (LadderRow.kt:370)");
                    }
                    ButtonStyle button = this.$currentLocalStyles.getButton(composer2, 0);
                    ButtonStyle buttonStyleCopy$default = ButtonStyle.copy$default(button, ButtonStyle.Style.m21714copyd8LSEHM$default(button.getPrimary(), null, PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), 0.0f, null, 13, null), null, 2, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return buttonStyleCopy$default;
                }
            }), ComposableLambda3.rememberComposableLambda(-1155604386, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$SelectedLadderRow$1$1
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
                        ComposerKt.traceEventStart(-1155604386, i10, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRow.<anonymous>.<anonymous> (LadderRow.kt:381)");
                    }
                    LadderRowKt.SelectedLadderRowContent(priceText, i8, i9, f3, orderConfig, orderConfig2, onPriceClicked, onStartOrderClicked, onEndOrderClicked, composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.SelectedLadderRow$lambda$60(priceText, i, i2, f, orderConfig, orderConfig2, onPriceClicked, onStartOrderClicked, onEndOrderClicked, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectedLadderRowContent(final String str, final int i, final int i2, final float f, final LadderState.LadderData.SelectedRow.OrderConfig orderConfig, final LadderState.LadderData.SelectedRow.OrderConfig orderConfig2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i3) {
        int i4;
        LadderStyle ladderStyle;
        float f2;
        int i5;
        Object obj;
        int i6;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1327234537);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(orderConfig) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(orderConfig2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
        }
        if ((38347923 & i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1327234537, i4, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRowContent (LadderRow.kt:407)");
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
            Row6 row6 = Row6.INSTANCE;
            LadderStyle ladderStyle2 = (LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle());
            composerStartRestartGroup.startReplaceGroup(594150627);
            if (orderConfig == null) {
                ladderStyle = ladderStyle2;
                composer2 = composerStartRestartGroup;
                i5 = i4;
                i6 = 1;
                f2 = 0.0f;
                obj = null;
            } else {
                String strStringResource = StringResources_androidKt.stringResource(orderConfig.getLabel(), composerStartRestartGroup, 0);
                boolean enabled = orderConfig.getEnabled();
                long jM26244getStartBackgroundColor0d7_KjU = ladderStyle2.getSelectedRow().m26244getStartBackgroundColor0d7_KjU();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU();
                androidx.compose.p011ui.text.TextStyle textMBold = LadderStyleKt.getTextMBold(bentoTheme.getTypography(composerStartRestartGroup, i7));
                ladderStyle = ladderStyle2;
                int i8 = i4;
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(0)), 0.3f, false, 2, null), 0.0f, 1, null), companion2.getCenterVertically(), false, 2, null);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(orderConfig) | ((i8 & 29360128) == 8388608);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LadderRowKt$SelectedLadderRowContent$1$1$1$1(orderConfig, function02);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                f2 = 0.0f;
                i5 = i8;
                obj = null;
                i6 = 1;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource, SuspendingPointerInputFilterKt.pointerInput(modifierWrapContentHeight$default, unit, (PointerInputEventHandler) objRememberedValue), null, null, enabled, false, Color.m6701boximpl(jM26244getStartBackgroundColor0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU), null, textMBold, false, null, composerStartRestartGroup, (i8 >> 21) & 14, 0, 6744);
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
            float f3 = 0;
            Modifier modifierWeight$default = Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(companion, f2, i6, obj), C2002Dp.m7995constructorimpl(f3)), 0.4f, false, 2, null);
            composer2.startReplaceGroup(5004770);
            int i9 = (3670016 & i5) == 1048576 ? i6 : 0;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (i9 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderRowKt.SelectedLadderRowContent$lambda$67$lambda$64$lambda$63(function0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            Composer composer4 = composer2;
            LadderRowPriceTextKt.m26209LadderRowPriceTextmxsUjTo(str, i, i2, f, jM6725getTransparent0d7_KjU, false, true, true, SizeKt.wrapContentHeight$default(ClickableKt.m4893clickableXHw0xAI$default(modifierWeight$default, false, null, null, (Function0) objRememberedValue2, 7, null), companion2.getCenterVertically(), false, 2, obj), composer4, (i5 & 14) | 14376960 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
            composer4.startReplaceGroup(594204917);
            if (orderConfig2 == null) {
                composer3 = composer4;
            } else {
                String strStringResource2 = StringResources_androidKt.stringResource(orderConfig2.getLabel(), composer4, 0);
                boolean enabled2 = orderConfig2.getEnabled();
                long jM26243getEndBackgroundColor0d7_KjU = ladderStyle.getSelectedRow().m26243getEndBackgroundColor0d7_KjU();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i10 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composer4, i10).m21371getBg0d7_KjU();
                androidx.compose.p011ui.text.TextStyle textMBold2 = LadderStyleKt.getTextMBold(bentoTheme2.getTypography(composer4, i10));
                Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme2.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(f3)), 0.3f, false, 2, null), f2, 1, obj), companion2.getCenterVertically(), false, 2, obj);
                Unit unit2 = Unit.INSTANCE;
                composer4.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer4.changed(orderConfig2) | ((234881024 & i5) == 67108864);
                Object objRememberedValue3 = composer4.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new LadderRowKt$SelectedLadderRowContent$1$3$1$1(orderConfig2, function03);
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                composer4.endReplaceGroup();
                composer3 = composer4;
                BentoButtonKt.m20586BentoButtonEikTQX8(function03, strStringResource2, SuspendingPointerInputFilterKt.pointerInput(modifierWrapContentHeight$default2, unit2, (PointerInputEventHandler) objRememberedValue3), null, null, enabled2, false, Color.m6701boximpl(jM26243getEndBackgroundColor0d7_KjU), Color.m6701boximpl(jM21371getBg0d7_KjU2), null, textMBold2, false, null, composer3, (i5 >> 24) & 14, 0, 6744);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LadderRowKt.SelectedLadderRowContent$lambda$68(str, i, i2, f, orderConfig, orderConfig2, function0, function02, function03, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLadderRowContent$lambda$67$lambda$64$lambda$63(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DefaultLadderRow(final int i, final String priceText, final LadderState.LadderData.QuantityBar quantityBar, final LadderState.LadderData.QuantityBar quantityBar2, final LadderDisplayMode ladderDisplayMode, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Function0<Unit> onRowClicked, final Function0<Integer> getIndexOfMiddleVisibleItem, boolean z6, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        LadderState.LadderData.QuantityBar quantityBar3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z7;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(ladderDisplayMode, "ladderDisplayMode");
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        Intrinsics.checkNotNullParameter(getIndexOfMiddleVisibleItem, "getIndexOfMiddleVisibleItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(970119128);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(priceText) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                quantityBar3 = quantityBar;
                i5 |= composerStartRestartGroup.changedInstance(quantityBar3) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(quantityBar2) ? 2048 : 1024;
                }
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerStartRestartGroup.changed(ladderDisplayMode.ordinal()) ? 16384 : 8192;
                }
                if ((i4 & 32) != 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                if ((i4 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i4 & 256) != 0) {
                    i5 |= 100663296;
                } else {
                    if ((i2 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changed(z4) ? 67108864 : 33554432;
                    }
                    if ((i4 & 512) != 0) {
                        if ((805306368 & i2) == 0) {
                            i5 |= composerStartRestartGroup.changed(z5) ? 536870912 : 268435456;
                        }
                        if ((i4 & 1024) != 0) {
                            i6 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i6 = (composerStartRestartGroup.changedInstance(onRowClicked) ? 4 : 2) | i3;
                        } else {
                            i6 = i3;
                        }
                        int i11 = i6;
                        if ((i4 & 2048) != 0) {
                            i7 = i11 | 48;
                        } else if ((i3 & 48) == 0) {
                            i7 = i11 | (composerStartRestartGroup.changedInstance(getIndexOfMiddleVisibleItem) ? 32 : 16);
                        } else {
                            i7 = i11;
                        }
                        i8 = i4 & 4096;
                        if (i8 != 0) {
                            i9 = i7 | 384;
                        } else {
                            int i12 = i7;
                            if ((i3 & 384) == 0) {
                                i12 |= composerStartRestartGroup.changed(z6) ? 256 : 128;
                            }
                            i9 = i12;
                        }
                        if ((i5 & 306783379) == 306783378 && (i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z8 = z6;
                            composer2 = composerStartRestartGroup;
                        } else {
                            boolean z9 = i8 == 0 ? false : z6;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(970119128, i5, i9, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.DefaultLadderRow (LadderRow.kt:496)");
                            }
                            composerStartRestartGroup.startReplaceGroup(276597258);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i13 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i13).m21371getBg0d7_KjU();
                            if (z) {
                                i10 = i9;
                            } else {
                                i10 = i9;
                                jM21371getBg0d7_KjU = Colors8.m26601blendWithjxsXWHM(jM21371getBg0d7_KjU, bentoTheme.getColors(composerStartRestartGroup, i13).m21372getBg20d7_KjU(), 0.8f);
                            }
                            long j = jM21371getBg0d7_KjU;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            if (z2) {
                                modifierFillMaxSize$default = Blur.m6449blurF8QBwvs$default(modifierFillMaxSize$default, C2002Dp.m7995constructorimpl(4), null, 2, null);
                            }
                            Modifier modifierM4872backgroundbw27NRU$default = modifierFillMaxSize$default;
                            if (z) {
                                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4872backgroundbw27NRU$default, j, null, 2, null);
                            }
                            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composerStartRestartGroup, i13).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i13).m21597getXxsmallD9Ej5fM());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = InteractionSource2.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z7 = (i10 & 14) != 4;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z7 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return LadderRowKt.DefaultLadderRow$lambda$74$lambda$73(onRowClicked);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5143paddingVpY3zN4, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            boolean z10 = !z3 || z;
                            SnapshotState4<Float> snapshotState4RememberTargetRotationState = rememberTargetRotationState(ladderDisplayMode, composerStartRestartGroup, (i5 >> 12) & 14);
                            float f = 0;
                            int i14 = (i5 >> 21) & 1008;
                            int i15 = i5 << 3;
                            composer2 = composerStartRestartGroup;
                            m26202QuantityBarRowyWKOrZg(j, z4, z5, quantityBar3, Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(ModifiersKt.bentoPlaceholder$default(companion2, z9, null, 2, null), C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), composer2, i14 | (i15 & 7168), 0);
                            boolean z11 = z9;
                            LadderRowPriceTextKt.m26209LadderRowPriceTextmxsUjTo(priceText, i, getIndexOfMiddleVisibleItem.invoke().intValue(), DefaultLadderRow$lambda$76$lambda$75(snapshotState4RememberTargetRotationState), j, z3, !z2, z10, ModifiersKt.bentoPlaceholder$default(companion2, z9, null, 2, null), composer2, ((i5 >> 6) & 458752) | (i15 & 112) | ((i5 >> 3) & 14), 0);
                            m26202QuantityBarRowyWKOrZg(j, z4, z5, quantityBar2, Row5.weight$default(row6, SizeKt.m5174width3ABfNKs(ModifiersKt.bentoPlaceholder$default(companion2, z11, null, 2, null), C2002Dp.m7995constructorimpl(f)), 1.0f, false, 2, null), composer2, i14 | (i5 & 7168), 0);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z8 = z11;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return LadderRowKt.DefaultLadderRow$lambda$77(i, priceText, quantityBar, quantityBar2, ladderDisplayMode, z, z2, z3, z4, z5, onRowClicked, getIndexOfMiddleVisibleItem, z8, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 805306368;
                    if ((i4 & 1024) != 0) {
                    }
                    int i112 = i6;
                    if ((i4 & 2048) != 0) {
                    }
                    i8 = i4 & 4096;
                    if (i8 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(276597258);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i132 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i132).m21371getBg0d7_KjU();
                        if (z) {
                        }
                        long j2 = jM21371getBg0d7_KjU2;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                        if (z2) {
                        }
                        Modifier modifierM4872backgroundbw27NRU$default2 = modifierFillMaxSize$default2;
                        if (z) {
                        }
                        Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i132).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i132).m21597getXxsmallD9Ej5fM());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i10 & 14) != 4) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z7) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LadderRowKt.DefaultLadderRow$lambda$74$lambda$73(onRowClicked);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierM5143paddingVpY3zN42, interactionSource32, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                if (z3) {
                                    SnapshotState4<Float> snapshotState4RememberTargetRotationState2 = rememberTargetRotationState(ladderDisplayMode, composerStartRestartGroup, (i5 >> 12) & 14);
                                    float f2 = 0;
                                    int i142 = (i5 >> 21) & 1008;
                                    int i152 = i5 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m26202QuantityBarRowyWKOrZg(j2, z4, z5, quantityBar3, Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(ModifiersKt.bentoPlaceholder$default(companion22, z9, null, 2, null), C2002Dp.m7995constructorimpl(f2)), 1.0f, false, 2, null), composer2, i142 | (i152 & 7168), 0);
                                    boolean z112 = z9;
                                    LadderRowPriceTextKt.m26209LadderRowPriceTextmxsUjTo(priceText, i, getIndexOfMiddleVisibleItem.invoke().intValue(), DefaultLadderRow$lambda$76$lambda$75(snapshotState4RememberTargetRotationState2), j2, z3, !z2, z10, ModifiersKt.bentoPlaceholder$default(companion22, z9, null, 2, null), composer2, ((i5 >> 6) & 458752) | (i152 & 112) | ((i5 >> 3) & 14), 0);
                                    m26202QuantityBarRowyWKOrZg(j2, z4, z5, quantityBar2, Row5.weight$default(row62, SizeKt.m5174width3ABfNKs(ModifiersKt.bentoPlaceholder$default(companion22, z112, null, 2, null), C2002Dp.m7995constructorimpl(f2)), 1.0f, false, 2, null), composer2, i142 | (i5 & 7168), 0);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z8 = z112;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i4 & 512) != 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                int i1122 = i6;
                if ((i4 & 2048) != 0) {
                }
                i8 = i4 & 4096;
                if (i8 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if ((i4 & 256) != 0) {
            }
            if ((i4 & 512) != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            int i11222 = i6;
            if ((i4 & 2048) != 0) {
            }
            i8 = i4 & 4096;
            if (i8 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        quantityBar3 = quantityBar;
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if ((i4 & 256) != 0) {
        }
        if ((i4 & 512) != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        int i112222 = i6;
        if ((i4 & 2048) != 0) {
        }
        i8 = i4 & 4096;
        if (i8 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultLadderRow$lambda$74$lambda$73(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void SelectedLadderRowBackground(final ImmutableList3<Color> immutableList3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1309249816);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(immutableList3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1309249816, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.SelectedLadderRowBackground (LadderRow.kt:567)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            Brush.Companion companion = Brush.INSTANCE;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
            Iterator<Color> it = immutableList3.iterator();
            while (it.hasNext()) {
                arrayList.add(Color.m6701boximpl(Color.m6705copywmQWz5c$default(it.next().getValue(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)));
            }
            BoxKt.Box(Background3.background$default(Blur.m6449blurF8QBwvs$default(BorderKt.m4878borderziNgDLE(modifierFillMaxSize$default, fM7995constructorimpl, Brush.Companion.m6678linearGradientmHitzGk$default(companion, arrayList, 0L, 0L, 0, 14, (Object) null), RoundedCornerShape2.RoundedCornerShape(50)), C2002Dp.m7995constructorimpl(30), null, 2, null), Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, immutableList3, 0L, 0L, 0, 14, (Object) null), null, 0.12f, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.SelectedLadderRowBackground$lambda$79(immutableList3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState4<Float> rememberTargetRotationState(LadderDisplayMode ladderDisplayMode, Composer composer, int i) {
        float f;
        composer.startReplaceGroup(-1274402629);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1274402629, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.rememberTargetRotationState (LadderRow.kt:593)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[ladderDisplayMode.ordinal()];
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: QuantityBarRow-yWKOrZg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26202QuantityBarRowyWKOrZg(final long j, final boolean z, final boolean z2, final LadderState.LadderData.QuantityBar quantityBar, Modifier modifier, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        boolean z3;
        final Modifier modifier2;
        Composer composer2;
        String string2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-623216180);
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
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(quantityBar) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-623216180, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.QuantityBarRow (LadderRow.kt:609)");
                }
                if (quantityBar == null) {
                    composerStartRestartGroup.startReplaceGroup(910695490);
                    if (z2) {
                        string2 = Format3.formatQuantityNumber(quantityBar.getQuantity(), quantityBar.getSide());
                    } else {
                        string2 = quantityBar.getQuantity().toString();
                        Intrinsics.checkNotNull(string2);
                    }
                    m26201QuantityBarRowY2L_72g(quantityBar.getUiScaledQuantityFraction(), j2, z3, quantityBar.getAlpha(), quantityBar.getSide(), string2, modifier3, false, composerStartRestartGroup, ((i3 << 3) & 1008) | ((i3 << 6) & 3670016), 128);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(911275531);
                    Spacer2.Spacer(modifier3, composer2, (i3 >> 12) & 14);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderRowKt.QuantityBarRow_yWKOrZg$lambda$80(j, z, z2, quantityBar, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (quantityBar == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* renamed from: QuantityBarRow-Y2L_72g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26201QuantityBarRowY2L_72g(final float f, long j, final boolean z, final float f2, final Side side, final String str, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        float f3;
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i6;
        Composer composer2;
        float f4;
        int i7;
        int i8;
        QuantityBarStyle.Sided sided;
        final boolean z5;
        final Modifier modifier3;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        long j2 = j;
        Intrinsics.checkNotNullParameter(side, "side");
        Composer composerStartRestartGroup = composer.startRestartGroup(1155734982);
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
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(side.ordinal()) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z5 = z4;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z6 = i5 == 0 ? false : z4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1155734982, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.QuantityBarRow (LadderRow.kt:640)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(side != Side.START ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                    Modifier modifier5 = modifier4;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    QuantityBarStyle.Sided sided2 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getQuantityBar().sided(side);
                    i6 = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
                    if (i6 != 1) {
                        int i9 = i3;
                        composerStartRestartGroup.startReplaceGroup(-1923569450);
                        composerStartRestartGroup.startReplaceGroup(-616239928);
                        if (str != null) {
                            composer2 = composerStartRestartGroup;
                            f4 = 1.0f;
                            i7 = i9;
                            i8 = 3670016;
                            j2 = j;
                            sided = sided2;
                            m26203QuantityTexteopBjH0(str, sided2.m26282getTextColor0d7_KjU(), j2, null, composer2, ((i9 >> 15) & 14) | ((i9 << 3) & 896), 8);
                        } else {
                            j2 = j;
                            composer2 = composerStartRestartGroup;
                            f4 = 1.0f;
                            i7 = i9;
                            i8 = 3670016;
                            sided = sided2;
                        }
                        composer2.endReplaceGroup();
                        m26200QuantityBarK2djEUw(f, sided.m26272actualBarBackgroundColor5vOe2sY(j2, f2), sided.m26273actualBorderColor5vOe2sY(j2, f2), sided.getBarShape(), z, row6.weight(Modifier.INSTANCE, f4, false), z6, composer2, (i7 & 14) | ((i7 << 6) & 57344) | ((i7 >> 3) & i8), 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (i6 != 2) {
                            composerStartRestartGroup.startReplaceGroup(-616240358);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1922748074);
                        m26200QuantityBarK2djEUw(f3, sided2.m26272actualBarBackgroundColor5vOe2sY(j2, f2), sided2.m26273actualBorderColor5vOe2sY(j2, f2), sided2.getBarShape(), z3, row6.weight(Modifier.INSTANCE, 1.0f, false), z6, composerStartRestartGroup, (i3 & 14) | ((i3 << 6) & 57344) | ((i3 >> 3) & 3670016), 0);
                        if (str != null) {
                            int i10 = i3;
                            m26203QuantityTexteopBjH0(str, sided2.m26282getTextColor0d7_KjU(), j2, null, composerStartRestartGroup, ((i10 >> 15) & 14) | ((i10 << 3) & 896), 8);
                            composer3 = composerStartRestartGroup;
                        } else {
                            composer3 = composerStartRestartGroup;
                        }
                        composer3.endReplaceGroup();
                        j2 = j;
                        composer2 = composer3;
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z6;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j3 = j2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderRowKt.QuantityBarRow_Y2L_72g$lambda$82(f, j3, z, f2, side, str, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(side != Side.START ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Modifier modifier52 = modifier4;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    QuantityBarStyle.Sided sided22 = ((LadderStyle) composerStartRestartGroup.consume(LadderStyleKt.getLocalLadderStyle())).getQuantityBar().sided(side);
                    i6 = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
                    if (i6 != 1) {
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z6;
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /* renamed from: QuantityBar-K2djEUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m26200QuantityBarK2djEUw(final float f, final long j, final long j2, final RoundedCornerShape roundedCornerShape, final boolean z, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Animatable animatable;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Shape shape;
        Modifier modifierM4876borderxT4_qwU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(457584428);
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
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
            }
            if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    z3 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(457584428, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.QuantityBar (LadderRow.kt:698)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                int i6 = i3;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Float fValueOf = Float.valueOf(f);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i7 = i6 & 14;
                zChangedInstance = ((i6 & 57344) != 16384) | composerStartRestartGroup.changedInstance(animatable) | (i7 != 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    shape = null;
                    objRememberedValue2 = new LadderRowKt$QuantityBar$1$1(z, animatable, f, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    shape = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i7);
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.fillMaxWidth(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(ModifiersKt.bentoPlaceholder$default(modifier3, z3, shape, 2, shape), 0.0f, 1, shape), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 1, null), ((Number) animatable.getValue()).floatValue()), j, roundedCornerShape);
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
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderRowKt.QuantityBar_K2djEUw$lambda$85(f, j, j2, roundedCornerShape, z, modifier4, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i3 & 599187) == 599186) {
            if (i5 == 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            int i62 = i3;
            if (objRememberedValue == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(f);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            int i72 = i62 & 14;
            zChangedInstance = ((i62 & 57344) != 16384) | composerStartRestartGroup.changedInstance(animatable) | (i72 != 4);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                shape = null;
                objRememberedValue2 = new LadderRowKt$QuantityBar$1$1(z, animatable, f, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i72);
                Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(SizeKt.fillMaxWidth(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(ModifiersKt.bentoPlaceholder$default(modifier3, z3, shape, 2, shape), 0.0f, 1, shape), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 1, null), ((Number) animatable.getValue()).floatValue()), j, roundedCornerShape);
                if (j2 == 16) {
                }
                BoxKt.Box(modifierM4871backgroundbw27NRU2.then(modifierM4876borderxT4_qwU), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final boolean z42 = z3;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: QuantityText-eopBjH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26203QuantityTexteopBjH0(final String text, final long j, final long j2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1287366918);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
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
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1287366918, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.QuantityText (LadderRow.kt:749)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier4 = modifier2;
                    BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifier2, j4, null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(j3), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 0, 7672);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LadderRowKt.QuantityText_eopBjH0$lambda$86(text, j, j2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier2;
                BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(modifier2, j4, null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), Color.m6701boximpl(j3), null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, (i3 & 14) | 805306368 | ((i3 << 3) & 896), 0, 7672);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PreviewQuantityBarRow(final PreviewQuantityBarParameterProvider.Parameters parameters, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(570506814);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(parameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(570506814, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewQuantityBarRow (LadderRow.kt:797)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(parameters.isDay(), ComposableLambda3.rememberComposableLambda(947555805, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt.PreviewQuantityBarRow.1
                public final void invoke(Composer composer2, int i3) {
                    Composer composer3 = composer2;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(947555805, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewQuantityBarRow.<anonymous> (LadderRow.kt:799)");
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
                    composer3.startReplaceGroup(1040053353);
                    Iterator it = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.1f), Float.valueOf(0.4f), Float.valueOf(0.8f), Float.valueOf(1.0f)}).iterator();
                    while (it.hasNext()) {
                        float fFloatValue = ((Number) it.next()).floatValue();
                        LadderRowKt.m26201QuantityBarRowY2L_72g(fFloatValue, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), false, fFloatValue, parameters2.getSide(), String.valueOf((int) (100.0f * fFloatValue)), SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(42)), C2002Dp.m7995constructorimpl(300)), false, composer3, 1573248, 128);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.PreviewQuantityBarRow$lambda$87(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewQuantityBarRowFormatted(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(41638768);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(41638768, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.PreviewQuantityBarRowFormatted (LadderRow.kt:825)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(true, ComposableSingletons$LadderRowKt.INSTANCE.m26184getLambda$1747313679$lib_trade_ladder_externalDebug(), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderRowKt.PreviewQuantityBarRowFormatted$lambda$88(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
