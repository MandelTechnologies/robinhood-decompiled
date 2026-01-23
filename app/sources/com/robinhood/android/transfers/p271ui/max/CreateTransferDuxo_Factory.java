package com.robinhood.android.transfers.p271ui.max;

import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import billy_mays.service.p023v1.BillyMaysService;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.retirement.transfers.RetirementTransfersApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.incentives.wonka.WonkaServiceManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferLimitsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import java.math.BigDecimal;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MBù\u0003\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\u0017\u0010(\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\b+0\u0004\u0012\u0017\u0010,\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020-0)¢\u0006\u0002\b+0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0004\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0004\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0004\u0012\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0004\u0012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0004\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0004\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0004¢\u0006\u0004\bJ\u0010KJ\b\u0010L\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010(\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020*0)¢\u0006\u0002\b+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010,\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020-0)¢\u0006\u0002\b+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;", "transfersBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "retirementTransfersApi", "Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rothConversionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "cryptoPendingAndCancelStore", "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "refIdFactoryForRfp", "Ljava/math/BigDecimal;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "billyMaysService", "Lbilly_mays/service/v1/BillyMaysService;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateTransferDuxo_Factory implements Factory<CreateTransferDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BalancesStore> balancesStore;
    private final Provider<BffMoneyMovementService> bffMoneyMovementService;
    private final Provider<BillyMaysService> billyMaysService;
    private final Provider<CardManager> cardManager;
    private final Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore;
    private final Provider<StringPreference> defaultAchRelationshipPref;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore;
    private final Provider<IacUpsellStore> iacUpsellStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<PersistentCacheManager> persistentCacheManager;
    private final Provider<TraderPortfolioStore> portfolioStore;
    private final Provider<RefIdFactory<TransferData>> refIdFactory;
    private final Provider<RefIdFactory<BigDecimal>> refIdFactoryForRfp;
    private final Provider<RetirementTransfersApi> retirementTransfersApi;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<RothConversionStore> rothConversionStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<StripeStore> stripeStore;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<TransferLimitsStore> transferLimitsStore;
    private final Provider<TransferWireAccountStore> transferWireAccountStore;
    private final Provider<TransfersBonfireApi> transfersBonfireApi;
    private final Provider<TransferValidator> validator;
    private final Provider<WonkaServiceManager> wonkaServiceManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CreateTransferDuxo_Factory create(Provider<TransfersBonfireApi> provider, Provider<RetirementTransfersApi> provider2, Provider<TransferAccountStore> provider3, Provider<TransferLimitsStore> provider4, Provider<TransferWireAccountStore> provider5, Provider<TraderMarketHoursManager> provider6, Provider<BalancesStore> provider7, Provider<EventLogger> provider8, Provider<PersistentCacheManager> provider9, Provider<TraderPortfolioStore> provider10, Provider<RhyAccountStore> provider11, Provider<RothConversionStore> provider12, Provider<StripeStore> provider13, Provider<CardManager> provider14, Provider<TransferValidator> provider15, Provider<ExperimentsStore> provider16, Provider<SuvWorkflowManager> provider17, Provider<CryptoPendingAndCancelStore> provider18, Provider<RefIdFactory<TransferData>> provider19, Provider<RefIdFactory<BigDecimal>> provider20, Provider<AccountProvider> provider21, Provider<IacUpsellStore> provider22, Provider<MicrogramManager> provider23, Provider<BaseSortingHatStore> provider24, Provider<StringPreference> provider25, Provider<BillyMaysService> provider26, Provider<GoldDepositBoostMaxAwarenessStore> provider27, Provider<BffMoneyMovementService> provider28, Provider<LazyMoshi> provider29, Provider<WonkaServiceManager> provider30, Provider<SavedStateHandle> provider31, Provider<DispatcherProvider> provider32, Provider<RxFactory> provider33, Provider<RxGlobalErrorHandler> provider34) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34);
    }

    @JvmStatic
    public static final CreateTransferDuxo newInstance(TransfersBonfireApi transfersBonfireApi, RetirementTransfersApi retirementTransfersApi, TransferAccountStore transferAccountStore, TransferLimitsStore transferLimitsStore, TransferWireAccountStore transferWireAccountStore, TraderMarketHoursManager traderMarketHoursManager, BalancesStore balancesStore, EventLogger eventLogger, PersistentCacheManager persistentCacheManager, TraderPortfolioStore traderPortfolioStore, RhyAccountStore rhyAccountStore, RothConversionStore rothConversionStore, StripeStore stripeStore, CardManager cardManager, TransferValidator transferValidator, ExperimentsStore experimentsStore, SuvWorkflowManager suvWorkflowManager, CryptoPendingAndCancelStore cryptoPendingAndCancelStore, RefIdFactory<TransferData> refIdFactory, RefIdFactory<BigDecimal> refIdFactory2, AccountProvider accountProvider, IacUpsellStore iacUpsellStore, MicrogramManager microgramManager, BaseSortingHatStore baseSortingHatStore, StringPreference stringPreference, BillyMaysService billyMaysService, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, BffMoneyMovementService bffMoneyMovementService, LazyMoshi lazyMoshi, WonkaServiceManager wonkaServiceManager, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(transfersBonfireApi, retirementTransfersApi, transferAccountStore, transferLimitsStore, transferWireAccountStore, traderMarketHoursManager, balancesStore, eventLogger, persistentCacheManager, traderPortfolioStore, rhyAccountStore, rothConversionStore, stripeStore, cardManager, transferValidator, experimentsStore, suvWorkflowManager, cryptoPendingAndCancelStore, refIdFactory, refIdFactory2, accountProvider, iacUpsellStore, microgramManager, baseSortingHatStore, stringPreference, billyMaysService, goldDepositBoostMaxAwarenessStore, bffMoneyMovementService, lazyMoshi, wonkaServiceManager, savedStateHandle);
    }

    public CreateTransferDuxo_Factory(Provider<TransfersBonfireApi> transfersBonfireApi, Provider<RetirementTransfersApi> retirementTransfersApi, Provider<TransferAccountStore> transferAccountStore, Provider<TransferLimitsStore> transferLimitsStore, Provider<TransferWireAccountStore> transferWireAccountStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<BalancesStore> balancesStore, Provider<EventLogger> eventLogger, Provider<PersistentCacheManager> persistentCacheManager, Provider<TraderPortfolioStore> portfolioStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RothConversionStore> rothConversionStore, Provider<StripeStore> stripeStore, Provider<CardManager> cardManager, Provider<TransferValidator> validator, Provider<ExperimentsStore> experimentsStore, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore, Provider<RefIdFactory<TransferData>> refIdFactory, Provider<RefIdFactory<BigDecimal>> refIdFactoryForRfp, Provider<AccountProvider> accountProvider, Provider<IacUpsellStore> iacUpsellStore, Provider<MicrogramManager> microgramManager, Provider<BaseSortingHatStore> sortingHatStore, Provider<StringPreference> defaultAchRelationshipPref, Provider<BillyMaysService> billyMaysService, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<LazyMoshi> moshi, Provider<WonkaServiceManager> wonkaServiceManager, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(refIdFactoryForRfp, "refIdFactoryForRfp");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        Intrinsics.checkNotNullParameter(billyMaysService, "billyMaysService");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.transfersBonfireApi = transfersBonfireApi;
        this.retirementTransfersApi = retirementTransfersApi;
        this.transferAccountStore = transferAccountStore;
        this.transferLimitsStore = transferLimitsStore;
        this.transferWireAccountStore = transferWireAccountStore;
        this.marketHoursManager = marketHoursManager;
        this.balancesStore = balancesStore;
        this.eventLogger = eventLogger;
        this.persistentCacheManager = persistentCacheManager;
        this.portfolioStore = portfolioStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rothConversionStore = rothConversionStore;
        this.stripeStore = stripeStore;
        this.cardManager = cardManager;
        this.validator = validator;
        this.experimentsStore = experimentsStore;
        this.suvWorkflowManager = suvWorkflowManager;
        this.cryptoPendingAndCancelStore = cryptoPendingAndCancelStore;
        this.refIdFactory = refIdFactory;
        this.refIdFactoryForRfp = refIdFactoryForRfp;
        this.accountProvider = accountProvider;
        this.iacUpsellStore = iacUpsellStore;
        this.microgramManager = microgramManager;
        this.sortingHatStore = sortingHatStore;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        this.billyMaysService = billyMaysService;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.moshi = moshi;
        this.wonkaServiceManager = wonkaServiceManager;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public CreateTransferDuxo get() {
        Companion companion = INSTANCE;
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(transfersBonfireApi, "get(...)");
        RetirementTransfersApi retirementTransfersApi = this.retirementTransfersApi.get();
        Intrinsics.checkNotNullExpressionValue(retirementTransfersApi, "get(...)");
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        TransferLimitsStore transferLimitsStore = this.transferLimitsStore.get();
        Intrinsics.checkNotNullExpressionValue(transferLimitsStore, "get(...)");
        TransferWireAccountStore transferWireAccountStore = this.transferWireAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferWireAccountStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        BalancesStore balancesStore = this.balancesStore.get();
        Intrinsics.checkNotNullExpressionValue(balancesStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        PersistentCacheManager persistentCacheManager = this.persistentCacheManager.get();
        Intrinsics.checkNotNullExpressionValue(persistentCacheManager, "get(...)");
        TraderPortfolioStore traderPortfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(traderPortfolioStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        RothConversionStore rothConversionStore = this.rothConversionStore.get();
        Intrinsics.checkNotNullExpressionValue(rothConversionStore, "get(...)");
        StripeStore stripeStore = this.stripeStore.get();
        Intrinsics.checkNotNullExpressionValue(stripeStore, "get(...)");
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        CardManager cardManager2 = cardManager;
        TransferValidator transferValidator = this.validator.get();
        Intrinsics.checkNotNullExpressionValue(transferValidator, "get(...)");
        TransferValidator transferValidator2 = transferValidator;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStore experimentsStore2 = experimentsStore;
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        SuvWorkflowManager suvWorkflowManager2 = suvWorkflowManager;
        CryptoPendingAndCancelStore cryptoPendingAndCancelStore = this.cryptoPendingAndCancelStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPendingAndCancelStore, "get(...)");
        CryptoPendingAndCancelStore cryptoPendingAndCancelStore2 = cryptoPendingAndCancelStore;
        RefIdFactory<TransferData> refIdFactory = this.refIdFactory.get();
        Intrinsics.checkNotNullExpressionValue(refIdFactory, "get(...)");
        RefIdFactory<TransferData> refIdFactory2 = refIdFactory;
        RefIdFactory<BigDecimal> refIdFactory3 = this.refIdFactoryForRfp.get();
        Intrinsics.checkNotNullExpressionValue(refIdFactory3, "get(...)");
        RefIdFactory<BigDecimal> refIdFactory4 = refIdFactory3;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AccountProvider accountProvider2 = accountProvider;
        IacUpsellStore iacUpsellStore = this.iacUpsellStore.get();
        Intrinsics.checkNotNullExpressionValue(iacUpsellStore, "get(...)");
        IacUpsellStore iacUpsellStore2 = iacUpsellStore;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        MicrogramManager microgramManager2 = microgramManager;
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore2 = baseSortingHatStore;
        StringPreference stringPreference = this.defaultAchRelationshipPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = stringPreference;
        BillyMaysService billyMaysService = this.billyMaysService.get();
        Intrinsics.checkNotNullExpressionValue(billyMaysService, "get(...)");
        BillyMaysService billyMaysService2 = billyMaysService;
        GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore = this.goldDepositBoostMaxAwarenessStore.get();
        Intrinsics.checkNotNullExpressionValue(goldDepositBoostMaxAwarenessStore, "get(...)");
        GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore2 = goldDepositBoostMaxAwarenessStore;
        BffMoneyMovementService bffMoneyMovementService = this.bffMoneyMovementService.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        BffMoneyMovementService bffMoneyMovementService2 = bffMoneyMovementService;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        LazyMoshi lazyMoshi2 = lazyMoshi;
        WonkaServiceManager wonkaServiceManager = this.wonkaServiceManager.get();
        Intrinsics.checkNotNullExpressionValue(wonkaServiceManager, "get(...)");
        WonkaServiceManager wonkaServiceManager2 = wonkaServiceManager;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CreateTransferDuxo createTransferDuxoNewInstance = companion.newInstance(transfersBonfireApi, retirementTransfersApi, transferAccountStore, transferLimitsStore, transferWireAccountStore, traderMarketHoursManager, balancesStore, eventLogger, persistentCacheManager, traderPortfolioStore, rhyAccountStore, rothConversionStore, stripeStore, cardManager2, transferValidator2, experimentsStore2, suvWorkflowManager2, cryptoPendingAndCancelStore2, refIdFactory2, refIdFactory4, accountProvider2, iacUpsellStore2, microgramManager2, baseSortingHatStore2, stringPreference2, billyMaysService2, goldDepositBoostMaxAwarenessStore2, bffMoneyMovementService2, lazyMoshi2, wonkaServiceManager2, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(createTransferDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(createTransferDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(createTransferDuxoNewInstance, rxGlobalErrorHandler);
        return createTransferDuxoNewInstance;
    }

    /* compiled from: CreateTransferDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jú\u0003\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\u0017\u0010+\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020-0,¢\u0006\u0002\b.0\u00072\u0017\u0010/\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u0002000,¢\u0006\u0002\b.0\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00072\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00072\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00072\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00072\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00072\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00072\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00072\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0007H\u0007J\u0096\u0002\u0010M\u001a\u00020N2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020-0,¢\u0006\u0002\b.2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u0002000,¢\u0006\u0002\b.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0007¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo_Factory;", "transfersBonfireApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "retirementTransfersApi", "Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rothConversionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "cryptoPendingAndCancelStore", "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "Lkotlin/jvm/JvmSuppressWildcards;", "refIdFactoryForRfp", "Ljava/math/BigDecimal;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "billyMaysService", "Lbilly_mays/service/v1/BillyMaysService;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CreateTransferDuxo_Factory create(Provider<TransfersBonfireApi> transfersBonfireApi, Provider<RetirementTransfersApi> retirementTransfersApi, Provider<TransferAccountStore> transferAccountStore, Provider<TransferLimitsStore> transferLimitsStore, Provider<TransferWireAccountStore> transferWireAccountStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<BalancesStore> balancesStore, Provider<EventLogger> eventLogger, Provider<PersistentCacheManager> persistentCacheManager, Provider<TraderPortfolioStore> portfolioStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RothConversionStore> rothConversionStore, Provider<StripeStore> stripeStore, Provider<CardManager> cardManager, Provider<TransferValidator> validator, Provider<ExperimentsStore> experimentsStore, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<CryptoPendingAndCancelStore> cryptoPendingAndCancelStore, Provider<RefIdFactory<TransferData>> refIdFactory, Provider<RefIdFactory<BigDecimal>> refIdFactoryForRfp, Provider<AccountProvider> accountProvider, Provider<IacUpsellStore> iacUpsellStore, Provider<MicrogramManager> microgramManager, Provider<BaseSortingHatStore> sortingHatStore, Provider<StringPreference> defaultAchRelationshipPref, Provider<BillyMaysService> billyMaysService, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<BffMoneyMovementService> bffMoneyMovementService, Provider<LazyMoshi> moshi, Provider<WonkaServiceManager> wonkaServiceManager, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(refIdFactoryForRfp, "refIdFactoryForRfp");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
            Intrinsics.checkNotNullParameter(billyMaysService, "billyMaysService");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new CreateTransferDuxo_Factory(transfersBonfireApi, retirementTransfersApi, transferAccountStore, transferLimitsStore, transferWireAccountStore, marketHoursManager, balancesStore, eventLogger, persistentCacheManager, portfolioStore, rhyAccountStore, rothConversionStore, stripeStore, cardManager, validator, experimentsStore, suvWorkflowManager, cryptoPendingAndCancelStore, refIdFactory, refIdFactoryForRfp, accountProvider, iacUpsellStore, microgramManager, sortingHatStore, defaultAchRelationshipPref, billyMaysService, goldDepositBoostMaxAwarenessStore, bffMoneyMovementService, moshi, wonkaServiceManager, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final CreateTransferDuxo newInstance(TransfersBonfireApi transfersBonfireApi, RetirementTransfersApi retirementTransfersApi, TransferAccountStore transferAccountStore, TransferLimitsStore transferLimitsStore, TransferWireAccountStore transferWireAccountStore, TraderMarketHoursManager marketHoursManager, BalancesStore balancesStore, EventLogger eventLogger, PersistentCacheManager persistentCacheManager, TraderPortfolioStore portfolioStore, RhyAccountStore rhyAccountStore, RothConversionStore rothConversionStore, StripeStore stripeStore, CardManager cardManager, TransferValidator validator, ExperimentsStore experimentsStore, SuvWorkflowManager suvWorkflowManager, CryptoPendingAndCancelStore cryptoPendingAndCancelStore, RefIdFactory<TransferData> refIdFactory, RefIdFactory<BigDecimal> refIdFactoryForRfp, AccountProvider accountProvider, IacUpsellStore iacUpsellStore, MicrogramManager microgramManager, BaseSortingHatStore sortingHatStore, StringPreference defaultAchRelationshipPref, BillyMaysService billyMaysService, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, BffMoneyMovementService bffMoneyMovementService, LazyMoshi moshi, WonkaServiceManager wonkaServiceManager, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
            Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
            Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
            Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
            Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
            Intrinsics.checkNotNullParameter(refIdFactoryForRfp, "refIdFactoryForRfp");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
            Intrinsics.checkNotNullParameter(billyMaysService, "billyMaysService");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CreateTransferDuxo(transfersBonfireApi, retirementTransfersApi, transferAccountStore, transferLimitsStore, transferWireAccountStore, marketHoursManager, balancesStore, eventLogger, persistentCacheManager, portfolioStore, rhyAccountStore, rothConversionStore, stripeStore, cardManager, validator, experimentsStore, suvWorkflowManager, cryptoPendingAndCancelStore, refIdFactory, refIdFactoryForRfp, accountProvider, iacUpsellStore, microgramManager, sortingHatStore, defaultAchRelationshipPref, billyMaysService, goldDepositBoostMaxAwarenessStore, bffMoneyMovementService, moshi, wonkaServiceManager, savedStateHandle);
        }
    }
}
