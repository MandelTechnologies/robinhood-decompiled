package com.robinhood.librobinhood.data.store.cashier;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.transfers.models.p406db.AchTransfer2;
import com.robinhood.utils.extensions.HandleRefIdConflictOrThrow;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/cashier/AchTransferStore;", "Lcom/robinhood/store/Store;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "cashier", "Lcom/robinhood/android/api/cashier/Cashier;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/android/api/cashier/Cashier;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/store/StoreBundle;)V", "createAchTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "achRelationshipId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "refId", "baseEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "(Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/models/db/TransferDirection;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AchTransferStore extends Store {
    private final Cashier cashier;
    private final EventLogger eventLogger;
    private final PaymentTransferStore paymentTransferStore;

    /* compiled from: AchTransferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.cashier.AchTransferStore", m3645f = "AchTransferStore.kt", m3646l = {39, 58}, m3647m = "createAchTransfer")
    /* renamed from: com.robinhood.librobinhood.data.store.cashier.AchTransferStore$createAchTransfer$1 */
    static final class C347801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C347801(Continuation<? super C347801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AchTransferStore.this.createAchTransfer(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchTransferStore(PaymentTransferStore paymentTransferStore, Cashier cashier, EventLogger eventLogger, StoreBundle storeBundle) {
        super(storeBundle, AchTransfer.INSTANCE);
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(cashier, "cashier");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.paymentTransferStore = paymentTransferStore;
        this.cashier = cashier;
        this.eventLogger = eventLogger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r0 != r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createAchTransfer(UUID uuid, BigDecimal bigDecimal, TransferDirection transferDirection, UUID uuid2, UserInteractionEventData userInteractionEventData, Continuation<? super AchTransfer> continuation) {
        C347801 c347801;
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer;
        if (continuation instanceof C347801) {
            c347801 = (C347801) continuation;
            int i = c347801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c347801.label = i - Integer.MIN_VALUE;
            } else {
                c347801 = new C347801(continuation);
            }
        }
        C347801 c3478012 = c347801;
        Object objHandleRefIdConflictOrThrow = c3478012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3478012.label;
        try {
        } catch (Exception e) {
            AchTransferStore3 achTransferStore3 = new AchTransferStore3(this, null);
            c3478012.label = 2;
            objHandleRefIdConflictOrThrow = HandleRefIdConflictOrThrow.handleRefIdConflictOrThrow(e, achTransferStore3, c3478012);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHandleRefIdConflictOrThrow);
            EventLogger eventLogger = this.eventLogger;
            AchTransferStore2 achTransferStore2 = new AchTransferStore2(this, uuid, bigDecimal, transferDirection, uuid2, null);
            NetworkContext.Tag tag = NetworkContext.Tag.SUBMIT_TRANSFER;
            c3478012.label = 1;
            objHandleRefIdConflictOrThrow = EventLoggers.logResponseMetadataAndUnwrap(eventLogger, userInteractionEventData, achTransferStore2, tag, c3478012);
            if (objHandleRefIdConflictOrThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHandleRefIdConflictOrThrow);
                apiAchTransfer = (ApiPaymentTransferDetails.ApiAchTransfer) objHandleRefIdConflictOrThrow;
                this.paymentTransferStore.refreshPaginated(true);
                return AchTransfer2.toDbModel(apiAchTransfer);
            }
            ResultKt.throwOnFailure(objHandleRefIdConflictOrThrow);
        }
        apiAchTransfer = (ApiPaymentTransferDetails.ApiAchTransfer) objHandleRefIdConflictOrThrow;
        this.paymentTransferStore.refreshPaginated(true);
        return AchTransfer2.toDbModel(apiAchTransfer);
    }
}
