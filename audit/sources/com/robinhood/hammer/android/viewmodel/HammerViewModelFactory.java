package com.robinhood.hammer.android.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.hammer.android.viewmodel.BaseViewModelComponent;
import com.robinhood.hammer.android.viewmodel.DefaultViewModelComponent;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: HammerViewModelFactory.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003#$%B7\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rBU\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\f\u0010\u0019J-\u0010\u001a\u001a\u0002H\u001b\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010!J%\u0010\u001a\u001a\u0002H\u001b\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001eH\u0016¢\u0006\u0002\u0010\"R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "hammerViewModelKeys", "", "", "delegateFactory", "savedStateFactory", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$SavedStateFactory;", "noSavedStateFactory", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$NoSavedStateFactory;", "creationExtrasFactory", "Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$CreationExtrasFactory;", "<init>", "(Ljava/util/Set;Landroidx/lifecycle/ViewModelProvider$Factory;Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$SavedStateFactory;Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$NoSavedStateFactory;Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$CreationExtrasFactory;)V", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "componentFactories", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "defaultComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "mainImmediateDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;Ljava/util/Map;Ljava/util/Set;Landroidx/lifecycle/ViewModelProvider$Factory;Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;Lkotlinx/coroutines/CoroutineDispatcher;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "SavedStateFactory", "NoSavedStateFactory", "CreationExtrasFactory", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class HammerViewModelFactory implements ViewModelProvider.Factory {
    private final CreationExtrasFactory creationExtrasFactory;
    private final ViewModelProvider.Factory delegateFactory;
    private final Set<String> hammerViewModelKeys;
    private final NoSavedStateFactory noSavedStateFactory;
    private final SavedStateFactory savedStateFactory;

    private HammerViewModelFactory(Set<String> set, ViewModelProvider.Factory factory, SavedStateFactory savedStateFactory, NoSavedStateFactory noSavedStateFactory, CreationExtrasFactory creationExtrasFactory) {
        this.hammerViewModelKeys = set;
        this.delegateFactory = factory;
        this.savedStateFactory = savedStateFactory;
        this.noSavedStateFactory = noSavedStateFactory;
        this.creationExtrasFactory = creationExtrasFactory;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HammerViewModelFactory(SavedStateRegistryOwner owner, Bundle bundle, Map<String, ? extends BaseViewModelComponent.Factory> componentFactories, Set<String> hammerViewModelKeys, ViewModelProvider.Factory delegateFactory, DefaultViewModelComponent.Factory defaultComponentFactory, CoroutineDispatcher mainImmediateDispatcher) {
        this(hammerViewModelKeys, delegateFactory, new SavedStateFactory(owner, bundle, componentFactories, defaultComponentFactory, mainImmediateDispatcher), new NoSavedStateFactory(componentFactories, defaultComponentFactory, mainImmediateDispatcher), new CreationExtrasFactory(componentFactories, defaultComponentFactory, mainImmediateDispatcher));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
        Intrinsics.checkNotNullParameter(hammerViewModelKeys, "hammerViewModelKeys");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        Intrinsics.checkNotNullParameter(defaultComponentFactory, "defaultComponentFactory");
        Intrinsics.checkNotNullParameter(mainImmediateDispatcher, "mainImmediateDispatcher");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.hammerViewModelKeys.contains(modelClass.getName())) {
            return HammerViewModelFactory3.hasDuxoInitArgs(modelClass) ? (T) this.creationExtrasFactory.create(modelClass, extras) : HammerViewModelFactory3.hasSavedState(modelClass) ? (T) this.savedStateFactory.create(modelClass, extras) : (T) this.noSavedStateFactory.create(modelClass, extras);
        }
        return (T) this.delegateFactory.create(modelClass, extras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (this.hammerViewModelKeys.contains(modelClass.getName())) {
            if (HammerViewModelFactory3.hasSavedState(modelClass)) {
                return (T) this.savedStateFactory.create(modelClass);
            }
            return (T) this.noSavedStateFactory.create(modelClass);
        }
        return (T) this.delegateFactory.create(modelClass);
    }

    /* compiled from: HammerViewModelFactory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$SavedStateFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "componentFactories", "", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "defaultComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "mainImmediateDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;Ljava/util/Map;Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;Lkotlinx/coroutines/CoroutineDispatcher;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "key", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SavedStateFactory extends AbstractSavedStateViewModelFactory {
        private final Map<String, BaseViewModelComponent.Factory> componentFactories;
        private final DefaultViewModelComponent.Factory defaultComponentFactory;
        private final CoroutineDispatcher mainImmediateDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SavedStateFactory(SavedStateRegistryOwner owner, Bundle bundle, Map<String, ? extends BaseViewModelComponent.Factory> componentFactories, DefaultViewModelComponent.Factory defaultComponentFactory, CoroutineDispatcher mainImmediateDispatcher) {
            super(owner, bundle);
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
            Intrinsics.checkNotNullParameter(defaultComponentFactory, "defaultComponentFactory");
            Intrinsics.checkNotNullParameter(mainImmediateDispatcher, "mainImmediateDispatcher");
            this.componentFactories = componentFactories;
            this.defaultComponentFactory = defaultComponentFactory;
            this.mainImmediateDispatcher = mainImmediateDispatcher;
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        protected <T extends ViewModel> T create(String key, Class<T> modelClass, SavedStateHandle handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return (T) HammerViewModelFactory3.internalCreate(modelClass, this.componentFactories, this.defaultComponentFactory, this.mainImmediateDispatcher, handle);
        }
    }

    /* compiled from: HammerViewModelFactory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$NoSavedStateFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "componentFactories", "", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "defaultComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "mainImmediateDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/util/Map;Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;Lkotlinx/coroutines/CoroutineDispatcher;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class NoSavedStateFactory implements ViewModelProvider.Factory {
        private final Map<String, BaseViewModelComponent.Factory> componentFactories;
        private final DefaultViewModelComponent.Factory defaultComponentFactory;
        private final CoroutineDispatcher mainImmediateDispatcher;

        /* JADX WARN: Multi-variable type inference failed */
        public NoSavedStateFactory(Map<String, ? extends BaseViewModelComponent.Factory> componentFactories, DefaultViewModelComponent.Factory defaultComponentFactory, CoroutineDispatcher mainImmediateDispatcher) {
            Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
            Intrinsics.checkNotNullParameter(defaultComponentFactory, "defaultComponentFactory");
            Intrinsics.checkNotNullParameter(mainImmediateDispatcher, "mainImmediateDispatcher");
            this.componentFactories = componentFactories;
            this.defaultComponentFactory = defaultComponentFactory;
            this.mainImmediateDispatcher = mainImmediateDispatcher;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) HammerViewModelFactory3.internalCreate$default(modelClass, this.componentFactories, this.defaultComponentFactory, this.mainImmediateDispatcher, null, 16, null);
        }
    }

    /* compiled from: HammerViewModelFactory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/hammer/android/viewmodel/HammerViewModelFactory$CreationExtrasFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "componentFactories", "", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "defaultComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "mainImmediateDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/util/Map;Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;Lkotlinx/coroutines/CoroutineDispatcher;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class CreationExtrasFactory implements ViewModelProvider.Factory {
        private final Map<String, BaseViewModelComponent.Factory> componentFactories;
        private final DefaultViewModelComponent.Factory defaultComponentFactory;
        private final CoroutineDispatcher mainImmediateDispatcher;

        /* JADX WARN: Multi-variable type inference failed */
        public CreationExtrasFactory(Map<String, ? extends BaseViewModelComponent.Factory> componentFactories, DefaultViewModelComponent.Factory defaultComponentFactory, CoroutineDispatcher mainImmediateDispatcher) {
            Intrinsics.checkNotNullParameter(componentFactories, "componentFactories");
            Intrinsics.checkNotNullParameter(defaultComponentFactory, "defaultComponentFactory");
            Intrinsics.checkNotNullParameter(mainImmediateDispatcher, "mainImmediateDispatcher");
            this.componentFactories = componentFactories;
            this.defaultComponentFactory = defaultComponentFactory;
            this.mainImmediateDispatcher = mainImmediateDispatcher;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Map<String, BaseViewModelComponent.Factory> map = this.componentFactories;
            DefaultViewModelComponent.Factory factory = this.defaultComponentFactory;
            CoroutineDispatcher coroutineDispatcher = this.mainImmediateDispatcher;
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            savedStateHandleCreateSavedStateHandle.set(HammerViewModelFactory3.SAVED_STATE_HANDLE_INIT_ARG_KEY, extras.get(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY()));
            Unit unit = Unit.INSTANCE;
            return (T) HammerViewModelFactory3.internalCreate(modelClass, map, factory, coroutineDispatcher, savedStateHandleCreateSavedStateHandle);
        }
    }
}
