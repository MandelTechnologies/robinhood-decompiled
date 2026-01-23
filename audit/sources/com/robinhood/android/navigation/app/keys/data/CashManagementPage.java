package com.robinhood.android.navigation.app.keys.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CashManagementPage.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/CashManagementPage;", "", "contentfulIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentfulIdentifier", "()Ljava/lang/String;", "INTRO", "APY", "FEES", "ATMS", "PROTECTION", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CashManagementPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CashManagementPage[] $VALUES;
    private final String contentfulIdentifier;
    public static final CashManagementPage INTRO = new CashManagementPage("INTRO", 0, "cm-intro");
    public static final CashManagementPage APY = new CashManagementPage("APY", 1, "cm-apy");
    public static final CashManagementPage FEES = new CashManagementPage("FEES", 2, "cm-fees");
    public static final CashManagementPage ATMS = new CashManagementPage("ATMS", 3, "cm-atms");
    public static final CashManagementPage PROTECTION = new CashManagementPage("PROTECTION", 4, "cm-protection");

    private static final /* synthetic */ CashManagementPage[] $values() {
        return new CashManagementPage[]{INTRO, APY, FEES, ATMS, PROTECTION};
    }

    public static EnumEntries<CashManagementPage> getEntries() {
        return $ENTRIES;
    }

    private CashManagementPage(String str, int i, String str2) {
        this.contentfulIdentifier = str2;
    }

    public final String getContentfulIdentifier() {
        return this.contentfulIdentifier;
    }

    static {
        CashManagementPage[] cashManagementPageArr$values = $values();
        $VALUES = cashManagementPageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cashManagementPageArr$values);
    }

    public static CashManagementPage valueOf(String str) {
        return (CashManagementPage) Enum.valueOf(CashManagementPage.class, str);
    }

    public static CashManagementPage[] values() {
        return (CashManagementPage[]) $VALUES.clone();
    }
}
