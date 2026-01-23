package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderStateDto;

/* compiled from: ReplacesOrderDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u000fH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000fH\u0016J\b\u0010'\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Surrogate;)V", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "state", "Lrosetta/mainst/OrderStateDto;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "version", "", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;I)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getState", "()Lrosetta/mainst/OrderStateDto;", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getVersion", "()I", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class ReplacesOrderDetailsDto implements Dto3<ReplacesOrderDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ReplacesOrderDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ReplacesOrderDetailsDto, ReplacesOrderDetails>> binaryBase64Serializer$delegate;
    private static final ReplacesOrderDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ReplacesOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ReplacesOrderDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final OrderStateDto getState() {
        return this.surrogate.getState();
    }

    public final DecimalDto getCancelled_quantity() {
        return this.surrogate.getCancelled_quantity();
    }

    public final int getVersion() {
        return this.surrogate.getVersion();
    }

    public /* synthetic */ ReplacesOrderDetailsDto(UUIDDto uUIDDto, OrderStateDto orderStateDto, DecimalDto decimalDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i2 & 4) != 0 ? null : decimalDto, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplacesOrderDetailsDto(UUIDDto uUIDDto, OrderStateDto state, DecimalDto decimalDto, int i) {
        this(new Surrogate(uUIDDto, state, decimalDto, i));
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public static /* synthetic */ ReplacesOrderDetailsDto copy$default(ReplacesOrderDetailsDto replacesOrderDetailsDto, UUIDDto uUIDDto, OrderStateDto orderStateDto, DecimalDto decimalDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uUIDDto = replacesOrderDetailsDto.surrogate.getOrder_id();
        }
        if ((i2 & 2) != 0) {
            orderStateDto = replacesOrderDetailsDto.surrogate.getState();
        }
        if ((i2 & 4) != 0) {
            decimalDto = replacesOrderDetailsDto.surrogate.getCancelled_quantity();
        }
        if ((i2 & 8) != 0) {
            i = replacesOrderDetailsDto.surrogate.getVersion();
        }
        return replacesOrderDetailsDto.copy(uUIDDto, orderStateDto, decimalDto, i);
    }

    public final ReplacesOrderDetailsDto copy(UUIDDto order_id, OrderStateDto state, DecimalDto cancelled_quantity, int version) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new ReplacesOrderDetailsDto(new Surrogate(order_id, state, cancelled_quantity, version));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ReplacesOrderDetails toProto() {
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto = order_id != null ? order_id.toProto() : null;
        OrderState orderState = (OrderState) this.surrogate.getState().toProto();
        DecimalDto cancelled_quantity = this.surrogate.getCancelled_quantity();
        return new ReplacesOrderDetails(proto, orderState, cancelled_quantity != null ? cancelled_quantity.toProto() : null, this.surrogate.getVersion(), null, 16, null);
    }

    public String toString() {
        return "[ReplacesOrderDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ReplacesOrderDetailsDto) && Intrinsics.areEqual(((ReplacesOrderDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ReplacesOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234BB\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0018\u0010#\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003JD\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Surrogate;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "state", "Lrosetta/mainst/OrderStateDto;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "version", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getState$annotations", "getState", "()Lrosetta/mainst/OrderStateDto;", "getCancelled_quantity$annotations", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getVersion$annotations", "getVersion", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto cancelled_quantity;
        private final UUIDDto order_id;
        private final OrderStateDto state;
        private final int version;

        public Surrogate() {
            this((UUIDDto) null, (OrderStateDto) null, (DecimalDto) null, 0, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, OrderStateDto orderStateDto, DecimalDto decimalDto, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uUIDDto = surrogate.order_id;
            }
            if ((i2 & 2) != 0) {
                orderStateDto = surrogate.state;
            }
            if ((i2 & 4) != 0) {
                decimalDto = surrogate.cancelled_quantity;
            }
            if ((i2 & 8) != 0) {
                i = surrogate.version;
            }
            return surrogate.copy(uUIDDto, orderStateDto, decimalDto, i);
        }

        @SerialName("cancelledQuantity")
        @JsonAnnotations2(names = {"cancelled_quantity"})
        public static /* synthetic */ void getCancelled_quantity$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderStateDto getState() {
            return this.state;
        }

        /* renamed from: component3, reason: from getter */
        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        public final Surrogate copy(UUIDDto order_id, OrderStateDto state, DecimalDto cancelled_quantity, int version) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Surrogate(order_id, state, cancelled_quantity, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.state == surrogate.state && Intrinsics.areEqual(this.cancelled_quantity, surrogate.cancelled_quantity) && this.version == surrogate.version;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.order_id;
            int iHashCode = (((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + this.state.hashCode()) * 31;
            DecimalDto decimalDto = this.cancelled_quantity;
            return ((iHashCode + (decimalDto != null ? decimalDto.hashCode() : 0)) * 31) + Integer.hashCode(this.version);
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", state=" + this.state + ", cancelled_quantity=" + this.cancelled_quantity + ", version=" + this.version + ")";
        }

        /* compiled from: ReplacesOrderDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ReplacesOrderDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, OrderStateDto orderStateDto, DecimalDto decimalDto, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.state = OrderStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = orderStateDto;
            }
            if ((i & 4) == 0) {
                this.cancelled_quantity = null;
            } else {
                this.cancelled_quantity = decimalDto;
            }
            if ((i & 8) == 0) {
                this.version = 0;
            } else {
                this.version = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.order_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            if (self.state != OrderStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderStateDto.Serializer.INSTANCE, self.state);
            }
            DecimalDto decimalDto = self.cancelled_quantity;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            int i = self.version;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(UUIDDto uUIDDto, OrderStateDto state, DecimalDto decimalDto, int i) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.order_id = uUIDDto;
            this.state = state;
            this.cancelled_quantity = decimalDto;
            this.version = i;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final OrderStateDto getState() {
            return this.state;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, OrderStateDto orderStateDto, DecimalDto decimalDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i2 & 4) != 0 ? null : decimalDto, (i2 & 8) != 0 ? 0 : i);
        }

        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        public final int getVersion() {
            return this.version;
        }
    }

    /* compiled from: ReplacesOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ReplacesOrderDetailsDto, ReplacesOrderDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ReplacesOrderDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReplacesOrderDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ReplacesOrderDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ReplacesOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ReplacesOrderDetails> getProtoAdapter() {
            return ReplacesOrderDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReplacesOrderDetailsDto getZeroValue() {
            return ReplacesOrderDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ReplacesOrderDetailsDto fromProto(ReplacesOrderDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID order_id = proto.getOrder_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            OrderStateDto orderStateDtoFromProto = OrderStateDto.INSTANCE.fromProto(proto.getState());
            Decimal cancelled_quantity = proto.getCancelled_quantity();
            return new ReplacesOrderDetailsDto(new Surrogate(uUIDDtoFromProto, orderStateDtoFromProto, cancelled_quantity != null ? DecimalDto.INSTANCE.fromProto(cancelled_quantity) : null, proto.getVersion()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.ReplacesOrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReplacesOrderDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ReplacesOrderDetailsDto(null, null, null, 0, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ReplacesOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ReplacesOrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.ReplacesOrderDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ReplacesOrderDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ReplacesOrderDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ReplacesOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ReplacesOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.ReplacesOrderDetailsDto";
        }
    }
}
