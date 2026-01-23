package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.AutoValue_VideoSpec;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class VideoSpec {
    public static final QualitySelector QUALITY_SELECTOR_AUTO;
    public static final Range<Integer> FRAME_RATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);
    public static final Range<Integer> BITRATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);

    abstract int getAspectRatio();

    public abstract Range<Integer> getBitrate();

    public abstract Range<Integer> getFrameRate();

    public abstract QualitySelector getQualitySelector();

    public abstract Builder toBuilder();

    static {
        Quality quality = Quality.FHD;
        QUALITY_SELECTOR_AUTO = QualitySelector.fromOrderedList(Arrays.asList(quality, Quality.f30HD, Quality.f31SD), FallbackStrategy.higherQualityOrLowerThan(quality));
    }

    VideoSpec() {
    }

    public static Builder builder() {
        return new AutoValue_VideoSpec.Builder().setQualitySelector(QUALITY_SELECTOR_AUTO).setFrameRate(FRAME_RATE_RANGE_AUTO).setBitrate(BITRATE_RANGE_AUTO).setAspectRatio(-1);
    }

    public static abstract class Builder {
        public abstract VideoSpec build();

        abstract Builder setAspectRatio(int i);

        public abstract Builder setBitrate(Range<Integer> range);

        public abstract Builder setFrameRate(Range<Integer> range);

        public abstract Builder setQualitySelector(QualitySelector qualitySelector);

        Builder() {
        }
    }
}
