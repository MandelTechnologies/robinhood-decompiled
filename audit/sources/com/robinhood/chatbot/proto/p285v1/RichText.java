package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.chatbot.proto.p285v1.RichText;
import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RichText;", "Lcom/squareup/wire/Message;", "", "text", "", "attributes", "", "Lcom/robinhood/chatbot/proto/v1/RichText$RichTextAttribute;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "RichTextAttribute", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RichText extends Message {

    @JvmField
    public static final ProtoAdapter<RichText> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.RichText$RichTextAttribute#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<RichTextAttribute> attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String text;

    public RichText() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20537newBuilder();
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ RichText(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichText(String text, List<RichTextAttribute> attributes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = text;
        this.attributes = Internal.immutableCopyOf("attributes", attributes);
    }

    public final List<RichTextAttribute> getAttributes() {
        return this.attributes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20537newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RichText)) {
            return false;
        }
        RichText richText = (RichText) other;
        return Intrinsics.areEqual(unknownFields(), richText.unknownFields()) && Intrinsics.areEqual(this.text, richText.text) && Intrinsics.areEqual(this.attributes, richText.attributes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37) + this.attributes.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text=" + Internal.sanitize(this.text));
        if (!this.attributes.isEmpty()) {
            arrayList.add("attributes=" + this.attributes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RichText{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichText copy$default(RichText richText, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richText.text;
        }
        if ((i & 2) != 0) {
            list = richText.attributes;
        }
        if ((i & 4) != 0) {
            byteString = richText.unknownFields();
        }
        return richText.copy(str, list, byteString);
    }

    public final RichText copy(String text, List<RichTextAttribute> attributes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RichText(text, attributes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RichText.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RichText>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.RichText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RichText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                }
                return size + RichText.RichTextAttribute.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getAttributes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RichText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
                RichText.RichTextAttribute.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAttributes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RichText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RichText.RichTextAttribute.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAttributes());
                if (Intrinsics.areEqual(value.getText(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RichText decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RichText(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(RichText.RichTextAttribute.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RichText redact(RichText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RichText.copy$default(value, null, Internal.m26823redactElements(value.getAttributes(), RichText.RichTextAttribute.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }

    /* compiled from: RichText.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RichText$RichTextAttribute;", "Lcom/squareup/wire/Message;", "", "location", "", "length", ResourceTypes.STYLE, "", "link", "unknownFields", "Lokio/ByteString;", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLocation", "()I", "getLength", "getStyle", "()Ljava/lang/String;", "getLink", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RichTextAttribute extends Message {

        @JvmField
        public static final ProtoAdapter<RichTextAttribute> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int length;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String link;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final int location;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String style;

        public RichTextAttribute() {
            this(0, 0, null, null, null, 31, null);
        }

        public /* synthetic */ RichTextAttribute(int i, int i2, String str, String str2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m20538newBuilder();
        }

        public final int getLocation() {
            return this.location;
        }

        public final int getLength() {
            return this.length;
        }

        public final String getStyle() {
            return this.style;
        }

        public final String getLink() {
            return this.link;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RichTextAttribute(int i, int i2, String style, String link, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.location = i;
            this.length = i2;
            this.style = style;
            this.link = link;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m20538newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof RichTextAttribute)) {
                return false;
            }
            RichTextAttribute richTextAttribute = (RichTextAttribute) other;
            return Intrinsics.areEqual(unknownFields(), richTextAttribute.unknownFields()) && this.location == richTextAttribute.location && this.length == richTextAttribute.length && Intrinsics.areEqual(this.style, richTextAttribute.style) && Intrinsics.areEqual(this.link, richTextAttribute.link);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.location)) * 37) + Integer.hashCode(this.length)) * 37) + this.style.hashCode()) * 37) + this.link.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("location=" + this.location);
            arrayList.add("length=" + this.length);
            arrayList.add("style=" + Internal.sanitize(this.style));
            arrayList.add("link=" + Internal.sanitize(this.link));
            return CollectionsKt.joinToString$default(arrayList, ", ", "RichTextAttribute{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ RichTextAttribute copy$default(RichTextAttribute richTextAttribute, int i, int i2, String str, String str2, ByteString byteString, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = richTextAttribute.location;
            }
            if ((i3 & 2) != 0) {
                i2 = richTextAttribute.length;
            }
            if ((i3 & 4) != 0) {
                str = richTextAttribute.style;
            }
            if ((i3 & 8) != 0) {
                str2 = richTextAttribute.link;
            }
            if ((i3 & 16) != 0) {
                byteString = richTextAttribute.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str3 = str;
            return richTextAttribute.copy(i, i2, str3, str2, byteString2);
        }

        public final RichTextAttribute copy(int location, int length, String style, String link, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new RichTextAttribute(location, length, style, link, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RichTextAttribute.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<RichTextAttribute>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.RichText$RichTextAttribute$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RichText.RichTextAttribute value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getLocation() != 0) {
                        size += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getLocation()));
                    }
                    if (value.getLength() != 0) {
                        size += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getLength()));
                    }
                    if (!Intrinsics.areEqual(value.getStyle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getStyle());
                    }
                    return !Intrinsics.areEqual(value.getLink(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLink()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RichText.RichTextAttribute value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getLocation() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLocation()));
                    }
                    if (value.getLength() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLength()));
                    }
                    if (!Intrinsics.areEqual(value.getStyle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStyle());
                    }
                    if (!Intrinsics.areEqual(value.getLink(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLink());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RichText.RichTextAttribute value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getLink(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLink());
                    }
                    if (!Intrinsics.areEqual(value.getStyle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStyle());
                    }
                    if (value.getLength() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLength()));
                    }
                    if (value.getLocation() != 0) {
                        ProtoAdapter.UINT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLocation()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RichText.RichTextAttribute redact(RichText.RichTextAttribute value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RichText.RichTextAttribute.copy$default(value, 0, 0, null, null, ByteString.EMPTY, 15, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public RichText.RichTextAttribute decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    int iIntValue = 0;
                    int iIntValue2 = 0;
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RichText.RichTextAttribute(iIntValue, iIntValue2, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        } else if (iNextTag == 2) {
                            iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
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
}
