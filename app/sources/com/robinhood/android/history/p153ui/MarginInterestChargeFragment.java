package com.robinhood.android.history.p153ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentMarginInterestChargeDetailBinding;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.store.margin.MarginInterestChargeStore;
import com.robinhood.common.strings.C32428R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.MarginInterestCharge;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginInterestChargeFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u0018\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginInterestChargeFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/history/databinding/FragmentMarginInterestChargeDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentMarginInterestChargeDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "marginInterestChargeStore", "Lcom/robinhood/android/lib/store/margin/MarginInterestChargeStore;", "getMarginInterestChargeStore", "()Lcom/robinhood/android/lib/store/margin/MarginInterestChargeStore;", "setMarginInterestChargeStore", "(Lcom/robinhood/android/lib/store/margin/MarginInterestChargeStore;)V", MarginInterestChargeFragment.EXTRA_MARGIN_INTEREST_CHARGE_ID, "Ljava/util/UUID;", "getMarginInterestChargeId", "()Ljava/util/UUID;", "marginInterestChargeId$delegate", "Lkotlin/Lazy;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "refreshUi", "account", "Lcom/robinhood/models/db/Account;", "marginInterestCharge", "Lcom/robinhood/models/db/MarginInterestCharge;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class MarginInterestChargeFragment extends BaseDetailFragment {
    private static final String EXTRA_MARGIN_INTEREST_CHARGE_ID = "marginInterestChargeId";
    public AccountProvider accountProvider;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: marginInterestChargeId$delegate, reason: from kotlin metadata */
    private final Lazy marginInterestChargeId;
    public MarginInterestChargeStore marginInterestChargeStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginInterestChargeFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentMarginInterestChargeDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarginInterestChargeFragment() {
        super(C18359R.layout.fragment_margin_interest_charge_detail);
        this.binding = ViewBinding5.viewBinding(this, MarginInterestChargeFragment2.INSTANCE);
        this.marginInterestChargeId = Fragments2.argument(this, EXTRA_MARGIN_INTEREST_CHARGE_ID);
    }

    private final FragmentMarginInterestChargeDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMarginInterestChargeDetailBinding) value;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final MarginInterestChargeStore getMarginInterestChargeStore() {
        MarginInterestChargeStore marginInterestChargeStore = this.marginInterestChargeStore;
        if (marginInterestChargeStore != null) {
            return marginInterestChargeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginInterestChargeStore");
        return null;
    }

    public final void setMarginInterestChargeStore(MarginInterestChargeStore marginInterestChargeStore) {
        Intrinsics.checkNotNullParameter(marginInterestChargeStore, "<set-?>");
        this.marginInterestChargeStore = marginInterestChargeStore;
    }

    private final UUID getMarginInterestChargeId() {
        return (UUID) this.marginInterestChargeId.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = getMarginInterestChargeId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getExpandedToolbarTitleTxt().setText(C32428R.string.margin_interest_charge_label);
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<MarginInterestCharge> observableRefCount = getMarginInterestChargeStore().getMarginInterestCharge(getMarginInterestChargeId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        AccountProvider.DefaultImpls.refresh$default(getAccountProvider(), false, 1, null);
        ObservableSource observableSourceSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.history.ui.MarginInterestChargeFragment$onResume$accountObservable$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(MarginInterestCharge it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.getAccountProvider().streamAccount(it.getAccountNumber());
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableSourceSwitchMap);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observables.combineLatest(observableSourceSwitchMap, observableRefCount)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.MarginInterestChargeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginInterestChargeFragment.onResume$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(MarginInterestChargeFragment marginInterestChargeFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Account account = (Account) tuples2.component1();
        MarginInterestCharge marginInterestCharge = (MarginInterestCharge) tuples2.component2();
        Intrinsics.checkNotNull(account);
        Intrinsics.checkNotNull(marginInterestCharge);
        marginInterestChargeFragment.refreshUi(account, marginInterestCharge);
        return Unit.INSTANCE;
    }

    private final void refreshUi(Account account, MarginInterestCharge marginInterestCharge) {
        FragmentMarginInterestChargeDetailBinding binding = getBinding();
        RdsDataRowView rdsDataRowView = binding.marginInterestChargeAccount;
        StringResource title = AccountDisplayNames.getDisplayName(account).getWithAccount().getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsDataRowView.setValueText(title.getText(resources));
        binding.marginInterestChargePaymentDate.setValueText(LocalDateFormatter.MEDIUM.format(marginInterestCharge.getBillingDueDate()));
        LocalDateFormatter localDateFormatter = LocalDateFormatter.MEDIUM_NO_YEAR;
        binding.marginInterestChargeBillingCycle.setValueText(getString(C18359R.string.margin_interest_charge_billing_cycle, localDateFormatter.format(marginInterestCharge.getBillingStartDate()), localDateFormatter.format(marginInterestCharge.getBillingDueDate())));
        binding.marginInterestChargeAvgMargin.setValueText(Money.format$default(marginInterestCharge.getAverageAmountBorrowed(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        binding.marginInterestChargeYearlyInterestRate.setValueText(Formats.getPercentFormat().format(marginInterestCharge.getMarginInterestPercent()));
        binding.marginInterestChargeTotalInterest.setValueText(Money.Adjustment.format$default(marginInterestCharge.getAmount().plus(marginInterestCharge.getCredit()).toDebitAdjustment(), false, null, 3, null));
        boolean zIsZero = marginInterestCharge.getCredit().isZero();
        RdsDataRowView marginInterestChargeCredit = binding.marginInterestChargeCredit;
        Intrinsics.checkNotNullExpressionValue(marginInterestChargeCredit, "marginInterestChargeCredit");
        marginInterestChargeCredit.setVisibility(!zIsZero ? 0 : 8);
        RdsDataRowView marginInterestChargeTotalPaid = binding.marginInterestChargeTotalPaid;
        Intrinsics.checkNotNullExpressionValue(marginInterestChargeTotalPaid, "marginInterestChargeTotalPaid");
        marginInterestChargeTotalPaid.setVisibility(zIsZero ? 8 : 0);
        if (zIsZero) {
            return;
        }
        binding.marginInterestChargeCredit.setValueText(Money.format$default(marginInterestCharge.getCredit(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        binding.marginInterestChargeTotalPaid.setValueText(Money.Adjustment.format$default(marginInterestCharge.getAmount().toDebitAdjustment(), false, null, 3, null));
    }

    /* compiled from: MarginInterestChargeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/MarginInterestChargeFragment$Companion;", "", "<init>", "()V", "EXTRA_MARGIN_INTEREST_CHARGE_ID", "", "newInstance", "Lcom/robinhood/android/history/ui/MarginInterestChargeFragment;", MarginInterestChargeFragment.EXTRA_MARGIN_INTEREST_CHARGE_ID, "Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarginInterestChargeFragment newInstance(UUID marginInterestChargeId) {
            Intrinsics.checkNotNullParameter(marginInterestChargeId, "marginInterestChargeId");
            MarginInterestChargeFragment marginInterestChargeFragment = new MarginInterestChargeFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(MarginInterestChargeFragment.EXTRA_MARGIN_INTEREST_CHARGE_ID, marginInterestChargeId);
            marginInterestChargeFragment.setArguments(bundle);
            return marginInterestChargeFragment;
        }
    }
}
