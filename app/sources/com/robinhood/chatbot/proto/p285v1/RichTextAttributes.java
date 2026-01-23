package com.robinhood.chatbot.proto.p285v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: RichTextAttributes.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RichTextAttributes;", "Lcom/squareup/wire/Message;", "", "location", "", "length", ResourceTypes.STYLE, "", "link", "unknownFields", "Lokio/ByteString;", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLocation", "()I", "getLength", "getStyle", "()Ljava/lang/String;", "getLink", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RichTextAttributes extends Message {

    @JvmField
    public static final ProtoAdapter<RichTextAttributes> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int length;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String style;

    public RichTextAttributes() {
        this(0, 0, null, null, null, 31, null);
    }

    public /* synthetic */ RichTextAttributes(int i, int i2, String str, String str2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20539newBuilder();
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
    public RichTextAttributes(int i, int i2, String style, String link, ByteString unknownFields) {
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
    public /* synthetic */ Void m20539newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RichTextAttributes)) {
            return false;
        }
        RichTextAttributes richTextAttributes = (RichTextAttributes) other;
        return Intrinsics.areEqual(unknownFields(), richTextAttributes.unknownFields()) && this.location == richTextAttributes.location && this.length == richTextAttributes.length && Intrinsics.areEqual(this.style, richTextAttributes.style) && Intrinsics.areEqual(this.link, richTextAttributes.link);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "RichTextAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RichTextAttributes copy$default(RichTextAttributes richTextAttributes, int i, int i2, String str, String str2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = richTextAttributes.location;
        }
        if ((i3 & 2) != 0) {
            i2 = richTextAttributes.length;
        }
        if ((i3 & 4) != 0) {
            str = richTextAttributes.style;
        }
        if ((i3 & 8) != 0) {
            str2 = richTextAttributes.link;
        }
        if ((i3 & 16) != 0) {
            byteString = richTextAttributes.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str;
        return richTextAttributes.copy(i, i2, str3, str2, byteString2);
    }

    public final RichTextAttributes copy(int location, int length, String style, String link, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RichTextAttributes(location, length, style, link, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RichTextAttributes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RichTextAttributes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.RichTextAttributes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RichTextAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLocation() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getLocation()));
                }
                if (value.getLength() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getLength()));
                }
                if (!Intrinsics.areEqual(value.getStyle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getStyle());
                }
                return !Intrinsics.areEqual(value.getLink(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLink()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RichTextAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLocation() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLocation()));
                }
                if (value.getLength() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLength()));
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
            public void encode(ReverseProtoWriter writer, RichTextAttributes value) throws IOException {
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
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getLength()));
                }
                if (value.getLocation() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLocation()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RichTextAttributes redact(RichTextAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RichTextAttributes.copy$default(value, 0, 0, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RichTextAttributes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RichTextAttributes(iIntValue, iIntValue2, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
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
