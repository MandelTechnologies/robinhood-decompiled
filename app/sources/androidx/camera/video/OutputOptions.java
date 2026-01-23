package androidx.camera.video;

import android.location.Location;

/* loaded from: classes4.dex */
public abstract class OutputOptions {
    private final OutputOptionsInternal mOutputOptionsInternal;

    OutputOptions(OutputOptionsInternal outputOptionsInternal) {
        this.mOutputOptionsInternal = outputOptionsInternal;
    }

    public long getFileSizeLimit() {
        return this.mOutputOptionsInternal.getFileSizeLimit();
    }

    public Location getLocation() {
        return this.mOutputOptionsInternal.getLocation();
    }

    public long getDurationLimitMillis() {
        return this.mOutputOptionsInternal.getDurationLimitMillis();
    }

    static abstract class Builder<T extends OutputOptions, B> {
        final OutputOptionsInternal.Builder<?> mRootInternalBuilder;

        Builder(OutputOptionsInternal.Builder<?> builder) {
            this.mRootInternalBuilder = builder;
            builder.setFileSizeLimit(0L);
            builder.setDurationLimitMillis(0L);
        }
    }

    static abstract class OutputOptionsInternal {
        abstract long getDurationLimitMillis();

        abstract long getFileSizeLimit();

        abstract Location getLocation();

        OutputOptionsInternal() {
        }

        static abstract class Builder<B> {
            abstract B setDurationLimitMillis(long j);

            abstract B setFileSizeLimit(long j);

            Builder() {
            }
        }
    }
}
