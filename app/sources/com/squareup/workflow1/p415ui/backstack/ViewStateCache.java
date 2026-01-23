package com.squareup.workflow1.p415ui.backstack;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.savedstate.SavedStateRegistryOwner;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.p415ui.Named;
import com.squareup.workflow1.p415ui.androidx.WorkflowSavedStateRegistryAggregator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: ViewStateCache.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001d\b\u0001\u0012\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\rJ\u0018\u0010\u0012\u001a\u00020\r2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u0014J\u0016\u0010\u0016\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0002J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J*\u0010\u001b\u001a\u00020\r2\u0010\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "", "()V", "viewStates", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "(Ljava/util/Map;)V", "stateRegistryAggregator", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "getViewStates$wf1_container_android", "()Ljava/util/Map;", "attachToParentRegistryOwner", "", "key", "parentOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "detachFromParentRegistry", "prune", "retaining", "", "Lcom/squareup/workflow1/ui/Named;", "pruneAllKeysExcept", "restore", "from", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "update", "retainedRenderings", "oldViewMaybe", "Landroid/view/View;", "newView", "Saved", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ViewStateCache {
    private final WorkflowSavedStateRegistryAggregator stateRegistryAggregator;
    private final Map<String, ViewStateFrame> viewStates;

    public ViewStateCache(Map<String, ViewStateFrame> viewStates) {
        Intrinsics.checkNotNullParameter(viewStates, "viewStates");
        this.viewStates = viewStates;
        this.stateRegistryAggregator = new WorkflowSavedStateRegistryAggregator();
    }

    public final Map<String, ViewStateFrame> getViewStates$wf1_container_android() {
        return this.viewStates;
    }

    public ViewStateCache() {
        this(new LinkedHashMap());
    }

    public final void prune(Collection<? extends Named<?>> retaining) {
        Intrinsics.checkNotNullParameter(retaining, "retaining");
        Collection<? extends Named<?>> collection = retaining;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Named) it.next()).getName());
        }
        pruneAllKeysExcept(arrayList);
    }

    private final void pruneAllKeysExcept(Collection<String> retaining) {
        CollectionsKt.removeAll(this.viewStates.keySet(), SetsKt.minus((Set) this.viewStates.keySet(), (Iterable) retaining));
        this.stateRegistryAggregator.pruneAllChildRegistryOwnersExcept(retaining);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void update(Collection<? extends Named<?>> retainedRenderings, View oldViewMaybe, View newView) {
        Intrinsics.checkNotNullParameter(retainedRenderings, "retainedRenderings");
        Intrinsics.checkNotNullParameter(newView, "newView");
        String namedKey = ViewStateCache3.getNamedKey(newView);
        Set set = SequencesKt.toSet(SequencesKt.map(CollectionsKt.asSequence(retainedRenderings), new Function1<Named<?>, String>() { // from class: com.squareup.workflow1.ui.backstack.ViewStateCache$update$hiddenKeys$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(Named<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName();
            }
        }));
        if (retainedRenderings.size() != set.size()) {
            throw new IllegalArgumentException(("Duplicate entries not allowed in " + retainedRenderings + '.').toString());
        }
        this.stateRegistryAggregator.installChildRegistryOwnerOn(newView, namedKey);
        ViewStateFrame viewStateFrameRemove = this.viewStates.remove(namedKey);
        if (viewStateFrameRemove != null) {
            newView.restoreHierarchyState(viewStateFrameRemove.getViewState());
        }
        if (oldViewMaybe != null) {
            String namedKey2 = ViewStateCache3.getNamedKey(oldViewMaybe);
            if (!set.contains(namedKey2)) {
                namedKey2 = null;
            }
            if (namedKey2 != null) {
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                oldViewMaybe.saveHierarchyState(sparseArray);
                Map<String, ViewStateFrame> viewStates$wf1_container_android = getViewStates$wf1_container_android();
                Tuples2 tuples2M3642to = Tuples4.m3642to(namedKey2, new ViewStateFrame(namedKey2, sparseArray));
                viewStates$wf1_container_android.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                this.stateRegistryAggregator.saveAndPruneChildRegistryOwner(namedKey2);
            }
        }
        pruneAllKeysExcept(SetsKt.plus((Set<? extends String>) set, namedKey));
    }

    public final void attachToParentRegistryOwner(String key, SavedStateRegistryOwner parentOwner) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentOwner, "parentOwner");
        this.stateRegistryAggregator.attachToParentRegistry(key, parentOwner);
    }

    public final void detachFromParentRegistry() {
        this.stateRegistryAggregator.detachFromParentRegistry();
    }

    public final void restore(Saved from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.viewStates.clear();
        this.viewStates.putAll(from.getViewStates$wf1_container_android());
    }

    public final Saved save() {
        return new Saved(this);
    }

    /* compiled from: ViewStateCache.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "Landroid/os/Parcelable;", "viewStateCache", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;", "(Lcom/squareup/workflow1/ui/backstack/ViewStateCache;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "viewStates", "", "", "Lcom/squareup/workflow1/ui/backstack/ViewStateFrame;", "getViewStates$wf1_container_android", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "out", "flags", "CREATOR", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Saved implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<String, ViewStateFrame> viewStates;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Saved(ViewStateCache viewStateCache) {
            Intrinsics.checkNotNullParameter(viewStateCache, "viewStateCache");
            this.viewStates = MapsKt.toMap(viewStateCache.getViewStates$wf1_container_android());
        }

        public Saved(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            source.readMap(TypeIntrinsics.asMutableMap(linkedHashMap), ViewStateCache.class.getClassLoader());
            this.viewStates = MapsKt.toMap(linkedHashMap);
        }

        public final Map<String, ViewStateFrame> getViewStates$wf1_container_android() {
            return this.viewStates;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeMap(this.viewStates);
        }

        /* compiled from: ViewStateCache.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
        /* renamed from: com.squareup.workflow1.ui.backstack.ViewStateCache$Saved$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<Saved> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Saved createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new Saved(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Saved[] newArray(int size) {
                return new Saved[size];
            }
        }
    }
}
