package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: DifferenceCloud.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/DifferenceCloud;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lblack_widow/contracts/mobile_app_chart/proto/v1/Color;", "is_visible", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/Color;ZLokio/ByteString;)V", "getColor", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/Color;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DifferenceCloud extends Message {

    @JvmField
    public static final ProtoAdapter<DifferenceCloud> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.Color#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Color color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isVisible", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_visible;

    public DifferenceCloud() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8582newBuilder();
    }

    public final Color getColor() {
        return this.color;
    }

    /* renamed from: is_visible, reason: from getter */
    public final boolean getIs_visible() {
        return this.is_visible;
    }

    public /* synthetic */ DifferenceCloud(Color color, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : color, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DifferenceCloud(Color color, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = color;
        this.is_visible = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8582newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DifferenceCloud)) {
            return false;
        }
        DifferenceCloud differenceCloud = (DifferenceCloud) other;
        return Intrinsics.areEqual(unknownFields(), differenceCloud.unknownFields()) && Intrinsics.areEqual(this.color, differenceCloud.color) && this.is_visible == differenceCloud.is_visible;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Color color = this.color;
        int iHashCode2 = ((iHashCode + (color != null ? color.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_visible);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.color;
        if (color != null) {
            arrayList.add("color=" + color);
        }
        arrayList.add("is_visible=" + this.is_visible);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DifferenceCloud{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DifferenceCloud copy$default(DifferenceCloud differenceCloud, Color color, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            color = differenceCloud.color;
        }
        if ((i & 2) != 0) {
            z = differenceCloud.is_visible;
        }
        if ((i & 4) != 0) {
            byteString = differenceCloud.unknownFields();
        }
        return differenceCloud.copy(color, z, byteString);
    }

    public final DifferenceCloud copy(Color color, boolean is_visible, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DifferenceCloud(color, is_visible, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DifferenceCloud.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DifferenceCloud>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.DifferenceCloud$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DifferenceCloud value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getColor() != null) {
                    size += Color.ADAPTER.encodedSizeWithTag(1, value.getColor());
                }
                return value.getIs_visible() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_visible())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DifferenceCloud value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getColor() != null) {
                    Color.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
                if (value.getIs_visible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_visible()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DifferenceCloud value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_visible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_visible()));
                }
                if (value.getColor() != null) {
                    Color.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DifferenceCloud redact(DifferenceCloud value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Color color = value.getColor();
                return DifferenceCloud.copy$default(value, color != null ? Color.ADAPTER.redact(color) : null, false, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DifferenceCloud decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Color colorDecode = null;
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DifferenceCloud(colorDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        colorDecode = Color.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
