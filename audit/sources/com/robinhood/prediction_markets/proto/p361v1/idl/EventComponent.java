package com.robinhood.prediction_markets.proto.p361v1.idl;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: EventComponent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventComponent;", "Lcom/squareup/wire/Message;", "", "event_id", "", "contract_info", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getEvent_id", "()Ljava/lang/String;", "getContract_info", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventComponent extends Message {

    @JvmField
    public static final ProtoAdapter<EventComponent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ContractInfo#ADAPTER", jsonName = "contractInfo", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<ContractInfo> contract_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String event_id;

    public EventComponent() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23781newBuilder();
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public /* synthetic */ EventComponent(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventComponent(String event_id, List<ContractInfo> contract_info, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(contract_info, "contract_info");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_id = event_id;
        this.contract_info = Internal.immutableCopyOf("contract_info", contract_info);
    }

    public final List<ContractInfo> getContract_info() {
        return this.contract_info;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23781newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventComponent)) {
            return false;
        }
        EventComponent eventComponent = (EventComponent) other;
        return Intrinsics.areEqual(unknownFields(), eventComponent.unknownFields()) && Intrinsics.areEqual(this.event_id, eventComponent.event_id) && Intrinsics.areEqual(this.contract_info, eventComponent.contract_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.event_id.hashCode()) * 37) + this.contract_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_id=" + Internal.sanitize(this.event_id));
        if (!this.contract_info.isEmpty()) {
            arrayList.add("contract_info=" + this.contract_info);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventComponent{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventComponent copy$default(EventComponent eventComponent, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventComponent.event_id;
        }
        if ((i & 2) != 0) {
            list = eventComponent.contract_info;
        }
        if ((i & 4) != 0) {
            byteString = eventComponent.unknownFields();
        }
        return eventComponent.copy(str, list, byteString);
    }

    public final EventComponent copy(String event_id, List<ContractInfo> contract_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(contract_info, "contract_info");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventComponent(event_id, contract_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_id());
                }
                return size + ContractInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getContract_info());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_id());
                }
                ContractInfo.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_info());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ContractInfo.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_info());
                if (Intrinsics.areEqual(value.getEvent_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventComponent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EventComponent(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ContractInfo.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventComponent redact(EventComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EventComponent.copy$default(value, null, Internal.m26823redactElements(value.getContract_info(), ContractInfo.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
