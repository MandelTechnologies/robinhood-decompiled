package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdTextView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001\"B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdTextView;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextIndividualComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData;)V", "size", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "getSize", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "setSize", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;)V", "onFinishInflate", "", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdTextView extends RhTextView implements SdBaseFlexibleComponentView<ApiSdTextIndividualComponent, ApiSdTextComponentData, SdBaseView.Callbacks> {
    private ApiSdTextComponentData data;
    private ApiSdFlexibleComponent.Size size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void bind(ApiSdTextIndividualComponent apiSdTextIndividualComponent) {
        SdBaseFlexibleComponentView.DefaultImpls.bind(this, apiSdTextIndividualComponent);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void onNoSizeDefined() {
        SdBaseFlexibleComponentView.DefaultImpls.onNoSizeDefined(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView, com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseFlexibleComponentView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView, com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseFlexibleComponentView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void onSizeUpdated() {
        SdBaseFlexibleComponentView.DefaultImpls.onSizeUpdated(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseFlexibleComponentView.DefaultImpls.onSubmitValue(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void overrideSize(ApiSdFlexibleComponent.Size size) {
        SdBaseFlexibleComponentView.DefaultImpls.overrideSize(this, size);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public SdBaseFlexibleComponentView.Callbacks requireLayoutCallbacks() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireLayoutCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdTextComponentData apiSdTextComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseFlexibleComponentView.DefaultImpls.update(this, apiSdTextComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTextComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdTextComponentData apiSdTextComponentData) {
        this.data = apiSdTextComponentData;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public ApiSdFlexibleComponent.Size getSize() {
        return this.size;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void setSize(ApiSdFlexibleComponent.Size size) {
        this.size = size;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdTextView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdTextView.onFinishInflate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$1(SdTextView sdTextView) {
        ApiSdTextComponentData data = sdTextView.getData();
        if (data == null) {
            return Unit.INSTANCE;
        }
        ApiSdAction on_click = data.getOn_click();
        if (on_click != null) {
            sdTextView.requireComponentCallbacks().onComponentAction(data.getId(), on_click);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTextComponentData mergeNewData(ApiSdTextComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdTextComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdTextComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdTextComponentData newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseFlexibleComponentView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        SdTextUtil.bindTextComponent(this, newData, this);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdTextView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdTextView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdTextView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdTextView> {
        private final /* synthetic */ Inflater<SdTextView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdTextView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdTextView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.include_sd_text_view);
        }
    }
}
