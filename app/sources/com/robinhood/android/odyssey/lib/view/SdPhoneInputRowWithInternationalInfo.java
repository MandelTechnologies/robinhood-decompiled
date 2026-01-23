package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPhoneInputComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdPhoneInputRowWithInternationalInfo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0003-./B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0012\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRowWithInternationalInfo;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRowWithInternationalInfo$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;)V", "phoneInputRow", "Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRow;", "getPhoneInputRow", "()Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRow;", "phoneInputRow$delegate", "Lkotlin/properties/ReadOnlyProperty;", "internationalInfoBtn", "Landroid/view/View;", "getInternationalInfoBtn", "()Landroid/view/View;", "internationalInfoBtn$delegate", "phoneInputInfoButton", "Lcom/robinhood/android/designsystem/button/RdsTextButton;", "getPhoneInputInfoButton", "()Lcom/robinhood/android/designsystem/button/RdsTextButton;", "phoneInputInfoButton$delegate", "onAttachedToWindow", "", "bind", "component", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "mergeNewData", "newData", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdString;", "Callbacks", "PhoneInputState", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdPhoneInputRowWithInternationalInfo extends LinearLayout implements SdBaseView<ApiSdPhoneInputComponent, ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData, Callbacks> {
    private static final long INTERNATIONAL_INFO_BTN_CLICKS_WINDOW_MILLISECONDS = 1000;
    private ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData data;

    /* renamed from: internationalInfoBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 internationalInfoBtn;

    /* renamed from: phoneInputInfoButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 phoneInputInfoButton;

    /* renamed from: phoneInputRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 phoneInputRow;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdPhoneInputRowWithInternationalInfo.class, "phoneInputRow", "getPhoneInputRow()Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRow;", 0)), Reflection.property1(new PropertyReference1Impl(SdPhoneInputRowWithInternationalInfo.class, "internationalInfoBtn", "getInternationalInfoBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(SdPhoneInputRowWithInternationalInfo.class, "phoneInputInfoButton", "getPhoneInputInfoButton()Lcom/robinhood/android/designsystem/button/RdsTextButton;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdPhoneInputRowWithInternationalInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRowWithInternationalInfo$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "onInternationalInfoBtnClick", "", "defaultCountryCode", "", "prohibitedCountryCodes", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends SdBaseView.Callbacks {
        void onInternationalInfoBtnClick(String defaultCountryCode, List<String> prohibitedCountryCodes);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData apiSdPhoneInputComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.onDataUpdated(this, apiSdPhoneInputComponentData, updateSource);
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
    public void update(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData apiSdPhoneInputComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdPhoneInputComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdPhoneInputRowWithInternationalInfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.phoneInputRow = BindViewDelegate2.bindView$default(this, C20335R.id.sd_phone_input_row, null, 2, null);
        this.internationalInfoBtn = BindViewDelegate2.bindView$default(this, C20335R.id.sd_phone_input_international_info_button, null, 2, null);
        this.phoneInputInfoButton = BindViewDelegate2.bindView$default(this, C20335R.id.sd_phone_input_international_info_button, null, 2, null);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData apiSdPhoneInputComponentData) {
        this.data = apiSdPhoneInputComponentData;
    }

    public final SdPhoneInputRow getPhoneInputRow() {
        return (SdPhoneInputRow) this.phoneInputRow.getValue(this, $$delegatedProperties[0]);
    }

    private final View getInternationalInfoBtn() {
        return (View) this.internationalInfoBtn.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsTextButton getPhoneInputInfoButton() {
        return (RdsTextButton) this.phoneInputInfoButton.getValue(this, $$delegatedProperties[2]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<Unit> observableThrottleFirst = RxView.clicks(getInternationalInfoBtn()).throttleFirst(1000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleFirst, "throttleFirst(...)");
        ViewDisposerKt.bindTo$default(observableThrottleFirst, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdPhoneInputRowWithInternationalInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdPhoneInputRowWithInternationalInfo.onAttachedToWindow$lambda$0(this.f$0, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(SdPhoneInputRowWithInternationalInfo sdPhoneInputRowWithInternationalInfo, Unit unit) {
        Callbacks callbacks = (Callbacks) sdPhoneInputRowWithInternationalInfo.requireComponentCallbacks();
        ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData data = sdPhoneInputRowWithInternationalInfo.getData();
        String default_country_code = data != null ? data.getDefault_country_code() : null;
        ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData data2 = sdPhoneInputRowWithInternationalInfo.getData();
        callbacks.onInternationalInfoBtnClick(default_country_code, data2 != null ? data2.getProhibited_country_codes() : null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdPhoneInputComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        SdBaseView.DefaultImpls.bind(this, component);
        setTag(null);
        getPhoneInputRow().bind((SdPhoneInputRow) component);
        String country_code_change_text = component.getData().getCountry_code_change_text();
        if (country_code_change_text != null) {
            getPhoneInputInfoButton().setText(country_code_change_text);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new PhoneInputState(super.onSaveInstanceState(), getData());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof PhoneInputState) {
            PhoneInputState phoneInputState = (PhoneInputState) state;
            super.onRestoreInstanceState(phoneInputState.getOuterState());
            setData(phoneInputState.getData());
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData mergeNewData(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue.ApiSdString onSubmitValue() {
        return getPhoneInputRow().onSubmitValue();
    }

    /* compiled from: SdPhoneInputRowWithInternationalInfo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRowWithInternationalInfo$PhoneInputState;", "Landroid/os/Parcelable;", "outerState", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;", "<init>", "(Landroid/os/Parcelable;Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;)V", "getOuterState", "()Landroid/os/Parcelable;", "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PhoneInputState implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PhoneInputState> CREATOR = new Creator();
        private final ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData data;
        private final Parcelable outerState;

        /* compiled from: SdPhoneInputRowWithInternationalInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PhoneInputState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhoneInputState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneInputState(parcel.readParcelable(PhoneInputState.class.getClassLoader()), (ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData) parcel.readParcelable(PhoneInputState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PhoneInputState[] newArray(int i) {
                return new PhoneInputState[i];
            }
        }

        public static /* synthetic */ PhoneInputState copy$default(PhoneInputState phoneInputState, Parcelable parcelable, ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData apiSdPhoneInputComponentData, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = phoneInputState.outerState;
            }
            if ((i & 2) != 0) {
                apiSdPhoneInputComponentData = phoneInputState.data;
            }
            return phoneInputState.copy(parcelable, apiSdPhoneInputComponentData);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getOuterState() {
            return this.outerState;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData getData() {
            return this.data;
        }

        public final PhoneInputState copy(Parcelable outerState, ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData data) {
            return new PhoneInputState(outerState, data);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhoneInputState)) {
                return false;
            }
            PhoneInputState phoneInputState = (PhoneInputState) other;
            return Intrinsics.areEqual(this.outerState, phoneInputState.outerState) && Intrinsics.areEqual(this.data, phoneInputState.data);
        }

        public int hashCode() {
            Parcelable parcelable = this.outerState;
            int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData apiSdPhoneInputComponentData = this.data;
            return iHashCode + (apiSdPhoneInputComponentData != null ? apiSdPhoneInputComponentData.hashCode() : 0);
        }

        public String toString() {
            return "PhoneInputState(outerState=" + this.outerState + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.outerState, flags);
            dest.writeParcelable(this.data, flags);
        }

        public PhoneInputState(Parcelable parcelable, ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData apiSdPhoneInputComponentData) {
            this.outerState = parcelable;
            this.data = apiSdPhoneInputComponentData;
        }

        public final Parcelable getOuterState() {
            return this.outerState;
        }

        public final ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData getData() {
            return this.data;
        }
    }

    /* compiled from: SdPhoneInputRowWithInternationalInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRowWithInternationalInfo$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRowWithInternationalInfo;", "<init>", "()V", "INTERNATIONAL_INFO_BTN_CLICKS_WINDOW_MILLISECONDS", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdPhoneInputRowWithInternationalInfo> {
        private final /* synthetic */ Inflater<SdPhoneInputRowWithInternationalInfo> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdPhoneInputRowWithInternationalInfo inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdPhoneInputRowWithInternationalInfo) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_input_phone_with_international_info);
        }
    }
}
