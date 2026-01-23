package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.accountcenter.AccountCenterAdapter;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.databinding.IncludeAccountCenterProfileHeaderViewBinding;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.models.accountcenter.p183ui.UiTypedAccountCenterItem;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.profiles.p218ui.extensions.ProfilePictureViews;
import com.robinhood.android.profiles.p218ui.view.ProfilePictureView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: AccountCenterProfileHeaderView.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001-B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0016J\u0010\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0002R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterProfileHeaderView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/models/accountcenter/ui/UiTypedAccountCenterItem$ProfileHeaderItem;", "Lcom/robinhood/android/accountcenter/views/BaseAccountCenterView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterProfileHeaderViewBinding;", "getBinding", "()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterProfileHeaderViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "hasProfilePicture", "", "getHasProfilePicture", "()Z", "setHasProfilePicture", "(Z)V", "analyticsButtonDescription", "", "getAnalyticsButtonDescription", "()Ljava/lang/String;", "setAnalyticsButtonDescription", "(Ljava/lang/String;)V", "callbacks", "Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/accountcenter/AccountCenterAdapter$Callbacks;)V", "bind", "", "state", "bindUsername", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountCenterProfileHeaderView extends Hammer_AccountCenterProfileHeaderView implements Bindable<UiTypedAccountCenterItem.ProfileHeaderItem>, BaseAccountCenterView {
    private String analyticsButtonDescription;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private AccountCenterAdapter.Callbacks callbacks;
    private boolean hasProfilePicture;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountCenterProfileHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/accountcenter/databinding/IncludeAccountCenterProfileHeaderViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountCenterProfileHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AccountCenterProfileHeaderView3.INSTANCE);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IncludeAccountCenterProfileHeaderViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeAccountCenterProfileHeaderViewBinding) value;
    }

    public final boolean getHasProfilePicture() {
        return this.hasProfilePicture;
    }

    public final void setHasProfilePicture(boolean z) {
        this.hasProfilePicture = z;
    }

    public final String getAnalyticsButtonDescription() {
        return this.analyticsButtonDescription;
    }

    public final void setAnalyticsButtonDescription(String str) {
        this.analyticsButtonDescription = str;
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
    public void bind(final UiTypedAccountCenterItem.ProfileHeaderItem state) {
        ProfilePictureView.ActionIcon actionIcon;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getHasSeparateEditButton()) {
            actionIcon = ProfilePictureView.ActionIcon.PLUS;
        } else {
            actionIcon = ProfilePictureView.ActionIcon.EDIT;
        }
        getBinding().profilePictureView.bind(state.getProfilePictureMedia(), actionIcon);
        bindUsername(state);
        LinearLayout userNameLayout = getBinding().userNameLayout;
        Intrinsics.checkNotNullExpressionValue(userNameLayout, "userNameLayout");
        OnClickListeners.onClick(userNameLayout, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterProfileHeaderView.bind$lambda$0(this.f$0);
            }
        });
        final ProfilePictureView profilePictureView = getBinding().profilePictureView;
        Intrinsics.checkNotNull(profilePictureView);
        ViewsKt.eventData$default(profilePictureView, false, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterProfileHeaderView.bind$lambda$3$lambda$1();
            }
        }, 1, null);
        OnClickListeners.onClick(profilePictureView, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterProfileHeaderView.bind$lambda$3$lambda$2(state, this, profilePictureView);
            }
        });
        this.hasProfilePicture = state.getProfilePictureMedia() != null;
        ProfilePictureView profilePictureView2 = getBinding().profilePictureView;
        Intrinsics.checkNotNullExpressionValue(profilePictureView2, "profilePictureView");
        this.analyticsButtonDescription = ProfilePictureViews.getAnalyticsButtonDescription(profilePictureView2);
        if (state.getProfilePictureLocal() != null) {
            ProfilePictureView profilePictureView3 = getBinding().profilePictureView;
            Bitmap profilePictureLocal = state.getProfilePictureLocal();
            Intrinsics.checkNotNull(profilePictureLocal);
            profilePictureView3.bind(profilePictureLocal, actionIcon);
        } else {
            getBinding().profilePictureView.bind(state.getProfilePictureMedia(), actionIcon);
        }
        RhTextView editProfileText = getBinding().editProfileText;
        Intrinsics.checkNotNullExpressionValue(editProfileText, "editProfileText");
        editProfileText.setVisibility(state.getHasSeparateEditButton() ? 0 : 8);
        final RhTextView rhTextView = getBinding().editProfileText;
        Intrinsics.checkNotNull(rhTextView);
        ViewsKt.eventData$default(rhTextView, false, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterProfileHeaderView.bind$lambda$6$lambda$4();
            }
        }, 1, null);
        OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCenterProfileHeaderView.bind$lambda$6$lambda$5(this.f$0, rhTextView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(AccountCenterProfileHeaderView accountCenterProfileHeaderView) {
        AccountCenterAdapter.Callbacks callbacks = accountCenterProfileHeaderView.getCallbacks();
        if (callbacks != null) {
            callbacks.onUsernameClicked();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$3$lambda$1() {
        return new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "profile_picture", null, 4, null), null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bind$lambda$3$lambda$2(UiTypedAccountCenterItem.ProfileHeaderItem profileHeaderItem, AccountCenterProfileHeaderView accountCenterProfileHeaderView, ProfilePictureView profilePictureView) {
        if (profileHeaderItem.getHasSeparateEditButton()) {
            AccountCenterAdapter.Callbacks callbacks = accountCenterProfileHeaderView.getCallbacks();
            if (callbacks != null) {
                callbacks.onProfilePictureClicked(accountCenterProfileHeaderView);
            }
        } else {
            Navigator navigator = accountCenterProfileHeaderView.getNavigator();
            Context context = profilePictureView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.ProfileEdit(null, 1, 0 == true ? 1 : 0), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$6$lambda$4() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.OPEN_URL, null, new Component(Component.ComponentType.BUTTON, AnalyticsStrings.BUTTON_GROUP_EDIT_PROFILE, null, 4, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bind$lambda$6$lambda$5(AccountCenterProfileHeaderView accountCenterProfileHeaderView, RhTextView rhTextView) {
        Navigator navigator = accountCenterProfileHeaderView.getNavigator();
        Context context = rhTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.ProfileEdit(null, 1, 0 == true ? 1 : 0), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private final void bindUsername(UiTypedAccountCenterItem.ProfileHeaderItem state) {
        LinearLayout userNameLayout = getBinding().userNameLayout;
        Intrinsics.checkNotNullExpressionValue(userNameLayout, "userNameLayout");
        String username = state.getUsername();
        userNameLayout.setVisibility(!(username == null || StringsKt.isBlank(username)) ? 0 : 8);
        RhTextView rhTextView = getBinding().userNameText;
        String username2 = state.getUsername();
        if (username2 == null) {
            username2 = "";
        }
        rhTextView.setText(username2);
        final RhTextView userNameText = getBinding().userNameText;
        Intrinsics.checkNotNullExpressionValue(userNameText, "userNameText");
        if (!userNameText.isAttachedToWindow()) {
            userNameText.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.android.accountcenter.views.AccountCenterProfileHeaderView$bindUsername$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    userNameText.removeOnAttachStateChangeListener(this);
                    Context context = this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges()), this, false, 2, null).subscribeKotlin(new AccountCenterProfileHeaderView2(this));
                }
            });
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges()), this, false, 2, null).subscribeKotlin(new AccountCenterProfileHeaderView2(this));
    }

    /* compiled from: AccountCenterProfileHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/AccountCenterProfileHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/AccountCenterProfileHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AccountCenterProfileHeaderView> {
        private final /* synthetic */ Inflater<AccountCenterProfileHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AccountCenterProfileHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AccountCenterProfileHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_account_center_profile_header_view);
        }
    }
}
