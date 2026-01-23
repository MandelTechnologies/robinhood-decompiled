package com.robinhood.android.portfolio.pnlhub.appbar;

import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PnlHubTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J;\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDataState;", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarViewState;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "stateProvider", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "bind", "availableAssetClasses", "", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "selectedAssetClass", "optionsSupported", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode;", "showCryptoFilterTooltip", "bind$feature_profit_and_loss_hub_externalDebug", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PnlHubTopAppBarDuxo extends BaseDuxo<PnlHubTopAppBarDataState, PnlHubTopAppBarViewState> {
    public static final int $stable = 8;
    private final CryptoExperimentsStore cryptoExperimentsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PnlHubTopAppBarDuxo(CryptoExperimentsStore cryptoExperimentsStore, PnlHubTopAppBarDuxo4 stateProvider, DuxoBundle duxoBundle) {
        super(new PnlHubTopAppBarDataState(CollectionsKt.emptyList(), PnlHubAssetClass.EQUITY, false, null, false, false), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C257721(null));
    }

    /* compiled from: PnlHubTopAppBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$onCreate$1", m3645f = "PnlHubTopAppBarDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$onCreate$1 */
    static final class C257721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C257721(Continuation<? super C257721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PnlHubTopAppBarDuxo.this.new C257721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C257721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoUsCostBasisExperiment = PnlHubTopAppBarDuxo.this.cryptoExperimentsStore.streamCryptoUsCostBasisExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PnlHubTopAppBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoUsCostBasisExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PnlHubTopAppBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$onCreate$1$1", m3645f = "PnlHubTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PnlHubTopAppBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pnlHubTopAppBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PnlHubTopAppBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$onCreate$1$1$1", m3645f = "PnlHubTopAppBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504741 extends ContinuationImpl7 implements Function2<PnlHubTopAppBarDataState, Continuation<? super PnlHubTopAppBarDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504741(boolean z, Continuation<? super C504741> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504741 c504741 = new C504741(this.$it, continuation);
                    c504741.L$0 = obj;
                    return c504741;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PnlHubTopAppBarDataState pnlHubTopAppBarDataState, Continuation<? super PnlHubTopAppBarDataState> continuation) {
                    return ((C504741) create(pnlHubTopAppBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PnlHubTopAppBarDataState.copy$default((PnlHubTopAppBarDataState) this.L$0, null, null, false, null, false, this.$it, 31, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504741(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void bind$feature_profit_and_loss_hub_externalDebug(List<? extends PnlHubAssetClass> availableAssetClasses, PnlHubAssetClass selectedAssetClass, boolean optionsSupported, CountryCode locality, boolean showCryptoFilterTooltip) {
        Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
        Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
        Intrinsics.checkNotNullParameter(locality, "locality");
        applyMutation(new PnlHubTopAppBarDuxo3(availableAssetClasses, selectedAssetClass, optionsSupported, locality, showCryptoFilterTooltip, null));
    }
}
