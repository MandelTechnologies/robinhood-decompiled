package com.robinhood.arsenal.proto.p281v1.idl;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CountEventContractsRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001dR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequest;", "Lcom/squareup/wire/Message;", "", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;", "state", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;", "discoverable", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;Ljava/lang/Boolean;Lokio/ByteString;)V", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;", "getDiscoverable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/CountEventContractsRequest;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CountEventContractsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CountEventContractsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    private final Boolean discoverable;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventContractState#ADAPTER", schemaIndex = 1, tag = 2)
    private final EventContractState state;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventContractTradability#ADAPTER", schemaIndex = 0, tag = 1)
    private final EventContractTradability tradability;

    public CountEventContractsRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20116newBuilder();
    }

    public final EventContractTradability getTradability() {
        return this.tradability;
    }

    public final EventContractState getState() {
        return this.state;
    }

    public final Boolean getDiscoverable() {
        return this.discoverable;
    }

    public /* synthetic */ CountEventContractsRequest(EventContractTradability eventContractTradability, EventContractState eventContractState, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eventContractTradability, (i & 2) != 0 ? null : eventContractState, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountEventContractsRequest(EventContractTradability eventContractTradability, EventContractState eventContractState, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tradability = eventContractTradability;
        this.state = eventContractState;
        this.discoverable = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20116newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CountEventContractsRequest)) {
            return false;
        }
        CountEventContractsRequest countEventContractsRequest = (CountEventContractsRequest) other;
        return Intrinsics.areEqual(unknownFields(), countEventContractsRequest.unknownFields()) && this.tradability == countEventContractsRequest.tradability && this.state == countEventContractsRequest.state && Intrinsics.areEqual(this.discoverable, countEventContractsRequest.discoverable);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EventContractTradability eventContractTradability = this.tradability;
        int iHashCode2 = (iHashCode + (eventContractTradability != null ? eventContractTradability.hashCode() : 0)) * 37;
        EventContractState eventContractState = this.state;
        int iHashCode3 = (iHashCode2 + (eventContractState != null ? eventContractState.hashCode() : 0)) * 37;
        Boolean bool = this.discoverable;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EventContractTradability eventContractTradability = this.tradability;
        if (eventContractTradability != null) {
            arrayList.add("tradability=" + eventContractTradability);
        }
        EventContractState eventContractState = this.state;
        if (eventContractState != null) {
            arrayList.add("state=" + eventContractState);
        }
        Boolean bool = this.discoverable;
        if (bool != null) {
            arrayList.add("discoverable=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CountEventContractsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CountEventContractsRequest copy$default(CountEventContractsRequest countEventContractsRequest, EventContractTradability eventContractTradability, EventContractState eventContractState, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            eventContractTradability = countEventContractsRequest.tradability;
        }
        if ((i & 2) != 0) {
            eventContractState = countEventContractsRequest.state;
        }
        if ((i & 4) != 0) {
            bool = countEventContractsRequest.discoverable;
        }
        if ((i & 8) != 0) {
            byteString = countEventContractsRequest.unknownFields();
        }
        return countEventContractsRequest.copy(eventContractTradability, eventContractState, bool, byteString);
    }

    public final CountEventContractsRequest copy(EventContractTradability tradability, EventContractState state, Boolean discoverable, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CountEventContractsRequest(tradability, state, discoverable, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CountEventContractsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CountEventContractsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.CountEventContractsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CountEventContractsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + EventContractTradability.ADAPTER.encodedSizeWithTag(1, value.getTradability()) + EventContractState.ADAPTER.encodedSizeWithTag(2, value.getState()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getDiscoverable());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CountEventContractsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                EventContractTradability.ADAPTER.encodeWithTag(writer, 1, (int) value.getTradability());
                EventContractState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getDiscoverable());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CountEventContractsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getDiscoverable());
                EventContractState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                EventContractTradability.ADAPTER.encodeWithTag(writer, 1, (int) value.getTradability());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CountEventContractsRequest redact(CountEventContractsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CountEventContractsRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CountEventContractsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                EventContractTradability eventContractTradabilityDecode = null;
                EventContractState eventContractStateDecode = null;
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CountEventContractsRequest(eventContractTradabilityDecode, eventContractStateDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            eventContractTradabilityDecode = EventContractTradability.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            eventContractStateDecode = EventContractState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
