package com.robinhood.curatedproductdiscovery.p291ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.curatedproductdiscovery.p291ui.NewProductsLandingDataState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.RoundupEnrollmentStore;
import com.robinhood.librobinhood.data.store.SlipEligibilityStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.models.p320db.mcduckling.RoundupEnrollment;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.utils.Optional;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewProductsLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState;", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "slipEligibilityStore", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "roundupEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingStateProvider;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;Lcom/robinhood/librobinhood/data/store/RoundupEnrollmentStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingStateProvider;)V", "onStart", "", "refresh", "force", "", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class NewProductsLandingDuxo extends BaseDuxo<NewProductsLandingDataState, NewProductsLandingViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final RegionGateProvider regionGateProvider;
    private final RoundupEnrollmentStore roundupEnrollmentStore;
    private final SlipEligibilityStore slipEligibilityStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepInterestStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProductsLandingDuxo(AccountProvider accountProvider, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepInterestStore, SlipEligibilityStore slipEligibilityStore, RoundupEnrollmentStore roundupEnrollmentStore, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle, NewProductsLandingStateProvider stateProvider) {
        super(new NewProductsLandingDataState(null, false, false, null, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepInterestStore, "sweepInterestStore");
        Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
        Intrinsics.checkNotNullParameter(roundupEnrollmentStore, "roundupEnrollmentStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepInterestStore = sweepInterestStore;
        this.slipEligibilityStore = slipEligibilityStore;
        this.roundupEnrollmentStore = roundupEnrollmentStore;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        refresh(false);
    }

    /* compiled from: NewProductsLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$1", m3645f = "NewProductsLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$1 */
    static final class C330411 extends ContinuationImpl7 implements Function2<NewProductsLandingDataState, Continuation<? super NewProductsLandingDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C330411(Continuation<? super C330411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C330411 c330411 = new C330411(continuation);
            c330411.L$0 = obj;
            return c330411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NewProductsLandingDataState newProductsLandingDataState, Continuation<? super NewProductsLandingDataState> continuation) {
            return ((C330411) create(newProductsLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return NewProductsLandingDataState.copy$default((NewProductsLandingDataState) this.L$0, NewProductsLandingDataState.Status.LOADING, false, false, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
    }

    public static /* synthetic */ void refresh$default(NewProductsLandingDuxo newProductsLandingDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        newProductsLandingDuxo.refresh(z);
    }

    public final void refresh(boolean force) {
        applyMutation(new C330411(null));
        this.sweepInterestStore.refreshNoAccountNumber(force);
        Observable observable = this.accountProvider.getIndividualAccountNumber().flatMap(new Function() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$sweepEnrollmentObs$1

            /* compiled from: NewProductsLandingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$sweepEnrollmentObs$1$1", m3645f = "NewProductsLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$sweepEnrollmentObs$1$1 */
            static final class C330421 extends ContinuationImpl7 implements Function2<NewProductsLandingDataState, Continuation<? super NewProductsLandingDataState>, Object> {
                final /* synthetic */ String $accountNumber;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C330421(String str, Continuation<? super C330421> continuation) {
                    super(2, continuation);
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C330421 c330421 = new C330421(this.$accountNumber, continuation);
                    c330421.L$0 = obj;
                    return c330421;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(NewProductsLandingDataState newProductsLandingDataState, Continuation<? super NewProductsLandingDataState> continuation) {
                    return ((C330421) create(newProductsLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return NewProductsLandingDataState.copy$default((NewProductsLandingDataState) this.L$0, null, this.$accountNumber != null, false, null, false, false, false, 125, null);
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Optional<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String orNull = it.getOrNull();
                this.this$0.applyMutation(new C330421(orNull, null));
                if (orNull != null) {
                    NewProductsLandingDuxo newProductsLandingDuxo = this.this$0;
                    return RxFactory.DefaultImpls.rxSingle$default(newProductsLandingDuxo, null, new C330432(newProductsLandingDuxo, orNull, null), 1, null);
                }
                Single singleJust = Single.just(Boolean.FALSE);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }

            /* compiled from: NewProductsLandingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$sweepEnrollmentObs$1$2", m3645f = "NewProductsLandingDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$sweepEnrollmentObs$1$2 */
            static final class C330432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                final /* synthetic */ String $accountNumber;
                int label;
                final /* synthetic */ NewProductsLandingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C330432(NewProductsLandingDuxo newProductsLandingDuxo, String str, Continuation<? super C330432> continuation) {
                    super(2, continuation);
                    this.this$0 = newProductsLandingDuxo;
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C330432(this.this$0, this.$accountNumber, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((C330432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        SweepEnrollmentStore sweepEnrollmentStore = this.this$0.sweepEnrollmentStore;
                        String str = this.$accountNumber;
                        this.label = 1;
                        obj = sweepEnrollmentStore.getSweepEnrollment(str, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return boxing.boxBoolean(((ApiSweepEnrollment) obj).getSweepEnrolled());
                }
            }
        }).toObservable();
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observable);
        Observable observableDistinctUntilChanged = observables.combineLatest(observable, this.sweepInterestStore.streamNoAccountNumber()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewProductsLandingDuxo.refresh$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewProductsLandingDuxo.refresh$lambda$2(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.slipEligibilityStore.getSlipHubEnrollmentStatus(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewProductsLandingDuxo.refresh$lambda$3(this.f$0, (SlipEligibilityStore.SlipHubEnrollmentStatus) obj);
            }
        });
        this.roundupEnrollmentStore.refresh(force);
        Observable<RoundupEnrollment> observableDistinctUntilChanged2 = this.roundupEnrollmentStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewProductsLandingDuxo.refresh$lambda$4(this.f$0, (RoundupEnrollment) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, SlipRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewProductsLandingDuxo.refresh$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$1(NewProductsLandingDuxo newProductsLandingDuxo, Tuples2 tuples2) {
        BigDecimal goldInterestRate;
        Boolean bool = (Boolean) tuples2.component1();
        SweepsInterest sweepsInterest = (SweepsInterest) ((Optional) tuples2.component2()).getOrNull();
        if (sweepsInterest != null) {
            goldInterestRate = sweepsInterest.getGoldInterestRate();
            if (goldInterestRate == null) {
                goldInterestRate = sweepsInterest.getInterestRate();
            }
        } else {
            goldInterestRate = null;
        }
        newProductsLandingDuxo.applyMutation(new NewProductsLandingDuxo2(bool, goldInterestRate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$2(NewProductsLandingDuxo newProductsLandingDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 4, null);
        newProductsLandingDuxo.applyMutation(new NewProductsLandingDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$3(NewProductsLandingDuxo newProductsLandingDuxo, SlipEligibilityStore.SlipHubEnrollmentStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        newProductsLandingDuxo.applyMutation(new NewProductsLandingDuxo4(status, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$4(NewProductsLandingDuxo newProductsLandingDuxo, RoundupEnrollment roundupEnrollment) {
        newProductsLandingDuxo.applyMutation(new NewProductsLandingDuxo5(roundupEnrollment, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$5(NewProductsLandingDuxo newProductsLandingDuxo, boolean z) {
        newProductsLandingDuxo.applyMutation(new NewProductsLandingDuxo6(z, null));
        return Unit.INSTANCE;
    }
}
