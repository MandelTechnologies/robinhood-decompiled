package com.robinhood.android.transfers.international.p266ui.currencyselection;

import com.robinhood.android.transfers.international.p266ui.currencyselection.DepositCurrencyDuxo3;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositCurrencyDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyDataState;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyViewState;", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyEvent;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/transfers/international/ui/currencyselection/DepositCurrencyStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "selectCurrency", "currency", "Ljava/util/Currency;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DepositCurrencyDuxo extends BaseDuxo3<DepositCurrencyDataState, DepositCurrencyViewState, DepositCurrencyDuxo3> {
    public static final int $stable = 8;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositCurrencyDuxo(UserStore userStore, DepositCurrencyStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new DepositCurrencyDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        UserStore.refresh$default(this.userStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.international.ui.currencyselection.DepositCurrencyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositCurrencyDuxo.onStart$lambda$0(this.f$0, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DepositCurrencyDuxo depositCurrencyDuxo, User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        depositCurrencyDuxo.applyMutation(new DepositCurrencyDuxo2(it, null));
        return Unit.INSTANCE;
    }

    public final void selectCurrency(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        submit(new DepositCurrencyDuxo3.CurrencySelected(currency));
    }
}
