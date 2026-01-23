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

/* compiled from: AndroidAttributes.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0019R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/ui/v1/AndroidAttributes;", "Lcom/squareup/wire/Message;", "", "status_bar_style", "Lmicrogram/ui/v1/StatusBarStyle;", "add_navigation_bars_padding", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/StatusBarStyle;Ljava/lang/Boolean;Lokio/ByteString;)V", "getStatus_bar_style", "()Lmicrogram/ui/v1/StatusBarStyle;", "getAdd_navigation_bars_padding", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lmicrogram/ui/v1/StatusBarStyle;Ljava/lang/Boolean;Lokio/ByteString;)Lmicrogram/ui/v1/AndroidAttributes;", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AndroidAttributes extends Message {

    @JvmField
    public static final ProtoAdapter<AndroidAttributes> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "addNavigationBarsPadding", schemaIndex = 1, tag = 2)
    private final Boolean add_navigation_bars_padding;

    @WireField(adapter = "microgram.ui.v1.StatusBarStyle#ADAPTER", jsonName = "statusBarStyle", schemaIndex = 0, tag = 1)
    private final StatusBarStyle status_bar_style;

    public AndroidAttributes() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29234newBuilder();
    }

    public final StatusBarStyle getStatus_bar_style() {
        return this.status_bar_style;
    }

    public final Boolean getAdd_navigation_bars_padding() {
        return this.add_navigation_bars_padding;
    }

    public /* synthetic */ AndroidAttributes(StatusBarStyle statusBarStyle, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : statusBarStyle, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAttributes(StatusBarStyle statusBarStyle, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status_bar_style = statusBarStyle;
        this.add_navigation_bars_padding = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29234newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AndroidAttributes)) {
            return false;
        }
        AndroidAttributes androidAttributes = (AndroidAttributes) other;
        return Intrinsics.areEqual(unknownFields(), androidAttributes.unknownFields()) && this.status_bar_style == androidAttributes.status_bar_style && Intrinsics.areEqual(this.add_navigation_bars_padding, androidAttributes.add_navigation_bars_padding);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        StatusBarStyle statusBarStyle = this.status_bar_style;
        int iHashCode2 = (iHashCode + (statusBarStyle != null ? statusBarStyle.hashCode() : 0)) * 37;
        Boolean bool = this.add_navigation_bars_padding;
        int iHashCode3 = iHashCode2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        StatusBarStyle statusBarStyle = this.status_bar_style;
        if (statusBarStyle != null) {
            arrayList.add("status_bar_style=" + statusBarStyle);
        }
        Boolean bool = this.add_navigation_bars_padding;
        if (bool != null) {
            arrayList.add("add_navigation_bars_padding=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AndroidAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AndroidAttributes copy$default(AndroidAttributes androidAttributes, StatusBarStyle statusBarStyle, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            statusBarStyle = androidAttributes.status_bar_style;
        }
        if ((i & 2) != 0) {
            bool = androidAttributes.add_navigation_bars_padding;
        }
        if ((i & 4) != 0) {
            byteString = androidAttributes.unknownFields();
        }
        return androidAttributes.copy(statusBarStyle, bool, byteString);
    }

    public final AndroidAttributes copy(StatusBarStyle status_bar_style, Boolean add_navigation_bars_padding, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AndroidAttributes(status_bar_style, add_navigation_bars_padding, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AndroidAttributes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AndroidAttributes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.AndroidAttributes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AndroidAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + StatusBarStyle.ADAPTER.encodedSizeWithTag(1, value.getStatus_bar_style()) + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.getAdd_navigation_bars_padding());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AndroidAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StatusBarStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus_bar_style());
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getAdd_navigation_bars_padding());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AndroidAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getAdd_navigation_bars_padding());
                StatusBarStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus_bar_style());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AndroidAttributes redact(AndroidAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AndroidAttributes.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AndroidAttributes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                StatusBarStyle statusBarStyleDecode = null;
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AndroidAttributes(statusBarStyleDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            statusBarStyleDecode = StatusBarStyle.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
