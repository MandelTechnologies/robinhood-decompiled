package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.designsystem.dropdown.RdsDropdown;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdDropdownSelectComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdDropdownSelectRow.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u00041234B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H\u0016J\u0018\u0010(\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0014J\u0012\u0010/\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u00010.H\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow;", "Lcom/robinhood/android/designsystem/dropdown/RdsDropdown;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdDropdownSelectComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdDropdownSelectComponent$ApiSdDropdownSelectComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdDropdownSelectComponent$ApiSdDropdownSelectComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdDropdownSelectComponent$ApiSdDropdownSelectComponentData;)V", "options", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "optionSelectedCallbacks", "Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$ContainerCallbacks;", "getOptionSelectedCallbacks", "()Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$ContainerCallbacks;", "setOptionSelectedCallbacks", "(Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$ContainerCallbacks;)V", "value", "selectedOption", "getSelectedOption", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "setSelectedOption", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;)V", "onAttachedToWindow", "", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Callbacks", "ContainerCallbacks", "DropdownSelectSavedState", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdDropdownSelectRow extends RdsDropdown implements SdBaseView<ApiSdDropdownSelectComponent, ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData, Callbacks> {
    private static final long ONCLICK_WINDOW_MILLISECONDS = 1000;
    private ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData data;
    private ContainerCallbacks optionSelectedCallbacks;
    public List<ApiSdOption> options;
    private ApiSdOption selectedOption;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdDropdownSelectRow.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "showDropdownSelectBottomSheet", "", "componentTag", "", "options", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends SdBaseView.Callbacks {
        void showDropdownSelectBottomSheet(String componentTag, List<ApiSdOption> options);
    }

    /* compiled from: SdDropdownSelectRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$ContainerCallbacks;", "", "isOptionSelected", "", "isSelected", "", "tag", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ContainerCallbacks {
        void isOptionSelected(boolean isSelected, String tag);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdDropdownSelectComponent apiSdDropdownSelectComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdDropdownSelectComponent);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Callbacks requireComponentCallbacks() {
        return (Callbacks) SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData apiSdDropdownSelectComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdDropdownSelectComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdDropdownSelectRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData apiSdDropdownSelectComponentData) {
        this.data = apiSdDropdownSelectComponentData;
    }

    public final List<ApiSdOption> getOptions() {
        List<ApiSdOption> list = this.options;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("options");
        return null;
    }

    public final void setOptions(List<ApiSdOption> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.options = list;
    }

    public final ContainerCallbacks getOptionSelectedCallbacks() {
        return this.optionSelectedCallbacks;
    }

    public final void setOptionSelectedCallbacks(ContainerCallbacks containerCallbacks) {
        this.optionSelectedCallbacks = containerCallbacks;
    }

    public final ApiSdOption getSelectedOption() {
        return this.selectedOption;
    }

    public final void setSelectedOption(final ApiSdOption apiSdOption) {
        this.selectedOption = apiSdOption;
        setText(apiSdOption != null ? apiSdOption.getDisplay_label() : null);
        if (isAttachedToWindow()) {
            ContainerCallbacks optionSelectedCallbacks = getOptionSelectedCallbacks();
            if (optionSelectedCallbacks != null) {
                boolean z = apiSdOption != null;
                Object tag = getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
                optionSelectedCallbacks.isOptionSelected(z, (String) tag);
                return;
            }
            return;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow$special$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.removeOnAttachStateChangeListener(this);
                SdDropdownSelectRow.ContainerCallbacks optionSelectedCallbacks2 = this.getOptionSelectedCallbacks();
                if (optionSelectedCallbacks2 != null) {
                    boolean z2 = apiSdOption != null;
                    Object tag2 = this.getTag();
                    Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type kotlin.String");
                    optionSelectedCallbacks2.isOptionSelected(z2, (String) tag2);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<Unit> observableThrottleFirst = RxView.clicks(this).throttleFirst(1000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleFirst, "throttleFirst(...)");
        ViewDisposerKt.bindTo$default(observableThrottleFirst, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdDropdownSelectRow.onAttachedToWindow$lambda$1(this.f$0, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(SdDropdownSelectRow sdDropdownSelectRow, Unit unit) {
        Callbacks callbacks = (Callbacks) sdDropdownSelectRow.requireComponentCallbacks();
        Object tag = sdDropdownSelectRow.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
        callbacks.showDropdownSelectBottomSheet((String) tag, sdDropdownSelectRow.getOptions());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData mergeNewData(ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData newData, SdBaseView.UpdateSource updateSource) {
        ApiSdOption apiSdOption;
        String default_selected_key;
        Object next;
        String placeholder;
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        List<ApiSdOption> options = newData.getOptions();
        if (options != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow.onDataUpdated.2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SdDropdownSelectRow) this.receiver).getOptions();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((SdDropdownSelectRow) this.receiver).setOptions((List) obj);
                }
            }.set(options);
        }
        ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData data = getData();
        if (data != null && (placeholder = data.getPlaceholder()) != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow.onDataUpdated.4
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SdDropdownSelectRow) this.receiver).getHint();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((SdDropdownSelectRow) this.receiver).setHint((CharSequence) obj);
                }
            }.set(placeholder);
        }
        if (this.selectedOption == null) {
            ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData data2 = getData();
            ApiSdOption apiSdOption2 = null;
            if (data2 == null || (default_selected_key = data2.getDefault_selected_key()) == null) {
                apiSdOption = null;
            } else {
                Iterator<T> it = getOptions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((ApiSdOption) next).getKey(), default_selected_key)) {
                            break;
                        }
                    }
                }
                if (next == null) {
                    throw new IllegalArgumentException(("Cannot find the default_selected_key " + default_selected_key + " in options " + getOptions() + ". Please check with backend.").toString());
                }
                apiSdOption = (ApiSdOption) next;
            }
            ApiSdDropdownSelectComponent.ApiSdDropdownSelectComponentData data3 = getData();
            boolean z = (data3 != null ? data3.getPlaceholder() : null) != null;
            if (apiSdOption != null) {
                apiSdOption2 = apiSdOption;
            } else if (!z) {
                apiSdOption2 = (ApiSdOption) CollectionsKt.first((List) getOptions());
            }
            setSelectedOption(apiSdOption2);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        ApiSdOption apiSdOption = this.selectedOption;
        Intrinsics.checkNotNull(apiSdOption);
        return apiSdOption.getTyped_value_object();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new DropdownSelectSavedState(onSaveState(super.onSaveInstanceState()), this.selectedOption);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdDropdownSelectRow.DropdownSelectSavedState");
        DropdownSelectSavedState dropdownSelectSavedState = (DropdownSelectSavedState) state;
        setSelectedOption(dropdownSelectSavedState.getSelectedOption());
        super.onRestoreInstanceState(onRestoreState(dropdownSelectSavedState.getSavedState()));
    }

    /* compiled from: SdDropdownSelectRow.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$DropdownSelectSavedState;", "Landroid/os/Parcelable;", "savedState", "selectedOption", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "<init>", "(Landroid/os/Parcelable;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;)V", "getSavedState", "()Landroid/os/Parcelable;", "getSelectedOption", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DropdownSelectSavedState implements Parcelable {
        public static final Parcelable.Creator<DropdownSelectSavedState> CREATOR = new Creator();
        private final Parcelable savedState;
        private final ApiSdOption selectedOption;

        /* compiled from: SdDropdownSelectRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DropdownSelectSavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DropdownSelectSavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropdownSelectSavedState(parcel.readParcelable(DropdownSelectSavedState.class.getClassLoader()), (ApiSdOption) parcel.readParcelable(DropdownSelectSavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DropdownSelectSavedState[] newArray(int i) {
                return new DropdownSelectSavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.savedState, flags);
            dest.writeParcelable(this.selectedOption, flags);
        }

        public DropdownSelectSavedState(Parcelable savedState, ApiSdOption apiSdOption) {
            Intrinsics.checkNotNullParameter(savedState, "savedState");
            this.savedState = savedState;
            this.selectedOption = apiSdOption;
        }

        public final Parcelable getSavedState() {
            return this.savedState;
        }

        public final ApiSdOption getSelectedOption() {
            return this.selectedOption;
        }
    }

    /* compiled from: SdDropdownSelectRow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdDropdownSelectRow;", "<init>", "()V", "ONCLICK_WINDOW_MILLISECONDS", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdDropdownSelectRow> {
        private final /* synthetic */ Inflater<SdDropdownSelectRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdDropdownSelectRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdDropdownSelectRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_input_dropdown_select);
        }
    }
}
