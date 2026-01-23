package com.squareup.workflow1.p415ui.androidx;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkflowSavedStateRegistryAggregator.kt */
@Metadata(m3635d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001)\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00062\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "", "<init>", "()V", "Lcom/squareup/workflow1/ui/androidx/KeyedSavedStateRegistryOwner;", "child", "", "saveIfOwnerReady", "(Lcom/squareup/workflow1/ui/androidx/KeyedSavedStateRegistryOwner;)V", "restoreIfOwnerReady", "Landroid/os/Bundle;", "saveToBundle", "()Landroid/os/Bundle;", "restoredState", "restoreFromBundle", "(Landroid/os/Bundle;)V", "", "key", "Landroidx/savedstate/SavedStateRegistryOwner;", "parentOwner", "attachToParentRegistry", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistryOwner;)V", "detachFromParentRegistry", "Landroid/view/View;", "view", "installChildRegistryOwnerOn", "(Landroid/view/View;Ljava/lang/String;)V", "saveAndPruneChildRegistryOwner", "(Ljava/lang/String;)V", "", "keysToKeep", "pruneAllChildRegistryOwnersExcept", "(Ljava/util/Collection;)V", "", "states", "Ljava/util/Map;", "parentRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "parentKey", "Ljava/lang/String;", "children", "com/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator$lifecycleObserver$1", "lifecycleObserver", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator$lifecycleObserver$1;", "", "isRestored", "()Z", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowSavedStateRegistryAggregator {
    private final Map<String, KeyedSavedStateRegistryOwner> children = new LinkedHashMap();
    private final WorkflowSavedStateRegistryAggregator2 lifecycleObserver = new LifecycleEventObserver() { // from class: com.squareup.workflow1.ui.androidx.WorkflowSavedStateRegistryAggregator$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_CREATE) {
                if (this.this$0.isRestored()) {
                    throw new IllegalStateException("Expected not to be observing lifecycle after restoration.");
                }
                source.getLifecycle().removeObserver(this);
                WorkflowSavedStateRegistryAggregator workflowSavedStateRegistryAggregator = this.this$0;
                SavedStateRegistryOwner savedStateRegistryOwner = workflowSavedStateRegistryAggregator.parentRegistryOwner;
                Intrinsics.checkNotNull(savedStateRegistryOwner);
                SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
                String str = this.this$0.parentKey;
                Intrinsics.checkNotNull(str);
                workflowSavedStateRegistryAggregator.restoreFromBundle(savedStateRegistry.consumeRestoredStateForKey(str));
                return;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("Expected to receive ON_CREATE event before anything else, but got ", event).toString());
        }
    };
    private String parentKey;
    private SavedStateRegistryOwner parentRegistryOwner;
    private Map<String, Bundle> states;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRestored() {
        return this.states != null;
    }

    public final void attachToParentRegistry(String key, SavedStateRegistryOwner parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        detachFromParentRegistry();
        this.parentRegistryOwner = parentOwner;
        this.parentKey = key;
        if (isRestored()) {
            return;
        }
        SavedStateRegistry savedStateRegistry = parentOwner.getSavedStateRegistry();
        Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "parentOwner.savedStateRegistry");
        Lifecycle lifecycle = parentOwner.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "parentOwner.lifecycle");
        try {
            savedStateRegistry.registerSavedStateProvider(key, new SavedStateRegistry.SavedStateProvider() { // from class: com.squareup.workflow1.ui.androidx.WorkflowSavedStateRegistryAggregator$$ExternalSyntheticLambda0
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    return this.f$0.saveToBundle();
                }
            });
            lifecycle.addObserver(this.lifecycleObserver);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error registering SavedStateProvider: key \"" + key + "\" is already in use on parent SavedStateRegistryOwner " + parentOwner + ".\nThis is most easily remedied by giving your container Screen rendering a unique Compatible.compatibilityKey, perhaps by wrapping it with Named.", e);
        }
    }

    public final void detachFromParentRegistry() {
        Lifecycle lifecycle;
        SavedStateRegistry savedStateRegistry;
        SavedStateRegistryOwner savedStateRegistryOwner = this.parentRegistryOwner;
        if (savedStateRegistryOwner != null && (savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry()) != null) {
            String str = this.parentKey;
            Intrinsics.checkNotNull(str);
            savedStateRegistry.unregisterSavedStateProvider(str);
        }
        SavedStateRegistryOwner savedStateRegistryOwner2 = this.parentRegistryOwner;
        if (savedStateRegistryOwner2 != null && (lifecycle = savedStateRegistryOwner2.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.parentRegistryOwner = null;
        this.parentKey = null;
    }

    public final void installChildRegistryOwnerOn(View view, String key) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(key, "key");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (lifecycleOwner == null) {
            throw new IllegalArgumentException(("Expected " + view + '(' + key + ") to have a ViewTreeLifecycleOwner. Use WorkflowLifecycleOwner to fix that.").toString());
        }
        KeyedSavedStateRegistryOwner keyedSavedStateRegistryOwner = new KeyedSavedStateRegistryOwner(key, lifecycleOwner);
        if (this.children.put(key, keyedSavedStateRegistryOwner) != null) {
            throw new IllegalArgumentException(key + " is already in use, it cannot be used to register " + view);
        }
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(view);
        if (savedStateRegistryOwner != null) {
            throw new IllegalArgumentException(view + " already has ViewTreeSavedStateRegistryOwner: " + savedStateRegistryOwner);
        }
        ViewTreeSavedStateRegistryOwner.set(view, keyedSavedStateRegistryOwner);
        restoreIfOwnerReady(keyedSavedStateRegistryOwner);
    }

    public final void saveAndPruneChildRegistryOwner(String key) {
        Unit unit;
        Intrinsics.checkNotNullParameter(key, "key");
        KeyedSavedStateRegistryOwner keyedSavedStateRegistryOwnerRemove = this.children.remove(key);
        if (keyedSavedStateRegistryOwnerRemove == null) {
            unit = null;
        } else {
            saveIfOwnerReady(keyedSavedStateRegistryOwnerRemove);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("No such child: ", key));
        }
    }

    public final void pruneAllChildRegistryOwnersExcept(Collection<String> keysToKeep) {
        Intrinsics.checkNotNullParameter(keysToKeep, "keysToKeep");
        Collection<String> collection = keysToKeep;
        Iterator it = SetsKt.minus((Set) this.children.keySet(), (Iterable) collection).iterator();
        while (it.hasNext()) {
            this.children.remove((String) it.next());
        }
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        CollectionsKt.removeAll(map.keySet(), SetsKt.minus((Set) map.keySet(), (Iterable) collection));
    }

    private final void restoreIfOwnerReady(KeyedSavedStateRegistryOwner child) {
        Map<String, Bundle> map = this.states;
        if (map == null) {
            return;
        }
        child.getController().performRestore(map.remove(child.getKey()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveIfOwnerReady(KeyedSavedStateRegistryOwner child) {
        Map<String, Bundle> map = this.states;
        if (map == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        child.getController().performSave(bundle);
        Tuples2 tuples2M3642to = Tuples4.m3642to(child.getKey(), bundle);
        map.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle saveToBundle() {
        Bundle bundle = new Bundle();
        Map<String, Bundle> map = this.states;
        if (map != null) {
            Iterator<T> it = this.children.values().iterator();
            while (it.hasNext()) {
                saveIfOwnerReady((KeyedSavedStateRegistryOwner) it.next());
            }
            for (Map.Entry<String, Bundle> entry : map.entrySet()) {
                bundle.putBundle(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void restoreFromBundle(Bundle restoredState) {
        Set<String> setKeySet;
        if (this.states != null) {
            throw new IllegalStateException("Expected performRestore to be called only once.");
        }
        this.states = new LinkedHashMap();
        if (restoredState != null && (setKeySet = restoredState.keySet()) != null) {
            for (String str : setKeySet) {
                Map<String, Bundle> map = this.states;
                Intrinsics.checkNotNull(map);
                Bundle bundle = restoredState.getBundle(str);
                Intrinsics.checkNotNull(bundle);
                Tuples2 tuples2M3642to = Tuples4.m3642to(str, bundle);
                map.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
        }
        for (KeyedSavedStateRegistryOwner keyedSavedStateRegistryOwner : this.children.values()) {
            if (keyedSavedStateRegistryOwner.getLifecycle().getState() == Lifecycle.State.INITIALIZED) {
                restoreIfOwnerReady(keyedSavedStateRegistryOwner);
            }
        }
    }
}
