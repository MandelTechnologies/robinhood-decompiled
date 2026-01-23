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

/* compiled from: HtmlCanvasAvailableAreaMessage.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessage;", "Lcom/squareup/wire/Message;", "", "canvas_frame", "Lmicrogram/ui/v1/screen_events/Frame;", "available_frame", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/screen_events/Frame;Lmicrogram/ui/v1/screen_events/Frame;Lokio/ByteString;)V", "getCanvas_frame", "()Lmicrogram/ui/v1/screen_events/Frame;", "getAvailable_frame", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class HtmlCanvasAvailableAreaMessage extends Message {

    @JvmField
    public static final ProtoAdapter<HtmlCanvasAvailableAreaMessage> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.screen_events.Frame#ADAPTER", jsonName = "availableFrame", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Frame available_frame;

    @WireField(adapter = "microgram.ui.v1.screen_events.Frame#ADAPTER", jsonName = "canvasFrame", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Frame canvas_frame;

    public HtmlCanvasAvailableAreaMessage() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29306newBuilder();
    }

    public final Frame getCanvas_frame() {
        return this.canvas_frame;
    }

    public final Frame getAvailable_frame() {
        return this.available_frame;
    }

    public /* synthetic */ HtmlCanvasAvailableAreaMessage(Frame frame, Frame frame2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : frame, (i & 2) != 0 ? null : frame2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlCanvasAvailableAreaMessage(Frame frame, Frame frame2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.canvas_frame = frame;
        this.available_frame = frame2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29306newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HtmlCanvasAvailableAreaMessage)) {
            return false;
        }
        HtmlCanvasAvailableAreaMessage htmlCanvasAvailableAreaMessage = (HtmlCanvasAvailableAreaMessage) other;
        return Intrinsics.areEqual(unknownFields(), htmlCanvasAvailableAreaMessage.unknownFields()) && Intrinsics.areEqual(this.canvas_frame, htmlCanvasAvailableAreaMessage.canvas_frame) && Intrinsics.areEqual(this.available_frame, htmlCanvasAvailableAreaMessage.available_frame);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Frame frame = this.canvas_frame;
        int iHashCode2 = (iHashCode + (frame != null ? frame.hashCode() : 0)) * 37;
        Frame frame2 = this.available_frame;
        int iHashCode3 = iHashCode2 + (frame2 != null ? frame2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Frame frame = this.canvas_frame;
        if (frame != null) {
            arrayList.add("canvas_frame=" + frame);
        }
        Frame frame2 = this.available_frame;
        if (frame2 != null) {
            arrayList.add("available_frame=" + frame2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HtmlCanvasAvailableAreaMessage{", "}", 0, null, null, 56, null);
    }

    public final HtmlCanvasAvailableAreaMessage copy(Frame canvas_frame, Frame available_frame, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HtmlCanvasAvailableAreaMessage(canvas_frame, available_frame, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HtmlCanvasAvailableAreaMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HtmlCanvasAvailableAreaMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.screen_events.HtmlCanvasAvailableAreaMessage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HtmlCanvasAvailableAreaMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCanvas_frame() != null) {
                    size += Frame.ADAPTER.encodedSizeWithTag(1, value.getCanvas_frame());
                }
                return value.getAvailable_frame() != null ? size + Frame.ADAPTER.encodedSizeWithTag(2, value.getAvailable_frame()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HtmlCanvasAvailableAreaMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCanvas_frame() != null) {
                    Frame.ADAPTER.encodeWithTag(writer, 1, (int) value.getCanvas_frame());
                }
                if (value.getAvailable_frame() != null) {
                    Frame.ADAPTER.encodeWithTag(writer, 2, (int) value.getAvailable_frame());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HtmlCanvasAvailableAreaMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAvailable_frame() != null) {
                    Frame.ADAPTER.encodeWithTag(writer, 2, (int) value.getAvailable_frame());
                }
                if (value.getCanvas_frame() != null) {
                    Frame.ADAPTER.encodeWithTag(writer, 1, (int) value.getCanvas_frame());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HtmlCanvasAvailableAreaMessage redact(HtmlCanvasAvailableAreaMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Frame canvas_frame = value.getCanvas_frame();
                Frame frameRedact = canvas_frame != null ? Frame.ADAPTER.redact(canvas_frame) : null;
                Frame available_frame = value.getAvailable_frame();
                return value.copy(frameRedact, available_frame != null ? Frame.ADAPTER.redact(available_frame) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HtmlCanvasAvailableAreaMessage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Frame frameDecode = null;
                Frame frameDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new HtmlCanvasAvailableAreaMessage(frameDecode, frameDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        frameDecode = Frame.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        frameDecode2 = Frame.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
