package com.squareup.workflow1.p415ui.modal;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.p415ui.Compatible;
import com.squareup.workflow1.p415ui.Compatible2;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.WorkflowViewState;
import com.squareup.workflow1.p415ui.WorkflowViewState2;
import com.squareup.workflow1.p415ui.WorkflowViewStub;
import com.squareup.workflow1.p415ui.androidx.WorkflowAndroidXSupport;
import com.squareup.workflow1.p415ui.androidx.WorkflowLifecycleOwner;
import com.squareup.workflow1.p415ui.androidx.WorkflowSavedStateRegistryAggregator;
import com.squareup.workflow1.p415ui.modal.ModalContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModalContainer.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003+,-B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001cH$¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0014J\"\u0010%\u001a\u00020\u001f2\u0010\u0010&\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010(\u001a\u00020\u001cH\u0004J\u0016\u0010)\u001a\u00020\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H$R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer;", "ModalRenderingT", "", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "baseViewStub", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "dialogs", "", "Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;", "parentLifecycleOwner", "Lcom/squareup/workflow1/ui/androidx/WorkflowLifecycleOwner;", "getParentLifecycleOwner", "()Lcom/squareup/workflow1/ui/androidx/WorkflowLifecycleOwner;", "parentLifecycleOwner$delegate", "Lkotlin/Lazy;", "stateRegistryAggregator", "Lcom/squareup/workflow1/ui/androidx/WorkflowSavedStateRegistryAggregator;", "buildDialog", "initialModalRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;)Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;", "onAttachedToWindow", "", "onDetachedFromWindow", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "update", "newScreen", "Lcom/squareup/workflow1/ui/modal/HasModals;", "viewEnvironment", "updateDialog", "dialogRef", "DialogRef", "KeyAndBundle", "SavedState", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ModalContainer<ModalRenderingT> extends FrameLayout {
    private final WorkflowViewStub baseViewStub;
    private List<DialogRef<ModalRenderingT>> dialogs;

    /* renamed from: parentLifecycleOwner$delegate, reason: from kotlin metadata */
    private final Lazy parentLifecycleOwner;
    private final WorkflowSavedStateRegistryAggregator stateRegistryAggregator;

    protected abstract DialogRef<ModalRenderingT> buildDialog(ModalRenderingT initialModalRendering, ViewEnvironment initialViewEnvironment);

    protected abstract void updateDialog(DialogRef<ModalRenderingT> dialogRef);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModalContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.baseViewStub = workflowViewStub;
        this.dialogs = CollectionsKt.emptyList();
        this.parentLifecycleOwner = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<WorkflowLifecycleOwner>(this) { // from class: com.squareup.workflow1.ui.modal.ModalContainer$parentLifecycleOwner$2
            final /* synthetic */ ModalContainer<ModalRenderingT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final WorkflowLifecycleOwner invoke() {
                WorkflowLifecycleOwner workflowLifecycleOwner = WorkflowLifecycleOwner.INSTANCE.get(this.this$0);
                if (workflowLifecycleOwner != null) {
                    return workflowLifecycleOwner;
                }
                throw new IllegalStateException(Intrinsics.stringPlus("Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the context to be a LifecycleOwner, in ", this.this$0).toString());
            }
        });
        this.stateRegistryAggregator = new WorkflowSavedStateRegistryAggregator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WorkflowLifecycleOwner getParentLifecycleOwner() {
        return (WorkflowLifecycleOwner) this.parentLifecycleOwner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void update(HasModals<?, ? extends ModalRenderingT> newScreen, ViewEnvironment viewEnvironment) {
        ViewEnvironment viewEnvironment2;
        final DialogRef<ModalRenderingT> dialogRefBuildDialog;
        Intrinsics.checkNotNullParameter(newScreen, "newScreen");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.baseViewStub.update(newScreen.getBeneathModals(), viewEnvironment);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (ModalRenderingT modalrenderingt : newScreen.getModals()) {
            int i2 = i + 1;
            if (i < this.dialogs.size() && Compatible2.compatible(this.dialogs.get(i).getModalRendering(), modalrenderingt)) {
                viewEnvironment2 = viewEnvironment;
                dialogRefBuildDialog = DialogRef.copy$default(this.dialogs.get(i), modalrenderingt, viewEnvironment2, null, null, 12, null);
                updateDialog(dialogRefBuildDialog);
            } else {
                viewEnvironment2 = viewEnvironment;
                dialogRefBuildDialog = buildDialog(modalrenderingt, viewEnvironment2);
                dialogRefBuildDialog.setSavedStateRegistryKey$wf1_container_android(Compatible.INSTANCE.keyFor(modalrenderingt, String.valueOf(i)));
                View decorView = ModalContainer6.getDecorView(dialogRefBuildDialog.getDialog());
                if (decorView != null) {
                    WorkflowLifecycleOwner.INSTANCE.installOn(decorView, new Function1<View, Lifecycle>(this) { // from class: com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$1
                        final /* synthetic */ ModalContainer<ModalRenderingT> this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                            this.this$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Lifecycle invoke(View it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Lifecycle lifecycle = this.this$0.getParentLifecycleOwner().getLifecycle();
                            Intrinsics.checkNotNullExpressionValue(lifecycle, "parentLifecycleOwner.lifecycle");
                            return lifecycle;
                        }
                    });
                    this.stateRegistryAggregator.installChildRegistryOwnerOn(decorView, dialogRefBuildDialog.getSavedStateRegistryKey$wf1_container_android());
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(dialogRefBuildDialog, this) { // from class: com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2
                        final /* synthetic */ ModalContainer.DialogRef<ModalRenderingT> $ref;
                        private final ModalContainer5 dismissOnDestroy;
                        private Lifecycle lifecycle;
                        final /* synthetic */ ModalContainer<ModalRenderingT> this$0;

                        /* JADX WARN: Type inference failed for: r2v1, types: [com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2$dismissOnDestroy$1] */
                        {
                            this.$ref = dialogRefBuildDialog;
                            this.this$0 = this;
                            this.dismissOnDestroy = new DefaultLifecycleObserver() { // from class: com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2$dismissOnDestroy$1
                                @Override // androidx.lifecycle.DefaultLifecycleObserver
                                public void onDestroy(LifecycleOwner owner) {
                                    Intrinsics.checkNotNullParameter(owner, "owner");
                                    dialogRefBuildDialog.dismiss$wf1_container_android();
                                }
                            };
                        }

                        public final ModalContainer5 getDismissOnDestroy() {
                            return this.dismissOnDestroy;
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            Intrinsics.checkNotNullParameter(v, "v");
                            Lifecycle lifecycle = this.this$0.getParentLifecycleOwner().getLifecycle();
                            lifecycle.addObserver(getDismissOnDestroy());
                            this.lifecycle = lifecycle;
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                            Intrinsics.checkNotNullParameter(v, "v");
                            Lifecycle lifecycle = this.lifecycle;
                            if (lifecycle != null) {
                                lifecycle.removeObserver(this.dismissOnDestroy);
                            }
                            this.lifecycle = null;
                        }
                    });
                }
                dialogRefBuildDialog.getDialog().show();
            }
            arrayList.add(dialogRefBuildDialog);
            i = i2;
            viewEnvironment = viewEnvironment2;
        }
        Iterator it = CollectionsKt.minus((Iterable) this.dialogs, (Iterable) arrayList).iterator();
        while (it.hasNext()) {
            ((DialogRef) it.next()).dismiss$wf1_container_android();
        }
        WorkflowSavedStateRegistryAggregator workflowSavedStateRegistryAggregator = this.stateRegistryAggregator;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DialogRef) it2.next()).getSavedStateRegistryKey$wf1_container_android());
        }
        workflowSavedStateRegistryAggregator.pruneAllChildRegistryOwnersExcept(arrayList2);
        this.dialogs = arrayList;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        List<DialogRef<ModalRenderingT>> list = this.dialogs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DialogRef) it.next()).save$wf1_container_android());
        }
        return new SavedState(parcelableOnSaveInstanceState, arrayList);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            if (savedState.getDialogBundles().size() == this.dialogs.size()) {
                List<KeyAndBundle> dialogBundles = savedState.getDialogBundles();
                List<DialogRef<ModalRenderingT>> list = this.dialogs;
                Iterator<T> it = dialogBundles.iterator();
                Iterator<T> it2 = list.iterator();
                ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(dialogBundles, 10), CollectionsKt.collectionSizeOrDefault(list, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    ((DialogRef) it2.next()).restore$wf1_container_android((KeyAndBundle) it.next());
                    arrayList.add(Unit.INSTANCE);
                }
            }
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SavedStateRegistryOwner savedStateRegistryOwnerStateRegistryOwnerFromViewTreeOrContext = WorkflowAndroidXSupport.INSTANCE.stateRegistryOwnerFromViewTreeOrContext(this);
        Compatible.Companion companion = Compatible.INSTANCE;
        WorkflowViewState<?> workflowViewStateOrNull = WorkflowViewState2.getWorkflowViewStateOrNull(this);
        Object showing = workflowViewStateOrNull == null ? null : workflowViewStateOrNull.getShowing();
        if (showing == null) {
            showing = null;
        }
        Intrinsics.checkNotNull(showing);
        this.stateRegistryAggregator.attachToParentRegistry(Compatible.Companion.keyFor$default(companion, showing, null, 2, null), savedStateRegistryOwnerStateRegistryOwnerFromViewTreeOrContext);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.stateRegistryAggregator.detachFromParentRegistry();
        super.onDetachedFromWindow();
    }

    /* compiled from: ModalContainer.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "Landroid/os/Parcelable;", "", "compatibilityKey", "Landroid/os/Bundle;", "bundle", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCompatibilityKey", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "CREATOR", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final /* data */ class KeyAndBundle implements Parcelable {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Bundle bundle;
        private final String compatibilityKey;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KeyAndBundle)) {
                return false;
            }
            KeyAndBundle keyAndBundle = (KeyAndBundle) other;
            return Intrinsics.areEqual(this.compatibilityKey, keyAndBundle.compatibilityKey) && Intrinsics.areEqual(this.bundle, keyAndBundle.bundle);
        }

        public int hashCode() {
            return (this.compatibilityKey.hashCode() * 31) + this.bundle.hashCode();
        }

        public String toString() {
            return "KeyAndBundle(compatibilityKey=" + this.compatibilityKey + ", bundle=" + this.bundle + ')';
        }

        public KeyAndBundle(String compatibilityKey, Bundle bundle) {
            Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.compatibilityKey = compatibilityKey;
            this.bundle = bundle;
        }

        public final String getCompatibilityKey() {
            return this.compatibilityKey;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.compatibilityKey);
            parcel.writeBundle(this.bundle);
        }

        /* compiled from: ModalContainer.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
        /* renamed from: com.squareup.workflow1.ui.modal.ModalContainer$KeyAndBundle$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<KeyAndBundle> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public KeyAndBundle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                Intrinsics.checkNotNull(string2);
                Intrinsics.checkNotNullExpressionValue(string2, "parcel.readString()!!");
                Bundle bundle = parcel.readBundle(KeyAndBundle.class.getClassLoader());
                Intrinsics.checkNotNull(bundle);
                Intrinsics.checkNotNullExpressionValue(bundle, "parcel.readBundle(KeyAnd…class.java.classLoader)!!");
                return new KeyAndBundle(string2, bundle);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public KeyAndBundle[] newArray(int size) {
                return new KeyAndBundle[size];
            }
        }
    }

    /* compiled from: ModalContainer.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\tJ;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0019J\r\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0015\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J\r\u0010&\u001a\u00020$H\u0000¢\u0006\u0002\b'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;", "ModalRenderingT", "", "modalRendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "dialog", "Landroid/app/Dialog;", "extra", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/app/Dialog;Ljava/lang/Object;)V", "getDialog", "()Landroid/app/Dialog;", "getExtra", "()Ljava/lang/Object;", "getModalRendering", "Ljava/lang/Object;", "savedStateRegistryKey", "", "getSavedStateRegistryKey$wf1_container_android", "()Ljava/lang/String;", "setSavedStateRegistryKey$wf1_container_android", "(Ljava/lang/String;)V", "getViewEnvironment", "()Lcom/squareup/workflow1/ui/ViewEnvironment;", "copy", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/ViewEnvironment;Landroid/app/Dialog;Ljava/lang/Object;)Lcom/squareup/workflow1/ui/modal/ModalContainer$DialogRef;", "dismiss", "", "dismiss$wf1_container_android", "equals", "", "other", "hashCode", "", "restore", "keyAndBundle", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "restore$wf1_container_android", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "save$wf1_container_android", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    protected static final class DialogRef<ModalRenderingT> {
        private final Dialog dialog;
        private final Object extra;
        private final ModalRenderingT modalRendering;
        public String savedStateRegistryKey;
        private final ViewEnvironment viewEnvironment;

        public DialogRef(ModalRenderingT modalRendering, ViewEnvironment viewEnvironment, Dialog dialog, Object obj) {
            Intrinsics.checkNotNullParameter(modalRendering, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.modalRendering = modalRendering;
            this.viewEnvironment = viewEnvironment;
            this.dialog = dialog;
            this.extra = obj;
        }

        public /* synthetic */ DialogRef(Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, dialog, (i & 8) != 0 ? null : obj2);
        }

        public final ModalRenderingT getModalRendering() {
            return this.modalRendering;
        }

        public final ViewEnvironment getViewEnvironment() {
            return this.viewEnvironment;
        }

        public final Dialog getDialog() {
            return this.dialog;
        }

        public final Object getExtra() {
            return this.extra;
        }

        public final String getSavedStateRegistryKey$wf1_container_android() {
            String str = this.savedStateRegistryKey;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("savedStateRegistryKey");
            return null;
        }

        public final void setSavedStateRegistryKey$wf1_container_android(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.savedStateRegistryKey = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DialogRef copy$default(DialogRef dialogRef, Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = dialogRef.modalRendering;
            }
            if ((i & 2) != 0) {
                viewEnvironment = dialogRef.viewEnvironment;
            }
            if ((i & 4) != 0) {
                dialog = dialogRef.dialog;
            }
            if ((i & 8) != 0) {
                obj2 = dialogRef.extra;
            }
            return dialogRef.copy(obj, viewEnvironment, dialog, obj2);
        }

        public final DialogRef<ModalRenderingT> copy(ModalRenderingT modalRendering, ViewEnvironment viewEnvironment, Dialog dialog, Object extra) {
            Intrinsics.checkNotNullParameter(modalRendering, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            DialogRef<ModalRenderingT> dialogRef = new DialogRef<>(modalRendering, viewEnvironment, dialog, extra);
            dialogRef.setSavedStateRegistryKey$wf1_container_android(getSavedStateRegistryKey$wf1_container_android());
            return dialogRef;
        }

        public final KeyAndBundle save$wf1_container_android() {
            Window window = this.dialog.getWindow();
            Intrinsics.checkNotNull(window);
            Bundle saved = window.saveHierarchyState();
            String strKeyFor$default = Compatible.Companion.keyFor$default(Compatible.INSTANCE, this.modalRendering, null, 2, null);
            Intrinsics.checkNotNullExpressionValue(saved, "saved");
            return new KeyAndBundle(strKeyFor$default, saved);
        }

        public final void restore$wf1_container_android(KeyAndBundle keyAndBundle) {
            Intrinsics.checkNotNullParameter(keyAndBundle, "keyAndBundle");
            if (Intrinsics.areEqual(Compatible.Companion.keyFor$default(Compatible.INSTANCE, this.modalRendering, null, 2, null), keyAndBundle.getCompatibilityKey())) {
                Window window = this.dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.restoreHierarchyState(keyAndBundle.getBundle());
            }
        }

        public final void dismiss$wf1_container_android() {
            WorkflowLifecycleOwner workflowLifecycleOwner;
            View decorView = ModalContainer6.getDecorView(this.dialog);
            if (decorView != null && (workflowLifecycleOwner = WorkflowLifecycleOwner.INSTANCE.get(decorView)) != null) {
                workflowLifecycleOwner.destroyOnDetach();
            }
            this.dialog.dismiss();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(DialogRef.class, other == null ? null : other.getClass())) {
                return false;
            }
            if (other != null) {
                return Intrinsics.areEqual(this.dialog, ((DialogRef) other).dialog);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.ModalContainer.DialogRef<*>");
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }
    }

    /* compiled from: ModalContainer.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "dialogBundles", "", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "(Landroid/os/Parcelable;Ljava/util/List;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getDialogBundles", "()Ljava/util/List;", "writeToParcel", "", "out", "flags", "", "CREATOR", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    private static final class SavedState extends View.BaseSavedState {

        /* renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<KeyAndBundle> dialogBundles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, List<KeyAndBundle> dialogBundles) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(dialogBundles, "dialogBundles");
            this.dialogBundles = dialogBundles;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            ArrayList arrayList = new ArrayList();
            source.readTypedList(arrayList, KeyAndBundle.INSTANCE);
            this.dialogBundles = arrayList;
        }

        public final List<KeyAndBundle> getDialogBundles() {
            return this.dialogBundles;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeTypedList(this.dialogBundles);
        }

        /* compiled from: ModalContainer.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "()V", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "wf1-container-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
        /* renamed from: com.squareup.workflow1.ui.modal.ModalContainer$SavedState$CREATOR, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }
    }
}
