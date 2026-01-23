package microgram.contracts.invest_tab_highlights.proto.p494v1;

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

/* compiled from: DayNightColor.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColor;", "Lcom/squareup/wire/Message;", "", "dark_hex", "", "light_hex", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDark_hex", "()Ljava/lang/String;", "getLight_hex", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DayNightColor extends Message {

    @JvmField
    public static final ProtoAdapter<DayNightColor> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkHex", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String dark_hex;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lightHex", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String light_hex;

    public DayNightColor() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DayNightColor(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29121newBuilder();
    }

    public final String getDark_hex() {
        return this.dark_hex;
    }

    public final String getLight_hex() {
        return this.light_hex;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayNightColor(String dark_hex, String light_hex, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(dark_hex, "dark_hex");
        Intrinsics.checkNotNullParameter(light_hex, "light_hex");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dark_hex = dark_hex;
        this.light_hex = light_hex;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29121newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DayNightColor)) {
            return false;
        }
        DayNightColor dayNightColor = (DayNightColor) other;
        return Intrinsics.areEqual(unknownFields(), dayNightColor.unknownFields()) && Intrinsics.areEqual(this.dark_hex, dayNightColor.dark_hex) && Intrinsics.areEqual(this.light_hex, dayNightColor.light_hex);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.dark_hex.hashCode()) * 37) + this.light_hex.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dark_hex=" + Internal.sanitize(this.dark_hex));
        arrayList.add("light_hex=" + Internal.sanitize(this.light_hex));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DayNightColor{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DayNightColor copy$default(DayNightColor dayNightColor, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dayNightColor.dark_hex;
        }
        if ((i & 2) != 0) {
            str2 = dayNightColor.light_hex;
        }
        if ((i & 4) != 0) {
            byteString = dayNightColor.unknownFields();
        }
        return dayNightColor.copy(str, str2, byteString);
    }

    public final DayNightColor copy(String dark_hex, String light_hex, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(dark_hex, "dark_hex");
        Intrinsics.checkNotNullParameter(light_hex, "light_hex");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DayNightColor(dark_hex, light_hex, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DayNightColor.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DayNightColor>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.DayNightColor$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DayNightColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDark_hex(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDark_hex());
                }
                return !Intrinsics.areEqual(value.getLight_hex(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLight_hex()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DayNightColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDark_hex(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDark_hex());
                }
                if (!Intrinsics.areEqual(value.getLight_hex(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLight_hex());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DayNightColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLight_hex(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLight_hex());
                }
                if (Intrinsics.areEqual(value.getDark_hex(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDark_hex());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DayNightColor redact(DayNightColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DayNightColor.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DayNightColor decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DayNightColor(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
