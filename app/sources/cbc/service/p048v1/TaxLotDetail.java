package cbc.service.p048v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: TaxLotDetail.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 h2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001hBé\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020\b\u0012\b\b\u0002\u0010+\u001a\u00020\b\u0012\b\b\u0002\u0010,\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020'\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00100\u001a\u000201¢\u0006\u0004\b2\u00103J\b\u0010`\u001a\u00020\u0002H\u0017J\u0013\u0010a\u001a\u00020'2\b\u0010b\u001a\u0004\u0018\u00010cH\u0096\u0002J\b\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020\bH\u0016Jè\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020'2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u000201R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0016\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0016\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00109R\u0016\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00109R\u0016\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0016\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00109R\u0016\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00109R\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00109R\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0016\u0010 \u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00109R\u0016\u0010!\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00109R\u0016\u0010\"\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00109R\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0016\u0010%\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00109R\u0016\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0016\u0010(\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00109R\u0016\u0010)\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00109R\u0016\u0010*\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00109R\u0016\u0010+\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00109R\u0016\u0010,\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00109R\u0016\u0010-\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010XR\u0018\u0010.\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_¨\u0006i"}, m3636d2 = {"Lcbc/service/v1/TaxLotDetail;", "Lcom/squareup/wire/Message;", "", "update_type", "Lcbc/service/v1/UpdateType;", "lot_type", "Lcbc/service/v1/LotType;", "symbol", "", "instrument_id", "open_lot_id", "close_lot_id", "open_order_id", "close_order_id", "instrument_type", "Lcbc/service/v1/InstrumentType;", "inv_type", "Lcbc/service/v1/InvType;", "open_tran_type", "Lcbc/service/v1/TranType;", "close_tran_type", "open_date", "close_date", "quantity", "fees", "book_cost_basis", "book_proceeds", "realized_gain_loss", "seq_no", "", "brokeback_enriched_details", "Lcbc/service/v1/BrokebackEnrichedDetails;", "open_fee", "close_fee", "tax_cost_basis", "term", "Lcbc/service/v1/TermType;", "tax_gain_loss", "ignore_seq_no_constraint", "", "gk_open_id", "gk_close_id", "intra_day_touched_date", "last_gk_sync_date", "gift_status", "is_wash_sale", "nummus_enriched_details", "Lcbc/service/v1/NummusEnrichedDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcbc/service/v1/UpdateType;Lcbc/service/v1/LotType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/InstrumentType;Lcbc/service/v1/InvType;Lcbc/service/v1/TranType;Lcbc/service/v1/TranType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcbc/service/v1/BrokebackEnrichedDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/TermType;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcbc/service/v1/NummusEnrichedDetails;Lokio/ByteString;)V", "getUpdate_type", "()Lcbc/service/v1/UpdateType;", "getLot_type", "()Lcbc/service/v1/LotType;", "getSymbol", "()Ljava/lang/String;", "getInstrument_id", "getOpen_lot_id", "getClose_lot_id", "getOpen_order_id", "getClose_order_id", "getInstrument_type", "()Lcbc/service/v1/InstrumentType;", "getInv_type", "()Lcbc/service/v1/InvType;", "getOpen_tran_type", "()Lcbc/service/v1/TranType;", "getClose_tran_type", "getOpen_date", "getClose_date", "getQuantity", "getFees", "getBook_cost_basis", "getBook_proceeds", "getRealized_gain_loss", "getSeq_no", "()J", "getBrokeback_enriched_details", "()Lcbc/service/v1/BrokebackEnrichedDetails;", "getOpen_fee", "getClose_fee", "getTax_cost_basis", "getTerm", "()Lcbc/service/v1/TermType;", "getTax_gain_loss", "getIgnore_seq_no_constraint", "()Z", "getGk_open_id", "getGk_close_id", "getIntra_day_touched_date", "getLast_gk_sync_date", "getGift_status", "getNummus_enriched_details", "()Lcbc/service/v1/NummusEnrichedDetails;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class TaxLotDetail extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotDetail> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bookCostBasis", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String book_cost_basis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bookProceeds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String book_proceeds;

    @WireField(adapter = "cbc.service.v1.BrokebackEnrichedDetails#ADAPTER", jsonName = "brokebackEnrichedDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final BrokebackEnrichedDetails brokeback_enriched_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "closeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String close_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "closeFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final String close_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "closeLotId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String close_lot_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "closeOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String close_order_id;

    @WireField(adapter = "cbc.service.v1.TranType#ADAPTER", jsonName = "closeTranType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final TranType close_tran_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "giftStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final String gift_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gkCloseId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final String gk_close_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gkOpenId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final String gk_open_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "ignoreSeqNoConstraint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final boolean ignore_seq_no_constraint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String instrument_id;

    @WireField(adapter = "cbc.service.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "intraDayTouchedDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final String intra_day_touched_date;

    @WireField(adapter = "cbc.service.v1.InvType#ADAPTER", jsonName = "invType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final InvType inv_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isWashSale", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 33)
    private final boolean is_wash_sale;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastGkSyncDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final String last_gk_sync_date;

    @WireField(adapter = "cbc.service.v1.LotType#ADAPTER", jsonName = "lotType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final LotType lot_type;

    @WireField(adapter = "cbc.service.v1.NummusEnrichedDetails#ADAPTER", jsonName = "nummusEnrichedDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 34)
    private final NummusEnrichedDetails nummus_enriched_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String open_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String open_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openLotId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String open_lot_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String open_order_id;

    @WireField(adapter = "cbc.service.v1.TranType#ADAPTER", jsonName = "openTranType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final TranType open_tran_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "realizedGainLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String realized_gain_loss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "seqNo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final long seq_no;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "taxCostBasis", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final String tax_cost_basis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "taxGainLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final String tax_gain_loss;

    @WireField(adapter = "cbc.service.v1.TermType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final TermType term;

    @WireField(adapter = "cbc.service.v1.UpdateType#ADAPTER", jsonName = "updateType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UpdateType update_type;

    public TaxLotDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, -1, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9091newBuilder();
    }

    public final UpdateType getUpdate_type() {
        return this.update_type;
    }

    public /* synthetic */ TaxLotDetail(UpdateType updateType, LotType lotType, String str, String str2, String str3, String str4, String str5, String str6, InstrumentType instrumentType, InvType invType, TranType tranType, TranType tranType2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, BrokebackEnrichedDetails brokebackEnrichedDetails, String str14, String str15, String str16, TermType termType, String str17, boolean z, String str18, String str19, String str20, String str21, String str22, boolean z2, NummusEnrichedDetails nummusEnrichedDetails, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UpdateType.UPDATE_TYPE_UNSPECIFIED : updateType, (i & 2) != 0 ? LotType.LOT_TYPE_UNSPECIFIED : lotType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 512) != 0 ? InvType.INV_TYPE_UNSPECIFIED : invType, (i & 1024) != 0 ? TranType.TRAN_TYPE_UNSPECIFIED : tranType, (i & 2048) != 0 ? TranType.TRAN_TYPE_UNSPECIFIED : tranType2, (i & 4096) != 0 ? "" : str7, (i & 8192) != 0 ? "" : str8, (i & 16384) != 0 ? "" : str9, (i & 32768) != 0 ? "" : str10, (i & 65536) != 0 ? "" : str11, (i & 131072) != 0 ? "" : str12, (i & 262144) != 0 ? "" : str13, (i & 524288) != 0 ? 0L : j, (i & 1048576) != 0 ? null : brokebackEnrichedDetails, (i & 2097152) != 0 ? "" : str14, (i & 4194304) != 0 ? "" : str15, (i & 8388608) != 0 ? "" : str16, (i & 16777216) != 0 ? TermType.TERM_TYPE_UNSPECIFIED : termType, (i & 33554432) != 0 ? "" : str17, (i & 67108864) != 0 ? false : z, (i & 134217728) != 0 ? "" : str18, (i & 268435456) != 0 ? "" : str19, (i & 536870912) != 0 ? "" : str20, (i & 1073741824) != 0 ? "" : str21, (i & Integer.MIN_VALUE) == 0 ? str22 : "", (i2 & 1) == 0 ? z2 : false, (i2 & 2) == 0 ? nummusEnrichedDetails : null, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final LotType getLot_type() {
        return this.lot_type;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getOpen_lot_id() {
        return this.open_lot_id;
    }

    public final String getClose_lot_id() {
        return this.close_lot_id;
    }

    public final String getOpen_order_id() {
        return this.open_order_id;
    }

    public final String getClose_order_id() {
        return this.close_order_id;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final InvType getInv_type() {
        return this.inv_type;
    }

    public final TranType getOpen_tran_type() {
        return this.open_tran_type;
    }

    public final TranType getClose_tran_type() {
        return this.close_tran_type;
    }

    public final String getOpen_date() {
        return this.open_date;
    }

    public final String getClose_date() {
        return this.close_date;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getFees() {
        return this.fees;
    }

    public final String getBook_cost_basis() {
        return this.book_cost_basis;
    }

    public final String getBook_proceeds() {
        return this.book_proceeds;
    }

    public final String getRealized_gain_loss() {
        return this.realized_gain_loss;
    }

    public final long getSeq_no() {
        return this.seq_no;
    }

    public final BrokebackEnrichedDetails getBrokeback_enriched_details() {
        return this.brokeback_enriched_details;
    }

    public final String getOpen_fee() {
        return this.open_fee;
    }

    public final String getClose_fee() {
        return this.close_fee;
    }

    public final String getTax_cost_basis() {
        return this.tax_cost_basis;
    }

    public final TermType getTerm() {
        return this.term;
    }

    public final String getTax_gain_loss() {
        return this.tax_gain_loss;
    }

    public final boolean getIgnore_seq_no_constraint() {
        return this.ignore_seq_no_constraint;
    }

    public final String getGk_open_id() {
        return this.gk_open_id;
    }

    public final String getGk_close_id() {
        return this.gk_close_id;
    }

    public final String getIntra_day_touched_date() {
        return this.intra_day_touched_date;
    }

    public final String getLast_gk_sync_date() {
        return this.last_gk_sync_date;
    }

    public final String getGift_status() {
        return this.gift_status;
    }

    /* renamed from: is_wash_sale, reason: from getter */
    public final boolean getIs_wash_sale() {
        return this.is_wash_sale;
    }

    public final NummusEnrichedDetails getNummus_enriched_details() {
        return this.nummus_enriched_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotDetail(UpdateType update_type, LotType lot_type, String symbol, String instrument_id, String open_lot_id, String close_lot_id, String open_order_id, String close_order_id, InstrumentType instrument_type, InvType inv_type, TranType open_tran_type, TranType close_tran_type, String open_date, String close_date, String quantity, String fees, String book_cost_basis, String book_proceeds, String realized_gain_loss, long j, BrokebackEnrichedDetails brokebackEnrichedDetails, String open_fee, String close_fee, String tax_cost_basis, TermType term, String tax_gain_loss, boolean z, String gk_open_id, String gk_close_id, String intra_day_touched_date, String last_gk_sync_date, String gift_status, boolean z2, NummusEnrichedDetails nummusEnrichedDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(update_type, "update_type");
        Intrinsics.checkNotNullParameter(lot_type, "lot_type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(close_lot_id, "close_lot_id");
        Intrinsics.checkNotNullParameter(open_order_id, "open_order_id");
        Intrinsics.checkNotNullParameter(close_order_id, "close_order_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(inv_type, "inv_type");
        Intrinsics.checkNotNullParameter(open_tran_type, "open_tran_type");
        Intrinsics.checkNotNullParameter(close_tran_type, "close_tran_type");
        Intrinsics.checkNotNullParameter(open_date, "open_date");
        Intrinsics.checkNotNullParameter(close_date, "close_date");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(book_cost_basis, "book_cost_basis");
        Intrinsics.checkNotNullParameter(book_proceeds, "book_proceeds");
        Intrinsics.checkNotNullParameter(realized_gain_loss, "realized_gain_loss");
        Intrinsics.checkNotNullParameter(open_fee, "open_fee");
        Intrinsics.checkNotNullParameter(close_fee, "close_fee");
        Intrinsics.checkNotNullParameter(tax_cost_basis, "tax_cost_basis");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(tax_gain_loss, "tax_gain_loss");
        Intrinsics.checkNotNullParameter(gk_open_id, "gk_open_id");
        Intrinsics.checkNotNullParameter(gk_close_id, "gk_close_id");
        Intrinsics.checkNotNullParameter(intra_day_touched_date, "intra_day_touched_date");
        Intrinsics.checkNotNullParameter(last_gk_sync_date, "last_gk_sync_date");
        Intrinsics.checkNotNullParameter(gift_status, "gift_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.update_type = update_type;
        this.lot_type = lot_type;
        this.symbol = symbol;
        this.instrument_id = instrument_id;
        this.open_lot_id = open_lot_id;
        this.close_lot_id = close_lot_id;
        this.open_order_id = open_order_id;
        this.close_order_id = close_order_id;
        this.instrument_type = instrument_type;
        this.inv_type = inv_type;
        this.open_tran_type = open_tran_type;
        this.close_tran_type = close_tran_type;
        this.open_date = open_date;
        this.close_date = close_date;
        this.quantity = quantity;
        this.fees = fees;
        this.book_cost_basis = book_cost_basis;
        this.book_proceeds = book_proceeds;
        this.realized_gain_loss = realized_gain_loss;
        this.seq_no = j;
        this.brokeback_enriched_details = brokebackEnrichedDetails;
        this.open_fee = open_fee;
        this.close_fee = close_fee;
        this.tax_cost_basis = tax_cost_basis;
        this.term = term;
        this.tax_gain_loss = tax_gain_loss;
        this.ignore_seq_no_constraint = z;
        this.gk_open_id = gk_open_id;
        this.gk_close_id = gk_close_id;
        this.intra_day_touched_date = intra_day_touched_date;
        this.last_gk_sync_date = last_gk_sync_date;
        this.gift_status = gift_status;
        this.is_wash_sale = z2;
        this.nummus_enriched_details = nummusEnrichedDetails;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9091newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotDetail)) {
            return false;
        }
        TaxLotDetail taxLotDetail = (TaxLotDetail) other;
        return Intrinsics.areEqual(unknownFields(), taxLotDetail.unknownFields()) && this.update_type == taxLotDetail.update_type && this.lot_type == taxLotDetail.lot_type && Intrinsics.areEqual(this.symbol, taxLotDetail.symbol) && Intrinsics.areEqual(this.instrument_id, taxLotDetail.instrument_id) && Intrinsics.areEqual(this.open_lot_id, taxLotDetail.open_lot_id) && Intrinsics.areEqual(this.close_lot_id, taxLotDetail.close_lot_id) && Intrinsics.areEqual(this.open_order_id, taxLotDetail.open_order_id) && Intrinsics.areEqual(this.close_order_id, taxLotDetail.close_order_id) && this.instrument_type == taxLotDetail.instrument_type && this.inv_type == taxLotDetail.inv_type && this.open_tran_type == taxLotDetail.open_tran_type && this.close_tran_type == taxLotDetail.close_tran_type && Intrinsics.areEqual(this.open_date, taxLotDetail.open_date) && Intrinsics.areEqual(this.close_date, taxLotDetail.close_date) && Intrinsics.areEqual(this.quantity, taxLotDetail.quantity) && Intrinsics.areEqual(this.fees, taxLotDetail.fees) && Intrinsics.areEqual(this.book_cost_basis, taxLotDetail.book_cost_basis) && Intrinsics.areEqual(this.book_proceeds, taxLotDetail.book_proceeds) && Intrinsics.areEqual(this.realized_gain_loss, taxLotDetail.realized_gain_loss) && this.seq_no == taxLotDetail.seq_no && Intrinsics.areEqual(this.brokeback_enriched_details, taxLotDetail.brokeback_enriched_details) && Intrinsics.areEqual(this.open_fee, taxLotDetail.open_fee) && Intrinsics.areEqual(this.close_fee, taxLotDetail.close_fee) && Intrinsics.areEqual(this.tax_cost_basis, taxLotDetail.tax_cost_basis) && this.term == taxLotDetail.term && Intrinsics.areEqual(this.tax_gain_loss, taxLotDetail.tax_gain_loss) && this.ignore_seq_no_constraint == taxLotDetail.ignore_seq_no_constraint && Intrinsics.areEqual(this.gk_open_id, taxLotDetail.gk_open_id) && Intrinsics.areEqual(this.gk_close_id, taxLotDetail.gk_close_id) && Intrinsics.areEqual(this.intra_day_touched_date, taxLotDetail.intra_day_touched_date) && Intrinsics.areEqual(this.last_gk_sync_date, taxLotDetail.last_gk_sync_date) && Intrinsics.areEqual(this.gift_status, taxLotDetail.gift_status) && this.is_wash_sale == taxLotDetail.is_wash_sale && Intrinsics.areEqual(this.nummus_enriched_details, taxLotDetail.nummus_enriched_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.update_type.hashCode()) * 37) + this.lot_type.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.open_lot_id.hashCode()) * 37) + this.close_lot_id.hashCode()) * 37) + this.open_order_id.hashCode()) * 37) + this.close_order_id.hashCode()) * 37) + this.instrument_type.hashCode()) * 37) + this.inv_type.hashCode()) * 37) + this.open_tran_type.hashCode()) * 37) + this.close_tran_type.hashCode()) * 37) + this.open_date.hashCode()) * 37) + this.close_date.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.fees.hashCode()) * 37) + this.book_cost_basis.hashCode()) * 37) + this.book_proceeds.hashCode()) * 37) + this.realized_gain_loss.hashCode()) * 37) + Long.hashCode(this.seq_no)) * 37;
        BrokebackEnrichedDetails brokebackEnrichedDetails = this.brokeback_enriched_details;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (brokebackEnrichedDetails != null ? brokebackEnrichedDetails.hashCode() : 0)) * 37) + this.open_fee.hashCode()) * 37) + this.close_fee.hashCode()) * 37) + this.tax_cost_basis.hashCode()) * 37) + this.term.hashCode()) * 37) + this.tax_gain_loss.hashCode()) * 37) + Boolean.hashCode(this.ignore_seq_no_constraint)) * 37) + this.gk_open_id.hashCode()) * 37) + this.gk_close_id.hashCode()) * 37) + this.intra_day_touched_date.hashCode()) * 37) + this.last_gk_sync_date.hashCode()) * 37) + this.gift_status.hashCode()) * 37) + Boolean.hashCode(this.is_wash_sale)) * 37;
        NummusEnrichedDetails nummusEnrichedDetails = this.nummus_enriched_details;
        int iHashCode3 = iHashCode2 + (nummusEnrichedDetails != null ? nummusEnrichedDetails.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("update_type=" + this.update_type);
        arrayList.add("lot_type=" + this.lot_type);
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("open_lot_id=" + Internal.sanitize(this.open_lot_id));
        arrayList.add("close_lot_id=" + Internal.sanitize(this.close_lot_id));
        arrayList.add("open_order_id=" + Internal.sanitize(this.open_order_id));
        arrayList.add("close_order_id=" + Internal.sanitize(this.close_order_id));
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("inv_type=" + this.inv_type);
        arrayList.add("open_tran_type=" + this.open_tran_type);
        arrayList.add("close_tran_type=" + this.close_tran_type);
        arrayList.add("open_date=" + Internal.sanitize(this.open_date));
        arrayList.add("close_date=" + Internal.sanitize(this.close_date));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("fees=" + Internal.sanitize(this.fees));
        arrayList.add("book_cost_basis=" + Internal.sanitize(this.book_cost_basis));
        arrayList.add("book_proceeds=" + Internal.sanitize(this.book_proceeds));
        arrayList.add("realized_gain_loss=" + Internal.sanitize(this.realized_gain_loss));
        arrayList.add("seq_no=" + this.seq_no);
        BrokebackEnrichedDetails brokebackEnrichedDetails = this.brokeback_enriched_details;
        if (brokebackEnrichedDetails != null) {
            arrayList.add("brokeback_enriched_details=" + brokebackEnrichedDetails);
        }
        arrayList.add("open_fee=" + Internal.sanitize(this.open_fee));
        arrayList.add("close_fee=" + Internal.sanitize(this.close_fee));
        arrayList.add("tax_cost_basis=" + Internal.sanitize(this.tax_cost_basis));
        arrayList.add("term=" + this.term);
        arrayList.add("tax_gain_loss=" + Internal.sanitize(this.tax_gain_loss));
        arrayList.add("ignore_seq_no_constraint=" + this.ignore_seq_no_constraint);
        arrayList.add("gk_open_id=" + Internal.sanitize(this.gk_open_id));
        arrayList.add("gk_close_id=" + Internal.sanitize(this.gk_close_id));
        arrayList.add("intra_day_touched_date=" + Internal.sanitize(this.intra_day_touched_date));
        arrayList.add("last_gk_sync_date=" + Internal.sanitize(this.last_gk_sync_date));
        arrayList.add("gift_status=" + Internal.sanitize(this.gift_status));
        arrayList.add("is_wash_sale=" + this.is_wash_sale);
        NummusEnrichedDetails nummusEnrichedDetails = this.nummus_enriched_details;
        if (nummusEnrichedDetails != null) {
            arrayList.add("nummus_enriched_details=" + nummusEnrichedDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotDetail{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLotDetail copy$default(TaxLotDetail taxLotDetail, UpdateType updateType, LotType lotType, String str, String str2, String str3, String str4, String str5, String str6, InstrumentType instrumentType, InvType invType, TranType tranType, TranType tranType2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, BrokebackEnrichedDetails brokebackEnrichedDetails, String str14, String str15, String str16, TermType termType, String str17, boolean z, String str18, String str19, String str20, String str21, String str22, boolean z2, NummusEnrichedDetails nummusEnrichedDetails, ByteString byteString, int i, int i2, Object obj) {
        UpdateType updateType2 = (i & 1) != 0 ? taxLotDetail.update_type : updateType;
        LotType lotType2 = (i & 2) != 0 ? taxLotDetail.lot_type : lotType;
        String str23 = (i & 4) != 0 ? taxLotDetail.symbol : str;
        String str24 = (i & 8) != 0 ? taxLotDetail.instrument_id : str2;
        String str25 = (i & 16) != 0 ? taxLotDetail.open_lot_id : str3;
        String str26 = (i & 32) != 0 ? taxLotDetail.close_lot_id : str4;
        String str27 = (i & 64) != 0 ? taxLotDetail.open_order_id : str5;
        String str28 = (i & 128) != 0 ? taxLotDetail.close_order_id : str6;
        InstrumentType instrumentType2 = (i & 256) != 0 ? taxLotDetail.instrument_type : instrumentType;
        InvType invType2 = (i & 512) != 0 ? taxLotDetail.inv_type : invType;
        TranType tranType3 = (i & 1024) != 0 ? taxLotDetail.open_tran_type : tranType;
        TranType tranType4 = (i & 2048) != 0 ? taxLotDetail.close_tran_type : tranType2;
        String str29 = (i & 4096) != 0 ? taxLotDetail.open_date : str7;
        String str30 = (i & 8192) != 0 ? taxLotDetail.close_date : str8;
        UpdateType updateType3 = updateType2;
        String str31 = (i & 16384) != 0 ? taxLotDetail.quantity : str9;
        return taxLotDetail.copy(updateType3, lotType2, str23, str24, str25, str26, str27, str28, instrumentType2, invType2, tranType3, tranType4, str29, str30, str31, (i & 32768) != 0 ? taxLotDetail.fees : str10, (i & 65536) != 0 ? taxLotDetail.book_cost_basis : str11, (i & 131072) != 0 ? taxLotDetail.book_proceeds : str12, (i & 262144) != 0 ? taxLotDetail.realized_gain_loss : str13, (i & 524288) != 0 ? taxLotDetail.seq_no : j, (i & 1048576) != 0 ? taxLotDetail.brokeback_enriched_details : brokebackEnrichedDetails, (i & 2097152) != 0 ? taxLotDetail.open_fee : str14, (i & 4194304) != 0 ? taxLotDetail.close_fee : str15, (i & 8388608) != 0 ? taxLotDetail.tax_cost_basis : str16, (i & 16777216) != 0 ? taxLotDetail.term : termType, (i & 33554432) != 0 ? taxLotDetail.tax_gain_loss : str17, (i & 67108864) != 0 ? taxLotDetail.ignore_seq_no_constraint : z, (i & 134217728) != 0 ? taxLotDetail.gk_open_id : str18, (i & 268435456) != 0 ? taxLotDetail.gk_close_id : str19, (i & 536870912) != 0 ? taxLotDetail.intra_day_touched_date : str20, (i & 1073741824) != 0 ? taxLotDetail.last_gk_sync_date : str21, (i & Integer.MIN_VALUE) != 0 ? taxLotDetail.gift_status : str22, (i2 & 1) != 0 ? taxLotDetail.is_wash_sale : z2, (i2 & 2) != 0 ? taxLotDetail.nummus_enriched_details : nummusEnrichedDetails, (i2 & 4) != 0 ? taxLotDetail.unknownFields() : byteString);
    }

    public final TaxLotDetail copy(UpdateType update_type, LotType lot_type, String symbol, String instrument_id, String open_lot_id, String close_lot_id, String open_order_id, String close_order_id, InstrumentType instrument_type, InvType inv_type, TranType open_tran_type, TranType close_tran_type, String open_date, String close_date, String quantity, String fees, String book_cost_basis, String book_proceeds, String realized_gain_loss, long seq_no, BrokebackEnrichedDetails brokeback_enriched_details, String open_fee, String close_fee, String tax_cost_basis, TermType term, String tax_gain_loss, boolean ignore_seq_no_constraint, String gk_open_id, String gk_close_id, String intra_day_touched_date, String last_gk_sync_date, String gift_status, boolean is_wash_sale, NummusEnrichedDetails nummus_enriched_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(update_type, "update_type");
        Intrinsics.checkNotNullParameter(lot_type, "lot_type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(open_lot_id, "open_lot_id");
        Intrinsics.checkNotNullParameter(close_lot_id, "close_lot_id");
        Intrinsics.checkNotNullParameter(open_order_id, "open_order_id");
        Intrinsics.checkNotNullParameter(close_order_id, "close_order_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(inv_type, "inv_type");
        Intrinsics.checkNotNullParameter(open_tran_type, "open_tran_type");
        Intrinsics.checkNotNullParameter(close_tran_type, "close_tran_type");
        Intrinsics.checkNotNullParameter(open_date, "open_date");
        Intrinsics.checkNotNullParameter(close_date, "close_date");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(book_cost_basis, "book_cost_basis");
        Intrinsics.checkNotNullParameter(book_proceeds, "book_proceeds");
        Intrinsics.checkNotNullParameter(realized_gain_loss, "realized_gain_loss");
        Intrinsics.checkNotNullParameter(open_fee, "open_fee");
        Intrinsics.checkNotNullParameter(close_fee, "close_fee");
        Intrinsics.checkNotNullParameter(tax_cost_basis, "tax_cost_basis");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(tax_gain_loss, "tax_gain_loss");
        Intrinsics.checkNotNullParameter(gk_open_id, "gk_open_id");
        Intrinsics.checkNotNullParameter(gk_close_id, "gk_close_id");
        Intrinsics.checkNotNullParameter(intra_day_touched_date, "intra_day_touched_date");
        Intrinsics.checkNotNullParameter(last_gk_sync_date, "last_gk_sync_date");
        Intrinsics.checkNotNullParameter(gift_status, "gift_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotDetail(update_type, lot_type, symbol, instrument_id, open_lot_id, close_lot_id, open_order_id, close_order_id, instrument_type, inv_type, open_tran_type, close_tran_type, open_date, close_date, quantity, fees, book_cost_basis, book_proceeds, realized_gain_loss, seq_no, brokeback_enriched_details, open_fee, close_fee, tax_cost_basis, term, tax_gain_loss, ignore_seq_no_constraint, gk_open_id, gk_close_id, intra_day_touched_date, last_gk_sync_date, gift_status, is_wash_sale, nummus_enriched_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: cbc.service.v1.TaxLotDetail$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getUpdate_type() != UpdateType.UPDATE_TYPE_UNSPECIFIED) {
                    size += UpdateType.ADAPTER.encodedSizeWithTag(1, value.getUpdate_type());
                }
                if (value.getLot_type() != LotType.LOT_TYPE_UNSPECIFIED) {
                    size += LotType.ADAPTER.encodedSizeWithTag(2, value.getLot_type());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOpen_lot_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getOpen_lot_id());
                }
                if (!Intrinsics.areEqual(value.getClose_lot_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getClose_lot_id());
                }
                if (!Intrinsics.areEqual(value.getOpen_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getOpen_order_id());
                }
                if (!Intrinsics.areEqual(value.getClose_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getClose_order_id());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(9, value.getInstrument_type());
                }
                if (value.getInv_type() != InvType.INV_TYPE_UNSPECIFIED) {
                    size += InvType.ADAPTER.encodedSizeWithTag(10, value.getInv_type());
                }
                TranType open_tran_type = value.getOpen_tran_type();
                TranType tranType = TranType.TRAN_TYPE_UNSPECIFIED;
                if (open_tran_type != tranType) {
                    size += TranType.ADAPTER.encodedSizeWithTag(11, value.getOpen_tran_type());
                }
                if (value.getClose_tran_type() != tranType) {
                    size += TranType.ADAPTER.encodedSizeWithTag(12, value.getClose_tran_type());
                }
                if (!Intrinsics.areEqual(value.getOpen_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getOpen_date());
                }
                if (!Intrinsics.areEqual(value.getClose_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getClose_date());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getFees(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getFees());
                }
                if (!Intrinsics.areEqual(value.getBook_cost_basis(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getBook_cost_basis());
                }
                if (!Intrinsics.areEqual(value.getBook_proceeds(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getBook_proceeds());
                }
                if (!Intrinsics.areEqual(value.getRealized_gain_loss(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getRealized_gain_loss());
                }
                if (value.getSeq_no() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(20, Long.valueOf(value.getSeq_no()));
                }
                if (value.getBrokeback_enriched_details() != null) {
                    size += BrokebackEnrichedDetails.ADAPTER.encodedSizeWithTag(21, value.getBrokeback_enriched_details());
                }
                if (!Intrinsics.areEqual(value.getOpen_fee(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getOpen_fee());
                }
                if (!Intrinsics.areEqual(value.getClose_fee(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(23, value.getClose_fee());
                }
                if (!Intrinsics.areEqual(value.getTax_cost_basis(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(24, value.getTax_cost_basis());
                }
                if (value.getTerm() != TermType.TERM_TYPE_UNSPECIFIED) {
                    size += TermType.ADAPTER.encodedSizeWithTag(25, value.getTerm());
                }
                if (!Intrinsics.areEqual(value.getTax_gain_loss(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(26, value.getTax_gain_loss());
                }
                if (value.getIgnore_seq_no_constraint()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(27, Boolean.valueOf(value.getIgnore_seq_no_constraint()));
                }
                if (!Intrinsics.areEqual(value.getGk_open_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(28, value.getGk_open_id());
                }
                if (!Intrinsics.areEqual(value.getGk_close_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(29, value.getGk_close_id());
                }
                if (!Intrinsics.areEqual(value.getIntra_day_touched_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(30, value.getIntra_day_touched_date());
                }
                if (!Intrinsics.areEqual(value.getLast_gk_sync_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(31, value.getLast_gk_sync_date());
                }
                if (!Intrinsics.areEqual(value.getGift_status(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(32, value.getGift_status());
                }
                if (value.getIs_wash_sale()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(33, Boolean.valueOf(value.getIs_wash_sale()));
                }
                return value.getNummus_enriched_details() != null ? size + NummusEnrichedDetails.ADAPTER.encodedSizeWithTag(34, value.getNummus_enriched_details()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUpdate_type() != UpdateType.UPDATE_TYPE_UNSPECIFIED) {
                    UpdateType.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpdate_type());
                }
                if (value.getLot_type() != LotType.LOT_TYPE_UNSPECIFIED) {
                    LotType.ADAPTER.encodeWithTag(writer, 2, (int) value.getLot_type());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getOpen_lot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOpen_lot_id());
                }
                if (!Intrinsics.areEqual(value.getClose_lot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getClose_lot_id());
                }
                if (!Intrinsics.areEqual(value.getOpen_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOpen_order_id());
                }
                if (!Intrinsics.areEqual(value.getClose_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getClose_order_id());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                if (value.getInv_type() != InvType.INV_TYPE_UNSPECIFIED) {
                    InvType.ADAPTER.encodeWithTag(writer, 10, (int) value.getInv_type());
                }
                TranType open_tran_type = value.getOpen_tran_type();
                TranType tranType = TranType.TRAN_TYPE_UNSPECIFIED;
                if (open_tran_type != tranType) {
                    TranType.ADAPTER.encodeWithTag(writer, 11, (int) value.getOpen_tran_type());
                }
                if (value.getClose_tran_type() != tranType) {
                    TranType.ADAPTER.encodeWithTag(writer, 12, (int) value.getClose_tran_type());
                }
                if (!Intrinsics.areEqual(value.getOpen_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getOpen_date());
                }
                if (!Intrinsics.areEqual(value.getClose_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getClose_date());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getFees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getFees());
                }
                if (!Intrinsics.areEqual(value.getBook_cost_basis(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getBook_cost_basis());
                }
                if (!Intrinsics.areEqual(value.getBook_proceeds(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getBook_proceeds());
                }
                if (!Intrinsics.areEqual(value.getRealized_gain_loss(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getRealized_gain_loss());
                }
                if (value.getSeq_no() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 20, (int) Long.valueOf(value.getSeq_no()));
                }
                if (value.getBrokeback_enriched_details() != null) {
                    BrokebackEnrichedDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getBrokeback_enriched_details());
                }
                if (!Intrinsics.areEqual(value.getOpen_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getOpen_fee());
                }
                if (!Intrinsics.areEqual(value.getClose_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 23, (int) value.getClose_fee());
                }
                if (!Intrinsics.areEqual(value.getTax_cost_basis(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getTax_cost_basis());
                }
                if (value.getTerm() != TermType.TERM_TYPE_UNSPECIFIED) {
                    TermType.ADAPTER.encodeWithTag(writer, 25, (int) value.getTerm());
                }
                if (!Intrinsics.areEqual(value.getTax_gain_loss(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getTax_gain_loss());
                }
                if (value.getIgnore_seq_no_constraint()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 27, (int) Boolean.valueOf(value.getIgnore_seq_no_constraint()));
                }
                if (!Intrinsics.areEqual(value.getGk_open_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 28, (int) value.getGk_open_id());
                }
                if (!Intrinsics.areEqual(value.getGk_close_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getGk_close_id());
                }
                if (!Intrinsics.areEqual(value.getIntra_day_touched_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getIntra_day_touched_date());
                }
                if (!Intrinsics.areEqual(value.getLast_gk_sync_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getLast_gk_sync_date());
                }
                if (!Intrinsics.areEqual(value.getGift_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 32, (int) value.getGift_status());
                }
                if (value.getIs_wash_sale()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 33, (int) Boolean.valueOf(value.getIs_wash_sale()));
                }
                if (value.getNummus_enriched_details() != null) {
                    NummusEnrichedDetails.ADAPTER.encodeWithTag(writer, 34, (int) value.getNummus_enriched_details());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNummus_enriched_details() != null) {
                    NummusEnrichedDetails.ADAPTER.encodeWithTag(writer, 34, (int) value.getNummus_enriched_details());
                }
                if (value.getIs_wash_sale()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 33, (int) Boolean.valueOf(value.getIs_wash_sale()));
                }
                if (!Intrinsics.areEqual(value.getGift_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 32, (int) value.getGift_status());
                }
                if (!Intrinsics.areEqual(value.getLast_gk_sync_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getLast_gk_sync_date());
                }
                if (!Intrinsics.areEqual(value.getIntra_day_touched_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getIntra_day_touched_date());
                }
                if (!Intrinsics.areEqual(value.getGk_close_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getGk_close_id());
                }
                if (!Intrinsics.areEqual(value.getGk_open_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 28, (int) value.getGk_open_id());
                }
                if (value.getIgnore_seq_no_constraint()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 27, (int) Boolean.valueOf(value.getIgnore_seq_no_constraint()));
                }
                if (!Intrinsics.areEqual(value.getTax_gain_loss(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getTax_gain_loss());
                }
                if (value.getTerm() != TermType.TERM_TYPE_UNSPECIFIED) {
                    TermType.ADAPTER.encodeWithTag(writer, 25, (int) value.getTerm());
                }
                if (!Intrinsics.areEqual(value.getTax_cost_basis(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getTax_cost_basis());
                }
                if (!Intrinsics.areEqual(value.getClose_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 23, (int) value.getClose_fee());
                }
                if (!Intrinsics.areEqual(value.getOpen_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getOpen_fee());
                }
                if (value.getBrokeback_enriched_details() != null) {
                    BrokebackEnrichedDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getBrokeback_enriched_details());
                }
                if (value.getSeq_no() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 20, (int) Long.valueOf(value.getSeq_no()));
                }
                if (!Intrinsics.areEqual(value.getRealized_gain_loss(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getRealized_gain_loss());
                }
                if (!Intrinsics.areEqual(value.getBook_proceeds(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getBook_proceeds());
                }
                if (!Intrinsics.areEqual(value.getBook_cost_basis(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getBook_cost_basis());
                }
                if (!Intrinsics.areEqual(value.getFees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getFees());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getClose_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getClose_date());
                }
                if (!Intrinsics.areEqual(value.getOpen_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getOpen_date());
                }
                TranType close_tran_type = value.getClose_tran_type();
                TranType tranType = TranType.TRAN_TYPE_UNSPECIFIED;
                if (close_tran_type != tranType) {
                    TranType.ADAPTER.encodeWithTag(writer, 12, (int) value.getClose_tran_type());
                }
                if (value.getOpen_tran_type() != tranType) {
                    TranType.ADAPTER.encodeWithTag(writer, 11, (int) value.getOpen_tran_type());
                }
                if (value.getInv_type() != InvType.INV_TYPE_UNSPECIFIED) {
                    InvType.ADAPTER.encodeWithTag(writer, 10, (int) value.getInv_type());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                if (!Intrinsics.areEqual(value.getClose_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getClose_order_id());
                }
                if (!Intrinsics.areEqual(value.getOpen_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getOpen_order_id());
                }
                if (!Intrinsics.areEqual(value.getClose_lot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getClose_lot_id());
                }
                if (!Intrinsics.areEqual(value.getOpen_lot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOpen_lot_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (value.getLot_type() != LotType.LOT_TYPE_UNSPECIFIED) {
                    LotType.ADAPTER.encodeWithTag(writer, 2, (int) value.getLot_type());
                }
                if (value.getUpdate_type() != UpdateType.UPDATE_TYPE_UNSPECIFIED) {
                    UpdateType.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpdate_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotDetail decode(ProtoReader reader) throws IOException {
                LotType lotType;
                InstrumentType instrumentType;
                InvType invType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                UpdateType updateType = UpdateType.UPDATE_TYPE_UNSPECIFIED;
                LotType lotType2 = LotType.LOT_TYPE_UNSPECIFIED;
                InstrumentType instrumentType2 = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                InvType invType2 = InvType.INV_TYPE_UNSPECIFIED;
                TranType tranType = TranType.TRAN_TYPE_UNSPECIFIED;
                TermType termType = TermType.TERM_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                UpdateType updateTypeDecode = updateType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                String strDecode16 = strDecode15;
                String strDecode17 = strDecode16;
                String strDecode18 = strDecode17;
                String strDecode19 = strDecode18;
                long jLongValue = 0;
                BrokebackEnrichedDetails brokebackEnrichedDetailsDecode = null;
                NummusEnrichedDetails nummusEnrichedDetailsDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                TranType tranTypeDecode = tranType;
                TermType termTypeDecode = termType;
                String strDecode20 = strDecode19;
                String strDecode21 = strDecode20;
                String strDecode22 = strDecode21;
                InvType invTypeDecode = invType2;
                TranType tranTypeDecode2 = tranTypeDecode;
                InstrumentType instrumentTypeDecode = instrumentType2;
                LotType lotTypeDecode = lotType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                lotType = lotTypeDecode;
                                instrumentType = instrumentTypeDecode;
                                invType = invTypeDecode;
                                try {
                                    updateTypeDecode = UpdateType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                lotTypeDecode = lotType;
                                instrumentTypeDecode = instrumentType;
                                invTypeDecode = invType;
                                break;
                            case 2:
                                lotType = lotTypeDecode;
                                instrumentType = instrumentTypeDecode;
                                invType = invTypeDecode;
                                try {
                                    lotTypeDecode = LotType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                instrumentTypeDecode = instrumentType;
                                invTypeDecode = invType;
                                break;
                            case 3:
                                strDecode20 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode21 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode22 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                lotType = lotTypeDecode;
                                instrumentType = instrumentTypeDecode;
                                invType = invTypeDecode;
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                    lotTypeDecode = lotType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                invTypeDecode = invType;
                                break;
                            case 10:
                                lotType = lotTypeDecode;
                                instrumentType = instrumentTypeDecode;
                                invType = invTypeDecode;
                                try {
                                    invTypeDecode = InvType.ADAPTER.decode(reader);
                                    lotTypeDecode = lotType;
                                    instrumentTypeDecode = instrumentType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 11:
                                lotType = lotTypeDecode;
                                instrumentType = instrumentTypeDecode;
                                invType = invTypeDecode;
                                try {
                                    tranTypeDecode2 = TranType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                lotTypeDecode = lotType;
                                instrumentTypeDecode = instrumentType;
                                invTypeDecode = invType;
                                break;
                            case 12:
                                lotType = lotTypeDecode;
                                instrumentType = instrumentTypeDecode;
                                invType = invTypeDecode;
                                try {
                                    tranTypeDecode = TranType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                }
                                lotTypeDecode = lotType;
                                instrumentTypeDecode = instrumentType;
                                invTypeDecode = invType;
                                break;
                            case 13:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 20:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                lotTypeDecode = lotTypeDecode;
                                break;
                            case 21:
                                brokebackEnrichedDetailsDecode = BrokebackEnrichedDetails.ADAPTER.decode(reader);
                                break;
                            case 22:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 23:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 24:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 25:
                                try {
                                    termTypeDecode = TermType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    lotType = lotTypeDecode;
                                    instrumentType = instrumentTypeDecode;
                                    invType = invTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                    break;
                                }
                            case 26:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 27:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 28:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 29:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 30:
                                strDecode17 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 31:
                                strDecode18 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 32:
                                strDecode19 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 33:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 34:
                                nummusEnrichedDetailsDecode = NummusEnrichedDetails.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                lotType = lotTypeDecode;
                                instrumentType = instrumentTypeDecode;
                                invType = invTypeDecode;
                                lotTypeDecode = lotType;
                                instrumentTypeDecode = instrumentType;
                                invTypeDecode = invType;
                                break;
                        }
                    } else {
                        return new TaxLotDetail(updateTypeDecode, lotTypeDecode, strDecode20, strDecode21, strDecode22, strDecode, strDecode2, strDecode3, instrumentTypeDecode, invTypeDecode, tranTypeDecode2, tranTypeDecode, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, jLongValue, brokebackEnrichedDetailsDecode, strDecode11, strDecode12, strDecode13, termTypeDecode, strDecode14, zBooleanValue, strDecode15, strDecode16, strDecode17, strDecode18, strDecode19, zBooleanValue2, nummusEnrichedDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotDetail redact(TaxLotDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BrokebackEnrichedDetails brokeback_enriched_details = value.getBrokeback_enriched_details();
                BrokebackEnrichedDetails brokebackEnrichedDetailsRedact = brokeback_enriched_details != null ? BrokebackEnrichedDetails.ADAPTER.redact(brokeback_enriched_details) : null;
                NummusEnrichedDetails nummus_enriched_details = value.getNummus_enriched_details();
                return TaxLotDetail.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, brokebackEnrichedDetailsRedact, null, null, null, null, null, false, null, null, null, null, null, false, nummus_enriched_details != null ? NummusEnrichedDetails.ADAPTER.redact(nummus_enriched_details) : null, ByteString.EMPTY, -1048577, 1, null);
            }
        };
    }
}
