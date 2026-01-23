package com.robinhood.android.equitytradeladder;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.equities.equitytrade.EquityTradeButtonState;
import com.robinhood.android.equitytradeladder.EquityTradeLadderViewState;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.android.equitytradeladder.bin.EquityTradeLadderBinManager;
import com.robinhood.android.equitytradeladder.extensions.EquityOrders;
import com.robinhood.android.equitytradeladder.extensions.InstrumentBuyingPower2;
import com.robinhood.android.equitytradeladder.extensions.PendingOrder2;
import com.robinhood.android.equitytradeladder.marketsession.MarketSessionChangeDataState;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState;
import com.robinhood.android.equitytradeladder.models.EquityPendingOrder3;
import com.robinhood.android.equitytradeladder.models.PendingPlacedOrder;
import com.robinhood.android.equitytradeladder.models.PendingReplacedOrder;
import com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.eventlogging.EquitiesLadderContext;
import com.robinhood.rosetta.eventlogging.PnlDisplayMode;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.extensions.Moneys4;
import com.robinhood.shared.tradeladder.p398ui.ladder.BaseLadderDuxo2;
import com.robinhood.shared.tradeladder.p398ui.ladder.constants.Constants7;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.AverageCost;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.Bins;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.OrderPills;
import com.robinhood.shared.tradeladder.p398ui.ladder.ftux.GenericLadderFtuxProgressState;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.math.AlphaFraction;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderDisplayMode;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceData;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels5;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderTrigger;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.OrderType;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.DayPnlInfo;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar.TitleContentState;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EquityTradeLadderDataState.kt */
@Metadata(m3635d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0010\u0000\n\u0002\b\\\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ö\u00022\u00020\u0001:\u0002ö\u0002B¯\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020&\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020)\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u00107\u001a\u000206\u0012\b\b\u0002\u00109\u001a\u000208\u0012\b\b\u0002\u0010:\u001a\u00020!\u0012\b\b\u0002\u0010;\u001a\u00020!\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010?\u001a\u00020!\u0012\b\b\u0002\u0010@\u001a\u00020\u0016\u0012\b\b\u0002\u0010B\u001a\u00020A\u0012\b\b\u0002\u0010C\u001a\u00020!\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010G\u001a\u00020!\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\b\b\u0002\u0010J\u001a\u00020!\u0012\b\b\u0002\u0010K\u001a\u00020!\u0012\b\b\u0002\u0010L\u001a\u00020!\u0012\b\b\u0002\u0010M\u001a\u00020!\u0012\b\b\u0002\u0010N\u001a\u00020!\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\u0014\b\u0002\u0010S\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0\u0014\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T\u0012\b\b\u0002\u0010V\u001a\u00020!\u0012\b\b\u0002\u0010W\u001a\u00020!\u0012\b\b\u0002\u0010X\u001a\u00020!\u0012\b\b\u0002\u0010Y\u001a\u00020!\u0012\b\b\u0002\u0010Z\u001a\u00020!\u0012\b\b\u0002\u0010[\u001a\u00020!\u0012\b\b\u0002\u0010\\\u001a\u00020!\u0012\b\b\u0002\u0010]\u001a\u00020!¢\u0006\u0004\b^\u0010_J\u0011\u0010a\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010f\u001a\u00020cH\u0000¢\u0006\u0004\bd\u0010eJ\u000f\u0010j\u001a\u00020gH\u0000¢\u0006\u0004\bh\u0010iJ\u000f\u0010n\u001a\u00020kH\u0000¢\u0006\u0004\bl\u0010mJ\u000f\u0010r\u001a\u00020oH\u0000¢\u0006\u0004\bp\u0010qJ\u000f\u0010v\u001a\u00020sH\u0000¢\u0006\u0004\bt\u0010uJ)\u0010|\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\u00152\u0006\u0010x\u001a\u00020\u00152\b\u0010y\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\bz\u0010{J\u0019\u0010\u007f\u001a\u00020\u00022\b\u0010y\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b}\u0010~J \u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u0001H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J&\u0010\u008b\u0001\u001a\u00020\u00152\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u0001H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0013\u0010\u0093\u0001\u001a\u00030\u0090\u0001H\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0015\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J \u0010\u0099\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0083\u0001JK\u0010\u009f\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\u0007\u0010\u009a\u0001\u001a\u00020!2\u000b\b\u0002\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00162\t\b\u0002\u0010\u009c\u0001\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J)\u0010¥\u0001\u001a\u00020\u00002\t\b\u0002\u0010 \u0001\u001a\u00020\u00102\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001H\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0010\u0010¦\u0001\u001a\u00020\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0015\u0010ª\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0015\u0010®\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0015\u0010°\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0015\u0010²\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0015\u0010´\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0013\u0010¶\u0001\u001a\u00020\u0010HÆ\u0003¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001f\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014HÆ\u0003¢\u0006\u0006\bº\u0001\u0010\u0083\u0001J\u0015\u0010»\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0015\u0010½\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001b\u0010¿\u0001\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0015\u0010Á\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0013\u0010Ã\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0013\u0010Å\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bÅ\u0001\u0010Ä\u0001J\u0013\u0010Æ\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bÆ\u0001\u0010Ä\u0001J\u0015\u0010Ç\u0001\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0013\u0010É\u0001\u001a\u00020&HÆ\u0003¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0013\u0010Ë\u0001\u001a\u00020&HÆ\u0003¢\u0006\u0006\bË\u0001\u0010Ê\u0001J\u0013\u0010Ì\u0001\u001a\u00020)HÆ\u0003¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u0013\u0010Î\u0001\u001a\u00020)HÆ\u0003¢\u0006\u0006\bÎ\u0001\u0010Í\u0001J\u0015\u0010Ï\u0001\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0013\u0010Ñ\u0001\u001a\u00020.HÆ\u0003¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u0015\u0010Ó\u0001\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0015\u0010Õ\u0001\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0013\u0010×\u0001\u001a\u000204HÆ\u0003¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u0013\u0010Ù\u0001\u001a\u000206HÆ\u0003¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0013\u0010Û\u0001\u001a\u000208HÆ\u0003¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0013\u0010Ý\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bÝ\u0001\u0010Ä\u0001J\u0013\u0010Þ\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bÞ\u0001\u0010Ä\u0001J\u0015\u0010ß\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0006\bß\u0001\u0010à\u0001J\u0015\u0010á\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0006\bá\u0001\u0010à\u0001J\u0015\u0010â\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u0013\u0010ä\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bä\u0001\u0010Ä\u0001J\u0013\u0010å\u0001\u001a\u00020\u0016HÆ\u0003¢\u0006\u0006\bå\u0001\u0010ã\u0001J\u0013\u0010æ\u0001\u001a\u00020AHÆ\u0003¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u0013\u0010è\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bè\u0001\u0010Ä\u0001J\u0015\u0010é\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0006\bé\u0001\u0010à\u0001J\u0015\u0010ê\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0006\bê\u0001\u0010ã\u0001J\u0015\u0010ë\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0006\bë\u0001\u0010à\u0001J\u0013\u0010ì\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bì\u0001\u0010Ä\u0001J\u0015\u0010í\u0001\u001a\u0004\u0018\u00010HHÆ\u0003¢\u0006\u0006\bí\u0001\u0010î\u0001J\u0013\u0010ï\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bï\u0001\u0010Ä\u0001J\u0013\u0010ð\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bð\u0001\u0010Ä\u0001J\u0013\u0010ñ\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bñ\u0001\u0010Ä\u0001J\u0013\u0010ò\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bò\u0001\u0010Ä\u0001J\u0013\u0010ó\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bó\u0001\u0010Ä\u0001J\u0015\u0010ô\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0006\bô\u0001\u0010à\u0001J\u0015\u0010õ\u0001\u001a\u0004\u0018\u00010PHÆ\u0003¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001f\u0010÷\u0001\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0\u0014HÆ\u0003¢\u0006\u0006\b÷\u0001\u0010\u0083\u0001J\u0015\u0010ø\u0001\u001a\u0004\u0018\u00010THÆ\u0003¢\u0006\u0006\bø\u0001\u0010ù\u0001J\u0013\u0010ú\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bú\u0001\u0010Ä\u0001J\u0013\u0010û\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bû\u0001\u0010Ä\u0001J\u0013\u0010ü\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bü\u0001\u0010Ä\u0001J\u0013\u0010ý\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bý\u0001\u0010Ä\u0001J\u0013\u0010þ\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bþ\u0001\u0010Ä\u0001J\u0013\u0010ÿ\u0001\u001a\u00020!HÆ\u0003¢\u0006\u0006\bÿ\u0001\u0010Ä\u0001J\u0013\u0010\u0080\u0002\u001a\u00020!HÆ\u0003¢\u0006\u0006\b\u0080\u0002\u0010Ä\u0001J\u0013\u0010\u0081\u0002\u001a\u00020!HÆ\u0003¢\u0006\u0006\b\u0081\u0002\u0010Ä\u0001J½\u0005\u0010\u0082\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020!2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010@\u001a\u00020\u00162\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020!2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010G\u001a\u00020!2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\b\b\u0002\u0010J\u001a\u00020!2\b\b\u0002\u0010K\u001a\u00020!2\b\b\u0002\u0010L\u001a\u00020!2\b\b\u0002\u0010M\u001a\u00020!2\b\b\u0002\u0010N\u001a\u00020!2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P2\u0014\b\u0002\u0010S\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0\u00142\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010V\u001a\u00020!2\b\b\u0002\u0010W\u001a\u00020!2\b\b\u0002\u0010X\u001a\u00020!2\b\b\u0002\u0010Y\u001a\u00020!2\b\b\u0002\u0010Z\u001a\u00020!2\b\b\u0002\u0010[\u001a\u00020!2\b\b\u0002\u0010\\\u001a\u00020!2\b\b\u0002\u0010]\u001a\u00020!HÆ\u0001¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\u0013\u0010\u0084\u0002\u001a\u00020\u0002HÖ\u0001¢\u0006\u0006\b\u0084\u0002\u0010©\u0001J\u0013\u0010\u0085\u0002\u001a\u00020\u0015HÖ\u0001¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u001f\u0010\u0089\u0002\u001a\u00020!2\n\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0087\u0002HÖ\u0003¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010©\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010«\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010\u008f\u0002\u001a\u0006\b\u0090\u0002\u0010\u00ad\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0005\b\t\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010¯\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010±\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\r\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010³\u0001R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000f\n\u0005\b\u000f\u0010\u0097\u0002\u001a\u0006\b\u0098\u0002\u0010µ\u0001R\u001a\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u000f\n\u0005\b\u0011\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010·\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u000f\n\u0005\b\u0013\u0010\u009b\u0002\u001a\u0006\b\u009c\u0002\u0010¹\u0001R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0006¢\u0006\u000f\n\u0005\b\u0017\u0010\u009d\u0002\u001a\u0006\b\u0099\u0001\u0010\u0083\u0001R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000f\n\u0005\b\u0019\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010¼\u0001R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000f\n\u0005\b\u001b\u0010 \u0002\u001a\u0006\b¡\u0002\u0010¾\u0001R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006¢\u0006\u000f\n\u0005\b\u001e\u0010¢\u0002\u001a\u0006\b\u0084\u0001\u0010À\u0001R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000f\n\u0005\b \u0010£\u0002\u001a\u0006\b¤\u0002\u0010Â\u0001R\u001a\u0010\"\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b\"\u0010¥\u0002\u001a\u0006\b¦\u0002\u0010Ä\u0001R\u001a\u0010#\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b#\u0010¥\u0002\u001a\u0006\b§\u0002\u0010Ä\u0001R\u001a\u0010$\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b$\u0010¥\u0002\u001a\u0006\b¨\u0002\u0010Ä\u0001R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000f\n\u0005\b%\u0010©\u0002\u001a\u0006\bª\u0002\u0010È\u0001R\u001a\u0010'\u001a\u00020&8\u0006¢\u0006\u000f\n\u0005\b'\u0010«\u0002\u001a\u0006\b¬\u0002\u0010Ê\u0001R\u001a\u0010(\u001a\u00020&8\u0006¢\u0006\u000f\n\u0005\b(\u0010«\u0002\u001a\u0006\b\u00ad\u0002\u0010Ê\u0001R\u001a\u0010*\u001a\u00020)8\u0006¢\u0006\u000f\n\u0005\b*\u0010®\u0002\u001a\u0006\b¯\u0002\u0010Í\u0001R\u001a\u0010+\u001a\u00020)8\u0006¢\u0006\u000f\n\u0005\b+\u0010®\u0002\u001a\u0006\b°\u0002\u0010Í\u0001R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u000f\n\u0005\b-\u0010±\u0002\u001a\u0006\b²\u0002\u0010Ð\u0001R\u001a\u0010/\u001a\u00020.8\u0006¢\u0006\u000f\n\u0005\b/\u0010³\u0002\u001a\u0006\b´\u0002\u0010Ò\u0001R\u001c\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000f\n\u0005\b1\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010Ô\u0001R\u001c\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\u000f\n\u0005\b3\u0010·\u0002\u001a\u0006\b¸\u0002\u0010Ö\u0001R\u001a\u00105\u001a\u0002048\u0006¢\u0006\u000f\n\u0005\b5\u0010¹\u0002\u001a\u0006\bº\u0002\u0010Ø\u0001R\u001a\u00107\u001a\u0002068\u0006¢\u0006\u000f\n\u0005\b7\u0010»\u0002\u001a\u0006\b¼\u0002\u0010Ú\u0001R\u001a\u00109\u001a\u0002088\u0006¢\u0006\u000f\n\u0005\b9\u0010½\u0002\u001a\u0006\b¾\u0002\u0010Ü\u0001R\u001a\u0010:\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b:\u0010¥\u0002\u001a\u0006\b¿\u0002\u0010Ä\u0001R\u001a\u0010;\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b;\u0010¥\u0002\u001a\u0006\bÀ\u0002\u0010Ä\u0001R\u001c\u0010<\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\b<\u0010Á\u0002\u001a\u0006\bÂ\u0002\u0010à\u0001R\u001c\u0010=\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\b=\u0010Á\u0002\u001a\u0006\bÃ\u0002\u0010à\u0001R\u001c\u0010>\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\u000f\n\u0005\b>\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010ã\u0001R\u001a\u0010?\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b?\u0010¥\u0002\u001a\u0006\bÆ\u0002\u0010Ä\u0001R\u001a\u0010@\u001a\u00020\u00168\u0006¢\u0006\u000f\n\u0005\b@\u0010Ä\u0002\u001a\u0006\bÇ\u0002\u0010ã\u0001R\u001a\u0010B\u001a\u00020A8\u0006¢\u0006\u000f\n\u0005\bB\u0010È\u0002\u001a\u0006\bÉ\u0002\u0010ç\u0001R\u001a\u0010C\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bC\u0010¥\u0002\u001a\u0006\bÊ\u0002\u0010Ä\u0001R\u001c\u0010D\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\bD\u0010Á\u0002\u001a\u0006\bË\u0002\u0010à\u0001R\u001c\u0010E\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\u000f\n\u0005\bE\u0010Ä\u0002\u001a\u0006\bÌ\u0002\u0010ã\u0001R\u001c\u0010F\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\bF\u0010Á\u0002\u001a\u0006\bÍ\u0002\u0010à\u0001R\u001a\u0010G\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bG\u0010¥\u0002\u001a\u0006\bÎ\u0002\u0010Ä\u0001R\u001c\u0010I\u001a\u0004\u0018\u00010H8\u0006¢\u0006\u000f\n\u0005\bI\u0010Ï\u0002\u001a\u0006\bÐ\u0002\u0010î\u0001R\u001a\u0010J\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bJ\u0010¥\u0002\u001a\u0006\bÑ\u0002\u0010Ä\u0001R\u001a\u0010K\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bK\u0010¥\u0002\u001a\u0006\bÒ\u0002\u0010Ä\u0001R\u001a\u0010L\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bL\u0010¥\u0002\u001a\u0006\bÓ\u0002\u0010Ä\u0001R\u001a\u0010M\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bM\u0010¥\u0002\u001a\u0006\bÔ\u0002\u0010Ä\u0001R\u001a\u0010N\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bN\u0010¥\u0002\u001a\u0006\bÕ\u0002\u0010Ä\u0001R\u001c\u0010O\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\bO\u0010Á\u0002\u001a\u0006\bÖ\u0002\u0010à\u0001R\u001c\u0010Q\u001a\u0004\u0018\u00010P8\u0006¢\u0006\u000f\n\u0005\bQ\u0010×\u0002\u001a\u0006\bØ\u0002\u0010ö\u0001R&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0\u00148\u0006¢\u0006\u000f\n\u0005\bS\u0010\u009d\u0002\u001a\u0006\bÙ\u0002\u0010\u0083\u0001R\u001c\u0010U\u001a\u0004\u0018\u00010T8\u0006¢\u0006\u000f\n\u0005\bU\u0010Ú\u0002\u001a\u0006\bÛ\u0002\u0010ù\u0001R\u001a\u0010V\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bV\u0010¥\u0002\u001a\u0006\bÜ\u0002\u0010Ä\u0001R\u001a\u0010W\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bW\u0010¥\u0002\u001a\u0006\bÝ\u0002\u0010Ä\u0001R\u001a\u0010X\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bX\u0010¥\u0002\u001a\u0006\bÞ\u0002\u0010Ä\u0001R\u001a\u0010Y\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bY\u0010¥\u0002\u001a\u0006\bß\u0002\u0010Ä\u0001R\u001a\u0010Z\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\bZ\u0010¥\u0002\u001a\u0006\bà\u0002\u0010Ä\u0001R\u001a\u0010[\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b[\u0010¥\u0002\u001a\u0006\bá\u0002\u0010Ä\u0001R\u001a\u0010\\\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b\\\u0010¥\u0002\u001a\u0006\bâ\u0002\u0010Ä\u0001R\u001a\u0010]\u001a\u00020!8\u0006¢\u0006\u000f\n\u0005\b]\u0010¥\u0002\u001a\u0006\bã\u0002\u0010Ä\u0001R\u001d\u0010å\u0002\u001a\u00030ä\u00028\u0006¢\u0006\u0010\n\u0006\bå\u0002\u0010æ\u0002\u001a\u0006\bç\u0002\u0010è\u0002R\u001c\u0010é\u0002\u001a\u00020!8\u0006¢\u0006\u0010\n\u0006\bé\u0002\u0010¥\u0002\u001a\u0006\bê\u0002\u0010Ä\u0001R\u001f\u0010ë\u0002\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bë\u0002\u0010¥\u0002\u001a\u0006\bì\u0002\u0010Ä\u0001R \u0010í\u0002\u001a\u0004\u0018\u00010`8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\bí\u0002\u0010î\u0002\u001a\u0005\bï\u0002\u0010bR\u0014\u0010ñ\u0002\u001a\u00020!8F¢\u0006\b\u001a\u0006\bð\u0002\u0010Ä\u0001R\u0014\u0010ó\u0002\u001a\u00020!8F¢\u0006\b\u001a\u0006\bò\u0002\u0010Ä\u0001R\u0014\u0010õ\u0002\u001a\u00020!8F¢\u0006\b\u001a\u0006\bô\u0002\u0010Ä\u0001¨\u0006÷\u0002"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;", "Lcom/robinhood/shared/tradeladder/ui/ladder/ILadderDataState;", "", "instrumentId", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "ladderFtuxProgressState", "Lcom/robinhood/utils/resource/StringResource;", "accountDisplayName", "Lcom/robinhood/models/db/Quote;", "brokebackQuote", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "buyingPower", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceData;", "ladderPriceData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;", "ladderPriceLevels", "", "", "Ljava/math/BigDecimal;", "zoomOverlayData", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "nbboSummary", "", "Lcom/robinhood/models/db/Order;", "pendingOrders", "Lcom/robinhood/models/db/Position;", "position", "", "shortingEnabled", "instrumentExternalHalt", "instrumentInternalHalt", "autoSend", "Lcom/robinhood/models/db/OrderTimeInForce;", "longTimeInForce", "shortTimeInForce", "Lcom/robinhood/models/db/OrderMarketHours;", "longOrderMarketHours", "shortOrderMarketHours", "Ljava/util/UUID;", "refIdToTrack", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/common/buysell/BuySellData;", "buySellData", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "shortingInfo", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "ladderScreenState", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;", "ladderDisplayMode", "Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;", "ladderMarketSessionChangeState", "nbboLoading", "quantitySelectorOpen", "mostRecentSelectedRowIndex", "selectedRowIndex", "selectedRowPrice", "showSettingsBottomSheet", "tradeQuantity", "Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "quantityInputMode", "zoomInProgress", "zoomInitialCenterIndex", "zoomInitialCenterPrice", "zoomInitialNumberOfItems", "tradeInFlight", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "postTradeLadderFtuxState", "flattenLoading", "marketBuyLoading", "marketSellLoading", "pnlRetirementEnabled", "shouldShowL2DataMissingBanner", "orderDraggedOverIndex", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "pendingOrderDragDirection", "Lcom/robinhood/android/equitytradeladder/models/PendingOrder;", "uiPendingOrdersMap", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "selectedPendingOrders", "showQuantitySelector", "showSubmitBuy", "showSubmitSell", "etfSupported", "marketBuysEnabled", "subzeroEnabled", "autoSendKillSwitchEnabled", "shouldShowAutoSendUpsell", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceData;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;Ljava/util/Map;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/nbbo/models/db/NbboSummary;Ljava/util/List;Lcom/robinhood/models/db/Position;ZZZLjava/lang/Boolean;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Ljava/util/UUID;Lj$/time/Clock;Lcom/robinhood/android/common/buysell/BuySellData;Lcom/robinhood/shared/equities/subzero/ShortingInfo;Lcom/robinhood/android/equitytradeladder/LadderScreenState;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;ZLjava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;ZLcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;ZZZZZLjava/lang/Integer;Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;Ljava/util/Map;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;ZZZZZZZZ)V", "Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;", "buildOrderState", "()Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;", "getTopBarData$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$TopBarData;", "getTopBarData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$MarketClosedHeaderData;", "getMarketClosedHeaderData$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$MarketClosedHeaderData;", "getMarketClosedHeaderData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$L2DataUnavailableHeaderData;", "getL2DataUnavailableHeaderData$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$L2DataUnavailableHeaderData;", "getL2DataUnavailableHeaderData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$InstrumentHaltedHeaderData;", "getInstrumentHaltedHeaderData$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$InstrumentHaltedHeaderData;", "getInstrumentHaltedHeaderData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "getLadderState$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState;", "getLadderState", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "lastPriceIndex", "openPnlCostBasis", "getPriceText$feature_equity_trade_ladder_externalDebug", "(IILjava/math/BigDecimal;)Ljava/lang/String;", "getPriceText", "getSelectedPriceText$feature_equity_trade_ladder_externalDebug", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "getSelectedPriceText", "", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$PendingOrderRow;", "getPendingOrders$feature_equity_trade_ladder_externalDebug", "()Ljava/util/Map;", "getPendingOrders", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;", "orderType", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;", "orderTrigger", "getSellOrderLabel$feature_equity_trade_ladder_externalDebug", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderType;Lcom/robinhood/shared/tradeladder/ui/ladder/models/OrderTrigger;)I", "getSellOrderLabel", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedRow;", "getSelectedRow$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedRow;", "getSelectedRow", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "getBottomBarData$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$BottomBarData;", "getBottomBarData", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$SettingsBottomSheetData;", "getSettingsBottomSheetData$feature_equity_trade_ladder_externalDebug", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderViewState$SettingsBottomSheetData;", "getSettingsBottomSheetData", "getZoomOverlayData$feature_equity_trade_ladder_externalDebug", "getZoomOverlayData", "hasStoredZoomCenter", "centerPrice", "numberOfItems", "buildZoomOverlayData$feature_equity_trade_ladder_externalDebug", "(ZLjava/math/BigDecimal;ILcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;)Ljava/util/Map;", "buildZoomOverlayData", "newLadderPriceData", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager$BinConfiguration;", "newConfig", "copyForLadderPriceLevel$feature_equity_trade_ladder_externalDebug", "(Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceData;Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager$BinConfiguration;)Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;", "copyForLadderPriceLevel", "copyToClearSelectionState", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/models/db/Instrument;", "component3", "()Lcom/robinhood/models/db/Account;", "component4", "()Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "component5", "()Lcom/robinhood/utils/resource/StringResource;", "component6", "()Lcom/robinhood/models/db/Quote;", "component7", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "component8", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceData;", "component9", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;", "component10", "component11", "()Lcom/robinhood/models/db/MarketHours;", "component12", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "component13", "()Ljava/util/List;", "component14", "()Lcom/robinhood/models/db/Position;", "component15", "()Z", "component16", "component17", "component18", "()Ljava/lang/Boolean;", "component19", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component20", "component21", "()Lcom/robinhood/models/db/OrderMarketHours;", "component22", "component23", "()Ljava/util/UUID;", "component24", "()Lj$/time/Clock;", "component25", "()Lcom/robinhood/android/common/buysell/BuySellData;", "component26", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "component27", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component28", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;", "component29", "()Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;", "component30", "component31", "component32", "()Ljava/lang/Integer;", "component33", "component34", "()Ljava/math/BigDecimal;", "component35", "component36", "component37", "()Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "component38", "component39", "component40", "component41", "component42", "component43", "()Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "()Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "component51", "component52", "()Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "copy", "(Ljava/lang/String;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceData;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;Ljava/util/Map;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/nbbo/models/db/NbboSummary;Ljava/util/List;Lcom/robinhood/models/db/Position;ZZZLjava/lang/Boolean;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Ljava/util/UUID;Lj$/time/Clock;Lcom/robinhood/android/common/buysell/BuySellData;Lcom/robinhood/shared/equities/subzero/ShortingInfo;Lcom/robinhood/android/equitytradeladder/LadderScreenState;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;ZLjava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/Integer;ZLcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;ZZZZZLjava/lang/Integer;Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;Ljava/util/Map;Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;ZZZZZZZZ)Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstrumentId", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/shared/tradeladder/ui/ladder/ftux/GenericLadderFtuxProgressState;", "getLadderFtuxProgressState", "Lcom/robinhood/utils/resource/StringResource;", "getAccountDisplayName", "Lcom/robinhood/models/db/Quote;", "getBrokebackQuote", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "getBuyingPower", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceData;", "getLadderPriceData", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;", "getLadderPriceLevels", "Ljava/util/Map;", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "getNbboSummary", "Ljava/util/List;", "Lcom/robinhood/models/db/Position;", "getPosition", "Z", "getShortingEnabled", "getInstrumentExternalHalt", "getInstrumentInternalHalt", "Ljava/lang/Boolean;", "getAutoSend", "Lcom/robinhood/models/db/OrderTimeInForce;", "getLongTimeInForce", "getShortTimeInForce", "Lcom/robinhood/models/db/OrderMarketHours;", "getLongOrderMarketHours", "getShortOrderMarketHours", "Ljava/util/UUID;", "getRefIdToTrack", "Lj$/time/Clock;", "getClock", "Lcom/robinhood/android/common/buysell/BuySellData;", "getBuySellData", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "getShortingInfo", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "getLadderScreenState", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderDisplayMode;", "getLadderDisplayMode", "Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;", "getLadderMarketSessionChangeState", "getNbboLoading", "getQuantitySelectorOpen", "Ljava/lang/Integer;", "getMostRecentSelectedRowIndex", "getSelectedRowIndex", "Ljava/math/BigDecimal;", "getSelectedRowPrice", "getShowSettingsBottomSheet", "getTradeQuantity", "Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "getQuantityInputMode", "getZoomInProgress", "getZoomInitialCenterIndex", "getZoomInitialCenterPrice", "getZoomInitialNumberOfItems", "getTradeInFlight", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "getPostTradeLadderFtuxState", "getFlattenLoading", "getMarketBuyLoading", "getMarketSellLoading", "getPnlRetirementEnabled", "getShouldShowL2DataMissingBanner", "getOrderDraggedOverIndex", "Lcom/robinhood/shared/tradeladder/ui/ladder/gestures/DragDirection;", "getPendingOrderDragDirection", "getUiPendingOrdersMap", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$SelectedPendingOrders;", "getSelectedPendingOrders", "getShowQuantitySelector", "getShowSubmitBuy", "getShowSubmitSell", "getEtfSupported", "getMarketBuysEnabled", "getSubzeroEnabled", "getAutoSendKillSwitchEnabled", "getShouldShowAutoSendUpsell", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "equitiesLadderContext", "Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "getEquitiesLadderContext", "()Lcom/robinhood/rosetta/eventlogging/EquitiesLadderContext;", "showNbbo", "getShowNbbo", "showMarketBuyButtons", "getShowMarketBuyButtons$feature_equity_trade_ladder_externalDebug", "equityLadderOrderState", "Lcom/robinhood/android/equitytradeladder/models/EquityLadderOrderState;", "getEquityLadderOrderState$feature_equity_trade_ladder_externalDebug", "getShouldPendingOrderChangePriceOnDragEnded", "shouldPendingOrderChangePriceOnDragEnded", "getCanSell", "canSell", "getCanBuy", "canBuy", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EquityTradeLadderDataState implements BaseLadderDuxo2 {
    private static final int PRELOAD_WINDOW_SIZE = 50;
    private final Account account;
    private final StringResource accountDisplayName;
    private final Boolean autoSend;
    private final boolean autoSendKillSwitchEnabled;
    private final Quote brokebackQuote;
    private final BuySellData buySellData;
    private final InstrumentBuyingPower buyingPower;
    private final Clock clock;
    private final EquitiesLadderContext equitiesLadderContext;
    private final EquityLadderOrderState equityLadderOrderState;
    private final boolean etfSupported;
    private final boolean flattenLoading;
    private final Instrument instrument;
    private final boolean instrumentExternalHalt;
    private final String instrumentId;
    private final boolean instrumentInternalHalt;
    private final LadderDisplayMode ladderDisplayMode;
    private final GenericLadderFtuxProgressState ladderFtuxProgressState;
    private final MarketSessionChangeDataState ladderMarketSessionChangeState;
    private final LadderPriceData ladderPriceData;
    private final LadderPriceLevels ladderPriceLevels;
    private final LadderScreenState ladderScreenState;
    private final OrderMarketHours longOrderMarketHours;
    private final OrderTimeInForce longTimeInForce;
    private final boolean marketBuyLoading;
    private final boolean marketBuysEnabled;
    private final MarketHours marketHours;
    private final boolean marketSellLoading;
    private final Integer mostRecentSelectedRowIndex;
    private final boolean nbboLoading;
    private final NbboSummary nbboSummary;
    private final Integer orderDraggedOverIndex;
    private final LadderCustomGestureDetector3 pendingOrderDragDirection;
    private final List<Order> pendingOrders;
    private final boolean pnlRetirementEnabled;
    private final Position position;
    private final EquityPostTradeLadderFtuxState postTradeLadderFtuxState;
    private final TradeQuantity quantityInputMode;
    private final boolean quantitySelectorOpen;
    private final UUID refIdToTrack;
    private final LadderState.LadderData.SelectedPendingOrders selectedPendingOrders;
    private final Integer selectedRowIndex;
    private final BigDecimal selectedRowPrice;
    private final OrderMarketHours shortOrderMarketHours;
    private final OrderTimeInForce shortTimeInForce;
    private final boolean shortingEnabled;
    private final ShortingInfo shortingInfo;
    private final boolean shouldShowAutoSendUpsell;
    private final boolean shouldShowL2DataMissingBanner;
    private final boolean showMarketBuyButtons;
    private final boolean showNbbo;
    private final boolean showQuantitySelector;
    private final boolean showSettingsBottomSheet;
    private final boolean showSubmitBuy;
    private final boolean showSubmitSell;
    private final boolean subzeroEnabled;
    private final boolean tradeInFlight;
    private final BigDecimal tradeQuantity;
    private final Map<UUID, EquityPendingOrder3> uiPendingOrdersMap;
    private final boolean zoomInProgress;
    private final Integer zoomInitialCenterIndex;
    private final BigDecimal zoomInitialCenterPrice;
    private final Integer zoomInitialNumberOfItems;
    private final Map<Integer, BigDecimal> zoomOverlayData;
    public static final int $stable = 8;

    /* compiled from: EquityTradeLadderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public static /* synthetic */ EquityTradeLadderDataState copy$default(EquityTradeLadderDataState equityTradeLadderDataState, String str, Instrument instrument, Account account, GenericLadderFtuxProgressState genericLadderFtuxProgressState, StringResource stringResource, Quote quote, InstrumentBuyingPower instrumentBuyingPower, LadderPriceData ladderPriceData, LadderPriceLevels ladderPriceLevels, Map map, MarketHours marketHours, NbboSummary nbboSummary, List list, Position position, boolean z, boolean z2, boolean z3, Boolean bool, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, UUID uuid, Clock clock, BuySellData buySellData, ShortingInfo shortingInfo, LadderScreenState ladderScreenState, LadderDisplayMode ladderDisplayMode, MarketSessionChangeDataState marketSessionChangeDataState, boolean z4, boolean z5, Integer num, Integer num2, BigDecimal bigDecimal, boolean z6, BigDecimal bigDecimal2, TradeQuantity tradeQuantity, boolean z7, Integer num3, BigDecimal bigDecimal3, Integer num4, boolean z8, EquityPostTradeLadderFtuxState equityPostTradeLadderFtuxState, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Integer num5, LadderCustomGestureDetector3 ladderCustomGestureDetector3, Map map2, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i, int i2, Object obj) {
        return equityTradeLadderDataState.copy((i & 1) != 0 ? equityTradeLadderDataState.instrumentId : str, (i & 2) != 0 ? equityTradeLadderDataState.instrument : instrument, (i & 4) != 0 ? equityTradeLadderDataState.account : account, (i & 8) != 0 ? equityTradeLadderDataState.ladderFtuxProgressState : genericLadderFtuxProgressState, (i & 16) != 0 ? equityTradeLadderDataState.accountDisplayName : stringResource, (i & 32) != 0 ? equityTradeLadderDataState.brokebackQuote : quote, (i & 64) != 0 ? equityTradeLadderDataState.buyingPower : instrumentBuyingPower, (i & 128) != 0 ? equityTradeLadderDataState.ladderPriceData : ladderPriceData, (i & 256) != 0 ? equityTradeLadderDataState.ladderPriceLevels : ladderPriceLevels, (i & 512) != 0 ? equityTradeLadderDataState.zoomOverlayData : map, (i & 1024) != 0 ? equityTradeLadderDataState.marketHours : marketHours, (i & 2048) != 0 ? equityTradeLadderDataState.nbboSummary : nbboSummary, (i & 4096) != 0 ? equityTradeLadderDataState.pendingOrders : list, (i & 8192) != 0 ? equityTradeLadderDataState.position : position, (i & 16384) != 0 ? equityTradeLadderDataState.shortingEnabled : z, (i & 32768) != 0 ? equityTradeLadderDataState.instrumentExternalHalt : z2, (i & 65536) != 0 ? equityTradeLadderDataState.instrumentInternalHalt : z3, (i & 131072) != 0 ? equityTradeLadderDataState.autoSend : bool, (i & 262144) != 0 ? equityTradeLadderDataState.longTimeInForce : orderTimeInForce, (i & 524288) != 0 ? equityTradeLadderDataState.shortTimeInForce : orderTimeInForce2, (i & 1048576) != 0 ? equityTradeLadderDataState.longOrderMarketHours : orderMarketHours, (i & 2097152) != 0 ? equityTradeLadderDataState.shortOrderMarketHours : orderMarketHours2, (i & 4194304) != 0 ? equityTradeLadderDataState.refIdToTrack : uuid, (i & 8388608) != 0 ? equityTradeLadderDataState.clock : clock, (i & 16777216) != 0 ? equityTradeLadderDataState.buySellData : buySellData, (i & 33554432) != 0 ? equityTradeLadderDataState.shortingInfo : shortingInfo, (i & 67108864) != 0 ? equityTradeLadderDataState.ladderScreenState : ladderScreenState, (i & 134217728) != 0 ? equityTradeLadderDataState.ladderDisplayMode : ladderDisplayMode, (i & 268435456) != 0 ? equityTradeLadderDataState.ladderMarketSessionChangeState : marketSessionChangeDataState, (i & 536870912) != 0 ? equityTradeLadderDataState.nbboLoading : z4, (i & 1073741824) != 0 ? equityTradeLadderDataState.quantitySelectorOpen : z5, (i & Integer.MIN_VALUE) != 0 ? equityTradeLadderDataState.mostRecentSelectedRowIndex : num, (i2 & 1) != 0 ? equityTradeLadderDataState.selectedRowIndex : num2, (i2 & 2) != 0 ? equityTradeLadderDataState.selectedRowPrice : bigDecimal, (i2 & 4) != 0 ? equityTradeLadderDataState.showSettingsBottomSheet : z6, (i2 & 8) != 0 ? equityTradeLadderDataState.tradeQuantity : bigDecimal2, (i2 & 16) != 0 ? equityTradeLadderDataState.quantityInputMode : tradeQuantity, (i2 & 32) != 0 ? equityTradeLadderDataState.zoomInProgress : z7, (i2 & 64) != 0 ? equityTradeLadderDataState.zoomInitialCenterIndex : num3, (i2 & 128) != 0 ? equityTradeLadderDataState.zoomInitialCenterPrice : bigDecimal3, (i2 & 256) != 0 ? equityTradeLadderDataState.zoomInitialNumberOfItems : num4, (i2 & 512) != 0 ? equityTradeLadderDataState.tradeInFlight : z8, (i2 & 1024) != 0 ? equityTradeLadderDataState.postTradeLadderFtuxState : equityPostTradeLadderFtuxState, (i2 & 2048) != 0 ? equityTradeLadderDataState.flattenLoading : z9, (i2 & 4096) != 0 ? equityTradeLadderDataState.marketBuyLoading : z10, (i2 & 8192) != 0 ? equityTradeLadderDataState.marketSellLoading : z11, (i2 & 16384) != 0 ? equityTradeLadderDataState.pnlRetirementEnabled : z12, (i2 & 32768) != 0 ? equityTradeLadderDataState.shouldShowL2DataMissingBanner : z13, (i2 & 65536) != 0 ? equityTradeLadderDataState.orderDraggedOverIndex : num5, (i2 & 131072) != 0 ? equityTradeLadderDataState.pendingOrderDragDirection : ladderCustomGestureDetector3, (i2 & 262144) != 0 ? equityTradeLadderDataState.uiPendingOrdersMap : map2, (i2 & 524288) != 0 ? equityTradeLadderDataState.selectedPendingOrders : selectedPendingOrders, (i2 & 1048576) != 0 ? equityTradeLadderDataState.showQuantitySelector : z14, (i2 & 2097152) != 0 ? equityTradeLadderDataState.showSubmitBuy : z15, (i2 & 4194304) != 0 ? equityTradeLadderDataState.showSubmitSell : z16, (i2 & 8388608) != 0 ? equityTradeLadderDataState.etfSupported : z17, (i2 & 16777216) != 0 ? equityTradeLadderDataState.marketBuysEnabled : z18, (i2 & 33554432) != 0 ? equityTradeLadderDataState.subzeroEnabled : z19, (i2 & 67108864) != 0 ? equityTradeLadderDataState.autoSendKillSwitchEnabled : z20, (i2 & 134217728) != 0 ? equityTradeLadderDataState.shouldShowAutoSendUpsell : z21);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final Map<Integer, BigDecimal> component10() {
        return this.zoomOverlayData;
    }

    /* renamed from: component11, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component12, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final List<Order> component13() {
        return this.pendingOrders;
    }

    /* renamed from: component14, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getInstrumentExternalHalt() {
        return this.instrumentExternalHalt;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getInstrumentInternalHalt() {
        return this.instrumentInternalHalt;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getAutoSend() {
        return this.autoSend;
    }

    /* renamed from: component19, reason: from getter */
    public final OrderTimeInForce getLongTimeInForce() {
        return this.longTimeInForce;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component20, reason: from getter */
    public final OrderTimeInForce getShortTimeInForce() {
        return this.shortTimeInForce;
    }

    /* renamed from: component21, reason: from getter */
    public final OrderMarketHours getLongOrderMarketHours() {
        return this.longOrderMarketHours;
    }

    /* renamed from: component22, reason: from getter */
    public final OrderMarketHours getShortOrderMarketHours() {
        return this.shortOrderMarketHours;
    }

    /* renamed from: component23, reason: from getter */
    public final UUID getRefIdToTrack() {
        return this.refIdToTrack;
    }

    /* renamed from: component24, reason: from getter */
    public final Clock getClock() {
        return this.clock;
    }

    /* renamed from: component25, reason: from getter */
    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    /* renamed from: component26, reason: from getter */
    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component27, reason: from getter */
    public final LadderScreenState getLadderScreenState() {
        return this.ladderScreenState;
    }

    /* renamed from: component28, reason: from getter */
    public final LadderDisplayMode getLadderDisplayMode() {
        return this.ladderDisplayMode;
    }

    /* renamed from: component29, reason: from getter */
    public final MarketSessionChangeDataState getLadderMarketSessionChangeState() {
        return this.ladderMarketSessionChangeState;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getNbboLoading() {
        return this.nbboLoading;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getQuantitySelectorOpen() {
        return this.quantitySelectorOpen;
    }

    /* renamed from: component32, reason: from getter */
    public final Integer getMostRecentSelectedRowIndex() {
        return this.mostRecentSelectedRowIndex;
    }

    /* renamed from: component33, reason: from getter */
    public final Integer getSelectedRowIndex() {
        return this.selectedRowIndex;
    }

    /* renamed from: component34, reason: from getter */
    public final BigDecimal getSelectedRowPrice() {
        return this.selectedRowPrice;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getShowSettingsBottomSheet() {
        return this.showSettingsBottomSheet;
    }

    /* renamed from: component36, reason: from getter */
    public final BigDecimal getTradeQuantity() {
        return this.tradeQuantity;
    }

    /* renamed from: component37, reason: from getter */
    public final TradeQuantity getQuantityInputMode() {
        return this.quantityInputMode;
    }

    /* renamed from: component38, reason: from getter */
    public final boolean getZoomInProgress() {
        return this.zoomInProgress;
    }

    /* renamed from: component39, reason: from getter */
    public final Integer getZoomInitialCenterIndex() {
        return this.zoomInitialCenterIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final GenericLadderFtuxProgressState getLadderFtuxProgressState() {
        return this.ladderFtuxProgressState;
    }

    /* renamed from: component40, reason: from getter */
    public final BigDecimal getZoomInitialCenterPrice() {
        return this.zoomInitialCenterPrice;
    }

    /* renamed from: component41, reason: from getter */
    public final Integer getZoomInitialNumberOfItems() {
        return this.zoomInitialNumberOfItems;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getTradeInFlight() {
        return this.tradeInFlight;
    }

    /* renamed from: component43, reason: from getter */
    public final EquityPostTradeLadderFtuxState getPostTradeLadderFtuxState() {
        return this.postTradeLadderFtuxState;
    }

    /* renamed from: component44, reason: from getter */
    public final boolean getFlattenLoading() {
        return this.flattenLoading;
    }

    /* renamed from: component45, reason: from getter */
    public final boolean getMarketBuyLoading() {
        return this.marketBuyLoading;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getMarketSellLoading() {
        return this.marketSellLoading;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getPnlRetirementEnabled() {
        return this.pnlRetirementEnabled;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getShouldShowL2DataMissingBanner() {
        return this.shouldShowL2DataMissingBanner;
    }

    /* renamed from: component49, reason: from getter */
    public final Integer getOrderDraggedOverIndex() {
        return this.orderDraggedOverIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    /* renamed from: component50, reason: from getter */
    public final LadderCustomGestureDetector3 getPendingOrderDragDirection() {
        return this.pendingOrderDragDirection;
    }

    public final Map<UUID, EquityPendingOrder3> component51() {
        return this.uiPendingOrdersMap;
    }

    /* renamed from: component52, reason: from getter */
    public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
        return this.selectedPendingOrders;
    }

    /* renamed from: component53, reason: from getter */
    public final boolean getShowQuantitySelector() {
        return this.showQuantitySelector;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getShowSubmitBuy() {
        return this.showSubmitBuy;
    }

    /* renamed from: component55, reason: from getter */
    public final boolean getShowSubmitSell() {
        return this.showSubmitSell;
    }

    /* renamed from: component56, reason: from getter */
    public final boolean getEtfSupported() {
        return this.etfSupported;
    }

    /* renamed from: component57, reason: from getter */
    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    /* renamed from: component58, reason: from getter */
    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    /* renamed from: component59, reason: from getter */
    public final boolean getAutoSendKillSwitchEnabled() {
        return this.autoSendKillSwitchEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final Quote getBrokebackQuote() {
        return this.brokebackQuote;
    }

    /* renamed from: component60, reason: from getter */
    public final boolean getShouldShowAutoSendUpsell() {
        return this.shouldShowAutoSendUpsell;
    }

    /* renamed from: component7, reason: from getter */
    public final InstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component8, reason: from getter */
    public final LadderPriceData getLadderPriceData() {
        return this.ladderPriceData;
    }

    /* renamed from: component9, reason: from getter */
    public final LadderPriceLevels getLadderPriceLevels() {
        return this.ladderPriceLevels;
    }

    public final EquityTradeLadderDataState copy(String instrumentId, Instrument instrument, Account account, GenericLadderFtuxProgressState ladderFtuxProgressState, StringResource accountDisplayName, Quote brokebackQuote, InstrumentBuyingPower buyingPower, LadderPriceData ladderPriceData, LadderPriceLevels ladderPriceLevels, Map<Integer, BigDecimal> zoomOverlayData, MarketHours marketHours, NbboSummary nbboSummary, List<Order> pendingOrders, Position position, boolean shortingEnabled, boolean instrumentExternalHalt, boolean instrumentInternalHalt, Boolean autoSend, OrderTimeInForce longTimeInForce, OrderTimeInForce shortTimeInForce, OrderMarketHours longOrderMarketHours, OrderMarketHours shortOrderMarketHours, UUID refIdToTrack, Clock clock, BuySellData buySellData, ShortingInfo shortingInfo, LadderScreenState ladderScreenState, LadderDisplayMode ladderDisplayMode, MarketSessionChangeDataState ladderMarketSessionChangeState, boolean nbboLoading, boolean quantitySelectorOpen, Integer mostRecentSelectedRowIndex, Integer selectedRowIndex, BigDecimal selectedRowPrice, boolean showSettingsBottomSheet, BigDecimal tradeQuantity, TradeQuantity quantityInputMode, boolean zoomInProgress, Integer zoomInitialCenterIndex, BigDecimal zoomInitialCenterPrice, Integer zoomInitialNumberOfItems, boolean tradeInFlight, EquityPostTradeLadderFtuxState postTradeLadderFtuxState, boolean flattenLoading, boolean marketBuyLoading, boolean marketSellLoading, boolean pnlRetirementEnabled, boolean shouldShowL2DataMissingBanner, Integer orderDraggedOverIndex, LadderCustomGestureDetector3 pendingOrderDragDirection, Map<UUID, EquityPendingOrder3> uiPendingOrdersMap, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, boolean showQuantitySelector, boolean showSubmitBuy, boolean showSubmitSell, boolean etfSupported, boolean marketBuysEnabled, boolean subzeroEnabled, boolean autoSendKillSwitchEnabled, boolean shouldShowAutoSendUpsell) {
        Intrinsics.checkNotNullParameter(ladderPriceData, "ladderPriceData");
        Intrinsics.checkNotNullParameter(zoomOverlayData, "zoomOverlayData");
        Intrinsics.checkNotNullParameter(longTimeInForce, "longTimeInForce");
        Intrinsics.checkNotNullParameter(shortTimeInForce, "shortTimeInForce");
        Intrinsics.checkNotNullParameter(longOrderMarketHours, "longOrderMarketHours");
        Intrinsics.checkNotNullParameter(shortOrderMarketHours, "shortOrderMarketHours");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(ladderScreenState, "ladderScreenState");
        Intrinsics.checkNotNullParameter(ladderDisplayMode, "ladderDisplayMode");
        Intrinsics.checkNotNullParameter(ladderMarketSessionChangeState, "ladderMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(tradeQuantity, "tradeQuantity");
        Intrinsics.checkNotNullParameter(quantityInputMode, "quantityInputMode");
        Intrinsics.checkNotNullParameter(uiPendingOrdersMap, "uiPendingOrdersMap");
        return new EquityTradeLadderDataState(instrumentId, instrument, account, ladderFtuxProgressState, accountDisplayName, brokebackQuote, buyingPower, ladderPriceData, ladderPriceLevels, zoomOverlayData, marketHours, nbboSummary, pendingOrders, position, shortingEnabled, instrumentExternalHalt, instrumentInternalHalt, autoSend, longTimeInForce, shortTimeInForce, longOrderMarketHours, shortOrderMarketHours, refIdToTrack, clock, buySellData, shortingInfo, ladderScreenState, ladderDisplayMode, ladderMarketSessionChangeState, nbboLoading, quantitySelectorOpen, mostRecentSelectedRowIndex, selectedRowIndex, selectedRowPrice, showSettingsBottomSheet, tradeQuantity, quantityInputMode, zoomInProgress, zoomInitialCenterIndex, zoomInitialCenterPrice, zoomInitialNumberOfItems, tradeInFlight, postTradeLadderFtuxState, flattenLoading, marketBuyLoading, marketSellLoading, pnlRetirementEnabled, shouldShowL2DataMissingBanner, orderDraggedOverIndex, pendingOrderDragDirection, uiPendingOrdersMap, selectedPendingOrders, showQuantitySelector, showSubmitBuy, showSubmitSell, etfSupported, marketBuysEnabled, subzeroEnabled, autoSendKillSwitchEnabled, shouldShowAutoSendUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityTradeLadderDataState)) {
            return false;
        }
        EquityTradeLadderDataState equityTradeLadderDataState = (EquityTradeLadderDataState) other;
        return Intrinsics.areEqual(this.instrumentId, equityTradeLadderDataState.instrumentId) && Intrinsics.areEqual(this.instrument, equityTradeLadderDataState.instrument) && Intrinsics.areEqual(this.account, equityTradeLadderDataState.account) && Intrinsics.areEqual(this.ladderFtuxProgressState, equityTradeLadderDataState.ladderFtuxProgressState) && Intrinsics.areEqual(this.accountDisplayName, equityTradeLadderDataState.accountDisplayName) && Intrinsics.areEqual(this.brokebackQuote, equityTradeLadderDataState.brokebackQuote) && Intrinsics.areEqual(this.buyingPower, equityTradeLadderDataState.buyingPower) && Intrinsics.areEqual(this.ladderPriceData, equityTradeLadderDataState.ladderPriceData) && Intrinsics.areEqual(this.ladderPriceLevels, equityTradeLadderDataState.ladderPriceLevels) && Intrinsics.areEqual(this.zoomOverlayData, equityTradeLadderDataState.zoomOverlayData) && Intrinsics.areEqual(this.marketHours, equityTradeLadderDataState.marketHours) && Intrinsics.areEqual(this.nbboSummary, equityTradeLadderDataState.nbboSummary) && Intrinsics.areEqual(this.pendingOrders, equityTradeLadderDataState.pendingOrders) && Intrinsics.areEqual(this.position, equityTradeLadderDataState.position) && this.shortingEnabled == equityTradeLadderDataState.shortingEnabled && this.instrumentExternalHalt == equityTradeLadderDataState.instrumentExternalHalt && this.instrumentInternalHalt == equityTradeLadderDataState.instrumentInternalHalt && Intrinsics.areEqual(this.autoSend, equityTradeLadderDataState.autoSend) && this.longTimeInForce == equityTradeLadderDataState.longTimeInForce && this.shortTimeInForce == equityTradeLadderDataState.shortTimeInForce && this.longOrderMarketHours == equityTradeLadderDataState.longOrderMarketHours && this.shortOrderMarketHours == equityTradeLadderDataState.shortOrderMarketHours && Intrinsics.areEqual(this.refIdToTrack, equityTradeLadderDataState.refIdToTrack) && Intrinsics.areEqual(this.clock, equityTradeLadderDataState.clock) && Intrinsics.areEqual(this.buySellData, equityTradeLadderDataState.buySellData) && Intrinsics.areEqual(this.shortingInfo, equityTradeLadderDataState.shortingInfo) && Intrinsics.areEqual(this.ladderScreenState, equityTradeLadderDataState.ladderScreenState) && this.ladderDisplayMode == equityTradeLadderDataState.ladderDisplayMode && Intrinsics.areEqual(this.ladderMarketSessionChangeState, equityTradeLadderDataState.ladderMarketSessionChangeState) && this.nbboLoading == equityTradeLadderDataState.nbboLoading && this.quantitySelectorOpen == equityTradeLadderDataState.quantitySelectorOpen && Intrinsics.areEqual(this.mostRecentSelectedRowIndex, equityTradeLadderDataState.mostRecentSelectedRowIndex) && Intrinsics.areEqual(this.selectedRowIndex, equityTradeLadderDataState.selectedRowIndex) && Intrinsics.areEqual(this.selectedRowPrice, equityTradeLadderDataState.selectedRowPrice) && this.showSettingsBottomSheet == equityTradeLadderDataState.showSettingsBottomSheet && Intrinsics.areEqual(this.tradeQuantity, equityTradeLadderDataState.tradeQuantity) && this.quantityInputMode == equityTradeLadderDataState.quantityInputMode && this.zoomInProgress == equityTradeLadderDataState.zoomInProgress && Intrinsics.areEqual(this.zoomInitialCenterIndex, equityTradeLadderDataState.zoomInitialCenterIndex) && Intrinsics.areEqual(this.zoomInitialCenterPrice, equityTradeLadderDataState.zoomInitialCenterPrice) && Intrinsics.areEqual(this.zoomInitialNumberOfItems, equityTradeLadderDataState.zoomInitialNumberOfItems) && this.tradeInFlight == equityTradeLadderDataState.tradeInFlight && this.postTradeLadderFtuxState == equityTradeLadderDataState.postTradeLadderFtuxState && this.flattenLoading == equityTradeLadderDataState.flattenLoading && this.marketBuyLoading == equityTradeLadderDataState.marketBuyLoading && this.marketSellLoading == equityTradeLadderDataState.marketSellLoading && this.pnlRetirementEnabled == equityTradeLadderDataState.pnlRetirementEnabled && this.shouldShowL2DataMissingBanner == equityTradeLadderDataState.shouldShowL2DataMissingBanner && Intrinsics.areEqual(this.orderDraggedOverIndex, equityTradeLadderDataState.orderDraggedOverIndex) && this.pendingOrderDragDirection == equityTradeLadderDataState.pendingOrderDragDirection && Intrinsics.areEqual(this.uiPendingOrdersMap, equityTradeLadderDataState.uiPendingOrdersMap) && Intrinsics.areEqual(this.selectedPendingOrders, equityTradeLadderDataState.selectedPendingOrders) && this.showQuantitySelector == equityTradeLadderDataState.showQuantitySelector && this.showSubmitBuy == equityTradeLadderDataState.showSubmitBuy && this.showSubmitSell == equityTradeLadderDataState.showSubmitSell && this.etfSupported == equityTradeLadderDataState.etfSupported && this.marketBuysEnabled == equityTradeLadderDataState.marketBuysEnabled && this.subzeroEnabled == equityTradeLadderDataState.subzeroEnabled && this.autoSendKillSwitchEnabled == equityTradeLadderDataState.autoSendKillSwitchEnabled && this.shouldShowAutoSendUpsell == equityTradeLadderDataState.shouldShowAutoSendUpsell;
    }

    public int hashCode() {
        String str = this.instrumentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Account account = this.account;
        int iHashCode3 = (iHashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        GenericLadderFtuxProgressState genericLadderFtuxProgressState = this.ladderFtuxProgressState;
        int iHashCode4 = (iHashCode3 + (genericLadderFtuxProgressState == null ? 0 : genericLadderFtuxProgressState.hashCode())) * 31;
        StringResource stringResource = this.accountDisplayName;
        int iHashCode5 = (iHashCode4 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        Quote quote = this.brokebackQuote;
        int iHashCode6 = (iHashCode5 + (quote == null ? 0 : quote.hashCode())) * 31;
        InstrumentBuyingPower instrumentBuyingPower = this.buyingPower;
        int iHashCode7 = (((iHashCode6 + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31) + this.ladderPriceData.hashCode()) * 31;
        LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
        int iHashCode8 = (((iHashCode7 + (ladderPriceLevels == null ? 0 : ladderPriceLevels.hashCode())) * 31) + this.zoomOverlayData.hashCode()) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode9 = (iHashCode8 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode10 = (iHashCode9 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31;
        List<Order> list = this.pendingOrders;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Position position = this.position;
        int iHashCode12 = (((((((iHashCode11 + (position == null ? 0 : position.hashCode())) * 31) + Boolean.hashCode(this.shortingEnabled)) * 31) + Boolean.hashCode(this.instrumentExternalHalt)) * 31) + Boolean.hashCode(this.instrumentInternalHalt)) * 31;
        Boolean bool = this.autoSend;
        int iHashCode13 = (((((((((iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31) + this.longTimeInForce.hashCode()) * 31) + this.shortTimeInForce.hashCode()) * 31) + this.longOrderMarketHours.hashCode()) * 31) + this.shortOrderMarketHours.hashCode()) * 31;
        UUID uuid = this.refIdToTrack;
        int iHashCode14 = (((iHashCode13 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.clock.hashCode()) * 31;
        BuySellData buySellData = this.buySellData;
        int iHashCode15 = (iHashCode14 + (buySellData == null ? 0 : buySellData.hashCode())) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        int iHashCode16 = (((((((((((iHashCode15 + (shortingInfo == null ? 0 : shortingInfo.hashCode())) * 31) + this.ladderScreenState.hashCode()) * 31) + this.ladderDisplayMode.hashCode()) * 31) + this.ladderMarketSessionChangeState.hashCode()) * 31) + Boolean.hashCode(this.nbboLoading)) * 31) + Boolean.hashCode(this.quantitySelectorOpen)) * 31;
        Integer num = this.mostRecentSelectedRowIndex;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedRowIndex;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BigDecimal bigDecimal = this.selectedRowPrice;
        int iHashCode19 = (((((((((iHashCode18 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.showSettingsBottomSheet)) * 31) + this.tradeQuantity.hashCode()) * 31) + this.quantityInputMode.hashCode()) * 31) + Boolean.hashCode(this.zoomInProgress)) * 31;
        Integer num3 = this.zoomInitialCenterIndex;
        int iHashCode20 = (iHashCode19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.zoomInitialCenterPrice;
        int iHashCode21 = (iHashCode20 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Integer num4 = this.zoomInitialNumberOfItems;
        int iHashCode22 = (((iHashCode21 + (num4 == null ? 0 : num4.hashCode())) * 31) + Boolean.hashCode(this.tradeInFlight)) * 31;
        EquityPostTradeLadderFtuxState equityPostTradeLadderFtuxState = this.postTradeLadderFtuxState;
        int iHashCode23 = (((((((((((iHashCode22 + (equityPostTradeLadderFtuxState == null ? 0 : equityPostTradeLadderFtuxState.hashCode())) * 31) + Boolean.hashCode(this.flattenLoading)) * 31) + Boolean.hashCode(this.marketBuyLoading)) * 31) + Boolean.hashCode(this.marketSellLoading)) * 31) + Boolean.hashCode(this.pnlRetirementEnabled)) * 31) + Boolean.hashCode(this.shouldShowL2DataMissingBanner)) * 31;
        Integer num5 = this.orderDraggedOverIndex;
        int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        LadderCustomGestureDetector3 ladderCustomGestureDetector3 = this.pendingOrderDragDirection;
        int iHashCode25 = (((iHashCode24 + (ladderCustomGestureDetector3 == null ? 0 : ladderCustomGestureDetector3.hashCode())) * 31) + this.uiPendingOrdersMap.hashCode()) * 31;
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders = this.selectedPendingOrders;
        return ((((((((((((((((iHashCode25 + (selectedPendingOrders != null ? selectedPendingOrders.hashCode() : 0)) * 31) + Boolean.hashCode(this.showQuantitySelector)) * 31) + Boolean.hashCode(this.showSubmitBuy)) * 31) + Boolean.hashCode(this.showSubmitSell)) * 31) + Boolean.hashCode(this.etfSupported)) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31) + Boolean.hashCode(this.subzeroEnabled)) * 31) + Boolean.hashCode(this.autoSendKillSwitchEnabled)) * 31) + Boolean.hashCode(this.shouldShowAutoSendUpsell);
    }

    public String toString() {
        return "EquityTradeLadderDataState(instrumentId=" + this.instrumentId + ", instrument=" + this.instrument + ", account=" + this.account + ", ladderFtuxProgressState=" + this.ladderFtuxProgressState + ", accountDisplayName=" + this.accountDisplayName + ", brokebackQuote=" + this.brokebackQuote + ", buyingPower=" + this.buyingPower + ", ladderPriceData=" + this.ladderPriceData + ", ladderPriceLevels=" + this.ladderPriceLevels + ", zoomOverlayData=" + this.zoomOverlayData + ", marketHours=" + this.marketHours + ", nbboSummary=" + this.nbboSummary + ", pendingOrders=" + this.pendingOrders + ", position=" + this.position + ", shortingEnabled=" + this.shortingEnabled + ", instrumentExternalHalt=" + this.instrumentExternalHalt + ", instrumentInternalHalt=" + this.instrumentInternalHalt + ", autoSend=" + this.autoSend + ", longTimeInForce=" + this.longTimeInForce + ", shortTimeInForce=" + this.shortTimeInForce + ", longOrderMarketHours=" + this.longOrderMarketHours + ", shortOrderMarketHours=" + this.shortOrderMarketHours + ", refIdToTrack=" + this.refIdToTrack + ", clock=" + this.clock + ", buySellData=" + this.buySellData + ", shortingInfo=" + this.shortingInfo + ", ladderScreenState=" + this.ladderScreenState + ", ladderDisplayMode=" + this.ladderDisplayMode + ", ladderMarketSessionChangeState=" + this.ladderMarketSessionChangeState + ", nbboLoading=" + this.nbboLoading + ", quantitySelectorOpen=" + this.quantitySelectorOpen + ", mostRecentSelectedRowIndex=" + this.mostRecentSelectedRowIndex + ", selectedRowIndex=" + this.selectedRowIndex + ", selectedRowPrice=" + this.selectedRowPrice + ", showSettingsBottomSheet=" + this.showSettingsBottomSheet + ", tradeQuantity=" + this.tradeQuantity + ", quantityInputMode=" + this.quantityInputMode + ", zoomInProgress=" + this.zoomInProgress + ", zoomInitialCenterIndex=" + this.zoomInitialCenterIndex + ", zoomInitialCenterPrice=" + this.zoomInitialCenterPrice + ", zoomInitialNumberOfItems=" + this.zoomInitialNumberOfItems + ", tradeInFlight=" + this.tradeInFlight + ", postTradeLadderFtuxState=" + this.postTradeLadderFtuxState + ", flattenLoading=" + this.flattenLoading + ", marketBuyLoading=" + this.marketBuyLoading + ", marketSellLoading=" + this.marketSellLoading + ", pnlRetirementEnabled=" + this.pnlRetirementEnabled + ", shouldShowL2DataMissingBanner=" + this.shouldShowL2DataMissingBanner + ", orderDraggedOverIndex=" + this.orderDraggedOverIndex + ", pendingOrderDragDirection=" + this.pendingOrderDragDirection + ", uiPendingOrdersMap=" + this.uiPendingOrdersMap + ", selectedPendingOrders=" + this.selectedPendingOrders + ", showQuantitySelector=" + this.showQuantitySelector + ", showSubmitBuy=" + this.showSubmitBuy + ", showSubmitSell=" + this.showSubmitSell + ", etfSupported=" + this.etfSupported + ", marketBuysEnabled=" + this.marketBuysEnabled + ", subzeroEnabled=" + this.subzeroEnabled + ", autoSendKillSwitchEnabled=" + this.autoSendKillSwitchEnabled + ", shouldShowAutoSendUpsell=" + this.shouldShowAutoSendUpsell + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EquityTradeLadderDataState(String str, Instrument instrument, Account account, GenericLadderFtuxProgressState genericLadderFtuxProgressState, StringResource stringResource, Quote quote, InstrumentBuyingPower instrumentBuyingPower, LadderPriceData ladderPriceData, LadderPriceLevels ladderPriceLevels, Map<Integer, BigDecimal> zoomOverlayData, MarketHours marketHours, NbboSummary nbboSummary, List<Order> list, Position position, boolean z, boolean z2, boolean z3, Boolean bool, OrderTimeInForce longTimeInForce, OrderTimeInForce shortTimeInForce, OrderMarketHours longOrderMarketHours, OrderMarketHours shortOrderMarketHours, UUID uuid, Clock clock, BuySellData buySellData, ShortingInfo shortingInfo, LadderScreenState ladderScreenState, LadderDisplayMode ladderDisplayMode, MarketSessionChangeDataState ladderMarketSessionChangeState, boolean z4, boolean z5, Integer num, Integer num2, BigDecimal bigDecimal, boolean z6, BigDecimal tradeQuantity, TradeQuantity quantityInputMode, boolean z7, Integer num3, BigDecimal bigDecimal2, Integer num4, boolean z8, EquityPostTradeLadderFtuxState equityPostTradeLadderFtuxState, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Integer num5, LadderCustomGestureDetector3 ladderCustomGestureDetector3, Map<UUID, EquityPendingOrder3> uiPendingOrdersMap, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21) {
        PnlDisplayMode pnlDisplayMode;
        boolean z22;
        boolean z23;
        boolean z24;
        List<LadderState.LadderData.UiPendingOrder> orders;
        BigDecimal priceIncrement;
        Intrinsics.checkNotNullParameter(ladderPriceData, "ladderPriceData");
        Intrinsics.checkNotNullParameter(zoomOverlayData, "zoomOverlayData");
        Intrinsics.checkNotNullParameter(longTimeInForce, "longTimeInForce");
        Intrinsics.checkNotNullParameter(shortTimeInForce, "shortTimeInForce");
        Intrinsics.checkNotNullParameter(longOrderMarketHours, "longOrderMarketHours");
        Intrinsics.checkNotNullParameter(shortOrderMarketHours, "shortOrderMarketHours");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(ladderScreenState, "ladderScreenState");
        Intrinsics.checkNotNullParameter(ladderDisplayMode, "ladderDisplayMode");
        Intrinsics.checkNotNullParameter(ladderMarketSessionChangeState, "ladderMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(tradeQuantity, "tradeQuantity");
        Intrinsics.checkNotNullParameter(quantityInputMode, "quantityInputMode");
        Intrinsics.checkNotNullParameter(uiPendingOrdersMap, "uiPendingOrdersMap");
        this.instrumentId = str;
        this.instrument = instrument;
        this.account = account;
        this.ladderFtuxProgressState = genericLadderFtuxProgressState;
        this.accountDisplayName = stringResource;
        this.brokebackQuote = quote;
        this.buyingPower = instrumentBuyingPower;
        this.ladderPriceData = ladderPriceData;
        this.ladderPriceLevels = ladderPriceLevels;
        this.zoomOverlayData = zoomOverlayData;
        this.marketHours = marketHours;
        this.nbboSummary = nbboSummary;
        this.pendingOrders = list;
        this.position = position;
        this.shortingEnabled = z;
        this.instrumentExternalHalt = z2;
        this.instrumentInternalHalt = z3;
        this.autoSend = bool;
        this.longTimeInForce = longTimeInForce;
        this.shortTimeInForce = shortTimeInForce;
        this.longOrderMarketHours = longOrderMarketHours;
        this.shortOrderMarketHours = shortOrderMarketHours;
        this.refIdToTrack = uuid;
        this.clock = clock;
        this.buySellData = buySellData;
        this.shortingInfo = shortingInfo;
        this.ladderScreenState = ladderScreenState;
        this.ladderDisplayMode = ladderDisplayMode;
        this.ladderMarketSessionChangeState = ladderMarketSessionChangeState;
        this.nbboLoading = z4;
        this.quantitySelectorOpen = z5;
        this.mostRecentSelectedRowIndex = num;
        this.selectedRowIndex = num2;
        this.selectedRowPrice = bigDecimal;
        this.showSettingsBottomSheet = z6;
        this.tradeQuantity = tradeQuantity;
        this.quantityInputMode = quantityInputMode;
        this.zoomInProgress = z7;
        this.zoomInitialCenterIndex = num3;
        this.zoomInitialCenterPrice = bigDecimal2;
        this.zoomInitialNumberOfItems = num4;
        this.tradeInFlight = z8;
        this.postTradeLadderFtuxState = equityPostTradeLadderFtuxState;
        this.flattenLoading = z9;
        this.marketBuyLoading = z10;
        this.marketSellLoading = z11;
        this.pnlRetirementEnabled = z12;
        this.shouldShowL2DataMissingBanner = z13;
        this.orderDraggedOverIndex = num5;
        this.pendingOrderDragDirection = ladderCustomGestureDetector3;
        this.uiPendingOrdersMap = uiPendingOrdersMap;
        this.selectedPendingOrders = selectedPendingOrders;
        this.showQuantitySelector = z14;
        this.showSubmitBuy = z15;
        this.showSubmitSell = z16;
        this.etfSupported = z17;
        this.marketBuysEnabled = z18;
        this.subzeroEnabled = z19;
        this.autoSendKillSwitchEnabled = z20;
        this.shouldShowAutoSendUpsell = z21;
        int i = WhenMappings.$EnumSwitchMapping$0[ladderDisplayMode.ordinal()];
        boolean z25 = true;
        if (i == 1) {
            pnlDisplayMode = PnlDisplayMode.PNL_DISPLAY_MODE_PRICE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pnlDisplayMode = PnlDisplayMode.PNL_DISPLAY_MODE_PNL;
        }
        boolean zAreEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
        LadderPriceLevels ladderPriceLevels2 = this.ladderPriceLevels;
        this.equitiesLadderContext = new EquitiesLadderContext(pnlDisplayMode, zAreEqual, (ladderPriceLevels2 == null || (priceIncrement = ladderPriceLevels2.getPriceIncrement()) == null) ? 0.0d : priceIncrement.doubleValue(), tradeQuantity.doubleValue(), null, 16, null);
        if (z15 || z16) {
            z22 = true;
        } else {
            if (bool != null ? bool.booleanValue() : false) {
                Collection<EquityPendingOrder3> collectionValues = uiPendingOrdersMap.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z24 = false;
                    if (!z24) {
                        if (this.pendingOrderDragDirection == LadderCustomGestureDetector3.VERTICAL) {
                        }
                    }
                    z22 = true;
                } else {
                    for (EquityPendingOrder3 equityPendingOrder3 : collectionValues) {
                        if ((equityPendingOrder3 instanceof PendingPlacedOrder) || (equityPendingOrder3 instanceof PendingReplacedOrder)) {
                            z24 = true;
                            break;
                        }
                    }
                    z24 = false;
                    if (!z24 && this.selectedRowIndex == null) {
                        if (this.pendingOrderDragDirection == LadderCustomGestureDetector3.VERTICAL) {
                            LadderState.LadderData.SelectedPendingOrders selectedPendingOrders2 = this.selectedPendingOrders;
                            if ((selectedPendingOrders2 == null || (orders = selectedPendingOrders2.getOrders()) == null || orders.size() != 1) ? false : true) {
                            }
                        }
                    }
                    z22 = true;
                }
            }
            z22 = false;
        }
        this.showNbbo = z22;
        if (this.selectedRowIndex == null && this.selectedPendingOrders == null && !this.quantitySelectorOpen) {
            Boolean bool2 = this.autoSend;
            if (bool2 != null ? bool2.booleanValue() : false) {
                Collection<EquityPendingOrder3> collectionValues2 = this.uiPendingOrdersMap.values();
                if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                    z23 = false;
                    if (z23) {
                    }
                } else {
                    for (EquityPendingOrder3 equityPendingOrder32 : collectionValues2) {
                        if ((equityPendingOrder32 instanceof PendingPlacedOrder) || (equityPendingOrder32 instanceof PendingReplacedOrder)) {
                            z23 = true;
                            break;
                        }
                    }
                    z23 = false;
                    if (z23) {
                    }
                }
            }
        } else {
            z25 = false;
        }
        this.showMarketBuyButtons = z25;
        this.equityLadderOrderState = buildOrderState();
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final GenericLadderFtuxProgressState getLadderFtuxProgressState() {
        return this.ladderFtuxProgressState;
    }

    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    public final Quote getBrokebackQuote() {
        return this.brokebackQuote;
    }

    public final InstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    public /* synthetic */ EquityTradeLadderDataState(String str, Instrument instrument, Account account, GenericLadderFtuxProgressState genericLadderFtuxProgressState, StringResource stringResource, Quote quote, InstrumentBuyingPower instrumentBuyingPower, LadderPriceData ladderPriceData, LadderPriceLevels ladderPriceLevels, Map map, MarketHours marketHours, NbboSummary nbboSummary, List list, Position position, boolean z, boolean z2, boolean z3, Boolean bool, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, UUID uuid, Clock clock, BuySellData buySellData, ShortingInfo shortingInfo, LadderScreenState ladderScreenState, LadderDisplayMode ladderDisplayMode, MarketSessionChangeDataState marketSessionChangeDataState, boolean z4, boolean z5, Integer num, Integer num2, BigDecimal bigDecimal, boolean z6, BigDecimal bigDecimal2, TradeQuantity tradeQuantity, boolean z7, Integer num3, BigDecimal bigDecimal3, Integer num4, boolean z8, EquityPostTradeLadderFtuxState equityPostTradeLadderFtuxState, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Integer num5, LadderCustomGestureDetector3 ladderCustomGestureDetector3, Map map2, LadderState.LadderData.SelectedPendingOrders selectedPendingOrders, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? null : account, (i & 8) != 0 ? null : genericLadderFtuxProgressState, (i & 16) != 0 ? null : stringResource, (i & 32) != 0 ? null : quote, (i & 64) != 0 ? null : instrumentBuyingPower, (i & 128) != 0 ? new LadderPriceData(null, null, null, 7, null) : ladderPriceData, (i & 256) != 0 ? null : ladderPriceLevels, (i & 512) != 0 ? new LinkedHashMap() : map, (i & 1024) != 0 ? null : marketHours, (i & 2048) != 0 ? null : nbboSummary, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : position, (i & 16384) != 0 ? false : z, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? false : z3, (i & 131072) != 0 ? null : bool, (i & 262144) != 0 ? OrderTimeInForce.GFD : orderTimeInForce, (i & 524288) != 0 ? OrderTimeInForce.GFD : orderTimeInForce2, (i & 1048576) != 0 ? OrderMarketHours.REGULAR_HOURS : orderMarketHours, (i & 2097152) != 0 ? OrderMarketHours.REGULAR_HOURS : orderMarketHours2, (i & 4194304) != 0 ? null : uuid, clock, (i & 16777216) != 0 ? null : buySellData, (i & 33554432) != 0 ? null : shortingInfo, (i & 67108864) != 0 ? LadderScreenState.Ladder.INSTANCE : ladderScreenState, (i & 134217728) != 0 ? LadderDisplayMode.PRICE : ladderDisplayMode, (i & 268435456) != 0 ? new MarketSessionChangeDataState(null, null, 3, null) : marketSessionChangeDataState, (536870912 & i) != 0 ? false : z4, (i & 1073741824) != 0 ? false : z5, (i & Integer.MIN_VALUE) != 0 ? null : num, (i2 & 1) != 0 ? null : num2, (i2 & 2) != 0 ? null : bigDecimal, (i2 & 4) != 0 ? false : z6, (i2 & 8) != 0 ? BigDecimal.ONE : bigDecimal2, (i2 & 16) != 0 ? TradeQuantity.REPLACE : tradeQuantity, (i2 & 32) != 0 ? false : z7, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : bigDecimal3, (i2 & 256) != 0 ? null : num4, (i2 & 512) != 0 ? false : z8, (i2 & 1024) != 0 ? null : equityPostTradeLadderFtuxState, (i2 & 2048) != 0 ? false : z9, (i2 & 4096) != 0 ? false : z10, (i2 & 8192) != 0 ? false : z11, (i2 & 16384) != 0 ? false : z12, (i2 & 32768) != 0 ? false : z13, (i2 & 65536) != 0 ? null : num5, (i2 & 131072) != 0 ? null : ladderCustomGestureDetector3, (i2 & 262144) != 0 ? new LinkedHashMap() : map2, (i2 & 524288) != 0 ? null : selectedPendingOrders, (1048576 & i2) != 0 ? false : z14, (2097152 & i2) != 0 ? false : z15, (4194304 & i2) != 0 ? false : z16, (8388608 & i2) != 0 ? false : z17, (16777216 & i2) != 0 ? false : z18, (33554432 & i2) != 0 ? false : z19, (67108864 & i2) != 0 ? false : z20, (i2 & 134217728) != 0 ? false : z21);
    }

    public final LadderPriceData getLadderPriceData() {
        return this.ladderPriceData;
    }

    public final LadderPriceLevels getLadderPriceLevels() {
        return this.ladderPriceLevels;
    }

    public final Map<Integer, BigDecimal> getZoomOverlayData() {
        return this.zoomOverlayData;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final List<Order> getPendingOrders() {
        return this.pendingOrders;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    public final boolean getInstrumentExternalHalt() {
        return this.instrumentExternalHalt;
    }

    public final boolean getInstrumentInternalHalt() {
        return this.instrumentInternalHalt;
    }

    public final Boolean getAutoSend() {
        return this.autoSend;
    }

    public final OrderTimeInForce getLongTimeInForce() {
        return this.longTimeInForce;
    }

    public final OrderTimeInForce getShortTimeInForce() {
        return this.shortTimeInForce;
    }

    public final OrderMarketHours getLongOrderMarketHours() {
        return this.longOrderMarketHours;
    }

    public final OrderMarketHours getShortOrderMarketHours() {
        return this.shortOrderMarketHours;
    }

    public final UUID getRefIdToTrack() {
        return this.refIdToTrack;
    }

    public final Clock getClock() {
        return this.clock;
    }

    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    public final LadderScreenState getLadderScreenState() {
        return this.ladderScreenState;
    }

    public final LadderDisplayMode getLadderDisplayMode() {
        return this.ladderDisplayMode;
    }

    public final MarketSessionChangeDataState getLadderMarketSessionChangeState() {
        return this.ladderMarketSessionChangeState;
    }

    public final boolean getNbboLoading() {
        return this.nbboLoading;
    }

    public final boolean getQuantitySelectorOpen() {
        return this.quantitySelectorOpen;
    }

    public final Integer getMostRecentSelectedRowIndex() {
        return this.mostRecentSelectedRowIndex;
    }

    public final Integer getSelectedRowIndex() {
        return this.selectedRowIndex;
    }

    public final BigDecimal getSelectedRowPrice() {
        return this.selectedRowPrice;
    }

    public final boolean getShowSettingsBottomSheet() {
        return this.showSettingsBottomSheet;
    }

    public final BigDecimal getTradeQuantity() {
        return this.tradeQuantity;
    }

    public final TradeQuantity getQuantityInputMode() {
        return this.quantityInputMode;
    }

    public final boolean getZoomInProgress() {
        return this.zoomInProgress;
    }

    public final Integer getZoomInitialCenterIndex() {
        return this.zoomInitialCenterIndex;
    }

    public final BigDecimal getZoomInitialCenterPrice() {
        return this.zoomInitialCenterPrice;
    }

    public final Integer getZoomInitialNumberOfItems() {
        return this.zoomInitialNumberOfItems;
    }

    public final boolean getTradeInFlight() {
        return this.tradeInFlight;
    }

    public final EquityPostTradeLadderFtuxState getPostTradeLadderFtuxState() {
        return this.postTradeLadderFtuxState;
    }

    public final boolean getFlattenLoading() {
        return this.flattenLoading;
    }

    public final boolean getMarketBuyLoading() {
        return this.marketBuyLoading;
    }

    public final boolean getMarketSellLoading() {
        return this.marketSellLoading;
    }

    public final boolean getPnlRetirementEnabled() {
        return this.pnlRetirementEnabled;
    }

    public final boolean getShouldShowL2DataMissingBanner() {
        return this.shouldShowL2DataMissingBanner;
    }

    public final Integer getOrderDraggedOverIndex() {
        return this.orderDraggedOverIndex;
    }

    public final LadderCustomGestureDetector3 getPendingOrderDragDirection() {
        return this.pendingOrderDragDirection;
    }

    public final Map<UUID, EquityPendingOrder3> getUiPendingOrdersMap() {
        return this.uiPendingOrdersMap;
    }

    public final LadderState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
        return this.selectedPendingOrders;
    }

    public final boolean getShowQuantitySelector() {
        return this.showQuantitySelector;
    }

    public final boolean getShowSubmitBuy() {
        return this.showSubmitBuy;
    }

    public final boolean getShowSubmitSell() {
        return this.showSubmitSell;
    }

    public final boolean getEtfSupported() {
        return this.etfSupported;
    }

    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    public final boolean getAutoSendKillSwitchEnabled() {
        return this.autoSendKillSwitchEnabled;
    }

    public final boolean getShouldShowAutoSendUpsell() {
        return this.shouldShowAutoSendUpsell;
    }

    public final EquitiesLadderContext getEquitiesLadderContext() {
        return this.equitiesLadderContext;
    }

    public final boolean getShowNbbo() {
        return this.showNbbo;
    }

    public final boolean getShouldPendingOrderChangePriceOnDragEnded() {
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrders;
        Integer num = this.orderDraggedOverIndex;
        if (num == null || (selectedPendingOrders = this.selectedPendingOrders) == null) {
            return false;
        }
        return num == null || num.intValue() != selectedPendingOrders.getRowIndex();
    }

    public final boolean getCanSell() {
        EquityLadderOrderState equityLadderOrderState = this.equityLadderOrderState;
        return equityLadderOrderState != null && equityLadderOrderState.getSellEnabled();
    }

    public final boolean getCanBuy() {
        EquityLadderOrderState equityLadderOrderState = this.equityLadderOrderState;
        return equityLadderOrderState != null && equityLadderOrderState.getBuyEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EquityTradeLadderViewState.TopBarData getTopBarData$feature_equity_trade_ladder_externalDebug() {
        StringResource stringResourceInvoke;
        BigDecimal bigDecimalSubtract;
        BigDecimal bigDecimalSafeDivide;
        List listEmptyList;
        boolean z;
        Money totalReturnAmountForPnl;
        BigDecimal decimalValue;
        DayPnlInfo dayPnlInfo;
        List list;
        BigDecimal bigDecimal;
        String symbol;
        TitleContentState.DeltaDirection deltaDirection;
        boolean z2;
        TitleContentState titleContent5;
        boolean z3;
        boolean z4;
        Money totalReturnAmount;
        BrokerageAccountType brokerageAccountType;
        Position position;
        Money daysPnl;
        Money averageBuyPrice;
        Money averageCostBasis;
        boolean hasPosition = Position5.getHasPosition(this.position);
        Position position2 = this.position;
        BigDecimal decimalValue2 = (position2 == null || (averageCostBasis = position2.getAverageCostBasis()) == null) ? null : averageCostBasis.getDecimalValue();
        Position position3 = this.position;
        BigDecimal decimalValue3 = (position3 == null || (averageBuyPrice = position3.getAverageBuyPrice()) == null) ? null : averageBuyPrice.getDecimalValue();
        if (!hasPosition) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40888R.string.ladder_no_position, new Object[0]);
        } else if (decimalValue2 != null) {
            if (this.position == null) {
                throw new IllegalStateException("Position should not be null when hasPosition is true");
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40888R.string.ladder_positions_format, Formats.getShareQuantityWithSignFormat().format(this.position.getDisplayQuantity()), Formats.getPriceFormat().format(decimalValue2));
        } else if (decimalValue3 != null) {
            if (this.position == null) {
                throw new IllegalStateException("Position should not be null when hasPosition is true");
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40888R.string.ladder_positions_format, Formats.getShareQuantityWithSignFormat().format(this.position.getDisplayQuantity()), Formats.getPriceFormat().format(decimalValue3));
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C40888R.string.ladder_no_position, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke;
        BigDecimal lastTradePrice = this.ladderPriceData.getLastTradePrice();
        Quote quote = this.brokebackQuote;
        Money adjustedPreviousClose = quote != null ? quote.getAdjustedPreviousClose() : null;
        if (lastTradePrice == null || adjustedPreviousClose == null) {
            bigDecimalSubtract = null;
        } else {
            bigDecimalSubtract = lastTradePrice.subtract(adjustedPreviousClose.getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        }
        if (bigDecimalSubtract != null) {
            bigDecimalSafeDivide = BigDecimals7.safeDivide(bigDecimalSubtract, adjustedPreviousClose != null ? adjustedPreviousClose.getDecimalValue() : null);
        } else {
            bigDecimalSafeDivide = null;
        }
        boolean z5 = true;
        StringResource stringResourceInvoke2 = StringResource.INSTANCE.invoke(C40888R.string.ladder_day_delta_label, Moneys4.formatDeltaCurrency$default(bigDecimalSubtract, null, 1, null), Moneys4.formatNoSignPercent$default(bigDecimalSafeDivide, null, 1, null));
        List<Order> list2 = this.pendingOrders;
        if (list2 == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            for (Object obj : list2) {
                if (((Order) obj).getState().isPending()) {
                    listEmptyList.add(obj);
                }
            }
        }
        boolean z6 = hasPosition || !listEmptyList.isEmpty();
        MarketHours marketHours = this.marketHours;
        if (marketHours != null) {
            Instant instant = this.clock.instant();
            Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
            z = marketHours.isOpenRegular(instant);
        }
        Quote quote2 = this.brokebackQuote;
        BigDecimal decimalValue4 = (quote2 == null || (position = this.position) == null || (daysPnl = position.getDaysPnl(quote2)) == null) ? null : daysPnl.getDecimalValue();
        Account account = this.account;
        boolean z7 = (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement() || this.pnlRetirementEnabled) ? false : true;
        if (z7) {
            Quote quote3 = this.brokebackQuote;
            if (quote3 != null) {
                Position position4 = this.position;
                decimalValue = (position4 == null || (totalReturnAmount = position4.getTotalReturnAmount(quote3)) == null) ? null : totalReturnAmount.getDecimalValue();
                dayPnlInfo = null;
                list = listEmptyList;
                bigDecimal = decimalValue;
            }
            dayPnlInfo = null;
            list = listEmptyList;
            bigDecimal = null;
        } else {
            Quote quote4 = this.brokebackQuote;
            if (quote4 != null) {
                Position position5 = this.position;
                if (position5 != null && (totalReturnAmountForPnl = position5.getTotalReturnAmountForPnl(quote4)) != null) {
                    decimalValue = totalReturnAmountForPnl.getDecimalValue();
                }
                dayPnlInfo = null;
                list = listEmptyList;
                bigDecimal = decimalValue;
            }
            dayPnlInfo = null;
            list = listEmptyList;
            bigDecimal = null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        Instrument instrument = this.instrument;
        if (instrument == null || (symbol = instrument.getSymbol()) == null) {
            symbol = "";
        }
        StringResource stringResourceInvoke3 = companion.invoke(symbol);
        if (BigDecimals7.isNegative(bigDecimalSubtract)) {
            deltaDirection = TitleContentState.DeltaDirection.NEGATIVE;
        } else {
            deltaDirection = TitleContentState.DeltaDirection.POSITIVE;
        }
        TitleContentState titleContent52 = new TitleContentState(stringResourceInvoke3, false, stringResourceInvoke2, deltaDirection, false);
        EquityTradeLadderViewState.TopBarData.FlattenButtonData flattenButtonData = new EquityTradeLadderViewState.TopBarData.FlattenButtonData(z6, z, this.flattenLoading, this.postTradeLadderFtuxState == EquityPostTradeLadderFtuxState.SHOW_FLATTEN_ORDERS_TOOLTIP, this.nbboSummary, this.nbboLoading);
        if (this.postTradeLadderFtuxState == EquityPostTradeLadderFtuxState.SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP) {
            z2 = true;
        } else {
            z2 = true;
            z5 = false;
        }
        int size = list.size();
        boolean zIsEmpty = list.isEmpty() ^ z2;
        if (this.postTradeLadderFtuxState == EquityPostTradeLadderFtuxState.SHOW_FTUX_EDUCATION_TOOLIP) {
            z4 = z2;
            titleContent5 = titleContent52;
            z3 = zIsEmpty;
        } else {
            titleContent5 = titleContent52;
            z3 = zIsEmpty;
            z4 = false;
        }
        return new EquityTradeLadderViewState.TopBarData(titleContent5, decimalValue4, bigDecimal, hasPosition, stringResource, flattenButtonData, z5, size, z3, z4, z7 ? new DayPnlInfo(false, companion.invoke(C15889R.string.equity_ladder_retirement_day_pnl_tooltip, new Object[0])) : dayPnlInfo);
    }

    /* renamed from: getMarketClosedHeaderData$feature_equity_trade_ladder_externalDebug */
    public final EquityTradeLadderViewState.MarketClosedHeaderData m1997xeb3a5268() {
        return new EquityTradeLadderViewState.MarketClosedHeaderData(this.ladderMarketSessionChangeState.getHeaderString());
    }

    /* renamed from: getL2DataUnavailableHeaderData$feature_equity_trade_ladder_externalDebug */
    public final EquityTradeLadderViewState.L2DataUnavailableHeaderData m1996x9e573c94() {
        return new EquityTradeLadderViewState.L2DataUnavailableHeaderData(this.shouldShowL2DataMissingBanner ? StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_l2_data_unavailable, new Object[0]) : null);
    }

    /* renamed from: getInstrumentHaltedHeaderData$feature_equity_trade_ladder_externalDebug */
    public final EquityTradeLadderViewState.InstrumentHaltedHeaderData m1995xde5e887() {
        StringResource stringResourceInvoke = null;
        if (this.instrumentExternalHalt || this.instrumentInternalHalt) {
            Instrument instrument = this.instrument;
            if ((instrument != null ? instrument.getSymbol() : null) != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.equity_ladder_instrument_halted, this.instrument.getSymbol());
            }
        }
        return new EquityTradeLadderViewState.InstrumentHaltedHeaderData(stringResourceInvoke);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LadderState getLadderState$feature_equity_trade_ladder_externalDebug() {
        List<Tuples2<BigDecimal, BigDecimal>> listEmptyList;
        List<Tuples2<BigDecimal, BigDecimal>> listEmptyList2;
        final BigDecimal bigDecimalMultiply;
        Money averageBuyPrice;
        BigDecimal decimalValue;
        Position position;
        Money averageCostBasis;
        BigDecimal lastTradePrice = this.ladderPriceData.getLastTradePrice();
        if (lastTradePrice == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.ladderPriceLevels == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<Tuples2<BigDecimal, BigDecimal>> displayedBids = this.ladderPriceData.getDisplayedBids();
        if (displayedBids != null) {
            List<Tuples2<BigDecimal, BigDecimal>> listEmptyList3 = displayedBids;
            if (listEmptyList3.isEmpty()) {
                listEmptyList3 = CollectionsKt.emptyList();
            }
            listEmptyList = listEmptyList3;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        List<Tuples2<BigDecimal, BigDecimal>> displayedAsks = this.ladderPriceData.getDisplayedAsks();
        if (displayedAsks != null) {
            List<Tuples2<BigDecimal, BigDecimal>> listEmptyList4 = displayedAsks;
            if (listEmptyList4.isEmpty()) {
                listEmptyList4 = CollectionsKt.emptyList();
            }
            listEmptyList2 = listEmptyList4;
            if (listEmptyList2 == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
        }
        Object[] objArr = this.ladderPriceLevels.getPriceIncrement().compareTo(new BigDecimal("0.01")) > 0;
        boolean z = this.zoomInProgress;
        if (!z && objArr == true) {
            listEmptyList = Bins.bucketValues(listEmptyList, this.ladderPriceLevels.getPriceIncrement(), false);
        } else if (z) {
            listEmptyList = CollectionsKt.emptyList();
        }
        boolean z2 = this.zoomInProgress;
        if (!z2 && objArr == true) {
            listEmptyList2 = Bins.bucketValues(listEmptyList2, this.ladderPriceLevels.getPriceIncrement(), true);
        } else if (z2) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listEmptyList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tuples2 tuples2 = (Tuples2) next;
            BigDecimal bigDecimal = (BigDecimal) tuples2.component1();
            BigDecimal bigDecimal2 = (BigDecimal) tuples2.component2();
            Integer exactRowIndexFromPrice = this.ladderPriceLevels.getExactRowIndexFromPrice(bigDecimal);
            Tuples2 tuples2M3642to = exactRowIndexFromPrice != null ? Tuples4.m3642to(exactRowIndexFromPrice, new LadderState.LadderData.QuantityBar(Side.START, bigDecimal2, null, AlphaFraction.PiecewiseLinear.INSTANCE.invoke(i), 4, null)) : null;
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj : listEmptyList2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tuples2 tuples22 = (Tuples2) obj;
            BigDecimal bigDecimal3 = (BigDecimal) tuples22.component1();
            BigDecimal bigDecimal4 = (BigDecimal) tuples22.component2();
            Integer exactRowIndexFromPrice2 = this.ladderPriceLevels.getExactRowIndexFromPrice(bigDecimal3);
            Tuples2 tuples2M3642to2 = exactRowIndexFromPrice2 != null ? Tuples4.m3642to(exactRowIndexFromPrice2, new LadderState.LadderData.QuantityBar(Side.END, bigDecimal4, null, AlphaFraction.PiecewiseLinear.INSTANCE.invoke(i3), 4, null)) : null;
            if (tuples2M3642to2 != null) {
                arrayList2.add(tuples2M3642to2);
            }
            i3 = i4;
        }
        LadderState.LadderData.AverageCostLineData averageCostLineDataGenerateAverageCostLine = (this.zoomInProgress || (position = this.position) == null || (averageCostBasis = position.getAverageCostBasis()) == null) ? null : AverageCost.generateAverageCostLine(this.ladderPriceLevels, averageCostBasis.getDecimalValue());
        final int rowIndexFromPriceScaled$default = LadderPriceLevels.getRowIndexFromPriceScaled$default(this.ladderPriceLevels, lastTradePrice, null, 2, null);
        Position position2 = this.position;
        if (position2 == null || (bigDecimalMultiply = position2.getClearingCostBasis()) == null) {
            Position position3 = this.position;
            if (position3 == null || (averageBuyPrice = position3.getAverageBuyPrice()) == null || (decimalValue = averageBuyPrice.getDecimalValue()) == null) {
                bigDecimalMultiply = null;
            } else {
                bigDecimalMultiply = decimalValue.multiply(this.position.getQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
        }
        LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
        LadderDisplayMode ladderDisplayMode = this.ladderDisplayMode;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C40888R.string.ladder_last_trade_price_floating_button_label, Moneys4.formatPrice$default(lastTradePrice, null, 1, null));
        Map map = MapsKt.toMap(arrayList);
        Map map2 = MapsKt.toMap(arrayList2);
        Map<Integer, LadderState.LadderData.PendingOrderRow> mapEmptyMap = this.zoomInProgress ? MapsKt.emptyMap() : getPendingOrders$feature_equity_trade_ladder_externalDebug();
        LadderState.LadderData.SelectedRow selectedRow$feature_equity_trade_ladder_externalDebug = this.zoomInProgress ? null : getSelectedRow$feature_equity_trade_ladder_externalDebug();
        boolean z3 = this.zoomInProgress;
        return new LadderState.LadderData(ladderDisplayMode, ladderPriceLevels, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDataState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return EquityTradeLadderDataState.getLadderState$lambda$12(this.f$0, rowIndexFromPriceScaled$default, bigDecimalMultiply, ((Integer) obj2).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDataState$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return EquityTradeLadderDataState.getLadderState$lambda$13(this.f$0, bigDecimalMultiply, ((Integer) obj2).intValue());
            }
        }, rowIndexFromPriceScaled$default, stringResourceInvoke, map, map2, true, true, mapEmptyMap, selectedRow$feature_equity_trade_ladder_externalDebug, z3 ? null : this.selectedPendingOrders, z3 ? null : this.orderDraggedOverIndex, z3 ? null : this.pendingOrderDragDirection, averageCostLineDataGenerateAverageCostLine, this.quantitySelectorOpen || z3 || this.selectedRowIndex != null, z3 ? companion.invoke(C15889R.string.ladder_zoom_level_msg, Formats.getPriceFormat().format(this.ladderPriceLevels.getDisplayPriceIncrement())) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLadderState$lambda$12(EquityTradeLadderDataState equityTradeLadderDataState, int i, BigDecimal bigDecimal, int i2) {
        return equityTradeLadderDataState.getPriceText$feature_equity_trade_ladder_externalDebug(i2, i, bigDecimal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLadderState$lambda$13(EquityTradeLadderDataState equityTradeLadderDataState, BigDecimal bigDecimal, int i) {
        return equityTradeLadderDataState.getSelectedPriceText$feature_equity_trade_ladder_externalDebug(bigDecimal);
    }

    public final String getPriceText$feature_equity_trade_ladder_externalDebug(int index, int lastPriceIndex, BigDecimal openPnlCostBasis) {
        BigDecimal lastTradePrice = this.ladderPriceData.getLastTradePrice();
        if (lastTradePrice == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.ladderPriceLevels == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.ladderDisplayMode.ordinal()];
        if (i == 1) {
            if (index == lastPriceIndex && this.ladderPriceLevels.getScale() > 1) {
                return Moneys4.formatPrice$default(lastTradePrice, null, 1, null);
            }
            return Moneys4.formatPrice$default(this.ladderPriceLevels.getPrice(index), null, 1, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal price = this.ladderPriceLevels.getPrice(index);
        Position position = this.position;
        BigDecimal quantity = position != null ? position.getQuantity() : null;
        if (quantity == null || openPnlCostBasis == null) {
            return "-";
        }
        if (index != lastPriceIndex || this.ladderPriceLevels.getScale() <= 1) {
            lastTradePrice = price;
        }
        BigDecimal bigDecimalMultiply = quantity.multiply(lastTradePrice);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalSubtract = bigDecimalMultiply.subtract(openPnlCostBasis);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return Moneys4.formatDeltaCurrency$default(bigDecimalSubtract, null, 1, null);
    }

    public final String getSelectedPriceText$feature_equity_trade_ladder_externalDebug(BigDecimal openPnlCostBasis) {
        BigDecimal bigDecimal;
        if (this.ladderPriceData.getLastTradePrice() == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.ladderPriceLevels == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.ladderDisplayMode.ordinal()];
        if (i == 1) {
            return Moneys4.formatPrice$default(this.selectedRowPrice, null, 1, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Position position = this.position;
        BigDecimal quantity = position != null ? position.getQuantity() : null;
        if (quantity == null || openPnlCostBasis == null || (bigDecimal = this.selectedRowPrice) == null) {
            return "-";
        }
        BigDecimal bigDecimalMultiply = quantity.multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalSubtract = bigDecimalMultiply.subtract(openPnlCostBasis);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return Moneys4.formatDeltaCurrency$default(bigDecimalSubtract, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<Integer, LadderState.LadderData.PendingOrderRow> getPendingOrders$feature_equity_trade_ladder_externalDebug() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int iIntValue;
        List list = CollectionsKt.toList(this.uiPendingOrdersMap.values());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            EquityPendingOrder3 equityPendingOrder3 = (EquityPendingOrder3) obj;
            if (equityPendingOrder3.getOrderType() != OrderType.MARKET || equityPendingOrder3.getOrderTrigger() != OrderTrigger.IMMEDIATE) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            BigDecimal price = ((EquityPendingOrder3) next).getPrice();
            if (price == null) {
                iIntValue = -1;
            } else {
                LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
                Integer numValueOf = ladderPriceLevels != null ? Integer.valueOf(LadderPriceLevels.getRowIndexFromPriceScaled$default(ladderPriceLevels, price, null, 2, null)) : null;
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            }
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            Object arrayList4 = linkedHashMap.get(numValueOf2);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(numValueOf2, arrayList4);
            }
            ((List) arrayList4).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getKey()).intValue() >= 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            int iIntValue2 = ((Number) entry2.getKey()).intValue();
            List list2 = (List) entry2.getValue();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Object obj2 : list2) {
                EquityOrderSide side = ((EquityPendingOrder3) obj2).getSide();
                Object arrayList5 = linkedHashMap4.get(side);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap4.put(side, arrayList5);
                }
                ((List) arrayList5).add(obj2);
            }
            List list3 = (List) linkedHashMap4.get(EquityOrderSide.SELL_SHORT);
            List list4 = (List) linkedHashMap4.get(EquityOrderSide.BUY);
            if (list4 != null) {
                List list5 = list4;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList.add(EquityOrders.toPendingOrderPillData((EquityPendingOrder3) it2.next()));
                }
            } else {
                arrayList = null;
            }
            LadderState.LadderData.PendingOrderRow.Group groupCreateGroup = OrderPills.createGroup(iIntValue2, arrayList, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDataState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return EquityTradeLadderDataState.getPendingOrders$lambda$25$lambda$20(this.f$0, (EquityPendingOrder3) obj3);
                }
            }, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDataState$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return EquityTradeLadderDataState.getPendingOrders$lambda$25$lambda$21((BigDecimal) obj3);
                }
            });
            if (list3 == null) {
                list3 = (List) linkedHashMap4.get(EquityOrderSide.SELL);
            }
            if (list3 != null) {
                List list6 = list3;
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(EquityOrders.toPendingOrderPillData((EquityPendingOrder3) it3.next()));
                }
            } else {
                arrayList2 = null;
            }
            linkedHashMap3.put(key, new LadderState.LadderData.PendingOrderRow(groupCreateGroup, OrderPills.createGroup(iIntValue2, arrayList2, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDataState$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return EquityTradeLadderDataState.getPendingOrders$lambda$25$lambda$23(this.f$0, (EquityPendingOrder3) obj3);
                }
            }, new Function1() { // from class: com.robinhood.android.equitytradeladder.EquityTradeLadderDataState$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return EquityTradeLadderDataState.getPendingOrders$lambda$25$lambda$24((BigDecimal) obj3);
                }
            })));
        }
        return linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PillStyle.PillVisualState getPendingOrders$lambda$25$lambda$20(EquityTradeLadderDataState equityTradeLadderDataState, EquityPendingOrder3 pendingOrder) {
        Intrinsics.checkNotNullParameter(pendingOrder, "pendingOrder");
        return PendingOrder2.determinePillVisualState(pendingOrder, equityTradeLadderDataState.marketHours, equityTradeLadderDataState.clock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPendingOrders$lambda$25$lambda$21(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return Formats.getIntegerDeltaFormat().format(quantity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PillStyle.PillVisualState getPendingOrders$lambda$25$lambda$23(EquityTradeLadderDataState equityTradeLadderDataState, EquityPendingOrder3 pendingOrder) {
        Intrinsics.checkNotNullParameter(pendingOrder, "pendingOrder");
        return PendingOrder2.determinePillVisualState(pendingOrder, equityTradeLadderDataState.marketHours, equityTradeLadderDataState.clock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPendingOrders$lambda$25$lambda$24(BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        return Formats.getIntegerDeltaFormat().format(quantity);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getSellOrderLabel$feature_equity_trade_ladder_externalDebug(OrderType orderType, OrderTrigger orderTrigger) {
        boolean z;
        EquityLadderOrderState equityLadderOrderState;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderTrigger, "orderTrigger");
        if (Position5.isLongPositionOrPending(this.position) || (equityLadderOrderState = this.equityLadderOrderState) == null) {
            z = false;
        } else {
            z = true;
            if (!equityLadderOrderState.getAllowShorting()) {
            }
        }
        if (orderTrigger == OrderTrigger.STOP) {
            return z ? C15889R.string.short_stop_cta : C15889R.string.sell_stop_cta;
        }
        if (orderType == OrderType.LIMIT && orderTrigger == OrderTrigger.IMMEDIATE) {
            return z ? C15889R.string.short_limit_cta : C15889R.string.sell_limit_cta;
        }
        return C15889R.string.sell_limit_cta;
    }

    public final LadderState.LadderData.SelectedRow getSelectedRow$feature_equity_trade_ladder_externalDebug() {
        Integer num;
        LadderState.LadderData.SelectedRow.OrderConfig orderConfig;
        LadderState.LadderData.SelectedRow.OrderConfig orderConfig2;
        boolean canSell;
        LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
        if (ladderPriceLevels == null || (num = this.selectedRowIndex) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        BigDecimal topBid = this.ladderPriceData.getTopBid();
        if (topBid == null && (topBid = this.ladderPriceData.getLastTradePrice()) == null) {
            return null;
        }
        BigDecimal topAsk = this.ladderPriceData.getTopAsk();
        if (topAsk == null && (topAsk = this.ladderPriceData.getLastTradePrice()) == null) {
            return null;
        }
        int rowIndexFromPriceScaled = ladderPriceLevels.getRowIndexFromPriceScaled(topBid, LadderPriceLevels5.DOWN);
        if (iIntValue < ladderPriceLevels.getRowIndexFromPriceScaled(topAsk, LadderPriceLevels5.f6304UP)) {
            OrderType orderType = OrderType.MARKET;
            OrderTrigger orderTrigger = OrderTrigger.STOP;
            boolean canBuy = getCanBuy();
            Color colorM6701boximpl = Color.m6701boximpl(Constants7.getDisabledColor());
            colorM6701boximpl.getValue();
            orderConfig = new LadderState.LadderData.SelectedRow.OrderConfig(C15889R.string.buy_stop_cta, canBuy, orderType, orderTrigger, false, !getCanBuy() ? colorM6701boximpl : null, 16, null);
        } else {
            OrderType orderType2 = OrderType.LIMIT;
            OrderTrigger orderTrigger2 = OrderTrigger.IMMEDIATE;
            boolean canBuy2 = getCanBuy();
            Color colorM6701boximpl2 = Color.m6701boximpl(Constants7.getDisabledColor());
            colorM6701boximpl2.getValue();
            orderConfig = new LadderState.LadderData.SelectedRow.OrderConfig(C15889R.string.buy_limit_cta, canBuy2, orderType2, orderTrigger2, false, !getCanBuy() ? colorM6701boximpl2 : null, 16, null);
        }
        if (iIntValue > rowIndexFromPriceScaled) {
            OrderType orderType3 = OrderType.MARKET;
            OrderTrigger orderTrigger3 = OrderTrigger.STOP;
            EquityLadderOrderState equityLadderOrderState = this.equityLadderOrderState;
            if (equityLadderOrderState != null && equityLadderOrderState.getAllowShorting()) {
                canSell = this.equityLadderOrderState.getBuySellData().getSellToOpenMarketSessionActive();
            } else {
                canSell = getCanSell();
            }
            boolean z = canSell;
            boolean z2 = !z;
            Color colorM6701boximpl3 = Color.m6701boximpl(Constants7.getDisabledColor());
            colorM6701boximpl3.getValue();
            orderConfig2 = new LadderState.LadderData.SelectedRow.OrderConfig(getSellOrderLabel$feature_equity_trade_ladder_externalDebug(orderType3, orderTrigger3), z, orderType3, orderTrigger3, z2, !z ? colorM6701boximpl3 : null, null);
        } else {
            OrderType orderType4 = OrderType.LIMIT;
            OrderTrigger orderTrigger4 = OrderTrigger.IMMEDIATE;
            boolean canSell2 = getCanSell();
            boolean z3 = !getCanSell();
            Color colorM6701boximpl4 = Color.m6701boximpl(Constants7.getDisabledColor());
            colorM6701boximpl4.getValue();
            orderConfig2 = new LadderState.LadderData.SelectedRow.OrderConfig(getSellOrderLabel$feature_equity_trade_ladder_externalDebug(orderType4, orderTrigger4), canSell2, orderType4, orderTrigger4, z3, !getCanSell() ? colorM6701boximpl4 : null, null);
        }
        return new LadderState.LadderData.SelectedRow(iIntValue, orderConfig, orderConfig2);
    }

    public final EquityTradeLadderViewState.BottomBarData getBottomBarData$feature_equity_trade_ladder_externalDebug() {
        EquityTradeButtonState equityTradeButtonState;
        EquityTradeButtonState sellButtonState;
        if (this.showNbbo && !this.showQuantitySelector) {
            return new EquityTradeLadderViewState.BottomBarData.NbboData(this.nbboLoading, this.nbboSummary);
        }
        EquityLadderOrderState equityLadderOrderState = this.equityLadderOrderState;
        InstrumentBuyingPower instrumentBuyingPower = this.buyingPower;
        StringResource stringResourceGenerateBuyingPowerDisplay = instrumentBuyingPower != null ? InstrumentBuyingPower2.generateBuyingPowerDisplay(instrumentBuyingPower, this.shortingEnabled, Position5.isShortPositionOrPending(this.position), Position5.isLongPositionOrPending(this.position), this.accountDisplayName) : null;
        StringResource stringResource = this.accountDisplayName;
        BigDecimal bigDecimal = this.tradeQuantity;
        boolean z = this.quantitySelectorOpen;
        boolean z2 = this.marketBuyLoading && this.tradeInFlight;
        boolean z3 = this.marketSellLoading && this.tradeInFlight;
        NbboSummary nbboSummary = this.nbboSummary;
        boolean z4 = this.nbboLoading;
        boolean z5 = this.showNbbo;
        if (equityLadderOrderState == null || (equityTradeButtonState = equityLadderOrderState.getBuyButtonState()) == null) {
            equityTradeButtonState = new EquityTradeButtonState(false, false, false, false, null, 31, null);
        }
        EquityTradeButtonState equityTradeButtonState2 = (equityLadderOrderState == null || (sellButtonState = equityLadderOrderState.getSellButtonState()) == null) ? new EquityTradeButtonState(false, false, false, false, null, 31, null) : sellButtonState;
        TradeQuantity tradeQuantity = this.quantityInputMode;
        EquityLadderOrderState equityLadderOrderState2 = this.equityLadderOrderState;
        return new EquityTradeLadderViewState.BottomBarData.MarketOrderData(stringResource, bigDecimal, stringResourceGenerateBuyingPowerDisplay, z, z2, z3, z5, z4, nbboSummary, equityTradeButtonState, equityTradeButtonState2, tradeQuantity, equityLadderOrderState2 != null && equityLadderOrderState2.getAllowShorting());
    }

    /* renamed from: getSettingsBottomSheetData$feature_equity_trade_ladder_externalDebug */
    public final EquityTradeLadderViewState.SettingsBottomSheetData m1998xbf92d998() {
        StringResource stringResourceInvoke;
        if (this.instrument == null || !this.showSettingsBottomSheet || this.account == null) {
            return null;
        }
        Instrument instrument = this.instrument;
        Account account = this.account;
        if (this.etfSupported) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.gated_etf_trade_stocks_and_etfs_label, new Object[0]);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C15889R.string.trade_stocks_label, new Object[0]);
        }
        Boolean boolValueOf = Boolean.valueOf(Intrinsics.areEqual(this.autoSend, Boolean.TRUE) && !this.autoSendKillSwitchEnabled);
        boolean z = this.autoSendKillSwitchEnabled;
        EquityLadderOrderState equityLadderOrderState = this.equityLadderOrderState;
        return new EquityTradeLadderViewState.SettingsBottomSheetData(instrument, account, stringResourceInvoke, boolValueOf, false, z, equityLadderOrderState != null && equityLadderOrderState.getAllowShorting());
    }

    /* renamed from: getShowMarketBuyButtons$feature_equity_trade_ladder_externalDebug, reason: from getter */
    public final boolean getShowMarketBuyButtons() {
        return this.showMarketBuyButtons;
    }

    /* renamed from: getEquityLadderOrderState$feature_equity_trade_ladder_externalDebug, reason: from getter */
    public final EquityLadderOrderState getEquityLadderOrderState() {
        return this.equityLadderOrderState;
    }

    private final EquityLadderOrderState buildOrderState() {
        boolean z;
        boolean z2;
        Account account = this.account;
        if (account == null) {
            return null;
        }
        Quantity quantity = new Quantity(this.tradeQuantity);
        Instrument instrument = this.instrument;
        if (instrument == null) {
            return null;
        }
        Position position = this.position;
        InstrumentBuyingPower instrumentBuyingPower = this.buyingPower;
        OrderMarketHours orderMarketHours = this.longOrderMarketHours;
        OrderMarketHours orderMarketHours2 = this.shortOrderMarketHours;
        OrderTimeInForce orderTimeInForce = this.longTimeInForce;
        OrderTimeInForce orderTimeInForce2 = this.shortTimeInForce;
        BigDecimal bigDecimal = this.selectedRowPrice;
        if (!Intrinsics.areEqual(this.autoSend, Boolean.TRUE) || this.autoSendKillSwitchEnabled) {
            z = false;
            z2 = true;
        } else {
            z = true;
            z2 = true;
        }
        boolean z3 = this.shortingEnabled;
        boolean z4 = this.showSubmitBuy;
        boolean z5 = this.showSubmitSell;
        boolean z6 = this.showMarketBuyButtons;
        boolean z7 = !z6;
        boolean z8 = !z6;
        boolean z9 = this.tradeInFlight;
        BuySellData buySellData = this.buySellData;
        if (buySellData == null) {
            return null;
        }
        return new EquityLadderOrderState(account, instrument, position, quantity, instrumentBuyingPower, orderMarketHours, orderMarketHours2, orderTimeInForce, orderTimeInForce2, bigDecimal, z, z3, z4, z5, z7, z8, z9, buySellData, this.shortingInfo);
    }

    public final Map<Integer, BigDecimal> getZoomOverlayData$feature_equity_trade_ladder_externalDebug() {
        if (!this.zoomInProgress) {
            return null;
        }
        if (!this.zoomOverlayData.isEmpty()) {
            return this.zoomOverlayData;
        }
        boolean z = this.zoomInitialCenterIndex != null;
        BigDecimal bigDecimal = this.zoomInitialCenterPrice;
        Integer num = this.zoomInitialNumberOfItems;
        Map<Integer, BigDecimal> mapBuildZoomOverlayData$feature_equity_trade_ladder_externalDebug = buildZoomOverlayData$feature_equity_trade_ladder_externalDebug(z, bigDecimal, num != null ? num.intValue() : 50, this.ladderPriceLevels);
        if (mapBuildZoomOverlayData$feature_equity_trade_ladder_externalDebug != null) {
            this.zoomOverlayData.clear();
            this.zoomOverlayData.putAll(mapBuildZoomOverlayData$feature_equity_trade_ladder_externalDebug);
        }
        return this.zoomOverlayData;
    }

    /* renamed from: buildZoomOverlayData$feature_equity_trade_ladder_externalDebug$default */
    public static /* synthetic */ Map m1991x6e537b49(EquityTradeLadderDataState equityTradeLadderDataState, boolean z, BigDecimal bigDecimal, int i, LadderPriceLevels ladderPriceLevels, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bigDecimal = null;
        }
        if ((i2 & 4) != 0) {
            i = 50;
        }
        return equityTradeLadderDataState.buildZoomOverlayData$feature_equity_trade_ladder_externalDebug(z, bigDecimal, i, ladderPriceLevels);
    }

    public final Map<Integer, BigDecimal> buildZoomOverlayData$feature_equity_trade_ladder_externalDebug(boolean hasStoredZoomCenter, BigDecimal centerPrice, int numberOfItems, LadderPriceLevels ladderPriceLevels) {
        if (ladderPriceLevels != null && hasStoredZoomCenter) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int rowIndexFromPriceScaled$default = centerPrice != null ? LadderPriceLevels.getRowIndexFromPriceScaled$default(ladderPriceLevels, centerPrice, null, 2, null) : 0;
            int i = numberOfItems / 2;
            int iMax = Math.max(rowIndexFromPriceScaled$default - i, 0);
            int i2 = rowIndexFromPriceScaled$default + i;
            if (iMax <= i2) {
                while (true) {
                    BigDecimal price = ladderPriceLevels.getPrice(iMax);
                    if (!Intrinsics.areEqual(price, BigDecimal.ZERO)) {
                        linkedHashMap.put(Integer.valueOf(iMax), price);
                    }
                    if (iMax == i2) {
                        break;
                    }
                    iMax++;
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
        }
        return null;
    }

    /* renamed from: copyForLadderPriceLevel$feature_equity_trade_ladder_externalDebug$default */
    public static /* synthetic */ EquityTradeLadderDataState m1992xa51c7201(EquityTradeLadderDataState equityTradeLadderDataState, LadderPriceData ladderPriceData, EquityTradeLadderBinManager.BinConfiguration binConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            ladderPriceData = equityTradeLadderDataState.ladderPriceData;
        }
        return equityTradeLadderDataState.m1993x4c92f064(ladderPriceData, binConfiguration);
    }

    /* renamed from: copyForLadderPriceLevel$feature_equity_trade_ladder_externalDebug */
    public final EquityTradeLadderDataState m1993x4c92f064(LadderPriceData newLadderPriceData, EquityTradeLadderBinManager.BinConfiguration newConfig) {
        Intrinsics.checkNotNullParameter(newLadderPriceData, "newLadderPriceData");
        return copy$default(this, null, null, null, null, null, this.brokebackQuote, null, newLadderPriceData, LadderPriceLevels.INSTANCE.updateLadderPriceLevels(this.ladderPriceLevels, newLadderPriceData, newConfig != null ? Integer.valueOf(newConfig.getScale()) : null, newConfig != null ? newConfig.getIncrement() : null, newConfig != null ? newConfig.getAvailableIntervals() : null), null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -417, 268435455, null);
    }

    public final EquityTradeLadderDataState copyToClearSelectionState() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, true, false, false, false, false, false, false, false, -1073741825, 260359676, null);
    }
}
