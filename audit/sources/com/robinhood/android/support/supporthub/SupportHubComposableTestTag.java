package com.robinhood.android.support.supporthub;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SupportHubComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubComposableTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "ToolbarBackButton", "InitialLoading", "ConciergeAppBarBackground", "Content", "Title", "ConciergeQna", "AlertBanner", "Appointment", "AssignedAgent", "AssignedAgentAvatar", "RecommendedActions", "RecommendationCardImage", "BottomSheet", "BottomSheetLoading", "BottomSheetTitle", "BottomSheetSubtitle", "BottomSheetDismissCta", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SupportHubComposableTestTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SupportHubComposableTestTag[] $VALUES;
    public static final SupportHubComposableTestTag ToolbarBackButton = new SupportHubComposableTestTag("ToolbarBackButton", 0);
    public static final SupportHubComposableTestTag InitialLoading = new SupportHubComposableTestTag("InitialLoading", 1);
    public static final SupportHubComposableTestTag ConciergeAppBarBackground = new SupportHubComposableTestTag("ConciergeAppBarBackground", 2);
    public static final SupportHubComposableTestTag Content = new SupportHubComposableTestTag("Content", 3);
    public static final SupportHubComposableTestTag Title = new SupportHubComposableTestTag("Title", 4);
    public static final SupportHubComposableTestTag ConciergeQna = new SupportHubComposableTestTag("ConciergeQna", 5);
    public static final SupportHubComposableTestTag AlertBanner = new SupportHubComposableTestTag("AlertBanner", 6);
    public static final SupportHubComposableTestTag Appointment = new SupportHubComposableTestTag("Appointment", 7);
    public static final SupportHubComposableTestTag AssignedAgent = new SupportHubComposableTestTag("AssignedAgent", 8);
    public static final SupportHubComposableTestTag AssignedAgentAvatar = new SupportHubComposableTestTag("AssignedAgentAvatar", 9);
    public static final SupportHubComposableTestTag RecommendedActions = new SupportHubComposableTestTag("RecommendedActions", 10);
    public static final SupportHubComposableTestTag RecommendationCardImage = new SupportHubComposableTestTag("RecommendationCardImage", 11);
    public static final SupportHubComposableTestTag BottomSheet = new SupportHubComposableTestTag("BottomSheet", 12);
    public static final SupportHubComposableTestTag BottomSheetLoading = new SupportHubComposableTestTag("BottomSheetLoading", 13);
    public static final SupportHubComposableTestTag BottomSheetTitle = new SupportHubComposableTestTag("BottomSheetTitle", 14);
    public static final SupportHubComposableTestTag BottomSheetSubtitle = new SupportHubComposableTestTag("BottomSheetSubtitle", 15);
    public static final SupportHubComposableTestTag BottomSheetDismissCta = new SupportHubComposableTestTag("BottomSheetDismissCta", 16);

    private static final /* synthetic */ SupportHubComposableTestTag[] $values() {
        return new SupportHubComposableTestTag[]{ToolbarBackButton, InitialLoading, ConciergeAppBarBackground, Content, Title, ConciergeQna, AlertBanner, Appointment, AssignedAgent, AssignedAgentAvatar, RecommendedActions, RecommendationCardImage, BottomSheet, BottomSheetLoading, BottomSheetTitle, BottomSheetSubtitle, BottomSheetDismissCta};
    }

    public static EnumEntries<SupportHubComposableTestTag> getEntries() {
        return $ENTRIES;
    }

    private SupportHubComposableTestTag(String str, int i) {
    }

    static {
        SupportHubComposableTestTag[] supportHubComposableTestTagArr$values = $values();
        $VALUES = supportHubComposableTestTagArr$values;
        $ENTRIES = EnumEntries2.enumEntries(supportHubComposableTestTagArr$values);
    }

    public static SupportHubComposableTestTag valueOf(String str) {
        return (SupportHubComposableTestTag) Enum.valueOf(SupportHubComposableTestTag.class, str);
    }

    public static SupportHubComposableTestTag[] values() {
        return (SupportHubComposableTestTag[]) $VALUES.clone();
    }
}
