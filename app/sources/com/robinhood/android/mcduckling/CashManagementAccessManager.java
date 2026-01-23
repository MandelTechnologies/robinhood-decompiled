package com.robinhood.android.mcduckling;

import com.robinhood.android.creditcard.contracts.CreditCardRhySpendingSunset;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.mcduckling.CashManagementAccessManager4;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.rhy.contracts.RhyWaitlistSignUpContract;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.RhyWaitlistStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabStateResponse;
import com.robinhood.models.api.bonfire.waitlist.WaitlistStatus;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatUserState;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.models.p355ui.bonfire.rhy.RhySignupEligibility;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CashManagementAccessManager.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001'BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001cH\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cJ\u0006\u0010&\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "rhyWaitlistStore", "Lcom/robinhood/librobinhood/data/store/RhyWaitlistStore;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "productMarketingStore", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "creditCardStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;Lcom/robinhood/librobinhood/data/store/RhyWaitlistStore;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/staticcontent/store/ContentStore;Lcom/robinhood/coroutines/rx/RxFactory;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;)V", "refresh", "", "force", "", "streamCashTabAccessState", "Lio/reactivex/Observable;", "Lcom/robinhood/android/mcduckling/CashTabAccessState;", "accountSelectorTabArgs", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "streamCreditCardWaitlistState", "streamRhyOnboardingState", "Lcom/robinhood/android/mcduckling/CashTabAccessState$RhyOnboarding;", "streamRhyWaitlistState", "streamRhyAccessState", "streamCreditCardWaitlistTabEligibility", "refreshCreditCardWaitlistTabEligibility", "CashTabAccessStateMetadata", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CashManagementAccessManager {
    private final CreditCardStore creditCardStore;
    private final ExperimentsStore experimentsStore;
    private final MinervaAccountStore minervaAccountStore;
    private final ContentStore<ProductMarketingContent> productMarketingStore;
    private final RhyAccountStore rhyAccountStore;
    private final RhyTabStateStore rhyTabStateStore;
    private final RhyWaitlistStore rhyWaitlistStore;
    private final RxFactory rxFactory;
    private final BaseSortingHatStore sortingHatStore;

    public CashManagementAccessManager(MinervaAccountStore minervaAccountStore, RhyAccountStore rhyAccountStore, RhyTabStateStore rhyTabStateStore, RhyWaitlistStore rhyWaitlistStore, BaseSortingHatStore sortingHatStore, ContentStore<ProductMarketingContent> productMarketingStore, RxFactory rxFactory, ExperimentsStore experimentsStore, CreditCardStore creditCardStore) {
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "rhyTabStateStore");
        Intrinsics.checkNotNullParameter(rhyWaitlistStore, "rhyWaitlistStore");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(productMarketingStore, "productMarketingStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        this.minervaAccountStore = minervaAccountStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rhyTabStateStore = rhyTabStateStore;
        this.rhyWaitlistStore = rhyWaitlistStore;
        this.sortingHatStore = sortingHatStore;
        this.productMarketingStore = productMarketingStore;
        this.rxFactory = rxFactory;
        this.experimentsStore = experimentsStore;
        this.creditCardStore = creditCardStore;
    }

    public static /* synthetic */ void refresh$default(CashManagementAccessManager cashManagementAccessManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        cashManagementAccessManager.refresh(z);
    }

    public final void refresh(boolean force) {
        this.minervaAccountStore.refresh(force);
        this.rhyTabStateStore.refresh(force);
    }

    public final Observable<CashManagementAccessManager4> streamCashTabAccessState(final AccountSelectorTabArgs accountSelectorTabArgs) {
        Observable<CashManagementAccessManager4> observableSwitchMap = Observable.combineLatest(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{CreditCardRhySpendingSunset.INSTANCE}, false, null, 6, null), this.rhyTabStateStore.streamRhyTabState().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamCashTabAccessState.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CashManagementAccessManager.this.rhyTabStateStore.refresh(true);
            }
        }), streamCreditCardWaitlistTabEligibility().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamCashTabAccessState.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CashManagementAccessManager.this.creditCardStore.refreshCreditCardTabEligibility();
            }
        }), new Function3() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamCashTabAccessState.3
            public final CashTabAccessStateMetadata apply(boolean z, RhyTabState p1, boolean z2) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                return new CashTabAccessStateMetadata(z, p1, z2);
            }

            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply(((Boolean) obj).booleanValue(), (RhyTabState) obj2, ((Boolean) obj3).booleanValue());
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamCashTabAccessState.4

            /* compiled from: CashManagementAccessManager.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.mcduckling.CashManagementAccessManager$streamCashTabAccessState$4$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApiRhyTabStateResponse.ApiRhyTabState.values().length];
                    try {
                        iArr[ApiRhyTabStateResponse.ApiRhyTabState.RHY_WAITLIST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApiRhyTabStateResponse.ApiRhyTabState.FULL_SCREEN_INFO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApiRhyTabStateResponse.ApiRhyTabState.RHY_PENDING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ApiRhyTabStateResponse.ApiRhyTabState.RHY_ONBOARDING.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ApiRhyTabStateResponse.ApiRhyTabState.CREDIT_CARD_WAITLIST.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CashManagementAccessManager4> apply(CashTabAccessStateMetadata cashTabAccessStateMetadata) {
                Intrinsics.checkNotNullParameter(cashTabAccessStateMetadata, "<destruct>");
                boolean isRhySunsetExperimentEnabled = cashTabAccessStateMetadata.getIsRhySunsetExperimentEnabled();
                RhyTabState rhyTabState = cashTabAccessStateMetadata.getRhyTabState();
                if (cashTabAccessStateMetadata.getForceCreditCardInCashTab()) {
                    return CashManagementAccessManager.this.streamCreditCardWaitlistState();
                }
                int i = WhenMappings.$EnumSwitchMapping$0[rhyTabState.getState().ordinal()];
                if (i == 1) {
                    return CashManagementAccessManager.this.streamRhyWaitlistState();
                }
                if (i == 2) {
                    RhyTabState.Info info = rhyTabState.getInfo();
                    Intrinsics.checkNotNull(info);
                    Observable observableJust = Observable.just(new CashManagementAccessManager4.RhyFullScreenInfo(info));
                    Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                    return observableJust;
                }
                if (i != 3) {
                    return i != 4 ? i != 5 ? CashManagementAccessManager.this.streamRhyAccessState(accountSelectorTabArgs) : CashManagementAccessManager.this.streamCreditCardWaitlistState() : isRhySunsetExperimentEnabled ? CashManagementAccessManager.this.streamCreditCardWaitlistState() : CashManagementAccessManager.this.streamRhyOnboardingState();
                }
                RhyTabState.Info info2 = rhyTabState.getInfo();
                Intrinsics.checkNotNull(info2);
                Observable observableJust2 = Observable.just(new CashManagementAccessManager4.RhyPendingScreenInfo(info2));
                Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<CashManagementAccessManager4> streamCreditCardWaitlistState() {
        Observable<CashManagementAccessManager4> observableJust = Observable.just(new CashManagementAccessManager4.CreditCardWaitlist());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<CashManagementAccessManager4.RhyOnboarding> streamRhyOnboardingState() {
        Observable observableSwitchMap = QueryKt.asObservable(this.sortingHatStore.streamUserState()).map(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager$streamRhyOnboardingState$contentObs$1
            @Override // io.reactivex.functions.Function
            public final CashManagementAccessManager4.RhyOnboarding.IntroContext apply(SortingHatUserState userState) {
                Intrinsics.checkNotNullParameter(userState, "userState");
                return CashManagementAccessManager4.RhyOnboarding.IntroContext.INSTANCE.getIntroContext(userState.getBrokerage().isInvested());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager$streamRhyOnboardingState$contentObs$2

            /* compiled from: CashManagementAccessManager.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcduckling.CashManagementAccessManager$streamRhyOnboardingState$contentObs$2$1", m3645f = "CashManagementAccessManager.kt", m3646l = {97}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcduckling.CashManagementAccessManager$streamRhyOnboardingState$contentObs$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ProductMarketingContent>, Object> {
                final /* synthetic */ CashManagementAccessManager4.RhyOnboarding.IntroContext $it;
                int label;
                final /* synthetic */ CashManagementAccessManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CashManagementAccessManager cashManagementAccessManager, CashManagementAccessManager4.RhyOnboarding.IntroContext introContext, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cashManagementAccessManager;
                    this.$it = introContext;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProductMarketingContent> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    ContentStore contentStore = this.this$0.productMarketingStore;
                    String contentfulId = this.$it.getContentfulId();
                    this.label = 1;
                    Object objLoad$default = ContentStore.DefaultImpls.load$default(contentStore, contentfulId, null, this, 2, null);
                    return objLoad$default == coroutine_suspended ? coroutine_suspended : objLoad$default;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ProductMarketingContent> apply(CashManagementAccessManager4.RhyOnboarding.IntroContext it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RxFactory.DefaultImpls.rxSingle$default(this.this$0.rxFactory, null, new AnonymousClass1(this.this$0, it, null), 1, null).toObservable();
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableSwitchMap);
        Observable<CashManagementAccessManager4.RhyOnboarding> map = observables.combineLatest(observableSwitchMap, MinervaAccountStore.checkAccount$default(this.minervaAccountStore, null, 1, null)).distinctUntilChanged().map(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamRhyOnboardingState.1
            @Override // io.reactivex.functions.Function
            public final CashManagementAccessManager4.RhyOnboarding apply(Tuples2<ProductMarketingContent, ? extends Optional<MinervaAccount>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                ProductMarketingContent productMarketingContentComponent1 = tuples2.component1();
                Optional<MinervaAccount> optionalComponent2 = tuples2.component2();
                Intrinsics.checkNotNull(productMarketingContentComponent1);
                MinervaAccount orNull = optionalComponent2.getOrNull();
                return new CashManagementAccessManager4.RhyOnboarding(productMarketingContentComponent1, (orNull != null ? orNull.getEnrollmentState() : null) == ApiMinervaAccount.EnrollmentState.DOWNGRADED);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<CashManagementAccessManager4> streamRhyWaitlistState() {
        Observable map = this.rhyWaitlistStore.getEligibility().toObservable().map(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamRhyWaitlistState.1

            /* compiled from: CashManagementAccessManager.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.mcduckling.CashManagementAccessManager$streamRhyWaitlistState$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WaitlistStatus.values().length];
                    try {
                        iArr[WaitlistStatus.CAN_JOIN_WAITLIST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WaitlistStatus.IN_WAITLIST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WaitlistStatus.GRANTED_ACCESS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final CashManagementAccessManager4 apply(RhySignupEligibility it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int i = WhenMappings.$EnumSwitchMapping$0[it.getWaitlistStatus().ordinal()];
                if (i == 1) {
                    return new CashManagementAccessManager4.RhyWaitlist(RhyWaitlistSignUpContract.Key.INSTANCE);
                }
                if (i == 2 || i == 3) {
                    return new CashManagementAccessManager4.RhyWaitlist(LegacyFragmentKey.RhyWaitlistComingSoon.INSTANCE);
                }
                return new CashManagementAccessManager4.RhyWaitlist(LegacyFragmentKey.RhyWaitlistError.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<CashManagementAccessManager4> streamRhyAccessState(final AccountSelectorTabArgs accountSelectorTabArgs) {
        Observable observableSwitchMap = this.rhyAccountStore.streamAccounts().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamRhyAccessState.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CashManagementAccessManager.this.rhyAccountStore.refresh(true);
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamRhyAccessState.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CashManagementAccessManager4> apply(List<RhyAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                if (accounts2.isEmpty()) {
                    return CashManagementAccessManager.this.streamRhyWaitlistState();
                }
                Observable observableJust = Observable.just(new CashManagementAccessManager4.RhyOverview(new LegacyFragmentKey.RhyOverviewV2(accountSelectorTabArgs)));
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<Boolean> streamCreditCardWaitlistTabEligibility() {
        Observable<Boolean> observableDistinctUntilChanged = this.rhyAccountStore.forceFetchAccountIfNotCached().onErrorReturnItem(Optional2.INSTANCE).map(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamCreditCardWaitlistTabEligibility.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Optional<RhyAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof Some);
            }
        }).toObservable().flatMap(new Function() { // from class: com.robinhood.android.mcduckling.CashManagementAccessManager.streamCreditCardWaitlistTabEligibility.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Boolean hasRhyAccount) {
                Intrinsics.checkNotNullParameter(hasRhyAccount, "hasRhyAccount");
                if (!hasRhyAccount.booleanValue()) {
                    return CashManagementAccessManager.this.creditCardStore.streamCreditCardTabEligibility();
                }
                Observable observableJust = Observable.just(Boolean.FALSE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final void refreshCreditCardWaitlistTabEligibility() {
        this.creditCardStore.refreshCreditCardTabEligibility();
    }

    /* compiled from: CashManagementAccessManager.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/CashManagementAccessManager$CashTabAccessStateMetadata;", "", "isRhySunsetExperimentEnabled", "", "rhyTabState", "Lcom/robinhood/models/db/rhy/RhyTabState;", "forceCreditCardInCashTab", "<init>", "(ZLcom/robinhood/models/db/rhy/RhyTabState;Z)V", "()Z", "getRhyTabState", "()Lcom/robinhood/models/db/rhy/RhyTabState;", "getForceCreditCardInCashTab", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-tab-spending_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class CashTabAccessStateMetadata {
        private final boolean forceCreditCardInCashTab;
        private final boolean isRhySunsetExperimentEnabled;
        private final RhyTabState rhyTabState;

        public static /* synthetic */ CashTabAccessStateMetadata copy$default(CashTabAccessStateMetadata cashTabAccessStateMetadata, boolean z, RhyTabState rhyTabState, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cashTabAccessStateMetadata.isRhySunsetExperimentEnabled;
            }
            if ((i & 2) != 0) {
                rhyTabState = cashTabAccessStateMetadata.rhyTabState;
            }
            if ((i & 4) != 0) {
                z2 = cashTabAccessStateMetadata.forceCreditCardInCashTab;
            }
            return cashTabAccessStateMetadata.copy(z, rhyTabState, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRhySunsetExperimentEnabled() {
            return this.isRhySunsetExperimentEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final RhyTabState getRhyTabState() {
            return this.rhyTabState;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getForceCreditCardInCashTab() {
            return this.forceCreditCardInCashTab;
        }

        public final CashTabAccessStateMetadata copy(boolean isRhySunsetExperimentEnabled, RhyTabState rhyTabState, boolean forceCreditCardInCashTab) {
            Intrinsics.checkNotNullParameter(rhyTabState, "rhyTabState");
            return new CashTabAccessStateMetadata(isRhySunsetExperimentEnabled, rhyTabState, forceCreditCardInCashTab);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashTabAccessStateMetadata)) {
                return false;
            }
            CashTabAccessStateMetadata cashTabAccessStateMetadata = (CashTabAccessStateMetadata) other;
            return this.isRhySunsetExperimentEnabled == cashTabAccessStateMetadata.isRhySunsetExperimentEnabled && Intrinsics.areEqual(this.rhyTabState, cashTabAccessStateMetadata.rhyTabState) && this.forceCreditCardInCashTab == cashTabAccessStateMetadata.forceCreditCardInCashTab;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRhySunsetExperimentEnabled) * 31) + this.rhyTabState.hashCode()) * 31) + Boolean.hashCode(this.forceCreditCardInCashTab);
        }

        public String toString() {
            return "CashTabAccessStateMetadata(isRhySunsetExperimentEnabled=" + this.isRhySunsetExperimentEnabled + ", rhyTabState=" + this.rhyTabState + ", forceCreditCardInCashTab=" + this.forceCreditCardInCashTab + ")";
        }

        public CashTabAccessStateMetadata(boolean z, RhyTabState rhyTabState, boolean z2) {
            Intrinsics.checkNotNullParameter(rhyTabState, "rhyTabState");
            this.isRhySunsetExperimentEnabled = z;
            this.rhyTabState = rhyTabState;
            this.forceCreditCardInCashTab = z2;
        }

        public final boolean isRhySunsetExperimentEnabled() {
            return this.isRhySunsetExperimentEnabled;
        }

        public final RhyTabState getRhyTabState() {
            return this.rhyTabState;
        }

        public final boolean getForceCreditCardInCashTab() {
            return this.forceCreditCardInCashTab;
        }
    }
}
