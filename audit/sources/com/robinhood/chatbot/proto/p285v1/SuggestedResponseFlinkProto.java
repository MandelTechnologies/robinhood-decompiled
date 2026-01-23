package com.robinhood.chatbot.proto.p285v1;

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

/* compiled from: SuggestedResponseFlinkProto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SuggestedResponseFlinkProto;", "Lcom/squareup/wire/Message;", "", "id", "", "message_id", "response", "display_order", "selected", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getMessage_id", "getResponse", "getDisplay_order", "getSelected", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SuggestedResponseFlinkProto extends Message {

    @JvmField
    public static final ProtoAdapter<SuggestedResponseFlinkProto> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String display_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String response;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean selected;

    public SuggestedResponseFlinkProto() {
        this(null, null, null, null, false, null, 63, null);
    }

    public /* synthetic */ SuggestedResponseFlinkProto(String str, String str2, String str3, String str4, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20553newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getResponse() {
        return this.response;
    }

    public final String getDisplay_order() {
        return this.display_order;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedResponseFlinkProto(String id, String message_id, String response, String display_order, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(message_id, "message_id");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(display_order, "display_order");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.message_id = message_id;
        this.response = response;
        this.display_order = display_order;
        this.selected = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20553newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SuggestedResponseFlinkProto)) {
            return false;
        }
        SuggestedResponseFlinkProto suggestedResponseFlinkProto = (SuggestedResponseFlinkProto) other;
        return Intrinsics.areEqual(unknownFields(), suggestedResponseFlinkProto.unknownFields()) && Intrinsics.areEqual(this.id, suggestedResponseFlinkProto.id) && Intrinsics.areEqual(this.message_id, suggestedResponseFlinkProto.message_id) && Intrinsics.areEqual(this.response, suggestedResponseFlinkProto.response) && Intrinsics.areEqual(this.display_order, suggestedResponseFlinkProto.display_order) && this.selected == suggestedResponseFlinkProto.selected;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.message_id.hashCode()) * 37) + this.response.hashCode()) * 37) + this.display_order.hashCode()) * 37) + Boolean.hashCode(this.selected);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("message_id=" + Internal.sanitize(this.message_id));
        arrayList.add("response=" + Internal.sanitize(this.response));
        arrayList.add("display_order=" + Internal.sanitize(this.display_order));
        arrayList.add("selected=" + this.selected);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SuggestedResponseFlinkProto{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SuggestedResponseFlinkProto copy$default(SuggestedResponseFlinkProto suggestedResponseFlinkProto, String str, String str2, String str3, String str4, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedResponseFlinkProto.id;
        }
        if ((i & 2) != 0) {
            str2 = suggestedResponseFlinkProto.message_id;
        }
        if ((i & 4) != 0) {
            str3 = suggestedResponseFlinkProto.response;
        }
        if ((i & 8) != 0) {
            str4 = suggestedResponseFlinkProto.display_order;
        }
        if ((i & 16) != 0) {
            z = suggestedResponseFlinkProto.selected;
        }
        if ((i & 32) != 0) {
            byteString = suggestedResponseFlinkProto.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        return suggestedResponseFlinkProto.copy(str, str2, str3, str4, z2, byteString2);
    }

    public final SuggestedResponseFlinkProto copy(String id, String message_id, String response, String display_order, boolean selected, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(message_id, "message_id");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(display_order, "display_order");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SuggestedResponseFlinkProto(id, message_id, response, display_order, selected, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SuggestedResponseFlinkProto.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SuggestedResponseFlinkProto>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.SuggestedResponseFlinkProto$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SuggestedResponseFlinkProto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getMessage_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage_id());
                }
                if (!Intrinsics.areEqual(value.getResponse(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getResponse());
                }
                if (!Intrinsics.areEqual(value.getDisplay_order(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisplay_order());
                }
                return value.getSelected() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getSelected())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SuggestedResponseFlinkProto value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getMessage_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage_id());
                }
                if (!Intrinsics.areEqual(value.getResponse(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getResponse());
                }
                if (!Intrinsics.areEqual(value.getDisplay_order(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisplay_order());
                }
                if (value.getSelected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getSelected()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SuggestedResponseFlinkProto value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSelected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getSelected()));
                }
                if (!Intrinsics.areEqual(value.getDisplay_order(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisplay_order());
                }
                if (!Intrinsics.areEqual(value.getResponse(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getResponse());
                }
                if (!Intrinsics.areEqual(value.getMessage_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SuggestedResponseFlinkProto redact(SuggestedResponseFlinkProto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SuggestedResponseFlinkProto.copy$default(value, null, null, null, null, false, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SuggestedResponseFlinkProto decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                boolean zBooleanValue = false;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SuggestedResponseFlinkProto(strDecode, strDecode4, strDecode2, strDecode3, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
