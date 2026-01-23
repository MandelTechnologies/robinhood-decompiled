package rh_server_driven_ui.p531v1;

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

/* compiled from: CornerRadiusInfo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/CornerRadiusInfo;", "Lcom/squareup/wire/Message;", "", "rounded_corners", "", "Lrh_server_driven_ui/v1/Corner;", "radius", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;FLokio/ByteString;)V", "getRadius", "()F", "getRounded_corners", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CornerRadiusInfo extends Message {

    @JvmField
    public static final ProtoAdapter<CornerRadiusInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float radius;

    @WireField(adapter = "rh_server_driven_ui.v1.Corner#ADAPTER", jsonName = "roundedCorners", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Corner> rounded_corners;

    public CornerRadiusInfo() {
        this(null, 0.0f, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29708newBuilder();
    }

    public /* synthetic */ CornerRadiusInfo(List list, float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final float getRadius() {
        return this.radius;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerRadiusInfo(List<? extends Corner> rounded_corners, float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rounded_corners, "rounded_corners");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.radius = f;
        this.rounded_corners = Internal.immutableCopyOf("rounded_corners", rounded_corners);
    }

    public final List<Corner> getRounded_corners() {
        return this.rounded_corners;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29708newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CornerRadiusInfo)) {
            return false;
        }
        CornerRadiusInfo cornerRadiusInfo = (CornerRadiusInfo) other;
        return Intrinsics.areEqual(unknownFields(), cornerRadiusInfo.unknownFields()) && Intrinsics.areEqual(this.rounded_corners, cornerRadiusInfo.rounded_corners) && this.radius == cornerRadiusInfo.radius;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.rounded_corners.hashCode()) * 37) + Float.hashCode(this.radius);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.rounded_corners.isEmpty()) {
            arrayList.add("rounded_corners=" + this.rounded_corners);
        }
        arrayList.add("radius=" + this.radius);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CornerRadiusInfo{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CornerRadiusInfo copy$default(CornerRadiusInfo cornerRadiusInfo, List list, float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cornerRadiusInfo.rounded_corners;
        }
        if ((i & 2) != 0) {
            f = cornerRadiusInfo.radius;
        }
        if ((i & 4) != 0) {
            byteString = cornerRadiusInfo.unknownFields();
        }
        return cornerRadiusInfo.copy(list, f, byteString);
    }

    public final CornerRadiusInfo copy(List<? extends Corner> rounded_corners, float radius, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rounded_corners, "rounded_corners");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CornerRadiusInfo(rounded_corners, radius, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CornerRadiusInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CornerRadiusInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.CornerRadiusInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CornerRadiusInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Corner.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getRounded_corners());
                return !Float.valueOf(value.getRadius()).equals(Float.valueOf(0.0f)) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getRadius())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CornerRadiusInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Corner.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRounded_corners());
                if (!Float.valueOf(value.getRadius()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getRadius()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CornerRadiusInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Float.valueOf(value.getRadius()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getRadius()));
                }
                Corner.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRounded_corners());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CornerRadiusInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CornerRadiusInfo(arrayList, fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            Corner.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CornerRadiusInfo redact(CornerRadiusInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CornerRadiusInfo.copy$default(value, null, 0.0f, ByteString.EMPTY, 3, null);
            }
        };
    }
}
