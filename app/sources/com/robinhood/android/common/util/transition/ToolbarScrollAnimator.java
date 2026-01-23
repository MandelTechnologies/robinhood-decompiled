package com.robinhood.android.common.util.transition;

import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.view.ViewScrollChangeEvent;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.disposer.DisposerKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ToolbarScrollAnimator.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rBC\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000fJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "getFullScrollHeight", "Lkotlin/Function0;", "", "includeSubtitle", "", "includeTitle", "includeBackground", "translationZ", "<init>", "(Lcom/robinhood/android/common/ui/view/RhToolbar;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/Float;)V", "fullScrollHeight", "(Lcom/robinhood/android/common/ui/view/RhToolbar;FZZZLjava/lang/Float;)V", "Ljava/lang/Float;", "toolbarRaisedElevation", "subscribe", "Lio/reactivex/disposables/Disposable;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "host", "Lcom/robinhood/disposer/LifecycleHost;", "terminalEvent", "Lcom/robinhood/disposer/LifecycleEvent;", "nestedScrollView", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroid/widget/ScrollView;", "onScroll", "", "scrollY", "", "computeAlpha", "dispatchScroll", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ToolbarScrollAnimator {
    public static final int $stable = 8;
    private final Function0<Float> getFullScrollHeight;
    private final boolean includeBackground;
    private final boolean includeSubtitle;
    private final boolean includeTitle;
    private final RhToolbar toolbar;
    private final float toolbarRaisedElevation;
    private final Float translationZ;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$0(float f) {
        return f;
    }

    public ToolbarScrollAnimator(RhToolbar toolbar, Function0<Float> getFullScrollHeight, boolean z, boolean z2, boolean z3, Float f) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(getFullScrollHeight, "getFullScrollHeight");
        this.toolbar = toolbar;
        this.getFullScrollHeight = getFullScrollHeight;
        this.includeSubtitle = z;
        this.includeTitle = z2;
        this.includeBackground = z3;
        this.translationZ = f;
        this.toolbarRaisedElevation = toolbar.getScrollRaisedElevation();
        toolbar.setElevation(0.0f);
        if (z2) {
            toolbar.setTitleAlpha(0.0f);
        }
        if (z) {
            toolbar.setSubtitleAlpha(0.0f);
        }
    }

    public /* synthetic */ ToolbarScrollAnimator(RhToolbar rhToolbar, Function0 function0, boolean z, boolean z2, boolean z3, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rhToolbar, (Function0<Float>) function0, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : f);
    }

    public /* synthetic */ ToolbarScrollAnimator(RhToolbar rhToolbar, float f, boolean z, boolean z2, boolean z3, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rhToolbar, f, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarScrollAnimator(RhToolbar toolbar, final float f, boolean z, boolean z2, boolean z3, Float f2) {
        this(toolbar, (Function0<Float>) new Function0() { // from class: com.robinhood.android.common.util.transition.ToolbarScrollAnimator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(ToolbarScrollAnimator._init_$lambda$0(f));
            }
        }, z, z2, z3, f2);
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
    }

    public static /* synthetic */ Disposable subscribe$default(ToolbarScrollAnimator toolbarScrollAnimator, RecyclerView recyclerView, LifecycleHost lifecycleHost, LifecycleEvent lifecycleEvent, int i, Object obj) {
        if ((i & 4) != 0) {
            lifecycleEvent = null;
        }
        return toolbarScrollAnimator.subscribe(recyclerView, lifecycleHost, lifecycleEvent);
    }

    public final Disposable subscribe(RecyclerView recyclerView, LifecycleHost host, LifecycleEvent terminalEvent) {
        ScopedObservable scopedObservableBindTo;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(host, "host");
        Observable<RecyclerViewScrollEvent> observableScrollEvents = RxRecyclerView.scrollEvents(recyclerView);
        if (terminalEvent == null) {
            scopedObservableBindTo = DisposerKt.bindTo$default(observableScrollEvents, host.getLifecycleEvents(), (LifecycleEvent) null, 2, (Object) null);
        } else {
            scopedObservableBindTo = DisposerKt.bindTo(observableScrollEvents, host.getLifecycleEvents(), terminalEvent);
        }
        return scopedObservableBindTo.subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.util.transition.ToolbarScrollAnimator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolbarScrollAnimator.subscribe$lambda$2(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$2(ToolbarScrollAnimator toolbarScrollAnimator, RecyclerViewScrollEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        toolbarScrollAnimator.onScroll(event.getView().computeVerticalScrollOffset());
        return Unit.INSTANCE;
    }

    public final Disposable subscribe(NestedScrollView nestedScrollView, LifecycleHost host) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "nestedScrollView");
        Intrinsics.checkNotNullParameter(host, "host");
        return DisposerKt.bindTo$default(RxView.scrollChangeEvents(nestedScrollView), host.getLifecycleEvents(), (LifecycleEvent) null, 2, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.util.transition.ToolbarScrollAnimator$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolbarScrollAnimator.subscribe$lambda$3(this.f$0, (ViewScrollChangeEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$3(ToolbarScrollAnimator toolbarScrollAnimator, ViewScrollChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        toolbarScrollAnimator.onScroll(event.getScrollY());
        return Unit.INSTANCE;
    }

    public final Disposable subscribe(ScrollView scrollView, LifecycleHost host) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Intrinsics.checkNotNullParameter(host, "host");
        return DisposerKt.bindTo$default(RxView.scrollChangeEvents(scrollView), host.getLifecycleEvents(), (LifecycleEvent) null, 2, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.util.transition.ToolbarScrollAnimator$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolbarScrollAnimator.subscribe$lambda$4(this.f$0, (ViewScrollChangeEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$4(ToolbarScrollAnimator toolbarScrollAnimator, ViewScrollChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        toolbarScrollAnimator.onScroll(event.getScrollY());
        return Unit.INSTANCE;
    }

    public final void onScroll(int scrollY) {
        this.toolbar.setElevation(Math.min(this.toolbarRaisedElevation, scrollY));
        Float f = this.translationZ;
        if (f != null) {
            this.toolbar.setTranslationZ(f.floatValue());
        }
        float fComputeAlpha = computeAlpha(scrollY, this.getFullScrollHeight.invoke().floatValue());
        if (this.includeTitle) {
            this.toolbar.setTitleAlpha(fComputeAlpha);
        }
        if (this.includeSubtitle) {
            this.toolbar.setSubtitleAlpha(fComputeAlpha);
        }
        if (this.includeBackground) {
            this.toolbar.setBackgroundAlpha(fComputeAlpha);
        }
    }

    private final float computeAlpha(int scrollY, float fullScrollHeight) {
        if (scrollY == 0) {
            return 0.0f;
        }
        return RangesKt.coerceAtMost(1.0f, scrollY / fullScrollHeight);
    }

    public final void dispatchScroll(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        onScroll(recyclerView.computeVerticalScrollOffset());
    }

    public final void dispatchScroll(NestedScrollView nestedScrollView) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "nestedScrollView");
        onScroll(nestedScrollView.getScrollY());
    }

    public final void dispatchScroll(ScrollView scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        onScroll(scrollView.getScrollY());
    }
}
