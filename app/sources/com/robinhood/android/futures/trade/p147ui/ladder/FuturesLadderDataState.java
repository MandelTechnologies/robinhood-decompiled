package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.util.MathHelpers;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxProgressState;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.analytics.LoggingUtils6;
import com.robinhood.android.futures.trade.extensions.Moneys;
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.futures.trade.MarketSessionChangeDataState;
import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.android.models.futures.api.account.FuturesAccountStatus;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.api.order.FuturesOrderTrigger;
import com.robinhood.android.models.futures.api.order.FuturesOrderType;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesCostBasis;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.referral.SingularAttributionManager;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.FuturesContractContext;
import com.robinhood.rosetta.eventlogging.FuturesLadderContext;
import com.robinhood.rosetta.eventlogging.FuturesPositionContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.futures.FuturesPnLHelper;
import com.robinhood.store.futures.PostTradeLadderFtuxState;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: FuturesLadderDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 Ë\u00012\u00020\u0001:\nÇ\u0001È\u0001É\u0001Ê\u0001Ë\u0001Bÿ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\u0019\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001f\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0012\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0012\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u00103\u001a\u000204\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u00109\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u0006\u0010w\u001a\u00020xJ\u001e\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010{\u001a\u00020|2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\u0012J\u0014\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0\u0012H\u0000¢\u0006\u0003\b\u0080\u0001J*\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\f\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\u0012H\u0000¢\u0006\u0003\b\u0083\u0001J\u0012\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0000¢\u0006\u0003\b\u0086\u0001J\u0007\u0010\u0087\u0001\u001a\u00020|J\u001e\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0006\u0010{\u001a\u00020|2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\u0012J\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001J<\u0010\u008c\u0001\u001a\u00030\u008d\u00012\f\b\u0002\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\n\b\u0002\u0010\u0092\u0001\u001a\u00030\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001JL\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u001c\u0010\u008e\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0005\u0012\u00030\u008f\u00010\u0096\u0001¢\u0006\u0003\b\u0097\u00012\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u0091\u00012\n\b\u0002\u0010\u0092\u0001\u001a\u00030\u0093\u00012\f\b\u0002\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001J\b\u0010\u0098\u0001\u001a\u00030\u008f\u0001J\u001e\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020,0\u00122\u000f\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J?\u0010\u009b\u0001\u001a\u00020\u00002\t\b\u0002\u0010\u009c\u0001\u001a\u00020\t2\u000b\b\u0002\u0010\u009d\u0001\u001a\u0004\u0018\u00010\r2\u000b\b\u0002\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000f2\u0011\b\u0002\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u0007\u0010\u009f\u0001\u001a\u00020\u0000J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010£\u0001\u001a\u00020\tHÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010RJ\u0011\u0010¬\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010RJ\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0019HÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010ZJ\n\u0010°\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010±\u0001\u001a\u00020\"HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\u0011\u0010µ\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010ZJ\u0010\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020*0\u0012HÆ\u0003J\u0010\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020,0\u0012HÆ\u0003J\u0010\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050.HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010»\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010RJ\n\u0010¼\u0001\u001a\u000204HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\n\u0010¿\u0001\u001a\u00020:HÆ\u0003J\u008e\u0003\u0010À\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\u00192\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00122\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00122\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\b\b\u0002\u00109\u001a\u00020:HÆ\u0001¢\u0006\u0003\u0010Á\u0001J\u0015\u0010Â\u0001\u001a\u00020\u00192\t\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ä\u0001\u001a\u00020\u001fHÖ\u0001J\u000b\u0010Å\u0001\u001a\u00030Æ\u0001HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bK\u0010BR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010S\u001a\u0004\b\u0018\u0010RR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010S\u001a\u0004\bT\u0010RR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u001d\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010[\u001a\u0004\bY\u0010ZR\u0011\u0010 \u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010XR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010%\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\ba\u0010XR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0015\u0010(\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010[\u001a\u0004\bd\u0010ZR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0012¢\u0006\b\n\u0000\u001a\u0004\be\u0010MR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0012¢\u0006\b\n\u0000\u001a\u0004\bf\u0010MR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0013\u0010/\u001a\u0004\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0013\u00101\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010@R\u0015\u00102\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010S\u001a\u0004\bl\u0010RR\u0011\u00103\u001a\u000204¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0011\u00109\u001a\u00020:¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0011\u0010u\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bv\u0010X¨\u0006Ì\u0001"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;", "", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "contractId", "Ljava/util/UUID;", "tradeQuantity", "Ljava/math/BigDecimal;", "ladderPriceData", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceData;", "account", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", SingularAttributionManager.PRODUCT_PARAM_KEY, "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "rhdBuyingPower", "pendingOrders", "", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "pnlCostBasis", "Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "nextOpenTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "isInTradingSession", "", "hasOrdersForContract", "effectiveClosesRange", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;", "showSettingsBottomSheet", "selectedRowIndex", "", "quantitySelectorOpen", "ladderDisplayMode", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;", "ladderPriceLevels", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;", "zoomInProgress", "selectedPendingOrders", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "orderDraggedOverIndex", "pendingPlacedOrders", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingPlacedOrder;", "pendingReplacedOrders", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingReplacedOrder;", "pendingOrderIdsInDeletion", "", "pendingOrderDragDirection", "Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "refIdToTrack", "autoSend", "timeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "ladderFtuxProgressState", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "postTradeLadderFtuxProgressState", "Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "ladderMarketSessionChangeState", "Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceData;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Ljava/math/BigDecimal;Ljava/util/List;Lcom/robinhood/android/models/futures/db/FuturesCostBasis;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;ZLjava/lang/Integer;ZLcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;ZLcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;Ljava/util/UUID;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;Lcom/robinhood/store/futures/PostTradeLadderFtuxState;Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;)V", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getContractId", "()Ljava/util/UUID;", "getTradeQuantity", "()Ljava/math/BigDecimal;", "getLadderPriceData", "()Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceData;", "getAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "getProduct", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "getRhdBuyingPower", "getPendingOrders", "()Ljava/util/List;", "getPnlCostBasis", "()Lcom/robinhood/android/models/futures/db/FuturesCostBasis;", "getNextOpenTradingSession", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasOrdersForContract", "getEffectiveClosesRange", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;", "getShowSettingsBottomSheet", "()Z", "getSelectedRowIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuantitySelectorOpen", "getLadderDisplayMode", "()Lcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;", "getLadderPriceLevels", "()Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;", "getZoomInProgress", "getSelectedPendingOrders", "()Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;", "getOrderDraggedOverIndex", "getPendingPlacedOrders", "getPendingReplacedOrders", "getPendingOrderIdsInDeletion", "()Ljava/util/Set;", "getPendingOrderDragDirection", "()Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;", "getRefIdToTrack", "getAutoSend", "getTimeInForce", "()Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "getLadderFtuxProgressState", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;", "getPostTradeLadderFtuxProgressState", "()Lcom/robinhood/store/futures/PostTradeLadderFtuxState;", "getLadderMarketSessionChangeState", "()Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "shouldPendingOrderChangePriceOnDragEnded", "getShouldPendingOrderChangePriceOnDragEnded", "getTopBarData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$TopBarData;", "getLadderData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData;", "quantityPanel", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$QuantityPanelData;", "allOrdersPendingExecution", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", "getAllOrdersPendingExecution", "getAllOrdersPendingExecution$feature_futures_trade_externalDebug", "", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$PendingOrderRow;", "getPendingOrders$feature_futures_trade_externalDebug", "getSelectedRow", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedRow;", "getSelectedRow$feature_futures_trade_externalDebug", "getQuantityPanelData", "getBottomPanelData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$BottomPanelData;", "getSettingsBottomSheetData", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$SettingsBottomSheetData;", "withDefaultInteractionEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "getLoggingContext", "updatePendingReplacedOrders", "newPendingOrders", "copyForLadderPriceLevel", "newLadderPriceData", "newContract", "newProduct", "copyToClearSelectionState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceData;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;Ljava/math/BigDecimal;Ljava/util/List;Lcom/robinhood/android/models/futures/db/FuturesCostBasis;Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;ZLjava/lang/Integer;ZLcom/robinhood/android/futures/trade/ui/ladder/LadderDisplayMode;Lcom/robinhood/android/futures/trade/ui/ladder/LadderPriceLevels;ZLcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderViewState$LadderData$SelectedPendingOrders;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lcom/robinhood/android/futures/trade/ui/ladder/gestures/DragDirection;Ljava/util/UUID;Ljava/lang/Boolean;Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxProgressState;Lcom/robinhood/store/futures/PostTradeLadderFtuxState;Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;)Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState;", "equals", "other", "hashCode", "toString", "", "PendingOrder", "PendingReplacedOrder", "PendingPlacedOrder", "PendingFilledOrder", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class FuturesLadderDataState {
    private static final int NUM_DECIMAL_FOR_AVERAGE_PRICE = 2;
    private final FuturesAccount account;
    private final Boolean autoSend;
    private final FuturesContract contract;
    private final UUID contractId;
    private final FuturesClosesRange effectiveClosesRange;
    private final Boolean hasOrdersForContract;
    private final Boolean isInTradingSession;
    private final FuturesLadderDataState2 ladderDisplayMode;
    private final LadderFtuxProgressState ladderFtuxProgressState;
    private final MarketSessionChangeDataState ladderMarketSessionChangeState;
    private final LadderPriceData ladderPriceData;
    private final LadderPriceLevels ladderPriceLevels;
    private final FuturesTradingHours.Session nextOpenTradingSession;
    private final Integer orderDraggedOverIndex;
    private final LadderCustomGestureDetector pendingOrderDragDirection;
    private final Set<UUID> pendingOrderIdsInDeletion;
    private final List<UiFuturesOrder> pendingOrders;
    private final List<PendingPlacedOrder> pendingPlacedOrders;
    private final List<PendingReplacedOrder> pendingReplacedOrders;
    private final FuturesCostBasis pnlCostBasis;
    private final PostTradeLadderFtuxState postTradeLadderFtuxProgressState;
    private final FuturesProduct product;
    private final boolean quantitySelectorOpen;
    private final UUID refIdToTrack;
    private final BigDecimal rhdBuyingPower;
    private final FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders;
    private final Integer selectedRowIndex;
    private final boolean showSettingsBottomSheet;
    private final Screen sourceScreen;
    private final FuturesTimeInForce timeInForce;
    private final BigDecimal tradeQuantity;
    private final boolean zoomInProgress;
    public static final int $stable = 8;

    public static /* synthetic */ FuturesLadderDataState copy$default(FuturesLadderDataState futuresLadderDataState, Screen screen, UUID uuid, BigDecimal bigDecimal, LadderPriceData ladderPriceLevels2, FuturesAccount futuresAccount, FuturesContract futuresContract, FuturesProduct futuresProduct, BigDecimal bigDecimal2, List list, FuturesCostBasis futuresCostBasis, FuturesTradingHours.Session session, Boolean bool, Boolean bool2, FuturesClosesRange futuresClosesRange, boolean z, Integer num, boolean z2, FuturesLadderDataState2 futuresLadderDataState2, LadderPriceLevels ladderPriceLevels, boolean z3, FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer num2, List list2, List list3, Set set, LadderCustomGestureDetector ladderCustomGestureDetector, UUID uuid2, Boolean bool3, FuturesTimeInForce futuresTimeInForce, LadderFtuxProgressState ladderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxState, MarketSessionChangeDataState marketSessionChangeDataState, int i, Object obj) {
        MarketSessionChangeDataState marketSessionChangeDataState2;
        PostTradeLadderFtuxState postTradeLadderFtuxState2;
        Integer num3;
        boolean z4;
        FuturesLadderDataState2 futuresLadderDataState22;
        LadderPriceLevels ladderPriceLevels3;
        boolean z5;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders2;
        Integer num4;
        List list4;
        List list5;
        Set set2;
        LadderCustomGestureDetector ladderCustomGestureDetector2;
        UUID uuid3;
        Boolean bool4;
        FuturesTimeInForce futuresTimeInForce2;
        LadderFtuxProgressState ladderFtuxProgressState2;
        boolean z6;
        UUID uuid4;
        BigDecimal bigDecimal3;
        LadderPriceData ladderPriceLevels22;
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
        Screen screen2 = (i & 1) != 0 ? futuresLadderDataState.sourceScreen : screen;
        UUID uuid5 = (i & 2) != 0 ? futuresLadderDataState.contractId : uuid;
        BigDecimal bigDecimal5 = (i & 4) != 0 ? futuresLadderDataState.tradeQuantity : bigDecimal;
        LadderPriceData ladderPriceLevels23 = (i & 8) != 0 ? futuresLadderDataState.ladderPriceData : ladderPriceLevels2;
        FuturesAccount futuresAccount3 = (i & 16) != 0 ? futuresLadderDataState.account : futuresAccount;
        FuturesContract futuresContract3 = (i & 32) != 0 ? futuresLadderDataState.contract : futuresContract;
        FuturesProduct futuresProduct3 = (i & 64) != 0 ? futuresLadderDataState.product : futuresProduct;
        BigDecimal bigDecimal6 = (i & 128) != 0 ? futuresLadderDataState.rhdBuyingPower : bigDecimal2;
        List list7 = (i & 256) != 0 ? futuresLadderDataState.pendingOrders : list;
        FuturesCostBasis futuresCostBasis3 = (i & 512) != 0 ? futuresLadderDataState.pnlCostBasis : futuresCostBasis;
        FuturesTradingHours.Session session3 = (i & 1024) != 0 ? futuresLadderDataState.nextOpenTradingSession : session;
        Boolean bool7 = (i & 2048) != 0 ? futuresLadderDataState.isInTradingSession : bool;
        Boolean bool8 = (i & 4096) != 0 ? futuresLadderDataState.hasOrdersForContract : bool2;
        FuturesClosesRange futuresClosesRange3 = (i & 8192) != 0 ? futuresLadderDataState.effectiveClosesRange : futuresClosesRange;
        Screen screen3 = screen2;
        boolean z7 = (i & 16384) != 0 ? futuresLadderDataState.showSettingsBottomSheet : z;
        Integer num5 = (i & 32768) != 0 ? futuresLadderDataState.selectedRowIndex : num;
        boolean z8 = (i & 65536) != 0 ? futuresLadderDataState.quantitySelectorOpen : z2;
        FuturesLadderDataState2 futuresLadderDataState23 = (i & 131072) != 0 ? futuresLadderDataState.ladderDisplayMode : futuresLadderDataState2;
        LadderPriceLevels ladderPriceLevels4 = (i & 262144) != 0 ? futuresLadderDataState.ladderPriceLevels : ladderPriceLevels;
        boolean z9 = (i & 524288) != 0 ? futuresLadderDataState.zoomInProgress : z3;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders3 = (i & 1048576) != 0 ? futuresLadderDataState.selectedPendingOrders : selectedPendingOrders;
        Integer num6 = (i & 2097152) != 0 ? futuresLadderDataState.orderDraggedOverIndex : num2;
        List list8 = (i & 4194304) != 0 ? futuresLadderDataState.pendingPlacedOrders : list2;
        List list9 = (i & 8388608) != 0 ? futuresLadderDataState.pendingReplacedOrders : list3;
        Set set3 = (i & 16777216) != 0 ? futuresLadderDataState.pendingOrderIdsInDeletion : set;
        LadderCustomGestureDetector ladderCustomGestureDetector3 = (i & 33554432) != 0 ? futuresLadderDataState.pendingOrderDragDirection : ladderCustomGestureDetector;
        UUID uuid6 = (i & 67108864) != 0 ? futuresLadderDataState.refIdToTrack : uuid2;
        Boolean bool9 = (i & 134217728) != 0 ? futuresLadderDataState.autoSend : bool3;
        FuturesTimeInForce futuresTimeInForce3 = (i & 268435456) != 0 ? futuresLadderDataState.timeInForce : futuresTimeInForce;
        LadderFtuxProgressState ladderFtuxProgressState3 = (i & 536870912) != 0 ? futuresLadderDataState.ladderFtuxProgressState : ladderFtuxProgressState;
        PostTradeLadderFtuxState postTradeLadderFtuxState3 = (i & 1073741824) != 0 ? futuresLadderDataState.postTradeLadderFtuxProgressState : postTradeLadderFtuxState;
        if ((i & Integer.MIN_VALUE) != 0) {
            postTradeLadderFtuxState2 = postTradeLadderFtuxState3;
            marketSessionChangeDataState2 = futuresLadderDataState.ladderMarketSessionChangeState;
            z4 = z8;
            futuresLadderDataState22 = futuresLadderDataState23;
            ladderPriceLevels3 = ladderPriceLevels4;
            z5 = z9;
            selectedPendingOrders2 = selectedPendingOrders3;
            num4 = num6;
            list4 = list8;
            list5 = list9;
            set2 = set3;
            ladderCustomGestureDetector2 = ladderCustomGestureDetector3;
            uuid3 = uuid6;
            bool4 = bool9;
            futuresTimeInForce2 = futuresTimeInForce3;
            ladderFtuxProgressState2 = ladderFtuxProgressState3;
            z6 = z7;
            uuid4 = uuid5;
            bigDecimal3 = bigDecimal5;
            ladderPriceLevels22 = ladderPriceLevels23;
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
            futuresLadderDataState22 = futuresLadderDataState23;
            ladderPriceLevels3 = ladderPriceLevels4;
            z5 = z9;
            selectedPendingOrders2 = selectedPendingOrders3;
            num4 = num6;
            list4 = list8;
            list5 = list9;
            set2 = set3;
            ladderCustomGestureDetector2 = ladderCustomGestureDetector3;
            uuid3 = uuid6;
            bool4 = bool9;
            futuresTimeInForce2 = futuresTimeInForce3;
            ladderFtuxProgressState2 = ladderFtuxProgressState3;
            z6 = z7;
            uuid4 = uuid5;
            bigDecimal3 = bigDecimal5;
            ladderPriceLevels22 = ladderPriceLevels23;
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
        return futuresLadderDataState.copy(screen3, uuid4, bigDecimal3, ladderPriceLevels22, futuresAccount2, futuresContract2, futuresProduct2, bigDecimal4, list6, futuresCostBasis2, session2, bool5, bool6, futuresClosesRange2, z6, num3, z4, futuresLadderDataState22, ladderPriceLevels3, z5, selectedPendingOrders2, num4, list4, list5, set2, ladderCustomGestureDetector2, uuid3, bool4, futuresTimeInForce2, ladderFtuxProgressState2, postTradeLadderFtuxState2, marketSessionChangeDataState2);
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
    public final FuturesLadderDataState2 getLadderDisplayMode() {
        return this.ladderDisplayMode;
    }

    /* renamed from: component19, reason: from getter */
    public final LadderPriceLevels getLadderPriceLevels() {
        return this.ladderPriceLevels;
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
    public final FuturesLadderViewState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
        return this.selectedPendingOrders;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getOrderDraggedOverIndex() {
        return this.orderDraggedOverIndex;
    }

    public final List<PendingPlacedOrder> component23() {
        return this.pendingPlacedOrders;
    }

    public final List<PendingReplacedOrder> component24() {
        return this.pendingReplacedOrders;
    }

    public final Set<UUID> component25() {
        return this.pendingOrderIdsInDeletion;
    }

    /* renamed from: component26, reason: from getter */
    public final LadderCustomGestureDetector getPendingOrderDragDirection() {
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
    public final LadderFtuxProgressState getLadderFtuxProgressState() {
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
    public final LadderPriceData getLadderPriceData() {
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

    public final FuturesLadderDataState copy(Screen sourceScreen, UUID contractId, BigDecimal tradeQuantity, LadderPriceData ladderPriceData, FuturesAccount account, FuturesContract contract, FuturesProduct product, BigDecimal rhdBuyingPower, List<UiFuturesOrder> pendingOrders, FuturesCostBasis pnlCostBasis, FuturesTradingHours.Session nextOpenTradingSession, Boolean isInTradingSession, Boolean hasOrdersForContract, FuturesClosesRange effectiveClosesRange, boolean showSettingsBottomSheet, Integer selectedRowIndex, boolean quantitySelectorOpen, FuturesLadderDataState2 ladderDisplayMode, LadderPriceLevels ladderPriceLevels, boolean zoomInProgress, FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer orderDraggedOverIndex, List<PendingPlacedOrder> pendingPlacedOrders, List<PendingReplacedOrder> pendingReplacedOrders, Set<UUID> pendingOrderIdsInDeletion, LadderCustomGestureDetector pendingOrderDragDirection, UUID refIdToTrack, Boolean autoSend, FuturesTimeInForce timeInForce, LadderFtuxProgressState ladderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxProgressState, MarketSessionChangeDataState ladderMarketSessionChangeState) {
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
        return new FuturesLadderDataState(sourceScreen, contractId, tradeQuantity, ladderPriceData, account, contract, product, rhdBuyingPower, pendingOrders, pnlCostBasis, nextOpenTradingSession, isInTradingSession, hasOrdersForContract, effectiveClosesRange, showSettingsBottomSheet, selectedRowIndex, quantitySelectorOpen, ladderDisplayMode, ladderPriceLevels, zoomInProgress, selectedPendingOrders, orderDraggedOverIndex, pendingPlacedOrders, pendingReplacedOrders, pendingOrderIdsInDeletion, pendingOrderDragDirection, refIdToTrack, autoSend, timeInForce, ladderFtuxProgressState, postTradeLadderFtuxProgressState, ladderMarketSessionChangeState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesLadderDataState)) {
            return false;
        }
        FuturesLadderDataState futuresLadderDataState = (FuturesLadderDataState) other;
        return Intrinsics.areEqual(this.sourceScreen, futuresLadderDataState.sourceScreen) && Intrinsics.areEqual(this.contractId, futuresLadderDataState.contractId) && Intrinsics.areEqual(this.tradeQuantity, futuresLadderDataState.tradeQuantity) && Intrinsics.areEqual(this.ladderPriceData, futuresLadderDataState.ladderPriceData) && Intrinsics.areEqual(this.account, futuresLadderDataState.account) && Intrinsics.areEqual(this.contract, futuresLadderDataState.contract) && Intrinsics.areEqual(this.product, futuresLadderDataState.product) && Intrinsics.areEqual(this.rhdBuyingPower, futuresLadderDataState.rhdBuyingPower) && Intrinsics.areEqual(this.pendingOrders, futuresLadderDataState.pendingOrders) && Intrinsics.areEqual(this.pnlCostBasis, futuresLadderDataState.pnlCostBasis) && Intrinsics.areEqual(this.nextOpenTradingSession, futuresLadderDataState.nextOpenTradingSession) && Intrinsics.areEqual(this.isInTradingSession, futuresLadderDataState.isInTradingSession) && Intrinsics.areEqual(this.hasOrdersForContract, futuresLadderDataState.hasOrdersForContract) && Intrinsics.areEqual(this.effectiveClosesRange, futuresLadderDataState.effectiveClosesRange) && this.showSettingsBottomSheet == futuresLadderDataState.showSettingsBottomSheet && Intrinsics.areEqual(this.selectedRowIndex, futuresLadderDataState.selectedRowIndex) && this.quantitySelectorOpen == futuresLadderDataState.quantitySelectorOpen && this.ladderDisplayMode == futuresLadderDataState.ladderDisplayMode && Intrinsics.areEqual(this.ladderPriceLevels, futuresLadderDataState.ladderPriceLevels) && this.zoomInProgress == futuresLadderDataState.zoomInProgress && Intrinsics.areEqual(this.selectedPendingOrders, futuresLadderDataState.selectedPendingOrders) && Intrinsics.areEqual(this.orderDraggedOverIndex, futuresLadderDataState.orderDraggedOverIndex) && Intrinsics.areEqual(this.pendingPlacedOrders, futuresLadderDataState.pendingPlacedOrders) && Intrinsics.areEqual(this.pendingReplacedOrders, futuresLadderDataState.pendingReplacedOrders) && Intrinsics.areEqual(this.pendingOrderIdsInDeletion, futuresLadderDataState.pendingOrderIdsInDeletion) && this.pendingOrderDragDirection == futuresLadderDataState.pendingOrderDragDirection && Intrinsics.areEqual(this.refIdToTrack, futuresLadderDataState.refIdToTrack) && Intrinsics.areEqual(this.autoSend, futuresLadderDataState.autoSend) && this.timeInForce == futuresLadderDataState.timeInForce && Intrinsics.areEqual(this.ladderFtuxProgressState, futuresLadderDataState.ladderFtuxProgressState) && this.postTradeLadderFtuxProgressState == futuresLadderDataState.postTradeLadderFtuxProgressState && Intrinsics.areEqual(this.ladderMarketSessionChangeState, futuresLadderDataState.ladderMarketSessionChangeState);
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
        int iHashCode12 = (((((iHashCode11 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.quantitySelectorOpen)) * 31) + this.ladderDisplayMode.hashCode()) * 31;
        LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
        int iHashCode13 = (((iHashCode12 + (ladderPriceLevels == null ? 0 : ladderPriceLevels.hashCode())) * 31) + Boolean.hashCode(this.zoomInProgress)) * 31;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders = this.selectedPendingOrders;
        int iHashCode14 = (iHashCode13 + (selectedPendingOrders == null ? 0 : selectedPendingOrders.hashCode())) * 31;
        Integer num2 = this.orderDraggedOverIndex;
        int iHashCode15 = (((((((iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.pendingPlacedOrders.hashCode()) * 31) + this.pendingReplacedOrders.hashCode()) * 31) + this.pendingOrderIdsInDeletion.hashCode()) * 31;
        LadderCustomGestureDetector ladderCustomGestureDetector = this.pendingOrderDragDirection;
        int iHashCode16 = (iHashCode15 + (ladderCustomGestureDetector == null ? 0 : ladderCustomGestureDetector.hashCode())) * 31;
        UUID uuid = this.refIdToTrack;
        int iHashCode17 = (iHashCode16 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Boolean bool3 = this.autoSend;
        int iHashCode18 = (((iHashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.timeInForce.hashCode()) * 31;
        LadderFtuxProgressState ladderFtuxProgressState = this.ladderFtuxProgressState;
        int iHashCode19 = (iHashCode18 + (ladderFtuxProgressState == null ? 0 : ladderFtuxProgressState.hashCode())) * 31;
        PostTradeLadderFtuxState postTradeLadderFtuxState = this.postTradeLadderFtuxProgressState;
        return ((iHashCode19 + (postTradeLadderFtuxState != null ? postTradeLadderFtuxState.hashCode() : 0)) * 31) + this.ladderMarketSessionChangeState.hashCode();
    }

    public String toString() {
        return "FuturesLadderDataState(sourceScreen=" + this.sourceScreen + ", contractId=" + this.contractId + ", tradeQuantity=" + this.tradeQuantity + ", ladderPriceData=" + this.ladderPriceData + ", account=" + this.account + ", contract=" + this.contract + ", product=" + this.product + ", rhdBuyingPower=" + this.rhdBuyingPower + ", pendingOrders=" + this.pendingOrders + ", pnlCostBasis=" + this.pnlCostBasis + ", nextOpenTradingSession=" + this.nextOpenTradingSession + ", isInTradingSession=" + this.isInTradingSession + ", hasOrdersForContract=" + this.hasOrdersForContract + ", effectiveClosesRange=" + this.effectiveClosesRange + ", showSettingsBottomSheet=" + this.showSettingsBottomSheet + ", selectedRowIndex=" + this.selectedRowIndex + ", quantitySelectorOpen=" + this.quantitySelectorOpen + ", ladderDisplayMode=" + this.ladderDisplayMode + ", ladderPriceLevels=" + this.ladderPriceLevels + ", zoomInProgress=" + this.zoomInProgress + ", selectedPendingOrders=" + this.selectedPendingOrders + ", orderDraggedOverIndex=" + this.orderDraggedOverIndex + ", pendingPlacedOrders=" + this.pendingPlacedOrders + ", pendingReplacedOrders=" + this.pendingReplacedOrders + ", pendingOrderIdsInDeletion=" + this.pendingOrderIdsInDeletion + ", pendingOrderDragDirection=" + this.pendingOrderDragDirection + ", refIdToTrack=" + this.refIdToTrack + ", autoSend=" + this.autoSend + ", timeInForce=" + this.timeInForce + ", ladderFtuxProgressState=" + this.ladderFtuxProgressState + ", postTradeLadderFtuxProgressState=" + this.postTradeLadderFtuxProgressState + ", ladderMarketSessionChangeState=" + this.ladderMarketSessionChangeState + ")";
    }

    public FuturesLadderDataState(Screen sourceScreen, UUID contractId, BigDecimal tradeQuantity, LadderPriceData ladderPriceData, FuturesAccount futuresAccount, FuturesContract futuresContract, FuturesProduct futuresProduct, BigDecimal bigDecimal, List<UiFuturesOrder> list, FuturesCostBasis futuresCostBasis, FuturesTradingHours.Session session, Boolean bool, Boolean bool2, FuturesClosesRange futuresClosesRange, boolean z, Integer num, boolean z2, FuturesLadderDataState2 ladderDisplayMode, LadderPriceLevels ladderPriceLevels, boolean z3, FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer num2, List<PendingPlacedOrder> pendingPlacedOrders, List<PendingReplacedOrder> pendingReplacedOrders, Set<UUID> pendingOrderIdsInDeletion, LadderCustomGestureDetector ladderCustomGestureDetector, UUID uuid, Boolean bool3, FuturesTimeInForce timeInForce, LadderFtuxProgressState ladderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxState, MarketSessionChangeDataState ladderMarketSessionChangeState) {
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
        this.ladderDisplayMode = ladderDisplayMode;
        this.ladderPriceLevels = ladderPriceLevels;
        this.zoomInProgress = z3;
        this.selectedPendingOrders = selectedPendingOrders;
        this.orderDraggedOverIndex = num2;
        this.pendingPlacedOrders = pendingPlacedOrders;
        this.pendingReplacedOrders = pendingReplacedOrders;
        this.pendingOrderIdsInDeletion = pendingOrderIdsInDeletion;
        this.pendingOrderDragDirection = ladderCustomGestureDetector;
        this.refIdToTrack = uuid;
        this.autoSend = bool3;
        this.timeInForce = timeInForce;
        this.ladderFtuxProgressState = ladderFtuxProgressState;
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

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FuturesLadderDataState(Screen screen, UUID uuid, BigDecimal bigDecimal, LadderPriceData ladderPriceLevels2, FuturesAccount futuresAccount, FuturesContract futuresContract, FuturesProduct futuresProduct, BigDecimal bigDecimal2, List list, FuturesCostBasis futuresCostBasis, FuturesTradingHours.Session session, Boolean bool, Boolean bool2, FuturesClosesRange futuresClosesRange, boolean z, Integer num, boolean z2, FuturesLadderDataState2 futuresLadderDataState2, LadderPriceLevels ladderPriceLevels, boolean z3, FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders, Integer num2, List list2, List list3, Set set, LadderCustomGestureDetector ladderCustomGestureDetector, UUID uuid2, Boolean bool3, FuturesTimeInForce futuresTimeInForce, LadderFtuxProgressState ladderFtuxProgressState, PostTradeLadderFtuxState postTradeLadderFtuxState, MarketSessionChangeDataState marketSessionChangeDataState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        MarketSessionChangeDataState marketSessionChangeDataState2;
        LadderPriceData ladderPriceLevels22 = (i & 8) != 0 ? new LadderPriceData(null, null, null, null, null, null, null, false, 255, null) : ladderPriceLevels2;
        Boolean bool4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        FuturesAccount futuresAccount2 = (i & 16) != 0 ? null : futuresAccount;
        FuturesContract futuresContract2 = (i & 32) != 0 ? null : futuresContract;
        FuturesProduct futuresProduct2 = (i & 64) != 0 ? null : futuresProduct;
        BigDecimal bigDecimal3 = (i & 128) != 0 ? null : bigDecimal2;
        List list4 = (i & 256) != 0 ? null : list;
        FuturesCostBasis futuresCostBasis2 = (i & 512) != 0 ? null : futuresCostBasis;
        FuturesTradingHours.Session session2 = (i & 1024) != 0 ? null : session;
        Boolean bool5 = (i & 2048) != 0 ? null : bool;
        Boolean bool6 = (i & 4096) != 0 ? null : bool2;
        FuturesClosesRange futuresClosesRange2 = (i & 8192) != 0 ? null : futuresClosesRange;
        boolean z4 = (i & 16384) != 0 ? false : z;
        Integer num3 = (32768 & i) != 0 ? null : num;
        boolean z5 = (65536 & i) != 0 ? false : z2;
        FuturesLadderDataState2 futuresLadderDataState22 = (131072 & i) != 0 ? FuturesLadderDataState2.PRICE : futuresLadderDataState2;
        LadderPriceLevels ladderPriceLevels3 = (262144 & i) != 0 ? null : ladderPriceLevels;
        boolean z6 = (524288 & i) != 0 ? false : z3;
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders2 = (1048576 & i) != 0 ? null : selectedPendingOrders;
        Integer num4 = (2097152 & i) != 0 ? null : num2;
        List listEmptyList = (4194304 & i) != 0 ? CollectionsKt.emptyList() : list2;
        List listEmptyList2 = (8388608 & i) != 0 ? CollectionsKt.emptyList() : list3;
        Set setEmptySet = (16777216 & i) != 0 ? SetsKt.emptySet() : set;
        LadderCustomGestureDetector ladderCustomGestureDetector2 = (33554432 & i) != 0 ? null : ladderCustomGestureDetector;
        UUID uuid3 = (67108864 & i) != 0 ? null : uuid2;
        Boolean bool7 = (134217728 & i) != 0 ? null : bool3;
        FuturesTimeInForce futuresTimeInForce2 = (268435456 & i) != 0 ? FuturesTimeInForce.GFD : futuresTimeInForce;
        LadderFtuxProgressState ladderFtuxProgressState2 = (536870912 & i) != 0 ? null : ladderFtuxProgressState;
        PostTradeLadderFtuxState postTradeLadderFtuxState2 = (1073741824 & i) != 0 ? null : postTradeLadderFtuxState;
        if ((i & Integer.MIN_VALUE) != 0) {
            marketSessionChangeDataState2 = new MarketSessionChangeDataState(bool4, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            marketSessionChangeDataState2 = marketSessionChangeDataState;
        }
        this(screen, uuid, bigDecimal, ladderPriceLevels22, futuresAccount2, futuresContract2, futuresProduct2, bigDecimal3, list4, futuresCostBasis2, session2, bool5, bool6, futuresClosesRange2, z4, num3, z5, futuresLadderDataState22, ladderPriceLevels3, z6, selectedPendingOrders2, num4, listEmptyList, listEmptyList2, setEmptySet, ladderCustomGestureDetector2, uuid3, bool7, futuresTimeInForce2, ladderFtuxProgressState2, postTradeLadderFtuxState2, marketSessionChangeDataState2);
    }

    public final LadderPriceData getLadderPriceData() {
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

    public final FuturesLadderDataState2 getLadderDisplayMode() {
        return this.ladderDisplayMode;
    }

    public final LadderPriceLevels getLadderPriceLevels() {
        return this.ladderPriceLevels;
    }

    public final boolean getZoomInProgress() {
        return this.zoomInProgress;
    }

    public final FuturesLadderViewState.LadderData.SelectedPendingOrders getSelectedPendingOrders() {
        return this.selectedPendingOrders;
    }

    public final Integer getOrderDraggedOverIndex() {
        return this.orderDraggedOverIndex;
    }

    public final List<PendingPlacedOrder> getPendingPlacedOrders() {
        return this.pendingPlacedOrders;
    }

    public final List<PendingReplacedOrder> getPendingReplacedOrders() {
        return this.pendingReplacedOrders;
    }

    public final Set<UUID> getPendingOrderIdsInDeletion() {
        return this.pendingOrderIdsInDeletion;
    }

    public final LadderCustomGestureDetector getPendingOrderDragDirection() {
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

    public final LadderFtuxProgressState getLadderFtuxProgressState() {
        return this.ladderFtuxProgressState;
    }

    public final PostTradeLadderFtuxState getPostTradeLadderFtuxProgressState() {
        return this.postTradeLadderFtuxProgressState;
    }

    public final MarketSessionChangeDataState getLadderMarketSessionChangeState() {
        return this.ladderMarketSessionChangeState;
    }

    /* compiled from: FuturesLadderDataState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0004\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", "", "isPlaceholder", "", "()Z", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "orderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getOrderTrigger", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "orderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "getOrderType", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "quantity", "Ljava/math/BigDecimal;", "getQuantity", "()Ljava/math/BigDecimal;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "isMarketOrder", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingFilledOrder;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingPlacedOrder;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingReplacedOrder;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface PendingOrder {
        UUID getId();

        FuturesOrderTrigger getOrderTrigger();

        FuturesOrderType getOrderType();

        BigDecimal getPrice();

        BigDecimal getQuantity();

        FuturesOrderSide getSide();

        boolean isMarketOrder();

        /* renamed from: isPlaceholder */
        boolean getIsPlaceholder();

        /* compiled from: FuturesLadderDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static boolean isMarketOrder(PendingOrder pendingOrder) {
                return pendingOrder.getOrderType() == FuturesOrderType.MARKET && pendingOrder.getOrderTrigger() == FuturesOrderTrigger.IMMEDIATE && pendingOrder.getPrice() == null;
            }
        }
    }

    /* compiled from: FuturesLadderDataState.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J'\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020#X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010$¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingReplacedOrder;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", "replaceOrderRefId", "Ljava/util/UUID;", "targetPrice", "Ljava/math/BigDecimal;", "originalPendingOrder", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/android/models/futures/db/UiFuturesOrder;)V", "getReplaceOrderRefId", "()Ljava/util/UUID;", "getTargetPrice", "()Ljava/math/BigDecimal;", "getOriginalPendingOrder", "()Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "id", "getId", "orderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getOrderTrigger", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "orderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "getOrderType", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "quantity", "getQuantity", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "isPlaceholder", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingReplacedOrder implements PendingOrder {
        public static final int $stable = 8;
        private final boolean isPlaceholder;
        private final UiFuturesOrder originalPendingOrder;
        private final UUID replaceOrderRefId;
        private final BigDecimal targetPrice;

        public static /* synthetic */ PendingReplacedOrder copy$default(PendingReplacedOrder pendingReplacedOrder, UUID uuid, BigDecimal bigDecimal, UiFuturesOrder uiFuturesOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pendingReplacedOrder.replaceOrderRefId;
            }
            if ((i & 2) != 0) {
                bigDecimal = pendingReplacedOrder.targetPrice;
            }
            if ((i & 4) != 0) {
                uiFuturesOrder = pendingReplacedOrder.originalPendingOrder;
            }
            return pendingReplacedOrder.copy(uuid, bigDecimal, uiFuturesOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getReplaceOrderRefId() {
            return this.replaceOrderRefId;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getTargetPrice() {
            return this.targetPrice;
        }

        /* renamed from: component3, reason: from getter */
        public final UiFuturesOrder getOriginalPendingOrder() {
            return this.originalPendingOrder;
        }

        public final PendingReplacedOrder copy(UUID replaceOrderRefId, BigDecimal targetPrice, UiFuturesOrder originalPendingOrder) {
            Intrinsics.checkNotNullParameter(replaceOrderRefId, "replaceOrderRefId");
            Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
            Intrinsics.checkNotNullParameter(originalPendingOrder, "originalPendingOrder");
            return new PendingReplacedOrder(replaceOrderRefId, targetPrice, originalPendingOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingReplacedOrder)) {
                return false;
            }
            PendingReplacedOrder pendingReplacedOrder = (PendingReplacedOrder) other;
            return Intrinsics.areEqual(this.replaceOrderRefId, pendingReplacedOrder.replaceOrderRefId) && Intrinsics.areEqual(this.targetPrice, pendingReplacedOrder.targetPrice) && Intrinsics.areEqual(this.originalPendingOrder, pendingReplacedOrder.originalPendingOrder);
        }

        public int hashCode() {
            return (((this.replaceOrderRefId.hashCode() * 31) + this.targetPrice.hashCode()) * 31) + this.originalPendingOrder.hashCode();
        }

        public String toString() {
            return "PendingReplacedOrder(replaceOrderRefId=" + this.replaceOrderRefId + ", targetPrice=" + this.targetPrice + ", originalPendingOrder=" + this.originalPendingOrder + ")";
        }

        public PendingReplacedOrder(UUID replaceOrderRefId, BigDecimal targetPrice, UiFuturesOrder originalPendingOrder) {
            Intrinsics.checkNotNullParameter(replaceOrderRefId, "replaceOrderRefId");
            Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
            Intrinsics.checkNotNullParameter(originalPendingOrder, "originalPendingOrder");
            this.replaceOrderRefId = replaceOrderRefId;
            this.targetPrice = targetPrice;
            this.originalPendingOrder = originalPendingOrder;
            this.isPlaceholder = true;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public boolean isMarketOrder() {
            return PendingOrder.DefaultImpls.isMarketOrder(this);
        }

        public final UUID getReplaceOrderRefId() {
            return this.replaceOrderRefId;
        }

        public final BigDecimal getTargetPrice() {
            return this.targetPrice;
        }

        public final UiFuturesOrder getOriginalPendingOrder() {
            return this.originalPendingOrder;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public UUID getId() {
            return this.originalPendingOrder.getId();
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderTrigger getOrderTrigger() {
            return this.originalPendingOrder.getOrder().getOrderTrigger();
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderType getOrderType() {
            return this.originalPendingOrder.getOrder().getOrderType();
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public BigDecimal getQuantity() {
            return this.originalPendingOrder.getOrder().getPendingFilledQuantity();
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderSide getSide() {
            return this.originalPendingOrder.getLegs().get(0).getOrderSide();
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public BigDecimal getPrice() {
            return this.targetPrice;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        /* renamed from: isPlaceholder, reason: from getter */
        public boolean getIsPlaceholder() {
            return this.isPlaceholder;
        }
    }

    /* compiled from: FuturesLadderDataState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010!\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010 ¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingPlacedOrder;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", "request", "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "<init>", "(Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;)V", "refId", "Ljava/util/UUID;", "getRefId", "()Ljava/util/UUID;", "id", "getId", "quantity", "Ljava/math/BigDecimal;", "getQuantity", "()Ljava/math/BigDecimal;", "orderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getOrderTrigger", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "orderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "getOrderType", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "isPlaceholder", "", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingPlacedOrder implements PendingOrder {
        public static final int $stable = 8;
        private final UUID id;
        private final boolean isPlaceholder;
        private final FuturesOrderTrigger orderTrigger;
        private final FuturesOrderType orderType;
        private final BigDecimal price;
        private final BigDecimal quantity;
        private final UUID refId;
        private final UiFuturesOrderContext.OrderRequest request;
        private final FuturesOrderSide side;

        /* renamed from: component1, reason: from getter */
        private final UiFuturesOrderContext.OrderRequest getRequest() {
            return this.request;
        }

        public static /* synthetic */ PendingPlacedOrder copy$default(PendingPlacedOrder pendingPlacedOrder, UiFuturesOrderContext.OrderRequest orderRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                orderRequest = pendingPlacedOrder.request;
            }
            return pendingPlacedOrder.copy(orderRequest);
        }

        public final PendingPlacedOrder copy(UiFuturesOrderContext.OrderRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new PendingPlacedOrder(request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingPlacedOrder) && Intrinsics.areEqual(this.request, ((PendingPlacedOrder) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "PendingPlacedOrder(request=" + this.request + ")";
        }

        public PendingPlacedOrder(UiFuturesOrderContext.OrderRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            UUID refId = request.getRefId();
            this.refId = refId;
            this.id = refId;
            this.quantity = request.getQuantity();
            this.orderTrigger = request.getOrderTrigger();
            this.orderType = request.getOrderType();
            this.side = request.getOrderSide();
            BigDecimal stopPrice = request.getStopPrice();
            this.price = stopPrice == null ? request.getLimitPrice() : stopPrice;
            this.isPlaceholder = true;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public boolean isMarketOrder() {
            return PendingOrder.DefaultImpls.isMarketOrder(this);
        }

        public final UUID getRefId() {
            return this.refId;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public BigDecimal getQuantity() {
            return this.quantity;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderTrigger getOrderTrigger() {
            return this.orderTrigger;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderType getOrderType() {
            return this.orderType;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public BigDecimal getPrice() {
            return this.price;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        /* renamed from: isPlaceholder, reason: from getter */
        public boolean getIsPlaceholder() {
            return this.isPlaceholder;
        }
    }

    /* compiled from: FuturesLadderDataState.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010 ¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingFilledOrder;", "Lcom/robinhood/android/futures/trade/ui/ladder/FuturesLadderDataState$PendingOrder;", Card.Icon.ORDER, "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "<init>", "(Lcom/robinhood/android/models/futures/db/UiFuturesOrder;)V", "getOrder", "()Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "orderTrigger", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "getOrderTrigger", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderTrigger;", "orderType", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "getOrderType", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderType;", "quantity", "Ljava/math/BigDecimal;", "getQuantity", "()Ljava/math/BigDecimal;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "isPlaceholder", "", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingFilledOrder implements PendingOrder {
        public static final int $stable = 8;
        private final UUID id;
        private final boolean isPlaceholder;
        private final UiFuturesOrder order;
        private final FuturesOrderTrigger orderTrigger;
        private final FuturesOrderType orderType;
        private final BigDecimal price;
        private final BigDecimal quantity;
        private final FuturesOrderSide side;

        public static /* synthetic */ PendingFilledOrder copy$default(PendingFilledOrder pendingFilledOrder, UiFuturesOrder uiFuturesOrder, int i, Object obj) {
            if ((i & 1) != 0) {
                uiFuturesOrder = pendingFilledOrder.order;
            }
            return pendingFilledOrder.copy(uiFuturesOrder);
        }

        /* renamed from: component1, reason: from getter */
        public final UiFuturesOrder getOrder() {
            return this.order;
        }

        public final PendingFilledOrder copy(UiFuturesOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new PendingFilledOrder(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingFilledOrder) && Intrinsics.areEqual(this.order, ((PendingFilledOrder) other).order);
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return "PendingFilledOrder(order=" + this.order + ")";
        }

        public PendingFilledOrder(UiFuturesOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
            this.id = order.getId();
            this.orderTrigger = order.getOrder().getOrderTrigger();
            this.orderType = order.getOrder().getOrderType();
            this.quantity = order.getOrder().getPendingFilledQuantity();
            this.side = order.getLegs().get(0).getOrderSide();
            BigDecimal stopPrice = order.getOrder().getStopPrice();
            this.price = stopPrice == null ? order.getOrder().getLimitPrice() : stopPrice;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public boolean isMarketOrder() {
            return PendingOrder.DefaultImpls.isMarketOrder(this);
        }

        public final UiFuturesOrder getOrder() {
            return this.order;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderTrigger getOrderTrigger() {
            return this.orderTrigger;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderType getOrderType() {
            return this.orderType;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public BigDecimal getQuantity() {
            return this.quantity;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public FuturesOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        public BigDecimal getPrice() {
            return this.price;
        }

        @Override // com.robinhood.android.futures.trade.ui.ladder.FuturesLadderDataState.PendingOrder
        /* renamed from: isPlaceholder, reason: from getter */
        public boolean getIsPlaceholder() {
            return this.isPlaceholder;
        }
    }

    public final boolean getShouldPendingOrderChangePriceOnDragEnded() {
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders;
        Integer num = this.orderDraggedOverIndex;
        if (num == null || (selectedPendingOrders = this.selectedPendingOrders) == null) {
            return false;
        }
        return num == null || num.intValue() != selectedPendingOrders.getRowIndex();
    }

    public final FuturesLadderViewState.TopBarData getTopBarData() {
        StringResource stringResourceInvoke;
        BigDecimal bigDecimalSubtract;
        StringResource stringResourceInvoke2;
        String displaySymbol;
        List<UiFuturesOrder> list;
        FuturesCostBasis futuresCostBasis = this.pnlCostBasis;
        boolean z = (futuresCostBasis == null || BigDecimals7.isZero(futuresCostBasis.getSignedQuantity())) ? false : true;
        if (!z) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17286R.string.futures_ladder_no_position, new Object[0]);
        } else {
            if (this.pnlCostBasis == null) {
                throw new IllegalStateException("pnlCostBasis cannot be null here");
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17286R.string.futures_ladder_positions_format, Formats.getIntegerDeltaFormat().format(this.pnlCostBasis.getSignedQuantity()), FuturesProduct5.format(this.product, this.pnlCostBasis.getAvgTradePrice(), 2));
        }
        StringResource stringResource = stringResourceInvoke;
        BigDecimal lastTradePrice = this.ladderPriceData.getLastTradePrice();
        FuturesClosesRange futuresClosesRange = this.effectiveClosesRange;
        BigDecimal closePrice = futuresClosesRange != null ? futuresClosesRange.getClosePrice() : null;
        if (lastTradePrice == null || closePrice == null) {
            bigDecimalSubtract = null;
        } else {
            bigDecimalSubtract = lastTradePrice.subtract(closePrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        }
        BigDecimal bigDecimalSafeDivide = bigDecimalSubtract != null ? BigDecimals7.safeDivide(bigDecimalSubtract, closePrice) : null;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke3 = companion.invoke(C17286R.string.futures_ladder_day_delta_label, Moneys.formatNoSignAmount$default(bigDecimalSubtract, null, 1, null), Moneys.formatNoSignPercent$default(bigDecimalSafeDivide, null, 1, null));
        boolean z2 = z || !((list = this.pendingOrders) == null || list.isEmpty());
        Boolean bool = this.isInTradingSession;
        Boolean bool2 = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(bool, bool2);
        Integer numValueOf = null;
        UUID uuid = this.contractId;
        FuturesAccount futuresAccount = this.account;
        UUID id = futuresAccount != null ? futuresAccount.getId() : null;
        FuturesContract futuresContract = this.contract;
        if (futuresContract == null || (displaySymbol = futuresContract.getDisplaySymbol()) == null || (stringResourceInvoke2 = companion.invoke(displaySymbol)) == null) {
            stringResourceInvoke2 = companion.invoke(C17286R.string.futures_ladder_loading, new Object[0]);
        }
        FuturesContract futuresContract2 = this.contract;
        BigDecimal multiplier = futuresContract2 != null ? futuresContract2.getMultiplier() : null;
        FuturesCostBasis futuresCostBasis2 = this.pnlCostBasis;
        BigDecimal dayPnlCostBasis = futuresCostBasis2 != null ? futuresCostBasis2.getDayPnlCostBasis() : null;
        BigDecimal lastTradePrice2 = this.ladderPriceData.getLastTradePrice();
        FuturesCostBasis futuresCostBasis3 = this.pnlCostBasis;
        BigDecimal bigDecimalComputePnl = FuturesPnLHelper.computePnl(multiplier, dayPnlCostBasis, lastTradePrice2, futuresCostBasis3 != null ? futuresCostBasis3.getSignedQuantity() : null);
        if (bigDecimalComputePnl == null) {
            bigDecimalComputePnl = BigDecimal.ZERO;
        }
        FuturesContract futuresContract3 = this.contract;
        BigDecimal multiplier2 = futuresContract3 != null ? futuresContract3.getMultiplier() : null;
        FuturesCostBasis futuresCostBasis4 = this.pnlCostBasis;
        BigDecimal openPnlCostBasis = futuresCostBasis4 != null ? futuresCostBasis4.getOpenPnlCostBasis() : null;
        BigDecimal lastTradePrice3 = this.ladderPriceData.getLastTradePrice();
        FuturesCostBasis futuresCostBasis5 = this.pnlCostBasis;
        BigDecimal bigDecimalComputePnl2 = FuturesPnLHelper.computePnl(multiplier2, openPnlCostBasis, lastTradePrice3, futuresCostBasis5 != null ? futuresCostBasis5.getSignedQuantity() : null);
        if (bigDecimalComputePnl2 == null) {
            bigDecimalComputePnl2 = BigDecimal.ZERO;
        }
        FuturesCostBasis futuresCostBasis6 = this.pnlCostBasis;
        boolean z3 = !BigDecimals7.isZero(futuresCostBasis6 != null ? futuresCostBasis6.getSignedQuantity() : null);
        List<UiFuturesOrder> list2 = this.pendingOrders;
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        }
        return new FuturesLadderViewState.TopBarData(uuid, id, stringResourceInvoke2, bigDecimalComputePnl, bigDecimalComputePnl2, z3, stringResource, numValueOf, new FuturesLadderViewState.TopBarData.FlattenButtonData(z2, zAreEqual, this.postTradeLadderFtuxProgressState == PostTradeLadderFtuxState.SHOW_FLATTEN_ORDERS_TOOLTIP), this.postTradeLadderFtuxProgressState == PostTradeLadderFtuxState.SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP, Intrinsics.areEqual(this.hasOrdersForContract, bool2), stringResourceInvoke3, !BigDecimals7.isNegative(bigDecimalSubtract));
    }

    public final FuturesLadderViewState.LadderData getLadderData(FuturesLadderViewState.QuantityPanelData quantityPanel, List<? extends PendingOrder> allOrdersPendingExecution) {
        List<Tuples2<BigDecimal, Integer>> list;
        List<Tuples2<BigDecimal, Integer>> list2;
        int iIntValue;
        int iIntValue2;
        Collection collectionEmptyList;
        Collection collectionEmptyList2;
        Tuples2 tuples2M3642to;
        Iterator it;
        Tuples2 tuples2M3642to2;
        List<Tuples2<BigDecimal, Integer>> list3;
        Tuples2 tuples2M3642to3;
        FuturesLadderViewState.LadderData.AverageCostLineData averageCostLineData;
        boolean z;
        StringResource stringResource;
        StringResource stringResource2;
        BigDecimal signedQuantity;
        Intrinsics.checkNotNullParameter(quantityPanel, "quantityPanel");
        Intrinsics.checkNotNullParameter(allOrdersPendingExecution, "allOrdersPendingExecution");
        BigDecimal lastTradePrice = this.ladderPriceData.getLastTradePrice();
        if (lastTradePrice == null || this.ladderPriceLevels == null || this.product == null) {
            return null;
        }
        List<Tuples2<BigDecimal, Integer>> displayedBids = this.ladderPriceData.getDisplayedBids();
        if (displayedBids != null) {
            List<Tuples2<BigDecimal, Integer>> list4 = displayedBids;
            if (list4.isEmpty()) {
                list4 = null;
            }
            list = list4;
        } else {
            list = null;
        }
        List<Tuples2<BigDecimal, Integer>> displayedAsks = this.ladderPriceData.getDisplayedAsks();
        if (displayedAsks != null) {
            List<Tuples2<BigDecimal, Integer>> list5 = displayedAsks;
            if (list5.isEmpty()) {
                list5 = null;
            }
            list2 = list5;
        } else {
            list2 = null;
        }
        if (list == null && list2 == null) {
            List listEmptyList = CollectionsKt.emptyList();
            tuples2M3642to = Tuples4.m3642to(listEmptyList, listEmptyList);
        } else {
            if (list != null) {
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                iIntValue = ((Number) ((Tuples2) it2.next()).getSecond()).intValue();
                while (it2.hasNext()) {
                    int iIntValue3 = ((Number) ((Tuples2) it2.next()).getSecond()).intValue();
                    if (iIntValue < iIntValue3) {
                        iIntValue = iIntValue3;
                    }
                }
            } else {
                iIntValue = 0;
            }
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                iIntValue2 = ((Number) ((Tuples2) it3.next()).getSecond()).intValue();
                while (it3.hasNext()) {
                    int iIntValue4 = ((Number) ((Tuples2) it3.next()).getSecond()).intValue();
                    if (iIntValue2 < iIntValue4) {
                        iIntValue2 = iIntValue4;
                    }
                }
            } else {
                iIntValue2 = 0;
            }
            int iMax = Math.max(iIntValue, iIntValue2);
            if (list != null) {
                collectionEmptyList = new ArrayList();
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Tuples2 tuples2 = (Tuples2) obj;
                    BigDecimal bigDecimal = (BigDecimal) tuples2.component1();
                    int iIntValue5 = ((Number) tuples2.component2()).intValue();
                    Integer exactRowIndexFromPrice = this.ladderPriceLevels.getExactRowIndexFromPrice(bigDecimal);
                    if (exactRowIndexFromPrice != null) {
                        list3 = list;
                        tuples2M3642to3 = Tuples4.m3642to(exactRowIndexFromPrice, new FuturesLadderViewState.LadderData.QuantityBar(FuturesOrderSide.BUY, iIntValue5, iIntValue5 / iMax, MathHelpers.lerp(1.0f, 0.0f, i / list.size())));
                    } else {
                        list3 = list;
                        tuples2M3642to3 = null;
                    }
                    if (tuples2M3642to3 != null) {
                        collectionEmptyList.add(tuples2M3642to3);
                    }
                    i = i2;
                    list = list3;
                }
            } else {
                collectionEmptyList = CollectionsKt.emptyList();
            }
            if (list2 != null) {
                collectionEmptyList2 = new ArrayList();
                Iterator it4 = list2.iterator();
                int i3 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Tuples2 tuples22 = (Tuples2) next;
                    BigDecimal bigDecimal2 = (BigDecimal) tuples22.component1();
                    int iIntValue6 = ((Number) tuples22.component2()).intValue();
                    Integer exactRowIndexFromPrice2 = this.ladderPriceLevels.getExactRowIndexFromPrice(bigDecimal2);
                    if (exactRowIndexFromPrice2 != null) {
                        it = it4;
                        tuples2M3642to2 = Tuples4.m3642to(exactRowIndexFromPrice2, new FuturesLadderViewState.LadderData.QuantityBar(FuturesOrderSide.SELL, iIntValue6, iIntValue6 / iMax, MathHelpers.lerp(1.0f, 0.0f, i3 / list2.size())));
                    } else {
                        it = it4;
                        tuples2M3642to2 = null;
                    }
                    if (tuples2M3642to2 != null) {
                        collectionEmptyList2.add(tuples2M3642to2);
                    }
                    i3 = i4;
                    it4 = it;
                }
            } else {
                collectionEmptyList2 = CollectionsKt.emptyList();
            }
            tuples2M3642to = Tuples4.m3642to(collectionEmptyList, collectionEmptyList2);
        }
        List list6 = (List) tuples2M3642to.component1();
        List list7 = (List) tuples2M3642to.component2();
        FuturesCostBasis futuresCostBasis = this.pnlCostBasis;
        if (futuresCostBasis == null || (signedQuantity = futuresCostBasis.getSignedQuantity()) == null || BigDecimals7.isZero(signedQuantity)) {
            averageCostLineData = null;
        } else {
            BigDecimal avgTradePrice = this.pnlCostBasis.getAvgTradePrice();
            BigDecimal bigDecimalRoundToInterval = BigDecimals7.roundToInterval(avgTradePrice, this.product.getPriceIncrements(), RoundingMode.HALF_EVEN);
            BigDecimal bigDecimalDivide = this.product.getPriceIncrements().divide(new BigDecimal(2));
            Intrinsics.checkNotNull(bigDecimalDivide);
            BigDecimal bigDecimalAdd = bigDecimalRoundToInterval.add(bigDecimalDivide);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            int rowIndexFromPriceScaled$default = LadderPriceLevels.getRowIndexFromPriceScaled$default(this.ladderPriceLevels, bigDecimalRoundToInterval, null, 2, null);
            BigDecimal bigDecimalSubtract = bigDecimalAdd.subtract(avgTradePrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            averageCostLineData = new FuturesLadderViewState.LadderData.AverageCostLineData(rowIndexFromPriceScaled$default, bigDecimalSubtract.divide(this.product.getPriceIncrements()).floatValue());
        }
        FuturesLadderDataState2 futuresLadderDataState2 = this.ladderDisplayMode;
        LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
        int rowIndexFromPriceScaled$default2 = LadderPriceLevels.getRowIndexFromPriceScaled$default(ladderPriceLevels, lastTradePrice, null, 2, null);
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(C17286R.string.futures_ladder_last_trade_price_floating_button_label, FuturesProduct5.format$default(this.product, lastTradePrice, null, 2, null));
        Map map = MapsKt.toMap(list7);
        Map map2 = MapsKt.toMap(list6);
        boolean zIsExperiencingDxDataDegradation = this.ladderPriceData.isExperiencingDxDataDegradation();
        Map<Integer, FuturesLadderViewState.LadderData.PendingOrderRow> pendingOrders$feature_futures_trade_externalDebug = getPendingOrders$feature_futures_trade_externalDebug(allOrdersPendingExecution);
        FuturesLadderViewState.LadderData.SelectedRow selectedRow$feature_futures_trade_externalDebug = getSelectedRow$feature_futures_trade_externalDebug();
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders = this.selectedPendingOrders;
        Integer num = this.orderDraggedOverIndex;
        LadderCustomGestureDetector ladderCustomGestureDetector = this.pendingOrderDragDirection;
        boolean z2 = this.selectedRowIndex != null || this.quantitySelectorOpen || selectedPendingOrders != null || this.zoomInProgress;
        if (this.zoomInProgress) {
            StringResource stringResourceInvoke2 = companion.invoke(C17286R.string.futures_ladder_zoom_level_msg, Integer.valueOf(this.ladderPriceLevels.getScale()));
            z = zIsExperiencingDxDataDegradation;
            stringResource2 = stringResourceInvoke;
            stringResource = stringResourceInvoke2;
        } else {
            z = zIsExperiencingDxDataDegradation;
            stringResource = null;
            stringResource2 = stringResourceInvoke;
        }
        FuturesCostBasis futuresCostBasis2 = this.pnlCostBasis;
        BigDecimal openPnlCostBasis = futuresCostBasis2 != null ? futuresCostBasis2.getOpenPnlCostBasis() : null;
        FuturesCostBasis futuresCostBasis3 = this.pnlCostBasis;
        BigDecimal signedQuantity2 = futuresCostBasis3 != null ? futuresCostBasis3.getSignedQuantity() : null;
        FuturesContract futuresContract = this.contract;
        return new FuturesLadderViewState.LadderData(futuresLadderDataState2, ladderPriceLevels, rowIndexFromPriceScaled$default2, stringResource2, map2, map, z, pendingOrders$feature_futures_trade_externalDebug, selectedRow$feature_futures_trade_externalDebug, selectedPendingOrders, num, ladderCustomGestureDetector, averageCostLineData, z2, stringResource, openPnlCostBasis, signedQuantity2, futuresContract != null ? futuresContract.getMultiplier() : null, quantityPanel, new FuturesLadderViewState.MarketClosedHeaderData(this.ladderMarketSessionChangeState.getHeaderString()));
    }

    public final List<PendingOrder> getAllOrdersPendingExecution$feature_futures_trade_externalDebug() {
        List listEmptyList;
        List<PendingReplacedOrder> list = this.pendingReplacedOrders;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingReplacedOrder) it.next()).getOriginalPendingOrder().getId());
        }
        Set set = CollectionsKt.toSet(arrayList);
        List<PendingReplacedOrder> list2 = this.pendingReplacedOrders;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((PendingReplacedOrder) it2.next()).getReplaceOrderRefId());
        }
        Set set2 = CollectionsKt.toSet(arrayList2);
        List<PendingPlacedOrder> list3 = this.pendingPlacedOrders;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((PendingPlacedOrder) it3.next()).getRefId());
        }
        Set setPlus = SetsKt.plus(set2, (Iterable) CollectionsKt.toSet(arrayList3));
        List<UiFuturesOrder> list4 = this.pendingOrders;
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list4) {
                UiFuturesOrder uiFuturesOrder = (UiFuturesOrder) obj;
                if (!set.contains(uiFuturesOrder.getId()) && !this.pendingOrderIdsInDeletion.contains(uiFuturesOrder.getId()) && !CollectionsKt.contains(setPlus, uiFuturesOrder.getOrder().getRefId())) {
                    arrayList4.add(obj);
                }
            }
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                listEmptyList.add(new PendingFilledOrder((UiFuturesOrder) it4.next()));
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) this.pendingReplacedOrders, (Iterable) this.pendingPlacedOrders), (Iterable) listEmptyList);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<Integer, FuturesLadderViewState.LadderData.PendingOrderRow> getPendingOrders$feature_futures_trade_externalDebug(List<? extends PendingOrder> allOrdersPendingExecution) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(allOrdersPendingExecution, "allOrdersPendingExecution");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : allOrdersPendingExecution) {
            BigDecimal price = ((PendingOrder) obj).getPrice();
            if (price != null) {
                LadderPriceLevels ladderPriceLevels = this.ladderPriceLevels;
                Integer numValueOf = ladderPriceLevels != null ? Integer.valueOf(LadderPriceLevels.getRowIndexFromPriceScaled$default(ladderPriceLevels, price, null, 2, null)) : null;
                iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
            }
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            Object arrayList = linkedHashMap.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf2, arrayList);
            }
            ((List) arrayList).add(obj);
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
            List list = (List) entry2.getValue();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Object obj2 : list) {
                FuturesOrderSide side = ((PendingOrder) obj2).getSide();
                Object arrayList2 = linkedHashMap4.get(side);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap4.put(side, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            FuturesLadderViewState.LadderData.PendingOrderRow.Group.Companion companion = FuturesLadderViewState.LadderData.PendingOrderRow.Group.INSTANCE;
            FuturesOrderSide futuresOrderSide = FuturesOrderSide.BUY;
            FuturesLadderViewState.LadderData.PendingOrderRow.Group groupFrom = companion.from(iIntValue2, futuresOrderSide, (List) linkedHashMap4.get(futuresOrderSide));
            FuturesOrderSide futuresOrderSide2 = FuturesOrderSide.SELL;
            linkedHashMap3.put(key, new FuturesLadderViewState.LadderData.PendingOrderRow(groupFrom, companion.from(iIntValue2, futuresOrderSide2, (List) linkedHashMap4.get(futuresOrderSide2))));
        }
        return linkedHashMap3;
    }

    public final FuturesLadderViewState.LadderData.SelectedRow getSelectedRow$feature_futures_trade_externalDebug() {
        Integer num;
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig;
        FuturesLadderViewState.LadderData.SelectedRow.OrderConfig orderConfig2;
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
        int rowIndexFromPriceScaled = ladderPriceLevels.getRowIndexFromPriceScaled(topBid, LadderPriceLevels3.DOWN);
        if (iIntValue < ladderPriceLevels.getRowIndexFromPriceScaled(topAsk, LadderPriceLevels3.f4167UP)) {
            orderConfig = new FuturesLadderViewState.LadderData.SelectedRow.OrderConfig(C17286R.string.futures_ladder_buy_stop_cta, FuturesOrderType.MARKET, FuturesOrderTrigger.STOP);
        } else {
            orderConfig = new FuturesLadderViewState.LadderData.SelectedRow.OrderConfig(C17286R.string.futures_ladder_buy_limit_cta, FuturesOrderType.LIMIT, FuturesOrderTrigger.IMMEDIATE);
        }
        if (iIntValue > rowIndexFromPriceScaled) {
            orderConfig2 = new FuturesLadderViewState.LadderData.SelectedRow.OrderConfig(C17286R.string.futures_ladder_sell_stop_cta, FuturesOrderType.MARKET, FuturesOrderTrigger.STOP);
        } else {
            orderConfig2 = new FuturesLadderViewState.LadderData.SelectedRow.OrderConfig(C17286R.string.futures_ladder_sell_limit_cta, FuturesOrderType.LIMIT, FuturesOrderTrigger.IMMEDIATE);
        }
        return new FuturesLadderViewState.LadderData.SelectedRow(iIntValue, orderConfig, orderConfig2);
    }

    public final FuturesLadderViewState.QuantityPanelData getQuantityPanelData() {
        StringResource stringResourceInvoke;
        if (BigDecimals7.isNegative(this.rhdBuyingPower)) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17286R.string.account_deficit, new Object[0]);
        } else {
            BigDecimal bigDecimal = this.rhdBuyingPower;
            stringResourceInvoke = bigDecimal != null ? StringResource.INSTANCE.invoke(C17286R.string.futures_buying_power, Formats.getCurrencyFormat().format(bigDecimal)) : null;
        }
        return new FuturesLadderViewState.QuantityPanelData(stringResourceInvoke, this.tradeQuantity, this.quantitySelectorOpen);
    }

    public final FuturesLadderViewState.BottomPanelData getBottomPanelData(FuturesLadderViewState.QuantityPanelData quantityPanel, List<? extends PendingOrder> allOrdersPendingExecution) {
        PendingOrder pendingOrderPrevious;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(quantityPanel, "quantityPanel");
        Intrinsics.checkNotNullParameter(allOrdersPendingExecution, "allOrdersPendingExecution");
        ListIterator<? extends PendingOrder> listIterator = allOrdersPendingExecution.listIterator(allOrdersPendingExecution.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pendingOrderPrevious = null;
                break;
            }
            pendingOrderPrevious = listIterator.previous();
            if (pendingOrderPrevious.isMarketOrder()) {
                break;
            }
        }
        PendingOrder pendingOrder = pendingOrderPrevious;
        Boolean bool = this.isInTradingSession;
        boolean z3 = true;
        if (bool != null && this.selectedRowIndex == null && this.selectedPendingOrders == null) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && pendingOrder == null) {
            z2 = z;
        } else {
            z2 = z;
            z = false;
        }
        return new FuturesLadderViewState.BottomPanelData(quantityPanel, z3, z, (pendingOrder != null ? pendingOrder.getSide() : null) == FuturesOrderSide.BUY ? z2 : false, (pendingOrder != null ? pendingOrder.getSide() : null) == FuturesOrderSide.SELL ? z2 : false);
    }

    public final FuturesLadderViewState.SettingsBottomSheetData getSettingsBottomSheetData() {
        Instant endTime;
        StringResource stringResourceInvoke = null;
        if (!this.showSettingsBottomSheet) {
            return null;
        }
        FuturesTimeInForce futuresTimeInForce = this.timeInForce;
        FuturesTradingHours.Session session = this.nextOpenTradingSession;
        if (session != null && (endTime = session.getEndTime()) != null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17462R.string.futures_trade_gfd_desc, InstantFormatter.DATE_NO_YEAR_IN_SYSTEM_ZONE.format(endTime), InstantFormatter.SHORT_TIME_WITH_OPTIONAL_MINUTE_IN_SYSTEM_ZONE.format(endTime));
        }
        return new FuturesLadderViewState.SettingsBottomSheetData(futuresTimeInForce, stringResourceInvoke, this.autoSend);
    }

    public static /* synthetic */ UserInteractionEventData withDefaultInteractionEventData$default(FuturesLadderDataState futuresLadderDataState, Context context, UserInteractionEventData.EventType eventType, UserInteractionEventData.Action action, Component component, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        if ((i & 2) != 0) {
            eventType = UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED;
        }
        if ((i & 4) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if ((i & 8) != 0) {
            component = null;
        }
        return futuresLadderDataState.withDefaultInteractionEventData(context, eventType, action, component);
    }

    public final UserInteractionEventData withDefaultInteractionEventData(Context context, UserInteractionEventData.EventType eventType, UserInteractionEventData.Action action, Component component) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(action, "action");
        if (context == null) {
            context = getLoggingContext();
        }
        return new UserInteractionEventData(eventType, new Screen(Screen.Name.FUTURES_LADDER_SCREEN, null, "FUTURES_LADDER_SCREEN", null, 10, null), component, action, context, null, null, 96, null);
    }

    public static /* synthetic */ UserInteractionEventData withDefaultInteractionEventData$default(FuturesLadderDataState futuresLadderDataState, Function1 function1, UserInteractionEventData.EventType eventType, UserInteractionEventData.Action action, Component component, int i, Object obj) {
        if ((i & 2) != 0) {
            eventType = UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED;
        }
        if ((i & 4) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if ((i & 8) != 0) {
            component = null;
        }
        return futuresLadderDataState.withDefaultInteractionEventData((Function1<? super Context, Context>) function1, eventType, action, component);
    }

    public final UserInteractionEventData withDefaultInteractionEventData(Function1<? super Context, Context> context, UserInteractionEventData.EventType eventType, UserInteractionEventData.Action action, Component component) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(action, "action");
        return withDefaultInteractionEventData(context.invoke(getLoggingContext()), eventType, action, component);
    }

    public final Context getLoggingContext() {
        FuturesAccountStatus status;
        Set<UUID> orderIds;
        BigDecimal avgTradePrice;
        BigDecimal signedQuantity;
        FuturesCostBasis futuresCostBasis = this.pnlCostBasis;
        int size = 0;
        int intRounded = (futuresCostBasis == null || (signedQuantity = futuresCostBasis.getSignedQuantity()) == null) ? 0 : BigDecimals7.toIntRounded(signedQuantity);
        FuturesCostBasis futuresCostBasis2 = this.pnlCostBasis;
        double dDoubleValue = (futuresCostBasis2 == null || (avgTradePrice = futuresCostBasis2.getAvgTradePrice()) == null) ? 0.0d : avgTradePrice.doubleValue();
        List<UiFuturesOrder> list = this.pendingOrders;
        int size2 = list != null ? list.size() : 0;
        FuturesContractContext futuresContractContext = new FuturesContractContext(Uuids.safeToString(this.contractId), null, null, null, 14, null);
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrders = this.selectedPendingOrders;
        if (selectedPendingOrders != null && (orderIds = selectedPendingOrders.getOrderIds()) != null) {
            size = orderIds.size();
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        ByteString byteString = null;
        int i = size2;
        int i2 = intRounded;
        FuturesLadderContext futuresLadderContext = new FuturesLadderContext(size, i2, i, null, null, byteString, 56, defaultConstructorMarker);
        FuturesPositionContext futuresPositionContext = new FuturesPositionContext(i2, i, dDoubleValue, 0, byteString, 24, defaultConstructorMarker);
        Screen screen = this.sourceScreen;
        FuturesAccount futuresAccount = this.account;
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, screen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, futuresContractContext, null, null, null, null, null, null, null, futuresLadderContext, null, null, null, null, null, null, null, null, futuresPositionContext, (futuresAccount == null || (status = futuresAccount.getStatus()) == null) ? null : LoggingUtils6.toFuturesAccountStatusContext(status), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -6295569, 16383, null);
    }

    public final List<PendingReplacedOrder> updatePendingReplacedOrders(List<UiFuturesOrder> newPendingOrders) {
        if (newPendingOrders == null) {
            return this.pendingReplacedOrders;
        }
        List<PendingReplacedOrder> list = this.pendingReplacedOrders;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingReplacedOrder) it.next()).getReplaceOrderRefId());
        }
        Set set = CollectionsKt.toSet(arrayList);
        List<UiFuturesOrder> list2 = newPendingOrders;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((UiFuturesOrder) it2.next()).getOrder().getRefId());
        }
        Set setIntersect = CollectionsKt.intersect(arrayList2, set);
        if (setIntersect.isEmpty()) {
            return this.pendingReplacedOrders;
        }
        List<PendingReplacedOrder> list3 = this.pendingReplacedOrders;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list3) {
            if (!setIntersect.contains(((PendingReplacedOrder) obj).getReplaceOrderRefId())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesLadderDataState copyForLadderPriceLevel$default(FuturesLadderDataState futuresLadderDataState, LadderPriceData ladderPriceLevels2, FuturesContract futuresContract, FuturesProduct futuresProduct, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            ladderPriceLevels2 = futuresLadderDataState.ladderPriceData;
        }
        if ((i & 2) != 0) {
            futuresContract = futuresLadderDataState.contract;
        }
        if ((i & 4) != 0) {
            futuresProduct = futuresLadderDataState.product;
        }
        if ((i & 8) != 0) {
            list = futuresLadderDataState.pendingOrders;
        }
        return futuresLadderDataState.copyForLadderPriceLevel(ladderPriceLevels2, futuresContract, futuresProduct, list);
    }

    public final FuturesLadderDataState copyForLadderPriceLevel(LadderPriceData newLadderPriceData, FuturesContract newContract, FuturesProduct newProduct, List<UiFuturesOrder> newPendingOrders) {
        Intrinsics.checkNotNullParameter(newLadderPriceData, "newLadderPriceData");
        return copy$default(this, null, null, null, newLadderPriceData, null, newContract, newProduct, null, newPendingOrders, null, null, null, null, null, false, null, false, null, LadderPriceLevels.INSTANCE.updateLadderPriceLevels(this.ladderPriceLevels, newLadderPriceData, newProduct, newPendingOrders), false, null, null, null, updatePendingReplacedOrders(newPendingOrders), null, null, null, null, null, null, null, null, -8651113, null);
    }

    public final FuturesLadderDataState copyToClearSelectionState() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -36798465, null);
    }
}
