package com.twilio.conversations;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
/* compiled from: MediaCategory.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/twilio/conversations/MediaCategory;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MEDIA", "BODY", "HISTORY", "Companion", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class MediaCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaCategory[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, MediaCategory> map;
    private final String value;
    public static final MediaCategory MEDIA = new MediaCategory("MEDIA", 0, "media");
    public static final MediaCategory BODY = new MediaCategory("BODY", 1, CarResultComposable2.BODY);
    public static final MediaCategory HISTORY = new MediaCategory("HISTORY", 2, AnalyticsStrings.BUTTON_GROUP_TITLE_HISTORY);

    private static final /* synthetic */ MediaCategory[] $values() {
        return new MediaCategory[]{MEDIA, BODY, HISTORY};
    }

    public static EnumEntries<MediaCategory> getEntries() {
        return $ENTRIES;
    }

    private MediaCategory(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        MediaCategory[] mediaCategoryArr$values = $values();
        $VALUES = mediaCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(mediaCategoryArr$values);
        INSTANCE = new Companion(null);
        MediaCategory[] mediaCategoryArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(mediaCategoryArrValues.length), 16));
        for (MediaCategory mediaCategory : mediaCategoryArrValues) {
            linkedHashMap.put(mediaCategory.value, mediaCategory);
        }
        map = linkedHashMap;
    }

    /* compiled from: MediaCategory.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/twilio/conversations/MediaCategory$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/twilio/conversations/MediaCategory;", "fromString", "value", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MediaCategory fromString(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            MediaCategory mediaCategory = (MediaCategory) MediaCategory.map.get(value);
            if (mediaCategory != null) {
                return mediaCategory;
            }
            throw new IllegalStateException(("Unknown MediaCategory: " + value).toString());
        }
    }

    public static MediaCategory valueOf(String str) {
        return (MediaCategory) Enum.valueOf(MediaCategory.class, str);
    }

    public static MediaCategory[] values() {
        return (MediaCategory[]) $VALUES.clone();
    }
}
