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

/* compiled from: GetSearchLayoutResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J0\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetSearchLayoutResponse;", "Lcom/squareup/wire/Message;", "", "carousel_event_ids", "", "", "layout_node_ids", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getCarousel_event_ids", "()Ljava/util/List;", "getLayout_node_ids", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetSearchLayoutResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetSearchLayoutResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "carouselEventIds", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> carousel_event_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "layoutNodeIds", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> layout_node_ids;

    public GetSearchLayoutResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23819newBuilder();
    }

    public /* synthetic */ GetSearchLayoutResponse(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchLayoutResponse(List<String> carousel_event_ids, List<String> layout_node_ids, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(carousel_event_ids, "carousel_event_ids");
        Intrinsics.checkNotNullParameter(layout_node_ids, "layout_node_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.carousel_event_ids = Internal.immutableCopyOf("carousel_event_ids", carousel_event_ids);
        this.layout_node_ids = Internal.immutableCopyOf("layout_node_ids", layout_node_ids);
    }

    public final List<String> getCarousel_event_ids() {
        return this.carousel_event_ids;
    }

    public final List<String> getLayout_node_ids() {
        return this.layout_node_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23819newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSearchLayoutResponse)) {
            return false;
        }
        GetSearchLayoutResponse getSearchLayoutResponse = (GetSearchLayoutResponse) other;
        return Intrinsics.areEqual(unknownFields(), getSearchLayoutResponse.unknownFields()) && Intrinsics.areEqual(this.carousel_event_ids, getSearchLayoutResponse.carousel_event_ids) && Intrinsics.areEqual(this.layout_node_ids, getSearchLayoutResponse.layout_node_ids);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.carousel_event_ids.hashCode()) * 37) + this.layout_node_ids.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.carousel_event_ids.isEmpty()) {
            arrayList.add("carousel_event_ids=" + Internal.sanitize(this.carousel_event_ids));
        }
        if (!this.layout_node_ids.isEmpty()) {
            arrayList.add("layout_node_ids=" + Internal.sanitize(this.layout_node_ids));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSearchLayoutResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSearchLayoutResponse copy$default(GetSearchLayoutResponse getSearchLayoutResponse, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getSearchLayoutResponse.carousel_event_ids;
        }
        if ((i & 2) != 0) {
            list2 = getSearchLayoutResponse.layout_node_ids;
        }
        if ((i & 4) != 0) {
            byteString = getSearchLayoutResponse.unknownFields();
        }
        return getSearchLayoutResponse.copy(list, list2, byteString);
    }

    public final GetSearchLayoutResponse copy(List<String> carousel_event_ids, List<String> layout_node_ids, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(carousel_event_ids, "carousel_event_ids");
        Intrinsics.checkNotNullParameter(layout_node_ids, "layout_node_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSearchLayoutResponse(carousel_event_ids, layout_node_ids, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetSearchLayoutResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetSearchLayoutResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetSearchLayoutResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetSearchLayoutResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getCarousel_event_ids()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getLayout_node_ids());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetSearchLayoutResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getCarousel_event_ids());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getLayout_node_ids());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetSearchLayoutResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getLayout_node_ids());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getCarousel_event_ids());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetSearchLayoutResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetSearchLayoutResponse(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSearchLayoutResponse redact(GetSearchLayoutResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetSearchLayoutResponse.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
