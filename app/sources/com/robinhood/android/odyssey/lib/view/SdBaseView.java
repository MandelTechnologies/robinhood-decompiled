package com.robinhood.android.odyssey.lib.view;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.odyssey.lib.template.BaseSdFragment;
import com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.InvalidObjectException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdBaseView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007:\u0003'()J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\r\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\n\u0010!\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0014\u0010%\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010#H\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00018\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "T", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;", "D", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "C", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;)V", "requireAlternateComponentOnSubmitValueMap", "", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "requireSdView", "Landroid/view/View;", "requireComponentCallbacks", "()Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "bind", "", "component", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;)V", "update", "newData", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;)V", "mergeNewData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;)Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "onDataUpdated", "onSubmitValue", "onSaveState", "Landroid/os/Parcelable;", "superState", "onRestoreState", "state", "Callbacks", "SavedState", "UpdateSource", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface SdBaseView<T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> {

    /* compiled from: SdBaseView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "", "onComponentAppear", "", "component", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "onComponentAction", "componentId", "", "action", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction;", "handleDeepLink", "url", "Landroid/net/Uri;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public interface Callbacks {
        void handleDeepLink(Uri url);

        void onComponentAction(String componentId, ApiSdAction action);

        void onComponentAppear(ApiSdBaseIndividualComponentData component);
    }

    void bind(T component);

    D getData();

    D mergeNewData(D newData);

    void onDataUpdated(D newData, UpdateSource updateSource);

    Parcelable onRestoreState(Parcelable state);

    Parcelable onSaveState(Parcelable superState);

    ApiSdTypedValue onSubmitValue();

    Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap();

    C requireComponentCallbacks();

    View requireSdView();

    void setData(D d);

    void update(D newData, UpdateSource updateSource);

    /* compiled from: SdBaseView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> void onDataUpdated(SdBaseView<T, D, C> sdBaseView, D newData, UpdateSource updateSource) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        }

        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap(SdBaseView<T, D, C> sdBaseView) {
            Fragment fragmentFindFragment = FragmentManager.findFragment(sdBaseView.requireSdView());
            Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "findFragment(...)");
            while (!(fragmentFindFragment instanceof BaseSdFragment)) {
                fragmentFindFragment = fragmentFindFragment.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "requireParentFragment(...)");
            }
            return ((BaseSdFragment) fragmentFindFragment).getAlternateComponentOnSubmitValueMap();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> View requireSdView(SdBaseView<T, D, C> sdBaseView) {
            Intrinsics.checkNotNull(sdBaseView, "null cannot be cast to non-null type android.view.View");
            return (View) sdBaseView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> C requireComponentCallbacks(SdBaseView<T, D, C> sdBaseView) {
            Fragment fragmentFindFragment = FragmentManager.findFragment(sdBaseView.requireSdView());
            Intrinsics.checkNotNullExpressionValue(fragmentFindFragment, "findFragment(...)");
            Fragment fragment = fragmentFindFragment;
            while (!(fragment instanceof Callbacks)) {
                Fragment fragmentRequireParentFragment = fragment.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                fragment = fragmentRequireParentFragment;
            }
            return (C) fragment;
        }

        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> void bind(final SdBaseView<T, D, C> sdBaseView, final T component) {
            Intrinsics.checkNotNullParameter(component, "component");
            final View viewRequireSdView = sdBaseView.requireSdView();
            if (viewRequireSdView.isAttachedToWindow()) {
                sdBaseView.requireComponentCallbacks().onComponentAppear(component.getData());
            } else {
                viewRequireSdView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseView$DefaultImpls$bind$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        viewRequireSdView.removeOnAttachStateChangeListener(this);
                        sdBaseView.requireComponentCallbacks().onComponentAppear(component.getData());
                    }
                });
            }
            ApiSdBaseIndividualComponentData data = component.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type D of com.robinhood.android.odyssey.lib.view.SdBaseView");
            sdBaseView.update(data, UpdateSource.INIT);
        }

        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> void update(SdBaseView<T, D, C> sdBaseView, D newData, UpdateSource updateSource) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            Intrinsics.checkNotNullParameter(updateSource, "updateSource");
            sdBaseView.setData(sdBaseView.mergeNewData(newData));
            View viewRequireSdView = sdBaseView.requireSdView();
            String id = newData.getId();
            if (id != null) {
                viewRequireSdView.setTag(id);
            }
            Boolean is_visible = newData.getIs_visible();
            if (is_visible != null) {
                new MutablePropertyReference0Impl(viewRequireSdView) { // from class: com.robinhood.android.odyssey.lib.view.SdBaseView.update.3
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return Boolean.valueOf(((View) this.receiver).getVisibility() == 0);
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                    public void set(Object obj) {
                        ((View) this.receiver).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                    }
                }.set(is_visible);
            }
            sdBaseView.onDataUpdated(newData, updateSource);
        }

        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> ApiSdTypedValue onSubmitValue(SdBaseView<T, D, C> sdBaseView) throws InvalidObjectException {
            throw new InvalidObjectException(sdBaseView.getClass().getName() + " shouldn't be requested to submit a value.");
        }

        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> Parcelable onSaveState(SdBaseView<T, D, C> sdBaseView, Parcelable parcelable) {
            return new SavedState(parcelable, sdBaseView.getData(), sdBaseView.requireSdView().getVisibility());
        }

        public static <T extends ApiSdComponent, D extends ApiSdBaseIndividualComponentData, C extends Callbacks> Parcelable onRestoreState(SdBaseView<T, D, C> sdBaseView, Parcelable parcelable) {
            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdBaseView.SavedState<D of com.robinhood.android.odyssey.lib.view.SdBaseView>");
            SavedState savedState = (SavedState) parcelable;
            ApiSdBaseIndividualComponentData data = savedState.getData();
            if (data != null) {
                sdBaseView.update(data, UpdateSource.RESTORE);
            }
            sdBaseView.requireSdView().setVisibility(savedState.getVisibility());
            return savedState.getSuperState();
        }
    }

    /* compiled from: SdBaseView.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0003\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00030\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseView$SavedState;", "D", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "Landroid/os/Parcelable;", "superState", WebsocketGatewayConstants.DATA_KEY, "visibility", "", "<init>", "(Landroid/os/Parcelable;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;I)V", "getSuperState", "()Landroid/os/Parcelable;", "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "getVisibility", "()I", "component1", "component2", "component3", "copy", "(Landroid/os/Parcelable;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;I)Lcom/robinhood/android/odyssey/lib/view/SdBaseView$SavedState;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class SavedState<D extends ApiSdBaseIndividualComponentData> implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState<?>> CREATOR = new Creator();
        private final D data;
        private final Parcelable superState;
        private final int visibility;

        /* compiled from: SdBaseView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState<?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState<?> createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState<>(parcel.readParcelable(SavedState.class.getClassLoader()), (ApiSdBaseIndividualComponentData) parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState<?>[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SavedState copy$default(SavedState savedState, Parcelable parcelable, ApiSdBaseIndividualComponentData apiSdBaseIndividualComponentData, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                parcelable = savedState.superState;
            }
            if ((i2 & 2) != 0) {
                apiSdBaseIndividualComponentData = savedState.data;
            }
            if ((i2 & 4) != 0) {
                i = savedState.visibility;
            }
            return savedState.copy(parcelable, apiSdBaseIndividualComponentData, i);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final D component2() {
            return this.data;
        }

        /* renamed from: component3, reason: from getter */
        public final int getVisibility() {
            return this.visibility;
        }

        public final SavedState<D> copy(Parcelable superState, D data, int visibility) {
            return new SavedState<>(superState, data, visibility);
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
            return Intrinsics.areEqual(this.superState, savedState.superState) && Intrinsics.areEqual(this.data, savedState.data) && this.visibility == savedState.visibility;
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            D d = this.data;
            return ((iHashCode + (d != null ? d.hashCode() : 0)) * 31) + Integer.hashCode(this.visibility);
        }

        public String toString() {
            return "SavedState(superState=" + this.superState + ", data=" + this.data + ", visibility=" + this.visibility + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.superState, flags);
            dest.writeParcelable(this.data, flags);
            dest.writeInt(this.visibility);
        }

        public SavedState(Parcelable parcelable, D d, int i) {
            this.superState = parcelable;
            this.data = d;
            this.visibility = i;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final D getData() {
            return this.data;
        }

        public final int getVisibility() {
            return this.visibility;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SdBaseView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "", "<init>", "(Ljava/lang/String;I)V", "INIT", "RESTORE", "COMPONENT_DATA_CHANGE", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class UpdateSource {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpdateSource[] $VALUES;
        public static final UpdateSource INIT = new UpdateSource("INIT", 0);
        public static final UpdateSource RESTORE = new UpdateSource("RESTORE", 1);
        public static final UpdateSource COMPONENT_DATA_CHANGE = new UpdateSource("COMPONENT_DATA_CHANGE", 2);

        private static final /* synthetic */ UpdateSource[] $values() {
            return new UpdateSource[]{INIT, RESTORE, COMPONENT_DATA_CHANGE};
        }

        public static EnumEntries<UpdateSource> getEntries() {
            return $ENTRIES;
        }

        private UpdateSource(String str, int i) {
        }

        static {
            UpdateSource[] updateSourceArr$values = $values();
            $VALUES = updateSourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(updateSourceArr$values);
        }

        public static UpdateSource valueOf(String str) {
            return (UpdateSource) Enum.valueOf(UpdateSource.class, str);
        }

        public static UpdateSource[] values() {
            return (UpdateSource[]) $VALUES.clone();
        }
    }
}
