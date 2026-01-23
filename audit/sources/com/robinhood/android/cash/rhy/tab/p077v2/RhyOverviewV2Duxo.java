package com.robinhood.android.cash.rhy.tab.p077v2;

import android.app.Application;
import android.content.Context;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.cash.cushion.annotation.HasVisitedCashCushionUpsellPref;
import com.robinhood.android.cash.rhy.tab.p077v2.RhyOverviewV2Duxo;
import com.robinhood.android.cash.rhy.tab.p077v2.RhyOverviewV2ViewState;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.RhyHasSeenFixedPercentPopupPref;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.android.store.matcha.MatchaPendingTransactionStore;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.HasDismissedT60RhsNoaRedirectPref;
import com.robinhood.librobinhood.data.prefs.HasVisitedFlatCashbackUpsellPref;
import com.robinhood.librobinhood.data.store.BottomSheetDedupeExperiment;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.MerchantOfferStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.P2pUpsellExperiment;
import com.robinhood.librobinhood.data.store.RhsNoaRedirectStore;
import com.robinhood.librobinhood.data.store.RhyFlatCashbackExperiment;
import com.robinhood.librobinhood.data.store.RhyReferralEligibilityStore;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaycheckModuleStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore9;
import com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.InboxBadge;
import com.robinhood.models.p320db.bonfire.CashCushionStatus;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyPaycheckModule;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.models.p320db.matcha.MatchaPendingTransaction;
import com.robinhood.models.p320db.matcha.MatchaTreatment;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p355ui.bonfire.rhy.RhsNoaRedirectStatus;
import com.robinhood.models.p355ui.matcha.UiMatchaPendingTransaction4;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.annotation.AddToGooglePayTappedPref;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.staticcontent.model.MobileContentPage;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: RhyOverviewV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0002\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\b\b\u0001\u00102\u001a\u000201\u0012\b\b\u0001\u00104\u001a\u000203\u0012\b\b\u0001\u00105\u001a\u000203\u0012\b\b\u0001\u00106\u001a\u000203\u0012\b\b\u0001\u00107\u001a\u000203\u0012\b\b\u0001\u00109\u001a\u000208\u0012\b\b\u0001\u0010:\u001a\u000203\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020?H\u0016¢\u0006\u0004\bB\u0010AJ\u0015\u0010D\u001a\u00020?2\u0006\u0010C\u001a\u000201¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020?H\u0016¢\u0006\u0004\bF\u0010AJ\u0015\u0010I\u001a\u00020?2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020?¢\u0006\u0004\bK\u0010AJ\r\u0010L\u001a\u00020?¢\u0006\u0004\bL\u0010AJ\r\u0010M\u001a\u00020?¢\u0006\u0004\bM\u0010AJ\r\u0010N\u001a\u00020?¢\u0006\u0004\bN\u0010AJ\u001d\u0010S\u001a\u00020?2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020?2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020?¢\u0006\u0004\bW\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010XR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010YR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ZR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010[R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\\R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010]R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010^R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010_R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010`R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010aR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010bR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010fR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010gR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010hR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010iR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010jR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010kR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010lR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010mR\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010nR\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010oR\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010oR\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010oR\u0014\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010oR\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010pR\u0014\u0010:\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010oR\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010q\u001a\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006w"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState;", "Landroid/app/Application;", "app", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "rhySuvManger", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "directDepositSwitchStatusStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "minervaAccountStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "roundupEnrollmentStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "iacInfoBannerStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckModuleStore;", "paycheckModuleStore", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "merchantOfferStore", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "matchaPendingTransactionStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "matchaTreatmentStore", "Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;", "rhsNoaRedirectStore", "Lcom/robinhood/contentful/StaticContentStore;", "staticContentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "cashCushionStatusStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralEligibilityStore", "", "packageName", "Lcom/robinhood/prefs/BooleanPreference;", "showRhyFundingBottomSheetPref", "addToGooglePayTappedPref", "rhyHasSeenFixedPercentPopupPref", "hasVisitedCashCushionUpsellPref", "Lcom/robinhood/prefs/LongPreference;", "hasDismissedT60RhsNoaRedirectPref", "hasVisitedFlatCashbackUpsellPref", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Landroid/app/Application;Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckModuleStore;Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;Ljava/lang/String;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;)V", "", "loadDebitCard", "()V", "onCreate", "contentfulId", "getContentForBottomSheetOffers", "(Ljava/lang/String;)V", "onStart", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "offer", "radTransferComplete", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)V", "showHistoryExperience", "updateGooglePayData", "getPushTokenizeEvent", "debugOnlyAddToGoogleWallet", "Ljava/util/UUID;", "receiptUuid", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "action", "tapInfoBanner", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;)V", "dismissInfoBanner", "(Ljava/util/UUID;)V", "animateScrollToTop", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "Lcom/robinhood/shared/store/history/HistoryStore;", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckModuleStore;", "Lcom/robinhood/librobinhood/data/store/MerchantOfferStore;", "Lcom/robinhood/android/store/matcha/MatchaPendingTransactionStore;", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "Lcom/robinhood/librobinhood/data/store/RhsNoaRedirectStore;", "Lcom/robinhood/contentful/StaticContentStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/CashCushionStatusStore;", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "Ljava/lang/String;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/prefs/LongPreference;", "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "", "isGetPushTokenizeRequestInFlight", "Z", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyOverviewV2Duxo extends OldBaseDuxo<RhyOverviewV2ViewState> {
    public static final int $stable = 8;
    private final BooleanPreference addToGooglePayTappedPref;
    private final CashCushionStatusStore cashCushionStatusStore;
    private final Clock clock;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final DirectDepositSwitchStatusStore directDepositSwitchStatusStore;
    private final EarlyPayEnrollmentStore earlyPayEnrollmentStore;
    private final ExperimentsStore experimentsStore;
    private final GooglePayManager googlePayManager;
    private final LongPreference hasDismissedT60RhsNoaRedirectPref;
    private final BooleanPreference hasVisitedCashCushionUpsellPref;
    private final BooleanPreference hasVisitedFlatCashbackUpsellPref;
    private final HistoryStore historyStore;
    private final IacInfoBannerStore iacInfoBannerStore;
    private final InboxBadgeStore inboxBadgeStore;
    private boolean isGetPushTokenizeRequestInFlight;
    private final MatchaPendingTransactionStore matchaPendingTransactionStore;
    private final MatchaTreatmentStore matchaTreatmentStore;
    private final MerchantOfferStore merchantOfferStore;
    private final MinervaAccountStore minervaAccountStore;
    private final String packageName;
    private final PaycheckModuleStore paycheckModuleStore;
    private final PaymentCardStore paymentCardStore;
    private final RhsNoaRedirectStore rhsNoaRedirectStore;
    private final RhyAccountStore rhyAccountStore;
    private final BooleanPreference rhyHasSeenFixedPercentPopupPref;
    private final RhyReferralEligibilityStore rhyReferralEligibilityStore;
    private final RhySuvManger rhySuvManger;
    private final RoundupEnrollmentStore roundupEnrollmentStore;
    private final BooleanPreference showRhyFundingBottomSheetPref;
    private final BaseSortingHatStore sortingHatStore;
    private final StaticContentStore staticContentStore;

    public final Clock getClock() {
        return this.clock;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RhyOverviewV2Duxo(Application app, GooglePayManager googlePayManager, RhySuvManger rhySuvManger, DirectDepositSwitchStatusStore directDepositSwitchStatusStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, ExperimentsStore experimentsStore, DirectDepositRelationshipStore directDepositRelationshipStore, MinervaAccountStore minervaAccountStore, HistoryStore historyStore, PaymentCardStore paymentCardStore, RhyAccountStore rhyAccountStore, RoundupEnrollmentStore roundupEnrollmentStore, IacInfoBannerStore iacInfoBannerStore, BaseSortingHatStore sortingHatStore, PaycheckModuleStore paycheckModuleStore, MerchantOfferStore merchantOfferStore, MatchaPendingTransactionStore matchaPendingTransactionStore, MatchaTreatmentStore matchaTreatmentStore, RhsNoaRedirectStore rhsNoaRedirectStore, StaticContentStore staticContentStore, CashCushionStatusStore cashCushionStatusStore, InboxBadgeStore inboxBadgeStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, @ApplicationPackageInfoModule2 String packageName, @ShowRhyFundingBottomSheetPref BooleanPreference showRhyFundingBottomSheetPref, @AddToGooglePayTappedPref BooleanPreference addToGooglePayTappedPref, @RhyHasSeenFixedPercentPopupPref BooleanPreference rhyHasSeenFixedPercentPopupPref, @HasVisitedCashCushionUpsellPref BooleanPreference hasVisitedCashCushionUpsellPref, @HasDismissedT60RhsNoaRedirectPref LongPreference hasDismissedT60RhsNoaRedirectPref, @HasVisitedFlatCashbackUpsellPref BooleanPreference hasVisitedFlatCashbackUpsellPref, Clock clock) {
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
        GooglePlay googlePlay = GooglePlay.INSTANCE;
        Context applicationContext = app.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        super(new RhyOverviewV2ViewState(null, null, null, Boolean.valueOf(googlePlay.isSupportedByDevice(applicationContext)), null, null, null, null, null, null, null, null, null, hasDismissedT60RhsNoaRedirectPref, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, packageName, null, null, null, null, null, false, false, null, null, null, null, -8201, 8189, null), null, 2, null);
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
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.earlyPayEnrollmentStore.refresh(true);
        this.minervaAccountStore.refresh(true);
        this.roundupEnrollmentStore.refresh(true);
        this.sortingHatStore.refresh();
        this.merchantOfferStore.refresh(true);
        Observable<EarlyPayEnrollment> observableStreamEnrollment = this.earlyPayEnrollmentStore.streamEnrollment();
        final C103061 c103061 = new PropertyReference1Impl() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo.onCreate.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((EarlyPayEnrollment) obj).isEnrolled());
            }
        };
        Observable<R> map = observableStreamEnrollment.map(new Function(c103061) { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c103061, "function");
                this.function = c103061;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyHasSeenFixedPercentPopupPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.minervaAccountStore.streamAccount(ApiMinervaAccount.Type.BROKERAGE), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$5(this.f$0, (MinervaAccount) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.directDepositSwitchStatusStore.getDirectDepositSwitchStatus(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.directDepositRelationshipStore.getHasDirectDepositRelationships(RhEntity.RHY), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$9(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable observableThrottleLatest = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).doOnNext(new RhyOverviewV2Duxo2(this)).switchMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$onCreate$minervaAndRhyAccountsObservable$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<RhyAccount, Optional<MinervaAccount>>> apply(RhyAccount spendingAccount) {
                Intrinsics.checkNotNullParameter(spendingAccount, "spendingAccount");
                Observables observables = Observables.INSTANCE;
                Observable observableJust = Observable.just(spendingAccount);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                return observables.zip(observableJust, this.this$0.minervaAccountStore.streamRhyMinervaAccountOptional(spendingAccount.getId()));
            }
        }).share().distinctUntilChanged().map(new C103077()).throttleLatest(350L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableThrottleLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$11(this.f$0, (Pager) obj);
            }
        });
        Observable<RoundupEnrollment> observableDistinctUntilChanged = this.roundupEnrollmentStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$13(this.f$0, (RoundupEnrollment) obj);
            }
        });
        loadDebitCard();
        LifecycleHost.DefaultImpls.bind$default(this, IacInfoBannerStore.streamBatch$default(this.iacInfoBannerStore, CollectionsKt.listOf(IacInfoBannerLocation.INFO_BANNER_RHY_PAGE_TOP_LEVEL), null, null, null, null, null, null, null, null, null, null, 2046, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$15(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.showRhyFundingBottomSheetPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$18(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.hasVisitedCashCushionUpsellPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$20(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.addToGooglePayTappedPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$22(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, QueryKt.asObservable(this.sortingHatStore.streamUserState()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$24(this.f$0, (SortingHatUserState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.paycheckModuleStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$26(this.f$0, (Optional) obj);
            }
        });
        Observable<List<MerchantOfferV2>> observableDistinctUntilChanged2 = this.merchantOfferStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$28(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.merchantOfferStore.getDebitSpendOffers(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$30(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaTreatmentStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$32(this.f$0, (MatchaTreatment) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, MatchaPendingTransactionStore.stream$default(this.matchaPendingTransactionStore, false, 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$34(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{P2pUpsellExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$36(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{BottomSheetDedupeExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$38(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.rhsNoaRedirectStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$40(this.f$0, (RhsNoaRedirectStatus) obj);
            }
        });
        this.cashCushionStatusStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.cashCushionStatusStore.stream()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$42(this.f$0, (CashCushionStatus) obj);
            }
        });
        final InboxBadge latestBadgeResult = this.inboxBadgeStore.getLatestBadgeResult();
        if (latestBadgeResult != null) {
            applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewV2Duxo.onCreate$lambda$44$lambda$43(latestBadgeResult, (RhyOverviewV2ViewState) obj);
                }
            });
        }
        Observable<RhyReferralEligibility> observableDistinctUntilChanged3 = this.rhyReferralEligibilityStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$46(this.f$0, (RhyReferralEligibility) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.hasVisitedFlatCashbackUpsellPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$48(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RhyFlatCashbackExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$50(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RhyOverviewV2Duxo rhyOverviewV2Duxo, final Boolean bool) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$1$lambda$0(bool, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$1$lambda$0(Boolean bool, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : bool, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$3$lambda$2(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$3$lambda$2(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : Boolean.valueOf(z), ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : !z ? new UiEvent(Unit.INSTANCE) : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(RhyOverviewV2Duxo rhyOverviewV2Duxo, final MinervaAccount minervaAccount) {
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$5$lambda$4(minervaAccount, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$5$lambda$4(MinervaAccount minervaAccount, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : minervaAccount, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$7$lambda$6(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$7$lambda$6(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : Boolean.valueOf(z), ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$9$lambda$8(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$9$lambda$8(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : Boolean.valueOf(z), ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* compiled from: RhyOverviewV2Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$onCreate$7 */
    static final class C103077<T, R> implements Function {
        C103077() {
        }

        @Override // io.reactivex.functions.Function
        public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> apply(Tuples2<RhyAccount, ? extends Optional<MinervaAccount>> tuples2) {
            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
            RhyAccount rhyAccountComponent1 = tuples2.component1();
            final MinervaAccount orNull = tuples2.component2().getOrNull();
            RhyOverviewV2Duxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$onCreate$7$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewV2Duxo.C103077.apply$lambda$0(orNull, (RhyOverviewV2ViewState) obj);
                }
            });
            Set mutableSet = CollectionsKt.toMutableSet(SetsKt.plus(SetsKt.plus((Set<? extends HistoryTransactionType>) SetsKt.plus((Set<? extends HistoryTransactionType>) SetsKt.plus((Set<? extends HistoryTransactionType>) SetsKt.plus((Set<? extends HistoryTransactionType>) SetsKt.plus((Set<? extends HistoryTransactionType>) SetsKt.plus((Set<? extends HistoryTransactionType>) SetsKt.plus((Set<? extends HistoryTransactionType>) SetsKt.plus(SetsKt.plus((Set) HistoryFilter.DEBIT_CARD.getTransactionTypes(), (Iterable) HistoryFilter.CHECK_PAYMENTS.getTransactionTypes()), (Iterable) HistoryFilter.ROUNDUP_REWARD.getTransactionTypes()), HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER), HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER), HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER), HistoryTransactionType.NON_ORIGINATED_REDIRECTED_ACH_TRANSFER), HistoryTransactionType.MATCHA_TRANSFER), HistoryTransactionType.MERCHANT_REWARD), HistoryTransactionType.MATCHA_INCENTIVE), (Iterable) RhyTransactionStore9.getGringottsTransactionTypes()));
            HistoryStore historyStore = RhyOverviewV2Duxo.this.historyStore;
            Observable observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            Observable observableJust2 = Observable.just(CollectionsKt.toSet(mutableSet));
            Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
            Observable observableJust3 = Observable.just(Instant.EPOCH);
            Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
            return HistoryStore.buildPager$default(historyStore, observableJust, observableJust2, observableJust3, null, new HistoryStaticFilter(null, null, null, orNull != null ? orNull.getId() : null, rhyAccountComponent1.getId(), null, null, null, null, null, 999, null), new PagingConfig(5, 0, false, 0, 0, 0, 62, null), 8, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhyOverviewV2ViewState apply$lambda$0(MinervaAccount minervaAccount, RhyOverviewV2ViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : minervaAccount, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$11(RhyOverviewV2Duxo rhyOverviewV2Duxo, final Pager pager) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$11$lambda$10(pager, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$11$lambda$10(Pager pager, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : pager, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13(RhyOverviewV2Duxo rhyOverviewV2Duxo, final RoundupEnrollment roundupEnrollment) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$13$lambda$12(roundupEnrollment, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$13$lambda$12(RoundupEnrollment roundupEnrollment, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : roundupEnrollment.getState(), ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$15(RhyOverviewV2Duxo rhyOverviewV2Duxo, final List infoBanners) {
        Intrinsics.checkNotNullParameter(infoBanners, "infoBanners");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$15$lambda$14(infoBanners, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$15$lambda$14(List list, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : list, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$18$lambda$16(z, (RhyOverviewV2ViewState) obj);
            }
        });
        if (z) {
            rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewV2Duxo.onCreate$lambda$18$lambda$17((RhyOverviewV2ViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$18$lambda$16(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : Boolean.valueOf(z), ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$18$lambda$17(RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : applyMutation.isActiveAccount() ? new UiEvent(RhyOverviewV2ViewState.BottomSheetType.FundingBottomSheet.INSTANCE) : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$20(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$20$lambda$19(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$20$lambda$19(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : Boolean.valueOf(z), (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$22(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        if (z) {
            rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewV2Duxo.onCreate$lambda$22$lambda$21(z, (RhyOverviewV2ViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$22$lambda$21(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : z, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$24(RhyOverviewV2Duxo rhyOverviewV2Duxo, final SortingHatUserState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$24$lambda$23(it, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$24$lambda$23(SortingHatUserState sortingHatUserState, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : sortingHatUserState, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$26(RhyOverviewV2Duxo rhyOverviewV2Duxo, final Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$26$lambda$25(it, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$26$lambda$25(Optional optional, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : (RhyPaycheckModule) optional.getOrNull(), ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$28(RhyOverviewV2Duxo rhyOverviewV2Duxo, final List list) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$28$lambda$27(list, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$28$lambda$27(List list, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : list, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$30(RhyOverviewV2Duxo rhyOverviewV2Duxo, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final MerchantOfferV2 merchantOfferV2 = (MerchantOfferV2) CollectionsKt.firstOrNull(it);
        MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers specialSpendOffersFromOfferId = MerchantRewardsOfferDetailsBottomSheet.Companion.SpecialSpendOffers.INSTANCE.fromOfferId(String.valueOf(merchantOfferV2 != null ? merchantOfferV2.getGlobalOfferId() : null));
        final String contentfulId = specialSpendOffersFromOfferId != null ? specialSpendOffersFromOfferId.getContentfulId() : null;
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$30$lambda$29(contentfulId, merchantOfferV2, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$30$lambda$29(String str, MerchantOfferV2 merchantOfferV2, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (str != null) {
            return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : new UiEvent(str), ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : merchantOfferV2, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
        }
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : merchantOfferV2, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$32(RhyOverviewV2Duxo rhyOverviewV2Duxo, final MatchaTreatment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$32$lambda$31(it, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$32$lambda$31(MatchaTreatment matchaTreatment, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : matchaTreatment, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$34(RhyOverviewV2Duxo rhyOverviewV2Duxo, final List pendingTransactions) {
        Intrinsics.checkNotNullParameter(pendingTransactions, "pendingTransactions");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$34$lambda$33(pendingTransactions, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$34$lambda$33(List list, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(UiMatchaPendingTransaction4.toUiModel((MatchaPendingTransaction) it.next()));
        }
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : arrayList, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$36(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$36$lambda$35(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$36$lambda$35(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : Boolean.valueOf(z), (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$38(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$38$lambda$37(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$38$lambda$37(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : Boolean.valueOf(z), (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$40(RhyOverviewV2Duxo rhyOverviewV2Duxo, final RhsNoaRedirectStatus rhsNoaRedirectStatus) {
        Intrinsics.checkNotNullParameter(rhsNoaRedirectStatus, "rhsNoaRedirectStatus");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$40$lambda$39(rhsNoaRedirectStatus, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$40$lambda$39(RhsNoaRedirectStatus rhsNoaRedirectStatus, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : rhsNoaRedirectStatus, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$42(RhyOverviewV2Duxo rhyOverviewV2Duxo, final CashCushionStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$42$lambda$41(it, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$42$lambda$41(CashCushionStatus cashCushionStatus, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : cashCushionStatus, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$44$lambda$43(InboxBadge inboxBadge, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : inboxBadge.getResult(), (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : inboxBadge.getShouldCriticalBadge(), (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$46(RhyOverviewV2Duxo rhyOverviewV2Duxo, final RhyReferralEligibility rhyReferralEligibility) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$46$lambda$45(rhyReferralEligibility, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$46$lambda$45(RhyReferralEligibility rhyReferralEligibility, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : rhyReferralEligibility, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$48(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$48$lambda$47(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$48$lambda$47(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : Boolean.valueOf(z), (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$50(RhyOverviewV2Duxo rhyOverviewV2Duxo, final boolean z) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.onCreate$lambda$50$lambda$49(z, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState onCreate$lambda$50$lambda$49(boolean z, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : Boolean.valueOf(z));
    }

    /* compiled from: RhyOverviewV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$getContentForBottomSheetOffers$1", m3645f = "RhyOverviewV2Duxo.kt", m3646l = {423}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$getContentForBottomSheetOffers$1 */
    static final class C103041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MobileContentPage>, Object> {
        final /* synthetic */ String $contentfulId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C103041(String str, Continuation<? super C103041> continuation) {
            super(2, continuation);
            this.$contentfulId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyOverviewV2Duxo.this.new C103041(this.$contentfulId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MobileContentPage> continuation) {
            return ((C103041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = RhyOverviewV2Duxo.this.staticContentStore;
                String str = this.$contentfulId;
                this.label = 1;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((EntryResource) obj).getValue();
        }
    }

    public final void getContentForBottomSheetOffers(String contentfulId) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C103041(contentfulId, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.getContentForBottomSheetOffers$lambda$52(this.f$0, (MobileContentPage) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.getContentForBottomSheetOffers$lambda$53((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getContentForBottomSheetOffers$lambda$52(RhyOverviewV2Duxo rhyOverviewV2Duxo, final MobileContentPage resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.getContentForBottomSheetOffers$lambda$52$lambda$51(resource, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState getContentForBottomSheetOffers$lambda$52$lambda$51(MobileContentPage mobileContentPage, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : mobileContentPage, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getContentForBottomSheetOffers$lambda$53(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!Throwables.isNetworkRelated(throwable)) {
            throw throwable;
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        this.rhyAccountStore.refresh(true);
        this.paycheckModuleStore.refresh(true);
        this.merchantOfferStore.refresh(true);
        updateGooglePayData();
    }

    public final void radTransferComplete(final MerchantOfferV2 offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.radTransferComplete$lambda$54(offer, (RhyOverviewV2ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState radTransferComplete$lambda$54(MerchantOfferV2 merchantOfferV2, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : new UiEvent(merchantOfferV2), (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    public final void showHistoryExperience() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.showHistoryExperience$lambda$55((RhyOverviewV2ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState showHistoryExperience$lambda$55(RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : new UiEvent(Unit.INSTANCE), ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    private final void loadDebitCard() {
        this.paymentCardStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentCardStore.streamActiveRhyCardOptional(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.loadDebitCard$lambda$57(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDebitCard$lambda$57(RhyOverviewV2Duxo rhyOverviewV2Duxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final PaymentCard paymentCard = (PaymentCard) optional.component1();
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.loadDebitCard$lambda$57$lambda$56(paymentCard, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState loadDebitCard$lambda$57$lambda$56(PaymentCard paymentCard, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : paymentCard, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    public final void updateGooglePayData() {
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.googlePayManager.listTokens(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.updateGooglePayData$lambda$59(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.updateGooglePayData$lambda$61(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$59(RhyOverviewV2Duxo rhyOverviewV2Duxo, final List tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.updateGooglePayData$lambda$59$lambda$58(tokenList, (RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState updateGooglePayData$lambda$59$lambda$58(List list, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : list, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$61(RhyOverviewV2Duxo rhyOverviewV2Duxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.updateGooglePayData$lambda$61$lambda$60((RhyOverviewV2ViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState updateGooglePayData$lambda$61$lambda$60(RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    public final void getPushTokenizeEvent() {
        if (this.isGetPushTokenizeRequestInFlight) {
            return;
        }
        Single<PushTokenizeRequest> singleDoOnSubscribe = this.rhySuvManger.getPushTokenizeEvent().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo.getPushTokenizeEvent.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                RhyOverviewV2Duxo.this.isGetPushTokenizeRequestInFlight = true;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.getPushTokenizeEvent$lambda$63(this.f$0, (PushTokenizeRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.getPushTokenizeEvent$lambda$65(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$63(RhyOverviewV2Duxo rhyOverviewV2Duxo, final PushTokenizeRequest pushTokenizeRequest) {
        rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.getPushTokenizeEvent$lambda$63$lambda$62(pushTokenizeRequest, (RhyOverviewV2ViewState) obj);
            }
        });
        rhyOverviewV2Duxo.addToGooglePayTappedPref.set(true);
        rhyOverviewV2Duxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState getPushTokenizeEvent$lambda$63$lambda$62(PushTokenizeRequest pushTokenizeRequest, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : new UiEvent(pushTokenizeRequest), ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$65(RhyOverviewV2Duxo rhyOverviewV2Duxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof VerificationRequiredException) {
            rhyOverviewV2Duxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewV2Duxo.getPushTokenizeEvent$lambda$65$lambda$64(error, (RhyOverviewV2ViewState) obj);
                }
            });
        }
        rhyOverviewV2Duxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState getPushTokenizeEvent$lambda$65$lambda$64(Throwable th, RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : new UiEvent(th), ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    public final void debugOnlyAddToGoogleWallet() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.debugOnlyAddToGoogleWallet$lambda$66((RhyOverviewV2ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState debugOnlyAddToGoogleWallet$lambda$66(RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : CollectionsKt.listOf(new GooglePayTokenInfoWrapper(string2, "RobinhoodDebug", "1000", "1000", 3, 3, 5, true, "RobinhoodDebug")), ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }

    public final void tapInfoBanner(UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleHost.DefaultImpls.bind$default(this, this.iacInfoBannerStore.postTapped(receiptUuid, action.getUri().toString()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void dismissInfoBanner(UUID receiptUuid) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Completable completableSwitchMapCompletable = getStates().take(1L).switchMapCompletable(new C103031(receiptUuid));
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* compiled from: RhyOverviewV2Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$dismissInfoBanner$1 */
    static final class C103031<T, R> implements Function {
        final /* synthetic */ UUID $receiptUuid;

        C103031(UUID uuid) {
            this.$receiptUuid = uuid;
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(RhyOverviewV2ViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            List<IacInfoBanner> iacInfoBanners = state.getIacInfoBanners();
            UUID uuid = this.$receiptUuid;
            final ArrayList arrayList = new ArrayList();
            for (T t : iacInfoBanners) {
                if (!Intrinsics.areEqual(((IacInfoBanner) t).getReceiptUuid(), uuid)) {
                    arrayList.add(t);
                }
            }
            RhyOverviewV2Duxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$dismissInfoBanner$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewV2Duxo.C103031.apply$lambda$1(arrayList, (RhyOverviewV2ViewState) obj);
                }
            });
            return RhyOverviewV2Duxo.this.iacInfoBannerStore.postDismissed(this.$receiptUuid, IacDismissMethod.PASSIVE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RhyOverviewV2ViewState apply$lambda$1(List list, RhyOverviewV2ViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : list, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : null, (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
        }
    }

    public final void animateScrollToTop() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewV2Duxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewV2Duxo.animateScrollToTop$lambda$67((RhyOverviewV2ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyOverviewV2ViewState animateScrollToTop$lambda$67(RhyOverviewV2ViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(((-2) & 1) != 0 ? applyMutation.spendingAccount : null, ((-2) & 2) != 0 ? applyMutation.shouldShowHistoryExperienceEvent : null, ((-2) & 4) != 0 ? applyMutation.paymentCard : null, ((-2) & 8) != 0 ? applyMutation.isGooglePlayEnabled : null, ((-2) & 16) != 0 ? applyMutation.hasDirectDepositRelationships : null, ((-2) & 32) != 0 ? applyMutation.hasEnrolledInEarlyPay : null, ((-2) & 64) != 0 ? applyMutation.hasSetupDirectDepositSwitcher : null, ((-2) & 128) != 0 ? applyMutation.minervaBrokerageAccount : null, ((-2) & 256) != 0 ? applyMutation.minervaSpendingAccount : null, ((-2) & 512) != 0 ? applyMutation.googlePayTokenList : null, ((-2) & 1024) != 0 ? applyMutation.sortingHatUserState : null, ((-2) & 2048) != 0 ? applyMutation.allMerchantOffers : null, ((-2) & 4096) != 0 ? applyMutation.rhsNoaRedirectStatus : null, ((-2) & 8192) != 0 ? applyMutation.hasDismissedRhsNoaRedirectPref : null, ((-2) & 16384) != 0 ? applyMutation.shouldShowRhsNoaRedirectWarningSheet : null, ((-2) & 32768) != 0 ? applyMutation.debitSpendingContentId : null, ((-2) & 65536) != 0 ? applyMutation.debitSpendingOffer : null, ((-2) & 131072) != 0 ? applyMutation.debitSpendTextResources : null, ((-2) & 262144) != 0 ? applyMutation.hasSeenDebitSpendPopup : null, ((-2) & 524288) != 0 ? applyMutation.shouldShowDebitSpendPopup : null, ((-2) & 1048576) != 0 ? applyMutation.pushTokenizeEvent : null, ((-2) & 2097152) != 0 ? applyMutation.historyPager : null, ((-2) & 4194304) != 0 ? applyMutation.roundupEnrollmentState : null, ((-2) & 8388608) != 0 ? applyMutation.iacInfoBanners : null, ((-2) & 16777216) != 0 ? applyMutation.showFundingBottomSheetEvent : null, ((-2) & 33554432) != 0 ? applyMutation.showFundingBottomSheet : null, ((-2) & 67108864) != 0 ? applyMutation.addToGooglePayTapped : false, ((-2) & 134217728) != 0 ? applyMutation.verificationRequired : null, ((-2) & 268435456) != 0 ? applyMutation.paycheckModule : null, ((-2) & 536870912) != 0 ? applyMutation.matchaTreatment : null, ((-2) & 1073741824) != 0 ? applyMutation.pendingMatchaTransactions : null, ((-2) & Integer.MIN_VALUE) != 0 ? applyMutation.hasSeenCashCushionUpsell : null, (8191 & 1) != 0 ? applyMutation.shouldShowCashCushionUpsellEvent : null, (8191 & 2) != 0 ? applyMutation.packageName : null, (8191 & 4) != 0 ? applyMutation.cashCushionStatus : null, (8191 & 8) != 0 ? applyMutation.radTransferComplete : null, (8191 & 16) != 0 ? applyMutation.isInP2pUpsellExperiment : null, (8191 & 32) != 0 ? applyMutation.isInDedupeExperiment : null, (8191 & 64) != 0 ? applyMutation.animateScrollToTop : new ComposeUiEvent(Unit.INSTANCE), (8191 & 128) != 0 ? applyMutation.shouldShowInboxBadge : false, (8191 & 256) != 0 ? applyMutation.isInboxBadgeCritical : false, (8191 & 512) != 0 ? applyMutation.rhyReferralEligibility : null, (8191 & 1024) != 0 ? applyMutation.hasSeenFlatCashbackUpsell : null, (8191 & 2048) != 0 ? applyMutation.shouldShowFlatCashbackUpsellEvent : null, (8191 & 4096) != 0 ? applyMutation.isInFlatCashbackExperiment : null);
    }
}
