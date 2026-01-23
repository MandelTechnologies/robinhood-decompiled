package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: TraderBackupWithholdingStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$backupWithholdingStatusEndpoint$2", m3645f = "TraderBackupWithholdingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.TraderBackupWithholdingStore$backupWithholdingStatusEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class TraderBackupWithholdingStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends String, ? extends UUID>, Optional<? extends WithholdingStatus>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ TraderBackupWithholdingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderBackupWithholdingStore3(TraderBackupWithholdingStore traderBackupWithholdingStore, Continuation<? super TraderBackupWithholdingStore3> continuation) {
        super(3, continuation);
        this.this$0 = traderBackupWithholdingStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends UUID> tuples2, Optional<? extends WithholdingStatus> optional, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<String, UUID>) tuples2, (Optional<WithholdingStatus>) optional, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, UUID> tuples2, Optional<WithholdingStatus> optional, Continuation<? super Unit> continuation) {
        TraderBackupWithholdingStore3 traderBackupWithholdingStore3 = new TraderBackupWithholdingStore3(this.this$0, continuation);
        traderBackupWithholdingStore3.L$0 = tuples2;
        traderBackupWithholdingStore3.L$1 = optional;
        return traderBackupWithholdingStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        Optional optional = (Optional) this.L$1;
        String str = (String) tuples2.component1();
        WithholdingStatus withholdingStatus = (WithholdingStatus) optional.component1();
        if (withholdingStatus != null) {
            this.this$0.withholdingStatusDao.insert(withholdingStatus);
        } else {
            this.this$0.withholdingStatusDao.delete(str);
        }
        return Unit.INSTANCE;
    }
}
