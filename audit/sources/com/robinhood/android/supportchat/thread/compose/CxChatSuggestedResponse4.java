package com.robinhood.android.supportchat.thread.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CxChatSuggestedResponse.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/State;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "Pressed", "Disabled", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.compose.State, reason: use source file name */
/* loaded from: classes9.dex */
final class CxChatSuggestedResponse4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CxChatSuggestedResponse4[] $VALUES;
    public static final CxChatSuggestedResponse4 Default = new CxChatSuggestedResponse4("Default", 0);
    public static final CxChatSuggestedResponse4 Pressed = new CxChatSuggestedResponse4("Pressed", 1);
    public static final CxChatSuggestedResponse4 Disabled = new CxChatSuggestedResponse4("Disabled", 2);

    private static final /* synthetic */ CxChatSuggestedResponse4[] $values() {
        return new CxChatSuggestedResponse4[]{Default, Pressed, Disabled};
    }

    public static EnumEntries<CxChatSuggestedResponse4> getEntries() {
        return $ENTRIES;
    }

    private CxChatSuggestedResponse4(String str, int i) {
    }

    static {
        CxChatSuggestedResponse4[] cxChatSuggestedResponse4Arr$values = $values();
        $VALUES = cxChatSuggestedResponse4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(cxChatSuggestedResponse4Arr$values);
    }

    public static CxChatSuggestedResponse4 valueOf(String str) {
        return (CxChatSuggestedResponse4) Enum.valueOf(CxChatSuggestedResponse4.class, str);
    }

    public static CxChatSuggestedResponse4[] values() {
        return (CxChatSuggestedResponse4[]) $VALUES.clone();
    }
}
