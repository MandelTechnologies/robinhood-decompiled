package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.ledger.trade.TradeType;
import rosetta.mainst.LastLiquidityInd;
import rosetta.mainst.Route;
import rosetta.mainst.Side;
import rosetta.mainst.TradeBreakAgent;

/* compiled from: OrderUpdateExecution.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u0089\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0089\u0001B\u0093\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u00103\u001a\u000204\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010<\u001a\u00020=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\b\b\u0002\u0010A\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\t\u0010\u0082\u0001\u001a\u00020\u0002H\u0017J\u0016\u0010\u0083\u0001\u001a\u00020\f2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0096\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0010H\u0016J\t\u0010\u0087\u0001\u001a\u00020\u000eH\u0016J\u0093\u0004\u0010\u0088\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010 \u001a\u00020!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010A\u001a\u00020BR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010PR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010HR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010FR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010UR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010UR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010UR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010KR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010KR\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010HR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010HR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010HR\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0016\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0018\u0010'\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010UR\u0018\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0018\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0018\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010HR\u0018\u0010/\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010HR\u0018\u00100\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010UR\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010HR\u0018\u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010HR\u0016\u00103\u001a\u0002048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0018\u00105\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010UR\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010HR\u0018\u00107\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010UR\u0018\u00108\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010UR\u0018\u00109\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010KR\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010UR\u0018\u0010;\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010FR\u0016\u0010<\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0018\u0010>\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010HR\u0018\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u008a\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecution;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/Decimal;", "quantity", "timestamp", "Lcom/robinhood/rosetta/mainst/Time;", "broken_at", "fill", "", "exec_broker", "", "version", "", "broker_id", "leg_id", "Lcom/robinhood/rosetta/mainst/NullableString;", "commission", "commission_currency", "commission_type", "liquidity_ind", "settlement_type", "settlement_date", "trade_date", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "sec_fee", "taf_fee", "rounded_notional", "trade_break_agent", "Lrosetta/mainst/TradeBreakAgent;", "corrections", "", "Lcom/robinhood/rosetta/mainst/ExecutionCorrection;", "trade_type", "Lrosetta/ledger/trade/TradeType;", "trailer", "venue_details", "Lcom/robinhood/rosetta/mainst/VenueExecutionDetails;", "fractional_details", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetails;", "ipo_details", "Lcom/robinhood/rosetta/mainst/IPOExecutionDetails;", "or_fee", "occ_fee", "trade_match_id", "exchange_fee", "base_currency_traded", "side", "Lrosetta/mainst/Side;", "position_id", "non_denominated_currency_traded", "uti", "rel_tx_id", "estimated_next_settlement_time", "contra_firm_account", "associated_fx_execution_id", "last_liquidity_ind", "Lrosetta/mainst/LastLiquidityInd;", "fx_fee_in_bps", "execution_fees", "Lcom/robinhood/rosetta/mainst/ExecutionFees;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;ZLjava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/Route;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/TradeBreakAgent;Ljava/util/List;Lrosetta/ledger/trade/TradeType;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/VenueExecutionDetails;Lcom/robinhood/rosetta/mainst/FractionalExecutionDetails;Lcom/robinhood/rosetta/mainst/IPOExecutionDetails;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Side;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/LastLiquidityInd;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/ExecutionFees;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getPrice", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getQuantity", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/Time;", "getBroken_at", "getFill", "()Z", "getExec_broker", "()Ljava/lang/String;", "getVersion", "()I", "getBroker_id", "getLeg_id", "()Lcom/robinhood/rosetta/mainst/NullableString;", "getCommission", "getCommission_currency", "getCommission_type", "getLiquidity_ind", "getSettlement_type", "getSettlement_date", "getTrade_date", "getRoute", "()Lrosetta/mainst/Route;", "getSec_fee", "getTaf_fee", "getRounded_notional", "getTrade_break_agent", "()Lrosetta/mainst/TradeBreakAgent;", "getTrade_type", "()Lrosetta/ledger/trade/TradeType;", "getTrailer", "getVenue_details", "()Lcom/robinhood/rosetta/mainst/VenueExecutionDetails;", "getFractional_details", "()Lcom/robinhood/rosetta/mainst/FractionalExecutionDetails;", "getIpo_details", "()Lcom/robinhood/rosetta/mainst/IPOExecutionDetails;", "getOr_fee", "getOcc_fee", "getTrade_match_id", "getExchange_fee", "getBase_currency_traded", "getSide", "()Lrosetta/mainst/Side;", "getPosition_id", "getNon_denominated_currency_traded", "getUti", "getRel_tx_id", "getEstimated_next_settlement_time", "getContra_firm_account", "getAssociated_fx_execution_id", "getLast_liquidity_ind", "()Lrosetta/mainst/LastLiquidityInd;", "getFx_fee_in_bps", "getExecution_fees", "()Lcom/robinhood/rosetta/mainst/ExecutionFees;", "getCorrections", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderUpdateExecution extends Message {

    @JvmField
    public static final ProtoAdapter<OrderUpdateExecution> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "associatedFxExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 40, tag = 43)
    private final UUID associated_fx_execution_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "baseCurrencyTraded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 35)
    private final Decimal base_currency_traded;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "brokenAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time broken_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "brokerId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String broker_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Decimal commission;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "commissionCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final UUID commission_currency;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "commissionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final NullableString commission_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "contraFirmAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 39, tag = 42)
    private final NullableString contra_firm_account;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ExecutionCorrection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 29)
    private final List<ExecutionCorrection> corrections;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "estimatedNextSettlementTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 41)
    private final Time estimated_next_settlement_time;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "exchangeFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 34)
    private final Decimal exchange_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "execBroker", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String exec_broker;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ExecutionFees#ADAPTER", jsonName = "executionFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 43, tag = 46)
    private final ExecutionFees execution_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean fill;

    @WireField(adapter = "com.robinhood.rosetta.mainst.FractionalExecutionDetails#ADAPTER", jsonName = "fractionalDetails", oneofName = "ExtraDetails", schemaIndex = 26, tag = 27)
    private final FractionalExecutionDetails fractional_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "fxFeeInBps", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 42, tag = 45)
    private final Decimal fx_fee_in_bps;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.IPOExecutionDetails#ADAPTER", jsonName = "ipoDetails", oneofName = "ExtraDetails", schemaIndex = 27, tag = 28)
    private final IPOExecutionDetails ipo_details;

    @WireField(adapter = "rosetta.mainst.LastLiquidityInd#ADAPTER", jsonName = "lastLiquidityInd", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 41, tag = 44)
    private final LastLiquidityInd last_liquidity_ind;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "legId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final NullableString leg_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "liquidityInd", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final NullableString liquidity_ind;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "nonDenominatedCurrencyTraded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 38)
    private final Decimal non_denominated_currency_traded;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "occFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 31)
    private final Decimal occ_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "orFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 30)
    private final Decimal or_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "positionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 37)
    private final NullableString position_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Decimal price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Decimal quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "relTxId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 37, tag = 40)
    private final NullableString rel_tx_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "roundedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final Decimal rounded_notional;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final Route route;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "secFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final Decimal sec_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "settlementDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final Time settlement_date;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "settlementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final NullableString settlement_type;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 36)
    private final Side side;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "tafFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final Decimal taf_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time timestamp;

    @WireField(adapter = "rosetta.mainst.TradeBreakAgent#ADAPTER", jsonName = "tradeBreakAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final TradeBreakAgent trade_break_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "tradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final Time trade_date;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "tradeMatchId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 32)
    private final NullableString trade_match_id;

    @WireField(adapter = "rosetta.ledger.trade.TradeType#ADAPTER", jsonName = "tradeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final TradeType trade_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final NullableString trailer;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 39)
    private final NullableString uti;

    @WireField(adapter = "com.robinhood.rosetta.mainst.VenueExecutionDetails#ADAPTER", jsonName = "venueDetails", oneofName = "ExtraDetails", schemaIndex = 25, tag = 26)
    private final VenueExecutionDetails venue_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int version;

    public OrderUpdateExecution() {
        this(null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderUpdateExecution(UUID uuid, Decimal decimal, Decimal decimal2, Time time, Time time2, boolean z, String str, int i, String str2, NullableString nullableString, Decimal decimal3, UUID uuid2, NullableString nullableString2, NullableString nullableString3, NullableString nullableString4, Time time3, Time time4, Route route, Decimal decimal4, Decimal decimal5, Decimal decimal6, TradeBreakAgent tradeBreakAgent, List list, TradeType tradeType, NullableString nullableString5, VenueExecutionDetails venueExecutionDetails, FractionalExecutionDetails fractionalExecutionDetails, IPOExecutionDetails iPOExecutionDetails, Decimal decimal7, Decimal decimal8, NullableString nullableString6, Decimal decimal9, Decimal decimal10, Side side, NullableString nullableString7, Decimal decimal11, NullableString nullableString8, NullableString nullableString9, Time time5, NullableString nullableString10, UUID uuid3, LastLiquidityInd lastLiquidityInd, Decimal decimal12, ExecutionFees executionFees, ByteString byteString, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        UUID uuid4 = (i2 & 1) != 0 ? null : uuid;
        this(uuid4, (i2 & 2) != 0 ? null : decimal, (i2 & 4) != 0 ? null : decimal2, (i2 & 8) != 0 ? null : time, (i2 & 16) != 0 ? null : time2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str, (i2 & 128) == 0 ? i : 0, (i2 & 256) == 0 ? str2 : "", (i2 & 512) != 0 ? null : nullableString, (i2 & 1024) != 0 ? null : decimal3, (i2 & 2048) != 0 ? null : uuid2, (i2 & 4096) != 0 ? null : nullableString2, (i2 & 8192) != 0 ? null : nullableString3, (i2 & 16384) != 0 ? null : nullableString4, (i2 & 32768) != 0 ? null : time3, (i2 & 65536) != 0 ? null : time4, (i2 & 131072) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i2 & 262144) != 0 ? null : decimal4, (i2 & 524288) != 0 ? null : decimal5, (i2 & 1048576) != 0 ? null : decimal6, (i2 & 2097152) != 0 ? TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED : tradeBreakAgent, (i2 & 4194304) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8388608) != 0 ? TradeType.TRADE_TYPE_UNSPECIFIED : tradeType, (i2 & 16777216) != 0 ? null : nullableString5, (i2 & 33554432) != 0 ? null : venueExecutionDetails, (i2 & 67108864) != 0 ? null : fractionalExecutionDetails, (i2 & 134217728) != 0 ? null : iPOExecutionDetails, (i2 & 268435456) != 0 ? null : decimal7, (i2 & 536870912) != 0 ? null : decimal8, (i2 & 1073741824) != 0 ? null : nullableString6, (i2 & Integer.MIN_VALUE) != 0 ? null : decimal9, (i3 & 1) != 0 ? null : decimal10, (i3 & 2) != 0 ? Side.SIDE_UNSPECIFIED : side, (i3 & 4) != 0 ? null : nullableString7, (i3 & 8) != 0 ? null : decimal11, (i3 & 16) != 0 ? null : nullableString8, (i3 & 32) != 0 ? null : nullableString9, (i3 & 64) != 0 ? null : time5, (i3 & 128) != 0 ? null : nullableString10, (i3 & 256) != 0 ? null : uuid3, (i3 & 512) != 0 ? LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED : lastLiquidityInd, (i3 & 1024) != 0 ? null : decimal12, (i3 & 2048) != 0 ? null : executionFees, (i3 & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24694newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final Time getTimestamp() {
        return this.timestamp;
    }

    public final Time getBroken_at() {
        return this.broken_at;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final String getExec_broker() {
        return this.exec_broker;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getBroker_id() {
        return this.broker_id;
    }

    public final NullableString getLeg_id() {
        return this.leg_id;
    }

    public final Decimal getCommission() {
        return this.commission;
    }

    public final UUID getCommission_currency() {
        return this.commission_currency;
    }

    public final NullableString getCommission_type() {
        return this.commission_type;
    }

    public final NullableString getLiquidity_ind() {
        return this.liquidity_ind;
    }

    public final NullableString getSettlement_type() {
        return this.settlement_type;
    }

    public final Time getSettlement_date() {
        return this.settlement_date;
    }

    public final Time getTrade_date() {
        return this.trade_date;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final Decimal getSec_fee() {
        return this.sec_fee;
    }

    public final Decimal getTaf_fee() {
        return this.taf_fee;
    }

    public final Decimal getRounded_notional() {
        return this.rounded_notional;
    }

    public final TradeBreakAgent getTrade_break_agent() {
        return this.trade_break_agent;
    }

    public final TradeType getTrade_type() {
        return this.trade_type;
    }

    public final NullableString getTrailer() {
        return this.trailer;
    }

    public final VenueExecutionDetails getVenue_details() {
        return this.venue_details;
    }

    public final FractionalExecutionDetails getFractional_details() {
        return this.fractional_details;
    }

    public final IPOExecutionDetails getIpo_details() {
        return this.ipo_details;
    }

    public final Decimal getOr_fee() {
        return this.or_fee;
    }

    public final Decimal getOcc_fee() {
        return this.occ_fee;
    }

    public final NullableString getTrade_match_id() {
        return this.trade_match_id;
    }

    public final Decimal getExchange_fee() {
        return this.exchange_fee;
    }

    public final Decimal getBase_currency_traded() {
        return this.base_currency_traded;
    }

    public final Side getSide() {
        return this.side;
    }

    public final NullableString getPosition_id() {
        return this.position_id;
    }

    public final Decimal getNon_denominated_currency_traded() {
        return this.non_denominated_currency_traded;
    }

    public final NullableString getUti() {
        return this.uti;
    }

    public final NullableString getRel_tx_id() {
        return this.rel_tx_id;
    }

    public final Time getEstimated_next_settlement_time() {
        return this.estimated_next_settlement_time;
    }

    public final NullableString getContra_firm_account() {
        return this.contra_firm_account;
    }

    public final UUID getAssociated_fx_execution_id() {
        return this.associated_fx_execution_id;
    }

    public final LastLiquidityInd getLast_liquidity_ind() {
        return this.last_liquidity_ind;
    }

    public final Decimal getFx_fee_in_bps() {
        return this.fx_fee_in_bps;
    }

    public final ExecutionFees getExecution_fees() {
        return this.execution_fees;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderUpdateExecution(UUID uuid, Decimal decimal, Decimal decimal2, Time time, Time time2, boolean z, String exec_broker, int i, String broker_id, NullableString nullableString, Decimal decimal3, UUID uuid2, NullableString nullableString2, NullableString nullableString3, NullableString nullableString4, Time time3, Time time4, Route route, Decimal decimal4, Decimal decimal5, Decimal decimal6, TradeBreakAgent trade_break_agent, List<ExecutionCorrection> corrections, TradeType trade_type, NullableString nullableString5, VenueExecutionDetails venueExecutionDetails, FractionalExecutionDetails fractionalExecutionDetails, IPOExecutionDetails iPOExecutionDetails, Decimal decimal7, Decimal decimal8, NullableString nullableString6, Decimal decimal9, Decimal decimal10, Side side, NullableString nullableString7, Decimal decimal11, NullableString nullableString8, NullableString nullableString9, Time time5, NullableString nullableString10, UUID uuid3, LastLiquidityInd last_liquidity_ind, Decimal decimal12, ExecutionFees executionFees, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(broker_id, "broker_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(corrections, "corrections");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.price = decimal;
        this.quantity = decimal2;
        this.timestamp = time;
        this.broken_at = time2;
        this.fill = z;
        this.exec_broker = exec_broker;
        this.version = i;
        this.broker_id = broker_id;
        this.leg_id = nullableString;
        this.commission = decimal3;
        this.commission_currency = uuid2;
        this.commission_type = nullableString2;
        this.liquidity_ind = nullableString3;
        this.settlement_type = nullableString4;
        this.settlement_date = time3;
        this.trade_date = time4;
        this.route = route;
        this.sec_fee = decimal4;
        this.taf_fee = decimal5;
        this.rounded_notional = decimal6;
        this.trade_break_agent = trade_break_agent;
        this.trade_type = trade_type;
        this.trailer = nullableString5;
        this.venue_details = venueExecutionDetails;
        this.fractional_details = fractionalExecutionDetails;
        this.ipo_details = iPOExecutionDetails;
        this.or_fee = decimal7;
        this.occ_fee = decimal8;
        this.trade_match_id = nullableString6;
        this.exchange_fee = decimal9;
        this.base_currency_traded = decimal10;
        this.side = side;
        this.position_id = nullableString7;
        this.non_denominated_currency_traded = decimal11;
        this.uti = nullableString8;
        this.rel_tx_id = nullableString9;
        this.estimated_next_settlement_time = time5;
        this.contra_firm_account = nullableString10;
        this.associated_fx_execution_id = uuid3;
        this.last_liquidity_ind = last_liquidity_ind;
        this.fx_fee_in_bps = decimal12;
        this.execution_fees = executionFees;
        this.corrections = Internal.immutableCopyOf("corrections", corrections);
        if (Internal.countNonNull(venueExecutionDetails, fractionalExecutionDetails, iPOExecutionDetails) > 1) {
            throw new IllegalArgumentException("At most one of venue_details, fractional_details, ipo_details may be non-null");
        }
    }

    public final List<ExecutionCorrection> getCorrections() {
        return this.corrections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24694newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderUpdateExecution)) {
            return false;
        }
        OrderUpdateExecution orderUpdateExecution = (OrderUpdateExecution) other;
        return Intrinsics.areEqual(unknownFields(), orderUpdateExecution.unknownFields()) && Intrinsics.areEqual(this.id, orderUpdateExecution.id) && Intrinsics.areEqual(this.price, orderUpdateExecution.price) && Intrinsics.areEqual(this.quantity, orderUpdateExecution.quantity) && Intrinsics.areEqual(this.timestamp, orderUpdateExecution.timestamp) && Intrinsics.areEqual(this.broken_at, orderUpdateExecution.broken_at) && this.fill == orderUpdateExecution.fill && Intrinsics.areEqual(this.exec_broker, orderUpdateExecution.exec_broker) && this.version == orderUpdateExecution.version && Intrinsics.areEqual(this.broker_id, orderUpdateExecution.broker_id) && Intrinsics.areEqual(this.leg_id, orderUpdateExecution.leg_id) && Intrinsics.areEqual(this.commission, orderUpdateExecution.commission) && Intrinsics.areEqual(this.commission_currency, orderUpdateExecution.commission_currency) && Intrinsics.areEqual(this.commission_type, orderUpdateExecution.commission_type) && Intrinsics.areEqual(this.liquidity_ind, orderUpdateExecution.liquidity_ind) && Intrinsics.areEqual(this.settlement_type, orderUpdateExecution.settlement_type) && Intrinsics.areEqual(this.settlement_date, orderUpdateExecution.settlement_date) && Intrinsics.areEqual(this.trade_date, orderUpdateExecution.trade_date) && this.route == orderUpdateExecution.route && Intrinsics.areEqual(this.sec_fee, orderUpdateExecution.sec_fee) && Intrinsics.areEqual(this.taf_fee, orderUpdateExecution.taf_fee) && Intrinsics.areEqual(this.rounded_notional, orderUpdateExecution.rounded_notional) && this.trade_break_agent == orderUpdateExecution.trade_break_agent && Intrinsics.areEqual(this.corrections, orderUpdateExecution.corrections) && this.trade_type == orderUpdateExecution.trade_type && Intrinsics.areEqual(this.trailer, orderUpdateExecution.trailer) && Intrinsics.areEqual(this.venue_details, orderUpdateExecution.venue_details) && Intrinsics.areEqual(this.fractional_details, orderUpdateExecution.fractional_details) && Intrinsics.areEqual(this.ipo_details, orderUpdateExecution.ipo_details) && Intrinsics.areEqual(this.or_fee, orderUpdateExecution.or_fee) && Intrinsics.areEqual(this.occ_fee, orderUpdateExecution.occ_fee) && Intrinsics.areEqual(this.trade_match_id, orderUpdateExecution.trade_match_id) && Intrinsics.areEqual(this.exchange_fee, orderUpdateExecution.exchange_fee) && Intrinsics.areEqual(this.base_currency_traded, orderUpdateExecution.base_currency_traded) && this.side == orderUpdateExecution.side && Intrinsics.areEqual(this.position_id, orderUpdateExecution.position_id) && Intrinsics.areEqual(this.non_denominated_currency_traded, orderUpdateExecution.non_denominated_currency_traded) && Intrinsics.areEqual(this.uti, orderUpdateExecution.uti) && Intrinsics.areEqual(this.rel_tx_id, orderUpdateExecution.rel_tx_id) && Intrinsics.areEqual(this.estimated_next_settlement_time, orderUpdateExecution.estimated_next_settlement_time) && Intrinsics.areEqual(this.contra_firm_account, orderUpdateExecution.contra_firm_account) && Intrinsics.areEqual(this.associated_fx_execution_id, orderUpdateExecution.associated_fx_execution_id) && this.last_liquidity_ind == orderUpdateExecution.last_liquidity_ind && Intrinsics.areEqual(this.fx_fee_in_bps, orderUpdateExecution.fx_fee_in_bps) && Intrinsics.areEqual(this.execution_fees, orderUpdateExecution.execution_fees);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        Decimal decimal = this.price;
        int iHashCode3 = (iHashCode2 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.quantity;
        int iHashCode4 = (iHashCode3 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Time time = this.timestamp;
        int iHashCode5 = (iHashCode4 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.broken_at;
        int iHashCode6 = (((((((((iHashCode5 + (time2 != null ? time2.hashCode() : 0)) * 37) + Boolean.hashCode(this.fill)) * 37) + this.exec_broker.hashCode()) * 37) + Integer.hashCode(this.version)) * 37) + this.broker_id.hashCode()) * 37;
        NullableString nullableString = this.leg_id;
        int iHashCode7 = (iHashCode6 + (nullableString != null ? nullableString.hashCode() : 0)) * 37;
        Decimal decimal3 = this.commission;
        int iHashCode8 = (iHashCode7 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        UUID uuid2 = this.commission_currency;
        int iHashCode9 = (iHashCode8 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37;
        NullableString nullableString2 = this.commission_type;
        int iHashCode10 = (iHashCode9 + (nullableString2 != null ? nullableString2.hashCode() : 0)) * 37;
        NullableString nullableString3 = this.liquidity_ind;
        int iHashCode11 = (iHashCode10 + (nullableString3 != null ? nullableString3.hashCode() : 0)) * 37;
        NullableString nullableString4 = this.settlement_type;
        int iHashCode12 = (iHashCode11 + (nullableString4 != null ? nullableString4.hashCode() : 0)) * 37;
        Time time3 = this.settlement_date;
        int iHashCode13 = (iHashCode12 + (time3 != null ? time3.hashCode() : 0)) * 37;
        Time time4 = this.trade_date;
        int iHashCode14 = (((iHashCode13 + (time4 != null ? time4.hashCode() : 0)) * 37) + this.route.hashCode()) * 37;
        Decimal decimal4 = this.sec_fee;
        int iHashCode15 = (iHashCode14 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37;
        Decimal decimal5 = this.taf_fee;
        int iHashCode16 = (iHashCode15 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37;
        Decimal decimal6 = this.rounded_notional;
        int iHashCode17 = (((((((iHashCode16 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37) + this.trade_break_agent.hashCode()) * 37) + this.corrections.hashCode()) * 37) + this.trade_type.hashCode()) * 37;
        NullableString nullableString5 = this.trailer;
        int iHashCode18 = (iHashCode17 + (nullableString5 != null ? nullableString5.hashCode() : 0)) * 37;
        VenueExecutionDetails venueExecutionDetails = this.venue_details;
        int iHashCode19 = (iHashCode18 + (venueExecutionDetails != null ? venueExecutionDetails.hashCode() : 0)) * 37;
        FractionalExecutionDetails fractionalExecutionDetails = this.fractional_details;
        int iHashCode20 = (iHashCode19 + (fractionalExecutionDetails != null ? fractionalExecutionDetails.hashCode() : 0)) * 37;
        IPOExecutionDetails iPOExecutionDetails = this.ipo_details;
        int iHashCode21 = (iHashCode20 + (iPOExecutionDetails != null ? iPOExecutionDetails.hashCode() : 0)) * 37;
        Decimal decimal7 = this.or_fee;
        int iHashCode22 = (iHashCode21 + (decimal7 != null ? decimal7.hashCode() : 0)) * 37;
        Decimal decimal8 = this.occ_fee;
        int iHashCode23 = (iHashCode22 + (decimal8 != null ? decimal8.hashCode() : 0)) * 37;
        NullableString nullableString6 = this.trade_match_id;
        int iHashCode24 = (iHashCode23 + (nullableString6 != null ? nullableString6.hashCode() : 0)) * 37;
        Decimal decimal9 = this.exchange_fee;
        int iHashCode25 = (iHashCode24 + (decimal9 != null ? decimal9.hashCode() : 0)) * 37;
        Decimal decimal10 = this.base_currency_traded;
        int iHashCode26 = (((iHashCode25 + (decimal10 != null ? decimal10.hashCode() : 0)) * 37) + this.side.hashCode()) * 37;
        NullableString nullableString7 = this.position_id;
        int iHashCode27 = (iHashCode26 + (nullableString7 != null ? nullableString7.hashCode() : 0)) * 37;
        Decimal decimal11 = this.non_denominated_currency_traded;
        int iHashCode28 = (iHashCode27 + (decimal11 != null ? decimal11.hashCode() : 0)) * 37;
        NullableString nullableString8 = this.uti;
        int iHashCode29 = (iHashCode28 + (nullableString8 != null ? nullableString8.hashCode() : 0)) * 37;
        NullableString nullableString9 = this.rel_tx_id;
        int iHashCode30 = (iHashCode29 + (nullableString9 != null ? nullableString9.hashCode() : 0)) * 37;
        Time time5 = this.estimated_next_settlement_time;
        int iHashCode31 = (iHashCode30 + (time5 != null ? time5.hashCode() : 0)) * 37;
        NullableString nullableString10 = this.contra_firm_account;
        int iHashCode32 = (iHashCode31 + (nullableString10 != null ? nullableString10.hashCode() : 0)) * 37;
        UUID uuid3 = this.associated_fx_execution_id;
        int iHashCode33 = (((iHashCode32 + (uuid3 != null ? uuid3.hashCode() : 0)) * 37) + this.last_liquidity_ind.hashCode()) * 37;
        Decimal decimal12 = this.fx_fee_in_bps;
        int iHashCode34 = (iHashCode33 + (decimal12 != null ? decimal12.hashCode() : 0)) * 37;
        ExecutionFees executionFees = this.execution_fees;
        int iHashCode35 = iHashCode34 + (executionFees != null ? executionFees.hashCode() : 0);
        this.hashCode = iHashCode35;
        return iHashCode35;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        Decimal decimal = this.price;
        if (decimal != null) {
            arrayList.add("price=" + decimal);
        }
        Decimal decimal2 = this.quantity;
        if (decimal2 != null) {
            arrayList.add("quantity=" + decimal2);
        }
        Time time = this.timestamp;
        if (time != null) {
            arrayList.add("timestamp=" + time);
        }
        Time time2 = this.broken_at;
        if (time2 != null) {
            arrayList.add("broken_at=" + time2);
        }
        arrayList.add("fill=" + this.fill);
        arrayList.add("exec_broker=" + Internal.sanitize(this.exec_broker));
        arrayList.add("version=" + this.version);
        arrayList.add("broker_id=" + Internal.sanitize(this.broker_id));
        NullableString nullableString = this.leg_id;
        if (nullableString != null) {
            arrayList.add("leg_id=" + nullableString);
        }
        Decimal decimal3 = this.commission;
        if (decimal3 != null) {
            arrayList.add("commission=" + decimal3);
        }
        UUID uuid2 = this.commission_currency;
        if (uuid2 != null) {
            arrayList.add("commission_currency=" + uuid2);
        }
        NullableString nullableString2 = this.commission_type;
        if (nullableString2 != null) {
            arrayList.add("commission_type=" + nullableString2);
        }
        NullableString nullableString3 = this.liquidity_ind;
        if (nullableString3 != null) {
            arrayList.add("liquidity_ind=" + nullableString3);
        }
        NullableString nullableString4 = this.settlement_type;
        if (nullableString4 != null) {
            arrayList.add("settlement_type=" + nullableString4);
        }
        Time time3 = this.settlement_date;
        if (time3 != null) {
            arrayList.add("settlement_date=" + time3);
        }
        Time time4 = this.trade_date;
        if (time4 != null) {
            arrayList.add("trade_date=" + time4);
        }
        arrayList.add("route=" + this.route);
        Decimal decimal4 = this.sec_fee;
        if (decimal4 != null) {
            arrayList.add("sec_fee=" + decimal4);
        }
        Decimal decimal5 = this.taf_fee;
        if (decimal5 != null) {
            arrayList.add("taf_fee=" + decimal5);
        }
        Decimal decimal6 = this.rounded_notional;
        if (decimal6 != null) {
            arrayList.add("rounded_notional=" + decimal6);
        }
        arrayList.add("trade_break_agent=" + this.trade_break_agent);
        if (!this.corrections.isEmpty()) {
            arrayList.add("corrections=" + this.corrections);
        }
        arrayList.add("trade_type=" + this.trade_type);
        NullableString nullableString5 = this.trailer;
        if (nullableString5 != null) {
            arrayList.add("trailer=" + nullableString5);
        }
        VenueExecutionDetails venueExecutionDetails = this.venue_details;
        if (venueExecutionDetails != null) {
            arrayList.add("venue_details=" + venueExecutionDetails);
        }
        FractionalExecutionDetails fractionalExecutionDetails = this.fractional_details;
        if (fractionalExecutionDetails != null) {
            arrayList.add("fractional_details=" + fractionalExecutionDetails);
        }
        IPOExecutionDetails iPOExecutionDetails = this.ipo_details;
        if (iPOExecutionDetails != null) {
            arrayList.add("ipo_details=" + iPOExecutionDetails);
        }
        Decimal decimal7 = this.or_fee;
        if (decimal7 != null) {
            arrayList.add("or_fee=" + decimal7);
        }
        Decimal decimal8 = this.occ_fee;
        if (decimal8 != null) {
            arrayList.add("occ_fee=" + decimal8);
        }
        NullableString nullableString6 = this.trade_match_id;
        if (nullableString6 != null) {
            arrayList.add("trade_match_id=" + nullableString6);
        }
        Decimal decimal9 = this.exchange_fee;
        if (decimal9 != null) {
            arrayList.add("exchange_fee=" + decimal9);
        }
        Decimal decimal10 = this.base_currency_traded;
        if (decimal10 != null) {
            arrayList.add("base_currency_traded=" + decimal10);
        }
        arrayList.add("side=" + this.side);
        NullableString nullableString7 = this.position_id;
        if (nullableString7 != null) {
            arrayList.add("position_id=" + nullableString7);
        }
        Decimal decimal11 = this.non_denominated_currency_traded;
        if (decimal11 != null) {
            arrayList.add("non_denominated_currency_traded=" + decimal11);
        }
        NullableString nullableString8 = this.uti;
        if (nullableString8 != null) {
            arrayList.add("uti=" + nullableString8);
        }
        NullableString nullableString9 = this.rel_tx_id;
        if (nullableString9 != null) {
            arrayList.add("rel_tx_id=" + nullableString9);
        }
        Time time5 = this.estimated_next_settlement_time;
        if (time5 != null) {
            arrayList.add("estimated_next_settlement_time=" + time5);
        }
        NullableString nullableString10 = this.contra_firm_account;
        if (nullableString10 != null) {
            arrayList.add("contra_firm_account=" + nullableString10);
        }
        UUID uuid3 = this.associated_fx_execution_id;
        if (uuid3 != null) {
            arrayList.add("associated_fx_execution_id=" + uuid3);
        }
        arrayList.add("last_liquidity_ind=" + this.last_liquidity_ind);
        Decimal decimal12 = this.fx_fee_in_bps;
        if (decimal12 != null) {
            arrayList.add("fx_fee_in_bps=" + decimal12);
        }
        ExecutionFees executionFees = this.execution_fees;
        if (executionFees != null) {
            arrayList.add("execution_fees=" + executionFees);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderUpdateExecution{", "}", 0, null, null, 56, null);
    }

    public final OrderUpdateExecution copy(UUID id, Decimal price, Decimal quantity, Time timestamp, Time broken_at, boolean fill, String exec_broker, int version, String broker_id, NullableString leg_id, Decimal commission, UUID commission_currency, NullableString commission_type, NullableString liquidity_ind, NullableString settlement_type, Time settlement_date, Time trade_date, Route route, Decimal sec_fee, Decimal taf_fee, Decimal rounded_notional, TradeBreakAgent trade_break_agent, List<ExecutionCorrection> corrections, TradeType trade_type, NullableString trailer, VenueExecutionDetails venue_details, FractionalExecutionDetails fractional_details, IPOExecutionDetails ipo_details, Decimal or_fee, Decimal occ_fee, NullableString trade_match_id, Decimal exchange_fee, Decimal base_currency_traded, Side side, NullableString position_id, Decimal non_denominated_currency_traded, NullableString uti, NullableString rel_tx_id, Time estimated_next_settlement_time, NullableString contra_firm_account, UUID associated_fx_execution_id, LastLiquidityInd last_liquidity_ind, Decimal fx_fee_in_bps, ExecutionFees execution_fees, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(broker_id, "broker_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(corrections, "corrections");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderUpdateExecution(id, price, quantity, timestamp, broken_at, fill, exec_broker, version, broker_id, leg_id, commission, commission_currency, commission_type, liquidity_ind, settlement_type, settlement_date, trade_date, route, sec_fee, taf_fee, rounded_notional, trade_break_agent, corrections, trade_type, trailer, venue_details, fractional_details, ipo_details, or_fee, occ_fee, trade_match_id, exchange_fee, base_currency_traded, side, position_id, non_denominated_currency_traded, uti, rel_tx_id, estimated_next_settlement_time, contra_firm_account, associated_fx_execution_id, last_liquidity_ind, fx_fee_in_bps, execution_fees, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderUpdateExecution.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderUpdateExecution>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OrderUpdateExecution$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderUpdateExecution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getPrice() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(2, value.getPrice());
                }
                if (value.getQuantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(3, value.getQuantity());
                }
                if (value.getTimestamp() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(4, value.getTimestamp());
                }
                if (value.getBroken_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(5, value.getBroken_at());
                }
                if (value.getFill()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getFill()));
                }
                if (!Intrinsics.areEqual(value.getExec_broker(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getExec_broker());
                }
                if (value.getVersion() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getVersion()));
                }
                if (!Intrinsics.areEqual(value.getBroker_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getBroker_id());
                }
                if (value.getLeg_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(10, value.getLeg_id());
                }
                if (value.getCommission() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(11, value.getCommission());
                }
                if (value.getCommission_currency() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(12, value.getCommission_currency());
                }
                if (value.getCommission_type() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(13, value.getCommission_type());
                }
                if (value.getLiquidity_ind() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(14, value.getLiquidity_ind());
                }
                if (value.getSettlement_type() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(15, value.getSettlement_type());
                }
                if (value.getSettlement_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(16, value.getSettlement_date());
                }
                if (value.getTrade_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(17, value.getTrade_date());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    size += Route.ADAPTER.encodedSizeWithTag(18, value.getRoute());
                }
                if (value.getSec_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(19, value.getSec_fee());
                }
                if (value.getTaf_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(20, value.getTaf_fee());
                }
                if (value.getRounded_notional() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(21, value.getRounded_notional());
                }
                if (value.getTrade_break_agent() != TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED) {
                    size += TradeBreakAgent.ADAPTER.encodedSizeWithTag(22, value.getTrade_break_agent());
                }
                int iEncodedSizeWithTag = size + ExecutionCorrection.ADAPTER.asRepeated().encodedSizeWithTag(29, value.getCorrections());
                if (value.getTrade_type() != TradeType.TRADE_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += TradeType.ADAPTER.encodedSizeWithTag(24, value.getTrade_type());
                }
                if (value.getTrailer() != null) {
                    iEncodedSizeWithTag += NullableString.ADAPTER.encodedSizeWithTag(25, value.getTrailer());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + VenueExecutionDetails.ADAPTER.encodedSizeWithTag(26, value.getVenue_details()) + FractionalExecutionDetails.ADAPTER.encodedSizeWithTag(27, value.getFractional_details()) + IPOExecutionDetails.ADAPTER.encodedSizeWithTag(28, value.getIpo_details());
                if (value.getOr_fee() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(30, value.getOr_fee());
                }
                if (value.getOcc_fee() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(31, value.getOcc_fee());
                }
                if (value.getTrade_match_id() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(32, value.getTrade_match_id());
                }
                if (value.getExchange_fee() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(34, value.getExchange_fee());
                }
                if (value.getBase_currency_traded() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(35, value.getBase_currency_traded());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += Side.ADAPTER.encodedSizeWithTag(36, value.getSide());
                }
                if (value.getPosition_id() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(37, value.getPosition_id());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(38, value.getNon_denominated_currency_traded());
                }
                if (value.getUti() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(39, value.getUti());
                }
                if (value.getRel_tx_id() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(40, value.getRel_tx_id());
                }
                if (value.getEstimated_next_settlement_time() != null) {
                    iEncodedSizeWithTag2 += Time.ADAPTER.encodedSizeWithTag(41, value.getEstimated_next_settlement_time());
                }
                if (value.getContra_firm_account() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(42, value.getContra_firm_account());
                }
                if (value.getAssociated_fx_execution_id() != null) {
                    iEncodedSizeWithTag2 += UUID.ADAPTER.encodedSizeWithTag(43, value.getAssociated_fx_execution_id());
                }
                if (value.getLast_liquidity_ind() != LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += LastLiquidityInd.ADAPTER.encodedSizeWithTag(44, value.getLast_liquidity_ind());
                }
                if (value.getFx_fee_in_bps() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(45, value.getFx_fee_in_bps());
                }
                return value.getExecution_fees() != null ? iEncodedSizeWithTag2 + ExecutionFees.ADAPTER.encodedSizeWithTag(46, value.getExecution_fees()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderUpdateExecution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrice());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getBroken_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getBroken_at());
                }
                if (value.getFill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getFill()));
                }
                if (!Intrinsics.areEqual(value.getExec_broker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getExec_broker());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getVersion()));
                }
                if (!Intrinsics.areEqual(value.getBroker_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getBroker_id());
                }
                if (value.getLeg_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 10, (int) value.getLeg_id());
                }
                if (value.getCommission() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 11, (int) value.getCommission());
                }
                if (value.getCommission_currency() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 12, (int) value.getCommission_currency());
                }
                if (value.getCommission_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 13, (int) value.getCommission_type());
                }
                if (value.getLiquidity_ind() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 14, (int) value.getLiquidity_ind());
                }
                if (value.getSettlement_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 15, (int) value.getSettlement_type());
                }
                if (value.getSettlement_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 16, (int) value.getSettlement_date());
                }
                if (value.getTrade_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 17, (int) value.getTrade_date());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 18, (int) value.getRoute());
                }
                if (value.getSec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 19, (int) value.getSec_fee());
                }
                if (value.getTaf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 20, (int) value.getTaf_fee());
                }
                if (value.getRounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 21, (int) value.getRounded_notional());
                }
                if (value.getTrade_break_agent() != TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED) {
                    TradeBreakAgent.ADAPTER.encodeWithTag(writer, 22, (int) value.getTrade_break_agent());
                }
                ExecutionCorrection.ADAPTER.asRepeated().encodeWithTag(writer, 29, (int) value.getCorrections());
                if (value.getTrade_type() != TradeType.TRADE_TYPE_UNSPECIFIED) {
                    TradeType.ADAPTER.encodeWithTag(writer, 24, (int) value.getTrade_type());
                }
                if (value.getTrailer() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 25, (int) value.getTrailer());
                }
                if (value.getOr_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 30, (int) value.getOr_fee());
                }
                if (value.getOcc_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 31, (int) value.getOcc_fee());
                }
                if (value.getTrade_match_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 32, (int) value.getTrade_match_id());
                }
                if (value.getExchange_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 34, (int) value.getExchange_fee());
                }
                if (value.getBase_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 35, (int) value.getBase_currency_traded());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 36, (int) value.getSide());
                }
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 37, (int) value.getPosition_id());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 38, (int) value.getNon_denominated_currency_traded());
                }
                if (value.getUti() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 39, (int) value.getUti());
                }
                if (value.getRel_tx_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 40, (int) value.getRel_tx_id());
                }
                if (value.getEstimated_next_settlement_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 41, (int) value.getEstimated_next_settlement_time());
                }
                if (value.getContra_firm_account() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 42, (int) value.getContra_firm_account());
                }
                if (value.getAssociated_fx_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 43, (int) value.getAssociated_fx_execution_id());
                }
                if (value.getLast_liquidity_ind() != LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED) {
                    LastLiquidityInd.ADAPTER.encodeWithTag(writer, 44, (int) value.getLast_liquidity_ind());
                }
                if (value.getFx_fee_in_bps() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 45, (int) value.getFx_fee_in_bps());
                }
                if (value.getExecution_fees() != null) {
                    ExecutionFees.ADAPTER.encodeWithTag(writer, 46, (int) value.getExecution_fees());
                }
                VenueExecutionDetails.ADAPTER.encodeWithTag(writer, 26, (int) value.getVenue_details());
                FractionalExecutionDetails.ADAPTER.encodeWithTag(writer, 27, (int) value.getFractional_details());
                IPOExecutionDetails.ADAPTER.encodeWithTag(writer, 28, (int) value.getIpo_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderUpdateExecution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                IPOExecutionDetails.ADAPTER.encodeWithTag(writer, 28, (int) value.getIpo_details());
                FractionalExecutionDetails.ADAPTER.encodeWithTag(writer, 27, (int) value.getFractional_details());
                VenueExecutionDetails.ADAPTER.encodeWithTag(writer, 26, (int) value.getVenue_details());
                if (value.getExecution_fees() != null) {
                    ExecutionFees.ADAPTER.encodeWithTag(writer, 46, (int) value.getExecution_fees());
                }
                if (value.getFx_fee_in_bps() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 45, (int) value.getFx_fee_in_bps());
                }
                if (value.getLast_liquidity_ind() != LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED) {
                    LastLiquidityInd.ADAPTER.encodeWithTag(writer, 44, (int) value.getLast_liquidity_ind());
                }
                if (value.getAssociated_fx_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 43, (int) value.getAssociated_fx_execution_id());
                }
                if (value.getContra_firm_account() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 42, (int) value.getContra_firm_account());
                }
                if (value.getEstimated_next_settlement_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 41, (int) value.getEstimated_next_settlement_time());
                }
                if (value.getRel_tx_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 40, (int) value.getRel_tx_id());
                }
                if (value.getUti() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 39, (int) value.getUti());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 38, (int) value.getNon_denominated_currency_traded());
                }
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 37, (int) value.getPosition_id());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 36, (int) value.getSide());
                }
                if (value.getBase_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 35, (int) value.getBase_currency_traded());
                }
                if (value.getExchange_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 34, (int) value.getExchange_fee());
                }
                if (value.getTrade_match_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 32, (int) value.getTrade_match_id());
                }
                if (value.getOcc_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 31, (int) value.getOcc_fee());
                }
                if (value.getOr_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 30, (int) value.getOr_fee());
                }
                if (value.getTrailer() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 25, (int) value.getTrailer());
                }
                if (value.getTrade_type() != TradeType.TRADE_TYPE_UNSPECIFIED) {
                    TradeType.ADAPTER.encodeWithTag(writer, 24, (int) value.getTrade_type());
                }
                ExecutionCorrection.ADAPTER.asRepeated().encodeWithTag(writer, 29, (int) value.getCorrections());
                if (value.getTrade_break_agent() != TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED) {
                    TradeBreakAgent.ADAPTER.encodeWithTag(writer, 22, (int) value.getTrade_break_agent());
                }
                if (value.getRounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 21, (int) value.getRounded_notional());
                }
                if (value.getTaf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 20, (int) value.getTaf_fee());
                }
                if (value.getSec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 19, (int) value.getSec_fee());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 18, (int) value.getRoute());
                }
                if (value.getTrade_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 17, (int) value.getTrade_date());
                }
                if (value.getSettlement_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 16, (int) value.getSettlement_date());
                }
                if (value.getSettlement_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 15, (int) value.getSettlement_type());
                }
                if (value.getLiquidity_ind() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 14, (int) value.getLiquidity_ind());
                }
                if (value.getCommission_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 13, (int) value.getCommission_type());
                }
                if (value.getCommission_currency() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 12, (int) value.getCommission_currency());
                }
                if (value.getCommission() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 11, (int) value.getCommission());
                }
                if (value.getLeg_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 10, (int) value.getLeg_id());
                }
                if (!Intrinsics.areEqual(value.getBroker_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getBroker_id());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getVersion()));
                }
                if (!Intrinsics.areEqual(value.getExec_broker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getExec_broker());
                }
                if (value.getFill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getFill()));
                }
                if (value.getBroken_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getBroken_at());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrice());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderUpdateExecution decode(ProtoReader reader) throws IOException {
                TradeBreakAgent tradeBreakAgent;
                TradeType tradeType;
                Side side;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Route route = Route.ROUTE_UNSPECIFIED;
                TradeBreakAgent tradeBreakAgent2 = TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                TradeType tradeType2 = TradeType.TRADE_TYPE_UNSPECIFIED;
                Side side2 = Side.SIDE_UNSPECIFIED;
                LastLiquidityInd lastLiquidityInd = LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Route routeDecode = route;
                Decimal decimalDecode = null;
                Time timeDecode = null;
                Time timeDecode2 = null;
                NullableString nullableStringDecode = null;
                Decimal decimalDecode2 = null;
                UUID uuidDecode = null;
                NullableString nullableStringDecode2 = null;
                NullableString nullableStringDecode3 = null;
                NullableString nullableStringDecode4 = null;
                Time timeDecode3 = null;
                Time timeDecode4 = null;
                Decimal decimalDecode3 = null;
                Decimal decimalDecode4 = null;
                Decimal decimalDecode5 = null;
                NullableString nullableStringDecode5 = null;
                VenueExecutionDetails venueExecutionDetailsDecode = null;
                FractionalExecutionDetails fractionalExecutionDetailsDecode = null;
                IPOExecutionDetails iPOExecutionDetailsDecode = null;
                Decimal decimalDecode6 = null;
                Decimal decimalDecode7 = null;
                NullableString nullableStringDecode6 = null;
                Decimal decimalDecode8 = null;
                Decimal decimalDecode9 = null;
                NullableString nullableStringDecode7 = null;
                Decimal decimalDecode10 = null;
                NullableString nullableStringDecode8 = null;
                NullableString nullableStringDecode9 = null;
                Time timeDecode5 = null;
                NullableString nullableStringDecode10 = null;
                UUID uuidDecode2 = null;
                Decimal decimalDecode11 = null;
                ExecutionFees executionFeesDecode = null;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode = "";
                String strDecode2 = strDecode;
                LastLiquidityInd lastLiquidityIndDecode = lastLiquidityInd;
                UUID uuidDecode3 = null;
                Decimal decimalDecode12 = null;
                Side sideDecode = side2;
                TradeType tradeTypeDecode = tradeType2;
                TradeBreakAgent tradeBreakAgentDecode = tradeBreakAgent2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderUpdateExecution(uuidDecode3, decimalDecode12, decimalDecode, timeDecode, timeDecode2, zBooleanValue, strDecode, iIntValue, strDecode2, nullableStringDecode, decimalDecode2, uuidDecode, nullableStringDecode2, nullableStringDecode3, nullableStringDecode4, timeDecode3, timeDecode4, routeDecode, decimalDecode3, decimalDecode4, decimalDecode5, tradeBreakAgentDecode, arrayList, tradeTypeDecode, nullableStringDecode5, venueExecutionDetailsDecode, fractionalExecutionDetailsDecode, iPOExecutionDetailsDecode, decimalDecode6, decimalDecode7, nullableStringDecode6, decimalDecode8, decimalDecode9, sideDecode, nullableStringDecode7, decimalDecode10, nullableStringDecode8, nullableStringDecode9, timeDecode5, nullableStringDecode10, uuidDecode2, lastLiquidityIndDecode, decimalDecode11, executionFeesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            uuidDecode3 = UUID.ADAPTER.decode(reader);
                            break;
                        case 2:
                            decimalDecode12 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 3:
                            decimalDecode = Decimal.ADAPTER.decode(reader);
                            break;
                        case 4:
                            timeDecode = Time.ADAPTER.decode(reader);
                            break;
                        case 5:
                            timeDecode2 = Time.ADAPTER.decode(reader);
                            break;
                        case 6:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 7:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 9:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            nullableStringDecode = NullableString.ADAPTER.decode(reader);
                            break;
                        case 11:
                            decimalDecode2 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 12:
                            uuidDecode = UUID.ADAPTER.decode(reader);
                            break;
                        case 13:
                            nullableStringDecode2 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 14:
                            nullableStringDecode3 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 15:
                            nullableStringDecode4 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 16:
                            timeDecode3 = Time.ADAPTER.decode(reader);
                            break;
                        case 17:
                            timeDecode4 = Time.ADAPTER.decode(reader);
                            break;
                        case 18:
                            tradeBreakAgent = tradeBreakAgentDecode;
                            tradeType = tradeTypeDecode;
                            side = sideDecode;
                            try {
                                routeDecode = Route.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            tradeBreakAgentDecode = tradeBreakAgent;
                            tradeTypeDecode = tradeType;
                            sideDecode = side;
                            break;
                        case 19:
                            decimalDecode3 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 20:
                            decimalDecode4 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 21:
                            decimalDecode5 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 22:
                            tradeBreakAgent = tradeBreakAgentDecode;
                            tradeType = tradeTypeDecode;
                            side = sideDecode;
                            try {
                                tradeBreakAgentDecode = TradeBreakAgent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            tradeTypeDecode = tradeType;
                            sideDecode = side;
                            break;
                        case 23:
                        case 33:
                        default:
                            reader.readUnknownField(iNextTag);
                            tradeBreakAgent = tradeBreakAgentDecode;
                            tradeType = tradeTypeDecode;
                            side = sideDecode;
                            tradeBreakAgentDecode = tradeBreakAgent;
                            tradeTypeDecode = tradeType;
                            sideDecode = side;
                            break;
                        case 24:
                            tradeBreakAgent = tradeBreakAgentDecode;
                            tradeType = tradeTypeDecode;
                            side = sideDecode;
                            try {
                                tradeTypeDecode = TradeType.ADAPTER.decode(reader);
                                tradeBreakAgentDecode = tradeBreakAgent;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                            sideDecode = side;
                            break;
                        case 25:
                            nullableStringDecode5 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 26:
                            venueExecutionDetailsDecode = VenueExecutionDetails.ADAPTER.decode(reader);
                            break;
                        case 27:
                            fractionalExecutionDetailsDecode = FractionalExecutionDetails.ADAPTER.decode(reader);
                            break;
                        case 28:
                            iPOExecutionDetailsDecode = IPOExecutionDetails.ADAPTER.decode(reader);
                            break;
                        case 29:
                            tradeBreakAgent = tradeBreakAgentDecode;
                            tradeType = tradeTypeDecode;
                            side = sideDecode;
                            arrayList.add(ExecutionCorrection.ADAPTER.decode(reader));
                            tradeBreakAgentDecode = tradeBreakAgent;
                            tradeTypeDecode = tradeType;
                            sideDecode = side;
                            break;
                        case 30:
                            decimalDecode6 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 31:
                            decimalDecode7 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 32:
                            nullableStringDecode6 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 34:
                            decimalDecode8 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 35:
                            decimalDecode9 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 36:
                            tradeBreakAgent = tradeBreakAgentDecode;
                            tradeType = tradeTypeDecode;
                            side = sideDecode;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                                tradeBreakAgentDecode = tradeBreakAgent;
                                tradeTypeDecode = tradeType;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 37:
                            nullableStringDecode7 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 38:
                            decimalDecode10 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 39:
                            nullableStringDecode8 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 40:
                            nullableStringDecode9 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 41:
                            timeDecode5 = Time.ADAPTER.decode(reader);
                            break;
                        case 42:
                            nullableStringDecode10 = NullableString.ADAPTER.decode(reader);
                            break;
                        case 43:
                            uuidDecode2 = UUID.ADAPTER.decode(reader);
                            break;
                        case 44:
                            try {
                                lastLiquidityIndDecode = LastLiquidityInd.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                tradeBreakAgent = tradeBreakAgentDecode;
                                tradeType = tradeTypeDecode;
                                side = sideDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 45:
                            decimalDecode11 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 46:
                            executionFeesDecode = ExecutionFees.ADAPTER.decode(reader);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderUpdateExecution redact(OrderUpdateExecution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                Decimal price = value.getPrice();
                Decimal decimalRedact = price != null ? Decimal.ADAPTER.redact(price) : null;
                Decimal quantity = value.getQuantity();
                Decimal decimalRedact2 = quantity != null ? Decimal.ADAPTER.redact(quantity) : null;
                Time timestamp = value.getTimestamp();
                Time timeRedact = timestamp != null ? Time.ADAPTER.redact(timestamp) : null;
                Time broken_at = value.getBroken_at();
                Time timeRedact2 = broken_at != null ? Time.ADAPTER.redact(broken_at) : null;
                NullableString leg_id = value.getLeg_id();
                NullableString nullableStringRedact = leg_id != null ? NullableString.ADAPTER.redact(leg_id) : null;
                Decimal commission = value.getCommission();
                Decimal decimalRedact3 = commission != null ? Decimal.ADAPTER.redact(commission) : null;
                UUID commission_currency = value.getCommission_currency();
                UUID uuidRedact2 = commission_currency != null ? UUID.ADAPTER.redact(commission_currency) : null;
                NullableString commission_type = value.getCommission_type();
                NullableString nullableStringRedact2 = commission_type != null ? NullableString.ADAPTER.redact(commission_type) : null;
                NullableString liquidity_ind = value.getLiquidity_ind();
                NullableString nullableStringRedact3 = liquidity_ind != null ? NullableString.ADAPTER.redact(liquidity_ind) : null;
                NullableString settlement_type = value.getSettlement_type();
                NullableString nullableStringRedact4 = settlement_type != null ? NullableString.ADAPTER.redact(settlement_type) : null;
                Time settlement_date = value.getSettlement_date();
                Time timeRedact3 = settlement_date != null ? Time.ADAPTER.redact(settlement_date) : null;
                Time trade_date = value.getTrade_date();
                Time timeRedact4 = trade_date != null ? Time.ADAPTER.redact(trade_date) : null;
                Decimal sec_fee = value.getSec_fee();
                Decimal decimalRedact4 = sec_fee != null ? Decimal.ADAPTER.redact(sec_fee) : null;
                Decimal taf_fee = value.getTaf_fee();
                Decimal decimalRedact5 = taf_fee != null ? Decimal.ADAPTER.redact(taf_fee) : null;
                Decimal rounded_notional = value.getRounded_notional();
                Decimal decimalRedact6 = rounded_notional != null ? Decimal.ADAPTER.redact(rounded_notional) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getCorrections(), ExecutionCorrection.ADAPTER);
                NullableString trailer = value.getTrailer();
                NullableString nullableStringRedact5 = trailer != null ? NullableString.ADAPTER.redact(trailer) : null;
                VenueExecutionDetails venue_details = value.getVenue_details();
                VenueExecutionDetails venueExecutionDetailsRedact = venue_details != null ? VenueExecutionDetails.ADAPTER.redact(venue_details) : null;
                FractionalExecutionDetails fractional_details = value.getFractional_details();
                FractionalExecutionDetails fractionalExecutionDetailsRedact = fractional_details != null ? FractionalExecutionDetails.ADAPTER.redact(fractional_details) : null;
                IPOExecutionDetails ipo_details = value.getIpo_details();
                IPOExecutionDetails iPOExecutionDetailsRedact = ipo_details != null ? IPOExecutionDetails.ADAPTER.redact(ipo_details) : null;
                Decimal or_fee = value.getOr_fee();
                Decimal decimalRedact7 = or_fee != null ? Decimal.ADAPTER.redact(or_fee) : null;
                Decimal occ_fee = value.getOcc_fee();
                Decimal decimalRedact8 = occ_fee != null ? Decimal.ADAPTER.redact(occ_fee) : null;
                NullableString trade_match_id = value.getTrade_match_id();
                NullableString nullableStringRedact6 = trade_match_id != null ? NullableString.ADAPTER.redact(trade_match_id) : null;
                Decimal exchange_fee = value.getExchange_fee();
                Decimal decimalRedact9 = exchange_fee != null ? Decimal.ADAPTER.redact(exchange_fee) : null;
                Decimal base_currency_traded = value.getBase_currency_traded();
                Decimal decimalRedact10 = base_currency_traded != null ? Decimal.ADAPTER.redact(base_currency_traded) : null;
                NullableString position_id = value.getPosition_id();
                NullableString nullableStringRedact7 = position_id != null ? NullableString.ADAPTER.redact(position_id) : null;
                Decimal non_denominated_currency_traded = value.getNon_denominated_currency_traded();
                Decimal decimalRedact11 = non_denominated_currency_traded != null ? Decimal.ADAPTER.redact(non_denominated_currency_traded) : null;
                NullableString uti = value.getUti();
                NullableString nullableStringRedact8 = uti != null ? NullableString.ADAPTER.redact(uti) : null;
                NullableString rel_tx_id = value.getRel_tx_id();
                NullableString nullableStringRedact9 = rel_tx_id != null ? NullableString.ADAPTER.redact(rel_tx_id) : null;
                Time estimated_next_settlement_time = value.getEstimated_next_settlement_time();
                Time timeRedact5 = estimated_next_settlement_time != null ? Time.ADAPTER.redact(estimated_next_settlement_time) : null;
                NullableString contra_firm_account = value.getContra_firm_account();
                NullableString nullableStringRedact10 = contra_firm_account != null ? NullableString.ADAPTER.redact(contra_firm_account) : null;
                UUID associated_fx_execution_id = value.getAssociated_fx_execution_id();
                UUID uuidRedact3 = associated_fx_execution_id != null ? UUID.ADAPTER.redact(associated_fx_execution_id) : null;
                Decimal fx_fee_in_bps = value.getFx_fee_in_bps();
                Decimal decimalRedact12 = fx_fee_in_bps != null ? Decimal.ADAPTER.redact(fx_fee_in_bps) : null;
                ExecutionFees execution_fees = value.getExecution_fees();
                return value.copy((10617312 & 1) != 0 ? value.id : uuidRedact, (10617312 & 2) != 0 ? value.price : decimalRedact, (10617312 & 4) != 0 ? value.quantity : decimalRedact2, (10617312 & 8) != 0 ? value.timestamp : timeRedact, (10617312 & 16) != 0 ? value.broken_at : timeRedact2, (10617312 & 32) != 0 ? value.fill : false, (10617312 & 64) != 0 ? value.exec_broker : null, (10617312 & 128) != 0 ? value.version : 0, (10617312 & 256) != 0 ? value.broker_id : null, (10617312 & 512) != 0 ? value.leg_id : nullableStringRedact, (10617312 & 1024) != 0 ? value.commission : decimalRedact3, (10617312 & 2048) != 0 ? value.commission_currency : uuidRedact2, (10617312 & 4096) != 0 ? value.commission_type : nullableStringRedact2, (10617312 & 8192) != 0 ? value.liquidity_ind : nullableStringRedact3, (10617312 & 16384) != 0 ? value.settlement_type : nullableStringRedact4, (10617312 & 32768) != 0 ? value.settlement_date : timeRedact3, (10617312 & 65536) != 0 ? value.trade_date : timeRedact4, (10617312 & 131072) != 0 ? value.route : null, (10617312 & 262144) != 0 ? value.sec_fee : decimalRedact4, (10617312 & 524288) != 0 ? value.taf_fee : decimalRedact5, (10617312 & 1048576) != 0 ? value.rounded_notional : decimalRedact6, (10617312 & 2097152) != 0 ? value.trade_break_agent : null, (10617312 & 4194304) != 0 ? value.corrections : listM26823redactElements, (10617312 & 8388608) != 0 ? value.trade_type : null, (10617312 & 16777216) != 0 ? value.trailer : nullableStringRedact5, (10617312 & 33554432) != 0 ? value.venue_details : venueExecutionDetailsRedact, (10617312 & 67108864) != 0 ? value.fractional_details : fractionalExecutionDetailsRedact, (10617312 & 134217728) != 0 ? value.ipo_details : iPOExecutionDetailsRedact, (10617312 & 268435456) != 0 ? value.or_fee : decimalRedact7, (10617312 & 536870912) != 0 ? value.occ_fee : decimalRedact8, (10617312 & 1073741824) != 0 ? value.trade_match_id : nullableStringRedact6, (10617312 & Integer.MIN_VALUE) != 0 ? value.exchange_fee : decimalRedact9, (514 & 1) != 0 ? value.base_currency_traded : decimalRedact10, (514 & 2) != 0 ? value.side : null, (514 & 4) != 0 ? value.position_id : nullableStringRedact7, (514 & 8) != 0 ? value.non_denominated_currency_traded : decimalRedact11, (514 & 16) != 0 ? value.uti : nullableStringRedact8, (514 & 32) != 0 ? value.rel_tx_id : nullableStringRedact9, (514 & 64) != 0 ? value.estimated_next_settlement_time : timeRedact5, (514 & 128) != 0 ? value.contra_firm_account : nullableStringRedact10, (514 & 256) != 0 ? value.associated_fx_execution_id : uuidRedact3, (514 & 512) != 0 ? value.last_liquidity_ind : null, (514 & 1024) != 0 ? value.fx_fee_in_bps : decimalRedact12, (514 & 2048) != 0 ? value.execution_fees : execution_fees != null ? ExecutionFees.ADAPTER.redact(execution_fees) : null, (514 & 4096) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
