package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.textinput.RdsGenericTextInput;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInputComponent;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: SdInputRow.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001bB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdInputRow;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponent$ApiSdInputComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseInputRow$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponent$ApiSdInputComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInputComponent$ApiSdInputComponentData;)V", "mergeNewData", "newData", "onDataUpdated", "", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "getTypedText", "", "overrideAccessibilityMessage", "message", "", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdInputRow extends SdBaseInputRow<ApiSdInputComponent, ApiSdInputComponent.ApiSdInputComponentData, SdBaseInputRow.Callbacks> {
    private ApiSdInputComponent.ApiSdInputComponentData data;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdInputRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdInputComponent.ApiSdInputComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdInputComponent.ApiSdInputComponentData apiSdInputComponentData) {
        this.data = apiSdInputComponentData;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdInputComponent.ApiSdInputComponentData mergeNewData(ApiSdInputComponent.ApiSdInputComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdInputComponent.ApiSdInputComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdInputComponent.ApiSdInputComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow
    public void onDataUpdated(ApiSdInputComponent.ApiSdInputComponentData newData, SdBaseView.UpdateSource updateSource) {
        boolean templated;
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        if (newData.getTemplate() != null) {
            RdsGenericTextInput rdsGenericTextInputRequireEditText = requireEditText();
            String template = newData.getTemplate();
            Intrinsics.checkNotNull(template);
            String hint = newData.getHint();
            Intrinsics.checkNotNull(hint);
            rdsGenericTextInputRequireEditText.setTemplate(template, hint);
            templated = true;
            if (Intrinsics.areEqual(newData.getShould_mask(), Boolean.TRUE)) {
                requireEditText().setInputMasked(true);
            }
        } else {
            String placeholder = newData.getPlaceholder();
            if (placeholder != null) {
                requireEditText().setHint(placeholder);
            }
            templated = getTemplated();
        }
        setTemplated(templated);
        String initial_value = newData.getInitial_value();
        if (initial_value != null) {
            requireEditText().setText(initial_value);
        }
        super.onDataUpdated((SdInputRow) newData, updateSource);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseInputRow
    public String getTypedText() {
        return requireEditText().getTypedText();
    }

    public final void overrideAccessibilityMessage(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Regex regex = new Regex("XX+( - XX+)*");
        CharSequence hint = requireEditText().getHint();
        if (hint == null || regex.matches(hint)) {
            ViewsKt.overrideAccessibilityMessage(requireEditText(), message);
        }
    }

    /* compiled from: SdInputRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdInputRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdInputRow;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdInputRow> {
        private final /* synthetic */ Inflater<SdInputRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdInputRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdInputRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_input);
        }
    }
}
