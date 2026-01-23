package com.robinhood.android.common.banner;

import android.view.View;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerProvider.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/banner/BannerProvider;", "", "supportsLoggedOut", "", "getSupportsLoggedOut", "()Z", "priority", "", "getPriority", "()I", "bannerObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/banner/BannerProvider$Banner;", "getBannerObservable", "()Lio/reactivex/Observable;", "onParentViewAttachedToWindow", "", "onParentViewDetachedFromWindow", "Banner", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface BannerProvider {

    /* compiled from: BannerProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean getSupportsLoggedOut(BannerProvider bannerProvider) {
            return false;
        }

        public static void onParentViewAttachedToWindow(BannerProvider bannerProvider) {
        }

        public static void onParentViewDetachedFromWindow(BannerProvider bannerProvider) {
        }
    }

    Observable<Optional<Banner>> getBannerObservable();

    int getPriority();

    boolean getSupportsLoggedOut();

    void onParentViewAttachedToWindow();

    void onParentViewDetachedFromWindow();

    /* compiled from: BannerProvider.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/banner/BannerProvider$Banner;", "", "view", "Landroid/view/View;", "backgroundColorReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "statusBarStyle", "Lcom/robinhood/android/common/banner/BannerStatusBarStyle;", "<init>", "(Landroid/view/View;Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/android/common/banner/BannerStatusBarStyle;)V", "getView", "()Landroid/view/View;", "getBackgroundColorReference", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getStatusBarStyle", "()Lcom/robinhood/android/common/banner/BannerStatusBarStyle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Banner {
        public static final int $stable = 8;
        private final ResourceReferences4<Integer> backgroundColorReference;
        private final MainBannerAppearance2 statusBarStyle;
        private final View view;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Banner copy$default(Banner banner, View view, ResourceReferences4 resourceReferences4, MainBannerAppearance2 mainBannerAppearance2, int i, Object obj) {
            if ((i & 1) != 0) {
                view = banner.view;
            }
            if ((i & 2) != 0) {
                resourceReferences4 = banner.backgroundColorReference;
            }
            if ((i & 4) != 0) {
                mainBannerAppearance2 = banner.statusBarStyle;
            }
            return banner.copy(view, resourceReferences4, mainBannerAppearance2);
        }

        /* renamed from: component1, reason: from getter */
        public final View getView() {
            return this.view;
        }

        public final ResourceReferences4<Integer> component2() {
            return this.backgroundColorReference;
        }

        /* renamed from: component3, reason: from getter */
        public final MainBannerAppearance2 getStatusBarStyle() {
            return this.statusBarStyle;
        }

        public final Banner copy(View view, ResourceReferences4<Integer> backgroundColorReference, MainBannerAppearance2 statusBarStyle) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
            return new Banner(view, backgroundColorReference, statusBarStyle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.areEqual(this.view, banner.view) && Intrinsics.areEqual(this.backgroundColorReference, banner.backgroundColorReference) && this.statusBarStyle == banner.statusBarStyle;
        }

        public int hashCode() {
            int iHashCode = this.view.hashCode() * 31;
            ResourceReferences4<Integer> resourceReferences4 = this.backgroundColorReference;
            return ((iHashCode + (resourceReferences4 == null ? 0 : resourceReferences4.hashCode())) * 31) + this.statusBarStyle.hashCode();
        }

        public String toString() {
            return "Banner(view=" + this.view + ", backgroundColorReference=" + this.backgroundColorReference + ", statusBarStyle=" + this.statusBarStyle + ")";
        }

        public Banner(View view, ResourceReferences4<Integer> resourceReferences4, MainBannerAppearance2 statusBarStyle) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
            this.view = view;
            this.backgroundColorReference = resourceReferences4;
            this.statusBarStyle = statusBarStyle;
        }

        public final View getView() {
            return this.view;
        }

        public final ResourceReferences4<Integer> getBackgroundColorReference() {
            return this.backgroundColorReference;
        }

        public final MainBannerAppearance2 getStatusBarStyle() {
            return this.statusBarStyle;
        }
    }
}
