package com.robinhood.utils.p409ui.transition;

import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Transitions.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0001H\u0086\b\u001a#\u0010\u0004\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086\b\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a@\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\u0002*\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u0002H\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a@\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0001*\u00020\u00102\u0006\u0010\t\u001a\u0002H\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u0012\u0010\u000f\u001a\u00020\f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u0001\u001a)\u0010\u000f\u001a\u00020\f*\u00020\u00102\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000\u001a$\u0010\u0012\u001a\u00020\f*\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m3636d2 = {"addTarget", "Landroidx/transition/Transition;", "T", "", "excludeTarget", "exclude", "", "add", "Landroidx/transition/TransitionSet;", NavTransition2.KEY_TRANSITION, "build", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/transition/TransitionSet;Landroidx/transition/Transition;Lkotlin/jvm/functions/Function1;)Landroidx/transition/TransitionSet;", "beginDelayedTransition", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;Landroidx/transition/Transition;Lkotlin/jvm/functions/Function1;)V", "forEach", "action", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ui.transition.TransitionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Transitions3 {
    public static final /* synthetic */ <T> Transition addTarget(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        transition.addTarget(Object.class);
        return transition;
    }

    public static /* synthetic */ Transition excludeTarget$default(Transition transition, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        transition.excludeTarget(Object.class, z);
        return transition;
    }

    public static final /* synthetic */ <T> Transition excludeTarget(Transition transition, boolean z) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        transition.excludeTarget(Object.class, z);
        return transition;
    }

    public static final TransitionSet add(TransitionSet transitionSet, Transition transition) {
        Intrinsics.checkNotNullParameter(transitionSet, "<this>");
        Intrinsics.checkNotNullParameter(transition, "transition");
        TransitionSet transitionSetAddTransition = transitionSet.addTransition(transition);
        Intrinsics.checkNotNullExpressionValue(transitionSetAddTransition, "addTransition(...)");
        return transitionSetAddTransition;
    }

    public static final <T extends Transition> TransitionSet add(TransitionSet transitionSet, T transition, Function1<? super T, Unit> build) {
        Intrinsics.checkNotNullParameter(transitionSet, "<this>");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(build, "build");
        build.invoke(transition);
        transitionSet.addTransition(transition);
        return transitionSet;
    }

    public static final void beginDelayedTransition(ViewGroup viewGroup, Transition transition) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(transition, "transition");
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static final void beginDelayedTransition(ViewGroup viewGroup, Function1<? super TransitionSet, Unit> build) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(build, "build");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener((Transition.TransitionListener) new TransitionsKt$beginDelayedTransition$$inlined$doOnStart$1());
        transitionSet.addListener((Transition.TransitionListener) new TransitionsKt$beginDelayedTransition$$inlined$doOnEnd$1());
        build.invoke(transitionSet);
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
    }

    public static final void forEach(TransitionSet transitionSet, Function1<? super Transition, Unit> action) {
        Intrinsics.checkNotNullParameter(transitionSet, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int transitionCount = transitionSet.getTransitionCount();
        for (int i = 0; i < transitionCount; i++) {
            Transition transitionAt = transitionSet.getTransitionAt(i);
            Intrinsics.checkNotNull(transitionAt);
            action.invoke(transitionAt);
        }
    }

    public static final <T extends Transition> void beginDelayedTransition(ViewGroup viewGroup, T transition, Function1<? super T, Unit> build) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(build, "build");
        transition.addListener(new TransitionsKt$beginDelayedTransition$$inlined$doOnStart$1());
        transition.addListener(new TransitionsKt$beginDelayedTransition$$inlined$doOnEnd$1());
        build.invoke(transition);
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }
}
