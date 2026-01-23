package com.robinhood.android.directdeposit.p101ui.accountinfo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.accountinfo.AccountInfoFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AccountInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u000207H\u0016J\"\u0010=\u001a\u0002072\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020A2\u0006\u00108\u001a\u000209H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b&\u0010#R\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b)\u0010#R\u001b\u0010+\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b,\u0010#R\u001b\u0010.\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b/\u0010\u001eR\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001a\u001a\u0004\b3\u00104¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "fromDDOnboaringFlow", "", "getFromDDOnboaringFlow", "()Z", "fromDDOnboaringFlow$delegate", "callbacks", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "summaryTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getSummaryTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "summaryTxt$delegate", "nameRow", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getNameRow", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "nameRow$delegate", "bankNameRow", "getBankNameRow", "bankNameRow$delegate", "routingNumberRow", "getRoutingNumberRow", "routingNumberRow$delegate", "accountNumberRow", "getAccountNumberRow", "accountNumberRow$delegate", "disclosureTxt", "getDisclosureTxt", "disclosureTxt$delegate", "doneBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getDoneBtn", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "doneBtn$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "copyToClipboard", "text", "", "labelResId", "", "Callbacks", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class AccountInfoFragment extends BaseFragment {
    private static final String ARG_FROM_DD_ONBOARDING_FLOW = "fromDdOnboadingFlow";

    /* renamed from: accountNumberRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountNumberRow;

    /* renamed from: bankNameRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 bankNameRow;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: disclosureTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 disclosureTxt;

    /* renamed from: doneBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 doneBtn;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: fromDDOnboaringFlow$delegate, reason: from kotlin metadata */
    private final Lazy fromDDOnboaringFlow;

    /* renamed from: nameRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 nameRow;

    /* renamed from: routingNumberRow$delegate, reason: from kotlin metadata */
    private final Interfaces2 routingNumberRow;

    /* renamed from: summaryTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 summaryTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "summaryTxt", "getSummaryTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "nameRow", "getNameRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "bankNameRow", "getBankNameRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "routingNumberRow", "getRoutingNumberRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "accountNumberRow", "getAccountNumberRow()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "disclosureTxt", "getDisclosureTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(AccountInfoFragment.class, "doneBtn", "getDoneBtn()Lcom/robinhood/android/designsystem/button/RdsButton;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment$Callbacks;", "", "onDirectDepositCompleted", "", "source", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "onGetPreFilledForm", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDirectDepositCompleted(DirectDepositSource source);

        void onGetPreFilledForm();
    }

    public AccountInfoFragment() {
        super(C14044R.layout.fragment_direct_deposit_account_info);
        this.duxo = OldDuxos.oldDuxo(this, AccountInfoDuxo.class);
        this.fromDDOnboaringFlow = Fragments2.argument(this, ARG_FROM_DD_ONBOARDING_FLOW);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AccountInfoFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.summaryTxt = bindView(C14044R.id.direct_deposit_account_info_summary);
        this.nameRow = bindView(C14044R.id.direct_deposit_name_row);
        this.bankNameRow = bindView(C14044R.id.direct_deposit_bank_name_row);
        this.routingNumberRow = bindView(C14044R.id.direct_deposit_routing_number_row);
        this.accountNumberRow = bindView(C14044R.id.direct_deposit_account_number_row);
        this.disclosureTxt = bindView(C14044R.id.direct_deposit_account_info_bank_info_disclosure);
        this.doneBtn = bindView(C14044R.id.direct_deposit_account_info_done);
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

    private final AccountInfoDuxo getDuxo() {
        return (AccountInfoDuxo) this.duxo.getValue();
    }

    private final boolean getFromDDOnboaringFlow() {
        return ((Boolean) this.fromDDOnboaringFlow.getValue()).booleanValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getSummaryTxt() {
        return (RhTextView) this.summaryTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsDataRowView getNameRow() {
        return (RdsDataRowView) this.nameRow.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsDataRowView getBankNameRow() {
        return (RdsDataRowView) this.bankNameRow.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsDataRowView getRoutingNumberRow() {
        return (RdsDataRowView) this.routingNumberRow.getValue(this, $$delegatedProperties[4]);
    }

    private final RdsDataRowView getAccountNumberRow() {
        return (RdsDataRowView) this.accountNumberRow.getValue(this, $$delegatedProperties[5]);
    }

    private final RhTextView getDisclosureTxt() {
        return (RhTextView) this.disclosureTxt.getValue(this, $$delegatedProperties[6]);
    }

    private final RdsButton getDoneBtn() {
        return (RdsButton) this.doneBtn.getValue(this, $$delegatedProperties[7]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getDoneBtn().setText(getFromDDOnboaringFlow() ? C11048R.string.general_label_continue : C11048R.string.general_label_got_it);
        OnClickListeners.onClick(getDoneBtn(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountInfoFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AccountInfoFragment accountInfoFragment) {
        EventLogger.DefaultImpls.logTap$default(accountInfoFragment.getEventLogger(), UserInteractionEventData.Action.COMPLETE_DD_FLOW, new Screen(Screen.Name.DD_ACCOUNT_INFO, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        accountInfoFragment.getCallbacks().onDirectDepositCompleted(DirectDepositSource.MANUAL_ACCOUNT_ROUTING);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_ACCOUNT_INFO, null, null, null, 14, null), null, null, null, 29, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoFragment.onStart$lambda$3(this.f$0, (AccountInfoViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(final AccountInfoFragment accountInfoFragment, AccountInfoViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        StringResource directDepositDisclosureText;
        String bankName;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        RhTextView summaryTxt = accountInfoFragment.getSummaryTxt();
        StringResource summaryText = viewState.getSummaryText();
        if (summaryText != null) {
            Resources resources = accountInfoFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = summaryText.getText(resources);
        } else {
            text = null;
        }
        summaryTxt.setText(text);
        accountInfoFragment.getNameRow().setValueText(viewState.getFullName());
        AccountRoutingDetailsStore.RoutingDetails routingDetails = viewState.getRoutingDetails();
        if (routingDetails != null && (bankName = routingDetails.getBankName()) != null) {
            final RdsDataRowView bankNameRow = accountInfoFragment.getBankNameRow();
            new MutablePropertyReference0Impl(bankNameRow) { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment$onStart$1$2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((RdsDataRowView) this.receiver).getValueText();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((RdsDataRowView) this.receiver).setValueText((CharSequence) obj);
                }
            }.set(bankName);
        }
        RhTextView disclosureTxt = accountInfoFragment.getDisclosureTxt();
        AccountRoutingDetailsStore.RoutingDetails routingDetails2 = viewState.getRoutingDetails();
        if (routingDetails2 == null || (directDepositDisclosureText = AccountInfoViewState2.getDirectDepositDisclosureText(routingDetails2)) == null) {
            text2 = null;
        } else {
            Resources resources2 = accountInfoFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = directDepositDisclosureText.getText(resources2);
        }
        disclosureTxt.setText(text2);
        AccountRoutingDetailsStore.RoutingDetails routingDetails3 = viewState.getRoutingDetails();
        final String routingNumber = routingDetails3 != null ? routingDetails3.getRoutingNumber() : null;
        accountInfoFragment.getRoutingNumberRow().setValueText(routingNumber);
        OnClickListeners.onClick(accountInfoFragment.getRoutingNumberRow(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountInfoFragment.onStart$lambda$3$lambda$1(this.f$0, routingNumber);
            }
        });
        AccountRoutingDetailsStore.RoutingDetails routingDetails4 = viewState.getRoutingDetails();
        final String accountNumber = routingDetails4 != null ? routingDetails4.getAccountNumber() : null;
        accountInfoFragment.getAccountNumberRow().setValueText(accountNumber);
        OnClickListeners.onClick(accountInfoFragment.getAccountNumberRow(), new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountInfoFragment.onStart$lambda$3$lambda$2(this.f$0, accountNumber);
            }
        });
        ErrorHandlers.handleErrorEvent(accountInfoFragment.getActivityErrorHandler(), viewState.getRoutingDetailsError());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3$lambda$1(AccountInfoFragment accountInfoFragment, String str) throws Resources.NotFoundException {
        accountInfoFragment.copyToClipboard(str, C14044R.string.account_info_routing_number, accountInfoFragment.getRoutingNumberRow());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3$lambda$2(AccountInfoFragment accountInfoFragment, String str) throws Resources.NotFoundException {
        accountInfoFragment.copyToClipboard(str, C14044R.string.account_info_account_number, accountInfoFragment.getAccountNumberRow());
        return Unit.INSTANCE;
    }

    private final void copyToClipboard(String text, int labelResId, View view) throws Resources.NotFoundException {
        ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
        if (text == null) {
            text = "";
        }
        String string2 = getString(labelResId);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, text, string2, view, false, 8, null);
    }

    /* compiled from: AccountInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment$Companion;", "", "<init>", "()V", "ARG_FROM_DD_ONBOARDING_FLOW", "", "newInstance", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoFragment;", "fromDdOnboardingFlow", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AccountInfoFragment newInstance(boolean fromDdOnboardingFlow) {
            AccountInfoFragment accountInfoFragment = new AccountInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(AccountInfoFragment.ARG_FROM_DD_ONBOARDING_FLOW, fromDdOnboardingFlow);
            accountInfoFragment.setArguments(bundle);
            return accountInfoFragment;
        }
    }
}
