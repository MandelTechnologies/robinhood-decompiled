package com.robinhood.android.settings.p254ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R$attr;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextButtonView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002\u0015\u0016B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/TextButtonView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$TextButtonItem;", "Lcom/robinhood/android/settings/ui/BaseSettingsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", "bind", "", "state", "onClickCallback", "Small", "Medium", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class TextButtonView extends FrameLayout implements Bindable<TypedSettingsItem.TextButtonItem>, BaseSettingsView {
    public static final int $stable = 8;
    private SettingsAdapter.Callbacks callbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
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
    public void bind(final TypedSettingsItem.TextButtonItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(state.getStyle().getColor());
        View childAt = getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.robinhood.android.designsystem.button.RdsTextButton");
        RdsTextButton rdsTextButton = (RdsTextButton) childAt;
        ScarletManager2.overrideAttribute(rdsTextButton, R.attr.textColor, resourceReferences4MapSimpleServerColor);
        ScarletManager2.overrideAttribute(rdsTextButton, C13997R.attr.rippleColor, resourceReferences4MapSimpleServerColor);
        ScarletManager2.overrideAttribute(rdsTextButton, R$attr.strokeColor, resourceReferences4MapSimpleServerColor);
        rdsTextButton.setText(state.getTitle());
        OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.settings.ui.TextButtonView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextButtonView.bind$lambda$0(this.f$0, state);
            }
        });
        OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.settings.ui.TextButtonView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextButtonView.bind$lambda$1(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(TextButtonView textButtonView, TypedSettingsItem.TextButtonItem textButtonItem) {
        textButtonView.onClickCallback(textButtonItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(TextButtonView textButtonView, TypedSettingsItem.TextButtonItem textButtonItem) {
        textButtonView.onClickCallback(textButtonItem);
        return Unit.INSTANCE;
    }

    private final void onClickCallback(TypedSettingsItem.TextButtonItem state) {
        SettingsAdapter.Callbacks callbacks = getCallbacks();
        if (callbacks != null) {
            callbacks.onSettingsActionTriggered(state.getAction(), state);
        }
    }

    /* compiled from: TextButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/TextButtonView$Small;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/TextButtonView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Small implements Inflater<TextButtonView> {
        private final /* synthetic */ Inflater<TextButtonView> $$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_text_button_view_small);
        public static final Small INSTANCE = new Small();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public TextButtonView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (TextButtonView) this.$$delegate_0.inflate(parent);
        }

        private Small() {
        }
    }

    /* compiled from: TextButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/TextButtonView$Medium;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/TextButtonView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Medium implements Inflater<TextButtonView> {
        private final /* synthetic */ Inflater<TextButtonView> $$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_text_button_view_medium);
        public static final Medium INSTANCE = new Medium();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public TextButtonView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (TextButtonView) this.$$delegate_0.inflate(parent);
        }

        private Medium() {
        }
    }
}
