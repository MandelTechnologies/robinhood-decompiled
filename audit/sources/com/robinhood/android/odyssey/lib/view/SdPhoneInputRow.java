package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.odyssey.lib.SdComponentManager;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPhoneInputComponent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: SdPhoneInputRow.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0014J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 H\u0014J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0016J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdPhoneInputRow;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "componentManager", "Lcom/robinhood/android/odyssey/lib/SdComponentManager;", "getComponentManager", "()Lcom/robinhood/android/odyssey/lib/SdComponentManager;", "setComponentManager", "(Lcom/robinhood/android/odyssey/lib/SdComponentManager;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPhoneInputComponent$ApiSdPhoneInputComponentData;)V", "isFilledRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "onAttachedToWindow", "", "getTypedText", "", "isValidInput", "isFilled", "Lio/reactivex/Observable;", "mergeNewData", "newData", "overrideAccessibilityMessage", "message", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdPhoneInputRow extends Hammer_SdPhoneInputRow<ApiSdPhoneInputComponent, ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData, SdBaseInputRow.Callbacks> {
    public static final int $stable = 8;
    public SdComponentManager componentManager;
    private ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData data;
    private final BehaviorRelay<Boolean> isFilledRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdPhoneInputRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.isFilledRelay = behaviorRelayCreateDefault;
        setTemplated(true);
    }

    public final SdComponentManager getComponentManager() {
        SdComponentManager sdComponentManager = this.componentManager;
        if (sdComponentManager != null) {
            return sdComponentManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("componentManager");
        return null;
    }

    public final void setComponentManager(SdComponentManager sdComponentManager) {
        Intrinsics.checkNotNullParameter(sdComponentManager, "<set-?>");
        this.componentManager = sdComponentManager;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData apiSdPhoneInputComponentData) {
        this.data = apiSdPhoneInputComponentData;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SdComponentManager componentManager = getComponentManager();
        ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData data = getData();
        componentManager.setDefaultCountryCode(data != null ? data.getDefault_country_code() : null);
        Observable<R> observableSwitchMap = RxTextView.textChanges(requireEditText()).switchMap(new Function() { // from class: com.robinhood.android.odyssey.lib.view.SdPhoneInputRow.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InternationalInfo> apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SdPhoneInputRow.this.getComponentManager().streamSelectedInformationalInfo();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdPhoneInputRow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdPhoneInputRow.onAttachedToWindow$lambda$0(this.f$0, (InternationalInfo) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getComponentManager().streamSelectedInformationalInfo()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdPhoneInputRow$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdPhoneInputRow.onAttachedToWindow$lambda$1(this.f$0, (InternationalInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(SdPhoneInputRow sdPhoneInputRow, InternationalInfo internationalInfo) {
        sdPhoneInputRow.setErrorText(null);
        sdPhoneInputRow.isFilledRelay.accept(internationalInfo.getValidatePhoneNumber().invoke(sdPhoneInputRow.requireEditText().getTypedText()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(SdPhoneInputRow sdPhoneInputRow, InternationalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        sdPhoneInputRow.requireEditText().setTemplate(info.getCountryCodePhoneNumberTemplate(), info.getCountryCodePhoneNumberHint());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow
    public String getTypedText() {
        return new Regex("[^0-9]").replace(getComponentManager().getSelectedInformationalInfo().getDisplayCountryPhoneCode() + requireEditText().getTypedText(), "");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow
    protected boolean isValidInput() {
        if (isInputRequired()) {
            Boolean value = this.isFilledRelay.getValue();
            Intrinsics.checkNotNull(value);
            if (value.booleanValue()) {
                return true;
            }
        }
        if (isInputRequired()) {
            return false;
        }
        if (requireEditText().getTypedText().length() == 0) {
            return true;
        }
        Boolean value2 = this.isFilledRelay.getValue();
        Intrinsics.checkNotNull(value2);
        return value2.booleanValue();
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow
    protected Observable<Boolean> isFilled() {
        Observable<Boolean> observableHide = this.isFilledRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData mergeNewData(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdPhoneInputComponent.ApiSdPhoneInputComponentData.class), newData);
    }

    public final void overrideAccessibilityMessage(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ViewsKt.overrideAccessibilityMessage(requireEditText(), message);
    }
}
