package com.robinhood.librobinhood.data.store;

import com.robinhood.api.p280bw.BackupWithholdingApi;
import com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore;
import com.robinhood.models.api.bonfire.ApiWithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TraderBackupWithholdingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "params", "Lcom/robinhood/librobinhood/data/store/TraderBackupWithholdingStore$EstimatedWithholdingAmountParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$estimatedWithholdingAmountEndpoint$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {90}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$estimatedWithholdingAmountEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderBackupWithholdingStore4 extends ContinuationImpl7 implements Function2<TraderBackupWithholdingStore.EstimatedWithholdingAmountParams, Continuation<? super Optional<? extends WithholdingEstimatedAmount>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TraderBackupWithholdingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderBackupWithholdingStore4(TraderBackupWithholdingStore traderBackupWithholdingStore, Continuation<? super TraderBackupWithholdingStore4> continuation) {
        super(2, continuation);
        this.this$0 = traderBackupWithholdingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TraderBackupWithholdingStore4 traderBackupWithholdingStore4 = new TraderBackupWithholdingStore4(this.this$0, continuation);
        traderBackupWithholdingStore4.L$0 = obj;
        return traderBackupWithholdingStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TraderBackupWithholdingStore.EstimatedWithholdingAmountParams estimatedWithholdingAmountParams, Continuation<? super Optional<WithholdingEstimatedAmount>> continuation) {
        return ((TraderBackupWithholdingStore4) create(estimatedWithholdingAmountParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(TraderBackupWithholdingStore.EstimatedWithholdingAmountParams estimatedWithholdingAmountParams, Continuation<? super Optional<? extends WithholdingEstimatedAmount>> continuation) {
        return invoke2(estimatedWithholdingAmountParams, (Continuation<? super Optional<WithholdingEstimatedAmount>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TraderBackupWithholdingStore.EstimatedWithholdingAmountParams estimatedWithholdingAmountParams = (TraderBackupWithholdingStore.EstimatedWithholdingAmountParams) this.L$0;
            if (estimatedWithholdingAmountParams.getWithholdingStatus().isWithheld()) {
                BackupWithholdingApi backupWithholdingApi = this.this$0.bonfireApi;
                BigDecimal amount = estimatedWithholdingAmountParams.getAmount();
                int taxWithholdingStatus = estimatedWithholdingAmountParams.getWithholdingStatus().getTaxWithholdingStatus();
                UUID instrumentId = estimatedWithholdingAmountParams.getInstrumentId();
                String string2 = instrumentId != null ? instrumentId.toString() : null;
                this.label = 1;
                obj = backupWithholdingApi.getTaxWithholdingEstimatedAmount(amount, taxWithholdingStatus, string2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Optional2.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Optional3.asOptional(WithholdingEstimatedAmount2.toDbModel((ApiWithholdingEstimatedAmount) obj));
    }
}
