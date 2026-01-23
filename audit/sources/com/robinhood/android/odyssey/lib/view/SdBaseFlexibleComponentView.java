package com.robinhood.android.odyssey.lib.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdBaseFlexibleComponentView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u0007:\u0002\u001c\u001dJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView;", "T", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent;", "D", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "C", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "size", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "getSize", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "setSize", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;)V", "requireLayoutCallbacks", "Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView$Callbacks;", "bind", "", "component", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent;)V", "overrideSize", "onNoSizeDefined", "onSizeUpdated", "onSaveState", "Landroid/os/Parcelable;", "superState", "onRestoreState", "state", "Callbacks", "SavedState", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface SdBaseFlexibleComponentView<T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> extends SdBaseView<T, D, C> {

    /* compiled from: SdBaseFlexibleComponentView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView$Callbacks;", "", "screenWidth", "", "getScreenWidth", "()I", "screenHeight", "getScreenHeight", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public interface Callbacks {
        int getScreenHeight();

        int getScreenWidth();
    }

    void bind(T component);

    ApiSdFlexibleComponent.Size getSize();

    void onNoSizeDefined();

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    Parcelable onRestoreState(Parcelable state);

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    Parcelable onSaveState(Parcelable superState);

    void onSizeUpdated();

    void overrideSize(ApiSdFlexibleComponent.Size size);

    Callbacks requireLayoutCallbacks();

    void setSize(ApiSdFlexibleComponent.Size size);

    /* compiled from: SdBaseFlexibleComponentView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> void onNoSizeDefined(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView) {
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> void onSizeUpdated(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView) {
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> void onDataUpdated(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView, D newData, SdBaseView.UpdateSource updateSource) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            Intrinsics.checkNotNullParameter(updateSource, "updateSource");
            SdBaseView.DefaultImpls.onDataUpdated(sdBaseFlexibleComponentView, newData, updateSource);
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> ApiSdTypedValue onSubmitValue(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView) {
            return SdBaseView.DefaultImpls.onSubmitValue(sdBaseFlexibleComponentView);
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView) {
            return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(sdBaseFlexibleComponentView);
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> C requireComponentCallbacks(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView) {
            return (C) SdBaseView.DefaultImpls.requireComponentCallbacks(sdBaseFlexibleComponentView);
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> View requireSdView(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView) {
            return SdBaseView.DefaultImpls.requireSdView(sdBaseFlexibleComponentView);
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> void update(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView, D newData, SdBaseView.UpdateSource updateSource) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            Intrinsics.checkNotNullParameter(updateSource, "updateSource");
            SdBaseView.DefaultImpls.update(sdBaseFlexibleComponentView, newData, updateSource);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> Callbacks requireLayoutCallbacks(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView) {
            Fragment fragmentFindFragment = FragmentManager.findFragment(sdBaseFlexibleComponentView.requireSdView());
            Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "findFragment(...)");
            Fragment fragment = fragmentFindFragment;
            while (!(fragment instanceof Callbacks)) {
                Fragment fragmentRequireParentFragment = fragment.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                fragment = fragmentRequireParentFragment;
            }
            return (Callbacks) fragment;
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> void bind(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView, T component) {
            Intrinsics.checkNotNullParameter(component, "component");
            SdBaseView.DefaultImpls.bind(sdBaseFlexibleComponentView, component);
            ApiSdFlexibleComponent.Layout layout = component.getLayout();
            sdBaseFlexibleComponentView.setSize(layout != null ? layout.getSize() : null);
            sdBaseFlexibleComponentView.overrideSize(sdBaseFlexibleComponentView.getSize());
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> void overrideSize(final SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView, final ApiSdFlexibleComponent.Size size) {
            boolean z;
            if (size == null) {
                sdBaseFlexibleComponentView.onNoSizeDefined();
                return;
            }
            final View viewRequireSdView = sdBaseFlexibleComponentView.requireSdView();
            if (viewRequireSdView.isAttachedToWindow()) {
                ApiSdFlexibleComponent.Size.Measurement width = size.getWidth();
                boolean z2 = true;
                if (width != null) {
                    viewRequireSdView.getLayoutParams().width = ViewLayoutUtils2.calculateExplicitWidth(viewRequireSdView, sdBaseFlexibleComponentView.requireLayoutCallbacks().getScreenWidth(), width);
                    z = true;
                } else {
                    z = false;
                }
                ApiSdFlexibleComponent.Size.Measurement height = size.getHeight();
                if (height != null) {
                    viewRequireSdView.getLayoutParams().height = ViewLayoutUtils2.calculateExplicitHeight(viewRequireSdView, sdBaseFlexibleComponentView.requireLayoutCallbacks().getScreenHeight(), height);
                } else {
                    z2 = z;
                }
                if (z2) {
                    sdBaseFlexibleComponentView.onSizeUpdated();
                    return;
                } else {
                    sdBaseFlexibleComponentView.onNoSizeDefined();
                    return;
                }
            }
            viewRequireSdView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView$DefaultImpls$overrideSize$lambda$3$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    boolean z3;
                    viewRequireSdView.removeOnAttachStateChangeListener(this);
                    ApiSdFlexibleComponent.Size.Measurement width2 = size.getWidth();
                    boolean z4 = true;
                    if (width2 != null) {
                        viewRequireSdView.getLayoutParams().width = ViewLayoutUtils2.calculateExplicitWidth(viewRequireSdView, sdBaseFlexibleComponentView.requireLayoutCallbacks().getScreenWidth(), width2);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ApiSdFlexibleComponent.Size.Measurement height2 = size.getHeight();
                    if (height2 != null) {
                        viewRequireSdView.getLayoutParams().height = ViewLayoutUtils2.calculateExplicitHeight(viewRequireSdView, sdBaseFlexibleComponentView.requireLayoutCallbacks().getScreenHeight(), height2);
                    } else {
                        z4 = z3;
                    }
                    if (z4) {
                        sdBaseFlexibleComponentView.onSizeUpdated();
                    } else {
                        sdBaseFlexibleComponentView.onNoSizeDefined();
                    }
                }
            });
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> Parcelable onSaveState(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView, Parcelable parcelable) {
            return new SavedState(SdBaseView.DefaultImpls.onSaveState(sdBaseFlexibleComponentView, parcelable), sdBaseFlexibleComponentView.getSize());
        }

        public static <T extends ApiSdFlexibleComponent, D extends ApiSdBaseIndividualComponentData, C extends SdBaseView.Callbacks> Parcelable onRestoreState(SdBaseFlexibleComponentView<T, D, C> sdBaseFlexibleComponentView, Parcelable parcelable) {
            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView.SavedState");
            SavedState savedState = (SavedState) parcelable;
            Parcelable parcelableOnRestoreState = SdBaseView.DefaultImpls.onRestoreState(sdBaseFlexibleComponentView, savedState.getSuperState());
            sdBaseFlexibleComponentView.setSize(savedState.getSize());
            sdBaseFlexibleComponentView.overrideSize(sdBaseFlexibleComponentView.getSize());
            return parcelableOnRestoreState;
        }
    }

    /* compiled from: SdBaseFlexibleComponentView.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView$SavedState;", "Landroid/os/Parcelable;", "superState", "size", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "<init>", "(Landroid/os/Parcelable;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;)V", "getSuperState", "()Landroid/os/Parcelable;", "getSize", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class SavedState implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final ApiSdFlexibleComponent.Size size;
        private final Parcelable superState;

        /* compiled from: SdBaseFlexibleComponentView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), (ApiSdFlexibleComponent.Size) parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public static /* synthetic */ SavedState copy$default(SavedState savedState, Parcelable parcelable, ApiSdFlexibleComponent.Size size, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = savedState.superState;
            }
            if ((i & 2) != 0) {
                size = savedState.size;
            }
            return savedState.copy(parcelable, size);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSdFlexibleComponent.Size getSize() {
            return this.size;
        }

        public final SavedState copy(Parcelable superState, ApiSdFlexibleComponent.Size size) {
            return new SavedState(superState, size);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.superState, savedState.superState) && Intrinsics.areEqual(this.size, savedState.size);
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            ApiSdFlexibleComponent.Size size = this.size;
            return iHashCode + (size != null ? size.hashCode() : 0);
        }

        public String toString() {
            return "SavedState(superState=" + this.superState + ", size=" + this.size + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.superState, flags);
            dest.writeParcelable(this.size, flags);
        }

        public SavedState(Parcelable parcelable, ApiSdFlexibleComponent.Size size) {
            this.superState = parcelable;
            this.size = size;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final ApiSdFlexibleComponent.Size getSize() {
            return this.size;
        }
    }
}
