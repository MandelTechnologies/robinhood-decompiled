package com.robinhood.android.common.util;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.font.CustomTypefaceSpan2;
import com.robinhood.android.font.RhTypeface;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypefaceUtils.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/util/TypefaceUtils;", "", "<init>", "()V", "setToolbarTitleTypeface", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setToolbarSubtitleTypeface", "applyFontToMenu", "context", "Landroid/content/Context;", "menu", "Landroid/view/Menu;", "typeface", "Landroid/graphics/Typeface;", "applyFontToMenuItems", "menuItem", "Landroid/view/MenuItem;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TypefaceUtils {
    public static final int $stable = 0;
    public static final TypefaceUtils INSTANCE = new TypefaceUtils();

    @JvmOverloads
    public final void applyFontToMenu(Context context, Menu menu) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(menu, "menu");
        applyFontToMenu$default(this, context, menu, null, 4, null);
    }

    private TypefaceUtils() {
    }

    public final void setToolbarTitleTypeface(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        RhTypeface rhTypeface = RhTypeface.REGULAR;
        Context context = toolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        toolbar.setTitleTypeface(rhTypeface.load(context));
    }

    public final void setToolbarSubtitleTypeface(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        RhTypeface rhTypeface = RhTypeface.REGULAR;
        Context context = toolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        toolbar.setSubtitleTypeface(rhTypeface.load(context));
    }

    public static /* synthetic */ void applyFontToMenu$default(TypefaceUtils typefaceUtils, Context context, Menu menu, Typeface typeface, int i, Object obj) {
        if ((i & 4) != 0) {
            typeface = RhTypeface.REGULAR.load(context);
        }
        typefaceUtils.applyFontToMenu(context, menu, typeface);
    }

    @JvmOverloads
    public final void applyFontToMenu(Context context, Menu menu, Typeface typeface) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            applyFontToMenuItems(item, typeface);
        }
    }

    private final void applyFontToMenuItems(MenuItem menuItem, Typeface typeface) {
        CharSequence title = menuItem.getTitle();
        if (title == null) {
            title = "";
        }
        menuItem.setTitle(CustomTypefaceSpan2.withTypeface(title, typeface));
        SubMenu subMenu = menuItem.getSubMenu();
        if (subMenu != null) {
            int size = subMenu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = subMenu.getItem(i);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                applyFontToMenuItems(item, typeface);
            }
        }
    }
}
