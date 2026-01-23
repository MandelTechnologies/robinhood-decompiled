package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.TaxLotTermDto;
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
import p479j$.time.Instant;

/* compiled from: StreamTaxLotInformationResponseDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B§\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/¨\u00064"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate;)V", "", "id", "order_id", "rhs_account_number", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "term", "Lcom/robinhood/rosetta/common/MoneyDto;", "cost_basis", "Lcom/robinhood/idl/IdlDecimal;", "available_shares", "gain_loss", "selected_shares", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "purchase_date", "display_value", "lot_date", "gain_loss_ratio", "total_cost", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class StreamTaxLotInformationResponseDto implements Dto3<StreamTaxLotInformationResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamTaxLotInformationResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamTaxLotInformationResponseDto, StreamTaxLotInformationResponse>> binaryBase64Serializer$delegate;
    private static final StreamTaxLotInformationResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamTaxLotInformationResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamTaxLotInformationResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamTaxLotInformationResponseDto(String str, String str2, String str3, TaxLotTermDto taxLotTermDto, MoneyDto moneyDto, IdlDecimal idlDecimal, MoneyDto moneyDto2, IdlDecimal idlDecimal2, Instant instant, IdlDecimal idlDecimal3, Instant instant2, IdlDecimal idlDecimal4, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? TaxLotTermDto.INSTANCE.getZeroValue() : taxLotTermDto, (i & 16) != 0 ? null : moneyDto, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : idlDecimal2, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : idlDecimal3, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : idlDecimal4, (i & 4096) != 0 ? null : moneyDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotInformationResponseDto(String id, String order_id, String rhs_account_number, TaxLotTermDto term, MoneyDto moneyDto, IdlDecimal available_shares, MoneyDto moneyDto2, IdlDecimal idlDecimal, Instant instant, IdlDecimal idlDecimal2, Instant instant2, IdlDecimal idlDecimal3, MoneyDto moneyDto3) {
        this(new Surrogate(id, order_id, rhs_account_number, term, moneyDto, available_shares, moneyDto2, idlDecimal, instant, idlDecimal2, instant2, idlDecimal3, moneyDto3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(available_shares, "available_shares");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamTaxLotInformationResponse toProto() {
        String id = this.surrogate.getId();
        String order_id = this.surrogate.getOrder_id();
        String rhs_account_number = this.surrogate.getRhs_account_number();
        TaxLotTerm taxLotTerm = (TaxLotTerm) this.surrogate.getTerm().toProto();
        MoneyDto cost_basis = this.surrogate.getCost_basis();
        Money proto = cost_basis != null ? cost_basis.toProto() : null;
        String stringValue = this.surrogate.getAvailable_shares().getStringValue();
        MoneyDto gain_loss = this.surrogate.getGain_loss();
        Money proto2 = gain_loss != null ? gain_loss.toProto() : null;
        IdlDecimal selected_shares = this.surrogate.getSelected_shares();
        String stringValue2 = selected_shares != null ? selected_shares.getStringValue() : null;
        Instant purchase_date = this.surrogate.getPurchase_date();
        IdlDecimal display_value = this.surrogate.getDisplay_value();
        String stringValue3 = display_value != null ? display_value.getStringValue() : null;
        Instant lot_date = this.surrogate.getLot_date();
        IdlDecimal gain_loss_ratio = this.surrogate.getGain_loss_ratio();
        String stringValue4 = gain_loss_ratio != null ? gain_loss_ratio.getStringValue() : null;
        MoneyDto total_cost = this.surrogate.getTotal_cost();
        return new StreamTaxLotInformationResponse(id, order_id, rhs_account_number, taxLotTerm, proto, stringValue, proto2, stringValue2, purchase_date, stringValue3, lot_date, stringValue4, total_cost != null ? total_cost.toProto() : null, null, 8192, null);
    }

    public String toString() {
        return "[StreamTaxLotInformationResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamTaxLotInformationResponseDto) && Intrinsics.areEqual(((StreamTaxLotInformationResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamTaxLotInformationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b)\b\u0083\b\u0018\u0000 U2\u00020\u0001:\u0002VUB\u009d\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0019\b\u0002\u0010\u0010\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0014\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0013¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0013\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0013¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0013\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u001aB\u009d\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010*R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010*R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010*R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b@\u00104\u001a\u0004\b>\u0010?R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010A\u0012\u0004\bD\u00104\u001a\u0004\bB\u0010CR\"\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\bF\u00104\u001a\u0004\bE\u0010?R1\u0010\u0010\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bH\u00104\u001a\u0004\bG\u0010CRF\u0010\u0014\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0013¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010I\u0012\u0004\bL\u00104\u001a\u0004\bJ\u0010KR1\u0010\u0015\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010A\u0012\u0004\bN\u00104\u001a\u0004\bM\u0010CRF\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0013¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010I\u0012\u0004\bP\u00104\u001a\u0004\bO\u0010KR1\u0010\u0017\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010A\u0012\u0004\bR\u00104\u001a\u0004\bQ\u0010CR\"\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010=\u0012\u0004\bT\u00104\u001a\u0004\bS\u0010?¨\u0006W"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate;", "", "", "id", "order_id", "rhs_account_number", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "term", "Lcom/robinhood/rosetta/common/MoneyDto;", "cost_basis", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "available_shares", "gain_loss", "selected_shares", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "purchase_date", "display_value", "lot_date", "gain_loss_ratio", "total_cost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getOrder_id", "getOrder_id$annotations", "getRhs_account_number", "getRhs_account_number$annotations", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "getTerm", "()Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "getTerm$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCost_basis", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCost_basis$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getAvailable_shares", "()Lcom/robinhood/idl/IdlDecimal;", "getAvailable_shares$annotations", "getGain_loss", "getGain_loss$annotations", "getSelected_shares", "getSelected_shares$annotations", "Lj$/time/Instant;", "getPurchase_date", "()Lj$/time/Instant;", "getPurchase_date$annotations", "getDisplay_value", "getDisplay_value$annotations", "getLot_date", "getLot_date$annotations", "getGain_loss_ratio", "getGain_loss_ratio$annotations", "getTotal_cost", "getTotal_cost$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal available_shares;
        private final MoneyDto cost_basis;
        private final IdlDecimal display_value;
        private final MoneyDto gain_loss;
        private final IdlDecimal gain_loss_ratio;
        private final String id;
        private final Instant lot_date;
        private final String order_id;
        private final Instant purchase_date;
        private final String rhs_account_number;
        private final IdlDecimal selected_shares;
        private final TaxLotTermDto term;
        private final MoneyDto total_cost;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (TaxLotTermDto) null, (MoneyDto) null, (IdlDecimal) null, (MoneyDto) null, (IdlDecimal) null, (Instant) null, (IdlDecimal) null, (Instant) null, (IdlDecimal) null, (MoneyDto) null, 8191, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && this.term == surrogate.term && Intrinsics.areEqual(this.cost_basis, surrogate.cost_basis) && Intrinsics.areEqual(this.available_shares, surrogate.available_shares) && Intrinsics.areEqual(this.gain_loss, surrogate.gain_loss) && Intrinsics.areEqual(this.selected_shares, surrogate.selected_shares) && Intrinsics.areEqual(this.purchase_date, surrogate.purchase_date) && Intrinsics.areEqual(this.display_value, surrogate.display_value) && Intrinsics.areEqual(this.lot_date, surrogate.lot_date) && Intrinsics.areEqual(this.gain_loss_ratio, surrogate.gain_loss_ratio) && Intrinsics.areEqual(this.total_cost, surrogate.total_cost);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.order_id.hashCode()) * 31) + this.rhs_account_number.hashCode()) * 31) + this.term.hashCode()) * 31;
            MoneyDto moneyDto = this.cost_basis;
            int iHashCode2 = (((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.available_shares.hashCode()) * 31;
            MoneyDto moneyDto2 = this.gain_loss;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            IdlDecimal idlDecimal = this.selected_shares;
            int iHashCode4 = (iHashCode3 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            Instant instant = this.purchase_date;
            int iHashCode5 = (iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.display_value;
            int iHashCode6 = (iHashCode5 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            Instant instant2 = this.lot_date;
            int iHashCode7 = (iHashCode6 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.gain_loss_ratio;
            int iHashCode8 = (iHashCode7 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31;
            MoneyDto moneyDto3 = this.total_cost;
            return iHashCode8 + (moneyDto3 != null ? moneyDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", order_id=" + this.order_id + ", rhs_account_number=" + this.rhs_account_number + ", term=" + this.term + ", cost_basis=" + this.cost_basis + ", available_shares=" + this.available_shares + ", gain_loss=" + this.gain_loss + ", selected_shares=" + this.selected_shares + ", purchase_date=" + this.purchase_date + ", display_value=" + this.display_value + ", lot_date=" + this.lot_date + ", gain_loss_ratio=" + this.gain_loss_ratio + ", total_cost=" + this.total_cost + ")";
        }

        /* compiled from: StreamTaxLotInformationResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamTaxLotInformationResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, TaxLotTermDto taxLotTermDto, MoneyDto moneyDto, IdlDecimal idlDecimal, MoneyDto moneyDto2, IdlDecimal idlDecimal2, Instant instant, IdlDecimal idlDecimal3, Instant instant2, IdlDecimal idlDecimal4, MoneyDto moneyDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str2;
            }
            if ((i & 4) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str3;
            }
            if ((i & 8) == 0) {
                this.term = TaxLotTermDto.INSTANCE.getZeroValue();
            } else {
                this.term = taxLotTermDto;
            }
            if ((i & 16) == 0) {
                this.cost_basis = null;
            } else {
                this.cost_basis = moneyDto;
            }
            if ((i & 32) == 0) {
                this.available_shares = new IdlDecimal("");
            } else {
                this.available_shares = idlDecimal;
            }
            if ((i & 64) == 0) {
                this.gain_loss = null;
            } else {
                this.gain_loss = moneyDto2;
            }
            if ((i & 128) == 0) {
                this.selected_shares = null;
            } else {
                this.selected_shares = idlDecimal2;
            }
            if ((i & 256) == 0) {
                this.purchase_date = null;
            } else {
                this.purchase_date = instant;
            }
            if ((i & 512) == 0) {
                this.display_value = null;
            } else {
                this.display_value = idlDecimal3;
            }
            if ((i & 1024) == 0) {
                this.lot_date = null;
            } else {
                this.lot_date = instant2;
            }
            if ((i & 2048) == 0) {
                this.gain_loss_ratio = null;
            } else {
                this.gain_loss_ratio = idlDecimal4;
            }
            if ((i & 4096) == 0) {
                this.total_cost = null;
            } else {
                this.total_cost = moneyDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.order_id);
            }
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.rhs_account_number);
            }
            if (self.term != TaxLotTermDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TaxLotTermDto.Serializer.INSTANCE, self.term);
            }
            MoneyDto moneyDto = self.cost_basis;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.available_shares, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.available_shares);
            }
            MoneyDto moneyDto2 = self.gain_loss;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            IdlDecimal idlDecimal = self.selected_shares;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            Instant instant = self.purchase_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant);
            }
            IdlDecimal idlDecimal2 = self.display_value;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            Instant instant2 = self.lot_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant2);
            }
            IdlDecimal idlDecimal3 = self.gain_loss_ratio;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            MoneyDto moneyDto3 = self.total_cost;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
        }

        public Surrogate(String id, String order_id, String rhs_account_number, TaxLotTermDto term, MoneyDto moneyDto, IdlDecimal available_shares, MoneyDto moneyDto2, IdlDecimal idlDecimal, Instant instant, IdlDecimal idlDecimal2, Instant instant2, IdlDecimal idlDecimal3, MoneyDto moneyDto3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(term, "term");
            Intrinsics.checkNotNullParameter(available_shares, "available_shares");
            this.id = id;
            this.order_id = order_id;
            this.rhs_account_number = rhs_account_number;
            this.term = term;
            this.cost_basis = moneyDto;
            this.available_shares = available_shares;
            this.gain_loss = moneyDto2;
            this.selected_shares = idlDecimal;
            this.purchase_date = instant;
            this.display_value = idlDecimal2;
            this.lot_date = instant2;
            this.gain_loss_ratio = idlDecimal3;
            this.total_cost = moneyDto3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, TaxLotTermDto taxLotTermDto, MoneyDto moneyDto, IdlDecimal idlDecimal, MoneyDto moneyDto2, IdlDecimal idlDecimal2, Instant instant, IdlDecimal idlDecimal3, Instant instant2, IdlDecimal idlDecimal4, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? TaxLotTermDto.INSTANCE.getZeroValue() : taxLotTermDto, (i & 16) != 0 ? null : moneyDto, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : idlDecimal2, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : idlDecimal3, (i & 1024) != 0 ? null : instant2, (i & 2048) != 0 ? null : idlDecimal4, (i & 4096) != 0 ? null : moneyDto3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final TaxLotTermDto getTerm() {
            return this.term;
        }

        public final MoneyDto getCost_basis() {
            return this.cost_basis;
        }

        public final IdlDecimal getAvailable_shares() {
            return this.available_shares;
        }

        public final MoneyDto getGain_loss() {
            return this.gain_loss;
        }

        public final IdlDecimal getSelected_shares() {
            return this.selected_shares;
        }

        public final Instant getPurchase_date() {
            return this.purchase_date;
        }

        public final IdlDecimal getDisplay_value() {
            return this.display_value;
        }

        public final Instant getLot_date() {
            return this.lot_date;
        }

        public final IdlDecimal getGain_loss_ratio() {
            return this.gain_loss_ratio;
        }

        public final MoneyDto getTotal_cost() {
            return this.total_cost;
        }
    }

    /* compiled from: StreamTaxLotInformationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamTaxLotInformationResponseDto, StreamTaxLotInformationResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamTaxLotInformationResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotInformationResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotInformationResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamTaxLotInformationResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamTaxLotInformationResponse> getProtoAdapter() {
            return StreamTaxLotInformationResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotInformationResponseDto getZeroValue() {
            return StreamTaxLotInformationResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotInformationResponseDto fromProto(StreamTaxLotInformationResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String order_id = proto.getOrder_id();
            String rhs_account_number = proto.getRhs_account_number();
            TaxLotTermDto taxLotTermDtoFromProto = TaxLotTermDto.INSTANCE.fromProto(proto.getTerm());
            Money cost_basis = proto.getCost_basis();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = cost_basis != null ? MoneyDto.INSTANCE.fromProto(cost_basis) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getAvailable_shares());
            Money gain_loss = proto.getGain_loss();
            MoneyDto moneyDtoFromProto2 = gain_loss != null ? MoneyDto.INSTANCE.fromProto(gain_loss) : null;
            String selected_shares = proto.getSelected_shares();
            IdlDecimal idlDecimal2 = selected_shares != null ? new IdlDecimal(selected_shares) : null;
            Instant purchase_date = proto.getPurchase_date();
            String display_value = proto.getDisplay_value();
            IdlDecimal idlDecimal3 = display_value != null ? new IdlDecimal(display_value) : null;
            Instant lot_date = proto.getLot_date();
            String gain_loss_ratio = proto.getGain_loss_ratio();
            IdlDecimal idlDecimal4 = gain_loss_ratio != null ? new IdlDecimal(gain_loss_ratio) : null;
            Money total_cost = proto.getTotal_cost();
            return new StreamTaxLotInformationResponseDto(new Surrogate(id, order_id, rhs_account_number, taxLotTermDtoFromProto, moneyDtoFromProto, idlDecimal, moneyDtoFromProto2, idlDecimal2, purchase_date, idlDecimal3, lot_date, idlDecimal4, total_cost != null ? MoneyDto.INSTANCE.fromProto(total_cost) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.StreamTaxLotInformationResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotInformationResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamTaxLotInformationResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamTaxLotInformationResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<StreamTaxLotInformationResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.StreamTaxLotInformationResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamTaxLotInformationResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamTaxLotInformationResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamTaxLotInformationResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamTaxLotInformationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.StreamTaxLotInformationResponseDto";
        }
    }
}
