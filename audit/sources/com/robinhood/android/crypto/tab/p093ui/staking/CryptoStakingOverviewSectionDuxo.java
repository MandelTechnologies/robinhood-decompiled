package com.robinhood.android.crypto.tab.p093ui.staking;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingOverview;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CryptoStakingOverviewSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/staking/CryptoStakingOverviewSectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/crypto/tab/ui/staking/CryptoStakingOverviewViewState;", "stakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoStakingOverviewSectionDuxo extends BaseDuxo4<CryptoStakingOverviewViewState> {
    public static final int $stable = 8;
    private final CryptoStakingStore stakingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStakingOverviewSectionDuxo(CryptoStakingStore stakingStore, DuxoBundle duxoBundle) {
        super(new CryptoStakingOverviewViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(stakingStore, "stakingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.stakingStore = stakingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C132351(null));
    }

    /* compiled from: CryptoStakingOverviewSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionDuxo$onCreate$1", m3645f = "CryptoStakingOverviewSectionDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionDuxo$onCreate$1 */
    static final class C132351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132351(Continuation<? super C132351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingOverviewSectionDuxo.this.new C132351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<CryptoStakingOverview> flowStreamOverview = CryptoStakingOverviewSectionDuxo.this.stakingStore.streamOverview();
                    final CryptoStakingOverviewSectionDuxo cryptoStakingOverviewSectionDuxo = CryptoStakingOverviewSectionDuxo.this;
                    FlowCollector<? super CryptoStakingOverview> flowCollector = new FlowCollector() { // from class: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionDuxo.onCreate.1.1

                        /* compiled from: CryptoStakingOverviewSectionDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/staking/CryptoStakingOverviewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionDuxo$onCreate$1$1$1", m3645f = "CryptoStakingOverviewSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.crypto.tab.ui.staking.CryptoStakingOverviewSectionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C497621 extends ContinuationImpl7 implements Function2<CryptoStakingOverviewViewState, Continuation<? super CryptoStakingOverviewViewState>, Object> {
                            final /* synthetic */ CryptoStakingOverview $overview;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C497621(CryptoStakingOverview cryptoStakingOverview, Continuation<? super C497621> continuation) {
                                super(2, continuation);
                                this.$overview = cryptoStakingOverview;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C497621 c497621 = new C497621(this.$overview, continuation);
                                c497621.L$0 = obj;
                                return c497621;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CryptoStakingOverviewViewState cryptoStakingOverviewViewState, Continuation<? super CryptoStakingOverviewViewState> continuation) {
                                return ((C497621) create(cryptoStakingOverviewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return ((CryptoStakingOverviewViewState) this.L$0).copy(extensions2.toImmutableList(this.$overview.getComponents()));
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((CryptoStakingOverview) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(CryptoStakingOverview cryptoStakingOverview, Continuation<? super Unit> continuation) {
                            cryptoStakingOverviewSectionDuxo.applyMutation(new C497621(cryptoStakingOverview, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamOverview.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                if (th instanceof CancellationException) {
                    throw th;
                }
                if (!Throwables.isNetworkRelated(th)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, new EventMetadata(SentryTeam.CRYPTO, MapsKt.mapOf(Tuples4.m3642to("feature", "CryptoYields")), null, 4, null), 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
