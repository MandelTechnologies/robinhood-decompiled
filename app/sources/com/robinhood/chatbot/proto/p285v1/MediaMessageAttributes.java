package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: MediaMessageAttributes.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MediaMessageAttributes;", "Lcom/squareup/wire/Message;", "", "type", "Lcom/robinhood/chatbot/proto/v1/MediaMessageType;", "youtube_video_data", "Lcom/robinhood/chatbot/proto/v1/YoutubeVideoData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MediaMessageType;Lcom/robinhood/chatbot/proto/v1/YoutubeVideoData;Lokio/ByteString;)V", "getType", "()Lcom/robinhood/chatbot/proto/v1/MediaMessageType;", "getYoutube_video_data", "()Lcom/robinhood/chatbot/proto/v1/YoutubeVideoData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class MediaMessageAttributes extends Message {

    @JvmField
    public static final ProtoAdapter<MediaMessageAttributes> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MediaMessageType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MediaMessageType type;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.YoutubeVideoData#ADAPTER", jsonName = "youtubeVideoData", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 1, tag = 2)
    private final YoutubeVideoData youtube_video_data;

    public MediaMessageAttributes() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20520newBuilder();
    }

    public final MediaMessageType getType() {
        return this.type;
    }

    public /* synthetic */ MediaMessageAttributes(MediaMessageType mediaMessageType, YoutubeVideoData youtubeVideoData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MediaMessageType.MEDIA_MESSAGE_TYPE_UNSPECIFIED : mediaMessageType, (i & 2) != 0 ? null : youtubeVideoData, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final YoutubeVideoData getYoutube_video_data() {
        return this.youtube_video_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaMessageAttributes(MediaMessageType type2, YoutubeVideoData youtubeVideoData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.youtube_video_data = youtubeVideoData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20520newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MediaMessageAttributes)) {
            return false;
        }
        MediaMessageAttributes mediaMessageAttributes = (MediaMessageAttributes) other;
        return Intrinsics.areEqual(unknownFields(), mediaMessageAttributes.unknownFields()) && this.type == mediaMessageAttributes.type && Intrinsics.areEqual(this.youtube_video_data, mediaMessageAttributes.youtube_video_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37;
        YoutubeVideoData youtubeVideoData = this.youtube_video_data;
        int iHashCode2 = iHashCode + (youtubeVideoData != null ? youtubeVideoData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        YoutubeVideoData youtubeVideoData = this.youtube_video_data;
        if (youtubeVideoData != null) {
            arrayList.add("youtube_video_data=" + youtubeVideoData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MediaMessageAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MediaMessageAttributes copy$default(MediaMessageAttributes mediaMessageAttributes, MediaMessageType mediaMessageType, YoutubeVideoData youtubeVideoData, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaMessageType = mediaMessageAttributes.type;
        }
        if ((i & 2) != 0) {
            youtubeVideoData = mediaMessageAttributes.youtube_video_data;
        }
        if ((i & 4) != 0) {
            byteString = mediaMessageAttributes.unknownFields();
        }
        return mediaMessageAttributes.copy(mediaMessageType, youtubeVideoData, byteString);
    }

    public final MediaMessageAttributes copy(MediaMessageType type2, YoutubeVideoData youtube_video_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MediaMessageAttributes(type2, youtube_video_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MediaMessageAttributes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MediaMessageAttributes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.MediaMessageAttributes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MediaMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != MediaMessageType.MEDIA_MESSAGE_TYPE_UNSPECIFIED) {
                    size += MediaMessageType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                return size + YoutubeVideoData.ADAPTER.encodedSizeWithTag(2, value.getYoutube_video_data());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MediaMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != MediaMessageType.MEDIA_MESSAGE_TYPE_UNSPECIFIED) {
                    MediaMessageType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                YoutubeVideoData.ADAPTER.encodeWithTag(writer, 2, (int) value.getYoutube_video_data());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MediaMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                YoutubeVideoData.ADAPTER.encodeWithTag(writer, 2, (int) value.getYoutube_video_data());
                if (value.getType() != MediaMessageType.MEDIA_MESSAGE_TYPE_UNSPECIFIED) {
                    MediaMessageType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MediaMessageAttributes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MediaMessageType mediaMessageTypeDecode = MediaMessageType.MEDIA_MESSAGE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                YoutubeVideoData youtubeVideoDataDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MediaMessageAttributes(mediaMessageTypeDecode, youtubeVideoDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            mediaMessageTypeDecode = MediaMessageType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        youtubeVideoDataDecode = YoutubeVideoData.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MediaMessageAttributes redact(MediaMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                YoutubeVideoData youtube_video_data = value.getYoutube_video_data();
                return MediaMessageAttributes.copy$default(value, null, youtube_video_data != null ? YoutubeVideoData.ADAPTER.redact(youtube_video_data) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
