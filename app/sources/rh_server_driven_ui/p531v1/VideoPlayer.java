package rh_server_driven_ui.p531v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.VideoPlayer;

/* compiled from: VideoPlayer.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000212B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010(\u001a\u00020\u0002H\u0017J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\u0089\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u00100R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00063"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayer;", "Lcom/squareup/wire/Message;", "", "video_url", "", "shows_playback_control", "", "content_mode", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "should_loop", "should_auto_play", "thumbnail_image_url", "shows_retry_when_failed", "shows_loading_indicator", "identifier", "aspect_ratio", "", "did_finish_playback", "Lrh_server_driven_ui/v1/Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLrh_server_driven_ui/v1/VideoPlayer$ContentMode;ZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/Float;Lrh_server_driven_ui/v1/Action;Lokio/ByteString;)V", "getVideo_url", "()Ljava/lang/String;", "getShows_playback_control", "()Z", "getContent_mode", "()Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "getShould_loop", "getShould_auto_play", "getThumbnail_image_url", "getShows_retry_when_failed", "getShows_loading_indicator", "getIdentifier", "getAspect_ratio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDid_finish_playback", "()Lrh_server_driven_ui/v1/Action;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;ZLrh_server_driven_ui/v1/VideoPlayer$ContentMode;ZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/Float;Lrh_server_driven_ui/v1/Action;Lokio/ByteString;)Lrh_server_driven_ui/v1/VideoPlayer;", "Companion", "ContentMode", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class VideoPlayer extends Message {

    @JvmField
    public static final ProtoAdapter<VideoPlayer> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "aspectRatio", schemaIndex = 9, tag = 10)
    private final Float aspect_ratio;

    @WireField(adapter = "rh_server_driven_ui.v1.VideoPlayer$ContentMode#ADAPTER", jsonName = "contentMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ContentMode content_mode;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", jsonName = "didFinishPlayback", schemaIndex = 10, tag = 11)
    private final Action did_finish_playback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldAutoPlay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean should_auto_play;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldLoop", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean should_loop;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showsLoadingIndicator", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean shows_loading_indicator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showsPlaybackControl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean shows_playback_control;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showsRetryWhenFailed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean shows_retry_when_failed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "thumbnailImageUrl", schemaIndex = 5, tag = 6)
    private final String thumbnail_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "videoUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String video_url;

    public VideoPlayer() {
        this(null, false, null, false, false, null, false, false, null, null, null, null, 4095, null);
    }

    public /* synthetic */ VideoPlayer(String str, boolean z, ContentMode contentMode, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, Float f, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ContentMode.CONTENT_MODE_UNSPECIFIED : contentMode, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z4, (i & 128) == 0 ? z5 : false, (i & 256) == 0 ? str3 : "", (i & 512) != 0 ? null : f, (i & 1024) == 0 ? action : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29868newBuilder();
    }

    public final String getVideo_url() {
        return this.video_url;
    }

    public final boolean getShows_playback_control() {
        return this.shows_playback_control;
    }

    public final ContentMode getContent_mode() {
        return this.content_mode;
    }

    public final boolean getShould_loop() {
        return this.should_loop;
    }

    public final boolean getShould_auto_play() {
        return this.should_auto_play;
    }

    public final String getThumbnail_image_url() {
        return this.thumbnail_image_url;
    }

    public final boolean getShows_retry_when_failed() {
        return this.shows_retry_when_failed;
    }

    public final boolean getShows_loading_indicator() {
        return this.shows_loading_indicator;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Float getAspect_ratio() {
        return this.aspect_ratio;
    }

    public final Action getDid_finish_playback() {
        return this.did_finish_playback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(String video_url, boolean z, ContentMode content_mode, boolean z2, boolean z3, String str, boolean z4, boolean z5, String identifier, Float f, Action action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(content_mode, "content_mode");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.video_url = video_url;
        this.shows_playback_control = z;
        this.content_mode = content_mode;
        this.should_loop = z2;
        this.should_auto_play = z3;
        this.thumbnail_image_url = str;
        this.shows_retry_when_failed = z4;
        this.shows_loading_indicator = z5;
        this.identifier = identifier;
        this.aspect_ratio = f;
        this.did_finish_playback = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29868newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VideoPlayer)) {
            return false;
        }
        VideoPlayer videoPlayer = (VideoPlayer) other;
        return Intrinsics.areEqual(unknownFields(), videoPlayer.unknownFields()) && Intrinsics.areEqual(this.video_url, videoPlayer.video_url) && this.shows_playback_control == videoPlayer.shows_playback_control && this.content_mode == videoPlayer.content_mode && this.should_loop == videoPlayer.should_loop && this.should_auto_play == videoPlayer.should_auto_play && Intrinsics.areEqual(this.thumbnail_image_url, videoPlayer.thumbnail_image_url) && this.shows_retry_when_failed == videoPlayer.shows_retry_when_failed && this.shows_loading_indicator == videoPlayer.shows_loading_indicator && Intrinsics.areEqual(this.identifier, videoPlayer.identifier) && Intrinsics.areEqual(this.aspect_ratio, videoPlayer.aspect_ratio) && Intrinsics.areEqual(this.did_finish_playback, videoPlayer.did_finish_playback);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.video_url.hashCode()) * 37) + Boolean.hashCode(this.shows_playback_control)) * 37) + this.content_mode.hashCode()) * 37) + Boolean.hashCode(this.should_loop)) * 37) + Boolean.hashCode(this.should_auto_play)) * 37;
        String str = this.thumbnail_image_url;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.shows_retry_when_failed)) * 37) + Boolean.hashCode(this.shows_loading_indicator)) * 37) + this.identifier.hashCode()) * 37;
        Float f = this.aspect_ratio;
        int iHashCode3 = (iHashCode2 + (f != null ? f.hashCode() : 0)) * 37;
        Action action = this.did_finish_playback;
        int iHashCode4 = iHashCode3 + (action != null ? action.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("video_url=" + Internal.sanitize(this.video_url));
        arrayList.add("shows_playback_control=" + this.shows_playback_control);
        arrayList.add("content_mode=" + this.content_mode);
        arrayList.add("should_loop=" + this.should_loop);
        arrayList.add("should_auto_play=" + this.should_auto_play);
        String str = this.thumbnail_image_url;
        if (str != null) {
            arrayList.add("thumbnail_image_url=" + Internal.sanitize(str));
        }
        arrayList.add("shows_retry_when_failed=" + this.shows_retry_when_failed);
        arrayList.add("shows_loading_indicator=" + this.shows_loading_indicator);
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        Float f = this.aspect_ratio;
        if (f != null) {
            arrayList.add("aspect_ratio=" + f);
        }
        Action action = this.did_finish_playback;
        if (action != null) {
            arrayList.add("did_finish_playback=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VideoPlayer{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ VideoPlayer copy$default(VideoPlayer videoPlayer, String str, boolean z, ContentMode contentMode, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, Float f, Action action, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoPlayer.video_url;
        }
        if ((i & 2) != 0) {
            z = videoPlayer.shows_playback_control;
        }
        if ((i & 4) != 0) {
            contentMode = videoPlayer.content_mode;
        }
        if ((i & 8) != 0) {
            z2 = videoPlayer.should_loop;
        }
        if ((i & 16) != 0) {
            z3 = videoPlayer.should_auto_play;
        }
        if ((i & 32) != 0) {
            str2 = videoPlayer.thumbnail_image_url;
        }
        if ((i & 64) != 0) {
            z4 = videoPlayer.shows_retry_when_failed;
        }
        if ((i & 128) != 0) {
            z5 = videoPlayer.shows_loading_indicator;
        }
        if ((i & 256) != 0) {
            str3 = videoPlayer.identifier;
        }
        if ((i & 512) != 0) {
            f = videoPlayer.aspect_ratio;
        }
        if ((i & 1024) != 0) {
            action = videoPlayer.did_finish_playback;
        }
        if ((i & 2048) != 0) {
            byteString = videoPlayer.unknownFields();
        }
        Action action2 = action;
        ByteString byteString2 = byteString;
        String str4 = str3;
        Float f2 = f;
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z3;
        String str5 = str2;
        return videoPlayer.copy(str, z, contentMode, z2, z8, str5, z6, z7, str4, f2, action2, byteString2);
    }

    public final VideoPlayer copy(String video_url, boolean shows_playback_control, ContentMode content_mode, boolean should_loop, boolean should_auto_play, String thumbnail_image_url, boolean shows_retry_when_failed, boolean shows_loading_indicator, String identifier, Float aspect_ratio, Action did_finish_playback, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(content_mode, "content_mode");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new VideoPlayer(video_url, shows_playback_control, content_mode, should_loop, should_auto_play, thumbnail_image_url, shows_retry_when_failed, shows_loading_indicator, identifier, aspect_ratio, did_finish_playback, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(VideoPlayer.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<VideoPlayer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.VideoPlayer$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(VideoPlayer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getVideo_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getVideo_url());
                }
                if (value.getShows_playback_control()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getShows_playback_control()));
                }
                if (value.getContent_mode() != VideoPlayer.ContentMode.CONTENT_MODE_UNSPECIFIED) {
                    size += VideoPlayer.ContentMode.ADAPTER.encodedSizeWithTag(3, value.getContent_mode());
                }
                if (value.getShould_loop()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getShould_loop()));
                }
                if (value.getShould_auto_play()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getShould_auto_play()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getThumbnail_image_url());
                if (value.getShows_retry_when_failed()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getShows_retry_when_failed()));
                }
                if (value.getShows_loading_indicator()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getShows_loading_indicator()));
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getIdentifier());
                }
                return iEncodedSizeWithTag + ProtoAdapter.FLOAT.encodedSizeWithTag(10, value.getAspect_ratio()) + Action.ADAPTER.encodedSizeWithTag(11, value.getDid_finish_playback());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, VideoPlayer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getVideo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVideo_url());
                }
                if (value.getShows_playback_control()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShows_playback_control()));
                }
                if (value.getContent_mode() != VideoPlayer.ContentMode.CONTENT_MODE_UNSPECIFIED) {
                    VideoPlayer.ContentMode.ADAPTER.encodeWithTag(writer, 3, (int) value.getContent_mode());
                }
                if (value.getShould_loop()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getShould_loop()));
                }
                if (value.getShould_auto_play()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getShould_auto_play()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getThumbnail_image_url());
                if (value.getShows_retry_when_failed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getShows_retry_when_failed()));
                }
                if (value.getShows_loading_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getShows_loading_indicator()));
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getIdentifier());
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 10, (int) value.getAspect_ratio());
                Action.ADAPTER.encodeWithTag(writer, 11, (int) value.getDid_finish_playback());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, VideoPlayer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Action.ADAPTER.encodeWithTag(writer, 11, (int) value.getDid_finish_playback());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 10, (int) value.getAspect_ratio());
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getIdentifier());
                }
                if (value.getShows_loading_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getShows_loading_indicator()));
                }
                if (value.getShows_retry_when_failed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getShows_retry_when_failed()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getThumbnail_image_url());
                if (value.getShould_auto_play()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getShould_auto_play()));
                }
                if (value.getShould_loop()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getShould_loop()));
                }
                if (value.getContent_mode() != VideoPlayer.ContentMode.CONTENT_MODE_UNSPECIFIED) {
                    VideoPlayer.ContentMode.ADAPTER.encodeWithTag(writer, 3, (int) value.getContent_mode());
                }
                if (value.getShows_playback_control()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShows_playback_control()));
                }
                if (Intrinsics.areEqual(value.getVideo_url(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getVideo_url());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0023. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public rh_server_driven_ui.p531v1.VideoPlayer decode(com.squareup.wire.ProtoReader r21) {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.VideoPlayer2.decode(com.squareup.wire.ProtoReader):rh_server_driven_ui.v1.VideoPlayer");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public VideoPlayer redact(VideoPlayer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action did_finish_playback = value.getDid_finish_playback();
                return VideoPlayer.copy$default(value, null, false, null, false, false, null, false, false, null, null, did_finish_playback != null ? Action.ADAPTER.redact(did_finish_playback) : null, ByteString.EMPTY, 1023, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPlayer.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTENT_MODE_UNSPECIFIED", "CONTENT_MODE_ASPECT_FIT", "CONTENT_MODE_ASPECT_FILL", "CONTENT_MODE_RESIZE", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContentMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentMode[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ContentMode> ADAPTER;
        public static final ContentMode CONTENT_MODE_ASPECT_FILL;
        public static final ContentMode CONTENT_MODE_ASPECT_FIT;
        public static final ContentMode CONTENT_MODE_RESIZE;
        public static final ContentMode CONTENT_MODE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ ContentMode[] $values() {
            return new ContentMode[]{CONTENT_MODE_UNSPECIFIED, CONTENT_MODE_ASPECT_FIT, CONTENT_MODE_ASPECT_FILL, CONTENT_MODE_RESIZE};
        }

        @JvmStatic
        public static final ContentMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ContentMode> getEntries() {
            return $ENTRIES;
        }

        private ContentMode(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ContentMode contentMode = new ContentMode("CONTENT_MODE_UNSPECIFIED", 0, 0);
            CONTENT_MODE_UNSPECIFIED = contentMode;
            CONTENT_MODE_ASPECT_FIT = new ContentMode("CONTENT_MODE_ASPECT_FIT", 1, 1);
            CONTENT_MODE_ASPECT_FILL = new ContentMode("CONTENT_MODE_ASPECT_FILL", 2, 2);
            CONTENT_MODE_RESIZE = new ContentMode("CONTENT_MODE_RESIZE", 3, 3);
            ContentMode[] contentModeArr$values = $values();
            $VALUES = contentModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentModeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContentMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ContentMode>(orCreateKotlinClass, syntax, contentMode) { // from class: rh_server_driven_ui.v1.VideoPlayer$ContentMode$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public VideoPlayer.ContentMode fromValue(int value) {
                    return VideoPlayer.ContentMode.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: VideoPlayer.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayer$ContentMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ContentMode fromValue(int value) {
                if (value == 0) {
                    return ContentMode.CONTENT_MODE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ContentMode.CONTENT_MODE_ASPECT_FIT;
                }
                if (value == 2) {
                    return ContentMode.CONTENT_MODE_ASPECT_FILL;
                }
                if (value != 3) {
                    return null;
                }
                return ContentMode.CONTENT_MODE_RESIZE;
            }
        }

        public static ContentMode valueOf(String str) {
            return (ContentMode) Enum.valueOf(ContentMode.class, str);
        }

        public static ContentMode[] values() {
            return (ContentMode[]) $VALUES.clone();
        }
    }
}
