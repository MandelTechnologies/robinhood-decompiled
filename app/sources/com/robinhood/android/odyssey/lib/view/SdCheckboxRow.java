package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsCheckBox;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdCheckboxComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextSubComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
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

/* compiled from: SdCheckboxRow.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001/B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eJ\b\u0010#\u001a\u00020!H\u0014J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0018\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0014J\u0012\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010,H\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdCheckboxRow;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdCheckboxComponentData;)V", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/android/designsystem/text/RhTextView;", "getLabel", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "label$delegate", "Lkotlin/properties/ReadOnlyProperty;", "checkbox", "Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsCheckBox;", "getCheckbox", "()Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsCheckBox;", "checkbox$delegate", "isReadyForCheckEvent", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "setIsReadyForCheckEvent", "", "isReady", "onAttachedToWindow", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue$ApiSdBoolean;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdCheckboxRow extends LinearLayout implements SdBaseView<ApiSdCheckboxComponent, ApiSdCheckboxComponentData, SdBaseView.Callbacks> {

    /* renamed from: checkbox$delegate, reason: from kotlin metadata */
    private final Interfaces2 checkbox;
    private ApiSdCheckboxComponentData data;
    private final BehaviorRelay<Boolean> isReadyForCheckEvent;

    /* renamed from: label$delegate, reason: from kotlin metadata */
    private final Interfaces2 label;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdCheckboxRow.class, AnnotatedPrivateKey.LABEL, "getLabel()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(SdCheckboxRow.class, "checkbox", "getCheckbox()Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsCheckBox;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdCheckboxComponent apiSdCheckboxComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdCheckboxComponent);
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
    public SdCheckboxRow(Context context, AttributeSet attributeSet) {
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

    private final NewRdsCheckBox getCheckbox() {
        return (NewRdsCheckBox) this.checkbox.getValue(this, $$delegatedProperties[1]);
    }

    public final void setIsReadyForCheckEvent(boolean isReady) {
        this.isReadyForCheckEvent.accept(Boolean.valueOf(isReady));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdCheckboxRow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdCheckboxRow.onAttachedToWindow$lambda$0(this.f$0);
            }
        });
        Observable<Boolean> observableFilter = this.isReadyForCheckEvent.distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.odyssey.lib.view.SdCheckboxRow.onAttachedToWindow.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        ViewDisposerKt.bindTo$default(observableFilter, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.view.SdCheckboxRow$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdCheckboxRow.onAttachedToWindow$lambda$1(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(SdCheckboxRow sdCheckboxRow) {
        sdCheckboxRow.getCheckbox().toggle();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(final SdCheckboxRow sdCheckboxRow, Boolean bool) {
        sdCheckboxRow.getCheckbox().setOnCheckedChangeListener(new AbstractCheckableView.OnCheckedChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdCheckboxRow$onAttachedToWindow$3$1
            @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView.OnCheckedChangeListener
            public final void onCheckedChange(AbstractCheckableView abstractCheckableView, boolean z) {
                Intrinsics.checkNotNullParameter(abstractCheckableView, "<unused var>");
                ApiSdCheckboxComponentData data = this.this$0.getData();
                if (data == null) {
                    return;
                }
                ApiSdAction on_check = z ? data.getOn_check() : data.getOn_uncheck();
                if (on_check != null) {
                    this.this$0.requireComponentCallbacks().onComponentAction(data.getId(), on_check);
                }
            }
        });
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
        return new ApiSdTypedValue.ApiSdBoolean(getCheckbox().getIsChecked());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdCheckboxRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdCheckboxRow$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdCheckboxRow;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdCheckboxRow> {
        private final /* synthetic */ Inflater<SdCheckboxRow> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdCheckboxRow inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdCheckboxRow) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.row_sd_checkbox);
        }
    }
}
