package androidx.media3.common;

import androidx.media3.common.util.Assertions;

/* loaded from: classes4.dex */
public class FrameInfo {
    public final ColorInfo colorInfo;
    public final int height;
    public final long offsetToAddUs;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static final class Builder {
        private ColorInfo colorInfo;
        private int height;
        private long offsetToAddUs;
        private float pixelWidthHeightRatio = 1.0f;
        private int width;

        public Builder(ColorInfo colorInfo, int i, int i2) {
            this.colorInfo = colorInfo;
            this.width = i;
            this.height = i2;
        }

        public Builder setPixelWidthHeightRatio(float f) {
            this.pixelWidthHeightRatio = f;
            return this;
        }

        public FrameInfo build() {
            return new FrameInfo(this.colorInfo, this.width, this.height, this.pixelWidthHeightRatio, this.offsetToAddUs);
        }
    }

    private FrameInfo(ColorInfo colorInfo, int i, int i2, float f, long j) {
        Assertions.checkArgument(i > 0, "width must be positive, but is: " + i);
        Assertions.checkArgument(i2 > 0, "height must be positive, but is: " + i2);
        this.colorInfo = colorInfo;
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
        this.offsetToAddUs = j;
    }
}
