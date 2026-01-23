package com.robinhood.android.supportchat.view;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SupportChatThreadBanner.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/supportchat/view/SupportChatBannerTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "BannerDefault", "BannerAction", "BannerPlain", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.view.SupportChatBannerTestTag, reason: use source file name */
/* loaded from: classes9.dex */
public final class SupportChatThreadBanner {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SupportChatThreadBanner[] $VALUES;
    public static final SupportChatThreadBanner BannerDefault = new SupportChatThreadBanner("BannerDefault", 0);
    public static final SupportChatThreadBanner BannerAction = new SupportChatThreadBanner("BannerAction", 1);
    public static final SupportChatThreadBanner BannerPlain = new SupportChatThreadBanner("BannerPlain", 2);

    private static final /* synthetic */ SupportChatThreadBanner[] $values() {
        return new SupportChatThreadBanner[]{BannerDefault, BannerAction, BannerPlain};
    }

    public static EnumEntries<SupportChatThreadBanner> getEntries() {
        return $ENTRIES;
    }

    private SupportChatThreadBanner(String str, int i) {
    }

    static {
        SupportChatThreadBanner[] supportChatThreadBannerArr$values = $values();
        $VALUES = supportChatThreadBannerArr$values;
        $ENTRIES = EnumEntries2.enumEntries(supportChatThreadBannerArr$values);
    }

    public static SupportChatThreadBanner valueOf(String str) {
        return (SupportChatThreadBanner) Enum.valueOf(SupportChatThreadBanner.class, str);
    }

    public static SupportChatThreadBanner[] values() {
        return (SupportChatThreadBanner[]) $VALUES.clone();
    }
}
