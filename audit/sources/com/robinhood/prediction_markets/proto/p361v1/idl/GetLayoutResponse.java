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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetLayoutResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J0\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponse;", "Lcom/squareup/wire/Message;", "", "results", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutResults;", "next", "", "previous", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutResults;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getResults", "()Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutResults;", "getNext", "()Ljava/lang/String;", "getPrevious", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GetLayoutResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetLayoutResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String previous;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.LayoutResults#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final LayoutResults results;

    public GetLayoutResponse() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetLayoutResponse(LayoutResults layoutResults, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : layoutResults, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23811newBuilder();
    }

    public final LayoutResults getResults() {
        return this.results;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLayoutResponse(LayoutResults layoutResults, String next, String previous, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.results = layoutResults;
        this.next = next;
        this.previous = previous;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23811newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLayoutResponse)) {
            return false;
        }
        GetLayoutResponse getLayoutResponse = (GetLayoutResponse) other;
        return Intrinsics.areEqual(unknownFields(), getLayoutResponse.unknownFields()) && Intrinsics.areEqual(this.results, getLayoutResponse.results) && Intrinsics.areEqual(this.next, getLayoutResponse.next) && Intrinsics.areEqual(this.previous, getLayoutResponse.previous);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        LayoutResults layoutResults = this.results;
        int iHashCode2 = ((((iHashCode + (layoutResults != null ? layoutResults.hashCode() : 0)) * 37) + this.next.hashCode()) * 37) + this.previous.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        LayoutResults layoutResults = this.results;
        if (layoutResults != null) {
            arrayList.add("results=" + layoutResults);
        }
        arrayList.add("next=" + Internal.sanitize(this.next));
        arrayList.add("previous=" + Internal.sanitize(this.previous));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLayoutResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLayoutResponse copy$default(GetLayoutResponse getLayoutResponse, LayoutResults layoutResults, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutResults = getLayoutResponse.results;
        }
        if ((i & 2) != 0) {
            str = getLayoutResponse.next;
        }
        if ((i & 4) != 0) {
            str2 = getLayoutResponse.previous;
        }
        if ((i & 8) != 0) {
            byteString = getLayoutResponse.unknownFields();
        }
        return getLayoutResponse.copy(layoutResults, str, str2, byteString);
    }

    public final GetLayoutResponse copy(LayoutResults results, String next, String previous, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLayoutResponse(results, next, previous, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLayoutResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLayoutResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetLayoutResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLayoutResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getResults() != null) {
                    size += LayoutResults.ADAPTER.encodedSizeWithTag(1, value.getResults());
                }
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNext());
                }
                return !Intrinsics.areEqual(value.getPrevious(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrevious()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLayoutResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getResults() != null) {
                    LayoutResults.ADAPTER.encodeWithTag(writer, 1, (int) value.getResults());
                }
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext());
                }
                if (!Intrinsics.areEqual(value.getPrevious(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrevious());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLayoutResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrevious(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrevious());
                }
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext());
                }
                if (value.getResults() != null) {
                    LayoutResults.ADAPTER.encodeWithTag(writer, 1, (int) value.getResults());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLayoutResponse redact(GetLayoutResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                LayoutResults results = value.getResults();
                return GetLayoutResponse.copy$default(value, results != null ? LayoutResults.ADAPTER.redact(results) : null, null, null, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLayoutResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                LayoutResults layoutResultsDecode = null;
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetLayoutResponse(layoutResultsDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        layoutResultsDecode = LayoutResults.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
