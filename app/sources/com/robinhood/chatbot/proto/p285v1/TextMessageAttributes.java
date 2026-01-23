package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: TextMessageAttributes.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/TextMessageAttributes;", "Lcom/squareup/wire/Message;", "", CarResultComposable2.BODY, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getBody", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TextMessageAttributes extends Message {

    @JvmField
    public static final ProtoAdapter<TextMessageAttributes> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String body;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMessageAttributes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20554newBuilder();
    }

    public final String getBody() {
        return this.body;
    }

    public /* synthetic */ TextMessageAttributes(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextMessageAttributes(String body, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body = body;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20554newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TextMessageAttributes)) {
            return false;
        }
        TextMessageAttributes textMessageAttributes = (TextMessageAttributes) other;
        return Intrinsics.areEqual(unknownFields(), textMessageAttributes.unknownFields()) && Intrinsics.areEqual(this.body, textMessageAttributes.body);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.body.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("body=" + Internal.sanitize(this.body));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextMessageAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TextMessageAttributes copy$default(TextMessageAttributes textMessageAttributes, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textMessageAttributes.body;
        }
        if ((i & 2) != 0) {
            byteString = textMessageAttributes.unknownFields();
        }
        return textMessageAttributes.copy(str, byteString);
    }

    public final TextMessageAttributes copy(String body, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TextMessageAttributes(body, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TextMessageAttributes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TextMessageAttributes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.TextMessageAttributes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TextMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return !Intrinsics.areEqual(value.getBody(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBody()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TextMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TextMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (Intrinsics.areEqual(value.getBody(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextMessageAttributes redact(TextMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TextMessageAttributes.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TextMessageAttributes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TextMessageAttributes(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
