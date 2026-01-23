package com.robinhood.android.common.mcduckling.util;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.api.minerva.ApiPreflightAction;
import com.robinhood.models.api.minerva.SimpleDebitCardActionEvent;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.Single;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: RhySuvManger.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;Lcom/robinhood/coroutines/rx/RxFactory;)V", "getPushTokenizeEvent", "Lio/reactivex/Single;", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RhySuvManger {
    private final GooglePayManager googlePayManager;
    private final PaymentCardStore paymentCardStore;
    private final RxFactory rxFactory;
    private final SuvMigrationManager suvMigrationManager;

    public RhySuvManger(GooglePayManager googlePayManager, PaymentCardStore paymentCardStore, SuvMigrationManager suvMigrationManager, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.googlePayManager = googlePayManager;
        this.paymentCardStore = paymentCardStore;
        this.suvMigrationManager = suvMigrationManager;
        this.rxFactory = rxFactory;
    }

    /* compiled from: RhySuvManger.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.mcduckling.util.RhySuvManger$getPushTokenizeEvent$1", m3645f = "RhySuvManger.kt", m3646l = {43, 34, 44, 45}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.mcduckling.util.RhySuvManger$getPushTokenizeEvent$1 */
    static final class C112831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PushTokenizeRequest>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C112831(Continuation<? super C112831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhySuvManger.this.new C112831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PushTokenizeRequest> continuation) {
            return ((C112831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
        
            if (r8 != r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SimpleDebitCardActionEvent simpleDebitCardActionEvent;
            VerificationRequiredException.Companion companion;
            SimpleDebitCardActionEvent simpleDebitCardActionEvent2;
            ApiPreflightAction apiPreflightAction;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SimpleDebitCardActionEvent simpleDebitCardActionEvent3 = SimpleDebitCardActionEvent.MOBILE_WALLET_PROVISIONING;
                Single<Optional<ApiPreflightAction>> singleFetchPreflightAction = RhySuvManger.this.paymentCardStore.fetchPreflightAction(simpleDebitCardActionEvent3);
                this.L$0 = simpleDebitCardActionEvent3;
                this.label = 1;
                Object objAwait = RxAwait3.await(singleFetchPreflightAction, this);
                if (objAwait != coroutine_suspended) {
                    simpleDebitCardActionEvent = simpleDebitCardActionEvent3;
                    obj = objAwait;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                simpleDebitCardActionEvent = (SimpleDebitCardActionEvent) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    simpleDebitCardActionEvent2 = (SimpleDebitCardActionEvent) this.L$2;
                    apiPreflightAction = (ApiPreflightAction) this.L$1;
                    companion = (VerificationRequiredException.Companion) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw companion.fromApiPreflightAction(apiPreflightAction, simpleDebitCardActionEvent2, ((Boolean) obj).booleanValue());
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PushTokenizeRequest pushTokenizeRequest = (PushTokenizeRequest) obj;
                    Intrinsics.checkNotNull(pushTokenizeRequest);
                    return pushTokenizeRequest;
                }
                ResultKt.throwOnFailure(obj);
                Single<PushTokenizeRequest> pushTokenizeRequest2 = RhySuvManger.this.googlePayManager.getPushTokenizeRequest(((PaymentCard) obj).getId());
                this.label = 4;
                obj = RxAwait3.await(pushTokenizeRequest2, this);
            }
            ApiPreflightAction apiPreflightAction2 = (ApiPreflightAction) ((Optional) obj).component1();
            if (apiPreflightAction2 == null) {
                Observable<PaymentCard> observableStreamActiveRhyCard = RhySuvManger.this.paymentCardStore.streamActiveRhyCard();
                this.L$0 = null;
                this.label = 3;
                obj = RxAwait3.awaitFirst(observableStreamActiveRhyCard, this);
                if (obj != coroutine_suspended) {
                    Single<PushTokenizeRequest> pushTokenizeRequest22 = RhySuvManger.this.googlePayManager.getPushTokenizeRequest(((PaymentCard) obj).getId());
                    this.label = 4;
                    obj = RxAwait3.await(pushTokenizeRequest22, this);
                }
            } else {
                companion = VerificationRequiredException.INSTANCE;
                SuvMigrationManager suvMigrationManager = RhySuvManger.this.suvMigrationManager;
                UUID workflow_instance_uuid = apiPreflightAction2.getWorkflow_instance_uuid();
                this.L$0 = companion;
                this.L$1 = apiPreflightAction2;
                this.L$2 = simpleDebitCardActionEvent;
                this.label = 2;
                Object objIsMigrated = suvMigrationManager.isMigrated(workflow_instance_uuid, this);
                if (objIsMigrated != coroutine_suspended) {
                    simpleDebitCardActionEvent2 = simpleDebitCardActionEvent;
                    apiPreflightAction = apiPreflightAction2;
                    obj = objIsMigrated;
                    throw companion.fromApiPreflightAction(apiPreflightAction, simpleDebitCardActionEvent2, ((Boolean) obj).booleanValue());
                }
            }
            return coroutine_suspended;
        }
    }

    public final Single<PushTokenizeRequest> getPushTokenizeEvent() {
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C112831(null), 1, null);
    }
}
