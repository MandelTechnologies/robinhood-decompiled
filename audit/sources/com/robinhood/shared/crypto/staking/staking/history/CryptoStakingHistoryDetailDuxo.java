package com.robinhood.shared.crypto.staking.staking.history;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.models.api.staking.ApiCryptoStakingHistoryDetailResponse;
import com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailEvent;
import com.robinhood.shared.crypto.staking.staking.utils.ErrorHandlingUtils;
import com.robinhood.shared.crypto.staking.staking.utils.StakingCrashReporter;
import com.robinhood.shared.staking.contracts.CryptoStakingHistoryDetailFragmentKey;
import com.robinhood.utils.extensions.Throwables;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoStakingHistoryDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDataState;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailViewState;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "cancelOrder", "id", "Ljava/util/UUID;", "Companion", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingHistoryDetailDuxo extends BaseDuxo3<CryptoStakingHistoryDetailDataState, CryptoStakingHistoryDetailViewState, CryptoStakingHistoryDetailEvent> implements HasSavedState {
    private final CryptoStakingStore cryptoStakingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStakingHistoryDetailDuxo(CryptoStakingStore cryptoStakingStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoStakingHistoryDetailStateProvider stateProvider) {
        super(new CryptoStakingHistoryDetailDataState(null, false, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoStakingStore = cryptoStakingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C377741(null));
    }

    /* compiled from: CryptoStakingHistoryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$onCreate$1", m3645f = "CryptoStakingHistoryDetailDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$onCreate$1 */
    static final class C377741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C377741(Continuation<? super C377741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingHistoryDetailDuxo.this.new C377741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C377741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoStakingStore cryptoStakingStore = CryptoStakingHistoryDetailDuxo.this.cryptoStakingStore;
                    UUID stakingOrderId = ((CryptoStakingHistoryDetailFragmentKey) CryptoStakingHistoryDetailDuxo.INSTANCE.getArgs((HasSavedState) CryptoStakingHistoryDetailDuxo.this)).getStakingOrderId();
                    this.label = 1;
                    obj = cryptoStakingStore.fetchHistoryDetail(stakingOrderId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoStakingHistoryDetailDuxo.this.applyMutation(new AnonymousClass1((ApiCryptoStakingHistoryDetailResponse) obj, null));
            } catch (Throwable th) {
                ErrorHandlingUtils.throwIfCancellation(th);
                if (!Throwables.isNetworkRelated(th)) {
                    StakingCrashReporter.logNonFatal$default(StakingCrashReporter.INSTANCE, th, "history_detail", "fetch_history_detail", null, ((CryptoStakingHistoryDetailFragmentKey) CryptoStakingHistoryDetailDuxo.INSTANCE.getArgs((HasSavedState) CryptoStakingHistoryDetailDuxo.this)).getStakingOrderId(), 8, null);
                }
                CryptoStakingHistoryDetailDuxo.this.submit(new CryptoStakingHistoryDetailEvent.Error(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoStakingHistoryDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$onCreate$1$1", m3645f = "CryptoStakingHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState>, Object> {
            final /* synthetic */ ApiCryptoStakingHistoryDetailResponse $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiCryptoStakingHistoryDetailResponse apiCryptoStakingHistoryDetailResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = apiCryptoStakingHistoryDetailResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingHistoryDetailDataState cryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingHistoryDetailDataState.copy$default((CryptoStakingHistoryDetailDataState) this.L$0, this.$response, false, 2, null);
            }
        }
    }

    /* compiled from: CryptoStakingHistoryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1", m3645f = "CryptoStakingHistoryDetailDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1 */
    static final class C377731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C377731(UUID uuid, Continuation<? super C377731> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingHistoryDetailDuxo.this.new C377731(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C377731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoStakingHistoryDetailDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoStakingStore cryptoStakingStore = CryptoStakingHistoryDetailDuxo.this.cryptoStakingStore;
                    UUID uuid = this.$id;
                    this.label = 1;
                    obj = cryptoStakingStore.cancelOrder(uuid, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoStakingHistoryDetailDuxo.this.applyMutation(new AnonymousClass2((ApiCryptoStakingHistoryDetailResponse) obj, null));
            } catch (Throwable th) {
                ErrorHandlingUtils.throwIfCancellation(th);
                CryptoStakingHistoryDetailDuxo.this.applyMutation(new AnonymousClass3(null));
                if (!Throwables.isNetworkRelated(th)) {
                    StakingCrashReporter.logNonFatal$default(StakingCrashReporter.INSTANCE, th, "history_detail", "cancel_order", null, this.$id, 8, null);
                }
                CryptoStakingHistoryDetailDuxo.this.submit(new CryptoStakingHistoryDetailEvent.Error(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoStakingHistoryDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1$1", m3645f = "CryptoStakingHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingHistoryDetailDataState cryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingHistoryDetailDataState.copy$default((CryptoStakingHistoryDetailDataState) this.L$0, null, true, 1, null);
            }
        }

        /* compiled from: CryptoStakingHistoryDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1$2", m3645f = "CryptoStakingHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState>, Object> {
            final /* synthetic */ ApiCryptoStakingHistoryDetailResponse $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ApiCryptoStakingHistoryDetailResponse apiCryptoStakingHistoryDetailResponse, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$response = apiCryptoStakingHistoryDetailResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$response, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingHistoryDetailDataState cryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState> continuation) {
                return ((AnonymousClass2) create(cryptoStakingHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoStakingHistoryDetailDataState) this.L$0).copy(this.$response, false);
            }
        }

        /* compiled from: CryptoStakingHistoryDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1$3", m3645f = "CryptoStakingHistoryDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.history.CryptoStakingHistoryDetailDuxo$cancelOrder$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingHistoryDetailDataState cryptoStakingHistoryDetailDataState, Continuation<? super CryptoStakingHistoryDetailDataState> continuation) {
                return ((AnonymousClass3) create(cryptoStakingHistoryDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingHistoryDetailDataState.copy$default((CryptoStakingHistoryDetailDataState) this.L$0, null, false, 1, null);
            }
        }
    }

    public final void cancelOrder(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C377731(id, null), 3, null);
    }

    /* compiled from: CryptoStakingHistoryDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailDuxo;", "Lcom/robinhood/shared/staking/contracts/CryptoStakingHistoryDetailFragmentKey;", "<init>", "()V", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoStakingHistoryDetailDuxo, CryptoStakingHistoryDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoStakingHistoryDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoStakingHistoryDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoStakingHistoryDetailFragmentKey getArgs(CryptoStakingHistoryDetailDuxo cryptoStakingHistoryDetailDuxo) {
            return (CryptoStakingHistoryDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, cryptoStakingHistoryDetailDuxo);
        }
    }
}
