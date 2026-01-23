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

/* compiled from: ListRelevantEventTopicsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J*\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListRelevantEventTopicsResponse;", "Lcom/squareup/wire/Message;", "", "results", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopic;", "group_title", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getGroup_title", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ListRelevantEventTopicsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ListRelevantEventTopicsResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "groupTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String group_title;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventTopic#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<EventTopic> results;

    public ListRelevantEventTopicsResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20192newBuilder();
    }

    public /* synthetic */ ListRelevantEventTopicsResponse(List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getGroup_title() {
        return this.group_title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListRelevantEventTopicsResponse(List<EventTopic> results, String group_title, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(group_title, "group_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.group_title = group_title;
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final List<EventTopic> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20192newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListRelevantEventTopicsResponse)) {
            return false;
        }
        ListRelevantEventTopicsResponse listRelevantEventTopicsResponse = (ListRelevantEventTopicsResponse) other;
        return Intrinsics.areEqual(unknownFields(), listRelevantEventTopicsResponse.unknownFields()) && Intrinsics.areEqual(this.results, listRelevantEventTopicsResponse.results) && Intrinsics.areEqual(this.group_title, listRelevantEventTopicsResponse.group_title);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.results.hashCode()) * 37) + this.group_title.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        arrayList.add("group_title=" + Internal.sanitize(this.group_title));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListRelevantEventTopicsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListRelevantEventTopicsResponse copy$default(ListRelevantEventTopicsResponse listRelevantEventTopicsResponse, List list, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listRelevantEventTopicsResponse.results;
        }
        if ((i & 2) != 0) {
            str = listRelevantEventTopicsResponse.group_title;
        }
        if ((i & 4) != 0) {
            byteString = listRelevantEventTopicsResponse.unknownFields();
        }
        return listRelevantEventTopicsResponse.copy(list, str, byteString);
    }

    public final ListRelevantEventTopicsResponse copy(List<EventTopic> results, String group_title, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(group_title, "group_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListRelevantEventTopicsResponse(results, group_title, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListRelevantEventTopicsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListRelevantEventTopicsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.ListRelevantEventTopicsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListRelevantEventTopicsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + EventTopic.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getResults());
                return !Intrinsics.areEqual(value.getGroup_title(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getGroup_title()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListRelevantEventTopicsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                EventTopic.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
                if (!Intrinsics.areEqual(value.getGroup_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getGroup_title());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListRelevantEventTopicsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getGroup_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getGroup_title());
                }
                EventTopic.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListRelevantEventTopicsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListRelevantEventTopicsResponse(arrayList, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(EventTopic.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListRelevantEventTopicsResponse redact(ListRelevantEventTopicsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListRelevantEventTopicsResponse.copy$default(value, Internal.m26823redactElements(value.getResults(), EventTopic.ADAPTER), null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
