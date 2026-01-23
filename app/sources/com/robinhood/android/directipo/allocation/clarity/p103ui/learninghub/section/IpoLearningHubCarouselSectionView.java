package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhTabLayout;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.MergeIpoLearningHubCarouselSectionViewBinding;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.ContinuityCarouselPageTransformer;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.DirectIpoLearningHubCarouselPagerAdapter;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSection;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSectionData;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: IpoLearningHubCarouselSectionView.kt */
@Metadata(m3635d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0019\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u001cH\u0014J\b\u0010&\u001a\u00020\u001cH\u0014R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubCarouselSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubCarouselSectionViewBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubCarouselSectionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pagerAdapter", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubCarouselPagerAdapter;", "tabLayoutMediator", "Lcom/google/android/material/tabs/TabLayoutMediator;", "pageMargin", "", "pageOffset", "pageTransformer", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/ContinuityCarouselPageTransformer;", "pageChangeListener", "com/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubCarouselSectionView$pageChangeListener$1", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubCarouselSectionView$pageChangeListener$1;", "bind", "", "state", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubSectionData$Carousel;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "onConfigureTab", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "position", "onAttachedToWindow", "onDetachedFromWindow", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class IpoLearningHubCarouselSectionView extends ConstraintLayout implements TabLayoutMediator.TabConfigurationStrategy {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final IpoLearningHubCarouselSectionView3 pageChangeListener;
    private final int pageMargin;
    private final int pageOffset;
    private final ContinuityCarouselPageTransformer pageTransformer;
    private final DirectIpoLearningHubCarouselPagerAdapter pagerAdapter;
    private TabLayoutMediator tabLayoutMediator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IpoLearningHubCarouselSectionView.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/MergeIpoLearningHubCarouselSectionViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IpoLearningHubCarouselSectionView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IpoAccessLearningHubSectionData.CarouselStyle.values().length];
            try {
                iArr[IpoAccessLearningHubSectionData.CarouselStyle.CONTINUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int position) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubCarouselSectionView$pageChangeListener$1] */
    public IpoLearningHubCarouselSectionView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, IpoLearningHubCarouselSectionView2.INSTANCE);
        this.pagerAdapter = new DirectIpoLearningHubCarouselPagerAdapter();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C14172R.dimen.learning_hub_page_margin);
        this.pageMargin = dimensionPixelOffset;
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C14172R.dimen.learning_hub_carousel_offset);
        this.pageOffset = dimensionPixelOffset2;
        this.pageTransformer = new ContinuityCarouselPageTransformer(dimensionPixelOffset2, dimensionPixelOffset);
        this.pageChangeListener = new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubCarouselSectionView$pageChangeListener$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                KeyEvent.Callback callbackFindViewWithTag = this.this$0.getBinding().sectionViewPager.findViewWithTag(Integer.valueOf(position));
                if (callbackFindViewWithTag instanceof CarouselAnimatedView) {
                    ((CarouselAnimatedView) callbackFindViewWithTag).playAnimation();
                }
            }
        };
        ViewGroups.inflate(this, C14172R.layout.merge_ipo_learning_hub_carousel_section_view, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MergeIpoLearningHubCarouselSectionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIpoLearningHubCarouselSectionViewBinding) value;
    }

    public final void bind(IpoAccessLearningHubSectionData.Carousel state, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        this.pagerAdapter.setDayNightOverlay(dayNightOverlay);
        DirectIpoLearningHubCarouselPagerAdapter directIpoLearningHubCarouselPagerAdapter = this.pagerAdapter;
        List<IpoAccessLearningHubSection> items = state.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((IpoAccessLearningHubSection) it.next()).getSectionData());
        }
        directIpoLearningHubCarouselPagerAdapter.submitList(arrayList);
        getBinding().sectionViewPager.setAdapter(this.pagerAdapter);
        if (WhenMappings.$EnumSwitchMapping$0[state.getCarouselStyle().ordinal()] == 1) {
            RhTabLayout tabLayout = getBinding().tabLayout;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            tabLayout.setVisibility(8);
            TabLayoutMediator tabLayoutMediator = this.tabLayoutMediator;
            if (tabLayoutMediator != null) {
                tabLayoutMediator.detach();
            }
            ViewPager2 viewPager2 = getBinding().sectionViewPager;
            viewPager2.setClipToPadding(false);
            viewPager2.setClipChildren(false);
            viewPager2.setOffscreenPageLimit(3);
            getBinding().sectionViewPager.setPageTransformer(this.pageTransformer);
            return;
        }
        RhTabLayout tabLayout2 = getBinding().tabLayout;
        Intrinsics.checkNotNullExpressionValue(tabLayout2, "tabLayout");
        tabLayout2.setVisibility(0);
        TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(getBinding().tabLayout, getBinding().sectionViewPager, this);
        this.tabLayoutMediator = tabLayoutMediator2;
        tabLayoutMediator2.attach();
        getBinding().sectionViewPager.setPageTransformer(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().sectionViewPager.registerOnPageChangeCallback(this.pageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TabLayoutMediator tabLayoutMediator = this.tabLayoutMediator;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        getBinding().sectionViewPager.unregisterOnPageChangeCallback(this.pageChangeListener);
    }

    /* compiled from: IpoLearningHubCarouselSectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubCarouselSectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/section/IpoLearningHubCarouselSectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IpoLearningHubCarouselSectionView> {
        private final /* synthetic */ Inflater<IpoLearningHubCarouselSectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IpoLearningHubCarouselSectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IpoLearningHubCarouselSectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14172R.layout.include_ipo_learning_hub_carousel_section_view);
        }
    }
}
