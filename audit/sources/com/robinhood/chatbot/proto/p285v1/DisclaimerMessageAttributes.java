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

/* compiled from: DisclaimerMessageAttributes.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/DisclaimerMessageAttributes;", "Lcom/squareup/wire/Message;", "", CarResultComposable2.BODY, "Lcom/robinhood/chatbot/proto/v1/RichText;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/RichText;Lokio/ByteString;)V", "getBody", "()Lcom/robinhood/chatbot/proto/v1/RichText;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DisclaimerMessageAttributes extends Message {

    @JvmField
    public static final ProtoAdapter<DisclaimerMessageAttributes> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.RichText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final RichText body;

    /* JADX WARN: Multi-variable type inference failed */
    public DisclaimerMessageAttributes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20486newBuilder();
    }

    public final RichText getBody() {
        return this.body;
    }

    public /* synthetic */ DisclaimerMessageAttributes(RichText richText, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : richText, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerMessageAttributes(RichText richText, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body = richText;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20486newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DisclaimerMessageAttributes)) {
            return false;
        }
        DisclaimerMessageAttributes disclaimerMessageAttributes = (DisclaimerMessageAttributes) other;
        return Intrinsics.areEqual(unknownFields(), disclaimerMessageAttributes.unknownFields()) && Intrinsics.areEqual(this.body, disclaimerMessageAttributes.body);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RichText richText = this.body;
        int iHashCode2 = iHashCode + (richText != null ? richText.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        RichText richText = this.body;
        if (richText != null) {
            arrayList.add("body=" + richText);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisclaimerMessageAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DisclaimerMessageAttributes copy$default(DisclaimerMessageAttributes disclaimerMessageAttributes, RichText richText, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            richText = disclaimerMessageAttributes.body;
        }
        if ((i & 2) != 0) {
            byteString = disclaimerMessageAttributes.unknownFields();
        }
        return disclaimerMessageAttributes.copy(richText, byteString);
    }

    public final DisclaimerMessageAttributes copy(RichText body, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DisclaimerMessageAttributes(body, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisclaimerMessageAttributes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DisclaimerMessageAttributes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.DisclaimerMessageAttributes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisclaimerMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getBody() != null ? size + RichText.ADAPTER.encodedSizeWithTag(1, value.getBody()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisclaimerMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBody() != null) {
                    RichText.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisclaimerMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBody() != null) {
                    RichText.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisclaimerMessageAttributes redact(DisclaimerMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RichText body = value.getBody();
                return value.copy(body != null ? RichText.ADAPTER.redact(body) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DisclaimerMessageAttributes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                RichText richTextDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DisclaimerMessageAttributes(richTextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        richTextDecode = RichText.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
