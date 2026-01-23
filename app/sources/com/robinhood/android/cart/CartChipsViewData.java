package com.robinhood.android.cart;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CartChipsViewData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cart/CartChipsViewData;", "", "title", "", "items", "", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "viewModels", "getViewModels", "chipRowCount", "", "getChipRowCount", "()I", "expandable", "", "getExpandable", "()Z", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CartChipsViewData {
    private final List<CuratedListChipItem> items;
    private final String title;

    public CartChipsViewData(String title, List<CuratedListChipItem> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.items = items;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<CuratedListChipItem> getItems() {
        return this.items;
    }

    public final List<CuratedListChipItem> getViewModels() {
        return this.items;
    }

    public final int getChipRowCount() {
        if (getViewModels().size() < 4) {
            return 1;
        }
        return getViewModels().size() < 7 ? 2 : 3;
    }

    public final boolean getExpandable() {
        return !this.items.isEmpty();
    }
}
