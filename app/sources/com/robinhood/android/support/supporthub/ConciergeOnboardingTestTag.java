package com.robinhood.android.support.supporthub;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConciergeOnboardingTestTag.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingComposableTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "ToolbarBackButton", "ToolbarCloseButton", "ToolbarVideoSkipButton", "ToolbarVideoReplayButton", "LoadingScreen", "LoadedScreen", "ErrorScreen", "ProgressBar", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableTestTag, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConciergeOnboardingTestTag {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConciergeOnboardingTestTag[] $VALUES;
    public static final ConciergeOnboardingTestTag ToolbarBackButton = new ConciergeOnboardingTestTag("ToolbarBackButton", 0);
    public static final ConciergeOnboardingTestTag ToolbarCloseButton = new ConciergeOnboardingTestTag("ToolbarCloseButton", 1);
    public static final ConciergeOnboardingTestTag ToolbarVideoSkipButton = new ConciergeOnboardingTestTag("ToolbarVideoSkipButton", 2);
    public static final ConciergeOnboardingTestTag ToolbarVideoReplayButton = new ConciergeOnboardingTestTag("ToolbarVideoReplayButton", 3);
    public static final ConciergeOnboardingTestTag LoadingScreen = new ConciergeOnboardingTestTag("LoadingScreen", 4);
    public static final ConciergeOnboardingTestTag LoadedScreen = new ConciergeOnboardingTestTag("LoadedScreen", 5);
    public static final ConciergeOnboardingTestTag ErrorScreen = new ConciergeOnboardingTestTag("ErrorScreen", 6);
    public static final ConciergeOnboardingTestTag ProgressBar = new ConciergeOnboardingTestTag("ProgressBar", 7);

    private static final /* synthetic */ ConciergeOnboardingTestTag[] $values() {
        return new ConciergeOnboardingTestTag[]{ToolbarBackButton, ToolbarCloseButton, ToolbarVideoSkipButton, ToolbarVideoReplayButton, LoadingScreen, LoadedScreen, ErrorScreen, ProgressBar};
    }

    public static EnumEntries<ConciergeOnboardingTestTag> getEntries() {
        return $ENTRIES;
    }

    private ConciergeOnboardingTestTag(String str, int i) {
    }

    static {
        ConciergeOnboardingTestTag[] conciergeOnboardingTestTagArr$values = $values();
        $VALUES = conciergeOnboardingTestTagArr$values;
        $ENTRIES = EnumEntries2.enumEntries(conciergeOnboardingTestTagArr$values);
    }

    public static ConciergeOnboardingTestTag valueOf(String str) {
        return (ConciergeOnboardingTestTag) Enum.valueOf(ConciergeOnboardingTestTag.class, str);
    }

    public static ConciergeOnboardingTestTag[] values() {
        return (ConciergeOnboardingTestTag[]) $VALUES.clone();
    }
}
