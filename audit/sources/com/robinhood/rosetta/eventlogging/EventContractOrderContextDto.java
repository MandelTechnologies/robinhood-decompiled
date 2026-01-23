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
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
import com.robinhood.rosetta.eventlogging.EventContractOrderContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: EventContractOrderContextDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007()*+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Surrogate;)V", "contract_id", "", "order_side", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "event_order_position_effect", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "order_request_context", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;)V", "getContract_id", "()Ljava/lang/String;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "getEvent_order_position_effect", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "getOrder_request_context", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EventOrderPositionEffectDto", "OrderSideDto", "OrderRequestContextDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class EventContractOrderContextDto implements Dto3<EventContractOrderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventContractOrderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventContractOrderContextDto, EventContractOrderContext>> binaryBase64Serializer$delegate;
    private static final EventContractOrderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventContractOrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventContractOrderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final OrderSideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final EventOrderPositionEffectDto getEvent_order_position_effect() {
        return this.surrogate.getEvent_order_position_effect();
    }

    public final OrderRequestContextDto getOrder_request_context() {
        return this.surrogate.getOrder_request_context();
    }

    public /* synthetic */ EventContractOrderContextDto(String str, OrderSideDto orderSideDto, EventOrderPositionEffectDto eventOrderPositionEffectDto, OrderRequestContextDto orderRequestContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i & 4) != 0 ? EventOrderPositionEffectDto.INSTANCE.getZeroValue() : eventOrderPositionEffectDto, (i & 8) != 0 ? null : orderRequestContextDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventContractOrderContextDto(String contract_id, OrderSideDto order_side, EventOrderPositionEffectDto event_order_position_effect, OrderRequestContextDto orderRequestContextDto) {
        this(new Surrogate(contract_id, order_side, event_order_position_effect, orderRequestContextDto));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(event_order_position_effect, "event_order_position_effect");
    }

    public static /* synthetic */ EventContractOrderContextDto copy$default(EventContractOrderContextDto eventContractOrderContextDto, String str, OrderSideDto orderSideDto, EventOrderPositionEffectDto eventOrderPositionEffectDto, OrderRequestContextDto orderRequestContextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContractOrderContextDto.surrogate.getContract_id();
        }
        if ((i & 2) != 0) {
            orderSideDto = eventContractOrderContextDto.surrogate.getOrder_side();
        }
        if ((i & 4) != 0) {
            eventOrderPositionEffectDto = eventContractOrderContextDto.surrogate.getEvent_order_position_effect();
        }
        if ((i & 8) != 0) {
            orderRequestContextDto = eventContractOrderContextDto.surrogate.getOrder_request_context();
        }
        return eventContractOrderContextDto.copy(str, orderSideDto, eventOrderPositionEffectDto, orderRequestContextDto);
    }

    public final EventContractOrderContextDto copy(String contract_id, OrderSideDto order_side, EventOrderPositionEffectDto event_order_position_effect, OrderRequestContextDto order_request_context) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(event_order_position_effect, "event_order_position_effect");
        return new EventContractOrderContextDto(new Surrogate(contract_id, order_side, event_order_position_effect, order_request_context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventContractOrderContext toProto() {
        String contract_id = this.surrogate.getContract_id();
        EventContractOrderContext.OrderSide orderSide = (EventContractOrderContext.OrderSide) this.surrogate.getOrder_side().toProto();
        EventContractOrderContext.EventOrderPositionEffect eventOrderPositionEffect = (EventContractOrderContext.EventOrderPositionEffect) this.surrogate.getEvent_order_position_effect().toProto();
        OrderRequestContextDto order_request_context = this.surrogate.getOrder_request_context();
        return new EventContractOrderContext(contract_id, orderSide, eventOrderPositionEffect, order_request_context != null ? order_request_context.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[EventContractOrderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventContractOrderContextDto) && Intrinsics.areEqual(((EventContractOrderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventContractOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Surrogate;", "", "contract_id", "", "order_side", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "event_order_position_effect", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "order_request_context", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getOrder_side$annotations", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "getEvent_order_position_effect$annotations", "getEvent_order_position_effect", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "getOrder_request_context$annotations", "getOrder_request_context", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final EventOrderPositionEffectDto event_order_position_effect;
        private final OrderRequestContextDto order_request_context;
        private final OrderSideDto order_side;

        public Surrogate() {
            this((String) null, (OrderSideDto) null, (EventOrderPositionEffectDto) null, (OrderRequestContextDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, OrderSideDto orderSideDto, EventOrderPositionEffectDto eventOrderPositionEffectDto, OrderRequestContextDto orderRequestContextDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_id;
            }
            if ((i & 2) != 0) {
                orderSideDto = surrogate.order_side;
            }
            if ((i & 4) != 0) {
                eventOrderPositionEffectDto = surrogate.event_order_position_effect;
            }
            if ((i & 8) != 0) {
                orderRequestContextDto = surrogate.order_request_context;
            }
            return surrogate.copy(str, orderSideDto, eventOrderPositionEffectDto, orderRequestContextDto);
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("eventOrderPositionEffect")
        @JsonAnnotations2(names = {"event_order_position_effect"})
        public static /* synthetic */ void getEvent_order_position_effect$annotations() {
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
        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component3, reason: from getter */
        public final EventOrderPositionEffectDto getEvent_order_position_effect() {
            return this.event_order_position_effect;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderRequestContextDto getOrder_request_context() {
            return this.order_request_context;
        }

        public final Surrogate copy(String contract_id, OrderSideDto order_side, EventOrderPositionEffectDto event_order_position_effect, OrderRequestContextDto order_request_context) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(event_order_position_effect, "event_order_position_effect");
            return new Surrogate(contract_id, order_side, event_order_position_effect, order_request_context);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.order_side == surrogate.order_side && this.event_order_position_effect == surrogate.event_order_position_effect && Intrinsics.areEqual(this.order_request_context, surrogate.order_request_context);
        }

        public int hashCode() {
            int iHashCode = ((((this.contract_id.hashCode() * 31) + this.order_side.hashCode()) * 31) + this.event_order_position_effect.hashCode()) * 31;
            OrderRequestContextDto orderRequestContextDto = this.order_request_context;
            return iHashCode + (orderRequestContextDto == null ? 0 : orderRequestContextDto.hashCode());
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", order_side=" + this.order_side + ", event_order_position_effect=" + this.event_order_position_effect + ", order_request_context=" + this.order_request_context + ")";
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventContractOrderContextDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, OrderSideDto orderSideDto, EventOrderPositionEffectDto eventOrderPositionEffectDto, OrderRequestContextDto orderRequestContextDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.contract_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.order_side = OrderSideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = orderSideDto;
            }
            if ((i & 4) == 0) {
                this.event_order_position_effect = EventOrderPositionEffectDto.INSTANCE.getZeroValue();
            } else {
                this.event_order_position_effect = eventOrderPositionEffectDto;
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
            if (self.order_side != OrderSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderSideDto.Serializer.INSTANCE, self.order_side);
            }
            if (self.event_order_position_effect != EventOrderPositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EventOrderPositionEffectDto.Serializer.INSTANCE, self.event_order_position_effect);
            }
            OrderRequestContextDto orderRequestContextDto = self.order_request_context;
            if (orderRequestContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, OrderRequestContextDto.Serializer.INSTANCE, orderRequestContextDto);
            }
        }

        public Surrogate(String contract_id, OrderSideDto order_side, EventOrderPositionEffectDto event_order_position_effect, OrderRequestContextDto orderRequestContextDto) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(event_order_position_effect, "event_order_position_effect");
            this.contract_id = contract_id;
            this.order_side = order_side;
            this.event_order_position_effect = event_order_position_effect;
            this.order_request_context = orderRequestContextDto;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public /* synthetic */ Surrogate(String str, OrderSideDto orderSideDto, EventOrderPositionEffectDto eventOrderPositionEffectDto, OrderRequestContextDto orderRequestContextDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OrderSideDto.INSTANCE.getZeroValue() : orderSideDto, (i & 4) != 0 ? EventOrderPositionEffectDto.INSTANCE.getZeroValue() : eventOrderPositionEffectDto, (i & 8) != 0 ? null : orderRequestContextDto);
        }

        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        public final EventOrderPositionEffectDto getEvent_order_position_effect() {
            return this.event_order_position_effect;
        }

        public final OrderRequestContextDto getOrder_request_context() {
            return this.order_request_context;
        }
    }

    /* compiled from: EventContractOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EventContractOrderContextDto, EventContractOrderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventContractOrderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventContractOrderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventContractOrderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) EventContractOrderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventContractOrderContext> getProtoAdapter() {
            return EventContractOrderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventContractOrderContextDto getZeroValue() {
            return EventContractOrderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventContractOrderContextDto fromProto(EventContractOrderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String contract_id = proto.getContract_id();
            OrderSideDto orderSideDtoFromProto = OrderSideDto.INSTANCE.fromProto(proto.getOrder_side());
            EventOrderPositionEffectDto eventOrderPositionEffectDtoFromProto = EventOrderPositionEffectDto.INSTANCE.fromProto(proto.getEvent_order_position_effect());
            EventContractOrderContext.OrderRequestContext order_request_context = proto.getOrder_request_context();
            return new EventContractOrderContextDto(new Surrogate(contract_id, orderSideDtoFromProto, eventOrderPositionEffectDtoFromProto, order_request_context != null ? OrderRequestContextDto.INSTANCE.fromProto(order_request_context) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventContractOrderContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EventContractOrderContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventContractOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_EFFECT_UNSPECIFIED", "OPEN", "CLOSE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventOrderPositionEffectDto implements Dto2<EventContractOrderContext.EventOrderPositionEffect>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventOrderPositionEffectDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventOrderPositionEffectDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventOrderPositionEffectDto, EventContractOrderContext.EventOrderPositionEffect>> binaryBase64Serializer$delegate;
        public static final EventOrderPositionEffectDto POSITION_EFFECT_UNSPECIFIED = new POSITION_EFFECT_UNSPECIFIED("POSITION_EFFECT_UNSPECIFIED", 0);
        public static final EventOrderPositionEffectDto OPEN = new OPEN("OPEN", 1);
        public static final EventOrderPositionEffectDto CLOSE = new CLOSE("CLOSE", 2);

        private static final /* synthetic */ EventOrderPositionEffectDto[] $values() {
            return new EventOrderPositionEffectDto[]{POSITION_EFFECT_UNSPECIFIED, OPEN, CLOSE};
        }

        public /* synthetic */ EventOrderPositionEffectDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EventOrderPositionEffectDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private EventOrderPositionEffectDto(String str, int i) {
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractOrderContextDto.EventOrderPositionEffectDto.POSITION_EFFECT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POSITION_EFFECT_UNSPECIFIED extends EventOrderPositionEffectDto {
            POSITION_EFFECT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractOrderContext.EventOrderPositionEffect toProto() {
                return EventContractOrderContext.EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED;
            }
        }

        static {
            EventOrderPositionEffectDto[] eventOrderPositionEffectDtoArr$values = $values();
            $VALUES = eventOrderPositionEffectDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventOrderPositionEffectDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContextDto$EventOrderPositionEffectDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventContractOrderContextDto.EventOrderPositionEffectDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractOrderContextDto.EventOrderPositionEffectDto.OPEN", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPEN extends EventOrderPositionEffectDto {
            OPEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractOrderContext.EventOrderPositionEffect toProto() {
                return EventContractOrderContext.EventOrderPositionEffect.OPEN;
            }
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractOrderContextDto.EventOrderPositionEffectDto.CLOSE", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLOSE extends EventOrderPositionEffectDto {
            CLOSE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractOrderContext.EventOrderPositionEffect toProto() {
                return EventContractOrderContext.EventOrderPositionEffect.CLOSE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventOrderPositionEffectDto, EventContractOrderContext.EventOrderPositionEffect> {

            /* compiled from: EventContractOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EventContractOrderContext.EventOrderPositionEffect.values().length];
                    try {
                        iArr[EventContractOrderContext.EventOrderPositionEffect.POSITION_EFFECT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EventContractOrderContext.EventOrderPositionEffect.OPEN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EventContractOrderContext.EventOrderPositionEffect.CLOSE.ordinal()] = 3;
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

            public final KSerializer<EventOrderPositionEffectDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventOrderPositionEffectDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventOrderPositionEffectDto> getBinaryBase64Serializer() {
                return (KSerializer) EventOrderPositionEffectDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<EventContractOrderContext.EventOrderPositionEffect> getProtoAdapter() {
                return EventContractOrderContext.EventOrderPositionEffect.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventOrderPositionEffectDto getZeroValue() {
                return EventOrderPositionEffectDto.POSITION_EFFECT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventOrderPositionEffectDto fromProto(EventContractOrderContext.EventOrderPositionEffect proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EventOrderPositionEffectDto.POSITION_EFFECT_UNSPECIFIED;
                }
                if (i == 2) {
                    return EventOrderPositionEffectDto.OPEN;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return EventOrderPositionEffectDto.CLOSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$EventOrderPositionEffectDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EventOrderPositionEffectDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventOrderPositionEffectDto, EventContractOrderContext.EventOrderPositionEffect> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.EventContractOrderContext.EventOrderPositionEffect", EventOrderPositionEffectDto.getEntries(), EventOrderPositionEffectDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EventOrderPositionEffectDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EventOrderPositionEffectDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventOrderPositionEffectDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EventOrderPositionEffectDto valueOf(String str) {
            return (EventOrderPositionEffectDto) Enum.valueOf(EventOrderPositionEffectDto.class, str);
        }

        public static EventOrderPositionEffectDto[] values() {
            return (EventOrderPositionEffectDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventContractOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SIDE_UNSPECIFIED", "BUY", "SELL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderSideDto implements Dto2<EventContractOrderContext.OrderSide>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderSideDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OrderSideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderSideDto, EventContractOrderContext.OrderSide>> binaryBase64Serializer$delegate;
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

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractOrderContextDto.OrderSideDto.SIDE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIDE_UNSPECIFIED extends OrderSideDto {
            SIDE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractOrderContext.OrderSide toProto() {
                return EventContractOrderContext.OrderSide.SIDE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContextDto$OrderSideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventContractOrderContextDto.OrderSideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractOrderContextDto.OrderSideDto.BUY", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BUY extends OrderSideDto {
            BUY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractOrderContext.OrderSide toProto() {
                return EventContractOrderContext.OrderSide.BUY;
            }
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventContractOrderContextDto.OrderSideDto.SELL", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SELL extends OrderSideDto {
            SELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public EventContractOrderContext.OrderSide toProto() {
                return EventContractOrderContext.OrderSide.SELL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OrderSideDto, EventContractOrderContext.OrderSide> {

            /* compiled from: EventContractOrderContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EventContractOrderContext.OrderSide.values().length];
                    try {
                        iArr[EventContractOrderContext.OrderSide.SIDE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EventContractOrderContext.OrderSide.BUY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EventContractOrderContext.OrderSide.SELL.ordinal()] = 3;
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
            public ProtoAdapter<EventContractOrderContext.OrderSide> getProtoAdapter() {
                return EventContractOrderContext.OrderSide.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto getZeroValue() {
                return OrderSideDto.SIDE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto fromProto(EventContractOrderContext.OrderSide proto) {
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

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderSideDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderSideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OrderSideDto, EventContractOrderContext.OrderSide> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.EventContractOrderContext.OrderSide", OrderSideDto.getEntries(), OrderSideDto.INSTANCE.getZeroValue());

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

    /* compiled from: EventContractOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderRequestContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Surrogate;)V", "quantity", "", "order_ref_id", "", "limit_price", "", "(JLjava/lang/String;D)V", "getQuantity", "()J", "getOrder_ref_id", "()Ljava/lang/String;", "getLimit_price", "()D", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderRequestContextDto implements Dto3<EventContractOrderContext.OrderRequestContext>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OrderRequestContextDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderRequestContextDto, EventContractOrderContext.OrderRequestContext>> binaryBase64Serializer$delegate;
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

        public final long getQuantity() {
            return this.surrogate.getQuantity();
        }

        public final String getOrder_ref_id() {
            return this.surrogate.getOrder_ref_id();
        }

        public final double getLimit_price() {
            return this.surrogate.getLimit_price();
        }

        public /* synthetic */ OrderRequestContextDto(long j, String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0d : d);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OrderRequestContextDto(long j, String order_ref_id, double d) {
            this(new Surrogate(j, order_ref_id, d));
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
        }

        public static /* synthetic */ OrderRequestContextDto copy$default(OrderRequestContextDto orderRequestContextDto, long j, String str, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                j = orderRequestContextDto.surrogate.getQuantity();
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = orderRequestContextDto.surrogate.getOrder_ref_id();
            }
            String str2 = str;
            if ((i & 4) != 0) {
                d = orderRequestContextDto.surrogate.getLimit_price();
            }
            return orderRequestContextDto.copy(j2, str2, d);
        }

        public final OrderRequestContextDto copy(long quantity, String order_ref_id, double limit_price) {
            Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
            return new OrderRequestContextDto(new Surrogate(quantity, order_ref_id, limit_price));
        }

        @Override // com.robinhood.idl.Dto
        public EventContractOrderContext.OrderRequestContext toProto() {
            return new EventContractOrderContext.OrderRequestContext(this.surrogate.getQuantity(), this.surrogate.getOrder_ref_id(), this.surrogate.getLimit_price(), null, 8, null);
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
        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./BC\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\f\u0010\rB5\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u0018\u0010\u001d\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0018\u0010\u001f\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000bHÆ\u0003JE\u0010 \u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000fHÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001c¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Surrogate;", "", "quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "order_ref_id", "", "limit_price", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "<init>", "(JLjava/lang/String;D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getQuantity$annotations", "()V", "getQuantity", "()J", "getOrder_ref_id$annotations", "getOrder_ref_id", "()Ljava/lang/String;", "getLimit_price$annotations", "getLimit_price", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double limit_price;
            private final String order_ref_id;
            private final long quantity;

            public Surrogate() {
                this(0L, (String) null, 0.0d, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, long j, String str, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = surrogate.quantity;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = surrogate.order_ref_id;
                }
                String str2 = str;
                if ((i & 4) != 0) {
                    d = surrogate.limit_price;
                }
                return surrogate.copy(j2, str2, d);
            }

            @SerialName("limitPrice")
            @JsonAnnotations2(names = {"limit_price"})
            public static /* synthetic */ void getLimit_price$annotations() {
            }

            @SerialName("orderRefId")
            @JsonAnnotations2(names = {"order_ref_id"})
            public static /* synthetic */ void getOrder_ref_id$annotations() {
            }

            @SerialName("quantity")
            @JsonAnnotations2(names = {"quantity"})
            public static /* synthetic */ void getQuantity$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final long getQuantity() {
                return this.quantity;
            }

            /* renamed from: component2, reason: from getter */
            public final String getOrder_ref_id() {
                return this.order_ref_id;
            }

            /* renamed from: component3, reason: from getter */
            public final double getLimit_price() {
                return this.limit_price;
            }

            public final Surrogate copy(long quantity, String order_ref_id, double limit_price) {
                Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
                return new Surrogate(quantity, order_ref_id, limit_price);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.quantity == surrogate.quantity && Intrinsics.areEqual(this.order_ref_id, surrogate.order_ref_id) && Double.compare(this.limit_price, surrogate.limit_price) == 0;
            }

            public int hashCode() {
                return (((Long.hashCode(this.quantity) * 31) + this.order_ref_id.hashCode()) * 31) + Double.hashCode(this.limit_price);
            }

            public String toString() {
                return "Surrogate(quantity=" + this.quantity + ", order_ref_id=" + this.order_ref_id + ", limit_price=" + this.limit_price + ")";
            }

            /* compiled from: EventContractOrderContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return EventContractOrderContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, long j, String str, double d, SerializationConstructorMarker serializationConstructorMarker) {
                this.quantity = (i & 1) == 0 ? 0L : j;
                if ((i & 2) == 0) {
                    this.order_ref_id = "";
                } else {
                    this.order_ref_id = str;
                }
                if ((i & 4) == 0) {
                    this.limit_price = 0.0d;
                } else {
                    this.limit_price = d;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                long j = self.quantity;
                if (j != 0) {
                    output.encodeSerializableElement(serialDesc, 0, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
                }
                if (!Intrinsics.areEqual(self.order_ref_id, "")) {
                    output.encodeStringElement(serialDesc, 1, self.order_ref_id);
                }
                if (Double.compare(self.limit_price, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.limit_price));
                }
            }

            public Surrogate(long j, String order_ref_id, double d) {
                Intrinsics.checkNotNullParameter(order_ref_id, "order_ref_id");
                this.quantity = j;
                this.order_ref_id = order_ref_id;
                this.limit_price = d;
            }

            public final long getQuantity() {
                return this.quantity;
            }

            public final String getOrder_ref_id() {
                return this.order_ref_id;
            }

            public /* synthetic */ Surrogate(long j, String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0d : d);
            }

            public final double getLimit_price() {
                return this.limit_price;
            }
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderRequestContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<OrderRequestContextDto, EventContractOrderContext.OrderRequestContext> {
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
            public ProtoAdapter<EventContractOrderContext.OrderRequestContext> getProtoAdapter() {
                return EventContractOrderContext.OrderRequestContext.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderRequestContextDto getZeroValue() {
                return OrderRequestContextDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderRequestContextDto fromProto(EventContractOrderContext.OrderRequestContext proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new OrderRequestContextDto(new Surrogate(proto.getQuantity(), proto.getOrder_ref_id(), proto.getLimit_price()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventContractOrderContextDto$OrderRequestContextDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventContractOrderContextDto.OrderRequestContextDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OrderRequestContextDto(0L, null, 0.0d, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderRequestContextDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EventContractOrderContext.OrderRequestContext", kSerializerSerializer.getDescriptor());
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

        /* compiled from: EventContractOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$OrderRequestContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.EventContractOrderContextDto$OrderRequestContextDto";
            }
        }
    }

    /* compiled from: EventContractOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventContractOrderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EventContractOrderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventContractOrderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventContractOrderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventContractOrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventContractOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractOrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EventContractOrderContextDto";
        }
    }
}
