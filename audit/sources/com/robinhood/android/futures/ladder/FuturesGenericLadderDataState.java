package com.robinhood.android.futures.ladder;

import com.robinhood.android.futures.ladder.data.FuturesLadderPriceData;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo2;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.PostTradeLadderFtuxState;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderDisplayMode;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesGenericLadderDataState.kt */
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\u0019\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001f\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0012\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0012\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u00102\u001a\u000203\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00108\u001a\u000209¢\u0006\u0004\b:\u0010;J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0007HÆ\u0003J\t\u0010w\u001a\u00020\tHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0019HÆ\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010YJ\n\u0010\u0084\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020$HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010YJ\u0010\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020*0\u0012HÆ\u0003J\u0010\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020*0\u0012HÆ\u0003J\u0010\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050-HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010QJ\n\u0010\u0090\u0001\u001a\u000203HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\n\u0010\u0093\u0001\u001a\u000209HÆ\u0003J\u008e\u0003\u0010\u0094\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00192\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00122\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00122\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u000209HÆ\u0001¢\u0006\u0003\u0010\u0095\u0001J\u0015\u0010\u0096\u0001\u001a\u00020\u00192\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010*HÖ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u001fHÖ\u0001J\u000b\u0010\u0099\u0001\u001a\u00030\u009a\u0001HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010R\u001a\u0004\b\u0018\u0010QR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010R\u001a\u0004\bS\u0010QR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\u001d\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Z\u001a\u0004\bX\u0010YR\u0011\u0010 \u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b[\u0010WR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010%\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b`\u0010WR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0015\u0010(\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Z\u001a\u0004\bc\u0010YR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0012¢\u0006\b\n\u0000\u001a\u0004\bd\u0010LR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0012¢\u0006\b\n\u0000\u001a\u0004\be\u0010LR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u00100\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bj\u0010?R\u0015\u00101\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010R\u001a\u0004\bk\u0010QR\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0013\u00106\u001a\u0004\u0018\u000107¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\br\u0010s¨\u0006\u009b\u0001"}, m3636d2 = {"Lcom/robinhood/android/futures/ladder/FuturesGenericLadderDataState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderDataState;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "contractId", "Ljava/util/UUID;", "tradeQuantity", "Ljava/math/BigDecimal;", "ladderPriceData", "Lcom/robinhood/android/futures/ladder/data/FuturesLadderPriceData;", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "rhdBuyingPower", "pendingOrders", "", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "pnlCostBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "nextOpenTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "isInTradingSession", "", "hasOrdersForContract", "effectiveClosesRange", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;", "showSettingsBottomSheet", "selectedRowIndex", "", "quantitySelectorOpen", "ladderPriceLevels", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;", "ladderDisplayMode", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;", "zoomInProgress", "selectedPendingOrders", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "orderDraggedOverIndex", "pendingPlacedOrders", "", "pendingReplacedOrders", "pendingOrderIdsInDeletion", "", "pendingOrderDragDirection", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "refIdToTrack", "autoSend", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "ladderFtuxProgressState", "Lcom/robinhood/android/futures/ladder/FuturesLadderFtuxProgressState;", "postTradeLadderFtuxProgressState", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/PostTradeLadderFtuxState;", "ladderMarketSessionChangeState", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/android/futures/ladder/data/FuturesLadderPriceData;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Ljava/math/BigDecimal;Ljava/util/List;Lcom/robinhood/android/models/futures/db/FuturesCostBasis;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;ZLjava/lang/Integer;ZLcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;ZLcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;Ljava/util/UUID;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lcom/robinhood/android/futures/ladder/FuturesLadderFtuxProgressState;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/PostTradeLadderFtuxState;Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;)V", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getContractId", "()Ljava/util/UUID;", "getTradeQuantity", "()Ljava/math/BigDecimal;", "getLadderPriceData", "()Lcom/robinhood/android/futures/ladder/data/FuturesLadderPriceData;", "getAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getProduct", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getRhdBuyingPower", "getPendingOrders", "()Ljava/util/List;", "getPnlCostBasis", "()Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "getNextOpenTradingSession", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasOrdersForContract", "getEffectiveClosesRange", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;", "getShowSettingsBottomSheet", "()Z", "getSelectedRowIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuantitySelectorOpen", "getLadderPriceLevels", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;", "getLadderDisplayMode", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;", "getZoomInProgress", "getSelectedPendingOrders", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "getOrderDraggedOverIndex", "getPendingPlacedOrders", "getPendingReplacedOrders", "getPendingOrderIdsInDeletion", "()Ljava/util/Set;", "getPendingOrderDragDirection", "()Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "getRefIdToTrack", "getAutoSend", "getTimeInForce", "()Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "getLadderFtuxProgressState", "()Lcom/robinhood/android/futures/ladder/FuturesLadderFtuxProgressState;", "getPostTradeLadderFtuxProgressState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/PostTradeLadderFtuxState;", "getLadderMarketSessionChangeState", "()Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/android/futures/ladder/data/FuturesLadderPriceData;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Ljava/math/BigDecimal;Ljava/util/List;Lcom/robinhood/android/models/futures/db/FuturesCostBasis;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;ZLjava/lang/Integer;ZLcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;ZLcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;Ljava/util/UUID;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lcom/robinhood/android/futures/ladder/FuturesLadderFtuxProgressState;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/PostTradeLadderFtuxState;Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;)Lcom/robinhood/android/futures/ladder/FuturesGenericLadderDataState;", "equals", "other", "hashCode", "toString", "", "lib-futures-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesGenericLadderDataState implements BaseLadderDuxo2 {
    public static final int $stable = 8;
    private final FuturesAccount account;
    private final Boolean autoSend;
    private final FuturesContract contract;
    private final UUID contractId;
    private final FuturesClosesRange effectiveClosesRange;
    private final Boolean hasOrdersForContract;
    private final Boolean isInTradingSession;
    private final LadderDisplayMode ladderDisplayMode;
    private final FuturesLadderFtuxProgressState ladderFtuxProgressState;
    private final MarketSessionChangeDataState ladderMarketSessionChangeState;
    private final FuturesLadderPriceData ladderPriceData;
    private final LadderPriceLevels ladderPriceLevels;
    private final FuturesTradingHours.Session nextOpenTradingSession;
    private final Integer orderDraggedOverIndex;
    private final LadderCustomGestureDetector3 pendingOrderDragDirection;
    private final Set<UUID> pendingOrderIdsInDeletion;
    private final List<UiFuturesOrder> pendingOrders;
    private final List<Object> pendingPlacedOrders;
    private final List<Object> pendingReplacedOrders;
    private final FuturesCostBasis pnlCostBasis;
    private final PostTradeLadderFtuxState postTradeLadderFtuxProgressState;
    private final FuturesProduct product;
    private final boolean quantitySelectorOpen;
    private final UUID refIdToTrack;
    private final BigDecimal rhdBuyingPower;
    private final LadderState.LadderData.SelectedPendingOrders selectedPendingOrders;
    private final Integer selectedRowIndex;
    private final boolean showSettingsBottomSheet;
    private final Screen sourceScreen;
    private final FuturesTimeInForce timeInForce;
    private final BigDecimal tradeQuantity;
    private final boolean zoomInProgress;

    public static /* synthetic */ FuturesGenericLadderDataState copy$default(FuturesGenericLadderDataState futuresGenericLadderDataState, Screen screen, UUID uuid, BigDecimal bigDecimal, FuturesLadderPriceData futuresLadderPriceData, FuturesAccount futuresAccount, FuturesContract futuresContract, FuturesProduct futuresProduct, BigDecimal bigDecimal2, List list, FuturesCostBasis futuresCostBasis, FuturesTradingHours.Session session, Boolean bool, Boolean bool2, FuturesClosesRange futuresClosesRange, boolean z, Integer num, boolean z2, LadderPriceLevels ladderPriceLevels, LadderDisplayMode ladderDisplayMode, boolean z3, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer num2, List list2, List list3, Set set, LadderCustomGestureDetector3 ladderCustomGestureDetector3, UUID uuid2, Boolean bool3, FuturesTimeInForce futuresTimeInForce, FuturesLadderFtuxProgressState futuresLadderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxState, MarketSessionChangeDataState marketSessionChangeDataState, int i, Object obj) {
        MarketSessionChangeDataState marketSessionChangeDataState2;
        PostTradeLadderFtuxState postTradeLadderFtuxState2;
        Integer num3;
        boolean z4;
        LadderPriceLevels ladderPriceLevels2;
        LadderDisplayMode ladderDisplayMode2;
        boolean z5;
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders2;
        Integer num4;
        List list4;
        List list5;
        Set set2;
        LadderCustomGestureDetector3 ladderCustomGestureDetector32;
        UUID uuid3;
        Boolean bool4;
        FuturesTimeInForce futuresTimeInForce2;
        FuturesLadderFtuxProgressState futuresLadderFtuxProgressState2;
        boolean z6;
        UUID uuid4;
        BigDecimal bigDecimal3;
        FuturesLadderPriceData futuresLadderPriceData2;
        FuturesAccount futuresAccount2;
        FuturesContract futuresContract2;
        FuturesProduct futuresProduct2;
        BigDecimal bigDecimal4;
        List list6;
        FuturesCostBasis futuresCostBasis2;
        FuturesTradingHours.Session session2;
        Boolean bool5;
        Boolean bool6;
        FuturesClosesRange futuresClosesRange2;
        Screen screen2 = (i & 1) != 0 ? futuresGenericLadderDataState.sourceScreen : screen;
        UUID uuid5 = (i & 2) != 0 ? futuresGenericLadderDataState.contractId : uuid;
        BigDecimal bigDecimal5 = (i & 4) != 0 ? futuresGenericLadderDataState.tradeQuantity : bigDecimal;
        FuturesLadderPriceData futuresLadderPriceData3 = (i & 8) != 0 ? futuresGenericLadderDataState.ladderPriceData : futuresLadderPriceData;
        FuturesAccount futuresAccount3 = (i & 16) != 0 ? futuresGenericLadderDataState.account : futuresAccount;
        FuturesContract futuresContract3 = (i & 32) != 0 ? futuresGenericLadderDataState.contract : futuresContract;
        FuturesProduct futuresProduct3 = (i & 64) != 0 ? futuresGenericLadderDataState.product : futuresProduct;
        BigDecimal bigDecimal6 = (i & 128) != 0 ? futuresGenericLadderDataState.rhdBuyingPower : bigDecimal2;
        List list7 = (i & 256) != 0 ? futuresGenericLadderDataState.pendingOrders : list;
        FuturesCostBasis futuresCostBasis3 = (i & 512) != 0 ? futuresGenericLadderDataState.pnlCostBasis : futuresCostBasis;
        FuturesTradingHours.Session session3 = (i & 1024) != 0 ? futuresGenericLadderDataState.nextOpenTradingSession : session;
        Boolean bool7 = (i & 2048) != 0 ? futuresGenericLadderDataState.isInTradingSession : bool;
        Boolean bool8 = (i & 4096) != 0 ? futuresGenericLadderDataState.hasOrdersForContract : bool2;
        FuturesClosesRange futuresClosesRange3 = (i & 8192) != 0 ? futuresGenericLadderDataState.effectiveClosesRange : futuresClosesRange;
        Screen screen3 = screen2;
        boolean z7 = (i & 16384) != 0 ? futuresGenericLadderDataState.showSettingsBottomSheet : z;
        Integer num5 = (i & 32768) != 0 ? futuresGenericLadderDataState.selectedRowIndex : num;
        boolean z8 = (i & 65536) != 0 ? futuresGenericLadderDataState.quantitySelectorOpen : z2;
        LadderPriceLevels ladderPriceLevels3 = (i & 131072) != 0 ? futuresGenericLadderDataState.ladderPriceLevels : ladderPriceLevels;
        LadderDisplayMode ladderDisplayMode3 = (i & 262144) != 0 ? futuresGenericLadderDataState.ladderDisplayMode : ladderDisplayMode;
        boolean z9 = (i & 524288) != 0 ? futuresGenericLadderDataState.zoomInProgress : z3;
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders3 = (i & 1048576) != 0 ? futuresGenericLadderDataState.selectedPendingOrders : selectedPendingOrders;
        Integer num6 = (i & 2097152) != 0 ? futuresGenericLadderDataState.orderDraggedOverIndex : num2;
        List list8 = (i & 4194304) != 0 ? futuresGenericLadderDataState.pendingPlacedOrders : list2;
        List list9 = (i & 8388608) != 0 ? futuresGenericLadderDataState.pendingReplacedOrders : list3;
        Set set3 = (i & 16777216) != 0 ? futuresGenericLadderDataState.pendingOrderIdsInDeletion : set;
        LadderCustomGestureDetector3 ladderCustomGestureDetector33 = (i & 33554432) != 0 ? futuresGenericLadderDataState.pendingOrderDragDirection : ladderCustomGestureDetector3;
        UUID uuid6 = (i & 67108864) != 0 ? futuresGenericLadderDataState.refIdToTrack : uuid2;
        Boolean bool9 = (i & 134217728) != 0 ? futuresGenericLadderDataState.autoSend : bool3;
        FuturesTimeInForce futuresTimeInForce3 = (i & 268435456) != 0 ? futuresGenericLadderDataState.timeInForce : futuresTimeInForce;
        FuturesLadderFtuxProgressState futuresLadderFtuxProgressState3 = (i & 536870912) != 0 ? futuresGenericLadderDataState.ladderFtuxProgressState : futuresLadderFtuxProgressState;
        PostTradeLadderFtuxState postTradeLadderFtuxState3 = (i & 1073741824) != 0 ? futuresGenericLadderDataState.postTradeLadderFtuxProgressState : postTradeLadderFtuxState;
        if ((i & Integer.MIN_VALUE) != 0) {
            postTradeLadderFtuxState2 = postTradeLadderFtuxState3;
            marketSessionChangeDataState2 = futuresGenericLadderDataState.ladderMarketSessionChangeState;
            z4 = z8;
            ladderPriceLevels2 = ladderPriceLevels3;
            ladderDisplayMode2 = ladderDisplayMode3;
            z5 = z9;
            selectedPendingOrders2 = selectedPendingOrders3;
            num4 = num6;
            list4 = list8;
            list5 = list9;
            set2 = set3;
            ladderCustomGestureDetector32 = ladderCustomGestureDetector33;
            uuid3 = uuid6;
            bool4 = bool9;
            futuresTimeInForce2 = futuresTimeInForce3;
            futuresLadderFtuxProgressState2 = futuresLadderFtuxProgressState3;
            z6 = z7;
            uuid4 = uuid5;
            bigDecimal3 = bigDecimal5;
            futuresLadderPriceData2 = futuresLadderPriceData3;
            futuresAccount2 = futuresAccount3;
            futuresContract2 = futuresContract3;
            futuresProduct2 = futuresProduct3;
            bigDecimal4 = bigDecimal6;
            list6 = list7;
            futuresCostBasis2 = futuresCostBasis3;
            session2 = session3;
            bool5 = bool7;
            bool6 = bool8;
            futuresClosesRange2 = futuresClosesRange3;
            num3 = num5;
        } else {
            marketSessionChangeDataState2 = marketSessionChangeDataState;
            postTradeLadderFtuxState2 = postTradeLadderFtuxState3;
            num3 = num5;
            z4 = z8;
            ladderPriceLevels2 = ladderPriceLevels3;
            ladderDisplayMode2 = ladderDisplayMode3;
            z5 = z9;
            selectedPendingOrders2 = selectedPendingOrders3;
            num4 = num6;
            list4 = list8;
            list5 = list9;
            set2 = set3;
            ladderCustomGestureDetector32 = ladderCustomGestureDetector33;
            uuid3 = uuid6;
            bool4 = bool9;
            futuresTimeInForce2 = futuresTimeInForce3;
            futuresLadderFtuxProgressState2 = futuresLadderFtuxProgressState3;
            z6 = z7;
            uuid4 = uuid5;
            bigDecimal3 = bigDecimal5;
            futuresLadderPriceData2 = futuresLadderPriceData3;
            futuresAccount2 = futuresAccount3;
            futuresContract2 = futuresContract3;
            futuresProduct2 = futuresProduct3;
            bigDecimal4 = bigDecimal6;
            list6 = list7;
            futuresCostBasis2 = futuresCostBasis3;
            session2 = session3;
            bool5 = bool7;
            bool6 = bool8;
            futuresClosesRange2 = futuresClosesRange3;
        }
        return futuresGenericLadderDataState.copy(screen3, uuid4, bigDecimal3, futuresLadderPriceData2, futuresAccount2, futuresContract2, futuresProduct2, bigDecimal4, list6, futuresCostBasis2, session2, bool5, bool6, futuresClosesRange2, z6, num3, z4, ladderPriceLevels2, ladderDisplayMode2, z5, selectedPendingOrders2, num4, list4, list5, set2, ladderCustomGestureDetector32, uuid3, bool4, futuresTimeInForce2, futuresLadderFtuxProgressState2, postTradeLadderFtuxState2, marketSessionChangeDataState2);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component10, reason: from getter */
    public final FuturesCostBasis getPnlCostBasis() {
        return this.pnlCostBasis;
    }

    /* renamed from: component11, reason: from getter */
    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsInTradingSession() {
        return this.isInTradingSession;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getHasOrdersForContract() {
        return this.hasOrdersForContract;
    }

    /* renamed from: component14, reason: from getter */
    public final FuturesClosesRange getEffectiveClosesRange() {
        return this.effectiveClosesRange;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowSettingsBottomSheet() {
        return this.showSettingsBottomSheet;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getSelectedRowIndex() {
        return this.selectedRowIndex;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getQuantitySelectorOpen() {
        return this.quantitySelectorOpen;
    }

    /* renamed from: component18, reason: from getter */
    public final LadderPriceLevels getLadderPriceLevels() {
        return this.ladderPriceLevels;
    }

    /* renamed from: component19, reason: from getter */
    public final LadderDisplayMode getLadderDisplayMode() {
        return this.ladderDisplayMode;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getContractId() {
        return this.contractId;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getZoomInProgress() {
        return this.zoomInProgress;
    }

    /* renamed from: component21, reason: from getter */
    public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
        return this.selectedPendingOrders;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getOrderDraggedOverIndex() {
        return this.orderDraggedOverIndex;
    }

    public final List<Object> component23() {
        return this.pendingPlacedOrders;
    }

    public final List<Object> component24() {
        return this.pendingReplacedOrders;
    }

    public final Set<UUID> component25() {
        return this.pendingOrderIdsInDeletion;
    }

    /* renamed from: component26, reason: from getter */
    public final LadderCustomGestureDetector3 getPendingOrderDragDirection() {
        return this.pendingOrderDragDirection;
    }

    /* renamed from: component27, reason: from getter */
    public final UUID getRefIdToTrack() {
        return this.refIdToTrack;
    }

    /* renamed from: component28, reason: from getter */
    public final Boolean getAutoSend() {
        return this.autoSend;
    }

    /* renamed from: component29, reason: from getter */
    public final FuturesTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getTradeQuantity() {
        return this.tradeQuantity;
    }

    /* renamed from: component30, reason: from getter */
    public final FuturesLadderFtuxProgressState getLadderFtuxProgressState() {
        return this.ladderFtuxProgressState;
    }

    /* renamed from: component31, reason: from getter */
    public final PostTradeLadderFtuxState getPostTradeLadderFtuxProgressState() {
        return this.postTradeLadderFtuxProgressState;
    }

    /* renamed from: component32, reason: from getter */
    public final MarketSessionChangeDataState getLadderMarketSessionChangeState() {
        return this.ladderMarketSessionChangeState;
    }

    /* renamed from: component4, reason: from getter */
    public final FuturesLadderPriceData getLadderPriceData() {
        return this.ladderPriceData;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesAccount getAccount() {
        return this.account;
    }

    /* renamed from: component6, reason: from getter */
    public final FuturesContract getContract() {
        return this.contract;
    }

    /* renamed from: component7, reason: from getter */
    public final FuturesProduct getProduct() {
        return this.product;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getRhdBuyingPower() {
        return this.rhdBuyingPower;
    }

    public final List<UiFuturesOrder> component9() {
        return this.pendingOrders;
    }

    public final FuturesGenericLadderDataState copy(Screen sourceScreen, UUID contractId, BigDecimal tradeQuantity, FuturesLadderPriceData ladderPriceData, FuturesAccount account, FuturesContract contract, FuturesProduct product, BigDecimal rhdBuyingPower, List<UiFuturesOrder> pendingOrders, FuturesCostBasis pnlCostBasis, FuturesTradingHours.Session nextOpenTradingSession, Boolean isInTradingSession, Boolean hasOrdersForContract, FuturesClosesRange effectiveClosesRange, boolean showSettingsBottomSheet, Integer selectedRowIndex, boolean quantitySelectorOpen, LadderPriceLevels ladderPriceLevels, LadderDisplayMode ladderDisplayMode, boolean zoomInProgress, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer orderDraggedOverIndex, List<? extends Object> pendingPlacedOrders, List<? extends Object> pendingReplacedOrders, Set<UUID> pendingOrderIdsInDeletion, LadderCustomGestureDetector3 pendingOrderDragDirection, UUID refIdToTrack, Boolean autoSend, FuturesTimeInForce timeInForce, FuturesLadderFtuxProgressState ladderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxProgressState, MarketSessionChangeDataState ladderMarketSessionChangeState) {
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(tradeQuantity, "tradeQuantity");
        Intrinsics.checkNotNullParameter(ladderPriceData, "ladderPriceData");
        Intrinsics.checkNotNullParameter(ladderDisplayMode, "ladderDisplayMode");
        Intrinsics.checkNotNullParameter(pendingPlacedOrders, "pendingPlacedOrders");
        Intrinsics.checkNotNullParameter(pendingReplacedOrders, "pendingReplacedOrders");
        Intrinsics.checkNotNullParameter(pendingOrderIdsInDeletion, "pendingOrderIdsInDeletion");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(ladderMarketSessionChangeState, "ladderMarketSessionChangeState");
        return new FuturesGenericLadderDataState(sourceScreen, contractId, tradeQuantity, ladderPriceData, account, contract, product, rhdBuyingPower, pendingOrders, pnlCostBasis, nextOpenTradingSession, isInTradingSession, hasOrdersForContract, effectiveClosesRange, showSettingsBottomSheet, selectedRowIndex, quantitySelectorOpen, ladderPriceLevels, ladderDisplayMode, zoomInProgress, selectedPendingOrders, orderDraggedOverIndex, pendingPlacedOrders, pendingReplacedOrders, pendingOrderIdsInDeletion, pendingOrderDragDirection, refIdToTrack, autoSend, timeInForce, ladderFtuxProgressState, postTradeLadderFtuxProgressState, ladderMarketSessionChangeState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesGenericLadderDataState)) {
            return false;
        }
        FuturesGenericLadderDataState futuresGenericLadderDataState = (FuturesGenericLadderDataState) other;
        return Intrinsics.areEqual(this.sourceScreen, futuresGenericLadderDataState.sourceScreen) && Intrinsics.areEqual(this.contractId, futuresGenericLadderDataState.contractId) && Intrinsics.areEqual(this.tradeQuantity, futuresGenericLadderDataState.tradeQuantity) && Intrinsics.areEqual(this.ladderPriceData, futuresGenericLadderDataState.ladderPriceData) && Intrinsics.areEqual(this.account, futuresGenericLadderDataState.account) && Intrinsics.areEqual(this.contract, futuresGenericLadderDataState.contract) && Intrinsics.areEqual(this.product, futuresGenericLadderDataState.product) && Intrinsics.areEqual(this.rhdBuyingPower, futuresGenericLadderDataState.rhdBuyingPower) && Intrinsics.areEqual(this.pendingOrders, futuresGenericLadderDataState.pendingOrders) && Intrinsics.areEqual(this.pnlCostBasis, futuresGenericLadderDataState.pnlCostBasis) && Intrinsics.areEqual(this.nextOpenTradingSession, futuresGenericLadderDataState.nextOpenTradingSession) && Intrinsics.areEqual(this.isInTradingSession, futuresGenericLadderDataState.isInTradingSession) && Intrinsics.areEqual(this.hasOrdersForContract, futuresGenericLadderDataState.hasOrdersForContract) && Intrinsics.areEqual(this.effectiveClosesRange, futuresGenericLadderDataState.effectiveClosesRange) && this.showSettingsBottomSheet == futuresGenericLadderDataState.showSettingsBottomSheet && Intrinsics.areEqual(this.selectedRowIndex, futuresGenericLadderDataState.selectedRowIndex) && this.quantitySelectorOpen == futuresGenericLadderDataState.quantitySelectorOpen && Intrinsics.areEqual(this.ladderPriceLevels, futuresGenericLadderDataState.ladderPriceLevels) && this.ladderDisplayMode == futuresGenericLadderDataState.ladderDisplayMode && this.zoomInProgress == futuresGenericLadderDataState.zoomInProgress && Intrinsics.areEqual(this.selectedPendingOrders, futuresGenericLadderDataState.selectedPendingOrders) && Intrinsics.areEqual(this.orderDraggedOverIndex, futuresGenericLadderDataState.orderDraggedOverIndex) && Intrinsics.areEqual(this.pendingPlacedOrders, futuresGenericLadderDataState.pendingPlacedOrders) && Intrinsics.areEqual(this.pendingReplacedOrders, futuresGenericLadderDataState.pendingReplacedOrders) && Intrinsics.areEqual(this.pendingOrderIdsInDeletion, futuresGenericLadderDataState.pendingOrderIdsInDeletion) && this.pendingOrderDragDirection == futuresGenericLadderDataState.pendingOrderDragDirection && Intrinsics.areEqual(this.refIdToTrack, futuresGenericLadderDataState.refIdToTrack) && Intrinsics.areEqual(this.autoSend, futuresGenericLadderDataState.autoSend) && this.timeInForce == futuresGenericLadderDataState.timeInForce && Intrinsics.areEqual(this.ladderFtuxProgressState, futuresGenericLadderDataState.ladderFtuxProgressState) && this.postTradeLadderFtuxProgressState == futuresGenericLadderDataState.postTradeLadderFtuxProgressState && Intrinsics.areEqual(this.ladderMarketSessionChangeState, futuresGenericLadderDataState.ladderMarketSessionChangeState);
    }

    public int hashCode() {
        int iHashCode = ((((((this.sourceScreen.hashCode() * 31) + this.contractId.hashCode()) * 31) + this.tradeQuantity.hashCode()) * 31) + this.ladderPriceData.hashCode()) * 31;
        FuturesAccount futuresAccount = this.account;
        int iHashCode2 = (iHashCode + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31;
        FuturesContract futuresContract = this.contract;
        int iHashCode3 = (iHashCode2 + (futuresContract == null ? 0 : futuresContract.hashCode())) * 31;
        FuturesProduct futuresProduct = this.product;
        int iHashCode4 = (iHashCode3 + (futuresProduct == null ? 0 : futuresProduct.hashCode())) * 31;
        BigDecimal bigDecimal = this.rhdBuyingPower;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        List<UiFuturesOrder> list = this.pendingOrders;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        FuturesCostBasis futuresCostBasis = this.pnlCostBasis;
        int iHashCode7 = (iHashCode6 + (futuresCostBasis == null ? 0 : futuresCostBasis.hashCode())) * 31;
        FuturesTradingHours.Session session = this.nextOpenTradingSession;
        int iHashCode8 = (iHashCode7 + (session == null ? 0 : session.hashCode())) * 31;
        Boolean bool = this.isInTradingSession;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasOrdersForContract;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FuturesClosesRange futuresClosesRange = this.effectiveClosesRange;
        int iHashCode11 = (((iHashCode10 + (futuresClosesRange == null ? 0 : futuresClosesRange.hashCode())) * 31) + Boolean.hashCode(this.showSettingsBottomSheet)) * 31;
        Integer num = this.selectedRowIndex;
        int iHashCode12 = (((iHashCode11 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.quantitySelectorOpen)) * 31;
        LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
        int iHashCode13 = (((((iHashCode12 + (ladderPriceLevels == null ? 0 : ladderPriceLevels.hashCode())) * 31) + this.ladderDisplayMode.hashCode()) * 31) + Boolean.hashCode(this.zoomInProgress)) * 31;
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = this.selectedPendingOrders;
        int iHashCode14 = (iHashCode13 + (selectedPendingOrders == null ? 0 : selectedPendingOrders.hashCode())) * 31;
        Integer num2 = this.orderDraggedOverIndex;
        int iHashCode15 = (((((((iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.pendingPlacedOrders.hashCode()) * 31) + this.pendingReplacedOrders.hashCode()) * 31) + this.pendingOrderIdsInDeletion.hashCode()) * 31;
        LadderCustomGestureDetector3 ladderCustomGestureDetector3 = this.pendingOrderDragDirection;
        int iHashCode16 = (iHashCode15 + (ladderCustomGestureDetector3 == null ? 0 : ladderCustomGestureDetector3.hashCode())) * 31;
        UUID uuid = this.refIdToTrack;
        int iHashCode17 = (iHashCode16 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Boolean bool3 = this.autoSend;
        int iHashCode18 = (((iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.timeInForce.hashCode()) * 31;
        FuturesLadderFtuxProgressState futuresLadderFtuxProgressState = this.ladderFtuxProgressState;
        int iHashCode19 = (iHashCode18 + (futuresLadderFtuxProgressState == null ? 0 : futuresLadderFtuxProgressState.hashCode())) * 31;
        PostTradeLadderFtuxState postTradeLadderFtuxState = this.postTradeLadderFtuxProgressState;
        return ((iHashCode19 + (postTradeLadderFtuxState != null ? postTradeLadderFtuxState.hashCode() : 0)) * 31) + this.ladderMarketSessionChangeState.hashCode();
    }

    public String toString() {
        return "FuturesGenericLadderDataState(sourceScreen=" + this.sourceScreen + ", contractId=" + this.contractId + ", tradeQuantity=" + this.tradeQuantity + ", ladderPriceData=" + this.ladderPriceData + ", account=" + this.account + ", contract=" + this.contract + ", product=" + this.product + ", rhdBuyingPower=" + this.rhdBuyingPower + ", pendingOrders=" + this.pendingOrders + ", pnlCostBasis=" + this.pnlCostBasis + ", nextOpenTradingSession=" + this.nextOpenTradingSession + ", isInTradingSession=" + this.isInTradingSession + ", hasOrdersForContract=" + this.hasOrdersForContract + ", effectiveClosesRange=" + this.effectiveClosesRange + ", showSettingsBottomSheet=" + this.showSettingsBottomSheet + ", selectedRowIndex=" + this.selectedRowIndex + ", quantitySelectorOpen=" + this.quantitySelectorOpen + ", ladderPriceLevels=" + this.ladderPriceLevels + ", ladderDisplayMode=" + this.ladderDisplayMode + ", zoomInProgress=" + this.zoomInProgress + ", selectedPendingOrders=" + this.selectedPendingOrders + ", orderDraggedOverIndex=" + this.orderDraggedOverIndex + ", pendingPlacedOrders=" + this.pendingPlacedOrders + ", pendingReplacedOrders=" + this.pendingReplacedOrders + ", pendingOrderIdsInDeletion=" + this.pendingOrderIdsInDeletion + ", pendingOrderDragDirection=" + this.pendingOrderDragDirection + ", refIdToTrack=" + this.refIdToTrack + ", autoSend=" + this.autoSend + ", timeInForce=" + this.timeInForce + ", ladderFtuxProgressState=" + this.ladderFtuxProgressState + ", postTradeLadderFtuxProgressState=" + this.postTradeLadderFtuxProgressState + ", ladderMarketSessionChangeState=" + this.ladderMarketSessionChangeState + ")";
    }

    public FuturesGenericLadderDataState(Screen sourceScreen, UUID contractId, BigDecimal tradeQuantity, FuturesLadderPriceData ladderPriceData, FuturesAccount futuresAccount, FuturesContract futuresContract, FuturesProduct futuresProduct, BigDecimal bigDecimal, List<UiFuturesOrder> list, FuturesCostBasis futuresCostBasis, FuturesTradingHours.Session session, Boolean bool, Boolean bool2, FuturesClosesRange futuresClosesRange, boolean z, Integer num, boolean z2, LadderPriceLevels ladderPriceLevels, LadderDisplayMode ladderDisplayMode, boolean z3, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer num2, List<? extends Object> pendingPlacedOrders, List<? extends Object> pendingReplacedOrders, Set<UUID> pendingOrderIdsInDeletion, LadderCustomGestureDetector3 ladderCustomGestureDetector3, UUID uuid, Boolean bool3, FuturesTimeInForce timeInForce, FuturesLadderFtuxProgressState futuresLadderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxState, MarketSessionChangeDataState ladderMarketSessionChangeState) {
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(tradeQuantity, "tradeQuantity");
        Intrinsics.checkNotNullParameter(ladderPriceData, "ladderPriceData");
        Intrinsics.checkNotNullParameter(ladderDisplayMode, "ladderDisplayMode");
        Intrinsics.checkNotNullParameter(pendingPlacedOrders, "pendingPlacedOrders");
        Intrinsics.checkNotNullParameter(pendingReplacedOrders, "pendingReplacedOrders");
        Intrinsics.checkNotNullParameter(pendingOrderIdsInDeletion, "pendingOrderIdsInDeletion");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(ladderMarketSessionChangeState, "ladderMarketSessionChangeState");
        this.sourceScreen = sourceScreen;
        this.contractId = contractId;
        this.tradeQuantity = tradeQuantity;
        this.ladderPriceData = ladderPriceData;
        this.account = futuresAccount;
        this.contract = futuresContract;
        this.product = futuresProduct;
        this.rhdBuyingPower = bigDecimal;
        this.pendingOrders = list;
        this.pnlCostBasis = futuresCostBasis;
        this.nextOpenTradingSession = session;
        this.isInTradingSession = bool;
        this.hasOrdersForContract = bool2;
        this.effectiveClosesRange = futuresClosesRange;
        this.showSettingsBottomSheet = z;
        this.selectedRowIndex = num;
        this.quantitySelectorOpen = z2;
        this.ladderPriceLevels = ladderPriceLevels;
        this.ladderDisplayMode = ladderDisplayMode;
        this.zoomInProgress = z3;
        this.selectedPendingOrders = selectedPendingOrders;
        this.orderDraggedOverIndex = num2;
        this.pendingPlacedOrders = pendingPlacedOrders;
        this.pendingReplacedOrders = pendingReplacedOrders;
        this.pendingOrderIdsInDeletion = pendingOrderIdsInDeletion;
        this.pendingOrderDragDirection = ladderCustomGestureDetector3;
        this.refIdToTrack = uuid;
        this.autoSend = bool3;
        this.timeInForce = timeInForce;
        this.ladderFtuxProgressState = futuresLadderFtuxProgressState;
        this.postTradeLadderFtuxProgressState = postTradeLadderFtuxState;
        this.ladderMarketSessionChangeState = ladderMarketSessionChangeState;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final UUID getContractId() {
        return this.contractId;
    }

    public final BigDecimal getTradeQuantity() {
        return this.tradeQuantity;
    }

    public /* synthetic */ FuturesGenericLadderDataState(Screen screen, UUID uuid, BigDecimal bigDecimal, FuturesLadderPriceData futuresLadderPriceData, FuturesAccount futuresAccount, FuturesContract futuresContract, FuturesProduct futuresProduct, BigDecimal bigDecimal2, List list, FuturesCostBasis futuresCostBasis, FuturesTradingHours.Session session, Boolean bool, Boolean bool2, FuturesClosesRange futuresClosesRange, boolean z, Integer num, boolean z2, LadderPriceLevels ladderPriceLevels, LadderDisplayMode ladderDisplayMode, boolean z3, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer num2, List list2, List list3, Set set, LadderCustomGestureDetector3 ladderCustomGestureDetector3, UUID uuid2, Boolean bool3, FuturesTimeInForce futuresTimeInForce, FuturesLadderFtuxProgressState futuresLadderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxState, MarketSessionChangeDataState marketSessionChangeDataState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(screen, uuid, bigDecimal, (i & 8) != 0 ? new FuturesLadderPriceData(null, null, null, null, null, null, null, false, 255, null) : futuresLadderPriceData, (i & 16) != 0 ? null : futuresAccount, (i & 32) != 0 ? null : futuresContract, (i & 64) != 0 ? null : futuresProduct, (i & 128) != 0 ? null : bigDecimal2, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : futuresCostBasis, (i & 1024) != 0 ? null : session, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : futuresClosesRange, (i & 16384) != 0 ? false : z, (32768 & i) != 0 ? null : num, (65536 & i) != 0 ? false : z2, (131072 & i) != 0 ? null : ladderPriceLevels, (262144 & i) != 0 ? LadderDisplayMode.PRICE : ladderDisplayMode, (524288 & i) != 0 ? false : z3, (1048576 & i) != 0 ? null : selectedPendingOrders, (2097152 & i) != 0 ? null : num2, (4194304 & i) != 0 ? CollectionsKt.emptyList() : list2, (8388608 & i) != 0 ? CollectionsKt.emptyList() : list3, (16777216 & i) != 0 ? SetsKt.emptySet() : set, (33554432 & i) != 0 ? null : ladderCustomGestureDetector3, (67108864 & i) != 0 ? null : uuid2, (134217728 & i) != 0 ? null : bool3, (268435456 & i) != 0 ? FuturesTimeInForce.GFD : futuresTimeInForce, (536870912 & i) != 0 ? null : futuresLadderFtuxProgressState, (1073741824 & i) != 0 ? null : postTradeLadderFtuxState, (i & Integer.MIN_VALUE) != 0 ? new MarketSessionChangeDataState(null, null, 3, null) : marketSessionChangeDataState);
    }

    public final FuturesLadderPriceData getLadderPriceData() {
        return this.ladderPriceData;
    }

    public final FuturesAccount getAccount() {
        return this.account;
    }

    public final FuturesContract getContract() {
        return this.contract;
    }

    public final FuturesProduct getProduct() {
        return this.product;
    }

    public final BigDecimal getRhdBuyingPower() {
        return this.rhdBuyingPower;
    }

    public final List<UiFuturesOrder> getPendingOrders() {
        return this.pendingOrders;
    }

    public final FuturesCostBasis getPnlCostBasis() {
        return this.pnlCostBasis;
    }

    public final FuturesTradingHours.Session getNextOpenTradingSession() {
        return this.nextOpenTradingSession;
    }

    public final Boolean isInTradingSession() {
        return this.isInTradingSession;
    }

    public final Boolean getHasOrdersForContract() {
        return this.hasOrdersForContract;
    }

    public final FuturesClosesRange getEffectiveClosesRange() {
        return this.effectiveClosesRange;
    }

    public final boolean getShowSettingsBottomSheet() {
        return this.showSettingsBottomSheet;
    }

    public final Integer getSelectedRowIndex() {
        return this.selectedRowIndex;
    }

    public final boolean getQuantitySelectorOpen() {
        return this.quantitySelectorOpen;
    }

    public final LadderPriceLevels getLadderPriceLevels() {
        return this.ladderPriceLevels;
    }

    public final LadderDisplayMode getLadderDisplayMode() {
        return this.ladderDisplayMode;
    }

    public final boolean getZoomInProgress() {
        return this.zoomInProgress;
    }

    public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
        return this.selectedPendingOrders;
    }

    public final Integer getOrderDraggedOverIndex() {
        return this.orderDraggedOverIndex;
    }

    public final List<Object> getPendingPlacedOrders() {
        return this.pendingPlacedOrders;
    }

    public final List<Object> getPendingReplacedOrders() {
        return this.pendingReplacedOrders;
    }

    public final Set<UUID> getPendingOrderIdsInDeletion() {
        return this.pendingOrderIdsInDeletion;
    }

    public final LadderCustomGestureDetector3 getPendingOrderDragDirection() {
        return this.pendingOrderDragDirection;
    }

    public final UUID getRefIdToTrack() {
        return this.refIdToTrack;
    }

    public final Boolean getAutoSend() {
        return this.autoSend;
    }

    public final FuturesTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final FuturesLadderFtuxProgressState getLadderFtuxProgressState() {
        return this.ladderFtuxProgressState;
    }

    public final PostTradeLadderFtuxState getPostTradeLadderFtuxProgressState() {
        return this.postTradeLadderFtuxProgressState;
    }

    public final MarketSessionChangeDataState getLadderMarketSessionChangeState() {
        return this.ladderMarketSessionChangeState;
    }
}
