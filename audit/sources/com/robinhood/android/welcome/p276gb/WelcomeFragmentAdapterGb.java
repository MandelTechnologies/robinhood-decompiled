package com.robinhood.android.welcome.p276gb;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.robinhood.android.api.swipeycontent.SwipeyContent;
import com.robinhood.android.welcome.p276gb.WelcomeFeatureFragmentGb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeFragmentAdapterGb.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/welcome/gb/WelcomeFragmentAdapterGb;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "items", "", "Lcom/robinhood/android/welcome/gb/WelcomePageGb;", "swipeyContent", "Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/util/List;Lcom/robinhood/android/api/swipeycontent/SwipeyContent;)V", "getItemCount", "", "createFragment", "position", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WelcomeFragmentAdapterGb extends FragmentStateAdapter {
    private List<? extends WelcomePageGb> items;
    private final SwipeyContent swipeyContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragmentAdapterGb(Fragment fragment, List<? extends WelcomePageGb> items, SwipeyContent swipeyContent) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.swipeyContent = swipeyContent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size() + 1;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int position) {
        if (position == 0) {
            return WelcomeIntroFragmentGb.INSTANCE.newInstance();
        }
        if (1 <= position && position <= this.items.size()) {
            WelcomePageGb welcomePageGb = this.items.get(position - 1);
            return WelcomeFeatureFragmentGb.INSTANCE.newInstance((Parcelable) new WelcomeFeatureFragmentGb.Args(welcomePageGb, welcomePageGb == WelcomePageGb.PAGE_THREE ? this.swipeyContent : null));
        }
        throw new IllegalStateException(("Invalid position " + position).toString());
    }
}
