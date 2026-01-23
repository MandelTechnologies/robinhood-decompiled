package idl.idl_sample.proto.echo_microgram.p473v1;

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
import p479j$.time.Duration;

/* compiled from: EchoStringRepeatedlyRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRepeatedlyRequest;", "Lcom/squareup/wire/Message;", "", "", "text", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "interval", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Duration;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Duration;Lokio/ByteString;)Lidl/idl_sample/proto/echo_microgram/v1/EchoStringRepeatedlyRequest;", "Ljava/lang/String;", "getText", "Lj$/time/Duration;", "getInterval", "()Lj$/time/Duration;", "Companion", "idl.sample.microgram.echo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class EchoStringRepeatedlyRequest extends Message {

    @JvmField
    public static final ProtoAdapter<EchoStringRepeatedlyRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DURATION", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Duration interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String text;

    public EchoStringRepeatedlyRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28433newBuilder();
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ EchoStringRepeatedlyRequest(String str, Duration duration, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : duration, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Duration getInterval() {
        return this.interval;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EchoStringRepeatedlyRequest(String text, Duration duration, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = text;
        this.interval = duration;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28433newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EchoStringRepeatedlyRequest)) {
            return false;
        }
        EchoStringRepeatedlyRequest echoStringRepeatedlyRequest = (EchoStringRepeatedlyRequest) other;
        return Intrinsics.areEqual(unknownFields(), echoStringRepeatedlyRequest.unknownFields()) && Intrinsics.areEqual(this.text, echoStringRepeatedlyRequest.text) && Intrinsics.areEqual(this.interval, echoStringRepeatedlyRequest.interval);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37;
        Duration duration = this.interval;
        int iHashCode2 = iHashCode + (duration != null ? duration.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text=" + Internal.sanitize(this.text));
        Duration duration = this.interval;
        if (duration != null) {
            arrayList.add("interval=" + duration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EchoStringRepeatedlyRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EchoStringRepeatedlyRequest copy$default(EchoStringRepeatedlyRequest echoStringRepeatedlyRequest, String str, Duration duration, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = echoStringRepeatedlyRequest.text;
        }
        if ((i & 2) != 0) {
            duration = echoStringRepeatedlyRequest.interval;
        }
        if ((i & 4) != 0) {
            byteString = echoStringRepeatedlyRequest.unknownFields();
        }
        return echoStringRepeatedlyRequest.copy(str, duration, byteString);
    }

    public final EchoStringRepeatedlyRequest copy(String text, Duration interval, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EchoStringRepeatedlyRequest(text, interval, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EchoStringRepeatedlyRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EchoStringRepeatedlyRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: idl.idl_sample.proto.echo_microgram.v1.EchoStringRepeatedlyRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EchoStringRepeatedlyRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                }
                return value.getInterval() != null ? size + ProtoAdapter.DURATION.encodedSizeWithTag(2, value.getInterval()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EchoStringRepeatedlyRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (value.getInterval() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 2, (int) value.getInterval());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EchoStringRepeatedlyRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInterval() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 2, (int) value.getInterval());
                }
                if (Intrinsics.areEqual(value.getText(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EchoStringRepeatedlyRequest redact(EchoStringRepeatedlyRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Duration interval = value.getInterval();
                return EchoStringRepeatedlyRequest.copy$default(value, null, interval != null ? ProtoAdapter.DURATION.redact(interval) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EchoStringRepeatedlyRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Duration durationDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EchoStringRepeatedlyRequest(strDecode, durationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        durationDecode = ProtoAdapter.DURATION.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
