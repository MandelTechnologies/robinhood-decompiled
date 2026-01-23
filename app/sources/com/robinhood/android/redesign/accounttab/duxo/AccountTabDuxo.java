package com.robinhood.android.redesign.accounttab.duxo;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.mcduckling.CashManagementAccessManager;
import com.robinhood.android.portfolio.privacy.PortfolioPrivacyPref;
import com.robinhood.android.redesign.accounttab.AccountTabType;
import com.robinhood.android.redesign.accounttab.C26320R;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCache;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabDeeplinkCoordinator;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.module.SeenNewExperiencePref;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.redesign.accounttab.provisions.ReferredDataPref2;
import com.robinhood.android.redesign.accounttab.store.AccountTabStore;
import com.robinhood.android.redesign.accounttab.utils.CombineFlows;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import dispatch.core.Flow7;
import dispatch.core.Launch;
import io.reactivex.Completable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: AccountTabDuxo.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bo\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020LH\u0016J\u0018\u0010N\u001a\u00020L2\u0006\u0010O\u001a\u00020PH\u0082@¢\u0006\u0004\bQ\u0010RJ\u000e\u0010S\u001a\u00020LH\u0082@¢\u0006\u0002\u0010TJ\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020 08H\u0002J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020 08H\u0002J\u000e\u0010W\u001a\u00020LH\u0082@¢\u0006\u0002\u0010TJ\u001e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y082\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0%H\u0002J\u0014\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0%08H\u0002J\u0019\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0%08H\u0001¢\u0006\u0002\b^J\u0010\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y08H\u0002J\u0010\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y08H\u0002J\u0010\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y08H\u0002J\u001e\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010c082\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0%H\u0002J\u0010\u0010d\u001a\u00020L2\b\u0010e\u001a\u0004\u0018\u00010,J\u000e\u0010f\u001a\u00020L2\u0006\u00101\u001a\u00020 J\u000e\u0010g\u001a\u00020L2\u0006\u0010h\u001a\u000205J\u000e\u0010i\u001a\u00020L2\u0006\u0010h\u001a\u000205J\u000e\u0010j\u001a\u00020L2\u0006\u0010k\u001a\u00020lJ\u0006\u0010m\u001a\u00020LJ\u0014\u0010n\u001a\u00020L2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020Y0%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R$\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&088\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010(\u001a\u0004\b:\u0010;R(\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%088\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010(\u001a\u0004\b>\u0010;R(\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%088\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010(\u001a\u0004\bA\u0010;R$\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&088\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010(\u001a\u0004\bD\u0010;R$\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&088\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010(\u001a\u0004\bG\u0010;R$\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&088\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010(\u001a\u0004\bJ\u0010;¨\u0006p"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountSelectorViewState;", "accountTabStore", "Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "cashManagementAccessManager", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "deeplinkCoordinator", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountTabOrderPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "seenNewExperiencePref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/redesign/accounttab/store/AccountTabStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/mcduckling/CashManagementAccessManager;Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabDeeplinkCoordinator;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "fundedPollingJob", "Lkotlinx/coroutines/Job;", "hasPortfolioPrivacy", "", "getHasPortfolioPrivacy", "()Z", "cachedBrokerageAccounts", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/models/db/Account;", "getCachedBrokerageAccounts$lib_account_tab_externalDebug$annotations", "()V", "getCachedBrokerageAccounts$lib_account_tab_externalDebug", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "lastSelectedTabId", "", "getLastSelectedTabId", "()Ljava/lang/String;", "setLastSelectedTabId", "(Ljava/lang/String;)V", "isCollapsed", "setCollapsed", "(Z)V", "currentNewUserExperienceStage", "Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "isFirstViewAfterFunding", "individualBrokerageAccount", "Lkotlinx/coroutines/flow/Flow;", "getIndividualBrokerageAccount$lib_account_tab_externalDebug$annotations", "getIndividualBrokerageAccount$lib_account_tab_externalDebug", "()Lkotlinx/coroutines/flow/Flow;", "allOtherIndividualAccounts", "getAllOtherIndividualAccounts$lib_account_tab_externalDebug$annotations", "getAllOtherIndividualAccounts$lib_account_tab_externalDebug", "managedAccounts", "getManagedAccounts$lib_account_tab_externalDebug$annotations", "getManagedAccounts$lib_account_tab_externalDebug", "selfDirectedIraBrokerageAccount", "getSelfDirectedIraBrokerageAccount$lib_account_tab_externalDebug$annotations", "getSelfDirectedIraBrokerageAccount$lib_account_tab_externalDebug", "selfDirectedRothBrokerageAccount", "getSelfDirectedRothBrokerageAccount$lib_account_tab_externalDebug$annotations", "getSelfDirectedRothBrokerageAccount$lib_account_tab_externalDebug", "selfDirectedJointBrokerageAccount", "getSelfDirectedJointBrokerageAccount$lib_account_tab_externalDebug$annotations", "getSelfDirectedJointBrokerageAccount$lib_account_tab_externalDebug", "onResume", "", "onCreate", "pollForNewAccounts", "pollingInterval", "Lkotlin/time/Duration;", "pollForNewAccounts-VtjQ1oo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamPortfolioPrivacy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamUserConsideredInvested", "streamIsFunded", "streamEligibleForNewUserPrompt", "streamIndividualAccountDetails", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "pendingAccounts", "Lcom/robinhood/models/home/HomeAccountSwitcher$Account;", "streamOtherIndividualAccountDetails", "streamManagedAccountDetails", "streamManagedAccountDetails$lib_account_tab_externalDebug", "streamIraAccountDetails", "streamRothIraAccountDetails", "streamSpendingAccountOrCreditCardWaitlistDetails", "streamJointAccountDetails", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "saveSelectedTabId", "id", "saveCollapsedState", "cacheNewUserExperienceStage", "stage", "saveNewUserExperienceStage", "enqueueSwitchTabDeeplinkRequest", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "clearPendingDeeplinkRequest", "onAccountTabsReordered", "newOrder", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountTabDuxo extends BaseDuxo<AccountTabDataState, AccountSelectorViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AccountSelectorHomeManager accountSelectorHomeManager;
    private final StringToLongMapPreference accountTabOrderPref;
    private final AccountTabStore accountTabStore;
    private final Flow<List<Account>> allOtherIndividualAccounts;
    private final StateFlow2<List<Account>> cachedBrokerageAccounts;
    private final CashManagementAccessManager cashManagementAccessManager;
    private NewUserExperienceStage currentNewUserExperienceStage;
    private Job fundedPollingJob;
    private final Flow<Account> individualBrokerageAccount;
    private boolean isCollapsed;
    private boolean isFirstViewAfterFunding;
    private String lastSelectedTabId;
    private final Flow<List<Account>> managedAccounts;
    private final BooleanPreference portfolioPrivacyPref;
    private final RhyAccountStore rhyAccountStore;
    private final BooleanPreference seenNewExperiencePref;
    private final Flow<Account> selfDirectedIraBrokerageAccount;
    private final Flow<Account> selfDirectedJointBrokerageAccount;
    private final Flow<Account> selfDirectedRothBrokerageAccount;
    private final BaseSortingHatStore sortingHatStore;
    private final UnifiedAccountStore unifiedAccountStore;

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo", m3645f = "AccountTabDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE}, m3647m = "streamEligibleForNewUserPrompt")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$1 */
    static final class C263501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C263501(Continuation<? super C263501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountTabDuxo.this.streamEligibleForNewUserPrompt(this);
        }
    }

    /* renamed from: getAllOtherIndividualAccounts$lib_account_tab_externalDebug$annotations */
    public static /* synthetic */ void m2403xa042e612() {
    }

    /* renamed from: getCachedBrokerageAccounts$lib_account_tab_externalDebug$annotations */
    public static /* synthetic */ void m2404xbaa05382() {
    }

    /* renamed from: getIndividualBrokerageAccount$lib_account_tab_externalDebug$annotations */
    public static /* synthetic */ void m2405x8e50b324() {
    }

    public static /* synthetic */ void getManagedAccounts$lib_account_tab_externalDebug$annotations() {
    }

    /* renamed from: getSelfDirectedIraBrokerageAccount$lib_account_tab_externalDebug$annotations */
    public static /* synthetic */ void m2406x4a0227a3() {
    }

    /* renamed from: getSelfDirectedJointBrokerageAccount$lib_account_tab_externalDebug$annotations */
    public static /* synthetic */ void m2407x11132fd5() {
    }

    /* renamed from: getSelfDirectedRothBrokerageAccount$lib_account_tab_externalDebug$annotations */
    public static /* synthetic */ void m2408x599ae650() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTabDuxo(AccountTabStore accountTabStore, AccountProvider accountProvider, RhyAccountStore rhyAccountStore, BaseSortingHatStore sortingHatStore, UnifiedAccountStore unifiedAccountStore, CashManagementAccessManager cashManagementAccessManager, AccountSelectorHomeManager accountSelectorHomeManager, AccountTabDeeplinkCoordinator deeplinkCoordinator, @PortfolioPrivacyPref BooleanPreference portfolioPrivacyPref, @ReferredDataPref2 StringToLongMapPreference accountTabOrderPref, @SeenNewExperiencePref BooleanPreference seenNewExperiencePref, DuxoBundle duxoBundle) {
        super(new AccountTabDataState(null, null, null, null, null, null, null, portfolioPrivacyPref.get(), false, false, null, accountTabOrderPref.getValues(), null, false, 14207, null), new AccountTabStateProvider(deeplinkCoordinator), duxoBundle);
        Intrinsics.checkNotNullParameter(accountTabStore, "accountTabStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(cashManagementAccessManager, "cashManagementAccessManager");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(deeplinkCoordinator, "deeplinkCoordinator");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(accountTabOrderPref, "accountTabOrderPref");
        Intrinsics.checkNotNullParameter(seenNewExperiencePref, "seenNewExperiencePref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountTabStore = accountTabStore;
        this.accountProvider = accountProvider;
        this.rhyAccountStore = rhyAccountStore;
        this.sortingHatStore = sortingHatStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.cashManagementAccessManager = cashManagementAccessManager;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.accountTabOrderPref = accountTabOrderPref;
        this.seenNewExperiencePref = seenNewExperiencePref;
        final StateFlow2<List<Account>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.cachedBrokerageAccounts = stateFlow2MutableStateFlow;
        this.isCollapsed = true;
        this.currentNewUserExperienceStage = seenNewExperiencePref.get() ? NewUserExperienceStage.DONE : NewUserExperienceStage.PENDING;
        Flow<Account> flow = new Flow<Account>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2MutableStateFlow.collect(new C263212(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$1$2 */
            public static final class C263212<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$1$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C263212.this.emit(null, this);
                    }
                }

                public C263212(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            Account account = (Account) next;
                            if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && account.getManagementType() == ManagementType.SELF_DIRECTED && account.isOriginal()) {
                                break;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        this.individualBrokerageAccount = flow;
        this.allOtherIndividualAccounts = FlowKt.combine(stateFlow2MutableStateFlow, flow, new AccountTabDuxo2(null));
        this.managedAccounts = new Flow<List<? extends Account>>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Account>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2MutableStateFlow.collect(new C263222(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$2$2 */
            public static final class C263222<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$2$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C263222.this.emit(null, this);
                    }
                }

                public C263222(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (((Account) t).getManagementType() == ManagementType.MANAGED) {
                                arrayList.add(t);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        this.selfDirectedIraBrokerageAccount = new Flow<Account>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2MutableStateFlow.collect(new C263232(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$3$2 */
            public static final class C263232<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$3$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C263232.this.emit(null, this);
                    }
                }

                public C263232(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            Account account = (Account) next;
                            if (account.getManagementType() == ManagementType.SELF_DIRECTED && account.getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL) {
                                break;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        this.selfDirectedRothBrokerageAccount = new Flow<Account>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$4
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2MutableStateFlow.collect(new C263242(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$4$2 */
            public static final class C263242<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$4$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C263242.this.emit(null, this);
                    }
                }

                public C263242(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            Account account = (Account) next;
                            if (account.getManagementType() == ManagementType.SELF_DIRECTED && account.getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH) {
                                break;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        this.selfDirectedJointBrokerageAccount = new Flow<Account>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$5
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2MutableStateFlow.collect(new C263252(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$5$2 */
            public static final class C263252<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$5$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$special$$inlined$map$5$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C263252.this.emit(null, this);
                    }
                }

                public C263252(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            Account account = (Account) next;
                            if (account.getManagementType() == ManagementType.SELF_DIRECTED && account.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                                break;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasPortfolioPrivacy() {
        return getStateFlow().getValue().getHasPrivacy();
    }

    public final StateFlow2<List<Account>> getCachedBrokerageAccounts$lib_account_tab_externalDebug() {
        return this.cachedBrokerageAccounts;
    }

    public final String getLastSelectedTabId() {
        return this.lastSelectedTabId;
    }

    public final void setLastSelectedTabId(String str) {
        this.lastSelectedTabId = str;
    }

    /* renamed from: isCollapsed, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    public final void setCollapsed(boolean z) {
        this.isCollapsed = z;
    }

    public final Flow<Account> getIndividualBrokerageAccount$lib_account_tab_externalDebug() {
        return this.individualBrokerageAccount;
    }

    public final Flow<List<Account>> getAllOtherIndividualAccounts$lib_account_tab_externalDebug() {
        return this.allOtherIndividualAccounts;
    }

    public final Flow<List<Account>> getManagedAccounts$lib_account_tab_externalDebug() {
        return this.managedAccounts;
    }

    public final Flow<Account> getSelfDirectedIraBrokerageAccount$lib_account_tab_externalDebug() {
        return this.selfDirectedIraBrokerageAccount;
    }

    /* renamed from: getSelfDirectedRothBrokerageAccount$lib_account_tab_externalDebug */
    public final Flow<Account> m2410x670661d0() {
        return this.selfDirectedRothBrokerageAccount;
    }

    /* renamed from: getSelfDirectedJointBrokerageAccount$lib_account_tab_externalDebug */
    public final Flow<Account> m2409xf3a50ad5() {
        return this.selfDirectedJointBrokerageAccount;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.accountTabStore.forceRefresh();
        if (this.accountSelectorHomeManager.getSupportsCreditCardAccountTab()) {
            CashManagementAccessManager.refresh$default(this.cashManagementAccessManager, false, 1, null);
        }
        if (this.seenNewExperiencePref.get()) {
            return;
        }
        UnifiedAccountStore.refresh$default(this.unifiedAccountStore, false, 1, null);
        this.sortingHatStore.refresh();
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1 */
    static final class C263491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C263491(Continuation<? super C263491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263491 c263491 = AccountTabDuxo.this.new C263491(continuation);
            c263491.L$0 = obj;
            return c263491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C263491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountTabDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$1", m3645f = "AccountTabDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountTabDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AccountTabDuxo accountTabDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = accountTabDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountTabDuxo accountTabDuxo = this.this$0;
                    this.label = 1;
                    if (accountTabDuxo.streamPortfolioPrivacy(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AccountTabDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AccountTabDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AccountTabDuxo.this, null), 3, null);
                Launch.launchDefault$default(coroutineScope, null, null, new AnonymousClass4(AccountTabDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AccountTabDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$2", m3645f = "AccountTabDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountTabDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AccountTabDuxo accountTabDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = accountTabDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountTabDuxo accountTabDuxo = this.this$0;
                    this.label = 1;
                    if (accountTabDuxo.streamEligibleForNewUserPrompt(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AccountTabDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$3", m3645f = "AccountTabDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AccountTabDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AccountTabDuxo accountTabDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = accountTabDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountTabDuxo accountTabDuxo = this.this$0;
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = Duration3.toDuration(1, DurationUnitJvm.MINUTES);
                    this.label = 1;
                    if (accountTabDuxo.m17888pollForNewAccountsVtjQ1oo(duration, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AccountTabDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AccountTabDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AccountTabDuxo accountTabDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = accountTabDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowKt.launchIn(FlowKt.combine(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAllAccounts()), Integer.MAX_VALUE, null, 2, null)), this.this$0.accountTabStore.streamPendingAccounts(), new AnonymousClass1(this.this$0, coroutineScope, null)), coroutineScope);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }

            /* compiled from: AccountTabDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "accounts", "", "Lcom/robinhood/models/db/Account;", "pendingAccounts", "Lcom/robinhood/models/home/HomeAccountSwitcher$Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1", m3645f = "AccountTabDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<List<? extends Account>, List<? extends HomeAccountSwitcher.Account>, Continuation<? super Job>, Object> {
                final /* synthetic */ CoroutineScope $$this$launchDefault;
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ AccountTabDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AccountTabDuxo accountTabDuxo, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                    this.this$0 = accountTabDuxo;
                    this.$$this$launchDefault = coroutineScope;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, List<? extends HomeAccountSwitcher.Account> list2, Continuation<? super Job> continuation) {
                    return invoke2((List<Account>) list, (List<HomeAccountSwitcher.Account>) list2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<Account> list, List<HomeAccountSwitcher.Account> list2, Continuation<? super Job> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launchDefault, continuation);
                    anonymousClass1.L$0 = list;
                    anonymousClass1.L$1 = list2;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    List list;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        List<Account> list2 = (List) this.L$0;
                        List list3 = (List) this.L$1;
                        StateFlow2<List<Account>> cachedBrokerageAccounts$lib_account_tab_externalDebug = this.this$0.getCachedBrokerageAccounts$lib_account_tab_externalDebug();
                        this.L$0 = list3;
                        this.label = 1;
                        if (cachedBrokerageAccounts$lib_account_tab_externalDebug.emit(list2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = list3;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = (List) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return BuildersKt__Builders_commonKt.launch$default(this.$$this$launchDefault, null, null, new C504891(this.this$0, list, null), 3, null);
                }

                /* compiled from: AccountTabDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1$1", m3645f = "AccountTabDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C504891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ List<HomeAccountSwitcher.Account> $pendingAccounts;
                    int label;
                    final /* synthetic */ AccountTabDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C504891(AccountTabDuxo accountTabDuxo, List<HomeAccountSwitcher.Account> list, Continuation<? super C504891> continuation) {
                        super(2, continuation);
                        this.this$0 = accountTabDuxo;
                        this.$pendingAccounts = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C504891(this.this$0, this.$pendingAccounts, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C504891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Flow flowCombineFlows = CombineFlows.combineFlows(this.this$0.streamIndividualAccountDetails(this.$pendingAccounts), this.this$0.streamOtherIndividualAccountDetails(), this.this$0.streamManagedAccountDetails$lib_account_tab_externalDebug(), this.this$0.streamIraAccountDetails(), this.this$0.streamRothIraAccountDetails(), this.this$0.streamSpendingAccountOrCreditCardWaitlistDetails(), this.this$0.streamJointAccountDetails(this.$pendingAccounts), new C504901(this.this$0, null));
                            this.label = 1;
                            if (FlowKt.collect(flowCombineFlows, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: AccountTabDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\n"}, m3636d2 = {"<anonymous>", "", "individual", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "otherIndividuals", "", "managedList", "ira", "roth", "spending", "joint", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1$1$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C504901 extends ContinuationImpl7 implements Function8<AccountTabInfo.Account, List<? extends AccountTabInfo.Account>, List<? extends AccountTabInfo.Account>, AccountTabInfo.Account, AccountTabInfo.Account, AccountTabInfo.Account, AccountTabInfo, Continuation<? super Unit>, Object> {
                        /* synthetic */ Object L$0;
                        /* synthetic */ Object L$1;
                        /* synthetic */ Object L$2;
                        /* synthetic */ Object L$3;
                        /* synthetic */ Object L$4;
                        /* synthetic */ Object L$5;
                        /* synthetic */ Object L$6;
                        int label;
                        final /* synthetic */ AccountTabDuxo this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C504901(AccountTabDuxo accountTabDuxo, Continuation<? super C504901> continuation) {
                            super(8, continuation);
                            this.this$0 = accountTabDuxo;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final Object invoke2(AccountTabInfo.Account account, List<AccountTabInfo.Account> list, List<AccountTabInfo.Account> list2, AccountTabInfo.Account account2, AccountTabInfo.Account account3, AccountTabInfo.Account account4, AccountTabInfo accountTabInfo, Continuation<? super Unit> continuation) {
                            C504901 c504901 = new C504901(this.this$0, continuation);
                            c504901.L$0 = account;
                            c504901.L$1 = list;
                            c504901.L$2 = list2;
                            c504901.L$3 = account2;
                            c504901.L$4 = account3;
                            c504901.L$5 = account4;
                            c504901.L$6 = accountTabInfo;
                            return c504901.invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.jvm.functions.Function8
                        public /* bridge */ /* synthetic */ Object invoke(AccountTabInfo.Account account, List<? extends AccountTabInfo.Account> list, List<? extends AccountTabInfo.Account> list2, AccountTabInfo.Account account2, AccountTabInfo.Account account3, AccountTabInfo.Account account4, AccountTabInfo accountTabInfo, Continuation<? super Unit> continuation) {
                            return invoke2(account, (List<AccountTabInfo.Account>) list, (List<AccountTabInfo.Account>) list2, account2, account3, account4, accountTabInfo, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            AccountTabInfo.Account account = (AccountTabInfo.Account) this.L$0;
                            List list = (List) this.L$1;
                            List list2 = (List) this.L$2;
                            AccountTabInfo.Account account2 = (AccountTabInfo.Account) this.L$3;
                            AccountTabInfo.Account account3 = (AccountTabInfo.Account) this.L$4;
                            AccountTabInfo.Account account4 = (AccountTabInfo.Account) this.L$5;
                            AccountTabInfo accountTabInfo = (AccountTabInfo) this.L$6;
                            AccountTabDuxo accountTabDuxo = this.this$0;
                            accountTabDuxo.applyMutation(new C504911(accountTabDuxo, account, list, list2, account2, account3, account4, accountTabInfo, null));
                            return Unit.INSTANCE;
                        }

                        /* compiled from: AccountTabDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1$1$1$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C504911 extends ContinuationImpl7 implements Function2<AccountTabDataState, Continuation<? super AccountTabDataState>, Object> {
                            final /* synthetic */ AccountTabInfo.Account $individual;
                            final /* synthetic */ AccountTabInfo.Account $ira;
                            final /* synthetic */ AccountTabInfo $joint;
                            final /* synthetic */ List<AccountTabInfo.Account> $managedList;
                            final /* synthetic */ List<AccountTabInfo.Account> $otherIndividuals;
                            final /* synthetic */ AccountTabInfo.Account $roth;
                            final /* synthetic */ AccountTabInfo.Account $spending;
                            private /* synthetic */ Object L$0;
                            int label;
                            final /* synthetic */ AccountTabDuxo this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C504911(AccountTabDuxo accountTabDuxo, AccountTabInfo.Account account, List<AccountTabInfo.Account> list, List<AccountTabInfo.Account> list2, AccountTabInfo.Account account2, AccountTabInfo.Account account3, AccountTabInfo.Account account4, AccountTabInfo accountTabInfo, Continuation<? super C504911> continuation) {
                                super(2, continuation);
                                this.this$0 = accountTabDuxo;
                                this.$individual = account;
                                this.$otherIndividuals = list;
                                this.$managedList = list2;
                                this.$ira = account2;
                                this.$roth = account3;
                                this.$spending = account4;
                                this.$joint = accountTabInfo;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C504911 c504911 = new C504911(this.this$0, this.$individual, this.$otherIndividuals, this.$managedList, this.$ira, this.$roth, this.$spending, this.$joint, continuation);
                                c504911.L$0 = obj;
                                return c504911;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AccountTabDataState accountTabDataState, Continuation<? super AccountTabDataState> continuation) {
                                return ((C504911) create(accountTabDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                AccountTabDataState accountTabDataState = (AccountTabDataState) this.L$0;
                                return accountTabDataState.copy((4095 & 1) != 0 ? accountTabDataState.individualTabInfo : this.$individual, (4095 & 2) != 0 ? accountTabDataState.otherIndividualTabInfoList : this.$otherIndividuals, (4095 & 4) != 0 ? accountTabDataState.managedTabInfoList : this.$managedList, (4095 & 8) != 0 ? accountTabDataState.retirementIraTabInfo : this.$ira, (4095 & 16) != 0 ? accountTabDataState.retirementRothTabInfo : this.$roth, (4095 & 32) != 0 ? accountTabDataState.spendingTabInfo : this.$spending, (4095 & 64) != 0 ? accountTabDataState.jointTabInfo : this.$joint, (4095 & 128) != 0 ? accountTabDataState.hasPrivacy : false, (4095 & 256) != 0 ? accountTabDataState.loading : false, (4095 & 512) != 0 ? accountTabDataState.userHasNoBrokerageAccounts : this.this$0.getCachedBrokerageAccounts$lib_account_tab_externalDebug().getValue().isEmpty(), (4095 & 1024) != 0 ? accountTabDataState.pendingDeeplinkRequest : null, (4095 & 2048) != 0 ? accountTabDataState.preferredAccountOrder : null, (4095 & 4096) != 0 ? accountTabDataState.newUserExperienceStage : null, (4095 & 8192) != 0 ? accountTabDataState.showSubtitles : false);
                            }
                        }
                    }
                }
            }

            /* compiled from: AccountTabDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$2", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onCreate$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ AccountTabDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AccountTabDuxo accountTabDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = accountTabDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.cashManagementAccessManager.refreshCreditCardWaitlistTabEligibility();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C263491(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pollForNewAccounts-VtjQ1oo, reason: not valid java name */
    public final Object m17888pollForNewAccountsVtjQ1oo(long j, Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.collect(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.pollIndividualAccount(Duration.m28741getInWholeSecondsimpl(j), TimeUnit.SECONDS)), Integer.MAX_VALUE, null, 2, null), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasPrivacy", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamPortfolioPrivacy$2", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamPortfolioPrivacy$2 */
    static final class C263542 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        C263542(Continuation<? super C263542> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263542 c263542 = AccountTabDuxo.this.new C263542(continuation);
            c263542.Z$0 = ((Boolean) obj).booleanValue();
            return c263542;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C263542) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountTabDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamPortfolioPrivacy$2$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamPortfolioPrivacy$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountTabDataState, Continuation<? super AccountTabDataState>, Object> {
            final /* synthetic */ boolean $hasPrivacy;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$hasPrivacy = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hasPrivacy, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountTabDataState accountTabDataState, Continuation<? super AccountTabDataState> continuation) {
                return ((AnonymousClass1) create(accountTabDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AccountTabDataState accountTabDataState = (AccountTabDataState) this.L$0;
                return accountTabDataState.copy((4095 & 1) != 0 ? accountTabDataState.individualTabInfo : null, (4095 & 2) != 0 ? accountTabDataState.otherIndividualTabInfoList : null, (4095 & 4) != 0 ? accountTabDataState.managedTabInfoList : null, (4095 & 8) != 0 ? accountTabDataState.retirementIraTabInfo : null, (4095 & 16) != 0 ? accountTabDataState.retirementRothTabInfo : null, (4095 & 32) != 0 ? accountTabDataState.spendingTabInfo : null, (4095 & 64) != 0 ? accountTabDataState.jointTabInfo : null, (4095 & 128) != 0 ? accountTabDataState.hasPrivacy : this.$hasPrivacy, (4095 & 256) != 0 ? accountTabDataState.loading : false, (4095 & 512) != 0 ? accountTabDataState.userHasNoBrokerageAccounts : false, (4095 & 1024) != 0 ? accountTabDataState.pendingDeeplinkRequest : null, (4095 & 2048) != 0 ? accountTabDataState.preferredAccountOrder : null, (4095 & 4096) != 0 ? accountTabDataState.newUserExperienceStage : null, (4095 & 8192) != 0 ? accountTabDataState.showSubtitles : false);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AccountTabDuxo.this.applyMutation(new AnonymousClass1(this.Z$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamPortfolioPrivacy(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(Context7.buffer$default(RxConvert.asFlow(this.portfolioPrivacyPref.getChanges()), Integer.MAX_VALUE, null, 2, null), new C263542(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamUserConsideredInvested() {
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.individualBrokerageAccount), new C26342xfc9e85f3(null, this));
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamIsFunded$1", m3645f = "AccountTabDuxo.kt", m3646l = {716}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamIsFunded$1 */
    static final class C263531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C263531(Continuation<? super C263531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountTabDuxo.this.new C263531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C263531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Completable completablePoll = AccountTabDuxo.this.unifiedAccountStore.poll();
                this.label = 1;
                if (RxAwait3.await(completablePoll, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamIsFunded() {
        this.fundedPollingJob = getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C263531(null));
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.unifiedAccountStore.streamIndividualAccountOptional()), Integer.MAX_VALUE, null, 2, null);
        return new Flow<Boolean>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamIsFunded$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C263312(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamIsFunded$$inlined$map$1$2 */
            public static final class C263312<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamIsFunded$$inlined$map$1$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamIsFunded$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C263312.this.emit(null, this);
                    }
                }

                public C263312(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BigDecimal bigDecimal;
                    Money portfolioEquity;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) obj).getOrNull();
                        if (unifiedAccountV2 == null || (portfolioEquity = unifiedAccountV2.getPortfolioEquity()) == null || (bigDecimal = portfolioEquity.getDecimalValue()) == null) {
                            bigDecimal = new BigDecimal(0);
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(bigDecimal.compareTo(new BigDecimal(0)) > 0);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamEligibleForNewUserPrompt(Continuation<? super Unit> continuation) {
        C263501 c263501;
        Job job;
        if (continuation instanceof C263501) {
            c263501 = (C263501) continuation;
            int i = c263501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c263501.label = i - Integer.MIN_VALUE;
            } else {
                c263501 = new C263501(continuation);
            }
        }
        Object obj = c263501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c263501.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.seenNewExperiencePref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                Flow flowTakeWhile = FlowKt.takeWhile(FlowKt.transformLatest(new Flow<Boolean>() { // from class: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                        Object objCollect = flowBuffer$default.collect(new C263262(flowCollector), continuation2);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$$inlined$filter$1$2 */
                    public static final class C263262<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$$inlined$filter$1$2", m3645f = "AccountTabDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C263262.this.emit(null, this);
                            }
                        }

                        public C263262(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, new C26327x6d3de3ed(null, this)), new C263514(null));
                C263525 c263525 = new C263525(null);
                c263501.label = 1;
                if (FlowKt.collectLatest(flowTakeWhile, c263525, c263501) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.fundedPollingJob = null;
            return Unit.INSTANCE;
        } finally {
            job = this.fundedPollingJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.fundedPollingJob = null;
        }
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$4", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$4 */
    static final class C263514 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Boolean>, Continuation<? super Boolean>, Object> {
        int label;

        C263514(Continuation<? super C263514> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountTabDuxo.this.new C263514(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Boolean> tuples2, Continuation<? super Boolean> continuation) {
            return invoke2((Tuples2<Boolean, Boolean>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Boolean, Boolean> tuples2, Continuation<? super Boolean> continuation) {
            return ((C263514) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(AccountTabDuxo.this.currentNewUserExperienceStage == NewUserExperienceStage.PENDING);
        }
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$5", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamEligibleForNewUserPrompt$5 */
    static final class C263525 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C263525(Continuation<? super C263525> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263525 c263525 = AccountTabDuxo.this.new C263525(continuation);
            c263525.L$0 = obj;
            return c263525;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<Boolean, Boolean>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Boolean, Boolean> tuples2, Continuation<? super Unit> continuation) {
            return ((C263525) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            NewUserExperienceStage newUserExperienceStageInvokeSuspend$cachedOrNewStage;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) tuples2.component2()).booleanValue();
                if (AccountTabDuxo.this.seenNewExperiencePref.get()) {
                    newUserExperienceStageInvokeSuspend$cachedOrNewStage = NewUserExperienceStage.DONE;
                } else if (zBooleanValue2) {
                    AccountTabDuxo.this.isFirstViewAfterFunding = true;
                    newUserExperienceStageInvokeSuspend$cachedOrNewStage = invokeSuspend$cachedOrNewStage(AccountTabDuxo.this, NewUserExperienceStage.PULL_DOWN);
                } else if (zBooleanValue) {
                    newUserExperienceStageInvokeSuspend$cachedOrNewStage = invokeSuspend$cachedOrNewStage(AccountTabDuxo.this, NewUserExperienceStage.PULL_DOWN);
                } else {
                    newUserExperienceStageInvokeSuspend$cachedOrNewStage = NewUserExperienceStage.PENDING;
                }
                AccountTabDuxo.this.cacheNewUserExperienceStage(newUserExperienceStageInvokeSuspend$cachedOrNewStage);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        private static final NewUserExperienceStage invokeSuspend$cachedOrNewStage(AccountTabDuxo accountTabDuxo, NewUserExperienceStage newUserExperienceStage) {
            return accountTabDuxo.currentNewUserExperienceStage == NewUserExperienceStage.SWIPE ? accountTabDuxo.currentNewUserExperienceStage : newUserExperienceStage;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<AccountTabInfo.Account> streamIndividualAccountDetails(List<HomeAccountSwitcher.Account> pendingAccounts) {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.individualBrokerageAccount), new C26328x666a9b3c(null, pendingAccounts, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<AccountTabInfo.Account>> streamOtherIndividualAccountDetails() {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.allOtherIndividualAccounts), new C26337x2acc7eb4(null, this)));
    }

    public final Flow<List<AccountTabInfo.Account>> streamManagedAccountDetails$lib_account_tab_externalDebug() {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.managedAccounts), new C26334x5172e81e(null, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<AccountTabInfo.Account> streamIraAccountDetails() {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.selfDirectedIraBrokerageAccount), new AccountTabDuxo$streamIraAccountDetails$$inlined$flatMapLatest$1(null, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<AccountTabInfo.Account> streamRothIraAccountDetails() {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.selfDirectedRothBrokerageAccount), new C26340x7cd3f196(null, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<AccountTabInfo.Account> streamSpendingAccountOrCreditCardWaitlistDetails() {
        Flow flowFlowOf;
        if (this.accountSelectorHomeManager.getSupportsCreditCardAccountTab()) {
            flowFlowOf = Context7.buffer$default(RxConvert.asFlow(this.cashManagementAccessManager.streamCreditCardWaitlistTabEligibility()), Integer.MAX_VALUE, null, 2, null);
        } else {
            flowFlowOf = FlowKt.flowOf(Boolean.FALSE);
        }
        return FlowKt.distinctUntilChanged(FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.rhyAccountStore.streamSpendingAccount()), Integer.MAX_VALUE, null, 2, null), flowFlowOf, new C263551(null)));
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "spendingAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "isCreditCardTabEligible", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamSpendingAccountOrCreditCardWaitlistDetails$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$streamSpendingAccountOrCreditCardWaitlistDetails$1 */
    static final class C263551 extends ContinuationImpl7 implements Function3<Optional<? extends RhyAccount>, Boolean, Continuation<? super AccountTabInfo.Account>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        C263551(Continuation<? super C263551> continuation) {
            super(3, continuation);
        }

        public final Object invoke(Optional<RhyAccount> optional, boolean z, Continuation<? super AccountTabInfo.Account> continuation) {
            C263551 c263551 = new C263551(continuation);
            c263551.L$0 = optional;
            c263551.Z$0 = z;
            return c263551.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Optional<? extends RhyAccount> optional, Boolean bool, Continuation<? super AccountTabInfo.Account> continuation) {
            return invoke((Optional<RhyAccount>) optional, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Optional optional = (Optional) this.L$0;
            boolean z = this.Z$0;
            RhyAccount rhyAccount = (RhyAccount) optional.getOrNull();
            if (rhyAccount == null) {
                if (!z) {
                    return null;
                }
                StringResource.Companion companion = StringResource.INSTANCE;
                return new AccountTabInfo.Account(AccountTabType.CREDIT_CARD, BrokerageAccountType.UNKNOWN, companion.invoke(C26320R.string.account_credit_card, new Object[0]), companion.invoke(C26320R.string.subtitle_credit_card, new Object[0]), null, "likely-credit-card", null, null, null, false, true, null, false, 6608, null);
            }
            BigDecimal cashAvailable = rhyAccount.getCashAvailable();
            if (cashAvailable == null) {
                cashAvailable = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal = cashAvailable;
            return new AccountTabInfo.Account(AccountTabType.SPENDING, BrokerageAccountType.UNKNOWN, StringResource.INSTANCE.invoke(C26320R.string.account_spending, new Object[0]), null, null, rhyAccount.getAccountNumber(), bigDecimal, null, null, false, false, null, false, 8088, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<AccountTabInfo> streamJointAccountDetails(List<HomeAccountSwitcher.Account> pendingAccounts) {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(Flow7.flowOnDefault(FlowKt.distinctUntilChanged(this.selfDirectedJointBrokerageAccount)), new C26332xd401c1d3(null, pendingAccounts, this)));
    }

    public final void saveSelectedTabId(String id) {
        this.lastSelectedTabId = id;
    }

    public final void saveCollapsedState(boolean isCollapsed) {
        this.isCollapsed = isCollapsed;
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$cacheNewUserExperienceStage$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$cacheNewUserExperienceStage$1 */
    static final class C263451 extends ContinuationImpl7 implements Function2<AccountTabDataState, Continuation<? super AccountTabDataState>, Object> {
        final /* synthetic */ NewUserExperienceStage $stage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccountTabDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C263451(NewUserExperienceStage newUserExperienceStage, AccountTabDuxo accountTabDuxo, Continuation<? super C263451> continuation) {
            super(2, continuation);
            this.$stage = newUserExperienceStage;
            this.this$0 = accountTabDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263451 c263451 = new C263451(this.$stage, this.this$0, continuation);
            c263451.L$0 = obj;
            return c263451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountTabDataState accountTabDataState, Continuation<? super AccountTabDataState> continuation) {
            return ((C263451) create(accountTabDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountTabDataState accountTabDataState = (AccountTabDataState) this.L$0;
            return accountTabDataState.copy((4095 & 1) != 0 ? accountTabDataState.individualTabInfo : null, (4095 & 2) != 0 ? accountTabDataState.otherIndividualTabInfoList : null, (4095 & 4) != 0 ? accountTabDataState.managedTabInfoList : null, (4095 & 8) != 0 ? accountTabDataState.retirementIraTabInfo : null, (4095 & 16) != 0 ? accountTabDataState.retirementRothTabInfo : null, (4095 & 32) != 0 ? accountTabDataState.spendingTabInfo : null, (4095 & 64) != 0 ? accountTabDataState.jointTabInfo : null, (4095 & 128) != 0 ? accountTabDataState.hasPrivacy : false, (4095 & 256) != 0 ? accountTabDataState.loading : false, (4095 & 512) != 0 ? accountTabDataState.userHasNoBrokerageAccounts : false, (4095 & 1024) != 0 ? accountTabDataState.pendingDeeplinkRequest : null, (4095 & 2048) != 0 ? accountTabDataState.preferredAccountOrder : null, (4095 & 4096) != 0 ? accountTabDataState.newUserExperienceStage : this.$stage, (4095 & 8192) != 0 ? accountTabDataState.showSubtitles : this.this$0.isFirstViewAfterFunding);
        }
    }

    public final void cacheNewUserExperienceStage(NewUserExperienceStage stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        this.currentNewUserExperienceStage = stage;
        applyMutation(new C263451(stage, this, null));
    }

    public final void saveNewUserExperienceStage(NewUserExperienceStage stage) {
        Intrinsics.checkNotNullParameter(stage, "stage");
        cacheNewUserExperienceStage(stage);
        if (stage == NewUserExperienceStage.DONE) {
            this.seenNewExperiencePref.set(true);
        }
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$enqueueSwitchTabDeeplinkRequest$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$enqueueSwitchTabDeeplinkRequest$1 */
    static final class C263471 extends ContinuationImpl7 implements Function2<AccountTabDataState, Continuation<? super AccountTabDataState>, Object> {
        final /* synthetic */ TabLinkIntentKey $tabIntentKey;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C263471(TabLinkIntentKey tabLinkIntentKey, Continuation<? super C263471> continuation) {
            super(2, continuation);
            this.$tabIntentKey = tabLinkIntentKey;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263471 c263471 = new C263471(this.$tabIntentKey, continuation);
            c263471.L$0 = obj;
            return c263471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountTabDataState accountTabDataState, Continuation<? super AccountTabDataState> continuation) {
            return ((C263471) create(accountTabDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountTabDataState accountTabDataState = (AccountTabDataState) this.L$0;
            return accountTabDataState.copy((4095 & 1) != 0 ? accountTabDataState.individualTabInfo : null, (4095 & 2) != 0 ? accountTabDataState.otherIndividualTabInfoList : null, (4095 & 4) != 0 ? accountTabDataState.managedTabInfoList : null, (4095 & 8) != 0 ? accountTabDataState.retirementIraTabInfo : null, (4095 & 16) != 0 ? accountTabDataState.retirementRothTabInfo : null, (4095 & 32) != 0 ? accountTabDataState.spendingTabInfo : null, (4095 & 64) != 0 ? accountTabDataState.jointTabInfo : null, (4095 & 128) != 0 ? accountTabDataState.hasPrivacy : false, (4095 & 256) != 0 ? accountTabDataState.loading : false, (4095 & 512) != 0 ? accountTabDataState.userHasNoBrokerageAccounts : false, (4095 & 1024) != 0 ? accountTabDataState.pendingDeeplinkRequest : this.$tabIntentKey, (4095 & 2048) != 0 ? accountTabDataState.preferredAccountOrder : null, (4095 & 4096) != 0 ? accountTabDataState.newUserExperienceStage : null, (4095 & 8192) != 0 ? accountTabDataState.showSubtitles : false);
        }
    }

    public final void enqueueSwitchTabDeeplinkRequest(TabLinkIntentKey tabIntentKey) {
        Intrinsics.checkNotNullParameter(tabIntentKey, "tabIntentKey");
        Timber.INSTANCE.tag("AccountTabSwitcher").mo3350d("enqueueSwitchTabDeeplinkRequest: " + tabIntentKey, new Object[0]);
        applyMutation(new C263471(tabIntentKey, null));
    }

    public final void clearPendingDeeplinkRequest() {
        Timber.INSTANCE.tag("AccountTabSwitcher").mo3350d("clearPendingDeeplinkRequest()", new Object[0]);
        AccountTabDeeplinkCache.INSTANCE.clear();
        applyMutation(new C263461(null));
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$clearPendingDeeplinkRequest$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$clearPendingDeeplinkRequest$1 */
    static final class C263461 extends ContinuationImpl7 implements Function2<AccountTabDataState, Continuation<? super AccountTabDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C263461(Continuation<? super C263461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263461 c263461 = new C263461(continuation);
            c263461.L$0 = obj;
            return c263461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountTabDataState accountTabDataState, Continuation<? super AccountTabDataState> continuation) {
            return ((C263461) create(accountTabDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountTabDataState accountTabDataState = (AccountTabDataState) this.L$0;
            return accountTabDataState.copy((4095 & 1) != 0 ? accountTabDataState.individualTabInfo : null, (4095 & 2) != 0 ? accountTabDataState.otherIndividualTabInfoList : null, (4095 & 4) != 0 ? accountTabDataState.managedTabInfoList : null, (4095 & 8) != 0 ? accountTabDataState.retirementIraTabInfo : null, (4095 & 16) != 0 ? accountTabDataState.retirementRothTabInfo : null, (4095 & 32) != 0 ? accountTabDataState.spendingTabInfo : null, (4095 & 64) != 0 ? accountTabDataState.jointTabInfo : null, (4095 & 128) != 0 ? accountTabDataState.hasPrivacy : false, (4095 & 256) != 0 ? accountTabDataState.loading : false, (4095 & 512) != 0 ? accountTabDataState.userHasNoBrokerageAccounts : false, (4095 & 1024) != 0 ? accountTabDataState.pendingDeeplinkRequest : null, (4095 & 2048) != 0 ? accountTabDataState.preferredAccountOrder : null, (4095 & 4096) != 0 ? accountTabDataState.newUserExperienceStage : null, (4095 & 8192) != 0 ? accountTabDataState.showSubtitles : false);
        }
    }

    public final void onAccountTabsReordered(List<AccountTabInfo.Account> newOrder) {
        Intrinsics.checkNotNullParameter(newOrder, "newOrder");
        Iterable iterableWithIndex = CollectionsKt.withIndex(newOrder);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        Iterator it = iterableWithIndex.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((AccountTabInfo.Account) ((IndexedValue) it.next()).getValue()).getSortId(), Long.valueOf(r0.getIndex()));
        }
        this.accountTabOrderPref.setValues(linkedHashMap);
        applyMutation(new C263481(linkedHashMap, null));
    }

    /* compiled from: AccountTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onAccountTabsReordered$1", m3645f = "AccountTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo$onAccountTabsReordered$1 */
    static final class C263481 extends ContinuationImpl7 implements Function2<AccountTabDataState, Continuation<? super AccountTabDataState>, Object> {
        final /* synthetic */ Map<String, Long> $orderedIds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C263481(Map<String, Long> map, Continuation<? super C263481> continuation) {
            super(2, continuation);
            this.$orderedIds = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C263481 c263481 = new C263481(this.$orderedIds, continuation);
            c263481.L$0 = obj;
            return c263481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountTabDataState accountTabDataState, Continuation<? super AccountTabDataState> continuation) {
            return ((C263481) create(accountTabDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AccountTabDataState accountTabDataState = (AccountTabDataState) this.L$0;
            return accountTabDataState.copy((4095 & 1) != 0 ? accountTabDataState.individualTabInfo : null, (4095 & 2) != 0 ? accountTabDataState.otherIndividualTabInfoList : null, (4095 & 4) != 0 ? accountTabDataState.managedTabInfoList : null, (4095 & 8) != 0 ? accountTabDataState.retirementIraTabInfo : null, (4095 & 16) != 0 ? accountTabDataState.retirementRothTabInfo : null, (4095 & 32) != 0 ? accountTabDataState.spendingTabInfo : null, (4095 & 64) != 0 ? accountTabDataState.jointTabInfo : null, (4095 & 128) != 0 ? accountTabDataState.hasPrivacy : false, (4095 & 256) != 0 ? accountTabDataState.loading : false, (4095 & 512) != 0 ? accountTabDataState.userHasNoBrokerageAccounts : false, (4095 & 1024) != 0 ? accountTabDataState.pendingDeeplinkRequest : null, (4095 & 2048) != 0 ? accountTabDataState.preferredAccountOrder : this.$orderedIds, (4095 & 4096) != 0 ? accountTabDataState.newUserExperienceStage : null, (4095 & 8192) != 0 ? accountTabDataState.showSubtitles : false);
        }
    }
}
