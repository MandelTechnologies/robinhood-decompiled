package com.robinhood.android.common.onboarding.p085ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BaseSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u00013B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020(H\u0014J\b\u00101\u001a\u00020(H\u0014J\b\u00102\u001a\u00020(H\u0004R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b$\u0010%¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseSplashFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "contentLayoutId", "", "<init>", "(I)V", "()V", "actionTextRes", "getActionTextRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "linkTextRes", "getLinkTextRes", "pages", "", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getPages", "()Ljava/util/List;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "viewPager$delegate", "Lkotlin/properties/ReadOnlyProperty;", "indicators", "Lcom/robinhood/android/common/ui/view/DotIndicators;", "getIndicators", "()Lcom/robinhood/android/common/ui/view/DotIndicators;", "indicators$delegate", "actionButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getActionButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "actionButton$delegate", "linkTxt", "Landroid/widget/TextView;", "getLinkTxt", "()Landroid/widget/TextView;", "linkTxt$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onActionButtonClicked", "onLinkTextClicked", "refreshPages", "SplashPagerAdapter", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class BaseSplashFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseSplashFragment.class, "viewPager", "getViewPager()Landroidx/viewpager/widget/ViewPager;", 0)), Reflection.property1(new PropertyReference1Impl(BaseSplashFragment.class, "indicators", "getIndicators()Lcom/robinhood/android/common/ui/view/DotIndicators;", 0)), Reflection.property1(new PropertyReference1Impl(BaseSplashFragment.class, "actionButton", "getActionButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(BaseSplashFragment.class, "linkTxt", "getLinkTxt()Landroid/widget/TextView;", 0))};

    /* renamed from: actionButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 actionButton;
    private final Integer actionTextRes;

    /* renamed from: indicators$delegate, reason: from kotlin metadata */
    private final Interfaces2 indicators;
    private final Integer linkTextRes;

    /* renamed from: linkTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 linkTxt;

    /* renamed from: viewPager$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewPager;

    public abstract List<SplashPage> getPages();

    protected void onActionButtonClicked() {
    }

    protected void onLinkTextClicked() {
    }

    public BaseSplashFragment(int i) {
        super(i);
        this.viewPager = bindView(C11287R.id.splash_view_pager);
        this.indicators = bindView(C11287R.id.splash_indicators);
        this.actionButton = bindView(C11287R.id.splash_action_btn);
        this.linkTxt = bindView(C11287R.id.splash_link_txt);
    }

    public Integer getActionTextRes() {
        return this.actionTextRes;
    }

    public Integer getLinkTextRes() {
        return this.linkTextRes;
    }

    protected final ViewPager getViewPager() {
        return (ViewPager) this.viewPager.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DotIndicators getIndicators() {
        return (DotIndicators) this.indicators.getValue(this, $$delegatedProperties[1]);
    }

    protected final RdsButton getActionButton() {
        return (RdsButton) this.actionButton.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getLinkTxt() {
        return (TextView) this.linkTxt.getValue(this, $$delegatedProperties[3]);
    }

    public BaseSplashFragment() {
        this(C11287R.layout.fragment_base_splash);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        refreshPages();
        Integer actionTextRes = getActionTextRes();
        if (actionTextRes != null) {
            int iIntValue = actionTextRes.intValue();
            getActionButton().setVisibility(0);
            getActionButton().setText(iIntValue);
            OnClickListeners.onClick(getActionButton(), new BaseSplashFragment2(this));
        }
        Integer linkTextRes = getLinkTextRes();
        if (linkTextRes != null) {
            int iIntValue2 = linkTextRes.intValue();
            getLinkTxt().setVisibility(0);
            getLinkTxt().setText(iIntValue2);
            OnClickListeners.onClick(getLinkTxt(), new BaseSplashFragment3(this));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    protected final void refreshPages() throws Resources.NotFoundException {
        final SplashPagerAdapter splashPagerAdapter = new SplashPagerAdapter(this, getPages());
        getViewPager().setAdapter(splashPagerAdapter);
        final BaseSplashFragment4 baseSplashFragment4 = new BaseSplashFragment4(this);
        getViewPager().addOnPageChangeListener(baseSplashFragment4);
        ViewPager viewPager = getViewPager();
        if (!viewPager.isLaidOut() || viewPager.isLayoutRequested()) {
            viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.common.onboarding.ui.BaseSplashFragment$refreshPages$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (this.this$0.getViewPager().getCurrentItem() < splashPagerAdapter.getCount()) {
                        baseSplashFragment4.onPageSelected(this.this$0.getViewPager().getCurrentItem());
                    }
                }
            });
        } else if (getViewPager().getCurrentItem() < splashPagerAdapter.getCount()) {
            baseSplashFragment4.onPageSelected(getViewPager().getCurrentItem());
        }
        if (getPages().size() > 1) {
            getIndicators().setNumDots(getPages().size());
        } else {
            getIndicators().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseSplashFragment$SplashPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "pages", "", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "<init>", "(Lcom/robinhood/android/common/onboarding/ui/BaseSplashFragment;Ljava/util/List;)V", "boundViews", "", "Landroid/view/View;", "[Landroid/view/View;", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "destroyItem", "", "obj", "getCount", "isViewFromObject", "", "view", "get", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class SplashPagerAdapter extends PagerAdapter {
        private final View[] boundViews;
        private final List<SplashPage> pages;
        final /* synthetic */ BaseSplashFragment this$0;

        public SplashPagerAdapter(BaseSplashFragment baseSplashFragment, List<SplashPage> pages) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.this$0 = baseSplashFragment;
            this.pages = pages;
            this.boundViews = new View[pages.size()];
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            View viewRender = this.pages.get(position).render(container);
            this.boundViews[position] = viewRender;
            container.addView(viewRender);
            return viewRender;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object obj) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(obj, "obj");
            this.pages.get(position).stopAnimation();
            this.boundViews[position] = null;
            container.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.pages.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return Intrinsics.areEqual(view, obj);
        }

        public final View get(int position) {
            return this.boundViews[position];
        }
    }
}
