package com.robinhood.android.welcome;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeFragmentAdapter.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "hideSwipey", "", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "getItemCount", "", "createFragment", "position", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class WelcomeFragmentAdapter extends FragmentStateAdapter {
    private boolean hideSwipey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragmentAdapter(Fragment fragment, boolean z) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.hideSwipey = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.hideSwipey ? 1 : 4;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int position) {
        if (position == 0) {
            return WelcomeIntroFragment.INSTANCE.newInstance();
        }
        if (position == 1) {
            return WelcomeFeatureFragment.INSTANCE.newInstance((Parcelable) WelcomePage.PAGE_TWO);
        }
        if (position == 2) {
            return WelcomeFeatureFragment.INSTANCE.newInstance((Parcelable) WelcomePage.PAGE_THREE);
        }
        if (position == 3) {
            return WelcomeFeatureFragment.INSTANCE.newInstance((Parcelable) WelcomePage.PAGE_FOUR);
        }
        throw new IllegalStateException(("Invalid position " + position).toString());
    }
}
