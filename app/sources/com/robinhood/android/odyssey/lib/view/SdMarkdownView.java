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
import com.robinhood.models.api.serverdrivenui.component.ApiSdMarkdownComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdMarkdownSubComponent;
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

/* compiled from: SdMarkdownView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001'B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010$H\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdMarkdownView;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownSubComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdMarkdownComponentData;)V", "loadMarkdownRequest", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$Markdown;", "getLoadMarkdownRequest", "()Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$Markdown;", "setLoadMarkdownRequest", "(Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest$Markdown;)V", "mergeNewData", "newData", "onDataUpdated", "", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdMarkdownView extends Hammer_SdMarkdownView implements SdBaseView<ApiSdMarkdownSubComponent, ApiSdMarkdownComponentData, SdBaseView.Callbacks> {
    private ApiSdMarkdownComponentData data;
    private LoadContentRequest.Markdown loadMarkdownRequest;
    public Markwon markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdMarkdownSubComponent apiSdMarkdownSubComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdMarkdownSubComponent);
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
    public void update(ApiSdMarkdownComponentData apiSdMarkdownComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdMarkdownComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdMarkdownView(Context context, AttributeSet attributeSet) {
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
    public ApiSdMarkdownComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdMarkdownComponentData apiSdMarkdownComponentData) {
        this.data = apiSdMarkdownComponentData;
    }

    public final LoadContentRequest.Markdown getLoadMarkdownRequest() {
        return this.loadMarkdownRequest;
    }

    public final void setLoadMarkdownRequest(LoadContentRequest.Markdown markdown) {
        this.loadMarkdownRequest = markdown;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdMarkdownComponentData mergeNewData(ApiSdMarkdownComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdMarkdownComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdMarkdownComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdMarkdownComponentData newData, SdBaseView.UpdateSource updateSource) {
        Boolean should_append_trailing_newline;
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        String markdown_text = newData.getMarkdown_text();
        String link = newData.getLink();
        if (getTag() == null || link == null) {
            if (markdown_text != null) {
                setText(getMarkwon().render(getMarkwon().mo17577parse(markdown_text)));
                return;
            }
            return;
        }
        Object tag = getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
        String str = (String) tag;
        PrecomputedTextCompat.Params textMetricsParams = TextViewCompat.getTextMetricsParams(this);
        Intrinsics.checkNotNullExpressionValue(textMetricsParams, "getTextMetricsParams(...)");
        ApiSdMarkdownComponentData data = getData();
        this.loadMarkdownRequest = new LoadContentRequest.Markdown(textMetricsParams, str, link, (data == null || (should_append_trailing_newline = data.getShould_append_trailing_newline()) == null) ? true : should_append_trailing_newline.booleanValue());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdMarkdownView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdMarkdownView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdMarkdownView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdMarkdownView> {
        private final /* synthetic */ Inflater<SdMarkdownView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdMarkdownView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdMarkdownView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_markdown_sub_component);
        }
    }
}
