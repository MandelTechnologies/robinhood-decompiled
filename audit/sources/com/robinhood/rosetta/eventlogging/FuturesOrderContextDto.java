package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.FuturesOrderContext;
import com.robinhood.rosetta.eventlogging.FuturesOrderContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: FuturesOrderContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000b&'()*+,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Surrogate;)V", "contract_id", "", "order_id", "order_side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "order_request_context", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;)V", "getContract_id", "()Ljava/lang/String;", "getOrder_id", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "getOrder_request_context", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OrderSideDto", "OrderTriggerDto", "TimeInForceDto", "ContractTypeDto", "OrderTypeDto", "OrderLegDto", "OrderRequestContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class FuturesOrderContextDto implements Dto3<FuturesOrderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesOrderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesOrderContextDto, FuturesOrderContext>> binaryBase64Serializer$delegate;
    private static final FuturesOrderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesOrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesOrderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final OrderSideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final OrderRequestContextDto getOrder_request_context() {
        return this.surrogate.getOrder_request_context();
    }

    public /* synthetic */ FuturesOrderContextDto(String str, String str2, OrderSideDto orderSideDto, OrderRequestContextDto orderRequestContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i & 8) != 0 ? null : orderRequestContextDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesOrderContextDto(String contract_id, String order_id, OrderSideDto order_side, OrderRequestContextDto orderRequestContextDto) {
        this(new Surrogate(contract_id, order_id, order_side, orderRequestContextDto));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
    }

    public static /* synthetic */ FuturesOrderContextDto copy$default(FuturesOrderContextDto futuresOrderContextDto, String str, String str2, OrderSideDto orderSideDto, OrderRequestContextDto orderRequestContextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresOrderContextDto.surrogate.getContract_id();
        }
        if ((i & 2) != 0) {
            str2 = futuresOrderContextDto.surrogate.getOrder_id();
        }
        if ((i & 4) != 0) {
            orderSideDto = futuresOrderContextDto.surrogate.getOrder_side();
        }
        if ((i & 8) != 0) {
            orderRequestContextDto = futuresOrderContextDto.surrogate.getOrder_request_context();
        }
        return futuresOrderContextDto.copy(str, str2, orderSideDto, orderRequestContextDto);
    }

    public final FuturesOrderContextDto copy(String contract_id, String order_id, OrderSideDto order_side, OrderRequestContextDto order_request_context) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        return new FuturesOrderContextDto(new Surrogate(contract_id, order_id, order_side, order_request_context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesOrderContext toProto() {
        String contract_id = this.surrogate.getContract_id();
        String order_id = this.surrogate.getOrder_id();
        FuturesOrderContext.OrderSide orderSide = (FuturesOrderContext.OrderSide) this.surrogate.getOrder_side().toProto();
        OrderRequestContextDto order_request_context = this.surrogate.getOrder_request_context();
        return new FuturesOrderContext(contract_id, order_id, orderSide, order_request_context != null ? order_request_context.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[FuturesOrderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesOrderContextDto) && Intrinsics.areEqual(((FuturesOrderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Surrogate;", "", "contract_id", "", "order_id", "order_side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "order_request_context", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getOrder_id$annotations", "getOrder_id", "getOrder_side$annotations", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "getOrder_request_context$annotations", "getOrder_request_context", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final String order_id;
        private final OrderRequestContextDto order_request_context;
        private final OrderSideDto order_side;

        public Surrogate() {
            this((String) null, (String) null, (OrderSideDto) null, (OrderRequestContextDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, OrderSideDto orderSideDto, OrderRequestContextDto orderRequestContextDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.order_id;
            }
            if ((i & 4) != 0) {
                orderSideDto = surrogate.order_side;
            }
            if ((i & 8) != 0) {
                orderRequestContextDto = surrogate.order_request_context;
            }
            return surrogate.copy(str, str2, orderSideDto, orderRequestContextDto);
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderRequestContext")
        @JsonAnnotations2(names = {"order_request_context"})
        public static /* synthetic */ void getOrder_request_context$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderRequestContextDto getOrder_request_context() {
            return this.order_request_context;
        }

        public final Surrogate copy(String contract_id, String order_id, OrderSideDto order_side, OrderRequestContextDto order_request_context) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            return new Surrogate(contract_id, order_id, order_side, order_request_context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.order_side == surrogate.order_side && Intrinsics.areEqual(this.order_request_context, surrogate.order_request_context);
        }

        public int hashCode() {
            int iHashCode = ((((this.contract_id.hashCode() * 31) + this.order_id.hashCode()) * 31) + this.order_side.hashCode()) * 31;
            OrderRequestContextDto orderRequestContextDto = this.order_request_context;
            return iHashCode + (orderRequestContextDto == null ? 0 : orderRequestContextDto.hashCode());
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", order_id=" + this.order_id + ", order_side=" + this.order_side + ", order_request_context=" + this.order_request_context + ")";
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesOrderContextDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, OrderSideDto orderSideDto, OrderRequestContextDto orderRequestContextDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str;
            }
            if ((i & 2) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str2;
            }
            if ((i & 4) == 0) {
                this.order_side = OrderSideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = orderSideDto;
            }
            if ((i & 8) == 0) {
                this.order_request_context = null;
            } else {
                this.order_request_context = orderRequestContextDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_id);
            }
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.order_id);
            }
            if (self.order_side != OrderSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, OrderSideDto.Serializer.INSTANCE, self.order_side);
            }
            OrderRequestContextDto orderRequestContextDto = self.order_request_context;
            if (orderRequestContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, OrderRequestContextDto.Serializer.INSTANCE, orderRequestContextDto);
            }
        }

        public Surrogate(String contract_id, String order_id, OrderSideDto order_side, OrderRequestContextDto orderRequestContextDto) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            this.contract_id = contract_id;
            this.order_id = order_id;
            this.order_side = order_side;
            this.order_request_context = orderRequestContextDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, OrderSideDto orderSideDto, OrderRequestContextDto orderRequestContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i & 8) != 0 ? null : orderRequestContextDto);
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        public final OrderRequestContextDto getOrder_request_context() {
            return this.order_request_context;
        }
    }

    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesOrderContextDto, FuturesOrderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesOrderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesOrderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesOrderContext> getProtoAdapter() {
            return FuturesOrderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderContextDto getZeroValue() {
            return FuturesOrderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderContextDto fromProto(FuturesOrderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String contract_id = proto.getContract_id();
            String order_id = proto.getOrder_id();
            OrderSideDto orderSideDtoFromProto = OrderSideDto.INSTANCE.fromProto(proto.getOrder_side());
            FuturesOrderContext.OrderRequestContext order_request_context = proto.getOrder_request_context();
            return new FuturesOrderContextDto(new Surrogate(contract_id, order_id, orderSideDtoFromProto, order_request_context != null ? OrderRequestContextDto.INSTANCE.fromProto(order_request_context) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesOrderContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesOrderContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SIDE_UNSPECIFIED", "BUY", "SELL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderSideDto implements Dto2<FuturesOrderContext.OrderSide>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderSideDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderSideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderSideDto, FuturesOrderContext.OrderSide>> binaryBase64Serializer$delegate;
        public static final OrderSideDto SIDE_UNSPECIFIED = new SIDE_UNSPECIFIED("SIDE_UNSPECIFIED", 0);
        public static final OrderSideDto BUY = new BUY("BUY", 1);
        public static final OrderSideDto SELL = new SELL("SELL", 2);

        private static final /* synthetic */ OrderSideDto[] $values() {
            return new OrderSideDto[]{SIDE_UNSPECIFIED, BUY, SELL};
        }

        public /* synthetic */ OrderSideDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderSideDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderSideDto.SIDE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIDE_UNSPECIFIED extends OrderSideDto {
            SIDE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderSide toProto() {
                return FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED;
            }
        }

        private OrderSideDto(String str, int i) {
        }

        static {
            OrderSideDto[] orderSideDtoArr$values = $values();
            $VALUES = orderSideDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderSideDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderSideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.OrderSideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderSideDto.BUY", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY extends OrderSideDto {
            BUY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderSide toProto() {
                return FuturesOrderContext.OrderSide.BUY;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderSideDto.SELL", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELL extends OrderSideDto {
            SELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderSide toProto() {
                return FuturesOrderContext.OrderSide.SELL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderSideDto, FuturesOrderContext.OrderSide> {

            /* compiled from: FuturesOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesOrderContext.OrderSide.values().length];
                    try {
                        iArr[FuturesOrderContext.OrderSide.SIDE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesOrderContext.OrderSide.BUY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesOrderContext.OrderSide.SELL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderSideDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderSideDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderSideDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderSideDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesOrderContext.OrderSide> getProtoAdapter() {
                return FuturesOrderContext.OrderSide.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto getZeroValue() {
                return OrderSideDto.SIDE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto fromProto(FuturesOrderContext.OrderSide proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderSideDto.SIDE_UNSPECIFIED;
                }
                if (i == 2) {
                    return OrderSideDto.BUY;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderSideDto.SELL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderSideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderSideDto, FuturesOrderContext.OrderSide> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FuturesOrderContext.OrderSide", OrderSideDto.getEntries(), OrderSideDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderSideDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderSideDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderSideDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderSideDto valueOf(String str) {
            return (OrderSideDto) Enum.valueOf(OrderSideDto.class, str);
        }

        public static OrderSideDto[] values() {
            return (OrderSideDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRIGGER_UNSPECIFIED", "IMMEDIATE", "STOP", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderTriggerDto implements Dto2<FuturesOrderContext.OrderTrigger>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderTriggerDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderTriggerDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderTriggerDto, FuturesOrderContext.OrderTrigger>> binaryBase64Serializer$delegate;
        public static final OrderTriggerDto TRIGGER_UNSPECIFIED = new TRIGGER_UNSPECIFIED("TRIGGER_UNSPECIFIED", 0);
        public static final OrderTriggerDto IMMEDIATE = new IMMEDIATE("IMMEDIATE", 1);
        public static final OrderTriggerDto STOP = new STOP("STOP", 2);

        private static final /* synthetic */ OrderTriggerDto[] $values() {
            return new OrderTriggerDto[]{TRIGGER_UNSPECIFIED, IMMEDIATE, STOP};
        }

        public /* synthetic */ OrderTriggerDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderTriggerDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderTriggerDto.TRIGGER_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRIGGER_UNSPECIFIED extends OrderTriggerDto {
            TRIGGER_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderTrigger toProto() {
                return FuturesOrderContext.OrderTrigger.TRIGGER_UNSPECIFIED;
            }
        }

        private OrderTriggerDto(String str, int i) {
        }

        static {
            OrderTriggerDto[] orderTriggerDtoArr$values = $values();
            $VALUES = orderTriggerDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTriggerDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderTriggerDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.OrderTriggerDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderTriggerDto.IMMEDIATE", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IMMEDIATE extends OrderTriggerDto {
            IMMEDIATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderTrigger toProto() {
                return FuturesOrderContext.OrderTrigger.IMMEDIATE;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderTriggerDto.STOP", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOP extends OrderTriggerDto {
            STOP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderTrigger toProto() {
                return FuturesOrderContext.OrderTrigger.STOP;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderTrigger;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderTriggerDto, FuturesOrderContext.OrderTrigger> {

            /* compiled from: FuturesOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesOrderContext.OrderTrigger.values().length];
                    try {
                        iArr[FuturesOrderContext.OrderTrigger.TRIGGER_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesOrderContext.OrderTrigger.IMMEDIATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesOrderContext.OrderTrigger.STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderTriggerDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTriggerDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTriggerDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderTriggerDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesOrderContext.OrderTrigger> getProtoAdapter() {
                return FuturesOrderContext.OrderTrigger.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTriggerDto getZeroValue() {
                return OrderTriggerDto.TRIGGER_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTriggerDto fromProto(FuturesOrderContext.OrderTrigger proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderTriggerDto.TRIGGER_UNSPECIFIED;
                }
                if (i == 2) {
                    return OrderTriggerDto.IMMEDIATE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderTriggerDto.STOP;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderTriggerDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderTriggerDto, FuturesOrderContext.OrderTrigger> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FuturesOrderContext.OrderTrigger", OrderTriggerDto.getEntries(), OrderTriggerDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderTriggerDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderTriggerDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderTriggerDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderTriggerDto valueOf(String str) {
            return (OrderTriggerDto) Enum.valueOf(OrderTriggerDto.class, str);
        }

        public static OrderTriggerDto[] values() {
            return (OrderTriggerDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TIME_IN_FORCE_UNSPECIFIED", "GFD", "GTC", "IOC", "GTD", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TimeInForceDto implements Dto2<FuturesOrderContext.TimeInForce>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TimeInForceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TimeInForceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TimeInForceDto, FuturesOrderContext.TimeInForce>> binaryBase64Serializer$delegate;
        public static final TimeInForceDto TIME_IN_FORCE_UNSPECIFIED = new TIME_IN_FORCE_UNSPECIFIED("TIME_IN_FORCE_UNSPECIFIED", 0);
        public static final TimeInForceDto GFD = new GFD("GFD", 1);
        public static final TimeInForceDto GTC = new GTC("GTC", 2);
        public static final TimeInForceDto IOC = new IOC("IOC", 3);
        public static final TimeInForceDto GTD = new GTD("GTD", 4);

        private static final /* synthetic */ TimeInForceDto[] $values() {
            return new TimeInForceDto[]{TIME_IN_FORCE_UNSPECIFIED, GFD, GTC, IOC, GTD};
        }

        public /* synthetic */ TimeInForceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TimeInForceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TIME_IN_FORCE_UNSPECIFIED extends TimeInForceDto {
            TIME_IN_FORCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.TimeInForce toProto() {
                return FuturesOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
            }
        }

        private TimeInForceDto(String str, int i) {
        }

        static {
            TimeInForceDto[] timeInForceDtoArr$values = $values();
            $VALUES = timeInForceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(timeInForceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$TimeInForceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.TimeInForceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.TimeInForceDto.GFD", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GFD extends TimeInForceDto {
            GFD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.TimeInForce toProto() {
                return FuturesOrderContext.TimeInForce.GFD;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.TimeInForceDto.GTC", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GTC extends TimeInForceDto {
            GTC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.TimeInForce toProto() {
                return FuturesOrderContext.TimeInForce.GTC;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.TimeInForceDto.IOC", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class IOC extends TimeInForceDto {
            IOC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.TimeInForce toProto() {
                return FuturesOrderContext.TimeInForce.IOC;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.TimeInForceDto.GTD", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class GTD extends TimeInForceDto {
            GTD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.TimeInForce toProto() {
                return FuturesOrderContext.TimeInForce.GTD;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$TimeInForce;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TimeInForceDto, FuturesOrderContext.TimeInForce> {

            /* compiled from: FuturesOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesOrderContext.TimeInForce.values().length];
                    try {
                        iArr[FuturesOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesOrderContext.TimeInForce.GFD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesOrderContext.TimeInForce.GTC.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[FuturesOrderContext.TimeInForce.IOC.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[FuturesOrderContext.TimeInForce.GTD.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TimeInForceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TimeInForceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TimeInForceDto> getBinaryBase64Serializer() {
                return (KSerializer) TimeInForceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesOrderContext.TimeInForce> getProtoAdapter() {
                return FuturesOrderContext.TimeInForce.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TimeInForceDto getZeroValue() {
                return TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TimeInForceDto fromProto(FuturesOrderContext.TimeInForce proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TimeInForceDto.TIME_IN_FORCE_UNSPECIFIED;
                }
                if (i == 2) {
                    return TimeInForceDto.GFD;
                }
                if (i == 3) {
                    return TimeInForceDto.GTC;
                }
                if (i == 4) {
                    return TimeInForceDto.IOC;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return TimeInForceDto.GTD;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TimeInForceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TimeInForceDto, FuturesOrderContext.TimeInForce> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FuturesOrderContext.TimeInForce", TimeInForceDto.getEntries(), TimeInForceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TimeInForceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TimeInForceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TimeInForceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TimeInForceDto valueOf(String str) {
            return (TimeInForceDto) Enum.valueOf(TimeInForceDto.class, str);
        }

        public static TimeInForceDto[] values() {
            return (TimeInForceDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONTRACT_TYPE_UNSPECIFIED", "OUTRIGHTS", "OPTIONS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContractTypeDto implements Dto2<FuturesOrderContext.ContractType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContractTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ContractTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContractTypeDto, FuturesOrderContext.ContractType>> binaryBase64Serializer$delegate;
        public static final ContractTypeDto CONTRACT_TYPE_UNSPECIFIED = new CONTRACT_TYPE_UNSPECIFIED("CONTRACT_TYPE_UNSPECIFIED", 0);
        public static final ContractTypeDto OUTRIGHTS = new OUTRIGHTS("OUTRIGHTS", 1);
        public static final ContractTypeDto OPTIONS = new OPTIONS("OPTIONS", 2);

        private static final /* synthetic */ ContractTypeDto[] $values() {
            return new ContractTypeDto[]{CONTRACT_TYPE_UNSPECIFIED, OUTRIGHTS, OPTIONS};
        }

        public /* synthetic */ ContractTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ContractTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.ContractTypeDto.CONTRACT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTRACT_TYPE_UNSPECIFIED extends ContractTypeDto {
            CONTRACT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.ContractType toProto() {
                return FuturesOrderContext.ContractType.CONTRACT_TYPE_UNSPECIFIED;
            }
        }

        private ContractTypeDto(String str, int i) {
        }

        static {
            ContractTypeDto[] contractTypeDtoArr$values = $values();
            $VALUES = contractTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contractTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$ContractTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.ContractTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.ContractTypeDto.OUTRIGHTS", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OUTRIGHTS extends ContractTypeDto {
            OUTRIGHTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.ContractType toProto() {
                return FuturesOrderContext.ContractType.OUTRIGHTS;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.ContractTypeDto.OPTIONS", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS extends ContractTypeDto {
            OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.ContractType toProto() {
                return FuturesOrderContext.ContractType.OPTIONS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$ContractType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ContractTypeDto, FuturesOrderContext.ContractType> {

            /* compiled from: FuturesOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesOrderContext.ContractType.values().length];
                    try {
                        iArr[FuturesOrderContext.ContractType.CONTRACT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesOrderContext.ContractType.OUTRIGHTS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesOrderContext.ContractType.OPTIONS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ContractTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContractTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContractTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ContractTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesOrderContext.ContractType> getProtoAdapter() {
                return FuturesOrderContext.ContractType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContractTypeDto getZeroValue() {
                return ContractTypeDto.CONTRACT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContractTypeDto fromProto(FuturesOrderContext.ContractType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ContractTypeDto.CONTRACT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return ContractTypeDto.OUTRIGHTS;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ContractTypeDto.OPTIONS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ContractTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ContractTypeDto, FuturesOrderContext.ContractType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FuturesOrderContext.ContractType", ContractTypeDto.getEntries(), ContractTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ContractTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ContractTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ContractTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ContractTypeDto valueOf(String str) {
            return (ContractTypeDto) Enum.valueOf(ContractTypeDto.class, str);
        }

        public static ContractTypeDto[] values() {
            return (ContractTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_TYPE_UNSPECIFIED", "MARKET", "LIMIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderTypeDto implements Dto2<FuturesOrderContext.OrderType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderTypeDto, FuturesOrderContext.OrderType>> binaryBase64Serializer$delegate;
        public static final OrderTypeDto ORDER_TYPE_UNSPECIFIED = new ORDER_TYPE_UNSPECIFIED("ORDER_TYPE_UNSPECIFIED", 0);
        public static final OrderTypeDto MARKET = new MARKET("MARKET", 1);
        public static final OrderTypeDto LIMIT = new LIMIT("LIMIT", 2);

        private static final /* synthetic */ OrderTypeDto[] $values() {
            return new OrderTypeDto[]{ORDER_TYPE_UNSPECIFIED, MARKET, LIMIT};
        }

        public /* synthetic */ OrderTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OrderTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderTypeDto.ORDER_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_TYPE_UNSPECIFIED extends OrderTypeDto {
            ORDER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderType toProto() {
                return FuturesOrderContext.OrderType.ORDER_TYPE_UNSPECIFIED;
            }
        }

        private OrderTypeDto(String str, int i) {
        }

        static {
            OrderTypeDto[] orderTypeDtoArr$values = $values();
            $VALUES = orderTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.OrderTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderTypeDto.MARKET", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET extends OrderTypeDto {
            MARKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderType toProto() {
                return FuturesOrderContext.OrderType.MARKET;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/FuturesOrderContextDto.OrderTypeDto.LIMIT", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LIMIT extends OrderTypeDto {
            LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesOrderContext.OrderType toProto() {
                return FuturesOrderContext.OrderType.LIMIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderTypeDto, FuturesOrderContext.OrderType> {

            /* compiled from: FuturesOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesOrderContext.OrderType.values().length];
                    try {
                        iArr[FuturesOrderContext.OrderType.ORDER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesOrderContext.OrderType.MARKET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesOrderContext.OrderType.LIMIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesOrderContext.OrderType> getProtoAdapter() {
                return FuturesOrderContext.OrderType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTypeDto getZeroValue() {
                return OrderTypeDto.ORDER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderTypeDto fromProto(FuturesOrderContext.OrderType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OrderTypeDto.ORDER_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return OrderTypeDto.MARKET;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return OrderTypeDto.LIMIT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderTypeDto, FuturesOrderContext.OrderType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.FuturesOrderContext.OrderType", OrderTypeDto.getEntries(), OrderTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OrderTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OrderTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OrderTypeDto valueOf(String str) {
            return (OrderTypeDto) Enum.valueOf(OrderTypeDto.class, str);
        }

        public static OrderTypeDto[] values() {
            return (OrderTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\rH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderLeg;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Surrogate;)V", "contract_type", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "contract_id", "", "ratio_quantity", "", "order_side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "(Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;)V", "getContract_type", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "getContract_id", "()Ljava/lang/String;", "getRatio_quantity", "()I", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderLegDto implements Dto3<FuturesOrderContext.OrderLeg>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OrderLegDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderLegDto, FuturesOrderContext.OrderLeg>> binaryBase64Serializer$delegate;
        private static final OrderLegDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OrderLegDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OrderLegDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ContractTypeDto getContract_type() {
            return this.surrogate.getContract_type();
        }

        public final String getContract_id() {
            return this.surrogate.getContract_id();
        }

        public final int getRatio_quantity() {
            return this.surrogate.getRatio_quantity();
        }

        public final OrderSideDto getOrder_side() {
            return this.surrogate.getOrder_side();
        }

        public /* synthetic */ OrderLegDto(ContractTypeDto contractTypeDto, String str, int i, OrderSideDto orderSideDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ContractTypeDto.INSTANCE.getZeroValue() : contractTypeDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OrderLegDto(ContractTypeDto contract_type, String contract_id, int i, OrderSideDto order_side) {
            this(new Surrogate(contract_type, contract_id, i, order_side));
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
        }

        public static /* synthetic */ OrderLegDto copy$default(OrderLegDto orderLegDto, ContractTypeDto contractTypeDto, String str, int i, OrderSideDto orderSideDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                contractTypeDto = orderLegDto.surrogate.getContract_type();
            }
            if ((i2 & 2) != 0) {
                str = orderLegDto.surrogate.getContract_id();
            }
            if ((i2 & 4) != 0) {
                i = orderLegDto.surrogate.getRatio_quantity();
            }
            if ((i2 & 8) != 0) {
                orderSideDto = orderLegDto.surrogate.getOrder_side();
            }
            return orderLegDto.copy(contractTypeDto, str, i, orderSideDto);
        }

        public final OrderLegDto copy(ContractTypeDto contract_type, String contract_id, int ratio_quantity, OrderSideDto order_side) {
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            return new OrderLegDto(new Surrogate(contract_type, contract_id, ratio_quantity, order_side));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public FuturesOrderContext.OrderLeg toProto() {
            return new FuturesOrderContext.OrderLeg((FuturesOrderContext.ContractType) this.surrogate.getContract_type().toProto(), this.surrogate.getContract_id(), this.surrogate.getRatio_quantity(), (FuturesOrderContext.OrderSide) this.surrogate.getOrder_side().toProto(), null, 16, null);
        }

        public String toString() {
            return "[OrderLegDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OrderLegDto) && Intrinsics.areEqual(((OrderLegDto) other).surrogate, this.surrogate);
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
        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J@\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Surrogate;", "", "contract_type", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "contract_id", "", "ratio_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "order_side", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_type$annotations", "()V", "getContract_type", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$ContractTypeDto;", "getContract_id$annotations", "getContract_id", "()Ljava/lang/String;", "getRatio_quantity$annotations", "getRatio_quantity", "()I", "getOrder_side$annotations", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderSideDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String contract_id;
            private final ContractTypeDto contract_type;
            private final OrderSideDto order_side;
            private final int ratio_quantity;

            public Surrogate() {
                this((ContractTypeDto) null, (String) null, 0, (OrderSideDto) null, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ContractTypeDto contractTypeDto, String str, int i, OrderSideDto orderSideDto, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    contractTypeDto = surrogate.contract_type;
                }
                if ((i2 & 2) != 0) {
                    str = surrogate.contract_id;
                }
                if ((i2 & 4) != 0) {
                    i = surrogate.ratio_quantity;
                }
                if ((i2 & 8) != 0) {
                    orderSideDto = surrogate.order_side;
                }
                return surrogate.copy(contractTypeDto, str, i, orderSideDto);
            }

            @SerialName("contractId")
            @JsonAnnotations2(names = {"contract_id"})
            public static /* synthetic */ void getContract_id$annotations() {
            }

            @SerialName("contractType")
            @JsonAnnotations2(names = {"contract_type"})
            public static /* synthetic */ void getContract_type$annotations() {
            }

            @SerialName("orderSide")
            @JsonAnnotations2(names = {"order_side"})
            public static /* synthetic */ void getOrder_side$annotations() {
            }

            @SerialName("ratioQuantity")
            @JsonAnnotations2(names = {"ratio_quantity"})
            public static /* synthetic */ void getRatio_quantity$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final ContractTypeDto getContract_type() {
                return this.contract_type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getContract_id() {
                return this.contract_id;
            }

            /* renamed from: component3, reason: from getter */
            public final int getRatio_quantity() {
                return this.ratio_quantity;
            }

            /* renamed from: component4, reason: from getter */
            public final OrderSideDto getOrder_side() {
                return this.order_side;
            }

            public final Surrogate copy(ContractTypeDto contract_type, String contract_id, int ratio_quantity, OrderSideDto order_side) {
                Intrinsics.checkNotNullParameter(contract_type, "contract_type");
                Intrinsics.checkNotNullParameter(contract_id, "contract_id");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                return new Surrogate(contract_type, contract_id, ratio_quantity, order_side);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.contract_type == surrogate.contract_type && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.ratio_quantity == surrogate.ratio_quantity && this.order_side == surrogate.order_side;
            }

            public int hashCode() {
                return (((((this.contract_type.hashCode() * 31) + this.contract_id.hashCode()) * 31) + Integer.hashCode(this.ratio_quantity)) * 31) + this.order_side.hashCode();
            }

            public String toString() {
                return "Surrogate(contract_type=" + this.contract_type + ", contract_id=" + this.contract_id + ", ratio_quantity=" + this.ratio_quantity + ", order_side=" + this.order_side + ")";
            }

            /* compiled from: FuturesOrderContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return FuturesOrderContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, ContractTypeDto contractTypeDto, String str, int i2, OrderSideDto orderSideDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.contract_type = (i & 1) == 0 ? ContractTypeDto.INSTANCE.getZeroValue() : contractTypeDto;
                if ((i & 2) == 0) {
                    this.contract_id = "";
                } else {
                    this.contract_id = str;
                }
                if ((i & 4) == 0) {
                    this.ratio_quantity = 0;
                } else {
                    this.ratio_quantity = i2;
                }
                if ((i & 8) == 0) {
                    this.order_side = OrderSideDto.INSTANCE.getZeroValue();
                } else {
                    this.order_side = orderSideDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.contract_type != ContractTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, ContractTypeDto.Serializer.INSTANCE, self.contract_type);
                }
                if (!Intrinsics.areEqual(self.contract_id, "")) {
                    output.encodeStringElement(serialDesc, 1, self.contract_id);
                }
                int i = self.ratio_quantity;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
                if (self.order_side != OrderSideDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 3, OrderSideDto.Serializer.INSTANCE, self.order_side);
                }
            }

            public Surrogate(ContractTypeDto contract_type, String contract_id, int i, OrderSideDto order_side) {
                Intrinsics.checkNotNullParameter(contract_type, "contract_type");
                Intrinsics.checkNotNullParameter(contract_id, "contract_id");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                this.contract_type = contract_type;
                this.contract_id = contract_id;
                this.ratio_quantity = i;
                this.order_side = order_side;
            }

            public final ContractTypeDto getContract_type() {
                return this.contract_type;
            }

            public /* synthetic */ Surrogate(ContractTypeDto contractTypeDto, String str, int i, OrderSideDto orderSideDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? ContractTypeDto.INSTANCE.getZeroValue() : contractTypeDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto);
            }

            public final String getContract_id() {
                return this.contract_id;
            }

            public final int getRatio_quantity() {
                return this.ratio_quantity;
            }

            public final OrderSideDto getOrder_side() {
                return this.order_side;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderLeg;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<OrderLegDto, FuturesOrderContext.OrderLeg> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderLegDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderLegDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderLegDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderLegDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesOrderContext.OrderLeg> getProtoAdapter() {
                return FuturesOrderContext.OrderLeg.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderLegDto getZeroValue() {
                return OrderLegDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderLegDto fromProto(FuturesOrderContext.OrderLeg proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new OrderLegDto(new Surrogate(ContractTypeDto.INSTANCE.fromProto(proto.getContract_type()), proto.getContract_id(), proto.getRatio_quantity(), OrderSideDto.INSTANCE.fromProto(proto.getOrder_side())), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderLegDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.OrderLegDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OrderLegDto(null, null, 0, null, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderLegDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.FuturesOrderContext.OrderLeg", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderLegDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OrderLegDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OrderLegDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderLegDto";
            }
        }
    }

    /* compiled from: FuturesOrderContextDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004<=>?B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u0006\u0010\u001bJp\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\tH\u0016J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010,¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Surrogate;)V", "account_id", "", "order_ref_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "quantity", "", "order_trigger", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "stop_price", "", "limit_price", "legs", "", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto;", "is_auto_send_enabled", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;JLcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;DDLjava/util/List;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getAccount_id", "()Ljava/lang/String;", "getOrder_ref_id", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "getQuantity", "()J", "getOrder_trigger", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "getStop_price", "()D", "getLimit_price", "getLegs", "()Ljava/util/List;", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderRequestContextDto implements Dto3<FuturesOrderContext.OrderRequestContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OrderRequestContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderRequestContextDto, FuturesOrderContext.OrderRequestContext>> binaryBase64Serializer$delegate;
        private static final OrderRequestContextDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OrderRequestContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OrderRequestContextDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getAccount_id() {
            return this.surrogate.getAccount_id();
        }

        public final String getOrder_ref_id() {
            return this.surrogate.getOrder_ref_id();
        }

        public final OrderTypeDto getOrder_type() {
            return this.surrogate.getOrder_type();
        }

        public final long getQuantity() {
            return this.surrogate.getQuantity();
        }

        public final OrderTriggerDto getOrder_trigger() {
            return this.surrogate.getOrder_trigger();
        }

        public final TimeInForceDto getTime_in_force() {
            return this.surrogate.getTime_in_force();
        }

        public final double getStop_price() {
            return this.surrogate.getStop_price();
        }

        public final double getLimit_price() {
            return this.surrogate.getLimit_price();
        }

        public final java.util.List<OrderLegDto> getLegs() {
            return this.surrogate.getLegs();
        }

        public final BooleanDto is_auto_send_enabled() {
            return this.surrogate.is_auto_send_enabled();
        }

        public /* synthetic */ OrderRequestContextDto(String str, String str2, OrderTypeDto orderTypeDto, long j, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, double d, double d2, java.util.List list, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 32) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 64) != 0 ? 0.0d : d, (i & 128) == 0 ? d2 : 0.0d, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OrderRequestContextDto(String account_id, String order_ref_id, OrderTypeDto order_type, long j, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, double d, double d2, java.util.List<OrderLegDto> legs, BooleanDto is_auto_send_enabled) {
            this(new Surrogate(account_id, order_ref_id, order_type, j, order_trigger, time_in_force, d, d2, legs, is_auto_send_enabled));
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(is_auto_send_enabled, "is_auto_send_enabled");
        }

        public static /* synthetic */ OrderRequestContextDto copy$default(OrderRequestContextDto orderRequestContextDto, String str, String str2, OrderTypeDto orderTypeDto, long j, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, double d, double d2, java.util.List list, BooleanDto booleanDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = orderRequestContextDto.surrogate.getAccount_id();
            }
            return orderRequestContextDto.copy(str, (i & 2) != 0 ? orderRequestContextDto.surrogate.getOrder_ref_id() : str2, (i & 4) != 0 ? orderRequestContextDto.surrogate.getOrder_type() : orderTypeDto, (i & 8) != 0 ? orderRequestContextDto.surrogate.getQuantity() : j, (i & 16) != 0 ? orderRequestContextDto.surrogate.getOrder_trigger() : orderTriggerDto, (i & 32) != 0 ? orderRequestContextDto.surrogate.getTime_in_force() : timeInForceDto, (i & 64) != 0 ? orderRequestContextDto.surrogate.getStop_price() : d, (i & 128) != 0 ? orderRequestContextDto.surrogate.getLimit_price() : d2, (i & 256) != 0 ? orderRequestContextDto.surrogate.getLegs() : list, (i & 512) != 0 ? orderRequestContextDto.surrogate.is_auto_send_enabled() : booleanDto);
        }

        public final OrderRequestContextDto copy(String account_id, String order_ref_id, OrderTypeDto order_type, long quantity, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, double stop_price, double limit_price, java.util.List<OrderLegDto> legs, BooleanDto is_auto_send_enabled) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(is_auto_send_enabled, "is_auto_send_enabled");
            return new OrderRequestContextDto(new Surrogate(account_id, order_ref_id, order_type, quantity, order_trigger, time_in_force, stop_price, limit_price, legs, is_auto_send_enabled));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public FuturesOrderContext.OrderRequestContext toProto() {
            String account_id = this.surrogate.getAccount_id();
            String order_ref_id = this.surrogate.getOrder_ref_id();
            FuturesOrderContext.OrderType orderType = (FuturesOrderContext.OrderType) this.surrogate.getOrder_type().toProto();
            long quantity = this.surrogate.getQuantity();
            FuturesOrderContext.OrderTrigger orderTrigger = (FuturesOrderContext.OrderTrigger) this.surrogate.getOrder_trigger().toProto();
            FuturesOrderContext.TimeInForce timeInForce = (FuturesOrderContext.TimeInForce) this.surrogate.getTime_in_force().toProto();
            double stop_price = this.surrogate.getStop_price();
            double limit_price = this.surrogate.getLimit_price();
            java.util.List<OrderLegDto> legs = this.surrogate.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(((OrderLegDto) it.next()).toProto());
            }
            return new FuturesOrderContext.OrderRequestContext(account_id, order_ref_id, orderType, quantity, orderTrigger, timeInForce, stop_price, limit_price, arrayList, (Boolean) this.surrogate.is_auto_send_enabled().toProto(), null, 1024, null);
        }

        public String toString() {
            return "[OrderRequestContextDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OrderRequestContextDto) && Intrinsics.areEqual(((OrderRequestContextDto) other).surrogate, this.surrogate);
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
        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 U2\u00020\u0001:\u0002TUB\u009e\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0012\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0012\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aB\u007f\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0019\u0010\u001fJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u0018\u0010?\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\u0018\u0010B\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0012HÆ\u0003J\u0018\u0010C\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0012HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\t\u0010E\u001a\u00020\u0018HÆ\u0003J \u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00122\u0017\b\u0002\u0010\u0013\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u001cHÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001J%\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0001¢\u0006\u0002\bSR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010!\u001a\u0004\b'\u0010(R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010!\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010!\u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010!\u001a\u0004\b0\u00101R+\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010!\u001a\u0004\b3\u00104R+\u0010\u0013\u001a\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010!\u001a\u0004\b6\u00104R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010!\u001a\u0004\b8\u00109R\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010!\u001a\u0004\b\u0017\u0010;¨\u0006V"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Surrogate;", "", "account_id", "", "order_ref_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "order_trigger", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "stop_price", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "limit_price", "legs", "", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderLegDto;", "is_auto_send_enabled", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;JLcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;DDLjava/util/List;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;JLcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;DDLjava/util/List;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getOrder_ref_id$annotations", "getOrder_ref_id", "getOrder_type$annotations", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTypeDto;", "getQuantity$annotations", "getQuantity", "()J", "getOrder_trigger$annotations", "getOrder_trigger", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderTriggerDto;", "getTime_in_force$annotations", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$TimeInForceDto;", "getStop_price$annotations", "getStop_price", "()D", "getLimit_price$annotations", "getLimit_price", "getLegs$annotations", "getLegs", "()Ljava/util/List;", "is_auto_send_enabled$annotations", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final String account_id;
            private final BooleanDto is_auto_send_enabled;
            private final java.util.List<OrderLegDto> legs;
            private final double limit_price;
            private final String order_ref_id;
            private final OrderTriggerDto order_trigger;
            private final OrderTypeDto order_type;
            private final long quantity;
            private final double stop_price;
            private final TimeInForceDto time_in_force;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderRequestContextDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.OrderRequestContextDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null};

            public Surrogate() {
                this((String) null, (String) null, (OrderTypeDto) null, 0L, (OrderTriggerDto) null, (TimeInForceDto) null, 0.0d, 0.0d, (java.util.List) null, (BooleanDto) null, 1023, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(OrderLegDto.Serializer.INSTANCE);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, OrderTypeDto orderTypeDto, long j, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, double d, double d2, java.util.List list, BooleanDto booleanDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = surrogate.account_id;
                }
                return surrogate.copy(str, (i & 2) != 0 ? surrogate.order_ref_id : str2, (i & 4) != 0 ? surrogate.order_type : orderTypeDto, (i & 8) != 0 ? surrogate.quantity : j, (i & 16) != 0 ? surrogate.order_trigger : orderTriggerDto, (i & 32) != 0 ? surrogate.time_in_force : timeInForceDto, (i & 64) != 0 ? surrogate.stop_price : d, (i & 128) != 0 ? surrogate.limit_price : d2, (i & 256) != 0 ? surrogate.legs : list, (i & 512) != 0 ? surrogate.is_auto_send_enabled : booleanDto);
            }

            @SerialName("accountId")
            @JsonAnnotations2(names = {"account_id"})
            public static /* synthetic */ void getAccount_id$annotations() {
            }

            @SerialName("legs")
            @JsonAnnotations2(names = {"legs"})
            public static /* synthetic */ void getLegs$annotations() {
            }

            @SerialName("limitPrice")
            @JsonAnnotations2(names = {"limit_price"})
            public static /* synthetic */ void getLimit_price$annotations() {
            }

            @SerialName("orderRefId")
            @JsonAnnotations2(names = {"order_ref_id"})
            public static /* synthetic */ void getOrder_ref_id$annotations() {
            }

            @SerialName("orderTrigger")
            @JsonAnnotations2(names = {"order_trigger"})
            public static /* synthetic */ void getOrder_trigger$annotations() {
            }

            @SerialName("orderType")
            @JsonAnnotations2(names = {"order_type"})
            public static /* synthetic */ void getOrder_type$annotations() {
            }

            @SerialName("quantity")
            @JsonAnnotations2(names = {"quantity"})
            public static /* synthetic */ void getQuantity$annotations() {
            }

            @SerialName("stopPrice")
            @JsonAnnotations2(names = {"stop_price"})
            public static /* synthetic */ void getStop_price$annotations() {
            }

            @SerialName("timeInForce")
            @JsonAnnotations2(names = {"time_in_force"})
            public static /* synthetic */ void getTime_in_force$annotations() {
            }

            @SerialName("isAutoSendEnabled")
            @JsonAnnotations2(names = {"is_auto_send_enabled"})
            public static /* synthetic */ void is_auto_send_enabled$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccount_id() {
                return this.account_id;
            }

            /* renamed from: component10, reason: from getter */
            public final BooleanDto getIs_auto_send_enabled() {
                return this.is_auto_send_enabled;
            }

            /* renamed from: component2, reason: from getter */
            public final String getOrder_ref_id() {
                return this.order_ref_id;
            }

            /* renamed from: component3, reason: from getter */
            public final OrderTypeDto getOrder_type() {
                return this.order_type;
            }

            /* renamed from: component4, reason: from getter */
            public final long getQuantity() {
                return this.quantity;
            }

            /* renamed from: component5, reason: from getter */
            public final OrderTriggerDto getOrder_trigger() {
                return this.order_trigger;
            }

            /* renamed from: component6, reason: from getter */
            public final TimeInForceDto getTime_in_force() {
                return this.time_in_force;
            }

            /* renamed from: component7, reason: from getter */
            public final double getStop_price() {
                return this.stop_price;
            }

            /* renamed from: component8, reason: from getter */
            public final double getLimit_price() {
                return this.limit_price;
            }

            public final java.util.List<OrderLegDto> component9() {
                return this.legs;
            }

            public final Surrogate copy(String account_id, String order_ref_id, OrderTypeDto order_type, long quantity, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, double stop_price, double limit_price, java.util.List<OrderLegDto> legs, BooleanDto is_auto_send_enabled) {
                Intrinsics.checkNotNullParameter(account_id, "account_id");
                Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
                Intrinsics.checkNotNullParameter(order_type, "order_type");
                Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
                Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
                Intrinsics.checkNotNullParameter(legs, "legs");
                Intrinsics.checkNotNullParameter(is_auto_send_enabled, "is_auto_send_enabled");
                return new Surrogate(account_id, order_ref_id, order_type, quantity, order_trigger, time_in_force, stop_price, limit_price, legs, is_auto_send_enabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.order_ref_id, surrogate.order_ref_id) && this.order_type == surrogate.order_type && this.quantity == surrogate.quantity && this.order_trigger == surrogate.order_trigger && this.time_in_force == surrogate.time_in_force && Double.compare(this.stop_price, surrogate.stop_price) == 0 && Double.compare(this.limit_price, surrogate.limit_price) == 0 && Intrinsics.areEqual(this.legs, surrogate.legs) && this.is_auto_send_enabled == surrogate.is_auto_send_enabled;
            }

            public int hashCode() {
                return (((((((((((((((((this.account_id.hashCode() * 31) + this.order_ref_id.hashCode()) * 31) + this.order_type.hashCode()) * 31) + Long.hashCode(this.quantity)) * 31) + this.order_trigger.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + Double.hashCode(this.stop_price)) * 31) + Double.hashCode(this.limit_price)) * 31) + this.legs.hashCode()) * 31) + this.is_auto_send_enabled.hashCode();
            }

            public String toString() {
                return "Surrogate(account_id=" + this.account_id + ", order_ref_id=" + this.order_ref_id + ", order_type=" + this.order_type + ", quantity=" + this.quantity + ", order_trigger=" + this.order_trigger + ", time_in_force=" + this.time_in_force + ", stop_price=" + this.stop_price + ", limit_price=" + this.limit_price + ", legs=" + this.legs + ", is_auto_send_enabled=" + this.is_auto_send_enabled + ")";
            }

            /* compiled from: FuturesOrderContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return FuturesOrderContextDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, OrderTypeDto orderTypeDto, long j, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, double d, double d2, java.util.List list, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.account_id = "";
                } else {
                    this.account_id = str;
                }
                if ((i & 2) == 0) {
                    this.order_ref_id = "";
                } else {
                    this.order_ref_id = str2;
                }
                if ((i & 4) == 0) {
                    this.order_type = OrderTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.order_type = orderTypeDto;
                }
                if ((i & 8) == 0) {
                    this.quantity = 0L;
                } else {
                    this.quantity = j;
                }
                if ((i & 16) == 0) {
                    this.order_trigger = OrderTriggerDto.INSTANCE.getZeroValue();
                } else {
                    this.order_trigger = orderTriggerDto;
                }
                if ((i & 32) == 0) {
                    this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
                } else {
                    this.time_in_force = timeInForceDto;
                }
                if ((i & 64) == 0) {
                    this.stop_price = 0.0d;
                } else {
                    this.stop_price = d;
                }
                if ((i & 128) == 0) {
                    this.limit_price = 0.0d;
                } else {
                    this.limit_price = d2;
                }
                if ((i & 256) == 0) {
                    this.legs = CollectionsKt.emptyList();
                } else {
                    this.legs = list;
                }
                this.is_auto_send_enabled = (i & 512) == 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.account_id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.account_id);
                }
                if (!Intrinsics.areEqual(self.order_ref_id, "")) {
                    output.encodeStringElement(serialDesc, 1, self.order_ref_id);
                }
                if (self.order_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 2, OrderTypeDto.Serializer.INSTANCE, self.order_type);
                }
                long j = self.quantity;
                if (j != 0) {
                    output.encodeSerializableElement(serialDesc, 3, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
                }
                if (self.order_trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 4, OrderTriggerDto.Serializer.INSTANCE, self.order_trigger);
                }
                if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 5, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
                }
                if (Double.compare(self.stop_price, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.stop_price));
                }
                if (Double.compare(self.limit_price, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.limit_price));
                }
                if (!Intrinsics.areEqual(self.legs, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.legs);
                }
                if (self.is_auto_send_enabled != BooleanDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 9, BooleanDto.Serializer.INSTANCE, self.is_auto_send_enabled);
                }
            }

            public Surrogate(String account_id, String order_ref_id, OrderTypeDto order_type, long j, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, double d, double d2, java.util.List<OrderLegDto> legs, BooleanDto is_auto_send_enabled) {
                Intrinsics.checkNotNullParameter(account_id, "account_id");
                Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
                Intrinsics.checkNotNullParameter(order_type, "order_type");
                Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
                Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
                Intrinsics.checkNotNullParameter(legs, "legs");
                Intrinsics.checkNotNullParameter(is_auto_send_enabled, "is_auto_send_enabled");
                this.account_id = account_id;
                this.order_ref_id = order_ref_id;
                this.order_type = order_type;
                this.quantity = j;
                this.order_trigger = order_trigger;
                this.time_in_force = time_in_force;
                this.stop_price = d;
                this.limit_price = d2;
                this.legs = legs;
                this.is_auto_send_enabled = is_auto_send_enabled;
            }

            public /* synthetic */ Surrogate(String str, String str2, OrderTypeDto orderTypeDto, long j, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, double d, double d2, java.util.List list, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 32) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 64) != 0 ? 0.0d : d, (i & 128) == 0 ? d2 : 0.0d, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
            }

            public final String getAccount_id() {
                return this.account_id;
            }

            public final String getOrder_ref_id() {
                return this.order_ref_id;
            }

            public final OrderTypeDto getOrder_type() {
                return this.order_type;
            }

            public final long getQuantity() {
                return this.quantity;
            }

            public final OrderTriggerDto getOrder_trigger() {
                return this.order_trigger;
            }

            public final TimeInForceDto getTime_in_force() {
                return this.time_in_force;
            }

            public final double getStop_price() {
                return this.stop_price;
            }

            public final double getLimit_price() {
                return this.limit_price;
            }

            public final java.util.List<OrderLegDto> getLegs() {
                return this.legs;
            }

            public final BooleanDto is_auto_send_enabled() {
                return this.is_auto_send_enabled;
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContext$OrderRequestContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<OrderRequestContextDto, FuturesOrderContext.OrderRequestContext> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderRequestContextDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderRequestContextDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderRequestContextDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderRequestContextDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesOrderContext.OrderRequestContext> getProtoAdapter() {
                return FuturesOrderContext.OrderRequestContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderRequestContextDto getZeroValue() {
                return OrderRequestContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderRequestContextDto fromProto(FuturesOrderContext.OrderRequestContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String account_id = proto.getAccount_id();
                String order_ref_id = proto.getOrder_ref_id();
                OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getOrder_type());
                long quantity = proto.getQuantity();
                OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getOrder_trigger());
                TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
                double stop_price = proto.getStop_price();
                double limit_price = proto.getLimit_price();
                java.util.List<FuturesOrderContext.OrderLeg> legs = proto.getLegs();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                Iterator<T> it = legs.iterator();
                while (it.hasNext()) {
                    arrayList.add(OrderLegDto.INSTANCE.fromProto((FuturesOrderContext.OrderLeg) it.next()));
                }
                return new OrderRequestContextDto(new Surrogate(account_id, order_ref_id, orderTypeDtoFromProto, quantity, orderTriggerDtoFromProto, timeInForceDtoFromProto, stop_price, limit_price, arrayList, BooleanDto.INSTANCE.fromProto(proto.getIs_auto_send_enabled())), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderRequestContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderContextDto.OrderRequestContextDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new OrderRequestContextDto(null, null, null, 0L, null, null, 0.0d, 0.0d, null, null, 1023, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OrderRequestContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.FuturesOrderContext.OrderRequestContext", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderRequestContextDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OrderRequestContextDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OrderRequestContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: FuturesOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$OrderRequestContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.FuturesOrderContextDto$OrderRequestContextDto";
            }
        }
    }

    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<FuturesOrderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.FuturesOrderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesOrderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesOrderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesOrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/FuturesOrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.FuturesOrderContextDto";
        }
    }
}
