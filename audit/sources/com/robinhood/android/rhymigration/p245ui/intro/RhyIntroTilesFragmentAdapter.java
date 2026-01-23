package com.robinhood.android.rhymigration.p245ui.intro;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.robinhood.android.rhymigration.p245ui.intro.RhyContrastIntroFragment;
import com.robinhood.android.rhymigration.p245ui.intro.RhyFeatureIntroFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyIntroTilesFragmentAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroTilesFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "getItemCount", "", "createFragment", "position", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyIntroTilesFragmentAdapter extends FragmentStateAdapter {
    public static final int $stable = 8;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyIntroTilesFragmentAdapter(Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int position) {
        if (position == 0) {
            return RhyFeatureIntroFragment.INSTANCE.newInstance((Parcelable) new RhyFeatureIntroFragment.Args(0, new Screen(Screen.Name.RHY_MIGRATION_FEATURE_REWARDS, null, null, null, 14, null), false, 4, null));
        }
        if (position == 1) {
            return RhyFeatureIntroFragment.INSTANCE.newInstance((Parcelable) new RhyFeatureIntroFragment.Args(1, new Screen(Screen.Name.RHY_MIGRATION_FEATURE_MERCHANT_REWARDS, null, null, null, 14, null), false, 4, null));
        }
        if (position == 2) {
            return RhyFeatureIntroFragment.INSTANCE.newInstance((Parcelable) new RhyFeatureIntroFragment.Args(2, new Screen(Screen.Name.RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT, null, null, null, 14, null), false, 4, null));
        }
        if (position == 3) {
            return RhyContrastIntroFragment.INSTANCE.newInstance((Parcelable) new RhyContrastIntroFragment.Args(new Screen(Screen.Name.RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS, null, null, null, 14, null)));
        }
        throw new IllegalStateException(("Invalid position: " + position).toString());
    }
}
