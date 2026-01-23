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

/* compiled from: VideoBufferingEndedResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, m3636d2 = {"Ltrivia/v1/VideoBufferingEndedResponse;", "Lcom/squareup/wire/Message;", "", "seek_to_ms", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Lokio/ByteString;)V", "getSeek_to_ms", "()Ljava/lang/Long;", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Long;Lokio/ByteString;)Ltrivia/v1/VideoBufferingEndedResponse;", "Companion", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class VideoBufferingEndedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<VideoBufferingEndedResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "seekToMs", schemaIndex = 0, tag = 1)
    private final Long seek_to_ms;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoBufferingEndedResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30028newBuilder();
    }

    public final Long getSeek_to_ms() {
        return this.seek_to_ms;
    }

    public /* synthetic */ VideoBufferingEndedResponse(Long l, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBufferingEndedResponse(Long l, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.seek_to_ms = l;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30028newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VideoBufferingEndedResponse)) {
            return false;
        }
        VideoBufferingEndedResponse videoBufferingEndedResponse = (VideoBufferingEndedResponse) other;
        return Intrinsics.areEqual(unknownFields(), videoBufferingEndedResponse.unknownFields()) && Intrinsics.areEqual(this.seek_to_ms, videoBufferingEndedResponse.seek_to_ms);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.seek_to_ms;
        int iHashCode2 = iHashCode + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.seek_to_ms;
        if (l != null) {
            arrayList.add("seek_to_ms=" + l);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VideoBufferingEndedResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ VideoBufferingEndedResponse copy$default(VideoBufferingEndedResponse videoBufferingEndedResponse, Long l, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            l = videoBufferingEndedResponse.seek_to_ms;
        }
        if ((i & 2) != 0) {
            byteString = videoBufferingEndedResponse.unknownFields();
        }
        return videoBufferingEndedResponse.copy(l, byteString);
    }

    public final VideoBufferingEndedResponse copy(Long seek_to_ms, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new VideoBufferingEndedResponse(seek_to_ms, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(VideoBufferingEndedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<VideoBufferingEndedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: trivia.v1.VideoBufferingEndedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(VideoBufferingEndedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.INT64.encodedSizeWithTag(1, value.getSeek_to_ms());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, VideoBufferingEndedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) value.getSeek_to_ms());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, VideoBufferingEndedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) value.getSeek_to_ms());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public VideoBufferingEndedResponse redact(VideoBufferingEndedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return VideoBufferingEndedResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public VideoBufferingEndedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Long lDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new VideoBufferingEndedResponse(lDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        lDecode = ProtoAdapter.INT64.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
