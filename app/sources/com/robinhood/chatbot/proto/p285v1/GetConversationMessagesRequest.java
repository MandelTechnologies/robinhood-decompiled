package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.models.card.p311db.Card;
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

/* compiled from: GetConversationMessagesRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequest;", "Lcom/squareup/wire/Message;", "", "id", "", "page_offset", "", "page_size", Card.Icon.ORDER, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getPage_offset", "()I", "getPage_size", "getOrder", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetConversationMessagesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetConversationMessagesRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageOffset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int page_offset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int page_size;

    public GetConversationMessagesRequest() {
        this(null, 0, 0, null, null, 31, null);
    }

    public /* synthetic */ GetConversationMessagesRequest(String str, int i, int i2, String str2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20503newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final int getPage_offset() {
        return this.page_offset;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    public final String getOrder() {
        return this.order;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetConversationMessagesRequest(String id, int i, int i2, String order, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.page_offset = i;
        this.page_size = i2;
        this.order = order;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20503newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetConversationMessagesRequest)) {
            return false;
        }
        GetConversationMessagesRequest getConversationMessagesRequest = (GetConversationMessagesRequest) other;
        return Intrinsics.areEqual(unknownFields(), getConversationMessagesRequest.unknownFields()) && Intrinsics.areEqual(this.id, getConversationMessagesRequest.id) && this.page_offset == getConversationMessagesRequest.page_offset && this.page_size == getConversationMessagesRequest.page_size && Intrinsics.areEqual(this.order, getConversationMessagesRequest.order);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + Integer.hashCode(this.page_offset)) * 37) + Integer.hashCode(this.page_size)) * 37) + this.order.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("page_offset=" + this.page_offset);
        arrayList.add("page_size=" + this.page_size);
        arrayList.add("order=" + Internal.sanitize(this.order));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetConversationMessagesRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetConversationMessagesRequest copy$default(GetConversationMessagesRequest getConversationMessagesRequest, String str, int i, int i2, String str2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getConversationMessagesRequest.id;
        }
        if ((i3 & 2) != 0) {
            i = getConversationMessagesRequest.page_offset;
        }
        if ((i3 & 4) != 0) {
            i2 = getConversationMessagesRequest.page_size;
        }
        if ((i3 & 8) != 0) {
            str2 = getConversationMessagesRequest.order;
        }
        if ((i3 & 16) != 0) {
            byteString = getConversationMessagesRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i4 = i2;
        return getConversationMessagesRequest.copy(str, i, i4, str2, byteString2);
    }

    public final GetConversationMessagesRequest copy(String id, int page_offset, int page_size, String order, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetConversationMessagesRequest(id, page_offset, page_size, order, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetConversationMessagesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetConversationMessagesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.GetConversationMessagesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetConversationMessagesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getPage_offset() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getPage_offset()));
                }
                if (value.getPage_size() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getPage_size()));
                }
                return !Intrinsics.areEqual(value.getOrder(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOrder()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetConversationMessagesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getPage_offset() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPage_offset()));
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPage_size()));
                }
                if (!Intrinsics.areEqual(value.getOrder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOrder());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetConversationMessagesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOrder(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOrder());
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getPage_size()));
                }
                if (value.getPage_offset() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPage_offset()));
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetConversationMessagesRequest redact(GetConversationMessagesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetConversationMessagesRequest.copy$default(value, null, 0, 0, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetConversationMessagesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetConversationMessagesRequest(strDecode, iIntValue, iIntValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
