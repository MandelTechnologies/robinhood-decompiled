package com.robinhood.android.odyssey.lib.view;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseButtonView;
import com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.io.InvalidObjectException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDateTime;

/* compiled from: SdBaseButtonView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00172\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0017J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseButtonView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "", "doOnFinishInflate", "()V", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "onSubmitValue", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "newData", "mergeNewData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;)Lcom/robinhood/models/api/serverdrivenui/component/ApiSdButtonComponent$ApiSdButtonComponentData;", "j$/time/LocalDateTime", "getLastClickTime", "()Lj$/time/LocalDateTime;", "setLastClickTime", "(Lj$/time/LocalDateTime;)V", "lastClickTime", "", "isButtonDataDisabled", "()Z", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface SdBaseButtonView extends SdBaseFlexibleComponentView<ApiSdButtonComponent, ApiSdButtonComponent.ApiSdButtonComponentData, SdBaseView.Callbacks> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void doOnFinishInflate();

    LocalDateTime getLastClickTime();

    boolean isButtonDataDisabled();

    ApiSdButtonComponent.ApiSdButtonComponentData mergeNewData(ApiSdButtonComponent.ApiSdButtonComponentData newData);

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    ApiSdTypedValue onSubmitValue();

    void setLastClickTime(LocalDateTime localDateTime);

    /* compiled from: SdBaseButtonView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static void bind(SdBaseButtonView sdBaseButtonView, ApiSdButtonComponent component) {
            Intrinsics.checkNotNullParameter(component, "component");
            SdBaseFlexibleComponentView.DefaultImpls.bind(sdBaseButtonView, component);
        }

        public static void onDataUpdated(SdBaseButtonView sdBaseButtonView, ApiSdButtonComponent.ApiSdButtonComponentData newData, SdBaseView.UpdateSource updateSource) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            Intrinsics.checkNotNullParameter(updateSource, "updateSource");
            SdBaseFlexibleComponentView.DefaultImpls.onDataUpdated(sdBaseButtonView, newData, updateSource);
        }

        public static void onNoSizeDefined(SdBaseButtonView sdBaseButtonView) {
            SdBaseFlexibleComponentView.DefaultImpls.onNoSizeDefined(sdBaseButtonView);
        }

        public static Parcelable onRestoreState(SdBaseButtonView sdBaseButtonView, Parcelable parcelable) {
            return SdBaseFlexibleComponentView.DefaultImpls.onRestoreState(sdBaseButtonView, parcelable);
        }

        public static Parcelable onSaveState(SdBaseButtonView sdBaseButtonView, Parcelable parcelable) {
            return SdBaseFlexibleComponentView.DefaultImpls.onSaveState(sdBaseButtonView, parcelable);
        }

        public static void onSizeUpdated(SdBaseButtonView sdBaseButtonView) {
            SdBaseFlexibleComponentView.DefaultImpls.onSizeUpdated(sdBaseButtonView);
        }

        public static void overrideSize(SdBaseButtonView sdBaseButtonView, ApiSdFlexibleComponent.Size size) {
            SdBaseFlexibleComponentView.DefaultImpls.overrideSize(sdBaseButtonView, size);
        }

        public static Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap(SdBaseButtonView sdBaseButtonView) {
            return SdBaseFlexibleComponentView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(sdBaseButtonView);
        }

        public static SdBaseView.Callbacks requireComponentCallbacks(SdBaseButtonView sdBaseButtonView) {
            return SdBaseFlexibleComponentView.DefaultImpls.requireComponentCallbacks(sdBaseButtonView);
        }

        public static SdBaseFlexibleComponentView.Callbacks requireLayoutCallbacks(SdBaseButtonView sdBaseButtonView) {
            return SdBaseFlexibleComponentView.DefaultImpls.requireLayoutCallbacks(sdBaseButtonView);
        }

        public static View requireSdView(SdBaseButtonView sdBaseButtonView) {
            return SdBaseFlexibleComponentView.DefaultImpls.requireSdView(sdBaseButtonView);
        }

        public static void update(SdBaseButtonView sdBaseButtonView, ApiSdButtonComponent.ApiSdButtonComponentData newData, SdBaseView.UpdateSource updateSource) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            Intrinsics.checkNotNullParameter(updateSource, "updateSource");
            SdBaseFlexibleComponentView.DefaultImpls.update(sdBaseButtonView, newData, updateSource);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isButtonDataDisabled(SdBaseButtonView sdBaseButtonView) {
            Boolean disabled;
            ApiSdButtonComponent.ApiSdButtonComponentData apiSdButtonComponentData = (ApiSdButtonComponent.ApiSdButtonComponentData) sdBaseButtonView.getData();
            if (apiSdButtonComponentData == null || (disabled = apiSdButtonComponentData.getDisabled()) == null) {
                return false;
            }
            return disabled.booleanValue();
        }

        public static void doOnFinishInflate(final SdBaseButtonView sdBaseButtonView) {
            OnClickListeners.onClick(sdBaseButtonView.requireSdView(), new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdBaseButtonView$DefaultImpls$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SdBaseButtonView.DefaultImpls.doOnFinishInflate$lambda$1(sdBaseButtonView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.robinhood.android.odyssey.lib.view.SdBaseView$Callbacks] */
        public static Unit doOnFinishInflate$lambda$1(SdBaseButtonView sdBaseButtonView) {
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now(...)");
            sdBaseButtonView.setLastClickTime(localDateTimeNow);
            ApiSdButtonComponent.ApiSdButtonComponentData apiSdButtonComponentData = (ApiSdButtonComponent.ApiSdButtonComponentData) sdBaseButtonView.getData();
            if (apiSdButtonComponentData == null) {
                return Unit.INSTANCE;
            }
            ApiSdAction on_click = apiSdButtonComponentData.getOn_click();
            if (on_click != null) {
                sdBaseButtonView.requireComponentCallbacks().onComponentAction(apiSdButtonComponentData.getId(), on_click);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ApiSdTypedValue onSubmitValue(SdBaseButtonView sdBaseButtonView) throws InvalidObjectException {
            ApiSdTypedValue typed_value_object;
            ApiSdButtonComponent.ApiSdButtonComponentData apiSdButtonComponentData = (ApiSdButtonComponent.ApiSdButtonComponentData) sdBaseButtonView.getData();
            if (apiSdButtonComponentData == null || (typed_value_object = apiSdButtonComponentData.getTyped_value_object()) == null) {
                throw new InvalidObjectException("SdButton is required to submit its value but no value is bind.");
            }
            return typed_value_object;
        }

        public static ApiSdButtonComponent.ApiSdButtonComponentData mergeNewData(SdBaseButtonView sdBaseButtonView, ApiSdButtonComponent.ApiSdButtonComponentData newData) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            return (ApiSdButtonComponent.ApiSdButtonComponentData) MergePropertiesValues.mergePropertiesValues(sdBaseButtonView.getData(), Reflection.getOrCreateKotlinClass(ApiSdButtonComponent.ApiSdButtonComponentData.class), newData);
        }
    }

    /* compiled from: SdBaseButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdBaseButtonView$Companion;", "", "<init>", "()V", "inflate", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", ResourceTypes.STYLE, "Lcom/robinhood/models/serverdriven/GenericButtonType;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final View inflate(ViewGroup parent, GenericButtonType style) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (style == GenericButtonType.TERTIARY) {
                return SdTextButton.INSTANCE.inflate(parent);
            }
            return SdButton.INSTANCE.inflate(parent);
        }
    }
}
