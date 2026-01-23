package com.robinhood.iac.statusbanner;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.banner.BannerProvider;
import com.robinhood.android.common.banner.MainBannerAppearance2;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.iac.extensions.EventLoggers4;
import com.robinhood.iac.extensions.ServerToBentoColorMappers;
import com.robinhood.iac.statusbanner.IacStatusBannerView;
import com.robinhood.librobinhood.data.store.IacStatusBannerStore;
import com.robinhood.models.p320db.IacStatusBanner;
import com.robinhood.models.p320db.StatusBannerStyle;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacStatusBannerProvider.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00020\u001d*\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerProvider;", "Lcom/robinhood/android/common/banner/BannerProvider;", "parentView", "Landroid/view/View;", "iacStatusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Landroid/view/View;Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;Lcom/robinhood/analytics/EventLogger;)V", "bannerRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/banner/BannerProvider$Banner;", "kotlin.jvm.PlatformType", "priority", "", "getPriority", "()I", "bannerObservable", "Lio/reactivex/Observable;", "getBannerObservable", "()Lio/reactivex/Observable;", "onParentViewAttachedToWindow", "", "logAppearIfNeeded", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacStatusBanner;", "statusBarStyle", "Lcom/robinhood/android/common/banner/BannerStatusBarStyle;", "getStatusBarStyle", "(Lcom/robinhood/models/db/IacStatusBanner;)Lcom/robinhood/android/common/banner/BannerStatusBarStyle;", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class IacStatusBannerProvider implements BannerProvider {
    private final BehaviorRelay<Optional<BannerProvider.Banner>> bannerRelay;
    private final EventLogger eventLogger;
    private final IacStatusBannerStore iacStatusBannerStore;
    private final View parentView;
    private final int priority;

    public IacStatusBannerProvider(View parentView, IacStatusBannerStore iacStatusBannerStore, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(iacStatusBannerStore, "iacStatusBannerStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.parentView = parentView;
        this.iacStatusBannerStore = iacStatusBannerStore;
        this.eventLogger = eventLogger;
        BehaviorRelay<Optional<BannerProvider.Banner>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.bannerRelay = behaviorRelayCreate;
        this.priority = 10;
    }

    @Override // com.robinhood.android.common.banner.BannerProvider
    public boolean getSupportsLoggedOut() {
        return BannerProvider.DefaultImpls.getSupportsLoggedOut(this);
    }

    @Override // com.robinhood.android.common.banner.BannerProvider
    public void onParentViewDetachedFromWindow() {
        BannerProvider.DefaultImpls.onParentViewDetachedFromWindow(this);
    }

    @Override // com.robinhood.android.common.banner.BannerProvider
    public int getPriority() {
        return this.priority;
    }

    @Override // com.robinhood.android.common.banner.BannerProvider
    public Observable<Optional<BannerProvider.Banner>> getBannerObservable() {
        Observable<Optional<BannerProvider.Banner>> observableHide = this.bannerRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.robinhood.android.common.banner.BannerProvider
    public void onParentViewAttachedToWindow() {
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(this.iacStatusBannerStore.stream()), this.parentView, true).subscribeKotlin(new Function1() { // from class: com.robinhood.iac.statusbanner.IacStatusBannerProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IacStatusBannerProvider.onParentViewAttachedToWindow$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onParentViewAttachedToWindow$lambda$1(IacStatusBannerProvider iacStatusBannerProvider, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        IacStatusBanner iacStatusBanner = (IacStatusBanner) optional.component1();
        if (iacStatusBanner == null) {
            iacStatusBannerProvider.bannerRelay.accept(Optional2.INSTANCE);
        } else {
            Optional<BannerProvider.Banner> value = iacStatusBannerProvider.bannerRelay.getValue();
            if (value == null) {
                value = Optional2.INSTANCE;
            }
            BannerProvider.Banner bannerComponent1 = value.component1();
            iacStatusBannerProvider.logAppearIfNeeded(iacStatusBanner);
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMappers.mapDayNightSelectorServerColor(ServerToBentoColorMapper.INSTANCE, iacStatusBanner.getStyle().getBackgroundColor());
            MainBannerAppearance2 statusBarStyle = iacStatusBannerProvider.getStatusBarStyle(iacStatusBanner);
            if (bannerComponent1 == null) {
                BehaviorRelay<Optional<BannerProvider.Banner>> behaviorRelay = iacStatusBannerProvider.bannerRelay;
                IacStatusBannerView.Companion companion = IacStatusBannerView.INSTANCE;
                View view = iacStatusBannerProvider.parentView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                IacStatusBannerView iacStatusBannerViewInflate = companion.inflate((ViewGroup) view);
                iacStatusBannerViewInflate.setIacBanner(iacStatusBanner);
                behaviorRelay.accept(Optional3.asOptional(new BannerProvider.Banner(iacStatusBannerViewInflate, resourceReferences4MapDayNightSelectorServerColor, statusBarStyle)));
            } else {
                View view2 = bannerComponent1.getView();
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.iac.statusbanner.IacStatusBannerView");
                ((IacStatusBannerView) view2).setIacBanner(iacStatusBanner);
                iacStatusBannerProvider.bannerRelay.accept(Optional3.asOptional(BannerProvider.Banner.copy$default(bannerComponent1, null, resourceReferences4MapDayNightSelectorServerColor, null, 5, null)));
            }
        }
        return Unit.INSTANCE;
    }

    private final void logAppearIfNeeded(IacStatusBanner banner) {
        if (this.iacStatusBannerStore.shouldLogBanner(banner)) {
            EventLoggers4.logAppear(this.eventLogger, banner);
            this.iacStatusBannerStore.postSeen(banner.getReceiptUuid());
        }
    }

    private final MainBannerAppearance2 getStatusBarStyle(IacStatusBanner iacStatusBanner) {
        StatusBannerStyle style = iacStatusBanner.getStyle();
        boolean zAreEqual = Intrinsics.areEqual(style.getNativeTextColorForLight(), StatusBannerStyle.NATIVE_STATUS_WHITE);
        boolean zAreEqual2 = Intrinsics.areEqual(style.getNativeTextColorForDark(), StatusBannerStyle.NATIVE_STATUS_WHITE);
        if (zAreEqual && zAreEqual2) {
            return MainBannerAppearance2.DARK;
        }
        if (!zAreEqual && !zAreEqual2) {
            return MainBannerAppearance2.LIGHT;
        }
        if (zAreEqual && !zAreEqual2) {
            return MainBannerAppearance2.INVERTED;
        }
        return MainBannerAppearance2.AUTO;
    }
}
