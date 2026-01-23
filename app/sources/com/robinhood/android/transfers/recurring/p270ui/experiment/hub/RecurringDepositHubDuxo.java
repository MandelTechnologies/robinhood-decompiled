package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import android.content.Context;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.remote.assets.LottieUrl;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: RecurringDepositHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "context", "Landroid/content/Context;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubStateProvider;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Landroid/content/Context;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubStateProvider;)V", "onResume", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringDepositHubDuxo extends BaseDuxo<RecurringDepositHubDataState, RecurringDepositHubViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AutomaticDepositStore automaticDepositStore;
    private final Context context;
    private final GoldSubscriptionStore goldSubscriptionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositHubDuxo(AccountProvider accountProvider, AutomaticDepositStore automaticDepositStore, GoldSubscriptionStore goldSubscriptionStore, Context context, DuxoBundle duxoBundle, RecurringDepositHubStateProvider stateProvider) {
        super(new RecurringDepositHubDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.automaticDepositStore = automaticDepositStore;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.context = context;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.automaticDepositStore.getAutomaticDeposits(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringDepositHubDuxo.onResume$lambda$0(this.f$0, (List) obj);
            }
        });
        Observable<R> map = this.accountProvider.streamAllAccounts().map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final Map<String, Account> apply(List<Account> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<Account> list = accounts2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (T t : list) {
                    linkedHashMap.put(((Account) t).getAccountNumberRhs(), t);
                }
                return linkedHashMap;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringDepositHubDuxo.onResume$lambda$1(this.f$0, (Map) obj);
            }
        });
        Observable<GoldSubscriptionStore.GoldSubscriptionState> observableDistinctUntilChanged = this.goldSubscriptionStore.streamGoldSubscriptionState().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.hub.RecurringDepositHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringDepositHubDuxo.onResume$lambda$2(this.f$0, (GoldSubscriptionStore.GoldSubscriptionState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(RecurringDepositHubDuxo recurringDepositHubDuxo, List automaticDeposits) {
        Intrinsics.checkNotNullParameter(automaticDeposits, "automaticDeposits");
        recurringDepositHubDuxo.applyMutation(new RecurringDepositHubDuxo2(automaticDeposits, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(RecurringDepositHubDuxo recurringDepositHubDuxo, Map map) {
        recurringDepositHubDuxo.applyMutation(new RecurringDepositHubDuxo3(map, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(RecurringDepositHubDuxo recurringDepositHubDuxo, GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState) {
        if (goldSubscriptionState == GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD) {
            LottieUrl.TRANSFER_IDLE_CASH_YG_LIGHT.prefetch(recurringDepositHubDuxo.context);
            LottieUrl.TRANSFER_IDLE_CASH_YG_DARK.prefetch(recurringDepositHubDuxo.context);
        } else {
            LottieUrl.TRANSFER_IDLE_CASH_NG_LIGHT.prefetch(recurringDepositHubDuxo.context);
            LottieUrl.TRANSFER_IDLE_CASH_NG_DARK.prefetch(recurringDepositHubDuxo.context);
        }
        return Unit.INSTANCE;
    }
}
