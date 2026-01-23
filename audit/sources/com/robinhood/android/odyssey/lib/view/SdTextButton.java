package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.view.SdBaseButtonView;
import com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdIconDrawableRes;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdIcon;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDateTime;

/* compiled from: SdTextButton.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\t\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdTextButton;", "Lcom/robinhood/android/designsystem/button/RdsTextButton;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseButtonView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", "newData", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "updateSource", "onDataUpdated", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;)V", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "size", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "getSize", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "setSize", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;)V", "j$/time/LocalDateTime", "lastClickTime", "Lj$/time/LocalDateTime;", "getLastClickTime", "()Lj$/time/LocalDateTime;", "setLastClickTime", "(Lj$/time/LocalDateTime;)V", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdTextButton extends RdsTextButton implements SdBaseButtonView {
    private ApiSdButtonComponent.ApiSdButtonComponentData data;
    private LocalDateTime lastClickTime;
    private ApiSdFlexibleComponent.Size size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void bind(ApiSdButtonComponent apiSdButtonComponent) {
        SdBaseButtonView.DefaultImpls.bind(this, apiSdButtonComponent);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseButtonView
    public void doOnFinishInflate() {
        SdBaseButtonView.DefaultImpls.doOnFinishInflate(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseButtonView
    public boolean isButtonDataDisabled() {
        return SdBaseButtonView.DefaultImpls.isButtonDataDisabled(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdButtonComponent.ApiSdButtonComponentData mergeNewData(ApiSdButtonComponent.ApiSdButtonComponentData apiSdButtonComponentData) {
        return SdBaseButtonView.DefaultImpls.mergeNewData(this, apiSdButtonComponentData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void onNoSizeDefined() {
        SdBaseButtonView.DefaultImpls.onNoSizeDefined(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView, com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseButtonView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView, com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseButtonView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void onSizeUpdated() {
        SdBaseButtonView.DefaultImpls.onSizeUpdated(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseButtonView, com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseButtonView.DefaultImpls.onSubmitValue(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void overrideSize(ApiSdFlexibleComponent.Size size) {
        SdBaseButtonView.DefaultImpls.overrideSize(this, size);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseButtonView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseButtonView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public SdBaseFlexibleComponentView.Callbacks requireLayoutCallbacks() {
        return SdBaseButtonView.DefaultImpls.requireLayoutCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseButtonView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdButtonComponent.ApiSdButtonComponentData apiSdButtonComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseButtonView.DefaultImpls.update(this, apiSdButtonComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdTextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LocalDateTime MIN = LocalDateTime.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        this.lastClickTime = MIN;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdButtonComponent.ApiSdButtonComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdButtonComponent.ApiSdButtonComponentData apiSdButtonComponentData) {
        this.data = apiSdButtonComponentData;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public ApiSdFlexibleComponent.Size getSize() {
        return this.size;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void setSize(ApiSdFlexibleComponent.Size size) {
        this.size = size;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseButtonView
    public LocalDateTime getLastClickTime() {
        return this.lastClickTime;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseButtonView
    public void setLastClickTime(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<set-?>");
        this.lastClickTime = localDateTime;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        doOnFinishInflate();
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdButtonComponent.ApiSdButtonComponentData newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseButtonView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        String text = newData.getText();
        if (text != null) {
            setText(text);
        }
        ApiSdIcon icon = newData.getIcon();
        if (icon != null) {
            SdIconDrawableRes.Companion companion = SdIconDrawableRes.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable drawable = companion.getDrawable(icon, context);
            if (drawable != null) {
                new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdTextButton$onDataUpdated$1$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return TextViewsKt.getDrawableStart((TextView) this.receiver);
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                    public void set(Object obj) {
                        TextViewsKt.setDrawableStart((TextView) this.receiver, (Drawable) obj);
                    }
                }.set(drawable);
            }
        }
        if (newData.getDisabled() != null) {
            setEnabled(!r4.booleanValue());
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

    /* compiled from: SdTextButton.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdTextButton$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdTextButton;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdTextButton> {
        private final /* synthetic */ Inflater<SdTextButton> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdTextButton inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdTextButton) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.include_sd_text_button);
        }
    }
}
