package com.robinhood.arsenal.proto.p281v1.idl;

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
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: Color.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/Color;", "Lcom/squareup/wire/Message;", "", "bento", "Lrh_server_driven_ui/v1/ThemedColor;", "hex", "Lcom/robinhood/arsenal/proto/v1/idl/ThemedHexColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lcom/robinhood/arsenal/proto/v1/idl/ThemedHexColor;Lokio/ByteString;)V", "getBento", "()Lrh_server_driven_ui/v1/ThemedColor;", "getHex", "()Lcom/robinhood/arsenal/proto/v1/idl/ThemedHexColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Color extends Message {

    @JvmField
    public static final ProtoAdapter<Color> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ThemedColor bento;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.ThemedHexColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedHexColor hex;

    public Color() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20113newBuilder();
    }

    public final ThemedColor getBento() {
        return this.bento;
    }

    public final ThemedHexColor getHex() {
        return this.hex;
    }

    public /* synthetic */ Color(ThemedColor themedColor, ThemedHexColor themedHexColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : themedHexColor, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Color(ThemedColor themedColor, ThemedHexColor themedHexColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bento = themedColor;
        this.hex = themedHexColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20113newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Color)) {
            return false;
        }
        Color color = (Color) other;
        return Intrinsics.areEqual(unknownFields(), color.unknownFields()) && Intrinsics.areEqual(this.bento, color.bento) && Intrinsics.areEqual(this.hex, color.hex);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.bento;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedHexColor themedHexColor = this.hex;
        int iHashCode3 = iHashCode2 + (themedHexColor != null ? themedHexColor.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.bento;
        if (themedColor != null) {
            arrayList.add("bento=" + themedColor);
        }
        ThemedHexColor themedHexColor = this.hex;
        if (themedHexColor != null) {
            arrayList.add("hex=" + themedHexColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Color{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Color copy$default(Color color, ThemedColor themedColor, ThemedHexColor themedHexColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = color.bento;
        }
        if ((i & 2) != 0) {
            themedHexColor = color.hex;
        }
        if ((i & 4) != 0) {
            byteString = color.unknownFields();
        }
        return color.copy(themedColor, themedHexColor, byteString);
    }

    public final Color copy(ThemedColor bento, ThemedHexColor hex, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Color(bento, hex, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Color.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Color>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.Color$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Color value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBento() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getBento());
                }
                return value.getHex() != null ? size + ThemedHexColor.ADAPTER.encodedSizeWithTag(2, value.getHex()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Color value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBento() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getBento());
                }
                if (value.getHex() != null) {
                    ThemedHexColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getHex());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Color value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHex() != null) {
                    ThemedHexColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getHex());
                }
                if (value.getBento() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getBento());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Color redact(Color value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor bento = value.getBento();
                ThemedColor themedColorRedact = bento != null ? ThemedColor.ADAPTER.redact(bento) : null;
                ThemedHexColor hex = value.getHex();
                return value.copy(themedColorRedact, hex != null ? ThemedHexColor.ADAPTER.redact(hex) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Color decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                ThemedHexColor themedHexColorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Color(themedColorDecode, themedHexColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        themedHexColorDecode = ThemedHexColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
