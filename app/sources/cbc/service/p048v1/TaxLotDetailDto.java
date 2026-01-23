package cbc.service.p048v1;

import android.os.Parcel;
import android.os.Parcelable;
import cbc.service.p048v1.BrokebackEnrichedDetailsDto;
import cbc.service.p048v1.InstrumentTypeDto;
import cbc.service.p048v1.InvTypeDto;
import cbc.service.p048v1.LotTypeDto;
import cbc.service.p048v1.NummusEnrichedDetailsDto;
import cbc.service.p048v1.TermTypeDto;
import cbc.service.p048v1.TranTypeDto;
import cbc.service.p048v1.UpdateTypeDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TaxLotDetailDto.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004KJLMB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bá\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0002\u0010 \u001a\u00020\u001c\u0012\b\b\u0002\u0010!\u001a\u00020\u001c\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u001c\u0012\b\b\u0002\u0010'\u001a\u00020\u001c\u0012\b\b\u0002\u0010(\u001a\u00020\u001c\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\u001c\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010.\u001a\u00020\f\u0012\b\b\u0002\u0010/\u001a\u00020\f\u0012\b\b\u0002\u00100\u001a\u00020\f\u0012\b\b\u0002\u00101\u001a\u00020\f\u0012\b\b\u0002\u00102\u001a\u00020\f\u0012\b\b\u0002\u00103\u001a\u00020,\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b\u0006\u00106J\u000f\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020,2\b\u0010<\u001a\u0004\u0018\u00010;H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010F\u001a\u00020E2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020?H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020?H\u0016¢\u0006\u0004\bH\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010I¨\u0006N"}, m3636d2 = {"Lcbc/service/v1/TaxLotDetailDto;", "Lcom/robinhood/idl/MessageDto;", "Lcbc/service/v1/TaxLotDetail;", "Landroid/os/Parcelable;", "Lcbc/service/v1/TaxLotDetailDto$Surrogate;", "surrogate", "<init>", "(Lcbc/service/v1/TaxLotDetailDto$Surrogate;)V", "Lcbc/service/v1/UpdateTypeDto;", "update_type", "Lcbc/service/v1/LotTypeDto;", "lot_type", "", "symbol", "instrument_id", "open_lot_id", "close_lot_id", "open_order_id", "close_order_id", "Lcbc/service/v1/InstrumentTypeDto;", "instrument_type", "Lcbc/service/v1/InvTypeDto;", "inv_type", "Lcbc/service/v1/TranTypeDto;", "open_tran_type", "close_tran_type", "open_date", "close_date", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "fees", "book_cost_basis", "book_proceeds", "realized_gain_loss", "", "seq_no", "Lcbc/service/v1/BrokebackEnrichedDetailsDto;", "brokeback_enriched_details", "open_fee", "close_fee", "tax_cost_basis", "Lcbc/service/v1/TermTypeDto;", "term", "tax_gain_loss", "", "ignore_seq_no_constraint", "gk_open_id", "gk_close_id", "intra_day_touched_date", "last_gk_sync_date", "gift_status", "is_wash_sale", "Lcbc/service/v1/NummusEnrichedDetailsDto;", "nummus_enriched_details", "(Lcbc/service/v1/UpdateTypeDto;Lcbc/service/v1/LotTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/InstrumentTypeDto;Lcbc/service/v1/InvTypeDto;Lcbc/service/v1/TranTypeDto;Lcbc/service/v1/TranTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;JLcbc/service/v1/BrokebackEnrichedDetailsDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcbc/service/v1/TermTypeDto;Lcom/robinhood/idl/IdlDecimal;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcbc/service/v1/NummusEnrichedDetailsDto;)V", "toProto", "()Lcbc/service/v1/TaxLotDetail;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcbc/service/v1/TaxLotDetailDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class TaxLotDetailDto implements Dto3<TaxLotDetail>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLotDetailDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLotDetailDto, TaxLotDetail>> binaryBase64Serializer$delegate;
    private static final TaxLotDetailDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLotDetailDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLotDetailDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TaxLotDetailDto(UpdateTypeDto updateTypeDto, LotTypeDto lotTypeDto, String str, String str2, String str3, String str4, String str5, String str6, InstrumentTypeDto instrumentTypeDto, InvTypeDto invTypeDto, TranTypeDto tranTypeDto, TranTypeDto tranTypeDto2, String str7, String str8, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, long j, BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDto, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, TermTypeDto termTypeDto, IdlDecimal idlDecimal9, boolean z, String str9, String str10, String str11, String str12, String str13, boolean z2, NummusEnrichedDetailsDto nummusEnrichedDetailsDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        UpdateTypeDto zeroValue2 = (i & 1) != 0 ? UpdateTypeDto.INSTANCE.getZeroValue() : updateTypeDto;
        LotTypeDto zeroValue3 = (i & 2) != 0 ? LotTypeDto.INSTANCE.getZeroValue() : lotTypeDto;
        String str14 = (i & 4) != 0 ? "" : str;
        String str15 = (i & 8) != 0 ? "" : str2;
        String str16 = (i & 16) != 0 ? "" : str3;
        String str17 = (i & 32) != 0 ? "" : str4;
        String str18 = (i & 64) != 0 ? "" : str5;
        String str19 = (i & 128) != 0 ? "" : str6;
        InstrumentTypeDto zeroValue4 = (i & 256) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto;
        InvTypeDto zeroValue5 = (i & 512) != 0 ? InvTypeDto.INSTANCE.getZeroValue() : invTypeDto;
        TranTypeDto zeroValue6 = (i & 1024) != 0 ? TranTypeDto.INSTANCE.getZeroValue() : tranTypeDto;
        TranTypeDto zeroValue7 = (i & 2048) != 0 ? TranTypeDto.INSTANCE.getZeroValue() : tranTypeDto2;
        String str20 = (i & 4096) != 0 ? "" : str7;
        String str21 = (i & 8192) != 0 ? "" : str8;
        UpdateTypeDto updateTypeDto2 = zeroValue2;
        IdlDecimal idlDecimal10 = (i & 16384) != 0 ? new IdlDecimal("") : idlDecimal;
        IdlDecimal idlDecimal11 = (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal2;
        IdlDecimal idlDecimal12 = (i & 65536) != 0 ? new IdlDecimal("") : idlDecimal3;
        IdlDecimal idlDecimal13 = (i & 131072) != 0 ? new IdlDecimal("") : idlDecimal4;
        IdlDecimal idlDecimal14 = (i & 262144) != 0 ? new IdlDecimal("") : idlDecimal5;
        this(updateTypeDto2, zeroValue3, str14, str15, str16, str17, str18, str19, zeroValue4, zeroValue5, zeroValue6, zeroValue7, str20, str21, idlDecimal10, idlDecimal11, idlDecimal12, idlDecimal13, idlDecimal14, (i & 524288) != 0 ? 0L : j, (i & 1048576) != 0 ? null : brokebackEnrichedDetailsDto, (i & 2097152) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 4194304) != 0 ? new IdlDecimal("") : idlDecimal7, (i & 8388608) != 0 ? new IdlDecimal("") : idlDecimal8, (i & 16777216) != 0 ? TermTypeDto.INSTANCE.getZeroValue() : termTypeDto, (i & 33554432) != 0 ? new IdlDecimal("") : idlDecimal9, (i & 67108864) != 0 ? false : z, (i & 134217728) != 0 ? "" : str9, (i & 268435456) != 0 ? "" : str10, (i & 536870912) != 0 ? "" : str11, (i & 1073741824) != 0 ? "" : str12, (i & Integer.MIN_VALUE) == 0 ? str13 : "", (i2 & 1) == 0 ? z2 : false, (i2 & 2) != 0 ? null : nummusEnrichedDetailsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLotDetailDto(UpdateTypeDto update_type, LotTypeDto lot_type, String symbol, String instrument_id, String open_lot_id, String close_lot_id, String open_order_id, String close_order_id, InstrumentTypeDto instrument_type, InvTypeDto inv_type, TranTypeDto open_tran_type, TranTypeDto close_tran_type, String open_date, String close_date, IdlDecimal quantity, IdlDecimal fees, IdlDecimal book_cost_basis, IdlDecimal book_proceeds, IdlDecimal realized_gain_loss, long j, BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDto, IdlDecimal open_fee, IdlDecimal close_fee, IdlDecimal tax_cost_basis, TermTypeDto term, IdlDecimal tax_gain_loss, boolean z, String gk_open_id, String gk_close_id, String intra_day_touched_date, String last_gk_sync_date, String gift_status, boolean z2, NummusEnrichedDetailsDto nummusEnrichedDetailsDto) {
        this(new Surrogate(update_type, lot_type, symbol, instrument_id, open_lot_id, close_lot_id, open_order_id, close_order_id, instrument_type, inv_type, open_tran_type, close_tran_type, open_date, close_date, quantity, fees, book_cost_basis, book_proceeds, realized_gain_loss, j, brokebackEnrichedDetailsDto, open_fee, close_fee, tax_cost_basis, term, tax_gain_loss, z, gk_open_id, gk_close_id, intra_day_touched_date, last_gk_sync_date, gift_status, z2, nummusEnrichedDetailsDto));
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TaxLotDetail toProto() {
        UpdateType updateType = (UpdateType) this.surrogate.getUpdate_type().toProto();
        LotType lotType = (LotType) this.surrogate.getLot_type().toProto();
        String symbol = this.surrogate.getSymbol();
        String instrument_id = this.surrogate.getInstrument_id();
        String open_lot_id = this.surrogate.getOpen_lot_id();
        String close_lot_id = this.surrogate.getClose_lot_id();
        String open_order_id = this.surrogate.getOpen_order_id();
        String close_order_id = this.surrogate.getClose_order_id();
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getInstrument_type().toProto();
        InvType invType = (InvType) this.surrogate.getInv_type().toProto();
        TranType tranType = (TranType) this.surrogate.getOpen_tran_type().toProto();
        TranType tranType2 = (TranType) this.surrogate.getClose_tran_type().toProto();
        String open_date = this.surrogate.getOpen_date();
        String close_date = this.surrogate.getClose_date();
        String stringValue = this.surrogate.getQuantity().getStringValue();
        String stringValue2 = this.surrogate.getFees().getStringValue();
        String stringValue3 = this.surrogate.getBook_cost_basis().getStringValue();
        String stringValue4 = this.surrogate.getBook_proceeds().getStringValue();
        String stringValue5 = this.surrogate.getRealized_gain_loss().getStringValue();
        long seq_no = this.surrogate.getSeq_no();
        BrokebackEnrichedDetailsDto brokeback_enriched_details = this.surrogate.getBrokeback_enriched_details();
        BrokebackEnrichedDetails proto = brokeback_enriched_details != null ? brokeback_enriched_details.toProto() : null;
        String stringValue6 = this.surrogate.getOpen_fee().getStringValue();
        String stringValue7 = this.surrogate.getClose_fee().getStringValue();
        String stringValue8 = this.surrogate.getTax_cost_basis().getStringValue();
        TermType termType = (TermType) this.surrogate.getTerm().toProto();
        String stringValue9 = this.surrogate.getTax_gain_loss().getStringValue();
        boolean ignore_seq_no_constraint = this.surrogate.getIgnore_seq_no_constraint();
        String gk_open_id = this.surrogate.getGk_open_id();
        String gk_close_id = this.surrogate.getGk_close_id();
        String intra_day_touched_date = this.surrogate.getIntra_day_touched_date();
        String last_gk_sync_date = this.surrogate.getLast_gk_sync_date();
        String gift_status = this.surrogate.getGift_status();
        boolean is_wash_sale = this.surrogate.getIs_wash_sale();
        NummusEnrichedDetailsDto nummus_enriched_details = this.surrogate.getNummus_enriched_details();
        return new TaxLotDetail(updateType, lotType, symbol, instrument_id, open_lot_id, close_lot_id, open_order_id, close_order_id, instrumentType, invType, tranType, tranType2, open_date, close_date, stringValue, stringValue2, stringValue3, stringValue4, stringValue5, seq_no, proto, stringValue6, stringValue7, stringValue8, termType, stringValue9, ignore_seq_no_constraint, gk_open_id, gk_close_id, intra_day_touched_date, last_gk_sync_date, gift_status, is_wash_sale, nummus_enriched_details != null ? nummus_enriched_details.toProto() : null, null, 0, 4, null);
    }

    public String toString() {
        return "[TaxLotDetailDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLotDetailDto) && Intrinsics.areEqual(((TaxLotDetailDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bh\b\u0083\b\u0018\u0000 §\u00012\u00020\u0001:\u0004¨\u0001§\u0001Bõ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\u0017\b\u0002\u0010\u001e\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\u0017\b\u0002\u0010!\u001a\u00110\u001f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0017\b\u0002\u0010$\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\u0017\b\u0002\u0010%\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\u0017\b\u0002\u0010&\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\u0017\b\u0002\u0010)\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u0019\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010,\u001a\u00020\u0006\u0012\b\b\u0002\u0010-\u001a\u00020\u0006\u0012\b\b\u0002\u0010.\u001a\u00020\u0006\u0012\b\b\u0002\u0010/\u001a\u00020\u0006\u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\b\b\u0002\u00101\u001a\u00020*\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105Bñ\u0002\b\u0010\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00108\u001a\u000206\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00101\u001a\u00020*\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b4\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010E\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u000206HÖ\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020*2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010L\u0012\u0004\bO\u0010P\u001a\u0004\bM\u0010NR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010Q\u0012\u0004\bT\u0010P\u001a\u0004\bR\u0010SR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010U\u0012\u0004\bW\u0010P\u001a\u0004\bV\u0010FR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010U\u0012\u0004\bY\u0010P\u001a\u0004\bX\u0010FR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010U\u0012\u0004\b[\u0010P\u001a\u0004\bZ\u0010FR \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010U\u0012\u0004\b]\u0010P\u001a\u0004\b\\\u0010FR \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010U\u0012\u0004\b_\u0010P\u001a\u0004\b^\u0010FR \u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010U\u0012\u0004\ba\u0010P\u001a\u0004\b`\u0010FR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010b\u0012\u0004\be\u0010P\u001a\u0004\bc\u0010dR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010f\u0012\u0004\bi\u0010P\u001a\u0004\bg\u0010hR \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010j\u0012\u0004\bm\u0010P\u001a\u0004\bk\u0010lR \u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010j\u0012\u0004\bo\u0010P\u001a\u0004\bn\u0010lR \u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010U\u0012\u0004\bq\u0010P\u001a\u0004\bp\u0010FR \u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010U\u0012\u0004\bs\u0010P\u001a\u0004\br\u0010FR/\u0010\u001a\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010t\u0012\u0004\bw\u0010P\u001a\u0004\bu\u0010vR/\u0010\u001b\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010t\u0012\u0004\by\u0010P\u001a\u0004\bx\u0010vR/\u0010\u001c\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010t\u0012\u0004\b{\u0010P\u001a\u0004\bz\u0010vR/\u0010\u001d\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010t\u0012\u0004\b}\u0010P\u001a\u0004\b|\u0010vR/\u0010\u001e\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010t\u0012\u0004\b\u007f\u0010P\u001a\u0004\b~\u0010vR3\u0010!\u001a\u00110\u001f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010P\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010\u0084\u0001\u0012\u0005\b\u0087\u0001\u0010P\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R1\u0010$\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010t\u0012\u0005\b\u0089\u0001\u0010P\u001a\u0005\b\u0088\u0001\u0010vR1\u0010%\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b%\u0010t\u0012\u0005\b\u008b\u0001\u0010P\u001a\u0005\b\u008a\u0001\u0010vR1\u0010&\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b&\u0010t\u0012\u0005\b\u008d\u0001\u0010P\u001a\u0005\b\u008c\u0001\u0010vR$\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b(\u0010\u008e\u0001\u0012\u0005\b\u0091\u0001\u0010P\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R1\u0010)\u001a\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b)\u0010t\u0012\u0005\b\u0093\u0001\u0010P\u001a\u0005\b\u0092\u0001\u0010vR$\u0010+\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010\u0094\u0001\u0012\u0005\b\u0097\u0001\u0010P\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\"\u0010,\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b,\u0010U\u0012\u0005\b\u0099\u0001\u0010P\u001a\u0005\b\u0098\u0001\u0010FR\"\u0010-\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b-\u0010U\u0012\u0005\b\u009b\u0001\u0010P\u001a\u0005\b\u009a\u0001\u0010FR\"\u0010.\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b.\u0010U\u0012\u0005\b\u009d\u0001\u0010P\u001a\u0005\b\u009c\u0001\u0010FR\"\u0010/\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b/\u0010U\u0012\u0005\b\u009f\u0001\u0010P\u001a\u0005\b\u009e\u0001\u0010FR\"\u00100\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b0\u0010U\u0012\u0005\b¡\u0001\u0010P\u001a\u0005\b \u0001\u0010FR#\u00101\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b1\u0010\u0094\u0001\u0012\u0005\b¢\u0001\u0010P\u001a\u0005\b1\u0010\u0096\u0001R&\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010£\u0001\u0012\u0005\b¦\u0001\u0010P\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006©\u0001"}, m3636d2 = {"Lcbc/service/v1/TaxLotDetailDto$Surrogate;", "", "Lcbc/service/v1/UpdateTypeDto;", "update_type", "Lcbc/service/v1/LotTypeDto;", "lot_type", "", "symbol", "instrument_id", "open_lot_id", "close_lot_id", "open_order_id", "close_order_id", "Lcbc/service/v1/InstrumentTypeDto;", "instrument_type", "Lcbc/service/v1/InvTypeDto;", "inv_type", "Lcbc/service/v1/TranTypeDto;", "open_tran_type", "close_tran_type", "open_date", "close_date", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "fees", "book_cost_basis", "book_proceeds", "realized_gain_loss", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "seq_no", "Lcbc/service/v1/BrokebackEnrichedDetailsDto;", "brokeback_enriched_details", "open_fee", "close_fee", "tax_cost_basis", "Lcbc/service/v1/TermTypeDto;", "term", "tax_gain_loss", "", "ignore_seq_no_constraint", "gk_open_id", "gk_close_id", "intra_day_touched_date", "last_gk_sync_date", "gift_status", "is_wash_sale", "Lcbc/service/v1/NummusEnrichedDetailsDto;", "nummus_enriched_details", "<init>", "(Lcbc/service/v1/UpdateTypeDto;Lcbc/service/v1/LotTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/InstrumentTypeDto;Lcbc/service/v1/InvTypeDto;Lcbc/service/v1/TranTypeDto;Lcbc/service/v1/TranTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;JLcbc/service/v1/BrokebackEnrichedDetailsDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcbc/service/v1/TermTypeDto;Lcom/robinhood/idl/IdlDecimal;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcbc/service/v1/NummusEnrichedDetailsDto;)V", "", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcbc/service/v1/UpdateTypeDto;Lcbc/service/v1/LotTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcbc/service/v1/InstrumentTypeDto;Lcbc/service/v1/InvTypeDto;Lcbc/service/v1/TranTypeDto;Lcbc/service/v1/TranTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;JLcbc/service/v1/BrokebackEnrichedDetailsDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcbc/service/v1/TermTypeDto;Lcom/robinhood/idl/IdlDecimal;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcbc/service/v1/NummusEnrichedDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cbc_v1_externalRelease", "(Lcbc/service/v1/TaxLotDetailDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcbc/service/v1/UpdateTypeDto;", "getUpdate_type", "()Lcbc/service/v1/UpdateTypeDto;", "getUpdate_type$annotations", "()V", "Lcbc/service/v1/LotTypeDto;", "getLot_type", "()Lcbc/service/v1/LotTypeDto;", "getLot_type$annotations", "Ljava/lang/String;", "getSymbol", "getSymbol$annotations", "getInstrument_id", "getInstrument_id$annotations", "getOpen_lot_id", "getOpen_lot_id$annotations", "getClose_lot_id", "getClose_lot_id$annotations", "getOpen_order_id", "getOpen_order_id$annotations", "getClose_order_id", "getClose_order_id$annotations", "Lcbc/service/v1/InstrumentTypeDto;", "getInstrument_type", "()Lcbc/service/v1/InstrumentTypeDto;", "getInstrument_type$annotations", "Lcbc/service/v1/InvTypeDto;", "getInv_type", "()Lcbc/service/v1/InvTypeDto;", "getInv_type$annotations", "Lcbc/service/v1/TranTypeDto;", "getOpen_tran_type", "()Lcbc/service/v1/TranTypeDto;", "getOpen_tran_type$annotations", "getClose_tran_type", "getClose_tran_type$annotations", "getOpen_date", "getOpen_date$annotations", "getClose_date", "getClose_date$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "getFees", "getFees$annotations", "getBook_cost_basis", "getBook_cost_basis$annotations", "getBook_proceeds", "getBook_proceeds$annotations", "getRealized_gain_loss", "getRealized_gain_loss$annotations", "J", "getSeq_no", "()J", "getSeq_no$annotations", "Lcbc/service/v1/BrokebackEnrichedDetailsDto;", "getBrokeback_enriched_details", "()Lcbc/service/v1/BrokebackEnrichedDetailsDto;", "getBrokeback_enriched_details$annotations", "getOpen_fee", "getOpen_fee$annotations", "getClose_fee", "getClose_fee$annotations", "getTax_cost_basis", "getTax_cost_basis$annotations", "Lcbc/service/v1/TermTypeDto;", "getTerm", "()Lcbc/service/v1/TermTypeDto;", "getTerm$annotations", "getTax_gain_loss", "getTax_gain_loss$annotations", "Z", "getIgnore_seq_no_constraint", "()Z", "getIgnore_seq_no_constraint$annotations", "getGk_open_id", "getGk_open_id$annotations", "getGk_close_id", "getGk_close_id$annotations", "getIntra_day_touched_date", "getIntra_day_touched_date$annotations", "getLast_gk_sync_date", "getLast_gk_sync_date$annotations", "getGift_status", "getGift_status$annotations", "is_wash_sale$annotations", "Lcbc/service/v1/NummusEnrichedDetailsDto;", "getNummus_enriched_details", "()Lcbc/service/v1/NummusEnrichedDetailsDto;", "getNummus_enriched_details$annotations", "Companion", "$serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal book_cost_basis;
        private final IdlDecimal book_proceeds;
        private final BrokebackEnrichedDetailsDto brokeback_enriched_details;
        private final String close_date;
        private final IdlDecimal close_fee;
        private final String close_lot_id;
        private final String close_order_id;
        private final TranTypeDto close_tran_type;
        private final IdlDecimal fees;
        private final String gift_status;
        private final String gk_close_id;
        private final String gk_open_id;
        private final boolean ignore_seq_no_constraint;
        private final String instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final String intra_day_touched_date;
        private final InvTypeDto inv_type;
        private final boolean is_wash_sale;
        private final String last_gk_sync_date;
        private final LotTypeDto lot_type;
        private final NummusEnrichedDetailsDto nummus_enriched_details;
        private final String open_date;
        private final IdlDecimal open_fee;
        private final String open_lot_id;
        private final String open_order_id;
        private final TranTypeDto open_tran_type;
        private final IdlDecimal quantity;
        private final IdlDecimal realized_gain_loss;
        private final long seq_no;
        private final String symbol;
        private final IdlDecimal tax_cost_basis;
        private final IdlDecimal tax_gain_loss;
        private final TermTypeDto term;
        private final UpdateTypeDto update_type;

        public Surrogate() {
            this((UpdateTypeDto) null, (LotTypeDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentTypeDto) null, (InvTypeDto) null, (TranTypeDto) null, (TranTypeDto) null, (String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 0L, (BrokebackEnrichedDetailsDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (TermTypeDto) null, (IdlDecimal) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, false, (NummusEnrichedDetailsDto) null, -1, 3, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.update_type == surrogate.update_type && this.lot_type == surrogate.lot_type && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.open_lot_id, surrogate.open_lot_id) && Intrinsics.areEqual(this.close_lot_id, surrogate.close_lot_id) && Intrinsics.areEqual(this.open_order_id, surrogate.open_order_id) && Intrinsics.areEqual(this.close_order_id, surrogate.close_order_id) && this.instrument_type == surrogate.instrument_type && this.inv_type == surrogate.inv_type && this.open_tran_type == surrogate.open_tran_type && this.close_tran_type == surrogate.close_tran_type && Intrinsics.areEqual(this.open_date, surrogate.open_date) && Intrinsics.areEqual(this.close_date, surrogate.close_date) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.fees, surrogate.fees) && Intrinsics.areEqual(this.book_cost_basis, surrogate.book_cost_basis) && Intrinsics.areEqual(this.book_proceeds, surrogate.book_proceeds) && Intrinsics.areEqual(this.realized_gain_loss, surrogate.realized_gain_loss) && this.seq_no == surrogate.seq_no && Intrinsics.areEqual(this.brokeback_enriched_details, surrogate.brokeback_enriched_details) && Intrinsics.areEqual(this.open_fee, surrogate.open_fee) && Intrinsics.areEqual(this.close_fee, surrogate.close_fee) && Intrinsics.areEqual(this.tax_cost_basis, surrogate.tax_cost_basis) && this.term == surrogate.term && Intrinsics.areEqual(this.tax_gain_loss, surrogate.tax_gain_loss) && this.ignore_seq_no_constraint == surrogate.ignore_seq_no_constraint && Intrinsics.areEqual(this.gk_open_id, surrogate.gk_open_id) && Intrinsics.areEqual(this.gk_close_id, surrogate.gk_close_id) && Intrinsics.areEqual(this.intra_day_touched_date, surrogate.intra_day_touched_date) && Intrinsics.areEqual(this.last_gk_sync_date, surrogate.last_gk_sync_date) && Intrinsics.areEqual(this.gift_status, surrogate.gift_status) && this.is_wash_sale == surrogate.is_wash_sale && Intrinsics.areEqual(this.nummus_enriched_details, surrogate.nummus_enriched_details);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((((((((((((((((((this.update_type.hashCode() * 31) + this.lot_type.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.open_lot_id.hashCode()) * 31) + this.close_lot_id.hashCode()) * 31) + this.open_order_id.hashCode()) * 31) + this.close_order_id.hashCode()) * 31) + this.instrument_type.hashCode()) * 31) + this.inv_type.hashCode()) * 31) + this.open_tran_type.hashCode()) * 31) + this.close_tran_type.hashCode()) * 31) + this.open_date.hashCode()) * 31) + this.close_date.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.fees.hashCode()) * 31) + this.book_cost_basis.hashCode()) * 31) + this.book_proceeds.hashCode()) * 31) + this.realized_gain_loss.hashCode()) * 31) + Long.hashCode(this.seq_no)) * 31;
            BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDto = this.brokeback_enriched_details;
            int iHashCode2 = (((((((((((((((((((((((((iHashCode + (brokebackEnrichedDetailsDto == null ? 0 : brokebackEnrichedDetailsDto.hashCode())) * 31) + this.open_fee.hashCode()) * 31) + this.close_fee.hashCode()) * 31) + this.tax_cost_basis.hashCode()) * 31) + this.term.hashCode()) * 31) + this.tax_gain_loss.hashCode()) * 31) + Boolean.hashCode(this.ignore_seq_no_constraint)) * 31) + this.gk_open_id.hashCode()) * 31) + this.gk_close_id.hashCode()) * 31) + this.intra_day_touched_date.hashCode()) * 31) + this.last_gk_sync_date.hashCode()) * 31) + this.gift_status.hashCode()) * 31) + Boolean.hashCode(this.is_wash_sale)) * 31;
            NummusEnrichedDetailsDto nummusEnrichedDetailsDto = this.nummus_enriched_details;
            return iHashCode2 + (nummusEnrichedDetailsDto != null ? nummusEnrichedDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(update_type=" + this.update_type + ", lot_type=" + this.lot_type + ", symbol=" + this.symbol + ", instrument_id=" + this.instrument_id + ", open_lot_id=" + this.open_lot_id + ", close_lot_id=" + this.close_lot_id + ", open_order_id=" + this.open_order_id + ", close_order_id=" + this.close_order_id + ", instrument_type=" + this.instrument_type + ", inv_type=" + this.inv_type + ", open_tran_type=" + this.open_tran_type + ", close_tran_type=" + this.close_tran_type + ", open_date=" + this.open_date + ", close_date=" + this.close_date + ", quantity=" + this.quantity + ", fees=" + this.fees + ", book_cost_basis=" + this.book_cost_basis + ", book_proceeds=" + this.book_proceeds + ", realized_gain_loss=" + this.realized_gain_loss + ", seq_no=" + this.seq_no + ", brokeback_enriched_details=" + this.brokeback_enriched_details + ", open_fee=" + this.open_fee + ", close_fee=" + this.close_fee + ", tax_cost_basis=" + this.tax_cost_basis + ", term=" + this.term + ", tax_gain_loss=" + this.tax_gain_loss + ", ignore_seq_no_constraint=" + this.ignore_seq_no_constraint + ", gk_open_id=" + this.gk_open_id + ", gk_close_id=" + this.gk_close_id + ", intra_day_touched_date=" + this.intra_day_touched_date + ", last_gk_sync_date=" + this.last_gk_sync_date + ", gift_status=" + this.gift_status + ", is_wash_sale=" + this.is_wash_sale + ", nummus_enriched_details=" + this.nummus_enriched_details + ")";
        }

        /* compiled from: TaxLotDetailDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcbc/service/v1/TaxLotDetailDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/TaxLotDetailDto$Surrogate;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLotDetailDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, UpdateTypeDto updateTypeDto, LotTypeDto lotTypeDto, String str, String str2, String str3, String str4, String str5, String str6, InstrumentTypeDto instrumentTypeDto, InvTypeDto invTypeDto, TranTypeDto tranTypeDto, TranTypeDto tranTypeDto2, String str7, String str8, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, long j, BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDto, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, TermTypeDto termTypeDto, IdlDecimal idlDecimal9, boolean z, String str9, String str10, String str11, String str12, String str13, boolean z2, NummusEnrichedDetailsDto nummusEnrichedDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.update_type = (i & 1) == 0 ? UpdateTypeDto.INSTANCE.getZeroValue() : updateTypeDto;
            if ((i & 2) == 0) {
                this.lot_type = LotTypeDto.INSTANCE.getZeroValue();
            } else {
                this.lot_type = lotTypeDto;
            }
            if ((i & 4) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str;
            }
            if ((i & 8) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 16) == 0) {
                this.open_lot_id = "";
            } else {
                this.open_lot_id = str3;
            }
            if ((i & 32) == 0) {
                this.close_lot_id = "";
            } else {
                this.close_lot_id = str4;
            }
            if ((i & 64) == 0) {
                this.open_order_id = "";
            } else {
                this.open_order_id = str5;
            }
            if ((i & 128) == 0) {
                this.close_order_id = "";
            } else {
                this.close_order_id = str6;
            }
            if ((i & 256) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
            if ((i & 512) == 0) {
                this.inv_type = InvTypeDto.INSTANCE.getZeroValue();
            } else {
                this.inv_type = invTypeDto;
            }
            if ((i & 1024) == 0) {
                this.open_tran_type = TranTypeDto.INSTANCE.getZeroValue();
            } else {
                this.open_tran_type = tranTypeDto;
            }
            if ((i & 2048) == 0) {
                this.close_tran_type = TranTypeDto.INSTANCE.getZeroValue();
            } else {
                this.close_tran_type = tranTypeDto2;
            }
            if ((i & 4096) == 0) {
                this.open_date = "";
            } else {
                this.open_date = str7;
            }
            if ((i & 8192) == 0) {
                this.close_date = "";
            } else {
                this.close_date = str8;
            }
            this.quantity = (i & 16384) == 0 ? new IdlDecimal("") : idlDecimal;
            this.fees = (32768 & i) == 0 ? new IdlDecimal("") : idlDecimal2;
            this.book_cost_basis = (65536 & i) == 0 ? new IdlDecimal("") : idlDecimal3;
            this.book_proceeds = (131072 & i) == 0 ? new IdlDecimal("") : idlDecimal4;
            this.realized_gain_loss = (262144 & i) == 0 ? new IdlDecimal("") : idlDecimal5;
            this.seq_no = (524288 & i) == 0 ? 0L : j;
            if ((1048576 & i) == 0) {
                this.brokeback_enriched_details = null;
            } else {
                this.brokeback_enriched_details = brokebackEnrichedDetailsDto;
            }
            this.open_fee = (2097152 & i) == 0 ? new IdlDecimal("") : idlDecimal6;
            this.close_fee = (4194304 & i) == 0 ? new IdlDecimal("") : idlDecimal7;
            this.tax_cost_basis = (8388608 & i) == 0 ? new IdlDecimal("") : idlDecimal8;
            this.term = (16777216 & i) == 0 ? TermTypeDto.INSTANCE.getZeroValue() : termTypeDto;
            this.tax_gain_loss = (33554432 & i) == 0 ? new IdlDecimal("") : idlDecimal9;
            if ((67108864 & i) == 0) {
                this.ignore_seq_no_constraint = false;
            } else {
                this.ignore_seq_no_constraint = z;
            }
            if ((134217728 & i) == 0) {
                this.gk_open_id = "";
            } else {
                this.gk_open_id = str9;
            }
            if ((268435456 & i) == 0) {
                this.gk_close_id = "";
            } else {
                this.gk_close_id = str10;
            }
            if ((536870912 & i) == 0) {
                this.intra_day_touched_date = "";
            } else {
                this.intra_day_touched_date = str11;
            }
            if ((1073741824 & i) == 0) {
                this.last_gk_sync_date = "";
            } else {
                this.last_gk_sync_date = str12;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.gift_status = "";
            } else {
                this.gift_status = str13;
            }
            if ((i2 & 1) == 0) {
                this.is_wash_sale = false;
            } else {
                this.is_wash_sale = z2;
            }
            if ((i2 & 2) == 0) {
                this.nummus_enriched_details = null;
            } else {
                this.nummus_enriched_details = nummusEnrichedDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$cbc_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.update_type != UpdateTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, UpdateTypeDto.Serializer.INSTANCE, self.update_type);
            }
            if (self.lot_type != LotTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, LotTypeDto.Serializer.INSTANCE, self.lot_type);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 2, self.symbol);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.open_lot_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.open_lot_id);
            }
            if (!Intrinsics.areEqual(self.close_lot_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.close_lot_id);
            }
            if (!Intrinsics.areEqual(self.open_order_id, "")) {
                output.encodeStringElement(serialDesc, 6, self.open_order_id);
            }
            if (!Intrinsics.areEqual(self.close_order_id, "")) {
                output.encodeStringElement(serialDesc, 7, self.close_order_id);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            if (self.inv_type != InvTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, InvTypeDto.Serializer.INSTANCE, self.inv_type);
            }
            TranTypeDto tranTypeDto = self.open_tran_type;
            TranTypeDto.Companion companion = TranTypeDto.INSTANCE;
            if (tranTypeDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, TranTypeDto.Serializer.INSTANCE, self.open_tran_type);
            }
            if (self.close_tran_type != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, TranTypeDto.Serializer.INSTANCE, self.close_tran_type);
            }
            if (!Intrinsics.areEqual(self.open_date, "")) {
                output.encodeStringElement(serialDesc, 12, self.open_date);
            }
            if (!Intrinsics.areEqual(self.close_date, "")) {
                output.encodeStringElement(serialDesc, 13, self.close_date);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 14, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.fees, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, self.fees);
            }
            if (!Intrinsics.areEqual(self.book_cost_basis, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 16, IdlDecimalSerializer.INSTANCE, self.book_cost_basis);
            }
            if (!Intrinsics.areEqual(self.book_proceeds, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 17, IdlDecimalSerializer.INSTANCE, self.book_proceeds);
            }
            if (!Intrinsics.areEqual(self.realized_gain_loss, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 18, IdlDecimalSerializer.INSTANCE, self.realized_gain_loss);
            }
            long j = self.seq_no;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 19, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDto = self.brokeback_enriched_details;
            if (brokebackEnrichedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, BrokebackEnrichedDetailsDto.Serializer.INSTANCE, brokebackEnrichedDetailsDto);
            }
            if (!Intrinsics.areEqual(self.open_fee, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 21, IdlDecimalSerializer.INSTANCE, self.open_fee);
            }
            if (!Intrinsics.areEqual(self.close_fee, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 22, IdlDecimalSerializer.INSTANCE, self.close_fee);
            }
            if (!Intrinsics.areEqual(self.tax_cost_basis, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 23, IdlDecimalSerializer.INSTANCE, self.tax_cost_basis);
            }
            if (self.term != TermTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 24, TermTypeDto.Serializer.INSTANCE, self.term);
            }
            if (!Intrinsics.areEqual(self.tax_gain_loss, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 25, IdlDecimalSerializer.INSTANCE, self.tax_gain_loss);
            }
            boolean z = self.ignore_seq_no_constraint;
            if (z) {
                output.encodeBooleanElement(serialDesc, 26, z);
            }
            if (!Intrinsics.areEqual(self.gk_open_id, "")) {
                output.encodeStringElement(serialDesc, 27, self.gk_open_id);
            }
            if (!Intrinsics.areEqual(self.gk_close_id, "")) {
                output.encodeStringElement(serialDesc, 28, self.gk_close_id);
            }
            if (!Intrinsics.areEqual(self.intra_day_touched_date, "")) {
                output.encodeStringElement(serialDesc, 29, self.intra_day_touched_date);
            }
            if (!Intrinsics.areEqual(self.last_gk_sync_date, "")) {
                output.encodeStringElement(serialDesc, 30, self.last_gk_sync_date);
            }
            if (!Intrinsics.areEqual(self.gift_status, "")) {
                output.encodeStringElement(serialDesc, 31, self.gift_status);
            }
            boolean z2 = self.is_wash_sale;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 32, z2);
            }
            NummusEnrichedDetailsDto nummusEnrichedDetailsDto = self.nummus_enriched_details;
            if (nummusEnrichedDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, NummusEnrichedDetailsDto.Serializer.INSTANCE, nummusEnrichedDetailsDto);
            }
        }

        public Surrogate(UpdateTypeDto update_type, LotTypeDto lot_type, String symbol, String instrument_id, String open_lot_id, String close_lot_id, String open_order_id, String close_order_id, InstrumentTypeDto instrument_type, InvTypeDto inv_type, TranTypeDto open_tran_type, TranTypeDto close_tran_type, String open_date, String close_date, IdlDecimal quantity, IdlDecimal fees, IdlDecimal book_cost_basis, IdlDecimal book_proceeds, IdlDecimal realized_gain_loss, long j, BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDto, IdlDecimal open_fee, IdlDecimal close_fee, IdlDecimal tax_cost_basis, TermTypeDto term, IdlDecimal tax_gain_loss, boolean z, String gk_open_id, String gk_close_id, String intra_day_touched_date, String last_gk_sync_date, String gift_status, boolean z2, NummusEnrichedDetailsDto nummusEnrichedDetailsDto) {
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
            this.brokeback_enriched_details = brokebackEnrichedDetailsDto;
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
            this.nummus_enriched_details = nummusEnrichedDetailsDto;
        }

        public final UpdateTypeDto getUpdate_type() {
            return this.update_type;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(UpdateTypeDto updateTypeDto, LotTypeDto lotTypeDto, String str, String str2, String str3, String str4, String str5, String str6, InstrumentTypeDto instrumentTypeDto, InvTypeDto invTypeDto, TranTypeDto tranTypeDto, TranTypeDto tranTypeDto2, String str7, String str8, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, long j, BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDto, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, TermTypeDto termTypeDto, IdlDecimal idlDecimal9, boolean z, String str9, String str10, String str11, String str12, String str13, boolean z2, NummusEnrichedDetailsDto nummusEnrichedDetailsDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            UpdateTypeDto zeroValue = (i & 1) != 0 ? UpdateTypeDto.INSTANCE.getZeroValue() : updateTypeDto;
            LotTypeDto zeroValue2 = (i & 2) != 0 ? LotTypeDto.INSTANCE.getZeroValue() : lotTypeDto;
            String str14 = (i & 4) != 0 ? "" : str;
            String str15 = (i & 8) != 0 ? "" : str2;
            String str16 = (i & 16) != 0 ? "" : str3;
            String str17 = (i & 32) != 0 ? "" : str4;
            String str18 = (i & 64) != 0 ? "" : str5;
            String str19 = (i & 128) != 0 ? "" : str6;
            InstrumentTypeDto zeroValue3 = (i & 256) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto;
            InvTypeDto zeroValue4 = (i & 512) != 0 ? InvTypeDto.INSTANCE.getZeroValue() : invTypeDto;
            TranTypeDto zeroValue5 = (i & 1024) != 0 ? TranTypeDto.INSTANCE.getZeroValue() : tranTypeDto;
            TranTypeDto zeroValue6 = (i & 2048) != 0 ? TranTypeDto.INSTANCE.getZeroValue() : tranTypeDto2;
            String str20 = (i & 4096) != 0 ? "" : str7;
            String str21 = (i & 8192) != 0 ? "" : str8;
            UpdateTypeDto updateTypeDto2 = zeroValue;
            IdlDecimal idlDecimal10 = (i & 16384) != 0 ? new IdlDecimal("") : idlDecimal;
            IdlDecimal idlDecimal11 = (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal2;
            IdlDecimal idlDecimal12 = (i & 65536) != 0 ? new IdlDecimal("") : idlDecimal3;
            IdlDecimal idlDecimal13 = (i & 131072) != 0 ? new IdlDecimal("") : idlDecimal4;
            IdlDecimal idlDecimal14 = (i & 262144) != 0 ? new IdlDecimal("") : idlDecimal5;
            this(updateTypeDto2, zeroValue2, str14, str15, str16, str17, str18, str19, zeroValue3, zeroValue4, zeroValue5, zeroValue6, str20, str21, idlDecimal10, idlDecimal11, idlDecimal12, idlDecimal13, idlDecimal14, (i & 524288) != 0 ? 0L : j, (i & 1048576) != 0 ? null : brokebackEnrichedDetailsDto, (i & 2097152) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 4194304) != 0 ? new IdlDecimal("") : idlDecimal7, (i & 8388608) != 0 ? new IdlDecimal("") : idlDecimal8, (i & 16777216) != 0 ? TermTypeDto.INSTANCE.getZeroValue() : termTypeDto, (i & 33554432) != 0 ? new IdlDecimal("") : idlDecimal9, (i & 67108864) != 0 ? false : z, (i & 134217728) != 0 ? "" : str9, (i & 268435456) != 0 ? "" : str10, (i & 536870912) != 0 ? "" : str11, (i & 1073741824) != 0 ? "" : str12, (i & Integer.MIN_VALUE) == 0 ? str13 : "", (i2 & 1) == 0 ? z2 : false, (i2 & 2) != 0 ? null : nummusEnrichedDetailsDto);
        }

        public final LotTypeDto getLot_type() {
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

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final InvTypeDto getInv_type() {
            return this.inv_type;
        }

        public final TranTypeDto getOpen_tran_type() {
            return this.open_tran_type;
        }

        public final TranTypeDto getClose_tran_type() {
            return this.close_tran_type;
        }

        public final String getOpen_date() {
            return this.open_date;
        }

        public final String getClose_date() {
            return this.close_date;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getFees() {
            return this.fees;
        }

        public final IdlDecimal getBook_cost_basis() {
            return this.book_cost_basis;
        }

        public final IdlDecimal getBook_proceeds() {
            return this.book_proceeds;
        }

        public final IdlDecimal getRealized_gain_loss() {
            return this.realized_gain_loss;
        }

        public final long getSeq_no() {
            return this.seq_no;
        }

        public final BrokebackEnrichedDetailsDto getBrokeback_enriched_details() {
            return this.brokeback_enriched_details;
        }

        public final IdlDecimal getOpen_fee() {
            return this.open_fee;
        }

        public final IdlDecimal getClose_fee() {
            return this.close_fee;
        }

        public final IdlDecimal getTax_cost_basis() {
            return this.tax_cost_basis;
        }

        public final TermTypeDto getTerm() {
            return this.term;
        }

        public final IdlDecimal getTax_gain_loss() {
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

        public final NummusEnrichedDetailsDto getNummus_enriched_details() {
            return this.nummus_enriched_details;
        }
    }

    /* compiled from: TaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcbc/service/v1/TaxLotDetailDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcbc/service/v1/TaxLotDetailDto;", "Lcbc/service/v1/TaxLotDetail;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcbc/service/v1/TaxLotDetailDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLotDetailDto, TaxLotDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLotDetailDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotDetailDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotDetailDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLotDetailDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLotDetail> getProtoAdapter() {
            return TaxLotDetail.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotDetailDto getZeroValue() {
            return TaxLotDetailDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotDetailDto fromProto(TaxLotDetail proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UpdateTypeDto updateTypeDtoFromProto = UpdateTypeDto.INSTANCE.fromProto(proto.getUpdate_type());
            LotTypeDto lotTypeDtoFromProto = LotTypeDto.INSTANCE.fromProto(proto.getLot_type());
            String symbol = proto.getSymbol();
            String instrument_id = proto.getInstrument_id();
            String open_lot_id = proto.getOpen_lot_id();
            String close_lot_id = proto.getClose_lot_id();
            String open_order_id = proto.getOpen_order_id();
            String close_order_id = proto.getClose_order_id();
            InstrumentTypeDto instrumentTypeDtoFromProto = InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type());
            InvTypeDto invTypeDtoFromProto = InvTypeDto.INSTANCE.fromProto(proto.getInv_type());
            TranTypeDto.Companion companion = TranTypeDto.INSTANCE;
            TranTypeDto tranTypeDtoFromProto = companion.fromProto(proto.getOpen_tran_type());
            TranTypeDto tranTypeDtoFromProto2 = companion.fromProto(proto.getClose_tran_type());
            String open_date = proto.getOpen_date();
            String close_date = proto.getClose_date();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getFees());
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getBook_cost_basis());
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getBook_proceeds());
            IdlDecimal idlDecimal5 = new IdlDecimal(proto.getRealized_gain_loss());
            long seq_no = proto.getSeq_no();
            BrokebackEnrichedDetails brokeback_enriched_details = proto.getBrokeback_enriched_details();
            BrokebackEnrichedDetailsDto brokebackEnrichedDetailsDtoFromProto = brokeback_enriched_details != null ? BrokebackEnrichedDetailsDto.INSTANCE.fromProto(brokeback_enriched_details) : null;
            IdlDecimal idlDecimal6 = new IdlDecimal(proto.getOpen_fee());
            IdlDecimal idlDecimal7 = new IdlDecimal(proto.getClose_fee());
            IdlDecimal idlDecimal8 = new IdlDecimal(proto.getTax_cost_basis());
            TermTypeDto termTypeDtoFromProto = TermTypeDto.INSTANCE.fromProto(proto.getTerm());
            IdlDecimal idlDecimal9 = new IdlDecimal(proto.getTax_gain_loss());
            boolean ignore_seq_no_constraint = proto.getIgnore_seq_no_constraint();
            String gk_open_id = proto.getGk_open_id();
            String gk_close_id = proto.getGk_close_id();
            String intra_day_touched_date = proto.getIntra_day_touched_date();
            String last_gk_sync_date = proto.getLast_gk_sync_date();
            String gift_status = proto.getGift_status();
            boolean is_wash_sale = proto.getIs_wash_sale();
            NummusEnrichedDetails nummus_enriched_details = proto.getNummus_enriched_details();
            return new TaxLotDetailDto(new Surrogate(updateTypeDtoFromProto, lotTypeDtoFromProto, symbol, instrument_id, open_lot_id, close_lot_id, open_order_id, close_order_id, instrumentTypeDtoFromProto, invTypeDtoFromProto, tranTypeDtoFromProto, tranTypeDtoFromProto2, open_date, close_date, idlDecimal, idlDecimal2, idlDecimal3, idlDecimal4, idlDecimal5, seq_no, brokebackEnrichedDetailsDtoFromProto, idlDecimal6, idlDecimal7, idlDecimal8, termTypeDtoFromProto, idlDecimal9, ignore_seq_no_constraint, gk_open_id, gk_close_id, intra_day_touched_date, last_gk_sync_date, gift_status, is_wash_sale, nummus_enriched_details != null ? NummusEnrichedDetailsDto.INSTANCE.fromProto(nummus_enriched_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cbc.service.v1.TaxLotDetailDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotDetailDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLotDetailDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, false, null, -1, 3, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcbc/service/v1/TaxLotDetailDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/TaxLotDetailDto;", "<init>", "()V", "surrogateSerializer", "Lcbc/service/v1/TaxLotDetailDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLotDetailDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/cbc.service.v1.TaxLotDetail", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLotDetailDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLotDetailDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLotDetailDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLotDetailDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcbc/service/v1/TaxLotDetailDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "cbc.service.v1.TaxLotDetailDto";
        }
    }
}
