package androidx.camera.video;

import android.annotation.SuppressLint;
import androidx.camera.video.AutoValue_MediaSpec;
import androidx.camera.video.VideoSpec;
import androidx.core.util.Consumer;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class MediaSpec {
    static int outputFormatToMuxerFormat(int i) {
        return i != 1 ? 0 : 1;
    }

    public abstract AudioSpec getAudioSpec();

    public abstract int getOutputFormat();

    public abstract VideoSpec getVideoSpec();

    public abstract Builder toBuilder();

    public static String outputFormatToAudioMime(int i) {
        if (i == 1) {
            return "audio/vorbis";
        }
        return "audio/mp4a-latm";
    }

    public static int outputFormatToAudioProfile(int i) {
        return Objects.equals(outputFormatToAudioMime(i), "audio/mp4a-latm") ? 2 : -1;
    }

    public static String outputFormatToVideoMime(int i) {
        if (i == 1) {
            return "video/x-vnd.on2.vp8";
        }
        return "video/avc";
    }

    MediaSpec() {
    }

    public static Builder builder() {
        return new AutoValue_MediaSpec.Builder().setOutputFormat(-1).setAudioSpec(AudioSpec.builder().build()).setVideoSpec(VideoSpec.builder().build());
    }

    public static abstract class Builder {
        public abstract MediaSpec build();

        @SuppressLint({"KotlinPropertyAccess"})
        abstract VideoSpec getVideoSpec();

        public abstract Builder setAudioSpec(AudioSpec audioSpec);

        public abstract Builder setOutputFormat(int i);

        public abstract Builder setVideoSpec(VideoSpec videoSpec);

        Builder() {
        }

        public Builder configureVideo(Consumer<VideoSpec.Builder> consumer) {
            VideoSpec.Builder builder = getVideoSpec().toBuilder();
            consumer.accept(builder);
            setVideoSpec(builder.build());
            return this;
        }
    }
}
