package bonfire.proto.idl.portfolio.p037v1;

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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PositionValue.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016JH\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionValue;", "Lcom/squareup/wire/Message;", "", "text", "Lbonfire/proto/idl/portfolio/v1/PositionText;", "background_color", "", "", "border_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionText;Ljava/util/Map;Ljava/util/Map;Lokio/ByteString;)V", "getText", "()Lbonfire/proto/idl/portfolio/v1/PositionText;", "getBackground_color", "()Ljava/util/Map;", "getBorder_color", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PositionValue extends Message {

    @JvmField
    public static final ProtoAdapter<PositionValue> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Map<String, ?> background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Map<String, ?> border_color;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PositionText text;

    public PositionValue() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9037newBuilder();
    }

    public final PositionText getText() {
        return this.text;
    }

    public /* synthetic */ PositionValue(PositionText positionText, Map map, Map map2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : positionText, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionValue(PositionText positionText, Map<String, ?> map, Map<String, ?> map2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = positionText;
        this.background_color = (Map) Internal.immutableCopyOfStruct("background_color", map);
        this.border_color = (Map) Internal.immutableCopyOfStruct("border_color", map2);
    }

    public final Map<String, ?> getBackground_color() {
        return this.background_color;
    }

    public final Map<String, ?> getBorder_color() {
        return this.border_color;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9037newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PositionValue)) {
            return false;
        }
        PositionValue positionValue = (PositionValue) other;
        return Intrinsics.areEqual(unknownFields(), positionValue.unknownFields()) && Intrinsics.areEqual(this.text, positionValue.text) && Intrinsics.areEqual(this.background_color, positionValue.background_color) && Intrinsics.areEqual(this.border_color, positionValue.border_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PositionText positionText = this.text;
        int iHashCode2 = (iHashCode + (positionText != null ? positionText.hashCode() : 0)) * 37;
        Map<String, ?> map = this.background_color;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 37;
        Map<String, ?> map2 = this.border_color;
        int iHashCode4 = iHashCode3 + (map2 != null ? map2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PositionText positionText = this.text;
        if (positionText != null) {
            arrayList.add("text=" + positionText);
        }
        Map<String, ?> map = this.background_color;
        if (map != null) {
            arrayList.add("background_color=" + map);
        }
        Map<String, ?> map2 = this.border_color;
        if (map2 != null) {
            arrayList.add("border_color=" + map2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PositionValue{", "}", 0, null, null, 56, null);
    }

    public final PositionValue copy(PositionText text, Map<String, ?> background_color, Map<String, ?> border_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PositionValue(text, background_color, border_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionValue.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PositionValue>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.PositionValue$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PositionValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getText() != null) {
                    size += PositionText.ADAPTER.encodedSizeWithTag(1, value.getText());
                }
                if (value.getBackground_color() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(2, value.getBackground_color());
                }
                return value.getBorder_color() != null ? size + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(3, value.getBorder_color()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PositionValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getText() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (value.getBackground_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getBackground_color());
                }
                if (value.getBorder_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 3, (int) value.getBorder_color());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PositionValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBorder_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 3, (int) value.getBorder_color());
                }
                if (value.getBackground_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 2, (int) value.getBackground_color());
                }
                if (value.getText() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PositionValue redact(PositionValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PositionText text = value.getText();
                PositionText positionTextRedact = text != null ? PositionText.ADAPTER.redact(text) : null;
                Map<String, ?> background_color = value.getBackground_color();
                Map<String, ?> mapRedact = background_color != null ? ProtoAdapter.STRUCT_MAP.redact(background_color) : null;
                Map<String, ?> border_color = value.getBorder_color();
                return value.copy(positionTextRedact, mapRedact, border_color != null ? ProtoAdapter.STRUCT_MAP.redact(border_color) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PositionValue decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PositionText positionTextDecode = null;
                Map<String, ?> mapDecode = null;
                Map<String, ?> mapDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PositionValue(positionTextDecode, mapDecode, mapDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        positionTextDecode = PositionText.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                    } else if (iNextTag == 3) {
                        mapDecode2 = ProtoAdapter.STRUCT_MAP.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
