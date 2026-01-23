package rh_server_driven_ui.p531v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.Instrument;
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

/* compiled from: StylesWithStates.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/StylesWithStates;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lrh_server_driven_ui/v1/Style;", "active", Instrument.STATE_INACTIVE, "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Style;Lrh_server_driven_ui/v1/Style;Lrh_server_driven_ui/v1/Style;Lokio/ByteString;)V", "getDefault", "()Lrh_server_driven_ui/v1/Style;", "getActive", "getInactive", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class StylesWithStates extends Message {

    @JvmField
    public static final ProtoAdapter<StylesWithStates> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Style#ADAPTER", schemaIndex = 1, tag = 2)
    private final Style active;

    @WireField(adapter = "rh_server_driven_ui.v1.Style#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Style default;

    @WireField(adapter = "rh_server_driven_ui.v1.Style#ADAPTER", schemaIndex = 2, tag = 3)
    private final Style inactive;

    public StylesWithStates() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29818newBuilder();
    }

    public final Style getDefault() {
        return this.default;
    }

    public final Style getActive() {
        return this.active;
    }

    public final Style getInactive() {
        return this.inactive;
    }

    public /* synthetic */ StylesWithStates(Style style, Style style2, Style style3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : style, (i & 2) != 0 ? null : style2, (i & 4) != 0 ? null : style3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylesWithStates(Style style, Style style2, Style style3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.default = style;
        this.active = style2;
        this.inactive = style3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29818newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StylesWithStates)) {
            return false;
        }
        StylesWithStates stylesWithStates = (StylesWithStates) other;
        return Intrinsics.areEqual(unknownFields(), stylesWithStates.unknownFields()) && Intrinsics.areEqual(this.default, stylesWithStates.default) && Intrinsics.areEqual(this.active, stylesWithStates.active) && Intrinsics.areEqual(this.inactive, stylesWithStates.inactive);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Style style = this.default;
        int iHashCode2 = (iHashCode + (style != null ? style.hashCode() : 0)) * 37;
        Style style2 = this.active;
        int iHashCode3 = (iHashCode2 + (style2 != null ? style2.hashCode() : 0)) * 37;
        Style style3 = this.inactive;
        int iHashCode4 = iHashCode3 + (style3 != null ? style3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Style style = this.default;
        if (style != null) {
            arrayList.add("default=" + style);
        }
        Style style2 = this.active;
        if (style2 != null) {
            arrayList.add("active=" + style2);
        }
        Style style3 = this.inactive;
        if (style3 != null) {
            arrayList.add("inactive=" + style3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StylesWithStates{", "}", 0, null, null, 56, null);
    }

    public final StylesWithStates copy(Style style, Style active, Style inactive, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StylesWithStates(style, active, inactive, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StylesWithStates.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StylesWithStates>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.StylesWithStates$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StylesWithStates value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDefault() != null) {
                    size += Style.ADAPTER.encodedSizeWithTag(1, value.getDefault());
                }
                ProtoAdapter<Style> protoAdapter = Style.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(2, value.getActive()) + protoAdapter.encodedSizeWithTag(3, value.getInactive());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StylesWithStates value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDefault() != null) {
                    Style.ADAPTER.encodeWithTag(writer, 1, (int) value.getDefault());
                }
                ProtoAdapter<Style> protoAdapter = Style.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getActive());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getInactive());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StylesWithStates value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Style> protoAdapter = Style.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getInactive());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getActive());
                if (value.getDefault() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getDefault());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StylesWithStates redact(StylesWithStates value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Style style = value.getDefault();
                Style styleRedact = style != null ? Style.ADAPTER.redact(style) : null;
                Style active = value.getActive();
                Style styleRedact2 = active != null ? Style.ADAPTER.redact(active) : null;
                Style inactive = value.getInactive();
                return value.copy(styleRedact, styleRedact2, inactive != null ? Style.ADAPTER.redact(inactive) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StylesWithStates decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Style styleDecode = null;
                Style styleDecode2 = null;
                Style styleDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StylesWithStates(styleDecode, styleDecode2, styleDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        styleDecode = Style.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        styleDecode2 = Style.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        styleDecode3 = Style.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
