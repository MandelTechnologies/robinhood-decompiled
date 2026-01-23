package com.robinhood.android.cash.rhy.tab.p077v2;

import android.app.Application;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhsNoaRedirectStore;
import com.robinhood.librobinhood.data.store.RhyReferralEligibilityStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaycheckModuleStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: RhyOverviewV2Duxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IBã\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0003\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0003\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0003\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0003\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0003\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0003\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0003\u0012\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0003¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0002H\u0016¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010HR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010HR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010HR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010HR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010HR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010HR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010HR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010HR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010HR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010HR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010HR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010HR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010HR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010HR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010HR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010HR\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010HR\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010HR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010HR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010HR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010HR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010HR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010HR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010H¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo;", "Ljavax/inject/Provider;", "Landroid/app/Application;", "app", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "rhySuvManger", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "directDepositSwitchStatusStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "roundupEnrollmentStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "iacInfoBannerStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckModuleStore;", "paycheckModuleStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "merchantOfferStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "matchaTreatmentStore", "Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;", "rhsNoaRedirectStore", "Lcom/robinhood/contentful/StaticContentStore;", "staticContentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralEligibilityStore", "", "packageName", "Lcom/robinhood/prefs/BooleanPreference;", "showRhyFundingBottomSheetPref", "addToGooglePayTappedPref", "rhyHasSeenFixedPercentPopupPref", "hasVisitedCashCushionUpsellPref", "Lcom/robinhood/prefs/LongPreference;", "hasDismissedT60RhsNoaRedirectPref", "hasVisitedFlatCashbackUpsellPref", "j$/time/Clock", Card.Icon.CLOCK, "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo;", "Ljavax/inject/Provider;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhyOverviewV2Duxo_Factory implements Factory<RhyOverviewV2Duxo> {
    private final Provider<BooleanPreference> addToGooglePayTappedPref;
    private final Provider<Application> app;
    private final Provider<CashCushionStatusStore> cashCushionStatusStore;
    private final Provider<Clock> clock;
    private final Provider<DirectDepositRelationshipStore> directDepositRelationshipStore;
    private final Provider<DirectDepositSwitchStatusStore> directDepositSwitchStatusStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EarlyPayEnrollmentStore> earlyPayEnrollmentStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GooglePayManager> googlePayManager;
    private final Provider<LongPreference> hasDismissedT60RhsNoaRedirectPref;
    private final Provider<BooleanPreference> hasVisitedCashCushionUpsellPref;
    private final Provider<BooleanPreference> hasVisitedFlatCashbackUpsellPref;
    private final Provider<HistoryStore> historyStore;
    private final Provider<IacInfoBannerStore> iacInfoBannerStore;
    private final Provider<InboxBadgeStore> inboxBadgeStore;
    private final Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore;
    private final Provider<MatchaTreatmentStore> matchaTreatmentStore;
    private final Provider<MerchantOfferStore> merchantOfferStore;
    private final Provider<MinervaAccountStore> minervaAccountStore;
    private final Provider<String> packageName;
    private final Provider<PaycheckModuleStore> paycheckModuleStore;
    private final Provider<PaymentCardStore> paymentCardStore;
    private final Provider<RhsNoaRedirectStore> rhsNoaRedirectStore;
    private final Provider<RhyAccountStore> rhyAccountStore;
    private final Provider<BooleanPreference> rhyHasSeenFixedPercentPopupPref;
    private final Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore;
    private final Provider<RhySuvManger> rhySuvManger;
    private final Provider<RoundupEnrollmentStore> roundupEnrollmentStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<BooleanPreference> showRhyFundingBottomSheetPref;
    private final Provider<BaseSortingHatStore> sortingHatStore;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RhyOverviewV2Duxo_Factory create(Provider<Application> provider, Provider<GooglePayManager> provider2, Provider<RhySuvManger> provider3, Provider<DirectDepositSwitchStatusStore> provider4, Provider<EarlyPayEnrollmentStore> provider5, Provider<ExperimentsStore> provider6, Provider<DirectDepositRelationshipStore> provider7, Provider<MinervaAccountStore> provider8, Provider<HistoryStore> provider9, Provider<PaymentCardStore> provider10, Provider<RhyAccountStore> provider11, Provider<RoundupEnrollmentStore> provider12, Provider<IacInfoBannerStore> provider13, Provider<BaseSortingHatStore> provider14, Provider<PaycheckModuleStore> provider15, Provider<MerchantOfferStore> provider16, Provider<MatchaPendingTransactionStore> provider17, Provider<MatchaTreatmentStore> provider18, Provider<RhsNoaRedirectStore> provider19, Provider<StaticContentStore> provider20, Provider<CashCushionStatusStore> provider21, Provider<InboxBadgeStore> provider22, Provider<RhyReferralEligibilityStore> provider23, Provider<String> provider24, Provider<BooleanPreference> provider25, Provider<BooleanPreference> provider26, Provider<BooleanPreference> provider27, Provider<BooleanPreference> provider28, Provider<LongPreference> provider29, Provider<BooleanPreference> provider30, Provider<Clock> provider31, Provider<DispatcherProvider> provider32, Provider<RxFactory> provider33, Provider<RxGlobalErrorHandler> provider34) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34);
    }

    @JvmStatic
    public static final RhyOverviewV2Duxo newInstance(Application application, GooglePayManager googlePayManager, RhySuvManger rhySuvManger, DirectDepositSwitchStatusStore directDepositSwitchStatusStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, ExperimentsStore experimentsStore, DirectDepositRelationshipStore directDepositRelationshipStore, MinervaAccountStore minervaAccountStore, HistoryStore historyStore, PaymentCardStore paymentCardStore, RhyAccountStore rhyAccountStore, RoundupEnrollmentStore roundupEnrollmentStore, IacInfoBannerStore iacInfoBannerStore, BaseSortingHatStore baseSortingHatStore, PaycheckModuleStore paycheckModuleStore, MerchantOfferStore merchantOfferStore, MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTreatmentStore matchaTreatmentStore, RhsNoaRedirectStore rhsNoaRedirectStore, StaticContentStore staticContentStore, CashCushionStatusStore cashCushionStatusStore, InboxBadgeStore inboxBadgeStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, String str, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, BooleanPreference booleanPreference4, LongPreference longPreference, BooleanPreference booleanPreference5, Clock clock) {
        return INSTANCE.newInstance(application, googlePayManager, rhySuvManger, directDepositSwitchStatusStore, earlyPayEnrollmentStore, experimentsStore, directDepositRelationshipStore, minervaAccountStore, historyStore, paymentCardStore, rhyAccountStore, roundupEnrollmentStore, iacInfoBannerStore, baseSortingHatStore, paycheckModuleStore, merchantOfferStore, matchaPendingTransactionStore, matchaTreatmentStore, rhsNoaRedirectStore, staticContentStore, cashCushionStatusStore, inboxBadgeStore, rhyReferralEligibilityStore, str, booleanPreference, booleanPreference2, booleanPreference3, booleanPreference4, longPreference, booleanPreference5, clock);
    }

    public RhyOverviewV2Duxo_Factory(Provider<Application> app, Provider<GooglePayManager> googlePayManager, Provider<RhySuvManger> rhySuvManger, Provider<DirectDepositSwitchStatusStore> directDepositSwitchStatusStore, Provider<EarlyPayEnrollmentStore> earlyPayEnrollmentStore, Provider<ExperimentsStore> experimentsStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<HistoryStore> historyStore, Provider<PaymentCardStore> paymentCardStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<PaycheckModuleStore> paycheckModuleStore, Provider<MerchantOfferStore> merchantOfferStore, Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<RhsNoaRedirectStore> rhsNoaRedirectStore, Provider<StaticContentStore> staticContentStore, Provider<CashCushionStatusStore> cashCushionStatusStore, Provider<InboxBadgeStore> inboxBadgeStore, Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore, Provider<String> packageName, Provider<BooleanPreference> showRhyFundingBottomSheetPref, Provider<BooleanPreference> addToGooglePayTappedPref, Provider<BooleanPreference> rhyHasSeenFixedPercentPopupPref, Provider<BooleanPreference> hasVisitedCashCushionUpsellPref, Provider<LongPreference> hasDismissedT60RhsNoaRedirectPref, Provider<BooleanPreference> hasVisitedFlatCashbackUpsellPref, Provider<Clock> clock, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
        Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(paycheckModuleStore, "paycheckModuleStore");
        Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
        Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
        Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
        Intrinsics.checkNotNullParameter(rhsNoaRedirectStore, "rhsNoaRedirectStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
        Intrinsics.checkNotNullParameter(addToGooglePayTappedPref, "addToGooglePayTappedPref");
        Intrinsics.checkNotNullParameter(rhyHasSeenFixedPercentPopupPref, "rhyHasSeenFixedPercentPopupPref");
        Intrinsics.checkNotNullParameter(hasVisitedCashCushionUpsellPref, "hasVisitedCashCushionUpsellPref");
        Intrinsics.checkNotNullParameter(hasDismissedT60RhsNoaRedirectPref, "hasDismissedT60RhsNoaRedirectPref");
        Intrinsics.checkNotNullParameter(hasVisitedFlatCashbackUpsellPref, "hasVisitedFlatCashbackUpsellPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.app = app;
        this.googlePayManager = googlePayManager;
        this.rhySuvManger = rhySuvManger;
        this.directDepositSwitchStatusStore = directDepositSwitchStatusStore;
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
        this.experimentsStore = experimentsStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.minervaAccountStore = minervaAccountStore;
        this.historyStore = historyStore;
        this.paymentCardStore = paymentCardStore;
        this.rhyAccountStore = rhyAccountStore;
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.sortingHatStore = sortingHatStore;
        this.paycheckModuleStore = paycheckModuleStore;
        this.merchantOfferStore = merchantOfferStore;
        this.matchaPendingTransactionStore = matchaPendingTransactionStore;
        this.matchaTreatmentStore = matchaTreatmentStore;
        this.rhsNoaRedirectStore = rhsNoaRedirectStore;
        this.staticContentStore = staticContentStore;
        this.cashCushionStatusStore = cashCushionStatusStore;
        this.inboxBadgeStore = inboxBadgeStore;
        this.rhyReferralEligibilityStore = rhyReferralEligibilityStore;
        this.packageName = packageName;
        this.showRhyFundingBottomSheetPref = showRhyFundingBottomSheetPref;
        this.addToGooglePayTappedPref = addToGooglePayTappedPref;
        this.rhyHasSeenFixedPercentPopupPref = rhyHasSeenFixedPercentPopupPref;
        this.hasVisitedCashCushionUpsellPref = hasVisitedCashCushionUpsellPref;
        this.hasDismissedT60RhsNoaRedirectPref = hasDismissedT60RhsNoaRedirectPref;
        this.hasVisitedFlatCashbackUpsellPref = hasVisitedFlatCashbackUpsellPref;
        this.clock = clock;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RhyOverviewV2Duxo get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        GooglePayManager googlePayManager = this.googlePayManager.get();
        Intrinsics.checkNotNullExpressionValue(googlePayManager, "get(...)");
        RhySuvManger rhySuvManger = this.rhySuvManger.get();
        Intrinsics.checkNotNullExpressionValue(rhySuvManger, "get(...)");
        DirectDepositSwitchStatusStore directDepositSwitchStatusStore = this.directDepositSwitchStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositSwitchStatusStore, "get(...)");
        EarlyPayEnrollmentStore earlyPayEnrollmentStore = this.earlyPayEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(earlyPayEnrollmentStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore.get();
        Intrinsics.checkNotNullExpressionValue(directDepositRelationshipStore, "get(...)");
        MinervaAccountStore minervaAccountStore = this.minervaAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(minervaAccountStore, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        PaymentCardStore paymentCardStore = this.paymentCardStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentCardStore, "get(...)");
        RhyAccountStore rhyAccountStore = this.rhyAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyAccountStore, "get(...)");
        RoundupEnrollmentStore roundupEnrollmentStore = this.roundupEnrollmentStore.get();
        Intrinsics.checkNotNullExpressionValue(roundupEnrollmentStore, "get(...)");
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore.get();
        Intrinsics.checkNotNullExpressionValue(baseSortingHatStore, "get(...)");
        BaseSortingHatStore baseSortingHatStore2 = baseSortingHatStore;
        PaycheckModuleStore paycheckModuleStore = this.paycheckModuleStore.get();
        Intrinsics.checkNotNullExpressionValue(paycheckModuleStore, "get(...)");
        PaycheckModuleStore paycheckModuleStore2 = paycheckModuleStore;
        MerchantOfferStore merchantOfferStore = this.merchantOfferStore.get();
        Intrinsics.checkNotNullExpressionValue(merchantOfferStore, "get(...)");
        MerchantOfferStore merchantOfferStore2 = merchantOfferStore;
        MatchaPendingTransactionStore matchaPendingTransactionStore = this.matchaPendingTransactionStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaPendingTransactionStore, "get(...)");
        MatchaPendingTransactionStore matchaPendingTransactionStore2 = matchaPendingTransactionStore;
        MatchaTreatmentStore matchaTreatmentStore = this.matchaTreatmentStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTreatmentStore, "get(...)");
        MatchaTreatmentStore matchaTreatmentStore2 = matchaTreatmentStore;
        RhsNoaRedirectStore rhsNoaRedirectStore = this.rhsNoaRedirectStore.get();
        Intrinsics.checkNotNullExpressionValue(rhsNoaRedirectStore, "get(...)");
        RhsNoaRedirectStore rhsNoaRedirectStore2 = rhsNoaRedirectStore;
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        StaticContentStore staticContentStore2 = staticContentStore;
        CashCushionStatusStore cashCushionStatusStore = this.cashCushionStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(cashCushionStatusStore, "get(...)");
        CashCushionStatusStore cashCushionStatusStore2 = cashCushionStatusStore;
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(inboxBadgeStore, "get(...)");
        InboxBadgeStore inboxBadgeStore2 = inboxBadgeStore;
        RhyReferralEligibilityStore rhyReferralEligibilityStore = this.rhyReferralEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(rhyReferralEligibilityStore, "get(...)");
        RhyReferralEligibilityStore rhyReferralEligibilityStore2 = rhyReferralEligibilityStore;
        String str = this.packageName.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String str2 = str;
        BooleanPreference booleanPreference = this.showRhyFundingBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.addToGooglePayTappedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        BooleanPreference booleanPreference5 = this.rhyHasSeenFixedPercentPopupPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        BooleanPreference booleanPreference6 = booleanPreference5;
        BooleanPreference booleanPreference7 = this.hasVisitedCashCushionUpsellPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference7, "get(...)");
        BooleanPreference booleanPreference8 = booleanPreference7;
        LongPreference longPreference = this.hasDismissedT60RhsNoaRedirectPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        LongPreference longPreference2 = longPreference;
        BooleanPreference booleanPreference9 = this.hasVisitedFlatCashbackUpsellPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference9, "get(...)");
        BooleanPreference booleanPreference10 = booleanPreference9;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        RhyOverviewV2Duxo rhyOverviewV2DuxoNewInstance = companion.newInstance(application, googlePayManager, rhySuvManger, directDepositSwitchStatusStore, earlyPayEnrollmentStore, experimentsStore, directDepositRelationshipStore, minervaAccountStore, historyStore, paymentCardStore, rhyAccountStore, roundupEnrollmentStore, iacInfoBannerStore, baseSortingHatStore2, paycheckModuleStore2, merchantOfferStore2, matchaPendingTransactionStore2, matchaTreatmentStore2, rhsNoaRedirectStore2, staticContentStore2, cashCushionStatusStore2, inboxBadgeStore2, rhyReferralEligibilityStore2, str2, booleanPreference2, booleanPreference4, booleanPreference6, booleanPreference8, longPreference2, booleanPreference10, clock);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rhyOverviewV2DuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rhyOverviewV2DuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rhyOverviewV2DuxoNewInstance, rxGlobalErrorHandler);
        return rhyOverviewV2DuxoNewInstance;
    }

    /* compiled from: RhyOverviewV2Duxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jë\u0003\u0010F\u001a\u00020E2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00109\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0004H\u0007¢\u0006\u0004\bF\u0010GJ\u0087\u0002\u0010I\u001a\u00020H2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u00108\u001a\u0002052\u0006\u00109\u001a\u0002052\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u0002052\u0006\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\bI\u0010J¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroid/app/Application;", "app", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "rhySuvManger", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "directDepositSwitchStatusStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "roundupEnrollmentStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "iacInfoBannerStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckModuleStore;", "paycheckModuleStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "merchantOfferStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "matchaTreatmentStore", "Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;", "rhsNoaRedirectStore", "Lcom/robinhood/contentful/StaticContentStore;", "staticContentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralEligibilityStore", "", "packageName", "Lcom/robinhood/prefs/BooleanPreference;", "showRhyFundingBottomSheetPref", "addToGooglePayTappedPref", "rhyHasSeenFixedPercentPopupPref", "hasVisitedCashCushionUpsellPref", "Lcom/robinhood/prefs/LongPreference;", "hasDismissedT60RhsNoaRedirectPref", "hasVisitedFlatCashbackUpsellPref", "j$/time/Clock", Card.Icon.CLOCK, "Ldispatch/core/DispatcherProvider;", "dispatcherProvider", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "rxGlobalErrorHandler", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo_Factory;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo;", "newInstance", "(Landroid/app/Application;Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckModuleStore;Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;Ljava/lang/String;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;)Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhyOverviewV2Duxo_Factory create(Provider<Application> app, Provider<GooglePayManager> googlePayManager, Provider<RhySuvManger> rhySuvManger, Provider<DirectDepositSwitchStatusStore> directDepositSwitchStatusStore, Provider<EarlyPayEnrollmentStore> earlyPayEnrollmentStore, Provider<ExperimentsStore> experimentsStore, Provider<DirectDepositRelationshipStore> directDepositRelationshipStore, Provider<MinervaAccountStore> minervaAccountStore, Provider<HistoryStore> historyStore, Provider<PaymentCardStore> paymentCardStore, Provider<RhyAccountStore> rhyAccountStore, Provider<RoundupEnrollmentStore> roundupEnrollmentStore, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<BaseSortingHatStore> sortingHatStore, Provider<PaycheckModuleStore> paycheckModuleStore, Provider<MerchantOfferStore> merchantOfferStore, Provider<MatchaPendingTransactionStore> matchaPendingTransactionStore, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<RhsNoaRedirectStore> rhsNoaRedirectStore, Provider<StaticContentStore> staticContentStore, Provider<CashCushionStatusStore> cashCushionStatusStore, Provider<InboxBadgeStore> inboxBadgeStore, Provider<RhyReferralEligibilityStore> rhyReferralEligibilityStore, Provider<String> packageName, Provider<BooleanPreference> showRhyFundingBottomSheetPref, Provider<BooleanPreference> addToGooglePayTappedPref, Provider<BooleanPreference> rhyHasSeenFixedPercentPopupPref, Provider<BooleanPreference> hasVisitedCashCushionUpsellPref, Provider<LongPreference> hasDismissedT60RhsNoaRedirectPref, Provider<BooleanPreference> hasVisitedFlatCashbackUpsellPref, Provider<Clock> clock, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
            Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
            Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(paycheckModuleStore, "paycheckModuleStore");
            Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
            Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(rhsNoaRedirectStore, "rhsNoaRedirectStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
            Intrinsics.checkNotNullParameter(addToGooglePayTappedPref, "addToGooglePayTappedPref");
            Intrinsics.checkNotNullParameter(rhyHasSeenFixedPercentPopupPref, "rhyHasSeenFixedPercentPopupPref");
            Intrinsics.checkNotNullParameter(hasVisitedCashCushionUpsellPref, "hasVisitedCashCushionUpsellPref");
            Intrinsics.checkNotNullParameter(hasDismissedT60RhsNoaRedirectPref, "hasDismissedT60RhsNoaRedirectPref");
            Intrinsics.checkNotNullParameter(hasVisitedFlatCashbackUpsellPref, "hasVisitedFlatCashbackUpsellPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RhyOverviewV2Duxo_Factory(app, googlePayManager, rhySuvManger, directDepositSwitchStatusStore, earlyPayEnrollmentStore, experimentsStore, directDepositRelationshipStore, minervaAccountStore, historyStore, paymentCardStore, rhyAccountStore, roundupEnrollmentStore, iacInfoBannerStore, sortingHatStore, paycheckModuleStore, merchantOfferStore, matchaPendingTransactionStore, matchaTreatmentStore, rhsNoaRedirectStore, staticContentStore, cashCushionStatusStore, inboxBadgeStore, rhyReferralEligibilityStore, packageName, showRhyFundingBottomSheetPref, addToGooglePayTappedPref, rhyHasSeenFixedPercentPopupPref, hasVisitedCashCushionUpsellPref, hasDismissedT60RhsNoaRedirectPref, hasVisitedFlatCashbackUpsellPref, clock, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RhyOverviewV2Duxo newInstance(Application app, GooglePayManager googlePayManager, RhySuvManger rhySuvManger, DirectDepositSwitchStatusStore directDepositSwitchStatusStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, ExperimentsStore experimentsStore, DirectDepositRelationshipStore directDepositRelationshipStore, MinervaAccountStore minervaAccountStore, HistoryStore historyStore, PaymentCardStore paymentCardStore, RhyAccountStore rhyAccountStore, RoundupEnrollmentStore roundupEnrollmentStore, IacInfoBannerStore iacInfoBannerStore, BaseSortingHatStore sortingHatStore, PaycheckModuleStore paycheckModuleStore, MerchantOfferStore merchantOfferStore, MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTreatmentStore matchaTreatmentStore, RhsNoaRedirectStore rhsNoaRedirectStore, StaticContentStore staticContentStore, CashCushionStatusStore cashCushionStatusStore, InboxBadgeStore inboxBadgeStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, String packageName, BooleanPreference showRhyFundingBottomSheetPref, BooleanPreference addToGooglePayTappedPref, BooleanPreference rhyHasSeenFixedPercentPopupPref, BooleanPreference hasVisitedCashCushionUpsellPref, LongPreference hasDismissedT60RhsNoaRedirectPref, BooleanPreference hasVisitedFlatCashbackUpsellPref, Clock clock) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
            Intrinsics.checkNotNullParameter(rhySuvManger, "rhySuvManger");
            Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
            Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
            Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
            Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
            Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
            Intrinsics.checkNotNullParameter(paycheckModuleStore, "paycheckModuleStore");
            Intrinsics.checkNotNullParameter(merchantOfferStore, "merchantOfferStore");
            Intrinsics.checkNotNullParameter(matchaPendingTransactionStore, "matchaPendingTransactionStore");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(rhsNoaRedirectStore, "rhsNoaRedirectStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(cashCushionStatusStore, "cashCushionStatusStore");
            Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
            Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
            Intrinsics.checkNotNullParameter(addToGooglePayTappedPref, "addToGooglePayTappedPref");
            Intrinsics.checkNotNullParameter(rhyHasSeenFixedPercentPopupPref, "rhyHasSeenFixedPercentPopupPref");
            Intrinsics.checkNotNullParameter(hasVisitedCashCushionUpsellPref, "hasVisitedCashCushionUpsellPref");
            Intrinsics.checkNotNullParameter(hasDismissedT60RhsNoaRedirectPref, "hasDismissedT60RhsNoaRedirectPref");
            Intrinsics.checkNotNullParameter(hasVisitedFlatCashbackUpsellPref, "hasVisitedFlatCashbackUpsellPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new RhyOverviewV2Duxo(app, googlePayManager, rhySuvManger, directDepositSwitchStatusStore, earlyPayEnrollmentStore, experimentsStore, directDepositRelationshipStore, minervaAccountStore, historyStore, paymentCardStore, rhyAccountStore, roundupEnrollmentStore, iacInfoBannerStore, sortingHatStore, paycheckModuleStore, merchantOfferStore, matchaPendingTransactionStore, matchaTreatmentStore, rhsNoaRedirectStore, staticContentStore, cashCushionStatusStore, inboxBadgeStore, rhyReferralEligibilityStore, packageName, showRhyFundingBottomSheetPref, addToGooglePayTappedPref, rhyHasSeenFixedPercentPopupPref, hasVisitedCashCushionUpsellPref, hasDismissedT60RhsNoaRedirectPref, hasVisitedFlatCashbackUpsellPref, clock);
        }
    }
}
