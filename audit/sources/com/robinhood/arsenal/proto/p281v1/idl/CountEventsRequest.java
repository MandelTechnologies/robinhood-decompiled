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

/* compiled from: CountEventsRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J7\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001cR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequest;", "Lcom/squareup/wire/Message;", "", "discoverable", "", "state", "Lcom/robinhood/arsenal/proto/v1/idl/EventState;", "exclude_sports", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/arsenal/proto/v1/idl/EventState;ZLokio/ByteString;)V", "getDiscoverable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventState;", "getExclude_sports", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/arsenal/proto/v1/idl/EventState;ZLokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequest;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class CountEventsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CountEventsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    private final Boolean discoverable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "excludeSports", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean exclude_sports;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventState#ADAPTER", schemaIndex = 1, tag = 2)
    private final EventState state;

    public CountEventsRequest() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20119newBuilder();
    }

    public final Boolean getDiscoverable() {
        return this.discoverable;
    }

    public final EventState getState() {
        return this.state;
    }

    public final boolean getExclude_sports() {
        return this.exclude_sports;
    }

    public /* synthetic */ CountEventsRequest(Boolean bool, EventState eventState, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : eventState, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountEventsRequest(Boolean bool, EventState eventState, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.discoverable = bool;
        this.state = eventState;
        this.exclude_sports = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20119newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CountEventsRequest)) {
            return false;
        }
        CountEventsRequest countEventsRequest = (CountEventsRequest) other;
        return Intrinsics.areEqual(unknownFields(), countEventsRequest.unknownFields()) && Intrinsics.areEqual(this.discoverable, countEventsRequest.discoverable) && this.state == countEventsRequest.state && this.exclude_sports == countEventsRequest.exclude_sports;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.discoverable;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        EventState eventState = this.state;
        int iHashCode3 = ((iHashCode2 + (eventState != null ? eventState.hashCode() : 0)) * 37) + Boolean.hashCode(this.exclude_sports);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.discoverable;
        if (bool != null) {
            arrayList.add("discoverable=" + bool);
        }
        EventState eventState = this.state;
        if (eventState != null) {
            arrayList.add("state=" + eventState);
        }
        arrayList.add("exclude_sports=" + this.exclude_sports);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CountEventsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CountEventsRequest copy$default(CountEventsRequest countEventsRequest, Boolean bool, EventState eventState, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = countEventsRequest.discoverable;
        }
        if ((i & 2) != 0) {
            eventState = countEventsRequest.state;
        }
        if ((i & 4) != 0) {
            z = countEventsRequest.exclude_sports;
        }
        if ((i & 8) != 0) {
            byteString = countEventsRequest.unknownFields();
        }
        return countEventsRequest.copy(bool, eventState, z, byteString);
    }

    public final CountEventsRequest copy(Boolean discoverable, EventState state, boolean exclude_sports, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CountEventsRequest(discoverable, state, exclude_sports, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CountEventsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CountEventsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.CountEventsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CountEventsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getDiscoverable()) + EventState.ADAPTER.encodedSizeWithTag(2, value.getState());
                return value.getExclude_sports() ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, Boolean.valueOf(value.getExclude_sports())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CountEventsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDiscoverable());
                EventState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                if (value.getExclude_sports()) {
                    protoAdapter.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getExclude_sports()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CountEventsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getExclude_sports()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getExclude_sports()));
                }
                EventState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) value.getDiscoverable());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CountEventsRequest redact(CountEventsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CountEventsRequest.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CountEventsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Boolean boolDecode = null;
                boolean zBooleanValue = false;
                EventState eventStateDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CountEventsRequest(boolDecode, eventStateDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            eventStateDecode = EventState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
