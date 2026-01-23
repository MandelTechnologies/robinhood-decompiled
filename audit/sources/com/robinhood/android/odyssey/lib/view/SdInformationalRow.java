package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdIconDrawableRes;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdIcon;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInformationalRowComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
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

/* compiled from: SdInformationalRow.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001\"B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u001fH\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdInformationalRow;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInformationalRowComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInformationalRowComponent$ApiSdInformationalRowComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInformationalRowComponent$ApiSdInformationalRowComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdInformationalRowComponent$ApiSdInformationalRowComponentData;)V", "size", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "getSize", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "setSize", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;)V", "onFinishInflate", "", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdInformationalRow extends Hammer_SdInformationalRow implements SdBaseFlexibleComponentView<ApiSdInformationalRowComponent, ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData, SdBaseView.Callbacks> {
    private ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData data;
    private ApiSdFlexibleComponent.Size size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void bind(ApiSdInformationalRowComponent apiSdInformationalRowComponent) {
        SdBaseFlexibleComponentView.DefaultImpls.bind(this, apiSdInformationalRowComponent);
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
    public void update(ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData apiSdInformationalRowComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseFlexibleComponentView.DefaultImpls.update(this, apiSdInformationalRowComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdInformationalRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData apiSdInformationalRowComponentData) {
        this.data = apiSdInformationalRowComponentData;
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
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdInformationalRow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdInformationalRow.onFinishInflate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$1(SdInformationalRow sdInformationalRow) {
        ApiSdAction on_click;
        ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData data = sdInformationalRow.getData();
        if (data != null && (on_click = data.getOn_click()) != null) {
            SdBaseView.Callbacks callbacksRequireComponentCallbacks = sdInformationalRow.requireComponentCallbacks();
            ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData data2 = sdInformationalRow.getData();
            callbacksRequireComponentCallbacks.onComponentAction(data2 != null ? data2.getId() : null, on_click);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData mergeNewData(ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData.class), newData);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDataUpdated(ApiSdInformationalRowComponent.ApiSdInformationalRowComponentData newData, SdBaseView.UpdateSource updateSource) {
        CharSequence primaryText;
        CharSequence secondaryText;
        Drawable drawable;
        ApiSdIcon icon;
        ApiSdIcon.ApiSdIconData data;
        ThemedColor tint;
        ResourceReferences4<Integer> colorResource;
        ApiSdIcon.ApiSdIconData data2;
        ThemedColor tint2;
        ResourceReferences4<Integer> colorResource2;
        ApiSdTextComponentData data3;
        ApiSdTextComponentData data4;
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseFlexibleComponentView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        ApiSdTextSubComponent primary_text = newData.getPrimary_text();
        if (primary_text == null || (data4 = primary_text.getData()) == null) {
            primaryText = getPrimaryText();
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            primaryText = SdTextUtil.buildSpannableString(data4, context, this);
            if (primaryText == null) {
            }
        }
        setPrimaryText(primaryText);
        ApiSdTextSubComponent secondary_text = newData.getSecondary_text();
        if (secondary_text == null || (data3 = secondary_text.getData()) == null) {
            secondaryText = getSecondaryText();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            secondaryText = SdTextUtil.buildSpannableString(data3, context2, this);
            if (secondaryText == null) {
            }
        }
        setSecondaryText(secondaryText);
        ApiSdIcon icon2 = newData.getIcon();
        Drawable drawable2 = null;
        if (icon2 != null) {
            SdIconDrawableRes.Companion companion = SdIconDrawableRes.INSTANCE;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            drawable = companion.getDrawable(icon2, context3);
        } else {
            drawable = null;
        }
        setLeadingIconDrawable(drawable);
        if (getLeadingIconDrawable() != null) {
            ApiSdIcon icon3 = newData.getIcon();
            if (icon3 != null && (data2 = icon3.getData()) != null && (tint2 = data2.getTint()) != null && (colorResource2 = SduiColors2.toColorResource(tint2)) != null) {
                ScarletManager2.overrideAttribute(this, C13997R.attr.leadingIconTint, colorResource2);
            }
            setLeadingIconMarginTop(0);
            setLeadingIconVerticalBias(0.5f);
        }
        ApiSdIcon trailing_icon = newData.getTrailing_icon();
        if (trailing_icon != null) {
            SdIconDrawableRes.Companion companion2 = SdIconDrawableRes.INSTANCE;
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            drawable2 = companion2.getDrawable(trailing_icon, context4);
        }
        setTrailingIconDrawable(drawable2);
        if (getTrailingIconDrawable() != null && (icon = newData.getIcon()) != null && (data = icon.getData()) != null && (tint = data.getTint()) != null && (colorResource = SduiColors2.toColorResource(tint)) != null) {
            ScarletManager2.overrideAttribute(this, C13997R.attr.trailingIconTint, colorResource);
        }
        setClickable(newData.getOn_click() != null);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdInformationalRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdInformationalRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdInformationalRow;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdInformationalRow> {
        private final /* synthetic */ Inflater<SdInformationalRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdInformationalRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdInformationalRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_informational_list);
        }
    }
}
