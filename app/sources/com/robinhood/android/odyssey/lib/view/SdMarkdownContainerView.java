package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdMarkdownContainerComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdMarkdownContainerSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdMarkdownContainerView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001'B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0014J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010$H\u0014R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdMarkdownContainerView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownContainerSubComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownContainerComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownContainerComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownContainerComponentData;)V", "textView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getTextView", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "textView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "mergeNewData", "newData", "onDataUpdated", "", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdMarkdownContainerView extends Hammer_SdMarkdownContainerView implements SdBaseView<ApiSdMarkdownContainerSubComponent, ApiSdMarkdownContainerComponentData, SdBaseView.Callbacks> {
    private ApiSdMarkdownContainerComponentData data;
    public Markwon markwon;

    /* renamed from: textView$delegate, reason: from kotlin metadata */
    private final Interfaces2 textView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdMarkdownContainerView.class, "textView", "getTextView()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdMarkdownContainerSubComponent apiSdMarkdownContainerSubComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdMarkdownContainerSubComponent);
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
    public void update(ApiSdMarkdownContainerComponentData apiSdMarkdownContainerComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdMarkdownContainerComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdMarkdownContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textView = BindViewDelegate2.bindView$default(this, C20335R.id.sd_markdown_container_text, null, 2, null);
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
    public ApiSdMarkdownContainerComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdMarkdownContainerComponentData apiSdMarkdownContainerComponentData) {
        this.data = apiSdMarkdownContainerComponentData;
    }

    private final RhTextView getTextView() {
        return (RhTextView) this.textView.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdMarkdownContainerComponentData mergeNewData(ApiSdMarkdownContainerComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdMarkdownContainerComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdMarkdownContainerComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdMarkdownContainerComponentData newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        String markdown_text = newData.getMarkdown_text();
        if (markdown_text != null) {
            getTextView().setText(getMarkwon().render(getMarkwon().mo17577parse(markdown_text)));
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdMarkdownContainerView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdMarkdownContainerView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdMarkdownContainerView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdMarkdownContainerView> {
        private final /* synthetic */ Inflater<SdMarkdownContainerView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdMarkdownContainerView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdMarkdownContainerView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_markdown_container_sub_component);
        }
    }
}
