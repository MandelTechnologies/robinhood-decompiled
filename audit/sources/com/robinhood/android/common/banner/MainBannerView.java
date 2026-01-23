package com.robinhood.android.common.banner;

import android.R;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroup2;
import com.google.android.material.transition.platform.Hold;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.banner.BannerProvider;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SequencesKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import dagger.Lazy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MainBannerView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/banner/MainBannerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bannerToShowProvider", "Lcom/robinhood/android/common/banner/MainBannerView$BannerToShowProvider;", "getBannerToShowProvider", "()Lcom/robinhood/android/common/banner/MainBannerView$BannerToShowProvider;", "setBannerToShowProvider", "(Lcom/robinhood/android/common/banner/MainBannerView$BannerToShowProvider;)V", "mainBannerAppearanceRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/common/banner/MainBannerAppearance;", "kotlin.jvm.PlatformType", "bannerAppearanceObservable", "Lio/reactivex/Observable;", "getBannerAppearanceObservable", "()Lio/reactivex/Observable;", "onAttachedToWindow", "", "onDetachedFromWindow", "addBannerView", "view", "Landroid/view/View;", "BannerToShowProvider", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MainBannerView extends Hammer_MainBannerView {
    public static final int $stable = 8;
    public BannerToShowProvider bannerToShowProvider;
    private final BehaviorRelay<MainBannerAppearance> mainBannerAppearanceRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorRelay<MainBannerAppearance> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.mainBannerAppearanceRelay = behaviorRelayCreate;
    }

    public final BannerToShowProvider getBannerToShowProvider() {
        BannerToShowProvider bannerToShowProvider = this.bannerToShowProvider;
        if (bannerToShowProvider != null) {
            return bannerToShowProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bannerToShowProvider");
        return null;
    }

    public final void setBannerToShowProvider(BannerToShowProvider bannerToShowProvider) {
        Intrinsics.checkNotNullParameter(bannerToShowProvider, "<set-?>");
        this.bannerToShowProvider = bannerToShowProvider;
    }

    public final Observable<MainBannerAppearance> getBannerAppearanceObservable() {
        Observable<MainBannerAppearance> observableDistinctUntilChanged = this.mainBannerAppearanceRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(this, InsetSides.INSTANCE.m26683getTopXedK2Rk());
        ViewCompat.requestApplyInsets(this);
        getBannerToShowProvider().onAttachedToWindow();
        Observable<Optional<BannerProvider.Banner>> observable = getBannerToShowProvider().getObservable();
        ViewDisposerKt.bindTo$default(Views.baseActivity(this).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.banner.MainBannerView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainBannerView.onAttachedToWindow$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
        Observable observableDistinctUntilChanged = observable.map(new Function() { // from class: com.robinhood.android.common.banner.MainBannerView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final Optional<View> apply(Optional<BannerProvider.Banner> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                BannerProvider.Banner bannerComponent1 = optional.component1();
                return Optional3.asOptional(bannerComponent1 != null ? bannerComponent1.getView() : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.banner.MainBannerView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainBannerView.onAttachedToWindow$lambda$5(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = observable.map(new Function() { // from class: com.robinhood.android.common.banner.MainBannerView.onAttachedToWindow.4
            @Override // io.reactivex.functions.Function
            public final MainBannerAppearance apply(Optional<BannerProvider.Banner> optional) {
                MainBannerAppearance2 statusBarStyle;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                BannerProvider.Banner bannerComponent1 = optional.component1();
                ResourceReferences4<Integer> backgroundColorReference = bannerComponent1 != null ? bannerComponent1.getBackgroundColorReference() : null;
                if (bannerComponent1 == null || (statusBarStyle = bannerComponent1.getStatusBarStyle()) == null) {
                    statusBarStyle = MainBannerAppearance2.AUTO;
                }
                return new MainBannerAppearance(backgroundColorReference, statusBarStyle);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), this, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.banner.MainBannerView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainBannerView.onAttachedToWindow$lambda$6(this.f$0, (MainBannerAppearance) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(MainBannerView mainBannerView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(mainBannerView), it, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$6(MainBannerView mainBannerView, MainBannerAppearance mainBannerAppearance) {
        mainBannerView.mainBannerAppearanceRelay.accept(mainBannerAppearance);
        ResourceReferences4<Integer> backgroundColor = mainBannerAppearance.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_1();
        }
        ScarletManager2.overrideAttribute(mainBannerView, R.attr.backgroundTint, backgroundColor);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBannerToShowProvider().onDetachedFromWindow();
    }

    private final void addBannerView(View view) {
        addView(view);
    }

    /* compiled from: MainBannerView.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B*\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/banner/MainBannerView$BannerToShowProvider;", "", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "bannerProviders", "Ldagger/Lazy;", "", "Lcom/robinhood/android/common/banner/BannerProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Ldagger/Lazy;)V", "observable", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/banner/BannerProvider$Banner;", "getObservable", "()Lio/reactivex/Observable;", "setObservable", "(Lio/reactivex/Observable;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class BannerToShowProvider {
        public static final int $stable = 8;
        private final AuthManager authManager;
        private final Lazy<Set<BannerProvider>> bannerProviders;
        public Observable<Optional<BannerProvider.Banner>> observable;

        public BannerToShowProvider(AuthManager authManager, Lazy<Set<BannerProvider>> bannerProviders) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(bannerProviders, "bannerProviders");
            this.authManager = authManager;
            this.bannerProviders = bannerProviders;
        }

        public final Observable<Optional<BannerProvider.Banner>> getObservable() {
            Observable<Optional<BannerProvider.Banner>> observable = this.observable;
            if (observable != null) {
                return observable;
            }
            Intrinsics.throwUninitializedPropertyAccessException("observable");
            return null;
        }

        public final void setObservable(Observable<Optional<BannerProvider.Banner>> observable) {
            Intrinsics.checkNotNullParameter(observable, "<set-?>");
            this.observable = observable;
        }

        public final void onAttachedToWindow() {
            Set<BannerProvider> set = this.bannerProviders.get();
            Intrinsics.checkNotNullExpressionValue(set, "get(...)");
            ArrayList<BannerProvider> arrayList = new ArrayList();
            for (Object obj : set) {
                if (((BannerProvider) obj).getSupportsLoggedOut() || this.authManager.isLoggedIn()) {
                    arrayList.add(obj);
                }
            }
            for (BannerProvider bannerProvider : arrayList) {
                if (bannerProvider.getPriority() < 0) {
                    throw new IllegalStateException("Priority must not be negative");
                }
                bannerProvider.onParentViewAttachedToWindow();
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (final BannerProvider bannerProvider2 : arrayList) {
                arrayList2.add(bannerProvider2.getBannerObservable().startWith((Observable<Optional<BannerProvider.Banner>>) Optional2.INSTANCE).map(new Function() { // from class: com.robinhood.android.common.banner.MainBannerView$BannerToShowProvider$onAttachedToWindow$bannerObservables$1$1
                    @Override // io.reactivex.functions.Function
                    public final Optional<Tuples2<BannerProvider.Banner, Integer>> apply(Optional<BannerProvider.Banner> optional) {
                        Intrinsics.checkNotNullParameter(optional, "<destruct>");
                        BannerProvider.Banner bannerComponent1 = optional.component1();
                        return Optional3.asOptional(bannerComponent1 == null ? null : Tuples4.m3642to(bannerComponent1, Integer.valueOf(bannerProvider2.getPriority())));
                    }
                }));
            }
            setObservable(Observable.combineLatest(arrayList2, new Function() { // from class: com.robinhood.android.common.banner.MainBannerView$BannerToShowProvider$onAttachedToWindow$2
                @Override // io.reactivex.functions.Function
                public final List<Optional<Tuples2<BannerProvider.Banner, Integer>>> apply(Object[] items) {
                    Intrinsics.checkNotNullParameter(items, "items");
                    ArrayList arrayList3 = new ArrayList(items.length);
                    for (Object obj2 : items) {
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.robinhood.utils.Optional<kotlin.Pair<com.robinhood.android.common.banner.BannerProvider.Banner, kotlin.Int>>");
                        arrayList3.add((Optional) obj2);
                    }
                    return arrayList3;
                }
            }).map(new Function() { // from class: com.robinhood.android.common.banner.MainBannerView$BannerToShowProvider$onAttachedToWindow$3
                @Override // io.reactivex.functions.Function
                public final Optional<BannerProvider.Banner> apply(List<? extends Optional<Tuples2<BannerProvider.Banner, Integer>>> items) {
                    T next;
                    Intrinsics.checkNotNullParameter(items, "items");
                    Iterator<T> itIterator2 = SequencesKt.filterIsPresent(items).iterator2();
                    if (itIterator2.hasNext()) {
                        next = itIterator2.next();
                        if (itIterator2.hasNext()) {
                            int iIntValue = ((Number) ((Tuples2) next).component2()).intValue();
                            do {
                                T next2 = itIterator2.next();
                                int iIntValue2 = ((Number) ((Tuples2) next2).component2()).intValue();
                                if (iIntValue > iIntValue2) {
                                    next = next2;
                                    iIntValue = iIntValue2;
                                }
                            } while (itIterator2.hasNext());
                        }
                    } else {
                        next = (T) null;
                    }
                    Tuples2 tuples2 = next;
                    return Optional3.asOptional(tuples2 != null ? (BannerProvider.Banner) tuples2.getFirst() : null);
                }
            }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.banner.MainBannerView$BannerToShowProvider$onAttachedToWindow$4
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Optional<BannerProvider.Banner>> apply(Optional<BannerProvider.Banner> banner) {
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    if (banner instanceof Optional2) {
                        IdlingResourceCounters2.setBusy(IdlingResourceType.MAIN_BANNER_VIEW_DELAY, true);
                        return Observable.just(banner).delay(1L, TimeUnit.SECONDS).doOnNext(new Consumer() { // from class: com.robinhood.android.common.banner.MainBannerView$BannerToShowProvider$onAttachedToWindow$4.1
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Optional2 optional2) {
                                IdlingResourceCounters2.setBusy(IdlingResourceType.MAIN_BANNER_VIEW_DELAY, false);
                            }
                        }).doFinally(new Action() { // from class: com.robinhood.android.common.banner.MainBannerView$BannerToShowProvider$onAttachedToWindow$4.2
                            @Override // io.reactivex.functions.Action
                            public final void run() {
                                IdlingResourceCounters2.setBusy(IdlingResourceType.MAIN_BANNER_VIEW_DELAY, false);
                            }
                        });
                    }
                    return Observable.just(banner);
                }
            }).replay(1).refCount());
        }

        public final void onDetachedFromWindow() {
            Iterator<BannerProvider> it = this.bannerProviders.get().iterator();
            while (it.hasNext()) {
                it.next().onParentViewDetachedFromWindow();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$5(MainBannerView mainBannerView, Optional optional) {
        View view = (View) optional.component1();
        if ((mainBannerView.getVisibility() == 0) != (view != null)) {
            ViewParent parent = mainBannerView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.banner.MainBannerView$onAttachedToWindow$lambda$5$$inlined$beginDelayedTransition$1
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.banner.MainBannerView$onAttachedToWindow$lambda$5$$inlined$beginDelayedTransition$2
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            Transitions2.add(transitionSet, new ChangeBounds());
            TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.banner.MainBannerView$onAttachedToWindow$lambda$5$$inlined$beginDelayedTransition$3
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            transitionSet2.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.banner.MainBannerView$onAttachedToWindow$lambda$5$$inlined$beginDelayedTransition$4
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            SimpleSlide simpleSlide = new SimpleSlide(48);
            simpleSlide.addTarget(mainBannerView);
            transitionSet2.addTransition(simpleSlide);
            View view2 = (View) kotlin.sequences.SequencesKt.firstOrNull(ViewGroup2.getChildren(mainBannerView));
            if (view2 != null) {
                Hold hold = new Hold();
                hold.addTarget(view2);
                transitionSet2.addTransition(hold);
            }
            TransitionManager.beginDelayedTransition(mainBannerView, transitionSet2);
        }
        mainBannerView.removeAllViews();
        if (view != null) {
            mainBannerView.addBannerView(view);
        }
        mainBannerView.setVisibility(mainBannerView.getChildCount() != 0 ? 0 : 8);
        return Unit.INSTANCE;
    }
}
