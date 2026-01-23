package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.ClientMarketdataDto;
import com.robinhood.rosetta.mainst.OrderMetadataDto;
import com.robinhood.rosetta.mainst.RhfMarketdataDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;
import rosetta.order.Platform;
import rosetta.order.PlatformDto;

/* compiled from: OrderMetadataDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040123B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0004\b\u0006\u0010\u0015JX\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\nH\u0016J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\b\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00148F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OrderMetadata;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Surrogate;)V", "flags", "", "", "previous_type", "Lrosetta/mainst/OrderTypeDto;", "client_marketdata", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "rhf_marketdata", "Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "platform", "Lrosetta/order/PlatformDto;", "upstream_event_tags", "", "(Ljava/util/List;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;Lrosetta/order/PlatformDto;Ljava/util/Map;)V", "getFlags", "()Ljava/util/List;", "getPrevious_type", "()Lrosetta/mainst/OrderTypeDto;", "getClient_marketdata", "()Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "getRhf_marketdata", "()Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "getPlatform", "()Lrosetta/order/PlatformDto;", "getUpstream_event_tags", "()Ljava/util/Map;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class OrderMetadataDto implements Dto3<OrderMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderMetadataDto, OrderMetadata>> binaryBase64Serializer$delegate;
    private static final OrderMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<String> getFlags() {
        return this.surrogate.getFlags();
    }

    public final OrderTypeDto getPrevious_type() {
        return this.surrogate.getPrevious_type();
    }

    public final ClientMarketdataDto getClient_marketdata() {
        return this.surrogate.getClient_marketdata();
    }

    public final RhfMarketdataDto getRhf_marketdata() {
        return this.surrogate.getRhf_marketdata();
    }

    public final PlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Map<String, String> getUpstream_event_tags() {
        return this.surrogate.getUpstream_event_tags();
    }

    public /* synthetic */ OrderMetadataDto(List list, OrderTypeDto orderTypeDto, ClientMarketdataDto clientMarketdataDto, RhfMarketdataDto rhfMarketdataDto, PlatformDto platformDto, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 4) != 0 ? null : clientMarketdataDto, (i & 8) != 0 ? null : rhfMarketdataDto, (i & 16) != 0 ? PlatformDto.INSTANCE.getZeroValue() : platformDto, (i & 32) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderMetadataDto(List<String> flags, OrderTypeDto previous_type, ClientMarketdataDto clientMarketdataDto, RhfMarketdataDto rhfMarketdataDto, PlatformDto platform, Map<String, String> upstream_event_tags) {
        this(new Surrogate(flags, previous_type, clientMarketdataDto, rhfMarketdataDto, platform, upstream_event_tags));
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(previous_type, "previous_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(upstream_event_tags, "upstream_event_tags");
    }

    public static /* synthetic */ OrderMetadataDto copy$default(OrderMetadataDto orderMetadataDto, List list, OrderTypeDto orderTypeDto, ClientMarketdataDto clientMarketdataDto, RhfMarketdataDto rhfMarketdataDto, PlatformDto platformDto, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = orderMetadataDto.surrogate.getFlags();
        }
        if ((i & 2) != 0) {
            orderTypeDto = orderMetadataDto.surrogate.getPrevious_type();
        }
        if ((i & 4) != 0) {
            clientMarketdataDto = orderMetadataDto.surrogate.getClient_marketdata();
        }
        if ((i & 8) != 0) {
            rhfMarketdataDto = orderMetadataDto.surrogate.getRhf_marketdata();
        }
        if ((i & 16) != 0) {
            platformDto = orderMetadataDto.surrogate.getPlatform();
        }
        if ((i & 32) != 0) {
            map = orderMetadataDto.surrogate.getUpstream_event_tags();
        }
        PlatformDto platformDto2 = platformDto;
        Map map2 = map;
        return orderMetadataDto.copy(list, orderTypeDto, clientMarketdataDto, rhfMarketdataDto, platformDto2, map2);
    }

    public final OrderMetadataDto copy(List<String> flags, OrderTypeDto previous_type, ClientMarketdataDto client_marketdata, RhfMarketdataDto rhf_marketdata, PlatformDto platform, Map<String, String> upstream_event_tags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(previous_type, "previous_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(upstream_event_tags, "upstream_event_tags");
        return new OrderMetadataDto(new Surrogate(flags, previous_type, client_marketdata, rhf_marketdata, platform, upstream_event_tags));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderMetadata toProto() {
        List<String> flags = this.surrogate.getFlags();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(flags, 10));
        Iterator<T> it = flags.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        OrderType orderType = (OrderType) this.surrogate.getPrevious_type().toProto();
        ClientMarketdataDto client_marketdata = this.surrogate.getClient_marketdata();
        ClientMarketdata proto = client_marketdata != null ? client_marketdata.toProto() : null;
        RhfMarketdataDto rhf_marketdata = this.surrogate.getRhf_marketdata();
        RhfMarketdata proto2 = rhf_marketdata != null ? rhf_marketdata.toProto() : null;
        Platform platform = (Platform) this.surrogate.getPlatform().toProto();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getUpstream_event_tags().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new OrderMetadata(arrayList, orderType, proto, proto2, platform, linkedHashMap, null, 64, null);
    }

    public String toString() {
        return "[OrderMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderMetadataDto) && Intrinsics.areEqual(((OrderMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>BY\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u0015\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000eHÆ\u0003J[\u0010/\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000eHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u00020\u0004HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Surrogate;", "", "flags", "", "", "previous_type", "Lrosetta/mainst/OrderTypeDto;", "client_marketdata", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "rhf_marketdata", "Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "platform", "Lrosetta/order/PlatformDto;", "upstream_event_tags", "", "<init>", "(Ljava/util/List;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;Lrosetta/order/PlatformDto;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;Lrosetta/order/PlatformDto;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFlags$annotations", "()V", "getFlags", "()Ljava/util/List;", "getPrevious_type$annotations", "getPrevious_type", "()Lrosetta/mainst/OrderTypeDto;", "getClient_marketdata$annotations", "getClient_marketdata", "()Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "getRhf_marketdata$annotations", "getRhf_marketdata", "()Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "getPlatform$annotations", "getPlatform", "()Lrosetta/order/PlatformDto;", "getUpstream_event_tags$annotations", "getUpstream_event_tags", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientMarketdataDto client_marketdata;
        private final List<String> flags;
        private final PlatformDto platform;
        private final OrderTypeDto previous_type;
        private final RhfMarketdataDto rhf_marketdata;
        private final Map<String, String> upstream_event_tags;

        public Surrogate() {
            this((List) null, (OrderTypeDto) null, (ClientMarketdataDto) null, (RhfMarketdataDto) null, (PlatformDto) null, (Map) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, List list, OrderTypeDto orderTypeDto, ClientMarketdataDto clientMarketdataDto, RhfMarketdataDto rhfMarketdataDto, PlatformDto platformDto, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = surrogate.flags;
            }
            if ((i & 2) != 0) {
                orderTypeDto = surrogate.previous_type;
            }
            if ((i & 4) != 0) {
                clientMarketdataDto = surrogate.client_marketdata;
            }
            if ((i & 8) != 0) {
                rhfMarketdataDto = surrogate.rhf_marketdata;
            }
            if ((i & 16) != 0) {
                platformDto = surrogate.platform;
            }
            if ((i & 32) != 0) {
                map = surrogate.upstream_event_tags;
            }
            PlatformDto platformDto2 = platformDto;
            Map map2 = map;
            return surrogate.copy(list, orderTypeDto, clientMarketdataDto, rhfMarketdataDto, platformDto2, map2);
        }

        @SerialName("clientMarketdata")
        @JsonAnnotations2(names = {"client_marketdata"})
        public static /* synthetic */ void getClient_marketdata$annotations() {
        }

        @SerialName("flags")
        @JsonAnnotations2(names = {"flags"})
        public static /* synthetic */ void getFlags$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("previousType")
        @JsonAnnotations2(names = {"previous_type"})
        public static /* synthetic */ void getPrevious_type$annotations() {
        }

        @SerialName("rhfMarketdata")
        @JsonAnnotations2(names = {"rhf_marketdata"})
        public static /* synthetic */ void getRhf_marketdata$annotations() {
        }

        @SerialName("upstreamEventTags")
        @JsonAnnotations2(names = {"upstream_event_tags"})
        public static /* synthetic */ void getUpstream_event_tags$annotations() {
        }

        public final List<String> component1() {
            return this.flags;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderTypeDto getPrevious_type() {
            return this.previous_type;
        }

        /* renamed from: component3, reason: from getter */
        public final ClientMarketdataDto getClient_marketdata() {
            return this.client_marketdata;
        }

        /* renamed from: component4, reason: from getter */
        public final RhfMarketdataDto getRhf_marketdata() {
            return this.rhf_marketdata;
        }

        /* renamed from: component5, reason: from getter */
        public final PlatformDto getPlatform() {
            return this.platform;
        }

        public final Map<String, String> component6() {
            return this.upstream_event_tags;
        }

        public final Surrogate copy(List<String> flags, OrderTypeDto previous_type, ClientMarketdataDto client_marketdata, RhfMarketdataDto rhf_marketdata, PlatformDto platform, Map<String, String> upstream_event_tags) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(previous_type, "previous_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(upstream_event_tags, "upstream_event_tags");
            return new Surrogate(flags, previous_type, client_marketdata, rhf_marketdata, platform, upstream_event_tags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.flags, surrogate.flags) && this.previous_type == surrogate.previous_type && Intrinsics.areEqual(this.client_marketdata, surrogate.client_marketdata) && Intrinsics.areEqual(this.rhf_marketdata, surrogate.rhf_marketdata) && this.platform == surrogate.platform && Intrinsics.areEqual(this.upstream_event_tags, surrogate.upstream_event_tags);
        }

        public int hashCode() {
            int iHashCode = ((this.flags.hashCode() * 31) + this.previous_type.hashCode()) * 31;
            ClientMarketdataDto clientMarketdataDto = this.client_marketdata;
            int iHashCode2 = (iHashCode + (clientMarketdataDto == null ? 0 : clientMarketdataDto.hashCode())) * 31;
            RhfMarketdataDto rhfMarketdataDto = this.rhf_marketdata;
            return ((((iHashCode2 + (rhfMarketdataDto != null ? rhfMarketdataDto.hashCode() : 0)) * 31) + this.platform.hashCode()) * 31) + this.upstream_event_tags.hashCode();
        }

        public String toString() {
            return "Surrogate(flags=" + this.flags + ", previous_type=" + this.previous_type + ", client_marketdata=" + this.client_marketdata + ", rhf_marketdata=" + this.rhf_marketdata + ", platform=" + this.platform + ", upstream_event_tags=" + this.upstream_event_tags + ")";
        }

        /* compiled from: OrderMetadataDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderMetadataDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderMetadataDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderMetadataDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderMetadataDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderMetadataDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, OrderTypeDto orderTypeDto, ClientMarketdataDto clientMarketdataDto, RhfMarketdataDto rhfMarketdataDto, PlatformDto platformDto, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            this.flags = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.previous_type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.previous_type = orderTypeDto;
            }
            if ((i & 4) == 0) {
                this.client_marketdata = null;
            } else {
                this.client_marketdata = clientMarketdataDto;
            }
            if ((i & 8) == 0) {
                this.rhf_marketdata = null;
            } else {
                this.rhf_marketdata = rhfMarketdataDto;
            }
            if ((i & 16) == 0) {
                this.platform = PlatformDto.INSTANCE.getZeroValue();
            } else {
                this.platform = platformDto;
            }
            if ((i & 32) == 0) {
                this.upstream_event_tags = MapsKt.emptyMap();
            } else {
                this.upstream_event_tags = map;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.flags, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.flags);
            }
            if (self.previous_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderTypeDto.Serializer.INSTANCE, self.previous_type);
            }
            ClientMarketdataDto clientMarketdataDto = self.client_marketdata;
            if (clientMarketdataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ClientMarketdataDto.Serializer.INSTANCE, clientMarketdataDto);
            }
            RhfMarketdataDto rhfMarketdataDto = self.rhf_marketdata;
            if (rhfMarketdataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, RhfMarketdataDto.Serializer.INSTANCE, rhfMarketdataDto);
            }
            if (self.platform != PlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, PlatformDto.Serializer.INSTANCE, self.platform);
            }
            if (Intrinsics.areEqual(self.upstream_event_tags, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.upstream_event_tags);
        }

        public Surrogate(List<String> flags, OrderTypeDto previous_type, ClientMarketdataDto clientMarketdataDto, RhfMarketdataDto rhfMarketdataDto, PlatformDto platform, Map<String, String> upstream_event_tags) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(previous_type, "previous_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(upstream_event_tags, "upstream_event_tags");
            this.flags = flags;
            this.previous_type = previous_type;
            this.client_marketdata = clientMarketdataDto;
            this.rhf_marketdata = rhfMarketdataDto;
            this.platform = platform;
            this.upstream_event_tags = upstream_event_tags;
        }

        public final List<String> getFlags() {
            return this.flags;
        }

        public /* synthetic */ Surrogate(List list, OrderTypeDto orderTypeDto, ClientMarketdataDto clientMarketdataDto, RhfMarketdataDto rhfMarketdataDto, PlatformDto platformDto, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 4) != 0 ? null : clientMarketdataDto, (i & 8) != 0 ? null : rhfMarketdataDto, (i & 16) != 0 ? PlatformDto.INSTANCE.getZeroValue() : platformDto, (i & 32) != 0 ? MapsKt.emptyMap() : map);
        }

        public final OrderTypeDto getPrevious_type() {
            return this.previous_type;
        }

        public final ClientMarketdataDto getClient_marketdata() {
            return this.client_marketdata;
        }

        public final RhfMarketdataDto getRhf_marketdata() {
            return this.rhf_marketdata;
        }

        public final PlatformDto getPlatform() {
            return this.platform;
        }

        public final Map<String, String> getUpstream_event_tags() {
            return this.upstream_event_tags;
        }
    }

    /* compiled from: OrderMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "Lcom/robinhood/rosetta/mainst/OrderMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderMetadataDto, OrderMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderMetadata> getProtoAdapter() {
            return OrderMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderMetadataDto getZeroValue() {
            return OrderMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderMetadataDto fromProto(OrderMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<String> flags = proto.getFlags();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(flags, 10));
            Iterator<T> it = flags.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getPrevious_type());
            ClientMarketdata client_marketdata = proto.getClient_marketdata();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ClientMarketdataDto clientMarketdataDtoFromProto = client_marketdata != null ? ClientMarketdataDto.INSTANCE.fromProto(client_marketdata) : null;
            RhfMarketdata rhf_marketdata = proto.getRhf_marketdata();
            RhfMarketdataDto rhfMarketdataDtoFromProto = rhf_marketdata != null ? RhfMarketdataDto.INSTANCE.fromProto(rhf_marketdata) : null;
            PlatformDto platformDtoFromProto = PlatformDto.INSTANCE.fromProto(proto.getPlatform());
            Set<Map.Entry<String, String>> setEntrySet = proto.getUpstream_event_tags().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return new OrderMetadataDto(new Surrogate(arrayList, orderTypeDtoFromProto, clientMarketdataDtoFromProto, rhfMarketdataDtoFromProto, platformDtoFromProto, linkedHashMap), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderMetadataDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new OrderMetadataDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OrderMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OrderMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderMetadataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OrderMetadataDto";
        }
    }
}
