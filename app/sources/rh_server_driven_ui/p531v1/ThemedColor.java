package rh_server_driven_ui.p531v1;

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

/* compiled from: ThemedColor.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lrh_server_driven_ui/v1/ThemedColor;", "Lcom/squareup/wire/Message;", "", "light", "Lrh_server_driven_ui/v1/Color;", "dark", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Color;Lrh_server_driven_ui/v1/Color;Lokio/ByteString;)V", "getLight", "()Lrh_server_driven_ui/v1/Color;", "getDark", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ThemedColor extends Message {

    @JvmField
    public static final ProtoAdapter<ThemedColor> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Color#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Color dark;

    @WireField(adapter = "rh_server_driven_ui.v1.Color#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Color light;

    public ThemedColor() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29844newBuilder();
    }

    public final Color getLight() {
        return this.light;
    }

    public /* synthetic */ ThemedColor(Color color, Color color2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.COLOR_UNSPECIFIED : color, (i & 2) != 0 ? Color.COLOR_UNSPECIFIED : color2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Color getDark() {
        return this.dark;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemedColor(Color light, Color dark, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.light = light;
        this.dark = dark;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29844newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ThemedColor)) {
            return false;
        }
        ThemedColor themedColor = (ThemedColor) other;
        return Intrinsics.areEqual(unknownFields(), themedColor.unknownFields()) && this.light == themedColor.light && this.dark == themedColor.dark;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.light.hashCode()) * 37) + this.dark.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("light=" + this.light);
        arrayList.add("dark=" + this.dark);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThemedColor{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ThemedColor copy$default(ThemedColor themedColor, Color color, Color color2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            color = themedColor.light;
        }
        if ((i & 2) != 0) {
            color2 = themedColor.dark;
        }
        if ((i & 4) != 0) {
            byteString = themedColor.unknownFields();
        }
        return themedColor.copy(color, color2, byteString);
    }

    public final ThemedColor copy(Color light, Color dark, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ThemedColor(light, dark, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ThemedColor.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ThemedColor>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ThemedColor$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ThemedColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Color light = value.getLight();
                Color color = Color.COLOR_UNSPECIFIED;
                if (light != color) {
                    size += Color.ADAPTER.encodedSizeWithTag(1, value.getLight());
                }
                return value.getDark() != color ? size + Color.ADAPTER.encodedSizeWithTag(2, value.getDark()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ThemedColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Color light = value.getLight();
                Color color = Color.COLOR_UNSPECIFIED;
                if (light != color) {
                    Color.ADAPTER.encodeWithTag(writer, 1, (int) value.getLight());
                }
                if (value.getDark() != color) {
                    Color.ADAPTER.encodeWithTag(writer, 2, (int) value.getDark());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ThemedColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Color dark = value.getDark();
                Color color = Color.COLOR_UNSPECIFIED;
                if (dark != color) {
                    Color.ADAPTER.encodeWithTag(writer, 2, (int) value.getDark());
                }
                if (value.getLight() != color) {
                    Color.ADAPTER.encodeWithTag(writer, 1, (int) value.getLight());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThemedColor decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Color colorDecode = Color.COLOR_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Color colorDecode2 = colorDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ThemedColor(colorDecode, colorDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            colorDecode = Color.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            colorDecode2 = Color.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThemedColor redact(ThemedColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ThemedColor.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
