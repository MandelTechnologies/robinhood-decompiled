package com.robinhood.android.support.call.banner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.result.ActivityResultCaller;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.banner.BannerProvider;
import com.robinhood.android.common.banner.MainBannerAppearance2;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RxFragment;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.support.call.CallAssignedSnackbarManager;
import com.robinhood.android.support.call.banner.SupportCallBannerView;
import com.robinhood.android.support.call.extensions.BannerStyleDatas;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.disposer.ViewScopedObservable;
import com.robinhood.librobinhood.data.store.SupportPhoneIssueStore;
import com.robinhood.models.p355ui.Banner;
import com.robinhood.models.p355ui.BannerStyleData;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.p355ui.SimpleIssue;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallBannerProvider.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/support/call/banner/SupportCallBannerProvider;", "Lcom/robinhood/android/common/banner/BannerProvider;", "parentView", "Landroid/view/View;", "supportPhoneIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "callAssignedSnackbarManager", "Lcom/robinhood/android/support/call/CallAssignedSnackbarManager;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "<init>", "(Landroid/view/View;Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;Lcom/robinhood/android/support/call/CallAssignedSnackbarManager;Lcom/robinhood/userleap/UserLeapManager;)V", "priority", "", "getPriority", "()I", "bannerRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/banner/BannerProvider$Banner;", "kotlin.jvm.PlatformType", "bannerObservable", "Lio/reactivex/Observable;", "getBannerObservable", "()Lio/reactivex/Observable;", "onParentViewAttachedToWindow", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SupportCallBannerProvider implements BannerProvider {
    public static final int $stable = 8;
    private final BehaviorRelay<Optional<BannerProvider.Banner>> bannerRelay;
    private final CallAssignedSnackbarManager callAssignedSnackbarManager;
    private final View parentView;
    private final int priority;
    private final SupportPhoneIssueStore supportPhoneIssueStore;
    private final SurveyManager3 userLeapManager;

    @Override // com.robinhood.android.common.banner.BannerProvider
    public boolean getSupportsLoggedOut() {
        return BannerProvider.DefaultImpls.getSupportsLoggedOut(this);
    }

    @Override // com.robinhood.android.common.banner.BannerProvider
    public void onParentViewDetachedFromWindow() {
        BannerProvider.DefaultImpls.onParentViewDetachedFromWindow(this);
    }

    public SupportCallBannerProvider(View parentView, SupportPhoneIssueStore supportPhoneIssueStore, CallAssignedSnackbarManager callAssignedSnackbarManager, SurveyManager3 userLeapManager) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
        Intrinsics.checkNotNullParameter(callAssignedSnackbarManager, "callAssignedSnackbarManager");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.parentView = parentView;
        this.supportPhoneIssueStore = supportPhoneIssueStore;
        this.callAssignedSnackbarManager = callAssignedSnackbarManager;
        this.userLeapManager = userLeapManager;
        BehaviorRelay<Optional<BannerProvider.Banner>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.bannerRelay = behaviorRelayCreate;
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
        IdlingResourceCounters2.setBusy(IdlingResourceType.SUPPORT_CALL_BANNER_PROVIDER, true);
        Observable observableRefCount = ObservablesKt.mapFirstOptional(this.supportPhoneIssueStore.streamActiveIssues()).switchMap(new Function() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider$onParentViewAttachedToWindow$activeIssueObservable$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Issue.Phone>> apply(Optional<SimpleIssue> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                SimpleIssue simpleIssueComponent1 = optional.component1();
                if (simpleIssueComponent1 == null) {
                    Observable observableJust = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                Observable<R> map = this.this$0.supportPhoneIssueStore.streamIssue(simpleIssueComponent1.getId()).map(new Function() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider$onParentViewAttachedToWindow$activeIssueObservable$1$apply$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Issue issue = (Issue) it;
                        return Optional3.asOptional(issue instanceof Issue.Phone ? (Issue.Phone) issue : null);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((C28929x5d4c9b64<T, R>) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return ObservablesKt.toOptionals(ObservablesKt.filterIsPresent(map));
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableDoFinally = observableRefCount.doOnNext(new Consumer() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider.onParentViewAttachedToWindow.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Issue.Phone> optional) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.SUPPORT_CALL_BANNER_PROVIDER, false);
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider.onParentViewAttachedToWindow.2
            @Override // io.reactivex.functions.Action
            public final void run() {
                IdlingResourceCounters2.setBusy(IdlingResourceType.SUPPORT_CALL_BANNER_PROVIDER, false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoFinally, "doFinally(...)");
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableDoFinally), this.parentView, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerProvider.onParentViewAttachedToWindow$lambda$3(this.f$0, (Optional) obj);
            }
        });
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(observableRefCount).switchMap(new Function() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider.onParentViewAttachedToWindow.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Issue.Phone> apply(final Issue.Phone issue) {
                Intrinsics.checkNotNullParameter(issue, "issue");
                return SupportCallBannerProvider.this.supportPhoneIssueStore.streamDismissedPhoneIssue(issue).map(new Function() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider.onParentViewAttachedToWindow.4.1
                    @Override // io.reactivex.functions.Function
                    public final Issue.Phone apply(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return issue;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this.parentView, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerProvider.onParentViewAttachedToWindow$lambda$4(this.f$0, (Issue.Phone) obj);
            }
        });
        ViewScopedObservable.subscribe$default(ViewDisposerKt.bindTo(this.callAssignedSnackbarManager.start(), this.parentView, true), null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onParentViewAttachedToWindow$lambda$3(SupportCallBannerProvider supportCallBannerProvider, Optional optional) {
        ResourceReferences4 empty;
        ResourceReferences4 empty2;
        Issue.Phone phone = (Issue.Phone) optional.component1();
        Banner banner = phone != null ? phone.getBanner() : null;
        if (banner == null) {
            supportCallBannerProvider.bannerRelay.accept(Optional2.INSTANCE);
        } else {
            Optional<BannerProvider.Banner> value = supportCallBannerProvider.bannerRelay.getValue();
            if (value == null) {
                value = Optional2.INSTANCE;
            }
            BannerProvider.Banner bannerComponent1 = value.component1();
            ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
            ThemedResourceReference themedResourceReference = new ThemedResourceReference(ResourceType.BOOLEAN.INSTANCE, C20690R.attr.isDay);
            BannerStyleData light = banner.getStyles().getLight();
            Context context = supportCallBannerProvider.parentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer colorAttr = BannerStyleDatas.getColorAttr(light, context);
            if (colorAttr != null) {
                empty = new ThemedResourceReference(color, colorAttr.intValue());
            } else {
                empty = ResourceValue.INSTANCE.getEMPTY();
            }
            BannerStyleData dark = banner.getStyles().getDark();
            Context context2 = supportCallBannerProvider.parentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer colorAttr2 = BannerStyleDatas.getColorAttr(dark, context2);
            if (colorAttr2 != null) {
                empty2 = new ThemedResourceReference(color, colorAttr2.intValue());
            } else {
                empty2 = ResourceValue.INSTANCE.getEMPTY();
            }
            SelectorResource selectorResource = new SelectorResource(color, themedResourceReference, empty, empty2);
            if (bannerComponent1 == null) {
                SupportCallBannerView.Companion companion = SupportCallBannerView.INSTANCE;
                View view = supportCallBannerProvider.parentView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                SupportCallBannerView supportCallBannerViewInflate = companion.inflate((ViewGroup) view);
                supportCallBannerViewInflate.initTransitionView();
                supportCallBannerViewInflate.setIssueId(phone.getId());
                supportCallBannerProvider.bannerRelay.accept(Optional3.asOptional(new BannerProvider.Banner(supportCallBannerViewInflate, selectorResource, MainBannerAppearance2.LIGHT)));
            } else {
                View view2 = bannerComponent1.getView();
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.support.call.banner.SupportCallBannerView");
                ((SupportCallBannerView) view2).setIssueId(phone.getId());
                supportCallBannerProvider.bannerRelay.accept(Optional3.asOptional(BannerProvider.Banner.copy$default(bannerComponent1, null, selectorResource, null, 5, null)));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onParentViewAttachedToWindow$lambda$4(SupportCallBannerProvider supportCallBannerProvider, Issue.Phone phone) {
        Context context = supportCallBannerProvider.parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        BaseActivity baseActivity = appCompatActivityRequireActivityBaseContext instanceof BaseActivity ? (BaseActivity) appCompatActivityRequireActivityBaseContext : null;
        ActivityResultCaller currentFragment = baseActivity != null ? baseActivity.getCurrentFragment() : null;
        RxFragment rxFragment = currentFragment instanceof RxFragment ? (RxFragment) currentFragment : null;
        if (rxFragment != null) {
            supportCallBannerProvider.userLeapManager.presentSurveyIfNecessary(rxFragment, Survey.CX_MISSED_CALL_REQUEUE_DISMISS);
        }
        SupportPhoneIssueStore supportPhoneIssueStore = supportCallBannerProvider.supportPhoneIssueStore;
        Intrinsics.checkNotNull(phone);
        supportPhoneIssueStore.clearDismissedPhoneIssue(phone);
        return Unit.INSTANCE;
    }
}
