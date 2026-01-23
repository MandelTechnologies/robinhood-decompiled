package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: GetEventContractResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventContractResponse;", "Lcom/squareup/wire/Message;", "", "event_contract", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;Lokio/ByteString;)V", "getEvent_contract", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetEventContractResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetEventContractResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventContract#ADAPTER", jsonName = "eventContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EventContract event_contract;

    /* JADX WARN: Multi-variable type inference failed */
    public GetEventContractResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23801newBuilder();
    }

    public final EventContract getEvent_contract() {
        return this.event_contract;
    }

    public /* synthetic */ GetEventContractResponse(EventContract eventContract, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eventContract, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEventContractResponse(EventContract eventContract, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_contract = eventContract;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23801newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetEventContractResponse)) {
            return false;
        }
        GetEventContractResponse getEventContractResponse = (GetEventContractResponse) other;
        return Intrinsics.areEqual(unknownFields(), getEventContractResponse.unknownFields()) && Intrinsics.areEqual(this.event_contract, getEventContractResponse.event_contract);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EventContract eventContract = this.event_contract;
        int iHashCode2 = iHashCode + (eventContract != null ? eventContract.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EventContract eventContract = this.event_contract;
        if (eventContract != null) {
            arrayList.add("event_contract=" + eventContract);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEventContractResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetEventContractResponse copy$default(GetEventContractResponse getEventContractResponse, EventContract eventContract, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            eventContract = getEventContractResponse.event_contract;
        }
        if ((i & 2) != 0) {
            byteString = getEventContractResponse.unknownFields();
        }
        return getEventContractResponse.copy(eventContract, byteString);
    }

    public final GetEventContractResponse copy(EventContract event_contract, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetEventContractResponse(event_contract, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetEventContractResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetEventContractResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetEventContractResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetEventContractResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getEvent_contract() != null ? size + EventContract.ADAPTER.encodedSizeWithTag(1, value.getEvent_contract()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetEventContractResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEvent_contract() != null) {
                    EventContract.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_contract());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetEventContractResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEvent_contract() != null) {
                    EventContract.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_contract());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetEventContractResponse redact(GetEventContractResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EventContract event_contract = value.getEvent_contract();
                return value.copy(event_contract != null ? EventContract.ADAPTER.redact(event_contract) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetEventContractResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                EventContract eventContractDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetEventContractResponse(eventContractDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        eventContractDecode = EventContract.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
