package com.robinhood.hammer.android.viewmodel;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.view.ComponentActivity;
import com.robinhood.hammer.android.internal.HammerViewModels;
import com.robinhood.hammer.android.viewmodel.BaseViewModelComponent;
import com.robinhood.hammer.android.viewmodel.DefaultViewModelComponent;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HammerViewModelFactoryCreator.kt */
@InternalHammerApi
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"#BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0019\b\u0001\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b\u0012\u0013\b\u0001\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\b\u0019J\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator;", "", "application", "Landroid/app/Application;", "componentFactories", "", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "Lkotlin/jvm/JvmSuppressWildcards;", "keySet", "", "defaultViewModelComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "<init>", "(Landroid/app/Application;Ljava/util/Map;Ljava/util/Set;Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;)V", "fromActivity", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory;", "activity", "Landroidx/activity/ComponentActivity;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "delegateFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "args", "Landroid/os/Bundle;", "fromActivity$runtime_release", "fromFragment", "fragment", "Landroidx/fragment/app/Fragment;", "fromFragment$runtime_release", "createFactory", "defaultArgs", "extensionDelegate", "Component", "ActivityComponent", "FragmentComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class HammerViewModelFactoryCreator {
    private final Application application;
    private final Map<String, BaseViewModelComponent.Factory> componentFactories;
    private final DefaultViewModelComponent.Factory defaultViewModelComponentFactory;
    private final Set<String> keySet;

    /* compiled from: HammerViewModelFactoryCreator.kt */
    @InternalHammerApi
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator$ActivityComponent;", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator$Component;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ActivityComponent extends Component {
    }

    /* compiled from: HammerViewModelFactoryCreator.kt */
    @InternalHammerApi
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator$Component;", "", "hammerViewModelFactoryCreator", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator;", "getHammerViewModelFactoryCreator", "()Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Component {
        HammerViewModelFactoryCreator getHammerViewModelFactoryCreator();
    }

    /* compiled from: HammerViewModelFactoryCreator.kt */
    @InternalHammerApi
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator$FragmentComponent;", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactoryCreator$Component;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface FragmentComponent extends Component {
    }

    public HammerViewModelFactoryCreator(Application application, @HammerViewModels Map<String, BaseViewModelComponent.Factory> componentFactories, @HammerViewModels Set<String> keySet, DefaultViewModelComponent.Factory defaultViewModelComponentFactory) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
        Intrinsics.checkNotNullParameter(keySet, "keySet");
        Intrinsics.checkNotNullParameter(defaultViewModelComponentFactory, "defaultViewModelComponentFactory");
        this.application = application;
        this.componentFactories = componentFactories;
        this.keySet = keySet;
        this.defaultViewModelComponentFactory = defaultViewModelComponentFactory;
    }

    public static /* synthetic */ HammerViewModelFactory fromActivity$runtime_release$default(HammerViewModelFactoryCreator hammerViewModelFactoryCreator, ComponentActivity componentActivity, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelProvider.Factory factory, Bundle bundle, int i, Object obj) {
        if ((i & 8) != 0) {
            bundle = null;
        }
        return hammerViewModelFactoryCreator.fromActivity$runtime_release(componentActivity, savedStateRegistryOwner, factory, bundle);
    }

    public final HammerViewModelFactory fromActivity$runtime_release(ComponentActivity activity, SavedStateRegistryOwner owner, ViewModelProvider.Factory delegateFactory, Bundle args) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        if (args == null) {
            Intent intent = activity.getIntent();
            args = intent != null ? intent.getExtras() : null;
        }
        return createFactory(owner, args, delegateFactory);
    }

    public final HammerViewModelFactory fromFragment$runtime_release(Fragment fragment, ViewModelProvider.Factory delegateFactory) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        return createFactory(fragment, fragment.getArguments(), delegateFactory);
    }

    static /* synthetic */ HammerViewModelFactory createFactory$default(HammerViewModelFactoryCreator hammerViewModelFactoryCreator, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, ViewModelProvider.Factory factory, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return hammerViewModelFactoryCreator.createFactory(savedStateRegistryOwner, bundle, factory);
    }

    private final HammerViewModelFactory createFactory(SavedStateRegistryOwner owner, Bundle defaultArgs, ViewModelProvider.Factory extensionDelegate) {
        Map<String, BaseViewModelComponent.Factory> map = this.componentFactories;
        Set<String> set = this.keySet;
        if (extensionDelegate == null) {
            extensionDelegate = new SavedStateViewModelFactory(this.application, owner, defaultArgs);
        }
        return new HammerViewModelFactory(owner, defaultArgs, map, set, extensionDelegate, this.defaultViewModelComponentFactory, Dispatchers.getMain().getImmediate());
    }
}
