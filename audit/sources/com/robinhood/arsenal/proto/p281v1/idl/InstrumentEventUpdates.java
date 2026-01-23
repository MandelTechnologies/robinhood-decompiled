package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: InstrumentEventUpdates.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/InstrumentEventUpdates;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "event_updates", "", "Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdate;", "next_page_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getNext_page_token", "getEvent_updates", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InstrumentEventUpdates extends Message {

    @JvmField
    public static final ProtoAdapter<InstrumentEventUpdates> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EquityEventUpdate#ADAPTER", jsonName = "eventUpdates", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<EquityEventUpdate> event_updates;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextPageToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String next_page_token;

    public InstrumentEventUpdates() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ InstrumentEventUpdates(String str, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20167newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getNext_page_token() {
        return this.next_page_token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentEventUpdates(String instrument_id, List<EquityEventUpdate> event_updates, String next_page_token, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(event_updates, "event_updates");
        Intrinsics.checkNotNullParameter(next_page_token, "next_page_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.next_page_token = next_page_token;
        this.event_updates = Internal.immutableCopyOf("event_updates", event_updates);
    }

    public final List<EquityEventUpdate> getEvent_updates() {
        return this.event_updates;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20167newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstrumentEventUpdates)) {
            return false;
        }
        InstrumentEventUpdates instrumentEventUpdates = (InstrumentEventUpdates) other;
        return Intrinsics.areEqual(unknownFields(), instrumentEventUpdates.unknownFields()) && Intrinsics.areEqual(this.instrument_id, instrumentEventUpdates.instrument_id) && Intrinsics.areEqual(this.event_updates, instrumentEventUpdates.event_updates) && Intrinsics.areEqual(this.next_page_token, instrumentEventUpdates.next_page_token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.event_updates.hashCode()) * 37) + this.next_page_token.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        if (!this.event_updates.isEmpty()) {
            arrayList.add("event_updates=" + this.event_updates);
        }
        arrayList.add("next_page_token=" + Internal.sanitize(this.next_page_token));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentEventUpdates{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstrumentEventUpdates copy$default(InstrumentEventUpdates instrumentEventUpdates, String str, List list, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instrumentEventUpdates.instrument_id;
        }
        if ((i & 2) != 0) {
            list = instrumentEventUpdates.event_updates;
        }
        if ((i & 4) != 0) {
            str2 = instrumentEventUpdates.next_page_token;
        }
        if ((i & 8) != 0) {
            byteString = instrumentEventUpdates.unknownFields();
        }
        return instrumentEventUpdates.copy(str, list, str2, byteString);
    }

    public final InstrumentEventUpdates copy(String instrument_id, List<EquityEventUpdate> event_updates, String next_page_token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(event_updates, "event_updates");
        Intrinsics.checkNotNullParameter(next_page_token, "next_page_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InstrumentEventUpdates(instrument_id, event_updates, next_page_token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentEventUpdates.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InstrumentEventUpdates>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.InstrumentEventUpdates$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentEventUpdates value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                int iEncodedSizeWithTag = size + EquityEventUpdate.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getEvent_updates());
                return !Intrinsics.areEqual(value.getNext_page_token(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNext_page_token()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentEventUpdates value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                EquityEventUpdate.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getEvent_updates());
                if (!Intrinsics.areEqual(value.getNext_page_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext_page_token());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentEventUpdates value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNext_page_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext_page_token());
                }
                EquityEventUpdate.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getEvent_updates());
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentEventUpdates decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InstrumentEventUpdates(strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(EquityEventUpdate.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentEventUpdates redact(InstrumentEventUpdates value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InstrumentEventUpdates.copy$default(value, null, Internal.m26823redactElements(value.getEvent_updates(), EquityEventUpdate.ADAPTER), null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
