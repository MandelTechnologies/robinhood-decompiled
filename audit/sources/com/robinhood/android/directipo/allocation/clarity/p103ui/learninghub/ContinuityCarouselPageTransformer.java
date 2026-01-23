package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ContinuityCarouselPageTransformer.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/ContinuityCarouselPageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "offsetPx", "", "pageMarginPx", "<init>", "(II)V", "transformPage", "", "page", "Landroid/view/View;", "position", "", "getParentViewPagerOrNull", "Landroidx/viewpager2/widget/ViewPager2;", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class ContinuityCarouselPageTransformer implements ViewPager2.PageTransformer {
    public static final int $stable = 0;
    private final int offsetPx;
    private final int pageMarginPx;

    public ContinuityCarouselPageTransformer(int i, int i2) {
        this.offsetPx = i;
        this.pageMarginPx = i2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View page, float position) {
        Intrinsics.checkNotNullParameter(page, "page");
        ViewPager2 parentViewPagerOrNull = getParentViewPagerOrNull(page);
        if (parentViewPagerOrNull != null && parentViewPagerOrNull.getOrientation() == 0) {
            float f = (-((r1 * 2) + r3)) * position;
            int i = this.offsetPx + this.pageMarginPx;
            ViewGroup.LayoutParams layoutParams = page.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i);
                page.setLayoutParams(marginLayoutParams);
                if (parentViewPagerOrNull.getLayoutDirection() == 1) {
                    f = -f;
                }
                page.setTranslationX(f);
                float fCoerceAtLeast = 0.1f;
                if (position >= -1.0f && position <= 1.0f) {
                    fCoerceAtLeast = RangesKt.coerceAtLeast(1 - Math.abs(position), 0.2f);
                }
                page.setAlpha(fCoerceAtLeast);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    private final ViewPager2 getParentViewPagerOrNull(View page) {
        ViewParent parent = page.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        return null;
    }
}
