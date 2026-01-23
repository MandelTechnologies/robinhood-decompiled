package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import androidx.view.BackEventCompat;
import com.robinhood.android.navigation.compose.NavTransition2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DefaultSpecialEffectsController.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\b\u001f !\"#$%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002J&\u0010\u001b\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0002¨\u0006'"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "collectAnimEffects", "", "animationInfos", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "collectEffects", "operations", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "createTransitionEffect", "transitionInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "lastIn", "findNamedViews", "namedViews", "", "", "Landroid/view/View;", "view", "syncAnimations", "retainMatchingViews", "Landroidx/collection/ArrayMap;", "names", "", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void collectEffects(List<? extends SpecialEffectsController.Operation> operations2, boolean isPop) throws Resources.NotFoundException {
        SpecialEffectsController.Operation operation2;
        Object next;
        Intrinsics.checkNotNullParameter(operations2, "operations");
        Iterator<T> it = operations2.iterator();
        while (true) {
            operation2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) next;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            View view = operation3.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateAsOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (stateAsOperationState == state && operation3.getFinalState() != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation4 = (SpecialEffectsController.Operation) next;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations2.listIterator(operations2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            SpecialEffectsController.Operation operationPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation5 = operationPrevious;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.INSTANCE;
            View view2 = operation5.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateAsOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (stateAsOperationState2 != state2 && operation5.getFinalState() == state2) {
                operation2 = operationPrevious;
                break;
            }
        }
        SpecialEffectsController.Operation operation6 = operation2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation4 + " to " + operation6);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        syncAnimations(operations2);
        for (final SpecialEffectsController.Operation operation7 : operations2) {
            arrayList.add(new AnimationInfo(operation7, isPop));
            boolean z = false;
            if (isPop) {
                if (operation7 == operation4) {
                    z = true;
                }
            } else if (operation7 == operation6) {
            }
            arrayList2.add(new TransitionInfo(operation7, isPop, z));
            operation7.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.collectEffects$lambda$2(this.f$0, operation7);
                }
            });
        }
        createTransitionEffect(arrayList2, isPop, operation4, operation6);
        collectAnimEffects(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectEffects$lambda$2(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation2, "$operation");
        this$0.applyContainerChangesToOperation$fragment_release(operation2);
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> operations2) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List) operations2)).getFragment();
        for (SpecialEffectsController.Operation operation2 : operations2) {
            operation2.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation2.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation2.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation2.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void collectAnimEffects(List<AnimationInfo> animationInfos) throws Resources.NotFoundException {
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = animationInfos.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((AnimationInfo) it.next()).getOperation().getEffects$fragment_release());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z = false;
        for (AnimationInfo animationInfo : animationInfos) {
            Context context = getContainer().getContext();
            SpecialEffectsController.Operation operation2 = animationInfo.getOperation();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation != null) {
                if (animation.animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    Fragment fragment = operation2.getFragment();
                    if (!operation2.getEffects$fragment_release().isEmpty()) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                        }
                    } else {
                        if (operation2.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation2.setAwaitingContainerChanges(false);
                        }
                        operation2.addEffect(new AnimatorEffect(animationInfo));
                        z = true;
                    }
                }
            }
        }
        for (AnimationInfo animationInfo2 : arrayList) {
            SpecialEffectsController.Operation operation3 = animationInfo2.getOperation();
            Fragment fragment2 = operation3.getFragment();
            if (zIsEmpty) {
                if (z) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                    }
                } else {
                    operation3.addEffect(new AnimationEffect(animationInfo2));
                }
            } else if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    private final void createTransitionEffect(List<TransitionInfo> transitionInfos, boolean isPop, SpecialEffectsController.Operation firstOut, SpecialEffectsController.Operation lastIn) {
        ArrayList arrayList;
        Iterator it;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        int i;
        String strFindKeyForValue;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : transitionInfos) {
            if (!((TransitionInfo) obj2).isVisibilityUnchanged()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<TransitionInfo> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((TransitionInfo) obj3).getHandlingImpl() != null) {
                arrayList5.add(obj3);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        Object obj4 = null;
        for (TransitionInfo transitionInfo : arrayList5) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 == null) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        ArrayList<String> arrayList8 = new ArrayList<>();
        ArrayList<String> arrayList9 = new ArrayList<>();
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
        ArrayList<String> sharedElementTargetNames = arrayList8;
        Iterator it2 = arrayList5.iterator();
        ArrayList<String> sharedElementSourceNames = arrayList9;
        while (it2.hasNext()) {
            TransitionInfo transitionInfo2 = (TransitionInfo) it2.next();
            if (!transitionInfo2.hasSharedElementTransition() || firstOut == null || lastIn == null) {
                arrayList = arrayList5;
                it = it2;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo2.getSharedElementTransition()));
                sharedElementSourceNames = lastIn.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames2 = firstOut.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames2.size();
                arrayList = arrayList5;
                it = it2;
                int i2 = 0;
                while (i2 < size) {
                    FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i2));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    fragmentTransitionImpl2 = fragmentTransitionImpl3;
                }
                fragmentTransitionImpl = fragmentTransitionImpl2;
                sharedElementTargetNames = lastIn.getFragment().getSharedElementTargetNames();
                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                Tuples2 tuples2M3642to = !isPop ? Tuples4.m3642to(firstOut.getFragment().getExitTransitionCallback(), lastIn.getFragment().getEnterTransitionCallback()) : Tuples4.m3642to(firstOut.getFragment().getEnterTransitionCallback(), lastIn.getFragment().getExitTransitionCallback());
                SharedElementCallback sharedElementCallback = (SharedElementCallback) tuples2M3642to.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) tuples2M3642to.component2();
                int size2 = sharedElementSourceNames.size();
                int i3 = 0;
                while (true) {
                    arrayList2 = arrayList6;
                    if (i3 >= size2) {
                        break;
                    }
                    ArrayList arrayList10 = arrayList7;
                    String str = sharedElementSourceNames.get(i3);
                    Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                    String str2 = sharedElementTargetNames.get(i3);
                    Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                    arrayMap.put(str, str2);
                    i3++;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList10;
                }
                arrayList3 = arrayList7;
                int i4 = 2;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    Iterator<String> it3 = sharedElementTargetNames.iterator();
                    while (true) {
                        i = i4;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Iterator<String> it4 = it3;
                        Log.v(FragmentManager.TAG, "Name: " + it3.next());
                        objWrapTransitionInSet = objWrapTransitionInSet;
                        i4 = i;
                        it3 = it4;
                    }
                    obj = objWrapTransitionInSet;
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v(FragmentManager.TAG, "Name: " + it5.next());
                    }
                } else {
                    obj = objWrapTransitionInSet;
                    i = 2;
                }
                View view = firstOut.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                findNamedViews(arrayMap2, view);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(i)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + firstOut);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i5 = size3 - 1;
                            String str3 = sharedElementSourceNames.get(size3);
                            Intrinsics.checkNotNullExpressionValue(str3, "exitingNames[i]");
                            String str4 = str3;
                            View view2 = arrayMap2.get(str4);
                            if (view2 == null) {
                                arrayMap.remove(str4);
                            } else if (!Intrinsics.areEqual(str4, ViewCompat.getTransitionName(view2))) {
                                arrayMap.put(ViewCompat.getTransitionName(view2), (String) arrayMap.remove(str4));
                            }
                            if (i5 < 0) {
                                break;
                            } else {
                                size3 = i5;
                            }
                        }
                    }
                } else {
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                View view3 = lastIn.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view3, "lastIn.fragment.mView");
                findNamedViews(arrayMap3, view3);
                arrayMap3.retainAll(sharedElementTargetNames);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(i)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + lastIn);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames, arrayMap3);
                    int size4 = sharedElementTargetNames.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i6 = size4 - 1;
                            String str5 = sharedElementTargetNames.get(size4);
                            Intrinsics.checkNotNullExpressionValue(str5, "enteringNames[i]");
                            String str6 = str5;
                            View view4 = arrayMap3.get(str6);
                            if (view4 == null) {
                                String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str6);
                                if (strFindKeyForValue2 != null) {
                                    arrayMap.remove(strFindKeyForValue2);
                                }
                            } else if (!Intrinsics.areEqual(str6, ViewCompat.getTransitionName(view4)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str6)) != null) {
                                arrayMap.put(strFindKeyForValue, ViewCompat.getTransitionName(view4));
                            }
                            if (i6 < 0) {
                                break;
                            } else {
                                size4 = i6;
                            }
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> collectionKeySet = arrayMap.keySet();
                Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                retainMatchingViews(arrayMap2, collectionKeySet);
                Collection<String> collectionValues = arrayMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                retainMatchingViews(arrayMap3, collectionValues);
                if (arrayMap.isEmpty()) {
                    Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + obj + " between " + firstOut + " and " + lastIn + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList5 = arrayList;
                    it2 = it;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    obj4 = null;
                } else {
                    obj4 = obj;
                }
            }
            arrayList5 = arrayList;
            it2 = it;
            fragmentTransitionImpl2 = fragmentTransitionImpl;
            arrayList6 = arrayList2;
            arrayList7 = arrayList3;
        }
        ArrayList arrayList11 = arrayList5;
        FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList7;
        if (obj4 == null) {
            if (arrayList11.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList11.iterator();
            while (it6.hasNext()) {
                if (((TransitionInfo) it6.next()).getTransition() == null) {
                }
            }
            return;
        }
        TransitionEffect transitionEffect = new TransitionEffect(arrayList11, firstOut, lastIn, fragmentTransitionImpl4, obj4, arrayList12, arrayList13, arrayMap, sharedElementTargetNames, sharedElementSourceNames, arrayMap2, arrayMap3, isPop);
        Iterator it7 = arrayList11.iterator();
        while (it7.hasNext()) {
            ((TransitionInfo) it7.next()).getOperation().addEffect(transitionEffect);
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Map.Entry<String, View> entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.getTransitionName(entry.getValue())));
            }
        });
    }

    private final void findNamedViews(Map<String, View> namedViews, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            namedViews.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(namedViews, child);
                }
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation2) {
            Intrinsics.checkNotNullParameter(operation2, "operation");
            this.operation = operation2;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State stateAsOperationState = view != null ? SpecialEffectsController.Operation.State.INSTANCE.asOperationState(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateAsOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateAsOperationState == state || finalState == state) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation2, boolean z) {
            super(operation2);
            Intrinsics.checkNotNullParameter(operation2, "operation");
            this.isPop = z;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0005R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", NavTransition2.KEY_TRANSITION, "getTransition", "hasSharedElementTransition", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation2, boolean z, boolean z2) {
            Object returnTransition;
            boolean allowEnterTransitionOverlap;
            Object sharedElementEnterTransition;
            super(operation2);
            Intrinsics.checkNotNullParameter(operation2, "operation");
            SpecialEffectsController.Operation.State finalState = operation2.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation2.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation2.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            if (operation2.getFinalState() != state) {
                allowEnterTransitionOverlap = true;
            } else if (z) {
                allowEnterTransitionOverlap = operation2.getFragment().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = operation2.getFragment().getAllowEnterTransitionOverlap();
            }
            this.isOverlapAllowed = allowEnterTransitionOverlap;
            if (!z2) {
                sharedElementEnterTransition = null;
            } else if (z) {
                sharedElementEnterTransition = operation2.getFragment().getSharedElementReturnTransition();
            } else {
                sharedElementEnterTransition = operation2.getFragment().getSharedElementEnterTransition();
            }
            this.sharedElementTransition = sharedElementEnterTransition;
        }

        public final Object getTransition() {
            return this.transition;
        }

        /* renamed from: isOverlapAllowed, reason: from getter */
        public final boolean getIsOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        private final FragmentTransitionImpl getHandlingImpl(Object transition) {
            if (transition == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(transition)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(transition)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "animationInfo", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "getAnimationInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "onCancel", "", "container", "Landroid/view/ViewGroup;", "onCommit", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* loaded from: classes4.dex */
    static final class AnimationEffect extends SpecialEffectsController.Effect {
        private final AnimationInfo animationInfo;

        public AnimationEffect(AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation2 = this.animationInfo.getOperation();
            View view = operation2.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation2 = animation.animation;
            if (animation2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation2);
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController2(operation2, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation2 = this.animationInfo.getOperation();
            View view = operation2.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "animatorInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "Landroid/view/ViewGroup;", "container", "", "onStart", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onCommit", "onCancel", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "getAnimatorInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroid/animation/AnimatorSet;", "animator", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "", "isSeekingSupported", "()Z", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* loaded from: classes4.dex */
    static final class AnimatorEffect extends SpecialEffectsController.Effect {
        private AnimatorSet animator;
        private final AnimationInfo animatorInfo;

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* renamed from: isSeekingSupported */
        public boolean getIsSeekingSupported() {
            return true;
        }

        public AnimatorEffect(AnimationInfo animatorInfo) {
            Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup container) throws Resources.NotFoundException {
            final AnimatorEffect animatorEffect;
            Intrinsics.checkNotNullParameter(container, "container");
            if (this.animatorInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController.Operation operation2 = this.animatorInfo.getOperation();
            Fragment fragment = operation2.getFragment();
            final boolean z = operation2.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator anim) {
                        Intrinsics.checkNotNullParameter(anim, "anim");
                        container.endViewTransition(view);
                        if (z) {
                            SpecialEffectsController.Operation.State finalState = operation2.getFinalState();
                            View viewToAnimate = view;
                            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                            finalState.applyState(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().completeEffect(animatorEffect);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Animator from operation " + operation2 + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation2 = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation2.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Adding BackProgressCallbacks for Animators to operation " + operation2);
            }
            long j = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (backEvent.getProgress() * j);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j) {
                progress = j - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation2);
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            SpecialEffectsController.Operation operation2 = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animator from operation " + operation2 + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation2 = this.animatorInfo.getOperation();
            if (operation2.getIsSeeking()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Api26Impl.INSTANCE.reverse(animatorSet);
                }
            } else {
                animatorSet.end();
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(operation2);
                sb.append(" has been canceled");
                sb.append(operation2.getIsSeeking() ? " with seeking." : ".");
                sb.append(' ');
                Log.v(FragmentManager.TAG, sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010?R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010BR'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bC\u0010BR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bE\u0010FR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bG\u0010BR'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bH\u0010BR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bI\u0010FR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010D\u001a\u0004\bJ\u0010FR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\b\u0019\u0010LR\u001d\u0010N\u001a\u00020M8\u0006¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010QR$\u0010T\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010=\u001a\u0004\bU\u0010?\"\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010LR\u0011\u0010Z\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bY\u0010L¨\u0006["}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "transitionInfos", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "firstOut", "lastIn", "Landroidx/fragment/app/FragmentTransitionImpl;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Landroidx/collection/ArrayMap;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "Landroid/view/ViewGroup;", "container", "Lkotlin/Pair;", "createMergedTransition", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "", "executeTransition", "runTransition", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "transitioningViews", "view", "captureTransitioningViews", "(Ljava/util/ArrayList;Landroid/view/View;)V", "onStart", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onCommit", "onCancel", "Ljava/util/List;", "getTransitionInfos", "()Ljava/util/List;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "getFirstOut", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getLastIn", "Landroidx/fragment/app/FragmentTransitionImpl;", "getTransitionImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "getSharedElementLastInViews", "Landroidx/collection/ArrayMap;", "getSharedElementNameMapping", "()Landroidx/collection/ArrayMap;", "getEnteringNames", "getExitingNames", "getFirstOutViews", "getLastInViews", "Z", "()Z", "Landroidx/core/os/CancellationSignal;", "transitionSignal", "Landroidx/core/os/CancellationSignal;", "getTransitionSignal", "()Landroidx/core/os/CancellationSignal;", "getTransitionSignal$annotations", "()V", "controller", "getController", "setController", "(Ljava/lang/Object;)V", "isSeekingSupported", "getTransitioning", "transitioning", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes4.dex */
    static final class TransitionEffect extends SpecialEffectsController.Effect {
        private Object controller;
        private final ArrayList<String> enteringNames;
        private final ArrayList<String> exitingNames;
        private final SpecialEffectsController.Operation firstOut;
        private final ArrayMap<String, View> firstOutViews;
        private final boolean isPop;
        private final SpecialEffectsController.Operation lastIn;
        private final ArrayMap<String, View> lastInViews;
        private final ArrayList<View> sharedElementFirstOutViews;
        private final ArrayList<View> sharedElementLastInViews;
        private final ArrayMap<String, String> sharedElementNameMapping;
        private final Object sharedElementTransition;
        private final FragmentTransitionImpl transitionImpl;
        private final List<TransitionInfo> transitionInfos;
        private final CancellationSignal transitionSignal;

        public final List<TransitionInfo> getTransitionInfos() {
            return this.transitionInfos;
        }

        public final SpecialEffectsController.Operation getFirstOut() {
            return this.firstOut;
        }

        public final SpecialEffectsController.Operation getLastIn() {
            return this.lastIn;
        }

        public final FragmentTransitionImpl getTransitionImpl() {
            return this.transitionImpl;
        }

        public TransitionEffect(List<TransitionInfo> transitionInfos, SpecialEffectsController.Operation operation2, SpecialEffectsController.Operation operation3, FragmentTransitionImpl transitionImpl, Object obj, ArrayList<View> sharedElementFirstOutViews, ArrayList<View> sharedElementLastInViews, ArrayMap<String, String> sharedElementNameMapping, ArrayList<String> enteringNames, ArrayList<String> exitingNames, ArrayMap<String, View> firstOutViews, ArrayMap<String, View> lastInViews, boolean z) {
            Intrinsics.checkNotNullParameter(transitionInfos, "transitionInfos");
            Intrinsics.checkNotNullParameter(transitionImpl, "transitionImpl");
            Intrinsics.checkNotNullParameter(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(sharedElementLastInViews, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(sharedElementNameMapping, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(enteringNames, "enteringNames");
            Intrinsics.checkNotNullParameter(exitingNames, "exitingNames");
            Intrinsics.checkNotNullParameter(firstOutViews, "firstOutViews");
            Intrinsics.checkNotNullParameter(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = operation2;
            this.lastIn = operation3;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z;
            this.transitionSignal = new CancellationSignal();
        }

        public final Object getController() {
            return this.controller;
        }

        public final void setController(Object obj) {
            this.controller = obj;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        /* renamed from: isSeekingSupported */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.isSeekingSupported()) {
                return false;
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (TransitionInfo transitionInfo : list) {
                    if (Build.VERSION.SDK_INT < 34 || transitionInfo.getTransition() == null || !this.transitionImpl.isSeekingSupported(transitionInfo.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.isSeekingSupported(obj);
        }

        public final boolean getTransitioning() {
            List<TransitionInfo> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation2 = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation2);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (getIsSeekingSupported() && getTransitioning()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Tuples2<ArrayList<View>, Object> tuples2CreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayListComponent1 = tuples2CreateMergedTransition.component1();
                final Object objComponent2 = tuples2CreateMergedTransition.component2();
                List<TransitionInfo> list = this.transitionInfos;
                ArrayList<SpecialEffectsController.Operation> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((TransitionInfo) it2.next()).getOperation());
                }
                for (final SpecialEffectsController.Operation operation3 : arrayList) {
                    this.transitionImpl.setListenerForTransitionEnd(operation3.getFragment(), objComponent2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4(objectRef);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(operation3, this);
                        }
                    });
                }
                runTransition(arrayListComponent1, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2] */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                        transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(container, objComponent2));
                        boolean z = this.this$0.getController() != null;
                        Object obj = objComponent2;
                        ViewGroup viewGroup = container;
                        if (!z) {
                            throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                        }
                        objectRef.element = new C23302(this.this$0, obj, viewGroup);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Started executing operations from " + this.this$0.getFirstOut() + " to " + this.this$0.getLastIn());
                        }
                    }

                    /* compiled from: DefaultSpecialEffectsController.kt */
                    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m3636d2 = {"<anonymous>", "", "invoke"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2 */
                    static final class C23302 extends Lambda implements Function0<Unit> {
                        final /* synthetic */ ViewGroup $container;
                        final /* synthetic */ Object $mergedTransition;
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C23302(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
                            super(0);
                            this.this$0 = transitionEffect;
                            this.$mergedTransition = obj;
                            this.$container = viewGroup;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            List<DefaultSpecialEffectsController.TransitionInfo> transitionInfos = this.this$0.getTransitionInfos();
                            if (!(transitionInfos instanceof Collection) || !transitionInfos.isEmpty()) {
                                Iterator<T> it = transitionInfos.iterator();
                                while (it.hasNext()) {
                                    if (!((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().getIsSeeking()) {
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Log.v(FragmentManager.TAG, "Completing animating immediately");
                                        }
                                        CancellationSignal cancellationSignal = new CancellationSignal();
                                        FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
                                        Fragment fragment = this.this$0.getTransitionInfos().get(0).getOperation().getFragment();
                                        Object obj = this.$mergedTransition;
                                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                                        transitionImpl.setListenerForTransitionEnd(fragment, obj, cancellationSignal, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE 
                                              (r1v7 'transitionImpl' androidx.fragment.app.FragmentTransitionImpl)
                                              (r2v6 'fragment' androidx.fragment.app.Fragment)
                                              (r3v2 'obj' java.lang.Object)
                                              (r0v5 'cancellationSignal' androidx.core.os.CancellationSignal)
                                              (wrap:java.lang.Runnable:0x0064: CONSTRUCTOR (r4v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE]) A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void (m), WRAPPED] call: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2$$ExternalSyntheticLambda1.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void type: CONSTRUCTOR)
                                             VIRTUAL call: androidx.fragment.app.FragmentTransitionImpl.setListenerForTransitionEnd(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void A[MD:(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void (m)] in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.2.invoke():void, file: classes4.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2$$ExternalSyntheticLambda1, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 35 more
                                            */
                                        /*
                                            this = this;
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            java.util.List r0 = r0.getTransitionInfos()
                                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                                            boolean r1 = r0 instanceof java.util.Collection
                                            java.lang.String r2 = "FragmentManager"
                                            r3 = 2
                                            if (r1 == 0) goto L19
                                            r1 = r0
                                            java.util.Collection r1 = (java.util.Collection) r1
                                            boolean r1 = r1.isEmpty()
                                            if (r1 == 0) goto L19
                                            goto L6e
                                        L19:
                                            java.util.Iterator r0 = r0.iterator()
                                        L1d:
                                            boolean r1 = r0.hasNext()
                                            if (r1 == 0) goto L6e
                                            java.lang.Object r1 = r0.next()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
                                            androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                                            boolean r1 = r1.getIsSeeking()
                                            if (r1 != 0) goto L1d
                                            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                                            if (r0 == 0) goto L3e
                                            java.lang.String r0 = "Completing animating immediately"
                                            android.util.Log.v(r2, r0)
                                        L3e:
                                            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
                                            r0.<init>()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r1 = r1.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            java.util.List r2 = r2.getTransitionInfos()
                                            r3 = 0
                                            java.lang.Object r2 = r2.get(r3)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                                            androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                            androidx.fragment.app.Fragment r2 = r2.getFragment()
                                            java.lang.Object r3 = r6.$mergedTransition
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r4 = r6.this$0
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2$$ExternalSyntheticLambda1 r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2$$ExternalSyntheticLambda1
                                            r5.<init>(r4)
                                            r1.setListenerForTransitionEnd(r2, r3, r0, r5)
                                            r0.cancel()
                                            return
                                        L6e:
                                            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                                            if (r0 == 0) goto L79
                                            java.lang.String r0 = "Animating to start"
                                            android.util.Log.v(r2, r0)
                                        L79:
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r0 = r0.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            java.lang.Object r1 = r1.getController()
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            android.view.ViewGroup r3 = r6.$container
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2$$ExternalSyntheticLambda0 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2$$ExternalSyntheticLambda0
                                            r4.<init>(r2, r3)
                                            r0.animateToStart(r1, r4)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController5.C23302.invoke2():void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final void invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(container, "$container");
                                        Iterator<T> it = this$0.getTransitionInfos().iterator();
                                        while (it.hasNext()) {
                                            SpecialEffectsController.Operation operation2 = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                                            View view = operation2.getFragment().getView();
                                            if (view != null) {
                                                operation2.getFinalState().applyState(view, container);
                                            }
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final void invoke$lambda$4(DefaultSpecialEffectsController.TransitionEffect this$0) {
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Log.v(FragmentManager.TAG, "Transition for all operations has completed");
                                        }
                                        Iterator<T> it = this$0.getTransitionInfos().iterator();
                                        while (it.hasNext()) {
                                            ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().completeEffect(this$0);
                                        }
                                    }
                                }
                            });
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void onStart$lambda$6$lambda$4(Ref.ObjectRef seekCancelLambda) {
                        Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
                        Function0 function0 = (Function0) seekCancelLambda.element;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
                        Intrinsics.checkNotNullParameter(operation2, "$operation");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Transition for operation " + operation2 + " has completed");
                        }
                        operation2.completeEffect(this$0);
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void onProgress(BackEventCompat backEvent, ViewGroup container) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        Intrinsics.checkNotNullParameter(container, "container");
                        Object obj = this.controller;
                        if (obj != null) {
                            this.transitionImpl.setCurrentPlayTime(obj, backEvent.getProgress());
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void onCommit(final ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        if (container.isLaidOut()) {
                            Object obj = this.controller;
                            if (obj != null) {
                                FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                                Intrinsics.checkNotNull(obj);
                                fragmentTransitionImpl.animateToEnd(obj);
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v(FragmentManager.TAG, "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                                    return;
                                }
                                return;
                            }
                            Tuples2<ArrayList<View>, Object> tuples2CreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                            ArrayList<View> arrayListComponent1 = tuples2CreateMergedTransition.component1();
                            final Object objComponent2 = tuples2CreateMergedTransition.component2();
                            List<TransitionInfo> list = this.transitionInfos;
                            ArrayList<SpecialEffectsController.Operation> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((TransitionInfo) it.next()).getOperation());
                            }
                            for (final SpecialEffectsController.Operation operation2 : arrayList) {
                                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), objComponent2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(operation2, this);
                                    }
                                });
                            }
                            runTransition(arrayListComponent1, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    this.this$0.getTransitionImpl().beginDelayedTransition(container, objComponent2);
                                }
                            });
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
                                return;
                            }
                            return;
                        }
                        for (TransitionInfo transitionInfo : this.transitionInfos) {
                            SpecialEffectsController.Operation operation3 = transitionInfo.getOperation();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation3);
                            }
                            transitionInfo.getOperation().completeEffect(this);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
                        Intrinsics.checkNotNullParameter(operation2, "$operation");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Transition for operation " + operation2 + " has completed");
                        }
                        operation2.completeEffect(this$0);
                    }

                    private final Tuples2<ArrayList<View>, Object> createMergedTransition(ViewGroup container, SpecialEffectsController.Operation lastIn, final SpecialEffectsController.Operation firstOut) {
                        final SpecialEffectsController.Operation operation2 = lastIn;
                        View view = new View(container.getContext());
                        final Rect rect = new Rect();
                        Iterator<TransitionInfo> it = this.transitionInfos.iterator();
                        boolean z = false;
                        View view2 = null;
                        while (it.hasNext()) {
                            if (it.next().hasSharedElementTransition() && firstOut != null && operation2 != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                                FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                                OneShotPreDrawListener.add(container, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12(operation2, firstOut, this);
                                    }
                                });
                                this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                                if (!this.exitingNames.isEmpty()) {
                                    String str = this.exitingNames.get(0);
                                    Intrinsics.checkNotNullExpressionValue(str, "exitingNames[0]");
                                    view2 = this.firstOutViews.get(str);
                                    this.transitionImpl.setEpicenter(this.sharedElementTransition, view2);
                                }
                                this.sharedElementLastInViews.addAll(this.lastInViews.values());
                                if (!this.enteringNames.isEmpty()) {
                                    String str2 = this.enteringNames.get(0);
                                    Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[0]");
                                    final View view3 = this.lastInViews.get(str2);
                                    if (view3 != null) {
                                        final FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                                        OneShotPreDrawListener.add(container, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13(fragmentTransitionImpl, view3, rect);
                                            }
                                        });
                                        z = true;
                                    }
                                }
                                this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                                FragmentTransitionImpl fragmentTransitionImpl2 = this.transitionImpl;
                                Object obj = this.sharedElementTransition;
                                fragmentTransitionImpl2.scheduleRemoveTargets(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<TransitionInfo> it2 = this.transitionInfos.iterator();
                        Object objMergeTransitionsTogether = null;
                        Object objMergeTransitionsTogether2 = null;
                        while (it2.hasNext()) {
                            TransitionInfo next = it2.next();
                            SpecialEffectsController.Operation operation3 = next.getOperation();
                            boolean z2 = z;
                            Object objCloneTransition = this.transitionImpl.cloneTransition(next.getTransition());
                            if (objCloneTransition != null) {
                                final ArrayList<View> arrayList2 = new ArrayList<>();
                                Iterator<TransitionInfo> it3 = it2;
                                View view4 = operation3.getFragment().mView;
                                Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                                captureTransitioningViews(arrayList2, view4);
                                if (this.sharedElementTransition != null && (operation3 == firstOut || operation3 == operation2)) {
                                    if (operation3 == firstOut) {
                                        arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementFirstOutViews));
                                    } else {
                                        arrayList2.removeAll(CollectionsKt.toSet(this.sharedElementLastInViews));
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    this.transitionImpl.addTarget(objCloneTransition, view);
                                } else {
                                    this.transitionImpl.addTargets(objCloneTransition, arrayList2);
                                    this.transitionImpl.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList2, null, null, null, null);
                                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                        operation3.setAwaitingContainerChanges(false);
                                        ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                                        arrayList3.remove(operation3.getFragment().mView);
                                        this.transitionImpl.scheduleHideFragmentView(objCloneTransition, operation3.getFragment().mView, arrayList3);
                                        OneShotPreDrawListener.add(container, new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14(arrayList2);
                                            }
                                        });
                                    }
                                }
                                if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                                    arrayList.addAll(arrayList2);
                                    if (z2) {
                                        this.transitionImpl.setEpicenter(objCloneTransition, rect);
                                    }
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Entering Transition: " + objCloneTransition);
                                        Log.v(FragmentManager.TAG, ">>>>> EnteringViews <<<<<");
                                        Iterator<View> it4 = arrayList2.iterator();
                                        while (it4.hasNext()) {
                                            View transitioningViews = it4.next();
                                            Intrinsics.checkNotNullExpressionValue(transitioningViews, "transitioningViews");
                                            Log.v(FragmentManager.TAG, "View: " + transitioningViews);
                                        }
                                    }
                                } else {
                                    this.transitionImpl.setEpicenter(objCloneTransition, view2);
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Exiting Transition: " + objCloneTransition);
                                        Log.v(FragmentManager.TAG, ">>>>> ExitingViews <<<<<");
                                        Iterator<View> it5 = arrayList2.iterator();
                                        while (it5.hasNext()) {
                                            View transitioningViews2 = it5.next();
                                            Intrinsics.checkNotNullExpressionValue(transitioningViews2, "transitioningViews");
                                            Log.v(FragmentManager.TAG, "View: " + transitioningViews2);
                                        }
                                    }
                                }
                                if (next.getIsOverlapAllowed()) {
                                    objMergeTransitionsTogether = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                                } else {
                                    objMergeTransitionsTogether2 = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                                }
                                operation2 = lastIn;
                                z = z2;
                                it2 = it3;
                            } else {
                                operation2 = lastIn;
                                z = z2;
                            }
                        }
                        Object objMergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, this.sharedElementTransition);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Final merged transition: " + objMergeTransitionsInSequence);
                        }
                        return new Tuples2<>(arrayList, objMergeTransitionsInSequence);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation2, SpecialEffectsController.Operation operation3, TransitionEffect this$0) {
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation3.getFragment(), this$0.isPop, this$0.lastInViews, false);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void createMergedTransition$lambda$13(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
                        Intrinsics.checkNotNullParameter(impl, "$impl");
                        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                        impl.getBoundsOnScreen(view, lastInEpicenterRect);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void createMergedTransition$lambda$14(ArrayList transitioningViews) {
                        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                        FragmentTransition.setViewVisibility(transitioningViews, 4);
                    }

                    private final void runTransition(ArrayList<View> enteringViews, ViewGroup container, Function0<Unit> executeTransition) {
                        FragmentTransition.setViewVisibility(enteringViews, 4);
                        ArrayList<String> arrayListPrepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
                            Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
                            Iterator<View> it = this.sharedElementFirstOutViews.iterator();
                            while (it.hasNext()) {
                                View sharedElementFirstOutViews = it.next();
                                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                                View view = sharedElementFirstOutViews;
                                Log.v(FragmentManager.TAG, "View: " + view + " Name: " + ViewCompat.getTransitionName(view));
                            }
                            Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
                            Iterator<View> it2 = this.sharedElementLastInViews.iterator();
                            while (it2.hasNext()) {
                                View sharedElementLastInViews = it2.next();
                                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                                View view2 = sharedElementLastInViews;
                                Log.v(FragmentManager.TAG, "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
                            }
                        }
                        executeTransition.invoke();
                        this.transitionImpl.setNameOverridesReordered(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListPrepareSetNameOverridesReordered, this.sharedElementNameMapping);
                        FragmentTransition.setViewVisibility(enteringViews, 0);
                        this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.Effect
                    public void onCancel(ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        this.transitionSignal.cancel();
                    }

                    private final void captureTransitioningViews(ArrayList<View> transitioningViews, View view) {
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                                if (transitioningViews.contains(view)) {
                                    return;
                                }
                                transitioningViews.add(view);
                                return;
                            }
                            int childCount = viewGroup.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View child = viewGroup.getChildAt(i);
                                if (child.getVisibility() == 0) {
                                    Intrinsics.checkNotNullExpressionValue(child, "child");
                                    captureTransitioningViews(transitioningViews, child);
                                }
                            }
                            return;
                        }
                        if (transitioningViews.contains(view)) {
                            return;
                        }
                        transitioningViews.add(view);
                    }
                }

                /* compiled from: DefaultSpecialEffectsController.kt */
                @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "()V", "totalDuration", "", "animatorSet", "Landroid/animation/AnimatorSet;", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
                /* loaded from: classes4.dex */
                public static final class Api24Impl {
                    public static final Api24Impl INSTANCE = new Api24Impl();

                    private Api24Impl() {
                    }

                    public final long totalDuration(AnimatorSet animatorSet) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        return animatorSet.getTotalDuration();
                    }
                }

                /* compiled from: DefaultSpecialEffectsController.kt */
                @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "()V", "reverse", "", "animatorSet", "Landroid/animation/AnimatorSet;", "setCurrentPlayTime", "time", "", "fragment_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
                /* loaded from: classes4.dex */
                public static final class Api26Impl {
                    public static final Api26Impl INSTANCE = new Api26Impl();

                    private Api26Impl() {
                    }

                    public final void reverse(AnimatorSet animatorSet) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        animatorSet.reverse();
                    }

                    public final void setCurrentPlayTime(AnimatorSet animatorSet, long time) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        animatorSet.setCurrentPlayTime(time);
                    }
                }
            }
