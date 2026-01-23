package wormhole.service.p554v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: RealizedGainLossItemComponentDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010(¨\u00064"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/RealizedGainLossItemComponent;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "Lcom/robinhood/rosetta/common/MoneyDto;", "average_open_price", "average_close_price", "opening_amount", "closing_amount", "realized_return", "realized_return_percentage", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lwormhole/service/v1/RealizedGainLossItemComponent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getAverage_open_price", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAverage_close_price", "getOpening_amount", "getClosing_amount", "getRealized_return", "getRealized_return_percentage", "Companion", "Surrogate", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class RealizedGainLossItemComponentDto implements Dto3<RealizedGainLossItemComponent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RealizedGainLossItemComponentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RealizedGainLossItemComponentDto, RealizedGainLossItemComponent>> binaryBase64Serializer$delegate;
    private static final RealizedGainLossItemComponentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RealizedGainLossItemComponentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RealizedGainLossItemComponentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final MoneyDto getAverage_open_price() {
        return this.surrogate.getAverage_open_price();
    }

    public final MoneyDto getAverage_close_price() {
        return this.surrogate.getAverage_close_price();
    }

    public final MoneyDto getOpening_amount() {
        return this.surrogate.getOpening_amount();
    }

    public final MoneyDto getClosing_amount() {
        return this.surrogate.getClosing_amount();
    }

    public final MoneyDto getRealized_return() {
        return this.surrogate.getRealized_return();
    }

    public final IdlDecimal getRealized_return_percentage() {
        return this.surrogate.getRealized_return_percentage();
    }

    public /* synthetic */ RealizedGainLossItemComponentDto(IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : moneyDto3, (i & 16) != 0 ? null : moneyDto4, (i & 32) != 0 ? null : moneyDto5, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealizedGainLossItemComponentDto(IdlDecimal quantity, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal realized_return_percentage) {
        this(new Surrogate(quantity, moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto5, realized_return_percentage));
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
    }

    @Override // com.robinhood.idl.Dto
    public RealizedGainLossItemComponent toProto() {
        String stringValue = this.surrogate.getQuantity().getStringValue();
        MoneyDto average_open_price = this.surrogate.getAverage_open_price();
        Money proto = average_open_price != null ? average_open_price.toProto() : null;
        MoneyDto average_close_price = this.surrogate.getAverage_close_price();
        Money proto2 = average_close_price != null ? average_close_price.toProto() : null;
        MoneyDto opening_amount = this.surrogate.getOpening_amount();
        Money proto3 = opening_amount != null ? opening_amount.toProto() : null;
        MoneyDto closing_amount = this.surrogate.getClosing_amount();
        Money proto4 = closing_amount != null ? closing_amount.toProto() : null;
        MoneyDto realized_return = this.surrogate.getRealized_return();
        return new RealizedGainLossItemComponent(stringValue, proto, proto2, proto3, proto4, realized_return != null ? realized_return.toProto() : null, this.surrogate.getRealized_return_percentage().getStringValue(), null, 128, null);
    }

    public String toString() {
        return "[RealizedGainLossItemComponentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RealizedGainLossItemComponentDto) && Intrinsics.areEqual(((RealizedGainLossItemComponentDto) other).surrogate, this.surrogate);
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
    /* compiled from: RealizedGainLossItemComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bu\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010.R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b5\u0010+\u001a\u0004\b4\u0010.R\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b7\u0010+\u001a\u0004\b6\u0010.R/\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010'\u0012\u0004\b9\u0010+\u001a\u0004\b8\u0010)¨\u0006<"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "Lcom/robinhood/rosetta/common/MoneyDto;", "average_open_price", "average_close_price", "opening_amount", "closing_amount", "realized_return", "realized_return_percentage", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAverage_open_price", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAverage_open_price$annotations", "getAverage_close_price", "getAverage_close_price$annotations", "getOpening_amount", "getOpening_amount$annotations", "getClosing_amount", "getClosing_amount$annotations", "getRealized_return", "getRealized_return$annotations", "getRealized_return_percentage", "getRealized_return_percentage$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto average_close_price;
        private final MoneyDto average_open_price;
        private final MoneyDto closing_amount;
        private final MoneyDto opening_amount;
        private final IdlDecimal quantity;
        private final MoneyDto realized_return;
        private final IdlDecimal realized_return_percentage;

        public Surrogate() {
            this((IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (IdlDecimal) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.average_open_price, surrogate.average_open_price) && Intrinsics.areEqual(this.average_close_price, surrogate.average_close_price) && Intrinsics.areEqual(this.opening_amount, surrogate.opening_amount) && Intrinsics.areEqual(this.closing_amount, surrogate.closing_amount) && Intrinsics.areEqual(this.realized_return, surrogate.realized_return) && Intrinsics.areEqual(this.realized_return_percentage, surrogate.realized_return_percentage);
        }

        public int hashCode() {
            int iHashCode = this.quantity.hashCode() * 31;
            MoneyDto moneyDto = this.average_open_price;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.average_close_price;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.opening_amount;
            int iHashCode4 = (iHashCode3 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.closing_amount;
            int iHashCode5 = (iHashCode4 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.realized_return;
            return ((iHashCode5 + (moneyDto5 != null ? moneyDto5.hashCode() : 0)) * 31) + this.realized_return_percentage.hashCode();
        }

        public String toString() {
            return "Surrogate(quantity=" + this.quantity + ", average_open_price=" + this.average_open_price + ", average_close_price=" + this.average_close_price + ", opening_amount=" + this.opening_amount + ", closing_amount=" + this.closing_amount + ", realized_return=" + this.realized_return + ", realized_return_percentage=" + this.realized_return_percentage + ")";
        }

        /* compiled from: RealizedGainLossItemComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RealizedGainLossItemComponentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
            this.quantity = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.average_open_price = null;
            } else {
                this.average_open_price = moneyDto;
            }
            if ((i & 4) == 0) {
                this.average_close_price = null;
            } else {
                this.average_close_price = moneyDto2;
            }
            if ((i & 8) == 0) {
                this.opening_amount = null;
            } else {
                this.opening_amount = moneyDto3;
            }
            if ((i & 16) == 0) {
                this.closing_amount = null;
            } else {
                this.closing_amount = moneyDto4;
            }
            if ((i & 32) == 0) {
                this.realized_return = null;
            } else {
                this.realized_return = moneyDto5;
            }
            if ((i & 64) == 0) {
                this.realized_return_percentage = new IdlDecimal("");
            } else {
                this.realized_return_percentage = idlDecimal2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            MoneyDto moneyDto = self.average_open_price;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.average_close_price;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.opening_amount;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.closing_amount;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.realized_return;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            if (Intrinsics.areEqual(self.realized_return_percentage, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.realized_return_percentage);
        }

        public Surrogate(IdlDecimal quantity, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal realized_return_percentage) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
            this.quantity = quantity;
            this.average_open_price = moneyDto;
            this.average_close_price = moneyDto2;
            this.opening_amount = moneyDto3;
            this.closing_amount = moneyDto4;
            this.realized_return = moneyDto5;
            this.realized_return_percentage = realized_return_percentage;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : moneyDto3, (i & 16) != 0 ? null : moneyDto4, (i & 32) != 0 ? null : moneyDto5, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal2);
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final MoneyDto getAverage_open_price() {
            return this.average_open_price;
        }

        public final MoneyDto getAverage_close_price() {
            return this.average_close_price;
        }

        public final MoneyDto getOpening_amount() {
            return this.opening_amount;
        }

        public final MoneyDto getClosing_amount() {
            return this.closing_amount;
        }

        public final MoneyDto getRealized_return() {
            return this.realized_return;
        }

        public final IdlDecimal getRealized_return_percentage() {
            return this.realized_return_percentage;
        }
    }

    /* compiled from: RealizedGainLossItemComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemComponentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "Lwormhole/service/v1/RealizedGainLossItemComponent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RealizedGainLossItemComponentDto, RealizedGainLossItemComponent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RealizedGainLossItemComponentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealizedGainLossItemComponentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealizedGainLossItemComponentDto> getBinaryBase64Serializer() {
            return (KSerializer) RealizedGainLossItemComponentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RealizedGainLossItemComponent> getProtoAdapter() {
            return RealizedGainLossItemComponent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealizedGainLossItemComponentDto getZeroValue() {
            return RealizedGainLossItemComponentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealizedGainLossItemComponentDto fromProto(RealizedGainLossItemComponent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            Money average_open_price = proto.getAverage_open_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = average_open_price != null ? MoneyDto.INSTANCE.fromProto(average_open_price) : null;
            Money average_close_price = proto.getAverage_close_price();
            MoneyDto moneyDtoFromProto2 = average_close_price != null ? MoneyDto.INSTANCE.fromProto(average_close_price) : null;
            Money opening_amount = proto.getOpening_amount();
            MoneyDto moneyDtoFromProto3 = opening_amount != null ? MoneyDto.INSTANCE.fromProto(opening_amount) : null;
            Money closing_amount = proto.getClosing_amount();
            MoneyDto moneyDtoFromProto4 = closing_amount != null ? MoneyDto.INSTANCE.fromProto(closing_amount) : null;
            Money realized_return = proto.getRealized_return();
            return new RealizedGainLossItemComponentDto(new Surrogate(idlDecimal, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, moneyDtoFromProto4, realized_return != null ? MoneyDto.INSTANCE.fromProto(realized_return) : null, new IdlDecimal(proto.getRealized_return_percentage())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.RealizedGainLossItemComponentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealizedGainLossItemComponentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RealizedGainLossItemComponentDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RealizedGainLossItemComponentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemComponentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/RealizedGainLossItemComponentDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/RealizedGainLossItemComponentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RealizedGainLossItemComponentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.RealizedGainLossItemComponent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RealizedGainLossItemComponentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RealizedGainLossItemComponentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RealizedGainLossItemComponentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RealizedGainLossItemComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemComponentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "wormhole.service.v1.RealizedGainLossItemComponentDto";
        }
    }
}
