package com.robinhood.hammer.android.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.hammer.android.viewmodel.BaseViewModelComponent;
import com.robinhood.hammer.android.viewmodel.DefaultViewModelComponent;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Supervisor3;

/* compiled from: HammerViewModelFactory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u000e*\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u000e0\tH\u0002\u001a\u001c\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010\u000e*\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u000e0\tH\u0002\u001aS\u0010\u0011\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u001e\u0010\b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"SAVED_STATE_HANDLE_INIT_ARG_KEY", "", "CREATION_INIT_ARG_KEY", "DUXO_INIT_ARG_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/os/Bundle;", "getDUXO_INIT_ARG_KEY", "()Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "hasSavedStateClass", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "hasDuxoInitArgsClass", "hasSavedState", "", "T", "Landroidx/lifecycle/ViewModel;", "hasDuxoInitArgs", "internalCreate", "modelClass", "componentFactories", "", "Lcom/robinhood/hammer/android/viewmodel/BaseViewModelComponent$Factory;", "defaultComponentFactory", "Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;", "mainImmediateDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/Class;Ljava/util/Map;Lcom/robinhood/hammer/android/viewmodel/DefaultViewModelComponent$Factory;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "runtime_release"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class HammerViewModelFactory3 {
    public static final String CREATION_INIT_ARG_KEY = "creationInitArg";
    public static final String SAVED_STATE_HANDLE_INIT_ARG_KEY = "initArgBundle";
    private static final CreationExtras.Key<Bundle> DUXO_INIT_ARG_KEY = new CreationExtras.Key<Bundle>() { // from class: com.robinhood.hammer.android.viewmodel.HammerViewModelFactoryKt$DUXO_INIT_ARG_KEY$1
    };
    private static final Class<?> hasSavedStateClass = HasSavedState.class;
    private static final Class<?> hasDuxoInitArgsClass = HasArgs.class;

    public static final CreationExtras.Key<Bundle> getDUXO_INIT_ARG_KEY() {
        return DUXO_INIT_ARG_KEY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewModel> boolean hasSavedState(Class<T> cls) {
        return hasSavedStateClass.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewModel> boolean hasDuxoInitArgs(Class<T> cls) {
        return hasDuxoInitArgsClass.isAssignableFrom(cls);
    }

    static /* synthetic */ ViewModel internalCreate$default(Class cls, Map map, DefaultViewModelComponent.Factory factory, CoroutineDispatcher coroutineDispatcher, SavedStateHandle savedStateHandle, int i, Object obj) {
        if ((i & 16) != 0) {
            savedStateHandle = new SavedStateHandle();
        }
        return internalCreate(cls, map, factory, coroutineDispatcher, savedStateHandle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewModel> T internalCreate(Class<T> cls, Map<String, ? extends BaseViewModelComponent.Factory> map, DefaultViewModelComponent.Factory factory, CoroutineDispatcher coroutineDispatcher, SavedStateHandle savedStateHandle) {
        String name = cls.getName();
        BaseViewModelComponent.Factory factory2 = map.get(name);
        BaseViewModelComponent.Factory factory3 = factory;
        if (factory2 != null) {
            factory3 = factory2;
        }
        HammerViewModelFactory2 hammerViewModelFactory2 = new HammerViewModelFactory2(Supervisor3.SupervisorJob$default(null, 1, null).plus(coroutineDispatcher));
        Provider<ViewModel> provider = factory3.create(savedStateHandle, hammerViewModelFactory2).getHammerViewModelMap().get(name);
        if (provider == null) {
            throw new IllegalStateException((cls.getName() + " can't be instantiated.").toString());
        }
        T tCast = cls.cast(provider.get());
        Intrinsics.checkNotNull(tCast);
        T t = tCast;
        t.addCloseable(hammerViewModelFactory2);
        return t;
    }
}
