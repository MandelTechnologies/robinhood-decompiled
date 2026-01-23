package microgram.p507ui.p508v1;

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

/* compiled from: IosAttributes.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001aR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0003\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/ui/v1/IosAttributes;", "Lcom/squareup/wire/Message;", "", "is_full_bleed_header", "", "header_background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "header_ignore_top_safe_area", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Boolean;Lokio/ByteString;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHeader_background_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getHeader_ignore_top_safe_area", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Boolean;Lokio/ByteString;)Lmicrogram/ui/v1/IosAttributes;", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class IosAttributes extends Message {

    @JvmField
    public static final ProtoAdapter<IosAttributes> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "headerBackgroundColor", schemaIndex = 1, tag = 2)
    private final ThemedColor header_background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "headerIgnoreTopSafeArea", schemaIndex = 2, tag = 3)
    private final Boolean header_ignore_top_safe_area;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFullBleedHeader", schemaIndex = 0, tag = 1)
    private final Boolean is_full_bleed_header;

    public IosAttributes() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29248newBuilder();
    }

    /* renamed from: is_full_bleed_header, reason: from getter */
    public final Boolean getIs_full_bleed_header() {
        return this.is_full_bleed_header;
    }

    public final ThemedColor getHeader_background_color() {
        return this.header_background_color;
    }

    public final Boolean getHeader_ignore_top_safe_area() {
        return this.header_ignore_top_safe_area;
    }

    public /* synthetic */ IosAttributes(Boolean bool, ThemedColor themedColor, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosAttributes(Boolean bool, ThemedColor themedColor, Boolean bool2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_full_bleed_header = bool;
        this.header_background_color = themedColor;
        this.header_ignore_top_safe_area = bool2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29248newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IosAttributes)) {
            return false;
        }
        IosAttributes iosAttributes = (IosAttributes) other;
        return Intrinsics.areEqual(unknownFields(), iosAttributes.unknownFields()) && Intrinsics.areEqual(this.is_full_bleed_header, iosAttributes.is_full_bleed_header) && Intrinsics.areEqual(this.header_background_color, iosAttributes.header_background_color) && Intrinsics.areEqual(this.header_ignore_top_safe_area, iosAttributes.header_ignore_top_safe_area);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_full_bleed_header;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.header_background_color;
        int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        Boolean bool2 = this.header_ignore_top_safe_area;
        int iHashCode4 = iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_full_bleed_header;
        if (bool != null) {
            arrayList.add("is_full_bleed_header=" + bool);
        }
        ThemedColor themedColor = this.header_background_color;
        if (themedColor != null) {
            arrayList.add("header_background_color=" + themedColor);
        }
        Boolean bool2 = this.header_ignore_top_safe_area;
        if (bool2 != null) {
            arrayList.add("header_ignore_top_safe_area=" + bool2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IosAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IosAttributes copy$default(IosAttributes iosAttributes, Boolean bool, ThemedColor themedColor, Boolean bool2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = iosAttributes.is_full_bleed_header;
        }
        if ((i & 2) != 0) {
            themedColor = iosAttributes.header_background_color;
        }
        if ((i & 4) != 0) {
            bool2 = iosAttributes.header_ignore_top_safe_area;
        }
        if ((i & 8) != 0) {
            byteString = iosAttributes.unknownFields();
        }
        return iosAttributes.copy(bool, themedColor, bool2, byteString);
    }

    public final IosAttributes copy(Boolean is_full_bleed_header, ThemedColor header_background_color, Boolean header_ignore_top_safe_area, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IosAttributes(is_full_bleed_header, header_background_color, header_ignore_top_safe_area, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IosAttributes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IosAttributes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.IosAttributes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IosAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                return size + protoAdapter.encodedSizeWithTag(1, value.getIs_full_bleed_header()) + ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getHeader_background_color()) + protoAdapter.encodedSizeWithTag(3, value.getHeader_ignore_top_safe_area());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IosAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getIs_full_bleed_header());
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getHeader_background_color());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getHeader_ignore_top_safe_area());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IosAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getHeader_ignore_top_safe_area());
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getHeader_background_color());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getIs_full_bleed_header());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IosAttributes redact(IosAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor header_background_color = value.getHeader_background_color();
                return IosAttributes.copy$default(value, null, header_background_color != null ? ThemedColor.ADAPTER.redact(header_background_color) : null, null, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IosAttributes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Boolean boolDecode = null;
                ThemedColor themedColorDecode = null;
                Boolean boolDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IosAttributes(boolDecode, themedColorDecode, boolDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
