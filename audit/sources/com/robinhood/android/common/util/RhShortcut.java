package com.robinhood.android.common.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhShortcut.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/util/RhShortcut;", "", "shortcutId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getShortcutId", "()Ljava/lang/String;", "SEARCH", "SETTINGS", "ACCOUNT", "HISTORY", "DEPOSIT", "DEPOSIT_QUEUED_DEPOSIT", "LINK_ACCOUNT", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RhShortcut {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhShortcut[] $VALUES;
    private final String shortcutId;
    public static final RhShortcut SEARCH = new RhShortcut("SEARCH", 0, "rh-shortcut-search");
    public static final RhShortcut SETTINGS = new RhShortcut("SETTINGS", 1, "rh-shortcut-settings");
    public static final RhShortcut ACCOUNT = new RhShortcut("ACCOUNT", 2, "rh-shortcut-account");
    public static final RhShortcut HISTORY = new RhShortcut("HISTORY", 3, "rh-shortcut-history");
    public static final RhShortcut DEPOSIT = new RhShortcut("DEPOSIT", 4, "rh-shortcut-deposit");
    public static final RhShortcut DEPOSIT_QUEUED_DEPOSIT = new RhShortcut("DEPOSIT_QUEUED_DEPOSIT", 5, "rh-shortcut-queued-deposit");
    public static final RhShortcut LINK_ACCOUNT = new RhShortcut("LINK_ACCOUNT", 6, "rh-shortcut-link-account");

    private static final /* synthetic */ RhShortcut[] $values() {
        return new RhShortcut[]{SEARCH, SETTINGS, ACCOUNT, HISTORY, DEPOSIT, DEPOSIT_QUEUED_DEPOSIT, LINK_ACCOUNT};
    }

    public static EnumEntries<RhShortcut> getEntries() {
        return $ENTRIES;
    }

    private RhShortcut(String str, int i, String str2) {
        this.shortcutId = str2;
    }

    public final String getShortcutId() {
        return this.shortcutId;
    }

    static {
        RhShortcut[] rhShortcutArr$values = $values();
        $VALUES = rhShortcutArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhShortcutArr$values);
    }

    public static RhShortcut valueOf(String str) {
        return (RhShortcut) Enum.valueOf(RhShortcut.class, str);
    }

    public static RhShortcut[] values() {
        return (RhShortcut[]) $VALUES.clone();
    }
}
