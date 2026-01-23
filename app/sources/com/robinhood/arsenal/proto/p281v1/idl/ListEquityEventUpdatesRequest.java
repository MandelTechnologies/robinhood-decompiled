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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ListEquityEventUpdatesRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEquityEventUpdatesRequest;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "page_size", "", "page_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getPage_size", "()I", "getPage_token", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ListEquityEventUpdatesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ListEquityEventUpdatesRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int page_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pageToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String page_token;

    public ListEquityEventUpdatesRequest() {
        this(null, 0, null, null, 15, null);
    }

    public /* synthetic */ ListEquityEventUpdatesRequest(String str, int i, String str2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20172newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    public final String getPage_token() {
        return this.page_token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListEquityEventUpdatesRequest(String instrument_id, int i, String page_token, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(page_token, "page_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.page_size = i;
        this.page_token = page_token;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20172newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListEquityEventUpdatesRequest)) {
            return false;
        }
        ListEquityEventUpdatesRequest listEquityEventUpdatesRequest = (ListEquityEventUpdatesRequest) other;
        return Intrinsics.areEqual(unknownFields(), listEquityEventUpdatesRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, listEquityEventUpdatesRequest.instrument_id) && this.page_size == listEquityEventUpdatesRequest.page_size && Intrinsics.areEqual(this.page_token, listEquityEventUpdatesRequest.page_token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + Integer.hashCode(this.page_size)) * 37) + this.page_token.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("page_size=" + this.page_size);
        arrayList.add("page_token=" + Internal.sanitize(this.page_token));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListEquityEventUpdatesRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListEquityEventUpdatesRequest copy$default(ListEquityEventUpdatesRequest listEquityEventUpdatesRequest, String str, int i, String str2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listEquityEventUpdatesRequest.instrument_id;
        }
        if ((i2 & 2) != 0) {
            i = listEquityEventUpdatesRequest.page_size;
        }
        if ((i2 & 4) != 0) {
            str2 = listEquityEventUpdatesRequest.page_token;
        }
        if ((i2 & 8) != 0) {
            byteString = listEquityEventUpdatesRequest.unknownFields();
        }
        return listEquityEventUpdatesRequest.copy(str, i, str2, byteString);
    }

    public final ListEquityEventUpdatesRequest copy(String instrument_id, int page_size, String page_token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(page_token, "page_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListEquityEventUpdatesRequest(instrument_id, page_size, page_token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListEquityEventUpdatesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListEquityEventUpdatesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.ListEquityEventUpdatesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListEquityEventUpdatesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (value.getPage_size() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getPage_size()));
                }
                return !Intrinsics.areEqual(value.getPage_token(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPage_token()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListEquityEventUpdatesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPage_size()));
                }
                if (!Intrinsics.areEqual(value.getPage_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPage_token());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListEquityEventUpdatesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPage_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPage_token());
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPage_size()));
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListEquityEventUpdatesRequest redact(ListEquityEventUpdatesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListEquityEventUpdatesRequest.copy$default(value, null, 0, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListEquityEventUpdatesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListEquityEventUpdatesRequest(strDecode, iIntValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
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
