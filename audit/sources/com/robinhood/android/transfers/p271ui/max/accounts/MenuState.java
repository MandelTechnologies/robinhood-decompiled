package com.robinhood.android.transfers.p271ui.max.accounts;

import com.robinhood.android.transfers.C30065R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MenuState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/accounts/MenuState;", "", "menuRes", "", "<init>", "(Ljava/lang/String;II)V", "getMenuRes", "()I", "EDIT", "DONE", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MenuState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MenuState[] $VALUES;
    private final int menuRes;
    public static final MenuState EDIT = new MenuState("EDIT", 0, C30065R.menu.menu_transfer_account_selection_edit);
    public static final MenuState DONE = new MenuState("DONE", 1, C30065R.menu.menu_transfer_account_selection_done);

    private static final /* synthetic */ MenuState[] $values() {
        return new MenuState[]{EDIT, DONE};
    }

    public static EnumEntries<MenuState> getEntries() {
        return $ENTRIES;
    }

    private MenuState(String str, int i, int i2) {
        this.menuRes = i2;
    }

    public final int getMenuRes() {
        return this.menuRes;
    }

    static {
        MenuState[] menuStateArr$values = $values();
        $VALUES = menuStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(menuStateArr$values);
    }

    public static MenuState valueOf(String str) {
        return (MenuState) Enum.valueOf(MenuState.class, str);
    }

    public static MenuState[] values() {
        return (MenuState[]) $VALUES.clone();
    }
}
