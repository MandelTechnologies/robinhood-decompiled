package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo2;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.transfers.api.SduiResponse;
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
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QueuedDepositLearnMoreDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreState;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class QueuedDepositLearnMoreDuxo extends BaseDuxo4<QueuedDepositLearnMoreDuxo2> {
    public static final int $stable = 8;
    private final TransfersBonfireApi transfersBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueuedDepositLearnMoreDuxo(TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle) {
        super(QueuedDepositLearnMoreDuxo2.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    /* compiled from: QueuedDepositLearnMoreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo$onStart$1", m3645f = "QueuedDepositLearnMoreDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo$onStart$1 */
    static final class C308231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308231(Continuation<? super C308231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueuedDepositLearnMoreDuxo.this.new C308231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = QueuedDepositLearnMoreDuxo.this.transfersBonfireApi;
                    this.label = 1;
                    obj = transfersBonfireApi.getQueuedDepositLearnMore(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                QueuedDepositLearnMoreDuxo.this.applyMutation(new AnonymousClass1((SduiResponse) obj, null));
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    QueuedDepositLearnMoreDuxo.this.applyMutation(new AnonymousClass2(th, null));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: QueuedDepositLearnMoreDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo$onStart$1$1", m3645f = "QueuedDepositLearnMoreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<QueuedDepositLearnMoreDuxo2, Continuation<? super QueuedDepositLearnMoreDuxo2>, Object> {
            final /* synthetic */ SduiResponse $response;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SduiResponse sduiResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = sduiResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$response, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QueuedDepositLearnMoreDuxo2 queuedDepositLearnMoreDuxo2, Continuation<? super QueuedDepositLearnMoreDuxo2> continuation) {
                return ((AnonymousClass1) create(queuedDepositLearnMoreDuxo2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new QueuedDepositLearnMoreDuxo2.Loaded(extensions2.toImmutableList(this.$response.getContent()));
            }
        }

        /* compiled from: QueuedDepositLearnMoreDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/QueuedDepositLearnMoreState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo$onStart$1$2", m3645f = "QueuedDepositLearnMoreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.QueuedDepositLearnMoreDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<QueuedDepositLearnMoreDuxo2, Continuation<? super QueuedDepositLearnMoreDuxo2>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Throwable f5034$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f5034$e = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.f5034$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QueuedDepositLearnMoreDuxo2 queuedDepositLearnMoreDuxo2, Continuation<? super QueuedDepositLearnMoreDuxo2> continuation) {
                return ((AnonymousClass2) create(queuedDepositLearnMoreDuxo2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new QueuedDepositLearnMoreDuxo2.Error(this.f5034$e);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C308231(null));
    }
}
