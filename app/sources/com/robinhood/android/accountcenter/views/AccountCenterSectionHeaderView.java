package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterSectionHeaderViewBinding;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
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

/* compiled from: AccountCenterSectionHeaderView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001aB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0016R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterSectionHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$SectionHeaderItem;", "Lcom/robinhood/android/accountcenter/views/BaseAccountCenterView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterSectionHeaderViewBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterSectionHeaderViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;)V", "bind", "", "state", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountCenterSectionHeaderView extends LinearLayout implements Bindable<UiTypedAccountCenterItem.SectionHeaderItem>, BaseAccountCenterView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private AccountCenterAdapter.Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterSectionHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterSectionHeaderViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterSectionHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AccountCenterSectionHeaderView2.INSTANCE);
    }

    private final IncludeAccountCenterSectionHeaderViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeAccountCenterSectionHeaderViewBinding) value;
    }

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public AccountCenterAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.accountcenter.views.BaseAccountCenterView
    public void setCallbacks(AccountCenterAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final UiTypedAccountCenterItem.SectionHeaderItem state) throws Resources.NotFoundException {
        int dimensionPixelSize;
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().headerText.setText(state.getHeader());
        if (state.getAddTopPadding()) {
            dimensionPixelSize = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xlarge);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default);
        }
        setPadding(getPaddingLeft(), dimensionPixelSize, getPaddingRight(), getPaddingBottom());
        ImageView imageView = getBinding().headerInfoImage;
        Intrinsics.checkNotNull(imageView);
        ViewsKt.eventData$default(imageView, false, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterSectionHeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterSectionHeaderView.bind$lambda$2$lambda$0(state);
            }
        }, 1, null);
        ViewsKt.setLoggingConfig(imageView, new AutoLoggingConfig(false, false, 2, null));
        OnClickListeners.onClick(imageView, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterSectionHeaderView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterSectionHeaderView.bind$lambda$2$lambda$1(this.f$0, state);
            }
        });
        imageView.setContentDescription(state.getInfoActionContentDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$2$lambda$0(UiTypedAccountCenterItem.SectionHeaderItem sectionHeaderItem) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, sectionHeaderItem.getHeader(), null, 4, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(AccountCenterSectionHeaderView accountCenterSectionHeaderView, UiTypedAccountCenterItem.SectionHeaderItem sectionHeaderItem) {
        AccountCenterAdapter.Callbacks callbacks = accountCenterSectionHeaderView.getCallbacks();
        if (callbacks != null) {
            callbacks.onInfoImageClicked(sectionHeaderItem.getDefinitionsMarkdown());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountCenterSectionHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterSectionHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/AccountCenterSectionHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AccountCenterSectionHeaderView> {
        private final /* synthetic */ Inflater<AccountCenterSectionHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AccountCenterSectionHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AccountCenterSectionHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_account_center_section_header_view);
        }
    }
}
