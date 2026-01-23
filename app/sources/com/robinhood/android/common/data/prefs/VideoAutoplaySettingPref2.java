package com.robinhood.android.common.data.prefs;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAutoplaySettingPref.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/data/prefs/VideoAutoplaySetting;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MOBILE_AND_WIFI", "WIFI_ONLY", "NEVER", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.data.prefs.VideoAutoplaySetting, reason: use source file name */
/* loaded from: classes2.dex */
public final class VideoAutoplaySettingPref2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoAutoplaySettingPref2[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, VideoAutoplaySettingPref2> mapping;
    private final String value;
    public static final VideoAutoplaySettingPref2 MOBILE_AND_WIFI = new VideoAutoplaySettingPref2("MOBILE_AND_WIFI", 0, "mobile_and_wifi");
    public static final VideoAutoplaySettingPref2 WIFI_ONLY = new VideoAutoplaySettingPref2("WIFI_ONLY", 1, "wifi_only");
    public static final VideoAutoplaySettingPref2 NEVER = new VideoAutoplaySettingPref2("NEVER", 2, "never");

    private static final /* synthetic */ VideoAutoplaySettingPref2[] $values() {
        return new VideoAutoplaySettingPref2[]{MOBILE_AND_WIFI, WIFI_ONLY, NEVER};
    }

    public static EnumEntries<VideoAutoplaySettingPref2> getEntries() {
        return $ENTRIES;
    }

    private VideoAutoplaySettingPref2(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        VideoAutoplaySettingPref2[] videoAutoplaySettingPref2Arr$values = $values();
        $VALUES = videoAutoplaySettingPref2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(videoAutoplaySettingPref2Arr$values);
        INSTANCE = new Companion(null);
        VideoAutoplaySettingPref2[] videoAutoplaySettingPref2ArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(videoAutoplaySettingPref2ArrValues.length), 16));
        for (VideoAutoplaySettingPref2 videoAutoplaySettingPref2 : videoAutoplaySettingPref2ArrValues) {
            linkedHashMap.put(videoAutoplaySettingPref2.value, videoAutoplaySettingPref2);
        }
        mapping = linkedHashMap;
    }

    /* compiled from: VideoAutoplaySettingPref.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/data/prefs/VideoAutoplaySetting$Companion;", "", "<init>", "()V", "mapping", "", "", "Lcom/robinhood/android/common/data/prefs/VideoAutoplaySetting;", "fromValue", "value", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.data.prefs.VideoAutoplaySetting$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoAutoplaySettingPref2 fromValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return (VideoAutoplaySettingPref2) MapsKt.getValue(VideoAutoplaySettingPref2.mapping, value);
        }
    }

    public static VideoAutoplaySettingPref2 valueOf(String str) {
        return (VideoAutoplaySettingPref2) Enum.valueOf(VideoAutoplaySettingPref2.class, str);
    }

    public static VideoAutoplaySettingPref2[] values() {
        return (VideoAutoplaySettingPref2[]) $VALUES.clone();
    }
}
