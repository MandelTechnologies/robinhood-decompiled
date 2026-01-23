package trivia.p550v1;

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

/* compiled from: SeekVideoPlaybackRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Ltrivia/v1/SeekVideoPlaybackRequest;", "Lcom/squareup/wire/Message;", "", "seek_to_ms", "", "unknownFields", "Lokio/ByteString;", "<init>", "(JLokio/ByteString;)V", "getSeek_to_ms", "()J", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SeekVideoPlaybackRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SeekVideoPlaybackRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "seekToMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long seek_to_ms;

    public SeekVideoPlaybackRequest() {
        this(0L, null, 3, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30016newBuilder();
    }

    public final long getSeek_to_ms() {
        return this.seek_to_ms;
    }

    public /* synthetic */ SeekVideoPlaybackRequest(long j, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekVideoPlaybackRequest(long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.seek_to_ms = j;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30016newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SeekVideoPlaybackRequest)) {
            return false;
        }
        SeekVideoPlaybackRequest seekVideoPlaybackRequest = (SeekVideoPlaybackRequest) other;
        return Intrinsics.areEqual(unknownFields(), seekVideoPlaybackRequest.unknownFields()) && this.seek_to_ms == seekVideoPlaybackRequest.seek_to_ms;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Long.hashCode(this.seek_to_ms);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("seek_to_ms=" + this.seek_to_ms);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SeekVideoPlaybackRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SeekVideoPlaybackRequest copy$default(SeekVideoPlaybackRequest seekVideoPlaybackRequest, long j, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = seekVideoPlaybackRequest.seek_to_ms;
        }
        if ((i & 2) != 0) {
            byteString = seekVideoPlaybackRequest.unknownFields();
        }
        return seekVideoPlaybackRequest.copy(j, byteString);
    }

    public final SeekVideoPlaybackRequest copy(long seek_to_ms, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SeekVideoPlaybackRequest(seek_to_ms, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SeekVideoPlaybackRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SeekVideoPlaybackRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: trivia.v1.SeekVideoPlaybackRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SeekVideoPlaybackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getSeek_to_ms() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getSeek_to_ms())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SeekVideoPlaybackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSeek_to_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getSeek_to_ms()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SeekVideoPlaybackRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSeek_to_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getSeek_to_ms()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SeekVideoPlaybackRequest redact(SeekVideoPlaybackRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SeekVideoPlaybackRequest.copy$default(value, 0L, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SeekVideoPlaybackRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SeekVideoPlaybackRequest(jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
