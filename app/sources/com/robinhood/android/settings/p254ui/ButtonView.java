package com.robinhood.android.settings.p254ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$attr;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.android.settings.p254ui.databinding.IncludeButtonViewBinding;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ButtonView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001bB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/ButtonView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ButtonItem;", "Lcom/robinhood/android/settings/ui/BaseSettingsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/settings/ui/databinding/IncludeButtonViewBinding;", "getBinding", "()Lcom/robinhood/android/settings/ui/databinding/IncludeButtonViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", "bind", "", "state", "onClickCallback", "Companion", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ButtonView extends FrameLayout implements Bindable<TypedSettingsItem.ButtonItem>, BaseSettingsView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private SettingsAdapter.Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ButtonView.class, "binding", "getBinding()Lcom/robinhood/android/settings/ui/databinding/IncludeButtonViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, ButtonView2.INSTANCE);
    }

    private final IncludeButtonViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeButtonViewBinding) value;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public SettingsAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public void setCallbacks(SettingsAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final TypedSettingsItem.ButtonItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(state.getColor());
        RdsButton button = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ScarletManager2.overrideAttribute(button, R.attr.textColor, resourceReferences4MapSimpleServerColor);
        RdsButton button2 = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        ScarletManager2.overrideAttribute(button2, C13997R.attr.rippleColor, resourceReferences4MapSimpleServerColor);
        RdsButton button3 = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button3, "button");
        ScarletManager2.overrideAttribute(button3, R$attr.strokeColor, resourceReferences4MapSimpleServerColor);
        getBinding().button.setText(state.getTitle());
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.settings.ui.ButtonView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ButtonView.bind$lambda$0(this.f$0, state);
            }
        });
        RdsButton button4 = getBinding().button;
        Intrinsics.checkNotNullExpressionValue(button4, "button");
        OnClickListeners.onClick(button4, new Function0() { // from class: com.robinhood.android.settings.ui.ButtonView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ButtonView.bind$lambda$1(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(ButtonView buttonView, TypedSettingsItem.ButtonItem buttonItem) {
        buttonView.onClickCallback(buttonItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(ButtonView buttonView, TypedSettingsItem.ButtonItem buttonItem) {
        buttonView.onClickCallback(buttonItem);
        return Unit.INSTANCE;
    }

    private final void onClickCallback(TypedSettingsItem.ButtonItem state) {
        SettingsAdapter.Callbacks callbacks = getCallbacks();
        if (callbacks != null) {
            callbacks.onSettingsActionTriggered(state.getAction(), state);
        }
    }

    /* compiled from: ButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/ButtonView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/ButtonView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ButtonView> {
        private final /* synthetic */ Inflater<ButtonView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ButtonView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ButtonView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_button_view);
        }
    }
}
