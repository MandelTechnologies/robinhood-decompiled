package com.robinhood.android.accountcenter.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.common.p088ui.view.RhTabLayout;
import com.robinhood.android.font.RhTypeface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileAssetTabLayout.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u00020\u001a*\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAssetTabLayout;", "Lcom/robinhood/android/common/ui/view/RhTabLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onTabSelectedCallback", "Lkotlin/Function1;", "", "", "getOnTabSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnTabSelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "ignoreTabSelectedEvent", "", "bind", "state", "Lcom/robinhood/android/accountcenter/views/AssetTabsState;", "updateTabTextColor", "textColor", "Landroid/content/res/ColorStateList;", "addOrRemoveTabs", "textView", "Landroid/widget/TextView;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "getTextView", "(Lcom/google/android/material/tabs/TabLayout$Tab;)Landroid/widget/TextView;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ProfileAssetTabLayout extends RhTabLayout {
    public static final int $stable = 8;
    private boolean ignoreTabSelectedEvent;
    private Function1<? super String, Unit> onTabSelectedCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(context, this) { // from class: com.robinhood.android.accountcenter.views.ProfileAssetTabLayout.1
            private final Typeface boldTypeface;
            private final Typeface regularTypeface;
            final /* synthetic */ ProfileAssetTabLayout this$0;

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }

            {
                this.this$0 = this;
                this.regularTypeface = RhTypeface.REGULAR.load(context);
                this.boldTypeface = RhTypeface.BOLD.load(context);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                this.this$0.getTextView(tab).setTypeface(this.regularTypeface);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                this.this$0.getTextView(tab).setTypeface(this.boldTypeface);
                if (this.this$0.ignoreTabSelectedEvent) {
                    return;
                }
                Object tag = tab.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AssetTabItem");
                AssetTabItem assetTabItem = (AssetTabItem) tag;
                Function1<String, Unit> onTabSelectedCallback = this.this$0.getOnTabSelectedCallback();
                if (onTabSelectedCallback != null) {
                    onTabSelectedCallback.invoke(assetTabItem.getId());
                }
            }
        });
    }

    public final Function1<String, Unit> getOnTabSelectedCallback() {
        return this.onTabSelectedCallback;
    }

    public final void setOnTabSelectedCallback(Function1<? super String, Unit> function1) {
        this.onTabSelectedCallback = function1;
    }

    public final void bind(AssetTabsState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        addOrRemoveTabs(state);
        int i = 0;
        for (AssetTabItem assetTabItem : state.getItems()) {
            int i2 = i + 1;
            TabLayout.Tab tabAt = getTabAt(i);
            Intrinsics.checkNotNull(tabAt);
            tabAt.setTag(assetTabItem);
            tabAt.setText(assetTabItem.getName());
            if (Intrinsics.areEqual(assetTabItem.getId(), state.getSelectedAssetId())) {
                this.ignoreTabSelectedEvent = true;
                tabAt.select();
                this.ignoreTabSelectedEvent = false;
            }
            i = i2;
        }
    }

    public final void updateTabTextColor(ColorStateList textColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        int tabCount = getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = getTabAt(i);
            Intrinsics.checkNotNull(tabAt);
            getTextView(tabAt).setTextColor(textColor);
        }
    }

    private final void addOrRemoveTabs(AssetTabsState state) {
        this.ignoreTabSelectedEvent = true;
        int tabCount = getTabCount();
        if (tabCount < state.getItems().size()) {
            int size = state.getItems().size() - tabCount;
            for (int i = 0; i < size; i++) {
                addTab(newTab().setCustomView(C8293R.layout.profile_asset_tab_item));
            }
        } else if (tabCount > state.getItems().size()) {
            int size2 = tabCount - state.getItems().size();
            for (int i2 = 0; i2 < size2; i2++) {
                removeTabAt(getTabCount() - 1);
            }
        }
        this.ignoreTabSelectedEvent = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTextView(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        Intrinsics.checkNotNull(customView);
        View viewFindViewById = customView.findViewById(R.id.text1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (TextView) viewFindViewById;
    }
}
