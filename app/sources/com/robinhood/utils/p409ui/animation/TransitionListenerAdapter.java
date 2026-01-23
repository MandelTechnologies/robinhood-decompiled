package com.robinhood.utils.p409ui.animation;

import android.transition.Transition;
import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionListenerAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/ui/animation/TransitionListenerAdapter;", "Landroid/transition/Transition$TransitionListener;", "onTransitionStart", "", NavTransition2.KEY_TRANSITION, "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionCancel", "onTransitionPause", "onTransitionResume", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface TransitionListenerAdapter extends Transition.TransitionListener {

    /* compiled from: TransitionListenerAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onTransitionCancel(TransitionListenerAdapter transitionListenerAdapter, Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public static void onTransitionEnd(TransitionListenerAdapter transitionListenerAdapter, Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public static void onTransitionPause(TransitionListenerAdapter transitionListenerAdapter, Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public static void onTransitionResume(TransitionListenerAdapter transitionListenerAdapter, Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }

        public static void onTransitionStart(TransitionListenerAdapter transitionListenerAdapter, Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
        }
    }

    @Override // android.transition.Transition.TransitionListener
    void onTransitionCancel(Transition transition);

    @Override // android.transition.Transition.TransitionListener
    void onTransitionEnd(Transition transition);

    @Override // android.transition.Transition.TransitionListener
    void onTransitionPause(Transition transition);

    @Override // android.transition.Transition.TransitionListener
    void onTransitionResume(Transition transition);

    @Override // android.transition.Transition.TransitionListener
    void onTransitionStart(Transition transition);
}
