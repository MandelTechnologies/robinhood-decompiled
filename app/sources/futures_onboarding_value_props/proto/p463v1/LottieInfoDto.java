package futures_onboarding_value_props.proto.p463v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import futures_onboarding_value_props.proto.p463v1.LottieInfo;
import futures_onboarding_value_props.proto.p463v1.LottieInfoDto;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: LottieInfoDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007+*,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00061"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfo;", "Landroid/os/Parcelable;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate;", "surrogate", "<init>", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate;)V", "", "light_mode_url", "dark_mode_url", "light_mode_name", "dark_mode_name", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto;", "playback_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto;)V", "toProto", "()Lfutures_onboarding_value_props/proto/v1/LottieInfo;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate;", "getLight_mode_url", "getDark_mode_url", "getLight_mode_name", "getDark_mode_name", "getPlayback_type", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto;", "Companion", "Surrogate", "PlaybackTypeDto", "PlayOnceAndHoldFinalFrameDto", "LoopSectionDto", "Serializer", "MultibindingModule", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class LottieInfoDto implements Dto3<LottieInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LottieInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LottieInfoDto, LottieInfo>> binaryBase64Serializer$delegate;
    private static final LottieInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LottieInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LottieInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getLight_mode_url() {
        return this.surrogate.getLight_mode_url();
    }

    public final String getDark_mode_url() {
        return this.surrogate.getDark_mode_url();
    }

    public final String getLight_mode_name() {
        return this.surrogate.getLight_mode_name();
    }

    public final String getDark_mode_name() {
        return this.surrogate.getDark_mode_name();
    }

    public final PlaybackTypeDto getPlayback_type() {
        if (this.surrogate.getPlay_once_and_hold_final_frame() != null) {
            return new PlaybackTypeDto.PlayOnceAndHoldFinalFrame(this.surrogate.getPlay_once_and_hold_final_frame());
        }
        if (this.surrogate.getLoop_section() != null) {
            return new PlaybackTypeDto.LoopSection(this.surrogate.getLoop_section());
        }
        return null;
    }

    public /* synthetic */ LottieInfoDto(String str, String str2, String str3, String str4, PlaybackTypeDto playbackTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : playbackTypeDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LottieInfoDto(String light_mode_url, String dark_mode_url, String light_mode_name, String dark_mode_name, PlaybackTypeDto playbackTypeDto) {
        Intrinsics.checkNotNullParameter(light_mode_url, "light_mode_url");
        Intrinsics.checkNotNullParameter(dark_mode_url, "dark_mode_url");
        Intrinsics.checkNotNullParameter(light_mode_name, "light_mode_name");
        Intrinsics.checkNotNullParameter(dark_mode_name, "dark_mode_name");
        PlaybackTypeDto.PlayOnceAndHoldFinalFrame playOnceAndHoldFinalFrame = playbackTypeDto instanceof PlaybackTypeDto.PlayOnceAndHoldFinalFrame ? (PlaybackTypeDto.PlayOnceAndHoldFinalFrame) playbackTypeDto : null;
        PlayOnceAndHoldFinalFrameDto value = playOnceAndHoldFinalFrame != null ? playOnceAndHoldFinalFrame.getValue() : null;
        PlaybackTypeDto.LoopSection loopSection = playbackTypeDto instanceof PlaybackTypeDto.LoopSection ? (PlaybackTypeDto.LoopSection) playbackTypeDto : null;
        this(new Surrogate(light_mode_url, dark_mode_url, light_mode_name, dark_mode_name, value, loopSection != null ? loopSection.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public LottieInfo toProto() {
        String light_mode_url = this.surrogate.getLight_mode_url();
        String dark_mode_url = this.surrogate.getDark_mode_url();
        String light_mode_name = this.surrogate.getLight_mode_name();
        String dark_mode_name = this.surrogate.getDark_mode_name();
        PlayOnceAndHoldFinalFrameDto play_once_and_hold_final_frame = this.surrogate.getPlay_once_and_hold_final_frame();
        LottieInfo.PlayOnceAndHoldFinalFrame proto = play_once_and_hold_final_frame != null ? play_once_and_hold_final_frame.toProto() : null;
        LoopSectionDto loop_section = this.surrogate.getLoop_section();
        return new LottieInfo(proto, loop_section != null ? loop_section.toProto() : null, light_mode_url, dark_mode_url, light_mode_name, dark_mode_name, null, 64, null);
    }

    public String toString() {
        return "[LottieInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LottieInfoDto) && Intrinsics.areEqual(((LottieInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: LottieInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010&\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate;", "", "", "light_mode_url", "dark_mode_url", "light_mode_name", "dark_mode_name", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "play_once_and_hold_final_frame", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "loop_section", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$futures_onboarding_value_props_proto_v1_externalRelease", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLight_mode_url", "getLight_mode_url$annotations", "()V", "getDark_mode_url", "getDark_mode_url$annotations", "getLight_mode_name", "getLight_mode_name$annotations", "getDark_mode_name", "getDark_mode_name$annotations", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "getPlay_once_and_hold_final_frame", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "getPlay_once_and_hold_final_frame$annotations", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "getLoop_section", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "getLoop_section$annotations", "Companion", "$serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String dark_mode_name;
        private final String dark_mode_url;
        private final String light_mode_name;
        private final String light_mode_url;
        private final LoopSectionDto loop_section;
        private final PlayOnceAndHoldFinalFrameDto play_once_and_hold_final_frame;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (PlayOnceAndHoldFinalFrameDto) null, (LoopSectionDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.light_mode_url, surrogate.light_mode_url) && Intrinsics.areEqual(this.dark_mode_url, surrogate.dark_mode_url) && Intrinsics.areEqual(this.light_mode_name, surrogate.light_mode_name) && Intrinsics.areEqual(this.dark_mode_name, surrogate.dark_mode_name) && Intrinsics.areEqual(this.play_once_and_hold_final_frame, surrogate.play_once_and_hold_final_frame) && Intrinsics.areEqual(this.loop_section, surrogate.loop_section);
        }

        public int hashCode() {
            int iHashCode = ((((((this.light_mode_url.hashCode() * 31) + this.dark_mode_url.hashCode()) * 31) + this.light_mode_name.hashCode()) * 31) + this.dark_mode_name.hashCode()) * 31;
            PlayOnceAndHoldFinalFrameDto playOnceAndHoldFinalFrameDto = this.play_once_and_hold_final_frame;
            int iHashCode2 = (iHashCode + (playOnceAndHoldFinalFrameDto == null ? 0 : playOnceAndHoldFinalFrameDto.hashCode())) * 31;
            LoopSectionDto loopSectionDto = this.loop_section;
            return iHashCode2 + (loopSectionDto != null ? loopSectionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(light_mode_url=" + this.light_mode_url + ", dark_mode_url=" + this.dark_mode_url + ", light_mode_name=" + this.light_mode_name + ", dark_mode_name=" + this.dark_mode_name + ", play_once_and_hold_final_frame=" + this.play_once_and_hold_final_frame + ", loop_section=" + this.loop_section + ")";
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LottieInfoDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, PlayOnceAndHoldFinalFrameDto playOnceAndHoldFinalFrameDto, LoopSectionDto loopSectionDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.light_mode_url = "";
            } else {
                this.light_mode_url = str;
            }
            if ((i & 2) == 0) {
                this.dark_mode_url = "";
            } else {
                this.dark_mode_url = str2;
            }
            if ((i & 4) == 0) {
                this.light_mode_name = "";
            } else {
                this.light_mode_name = str3;
            }
            if ((i & 8) == 0) {
                this.dark_mode_name = "";
            } else {
                this.dark_mode_name = str4;
            }
            if ((i & 16) == 0) {
                this.play_once_and_hold_final_frame = null;
            } else {
                this.play_once_and_hold_final_frame = playOnceAndHoldFinalFrameDto;
            }
            if ((i & 32) == 0) {
                this.loop_section = null;
            } else {
                this.loop_section = loopSectionDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$futures_onboarding_value_props_proto_v1_externalRelease */
        public static final /* synthetic */ void m3289x9ef7d20e(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.light_mode_url, "")) {
                output.encodeStringElement(serialDesc, 0, self.light_mode_url);
            }
            if (!Intrinsics.areEqual(self.dark_mode_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.dark_mode_url);
            }
            if (!Intrinsics.areEqual(self.light_mode_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.light_mode_name);
            }
            if (!Intrinsics.areEqual(self.dark_mode_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.dark_mode_name);
            }
            PlayOnceAndHoldFinalFrameDto playOnceAndHoldFinalFrameDto = self.play_once_and_hold_final_frame;
            if (playOnceAndHoldFinalFrameDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PlayOnceAndHoldFinalFrameDto.Serializer.INSTANCE, playOnceAndHoldFinalFrameDto);
            }
            LoopSectionDto loopSectionDto = self.loop_section;
            if (loopSectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, LoopSectionDto.Serializer.INSTANCE, loopSectionDto);
            }
        }

        public Surrogate(String light_mode_url, String dark_mode_url, String light_mode_name, String dark_mode_name, PlayOnceAndHoldFinalFrameDto playOnceAndHoldFinalFrameDto, LoopSectionDto loopSectionDto) {
            Intrinsics.checkNotNullParameter(light_mode_url, "light_mode_url");
            Intrinsics.checkNotNullParameter(dark_mode_url, "dark_mode_url");
            Intrinsics.checkNotNullParameter(light_mode_name, "light_mode_name");
            Intrinsics.checkNotNullParameter(dark_mode_name, "dark_mode_name");
            this.light_mode_url = light_mode_url;
            this.dark_mode_url = dark_mode_url;
            this.light_mode_name = light_mode_name;
            this.dark_mode_name = dark_mode_name;
            this.play_once_and_hold_final_frame = playOnceAndHoldFinalFrameDto;
            this.loop_section = loopSectionDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, PlayOnceAndHoldFinalFrameDto playOnceAndHoldFinalFrameDto, LoopSectionDto loopSectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : playOnceAndHoldFinalFrameDto, (i & 32) != 0 ? null : loopSectionDto);
        }

        public final String getLight_mode_url() {
            return this.light_mode_url;
        }

        public final String getDark_mode_url() {
            return this.dark_mode_url;
        }

        public final String getLight_mode_name() {
            return this.light_mode_name;
        }

        public final String getDark_mode_name() {
            return this.dark_mode_name;
        }

        public final PlayOnceAndHoldFinalFrameDto getPlay_once_and_hold_final_frame() {
            return this.play_once_and_hold_final_frame;
        }

        public final LoopSectionDto getLoop_section() {
            return this.loop_section;
        }
    }

    /* compiled from: LottieInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LottieInfoDto, LottieInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LottieInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LottieInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LottieInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) LottieInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LottieInfo> getProtoAdapter() {
            return LottieInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LottieInfoDto getZeroValue() {
            return LottieInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LottieInfoDto fromProto(LottieInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String light_mode_url = proto.getLight_mode_url();
            String dark_mode_url = proto.getDark_mode_url();
            String light_mode_name = proto.getLight_mode_name();
            String dark_mode_name = proto.getDark_mode_name();
            LottieInfo.PlayOnceAndHoldFinalFrame play_once_and_hold_final_frame = proto.getPlay_once_and_hold_final_frame();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PlayOnceAndHoldFinalFrameDto playOnceAndHoldFinalFrameDtoFromProto = play_once_and_hold_final_frame != null ? PlayOnceAndHoldFinalFrameDto.INSTANCE.fromProto(play_once_and_hold_final_frame) : null;
            LottieInfo.LoopSection loop_section = proto.getLoop_section();
            return new LottieInfoDto(new Surrogate(light_mode_url, dark_mode_url, light_mode_name, dark_mode_name, playOnceAndHoldFinalFrameDtoFromProto, loop_section != null ? LoopSectionDto.INSTANCE.fromProto(loop_section) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_onboarding_value_props.proto.v1.LottieInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LottieInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LottieInfoDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LottieInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PlayOnceAndHoldFinalFrame", "LoopSection", "Companion", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto$LoopSection;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto$PlayOnceAndHoldFinalFrame;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class PlaybackTypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ PlaybackTypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PlaybackTypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto$PlayOnceAndHoldFinalFrame;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "value", "<init>", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "getValue", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlayOnceAndHoldFinalFrame extends PlaybackTypeDto {
            private final PlayOnceAndHoldFinalFrameDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlayOnceAndHoldFinalFrame) && Intrinsics.areEqual(this.value, ((PlayOnceAndHoldFinalFrame) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlayOnceAndHoldFinalFrame(value=" + this.value + ")";
            }

            public final PlayOnceAndHoldFinalFrameDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayOnceAndHoldFinalFrame(PlayOnceAndHoldFinalFrameDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto$LoopSection;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "value", "<init>", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "getValue", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LoopSection extends PlaybackTypeDto {
            private final LoopSectionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LoopSection) && Intrinsics.areEqual(this.value, ((LoopSection) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "LoopSection(value=" + this.value + ")";
            }

            public final LoopSectionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoopSection(LoopSectionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlaybackTypeDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfo;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Companion implements Dto4.Creator<PlaybackTypeDto, LottieInfo> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<LottieInfo> getProtoAdapter() {
                return LottieInfo.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PlaybackTypeDto fromProto(LottieInfo proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPlay_once_and_hold_final_frame() != null) {
                    return new PlayOnceAndHoldFinalFrame(PlayOnceAndHoldFinalFrameDto.INSTANCE.fromProto(proto.getPlay_once_and_hold_final_frame()));
                }
                if (proto.getLoop_section() != null) {
                    return new LoopSection(LoopSectionDto.INSTANCE.fromProto(proto.getLoop_section()));
                }
                return null;
            }
        }
    }

    /* compiled from: LottieInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "Lcom/robinhood/idl/MessageDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfo$PlayOnceAndHoldFinalFrame;", "Landroid/os/Parcelable;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Surrogate;", "surrogate", "<init>", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Surrogate;)V", "()V", "toProto", "()Lfutures_onboarding_value_props/proto/v1/LottieInfo$PlayOnceAndHoldFinalFrame;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PlayOnceAndHoldFinalFrameDto implements Dto3<LottieInfo.PlayOnceAndHoldFinalFrame>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<PlayOnceAndHoldFinalFrameDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PlayOnceAndHoldFinalFrameDto, LottieInfo.PlayOnceAndHoldFinalFrame>> binaryBase64Serializer$delegate;
        private static final PlayOnceAndHoldFinalFrameDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ PlayOnceAndHoldFinalFrameDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PlayOnceAndHoldFinalFrameDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public PlayOnceAndHoldFinalFrameDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public LottieInfo.PlayOnceAndHoldFinalFrame toProto() {
            return new LottieInfo.PlayOnceAndHoldFinalFrame(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[PlayOnceAndHoldFinalFrameDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof PlayOnceAndHoldFinalFrameDto) && Intrinsics.areEqual(((PlayOnceAndHoldFinalFrameDto) other).surrogate, this.surrogate);
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
        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: futures_onboarding_value_props.proto.v1.LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LottieInfoDto.PlayOnceAndHoldFinalFrameDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 1843941017;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("futures_onboarding_value_props.proto.v1.LottieInfoDto.PlayOnceAndHoldFinalFrameDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfo$PlayOnceAndHoldFinalFrame;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<PlayOnceAndHoldFinalFrameDto, LottieInfo.PlayOnceAndHoldFinalFrame> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PlayOnceAndHoldFinalFrameDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PlayOnceAndHoldFinalFrameDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PlayOnceAndHoldFinalFrameDto> getBinaryBase64Serializer() {
                return (KSerializer) PlayOnceAndHoldFinalFrameDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<LottieInfo.PlayOnceAndHoldFinalFrame> getProtoAdapter() {
                return LottieInfo.PlayOnceAndHoldFinalFrame.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PlayOnceAndHoldFinalFrameDto getZeroValue() {
                return PlayOnceAndHoldFinalFrameDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PlayOnceAndHoldFinalFrameDto fromProto(LottieInfo.PlayOnceAndHoldFinalFrame proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new PlayOnceAndHoldFinalFrameDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_onboarding_value_props.proto.v1.LottieInfoDto$PlayOnceAndHoldFinalFrameDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LottieInfoDto.PlayOnceAndHoldFinalFrameDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new PlayOnceAndHoldFinalFrameDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto;", "<init>", "()V", "surrogateSerializer", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Serializer implements KSerializer<PlayOnceAndHoldFinalFrameDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/futures_onboarding_value_props.proto.v1.LottieInfo.PlayOnceAndHoldFinalFrame", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PlayOnceAndHoldFinalFrameDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public PlayOnceAndHoldFinalFrameDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new PlayOnceAndHoldFinalFrameDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$PlayOnceAndHoldFinalFrameDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "futures_onboarding_value_props.proto.v1.LottieInfoDto$PlayOnceAndHoldFinalFrameDto";
            }
        }
    }

    /* compiled from: LottieInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017¨\u0006&"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfo$LoopSection;", "Landroid/os/Parcelable;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate;", "surrogate", "<init>", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate;)V", "", "start_frame", "end_frame", "(II)V", "toProto", "()Lfutures_onboarding_value_props/proto/v1/LottieInfo$LoopSection;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate;", "getStart_frame", "getEnd_frame", "Companion", "Surrogate", "Serializer", "MultibindingModule", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class LoopSectionDto implements Dto3<LottieInfo.LoopSection>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<LoopSectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<LoopSectionDto, LottieInfo.LoopSection>> binaryBase64Serializer$delegate;
        private static final LoopSectionDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ LoopSectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private LoopSectionDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final int getStart_frame() {
            return this.surrogate.getStart_frame();
        }

        public final int getEnd_frame() {
            return this.surrogate.getEnd_frame();
        }

        public LoopSectionDto(int i, int i2) {
            this(new Surrogate(i, i2));
        }

        public /* synthetic */ LoopSectionDto(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }

        @Override // com.robinhood.idl.Dto
        public LottieInfo.LoopSection toProto() {
            return new LottieInfo.LoopSection(this.surrogate.getStart_frame(), this.surrogate.getEnd_frame(), null, 4, null);
        }

        public String toString() {
            return "[LoopSectionDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof LoopSectionDto) && Intrinsics.areEqual(((LoopSectionDto) other).surrogate, this.surrogate);
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
        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B9\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\b\u0010\tB+\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001bR/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u001b¨\u0006("}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "start_frame", "end_frame", "<init>", "(II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$futures_onboarding_value_props_proto_v1_externalRelease", "(Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStart_frame", "getStart_frame$annotations", "()V", "getEnd_frame", "getEnd_frame$annotations", "Companion", "$serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int end_frame;
            private final int start_frame;

            /* JADX WARN: Illegal instructions before constructor call */
            public Surrogate() {
                int i = 0;
                this(i, i, 3, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.start_frame == surrogate.start_frame && this.end_frame == surrogate.end_frame;
            }

            public int hashCode() {
                return (Integer.hashCode(this.start_frame) * 31) + Integer.hashCode(this.end_frame);
            }

            public String toString() {
                return "Surrogate(start_frame=" + this.start_frame + ", end_frame=" + this.end_frame + ")";
            }

            /* compiled from: LottieInfoDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return LottieInfoDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.start_frame = 0;
                } else {
                    this.start_frame = i2;
                }
                if ((i & 2) == 0) {
                    this.end_frame = 0;
                } else {
                    this.end_frame = i3;
                }
            }

            @JvmStatic
            /* renamed from: write$Self$futures_onboarding_value_props_proto_v1_externalRelease */
            public static final /* synthetic */ void m3288x9ef7d20e(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                int i = self.start_frame;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
                int i2 = self.end_frame;
                if (i2 != 0) {
                    output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
                }
            }

            public Surrogate(int i, int i2) {
                this.start_frame = i;
                this.end_frame = i2;
            }

            public /* synthetic */ Surrogate(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
            }

            public final int getStart_frame() {
                return this.start_frame;
            }

            public final int getEnd_frame() {
                return this.end_frame;
            }
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "Lfutures_onboarding_value_props/proto/v1/LottieInfo$LoopSection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<LoopSectionDto, LottieInfo.LoopSection> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LoopSectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LoopSectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LoopSectionDto> getBinaryBase64Serializer() {
                return (KSerializer) LoopSectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<LottieInfo.LoopSection> getProtoAdapter() {
                return LottieInfo.LoopSection.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LoopSectionDto getZeroValue() {
                return LoopSectionDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LoopSectionDto fromProto(LottieInfo.LoopSection proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new LoopSectionDto(new Surrogate(proto.getStart_frame(), proto.getEnd_frame()), (DefaultConstructorMarker) null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_onboarding_value_props.proto.v1.LottieInfoDto$LoopSectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LottieInfoDto.LoopSectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            int i = 0;
            zeroValue = new LoopSectionDto(i, i, 3, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto;", "<init>", "()V", "surrogateSerializer", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Serializer implements KSerializer<LoopSectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/futures_onboarding_value_props.proto.v1.LottieInfo.LoopSection", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, LoopSectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public LoopSectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new LoopSectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: LottieInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$LoopSectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "futures_onboarding_value_props.proto.v1.LottieInfoDto$LoopSectionDto";
            }
        }
    }

    /* compiled from: LottieInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto;", "<init>", "()V", "surrogateSerializer", "Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<LottieInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/futures_onboarding_value_props.proto.v1.LottieInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LottieInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LottieInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LottieInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LottieInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/LottieInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "futures_onboarding_value_props.proto.v1.LottieInfoDto";
        }
    }
}
