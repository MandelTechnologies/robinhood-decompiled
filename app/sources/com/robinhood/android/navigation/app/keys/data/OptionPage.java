package com.robinhood.android.navigation.app.keys.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionPage.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/OptionPage;", "", "contentfulIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentfulIdentifier", "()Ljava/lang/String;", "FREE_OPTIONS_TRADING", "CHOOSE_YOUR_STRATEGY", "UNLOCK_YOUR_POTENTIAL", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OptionPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionPage[] $VALUES;
    private final String contentfulIdentifier;
    public static final OptionPage FREE_OPTIONS_TRADING = new OptionPage("FREE_OPTIONS_TRADING", 0, "free-options-trading");
    public static final OptionPage CHOOSE_YOUR_STRATEGY = new OptionPage("CHOOSE_YOUR_STRATEGY", 1, "choose-your-strategy");
    public static final OptionPage UNLOCK_YOUR_POTENTIAL = new OptionPage("UNLOCK_YOUR_POTENTIAL", 2, "unlock-your-potential");

    private static final /* synthetic */ OptionPage[] $values() {
        return new OptionPage[]{FREE_OPTIONS_TRADING, CHOOSE_YOUR_STRATEGY, UNLOCK_YOUR_POTENTIAL};
    }

    public static EnumEntries<OptionPage> getEntries() {
        return $ENTRIES;
    }

    private OptionPage(String str, int i, String str2) {
        this.contentfulIdentifier = str2;
    }

    public final String getContentfulIdentifier() {
        return this.contentfulIdentifier;
    }

    static {
        OptionPage[] optionPageArr$values = $values();
        $VALUES = optionPageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionPageArr$values);
    }

    public static OptionPage valueOf(String str) {
        return (OptionPage) Enum.valueOf(OptionPage.class, str);
    }

    public static OptionPage[] values() {
        return (OptionPage[]) $VALUES.clone();
    }
}
