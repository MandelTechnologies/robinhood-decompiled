package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroup2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.Lists4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* compiled from: SdLinearLayout.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001(B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0016\u0010\u0012\u001a\u00020\u00112\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bJ\u001e\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u000bH\u0014J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0014J\b\u0010\u001d\u001a\u00020\u0011H\u0014J\u001d\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00028\u0000H$¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000bH\u0002J\u0016\u0010\"\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0014J\u0016\u0010$\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0014J\b\u0010%\u001a\u00020\u0016H\u0014J\u0012\u0010&\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010\u0016H\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdLinearLayout;", "D", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "content", "", "getContent", "()Ljava/util/List;", "setContent", "(Ljava/util/List;)V", "bindList", "", "bindListOnNotNull", "addChildren", "childrenStates", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "doAfterRestoringOrBindingChildState", "view", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "doBeforeAddingChildren", "doAfterAddingChildren", "inflateChild", "component", "(ILcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;)Landroid/view/View;", "saveChildrenStates", "dispatchSaveInstanceState", "container", "dispatchRestoreInstanceState", "onSaveInstanceState", "onRestoreInstanceState", "state", "SavedState", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class SdLinearLayout<D extends ApiSdComponent> extends LinearLayout {
    public static final int $stable = 8;
    private List<? extends D> content;

    protected void doAfterAddingChildren() {
    }

    protected void doAfterRestoringOrBindingChildState(View view, int index) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    protected void doBeforeAddingChildren() {
    }

    protected abstract View inflateChild(int index, D component);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected final List<D> getContent() {
        return this.content;
    }

    protected final void setContent(List<? extends D> list) {
        this.content = list;
    }

    public final void bindList(List<? extends D> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        addChildren(null);
    }

    public final void bindListOnNotNull(List<? extends D> content) {
        if (content != null) {
            bindList(content);
        } else {
            setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void addChildren(List<? extends SparseArray<Parcelable>> childrenStates) {
        if (this.content == null) {
            return;
        }
        doBeforeAddingChildren();
        List<? extends D> list = this.content;
        Intrinsics.checkNotNull(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ApiSdComponent apiSdComponent = (ApiSdComponent) obj;
            View viewInflateChild = inflateChild(i, apiSdComponent);
            if (childrenStates == null) {
                Intrinsics.checkNotNull(viewInflateChild, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdBaseView<D of com.robinhood.android.odyssey.lib.view.SdLinearLayout, *, *>");
                ((SdBaseView) viewInflateChild).bind(apiSdComponent);
            } else {
                viewInflateChild.restoreHierarchyState(childrenStates.get(i));
            }
            doAfterRestoringOrBindingChildState(viewInflateChild, i);
            addView(viewInflateChild);
            i = i2;
        }
        doAfterAddingChildren();
    }

    private final List<SparseArray<Parcelable>> saveChildrenStates() {
        return SequencesKt.toList(SequencesKt.map(ViewGroup2.getChildren(this), new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdLinearLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdLinearLayout.saveChildrenStates$lambda$3((View) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseArray saveChildrenStates$lambda$3(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        child.saveHierarchyState(sparseArray);
        return sparseArray;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
        dispatchFreezeSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(this.content, saveChildrenStates(), getVisibility(), super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdLinearLayout.SavedState<D of com.robinhood.android.odyssey.lib.view.SdLinearLayout>");
        SavedState savedState = (SavedState) state;
        setVisibility(savedState.getVisibility());
        List<? extends D> content = savedState.getContent();
        this.content = content;
        if (content != null) {
            addChildren(savedState.getChildrenStates());
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    /* compiled from: SdLinearLayout.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\tJ\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdLinearLayout$SavedState;", "D", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;", "Landroid/os/Parcelable;", "content", "", "childrenStates", "Landroid/util/SparseArray;", "visibility", "", "superState", "<init>", "(Ljava/util/List;Ljava/util/List;ILandroid/os/Parcelable;)V", "getContent", "()Ljava/util/List;", "getChildrenStates", "getVisibility", "()I", "getSuperState", "()Landroid/os/Parcelable;", "equals", "", "other", "", "hashCode", "component1", "component2", "component3", "component4", "copy", "describeContents", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SavedState<D extends ApiSdComponent> implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState<?>> CREATOR = new Creator();
        private final List<SparseArray<Parcelable>> childrenStates;
        private final List<D> content;
        private final Parcelable superState;
        private final int visibility;

        /* compiled from: SdLinearLayout.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState<?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState<?> createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(SavedState.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        int i5 = parcel.readInt();
                        SparseArray sparseArray = new SparseArray(i5);
                        while (i5 != 0) {
                            sparseArray.put(parcel.readInt(), parcel.readParcelable(SavedState.class.getClassLoader()));
                            i5--;
                        }
                        arrayList2.add(sparseArray);
                    }
                }
                return new SavedState<>(arrayList, arrayList2, parcel.readInt(), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState<?>[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SavedState copy$default(SavedState savedState, List list, List list2, int i, Parcelable parcelable, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = savedState.content;
            }
            if ((i2 & 2) != 0) {
                list2 = savedState.childrenStates;
            }
            if ((i2 & 4) != 0) {
                i = savedState.visibility;
            }
            if ((i2 & 8) != 0) {
                parcelable = savedState.superState;
            }
            return savedState.copy(list, list2, i, parcelable);
        }

        public final List<D> component1() {
            return this.content;
        }

        public final List<SparseArray<Parcelable>> component2() {
            return this.childrenStates;
        }

        /* renamed from: component3, reason: from getter */
        public final int getVisibility() {
            return this.visibility;
        }

        /* renamed from: component4, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final SavedState<D> copy(List<? extends D> content, List<? extends SparseArray<Parcelable>> childrenStates, int visibility, Parcelable superState) {
            return new SavedState<>(content, childrenStates, visibility, superState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState(content=" + this.content + ", childrenStates=" + this.childrenStates + ", visibility=" + this.visibility + ", superState=" + this.superState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<D> list = this.content;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<D> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            List<SparseArray<Parcelable>> list2 = this.childrenStates;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                for (SparseArray<Parcelable> sparseArray : list2) {
                    int size = sparseArray.size();
                    dest.writeInt(size);
                    for (int i = 0; i != size; i++) {
                        dest.writeInt(sparseArray.keyAt(i));
                        dest.writeParcelable(sparseArray.valueAt(i), flags);
                    }
                }
            }
            dest.writeInt(this.visibility);
            dest.writeParcelable(this.superState, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SavedState(List<? extends D> list, List<? extends SparseArray<Parcelable>> list2, int i, Parcelable parcelable) {
            this.content = list;
            this.childrenStates = list2;
            this.visibility = i;
            this.superState = parcelable;
        }

        public final List<D> getContent() {
            return this.content;
        }

        public final List<SparseArray<Parcelable>> getChildrenStates() {
            return this.childrenStates;
        }

        public final int getVisibility() {
            return this.visibility;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(SavedState.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdLinearLayout.SavedState<*>");
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.content, savedState.content) && Lists4.equalsBy(this.childrenStates, savedState.childrenStates, SdLinearLayout2.INSTANCE) && this.visibility == savedState.visibility && Intrinsics.areEqual(this.superState, savedState.superState);
        }

        public int hashCode() {
            List<D> list = this.content;
            int iHashCode = (((((list != null ? list.hashCode() : 0) * 31) + Lists4.hashCodeBy(this.childrenStates, SdLinearLayout3.INSTANCE)) * 31) + this.visibility) * 31;
            Parcelable parcelable = this.superState;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }
    }
}
