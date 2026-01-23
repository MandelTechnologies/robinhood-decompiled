package com.robinhood.android.common.onboarding.p085ui;

import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

/* compiled from: BaseSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"com/robinhood/android/common/onboarding/ui/BaseSplashFragment$refreshPages$pageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "previousPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "onPageSelected", "", "position", "", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.onboarding.ui.BaseSplashFragment$refreshPages$pageChangeListener$1, reason: use source file name */
/* loaded from: classes2.dex */
public final class BaseSplashFragment4 extends ViewPager.SimpleOnPageChangeListener {
    private SplashPage previousPage;
    final /* synthetic */ BaseSplashFragment this$0;

    BaseSplashFragment4(BaseSplashFragment baseSplashFragment) {
        this.this$0 = baseSplashFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        super.onPageSelected(position);
        this.this$0.getIndicators().setNumActivated(position);
        SplashPage splashPage = this.previousPage;
        if (splashPage != null) {
            splashPage.stopAnimation();
        }
        SplashPage splashPage2 = this.this$0.getPages().get(position);
        splashPage2.startAnimation();
        this.previousPage = splashPage2;
    }
}
