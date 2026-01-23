package com.robinhood.android.deeplink.targets.cash;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.compose.ComponentActivity6;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.deeplink.targets.cash.CashManagementAction;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.store.MinervaHistoryStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: CashManagementDeepLinkActivity.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*H\u0002¢\u0006\u0002\u0010+J\u0012\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u001b\u0010/\u001a\u00020#2\f\u00100\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0002\u00101J\u0012\u00102\u001a\u00020(2\b\u00103\u001a\u0004\u0018\u00010.H\u0002J\n\u00104\u001a\u0004\u0018\u00010(H\u0002J\n\u00105\u001a\u0004\u0018\u00010(H\u0002J\u0012\u00106\u001a\u0004\u0018\u00010(2\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020(H\u0002J\u0012\u0010:\u001a\u00020(2\b\u0010;\u001a\u0004\u0018\u00010.H\u0002J\n\u0010<\u001a\u0004\u0018\u00010=H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementDeepLinkActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "getMinervaAccountStore", "()Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "setMinervaAccountStore", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;)V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "minervaHistoryStore", "Lcom/robinhood/librobinhood/store/MinervaHistoryStore;", "getMinervaHistoryStore", "()Lcom/robinhood/librobinhood/store/MinervaHistoryStore;", "setMinervaHistoryStore", "(Lcom/robinhood/librobinhood/store/MinervaHistoryStore;)V", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "getPaymentCardStore", "()Lcom/robinhood/librobinhood/store/PaymentCardStore;", "setPaymentCardStore", "(Lcom/robinhood/librobinhood/store/PaymentCardStore;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getActualActivityIntent", "", "Landroid/content/Intent;", CashManagementDeepLinkActivity.EXTRA_ACTION, "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "(Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;)[Landroid/content/Intent;", "intentForCheckHistory", "checkId", "Ljava/util/UUID;", "start", "intents", "([Landroid/content/Intent;)V", "intentForHistory", "itemId", "intentForActivation", "intentForChangeCardPin", "intentForCardHelp", "launchMode", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CardHelp$LaunchMode;", "intentForCardRestrictedSupport", "intentForCreateDispute", "transactionId", "refreshAndRetrieveCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "Companion", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CashManagementDeepLinkActivity extends BaseActivity {
    private static final String EXTRA_ACTION = "action";
    public AccountProvider accountProvider;
    public HistoryNavigator historyNavigator;
    public MinervaAccountStore minervaAccountStore;
    public MinervaHistoryStore minervaHistoryStore;
    public PaymentCardStore paymentCardStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final MinervaAccountStore getMinervaAccountStore() {
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore;
        if (minervaAccountStore != null) {
            return minervaAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("minervaAccountStore");
        return null;
    }

    public final void setMinervaAccountStore(MinervaAccountStore minervaAccountStore) {
        Intrinsics.checkNotNullParameter(minervaAccountStore, "<set-?>");
        this.minervaAccountStore = minervaAccountStore;
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

    public final MinervaHistoryStore getMinervaHistoryStore() {
        MinervaHistoryStore minervaHistoryStore = this.minervaHistoryStore;
        if (minervaHistoryStore != null) {
            return minervaHistoryStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("minervaHistoryStore");
        return null;
    }

    public final void setMinervaHistoryStore(MinervaHistoryStore minervaHistoryStore) {
        Intrinsics.checkNotNullParameter(minervaHistoryStore, "<set-?>");
        this.minervaHistoryStore = minervaHistoryStore;
    }

    public final PaymentCardStore getPaymentCardStore() {
        PaymentCardStore paymentCardStore = this.paymentCardStore;
        if (paymentCardStore != null) {
            return paymentCardStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentCardStore");
        return null;
    }

    public final void setPaymentCardStore(PaymentCardStore paymentCardStore) {
        Intrinsics.checkNotNullParameter(paymentCardStore, "<set-?>");
        this.paymentCardStore = paymentCardStore;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        ComponentActivity6.setContent$default(this, null, CashManagementDeepLinkActivity2.INSTANCE.getLambda$1597035231$lib_deeplink_targets_externalDebug(), 1, null);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 34) {
            obj = (Parcelable) intent.getParcelableExtra(EXTRA_ACTION, CashManagementAction.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra(EXTRA_ACTION);
            if (!(parcelableExtra instanceof CashManagementAction)) {
                parcelableExtra = null;
            }
            obj = (CashManagementAction) parcelableExtra;
        }
        Intrinsics.checkNotNull(obj);
        Single singleSubscribeOn = Single.just((CashManagementAction) obj).map(new Function() { // from class: com.robinhood.android.deeplink.targets.cash.CashManagementDeepLinkActivity.onCreate.1
            @Override // io.reactivex.functions.Function
            public final Intent[] apply(CashManagementAction it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CashManagementDeepLinkActivity.this.getActualActivityIntent(it);
            }
        }).subscribeOn(Schedulers.computation());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleSubscribeOn), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.deeplink.targets.cash.CashManagementDeepLinkActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CashManagementDeepLinkActivity.onCreate$lambda$0(this.f$0, (Intent[]) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CashManagementDeepLinkActivity cashManagementDeepLinkActivity, Intent[] intentArr) {
        Intrinsics.checkNotNull(intentArr);
        cashManagementDeepLinkActivity.start(intentArr);
        cashManagementDeepLinkActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final Intent[] getActualActivityIntent(CashManagementAction action) {
        ?? r1;
        Intent intent;
        Navigator navigator = getNavigator();
        String source = action.getSource();
        boolean z = action instanceof CashManagementAction.CardActions;
        Intent intentIntentForCreateDispute = null;
        CashManagementAction.Home home = action instanceof CashManagementAction.Home ? (CashManagementAction.Home) action : null;
        TabLinkIntentKey.McDuckling mcDuckling = new TabLinkIntentKey.McDuckling(source, z, home != null ? home.getScrollTo() : null);
        CashManagementDeepLinkActivity cashManagementDeepLinkActivity = this;
        Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, cashManagementDeepLinkActivity, mcDuckling, null, false, 12, null);
        try {
            try {
                if (action instanceof CashManagementAction.Home) {
                    intent = intentCreateIntent$default;
                } else if (action instanceof CashManagementAction.History) {
                    intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForHistory(((CashManagementAction.History) action).getItemId());
                    intent = intentCreateIntent$default;
                } else if (action instanceof CashManagementAction.Transaction) {
                    try {
                        Navigator navigator2 = cashManagementDeepLinkActivity.getNavigator();
                        FragmentKey fragmentKeyResolve$default = HistoryNavigator.resolve$default(cashManagementDeepLinkActivity.getHistoryNavigator(), ((CashManagementAction.Transaction) action).getReference(), false, true, 2, null);
                        intent = intentCreateIntent$default;
                        intentIntentForCreateDispute = Navigator.DefaultImpls.createIntentForFragment$default(navigator2, cashManagementDeepLinkActivity, fragmentKeyResolve$default, false, false, false, null, false, false, false, false, false, null, false, 8188, null);
                    } catch (Exception e) {
                        e = e;
                        r1 = intentCreateIntent$default;
                        Timber.INSTANCE.mo3351d(e);
                        return new Intent[]{r1};
                    }
                } else {
                    intent = intentCreateIntent$default;
                    if (action instanceof CashManagementAction.CardActivation) {
                        intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForActivation();
                    } else if (action instanceof CashManagementAction.ChangePin) {
                        intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForChangeCardPin();
                    } else if (!(action instanceof CashManagementAction.CardActions)) {
                        if (action instanceof CashManagementAction.ReportDamaged) {
                            intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForCardHelp(LegacyIntentKey.CardHelp.LaunchMode.REPORT_DAMAGED);
                        } else if (action instanceof CashManagementAction.ReportLost) {
                            intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForCardHelp(LegacyIntentKey.CardHelp.LaunchMode.REPORT_LOST);
                        } else if (action instanceof CashManagementAction.ReportStolen) {
                            intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForCardHelp(LegacyIntentKey.CardHelp.LaunchMode.REPORT_STOLEN);
                        } else if (action instanceof CashManagementAction.CardRestrictedSupport) {
                            intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForCardRestrictedSupport();
                        } else if (action instanceof CashManagementAction.CheckHistory) {
                            intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForCheckHistory(((CashManagementAction.CheckHistory) action).getCheckId());
                        } else {
                            if (!(action instanceof CashManagementAction.CreateDispute)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            intentIntentForCreateDispute = cashManagementDeepLinkActivity.intentForCreateDispute(((CashManagementAction.CreateDispute) action).getTransactionId());
                        }
                    }
                }
                if (intentIntentForCreateDispute == null) {
                    return new Intent[]{intent};
                }
                return new Intent[]{intent, intentIntentForCreateDispute};
            } catch (Exception e2) {
                e = e2;
                r1 = cashManagementDeepLinkActivity;
            }
        } catch (Exception e3) {
            e = e3;
            r1 = intentCreateIntent$default;
        }
    }

    private final Intent intentForCheckHistory(UUID checkId) {
        if (checkId == null) {
            return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.CHECK_PAYMENTS, null, null, false, FragmentTab.CURRENT_TAB, 29, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        }
        return Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.CheckPaymentDetail(checkId), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, 12, null);
    }

    private final void start(Intent[] intents) {
        ((Intent) ArraysKt.first(intents)).addFlags(335544320);
        startActivities(intents);
    }

    private final Intent intentForHistory(UUID itemId) {
        if (itemId == null) {
            return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new AccountsHistoryContract.Key(null, null, null, null, false, null, 63, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        }
        try {
            getMinervaHistoryStore().refresh(itemId);
            return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, HistoryNavigator.resolve$default(getHistoryNavigator(), getMinervaHistoryStore().streamItem(itemId).take(1L).timeout(1000L, TimeUnit.MILLISECONDS).blockingFirst().getTransactionReference(), false, true, 2, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        } catch (Exception unused) {
            return Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, new AccountsHistoryContract.Key(null, null, null, null, false, null, 63, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
        }
    }

    private final Intent intentForActivation() {
        PaymentCard paymentCardRefreshAndRetrieveCard = refreshAndRetrieveCard();
        if (paymentCardRefreshAndRetrieveCard == null) {
            return null;
        }
        return Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new LegacyIntentKey.ActivateCard(paymentCardRefreshAndRetrieveCard.getId()), null, false, 12, null);
    }

    private final Intent intentForChangeCardPin() {
        PaymentCard paymentCardRefreshAndRetrieveCard = refreshAndRetrieveCard();
        if (paymentCardRefreshAndRetrieveCard == null) {
            return null;
        }
        return Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new LegacyIntentKey.ChangeCardPin(paymentCardRefreshAndRetrieveCard.getId(), paymentCardRefreshAndRetrieveCard.isVirtual(), LegacyIntentKey.ChangeCardPin.Action.CHANGE_PIN), null, false, 12, null);
    }

    private final Intent intentForCardHelp(LegacyIntentKey.CardHelp.LaunchMode launchMode) {
        PaymentCard paymentCardRefreshAndRetrieveCard = refreshAndRetrieveCard();
        if (paymentCardRefreshAndRetrieveCard == null) {
            return null;
        }
        return Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new LegacyIntentKey.CardHelp(paymentCardRefreshAndRetrieveCard.getId(), launchMode, null, 4, null), null, false, 12, null);
    }

    private final Intent intentForCardRestrictedSupport() {
        return Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(LegacyFragmentKey.CardRestrictedSupport.INSTANCE, false, false, true, false, false, false, 118, null), null, false, 12, null);
    }

    private final Intent intentForCreateDispute(UUID transactionId) {
        return Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new LegacyIntentKey.DisputeCreation(transactionId), null, false, 12, null);
    }

    private final PaymentCard refreshAndRetrieveCard() {
        MinervaAccountStore.refresh$default(getMinervaAccountStore(), false, 1, null);
        PaymentCardStore.refresh$default(getPaymentCardStore(), false, 1, null);
        Observable<R> map = getMinervaAccountStore().streamAccounts().map(new Function() { // from class: com.robinhood.android.deeplink.targets.cash.CashManagementDeepLinkActivity$refreshAndRetrieveCard$$inlined$mapNotNull$1
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                T next;
                Intrinsics.checkNotNullParameter(it, "it");
                Iterator<T> it2 = ((List) it).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it2.next();
                    if (((MinervaAccount) next).getEnrollmentState() == ApiMinervaAccount.EnrollmentState.UPGRADED) {
                        break;
                    }
                }
                return Optional3.asOptional(next);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C13988xa0e464e5<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable map2 = ObservablesKt.filterIsPresent(map).map(new Function() { // from class: com.robinhood.android.deeplink.targets.cash.CashManagementDeepLinkActivity$refreshAndRetrieveCard$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((MinervaAccount) it).getDefaultCardId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C13989xa0e464e6<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable map3 = ObservablesKt.filterIsPresent(map2).switchMap(new Function() { // from class: com.robinhood.android.deeplink.targets.cash.CashManagementDeepLinkActivity.refreshAndRetrieveCard.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends PaymentCard> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CashManagementDeepLinkActivity.this.getPaymentCardStore().streamCard(it);
            }
        }).map(new Function() { // from class: com.robinhood.android.deeplink.targets.cash.CashManagementDeepLinkActivity.refreshAndRetrieveCard.4
            @Override // io.reactivex.functions.Function
            public final Optional<PaymentCard> apply(PaymentCard it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (PaymentCard) ((Optional) map3.timeout(500L, timeUnit, Observable.just(Optional2.INSTANCE)).take(1L).timeout(1000L, timeUnit).blockingFirst()).getOrNull();
    }

    /* compiled from: CashManagementDeepLinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementDeepLinkActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$CashManagementDeepLink;", "<init>", "()V", "EXTRA_ACTION", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.CashManagementDeepLink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.CashManagementDeepLink key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) CashManagementDeepLinkActivity.class);
            intent.putExtra(CashManagementDeepLinkActivity.EXTRA_ACTION, key.getAction());
            return intent;
        }
    }
}
