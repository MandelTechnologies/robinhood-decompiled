package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import okio.ByteString;
import rosetta.nummus.FeeStructure;
import rosetta.nummus.FeeStructureDto;
import rosetta.nummus.FeeType;
import rosetta.nummus.FeeTypeDto;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.SideDto;
import rosetta.nummus.order.Type;
import rosetta.nummus.order.TypeDto;

/* compiled from: FeeEstimationResponseDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bµ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b6\u00103¨\u0006;"}, m3636d2 = {"Lnummus/v1/FeeEstimationResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/FeeEstimationResponse;", "Landroid/os/Parcelable;", "Lnummus/v1/FeeEstimationResponseDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/FeeEstimationResponseDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "fee_ratio", "min_fee_amount", "", "currency_pair_id", "Lrosetta/nummus/order/SideDto;", "side", "quantity", "Lrosetta/nummus/order/TypeDto;", "order_type", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "limit_price", "stop_price", "Lrosetta/nummus/FeeTypeDto;", "fee_type", "Lrosetta/nummus/FeeStructureDto;", "fee_structure", "estimated_fee_amount", "exchange_fee_ratio", "robinhood_fee_ratio", "account_id", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/FeeTypeDto;Lrosetta/nummus/FeeStructureDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "toProto", "()Lnummus/v1/FeeEstimationResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/FeeEstimationResponseDto$Surrogate;", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getMin_fee_amount", "getExchange_fee_ratio", "getRobinhood_fee_ratio", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class FeeEstimationResponseDto implements Dto3<FeeEstimationResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeEstimationResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeEstimationResponseDto, FeeEstimationResponse>> binaryBase64Serializer$delegate;
    private static final FeeEstimationResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeEstimationResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeEstimationResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getFee_ratio() {
        return this.surrogate.getFee_ratio();
    }

    public final IdlDecimal getMin_fee_amount() {
        return this.surrogate.getMin_fee_amount();
    }

    public final IdlDecimal getExchange_fee_ratio() {
        return this.surrogate.getExchange_fee_ratio();
    }

    public final IdlDecimal getRobinhood_fee_ratio() {
        return this.surrogate.getRobinhood_fee_ratio();
    }

    public /* synthetic */ FeeEstimationResponseDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, SideDto sideDto, IdlDecimal idlDecimal3, TypeDto typeDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, FeeTypeDto feeTypeDto, FeeStructureDto feeStructureDto, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : sideDto, (i & 16) != 0 ? null : idlDecimal3, (i & 32) != 0 ? null : typeDto, (i & 64) != 0 ? null : idlDecimal4, (i & 128) != 0 ? null : idlDecimal5, (i & 256) != 0 ? null : idlDecimal6, (i & 512) != 0 ? FeeTypeDto.INSTANCE.getZeroValue() : feeTypeDto, (i & 1024) != 0 ? FeeStructureDto.INSTANCE.getZeroValue() : feeStructureDto, (i & 2048) != 0 ? null : idlDecimal7, (i & 4096) != 0 ? null : idlDecimal8, (i & 8192) != 0 ? null : idlDecimal9, (i & 16384) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeeEstimationResponseDto(IdlDecimal fee_ratio, IdlDecimal min_fee_amount, String str, SideDto sideDto, IdlDecimal idlDecimal, TypeDto typeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, FeeTypeDto fee_type, FeeStructureDto fee_structure, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, String str2) {
        this(new Surrogate(fee_ratio, min_fee_amount, str, sideDto, idlDecimal, typeDto, idlDecimal2, idlDecimal3, idlDecimal4, fee_type, fee_structure, idlDecimal5, idlDecimal6, idlDecimal7, str2));
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_fee_amount, "min_fee_amount");
        Intrinsics.checkNotNullParameter(fee_type, "fee_type");
        Intrinsics.checkNotNullParameter(fee_structure, "fee_structure");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FeeEstimationResponse toProto() {
        String stringValue = this.surrogate.getFee_ratio().getStringValue();
        String stringValue2 = this.surrogate.getMin_fee_amount().getStringValue();
        String currency_pair_id = this.surrogate.getCurrency_pair_id();
        SideDto side = this.surrogate.getSide();
        Side side2 = side != null ? (Side) side.toProto() : null;
        IdlDecimal quantity = this.surrogate.getQuantity();
        String stringValue3 = quantity != null ? quantity.getStringValue() : null;
        TypeDto order_type = this.surrogate.getOrder_type();
        Type type2 = order_type != null ? (Type) order_type.toProto() : null;
        IdlDecimal price = this.surrogate.getPrice();
        String stringValue4 = price != null ? price.getStringValue() : null;
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        String stringValue5 = limit_price != null ? limit_price.getStringValue() : null;
        IdlDecimal stop_price = this.surrogate.getStop_price();
        String stringValue6 = stop_price != null ? stop_price.getStringValue() : null;
        FeeType feeType = (FeeType) this.surrogate.getFee_type().toProto();
        FeeStructure feeStructure = (FeeStructure) this.surrogate.getFee_structure().toProto();
        IdlDecimal estimated_fee_amount = this.surrogate.getEstimated_fee_amount();
        String stringValue7 = estimated_fee_amount != null ? estimated_fee_amount.getStringValue() : null;
        IdlDecimal exchange_fee_ratio = this.surrogate.getExchange_fee_ratio();
        String stringValue8 = exchange_fee_ratio != null ? exchange_fee_ratio.getStringValue() : null;
        IdlDecimal robinhood_fee_ratio = this.surrogate.getRobinhood_fee_ratio();
        ByteString byteString = null;
        return new FeeEstimationResponse(stringValue, stringValue2, currency_pair_id, side2, stringValue3, type2, stringValue4, stringValue5, stringValue6, feeType, feeStructure, stringValue7, stringValue8, robinhood_fee_ratio != null ? robinhood_fee_ratio.getStringValue() : null, this.surrogate.getAccount_id(), byteString, 32768, null);
    }

    public String toString() {
        return "[FeeEstimationResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeEstimationResponseDto) && Intrinsics.areEqual(((FeeEstimationResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeEstimationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b/\b\u0083\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\Bº\u0002\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0019\b\u0002\u0010\u000f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0010\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0011\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0018\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bB±\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J'\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b8\u00106\u001a\u0004\b7\u00104R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b;\u00106\u001a\u0004\b:\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b?\u00106\u001a\u0004\b=\u0010>R1\u0010\f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\bA\u00106\u001a\u0004\b@\u00104R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bE\u00106\u001a\u0004\bC\u0010DR1\u0010\u000f\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00102\u0012\u0004\bG\u00106\u001a\u0004\bF\u00104R1\u0010\u0010\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00102\u0012\u0004\bI\u00106\u001a\u0004\bH\u00104R1\u0010\u0011\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00102\u0012\u0004\bK\u00106\u001a\u0004\bJ\u00104R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010L\u0012\u0004\bO\u00106\u001a\u0004\bM\u0010NR \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010P\u0012\u0004\bS\u00106\u001a\u0004\bQ\u0010RR1\u0010\u0016\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00102\u0012\u0004\bU\u00106\u001a\u0004\bT\u00104R1\u0010\u0017\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00102\u0012\u0004\bW\u00106\u001a\u0004\bV\u00104R1\u0010\u0018\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00102\u0012\u0004\bY\u00106\u001a\u0004\bX\u00104R\"\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00109\u0012\u0004\b[\u00106\u001a\u0004\bZ\u0010+¨\u0006^"}, m3636d2 = {"Lnummus/v1/FeeEstimationResponseDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "fee_ratio", "min_fee_amount", "", "currency_pair_id", "Lrosetta/nummus/order/SideDto;", "side", "quantity", "Lrosetta/nummus/order/TypeDto;", "order_type", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "limit_price", "stop_price", "Lrosetta/nummus/FeeTypeDto;", "fee_type", "Lrosetta/nummus/FeeStructureDto;", "fee_structure", "estimated_fee_amount", "exchange_fee_ratio", "robinhood_fee_ratio", "account_id", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/FeeTypeDto;Lrosetta/nummus/FeeStructureDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/FeeTypeDto;Lrosetta/nummus/FeeStructureDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/FeeEstimationResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio$annotations", "()V", "getMin_fee_amount", "getMin_fee_amount$annotations", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "Lrosetta/nummus/order/SideDto;", "getSide", "()Lrosetta/nummus/order/SideDto;", "getSide$annotations", "getQuantity", "getQuantity$annotations", "Lrosetta/nummus/order/TypeDto;", "getOrder_type", "()Lrosetta/nummus/order/TypeDto;", "getOrder_type$annotations", "getPrice", "getPrice$annotations", "getLimit_price", "getLimit_price$annotations", "getStop_price", "getStop_price$annotations", "Lrosetta/nummus/FeeTypeDto;", "getFee_type", "()Lrosetta/nummus/FeeTypeDto;", "getFee_type$annotations", "Lrosetta/nummus/FeeStructureDto;", "getFee_structure", "()Lrosetta/nummus/FeeStructureDto;", "getFee_structure$annotations", "getEstimated_fee_amount", "getEstimated_fee_amount$annotations", "getExchange_fee_ratio", "getExchange_fee_ratio$annotations", "getRobinhood_fee_ratio", "getRobinhood_fee_ratio$annotations", "getAccount_id", "getAccount_id$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String currency_pair_id;
        private final IdlDecimal estimated_fee_amount;
        private final IdlDecimal exchange_fee_ratio;
        private final IdlDecimal fee_ratio;
        private final FeeStructureDto fee_structure;
        private final FeeTypeDto fee_type;
        private final IdlDecimal limit_price;
        private final IdlDecimal min_fee_amount;
        private final TypeDto order_type;
        private final IdlDecimal price;
        private final IdlDecimal quantity;
        private final IdlDecimal robinhood_fee_ratio;
        private final SideDto side;
        private final IdlDecimal stop_price;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (String) null, (SideDto) null, (IdlDecimal) null, (TypeDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (FeeTypeDto) null, (FeeStructureDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, 32767, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio) && Intrinsics.areEqual(this.min_fee_amount, surrogate.min_fee_amount) && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && this.side == surrogate.side && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.order_type == surrogate.order_type && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && this.fee_type == surrogate.fee_type && this.fee_structure == surrogate.fee_structure && Intrinsics.areEqual(this.estimated_fee_amount, surrogate.estimated_fee_amount) && Intrinsics.areEqual(this.exchange_fee_ratio, surrogate.exchange_fee_ratio) && Intrinsics.areEqual(this.robinhood_fee_ratio, surrogate.robinhood_fee_ratio) && Intrinsics.areEqual(this.account_id, surrogate.account_id);
        }

        public int hashCode() {
            int iHashCode = ((this.fee_ratio.hashCode() * 31) + this.min_fee_amount.hashCode()) * 31;
            String str = this.currency_pair_id;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            SideDto sideDto = this.side;
            int iHashCode3 = (iHashCode2 + (sideDto == null ? 0 : sideDto.hashCode())) * 31;
            IdlDecimal idlDecimal = this.quantity;
            int iHashCode4 = (iHashCode3 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            TypeDto typeDto = this.order_type;
            int iHashCode5 = (iHashCode4 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.price;
            int iHashCode6 = (iHashCode5 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.limit_price;
            int iHashCode7 = (iHashCode6 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31;
            IdlDecimal idlDecimal4 = this.stop_price;
            int iHashCode8 = (((((iHashCode7 + (idlDecimal4 == null ? 0 : idlDecimal4.hashCode())) * 31) + this.fee_type.hashCode()) * 31) + this.fee_structure.hashCode()) * 31;
            IdlDecimal idlDecimal5 = this.estimated_fee_amount;
            int iHashCode9 = (iHashCode8 + (idlDecimal5 == null ? 0 : idlDecimal5.hashCode())) * 31;
            IdlDecimal idlDecimal6 = this.exchange_fee_ratio;
            int iHashCode10 = (iHashCode9 + (idlDecimal6 == null ? 0 : idlDecimal6.hashCode())) * 31;
            IdlDecimal idlDecimal7 = this.robinhood_fee_ratio;
            int iHashCode11 = (iHashCode10 + (idlDecimal7 == null ? 0 : idlDecimal7.hashCode())) * 31;
            String str2 = this.account_id;
            return iHashCode11 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(fee_ratio=" + this.fee_ratio + ", min_fee_amount=" + this.min_fee_amount + ", currency_pair_id=" + this.currency_pair_id + ", side=" + this.side + ", quantity=" + this.quantity + ", order_type=" + this.order_type + ", price=" + this.price + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ", fee_type=" + this.fee_type + ", fee_structure=" + this.fee_structure + ", estimated_fee_amount=" + this.estimated_fee_amount + ", exchange_fee_ratio=" + this.exchange_fee_ratio + ", robinhood_fee_ratio=" + this.robinhood_fee_ratio + ", account_id=" + this.account_id + ")";
        }

        /* compiled from: FeeEstimationResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/FeeEstimationResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/FeeEstimationResponseDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeEstimationResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, SideDto sideDto, IdlDecimal idlDecimal3, TypeDto typeDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, FeeTypeDto feeTypeDto, FeeStructureDto feeStructureDto, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.fee_ratio = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.min_fee_amount = new IdlDecimal("");
            } else {
                this.min_fee_amount = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.currency_pair_id = null;
            } else {
                this.currency_pair_id = str;
            }
            if ((i & 8) == 0) {
                this.side = null;
            } else {
                this.side = sideDto;
            }
            if ((i & 16) == 0) {
                this.quantity = null;
            } else {
                this.quantity = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.order_type = null;
            } else {
                this.order_type = typeDto;
            }
            if ((i & 64) == 0) {
                this.price = null;
            } else {
                this.price = idlDecimal4;
            }
            if ((i & 128) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal5;
            }
            if ((i & 256) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = idlDecimal6;
            }
            if ((i & 512) == 0) {
                this.fee_type = FeeTypeDto.INSTANCE.getZeroValue();
            } else {
                this.fee_type = feeTypeDto;
            }
            if ((i & 1024) == 0) {
                this.fee_structure = FeeStructureDto.INSTANCE.getZeroValue();
            } else {
                this.fee_structure = feeStructureDto;
            }
            if ((i & 2048) == 0) {
                this.estimated_fee_amount = null;
            } else {
                this.estimated_fee_amount = idlDecimal7;
            }
            if ((i & 4096) == 0) {
                this.exchange_fee_ratio = null;
            } else {
                this.exchange_fee_ratio = idlDecimal8;
            }
            if ((i & 8192) == 0) {
                this.robinhood_fee_ratio = null;
            } else {
                this.robinhood_fee_ratio = idlDecimal9;
            }
            if ((i & 16384) == 0) {
                this.account_id = null;
            } else {
                this.account_id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.fee_ratio, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.fee_ratio);
            }
            if (!Intrinsics.areEqual(self.min_fee_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.min_fee_amount);
            }
            String str = self.currency_pair_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            SideDto sideDto = self.side;
            if (sideDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SideDto.Serializer.INSTANCE, sideDto);
            }
            IdlDecimal idlDecimal = self.quantity;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            TypeDto typeDto = self.order_type;
            if (typeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TypeDto.Serializer.INSTANCE, typeDto);
            }
            IdlDecimal idlDecimal2 = self.price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            IdlDecimal idlDecimal3 = self.limit_price;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            IdlDecimal idlDecimal4 = self.stop_price;
            if (idlDecimal4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, idlDecimal4);
            }
            if (self.fee_type != FeeTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, FeeTypeDto.Serializer.INSTANCE, self.fee_type);
            }
            if (self.fee_structure != FeeStructureDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, FeeStructureDto.Serializer.INSTANCE, self.fee_structure);
            }
            IdlDecimal idlDecimal5 = self.estimated_fee_amount;
            if (idlDecimal5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal5);
            }
            IdlDecimal idlDecimal6 = self.exchange_fee_ratio;
            if (idlDecimal6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, idlDecimal6);
            }
            IdlDecimal idlDecimal7 = self.robinhood_fee_ratio;
            if (idlDecimal7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, IdlDecimalSerializer.INSTANCE, idlDecimal7);
            }
            String str2 = self.account_id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(IdlDecimal fee_ratio, IdlDecimal min_fee_amount, String str, SideDto sideDto, IdlDecimal idlDecimal, TypeDto typeDto, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, FeeTypeDto fee_type, FeeStructureDto fee_structure, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, String str2) {
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            Intrinsics.checkNotNullParameter(min_fee_amount, "min_fee_amount");
            Intrinsics.checkNotNullParameter(fee_type, "fee_type");
            Intrinsics.checkNotNullParameter(fee_structure, "fee_structure");
            this.fee_ratio = fee_ratio;
            this.min_fee_amount = min_fee_amount;
            this.currency_pair_id = str;
            this.side = sideDto;
            this.quantity = idlDecimal;
            this.order_type = typeDto;
            this.price = idlDecimal2;
            this.limit_price = idlDecimal3;
            this.stop_price = idlDecimal4;
            this.fee_type = fee_type;
            this.fee_structure = fee_structure;
            this.estimated_fee_amount = idlDecimal5;
            this.exchange_fee_ratio = idlDecimal6;
            this.robinhood_fee_ratio = idlDecimal7;
            this.account_id = str2;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, SideDto sideDto, IdlDecimal idlDecimal3, TypeDto typeDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, FeeTypeDto feeTypeDto, FeeStructureDto feeStructureDto, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : sideDto, (i & 16) != 0 ? null : idlDecimal3, (i & 32) != 0 ? null : typeDto, (i & 64) != 0 ? null : idlDecimal4, (i & 128) != 0 ? null : idlDecimal5, (i & 256) != 0 ? null : idlDecimal6, (i & 512) != 0 ? FeeTypeDto.INSTANCE.getZeroValue() : feeTypeDto, (i & 1024) != 0 ? FeeStructureDto.INSTANCE.getZeroValue() : feeStructureDto, (i & 2048) != 0 ? null : idlDecimal7, (i & 4096) != 0 ? null : idlDecimal8, (i & 8192) != 0 ? null : idlDecimal9, (i & 16384) != 0 ? null : str2);
        }

        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        public final IdlDecimal getMin_fee_amount() {
            return this.min_fee_amount;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final TypeDto getOrder_type() {
            return this.order_type;
        }

        public final IdlDecimal getPrice() {
            return this.price;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final FeeTypeDto getFee_type() {
            return this.fee_type;
        }

        public final FeeStructureDto getFee_structure() {
            return this.fee_structure;
        }

        public final IdlDecimal getEstimated_fee_amount() {
            return this.estimated_fee_amount;
        }

        public final IdlDecimal getExchange_fee_ratio() {
            return this.exchange_fee_ratio;
        }

        public final IdlDecimal getRobinhood_fee_ratio() {
            return this.robinhood_fee_ratio;
        }

        public final String getAccount_id() {
            return this.account_id;
        }
    }

    /* compiled from: FeeEstimationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/FeeEstimationResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/FeeEstimationResponseDto;", "Lnummus/v1/FeeEstimationResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/FeeEstimationResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeEstimationResponseDto, FeeEstimationResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeEstimationResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeEstimationResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeEstimationResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeEstimationResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeEstimationResponse> getProtoAdapter() {
            return FeeEstimationResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeEstimationResponseDto getZeroValue() {
            return FeeEstimationResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeEstimationResponseDto fromProto(FeeEstimationResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getFee_ratio());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getMin_fee_amount());
            String currency_pair_id = proto.getCurrency_pair_id();
            Side side = proto.getSide();
            SideDto sideDtoFromProto = side != null ? SideDto.INSTANCE.fromProto(side) : null;
            String quantity = proto.getQuantity();
            IdlDecimal idlDecimal3 = quantity != null ? new IdlDecimal(quantity) : null;
            Type order_type = proto.getOrder_type();
            TypeDto typeDtoFromProto = order_type != null ? TypeDto.INSTANCE.fromProto(order_type) : null;
            String price = proto.getPrice();
            IdlDecimal idlDecimal4 = price != null ? new IdlDecimal(price) : null;
            String limit_price = proto.getLimit_price();
            IdlDecimal idlDecimal5 = limit_price != null ? new IdlDecimal(limit_price) : null;
            String stop_price = proto.getStop_price();
            IdlDecimal idlDecimal6 = stop_price != null ? new IdlDecimal(stop_price) : null;
            FeeTypeDto feeTypeDtoFromProto = FeeTypeDto.INSTANCE.fromProto(proto.getFee_type());
            FeeStructureDto feeStructureDtoFromProto = FeeStructureDto.INSTANCE.fromProto(proto.getFee_structure());
            String estimated_fee_amount = proto.getEstimated_fee_amount();
            IdlDecimal idlDecimal7 = estimated_fee_amount != null ? new IdlDecimal(estimated_fee_amount) : null;
            String exchange_fee_ratio = proto.getExchange_fee_ratio();
            IdlDecimal idlDecimal8 = exchange_fee_ratio != null ? new IdlDecimal(exchange_fee_ratio) : null;
            String robinhood_fee_ratio = proto.getRobinhood_fee_ratio();
            return new FeeEstimationResponseDto(new Surrogate(idlDecimal, idlDecimal2, currency_pair_id, sideDtoFromProto, idlDecimal3, typeDtoFromProto, idlDecimal4, idlDecimal5, idlDecimal6, feeTypeDtoFromProto, feeStructureDtoFromProto, idlDecimal7, idlDecimal8, robinhood_fee_ratio != null ? new IdlDecimal(robinhood_fee_ratio) : null, proto.getAccount_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.FeeEstimationResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeEstimationResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeEstimationResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeEstimationResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/FeeEstimationResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/FeeEstimationResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/FeeEstimationResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<FeeEstimationResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.FeeEstimationResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeEstimationResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeEstimationResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeEstimationResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeEstimationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/FeeEstimationResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "nummus.v1.FeeEstimationResponseDto";
        }
    }
}
