package com.robinhood.android.accountcenter.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterValueViewBinding;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AccountCenterValueView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001 B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterValueView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$ValueItem;", "Lcom/robinhood/android/accountcenter/views/BaseAccountCenterView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "callbacks", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;)V", "binding", "Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterValueViewBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterValueViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountCenterValueView extends Hammer_AccountCenterValueView implements Bindable<UiTypedAccountCenterItem.ValueItem>, BaseAccountCenterView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private AccountCenterAdapter.Callbacks callbacks;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterValueView.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterValueViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterValueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AccountCenterValueView2.INSTANCE);
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

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public AccountCenterAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public void setCallbacks(AccountCenterAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final IncludeAccountCenterValueViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeAccountCenterValueViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final UiTypedAccountCenterItem.ValueItem state) {
        ThemedResourceReference<ColorStateList> text_color_secondary;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getUsePrimaryColorForDescription()) {
            text_color_secondary = ThemeAttributes.INSTANCE.getTEXT_COLOR_PRIMARY();
        } else {
            text_color_secondary = ThemeAttributes.INSTANCE.getTEXT_COLOR_SECONDARY();
        }
        RhTextView descriptionText = getBinding().descriptionText;
        Intrinsics.checkNotNullExpressionValue(descriptionText, "descriptionText");
        ScarletManager2.overrideAttribute(descriptionText, R.attr.textColor, text_color_secondary);
        getBinding().descriptionText.setText(state.getDescription());
        getMarkwon().mo17580setMarkdown(getBinding().valueText, state.getValueMarkdown().getRaw());
        getBinding().valueText.setContentDescription(state.getValueDescription());
        String valueColor = state.getValueColor();
        if (valueColor != null) {
            ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = ServerToBentoColorMapper.INSTANCE.mapSimpleServerColor(valueColor);
            RhTextView valueText = getBinding().valueText;
            Intrinsics.checkNotNullExpressionValue(valueText, "valueText");
            ScarletManager2.overrideAttribute(valueText, R.attr.textColor, resourceReferences4MapSimpleServerColor);
        }
        final GenericAction action = state.getAction();
        if (action != null) {
            RhTextView rhTextView = getBinding().valueText;
            Intrinsics.checkNotNull(rhTextView);
            ViewsKt.eventData$default(rhTextView, false, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterValueView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterValueView.bind$lambda$4$lambda$3$lambda$1(state);
                }
            }, 1, null);
            ViewsKt.setLoggingConfig(rhTextView, new AutoLoggingConfig(false, false, 2, null));
            OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterValueView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountCenterValueView.bind$lambda$4$lambda$3$lambda$2(this.f$0, action);
                }
            });
            SpannableString spannableString = new SpannableString(rhTextView.getText());
            spannableString.setSpan(new UnderlineSpan(), 0, rhTextView.getText().length(), 0);
            rhTextView.setText(spannableString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$4$lambda$3$lambda$1(UiTypedAccountCenterItem.ValueItem valueItem) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, valueItem.getId(), null, 4, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4$lambda$3$lambda$2(AccountCenterValueView accountCenterValueView, GenericAction genericAction) {
        AccountCenterAdapter.Callbacks callbacks = accountCenterValueView.getCallbacks();
        if (callbacks != null) {
            callbacks.onValueTextClicked(genericAction);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountCenterValueView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterValueView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/AccountCenterValueView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AccountCenterValueView> {
        private final /* synthetic */ Inflater<AccountCenterValueView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AccountCenterValueView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AccountCenterValueView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_account_center_value_view);
        }
    }
}
