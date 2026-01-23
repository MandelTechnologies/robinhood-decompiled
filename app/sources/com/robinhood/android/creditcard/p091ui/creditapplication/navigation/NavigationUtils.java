package com.robinhood.android.creditcard.p091ui.creditapplication.navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\bH\u0002¨\u0006\t"}, m3636d2 = {"appReplaceFragment", "", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "appReplaceFragmentWithoutBackStack", "Lcom/robinhood/android/common/ui/BaseFragment;", "setAnimations", "Lcom/robinhood/android/navigation/fragment/ReplaceFragmentBuilder;", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.navigation.NavigationUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class NavigationUtils {
    public static final void appReplaceFragment(AppCompatActivity appCompatActivity, Fragment fragment) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        setAnimations(new ReplaceFragmentBuilder(fragment)).buildAndExecute(appCompatActivity);
    }

    public static final void appReplaceFragmentWithoutBackStack(AppCompatActivity appCompatActivity, Fragment fragment) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        setAnimations(new ReplaceFragmentBuilder(fragment)).setAddToBackstack(false).buildAndExecute(appCompatActivity);
    }

    public static final void appReplaceFragment(BaseFragment baseFragment, Fragment fragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        setAnimations(new ReplaceFragmentBuilder(fragment)).buildAndExecute(baseFragment);
    }

    public static final void appReplaceFragmentWithoutBackStack(BaseFragment baseFragment, Fragment fragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        setAnimations(new ReplaceFragmentBuilder(fragment)).setAddToBackstack(false).buildAndExecute(baseFragment);
    }

    private static final ReplaceFragmentBuilder setAnimations(ReplaceFragmentBuilder replaceFragmentBuilder) {
        return replaceFragmentBuilder.setUseDefaultAnimation(false).setModifier(new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.navigation.NavigationUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavigationUtils.setAnimations$lambda$0((FragmentTransaction) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAnimations$lambda$0(FragmentTransaction ft) {
        Intrinsics.checkNotNullParameter(ft, "ft");
        ft.setCustomAnimations(C12201R.anim.frag_enter_right, C12201R.anim.frag_exit_left, C12201R.anim.frag_enter_left, C12201R.anim.frag_exit_right);
        return Unit.INSTANCE;
    }
}
