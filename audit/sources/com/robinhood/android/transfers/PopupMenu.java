package com.robinhood.android.transfers;

import android.content.Context;
import android.view.Menu;
import android.view.View;
import com.robinhood.android.common.util.TypefaceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PopupMenu.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/PopupMenu;", "Landroid/widget/PopupMenu;", "context", "Landroid/content/Context;", "anchor", "Landroid/view/View;", "gravity", "", "<init>", "(Landroid/content/Context;Landroid/view/View;I)V", "show", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PopupMenu extends android.widget.PopupMenu {
    public static final int $stable = 8;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenu(Context context, View anchor, int i) {
        super(context, anchor, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.context = context;
    }

    @Override // android.widget.PopupMenu
    public void show() {
        TypefaceUtils typefaceUtils = TypefaceUtils.INSTANCE;
        Context context = this.context;
        Menu menu = getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        TypefaceUtils.applyFontToMenu$default(typefaceUtils, context, menu, null, 4, null);
        super.show();
    }
}
