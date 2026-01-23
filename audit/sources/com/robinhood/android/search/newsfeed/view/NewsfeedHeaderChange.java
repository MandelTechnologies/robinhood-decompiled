package com.robinhood.android.search.newsfeed.view;

import com.robinhood.android.education.contracts.NewsfeedDisclosureKey;
import com.robinhood.android.search.C27909R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsfeedHeaderChange.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsfeedHeaderChange;", "", "showSearchInToolbar", "", "toolbarTitle", "", "newsFeedDisclosureKey", "Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "<init>", "(ZILcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;)V", "getShowSearchInToolbar", "()Z", "getToolbarTitle", "()I", "getNewsFeedDisclosureKey", "()Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NewsfeedHeaderChange {
    public static final int $stable = 8;
    private final NewsfeedDisclosureKey newsFeedDisclosureKey;
    private final boolean showSearchInToolbar;
    private final int toolbarTitle;

    public NewsfeedHeaderChange() {
        this(false, 0, null, 7, null);
    }

    public static /* synthetic */ NewsfeedHeaderChange copy$default(NewsfeedHeaderChange newsfeedHeaderChange, boolean z, int i, NewsfeedDisclosureKey newsfeedDisclosureKey, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = newsfeedHeaderChange.showSearchInToolbar;
        }
        if ((i2 & 2) != 0) {
            i = newsfeedHeaderChange.toolbarTitle;
        }
        if ((i2 & 4) != 0) {
            newsfeedDisclosureKey = newsfeedHeaderChange.newsFeedDisclosureKey;
        }
        return newsfeedHeaderChange.copy(z, i, newsfeedDisclosureKey);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowSearchInToolbar() {
        return this.showSearchInToolbar;
    }

    /* renamed from: component2, reason: from getter */
    public final int getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final NewsfeedDisclosureKey getNewsFeedDisclosureKey() {
        return this.newsFeedDisclosureKey;
    }

    public final NewsfeedHeaderChange copy(boolean showSearchInToolbar, int toolbarTitle, NewsfeedDisclosureKey newsFeedDisclosureKey) {
        Intrinsics.checkNotNullParameter(newsFeedDisclosureKey, "newsFeedDisclosureKey");
        return new NewsfeedHeaderChange(showSearchInToolbar, toolbarTitle, newsFeedDisclosureKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsfeedHeaderChange)) {
            return false;
        }
        NewsfeedHeaderChange newsfeedHeaderChange = (NewsfeedHeaderChange) other;
        return this.showSearchInToolbar == newsfeedHeaderChange.showSearchInToolbar && this.toolbarTitle == newsfeedHeaderChange.toolbarTitle && Intrinsics.areEqual(this.newsFeedDisclosureKey, newsfeedHeaderChange.newsFeedDisclosureKey);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.showSearchInToolbar) * 31) + Integer.hashCode(this.toolbarTitle)) * 31) + this.newsFeedDisclosureKey.hashCode();
    }

    public String toString() {
        return "NewsfeedHeaderChange(showSearchInToolbar=" + this.showSearchInToolbar + ", toolbarTitle=" + this.toolbarTitle + ", newsFeedDisclosureKey=" + this.newsFeedDisclosureKey + ")";
    }

    public NewsfeedHeaderChange(boolean z, int i, NewsfeedDisclosureKey newsFeedDisclosureKey) {
        Intrinsics.checkNotNullParameter(newsFeedDisclosureKey, "newsFeedDisclosureKey");
        this.showSearchInToolbar = z;
        this.toolbarTitle = i;
        this.newsFeedDisclosureKey = newsFeedDisclosureKey;
    }

    public final boolean getShowSearchInToolbar() {
        return this.showSearchInToolbar;
    }

    public /* synthetic */ NewsfeedHeaderChange(boolean z, int i, NewsfeedDisclosureKey newsfeedDisclosureKey, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C27909R.string.news_feed_header_title_us : i, (i2 & 4) != 0 ? NewsfeedDisclosureKey.INSTANCE.defaultForUs() : newsfeedDisclosureKey);
    }

    public final int getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final NewsfeedDisclosureKey getNewsFeedDisclosureKey() {
        return this.newsFeedDisclosureKey;
    }
}
