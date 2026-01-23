package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.ExecutionCorrectionDto;
import com.robinhood.rosetta.mainst.ExecutionFeesDto;
import com.robinhood.rosetta.mainst.FractionalExecutionDetailsDto;
import com.robinhood.rosetta.mainst.IPOExecutionDetailsDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
import com.robinhood.rosetta.mainst.OrderUpdateExecutionDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.robinhood.rosetta.mainst.VenueExecutionDetailsDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.ledger.trade.TradeType;
import rosetta.ledger.trade.TradeTypeDto;
import rosetta.mainst.LastLiquidityInd;
import rosetta.mainst.LastLiquidityIndDto;
import rosetta.mainst.Route;
import rosetta.mainst.RouteDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;
import rosetta.mainst.TradeBreakAgent;
import rosetta.mainst.TradeBreakAgentDto;

/* compiled from: OrderUpdateExecutionDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u0096\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bó\u0003\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u00102\u001a\u000203\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010;\u001a\u00020<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A¢\u0006\u0004\b\u0006\u0010BJñ\u0003\u0010\u0088\u0001\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010%\u001a\u00020&2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010;\u001a\u00020<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010AJ\t\u0010\u0089\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008a\u0001\u001a\u00020\u0013H\u0016J\u0016\u0010\u008b\u0001\u001a\u00020\u00112\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0096\u0002J\t\u0010\u008e\u0001\u001a\u00020\u0015H\u0016J\u001d\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0015H\u0016J\t\u0010\u0094\u0001\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bJ\u0010IR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bT\u0010FR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bV\u0010SR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bW\u0010SR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bX\u0010SR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bY\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010IR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010\"\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b]\u0010FR\u0013\u0010#\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b^\u0010FR\u0013\u0010$\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b_\u0010FR\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010,\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bf\u0010SR\u0013\u0010-\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bg\u0010FR\u0013\u0010.\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bh\u0010FR\u0013\u0010/\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bi\u0010SR\u0013\u00100\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bj\u0010FR\u0013\u00101\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bk\u0010FR\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u00104\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bn\u0010SR\u0013\u00105\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bo\u0010FR\u0013\u00106\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bp\u0010SR\u0013\u00107\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bq\u0010SR\u0013\u00108\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\br\u0010IR\u0013\u00109\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bs\u0010SR\u0013\u0010:\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bt\u0010DR\u0011\u0010;\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u0010=\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\bw\u0010FR\u0013\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0013\u0010@\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0013\u0010|\u001a\u0004\u0018\u00010}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00018F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u009a\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecution;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "quantity", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "broken_at", "fill", "", "exec_broker", "", "version", "", "broker_id", "leg_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "commission", "commission_currency", "commission_type", "liquidity_ind", "settlement_type", "settlement_date", "trade_date", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "sec_fee", "taf_fee", "rounded_notional", "trade_break_agent", "Lrosetta/mainst/TradeBreakAgentDto;", "corrections", "", "Lcom/robinhood/rosetta/mainst/ExecutionCorrectionDto;", "trade_type", "Lrosetta/ledger/trade/TradeTypeDto;", "trailer", "or_fee", "occ_fee", "trade_match_id", "exchange_fee", "base_currency_traded", "side", "Lrosetta/mainst/SideDto;", "position_id", "non_denominated_currency_traded", "uti", "rel_tx_id", "estimated_next_settlement_time", "contra_firm_account", "associated_fx_execution_id", "last_liquidity_ind", "Lrosetta/mainst/LastLiquidityIndDto;", "fx_fee_in_bps", "execution_fees", "Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "ExtraDetails", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;ZLjava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradeBreakAgentDto;Ljava/util/List;Lrosetta/ledger/trade/TradeTypeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/LastLiquidityIndDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getQuantity", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getBroken_at", "getFill", "()Z", "getExec_broker", "()Ljava/lang/String;", "getVersion", "()I", "getBroker_id", "getLeg_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getCommission", "getCommission_currency", "getCommission_type", "getLiquidity_ind", "getSettlement_type", "getSettlement_date", "getTrade_date", "getRoute", "()Lrosetta/mainst/RouteDto;", "getSec_fee", "getTaf_fee", "getRounded_notional", "getTrade_break_agent", "()Lrosetta/mainst/TradeBreakAgentDto;", "getCorrections", "()Ljava/util/List;", "getTrade_type", "()Lrosetta/ledger/trade/TradeTypeDto;", "getTrailer", "getOr_fee", "getOcc_fee", "getTrade_match_id", "getExchange_fee", "getBase_currency_traded", "getSide", "()Lrosetta/mainst/SideDto;", "getPosition_id", "getNon_denominated_currency_traded", "getUti", "getRel_tx_id", "getEstimated_next_settlement_time", "getContra_firm_account", "getAssociated_fx_execution_id", "getLast_liquidity_ind", "()Lrosetta/mainst/LastLiquidityIndDto;", "getFx_fee_in_bps", "getExecution_fees", "()Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "getExtraDetails", "()Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;", "venue_details", "Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;", "getVenue_details", "()Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;", "fractional_details", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "getFractional_details", "()Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "ipo_details", "Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;", "getIpo_details", "()Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ExtraDetailsDto", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class OrderUpdateExecutionDto implements Dto3<OrderUpdateExecution>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderUpdateExecutionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderUpdateExecutionDto, OrderUpdateExecution>> binaryBase64Serializer$delegate;
    private static final OrderUpdateExecutionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderUpdateExecutionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderUpdateExecutionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final TimeDto getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final TimeDto getBroken_at() {
        return this.surrogate.getBroken_at();
    }

    public final boolean getFill() {
        return this.surrogate.getFill();
    }

    public final String getExec_broker() {
        return this.surrogate.getExec_broker();
    }

    public final int getVersion() {
        return this.surrogate.getVersion();
    }

    public final String getBroker_id() {
        return this.surrogate.getBroker_id();
    }

    public final NullableStringDto getLeg_id() {
        return this.surrogate.getLeg_id();
    }

    public final DecimalDto getCommission() {
        return this.surrogate.getCommission();
    }

    public final UUIDDto getCommission_currency() {
        return this.surrogate.getCommission_currency();
    }

    public final NullableStringDto getCommission_type() {
        return this.surrogate.getCommission_type();
    }

    public final NullableStringDto getLiquidity_ind() {
        return this.surrogate.getLiquidity_ind();
    }

    public final NullableStringDto getSettlement_type() {
        return this.surrogate.getSettlement_type();
    }

    public final TimeDto getSettlement_date() {
        return this.surrogate.getSettlement_date();
    }

    public final TimeDto getTrade_date() {
        return this.surrogate.getTrade_date();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final DecimalDto getSec_fee() {
        return this.surrogate.getSec_fee();
    }

    public final DecimalDto getTaf_fee() {
        return this.surrogate.getTaf_fee();
    }

    public final DecimalDto getRounded_notional() {
        return this.surrogate.getRounded_notional();
    }

    public final TradeBreakAgentDto getTrade_break_agent() {
        return this.surrogate.getTrade_break_agent();
    }

    public final List<ExecutionCorrectionDto> getCorrections() {
        return this.surrogate.getCorrections();
    }

    public final TradeTypeDto getTrade_type() {
        return this.surrogate.getTrade_type();
    }

    public final NullableStringDto getTrailer() {
        return this.surrogate.getTrailer();
    }

    public final DecimalDto getOr_fee() {
        return this.surrogate.getOr_fee();
    }

    public final DecimalDto getOcc_fee() {
        return this.surrogate.getOcc_fee();
    }

    public final NullableStringDto getTrade_match_id() {
        return this.surrogate.getTrade_match_id();
    }

    public final DecimalDto getExchange_fee() {
        return this.surrogate.getExchange_fee();
    }

    public final DecimalDto getBase_currency_traded() {
        return this.surrogate.getBase_currency_traded();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final NullableStringDto getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final DecimalDto getNon_denominated_currency_traded() {
        return this.surrogate.getNon_denominated_currency_traded();
    }

    public final NullableStringDto getUti() {
        return this.surrogate.getUti();
    }

    public final NullableStringDto getRel_tx_id() {
        return this.surrogate.getRel_tx_id();
    }

    public final TimeDto getEstimated_next_settlement_time() {
        return this.surrogate.getEstimated_next_settlement_time();
    }

    public final NullableStringDto getContra_firm_account() {
        return this.surrogate.getContra_firm_account();
    }

    public final UUIDDto getAssociated_fx_execution_id() {
        return this.surrogate.getAssociated_fx_execution_id();
    }

    public final LastLiquidityIndDto getLast_liquidity_ind() {
        return this.surrogate.getLast_liquidity_ind();
    }

    public final DecimalDto getFx_fee_in_bps() {
        return this.surrogate.getFx_fee_in_bps();
    }

    public final ExecutionFeesDto getExecution_fees() {
        return this.surrogate.getExecution_fees();
    }

    public final ExtraDetailsDto getExtraDetails() {
        if (this.surrogate.getVenue_details() != null) {
            return new ExtraDetailsDto.VenueDetails(this.surrogate.getVenue_details());
        }
        if (this.surrogate.getFractional_details() != null) {
            return new ExtraDetailsDto.FractionalDetails(this.surrogate.getFractional_details());
        }
        if (this.surrogate.getIpo_details() != null) {
            return new ExtraDetailsDto.IpoDetails(this.surrogate.getIpo_details());
        }
        return null;
    }

    public final VenueExecutionDetailsDto getVenue_details() {
        return this.surrogate.getVenue_details();
    }

    public final FractionalExecutionDetailsDto getFractional_details() {
        return this.surrogate.getFractional_details();
    }

    public final IPOExecutionDetailsDto getIpo_details() {
        return this.surrogate.getIpo_details();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderUpdateExecutionDto(UUIDDto uUIDDto, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, TimeDto timeDto2, boolean z, String str, int i, String str2, NullableStringDto nullableStringDto, DecimalDto decimalDto3, UUIDDto uUIDDto2, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, RouteDto routeDto, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, TradeBreakAgentDto tradeBreakAgentDto, List list, TradeTypeDto tradeTypeDto, NullableStringDto nullableStringDto5, DecimalDto decimalDto7, DecimalDto decimalDto8, NullableStringDto nullableStringDto6, DecimalDto decimalDto9, DecimalDto decimalDto10, SideDto sideDto, NullableStringDto nullableStringDto7, DecimalDto decimalDto11, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, TimeDto timeDto5, NullableStringDto nullableStringDto10, UUIDDto uUIDDto3, LastLiquidityIndDto lastLiquidityIndDto, DecimalDto decimalDto12, ExecutionFeesDto executionFeesDto, ExtraDetailsDto extraDetailsDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        UUIDDto uUIDDto4 = (i2 & 1) != 0 ? null : uUIDDto;
        this(uUIDDto4, (i2 & 2) != 0 ? null : decimalDto, (i2 & 4) != 0 ? null : decimalDto2, (i2 & 8) != 0 ? null : timeDto, (i2 & 16) != 0 ? null : timeDto2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str, (i2 & 128) == 0 ? i : 0, (i2 & 256) == 0 ? str2 : "", (i2 & 512) != 0 ? null : nullableStringDto, (i2 & 1024) != 0 ? null : decimalDto3, (i2 & 2048) != 0 ? null : uUIDDto2, (i2 & 4096) != 0 ? null : nullableStringDto2, (i2 & 8192) != 0 ? null : nullableStringDto3, (i2 & 16384) != 0 ? null : nullableStringDto4, (i2 & 32768) != 0 ? null : timeDto3, (i2 & 65536) != 0 ? null : timeDto4, (i2 & 131072) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 262144) != 0 ? null : decimalDto4, (i2 & 524288) != 0 ? null : decimalDto5, (i2 & 1048576) != 0 ? null : decimalDto6, (i2 & 2097152) != 0 ? TradeBreakAgentDto.INSTANCE.getZeroValue() : tradeBreakAgentDto, (i2 & 4194304) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8388608) != 0 ? TradeTypeDto.INSTANCE.getZeroValue() : tradeTypeDto, (i2 & 16777216) != 0 ? null : nullableStringDto5, (i2 & 33554432) != 0 ? null : decimalDto7, (i2 & 67108864) != 0 ? null : decimalDto8, (i2 & 134217728) != 0 ? null : nullableStringDto6, (i2 & 268435456) != 0 ? null : decimalDto9, (i2 & 536870912) != 0 ? null : decimalDto10, (i2 & 1073741824) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & Integer.MIN_VALUE) != 0 ? null : nullableStringDto7, (i3 & 1) != 0 ? null : decimalDto11, (i3 & 2) != 0 ? null : nullableStringDto8, (i3 & 4) != 0 ? null : nullableStringDto9, (i3 & 8) != 0 ? null : timeDto5, (i3 & 16) != 0 ? null : nullableStringDto10, (i3 & 32) != 0 ? null : uUIDDto3, (i3 & 64) != 0 ? LastLiquidityIndDto.INSTANCE.getZeroValue() : lastLiquidityIndDto, (i3 & 128) != 0 ? null : decimalDto12, (i3 & 256) != 0 ? null : executionFeesDto, (i3 & 512) != 0 ? null : extraDetailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderUpdateExecutionDto(UUIDDto uUIDDto, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, TimeDto timeDto2, boolean z, String exec_broker, int i, String broker_id, NullableStringDto nullableStringDto, DecimalDto decimalDto3, UUIDDto uUIDDto2, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, RouteDto route, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, TradeBreakAgentDto trade_break_agent, List<ExecutionCorrectionDto> corrections, TradeTypeDto trade_type, NullableStringDto nullableStringDto5, DecimalDto decimalDto7, DecimalDto decimalDto8, NullableStringDto nullableStringDto6, DecimalDto decimalDto9, DecimalDto decimalDto10, SideDto side, NullableStringDto nullableStringDto7, DecimalDto decimalDto11, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, TimeDto timeDto5, NullableStringDto nullableStringDto10, UUIDDto uUIDDto3, LastLiquidityIndDto last_liquidity_ind, DecimalDto decimalDto12, ExecutionFeesDto executionFeesDto, ExtraDetailsDto extraDetailsDto) {
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(broker_id, "broker_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(corrections, "corrections");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
        ExtraDetailsDto.VenueDetails venueDetails = extraDetailsDto instanceof ExtraDetailsDto.VenueDetails ? (ExtraDetailsDto.VenueDetails) extraDetailsDto : null;
        VenueExecutionDetailsDto value = venueDetails != null ? venueDetails.getValue() : null;
        ExtraDetailsDto.FractionalDetails fractionalDetails = extraDetailsDto instanceof ExtraDetailsDto.FractionalDetails ? (ExtraDetailsDto.FractionalDetails) extraDetailsDto : null;
        FractionalExecutionDetailsDto value2 = fractionalDetails != null ? fractionalDetails.getValue() : null;
        ExtraDetailsDto.IpoDetails ipoDetails = extraDetailsDto instanceof ExtraDetailsDto.IpoDetails ? (ExtraDetailsDto.IpoDetails) extraDetailsDto : null;
        this(new Surrogate(uUIDDto, decimalDto, decimalDto2, timeDto, timeDto2, z, exec_broker, i, broker_id, nullableStringDto, decimalDto3, uUIDDto2, nullableStringDto2, nullableStringDto3, nullableStringDto4, timeDto3, timeDto4, route, decimalDto4, decimalDto5, decimalDto6, trade_break_agent, corrections, trade_type, nullableStringDto5, decimalDto7, decimalDto8, nullableStringDto6, decimalDto9, decimalDto10, side, nullableStringDto7, decimalDto11, nullableStringDto8, nullableStringDto9, timeDto5, nullableStringDto10, uUIDDto3, last_liquidity_ind, decimalDto12, executionFeesDto, value, value2, ipoDetails != null ? ipoDetails.getValue() : null));
    }

    public final OrderUpdateExecutionDto copy(UUIDDto id, DecimalDto price, DecimalDto quantity, TimeDto timestamp, TimeDto broken_at, boolean fill, String exec_broker, int version, String broker_id, NullableStringDto leg_id, DecimalDto commission, UUIDDto commission_currency, NullableStringDto commission_type, NullableStringDto liquidity_ind, NullableStringDto settlement_type, TimeDto settlement_date, TimeDto trade_date, RouteDto route, DecimalDto sec_fee, DecimalDto taf_fee, DecimalDto rounded_notional, TradeBreakAgentDto trade_break_agent, List<ExecutionCorrectionDto> corrections, TradeTypeDto trade_type, NullableStringDto trailer, DecimalDto or_fee, DecimalDto occ_fee, NullableStringDto trade_match_id, DecimalDto exchange_fee, DecimalDto base_currency_traded, SideDto side, NullableStringDto position_id, DecimalDto non_denominated_currency_traded, NullableStringDto uti, NullableStringDto rel_tx_id, TimeDto estimated_next_settlement_time, NullableStringDto contra_firm_account, UUIDDto associated_fx_execution_id, LastLiquidityIndDto last_liquidity_ind, DecimalDto fx_fee_in_bps, ExecutionFeesDto execution_fees, ExtraDetailsDto ExtraDetails) {
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(broker_id, "broker_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(corrections, "corrections");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
        ExtraDetailsDto.VenueDetails venueDetails = ExtraDetails instanceof ExtraDetailsDto.VenueDetails ? (ExtraDetailsDto.VenueDetails) ExtraDetails : null;
        VenueExecutionDetailsDto value = venueDetails != null ? venueDetails.getValue() : null;
        ExtraDetailsDto.FractionalDetails fractionalDetails = ExtraDetails instanceof ExtraDetailsDto.FractionalDetails ? (ExtraDetailsDto.FractionalDetails) ExtraDetails : null;
        FractionalExecutionDetailsDto value2 = fractionalDetails != null ? fractionalDetails.getValue() : null;
        ExtraDetailsDto.IpoDetails ipoDetails = ExtraDetails instanceof ExtraDetailsDto.IpoDetails ? (ExtraDetailsDto.IpoDetails) ExtraDetails : null;
        return new OrderUpdateExecutionDto(new Surrogate(id, price, quantity, timestamp, broken_at, fill, exec_broker, version, broker_id, leg_id, commission, commission_currency, commission_type, liquidity_ind, settlement_type, settlement_date, trade_date, route, sec_fee, taf_fee, rounded_notional, trade_break_agent, corrections, trade_type, trailer, or_fee, occ_fee, trade_match_id, exchange_fee, base_currency_traded, side, position_id, non_denominated_currency_traded, uti, rel_tx_id, estimated_next_settlement_time, contra_firm_account, associated_fx_execution_id, last_liquidity_ind, fx_fee_in_bps, execution_fees, value, value2, ipoDetails != null ? ipoDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderUpdateExecution toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto2 = price != null ? price.toProto() : null;
        DecimalDto quantity = this.surrogate.getQuantity();
        Decimal proto3 = quantity != null ? quantity.toProto() : null;
        TimeDto timestamp = this.surrogate.getTimestamp();
        Time proto4 = timestamp != null ? timestamp.toProto() : null;
        TimeDto broken_at = this.surrogate.getBroken_at();
        Time proto5 = broken_at != null ? broken_at.toProto() : null;
        boolean fill = this.surrogate.getFill();
        String exec_broker = this.surrogate.getExec_broker();
        int version = this.surrogate.getVersion();
        String broker_id = this.surrogate.getBroker_id();
        NullableStringDto leg_id = this.surrogate.getLeg_id();
        NullableString proto6 = leg_id != null ? leg_id.toProto() : null;
        DecimalDto commission = this.surrogate.getCommission();
        Decimal proto7 = commission != null ? commission.toProto() : null;
        UUIDDto commission_currency = this.surrogate.getCommission_currency();
        UUID proto8 = commission_currency != null ? commission_currency.toProto() : null;
        NullableStringDto commission_type = this.surrogate.getCommission_type();
        NullableString proto9 = commission_type != null ? commission_type.toProto() : null;
        NullableStringDto liquidity_ind = this.surrogate.getLiquidity_ind();
        NullableString proto10 = liquidity_ind != null ? liquidity_ind.toProto() : null;
        NullableStringDto settlement_type = this.surrogate.getSettlement_type();
        NullableString proto11 = settlement_type != null ? settlement_type.toProto() : null;
        TimeDto settlement_date = this.surrogate.getSettlement_date();
        Time proto12 = settlement_date != null ? settlement_date.toProto() : null;
        TimeDto trade_date = this.surrogate.getTrade_date();
        Time proto13 = trade_date != null ? trade_date.toProto() : null;
        Route route = (Route) this.surrogate.getRoute().toProto();
        DecimalDto sec_fee = this.surrogate.getSec_fee();
        Decimal proto14 = sec_fee != null ? sec_fee.toProto() : null;
        DecimalDto taf_fee = this.surrogate.getTaf_fee();
        Decimal proto15 = taf_fee != null ? taf_fee.toProto() : null;
        DecimalDto rounded_notional = this.surrogate.getRounded_notional();
        Decimal proto16 = rounded_notional != null ? rounded_notional.toProto() : null;
        TradeBreakAgent tradeBreakAgent = (TradeBreakAgent) this.surrogate.getTrade_break_agent().toProto();
        List<ExecutionCorrectionDto> corrections = this.surrogate.getCorrections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(corrections, 10));
        Iterator<T> it = corrections.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExecutionCorrectionDto) it.next()).toProto());
        }
        TradeType tradeType = (TradeType) this.surrogate.getTrade_type().toProto();
        NullableStringDto trailer = this.surrogate.getTrailer();
        NullableString proto17 = trailer != null ? trailer.toProto() : null;
        DecimalDto or_fee = this.surrogate.getOr_fee();
        Decimal proto18 = or_fee != null ? or_fee.toProto() : null;
        DecimalDto occ_fee = this.surrogate.getOcc_fee();
        Decimal proto19 = occ_fee != null ? occ_fee.toProto() : null;
        NullableStringDto trade_match_id = this.surrogate.getTrade_match_id();
        NullableString proto20 = trade_match_id != null ? trade_match_id.toProto() : null;
        DecimalDto exchange_fee = this.surrogate.getExchange_fee();
        Decimal proto21 = exchange_fee != null ? exchange_fee.toProto() : null;
        DecimalDto base_currency_traded = this.surrogate.getBase_currency_traded();
        Decimal proto22 = base_currency_traded != null ? base_currency_traded.toProto() : null;
        Side side = (Side) this.surrogate.getSide().toProto();
        NullableStringDto position_id = this.surrogate.getPosition_id();
        NullableString proto23 = position_id != null ? position_id.toProto() : null;
        DecimalDto non_denominated_currency_traded = this.surrogate.getNon_denominated_currency_traded();
        Decimal proto24 = non_denominated_currency_traded != null ? non_denominated_currency_traded.toProto() : null;
        NullableStringDto uti = this.surrogate.getUti();
        NullableString proto25 = uti != null ? uti.toProto() : null;
        NullableStringDto rel_tx_id = this.surrogate.getRel_tx_id();
        NullableString proto26 = rel_tx_id != null ? rel_tx_id.toProto() : null;
        TimeDto estimated_next_settlement_time = this.surrogate.getEstimated_next_settlement_time();
        Time proto27 = estimated_next_settlement_time != null ? estimated_next_settlement_time.toProto() : null;
        NullableStringDto contra_firm_account = this.surrogate.getContra_firm_account();
        NullableString proto28 = contra_firm_account != null ? contra_firm_account.toProto() : null;
        UUIDDto associated_fx_execution_id = this.surrogate.getAssociated_fx_execution_id();
        UUID proto29 = associated_fx_execution_id != null ? associated_fx_execution_id.toProto() : null;
        LastLiquidityInd lastLiquidityInd = (LastLiquidityInd) this.surrogate.getLast_liquidity_ind().toProto();
        DecimalDto fx_fee_in_bps = this.surrogate.getFx_fee_in_bps();
        Decimal proto30 = fx_fee_in_bps != null ? fx_fee_in_bps.toProto() : null;
        ExecutionFeesDto execution_fees = this.surrogate.getExecution_fees();
        ExecutionFees proto31 = execution_fees != null ? execution_fees.toProto() : null;
        VenueExecutionDetailsDto venue_details = this.surrogate.getVenue_details();
        VenueExecutionDetails proto32 = venue_details != null ? venue_details.toProto() : null;
        FractionalExecutionDetailsDto fractional_details = this.surrogate.getFractional_details();
        FractionalExecutionDetails proto33 = fractional_details != null ? fractional_details.toProto() : null;
        IPOExecutionDetailsDto ipo_details = this.surrogate.getIpo_details();
        return new OrderUpdateExecution(proto, proto2, proto3, proto4, proto5, fill, exec_broker, version, broker_id, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, route, proto14, proto15, proto16, tradeBreakAgent, arrayList, tradeType, proto17, proto32, proto33, ipo_details != null ? ipo_details.toProto() : null, proto18, proto19, proto20, proto21, proto22, side, proto23, proto24, proto25, proto26, proto27, proto28, proto29, lastLiquidityInd, proto30, proto31, null, 0, 4096, null);
    }

    public String toString() {
        return "[OrderUpdateExecutionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderUpdateExecutionDto) && Intrinsics.areEqual(((OrderUpdateExecutionDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderUpdateExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b\u009d\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 î\u00012\u00020\u0001:\u0004í\u0001î\u0001B\u0098\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00108\u001a\u000209\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B¢\u0006\u0004\bC\u0010DBÝ\u0003\b\u0010\u0012\u0006\u0010E\u001a\u00020\u000f\u0012\u0006\u0010F\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u00010\u0015\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\u0015\u0012\b\u00104\u001a\u0004\u0018\u00010\u0015\u0012\b\u00105\u001a\u0004\u0018\u00010\b\u0012\b\u00106\u001a\u0004\u0018\u00010\u0015\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010>\u0012\b\u0010?\u001a\u0004\u0018\u00010@\u0012\b\u0010A\u001a\u0004\u0018\u00010B\u0012\b\u0010G\u001a\u0004\u0018\u00010H¢\u0006\u0004\bC\u0010IJ\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010º\u0001\u001a\u00020\rHÆ\u0003J\u0019\u0010»\u0001\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\rHÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u001eHÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010É\u0001\u001a\u00020#HÆ\u0003J\u0010\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00020&0%HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020(HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010Ò\u0001\u001a\u000200HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ú\u0001\u001a\u000209HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010>HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010@HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010BHÆ\u0003J\u009b\u0004\u0010à\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0002\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010BHÆ\u0001J\u0015\u0010á\u0001\u001a\u00020\u000b2\t\u0010â\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ã\u0001\u001a\u00020\u000fHÖ\u0001J\n\u0010ä\u0001\u001a\u00020\rHÖ\u0001J-\u0010å\u0001\u001a\u00030æ\u00012\u0007\u0010ç\u0001\u001a\u00020\u00002\b\u0010è\u0001\u001a\u00030é\u00012\b\u0010ê\u0001\u001a\u00030ë\u0001H\u0001¢\u0006\u0003\bì\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010K\u001a\u0004\bO\u0010PR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010K\u001a\u0004\bR\u0010PR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010K\u001a\u0004\bT\u0010UR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010K\u001a\u0004\bW\u0010UR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010K\u001a\u0004\bY\u0010ZR\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010K\u001a\u0004\b\\\u0010]R+\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010K\u001a\u0004\b_\u0010`R\u001c\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\ba\u0010K\u001a\u0004\bb\u0010]R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u0010K\u001a\u0004\bd\u0010eR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010K\u001a\u0004\bg\u0010PR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u0010K\u001a\u0004\bi\u0010MR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bj\u0010K\u001a\u0004\bk\u0010eR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bl\u0010K\u001a\u0004\bm\u0010eR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u0010K\u001a\u0004\bo\u0010eR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u0010K\u001a\u0004\bq\u0010UR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010K\u001a\u0004\bs\u0010UR\u001c\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bt\u0010K\u001a\u0004\bu\u0010vR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010K\u001a\u0004\bx\u0010PR\u001e\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010K\u001a\u0004\bz\u0010PR\u001e\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010K\u001a\u0004\b|\u0010PR\u001c\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010K\u001a\u0004\b~\u0010\u007fR%\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0080\u0001\u0010K\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010'\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0083\u0001\u0010K\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010)\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0086\u0001\u0010K\u001a\u0005\b\u0087\u0001\u0010eR \u0010*\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0088\u0001\u0010K\u001a\u0005\b\u0089\u0001\u0010PR \u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008a\u0001\u0010K\u001a\u0005\b\u008b\u0001\u0010PR \u0010,\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008c\u0001\u0010K\u001a\u0005\b\u008d\u0001\u0010eR \u0010-\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008e\u0001\u0010K\u001a\u0005\b\u008f\u0001\u0010PR \u0010.\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0090\u0001\u0010K\u001a\u0005\b\u0091\u0001\u0010PR\u001f\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0092\u0001\u0010K\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u00101\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0095\u0001\u0010K\u001a\u0005\b\u0096\u0001\u0010eR \u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0097\u0001\u0010K\u001a\u0005\b\u0098\u0001\u0010PR \u00103\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0099\u0001\u0010K\u001a\u0005\b\u009a\u0001\u0010eR \u00104\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009b\u0001\u0010K\u001a\u0005\b\u009c\u0001\u0010eR \u00105\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009d\u0001\u0010K\u001a\u0005\b\u009e\u0001\u0010UR \u00106\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u009f\u0001\u0010K\u001a\u0005\b \u0001\u0010eR \u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¡\u0001\u0010K\u001a\u0005\b¢\u0001\u0010MR\u001f\u00108\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b£\u0001\u0010K\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010:\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¦\u0001\u0010K\u001a\u0005\b§\u0001\u0010PR!\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¨\u0001\u0010K\u001a\u0006\b©\u0001\u0010ª\u0001R!\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b«\u0001\u0010K\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b®\u0001\u0010K\u001a\u0006\b¯\u0001\u0010°\u0001R!\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b±\u0001\u0010K\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006ï\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "quantity", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "broken_at", "fill", "", "exec_broker", "", "version", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "broker_id", "leg_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "commission", "commission_currency", "commission_type", "liquidity_ind", "settlement_type", "settlement_date", "trade_date", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "sec_fee", "taf_fee", "rounded_notional", "trade_break_agent", "Lrosetta/mainst/TradeBreakAgentDto;", "corrections", "", "Lcom/robinhood/rosetta/mainst/ExecutionCorrectionDto;", "trade_type", "Lrosetta/ledger/trade/TradeTypeDto;", "trailer", "or_fee", "occ_fee", "trade_match_id", "exchange_fee", "base_currency_traded", "side", "Lrosetta/mainst/SideDto;", "position_id", "non_denominated_currency_traded", "uti", "rel_tx_id", "estimated_next_settlement_time", "contra_firm_account", "associated_fx_execution_id", "last_liquidity_ind", "Lrosetta/mainst/LastLiquidityIndDto;", "fx_fee_in_bps", "execution_fees", "Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "venue_details", "Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;", "fractional_details", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "ipo_details", "Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;ZLjava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradeBreakAgentDto;Ljava/util/List;Lrosetta/ledger/trade/TradeTypeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/LastLiquidityIndDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;ZLjava/lang/String;ILjava/lang/String;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/TradeBreakAgentDto;Ljava/util/List;Lrosetta/ledger/trade/TradeTypeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/LastLiquidityIndDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getPrice$annotations", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getQuantity$annotations", "getQuantity", "getTimestamp$annotations", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getBroken_at$annotations", "getBroken_at", "getFill$annotations", "getFill", "()Z", "getExec_broker$annotations", "getExec_broker", "()Ljava/lang/String;", "getVersion$annotations", "getVersion", "()I", "getBroker_id$annotations", "getBroker_id", "getLeg_id$annotations", "getLeg_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getCommission$annotations", "getCommission", "getCommission_currency$annotations", "getCommission_currency", "getCommission_type$annotations", "getCommission_type", "getLiquidity_ind$annotations", "getLiquidity_ind", "getSettlement_type$annotations", "getSettlement_type", "getSettlement_date$annotations", "getSettlement_date", "getTrade_date$annotations", "getTrade_date", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getSec_fee$annotations", "getSec_fee", "getTaf_fee$annotations", "getTaf_fee", "getRounded_notional$annotations", "getRounded_notional", "getTrade_break_agent$annotations", "getTrade_break_agent", "()Lrosetta/mainst/TradeBreakAgentDto;", "getCorrections$annotations", "getCorrections", "()Ljava/util/List;", "getTrade_type$annotations", "getTrade_type", "()Lrosetta/ledger/trade/TradeTypeDto;", "getTrailer$annotations", "getTrailer", "getOr_fee$annotations", "getOr_fee", "getOcc_fee$annotations", "getOcc_fee", "getTrade_match_id$annotations", "getTrade_match_id", "getExchange_fee$annotations", "getExchange_fee", "getBase_currency_traded$annotations", "getBase_currency_traded", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getPosition_id$annotations", "getPosition_id", "getNon_denominated_currency_traded$annotations", "getNon_denominated_currency_traded", "getUti$annotations", "getUti", "getRel_tx_id$annotations", "getRel_tx_id", "getEstimated_next_settlement_time$annotations", "getEstimated_next_settlement_time", "getContra_firm_account$annotations", "getContra_firm_account", "getAssociated_fx_execution_id$annotations", "getAssociated_fx_execution_id", "getLast_liquidity_ind$annotations", "getLast_liquidity_ind", "()Lrosetta/mainst/LastLiquidityIndDto;", "getFx_fee_in_bps$annotations", "getFx_fee_in_bps", "getExecution_fees$annotations", "getExecution_fees", "()Lcom/robinhood/rosetta/mainst/ExecutionFeesDto;", "getVenue_details$annotations", "getVenue_details", "()Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;", "getFractional_details$annotations", "getFractional_details", "()Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "getIpo_details$annotations", "getIpo_details", "()Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final UUIDDto associated_fx_execution_id;
        private final DecimalDto base_currency_traded;
        private final TimeDto broken_at;
        private final String broker_id;
        private final DecimalDto commission;
        private final UUIDDto commission_currency;
        private final NullableStringDto commission_type;
        private final NullableStringDto contra_firm_account;
        private final List<ExecutionCorrectionDto> corrections;
        private final TimeDto estimated_next_settlement_time;
        private final DecimalDto exchange_fee;
        private final String exec_broker;
        private final ExecutionFeesDto execution_fees;
        private final boolean fill;
        private final FractionalExecutionDetailsDto fractional_details;
        private final DecimalDto fx_fee_in_bps;
        private final UUIDDto id;
        private final IPOExecutionDetailsDto ipo_details;
        private final LastLiquidityIndDto last_liquidity_ind;
        private final NullableStringDto leg_id;
        private final NullableStringDto liquidity_ind;
        private final DecimalDto non_denominated_currency_traded;
        private final DecimalDto occ_fee;
        private final DecimalDto or_fee;
        private final NullableStringDto position_id;
        private final DecimalDto price;
        private final DecimalDto quantity;
        private final NullableStringDto rel_tx_id;
        private final DecimalDto rounded_notional;
        private final RouteDto route;
        private final DecimalDto sec_fee;
        private final TimeDto settlement_date;
        private final NullableStringDto settlement_type;
        private final SideDto side;
        private final DecimalDto taf_fee;
        private final TimeDto timestamp;
        private final TradeBreakAgentDto trade_break_agent;
        private final TimeDto trade_date;
        private final NullableStringDto trade_match_id;
        private final TradeTypeDto trade_type;
        private final NullableStringDto trailer;
        private final NullableStringDto uti;
        private final VenueExecutionDetailsDto venue_details;
        private final int version;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderUpdateExecutionDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderUpdateExecutionDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((UUIDDto) null, (DecimalDto) null, (DecimalDto) null, (TimeDto) null, (TimeDto) null, false, (String) null, 0, (String) null, (NullableStringDto) null, (DecimalDto) null, (UUIDDto) null, (NullableStringDto) null, (NullableStringDto) null, (NullableStringDto) null, (TimeDto) null, (TimeDto) null, (RouteDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (TradeBreakAgentDto) null, (List) null, (TradeTypeDto) null, (NullableStringDto) null, (DecimalDto) null, (DecimalDto) null, (NullableStringDto) null, (DecimalDto) null, (DecimalDto) null, (SideDto) null, (NullableStringDto) null, (DecimalDto) null, (NullableStringDto) null, (NullableStringDto) null, (TimeDto) null, (NullableStringDto) null, (UUIDDto) null, (LastLiquidityIndDto) null, (DecimalDto) null, (ExecutionFeesDto) null, (VenueExecutionDetailsDto) null, (FractionalExecutionDetailsDto) null, (IPOExecutionDetailsDto) null, -1, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ExecutionCorrectionDto.Serializer.INSTANCE);
        }

        @SerialName("associatedFxExecutionId")
        @JsonAnnotations2(names = {"associated_fx_execution_id"})
        public static /* synthetic */ void getAssociated_fx_execution_id$annotations() {
        }

        @SerialName("baseCurrencyTraded")
        @JsonAnnotations2(names = {"base_currency_traded"})
        public static /* synthetic */ void getBase_currency_traded$annotations() {
        }

        @SerialName("brokenAt")
        @JsonAnnotations2(names = {"broken_at"})
        public static /* synthetic */ void getBroken_at$annotations() {
        }

        @SerialName("brokerId")
        @JsonAnnotations2(names = {"broker_id"})
        public static /* synthetic */ void getBroker_id$annotations() {
        }

        @SerialName("commission")
        @JsonAnnotations2(names = {"commission"})
        public static /* synthetic */ void getCommission$annotations() {
        }

        @SerialName("commissionCurrency")
        @JsonAnnotations2(names = {"commission_currency"})
        public static /* synthetic */ void getCommission_currency$annotations() {
        }

        @SerialName("commissionType")
        @JsonAnnotations2(names = {"commission_type"})
        public static /* synthetic */ void getCommission_type$annotations() {
        }

        @SerialName("contraFirmAccount")
        @JsonAnnotations2(names = {"contra_firm_account"})
        public static /* synthetic */ void getContra_firm_account$annotations() {
        }

        @SerialName("corrections")
        @JsonAnnotations2(names = {"corrections"})
        public static /* synthetic */ void getCorrections$annotations() {
        }

        @SerialName("estimatedNextSettlementTime")
        @JsonAnnotations2(names = {"estimated_next_settlement_time"})
        public static /* synthetic */ void getEstimated_next_settlement_time$annotations() {
        }

        @SerialName("exchangeFee")
        @JsonAnnotations2(names = {"exchange_fee"})
        public static /* synthetic */ void getExchange_fee$annotations() {
        }

        @SerialName("execBroker")
        @JsonAnnotations2(names = {"exec_broker"})
        public static /* synthetic */ void getExec_broker$annotations() {
        }

        @SerialName("executionFees")
        @JsonAnnotations2(names = {"execution_fees"})
        public static /* synthetic */ void getExecution_fees$annotations() {
        }

        @SerialName("fill")
        @JsonAnnotations2(names = {"fill"})
        public static /* synthetic */ void getFill$annotations() {
        }

        @SerialName("fractionalDetails")
        @JsonAnnotations2(names = {"fractional_details"})
        public static /* synthetic */ void getFractional_details$annotations() {
        }

        @SerialName("fxFeeInBps")
        @JsonAnnotations2(names = {"fx_fee_in_bps"})
        public static /* synthetic */ void getFx_fee_in_bps$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("ipoDetails")
        @JsonAnnotations2(names = {"ipo_details"})
        public static /* synthetic */ void getIpo_details$annotations() {
        }

        @SerialName("lastLiquidityInd")
        @JsonAnnotations2(names = {"last_liquidity_ind"})
        public static /* synthetic */ void getLast_liquidity_ind$annotations() {
        }

        @SerialName("legId")
        @JsonAnnotations2(names = {"leg_id"})
        public static /* synthetic */ void getLeg_id$annotations() {
        }

        @SerialName("liquidityInd")
        @JsonAnnotations2(names = {"liquidity_ind"})
        public static /* synthetic */ void getLiquidity_ind$annotations() {
        }

        @SerialName("nonDenominatedCurrencyTraded")
        @JsonAnnotations2(names = {"non_denominated_currency_traded"})
        public static /* synthetic */ void getNon_denominated_currency_traded$annotations() {
        }

        @SerialName("occFee")
        @JsonAnnotations2(names = {"occ_fee"})
        public static /* synthetic */ void getOcc_fee$annotations() {
        }

        @SerialName("orFee")
        @JsonAnnotations2(names = {"or_fee"})
        public static /* synthetic */ void getOr_fee$annotations() {
        }

        @SerialName("positionId")
        @JsonAnnotations2(names = {"position_id"})
        public static /* synthetic */ void getPosition_id$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("relTxId")
        @JsonAnnotations2(names = {"rel_tx_id"})
        public static /* synthetic */ void getRel_tx_id$annotations() {
        }

        @SerialName("roundedNotional")
        @JsonAnnotations2(names = {"rounded_notional"})
        public static /* synthetic */ void getRounded_notional$annotations() {
        }

        @SerialName(PlaceTypes.ROUTE)
        @JsonAnnotations2(names = {PlaceTypes.ROUTE})
        public static /* synthetic */ void getRoute$annotations() {
        }

        @SerialName("secFee")
        @JsonAnnotations2(names = {"sec_fee"})
        public static /* synthetic */ void getSec_fee$annotations() {
        }

        @SerialName("settlementDate")
        @JsonAnnotations2(names = {"settlement_date"})
        public static /* synthetic */ void getSettlement_date$annotations() {
        }

        @SerialName("settlementType")
        @JsonAnnotations2(names = {"settlement_type"})
        public static /* synthetic */ void getSettlement_type$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("tafFee")
        @JsonAnnotations2(names = {"taf_fee"})
        public static /* synthetic */ void getTaf_fee$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("tradeBreakAgent")
        @JsonAnnotations2(names = {"trade_break_agent"})
        public static /* synthetic */ void getTrade_break_agent$annotations() {
        }

        @SerialName("tradeDate")
        @JsonAnnotations2(names = {"trade_date"})
        public static /* synthetic */ void getTrade_date$annotations() {
        }

        @SerialName("tradeMatchId")
        @JsonAnnotations2(names = {"trade_match_id"})
        public static /* synthetic */ void getTrade_match_id$annotations() {
        }

        @SerialName("tradeType")
        @JsonAnnotations2(names = {"trade_type"})
        public static /* synthetic */ void getTrade_type$annotations() {
        }

        @SerialName("trailer")
        @JsonAnnotations2(names = {"trailer"})
        public static /* synthetic */ void getTrailer$annotations() {
        }

        @SerialName("uti")
        @JsonAnnotations2(names = {"uti"})
        public static /* synthetic */ void getUti$annotations() {
        }

        @SerialName("venueDetails")
        @JsonAnnotations2(names = {"venue_details"})
        public static /* synthetic */ void getVenue_details$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final NullableStringDto getLeg_id() {
            return this.leg_id;
        }

        /* renamed from: component11, reason: from getter */
        public final DecimalDto getCommission() {
            return this.commission;
        }

        /* renamed from: component12, reason: from getter */
        public final UUIDDto getCommission_currency() {
            return this.commission_currency;
        }

        /* renamed from: component13, reason: from getter */
        public final NullableStringDto getCommission_type() {
            return this.commission_type;
        }

        /* renamed from: component14, reason: from getter */
        public final NullableStringDto getLiquidity_ind() {
            return this.liquidity_ind;
        }

        /* renamed from: component15, reason: from getter */
        public final NullableStringDto getSettlement_type() {
            return this.settlement_type;
        }

        /* renamed from: component16, reason: from getter */
        public final TimeDto getSettlement_date() {
            return this.settlement_date;
        }

        /* renamed from: component17, reason: from getter */
        public final TimeDto getTrade_date() {
            return this.trade_date;
        }

        /* renamed from: component18, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component19, reason: from getter */
        public final DecimalDto getSec_fee() {
            return this.sec_fee;
        }

        /* renamed from: component2, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component20, reason: from getter */
        public final DecimalDto getTaf_fee() {
            return this.taf_fee;
        }

        /* renamed from: component21, reason: from getter */
        public final DecimalDto getRounded_notional() {
            return this.rounded_notional;
        }

        /* renamed from: component22, reason: from getter */
        public final TradeBreakAgentDto getTrade_break_agent() {
            return this.trade_break_agent;
        }

        public final List<ExecutionCorrectionDto> component23() {
            return this.corrections;
        }

        /* renamed from: component24, reason: from getter */
        public final TradeTypeDto getTrade_type() {
            return this.trade_type;
        }

        /* renamed from: component25, reason: from getter */
        public final NullableStringDto getTrailer() {
            return this.trailer;
        }

        /* renamed from: component26, reason: from getter */
        public final DecimalDto getOr_fee() {
            return this.or_fee;
        }

        /* renamed from: component27, reason: from getter */
        public final DecimalDto getOcc_fee() {
            return this.occ_fee;
        }

        /* renamed from: component28, reason: from getter */
        public final NullableStringDto getTrade_match_id() {
            return this.trade_match_id;
        }

        /* renamed from: component29, reason: from getter */
        public final DecimalDto getExchange_fee() {
            return this.exchange_fee;
        }

        /* renamed from: component3, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component30, reason: from getter */
        public final DecimalDto getBase_currency_traded() {
            return this.base_currency_traded;
        }

        /* renamed from: component31, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component32, reason: from getter */
        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        /* renamed from: component33, reason: from getter */
        public final DecimalDto getNon_denominated_currency_traded() {
            return this.non_denominated_currency_traded;
        }

        /* renamed from: component34, reason: from getter */
        public final NullableStringDto getUti() {
            return this.uti;
        }

        /* renamed from: component35, reason: from getter */
        public final NullableStringDto getRel_tx_id() {
            return this.rel_tx_id;
        }

        /* renamed from: component36, reason: from getter */
        public final TimeDto getEstimated_next_settlement_time() {
            return this.estimated_next_settlement_time;
        }

        /* renamed from: component37, reason: from getter */
        public final NullableStringDto getContra_firm_account() {
            return this.contra_firm_account;
        }

        /* renamed from: component38, reason: from getter */
        public final UUIDDto getAssociated_fx_execution_id() {
            return this.associated_fx_execution_id;
        }

        /* renamed from: component39, reason: from getter */
        public final LastLiquidityIndDto getLast_liquidity_ind() {
            return this.last_liquidity_ind;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component40, reason: from getter */
        public final DecimalDto getFx_fee_in_bps() {
            return this.fx_fee_in_bps;
        }

        /* renamed from: component41, reason: from getter */
        public final ExecutionFeesDto getExecution_fees() {
            return this.execution_fees;
        }

        /* renamed from: component42, reason: from getter */
        public final VenueExecutionDetailsDto getVenue_details() {
            return this.venue_details;
        }

        /* renamed from: component43, reason: from getter */
        public final FractionalExecutionDetailsDto getFractional_details() {
            return this.fractional_details;
        }

        /* renamed from: component44, reason: from getter */
        public final IPOExecutionDetailsDto getIpo_details() {
            return this.ipo_details;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getBroken_at() {
            return this.broken_at;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getFill() {
            return this.fill;
        }

        /* renamed from: component7, reason: from getter */
        public final String getExec_broker() {
            return this.exec_broker;
        }

        /* renamed from: component8, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* renamed from: component9, reason: from getter */
        public final String getBroker_id() {
            return this.broker_id;
        }

        public final Surrogate copy(UUIDDto id, DecimalDto price, DecimalDto quantity, TimeDto timestamp, TimeDto broken_at, boolean fill, String exec_broker, int version, String broker_id, NullableStringDto leg_id, DecimalDto commission, UUIDDto commission_currency, NullableStringDto commission_type, NullableStringDto liquidity_ind, NullableStringDto settlement_type, TimeDto settlement_date, TimeDto trade_date, RouteDto route, DecimalDto sec_fee, DecimalDto taf_fee, DecimalDto rounded_notional, TradeBreakAgentDto trade_break_agent, List<ExecutionCorrectionDto> corrections, TradeTypeDto trade_type, NullableStringDto trailer, DecimalDto or_fee, DecimalDto occ_fee, NullableStringDto trade_match_id, DecimalDto exchange_fee, DecimalDto base_currency_traded, SideDto side, NullableStringDto position_id, DecimalDto non_denominated_currency_traded, NullableStringDto uti, NullableStringDto rel_tx_id, TimeDto estimated_next_settlement_time, NullableStringDto contra_firm_account, UUIDDto associated_fx_execution_id, LastLiquidityIndDto last_liquidity_ind, DecimalDto fx_fee_in_bps, ExecutionFeesDto execution_fees, VenueExecutionDetailsDto venue_details, FractionalExecutionDetailsDto fractional_details, IPOExecutionDetailsDto ipo_details) {
            Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
            Intrinsics.checkNotNullParameter(broker_id, "broker_id");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
            Intrinsics.checkNotNullParameter(corrections, "corrections");
            Intrinsics.checkNotNullParameter(trade_type, "trade_type");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
            return new Surrogate(id, price, quantity, timestamp, broken_at, fill, exec_broker, version, broker_id, leg_id, commission, commission_currency, commission_type, liquidity_ind, settlement_type, settlement_date, trade_date, route, sec_fee, taf_fee, rounded_notional, trade_break_agent, corrections, trade_type, trailer, or_fee, occ_fee, trade_match_id, exchange_fee, base_currency_traded, side, position_id, non_denominated_currency_traded, uti, rel_tx_id, estimated_next_settlement_time, contra_firm_account, associated_fx_execution_id, last_liquidity_ind, fx_fee_in_bps, execution_fees, venue_details, fractional_details, ipo_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.broken_at, surrogate.broken_at) && this.fill == surrogate.fill && Intrinsics.areEqual(this.exec_broker, surrogate.exec_broker) && this.version == surrogate.version && Intrinsics.areEqual(this.broker_id, surrogate.broker_id) && Intrinsics.areEqual(this.leg_id, surrogate.leg_id) && Intrinsics.areEqual(this.commission, surrogate.commission) && Intrinsics.areEqual(this.commission_currency, surrogate.commission_currency) && Intrinsics.areEqual(this.commission_type, surrogate.commission_type) && Intrinsics.areEqual(this.liquidity_ind, surrogate.liquidity_ind) && Intrinsics.areEqual(this.settlement_type, surrogate.settlement_type) && Intrinsics.areEqual(this.settlement_date, surrogate.settlement_date) && Intrinsics.areEqual(this.trade_date, surrogate.trade_date) && this.route == surrogate.route && Intrinsics.areEqual(this.sec_fee, surrogate.sec_fee) && Intrinsics.areEqual(this.taf_fee, surrogate.taf_fee) && Intrinsics.areEqual(this.rounded_notional, surrogate.rounded_notional) && this.trade_break_agent == surrogate.trade_break_agent && Intrinsics.areEqual(this.corrections, surrogate.corrections) && this.trade_type == surrogate.trade_type && Intrinsics.areEqual(this.trailer, surrogate.trailer) && Intrinsics.areEqual(this.or_fee, surrogate.or_fee) && Intrinsics.areEqual(this.occ_fee, surrogate.occ_fee) && Intrinsics.areEqual(this.trade_match_id, surrogate.trade_match_id) && Intrinsics.areEqual(this.exchange_fee, surrogate.exchange_fee) && Intrinsics.areEqual(this.base_currency_traded, surrogate.base_currency_traded) && this.side == surrogate.side && Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.non_denominated_currency_traded, surrogate.non_denominated_currency_traded) && Intrinsics.areEqual(this.uti, surrogate.uti) && Intrinsics.areEqual(this.rel_tx_id, surrogate.rel_tx_id) && Intrinsics.areEqual(this.estimated_next_settlement_time, surrogate.estimated_next_settlement_time) && Intrinsics.areEqual(this.contra_firm_account, surrogate.contra_firm_account) && Intrinsics.areEqual(this.associated_fx_execution_id, surrogate.associated_fx_execution_id) && this.last_liquidity_ind == surrogate.last_liquidity_ind && Intrinsics.areEqual(this.fx_fee_in_bps, surrogate.fx_fee_in_bps) && Intrinsics.areEqual(this.execution_fees, surrogate.execution_fees) && Intrinsics.areEqual(this.venue_details, surrogate.venue_details) && Intrinsics.areEqual(this.fractional_details, surrogate.fractional_details) && Intrinsics.areEqual(this.ipo_details, surrogate.ipo_details);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            DecimalDto decimalDto = this.price;
            int iHashCode2 = (iHashCode + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            DecimalDto decimalDto2 = this.quantity;
            int iHashCode3 = (iHashCode2 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            TimeDto timeDto = this.timestamp;
            int iHashCode4 = (iHashCode3 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.broken_at;
            int iHashCode5 = (((((((((iHashCode4 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + Boolean.hashCode(this.fill)) * 31) + this.exec_broker.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + this.broker_id.hashCode()) * 31;
            NullableStringDto nullableStringDto = this.leg_id;
            int iHashCode6 = (iHashCode5 + (nullableStringDto == null ? 0 : nullableStringDto.hashCode())) * 31;
            DecimalDto decimalDto3 = this.commission;
            int iHashCode7 = (iHashCode6 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            UUIDDto uUIDDto2 = this.commission_currency;
            int iHashCode8 = (iHashCode7 + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31;
            NullableStringDto nullableStringDto2 = this.commission_type;
            int iHashCode9 = (iHashCode8 + (nullableStringDto2 == null ? 0 : nullableStringDto2.hashCode())) * 31;
            NullableStringDto nullableStringDto3 = this.liquidity_ind;
            int iHashCode10 = (iHashCode9 + (nullableStringDto3 == null ? 0 : nullableStringDto3.hashCode())) * 31;
            NullableStringDto nullableStringDto4 = this.settlement_type;
            int iHashCode11 = (iHashCode10 + (nullableStringDto4 == null ? 0 : nullableStringDto4.hashCode())) * 31;
            TimeDto timeDto3 = this.settlement_date;
            int iHashCode12 = (iHashCode11 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31;
            TimeDto timeDto4 = this.trade_date;
            int iHashCode13 = (((iHashCode12 + (timeDto4 == null ? 0 : timeDto4.hashCode())) * 31) + this.route.hashCode()) * 31;
            DecimalDto decimalDto4 = this.sec_fee;
            int iHashCode14 = (iHashCode13 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31;
            DecimalDto decimalDto5 = this.taf_fee;
            int iHashCode15 = (iHashCode14 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31;
            DecimalDto decimalDto6 = this.rounded_notional;
            int iHashCode16 = (((((((iHashCode15 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31) + this.trade_break_agent.hashCode()) * 31) + this.corrections.hashCode()) * 31) + this.trade_type.hashCode()) * 31;
            NullableStringDto nullableStringDto5 = this.trailer;
            int iHashCode17 = (iHashCode16 + (nullableStringDto5 == null ? 0 : nullableStringDto5.hashCode())) * 31;
            DecimalDto decimalDto7 = this.or_fee;
            int iHashCode18 = (iHashCode17 + (decimalDto7 == null ? 0 : decimalDto7.hashCode())) * 31;
            DecimalDto decimalDto8 = this.occ_fee;
            int iHashCode19 = (iHashCode18 + (decimalDto8 == null ? 0 : decimalDto8.hashCode())) * 31;
            NullableStringDto nullableStringDto6 = this.trade_match_id;
            int iHashCode20 = (iHashCode19 + (nullableStringDto6 == null ? 0 : nullableStringDto6.hashCode())) * 31;
            DecimalDto decimalDto9 = this.exchange_fee;
            int iHashCode21 = (iHashCode20 + (decimalDto9 == null ? 0 : decimalDto9.hashCode())) * 31;
            DecimalDto decimalDto10 = this.base_currency_traded;
            int iHashCode22 = (((iHashCode21 + (decimalDto10 == null ? 0 : decimalDto10.hashCode())) * 31) + this.side.hashCode()) * 31;
            NullableStringDto nullableStringDto7 = this.position_id;
            int iHashCode23 = (iHashCode22 + (nullableStringDto7 == null ? 0 : nullableStringDto7.hashCode())) * 31;
            DecimalDto decimalDto11 = this.non_denominated_currency_traded;
            int iHashCode24 = (iHashCode23 + (decimalDto11 == null ? 0 : decimalDto11.hashCode())) * 31;
            NullableStringDto nullableStringDto8 = this.uti;
            int iHashCode25 = (iHashCode24 + (nullableStringDto8 == null ? 0 : nullableStringDto8.hashCode())) * 31;
            NullableStringDto nullableStringDto9 = this.rel_tx_id;
            int iHashCode26 = (iHashCode25 + (nullableStringDto9 == null ? 0 : nullableStringDto9.hashCode())) * 31;
            TimeDto timeDto5 = this.estimated_next_settlement_time;
            int iHashCode27 = (iHashCode26 + (timeDto5 == null ? 0 : timeDto5.hashCode())) * 31;
            NullableStringDto nullableStringDto10 = this.contra_firm_account;
            int iHashCode28 = (iHashCode27 + (nullableStringDto10 == null ? 0 : nullableStringDto10.hashCode())) * 31;
            UUIDDto uUIDDto3 = this.associated_fx_execution_id;
            int iHashCode29 = (((iHashCode28 + (uUIDDto3 == null ? 0 : uUIDDto3.hashCode())) * 31) + this.last_liquidity_ind.hashCode()) * 31;
            DecimalDto decimalDto12 = this.fx_fee_in_bps;
            int iHashCode30 = (iHashCode29 + (decimalDto12 == null ? 0 : decimalDto12.hashCode())) * 31;
            ExecutionFeesDto executionFeesDto = this.execution_fees;
            int iHashCode31 = (iHashCode30 + (executionFeesDto == null ? 0 : executionFeesDto.hashCode())) * 31;
            VenueExecutionDetailsDto venueExecutionDetailsDto = this.venue_details;
            int iHashCode32 = (iHashCode31 + (venueExecutionDetailsDto == null ? 0 : venueExecutionDetailsDto.hashCode())) * 31;
            FractionalExecutionDetailsDto fractionalExecutionDetailsDto = this.fractional_details;
            int iHashCode33 = (iHashCode32 + (fractionalExecutionDetailsDto == null ? 0 : fractionalExecutionDetailsDto.hashCode())) * 31;
            IPOExecutionDetailsDto iPOExecutionDetailsDto = this.ipo_details;
            return iHashCode33 + (iPOExecutionDetailsDto != null ? iPOExecutionDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", price=" + this.price + ", quantity=" + this.quantity + ", timestamp=" + this.timestamp + ", broken_at=" + this.broken_at + ", fill=" + this.fill + ", exec_broker=" + this.exec_broker + ", version=" + this.version + ", broker_id=" + this.broker_id + ", leg_id=" + this.leg_id + ", commission=" + this.commission + ", commission_currency=" + this.commission_currency + ", commission_type=" + this.commission_type + ", liquidity_ind=" + this.liquidity_ind + ", settlement_type=" + this.settlement_type + ", settlement_date=" + this.settlement_date + ", trade_date=" + this.trade_date + ", route=" + this.route + ", sec_fee=" + this.sec_fee + ", taf_fee=" + this.taf_fee + ", rounded_notional=" + this.rounded_notional + ", trade_break_agent=" + this.trade_break_agent + ", corrections=" + this.corrections + ", trade_type=" + this.trade_type + ", trailer=" + this.trailer + ", or_fee=" + this.or_fee + ", occ_fee=" + this.occ_fee + ", trade_match_id=" + this.trade_match_id + ", exchange_fee=" + this.exchange_fee + ", base_currency_traded=" + this.base_currency_traded + ", side=" + this.side + ", position_id=" + this.position_id + ", non_denominated_currency_traded=" + this.non_denominated_currency_traded + ", uti=" + this.uti + ", rel_tx_id=" + this.rel_tx_id + ", estimated_next_settlement_time=" + this.estimated_next_settlement_time + ", contra_firm_account=" + this.contra_firm_account + ", associated_fx_execution_id=" + this.associated_fx_execution_id + ", last_liquidity_ind=" + this.last_liquidity_ind + ", fx_fee_in_bps=" + this.fx_fee_in_bps + ", execution_fees=" + this.execution_fees + ", venue_details=" + this.venue_details + ", fractional_details=" + this.fractional_details + ", ipo_details=" + this.ipo_details + ")";
        }

        /* compiled from: OrderUpdateExecutionDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderUpdateExecutionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, UUIDDto uUIDDto, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, TimeDto timeDto2, boolean z, String str, int i3, String str2, NullableStringDto nullableStringDto, DecimalDto decimalDto3, UUIDDto uUIDDto2, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, RouteDto routeDto, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, TradeBreakAgentDto tradeBreakAgentDto, List list, TradeTypeDto tradeTypeDto, NullableStringDto nullableStringDto5, DecimalDto decimalDto7, DecimalDto decimalDto8, NullableStringDto nullableStringDto6, DecimalDto decimalDto9, DecimalDto decimalDto10, SideDto sideDto, NullableStringDto nullableStringDto7, DecimalDto decimalDto11, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, TimeDto timeDto5, NullableStringDto nullableStringDto10, UUIDDto uUIDDto3, LastLiquidityIndDto lastLiquidityIndDto, DecimalDto decimalDto12, ExecutionFeesDto executionFeesDto, VenueExecutionDetailsDto venueExecutionDetailsDto, FractionalExecutionDetailsDto fractionalExecutionDetailsDto, IPOExecutionDetailsDto iPOExecutionDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto;
            }
            if ((i & 4) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto2;
            }
            if ((i & 8) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = timeDto;
            }
            if ((i & 16) == 0) {
                this.broken_at = null;
            } else {
                this.broken_at = timeDto2;
            }
            if ((i & 32) == 0) {
                this.fill = false;
            } else {
                this.fill = z;
            }
            if ((i & 64) == 0) {
                this.exec_broker = "";
            } else {
                this.exec_broker = str;
            }
            if ((i & 128) == 0) {
                this.version = 0;
            } else {
                this.version = i3;
            }
            if ((i & 256) == 0) {
                this.broker_id = "";
            } else {
                this.broker_id = str2;
            }
            if ((i & 512) == 0) {
                this.leg_id = null;
            } else {
                this.leg_id = nullableStringDto;
            }
            if ((i & 1024) == 0) {
                this.commission = null;
            } else {
                this.commission = decimalDto3;
            }
            if ((i & 2048) == 0) {
                this.commission_currency = null;
            } else {
                this.commission_currency = uUIDDto2;
            }
            if ((i & 4096) == 0) {
                this.commission_type = null;
            } else {
                this.commission_type = nullableStringDto2;
            }
            if ((i & 8192) == 0) {
                this.liquidity_ind = null;
            } else {
                this.liquidity_ind = nullableStringDto3;
            }
            if ((i & 16384) == 0) {
                this.settlement_type = null;
            } else {
                this.settlement_type = nullableStringDto4;
            }
            if ((32768 & i) == 0) {
                this.settlement_date = null;
            } else {
                this.settlement_date = timeDto3;
            }
            if ((65536 & i) == 0) {
                this.trade_date = null;
            } else {
                this.trade_date = timeDto4;
            }
            this.route = (131072 & i) == 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto;
            if ((262144 & i) == 0) {
                this.sec_fee = null;
            } else {
                this.sec_fee = decimalDto4;
            }
            if ((524288 & i) == 0) {
                this.taf_fee = null;
            } else {
                this.taf_fee = decimalDto5;
            }
            if ((1048576 & i) == 0) {
                this.rounded_notional = null;
            } else {
                this.rounded_notional = decimalDto6;
            }
            this.trade_break_agent = (2097152 & i) == 0 ? TradeBreakAgentDto.INSTANCE.getZeroValue() : tradeBreakAgentDto;
            this.corrections = (4194304 & i) == 0 ? CollectionsKt.emptyList() : list;
            this.trade_type = (8388608 & i) == 0 ? TradeTypeDto.INSTANCE.getZeroValue() : tradeTypeDto;
            if ((16777216 & i) == 0) {
                this.trailer = null;
            } else {
                this.trailer = nullableStringDto5;
            }
            if ((33554432 & i) == 0) {
                this.or_fee = null;
            } else {
                this.or_fee = decimalDto7;
            }
            if ((67108864 & i) == 0) {
                this.occ_fee = null;
            } else {
                this.occ_fee = decimalDto8;
            }
            if ((134217728 & i) == 0) {
                this.trade_match_id = null;
            } else {
                this.trade_match_id = nullableStringDto6;
            }
            if ((268435456 & i) == 0) {
                this.exchange_fee = null;
            } else {
                this.exchange_fee = decimalDto9;
            }
            if ((536870912 & i) == 0) {
                this.base_currency_traded = null;
            } else {
                this.base_currency_traded = decimalDto10;
            }
            this.side = (1073741824 & i) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            if ((i & Integer.MIN_VALUE) == 0) {
                this.position_id = null;
            } else {
                this.position_id = nullableStringDto7;
            }
            if ((i2 & 1) == 0) {
                this.non_denominated_currency_traded = null;
            } else {
                this.non_denominated_currency_traded = decimalDto11;
            }
            if ((i2 & 2) == 0) {
                this.uti = null;
            } else {
                this.uti = nullableStringDto8;
            }
            if ((i2 & 4) == 0) {
                this.rel_tx_id = null;
            } else {
                this.rel_tx_id = nullableStringDto9;
            }
            if ((i2 & 8) == 0) {
                this.estimated_next_settlement_time = null;
            } else {
                this.estimated_next_settlement_time = timeDto5;
            }
            if ((i2 & 16) == 0) {
                this.contra_firm_account = null;
            } else {
                this.contra_firm_account = nullableStringDto10;
            }
            if ((i2 & 32) == 0) {
                this.associated_fx_execution_id = null;
            } else {
                this.associated_fx_execution_id = uUIDDto3;
            }
            this.last_liquidity_ind = (i2 & 64) == 0 ? LastLiquidityIndDto.INSTANCE.getZeroValue() : lastLiquidityIndDto;
            if ((i2 & 128) == 0) {
                this.fx_fee_in_bps = null;
            } else {
                this.fx_fee_in_bps = decimalDto12;
            }
            if ((i2 & 256) == 0) {
                this.execution_fees = null;
            } else {
                this.execution_fees = executionFeesDto;
            }
            if ((i2 & 512) == 0) {
                this.venue_details = null;
            } else {
                this.venue_details = venueExecutionDetailsDto;
            }
            if ((i2 & 1024) == 0) {
                this.fractional_details = null;
            } else {
                this.fractional_details = fractionalExecutionDetailsDto;
            }
            if ((i2 & 2048) == 0) {
                this.ipo_details = null;
            } else {
                this.ipo_details = iPOExecutionDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            DecimalDto decimalDto = self.price;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.quantity;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            TimeDto timeDto = self.timestamp;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.broken_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            boolean z = self.fill;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            if (!Intrinsics.areEqual(self.exec_broker, "")) {
                output.encodeStringElement(serialDesc, 6, self.exec_broker);
            }
            int i = self.version;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.broker_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.broker_id);
            }
            NullableStringDto nullableStringDto = self.leg_id;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
            DecimalDto decimalDto3 = self.commission;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            UUIDDto uUIDDto2 = self.commission_currency;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            NullableStringDto nullableStringDto2 = self.commission_type;
            if (nullableStringDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, NullableStringDto.Serializer.INSTANCE, nullableStringDto2);
            }
            NullableStringDto nullableStringDto3 = self.liquidity_ind;
            if (nullableStringDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, NullableStringDto.Serializer.INSTANCE, nullableStringDto3);
            }
            NullableStringDto nullableStringDto4 = self.settlement_type;
            if (nullableStringDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, NullableStringDto.Serializer.INSTANCE, nullableStringDto4);
            }
            TimeDto timeDto3 = self.settlement_date;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            TimeDto timeDto4 = self.trade_date;
            if (timeDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, TimeDto.Serializer.INSTANCE, timeDto4);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 17, RouteDto.Serializer.INSTANCE, self.route);
            }
            DecimalDto decimalDto4 = self.sec_fee;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            DecimalDto decimalDto5 = self.taf_fee;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            DecimalDto decimalDto6 = self.rounded_notional;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            if (self.trade_break_agent != TradeBreakAgentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 21, TradeBreakAgentDto.Serializer.INSTANCE, self.trade_break_agent);
            }
            if (!Intrinsics.areEqual(self.corrections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 22, lazyArr[22].getValue(), self.corrections);
            }
            if (self.trade_type != TradeTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 23, TradeTypeDto.Serializer.INSTANCE, self.trade_type);
            }
            NullableStringDto nullableStringDto5 = self.trailer;
            if (nullableStringDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, NullableStringDto.Serializer.INSTANCE, nullableStringDto5);
            }
            DecimalDto decimalDto7 = self.or_fee;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
            DecimalDto decimalDto8 = self.occ_fee;
            if (decimalDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, DecimalDto.Serializer.INSTANCE, decimalDto8);
            }
            NullableStringDto nullableStringDto6 = self.trade_match_id;
            if (nullableStringDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, NullableStringDto.Serializer.INSTANCE, nullableStringDto6);
            }
            DecimalDto decimalDto9 = self.exchange_fee;
            if (decimalDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, DecimalDto.Serializer.INSTANCE, decimalDto9);
            }
            DecimalDto decimalDto10 = self.base_currency_traded;
            if (decimalDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, DecimalDto.Serializer.INSTANCE, decimalDto10);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 30, SideDto.Serializer.INSTANCE, self.side);
            }
            NullableStringDto nullableStringDto7 = self.position_id;
            if (nullableStringDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, NullableStringDto.Serializer.INSTANCE, nullableStringDto7);
            }
            DecimalDto decimalDto11 = self.non_denominated_currency_traded;
            if (decimalDto11 != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, DecimalDto.Serializer.INSTANCE, decimalDto11);
            }
            NullableStringDto nullableStringDto8 = self.uti;
            if (nullableStringDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, NullableStringDto.Serializer.INSTANCE, nullableStringDto8);
            }
            NullableStringDto nullableStringDto9 = self.rel_tx_id;
            if (nullableStringDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, NullableStringDto.Serializer.INSTANCE, nullableStringDto9);
            }
            TimeDto timeDto5 = self.estimated_next_settlement_time;
            if (timeDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, TimeDto.Serializer.INSTANCE, timeDto5);
            }
            NullableStringDto nullableStringDto10 = self.contra_firm_account;
            if (nullableStringDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 36, NullableStringDto.Serializer.INSTANCE, nullableStringDto10);
            }
            UUIDDto uUIDDto3 = self.associated_fx_execution_id;
            if (uUIDDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 37, UUIDDto.Serializer.INSTANCE, uUIDDto3);
            }
            if (self.last_liquidity_ind != LastLiquidityIndDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 38, LastLiquidityIndDto.Serializer.INSTANCE, self.last_liquidity_ind);
            }
            DecimalDto decimalDto12 = self.fx_fee_in_bps;
            if (decimalDto12 != null) {
                output.encodeNullableSerializableElement(serialDesc, 39, DecimalDto.Serializer.INSTANCE, decimalDto12);
            }
            ExecutionFeesDto executionFeesDto = self.execution_fees;
            if (executionFeesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 40, ExecutionFeesDto.Serializer.INSTANCE, executionFeesDto);
            }
            VenueExecutionDetailsDto venueExecutionDetailsDto = self.venue_details;
            if (venueExecutionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 41, VenueExecutionDetailsDto.Serializer.INSTANCE, venueExecutionDetailsDto);
            }
            FractionalExecutionDetailsDto fractionalExecutionDetailsDto = self.fractional_details;
            if (fractionalExecutionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 42, FractionalExecutionDetailsDto.Serializer.INSTANCE, fractionalExecutionDetailsDto);
            }
            IPOExecutionDetailsDto iPOExecutionDetailsDto = self.ipo_details;
            if (iPOExecutionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 43, IPOExecutionDetailsDto.Serializer.INSTANCE, iPOExecutionDetailsDto);
            }
        }

        public Surrogate(UUIDDto uUIDDto, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, TimeDto timeDto2, boolean z, String exec_broker, int i, String broker_id, NullableStringDto nullableStringDto, DecimalDto decimalDto3, UUIDDto uUIDDto2, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, RouteDto route, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, TradeBreakAgentDto trade_break_agent, List<ExecutionCorrectionDto> corrections, TradeTypeDto trade_type, NullableStringDto nullableStringDto5, DecimalDto decimalDto7, DecimalDto decimalDto8, NullableStringDto nullableStringDto6, DecimalDto decimalDto9, DecimalDto decimalDto10, SideDto side, NullableStringDto nullableStringDto7, DecimalDto decimalDto11, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, TimeDto timeDto5, NullableStringDto nullableStringDto10, UUIDDto uUIDDto3, LastLiquidityIndDto last_liquidity_ind, DecimalDto decimalDto12, ExecutionFeesDto executionFeesDto, VenueExecutionDetailsDto venueExecutionDetailsDto, FractionalExecutionDetailsDto fractionalExecutionDetailsDto, IPOExecutionDetailsDto iPOExecutionDetailsDto) {
            Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
            Intrinsics.checkNotNullParameter(broker_id, "broker_id");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
            Intrinsics.checkNotNullParameter(corrections, "corrections");
            Intrinsics.checkNotNullParameter(trade_type, "trade_type");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
            this.id = uUIDDto;
            this.price = decimalDto;
            this.quantity = decimalDto2;
            this.timestamp = timeDto;
            this.broken_at = timeDto2;
            this.fill = z;
            this.exec_broker = exec_broker;
            this.version = i;
            this.broker_id = broker_id;
            this.leg_id = nullableStringDto;
            this.commission = decimalDto3;
            this.commission_currency = uUIDDto2;
            this.commission_type = nullableStringDto2;
            this.liquidity_ind = nullableStringDto3;
            this.settlement_type = nullableStringDto4;
            this.settlement_date = timeDto3;
            this.trade_date = timeDto4;
            this.route = route;
            this.sec_fee = decimalDto4;
            this.taf_fee = decimalDto5;
            this.rounded_notional = decimalDto6;
            this.trade_break_agent = trade_break_agent;
            this.corrections = corrections;
            this.trade_type = trade_type;
            this.trailer = nullableStringDto5;
            this.or_fee = decimalDto7;
            this.occ_fee = decimalDto8;
            this.trade_match_id = nullableStringDto6;
            this.exchange_fee = decimalDto9;
            this.base_currency_traded = decimalDto10;
            this.side = side;
            this.position_id = nullableStringDto7;
            this.non_denominated_currency_traded = decimalDto11;
            this.uti = nullableStringDto8;
            this.rel_tx_id = nullableStringDto9;
            this.estimated_next_settlement_time = timeDto5;
            this.contra_firm_account = nullableStringDto10;
            this.associated_fx_execution_id = uUIDDto3;
            this.last_liquidity_ind = last_liquidity_ind;
            this.fx_fee_in_bps = decimalDto12;
            this.execution_fees = executionFeesDto;
            this.venue_details = venueExecutionDetailsDto;
            this.fractional_details = fractionalExecutionDetailsDto;
            this.ipo_details = iPOExecutionDetailsDto;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(UUIDDto uUIDDto, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, TimeDto timeDto2, boolean z, String str, int i, String str2, NullableStringDto nullableStringDto, DecimalDto decimalDto3, UUIDDto uUIDDto2, NullableStringDto nullableStringDto2, NullableStringDto nullableStringDto3, NullableStringDto nullableStringDto4, TimeDto timeDto3, TimeDto timeDto4, RouteDto routeDto, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, TradeBreakAgentDto tradeBreakAgentDto, List list, TradeTypeDto tradeTypeDto, NullableStringDto nullableStringDto5, DecimalDto decimalDto7, DecimalDto decimalDto8, NullableStringDto nullableStringDto6, DecimalDto decimalDto9, DecimalDto decimalDto10, SideDto sideDto, NullableStringDto nullableStringDto7, DecimalDto decimalDto11, NullableStringDto nullableStringDto8, NullableStringDto nullableStringDto9, TimeDto timeDto5, NullableStringDto nullableStringDto10, UUIDDto uUIDDto3, LastLiquidityIndDto lastLiquidityIndDto, DecimalDto decimalDto12, ExecutionFeesDto executionFeesDto, VenueExecutionDetailsDto venueExecutionDetailsDto, FractionalExecutionDetailsDto fractionalExecutionDetailsDto, IPOExecutionDetailsDto iPOExecutionDetailsDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            UUIDDto uUIDDto4 = (i2 & 1) != 0 ? null : uUIDDto;
            this(uUIDDto4, (i2 & 2) != 0 ? null : decimalDto, (i2 & 4) != 0 ? null : decimalDto2, (i2 & 8) != 0 ? null : timeDto, (i2 & 16) != 0 ? null : timeDto2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str, (i2 & 128) == 0 ? i : 0, (i2 & 256) == 0 ? str2 : "", (i2 & 512) != 0 ? null : nullableStringDto, (i2 & 1024) != 0 ? null : decimalDto3, (i2 & 2048) != 0 ? null : uUIDDto2, (i2 & 4096) != 0 ? null : nullableStringDto2, (i2 & 8192) != 0 ? null : nullableStringDto3, (i2 & 16384) != 0 ? null : nullableStringDto4, (i2 & 32768) != 0 ? null : timeDto3, (i2 & 65536) != 0 ? null : timeDto4, (i2 & 131072) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 262144) != 0 ? null : decimalDto4, (i2 & 524288) != 0 ? null : decimalDto5, (i2 & 1048576) != 0 ? null : decimalDto6, (i2 & 2097152) != 0 ? TradeBreakAgentDto.INSTANCE.getZeroValue() : tradeBreakAgentDto, (i2 & 4194304) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8388608) != 0 ? TradeTypeDto.INSTANCE.getZeroValue() : tradeTypeDto, (i2 & 16777216) != 0 ? null : nullableStringDto5, (i2 & 33554432) != 0 ? null : decimalDto7, (i2 & 67108864) != 0 ? null : decimalDto8, (i2 & 134217728) != 0 ? null : nullableStringDto6, (i2 & 268435456) != 0 ? null : decimalDto9, (i2 & 536870912) != 0 ? null : decimalDto10, (i2 & 1073741824) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & Integer.MIN_VALUE) != 0 ? null : nullableStringDto7, (i3 & 1) != 0 ? null : decimalDto11, (i3 & 2) != 0 ? null : nullableStringDto8, (i3 & 4) != 0 ? null : nullableStringDto9, (i3 & 8) != 0 ? null : timeDto5, (i3 & 16) != 0 ? null : nullableStringDto10, (i3 & 32) != 0 ? null : uUIDDto3, (i3 & 64) != 0 ? LastLiquidityIndDto.INSTANCE.getZeroValue() : lastLiquidityIndDto, (i3 & 128) != 0 ? null : decimalDto12, (i3 & 256) != 0 ? null : executionFeesDto, (i3 & 512) != 0 ? null : venueExecutionDetailsDto, (i3 & 1024) != 0 ? null : fractionalExecutionDetailsDto, (i3 & 2048) != 0 ? null : iPOExecutionDetailsDto);
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        public final TimeDto getBroken_at() {
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

        public final NullableStringDto getLeg_id() {
            return this.leg_id;
        }

        public final DecimalDto getCommission() {
            return this.commission;
        }

        public final UUIDDto getCommission_currency() {
            return this.commission_currency;
        }

        public final NullableStringDto getCommission_type() {
            return this.commission_type;
        }

        public final NullableStringDto getLiquidity_ind() {
            return this.liquidity_ind;
        }

        public final NullableStringDto getSettlement_type() {
            return this.settlement_type;
        }

        public final TimeDto getSettlement_date() {
            return this.settlement_date;
        }

        public final TimeDto getTrade_date() {
            return this.trade_date;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public final DecimalDto getSec_fee() {
            return this.sec_fee;
        }

        public final DecimalDto getTaf_fee() {
            return this.taf_fee;
        }

        public final DecimalDto getRounded_notional() {
            return this.rounded_notional;
        }

        public final TradeBreakAgentDto getTrade_break_agent() {
            return this.trade_break_agent;
        }

        public final List<ExecutionCorrectionDto> getCorrections() {
            return this.corrections;
        }

        public final TradeTypeDto getTrade_type() {
            return this.trade_type;
        }

        public final NullableStringDto getTrailer() {
            return this.trailer;
        }

        public final DecimalDto getOr_fee() {
            return this.or_fee;
        }

        public final DecimalDto getOcc_fee() {
            return this.occ_fee;
        }

        public final NullableStringDto getTrade_match_id() {
            return this.trade_match_id;
        }

        public final DecimalDto getExchange_fee() {
            return this.exchange_fee;
        }

        public final DecimalDto getBase_currency_traded() {
            return this.base_currency_traded;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        public final DecimalDto getNon_denominated_currency_traded() {
            return this.non_denominated_currency_traded;
        }

        public final NullableStringDto getUti() {
            return this.uti;
        }

        public final NullableStringDto getRel_tx_id() {
            return this.rel_tx_id;
        }

        public final TimeDto getEstimated_next_settlement_time() {
            return this.estimated_next_settlement_time;
        }

        public final NullableStringDto getContra_firm_account() {
            return this.contra_firm_account;
        }

        public final UUIDDto getAssociated_fx_execution_id() {
            return this.associated_fx_execution_id;
        }

        public final LastLiquidityIndDto getLast_liquidity_ind() {
            return this.last_liquidity_ind;
        }

        public final DecimalDto getFx_fee_in_bps() {
            return this.fx_fee_in_bps;
        }

        public final ExecutionFeesDto getExecution_fees() {
            return this.execution_fees;
        }

        public final VenueExecutionDetailsDto getVenue_details() {
            return this.venue_details;
        }

        public final FractionalExecutionDetailsDto getFractional_details() {
            return this.fractional_details;
        }

        public final IPOExecutionDetailsDto getIpo_details() {
            return this.ipo_details;
        }
    }

    /* compiled from: OrderUpdateExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecution;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderUpdateExecutionDto, OrderUpdateExecution> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderUpdateExecutionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderUpdateExecutionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderUpdateExecutionDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderUpdateExecutionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderUpdateExecution> getProtoAdapter() {
            return OrderUpdateExecution.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderUpdateExecutionDto getZeroValue() {
            return OrderUpdateExecutionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderUpdateExecutionDto fromProto(OrderUpdateExecution proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            Decimal price = proto.getPrice();
            DecimalDto decimalDtoFromProto = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            Decimal quantity = proto.getQuantity();
            DecimalDto decimalDtoFromProto2 = quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null;
            Time timestamp = proto.getTimestamp();
            TimeDto timeDtoFromProto = timestamp != null ? TimeDto.INSTANCE.fromProto(timestamp) : null;
            Time broken_at = proto.getBroken_at();
            TimeDto timeDtoFromProto2 = broken_at != null ? TimeDto.INSTANCE.fromProto(broken_at) : null;
            boolean fill = proto.getFill();
            String exec_broker = proto.getExec_broker();
            int version = proto.getVersion();
            String broker_id = proto.getBroker_id();
            NullableString leg_id = proto.getLeg_id();
            NullableStringDto nullableStringDtoFromProto = leg_id != null ? NullableStringDto.INSTANCE.fromProto(leg_id) : null;
            Decimal commission = proto.getCommission();
            DecimalDto decimalDtoFromProto3 = commission != null ? DecimalDto.INSTANCE.fromProto(commission) : null;
            UUID commission_currency = proto.getCommission_currency();
            UUIDDto uUIDDtoFromProto2 = commission_currency != null ? UUIDDto.INSTANCE.fromProto(commission_currency) : null;
            NullableString commission_type = proto.getCommission_type();
            NullableStringDto nullableStringDtoFromProto2 = commission_type != null ? NullableStringDto.INSTANCE.fromProto(commission_type) : null;
            NullableString liquidity_ind = proto.getLiquidity_ind();
            NullableStringDto nullableStringDtoFromProto3 = liquidity_ind != null ? NullableStringDto.INSTANCE.fromProto(liquidity_ind) : null;
            NullableString settlement_type = proto.getSettlement_type();
            NullableStringDto nullableStringDtoFromProto4 = settlement_type != null ? NullableStringDto.INSTANCE.fromProto(settlement_type) : null;
            Time settlement_date = proto.getSettlement_date();
            TimeDto timeDtoFromProto3 = settlement_date != null ? TimeDto.INSTANCE.fromProto(settlement_date) : null;
            Time trade_date = proto.getTrade_date();
            TimeDto timeDtoFromProto4 = trade_date != null ? TimeDto.INSTANCE.fromProto(trade_date) : null;
            RouteDto routeDtoFromProto = RouteDto.INSTANCE.fromProto(proto.getRoute());
            Decimal sec_fee = proto.getSec_fee();
            DecimalDto decimalDtoFromProto4 = sec_fee != null ? DecimalDto.INSTANCE.fromProto(sec_fee) : null;
            Decimal taf_fee = proto.getTaf_fee();
            DecimalDto decimalDtoFromProto5 = taf_fee != null ? DecimalDto.INSTANCE.fromProto(taf_fee) : null;
            Decimal rounded_notional = proto.getRounded_notional();
            DecimalDto decimalDtoFromProto6 = rounded_notional != null ? DecimalDto.INSTANCE.fromProto(rounded_notional) : null;
            TradeBreakAgentDto tradeBreakAgentDtoFromProto = TradeBreakAgentDto.INSTANCE.fromProto(proto.getTrade_break_agent());
            List<ExecutionCorrection> corrections = proto.getCorrections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(corrections, 10));
            for (Iterator it = corrections.iterator(); it.hasNext(); it = it) {
                arrayList.add(ExecutionCorrectionDto.INSTANCE.fromProto((ExecutionCorrection) it.next()));
            }
            TradeTypeDto tradeTypeDtoFromProto = TradeTypeDto.INSTANCE.fromProto(proto.getTrade_type());
            NullableString trailer = proto.getTrailer();
            NullableStringDto nullableStringDtoFromProto5 = trailer != null ? NullableStringDto.INSTANCE.fromProto(trailer) : null;
            Decimal or_fee = proto.getOr_fee();
            DecimalDto decimalDtoFromProto7 = or_fee != null ? DecimalDto.INSTANCE.fromProto(or_fee) : null;
            Decimal occ_fee = proto.getOcc_fee();
            DecimalDto decimalDtoFromProto8 = occ_fee != null ? DecimalDto.INSTANCE.fromProto(occ_fee) : null;
            NullableString trade_match_id = proto.getTrade_match_id();
            NullableStringDto nullableStringDtoFromProto6 = trade_match_id != null ? NullableStringDto.INSTANCE.fromProto(trade_match_id) : null;
            Decimal exchange_fee = proto.getExchange_fee();
            DecimalDto decimalDtoFromProto9 = exchange_fee != null ? DecimalDto.INSTANCE.fromProto(exchange_fee) : null;
            Decimal base_currency_traded = proto.getBase_currency_traded();
            DecimalDto decimalDtoFromProto10 = base_currency_traded != null ? DecimalDto.INSTANCE.fromProto(base_currency_traded) : null;
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            NullableString position_id = proto.getPosition_id();
            NullableStringDto nullableStringDtoFromProto7 = position_id != null ? NullableStringDto.INSTANCE.fromProto(position_id) : null;
            Decimal non_denominated_currency_traded = proto.getNon_denominated_currency_traded();
            DecimalDto decimalDtoFromProto11 = non_denominated_currency_traded != null ? DecimalDto.INSTANCE.fromProto(non_denominated_currency_traded) : null;
            NullableString uti = proto.getUti();
            NullableStringDto nullableStringDtoFromProto8 = uti != null ? NullableStringDto.INSTANCE.fromProto(uti) : null;
            NullableString rel_tx_id = proto.getRel_tx_id();
            NullableStringDto nullableStringDtoFromProto9 = rel_tx_id != null ? NullableStringDto.INSTANCE.fromProto(rel_tx_id) : null;
            Time estimated_next_settlement_time = proto.getEstimated_next_settlement_time();
            TimeDto timeDtoFromProto5 = estimated_next_settlement_time != null ? TimeDto.INSTANCE.fromProto(estimated_next_settlement_time) : null;
            NullableString contra_firm_account = proto.getContra_firm_account();
            NullableStringDto nullableStringDtoFromProto10 = contra_firm_account != null ? NullableStringDto.INSTANCE.fromProto(contra_firm_account) : null;
            UUID associated_fx_execution_id = proto.getAssociated_fx_execution_id();
            UUIDDto uUIDDtoFromProto3 = associated_fx_execution_id != null ? UUIDDto.INSTANCE.fromProto(associated_fx_execution_id) : null;
            LastLiquidityIndDto lastLiquidityIndDtoFromProto = LastLiquidityIndDto.INSTANCE.fromProto(proto.getLast_liquidity_ind());
            Decimal fx_fee_in_bps = proto.getFx_fee_in_bps();
            DecimalDto decimalDtoFromProto12 = fx_fee_in_bps != null ? DecimalDto.INSTANCE.fromProto(fx_fee_in_bps) : null;
            ExecutionFees execution_fees = proto.getExecution_fees();
            ExecutionFeesDto executionFeesDtoFromProto = execution_fees != null ? ExecutionFeesDto.INSTANCE.fromProto(execution_fees) : null;
            VenueExecutionDetails venue_details = proto.getVenue_details();
            VenueExecutionDetailsDto venueExecutionDetailsDtoFromProto = venue_details != null ? VenueExecutionDetailsDto.INSTANCE.fromProto(venue_details) : null;
            FractionalExecutionDetails fractional_details = proto.getFractional_details();
            FractionalExecutionDetailsDto fractionalExecutionDetailsDtoFromProto = fractional_details != null ? FractionalExecutionDetailsDto.INSTANCE.fromProto(fractional_details) : null;
            IPOExecutionDetails ipo_details = proto.getIpo_details();
            return new OrderUpdateExecutionDto(new Surrogate(uUIDDtoFromProto, decimalDtoFromProto, decimalDtoFromProto2, timeDtoFromProto, timeDtoFromProto2, fill, exec_broker, version, broker_id, nullableStringDtoFromProto, decimalDtoFromProto3, uUIDDtoFromProto2, nullableStringDtoFromProto2, nullableStringDtoFromProto3, nullableStringDtoFromProto4, timeDtoFromProto3, timeDtoFromProto4, routeDtoFromProto, decimalDtoFromProto4, decimalDtoFromProto5, decimalDtoFromProto6, tradeBreakAgentDtoFromProto, arrayList, tradeTypeDtoFromProto, nullableStringDtoFromProto5, decimalDtoFromProto7, decimalDtoFromProto8, nullableStringDtoFromProto6, decimalDtoFromProto9, decimalDtoFromProto10, sideDtoFromProto, nullableStringDtoFromProto7, decimalDtoFromProto11, nullableStringDtoFromProto8, nullableStringDtoFromProto9, timeDtoFromProto5, nullableStringDtoFromProto10, uUIDDtoFromProto3, lastLiquidityIndDtoFromProto, decimalDtoFromProto12, executionFeesDtoFromProto, venueExecutionDetailsDtoFromProto, fractionalExecutionDetailsDtoFromProto, ipo_details != null ? IPOExecutionDetailsDto.INSTANCE.fromProto(ipo_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderUpdateExecutionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderUpdateExecutionDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new OrderUpdateExecutionDto(null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderUpdateExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "VenueDetails", "FractionalDetails", "IpoDetails", "Companion", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto$FractionalDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto$IpoDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto$VenueDetails;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ExtraDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ExtraDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ExtraDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: OrderUpdateExecutionDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto$VenueDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/VenueExecutionDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class VenueDetails extends ExtraDetailsDto {
            private final VenueExecutionDetailsDto value;

            public static /* synthetic */ VenueDetails copy$default(VenueDetails venueDetails, VenueExecutionDetailsDto venueExecutionDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    venueExecutionDetailsDto = venueDetails.value;
                }
                return venueDetails.copy(venueExecutionDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final VenueExecutionDetailsDto getValue() {
                return this.value;
            }

            public final VenueDetails copy(VenueExecutionDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new VenueDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VenueDetails) && Intrinsics.areEqual(this.value, ((VenueDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "VenueDetails(value=" + this.value + ")";
            }

            public final VenueExecutionDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VenueDetails(VenueExecutionDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderUpdateExecutionDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto$FractionalDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/FractionalExecutionDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FractionalDetails extends ExtraDetailsDto {
            private final FractionalExecutionDetailsDto value;

            public static /* synthetic */ FractionalDetails copy$default(FractionalDetails fractionalDetails, FractionalExecutionDetailsDto fractionalExecutionDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    fractionalExecutionDetailsDto = fractionalDetails.value;
                }
                return fractionalDetails.copy(fractionalExecutionDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final FractionalExecutionDetailsDto getValue() {
                return this.value;
            }

            public final FractionalDetails copy(FractionalExecutionDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new FractionalDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FractionalDetails) && Intrinsics.areEqual(this.value, ((FractionalDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FractionalDetails(value=" + this.value + ")";
            }

            public final FractionalExecutionDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FractionalDetails(FractionalExecutionDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderUpdateExecutionDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto$IpoDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/IPOExecutionDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IpoDetails extends ExtraDetailsDto {
            private final IPOExecutionDetailsDto value;

            public static /* synthetic */ IpoDetails copy$default(IpoDetails ipoDetails, IPOExecutionDetailsDto iPOExecutionDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    iPOExecutionDetailsDto = ipoDetails.value;
                }
                return ipoDetails.copy(iPOExecutionDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final IPOExecutionDetailsDto getValue() {
                return this.value;
            }

            public final IpoDetails copy(IPOExecutionDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new IpoDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IpoDetails) && Intrinsics.areEqual(this.value, ((IpoDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IpoDetails(value=" + this.value + ")";
            }

            public final IPOExecutionDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IpoDetails(IPOExecutionDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderUpdateExecutionDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$ExtraDetailsDto;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecution;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Companion implements Dto4.Creator<ExtraDetailsDto, OrderUpdateExecution> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OrderUpdateExecution> getProtoAdapter() {
                return OrderUpdateExecution.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExtraDetailsDto fromProto(OrderUpdateExecution proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getVenue_details() != null) {
                    return new VenueDetails(VenueExecutionDetailsDto.INSTANCE.fromProto(proto.getVenue_details()));
                }
                if (proto.getFractional_details() != null) {
                    return new FractionalDetails(FractionalExecutionDetailsDto.INSTANCE.fromProto(proto.getFractional_details()));
                }
                if (proto.getIpo_details() != null) {
                    return new IpoDetails(IPOExecutionDetailsDto.INSTANCE.fromProto(proto.getIpo_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: OrderUpdateExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderUpdateExecutionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OrderUpdateExecution", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderUpdateExecutionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderUpdateExecutionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderUpdateExecutionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderUpdateExecutionDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OrderUpdateExecutionDto";
        }
    }
}
