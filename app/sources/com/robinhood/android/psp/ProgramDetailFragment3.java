package com.robinhood.android.psp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.utils.sensor.SensorManagers;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ProgramDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"com/robinhood/android/psp/ProgramDetailFragment$initializeCubes$1$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.psp.ProgramDetailFragment$initializeCubes$1$2, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProgramDetailFragment3 extends AnimatorListenerAdapter {
    final /* synthetic */ ProgramDetailViewState $state;
    final /* synthetic */ LottieAnimationView $this_apply;
    final /* synthetic */ ProgramDetailFragment this$0;

    ProgramDetailFragment3(LottieAnimationView lottieAnimationView, ProgramDetailViewState programDetailViewState, ProgramDetailFragment programDetailFragment) {
        this.$this_apply = lottieAnimationView;
        this.$state = programDetailViewState;
        this.this$0 = programDetailFragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.$this_apply.setMinAndMaxFrame(this.$state.getCubesLeftFrame(), this.$state.getCubesRightFrame());
        this.$this_apply.setFrame(this.$state.getCubesCenterFrame());
        ProgramDetailFragment programDetailFragment = this.this$0;
        Observable observableAsObservable = programDetailFragment.asObservable(SensorManagers.relativeRotation(programDetailFragment.getSensorManager(), ProgramDetailFragment.SIXTY_FPS_SAMPLING));
        final ProgramDetailViewState programDetailViewState = this.$state;
        Observable map = observableAsObservable.map(new Function() { // from class: com.robinhood.android.psp.ProgramDetailFragment$initializeCubes$1$2$onAnimationEnd$1
            @Override // io.reactivex.functions.Function
            public final Integer apply(float[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int) ((it[1] * 2 * Math.abs(programDetailViewState.getCubesRightFrame() - programDetailViewState.getCubesCenterFrame())) + programDetailViewState.getCubesCenterFrame()), programDetailViewState.getCubesLeftFrame()), programDetailViewState.getCubesRightFrame()));
            }
        });
        final LottieAnimationView lottieAnimationView = this.$this_apply;
        Observable observableFilter = map.filter(new Predicate() { // from class: com.robinhood.android.psp.ProgramDetailFragment$initializeCubes$1$2$onAnimationEnd$2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.intValue() != lottieAnimationView.getFrame();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(programDetailFragment, observableFilter, (LifecycleEvent) null, 1, (Object) null);
        final LottieAnimationView lottieAnimationView2 = this.$this_apply;
        scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.psp.ProgramDetailFragment$initializeCubes$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramDetailFragment3.onAnimationEnd$lambda$0(lottieAnimationView2, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnimationEnd$lambda$0(LottieAnimationView lottieAnimationView, Integer num) {
        Intrinsics.checkNotNull(num);
        lottieAnimationView.setFrame(num.intValue());
        return Unit.INSTANCE;
    }
}
