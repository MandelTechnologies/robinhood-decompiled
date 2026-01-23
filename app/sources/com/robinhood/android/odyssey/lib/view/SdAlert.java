package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdAlert;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAlertComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdAlert.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0002:\u0002\u001e\u001fB\u0019\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0013\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0014J\u0006\u0010\u001d\u001a\u00020\u0015R\"\u0010\r\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdAlert;", "Landroid/view/View;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAlertComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAlertData;", "Lcom/robinhood/android/odyssey/lib/view/SdAlert$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;)V", "mergeNewData", "newData", "update", "", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onDataUpdated", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "onDialogDismissed", "Callbacks", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdAlert extends View implements SdBaseView<ApiSdAlertComponent, ApiSdPopup, Callbacks> {
    private ApiSdPopup data;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdAlert.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdAlert$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "showPopup", "", "popup", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "isPopupShowing", "", "dismissPopup", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends SdBaseView.Callbacks {
        void dismissPopup(ApiSdPopup popup);

        boolean isPopupShowing(ApiSdPopup popup);

        void showPopup(ApiSdPopup popup);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdAlertComponent apiSdAlertComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdAlertComponent);
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
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseView.DefaultImpls.onSubmitValue(this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdAlert(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdPopup getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdPopup apiSdPopup) {
        this.data = apiSdPopup;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdPopup mergeNewData(ApiSdPopup newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdPopup) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdPopup.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdPopup newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.update(this, newData, updateSource);
        setVisibility(8);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(final ApiSdPopup newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        if (isAttachedToWindow()) {
            Callbacks callbacks = (Callbacks) requireComponentCallbacks();
            ApiSdPopup data = getData();
            if (data != null) {
                if (Intrinsics.areEqual(newData.getIs_visible(), Boolean.TRUE) && !callbacks.isPopupShowing(data)) {
                    callbacks.showPopup(data);
                    return;
                } else {
                    if (Intrinsics.areEqual(newData.getIs_visible(), Boolean.FALSE) && callbacks.isPopupShowing(data)) {
                        callbacks.dismissPopup(data);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdAlert$onDataUpdated$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.removeOnAttachStateChangeListener(this);
                SdAlert.Callbacks callbacks2 = (SdAlert.Callbacks) this.requireComponentCallbacks();
                ApiSdPopup data2 = this.getData();
                if (data2 != null) {
                    if (Intrinsics.areEqual(newData.getIs_visible(), Boolean.TRUE) && !callbacks2.isPopupShowing(data2)) {
                        callbacks2.showPopup(data2);
                    } else if (Intrinsics.areEqual(newData.getIs_visible(), Boolean.FALSE) && callbacks2.isPopupShowing(data2)) {
                        callbacks2.dismissPopup(data2);
                    }
                }
            }
        });
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    public final void onDialogDismissed() {
        ApiSdPopup data = getData();
        setData(data != null ? ApiSdPopup.copy$default(data, null, Boolean.FALSE, null, null, null, null, null, 125, null) : null);
    }

    /* compiled from: SdAlert.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdAlert$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdAlert;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdAlert> {
        private final /* synthetic */ Inflater<SdAlert> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdAlert inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdAlert) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_alert);
        }
    }
}
