package com.robinhood.android.event.gamedetail.p130ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GameDetailComboScreen.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/ComboLoggingAction;", "", "<init>", "(Ljava/lang/String;I)V", "SELECT", "DESELECT", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.ComboLoggingAction, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboScreen {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GameDetailComboScreen[] $VALUES;
    public static final GameDetailComboScreen SELECT = new GameDetailComboScreen("SELECT", 0);
    public static final GameDetailComboScreen DESELECT = new GameDetailComboScreen("DESELECT", 1);

    private static final /* synthetic */ GameDetailComboScreen[] $values() {
        return new GameDetailComboScreen[]{SELECT, DESELECT};
    }

    public static EnumEntries<GameDetailComboScreen> getEntries() {
        return $ENTRIES;
    }

    private GameDetailComboScreen(String str, int i) {
    }

    static {
        GameDetailComboScreen[] gameDetailComboScreenArr$values = $values();
        $VALUES = gameDetailComboScreenArr$values;
        $ENTRIES = EnumEntries2.enumEntries(gameDetailComboScreenArr$values);
    }

    public static GameDetailComboScreen valueOf(String str) {
        return (GameDetailComboScreen) Enum.valueOf(GameDetailComboScreen.class, str);
    }

    public static GameDetailComboScreen[] values() {
        return (GameDetailComboScreen[]) $VALUES.clone();
    }
}
