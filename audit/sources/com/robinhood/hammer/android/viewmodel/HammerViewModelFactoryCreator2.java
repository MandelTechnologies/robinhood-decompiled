package com.robinhood.hammer.android.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import androidx.view.ComponentActivity;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryCreator;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HammerViewModelFactoryCreator.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"createHammerViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/activity/ComponentActivity;", "delegateFactory", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "navBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "runtime_release"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryCreatorKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class HammerViewModelFactoryCreator2 {
    @InternalHammerApi
    public static final ViewModelProvider.Factory createHammerViewModelFactory(ComponentActivity componentActivity, ViewModelProvider.Factory delegateFactory) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        return HammerViewModelFactoryCreator.fromActivity$runtime_release$default(((HammerViewModelFactoryCreator.ActivityComponent) EntryPoints.entryPoint(componentActivity)).getHammerViewModelFactoryCreator(), componentActivity, componentActivity, delegateFactory, null, 8, null);
    }

    @InternalHammerApi
    public static final ViewModelProvider.Factory createHammerViewModelFactory(Fragment fragment, ViewModelProvider.Factory delegateFactory) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        return ((HammerViewModelFactoryCreator.FragmentComponent) EntryPoints.entryPoint(fragment)).getHammerViewModelFactoryCreator().fromFragment$runtime_release(fragment, delegateFactory);
    }

    public static final ViewModelProvider.Factory createHammerViewModelFactory(Context context, NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                ComponentActivity componentActivity = (ComponentActivity) ((Activity) context);
                return ((HammerViewModelFactoryCreator.ActivityComponent) EntryPoints.entryPoint(componentActivity)).getHammerViewModelFactoryCreator().fromActivity$runtime_release(componentActivity, navBackStackEntry, navBackStackEntry.getDefaultViewModelProviderFactory(), navBackStackEntry.getArguments());
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException(("Expected an activity context for creating a HiltViewModelFactory for a NavBackStackEntry but instead found: " + context).toString());
    }
}
