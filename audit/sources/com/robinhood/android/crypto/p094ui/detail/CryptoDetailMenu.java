package com.robinhood.android.crypto.p094ui.detail;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailMenu.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailMenu;", "", "<init>", "()V", "inflate", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "context", "Landroid/content/Context;", "MenuAction", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoDetailMenu {
    public static final int $stable = 0;
    public static final CryptoDetailMenu INSTANCE = new CryptoDetailMenu();

    private CryptoDetailMenu() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoDetailMenu.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailMenu$MenuAction;", "", "menuItemId", "", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "getMenuItemId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "PICTURE_IN_PICTURE", "ALERTS", "ADD", "UPDATE", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MenuAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MenuAction[] $VALUES;
        private final Integer menuItemId;
        public static final MenuAction PICTURE_IN_PICTURE = new MenuAction("PICTURE_IN_PICTURE", 0, Integer.valueOf(C12757R.id.action_picture_in_picture));
        public static final MenuAction ALERTS = new MenuAction("ALERTS", 1, Integer.valueOf(C12757R.id.action_alert));
        public static final MenuAction ADD = new MenuAction("ADD", 2, Integer.valueOf(C12757R.id.action_add_to_list));
        public static final MenuAction UPDATE = new MenuAction("UPDATE", 3, Integer.valueOf(C12757R.id.action_update_lists));

        private static final /* synthetic */ MenuAction[] $values() {
            return new MenuAction[]{PICTURE_IN_PICTURE, ALERTS, ADD, UPDATE};
        }

        public static EnumEntries<MenuAction> getEntries() {
            return $ENTRIES;
        }

        private MenuAction(String str, int i, Integer num) {
            this.menuItemId = num;
        }

        public final Integer getMenuItemId() {
            return this.menuItemId;
        }

        static {
            MenuAction[] menuActionArr$values = $values();
            $VALUES = menuActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(menuActionArr$values);
        }

        public static MenuAction valueOf(String str) {
            return (MenuAction) Enum.valueOf(MenuAction.class, str);
        }

        public static MenuAction[] values() {
            return (MenuAction[]) $VALUES.clone();
        }
    }

    public final void inflate(Menu menu, MenuInflater inflater, Context context) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(context, "context");
        inflater.inflate(C12757R.menu.menu_crypto_detail, menu);
        MenuItem menuItemFindItem = menu.findItem(C12757R.id.action_update_lists);
        MenuItem menuItemFindItem2 = menu.findItem(C12757R.id.action_alert);
        MenuItem menuItemFindItem3 = menu.findItem(C12757R.id.action_picture_in_picture);
        Drawable icon = menuItemFindItem.getIcon();
        Intrinsics.checkNotNull(icon);
        icon.mutate().setTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1)));
        Drawable icon2 = menuItemFindItem2.getIcon();
        Intrinsics.checkNotNull(icon2);
        icon2.mutate().setTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1)));
        Drawable icon3 = menuItemFindItem3.getIcon();
        if (icon3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        icon3.mutate().setTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1)));
    }
}
