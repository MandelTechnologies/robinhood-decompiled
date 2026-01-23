package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.creditcard.p091ui.CreditApplicationGoldBasicExperiment;
import com.robinhood.android.creditcard.p091ui.CreditCardBonusPointsUiRolloutExperiment;
import com.robinhood.android.creditcard.p091ui.CreditCardFreeGoldUiRolloutExperiment;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsViewState;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsTextVariant;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.lib.upgrade.api.GoldUpgradeApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.lib.store.creditcard.prefs.CreditCardApplicationShowPlanSelectorPref;
import com.robinhood.android.models.creditcard.api.graphql.OfferQueryResponse2;
import com.robinhood.android.models.creditcard.api.graphql.UpdateCreditApplicationResponse;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: FinalTermsDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eBM\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0080@¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsEvent;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "goldUpgradeApi", "Lcom/robinhood/android/gold/lib/upgrade/api/GoldUpgradeApi;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "showPlanSelector", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/android/gold/lib/upgrade/api/GoldUpgradeApi;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "onContinue", "onContinue$feature_credit_card_externalDebug", "onGoldBasicDownsellCtaClick", "Lkotlin/Result;", "onGoldBasicDownsellCtaClick-IoAF18A$feature_credit_card_externalDebug", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FinalTermsDuxo extends BaseDuxo5<FinalTermsViewState, FinalTermsDuxo6> {
    public static final String GOLD_AGREEMENT_NAME = "gold_agreement";
    private final AccountProvider accountProvider;
    private final AgreementsStore agreementsStore;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private final ExperimentsStore experimentsStore;
    private final GoldUpgradeApi goldUpgradeApi;
    private final BooleanPreference showPlanSelector;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinalTermsDuxo(ExperimentsStore experimentsStore, AccountProvider accountProvider, AgreementsStore agreementsStore, CreditCardStore creditCardStore, GoldUpgradeApi goldUpgradeApi, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, @CreditCardApplicationShowPlanSelectorPref BooleanPreference showPlanSelector, DuxoBundle duxoBundle) {
        super(new FinalTermsViewState(false, false, null, null, null, null, false, null, false, 511, null), duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(goldUpgradeApi, "goldUpgradeApi");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(showPlanSelector, "showPlanSelector");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.accountProvider = accountProvider;
        this.agreementsStore = agreementsStore;
        this.creditCardStore = creditCardStore;
        this.goldUpgradeApi = goldUpgradeApi;
        this.defaultDispatcher = defaultDispatcher;
        this.showPlanSelector = showPlanSelector;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        applyMutation(new C123421(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.defaultDispatcher, null, new C123432(null), 2, null);
    }

    /* compiled from: FinalTermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$1", m3645f = "FinalTermsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$1 */
    static final class C123421 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C123421(Continuation<? super C123421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C123421 c123421 = FinalTermsDuxo.this.new C123421(continuation);
            c123421.L$0 = obj;
            return c123421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
            return ((C123421) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            FinalTermsViewState finalTermsViewState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FinalTermsViewState finalTermsViewState2 = (FinalTermsViewState) this.L$0;
                Observable<Account> individualAccountForced = FinalTermsDuxo.this.accountProvider.getIndividualAccountForced();
                this.L$0 = finalTermsViewState2;
                this.label = 1;
                Object objAwaitFirst = RxAwait3.awaitFirst(individualAccountForced, this);
                if (objAwaitFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                finalTermsViewState = finalTermsViewState2;
                obj = objAwaitFirst;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finalTermsViewState = (FinalTermsViewState) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return FinalTermsViewState.copy$default(finalTermsViewState, ((Account) obj).isGold(), false, null, null, null, null, false, null, false, 510, null);
        }
    }

    /* compiled from: FinalTermsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2", m3645f = "FinalTermsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, 62, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, 70, 116, 125}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2 */
    static final class C123432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;

        C123432(Continuation<? super C123432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinalTermsDuxo.this.new C123432(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C123432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x01ad, code lost:
        
            if (r0 == r6) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[PHI: r0 r2
          0x00b8: PHI (r0v17 java.lang.Boolean) = (r0v15 java.lang.Boolean), (r0v20 java.lang.Boolean) binds: [B:25:0x00b4, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v10 java.lang.Object) binds: [B:25:0x00b4, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0151 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x0021, B:51:0x017c, B:53:0x0184, B:15:0x003a, B:40:0x0124, B:42:0x0136, B:44:0x0146, B:48:0x0161, B:45:0x0151, B:47:0x0157, B:36:0x00fc), top: B:64:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0157 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x0021, B:51:0x017c, B:53:0x0184, B:15:0x003a, B:40:0x0124, B:42:0x0136, B:44:0x0146, B:48:0x0161, B:45:0x0151, B:47:0x0157, B:36:0x00fc), top: B:64:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0184 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:10:0x0021, B:51:0x017c, B:53:0x0184, B:15:0x003a, B:40:0x0124, B:42:0x0136, B:44:0x0146, B:48:0x0161, B:45:0x0151, B:47:0x0157, B:36:0x00fc), top: B:64:0x000b }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object agreementWithContent;
            Object objAwaitFirst;
            Boolean bool;
            Object objAwaitFirst2;
            Object goldBasicEligibility;
            Boolean bool2;
            Boolean bool3;
            Object objAwaitFirst3;
            Boolean bool4;
            boolean z;
            Object objHasActiveOffers;
            Boolean bool5;
            CreditApplicationGoldBasicExperiment.Variant variant;
            Object goldUpgradeFlow$default;
            ApiGoldUpgradeFlow apiGoldUpgradeFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                try {
                } catch (Throwable th) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
            } catch (Throwable th2) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th2, false, null, 6, null);
                Timber.INSTANCE.mo3355e(th2, "Unable to fetch gold_agreement via Identi agreement API", new Object[0]);
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(FinalTermsDuxo.this.experimentsStore, new Experiment[]{CreditCardFreeGoldUiRolloutExperiment.INSTANCE}, false, null, 6, null);
                    this.label = 1;
                    objAwaitFirst = RxAwait3.awaitFirst(observableStreamState$default, this);
                    if (objAwaitFirst != coroutine_suspended) {
                        bool = (Boolean) objAwaitFirst;
                        Observable observableStreamState$default2 = ExperimentsProvider.DefaultImpls.streamState$default(FinalTermsDuxo.this.experimentsStore, new Experiment[]{CreditCardBonusPointsUiRolloutExperiment.INSTANCE}, false, null, 6, null);
                        this.L$0 = bool;
                        this.label = 2;
                        objAwaitFirst2 = RxAwait3.awaitFirst(observableStreamState$default2, this);
                        if (objAwaitFirst2 != coroutine_suspended) {
                            Boolean bool6 = (Boolean) objAwaitFirst2;
                            CreditCardStore creditCardStore = FinalTermsDuxo.this.creditCardStore;
                            this.L$0 = bool;
                            this.L$1 = bool6;
                            this.label = 3;
                            goldBasicEligibility = creditCardStore.getGoldBasicEligibility(this);
                            if (goldBasicEligibility != coroutine_suspended) {
                                bool2 = bool;
                                bool3 = bool6;
                                boolean zBooleanValue = ((Boolean) goldBasicEligibility).booleanValue();
                                Observable observableStreamVariant = FinalTermsDuxo.this.experimentsStore.streamVariant(CreditApplicationGoldBasicExperiment.INSTANCE, CreditApplicationGoldBasicExperiment.Variant.CONTROL, true);
                                this.L$0 = bool2;
                                this.L$1 = bool3;
                                this.Z$0 = zBooleanValue;
                                this.label = 4;
                                objAwaitFirst3 = RxAwait3.awaitFirst(observableStreamVariant, this);
                                if (objAwaitFirst3 != coroutine_suspended) {
                                    bool4 = bool3;
                                    z = zBooleanValue;
                                    CreditApplicationGoldBasicExperiment.Variant variant2 = (CreditApplicationGoldBasicExperiment.Variant) objAwaitFirst3;
                                    CreditCardStore creditCardStore2 = FinalTermsDuxo.this.creditCardStore;
                                    OfferQueryResponse2[] offerQueryResponse2Arr = {OfferQueryResponse2.RH_CREDIT_APPLICATION_FREE_GOLD_MEMBERSHIP, OfferQueryResponse2.RH_CREDIT_APPLICATION_10K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_15K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_20K_POINTS};
                                    this.L$0 = bool2;
                                    this.L$1 = bool4;
                                    this.L$2 = variant2;
                                    this.Z$0 = z;
                                    this.label = 5;
                                    objHasActiveOffers = creditCardStore2.hasActiveOffers(offerQueryResponse2Arr, this);
                                    if (objHasActiveOffers == coroutine_suspended) {
                                        bool5 = bool2;
                                        variant = variant2;
                                        Map map = (Map) objHasActiveOffers;
                                        FinalTermsDuxo finalTermsDuxo = FinalTermsDuxo.this;
                                        finalTermsDuxo.applyMutation(new AnonymousClass1(z, variant, finalTermsDuxo, null));
                                        if (!bool5.booleanValue() && Intrinsics.areEqual(map.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_FREE_GOLD_MEMBERSHIP), boxing.boxBoolean(true))) {
                                            FinalTermsDuxo.this.applyMutation(new AnonymousClass2(null));
                                        } else if (bool4.booleanValue()) {
                                            FinalTermsDuxo.this.applyMutation(new AnonymousClass3(map, null));
                                        }
                                        GoldUpgradeApi goldUpgradeApi = FinalTermsDuxo.this.goldUpgradeApi;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                        goldUpgradeFlow$default = GoldUpgradeApi.DefaultImpls.getGoldUpgradeFlow$default(goldUpgradeApi, GoldFeature.CREDIT_CARD_VALUE_PROPS, null, this, 2, null);
                                        if (goldUpgradeFlow$default == coroutine_suspended) {
                                        }
                                        apiGoldUpgradeFlow = (ApiGoldUpgradeFlow) goldUpgradeFlow$default;
                                        if (apiGoldUpgradeFlow.getGoldValueProps() != null) {
                                            FinalTermsDuxo.this.applyMutation(new AnonymousClass4(apiGoldUpgradeFlow, null));
                                        }
                                        AgreementsStore agreementsStore = FinalTermsDuxo.this.agreementsStore;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 7;
                                        agreementWithContent = agreementsStore.getAgreementWithContent(FinalTermsDuxo.GOLD_AGREEMENT_NAME, this);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirst = obj;
                    bool = (Boolean) objAwaitFirst;
                    Observable observableStreamState$default22 = ExperimentsProvider.DefaultImpls.streamState$default(FinalTermsDuxo.this.experimentsStore, new Experiment[]{CreditCardBonusPointsUiRolloutExperiment.INSTANCE}, false, null, 6, null);
                    this.L$0 = bool;
                    this.label = 2;
                    objAwaitFirst2 = RxAwait3.awaitFirst(observableStreamState$default22, this);
                    if (objAwaitFirst2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    bool = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirst2 = obj;
                    Boolean bool62 = (Boolean) objAwaitFirst2;
                    CreditCardStore creditCardStore3 = FinalTermsDuxo.this.creditCardStore;
                    this.L$0 = bool;
                    this.L$1 = bool62;
                    this.label = 3;
                    goldBasicEligibility = creditCardStore3.getGoldBasicEligibility(this);
                    if (goldBasicEligibility != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    bool3 = (Boolean) this.L$1;
                    bool2 = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    goldBasicEligibility = obj;
                    boolean zBooleanValue2 = ((Boolean) goldBasicEligibility).booleanValue();
                    Observable observableStreamVariant2 = FinalTermsDuxo.this.experimentsStore.streamVariant(CreditApplicationGoldBasicExperiment.INSTANCE, CreditApplicationGoldBasicExperiment.Variant.CONTROL, true);
                    this.L$0 = bool2;
                    this.L$1 = bool3;
                    this.Z$0 = zBooleanValue2;
                    this.label = 4;
                    objAwaitFirst3 = RxAwait3.awaitFirst(observableStreamVariant2, this);
                    if (objAwaitFirst3 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    z = this.Z$0;
                    Boolean bool7 = (Boolean) this.L$1;
                    Boolean bool8 = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    bool4 = bool7;
                    bool2 = bool8;
                    objAwaitFirst3 = obj;
                    CreditApplicationGoldBasicExperiment.Variant variant22 = (CreditApplicationGoldBasicExperiment.Variant) objAwaitFirst3;
                    CreditCardStore creditCardStore22 = FinalTermsDuxo.this.creditCardStore;
                    OfferQueryResponse2[] offerQueryResponse2Arr2 = {OfferQueryResponse2.RH_CREDIT_APPLICATION_FREE_GOLD_MEMBERSHIP, OfferQueryResponse2.RH_CREDIT_APPLICATION_10K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_15K_POINTS, OfferQueryResponse2.RH_CREDIT_APPLICATION_20K_POINTS};
                    this.L$0 = bool2;
                    this.L$1 = bool4;
                    this.L$2 = variant22;
                    this.Z$0 = z;
                    this.label = 5;
                    objHasActiveOffers = creditCardStore22.hasActiveOffers(offerQueryResponse2Arr2, this);
                    if (objHasActiveOffers == coroutine_suspended) {
                    }
                    break;
                case 5:
                    z = this.Z$0;
                    variant = (CreditApplicationGoldBasicExperiment.Variant) this.L$2;
                    bool4 = (Boolean) this.L$1;
                    bool5 = (Boolean) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objHasActiveOffers = obj;
                    Map map2 = (Map) objHasActiveOffers;
                    FinalTermsDuxo finalTermsDuxo2 = FinalTermsDuxo.this;
                    finalTermsDuxo2.applyMutation(new AnonymousClass1(z, variant, finalTermsDuxo2, null));
                    if (!bool5.booleanValue()) {
                        if (bool4.booleanValue()) {
                        }
                        GoldUpgradeApi goldUpgradeApi2 = FinalTermsDuxo.this.goldUpgradeApi;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                        goldUpgradeFlow$default = GoldUpgradeApi.DefaultImpls.getGoldUpgradeFlow$default(goldUpgradeApi2, GoldFeature.CREDIT_CARD_VALUE_PROPS, null, this, 2, null);
                        if (goldUpgradeFlow$default == coroutine_suspended) {
                        }
                        apiGoldUpgradeFlow = (ApiGoldUpgradeFlow) goldUpgradeFlow$default;
                        if (apiGoldUpgradeFlow.getGoldValueProps() != null) {
                        }
                        AgreementsStore agreementsStore2 = FinalTermsDuxo.this.agreementsStore;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 7;
                        agreementWithContent = agreementsStore2.getAgreementWithContent(FinalTermsDuxo.GOLD_AGREEMENT_NAME, this);
                        break;
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    goldUpgradeFlow$default = obj;
                    apiGoldUpgradeFlow = (ApiGoldUpgradeFlow) goldUpgradeFlow$default;
                    if (apiGoldUpgradeFlow.getGoldValueProps() != null) {
                    }
                    AgreementsStore agreementsStore22 = FinalTermsDuxo.this.agreementsStore;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 7;
                    agreementWithContent = agreementsStore22.getAgreementWithContent(FinalTermsDuxo.GOLD_AGREEMENT_NAME, this);
                    break;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    agreementWithContent = obj;
                    FinalTermsDuxo.this.applyMutation(new AnonymousClass5((UiAgreementWithContent) agreementWithContent, null));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: FinalTermsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$1", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
            final /* synthetic */ CreditApplicationGoldBasicExperiment.Variant $goldBasicVariant;
            final /* synthetic */ boolean $isGoldBasicEligible;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FinalTermsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, CreditApplicationGoldBasicExperiment.Variant variant, FinalTermsDuxo finalTermsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isGoldBasicEligible = z;
                this.$goldBasicVariant = variant;
                this.this$0 = finalTermsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isGoldBasicEligible, this.$goldBasicVariant, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
                return ((AnonymousClass1) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FinalTermsViewState.copy$default((FinalTermsViewState) this.L$0, false, false, null, null, null, null, this.$isGoldBasicEligible, this.$goldBasicVariant, this.this$0.showPlanSelector.get(), 63, null);
            }
        }

        /* compiled from: FinalTermsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$2", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
                return ((AnonymousClass2) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FinalTermsViewState.copy$default((FinalTermsViewState) this.L$0, false, false, null, null, FinalTermsViewState.Screen.FREE_GOLD, null, false, null, false, 495, null);
            }
        }

        /* compiled from: FinalTermsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$3", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
            final /* synthetic */ Map<OfferQueryResponse2, Boolean> $offerEligibilityMap;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Map<OfferQueryResponse2, Boolean> map, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$offerEligibilityMap = map;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$offerEligibilityMap, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
                return ((AnonymousClass3) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                BonusPointsTextVariant bonusPointsTextVariant;
                FinalTermsViewState.Screen screen;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FinalTermsViewState finalTermsViewState = (FinalTermsViewState) this.L$0;
                if (Intrinsics.areEqual(this.$offerEligibilityMap.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_20K_POINTS), boxing.boxBoolean(true))) {
                    bonusPointsTextVariant = BonusPointsTextVariant.BONUS_POINTS_20K;
                } else if (Intrinsics.areEqual(this.$offerEligibilityMap.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_15K_POINTS), boxing.boxBoolean(true))) {
                    bonusPointsTextVariant = BonusPointsTextVariant.BONUS_POINTS_15K;
                } else {
                    bonusPointsTextVariant = Intrinsics.areEqual(this.$offerEligibilityMap.get(OfferQueryResponse2.RH_CREDIT_APPLICATION_10K_POINTS), boxing.boxBoolean(true)) ? BonusPointsTextVariant.BONUS_POINTS_10K : null;
                }
                BonusPointsTextVariant bonusPointsTextVariant2 = bonusPointsTextVariant;
                if (bonusPointsTextVariant2 == null || (screen = FinalTermsViewState.Screen.BONUS_POINTS) == null) {
                    screen = FinalTermsViewState.Screen.TERMS;
                }
                return FinalTermsViewState.copy$default(finalTermsViewState, false, false, null, null, screen, bonusPointsTextVariant2, false, null, false, 463, null);
            }
        }

        /* compiled from: FinalTermsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$4", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
            final /* synthetic */ ApiGoldUpgradeFlow $res;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ApiGoldUpgradeFlow apiGoldUpgradeFlow, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$res = apiGoldUpgradeFlow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$res, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
                return ((AnonymousClass4) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FinalTermsViewState.copy$default((FinalTermsViewState) this.L$0, false, false, this.$res.getGoldValueProps(), null, null, null, false, null, false, 507, null);
            }
        }

        /* compiled from: FinalTermsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$5", m3645f = "FinalTermsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$onStart$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<FinalTermsViewState, Continuation<? super FinalTermsViewState>, Object> {
            final /* synthetic */ UiAgreementWithContent $agreement;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(UiAgreementWithContent uiAgreementWithContent, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$agreement = uiAgreementWithContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$agreement, continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FinalTermsViewState finalTermsViewState, Continuation<? super FinalTermsViewState> continuation) {
                return ((AnonymousClass5) create(finalTermsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return FinalTermsViewState.copy$default((FinalTermsViewState) this.L$0, false, false, null, this.$agreement, null, null, false, null, false, 503, null);
            }
        }
    }

    public final void onContinue$feature_credit_card_externalDebug() {
        withDataState(new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinalTermsDuxo.onContinue$lambda$0(this.f$0, (FinalTermsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinue$lambda$0(FinalTermsDuxo finalTermsDuxo, FinalTermsViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(finalTermsDuxo), finalTermsDuxo.defaultDispatcher, null, new FinalTermsDuxo2(finalTermsDuxo, dataState, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: onGoldBasicDownsellCtaClick-IoAF18A$feature_credit_card_externalDebug */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1877x54ae50ef(Continuation<? super Result<Unit>> continuation) {
        FinalTermsDuxo4 finalTermsDuxo4;
        UpdateCreditApplicationResponse.Response updateCreditApplication;
        UpdateCreditApplicationResponse.Response.DataType data;
        UpdateCreditApplicationResponse.Response.DataType.IdType creditApplication;
        if (continuation instanceof FinalTermsDuxo4) {
            finalTermsDuxo4 = (FinalTermsDuxo4) continuation;
            int i = finalTermsDuxo4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                finalTermsDuxo4.label = i - Integer.MIN_VALUE;
            } else {
                finalTermsDuxo4 = new FinalTermsDuxo4(this, continuation);
            }
        }
        Object objWithContext = finalTermsDuxo4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = finalTermsDuxo4.label;
        String id = null;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
                FinalTermsDuxo5 finalTermsDuxo5 = new FinalTermsDuxo5(this, null);
                finalTermsDuxo4.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, finalTermsDuxo5, finalTermsDuxo4);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            UpdateCreditApplicationResponse updateCreditApplicationResponse = (UpdateCreditApplicationResponse) objWithContext;
            if (updateCreditApplicationResponse != null && (updateCreditApplication = updateCreditApplicationResponse.getUpdateCreditApplication()) != null && (data = updateCreditApplication.getData()) != null && (creditApplication = data.getCreditApplication()) != null) {
                id = creditApplication.getId();
            }
            if (id != null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(Unit.INSTANCE);
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new IllegalStateException("Invalid response from updateCreditApplication")));
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }
}
