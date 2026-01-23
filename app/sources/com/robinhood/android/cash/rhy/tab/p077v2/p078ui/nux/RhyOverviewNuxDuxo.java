package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.nux;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.HasShownRhyNuxTimestampPref;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.common.mcduckling.prefs.RhyDebugHideNuxPref;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.rhymigration.CmSunsetIncentiveExperiment;
import com.robinhood.android.googlepay.DebugAddedCardToGooglePayPref;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.RhyOverviewAccountType;
import com.robinhood.librobinhood.data.prefs.HasClickedDirectDepositNuxPref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhyReferralAttributionStore;
import com.robinhood.librobinhood.data.store.RhyReferralEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.librobinhood.store.RhyOverviewAccountStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.models.rhy.referral.p345db.RhyReferralEligibility;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.rhy.referral.HasViewedRefereeOfferPref;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;
import p479j$.time.Instant;

/* compiled from: RhyOverviewNuxDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B«\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0001\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010!\u001a\u00020\u001d\u0012\b\b\u0001\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020*H\u0016J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\b\u0010-\u001a\u00020*H\u0002J\u0006\u0010.\u001a\u00020*J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020100H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxViewState;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyOverviewAccountStore", "Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "rhyReferralEligibilityStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;", "rhyReferralAttributionStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;", "hasClickedDirectDepositNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownRhyNuxTimestampPref", "Lcom/robinhood/prefs/LongPreference;", "debugAddedCardToGooglePayPref", "hasViewedRefereeOfferPref", "rhyDebugHideNuxPref", "stateProvider", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/RhyReferralEligibilityStore;Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "debugAddCardToGooglePayDialogDismissed", "debugOnlyClickAddToGoogleWallet", "debugOnlyAddToGoogleWallet", "showDebugAddCardToGooglePayDialog", "getContentfulOverrides", "Lio/reactivex/Observable;", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyOverviewNuxDuxo extends BaseDuxo<RhyOverviewNuxDataState, RhyOverviewNuxViewState> {
    private static final String RHY_INCENTIVES_OVERRIDES = "3blvcJwvm1UCguTTGIlCRl";
    private static final List<GooglePayTokenInfoWrapper> debugGooglePayTokenList;
    private final BooleanPreference debugAddedCardToGooglePayPref;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final ExperimentsStore experimentsStore;
    private final GooglePayManager googlePayManager;
    private final BooleanPreference hasClickedDirectDepositNuxPref;
    private final LongPreference hasShownRhyNuxTimestampPref;
    private final BooleanPreference hasViewedRefereeOfferPref;
    private final HistoryStore historyStore;
    private final MinervaAccountStore minervaAccountStore;
    private final PaymentCardStore paymentCardStore;
    private final PaymentTransferStore paymentTransferStore;
    private final RhyAccountStore rhyAccountStore;
    private final BooleanPreference rhyDebugHideNuxPref;
    private final RhyOverviewAccountStore rhyOverviewAccountStore;
    private final RhyReferralAttributionStore rhyReferralAttributionStore;
    private final RhyReferralEligibilityStore rhyReferralEligibilityStore;
    private final StaticContentStore staticContentStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyOverviewNuxDuxo(PaymentCardStore paymentCardStore, DirectDepositRelationshipStore directDepositRelationshipStore, GooglePayManager googlePayManager, HistoryStore historyStore, MinervaAccountStore minervaAccountStore, PaymentTransferStore paymentTransferStore, RhyAccountStore rhyAccountStore, RhyOverviewAccountStore rhyOverviewAccountStore, ExperimentsStore experimentsStore, StaticContentStore staticContentStore, RhyReferralEligibilityStore rhyReferralEligibilityStore, RhyReferralAttributionStore rhyReferralAttributionStore, @HasClickedDirectDepositNuxPref BooleanPreference hasClickedDirectDepositNuxPref, @HasShownRhyNuxTimestampPref LongPreference hasShownRhyNuxTimestampPref, @DebugAddedCardToGooglePayPref BooleanPreference debugAddedCardToGooglePayPref, @HasViewedRefereeOfferPref BooleanPreference hasViewedRefereeOfferPref, @RhyDebugHideNuxPref BooleanPreference rhyDebugHideNuxPref, RhyOverviewNuxStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyOverviewNuxDataState(null, null, debugAddedCardToGooglePayPref.get() ? debugGooglePayTokenList : null, null, null, null, null, null, null, null, null, hasClickedDirectDepositNuxPref, false, null, null, null, false, false, 260091, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(rhyReferralEligibilityStore, "rhyReferralEligibilityStore");
        Intrinsics.checkNotNullParameter(rhyReferralAttributionStore, "rhyReferralAttributionStore");
        Intrinsics.checkNotNullParameter(hasClickedDirectDepositNuxPref, "hasClickedDirectDepositNuxPref");
        Intrinsics.checkNotNullParameter(hasShownRhyNuxTimestampPref, "hasShownRhyNuxTimestampPref");
        Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
        Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
        Intrinsics.checkNotNullParameter(rhyDebugHideNuxPref, "rhyDebugHideNuxPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.paymentCardStore = paymentCardStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.googlePayManager = googlePayManager;
        this.historyStore = historyStore;
        this.minervaAccountStore = minervaAccountStore;
        this.paymentTransferStore = paymentTransferStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyOverviewAccountStore = rhyOverviewAccountStore;
        this.experimentsStore = experimentsStore;
        this.staticContentStore = staticContentStore;
        this.rhyReferralEligibilityStore = rhyReferralEligibilityStore;
        this.rhyReferralAttributionStore = rhyReferralAttributionStore;
        this.hasClickedDirectDepositNuxPref = hasClickedDirectDepositNuxPref;
        this.hasShownRhyNuxTimestampPref = hasShownRhyNuxTimestampPref;
        this.debugAddedCardToGooglePayPref = debugAddedCardToGooglePayPref;
        this.hasViewedRefereeOfferPref = hasViewedRefereeOfferPref;
        this.rhyDebugHideNuxPref = rhyDebugHideNuxPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.paymentCardStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentCardStore.streamActiveRhyCardOptional(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore;
        RhEntity rhEntity = RhEntity.RHY;
        directDepositRelationshipStore.refresh(rhEntity);
        LifecycleHost.DefaultImpls.bind$default(this, this.directDepositRelationshipStore.getHasDirectDepositRelationships(rhEntity), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Maybe<List<GooglePayTokenInfoWrapper>> maybeFilter = this.googlePayManager.listTokens().filter(new Predicate() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo.onStart.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<GooglePayTokenInfoWrapper> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !RhyOverviewNuxDuxo.this.debugAddedCardToGooglePayPref.get();
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFilter, "filter(...)");
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, maybeFilter, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$2(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
        this.rhyAccountStore.refresh(false);
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(this.rhyAccountStore.streamSpendingAccount()).switchMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo.onStart.6

            /* compiled from: RhyOverviewNuxDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$onStart$6$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$onStart$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState>, Object> {
                final /* synthetic */ RhyAccount $spendingAccount;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RhyAccount rhyAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$spendingAccount = rhyAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$spendingAccount, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RhyOverviewNuxDataState rhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState> continuation) {
                    return ((AnonymousClass1) create(rhyOverviewNuxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return RhyOverviewNuxDataState.copy$default((RhyOverviewNuxDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, false, this.$spendingAccount.getCreatedAt(), null, null, false, false, 253951, null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MinervaAccount>> apply(RhyAccount spendingAccount) {
                Intrinsics.checkNotNullParameter(spendingAccount, "spendingAccount");
                RhyOverviewNuxDuxo.this.applyMutation(new AnonymousClass1(spendingAccount, null));
                return RhyOverviewNuxDuxo.this.minervaAccountStore.streamRhyMinervaAccountOptional(spendingAccount.getId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(observableSwitchMap).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo.onStart.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Integer> apply(MinervaAccount minervaAccount) {
                Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
                Set mutableSet = CollectionsKt.toMutableSet(HistoryFilter.DEBIT_CARD.getTransactionTypes());
                mutableSet.remove(HistoryTransactionType.DECLINED_CARD_TRANSACTION);
                mutableSet.remove(HistoryTransactionType.DISPUTE);
                HistoryStore historyStore = RhyOverviewNuxDuxo.this.historyStore;
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                Observable observableJust2 = Observable.just(CollectionsKt.toSet(mutableSet));
                Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                Observable observableJust3 = Observable.just(Instant.EPOCH);
                Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
                return HistoryStore.count$default(historyStore, observableJust, observableJust2, observableJust3, (Observable) null, new HistoryStaticFilter(null, null, null, minervaAccount.getId(), minervaAccount.getRhyAccountId(), null, null, null, null, null, 999, null), 8, (Object) null);
            }
        }).map(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo.onStart.8
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Integer count) {
                Intrinsics.checkNotNullParameter(count, "count");
                return Boolean.valueOf(count.intValue() > 0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$4(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.hasShownRhyNuxTimestampPref.changes(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$5(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.hasClickedDirectDepositNuxPref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$6(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> map = this.paymentTransferStore.getRhyFundingTransfers().distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo.onStart.12
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<PaymentTransfer> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$7(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyOverviewAccountStore.streamIsActiveRhyAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyOverviewAccountStore.streamSpendingAccountType(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$9(this.f$0, (RhyOverviewAccountType) obj);
            }
        });
        Observable observableFlatMap = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, CmSunsetIncentiveExperiment.INSTANCE, CmSunsetIncentiveExperiment.Variant.CONTROL, false, 4, null).flatMap(new Function() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo.onStart.16

            /* compiled from: RhyOverviewNuxDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$onStart$16$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$onStart$16$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState>, Object> {
                final /* synthetic */ CmSunsetIncentiveExperiment.Variant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CmSunsetIncentiveExperiment.Variant variant, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = variant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RhyOverviewNuxDataState rhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState> continuation) {
                    return ((AnonymousClass1) create(rhyOverviewNuxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return RhyOverviewNuxDataState.copy$default((RhyOverviewNuxDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, this.$it, null, false, null, null, null, false, false, 261119, null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<ProductMarketing.Feature>> apply(CmSunsetIncentiveExperiment.Variant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                RhyOverviewNuxDuxo.this.applyMutation(new AnonymousClass1(it, null));
                if (it.isInExperiment()) {
                    return RhyOverviewNuxDuxo.this.getContentfulOverrides();
                }
                Observable observableJust = Observable.just(CollectionsKt.emptyList());
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$10(this.f$0, (List) obj);
            }
        });
        Observable<Boolean> observableFilter = this.debugAddedCardToGooglePayPref.getChanges().distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo.onStart.18
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$12(this.f$0, (Boolean) obj);
            }
        });
        Observable<RhyReferralEligibility> observableDistinctUntilChanged2 = this.rhyReferralEligibilityStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$13(this.f$0, (RhyReferralEligibility) obj);
            }
        });
        this.rhyReferralAttributionStore.refresh(true);
        Observable<Optional<RhyReferralAttribution>> observableDistinctUntilChanged3 = this.rhyReferralAttributionStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$14(this.f$0, (Optional) obj);
            }
        });
        Observable<Boolean> observableDistinctUntilChanged4 = this.hasViewedRefereeOfferPref.getChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$15(this.f$0, (Boolean) obj);
            }
        });
        Observable<Boolean> observableDistinctUntilChanged5 = this.rhyDebugHideNuxPref.getChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$16(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$1$1((PaymentCard) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, boolean z) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$2$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, List list) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$4$1(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$5$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Boolean bool) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$9$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Optional timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Long l = (Long) timestamp.getOrNull();
        if (l != null && l.longValue() == 0) {
            rhyOverviewNuxDuxo.hasShownRhyNuxTimestampPref.set(Instant.now().getEpochSecond());
            rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$10$1(null));
        } else {
            rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$10$2(l, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, boolean z) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$11$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Boolean bool) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$13$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, boolean z) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$14$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, RhyOverviewAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$15$1(accountType, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$10(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, List list) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$17$1(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$12(final RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Boolean bool) {
        rhyOverviewNuxDuxo.withDataState(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyOverviewNuxDuxo.onStart$lambda$12$lambda$11(this.f$0, (RhyOverviewNuxDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$12$lambda$11(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, RhyOverviewNuxDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<GooglePayTokenInfoWrapper> googlePayTokenList = dataState.getGooglePayTokenList();
        if (googlePayTokenList != null && !googlePayTokenList.isEmpty()) {
            rhyOverviewNuxDuxo.debugOnlyAddToGoogleWallet();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, RhyReferralEligibility rhyReferralEligibility) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$20$1(rhyReferralEligibility, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$14(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Optional optional) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$21$1((RhyReferralAttribution) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$15(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Boolean bool) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$22$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$16(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Boolean bool) {
        rhyOverviewNuxDuxo.applyMutation(new RhyOverviewNuxDuxo$onStart$23$1(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RhyOverviewNuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$debugAddCardToGooglePayDialogDismissed$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$debugAddCardToGooglePayDialogDismissed$1 */
    static final class C104091 extends ContinuationImpl7 implements Function2<RhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C104091(Continuation<? super C104091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104091 c104091 = new C104091(continuation);
            c104091.L$0 = obj;
            return c104091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyOverviewNuxDataState rhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState> continuation) {
            return ((C104091) create(rhyOverviewNuxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyOverviewNuxDataState.copy$default((RhyOverviewNuxDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, false, 258047, null);
        }
    }

    public final void debugAddCardToGooglePayDialogDismissed() {
        applyMutation(new C104091(null));
    }

    public final void debugOnlyClickAddToGoogleWallet() {
        this.debugAddedCardToGooglePayPref.set(true);
        debugOnlyAddToGoogleWallet();
    }

    /* compiled from: RhyOverviewNuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$debugOnlyAddToGoogleWallet$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$debugOnlyAddToGoogleWallet$1 */
    static final class C104101 extends ContinuationImpl7 implements Function2<RhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C104101(Continuation<? super C104101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104101 c104101 = new C104101(continuation);
            c104101.L$0 = obj;
            return c104101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyOverviewNuxDataState rhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState> continuation) {
            return ((C104101) create(rhyOverviewNuxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyOverviewNuxDataState.copy$default((RhyOverviewNuxDataState) this.L$0, null, null, RhyOverviewNuxDuxo.debugGooglePayTokenList, null, null, null, null, null, null, null, null, null, false, null, null, null, false, false, 258043, null);
        }
    }

    private final void debugOnlyAddToGoogleWallet() {
        applyMutation(new C104101(null));
    }

    /* compiled from: RhyOverviewNuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/nux/RhyOverviewNuxDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$showDebugAddCardToGooglePayDialog$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$showDebugAddCardToGooglePayDialog$1 */
    static final class C104191 extends ContinuationImpl7 implements Function2<RhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C104191(Continuation<? super C104191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104191 c104191 = new C104191(continuation);
            c104191.L$0 = obj;
            return c104191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyOverviewNuxDataState rhyOverviewNuxDataState, Continuation<? super RhyOverviewNuxDataState> continuation) {
            return ((C104191) create(rhyOverviewNuxDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyOverviewNuxDataState.copy$default((RhyOverviewNuxDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, false, false, 258047, null);
        }
    }

    public final void showDebugAddCardToGooglePayDialog() {
        applyMutation(new C104191(null));
    }

    /* compiled from: RhyOverviewNuxDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$getContentfulOverrides$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$getContentfulOverrides$1 */
    static final class C104111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>>, Object> {
        int label;

        C104111(Continuation<? super C104111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyOverviewNuxDuxo.this.new C104111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ProductMarketing.Feature>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ProductMarketing.Feature>> continuation) {
            return ((C104111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RhyOverviewNuxDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$getContentfulOverrides$1$1", m3645f = "RhyOverviewNuxDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.nux.RhyOverviewNuxDuxo$getContentfulOverrides$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>>, Object> {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ RhyOverviewNuxDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RhyOverviewNuxDuxo rhyOverviewNuxDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = rhyOverviewNuxDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ProductMarketing.Feature>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<ProductMarketing.Feature>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ProductMarketing.Feature>> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
            
                if (r11 == r0) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0092 -> B:20:0x0093). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AnonymousClass1 anonymousClass1;
                RhyOverviewNuxDuxo rhyOverviewNuxDuxo;
                Collection arrayList;
                Iterator it;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StaticContentStore staticContentStore = this.this$0.staticContentStore;
                    this.label = 1;
                    anonymousClass1 = this;
                    obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, RhyOverviewNuxDuxo.RHY_INCENTIVES_OVERRIDES, null, anonymousClass1, 2, null);
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (Collection) this.L$3;
                    it = (Iterator) this.L$2;
                    Collection collection = (Collection) this.L$1;
                    rhyOverviewNuxDuxo = (RhyOverviewNuxDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                    arrayList.add((ProductMarketing.Feature) ((EntryResource) obj).getValue());
                    arrayList = collection;
                    if (it.hasNext()) {
                        ResourceLink resourceLink = (ResourceLink) it.next();
                        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                        RhyOverviewNuxDuxo$getContentfulOverrides$1$1$1$1 rhyOverviewNuxDuxo$getContentfulOverrides$1$1$1$1 = new RhyOverviewNuxDuxo$getContentfulOverrides$1$1$1$1(rhyOverviewNuxDuxo, resourceLink, null);
                        anonymousClass1.L$0 = rhyOverviewNuxDuxo;
                        anonymousClass1.L$1 = arrayList;
                        anonymousClass1.L$2 = it;
                        anonymousClass1.L$3 = arrayList;
                        anonymousClass1.label = 2;
                        obj = BuildersKt.withContext(coroutineDispatcher, rhyOverviewNuxDuxo$getContentfulOverrides$1$1$1$1, this);
                        if (obj != coroutine_suspended) {
                            collection = arrayList;
                            arrayList.add((ProductMarketing.Feature) ((EntryResource) obj).getValue());
                            arrayList = collection;
                            if (it.hasNext()) {
                                return (List) arrayList;
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features = ((ProductMarketing) ((EntryResource) obj).getValue()).getFeatures();
                RhyOverviewNuxDuxo rhyOverviewNuxDuxo2 = anonymousClass1.this$0;
                rhyOverviewNuxDuxo = rhyOverviewNuxDuxo2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
                it = features.iterator();
                if (it.hasNext()) {
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyOverviewNuxDuxo.this, null);
            this.label = 1;
            Object objSupervisorScope = Supervisor3.supervisorScope(anonymousClass1, this);
            return objSupervisorScope == coroutine_suspended ? coroutine_suspended : objSupervisorScope;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<List<ProductMarketing.Feature>> getContentfulOverrides() {
        Observable<List<ProductMarketing.Feature>> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C104111(null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    static {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        debugGooglePayTokenList = CollectionsKt.listOf(new GooglePayTokenInfoWrapper(string2, "RobinhoodDebug", "1000", "1000", 3, 3, 5, true, "RobinhoodDebug"));
    }
}
