package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.directdeposit.p101ui.intro.DirectDepositSplashViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.cashier.DirectDepositSwitchStatusStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectDepositSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState;", "directDepositSwitchStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/cashier/DirectDepositSwitchStatusStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/shared/store/user/UserStore;)V", "onCreate", "", "streamRhyViewState", "Lio/reactivex/Observable;", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$Rhy;", "hasSetUpAnyDirectDepositFeatures", "", "streamCashManagementViewState", "Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositSplashViewState$CashManagement;", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositSplashDuxo extends OldBaseDuxo<DirectDepositSplashViewState> {
    private static final String GOLD_SWEEP_INTEREST_RATE_PLACEHOLDER = "gold_sweep_interest_rate";
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final DirectDepositSwitchStatusStore directDepositSwitchStatusStore;
    private final EarlyPayEnrollmentStore earlyPayEnrollmentStore;
    private final ExperimentsStore experimentsStore;
    private final RhyAccountStore rhyAccountStore;
    private final SweepsInterestStore sweepsInterestStore;
    private final UserStore userStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositSplashDuxo(DirectDepositSwitchStatusStore directDepositSwitchStatusStore, DirectDepositRelationshipStore directDepositRelationshipStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, ExperimentsStore experimentsStore, SweepsInterestStore sweepsInterestStore, RhyAccountStore rhyAccountStore, UserStore userStore) {
        super(DirectDepositSplashViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(directDepositSwitchStatusStore, "directDepositSwitchStatusStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.directDepositSwitchStatusStore = directDepositSwitchStatusStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
        this.experimentsStore = experimentsStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.rhyAccountStore = rhyAccountStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.rhyAccountStore.refresh(false);
        Observable<Optional<RhyAccount>> observableRefCount = this.rhyAccountStore.streamSpendingAccount().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        ObservableSource observableSourceSwitchMap = observableRefCount.takeUntil(new Predicate() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$onCreate$hasSetUpAnyDirectDepositFeaturesStream$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Optional<RhyAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                return optional.component1() != null;
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$onCreate$hasSetUpAnyDirectDepositFeaturesStream$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Optional<RhyAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                if (optional.component1() != null) {
                    this.this$0.earlyPayEnrollmentStore.refresh(false);
                    Observables observables = Observables.INSTANCE;
                    Observable<Boolean> observable = this.this$0.directDepositSwitchStatusStore.forceFetchDirectDepositSwitchStatusIfNotCached().toObservable();
                    Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                    Observable<T> observable2 = DirectDepositRelationshipStore.forceFetchHasDirectDepositRelationshipsIfNotCached$default(this.this$0.directDepositRelationshipStore, RhEntity.RHY, null, 2, null).onErrorReturnItem(Boolean.FALSE).toObservable();
                    Intrinsics.checkNotNullExpressionValue(observable2, "toObservable(...)");
                    Observable<EarlyPayEnrollment> observableStreamEnrollment = this.this$0.earlyPayEnrollmentStore.streamEnrollment();
                    final AnonymousClass1 anonymousClass1 = new PropertyReference1Impl() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$onCreate$hasSetUpAnyDirectDepositFeaturesStream$2.1
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                        public Object get(Object obj) {
                            return Boolean.valueOf(((EarlyPayEnrollment) obj).isEnrolled());
                        }
                    };
                    Observable<R> map = observableStreamEnrollment.map(new Function(anonymousClass1) { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$sam$io_reactivex_functions_Function$0
                        private final /* synthetic */ Function1 function;

                        {
                            Intrinsics.checkNotNullParameter(anonymousClass1, "function");
                            this.function = anonymousClass1;
                        }

                        @Override // io.reactivex.functions.Function
                        public final /* synthetic */ Object apply(Object obj) {
                            return this.function.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    Observable observableZip = Observable.zip(observable, observable2, map, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$onCreate$hasSetUpAnyDirectDepositFeaturesStream$2$apply$$inlined$zip$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.Function3
                        public final R apply(T1 t1, T2 t2, T3 t3) {
                            Intrinsics.checkParameterIsNotNull(t1, "t1");
                            Intrinsics.checkParameterIsNotNull(t2, "t2");
                            Intrinsics.checkParameterIsNotNull(t3, "t3");
                            return (R) Boolean.valueOf(((Boolean) t1).booleanValue() || ((Boolean) t2).booleanValue() || ((Boolean) t3).booleanValue());
                        }
                    });
                    Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(source1, …neFunction(t1, t2, t3) })");
                    return observableZip;
                }
                Observable observableJust = Observable.just(Boolean.FALSE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableSourceSwitchMap);
        Observable observableCombineLatest = Observable.combineLatest(observableRefCount, observableSourceSwitchMap, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$onCreate$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) new DirectDepositSplashBundle((Optional) t1, ((Boolean) t2).booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observableFlatMap = observableCombineLatest.flatMap(new Function() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DirectDepositSplashViewState> apply(DirectDepositSplashBundle directDepositSplashBundle) {
                Intrinsics.checkNotNullParameter(directDepositSplashBundle, "<destruct>");
                return directDepositSplashBundle.component1().getOrNull() != null ? DirectDepositSplashDuxo.this.streamRhyViewState(directDepositSplashBundle.getHasSetUpAnyDirectDepositsFeatures()) : DirectDepositSplashDuxo.this.streamCashManagementViewState();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSplashDuxo.onCreate$lambda$1(this.f$0, (DirectDepositSplashViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DirectDepositSplashDuxo directDepositSplashDuxo, final DirectDepositSplashViewState directDepositSplashViewState) {
        directDepositSplashDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSplashDuxo.onCreate$lambda$1$lambda$0(directDepositSplashViewState, (DirectDepositSplashViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositSplashViewState onCreate$lambda$1$lambda$0(DirectDepositSplashViewState directDepositSplashViewState, DirectDepositSplashViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(directDepositSplashViewState);
        return directDepositSplashViewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<DirectDepositSplashViewState.Rhy> streamRhyViewState(final boolean hasSetUpAnyDirectDepositFeatures) {
        this.sweepsInterestStore.refreshNoAccountNumber(true);
        Observable map = this.sweepsInterestStore.streamNoAccountNumber().map(new Function() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo.streamRhyViewState.1
            @Override // io.reactivex.functions.Function
            public final DirectDepositSplashViewState.Rhy apply(Optional<SweepsInterest> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                return new DirectDepositSplashViewState.Rhy(hasSetUpAnyDirectDepositFeatures, optional.component1());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<DirectDepositSplashViewState.CashManagement> streamCashManagementViewState() {
        this.sweepsInterestStore.refreshNoAccountNumber(true);
        Observable<DirectDepositSplashViewState.CashManagement> map = Observables.INSTANCE.combineLatest(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiment.CASH_LIMITED_INTEREST.INSTANCE}, false, null, 6, null), this.sweepsInterestStore.streamNoAccountNumber(), this.userStore.getUser()).map(new Function() { // from class: com.robinhood.android.directdeposit.ui.intro.DirectDepositSplashDuxo.streamCashManagementViewState.1
            @Override // io.reactivex.functions.Function
            public final DirectDepositSplashViewState.CashManagement apply(Tuples3<Boolean, ? extends Optional<SweepsInterest>, User> tuples3) {
                BigDecimal goldInterestRate;
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                boolean zBooleanValue = tuples3.component1().booleanValue();
                Optional<SweepsInterest> optionalComponent2 = tuples3.component2();
                User userComponent3 = tuples3.component3();
                SweepsInterest orNull = optionalComponent2.getOrNull();
                if (orNull != null) {
                    goldInterestRate = orNull.getGoldInterestRate();
                    if (goldInterestRate == null) {
                        goldInterestRate = orNull.getInterestRate();
                    }
                } else {
                    goldInterestRate = null;
                }
                if (zBooleanValue || goldInterestRate == null) {
                    return DirectDepositSplashViewState.CashManagement.WithoutInterest.INSTANCE;
                }
                return new DirectDepositSplashViewState.CashManagement.WithInterest(goldInterestRate, BrokerageResource2.getContentfulId(BrokerageDisclosure.CASH_SWEEP_INTEREST_EARNING_DISCLOSURE, userComponent3.getOrigin().getLocality()), MapsKt.mapOf(Tuples4.m3642to("gold_sweep_interest_rate", Formats.getInterestRateFormatShortWithPercentage().format(goldInterestRate))));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
