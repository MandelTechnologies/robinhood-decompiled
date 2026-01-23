package com.robinhood.android.crypto.p094ui.detail.p095v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import bff_crypto_trading.service.p018v1.CryptoDetailPageStateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.CryptoBitstampUkUpsellRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.BffCryptoTradingStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoOnboardingM1Store;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.moshi.LazyMoshi;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001!BQ\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDataState;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailStateProvider;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOnboardingM1Store", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailStateProvider;Lcom/robinhood/utils/moshi/LazyMoshi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "args", "onCreate", "", "InitArgs", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoDetailDuxo extends BaseDuxo<CryptoDetailDataState, CryptoDetailViewState> implements HasArgs<InitArgs> {
    public static final int $stable = 8;
    private final InitArgs args;
    private final BffCryptoTradingStore bffCryptoTradingStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoOnboardingM1Store cryptoOnboardingM1Store;
    private final LazyMoshi moshi;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    public final LazyMoshi getMoshi() {
        return this.moshi;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoDetailDuxo(AuthManager authManager, DuxoBundle duxoBundle, CryptoDetailDuxo4 stateProvider, LazyMoshi moshi, SavedStateHandle savedStateHandle, BffCryptoTradingStore bffCryptoTradingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoOnboardingM1Store cryptoOnboardingM1Store, RegionGateProvider regionGateProvider) {
        super(new CryptoDetailDataState(null, authManager.isLoggedIn(), null, false, false, 29, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.moshi = moshi;
        this.savedStateHandle = savedStateHandle;
        this.bffCryptoTradingStore = bffCryptoTradingStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOnboardingM1Store = cryptoOnboardingM1Store;
        this.regionGateProvider = regionGateProvider;
        this.args = (InitArgs) getArgs(getSavedStateHandle());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C134871(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134882(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134893(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134904(null));
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$1 */
    static final class C134871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134871(Continuation<? super C134871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailDuxo.this.new C134871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<CryptoDetailPageStateDto>> cryptoDetailPageState = CryptoDetailDuxo.this.bffCryptoTradingStore.getCryptoDetailPageState(CryptoDetailDuxo.this.args.getCurrencyPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(cryptoDetailPageState, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "ordering", "", "Lbff_crypto_trading/service/v1/CryptoDetailPageStateDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$1$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends CryptoDetailPageStateDto>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailDuxo cryptoDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends CryptoDetailPageStateDto> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$1$1$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497961 extends ContinuationImpl7 implements Function2<CryptoDetailDataState, Continuation<? super CryptoDetailDataState>, Object> {
                final /* synthetic */ List<CryptoDetailPageStateDto> $ordering;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C497961(List<? extends CryptoDetailPageStateDto> list, Continuation<? super C497961> continuation) {
                    super(2, continuation);
                    this.$ordering = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497961 c497961 = new C497961(this.$ordering, continuation);
                    c497961.L$0 = obj;
                    return c497961;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailDataState cryptoDetailDataState, Continuation<? super CryptoDetailDataState> continuation) {
                    return ((C497961) create(cryptoDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailDataState.copy$default((CryptoDetailDataState) this.L$0, this.$ordering, false, null, false, false, 30, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497961((List) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$2", m3645f = "CryptoDetailDuxo.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$2 */
    static final class C134882 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134882(Continuation<? super C134882> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailDuxo.this.new C134882(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134882) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOnboardingM1Store cryptoOnboardingM1Store = CryptoDetailDuxo.this.cryptoOnboardingM1Store;
                this.label = 1;
                if (cryptoOnboardingM1Store.updateCryptoImpression(this) == coroutine_suspended) {
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
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$3", m3645f = "CryptoDetailDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$3 */
    static final class C134893 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134893(Continuation<? super C134893> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailDuxo.this.new C134893(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134893) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamSduiChartsExperimentState = CryptoDetailDuxo.this.cryptoExperimentsStore.streamSduiChartsExperimentState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamSduiChartsExperimentState, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$3$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailDuxo cryptoDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailDuxo;
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

            /* compiled from: CryptoDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$3$1$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497971 extends ContinuationImpl7 implements Function2<CryptoDetailDataState, Continuation<? super CryptoDetailDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497971(boolean z, Continuation<? super C497971> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497971 c497971 = new C497971(this.$it, continuation);
                    c497971.L$0 = obj;
                    return c497971;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailDataState cryptoDetailDataState, Continuation<? super CryptoDetailDataState> continuation) {
                    return ((C497971) create(cryptoDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailDataState.copy$default((CryptoDetailDataState) this.L$0, null, false, null, this.$it, false, 23, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497971(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$4", m3645f = "CryptoDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$4 */
    static final class C134904 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134904(Continuation<? super C134904> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailDuxo.this.new C134904(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134904) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(CryptoDetailDuxo.this.regionGateProvider, CryptoBitstampUkUpsellRegionGate.INSTANCE, false, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$4$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailDuxo cryptoDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailDuxo;
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

            /* compiled from: CryptoDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$4$1$1", m3645f = "CryptoDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497981 extends ContinuationImpl7 implements Function2<CryptoDetailDataState, Continuation<? super CryptoDetailDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497981(boolean z, Continuation<? super C497981> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497981 c497981 = new C497981(this.$it, continuation);
                    c497981.L$0 = obj;
                    return c497981;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailDataState cryptoDetailDataState, Continuation<? super CryptoDetailDataState> continuation) {
                    return ((C497981) create(cryptoDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailDataState.copy$default((CryptoDetailDataState) this.L$0, null, false, null, false, this.$it, 15, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497981(this.Z$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs;", "Landroid/os/Parcelable;", "<init>", "()V", "currencyPairId", "Ljava/util/UUID;", "getCurrencyPairId", "()Ljava/util/UUID;", "Crypto", "Tokenized", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs$Crypto;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs$Tokenized;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class InitArgs implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ InitArgs(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract UUID getCurrencyPairId();

        private InitArgs() {
        }

        /* compiled from: CryptoDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs$Crypto;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Crypto extends InitArgs {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
            private final UUID currencyPairId;

            /* compiled from: CryptoDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Crypto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Crypto((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            public static /* synthetic */ Crypto copy$default(Crypto crypto2, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = crypto2.currencyPairId;
                }
                return crypto2.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            public final Crypto copy(UUID currencyPairId) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                return new Crypto(currencyPairId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Crypto) && Intrinsics.areEqual(this.currencyPairId, ((Crypto) other).currencyPairId);
            }

            public int hashCode() {
                return this.currencyPairId.hashCode();
            }

            public String toString() {
                return "Crypto(currencyPairId=" + this.currencyPairId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.currencyPairId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Crypto(UUID currencyPairId) {
                super(null);
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                this.currencyPairId = currencyPairId;
            }

            @Override // com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo.InitArgs
            public UUID getCurrencyPairId() {
                return this.currencyPairId;
            }
        }

        /* compiled from: CryptoDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs$Tokenized;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo$InitArgs;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Tokenized extends InitArgs {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Tokenized> CREATOR = new Creator();
            private final UUID currencyPairId;

            /* compiled from: CryptoDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Tokenized> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Tokenized createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Tokenized((UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Tokenized[] newArray(int i) {
                    return new Tokenized[i];
                }
            }

            public static /* synthetic */ Tokenized copy$default(Tokenized tokenized, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = tokenized.currencyPairId;
                }
                return tokenized.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getCurrencyPairId() {
                return this.currencyPairId;
            }

            public final Tokenized copy(UUID currencyPairId) {
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                return new Tokenized(currencyPairId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Tokenized) && Intrinsics.areEqual(this.currencyPairId, ((Tokenized) other).currencyPairId);
            }

            public int hashCode() {
                return this.currencyPairId.hashCode();
            }

            public String toString() {
                return "Tokenized(currencyPairId=" + this.currencyPairId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.currencyPairId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tokenized(UUID currencyPairId) {
                super(null);
                Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
                this.currencyPairId = currencyPairId;
            }

            @Override // com.robinhood.android.crypto.ui.detail.v2.CryptoDetailDuxo.InitArgs
            public UUID getCurrencyPairId() {
                return this.currencyPairId;
            }
        }
    }
}
