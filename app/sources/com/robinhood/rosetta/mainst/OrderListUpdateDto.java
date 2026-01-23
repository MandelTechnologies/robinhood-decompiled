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
import com.robinhood.rosetta.mainst.NullableIntDto;
import com.robinhood.rosetta.mainst.OrderListUpdateDto;
import com.robinhood.rosetta.mainst.OrderUpdateDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
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
import rosetta.order.Agent;
import rosetta.order.AgentDto;
import rosetta.order.ClientService;
import rosetta.order.ClientServiceDto;
import rosetta.order.OrderListContingencyType;
import rosetta.order.OrderListContingencyTypeDto;

/* compiled from: OrderListUpdateDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004CDEFB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0091\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u001fJ\u008e\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\tJ\b\u00107\u001a\u00020\u0002H\u0016J\b\u00108\u001a\u00020\u0017H\u0016J\u0013\u00109\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020\u001dH\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u001dH\u0016J\b\u0010B\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b5\u0010!¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderListUpdateDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OrderListUpdate;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "proportional_triggering", "", "sub_orders", "", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto;", "received_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "contingency_type", "Lrosetta/order/OrderListContingencyTypeDto;", "cancel_open_time", "cancel_open_agent", "Lrosetta/order/AgentDto;", "account_number", "", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "order_created_service", "Lrosetta/order/ClientServiceDto;", "version", "", "list_id", "(Lcom/robinhood/rosetta/mainst/UUIDDto;ZLjava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/OrderListContingencyTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lrosetta/order/ClientServiceDto;ILcom/robinhood/rosetta/mainst/UUIDDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getProportional_triggering", "()Z", "getSub_orders", "()Ljava/util/List;", "getReceived_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getContingency_type", "()Lrosetta/order/OrderListContingencyTypeDto;", "getCancel_open_time", "getCancel_open_agent", "()Lrosetta/order/AgentDto;", "getAccount_number", "()Ljava/lang/String;", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getOrder_created_service", "()Lrosetta/order/ClientServiceDto;", "getVersion", "()I", "getList_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class OrderListUpdateDto implements Dto3<OrderListUpdate>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderListUpdateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderListUpdateDto, OrderListUpdate>> binaryBase64Serializer$delegate;
    private static final OrderListUpdateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderListUpdateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderListUpdateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final boolean getProportional_triggering() {
        return this.surrogate.getProportional_triggering();
    }

    public final List<OrderUpdateDto> getSub_orders() {
        return this.surrogate.getSub_orders();
    }

    public final TimeDto getReceived_at() {
        return this.surrogate.getReceived_at();
    }

    public final OrderListContingencyTypeDto getContingency_type() {
        return this.surrogate.getContingency_type();
    }

    public final TimeDto getCancel_open_time() {
        return this.surrogate.getCancel_open_time();
    }

    public final AgentDto getCancel_open_agent() {
        return this.surrogate.getCancel_open_agent();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final NullableIntDto getService_shard_id() {
        return this.surrogate.getService_shard_id();
    }

    public final ClientServiceDto getOrder_created_service() {
        return this.surrogate.getOrder_created_service();
    }

    public final int getVersion() {
        return this.surrogate.getVersion();
    }

    public final UUIDDto getList_id() {
        return this.surrogate.getList_id();
    }

    public /* synthetic */ OrderListUpdateDto(UUIDDto uUIDDto, boolean z, List list, TimeDto timeDto, OrderListContingencyTypeDto orderListContingencyTypeDto, TimeDto timeDto2, AgentDto agentDto, String str, NullableIntDto nullableIntDto, ClientServiceDto clientServiceDto, int i, UUIDDto uUIDDto2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : timeDto, (i2 & 16) != 0 ? OrderListContingencyTypeDto.INSTANCE.getZeroValue() : orderListContingencyTypeDto, (i2 & 32) != 0 ? null : timeDto2, (i2 & 64) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i2 & 128) != 0 ? "" : str, (i2 & 256) != 0 ? null : nullableIntDto, (i2 & 512) != 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto, (i2 & 1024) == 0 ? i : 0, (i2 & 2048) != 0 ? null : uUIDDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderListUpdateDto(UUIDDto uUIDDto, boolean z, List<OrderUpdateDto> sub_orders, TimeDto timeDto, OrderListContingencyTypeDto contingency_type, TimeDto timeDto2, AgentDto cancel_open_agent, String account_number, NullableIntDto nullableIntDto, ClientServiceDto order_created_service, int i, UUIDDto uUIDDto2) {
        this(new Surrogate(uUIDDto, z, sub_orders, timeDto, contingency_type, timeDto2, cancel_open_agent, account_number, nullableIntDto, order_created_service, i, uUIDDto2));
        Intrinsics.checkNotNullParameter(sub_orders, "sub_orders");
        Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
    }

    public static /* synthetic */ OrderListUpdateDto copy$default(OrderListUpdateDto orderListUpdateDto, UUIDDto uUIDDto, boolean z, List list, TimeDto timeDto, OrderListContingencyTypeDto orderListContingencyTypeDto, TimeDto timeDto2, AgentDto agentDto, String str, NullableIntDto nullableIntDto, ClientServiceDto clientServiceDto, int i, UUIDDto uUIDDto2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uUIDDto = orderListUpdateDto.surrogate.getId();
        }
        if ((i2 & 2) != 0) {
            z = orderListUpdateDto.surrogate.getProportional_triggering();
        }
        if ((i2 & 4) != 0) {
            list = orderListUpdateDto.surrogate.getSub_orders();
        }
        if ((i2 & 8) != 0) {
            timeDto = orderListUpdateDto.surrogate.getReceived_at();
        }
        if ((i2 & 16) != 0) {
            orderListContingencyTypeDto = orderListUpdateDto.surrogate.getContingency_type();
        }
        if ((i2 & 32) != 0) {
            timeDto2 = orderListUpdateDto.surrogate.getCancel_open_time();
        }
        if ((i2 & 64) != 0) {
            agentDto = orderListUpdateDto.surrogate.getCancel_open_agent();
        }
        if ((i2 & 128) != 0) {
            str = orderListUpdateDto.surrogate.getAccount_number();
        }
        if ((i2 & 256) != 0) {
            nullableIntDto = orderListUpdateDto.surrogate.getService_shard_id();
        }
        if ((i2 & 512) != 0) {
            clientServiceDto = orderListUpdateDto.surrogate.getOrder_created_service();
        }
        if ((i2 & 1024) != 0) {
            i = orderListUpdateDto.surrogate.getVersion();
        }
        if ((i2 & 2048) != 0) {
            uUIDDto2 = orderListUpdateDto.surrogate.getList_id();
        }
        int i3 = i;
        UUIDDto uUIDDto3 = uUIDDto2;
        NullableIntDto nullableIntDto2 = nullableIntDto;
        ClientServiceDto clientServiceDto2 = clientServiceDto;
        AgentDto agentDto2 = agentDto;
        String str2 = str;
        OrderListContingencyTypeDto orderListContingencyTypeDto2 = orderListContingencyTypeDto;
        TimeDto timeDto3 = timeDto2;
        return orderListUpdateDto.copy(uUIDDto, z, list, timeDto, orderListContingencyTypeDto2, timeDto3, agentDto2, str2, nullableIntDto2, clientServiceDto2, i3, uUIDDto3);
    }

    public final OrderListUpdateDto copy(UUIDDto id, boolean proportional_triggering, List<OrderUpdateDto> sub_orders, TimeDto received_at, OrderListContingencyTypeDto contingency_type, TimeDto cancel_open_time, AgentDto cancel_open_agent, String account_number, NullableIntDto service_shard_id, ClientServiceDto order_created_service, int version, UUIDDto list_id) {
        Intrinsics.checkNotNullParameter(sub_orders, "sub_orders");
        Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
        return new OrderListUpdateDto(new Surrogate(id, proportional_triggering, sub_orders, received_at, contingency_type, cancel_open_time, cancel_open_agent, account_number, service_shard_id, order_created_service, version, list_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderListUpdate toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        boolean proportional_triggering = this.surrogate.getProportional_triggering();
        List<OrderUpdateDto> sub_orders = this.surrogate.getSub_orders();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sub_orders, 10));
        Iterator<T> it = sub_orders.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderUpdateDto) it.next()).toProto());
        }
        TimeDto received_at = this.surrogate.getReceived_at();
        Time proto2 = received_at != null ? received_at.toProto() : null;
        OrderListContingencyType orderListContingencyType = (OrderListContingencyType) this.surrogate.getContingency_type().toProto();
        TimeDto cancel_open_time = this.surrogate.getCancel_open_time();
        Time proto3 = cancel_open_time != null ? cancel_open_time.toProto() : null;
        Agent agent = (Agent) this.surrogate.getCancel_open_agent().toProto();
        String account_number = this.surrogate.getAccount_number();
        NullableIntDto service_shard_id = this.surrogate.getService_shard_id();
        NullableInt proto4 = service_shard_id != null ? service_shard_id.toProto() : null;
        ClientService clientService = (ClientService) this.surrogate.getOrder_created_service().toProto();
        int version = this.surrogate.getVersion();
        UUIDDto list_id = this.surrogate.getList_id();
        return new OrderListUpdate(proto, proportional_triggering, arrayList, proto2, orderListContingencyType, proto3, agent, account_number, proto4, clientService, version, list_id != null ? list_id.toProto() : null, null, 4096, null);
    }

    public String toString() {
        return "[OrderListUpdateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderListUpdateDto) && Intrinsics.areEqual(((OrderListUpdateDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderListUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 _2\u00020\u0001:\u0002^_B\u009e\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dB\u0095\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010!J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010I\u001a\u00020\fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010K\u001a\u00020\u000fHÆ\u0003J\t\u0010L\u001a\u00020\u0011HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010N\u001a\u00020\u0015HÆ\u0003J\u0018\u0010O\u001a\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001aHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J \u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0017\b\u0002\u0010\u0016\u001a\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010R\u001a\u00020\u00052\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0017HÖ\u0001J\t\u0010U\u001a\u00020\u0011HÖ\u0001J%\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\H\u0001¢\u0006\u0002\b]R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010#\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010#\u001a\u0004\b*\u0010+R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010#\u001a\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010#\u001a\u0004\b0\u00101R\u001e\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010#\u001a\u0004\b3\u0010.R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010#\u001a\u0004\b5\u00106R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010#\u001a\u0004\b8\u00109R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010#\u001a\u0004\b;\u0010<R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010#\u001a\u0004\b>\u0010?R+\u0010\u0016\u001a\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010#\u001a\u0004\bA\u0010BR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010#\u001a\u0004\bD\u0010%¨\u0006`"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "proportional_triggering", "", "sub_orders", "", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto;", "received_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "contingency_type", "Lrosetta/order/OrderListContingencyTypeDto;", "cancel_open_time", "cancel_open_agent", "Lrosetta/order/AgentDto;", "account_number", "", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "order_created_service", "Lrosetta/order/ClientServiceDto;", "version", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "list_id", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;ZLjava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/OrderListContingencyTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lrosetta/order/ClientServiceDto;ILcom/robinhood/rosetta/mainst/UUIDDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;ZLjava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/OrderListContingencyTypeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lrosetta/order/ClientServiceDto;ILcom/robinhood/rosetta/mainst/UUIDDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getProportional_triggering$annotations", "getProportional_triggering", "()Z", "getSub_orders$annotations", "getSub_orders", "()Ljava/util/List;", "getReceived_at$annotations", "getReceived_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getContingency_type$annotations", "getContingency_type", "()Lrosetta/order/OrderListContingencyTypeDto;", "getCancel_open_time$annotations", "getCancel_open_time", "getCancel_open_agent$annotations", "getCancel_open_agent", "()Lrosetta/order/AgentDto;", "getAccount_number$annotations", "getAccount_number", "()Ljava/lang/String;", "getService_shard_id$annotations", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getOrder_created_service$annotations", "getOrder_created_service", "()Lrosetta/order/ClientServiceDto;", "getVersion$annotations", "getVersion", "()I", "getList_id$annotations", "getList_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final AgentDto cancel_open_agent;
        private final TimeDto cancel_open_time;
        private final OrderListContingencyTypeDto contingency_type;
        private final UUIDDto id;
        private final UUIDDto list_id;
        private final ClientServiceDto order_created_service;
        private final boolean proportional_triggering;
        private final TimeDto received_at;
        private final NullableIntDto service_shard_id;
        private final List<OrderUpdateDto> sub_orders;
        private final int version;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderListUpdateDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderListUpdateDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((UUIDDto) null, false, (List) null, (TimeDto) null, (OrderListContingencyTypeDto) null, (TimeDto) null, (AgentDto) null, (String) null, (NullableIntDto) null, (ClientServiceDto) null, 0, (UUIDDto) null, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderUpdateDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, boolean z, List list, TimeDto timeDto, OrderListContingencyTypeDto orderListContingencyTypeDto, TimeDto timeDto2, AgentDto agentDto, String str, NullableIntDto nullableIntDto, ClientServiceDto clientServiceDto, int i, UUIDDto uUIDDto2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uUIDDto = surrogate.id;
            }
            if ((i2 & 2) != 0) {
                z = surrogate.proportional_triggering;
            }
            if ((i2 & 4) != 0) {
                list = surrogate.sub_orders;
            }
            if ((i2 & 8) != 0) {
                timeDto = surrogate.received_at;
            }
            if ((i2 & 16) != 0) {
                orderListContingencyTypeDto = surrogate.contingency_type;
            }
            if ((i2 & 32) != 0) {
                timeDto2 = surrogate.cancel_open_time;
            }
            if ((i2 & 64) != 0) {
                agentDto = surrogate.cancel_open_agent;
            }
            if ((i2 & 128) != 0) {
                str = surrogate.account_number;
            }
            if ((i2 & 256) != 0) {
                nullableIntDto = surrogate.service_shard_id;
            }
            if ((i2 & 512) != 0) {
                clientServiceDto = surrogate.order_created_service;
            }
            if ((i2 & 1024) != 0) {
                i = surrogate.version;
            }
            if ((i2 & 2048) != 0) {
                uUIDDto2 = surrogate.list_id;
            }
            int i3 = i;
            UUIDDto uUIDDto3 = uUIDDto2;
            NullableIntDto nullableIntDto2 = nullableIntDto;
            ClientServiceDto clientServiceDto2 = clientServiceDto;
            AgentDto agentDto2 = agentDto;
            String str2 = str;
            OrderListContingencyTypeDto orderListContingencyTypeDto2 = orderListContingencyTypeDto;
            TimeDto timeDto3 = timeDto2;
            return surrogate.copy(uUIDDto, z, list, timeDto, orderListContingencyTypeDto2, timeDto3, agentDto2, str2, nullableIntDto2, clientServiceDto2, i3, uUIDDto3);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("cancelOpenAgent")
        @JsonAnnotations2(names = {"cancel_open_agent"})
        public static /* synthetic */ void getCancel_open_agent$annotations() {
        }

        @SerialName("cancelOpenTime")
        @JsonAnnotations2(names = {"cancel_open_time"})
        public static /* synthetic */ void getCancel_open_time$annotations() {
        }

        @SerialName("contingencyType")
        @JsonAnnotations2(names = {"contingency_type"})
        public static /* synthetic */ void getContingency_type$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("listId")
        @JsonAnnotations2(names = {"list_id"})
        public static /* synthetic */ void getList_id$annotations() {
        }

        @SerialName("orderCreatedService")
        @JsonAnnotations2(names = {"order_created_service"})
        public static /* synthetic */ void getOrder_created_service$annotations() {
        }

        @SerialName("proportionalTriggering")
        @JsonAnnotations2(names = {"proportional_triggering"})
        public static /* synthetic */ void getProportional_triggering$annotations() {
        }

        @SerialName("receivedAt")
        @JsonAnnotations2(names = {"received_at"})
        public static /* synthetic */ void getReceived_at$annotations() {
        }

        @SerialName("serviceShardId")
        @JsonAnnotations2(names = {"service_shard_id"})
        public static /* synthetic */ void getService_shard_id$annotations() {
        }

        @SerialName("subOrders")
        @JsonAnnotations2(names = {"sub_orders"})
        public static /* synthetic */ void getSub_orders$annotations() {
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
        public final ClientServiceDto getOrder_created_service() {
            return this.order_created_service;
        }

        /* renamed from: component11, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* renamed from: component12, reason: from getter */
        public final UUIDDto getList_id() {
            return this.list_id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getProportional_triggering() {
            return this.proportional_triggering;
        }

        public final List<OrderUpdateDto> component3() {
            return this.sub_orders;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getReceived_at() {
            return this.received_at;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderListContingencyTypeDto getContingency_type() {
            return this.contingency_type;
        }

        /* renamed from: component6, reason: from getter */
        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        /* renamed from: component7, reason: from getter */
        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component9, reason: from getter */
        public final NullableIntDto getService_shard_id() {
            return this.service_shard_id;
        }

        public final Surrogate copy(UUIDDto id, boolean proportional_triggering, List<OrderUpdateDto> sub_orders, TimeDto received_at, OrderListContingencyTypeDto contingency_type, TimeDto cancel_open_time, AgentDto cancel_open_agent, String account_number, NullableIntDto service_shard_id, ClientServiceDto order_created_service, int version, UUIDDto list_id) {
            Intrinsics.checkNotNullParameter(sub_orders, "sub_orders");
            Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
            return new Surrogate(id, proportional_triggering, sub_orders, received_at, contingency_type, cancel_open_time, cancel_open_agent, account_number, service_shard_id, order_created_service, version, list_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.proportional_triggering == surrogate.proportional_triggering && Intrinsics.areEqual(this.sub_orders, surrogate.sub_orders) && Intrinsics.areEqual(this.received_at, surrogate.received_at) && this.contingency_type == surrogate.contingency_type && Intrinsics.areEqual(this.cancel_open_time, surrogate.cancel_open_time) && this.cancel_open_agent == surrogate.cancel_open_agent && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.service_shard_id, surrogate.service_shard_id) && this.order_created_service == surrogate.order_created_service && this.version == surrogate.version && Intrinsics.areEqual(this.list_id, surrogate.list_id);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (((((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + Boolean.hashCode(this.proportional_triggering)) * 31) + this.sub_orders.hashCode()) * 31;
            TimeDto timeDto = this.received_at;
            int iHashCode2 = (((iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31) + this.contingency_type.hashCode()) * 31;
            TimeDto timeDto2 = this.cancel_open_time;
            int iHashCode3 = (((((iHashCode2 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31) + this.cancel_open_agent.hashCode()) * 31) + this.account_number.hashCode()) * 31;
            NullableIntDto nullableIntDto = this.service_shard_id;
            int iHashCode4 = (((((iHashCode3 + (nullableIntDto == null ? 0 : nullableIntDto.hashCode())) * 31) + this.order_created_service.hashCode()) * 31) + Integer.hashCode(this.version)) * 31;
            UUIDDto uUIDDto2 = this.list_id;
            return iHashCode4 + (uUIDDto2 != null ? uUIDDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", proportional_triggering=" + this.proportional_triggering + ", sub_orders=" + this.sub_orders + ", received_at=" + this.received_at + ", contingency_type=" + this.contingency_type + ", cancel_open_time=" + this.cancel_open_time + ", cancel_open_agent=" + this.cancel_open_agent + ", account_number=" + this.account_number + ", service_shard_id=" + this.service_shard_id + ", order_created_service=" + this.order_created_service + ", version=" + this.version + ", list_id=" + this.list_id + ")";
        }

        /* compiled from: OrderListUpdateDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderListUpdateDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, boolean z, List list, TimeDto timeDto, OrderListContingencyTypeDto orderListContingencyTypeDto, TimeDto timeDto2, AgentDto agentDto, String str, NullableIntDto nullableIntDto, ClientServiceDto clientServiceDto, int i2, UUIDDto uUIDDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.proportional_triggering = false;
            } else {
                this.proportional_triggering = z;
            }
            if ((i & 4) == 0) {
                this.sub_orders = CollectionsKt.emptyList();
            } else {
                this.sub_orders = list;
            }
            if ((i & 8) == 0) {
                this.received_at = null;
            } else {
                this.received_at = timeDto;
            }
            if ((i & 16) == 0) {
                this.contingency_type = OrderListContingencyTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contingency_type = orderListContingencyTypeDto;
            }
            if ((i & 32) == 0) {
                this.cancel_open_time = null;
            } else {
                this.cancel_open_time = timeDto2;
            }
            if ((i & 64) == 0) {
                this.cancel_open_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.cancel_open_agent = agentDto;
            }
            if ((i & 128) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 256) == 0) {
                this.service_shard_id = null;
            } else {
                this.service_shard_id = nullableIntDto;
            }
            if ((i & 512) == 0) {
                this.order_created_service = ClientServiceDto.INSTANCE.getZeroValue();
            } else {
                this.order_created_service = clientServiceDto;
            }
            if ((i & 1024) == 0) {
                this.version = 0;
            } else {
                this.version = i2;
            }
            if ((i & 2048) == 0) {
                this.list_id = null;
            } else {
                this.list_id = uUIDDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            boolean z = self.proportional_triggering;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            if (!Intrinsics.areEqual(self.sub_orders, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.sub_orders);
            }
            TimeDto timeDto = self.received_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto);
            }
            if (self.contingency_type != OrderListContingencyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, OrderListContingencyTypeDto.Serializer.INSTANCE, self.contingency_type);
            }
            TimeDto timeDto2 = self.cancel_open_time;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (self.cancel_open_agent != AgentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, AgentDto.Serializer.INSTANCE, self.cancel_open_agent);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 7, self.account_number);
            }
            NullableIntDto nullableIntDto = self.service_shard_id;
            if (nullableIntDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, NullableIntDto.Serializer.INSTANCE, nullableIntDto);
            }
            if (self.order_created_service != ClientServiceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, ClientServiceDto.Serializer.INSTANCE, self.order_created_service);
            }
            int i = self.version;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 10, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            UUIDDto uUIDDto2 = self.list_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
        }

        public Surrogate(UUIDDto uUIDDto, boolean z, List<OrderUpdateDto> sub_orders, TimeDto timeDto, OrderListContingencyTypeDto contingency_type, TimeDto timeDto2, AgentDto cancel_open_agent, String account_number, NullableIntDto nullableIntDto, ClientServiceDto order_created_service, int i, UUIDDto uUIDDto2) {
            Intrinsics.checkNotNullParameter(sub_orders, "sub_orders");
            Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
            this.id = uUIDDto;
            this.proportional_triggering = z;
            this.sub_orders = sub_orders;
            this.received_at = timeDto;
            this.contingency_type = contingency_type;
            this.cancel_open_time = timeDto2;
            this.cancel_open_agent = cancel_open_agent;
            this.account_number = account_number;
            this.service_shard_id = nullableIntDto;
            this.order_created_service = order_created_service;
            this.version = i;
            this.list_id = uUIDDto2;
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final boolean getProportional_triggering() {
            return this.proportional_triggering;
        }

        public final List<OrderUpdateDto> getSub_orders() {
            return this.sub_orders;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, boolean z, List list, TimeDto timeDto, OrderListContingencyTypeDto orderListContingencyTypeDto, TimeDto timeDto2, AgentDto agentDto, String str, NullableIntDto nullableIntDto, ClientServiceDto clientServiceDto, int i, UUIDDto uUIDDto2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : timeDto, (i2 & 16) != 0 ? OrderListContingencyTypeDto.INSTANCE.getZeroValue() : orderListContingencyTypeDto, (i2 & 32) != 0 ? null : timeDto2, (i2 & 64) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i2 & 128) != 0 ? "" : str, (i2 & 256) != 0 ? null : nullableIntDto, (i2 & 512) != 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto, (i2 & 1024) == 0 ? i : 0, (i2 & 2048) != 0 ? null : uUIDDto2);
        }

        public final TimeDto getReceived_at() {
            return this.received_at;
        }

        public final OrderListContingencyTypeDto getContingency_type() {
            return this.contingency_type;
        }

        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final NullableIntDto getService_shard_id() {
            return this.service_shard_id;
        }

        public final ClientServiceDto getOrder_created_service() {
            return this.order_created_service;
        }

        public final int getVersion() {
            return this.version;
        }

        public final UUIDDto getList_id() {
            return this.list_id;
        }
    }

    /* compiled from: OrderListUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderListUpdateDto;", "Lcom/robinhood/rosetta/mainst/OrderListUpdate;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OrderListUpdateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderListUpdateDto, OrderListUpdate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderListUpdateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderListUpdateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderListUpdateDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderListUpdateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderListUpdate> getProtoAdapter() {
            return OrderListUpdate.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderListUpdateDto getZeroValue() {
            return OrderListUpdateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderListUpdateDto fromProto(OrderListUpdate proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            boolean proportional_triggering = proto.getProportional_triggering();
            List<OrderUpdate> sub_orders = proto.getSub_orders();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sub_orders, 10));
            Iterator<T> it = sub_orders.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderUpdateDto.INSTANCE.fromProto((OrderUpdate) it.next()));
            }
            Time received_at = proto.getReceived_at();
            TimeDto timeDtoFromProto = received_at != null ? TimeDto.INSTANCE.fromProto(received_at) : null;
            OrderListContingencyTypeDto orderListContingencyTypeDtoFromProto = OrderListContingencyTypeDto.INSTANCE.fromProto(proto.getContingency_type());
            Time cancel_open_time = proto.getCancel_open_time();
            TimeDto timeDtoFromProto2 = cancel_open_time != null ? TimeDto.INSTANCE.fromProto(cancel_open_time) : null;
            AgentDto agentDtoFromProto = AgentDto.INSTANCE.fromProto(proto.getCancel_open_agent());
            String account_number = proto.getAccount_number();
            NullableInt service_shard_id = proto.getService_shard_id();
            NullableIntDto nullableIntDtoFromProto = service_shard_id != null ? NullableIntDto.INSTANCE.fromProto(service_shard_id) : null;
            ClientServiceDto clientServiceDtoFromProto = ClientServiceDto.INSTANCE.fromProto(proto.getOrder_created_service());
            int version = proto.getVersion();
            UUID list_id = proto.getList_id();
            return new OrderListUpdateDto(new Surrogate(uUIDDtoFromProto, proportional_triggering, arrayList, timeDtoFromProto, orderListContingencyTypeDtoFromProto, timeDtoFromProto2, agentDtoFromProto, account_number, nullableIntDtoFromProto, clientServiceDtoFromProto, version, list_id != null ? UUIDDto.INSTANCE.fromProto(list_id) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderListUpdateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderListUpdateDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new OrderListUpdateDto(null, false, null, null, null, null, null, null, null, null, 0, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderListUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderListUpdateDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderListUpdateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OrderListUpdate", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderListUpdateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderListUpdateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderListUpdateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderListUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderListUpdateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OrderListUpdateDto";
        }
    }
}
