package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.jakewharton.rxbinding3.widget.CompoundButtonCheckedChangeObservable2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsCheckBox;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SdCheckboxView.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001/B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eJ\b\u0010#\u001a\u00020!H\u0014J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0014J\u0012\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010,H\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdCheckboxView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxSubComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;)V", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/android/designsystem/text/RhTextView;", "getLabel", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "label$delegate", "Lkotlin/properties/ReadOnlyProperty;", "checkbox", "Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsCheckBox;", "getCheckbox", "()Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsCheckBox;", "checkbox$delegate", "isReadyForCheckEvent", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "setIsReadyForCheckEvent", "", "isReady", "onAttachedToWindow", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdBoolean;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdCheckboxView extends LinearLayout implements SdBaseView<ApiSdCheckboxSubComponent, ApiSdCheckboxComponentData, SdBaseView.Callbacks> {

    /* renamed from: checkbox$delegate, reason: from kotlin metadata */
    private final Interfaces2 checkbox;
    private ApiSdCheckboxComponentData data;
    private final BehaviorRelay<Boolean> isReadyForCheckEvent;

    /* renamed from: label$delegate, reason: from kotlin metadata */
    private final Interfaces2 label;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdCheckboxView.class, AnnotatedPrivateKey.LABEL, "getLabel()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(SdCheckboxView.class, "checkbox", "getCheckbox()Lcom/robinhood/android/designsystem/selectioncontrol/LegacyRdsCheckBox;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdCheckboxSubComponent apiSdCheckboxSubComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdCheckboxSubComponent);
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
    public void update(ApiSdCheckboxComponentData apiSdCheckboxComponentData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdCheckboxComponentData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdCheckboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.label = BindViewDelegate2.bindView$default(this, C20335R.id.sd_checkbox_label, null, 2, null);
        this.checkbox = BindViewDelegate2.bindView$default(this, C20335R.id.sd_checkbox_widget, null, 2, null);
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.isReadyForCheckEvent = behaviorRelayCreateDefault;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdCheckboxComponentData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdCheckboxComponentData apiSdCheckboxComponentData) {
        this.data = apiSdCheckboxComponentData;
    }

    private final RhTextView getLabel() {
        return (RhTextView) this.label.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegacyRdsCheckBox getCheckbox() {
        return (LegacyRdsCheckBox) this.checkbox.getValue(this, $$delegatedProperties[1]);
    }

    public final void setIsReadyForCheckEvent(boolean isReady) {
        this.isReadyForCheckEvent.accept(Boolean.valueOf(isReady));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ApiSdTextSubComponent display_label;
        ApiSdTextComponentData data;
        super.onAttachedToWindow();
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdCheckboxView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdCheckboxView.onAttachedToWindow$lambda$0(this.f$0);
            }
        });
        LegacyRdsCheckBox checkbox = getCheckbox();
        ApiSdCheckboxComponentData data2 = getData();
        ViewsKt.overrideAccessibilityMessage(checkbox, String.valueOf((data2 == null || (display_label = data2.getDisplay_label()) == null || (data = display_label.getData()) == null) ? null : data.getText()));
        Observable<R> observableSwitchMap = this.isReadyForCheckEvent.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.odyssey.lib.view.SdCheckboxView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.booleanValue()) {
                    return CompoundButtonCheckedChangeObservable2.checkedChanges(SdCheckboxView.this.getCheckbox());
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(observableSwitchMap, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdCheckboxView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdCheckboxView.onAttachedToWindow$lambda$2(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(SdCheckboxView sdCheckboxView) {
        sdCheckboxView.getCheckbox().toggle();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(SdCheckboxView sdCheckboxView, Boolean bool) {
        ApiSdCheckboxComponentData data = sdCheckboxView.getData();
        if (data == null) {
            return Unit.INSTANCE;
        }
        ApiSdAction on_check = bool.booleanValue() ? data.getOn_check() : data.getOn_uncheck();
        if (on_check != null) {
            sdCheckboxView.requireComponentCallbacks().onComponentAction(data.getId(), on_check);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdCheckboxComponentData mergeNewData(ApiSdCheckboxComponentData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdCheckboxComponentData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdCheckboxComponentData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdCheckboxComponentData newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        ApiSdTypedValue.ApiSdBoolean typed_default_value_object = newData.getTyped_default_value_object();
        if (typed_default_value_object != null) {
            getCheckbox().setChecked(typed_default_value_object.getValue());
        }
        RhTextView label = getLabel();
        ApiSdTextSubComponent display_label = newData.getDisplay_label();
        SdTextUtil.bindTextComponent(label, display_label != null ? display_label.getData() : null, this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue.ApiSdBoolean onSubmitValue() {
        return new ApiSdTypedValue.ApiSdBoolean(getCheckbox().isChecked());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdCheckboxView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdCheckboxView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdCheckboxView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdCheckboxView> {
        private final /* synthetic */ Inflater<SdCheckboxView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdCheckboxView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdCheckboxView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_checkbox_sub_component);
        }
    }
}
