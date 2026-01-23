package com.robinhood.rosetta.mainst;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import rosetta.mainst.OrderType;
import rosetta.order.Platform;

/* compiled from: OrderMetadata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bc\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016Jb\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadata;", "Lcom/squareup/wire/Message;", "", "flags", "", "", "previous_type", "Lrosetta/mainst/OrderType;", "client_marketdata", "Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "rhf_marketdata", "Lcom/robinhood/rosetta/mainst/RhfMarketdata;", "platform", "Lrosetta/order/Platform;", "upstream_event_tags", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lrosetta/mainst/OrderType;Lcom/robinhood/rosetta/mainst/ClientMarketdata;Lcom/robinhood/rosetta/mainst/RhfMarketdata;Lrosetta/order/Platform;Ljava/util/Map;Lokio/ByteString;)V", "getPrevious_type", "()Lrosetta/mainst/OrderType;", "getClient_marketdata", "()Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "getRhf_marketdata", "()Lcom/robinhood/rosetta/mainst/RhfMarketdata;", "getPlatform", "()Lrosetta/order/Platform;", "getFlags", "()Ljava/util/List;", "getUpstream_event_tags", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderMetadata extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ClientMarketdata#ADAPTER", jsonName = "clientMarketdata", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ClientMarketdata client_marketdata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> flags;

    @WireField(adapter = "rosetta.order.Platform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Platform platform;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", jsonName = "previousType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderType previous_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.RhfMarketdata#ADAPTER", jsonName = "rhfMarketdata", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final RhfMarketdata rhf_marketdata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "upstreamEventTags", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final Map<String, String> upstream_event_tags;

    @JvmField
    public static final ProtoAdapter<OrderMetadata> ADAPTER = new OrderMetadata2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(OrderMetadata.class), Syntax.PROTO_3);

    public OrderMetadata() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24688newBuilder();
    }

    public /* synthetic */ OrderMetadata(List list, OrderType orderType, ClientMarketdata clientMarketdata, RhfMarketdata rhfMarketdata, Platform platform, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 4) != 0 ? null : clientMarketdata, (i & 8) != 0 ? null : rhfMarketdata, (i & 16) != 0 ? Platform.ORDER_PLATFORM_UNSPECIFIED : platform, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OrderType getPrevious_type() {
        return this.previous_type;
    }

    public final ClientMarketdata getClient_marketdata() {
        return this.client_marketdata;
    }

    public final RhfMarketdata getRhf_marketdata() {
        return this.rhf_marketdata;
    }

    public final Platform getPlatform() {
        return this.platform;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMetadata(List<String> flags, OrderType previous_type, ClientMarketdata clientMarketdata, RhfMarketdata rhfMarketdata, Platform platform, Map<String, String> upstream_event_tags, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(previous_type, "previous_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(upstream_event_tags, "upstream_event_tags");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.previous_type = previous_type;
        this.client_marketdata = clientMarketdata;
        this.rhf_marketdata = rhfMarketdata;
        this.platform = platform;
        this.flags = Internal.immutableCopyOf("flags", flags);
        this.upstream_event_tags = Internal.immutableCopyOf("upstream_event_tags", upstream_event_tags);
    }

    public final List<String> getFlags() {
        return this.flags;
    }

    public final Map<String, String> getUpstream_event_tags() {
        return this.upstream_event_tags;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24688newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderMetadata)) {
            return false;
        }
        OrderMetadata orderMetadata = (OrderMetadata) other;
        return Intrinsics.areEqual(unknownFields(), orderMetadata.unknownFields()) && Intrinsics.areEqual(this.flags, orderMetadata.flags) && this.previous_type == orderMetadata.previous_type && Intrinsics.areEqual(this.client_marketdata, orderMetadata.client_marketdata) && Intrinsics.areEqual(this.rhf_marketdata, orderMetadata.rhf_marketdata) && this.platform == orderMetadata.platform && Intrinsics.areEqual(this.upstream_event_tags, orderMetadata.upstream_event_tags);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.flags.hashCode()) * 37) + this.previous_type.hashCode()) * 37;
        ClientMarketdata clientMarketdata = this.client_marketdata;
        int iHashCode2 = (iHashCode + (clientMarketdata != null ? clientMarketdata.hashCode() : 0)) * 37;
        RhfMarketdata rhfMarketdata = this.rhf_marketdata;
        int iHashCode3 = ((((iHashCode2 + (rhfMarketdata != null ? rhfMarketdata.hashCode() : 0)) * 37) + this.platform.hashCode()) * 37) + this.upstream_event_tags.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.flags.isEmpty()) {
            arrayList.add("flags=" + Internal.sanitize(this.flags));
        }
        arrayList.add("previous_type=" + this.previous_type);
        ClientMarketdata clientMarketdata = this.client_marketdata;
        if (clientMarketdata != null) {
            arrayList.add("client_marketdata=" + clientMarketdata);
        }
        RhfMarketdata rhfMarketdata = this.rhf_marketdata;
        if (rhfMarketdata != null) {
            arrayList.add("rhf_marketdata=" + rhfMarketdata);
        }
        arrayList.add("platform=" + this.platform);
        if (!this.upstream_event_tags.isEmpty()) {
            arrayList.add("upstream_event_tags=" + this.upstream_event_tags);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderMetadata copy$default(OrderMetadata orderMetadata, List list, OrderType orderType, ClientMarketdata clientMarketdata, RhfMarketdata rhfMarketdata, Platform platform, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = orderMetadata.flags;
        }
        if ((i & 2) != 0) {
            orderType = orderMetadata.previous_type;
        }
        if ((i & 4) != 0) {
            clientMarketdata = orderMetadata.client_marketdata;
        }
        if ((i & 8) != 0) {
            rhfMarketdata = orderMetadata.rhf_marketdata;
        }
        if ((i & 16) != 0) {
            platform = orderMetadata.platform;
        }
        if ((i & 32) != 0) {
            map = orderMetadata.upstream_event_tags;
        }
        if ((i & 64) != 0) {
            byteString = orderMetadata.unknownFields();
        }
        Map map2 = map;
        ByteString byteString2 = byteString;
        Platform platform2 = platform;
        ClientMarketdata clientMarketdata2 = clientMarketdata;
        return orderMetadata.copy(list, orderType, clientMarketdata2, rhfMarketdata, platform2, map2, byteString2);
    }

    public final OrderMetadata copy(List<String> flags, OrderType previous_type, ClientMarketdata client_marketdata, RhfMarketdata rhf_marketdata, Platform platform, Map<String, String> upstream_event_tags, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(previous_type, "previous_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(upstream_event_tags, "upstream_event_tags");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderMetadata(flags, previous_type, client_marketdata, rhf_marketdata, platform, upstream_event_tags, unknownFields);
    }
}
