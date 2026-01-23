package com.robinhood.android.directdeposit.p101ui.accountinfo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.databinding.BottomSheetAccountInfoBinding;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: AccountInfoBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\"\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u0017H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "getAccountRoutingDetailsStore", "()Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "setAccountRoutingDetailsStore", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;)V", "binding", "Lcom/robinhood/android/directdeposit/databinding/BottomSheetAccountInfoBinding;", "getBinding", "()Lcom/robinhood/android/directdeposit/databinding/BottomSheetAccountInfoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "dialogId", "", "getDialogId", "()I", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindRowValue", "row", "Lcom/robinhood/android/designsystem/row/RdsSettingsRowView;", "value", "", "labelResId", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class AccountInfoBottomSheetFragment extends BaseBottomSheetDialogFragment {
    public AccountRoutingDetailsStore accountRoutingDetailsStore;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final int dialogId;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountInfoBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/directdeposit/databinding/BottomSheetAccountInfoBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AccountInfoBottomSheetFragment() {
        super(C14044R.layout.bottom_sheet_account_info);
        this.binding = ViewBinding5.viewBinding(this, AccountInfoBottomSheetFragment2.INSTANCE);
        this.dialogId = C14044R.id.dialog_direct_deposit_account_info_bottom_sheet;
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

    private final BottomSheetAccountInfoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BottomSheetAccountInfoBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment
    public int getDialogId() {
        return this.dialogId;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton rdsButton = getBinding().accountInfoPrimaryBtn;
        if (((LegacyDialogFragmentKey.RhyAccountInformation) INSTANCE.getArgs((Fragment) this)).getShowContinueButtonInstead()) {
            i = C11048R.string.general_label_continue;
        } else {
            i = C11048R.string.general_label_close;
        }
        rdsButton.setText(i);
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountInfoBottomSheetFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(AccountInfoBottomSheetFragment accountInfoBottomSheetFragment) {
        if (((LegacyDialogFragmentKey.RhyAccountInformation) INSTANCE.getArgs((Fragment) accountInfoBottomSheetFragment)).getShowContinueButtonInstead()) {
            accountInfoBottomSheetFragment.requireActivity().finish();
        } else {
            accountInfoBottomSheetFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.DD_ACCOUNT_INFO, null, null, null, 14, null), null, null, null, 29, null);
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getAccountRoutingDetailsStore().fetchSpendingOrCashManagementRoutingDetails()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountInfoBottomSheetFragment.onStart$lambda$4(this.f$0, (AccountRoutingDetailsStore.RoutingDetails) obj);
            }
        }, Fragments2.getActivityErrorHandler(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(AccountInfoBottomSheetFragment accountInfoBottomSheetFragment, AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
        String routingNumber = routingDetails.getRoutingNumber();
        String accountNumber = routingDetails.getAccountNumber();
        BottomSheetAccountInfoBinding binding = accountInfoBottomSheetFragment.getBinding();
        RdsSettingsRowView accountInfoRoutingNumberRow = binding.accountInfoRoutingNumberRow;
        Intrinsics.checkNotNullExpressionValue(accountInfoRoutingNumberRow, "accountInfoRoutingNumberRow");
        accountInfoBottomSheetFragment.bindRowValue(accountInfoRoutingNumberRow, routingNumber, C14044R.string.account_info_routing_number);
        RdsSettingsRowView accountInfoAccountNumberRow = binding.accountInfoAccountNumberRow;
        Intrinsics.checkNotNullExpressionValue(accountInfoAccountNumberRow, "accountInfoAccountNumberRow");
        accountInfoBottomSheetFragment.bindRowValue(accountInfoAccountNumberRow, accountNumber, C14044R.string.account_info_account_number);
        RhTextView rhTextView = binding.accountInfoDisclosure;
        String string2 = accountInfoBottomSheetFragment.getString(C14044R.string.direct_deposit_account_info_disclosure, routingDetails.getFullBankName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        rhTextView.setText(StringsKt.replace$default(string2, "..", ".", false, 4, (Object) null));
        return Unit.INSTANCE;
    }

    private final void bindRowValue(RdsSettingsRowView row, final String value, final int labelResId) {
        row.setValueText(value);
        OnClickListeners.onClick(row, new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountInfoBottomSheetFragment.bindRowValue$lambda$5(value, this, labelResId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRowValue$lambda$5(String str, AccountInfoBottomSheetFragment accountInfoBottomSheetFragment, int i) throws Resources.NotFoundException {
        ClipboardUtil clipboardUtil = ClipboardUtil.INSTANCE;
        if (str == null) {
            str = "";
        }
        String string2 = accountInfoBottomSheetFragment.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        View viewRequireView = accountInfoBottomSheetFragment.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, str, string2, viewRequireView, false, 8, null);
        return Unit.INSTANCE;
    }

    /* compiled from: AccountInfoBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RhyAccountInformation;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<AccountInfoBottomSheetFragment, LegacyDialogFragmentKey.RhyAccountInformation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public AccountInfoBottomSheetFragment createDialogFragment(LegacyDialogFragmentKey.RhyAccountInformation rhyAccountInformation) {
            return (AccountInfoBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, rhyAccountInformation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.RhyAccountInformation getArgs(AccountInfoBottomSheetFragment accountInfoBottomSheetFragment) {
            return (LegacyDialogFragmentKey.RhyAccountInformation) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountInfoBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountInfoBottomSheetFragment newInstance(LegacyDialogFragmentKey.RhyAccountInformation rhyAccountInformation) {
            return (AccountInfoBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhyAccountInformation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountInfoBottomSheetFragment accountInfoBottomSheetFragment, LegacyDialogFragmentKey.RhyAccountInformation rhyAccountInformation) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountInfoBottomSheetFragment, rhyAccountInformation);
        }
    }
}
