package com.robinhood.android.navigation.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.android.navigation.C22231R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReplaceFragmentBuilder.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/navigation/fragment/ReplaceFragmentBuilder;", "", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "containerId", "", "useDefaultAnimation", "", "addToBackStack", "name", "", "tag", "modifierFunction", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "", "setContainerId", "setUseDefaultAnimation", "setAddToBackstack", "setName", "setTag", "setModifier", "build", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "buildAndExecute", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "parentFragment", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ReplaceFragmentBuilder {
    public static final int $stable = 8;
    private boolean addToBackStack;
    private int containerId;
    private final Fragment fragment;
    private Function1<? super FragmentTransaction, Unit> modifierFunction;
    private String name;
    private String tag;
    private boolean useDefaultAnimation;

    public ReplaceFragmentBuilder(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.containerId = C22231R.id.fragment_container;
        this.useDefaultAnimation = true;
        this.addToBackStack = true;
    }

    public final int buildAndExecute(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isFinishing() || activity.getSupportFragmentManager().isStateSaved()) {
            return -1;
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        return build(supportFragmentManager).commitAllowingStateLoss();
    }

    public final int buildAndExecute(Fragment parentFragment) {
        Intrinsics.checkNotNullParameter(parentFragment, "parentFragment");
        if (parentFragment.isRemoving() || parentFragment.getChildFragmentManager().isStateSaved()) {
            return -1;
        }
        FragmentManager childFragmentManager = parentFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return build(childFragmentManager).commitAllowingStateLoss();
    }

    public final ReplaceFragmentBuilder setContainerId(int containerId) {
        this.containerId = containerId;
        return this;
    }

    public final ReplaceFragmentBuilder setUseDefaultAnimation(boolean useDefaultAnimation) {
        this.useDefaultAnimation = useDefaultAnimation;
        return this;
    }

    public final ReplaceFragmentBuilder setAddToBackstack(boolean addToBackStack) {
        this.addToBackStack = addToBackStack;
        return this;
    }

    public final ReplaceFragmentBuilder setName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        return this;
    }

    public final ReplaceFragmentBuilder setTag(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        return this;
    }

    public final ReplaceFragmentBuilder setModifier(Function1<? super FragmentTransaction, Unit> modifierFunction) {
        Intrinsics.checkNotNullParameter(modifierFunction, "modifierFunction");
        this.modifierFunction = modifierFunction;
        return this;
    }

    public final FragmentTransaction build(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        if (this.useDefaultAnimation) {
            fragmentTransactionBeginTransaction.setCustomAnimations(C22231R.anim.frag_enter_right, C22231R.anim.frag_exit_left, C22231R.anim.frag_enter_left, C22231R.anim.frag_exit_right);
        }
        Function1<? super FragmentTransaction, Unit> function1 = this.modifierFunction;
        if (function1 != null) {
            function1.invoke(fragmentTransactionBeginTransaction);
        }
        String simpleName = this.tag;
        if (simpleName == null) {
            simpleName = this.fragment.getClass().getSimpleName();
        }
        fragmentTransactionBeginTransaction.replace(this.containerId, this.fragment, simpleName);
        if (this.addToBackStack) {
            fragmentTransactionBeginTransaction.addToBackStack(this.name);
        }
        return fragmentTransactionBeginTransaction;
    }
}
