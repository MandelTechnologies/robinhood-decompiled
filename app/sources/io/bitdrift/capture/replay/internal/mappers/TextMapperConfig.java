package io.bitdrift.capture.replay.internal.mappers;

import kotlin.Metadata;

/* compiled from: TextMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/TextMapperConfig;", "", "", "showViewOutline", "", "interlinePadding", "<init>", "(ZI)V", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowViewOutline", "()Z", "I", "getInterlinePadding", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TextMapperConfig {
    private final int interlinePadding;
    private final boolean showViewOutline;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextMapperConfig)) {
            return false;
        }
        TextMapperConfig textMapperConfig = (TextMapperConfig) other;
        return this.showViewOutline == textMapperConfig.showViewOutline && this.interlinePadding == textMapperConfig.interlinePadding;
    }

    public int hashCode() {
        return (D8$$SyntheticClass8.m3337m(this.showViewOutline) * 31) + this.interlinePadding;
    }

    public String toString() {
        return "TextMapperConfig(showViewOutline=" + this.showViewOutline + ", interlinePadding=" + this.interlinePadding + ')';
    }

    public TextMapperConfig(boolean z, int i) {
        this.showViewOutline = z;
        this.interlinePadding = i;
    }

    public final boolean getShowViewOutline() {
        return this.showViewOutline;
    }

    public final int getInterlinePadding() {
        return this.interlinePadding;
    }
}
