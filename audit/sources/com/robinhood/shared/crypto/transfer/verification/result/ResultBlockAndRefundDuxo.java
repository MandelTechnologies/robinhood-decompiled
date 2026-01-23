package com.robinhood.shared.crypto.transfer.verification.result;

import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferHistoryDetailResponse;
import com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundDuxo3;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ResultBlockAndRefundDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundDataState;", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundViewState;", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;)V", "bind", "", "transferId", "Ljava/util/UUID;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ResultBlockAndRefundDuxo extends BaseDuxo3<ResultBlockAndRefundDataState, ResultBlockAndRefundViewState, ResultBlockAndRefundDuxo3> {
    public static final int $stable = 8;
    private final CryptoTransfersStore cryptoTransfersStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultBlockAndRefundDuxo(DuxoBundle duxoBundle, ResultBlockAndRefundDuxo4 stateProvider, CryptoTransfersStore cryptoTransfersStore) {
        super(new ResultBlockAndRefundDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        this.cryptoTransfersStore = cryptoTransfersStore;
    }

    /* compiled from: ResultBlockAndRefundDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundDuxo$bind$1", m3645f = "ResultBlockAndRefundDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundDuxo$bind$1 */
    static final class C385491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $transferId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385491(UUID uuid, Continuation<? super C385491> continuation) {
            super(2, continuation);
            this.$transferId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResultBlockAndRefundDuxo.this.new C385491(this.$transferId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C385491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoTransfersStore cryptoTransfersStore = ResultBlockAndRefundDuxo.this.cryptoTransfersStore;
                    UUID uuid = this.$transferId;
                    this.label = 1;
                    obj = cryptoTransfersStore.fetchHistoryDetail(uuid, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ResultBlockAndRefundDuxo.this.applyMutation(new AnonymousClass1((CryptoTransferHistoryDetailResponse) obj, null));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    ResultBlockAndRefundDuxo.this.submit(new ResultBlockAndRefundDuxo3.Error(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ResultBlockAndRefundDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/result/ResultBlockAndRefundDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundDuxo$bind$1$1", m3645f = "ResultBlockAndRefundDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.result.ResultBlockAndRefundDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ResultBlockAndRefundDataState, Continuation<? super ResultBlockAndRefundDataState>, Object> {
            final /* synthetic */ CryptoTransferHistoryDetailResponse $history;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTransferHistoryDetailResponse cryptoTransferHistoryDetailResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$history = cryptoTransferHistoryDetailResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$history, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ResultBlockAndRefundDataState resultBlockAndRefundDataState, Continuation<? super ResultBlockAndRefundDataState> continuation) {
                return ((AnonymousClass1) create(resultBlockAndRefundDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((ResultBlockAndRefundDataState) this.L$0).copy(this.$history);
            }
        }
    }

    public final void bind(UUID transferId) {
        if (transferId != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C385491(transferId, null), 3, null);
        }
    }
}
