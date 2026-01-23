package com.robinhood.shared.crypto.staking.staking.stakinghub;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.models.crypto.p315ui.staking.CryptoStakingHubModel;
import com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDataState;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoStakingHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubViewState;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "stateProvider", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingHubDuxo extends BaseDuxo<CryptoStakingHubDataState, CryptoStakingHubViewState> {
    public static final int $stable = 8;
    private final CryptoStakingStore cryptoStakingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStakingHubDuxo(CryptoStakingStore cryptoStakingStore, CryptoStakingHubStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(CryptoStakingHubDataState.Loading.INSTANCE, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoStakingStore = cryptoStakingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C378841(null), 3, null);
    }

    /* compiled from: CryptoStakingHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDuxo$onStart$1", m3645f = "CryptoStakingHubDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDuxo$onStart$1 */
    static final class C378841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C378841(Continuation<? super C378841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingHubDuxo.this.new C378841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoStakingStore cryptoStakingStore = CryptoStakingHubDuxo.this.cryptoStakingStore;
                    this.label = 1;
                    obj = cryptoStakingStore.getStakingHubModel(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CryptoStakingHubDuxo.this.applyMutation(new AnonymousClass1((CryptoStakingHubModel) obj, null));
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    CryptoStakingHubDuxo.this.applyMutation(new AnonymousClass2(null));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoStakingHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDuxo$onStart$1$1", m3645f = "CryptoStakingHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingHubDataState, Continuation<? super CryptoStakingHubDataState>, Object> {
            final /* synthetic */ CryptoStakingHubModel $stakingHubModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoStakingHubModel cryptoStakingHubModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$stakingHubModel = cryptoStakingHubModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$stakingHubModel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingHubDataState cryptoStakingHubDataState, Continuation<? super CryptoStakingHubDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new CryptoStakingHubDataState.Content(this.$stakingHubModel);
            }
        }

        /* compiled from: CryptoStakingHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/stakinghub/CryptoStakingHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDuxo$onStart$1$2", m3645f = "CryptoStakingHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.stakinghub.CryptoStakingHubDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoStakingHubDataState, Continuation<? super CryptoStakingHubDataState>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingHubDataState cryptoStakingHubDataState, Continuation<? super CryptoStakingHubDataState> continuation) {
                return ((AnonymousClass2) create(cryptoStakingHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingHubDataState.Error.INSTANCE;
            }
        }
    }
}
