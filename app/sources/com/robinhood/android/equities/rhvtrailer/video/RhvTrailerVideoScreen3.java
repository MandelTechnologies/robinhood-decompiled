package com.robinhood.android.equities.rhvtrailer.video;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhvTrailerVideoScreen.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equities/rhvtrailer/video/RhvTrailerVideoPlayerState;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "PLAYING", "ENDED", "feature-rhv-trailer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoPlayerState, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhvTrailerVideoScreen3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhvTrailerVideoScreen3[] $VALUES;
    public static final RhvTrailerVideoScreen3 PENDING = new RhvTrailerVideoScreen3("PENDING", 0);
    public static final RhvTrailerVideoScreen3 PLAYING = new RhvTrailerVideoScreen3("PLAYING", 1);
    public static final RhvTrailerVideoScreen3 ENDED = new RhvTrailerVideoScreen3("ENDED", 2);

    private static final /* synthetic */ RhvTrailerVideoScreen3[] $values() {
        return new RhvTrailerVideoScreen3[]{PENDING, PLAYING, ENDED};
    }

    public static EnumEntries<RhvTrailerVideoScreen3> getEntries() {
        return $ENTRIES;
    }

    private RhvTrailerVideoScreen3(String str, int i) {
    }

    static {
        RhvTrailerVideoScreen3[] rhvTrailerVideoScreen3Arr$values = $values();
        $VALUES = rhvTrailerVideoScreen3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhvTrailerVideoScreen3Arr$values);
    }

    public static RhvTrailerVideoScreen3 valueOf(String str) {
        return (RhvTrailerVideoScreen3) Enum.valueOf(RhvTrailerVideoScreen3.class, str);
    }

    public static RhvTrailerVideoScreen3[] values() {
        return (RhvTrailerVideoScreen3[]) $VALUES.clone();
    }
}
