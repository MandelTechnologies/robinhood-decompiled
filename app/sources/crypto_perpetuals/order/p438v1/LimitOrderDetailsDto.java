package crypto_perpetuals.order.p438v1;

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
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.order.p438v1.BaseOrderDetailsDto;
import crypto_perpetuals.order.p438v1.TimeInForceDto;
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

/* compiled from: LimitOrderDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/order/v1/LimitOrderDetails;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate;)V", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "base_order_details", "Lcom/robinhood/idl/IdlDecimal;", "limit_price", "Lcrypto_perpetuals/order/v1/TimeInForceDto;", "time_in_force", "(Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/TimeInForceDto;)V", "toProto", "()Lcrypto_perpetuals/order/v1/LimitOrderDetails;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate;", "getBase_order_details", "()Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "getLimit_price", "()Lcom/robinhood/idl/IdlDecimal;", "getTime_in_force", "()Lcrypto_perpetuals/order/v1/TimeInForceDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class LimitOrderDetailsDto implements Dto3<LimitOrderDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LimitOrderDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LimitOrderDetailsDto, LimitOrderDetails>> binaryBase64Serializer$delegate;
    private static final LimitOrderDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LimitOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LimitOrderDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BaseOrderDetailsDto getBase_order_details() {
        return this.surrogate.getBase_order_details();
    }

    public final IdlDecimal getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public /* synthetic */ LimitOrderDetailsDto(BaseOrderDetailsDto baseOrderDetailsDto, IdlDecimal idlDecimal, TimeInForceDto timeInForceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseOrderDetailsDto, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? null : timeInForceDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOrderDetailsDto(BaseOrderDetailsDto baseOrderDetailsDto, IdlDecimal limit_price, TimeInForceDto timeInForceDto) {
        this(new Surrogate(baseOrderDetailsDto, limit_price, timeInForceDto));
        Intrinsics.checkNotNullParameter(limit_price, "limit_price");
    }

    @Override // com.robinhood.idl.Dto
    public LimitOrderDetails toProto() {
        BaseOrderDetailsDto base_order_details = this.surrogate.getBase_order_details();
        BaseOrderDetails proto = base_order_details != null ? base_order_details.toProto() : null;
        String stringValue = this.surrogate.getLimit_price().getStringValue();
        TimeInForceDto time_in_force = this.surrogate.getTime_in_force();
        return new LimitOrderDetails(proto, stringValue, time_in_force != null ? time_in_force.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[LimitOrderDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LimitOrderDetailsDto) && Intrinsics.areEqual(((LimitOrderDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: LimitOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B8\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate;", "", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "base_order_details", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "limit_price", "Lcrypto_perpetuals/order/v1/TimeInForceDto;", "time_in_force", "<init>", "(Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/TimeInForceDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_perpetuals/order/v1/BaseOrderDetailsDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/order/v1/TimeInForceDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_order_v1_externalRelease", "(Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "getBase_order_details", "()Lcrypto_perpetuals/order/v1/BaseOrderDetailsDto;", "getBase_order_details$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getLimit_price", "()Lcom/robinhood/idl/IdlDecimal;", "getLimit_price$annotations", "Lcrypto_perpetuals/order/v1/TimeInForceDto;", "getTime_in_force", "()Lcrypto_perpetuals/order/v1/TimeInForceDto;", "getTime_in_force$annotations", "Companion", "$serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BaseOrderDetailsDto base_order_details;
        private final IdlDecimal limit_price;
        private final TimeInForceDto time_in_force;

        public Surrogate() {
            this((BaseOrderDetailsDto) null, (IdlDecimal) null, (TimeInForceDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.base_order_details, surrogate.base_order_details) && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.time_in_force, surrogate.time_in_force);
        }

        public int hashCode() {
            BaseOrderDetailsDto baseOrderDetailsDto = this.base_order_details;
            int iHashCode = (((baseOrderDetailsDto == null ? 0 : baseOrderDetailsDto.hashCode()) * 31) + this.limit_price.hashCode()) * 31;
            TimeInForceDto timeInForceDto = this.time_in_force;
            return iHashCode + (timeInForceDto != null ? timeInForceDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(base_order_details=" + this.base_order_details + ", limit_price=" + this.limit_price + ", time_in_force=" + this.time_in_force + ")";
        }

        /* compiled from: LimitOrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LimitOrderDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BaseOrderDetailsDto baseOrderDetailsDto, IdlDecimal idlDecimal, TimeInForceDto timeInForceDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.base_order_details = null;
            } else {
                this.base_order_details = baseOrderDetailsDto;
            }
            if ((i & 2) == 0) {
                this.limit_price = new IdlDecimal("");
            } else {
                this.limit_price = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.time_in_force = null;
            } else {
                this.time_in_force = timeInForceDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_order_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BaseOrderDetailsDto baseOrderDetailsDto = self.base_order_details;
            if (baseOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BaseOrderDetailsDto.Serializer.INSTANCE, baseOrderDetailsDto);
            }
            if (!Intrinsics.areEqual(self.limit_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.limit_price);
            }
            TimeInForceDto timeInForceDto = self.time_in_force;
            if (timeInForceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TimeInForceDto.Serializer.INSTANCE, timeInForceDto);
            }
        }

        public Surrogate(BaseOrderDetailsDto baseOrderDetailsDto, IdlDecimal limit_price, TimeInForceDto timeInForceDto) {
            Intrinsics.checkNotNullParameter(limit_price, "limit_price");
            this.base_order_details = baseOrderDetailsDto;
            this.limit_price = limit_price;
            this.time_in_force = timeInForceDto;
        }

        public final BaseOrderDetailsDto getBase_order_details() {
            return this.base_order_details;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public /* synthetic */ Surrogate(BaseOrderDetailsDto baseOrderDetailsDto, IdlDecimal idlDecimal, TimeInForceDto timeInForceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : baseOrderDetailsDto, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? null : timeInForceDto);
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }
    }

    /* compiled from: LimitOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "Lcrypto_perpetuals/order/v1/LimitOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LimitOrderDetailsDto, LimitOrderDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LimitOrderDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LimitOrderDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LimitOrderDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) LimitOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LimitOrderDetails> getProtoAdapter() {
            return LimitOrderDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LimitOrderDetailsDto getZeroValue() {
            return LimitOrderDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LimitOrderDetailsDto fromProto(LimitOrderDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BaseOrderDetails base_order_details = proto.getBase_order_details();
            DefaultConstructorMarker defaultConstructorMarker = null;
            BaseOrderDetailsDto baseOrderDetailsDtoFromProto = base_order_details != null ? BaseOrderDetailsDto.INSTANCE.fromProto(base_order_details) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getLimit_price());
            TimeInForce time_in_force = proto.getTime_in_force();
            return new LimitOrderDetailsDto(new Surrogate(baseOrderDetailsDtoFromProto, idlDecimal, time_in_force != null ? TimeInForceDto.INSTANCE.fromProto(time_in_force) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.order.v1.LimitOrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LimitOrderDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LimitOrderDetailsDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LimitOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<LimitOrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.order.v1.LimitOrderDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LimitOrderDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LimitOrderDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LimitOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LimitOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/LimitOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "crypto_perpetuals.order.v1.LimitOrderDetailsDto";
        }
    }
}
