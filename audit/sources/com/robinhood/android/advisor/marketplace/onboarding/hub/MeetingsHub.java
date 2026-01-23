package com.robinhood.android.advisor.marketplace.onboarding.hub;

import com.robinhood.android.advisor.marketplace.onboarding.C8572R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeetingsHub.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/MeetingsFilter;", "", "title", "", "<init>", "(Ljava/lang/String;II)V", "getTitle", "()I", "UPCOMING", "PAST", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.MeetingsFilter, reason: use source file name */
/* loaded from: classes7.dex */
public final class MeetingsHub {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MeetingsHub[] $VALUES;
    private final int title;
    public static final MeetingsHub UPCOMING = new MeetingsHub("UPCOMING", 0, C8572R.string.marketplace_meetings_hub_upcoming_filter);
    public static final MeetingsHub PAST = new MeetingsHub("PAST", 1, C8572R.string.marketplace_meetings_hub_past_filter);

    private static final /* synthetic */ MeetingsHub[] $values() {
        return new MeetingsHub[]{UPCOMING, PAST};
    }

    public static EnumEntries<MeetingsHub> getEntries() {
        return $ENTRIES;
    }

    private MeetingsHub(String str, int i, int i2) {
        this.title = i2;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        MeetingsHub[] meetingsHubArr$values = $values();
        $VALUES = meetingsHubArr$values;
        $ENTRIES = EnumEntries2.enumEntries(meetingsHubArr$values);
    }

    public static MeetingsHub valueOf(String str) {
        return (MeetingsHub) Enum.valueOf(MeetingsHub.class, str);
    }

    public static MeetingsHub[] values() {
        return (MeetingsHub[]) $VALUES.clone();
    }
}
