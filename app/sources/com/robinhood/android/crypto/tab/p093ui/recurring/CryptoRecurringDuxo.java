package com.robinhood.android.crypto.tab.p093ui.recurring;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.store.base.InvestmentScheduleStore;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoRecurringDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDataState;", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringViewState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/InvestmentScheduleStore;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "onStart", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoRecurringDuxo extends BaseDuxo<CryptoRecurringDataState, CryptoRecurringViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final InvestmentScheduleStore investmentScheduleStore;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoRecurringDuxo(AppType appType, DuxoBundle duxoBundle, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, AccountProvider accountProvider, InvestmentScheduleStore investmentScheduleStore, RegionGateProvider regionGateProvider) {
        super(new CryptoRecurringDataState(appType, null, null, investmentScheduleKeyResolver), new StateProvider() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo.1
            @Override // com.robinhood.android.udf.StateProvider
            public final CryptoRecurringViewState reduce(CryptoRecurringDataState dataState) {
                Intrinsics.checkNotNullParameter(dataState, "dataState");
                return new CryptoRecurringViewState(dataState.getLoading(), dataState.getTitle(), dataState.getDescription(), dataState.getItems(), dataState.getCtaText(), dataState.getNavigationAction());
            }
        }, duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.accountProvider = accountProvider;
        this.investmentScheduleStore = investmentScheduleStore;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<Optional<String>> observableDistinctUntilChanged = this.accountProvider.streamIndividualAccountNumberOptional().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoRecurringDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C132052(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CryptoRecurringDuxo cryptoRecurringDuxo, Optional optional) {
        cryptoRecurringDuxo.applyMutation(new CryptoRecurringDuxo3((String) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo$onStart$2", m3645f = "CryptoRecurringDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo$onStart$2 */
    static final class C132052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132052(Continuation<? super C132052> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoRecurringDuxo.this.new C132052(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(CryptoRecurringDuxo.this.investmentScheduleStore.streamCryptoInvestmentSchedules(), RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(CryptoRecurringDuxo.this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoRecurringDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo$onStart$2$1", m3645f = "CryptoRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo$onStart$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends InvestmentSchedule>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoRecurringDuxo cryptoRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends InvestmentSchedule> list, Continuation<? super Unit> continuation) {
                return invoke2((List<InvestmentSchedule>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<InvestmentSchedule> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/recurring/CryptoRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo$onStart$2$1$1", m3645f = "CryptoRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.recurring.CryptoRecurringDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497601 extends ContinuationImpl7 implements Function2<CryptoRecurringDataState, Continuation<? super CryptoRecurringDataState>, Object> {
                final /* synthetic */ List<InvestmentSchedule> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497601(List<InvestmentSchedule> list, Continuation<? super C497601> continuation) {
                    super(2, continuation);
                    this.$it = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497601 c497601 = new C497601(this.$it, continuation);
                    c497601.L$0 = obj;
                    return c497601;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoRecurringDataState cryptoRecurringDataState, Continuation<? super CryptoRecurringDataState> continuation) {
                    return ((C497601) create(cryptoRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoRecurringDataState.copy$default((CryptoRecurringDataState) this.L$0, null, null, this.$it, null, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497601((List) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }
}
