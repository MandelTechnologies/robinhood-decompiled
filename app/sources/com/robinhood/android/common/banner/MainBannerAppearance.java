package com.robinhood.android.common.banner;

import com.robinhood.scarlet.util.resource.ResourceReferences4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainBannerAppearance.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/banner/MainBannerAppearance;", "", "backgroundColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "statusBarStyle", "Lcom/robinhood/android/common/banner/BannerStatusBarStyle;", "<init>", "(Lcom/robinhood/scarlet/util/resource/ResourceReference;Lcom/robinhood/android/common/banner/BannerStatusBarStyle;)V", "getBackgroundColor", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "getStatusBarStyle", "()Lcom/robinhood/android/common/banner/BannerStatusBarStyle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MainBannerAppearance {
    public static final int $stable = ResourceReferences4.$stable;
    private final ResourceReferences4<Integer> backgroundColor;
    private final MainBannerAppearance2 statusBarStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MainBannerAppearance copy$default(MainBannerAppearance mainBannerAppearance, ResourceReferences4 resourceReferences4, MainBannerAppearance2 mainBannerAppearance2, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceReferences4 = mainBannerAppearance.backgroundColor;
        }
        if ((i & 2) != 0) {
            mainBannerAppearance2 = mainBannerAppearance.statusBarStyle;
        }
        return mainBannerAppearance.copy(resourceReferences4, mainBannerAppearance2);
    }

    public final ResourceReferences4<Integer> component1() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final MainBannerAppearance2 getStatusBarStyle() {
        return this.statusBarStyle;
    }

    public final MainBannerAppearance copy(ResourceReferences4<Integer> backgroundColor, MainBannerAppearance2 statusBarStyle) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        return new MainBannerAppearance(backgroundColor, statusBarStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainBannerAppearance)) {
            return false;
        }
        MainBannerAppearance mainBannerAppearance = (MainBannerAppearance) other;
        return Intrinsics.areEqual(this.backgroundColor, mainBannerAppearance.backgroundColor) && this.statusBarStyle == mainBannerAppearance.statusBarStyle;
    }

    public int hashCode() {
        ResourceReferences4<Integer> resourceReferences4 = this.backgroundColor;
        return ((resourceReferences4 == null ? 0 : resourceReferences4.hashCode()) * 31) + this.statusBarStyle.hashCode();
    }

    public String toString() {
        return "MainBannerAppearance(backgroundColor=" + this.backgroundColor + ", statusBarStyle=" + this.statusBarStyle + ")";
    }

    public MainBannerAppearance(ResourceReferences4<Integer> resourceReferences4, MainBannerAppearance2 statusBarStyle) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        this.backgroundColor = resourceReferences4;
        this.statusBarStyle = statusBarStyle;
    }

    public final ResourceReferences4<Integer> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final MainBannerAppearance2 getStatusBarStyle() {
        return this.statusBarStyle;
    }
}
