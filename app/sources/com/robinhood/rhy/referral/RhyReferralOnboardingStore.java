package com.robinhood.rhy.referral;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.RhyApplicationStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralOnboardingStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rhy/referral/RhyReferralOnboardingStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyApplicationStore", "Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/RhyApplicationStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/store/StoreBundle;)V", "getPostAuthOutAction", "Lio/reactivex/Observable;", "Lcom/robinhood/rhy/referral/RhyReferralOutAction;", "referralCode", "", "lib-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RhyReferralOnboardingStore extends Store {
    private final AccountProvider accountProvider;
    private final RhyAccountStore rhyAccountStore;
    private final RhyApplicationStore rhyApplicationStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralOnboardingStore(AccountProvider accountProvider, RhyApplicationStore rhyApplicationStore, RhyAccountStore rhyAccountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyApplicationStore, "rhyApplicationStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.rhyApplicationStore = rhyApplicationStore;
        this.rhyAccountStore = rhyAccountStore;
    }

    public final Observable<RhyReferralOnboardingStore4> getPostAuthOutAction(final String referralCode) {
        this.accountProvider.refresh(false);
        this.rhyAccountStore.refresh(true);
        ObservableSource map = this.accountProvider.streamIndividualAccountOptional().map(new Function() { // from class: com.robinhood.rhy.referral.RhyReferralOnboardingStore$getPostAuthOutAction$cashManagementEnabledSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Optional<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Account orNull = it.getOrNull();
                boolean z = false;
                if (orNull != null && orNull.getCashManagementEnabled()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        Observable observable = this.rhyAccountStore.forceFetchAccountIfNotCached().onErrorReturnItem(Optional2.INSTANCE).map(new Function() { // from class: com.robinhood.rhy.referral.RhyReferralOnboardingStore$getPostAuthOutAction$hasRhyAccountSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Optional<RhyAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof Some);
            }
        }).toObservable();
        Observable<Boolean> observable2 = this.rhyApplicationStore.getEligibility().onErrorReturnItem(Boolean.FALSE).toObservable();
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(map);
        Intrinsics.checkNotNull(observable);
        Intrinsics.checkNotNull(observable2);
        Observable<RhyReferralOnboardingStore4> map2 = observables.zip(map, observable, observable2).map(new Function() { // from class: com.robinhood.rhy.referral.RhyReferralOnboardingStore.getPostAuthOutAction.1
            @Override // io.reactivex.functions.Function
            public final RhyReferralOnboardingStore4 apply(Tuples3<Boolean, Boolean, Boolean> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                Boolean boolComponent1 = tuples3.component1();
                Boolean boolComponent2 = tuples3.component2();
                Boolean boolComponent3 = tuples3.component3();
                return boolComponent2.booleanValue() ? RhyReferralOnboardingStore4.Dialog.ExistingRhyUser.INSTANCE : (boolComponent1.booleanValue() && boolComponent3.booleanValue()) ? RhyReferralOnboardingStore4.Dialog.ExistingCmUser.INSTANCE : boolComponent3.booleanValue() ? new RhyReferralOnboardingStore4.Direct.RhyEligibleUser(referralCode) : RhyReferralOnboardingStore4.Dialog.RhyIneligible.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }
}
