package com.robinhood.android.common.p088ui.banner;

import com.robinhood.android.common.banner.MainBannerAppearance;
import com.robinhood.android.common.banner.MainBannerAppearance2;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerAppearanceHelper.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/banner/BannerAppearanceHelper;", "", "edgeToEdgeHost", "Lcom/robinhood/utils/ui/edge2edge/EdgeToEdgeHost;", "<init>", "(Lcom/robinhood/utils/ui/edge2edge/EdgeToEdgeHost;)V", "updateStatusBarAppearance", "", "appearance", "Lcom/robinhood/android/common/banner/MainBannerAppearance;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BannerAppearanceHelper {
    public static final int $stable = 8;
    private final EdgeToEdgeHost edgeToEdgeHost;

    public BannerAppearanceHelper(EdgeToEdgeHost edgeToEdgeHost) {
        Intrinsics.checkNotNullParameter(edgeToEdgeHost, "edgeToEdgeHost");
        this.edgeToEdgeHost = edgeToEdgeHost;
    }

    public final void updateStatusBarAppearance(MainBannerAppearance appearance, ScarletManager scarletManager) {
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        ResourceReferences4<Integer> backgroundColor = appearance.getBackgroundColor();
        MainBannerAppearance2 statusBarStyle = appearance.getStatusBarStyle();
        if (backgroundColor == null) {
            this.edgeToEdgeHost.resetStatusBarStyleOverride();
            return;
        }
        MainBannerAppearance2 mainBannerAppearance2 = MainBannerAppearance2.AUTO;
        MainBannerAppearance2 mainBannerAppearance22 = MainBannerAppearance2.LIGHT;
        boolean zContains = CollectionsKt.listOf((Object[]) new MainBannerAppearance2[]{mainBannerAppearance2, mainBannerAppearance22}).contains(statusBarStyle);
        boolean zContains2 = CollectionsKt.listOf((Object[]) new MainBannerAppearance2[]{MainBannerAppearance2.INVERTED, mainBannerAppearance22}).contains(statusBarStyle);
        EdgeToEdgeHost edgeToEdgeHost = this.edgeToEdgeHost;
        if (!DayNightChanges.isDay(scarletManager)) {
            zContains = zContains2;
        }
        edgeToEdgeHost.overrideStatusBarStyle(zContains);
    }
}
