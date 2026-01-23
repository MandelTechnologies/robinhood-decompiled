package com.robinhood.librobinhood.data.store;

import com.robinhood.api.p280bw.BackupWithholdingApi;
import com.robinhood.models.api.bonfire.ApiWithholdingInfoSheet;
import com.robinhood.models.p320db.bonfire.WithholdingInfoSheet;
import com.robinhood.models.p320db.bonfire.WithholdingInfoSheet2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TraderBackupWithholdingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/WithholdingInfoSheet;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$withholdingInfoSheetEndpoint$1", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$withholdingInfoSheetEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderBackupWithholdingStore8 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super WithholdingInfoSheet>, Object> {
    int label;
    final /* synthetic */ TraderBackupWithholdingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderBackupWithholdingStore8(TraderBackupWithholdingStore traderBackupWithholdingStore, Continuation<? super TraderBackupWithholdingStore8> continuation) {
        super(2, continuation);
        this.this$0 = traderBackupWithholdingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TraderBackupWithholdingStore8(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super WithholdingInfoSheet> continuation) {
        return ((TraderBackupWithholdingStore8) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BackupWithholdingApi backupWithholdingApi = this.this$0.bonfireApi;
            this.label = 1;
            obj = backupWithholdingApi.getTaxWithholdingInfoSheet(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return WithholdingInfoSheet2.toDbModel((ApiWithholdingInfoSheet) obj);
    }
}
