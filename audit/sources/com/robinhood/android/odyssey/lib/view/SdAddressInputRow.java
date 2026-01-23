package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAddressInputComponent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdAddressInputRow.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdAddressInputRow;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAddressInputComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAddressInputComponent$ApiSdAddressInputComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAddressInputComponent$ApiSdAddressInputComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAddressInputComponent$ApiSdAddressInputComponentData;)V", "mergeNewData", "newData", "onDataUpdated", "", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "getTypedText", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdAddressInputRow extends SdBaseInputRow<ApiSdAddressInputComponent, ApiSdAddressInputComponent.ApiSdAddressInputComponentData, SdBaseInputRow.Callbacks> {
    public static final int $stable = 8;
    private ApiSdAddressInputComponent.ApiSdAddressInputComponentData data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdAddressInputRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdAddressInputComponent.ApiSdAddressInputComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdAddressInputComponent.ApiSdAddressInputComponentData apiSdAddressInputComponentData) {
        this.data = apiSdAddressInputComponentData;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdAddressInputComponent.ApiSdAddressInputComponentData mergeNewData(ApiSdAddressInputComponent.ApiSdAddressInputComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdAddressInputComponent.ApiSdAddressInputComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdAddressInputComponent.ApiSdAddressInputComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow
    public void onDataUpdated(ApiSdAddressInputComponent.ApiSdAddressInputComponentData newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        super.onDataUpdated((SdAddressInputRow) newData, updateSource);
        String placeholder = newData.getPlaceholder();
        if (placeholder != null) {
            requireEditText().setHint(placeholder);
        }
        String initial_value = newData.getInitial_value();
        if (initial_value != null) {
            requireEditText().setText(initial_value);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow
    public String getTypedText() {
        return String.valueOf(requireEditText().getText());
    }
}
