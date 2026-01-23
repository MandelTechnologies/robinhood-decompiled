package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.widget.TextViewCompat;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.template.LoadContentRequest;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFancyAgreementComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdFancyAgreementView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001'B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010$H\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdFancyAgreementView;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFancyAgreementComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFancyAgreementComponent$Data;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFancyAgreementComponent$Data;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFancyAgreementComponent$Data;)V", "loadFancyAgreementRequest", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$FancyAgreement;", "getLoadFancyAgreementRequest", "()Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$FancyAgreement;", "setLoadFancyAgreementRequest", "(Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$FancyAgreement;)V", "mergeNewData", "newData", "onDataUpdated", "", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdFancyAgreementView extends Hammer_SdFancyAgreementView implements SdBaseView<ApiSdFancyAgreementComponent, ApiSdFancyAgreementComponent.Data, SdBaseView.Callbacks> {
    private ApiSdFancyAgreementComponent.Data data;
    private LoadContentRequest.FancyAgreement loadFancyAgreementRequest;
    public Markwon markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdFancyAgreementComponent apiSdFancyAgreementComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdFancyAgreementComponent);
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
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdFancyAgreementComponent.Data data, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, data, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdFancyAgreementView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdFancyAgreementComponent.Data getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdFancyAgreementComponent.Data data) {
        this.data = data;
    }

    public final LoadContentRequest.FancyAgreement getLoadFancyAgreementRequest() {
        return this.loadFancyAgreementRequest;
    }

    public final void setLoadFancyAgreementRequest(LoadContentRequest.FancyAgreement fancyAgreement) {
        this.loadFancyAgreementRequest = fancyAgreement;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdFancyAgreementComponent.Data mergeNewData(ApiSdFancyAgreementComponent.Data newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdFancyAgreementComponent.Data) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdFancyAgreementComponent.Data.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdFancyAgreementComponent.Data newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        String contentful_id = newData.getContentful_id();
        if (contentful_id != null) {
            Object tag = getTag();
            String str = tag instanceof String ? (String) tag : null;
            if (str == null) {
                setTag(contentful_id);
                str = contentful_id;
            }
            PrecomputedTextCompat.Params textMetricsParams = TextViewCompat.getTextMetricsParams(this);
            Intrinsics.checkNotNullExpressionValue(textMetricsParams, "getTextMetricsParams(...)");
            this.loadFancyAgreementRequest = new LoadContentRequest.FancyAgreement(str, textMetricsParams, contentful_id);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdFancyAgreementView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdFancyAgreementView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdFancyAgreementView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdFancyAgreementView> {
        private final /* synthetic */ Inflater<SdFancyAgreementView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdFancyAgreementView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdFancyAgreementView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_fancy_agreement);
        }
    }
}
