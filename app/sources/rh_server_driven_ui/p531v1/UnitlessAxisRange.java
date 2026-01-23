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

/* compiled from: UnitlessAxisRange.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/UnitlessAxisRange;", "Lcom/squareup/wire/Message;", "", "min_value", "", "max_value", "scrubbing_increment", "unknownFields", "Lokio/ByteString;", "<init>", "(FFFLokio/ByteString;)V", "getMin_value", "()F", "getMax_value", "getScrubbing_increment", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class UnitlessAxisRange extends Message {

    @JvmField
    public static final ProtoAdapter<UnitlessAxisRange> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float max_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float min_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "scrubbingIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float scrubbing_increment;

    public UnitlessAxisRange() {
        this(0.0f, 0.0f, 0.0f, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29858newBuilder();
    }

    public final float getMin_value() {
        return this.min_value;
    }

    public final float getMax_value() {
        return this.max_value;
    }

    public final float getScrubbing_increment() {
        return this.scrubbing_increment;
    }

    public /* synthetic */ UnitlessAxisRange(float f, float f2, float f3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitlessAxisRange(float f, float f2, float f3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.min_value = f;
        this.max_value = f2;
        this.scrubbing_increment = f3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29858newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UnitlessAxisRange)) {
            return false;
        }
        UnitlessAxisRange unitlessAxisRange = (UnitlessAxisRange) other;
        return Intrinsics.areEqual(unknownFields(), unitlessAxisRange.unknownFields()) && this.min_value == unitlessAxisRange.min_value && this.max_value == unitlessAxisRange.max_value && this.scrubbing_increment == unitlessAxisRange.scrubbing_increment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Float.hashCode(this.min_value)) * 37) + Float.hashCode(this.max_value)) * 37) + Float.hashCode(this.scrubbing_increment);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("min_value=" + this.min_value);
        arrayList.add("max_value=" + this.max_value);
        arrayList.add("scrubbing_increment=" + this.scrubbing_increment);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnitlessAxisRange{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UnitlessAxisRange copy$default(UnitlessAxisRange unitlessAxisRange, float f, float f2, float f3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = unitlessAxisRange.min_value;
        }
        if ((i & 2) != 0) {
            f2 = unitlessAxisRange.max_value;
        }
        if ((i & 4) != 0) {
            f3 = unitlessAxisRange.scrubbing_increment;
        }
        if ((i & 8) != 0) {
            byteString = unitlessAxisRange.unknownFields();
        }
        return unitlessAxisRange.copy(f, f2, f3, byteString);
    }

    public final UnitlessAxisRange copy(float min_value, float max_value, float scrubbing_increment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UnitlessAxisRange(min_value, max_value, scrubbing_increment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UnitlessAxisRange.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UnitlessAxisRange>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.UnitlessAxisRange$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UnitlessAxisRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Float fValueOf = Float.valueOf(value.getMin_value());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getMin_value()));
                }
                if (!Float.valueOf(value.getMax_value()).equals(fValueOf2)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getMax_value()));
                }
                return !Float.valueOf(value.getScrubbing_increment()).equals(fValueOf2) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getScrubbing_increment())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UnitlessAxisRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Float fValueOf = Float.valueOf(value.getMin_value());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getMin_value()));
                }
                if (!Float.valueOf(value.getMax_value()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getMax_value()));
                }
                if (!Float.valueOf(value.getScrubbing_increment()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getScrubbing_increment()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UnitlessAxisRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Float fValueOf = Float.valueOf(value.getScrubbing_increment());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getScrubbing_increment()));
                }
                if (!Float.valueOf(value.getMax_value()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getMax_value()));
                }
                if (Float.valueOf(value.getMin_value()).equals(fValueOf2)) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getMin_value()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnitlessAxisRange redact(UnitlessAxisRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UnitlessAxisRange.copy$default(value, 0.0f, 0.0f, 0.0f, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnitlessAxisRange decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UnitlessAxisRange(fFloatValue, fFloatValue2, fFloatValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 2) {
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
