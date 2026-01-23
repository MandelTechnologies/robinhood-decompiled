package microgram.p507ui.p508v1.screen_events;

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

/* compiled from: Frame.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/Frame;", "Lcom/squareup/wire/Message;", "", "x1", "", "y1", "x2", "y2", "unknownFields", "Lokio/ByteString;", "<init>", "(FFFFLokio/ByteString;)V", "getX1", "()F", "getY1", "getX2", "getY2", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Frame extends Message {

    @JvmField
    public static final ProtoAdapter<Frame> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final float x1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float x2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float y1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float y2;

    public Frame() {
        this(0.0f, 0.0f, 0.0f, 0.0f, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29305newBuilder();
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getY1() {
        return this.y1;
    }

    public final float getX2() {
        return this.x2;
    }

    public final float getY2() {
        return this.y2;
    }

    public /* synthetic */ Frame(float f, float f2, float f3, float f4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Frame(float f, float f2, float f3, float f4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.x1 = f;
        this.y1 = f2;
        this.x2 = f3;
        this.y2 = f4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29305newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) other;
        return Intrinsics.areEqual(unknownFields(), frame.unknownFields()) && this.x1 == frame.x1 && this.y1 == frame.y1 && this.x2 == frame.x2 && this.y2 == frame.y2;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Float.hashCode(this.x1)) * 37) + Float.hashCode(this.y1)) * 37) + Float.hashCode(this.x2)) * 37) + Float.hashCode(this.y2);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("x1=" + this.x1);
        arrayList.add("y1=" + this.y1);
        arrayList.add("x2=" + this.x2);
        arrayList.add("y2=" + this.y2);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Frame{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Frame copy$default(Frame frame, float f, float f2, float f3, float f4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            f = frame.x1;
        }
        if ((i & 2) != 0) {
            f2 = frame.y1;
        }
        if ((i & 4) != 0) {
            f3 = frame.x2;
        }
        if ((i & 8) != 0) {
            f4 = frame.y2;
        }
        if ((i & 16) != 0) {
            byteString = frame.unknownFields();
        }
        ByteString byteString2 = byteString;
        float f5 = f3;
        return frame.copy(f, f2, f5, f4, byteString2);
    }

    public final Frame copy(float x1, float y1, float x2, float y2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Frame(x1, y1, x2, y2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Frame.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Frame>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.screen_events.Frame$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Frame value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Float fValueOf = Float.valueOf(value.getX1());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getX1()));
                }
                if (!Float.valueOf(value.getY1()).equals(fValueOf2)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getY1()));
                }
                if (!Float.valueOf(value.getX2()).equals(fValueOf2)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getX2()));
                }
                return !Float.valueOf(value.getY2()).equals(fValueOf2) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getY2())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Frame value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Float fValueOf = Float.valueOf(value.getX1());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getX1()));
                }
                if (!Float.valueOf(value.getY1()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getY1()));
                }
                if (!Float.valueOf(value.getX2()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getX2()));
                }
                if (!Float.valueOf(value.getY2()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getY2()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Frame value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Float fValueOf = Float.valueOf(value.getY2());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getY2()));
                }
                if (!Float.valueOf(value.getX2()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getX2()));
                }
                if (!Float.valueOf(value.getY1()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getY1()));
                }
                if (Float.valueOf(value.getX1()).equals(fValueOf2)) {
                    return;
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getX1()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Frame redact(Frame value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Frame.copy$default(value, 0.0f, 0.0f, 0.0f, 0.0f, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Frame decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                float fFloatValue4 = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Frame(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 2) {
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 4) {
                        fFloatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
