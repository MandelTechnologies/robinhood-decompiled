package com.squareup.workflow1.p415ui.androidx;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyedSavedStateRegistryOwner.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u000eH\u0097\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/squareup/workflow1/ui/androidx/KeyedSavedStateRegistryOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/LifecycleOwner;", "key", "", "lifecycleOwner", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;)V", "controller", "Landroidx/savedstate/SavedStateRegistryController;", "getController$wf1_core_android", "()Landroidx/savedstate/SavedStateRegistryController;", "getKey", "()Ljava/lang/String;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getSavedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class KeyedSavedStateRegistryOwner implements SavedStateRegistryOwner, LifecycleOwner {
    private final /* synthetic */ LifecycleOwner $$delegate_0;
    private final SavedStateRegistryController controller;
    private final String key;

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.$$delegate_0.getLifecycle();
    }

    public KeyedSavedStateRegistryOwner(String key, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.key = key;
        this.$$delegate_0 = lifecycleOwner;
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
        Intrinsics.checkNotNullExpressionValue(savedStateRegistryControllerCreate, "create(this)");
        this.controller = savedStateRegistryControllerCreate;
    }

    public final String getKey() {
        return this.key;
    }

    /* renamed from: getController$wf1_core_android, reason: from getter */
    public final SavedStateRegistryController getController() {
        return this.controller;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        SavedStateRegistry savedStateRegistry = this.controller.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "controller.savedStateRegistry");
        return savedStateRegistry;
    }
}
