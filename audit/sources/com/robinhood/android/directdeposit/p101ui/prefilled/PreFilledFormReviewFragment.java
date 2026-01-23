package com.robinhood.android.directdeposit.p101ui.prefilled;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.accountinfo.AccountInfoViewState2;
import com.robinhood.android.directdeposit.p101ui.accountinfo.DirectDepositAccountInfoView;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.ExtensionsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import kotlin.Lazy;
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

/* compiled from: PreFilledFormReviewFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002CDB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020;H\u0016J\u0010\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u000201H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b(\u0010%R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u001c\u001a\u0004\b7\u00108¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/EditDepositAmountActivity$OnEditListener;", "<init>", "()V", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "getAccountRoutingDetailsStore", "()Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "setAccountRoutingDetailsStore", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;)V", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "getUserStore", "()Lcom/robinhood/shared/store/user/UserStore;", "setUserStore", "(Lcom/robinhood/shared/store/user/UserStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "accountInfoView", "Lcom/robinhood/android/directdeposit/ui/accountinfo/DirectDepositAccountInfoView;", "getAccountInfoView", "()Lcom/robinhood/android/directdeposit/ui/accountinfo/DirectDepositAccountInfoView;", "accountInfoView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "disclosureTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getDisclosureTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "disclosureTxt$delegate", "signBtn", "Landroid/widget/Button;", "getSignBtn", "()Landroid/widget/Button;", "signBtn$delegate", "editAmountBtn", "getEditAmountBtn", "editAmountBtn$delegate", PreFilledFormReviewFragment.ARG_EMPLOYER, "", "getEmployer", "()Ljava/lang/String;", "employer$delegate", "Lkotlin/Lazy;", "depositAmount", "Lcom/robinhood/models/ui/DirectDepositAmount;", "getDepositAmount", "()Lcom/robinhood/models/ui/DirectDepositAmount;", "depositAmount$delegate", "callbacks", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDepositAmountEdited", "amount", "Callbacks", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class PreFilledFormReviewFragment extends BaseFragment implements EditDepositAmountActivity.OnEditListener {
    private static final String ARG_DEPOSIT_AMOUNT = "depositAmount";
    private static final String ARG_EMPLOYER = "employer";

    /* renamed from: accountInfoView$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountInfoView;
    public AccountRoutingDetailsStore accountRoutingDetailsStore;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: depositAmount$delegate, reason: from kotlin metadata */
    private final Lazy depositAmount;

    /* renamed from: disclosureTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 disclosureTxt;

    /* renamed from: editAmountBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 editAmountBtn;

    /* renamed from: employer$delegate, reason: from kotlin metadata */
    private final Lazy employer;
    public EventLogger eventLogger;

    /* renamed from: signBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 signBtn;
    public UserStore userStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PreFilledFormReviewFragment.class, "accountInfoView", "getAccountInfoView()Lcom/robinhood/android/directdeposit/ui/accountinfo/DirectDepositAccountInfoView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormReviewFragment.class, "disclosureTxt", "getDisclosureTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormReviewFragment.class, "signBtn", "getSignBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormReviewFragment.class, "editAmountBtn", "getEditAmountBtn()Landroid/widget/Button;", 0)), Reflection.property1(new PropertyReference1Impl(PreFilledFormReviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PreFilledFormReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment$Callbacks;", "", "onSignForm", "", "onDepositAmountEditRequested", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDepositAmountEditRequested();

        void onSignForm();
    }

    public PreFilledFormReviewFragment() {
        super(C14044R.layout.fragment_pre_filled_form_review);
        this.accountInfoView = bindView(C14044R.id.pre_filled_form_review_account_info);
        this.disclosureTxt = bindView(C14044R.id.pre_filled_form_review_disclosure);
        this.signBtn = bindView(C14044R.id.pre_filled_form_review_sign_form);
        this.editAmountBtn = bindView(C14044R.id.pre_filled_form_review_edit_amount);
        this.employer = Fragments2.argument(this, ARG_EMPLOYER);
        this.depositAmount = Fragments2.argument(this, "depositAmount");
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormReviewFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final AccountRoutingDetailsStore getAccountRoutingDetailsStore() {
        AccountRoutingDetailsStore accountRoutingDetailsStore = this.accountRoutingDetailsStore;
        if (accountRoutingDetailsStore != null) {
            return accountRoutingDetailsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountRoutingDetailsStore");
        return null;
    }

    public final void setAccountRoutingDetailsStore(AccountRoutingDetailsStore accountRoutingDetailsStore) {
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "<set-?>");
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
    }

    public final UserStore getUserStore() {
        UserStore userStore = this.userStore;
        if (userStore != null) {
            return userStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userStore");
        return null;
    }

    public final void setUserStore(UserStore userStore) {
        Intrinsics.checkNotNullParameter(userStore, "<set-?>");
        this.userStore = userStore;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final DirectDepositAccountInfoView getAccountInfoView() {
        return (DirectDepositAccountInfoView) this.accountInfoView.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getDisclosureTxt() {
        return (RhTextView) this.disclosureTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final Button getSignBtn() {
        return (Button) this.signBtn.getValue(this, $$delegatedProperties[2]);
    }

    private final Button getEditAmountBtn() {
        return (Button) this.editAmountBtn.getValue(this, $$delegatedProperties[3]);
    }

    private final String getEmployer() {
        return (String) this.employer.getValue();
    }

    private final DirectDepositAmount getDepositAmount() {
        return (DirectDepositAmount) this.depositAmount.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[4]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getAccountInfoView().setEmployer(getEmployer());
        getAccountInfoView().setSignatureVisible(false);
        DirectDepositAccountInfoView accountInfoView = getAccountInfoView();
        DirectDepositAmount depositAmount = getDepositAmount();
        DirectDepositAmount.Unsupported unsupported = DirectDepositAmount.Unsupported.INSTANCE;
        accountInfoView.setAmountVisible(!Intrinsics.areEqual(depositAmount, unsupported));
        DirectDepositAccountInfoView accountInfoView2 = getAccountInfoView();
        DirectDepositAmount depositAmount2 = getDepositAmount();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        accountInfoView2.setAmount(ExtensionsKt.getText(depositAmount2, resources));
        if (!Intrinsics.areEqual(getDepositAmount(), unsupported)) {
            getEditAmountBtn().setVisibility(0);
            OnClickListeners.onClick(getEditAmountBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormReviewFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PreFilledFormReviewFragment.onViewCreated$lambda$0(this.f$0);
                }
            });
        }
        OnClickListeners.onClick(getSignBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormReviewFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreFilledFormReviewFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PreFilledFormReviewFragment preFilledFormReviewFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormReviewFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_PARTIAL_PAYCHECK, new Screen(Screen.Name.DD_UNSIGNED_FORM, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormReviewFragment.getCallbacks().onDepositAmountEditRequested();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(PreFilledFormReviewFragment preFilledFormReviewFragment) {
        EventLogger.DefaultImpls.logTap$default(preFilledFormReviewFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_SIGNATURE, new Screen(Screen.Name.DD_UNSIGNED_FORM, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        preFilledFormReviewFragment.getCallbacks().onSignForm();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_UNSIGNED_FORM, null, null, null, 14, null), null, null, null, 29, null);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getAccountRoutingDetailsStore().fetchSpendingOrCashManagementRoutingDetails()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormReviewFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormReviewFragment.onStart$lambda$2(this.f$0, (AccountRoutingDetailsStore.RoutingDetails) obj);
            }
        }, getActivityErrorHandler());
        UserStore.refresh$default(getUserStore(), false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getUserStore().getUser()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.PreFilledFormReviewFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormReviewFragment.onStart$lambda$3(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(PreFilledFormReviewFragment preFilledFormReviewFragment, AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
        preFilledFormReviewFragment.getAccountInfoView().setRoutingNumber(routingDetails.getRoutingNumber());
        preFilledFormReviewFragment.getAccountInfoView().setAccountNumber(routingDetails.getAccountNumber());
        preFilledFormReviewFragment.getAccountInfoView().setBankName(routingDetails.getBankName());
        RhTextView disclosureTxt = preFilledFormReviewFragment.getDisclosureTxt();
        StringResource directDepositDisclosureText = AccountInfoViewState2.getDirectDepositDisclosureText(routingDetails);
        Resources resources = preFilledFormReviewFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        disclosureTxt.setText(directDepositDisclosureText.getText(resources));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(PreFilledFormReviewFragment preFilledFormReviewFragment, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        preFilledFormReviewFragment.getAccountInfoView().setName(user.getFullName());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.directdeposit.ui.prefilled.partial.EditDepositAmountActivity.OnEditListener
    public void onDepositAmountEdited(DirectDepositAmount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        DirectDepositAccountInfoView accountInfoView = getAccountInfoView();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        accountInfoView.setAmount(ExtensionsKt.getText(amount, resources));
    }

    /* compiled from: PreFilledFormReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment$Companion;", "", "<init>", "()V", "ARG_EMPLOYER", "", "ARG_DEPOSIT_AMOUNT", "newInstance", "Lcom/robinhood/android/directdeposit/ui/prefilled/PreFilledFormReviewFragment;", PreFilledFormReviewFragment.ARG_EMPLOYER, "depositAmount", "Lcom/robinhood/models/ui/DirectDepositAmount;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PreFilledFormReviewFragment newInstance(String employer, DirectDepositAmount depositAmount) {
            Intrinsics.checkNotNullParameter(employer, "employer");
            Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
            PreFilledFormReviewFragment preFilledFormReviewFragment = new PreFilledFormReviewFragment();
            Bundle bundle = new Bundle();
            bundle.putString(PreFilledFormReviewFragment.ARG_EMPLOYER, employer);
            bundle.putParcelable("depositAmount", depositAmount);
            preFilledFormReviewFragment.setArguments(bundle);
            return preFilledFormReviewFragment;
        }
    }
}
