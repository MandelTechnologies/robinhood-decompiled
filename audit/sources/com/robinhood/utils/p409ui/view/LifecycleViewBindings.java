package com.robinhood.utils.p409ui.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.disposer.ScopedFlowable;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.utils.p409ui.view.LifecycleViewBindings;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LifecycleViewBindings.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\bH\u0016J\f\u0010\t\u001a\u00020\n*\u00020\nH\u0016J\f\u0010\t\u001a\u00020\u0003*\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\f\u0010\t\u001a\u00020\u0003*\u00020\u000fH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/LifecycleViewBindings;", "Lcom/robinhood/disposer/LifecycleHost;", "bindAdapter", "", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "bind", "Landroid/view/ViewPropertyAnimator;", "Landroid/animation/ValueAnimator;", "addLifecycleAwareUpdateListener", "listener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/AnimatorSet;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface LifecycleViewBindings extends LifecycleHost {
    void addLifecycleAwareUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener);

    ViewPropertyAnimator bind(ViewPropertyAnimator viewPropertyAnimator);

    void bind(AnimatorSet animatorSet);

    void bind(ValueAnimator valueAnimator);

    void bindAdapter(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter);

    void bindAdapter(ViewPager2 viewPager2, FragmentStateAdapter fragmentStateAdapter);

    /* compiled from: LifecycleViewBindings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static ScopedCompletable bind(LifecycleViewBindings lifecycleViewBindings, Completable receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(lifecycleViewBindings, receiver, terminalEvent);
        }

        public static <T> ScopedFlowable<T> bind(LifecycleViewBindings lifecycleViewBindings, Flowable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(lifecycleViewBindings, receiver, terminalEvent);
        }

        public static <T> ScopedMaybe<T> bind(LifecycleViewBindings lifecycleViewBindings, Maybe<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(lifecycleViewBindings, receiver, terminalEvent);
        }

        public static <T> ScopedObservable<T> bind(LifecycleViewBindings lifecycleViewBindings, Observable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(lifecycleViewBindings, receiver, terminalEvent);
        }

        public static <T> ScopedSingle<T> bind(LifecycleViewBindings lifecycleViewBindings, Single<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(lifecycleViewBindings, receiver, terminalEvent);
        }

        public static void bindAdapter(LifecycleViewBindings lifecycleViewBindings, final RecyclerView receiver, RecyclerView.Adapter<?> adapter) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            LifecycleEvent value = lifecycleViewBindings.getLifecycleEvents().getValue();
            Intrinsics.checkNotNull(value);
            LifecycleEvent lifecycleEvent = value;
            if (lifecycleEvent.compareTo(LifecycleEvent.ON_CREATE_VIEW) < 0 || lifecycleEvent.compareTo(LifecycleEvent.ON_DESTROY_VIEW) >= 0) {
                throw new IllegalStateException(("Cannot bind RecyclerView adapter in state for last event " + lifecycleEvent).toString());
            }
            receiver.setAdapter(adapter);
            Observable<LifecycleEvent> observableTake = lifecycleViewBindings.getLifecycleEvents().filter(new Predicate() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings.bindAdapter.2
                @Override // io.reactivex.functions.Predicate
                public final boolean test(LifecycleEvent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it == LifecycleEvent.ON_DESTROY_VIEW;
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            lifecycleViewBindings.bind(observableTake, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings$DefaultImpls$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LifecycleViewBindings.DefaultImpls.bindAdapter$lambda$1(receiver, (LifecycleEvent) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit bindAdapter$lambda$1(RecyclerView recyclerView, LifecycleEvent lifecycleEvent) {
            recyclerView.stopScroll();
            recyclerView.swapAdapter(null, false);
            return Unit.INSTANCE;
        }

        public static void bindAdapter(LifecycleViewBindings lifecycleViewBindings, final ViewPager2 receiver, FragmentStateAdapter adapter) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            LifecycleEvent value = lifecycleViewBindings.getLifecycleEvents().getValue();
            Intrinsics.checkNotNull(value);
            LifecycleEvent lifecycleEvent = value;
            if (lifecycleEvent.compareTo(LifecycleEvent.ON_CREATE_VIEW) < 0 || lifecycleEvent.compareTo(LifecycleEvent.ON_DESTROY_VIEW) >= 0) {
                throw new IllegalStateException(("Cannot bind ViewPager2 adapter in state for last event " + lifecycleEvent).toString());
            }
            receiver.setAdapter(adapter);
            Observable<LifecycleEvent> observableTake = lifecycleViewBindings.getLifecycleEvents().filter(new Predicate() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings.bindAdapter.5
                @Override // io.reactivex.functions.Predicate
                public final boolean test(LifecycleEvent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it == LifecycleEvent.ON_DESTROY_VIEW;
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            lifecycleViewBindings.bind(observableTake, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings$DefaultImpls$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LifecycleViewBindings.DefaultImpls.bindAdapter$lambda$3(receiver, (LifecycleEvent) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit bindAdapter$lambda$3(ViewPager2 viewPager2, LifecycleEvent lifecycleEvent) {
            viewPager2.setAdapter(null);
            return Unit.INSTANCE;
        }

        public static ViewPropertyAnimator bind(LifecycleViewBindings lifecycleViewBindings, final ViewPropertyAnimator receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Observable<LifecycleEvent> observableTake = lifecycleViewBindings.getLifecycleEvents().filter(new Predicate() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings.bind.1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(LifecycleEvent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it == LifecycleEvent.ON_DESTROY_VIEW;
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            lifecycleViewBindings.bind(observableTake, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings$DefaultImpls$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LifecycleViewBindings.DefaultImpls.bind$lambda$4(receiver, (LifecycleEvent) obj);
                }
            });
            return receiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit bind$lambda$4(ViewPropertyAnimator viewPropertyAnimator, LifecycleEvent lifecycleEvent) {
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.setUpdateListener(null);
            return Unit.INSTANCE;
        }

        public static void bind(LifecycleViewBindings lifecycleViewBindings, final ValueAnimator receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Observable<LifecycleEvent> observableTake = lifecycleViewBindings.getLifecycleEvents().filter(new Predicate() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings.bind.3
                @Override // io.reactivex.functions.Predicate
                public final boolean test(LifecycleEvent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it == LifecycleEvent.ON_DESTROY_VIEW;
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            lifecycleViewBindings.bind(observableTake, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings$DefaultImpls$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LifecycleViewBindings.DefaultImpls.bind$lambda$5(receiver, (LifecycleEvent) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit bind$lambda$5(ValueAnimator valueAnimator, LifecycleEvent lifecycleEvent) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            return Unit.INSTANCE;
        }

        public static void addLifecycleAwareUpdateListener(LifecycleViewBindings lifecycleViewBindings, ValueAnimator receiver, ValueAnimator.AnimatorUpdateListener listener) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(listener, "listener");
            receiver.addUpdateListener(listener);
            lifecycleViewBindings.bind(receiver);
        }

        public static void bind(LifecycleViewBindings lifecycleViewBindings, final AnimatorSet receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Observable<LifecycleEvent> observableTake = lifecycleViewBindings.getLifecycleEvents().filter(new Predicate() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings.bind.5
                @Override // io.reactivex.functions.Predicate
                public final boolean test(LifecycleEvent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it == LifecycleEvent.ON_DESTROY_VIEW;
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            lifecycleViewBindings.bind(observableTake, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.utils.ui.view.LifecycleViewBindings$DefaultImpls$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LifecycleViewBindings.DefaultImpls.bind$lambda$6(receiver, (LifecycleEvent) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit bind$lambda$6(AnimatorSet animatorSet, LifecycleEvent lifecycleEvent) {
            animatorSet.cancel();
            animatorSet.removeAllListeners();
            return Unit.INSTANCE;
        }
    }
}
