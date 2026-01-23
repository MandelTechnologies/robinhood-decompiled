package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.VideoPlayer;
import rh_server_driven_ui.p531v1.VideoPlayerDto;

/* compiled from: VideoPlayerDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005879:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006<"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/VideoPlayer;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate;)V", "", "video_url", "", "shows_playback_control", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "content_mode", "should_loop", "should_auto_play", "thumbnail_image_url", "shows_retry_when_failed", "shows_loading_indicator", "identifier", "", "aspect_ratio", "Lrh_server_driven_ui/v1/ActionDto;", "did_finish_playback", "(Ljava/lang/String;ZLrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;ZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/Float;Lrh_server_driven_ui/v1/ActionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/VideoPlayer;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate;", "getVideo_url", "getShows_playback_control", "()Z", "getContent_mode", "()Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "getShould_loop", "getShould_auto_play", "getAspect_ratio", "()Ljava/lang/Float;", "getDid_finish_playback", "()Lrh_server_driven_ui/v1/ActionDto;", "Companion", "Surrogate", "ContentModeDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class VideoPlayerDto implements Dto3<VideoPlayer>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<VideoPlayerDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<VideoPlayerDto, VideoPlayer>> binaryBase64Serializer$delegate;
    private static final VideoPlayerDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ VideoPlayerDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private VideoPlayerDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getVideo_url() {
        return this.surrogate.getVideo_url();
    }

    public final boolean getShows_playback_control() {
        return this.surrogate.getShows_playback_control();
    }

    public final ContentModeDto getContent_mode() {
        return this.surrogate.getContent_mode();
    }

    public final boolean getShould_loop() {
        return this.surrogate.getShould_loop();
    }

    public final boolean getShould_auto_play() {
        return this.surrogate.getShould_auto_play();
    }

    public final Float getAspect_ratio() {
        return this.surrogate.getAspect_ratio();
    }

    public final ActionDto getDid_finish_playback() {
        return this.surrogate.getDid_finish_playback();
    }

    public /* synthetic */ VideoPlayerDto(String str, boolean z, ContentModeDto contentModeDto, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, Float f, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ContentModeDto.INSTANCE.getZeroValue() : contentModeDto, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z4, (i & 128) == 0 ? z5 : false, (i & 256) == 0 ? str3 : "", (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : actionDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayerDto(String video_url, boolean z, ContentModeDto content_mode, boolean z2, boolean z3, String str, boolean z4, boolean z5, String identifier, Float f, ActionDto actionDto) {
        this(new Surrogate(video_url, z, content_mode, z2, z3, str, z4, z5, identifier, f, actionDto));
        Intrinsics.checkNotNullParameter(video_url, "video_url");
        Intrinsics.checkNotNullParameter(content_mode, "content_mode");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public VideoPlayer toProto() {
        String video_url = this.surrogate.getVideo_url();
        boolean shows_playback_control = this.surrogate.getShows_playback_control();
        VideoPlayer.ContentMode contentMode = (VideoPlayer.ContentMode) this.surrogate.getContent_mode().toProto();
        boolean should_loop = this.surrogate.getShould_loop();
        boolean should_auto_play = this.surrogate.getShould_auto_play();
        String thumbnail_image_url = this.surrogate.getThumbnail_image_url();
        boolean shows_retry_when_failed = this.surrogate.getShows_retry_when_failed();
        boolean shows_loading_indicator = this.surrogate.getShows_loading_indicator();
        String identifier = this.surrogate.getIdentifier();
        Float aspect_ratio = this.surrogate.getAspect_ratio();
        ActionDto did_finish_playback = this.surrogate.getDid_finish_playback();
        return new VideoPlayer(video_url, shows_playback_control, contentMode, should_loop, should_auto_play, thumbnail_image_url, shows_retry_when_failed, shows_loading_indicator, identifier, aspect_ratio, did_finish_playback != null ? did_finish_playback.toProto() : null, null, 2048, null);
    }

    public String toString() {
        return "[VideoPlayerDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof VideoPlayerDto) && Intrinsics.areEqual(((VideoPlayerDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoPlayerDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002MLB\u008a\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u007f\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b9\u0010/\u001a\u0004\b8\u00102R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b;\u0010/\u001a\u0004\b:\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010&R \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b?\u0010/\u001a\u0004\b>\u00102R \u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\bA\u0010/\u001a\u0004\b@\u00102R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010,\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010&R1\u0010\u0012\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010D\u0012\u0004\bG\u0010/\u001a\u0004\bE\u0010FR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010H\u0012\u0004\bK\u0010/\u001a\u0004\bI\u0010J¨\u0006N"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate;", "", "", "video_url", "", "shows_playback_control", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "content_mode", "should_loop", "should_auto_play", "thumbnail_image_url", "shows_retry_when_failed", "shows_loading_indicator", "identifier", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "aspect_ratio", "Lrh_server_driven_ui/v1/ActionDto;", "did_finish_playback", "<init>", "(Ljava/lang/String;ZLrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;ZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/Float;Lrh_server_driven_ui/v1/ActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;ZZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/Float;Lrh_server_driven_ui/v1/ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideo_url", "getVideo_url$annotations", "()V", "Z", "getShows_playback_control", "()Z", "getShows_playback_control$annotations", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "getContent_mode", "()Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "getContent_mode$annotations", "getShould_loop", "getShould_loop$annotations", "getShould_auto_play", "getShould_auto_play$annotations", "getThumbnail_image_url", "getThumbnail_image_url$annotations", "getShows_retry_when_failed", "getShows_retry_when_failed$annotations", "getShows_loading_indicator", "getShows_loading_indicator$annotations", "getIdentifier", "getIdentifier$annotations", "Ljava/lang/Float;", "getAspect_ratio", "()Ljava/lang/Float;", "getAspect_ratio$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getDid_finish_playback", "()Lrh_server_driven_ui/v1/ActionDto;", "getDid_finish_playback$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Float aspect_ratio;
        private final ContentModeDto content_mode;
        private final ActionDto did_finish_playback;
        private final String identifier;
        private final boolean should_auto_play;
        private final boolean should_loop;
        private final boolean shows_loading_indicator;
        private final boolean shows_playback_control;
        private final boolean shows_retry_when_failed;
        private final String thumbnail_image_url;
        private final String video_url;

        public Surrogate() {
            this((String) null, false, (ContentModeDto) null, false, false, (String) null, false, false, (String) null, (Float) null, (ActionDto) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.video_url, surrogate.video_url) && this.shows_playback_control == surrogate.shows_playback_control && this.content_mode == surrogate.content_mode && this.should_loop == surrogate.should_loop && this.should_auto_play == surrogate.should_auto_play && Intrinsics.areEqual(this.thumbnail_image_url, surrogate.thumbnail_image_url) && this.shows_retry_when_failed == surrogate.shows_retry_when_failed && this.shows_loading_indicator == surrogate.shows_loading_indicator && Intrinsics.areEqual(this.identifier, surrogate.identifier) && Intrinsics.areEqual((Object) this.aspect_ratio, (Object) surrogate.aspect_ratio) && Intrinsics.areEqual(this.did_finish_playback, surrogate.did_finish_playback);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.video_url.hashCode() * 31) + Boolean.hashCode(this.shows_playback_control)) * 31) + this.content_mode.hashCode()) * 31) + Boolean.hashCode(this.should_loop)) * 31) + Boolean.hashCode(this.should_auto_play)) * 31;
            String str = this.thumbnail_image_url;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shows_retry_when_failed)) * 31) + Boolean.hashCode(this.shows_loading_indicator)) * 31) + this.identifier.hashCode()) * 31;
            Float f = this.aspect_ratio;
            int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            ActionDto actionDto = this.did_finish_playback;
            return iHashCode3 + (actionDto != null ? actionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(video_url=" + this.video_url + ", shows_playback_control=" + this.shows_playback_control + ", content_mode=" + this.content_mode + ", should_loop=" + this.should_loop + ", should_auto_play=" + this.should_auto_play + ", thumbnail_image_url=" + this.thumbnail_image_url + ", shows_retry_when_failed=" + this.shows_retry_when_failed + ", shows_loading_indicator=" + this.shows_loading_indicator + ", identifier=" + this.identifier + ", aspect_ratio=" + this.aspect_ratio + ", did_finish_playback=" + this.did_finish_playback + ")";
        }

        /* compiled from: VideoPlayerDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return VideoPlayerDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, ContentModeDto contentModeDto, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, Float f, ActionDto actionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.video_url = "";
            } else {
                this.video_url = str;
            }
            if ((i & 2) == 0) {
                this.shows_playback_control = false;
            } else {
                this.shows_playback_control = z;
            }
            if ((i & 4) == 0) {
                this.content_mode = ContentModeDto.INSTANCE.getZeroValue();
            } else {
                this.content_mode = contentModeDto;
            }
            if ((i & 8) == 0) {
                this.should_loop = false;
            } else {
                this.should_loop = z2;
            }
            if ((i & 16) == 0) {
                this.should_auto_play = false;
            } else {
                this.should_auto_play = z3;
            }
            if ((i & 32) == 0) {
                this.thumbnail_image_url = null;
            } else {
                this.thumbnail_image_url = str2;
            }
            if ((i & 64) == 0) {
                this.shows_retry_when_failed = false;
            } else {
                this.shows_retry_when_failed = z4;
            }
            if ((i & 128) == 0) {
                this.shows_loading_indicator = false;
            } else {
                this.shows_loading_indicator = z5;
            }
            if ((i & 256) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str3;
            }
            if ((i & 512) == 0) {
                this.aspect_ratio = null;
            } else {
                this.aspect_ratio = f;
            }
            if ((i & 1024) == 0) {
                this.did_finish_playback = null;
            } else {
                this.did_finish_playback = actionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.video_url, "")) {
                output.encodeStringElement(serialDesc, 0, self.video_url);
            }
            boolean z = self.shows_playback_control;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            if (self.content_mode != ContentModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ContentModeDto.Serializer.INSTANCE, self.content_mode);
            }
            boolean z2 = self.should_loop;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
            boolean z3 = self.should_auto_play;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 4, z3);
            }
            String str = self.thumbnail_image_url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            boolean z4 = self.shows_retry_when_failed;
            if (z4) {
                output.encodeBooleanElement(serialDesc, 6, z4);
            }
            boolean z5 = self.shows_loading_indicator;
            if (z5) {
                output.encodeBooleanElement(serialDesc, 7, z5);
            }
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 8, self.identifier);
            }
            Float f = self.aspect_ratio;
            if (f != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, FloatAsNumberSerializer.INSTANCE, f);
            }
            ActionDto actionDto = self.did_finish_playback;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ActionDto.Serializer.INSTANCE, actionDto);
            }
        }

        public Surrogate(String video_url, boolean z, ContentModeDto content_mode, boolean z2, boolean z3, String str, boolean z4, boolean z5, String identifier, Float f, ActionDto actionDto) {
            Intrinsics.checkNotNullParameter(video_url, "video_url");
            Intrinsics.checkNotNullParameter(content_mode, "content_mode");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
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
            this.did_finish_playback = actionDto;
        }

        public /* synthetic */ Surrogate(String str, boolean z, ContentModeDto contentModeDto, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, Float f, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ContentModeDto.INSTANCE.getZeroValue() : contentModeDto, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z4, (i & 128) == 0 ? z5 : false, (i & 256) == 0 ? str3 : "", (i & 512) != 0 ? null : f, (i & 1024) != 0 ? null : actionDto);
        }

        public final String getVideo_url() {
            return this.video_url;
        }

        public final boolean getShows_playback_control() {
            return this.shows_playback_control;
        }

        public final ContentModeDto getContent_mode() {
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

        public final ActionDto getDid_finish_playback() {
            return this.did_finish_playback;
        }
    }

    /* compiled from: VideoPlayerDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/VideoPlayerDto;", "Lrh_server_driven_ui/v1/VideoPlayer;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/VideoPlayerDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<VideoPlayerDto, VideoPlayer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VideoPlayerDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<VideoPlayerDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<VideoPlayerDto> getBinaryBase64Serializer() {
            return (KSerializer) VideoPlayerDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<VideoPlayer> getProtoAdapter() {
            return VideoPlayer.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public VideoPlayerDto getZeroValue() {
            return VideoPlayerDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public VideoPlayerDto fromProto(VideoPlayer proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String video_url = proto.getVideo_url();
            boolean shows_playback_control = proto.getShows_playback_control();
            ContentModeDto contentModeDtoFromProto = ContentModeDto.INSTANCE.fromProto(proto.getContent_mode());
            boolean should_loop = proto.getShould_loop();
            boolean should_auto_play = proto.getShould_auto_play();
            String thumbnail_image_url = proto.getThumbnail_image_url();
            boolean shows_retry_when_failed = proto.getShows_retry_when_failed();
            boolean shows_loading_indicator = proto.getShows_loading_indicator();
            String identifier = proto.getIdentifier();
            Float aspect_ratio = proto.getAspect_ratio();
            Action did_finish_playback = proto.getDid_finish_playback();
            return new VideoPlayerDto(new Surrogate(video_url, shows_playback_control, contentModeDtoFromProto, should_loop, should_auto_play, thumbnail_image_url, shows_retry_when_failed, shows_loading_indicator, identifier, aspect_ratio, did_finish_playback != null ? ActionDto.INSTANCE.fromProto(did_finish_playback) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.VideoPlayerDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoPlayerDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new VideoPlayerDto(null, false, null, false, false, null, false, false, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPlayerDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT_MODE_UNSPECIFIED", "CONTENT_MODE_ASPECT_FIT", "CONTENT_MODE_ASPECT_FILL", "CONTENT_MODE_RESIZE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContentModeDto implements Dto2<VideoPlayer.ContentMode>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentModeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ContentModeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContentModeDto, VideoPlayer.ContentMode>> binaryBase64Serializer$delegate;
        public static final ContentModeDto CONTENT_MODE_UNSPECIFIED = new CONTENT_MODE_UNSPECIFIED("CONTENT_MODE_UNSPECIFIED", 0);
        public static final ContentModeDto CONTENT_MODE_ASPECT_FIT = new CONTENT_MODE_ASPECT_FIT("CONTENT_MODE_ASPECT_FIT", 1);
        public static final ContentModeDto CONTENT_MODE_ASPECT_FILL = new CONTENT_MODE_ASPECT_FILL("CONTENT_MODE_ASPECT_FILL", 2);
        public static final ContentModeDto CONTENT_MODE_RESIZE = new CONTENT_MODE_RESIZE("CONTENT_MODE_RESIZE", 3);

        private static final /* synthetic */ ContentModeDto[] $values() {
            return new ContentModeDto[]{CONTENT_MODE_UNSPECIFIED, CONTENT_MODE_ASPECT_FIT, CONTENT_MODE_ASPECT_FILL, CONTENT_MODE_RESIZE};
        }

        public /* synthetic */ ContentModeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ContentModeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: VideoPlayerDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/VideoPlayerDto.ContentModeDto.CONTENT_MODE_UNSPECIFIED", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "toProto", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTENT_MODE_UNSPECIFIED extends ContentModeDto {
            CONTENT_MODE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public VideoPlayer.ContentMode toProto() {
                return VideoPlayer.ContentMode.CONTENT_MODE_UNSPECIFIED;
            }
        }

        private ContentModeDto(String str, int i) {
        }

        static {
            ContentModeDto[] contentModeDtoArr$values = $values();
            $VALUES = contentModeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentModeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.VideoPlayerDto$ContentModeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VideoPlayerDto.ContentModeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: VideoPlayerDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/VideoPlayerDto.ContentModeDto.CONTENT_MODE_ASPECT_FIT", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "toProto", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTENT_MODE_ASPECT_FIT extends ContentModeDto {
            CONTENT_MODE_ASPECT_FIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public VideoPlayer.ContentMode toProto() {
                return VideoPlayer.ContentMode.CONTENT_MODE_ASPECT_FIT;
            }
        }

        /* compiled from: VideoPlayerDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/VideoPlayerDto.ContentModeDto.CONTENT_MODE_ASPECT_FILL", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "toProto", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTENT_MODE_ASPECT_FILL extends ContentModeDto {
            CONTENT_MODE_ASPECT_FILL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public VideoPlayer.ContentMode toProto() {
                return VideoPlayer.ContentMode.CONTENT_MODE_ASPECT_FILL;
            }
        }

        /* compiled from: VideoPlayerDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/VideoPlayerDto.ContentModeDto.CONTENT_MODE_RESIZE", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "toProto", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTENT_MODE_RESIZE extends ContentModeDto {
            CONTENT_MODE_RESIZE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public VideoPlayer.ContentMode toProto() {
                return VideoPlayer.ContentMode.CONTENT_MODE_RESIZE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: VideoPlayerDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "Lrh_server_driven_ui/v1/VideoPlayer$ContentMode;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ContentModeDto, VideoPlayer.ContentMode> {

            /* compiled from: VideoPlayerDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VideoPlayer.ContentMode.values().length];
                    try {
                        iArr[VideoPlayer.ContentMode.CONTENT_MODE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[VideoPlayer.ContentMode.CONTENT_MODE_ASPECT_FIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[VideoPlayer.ContentMode.CONTENT_MODE_ASPECT_FILL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[VideoPlayer.ContentMode.CONTENT_MODE_RESIZE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ContentModeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContentModeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContentModeDto> getBinaryBase64Serializer() {
                return (KSerializer) ContentModeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<VideoPlayer.ContentMode> getProtoAdapter() {
                return VideoPlayer.ContentMode.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentModeDto getZeroValue() {
                return ContentModeDto.CONTENT_MODE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentModeDto fromProto(VideoPlayer.ContentMode proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ContentModeDto.CONTENT_MODE_UNSPECIFIED;
                }
                if (i == 2) {
                    return ContentModeDto.CONTENT_MODE_ASPECT_FIT;
                }
                if (i == 3) {
                    return ContentModeDto.CONTENT_MODE_ASPECT_FILL;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return ContentModeDto.CONTENT_MODE_RESIZE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: VideoPlayerDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/VideoPlayerDto$ContentModeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ContentModeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ContentModeDto, VideoPlayer.ContentMode> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.VideoPlayer.ContentMode", ContentModeDto.getEntries(), ContentModeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ContentModeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ContentModeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ContentModeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ContentModeDto valueOf(String str) {
            return (ContentModeDto) Enum.valueOf(ContentModeDto.class, str);
        }

        public static ContentModeDto[] values() {
            return (ContentModeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoPlayerDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/VideoPlayerDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/VideoPlayerDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<VideoPlayerDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.VideoPlayer", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, VideoPlayerDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public VideoPlayerDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new VideoPlayerDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: VideoPlayerDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/VideoPlayerDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.VideoPlayerDto";
        }
    }
}
