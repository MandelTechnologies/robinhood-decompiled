package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;

/* compiled from: BaseSortingHatStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "record", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatExperienceWithDynamicStaleEndpoint$2", m3645f = "BaseSortingHatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatExperienceWithDynamicStaleEndpoint$2, reason: use source file name */
/* loaded from: classes20.dex */
final class BaseSortingHatStore5 extends ContinuationImpl7 implements Function3<SortingHatQueryArgs, SortingHatRecord, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BaseSortingHatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSortingHatStore5(BaseSortingHatStore baseSortingHatStore, Continuation<? super BaseSortingHatStore5> continuation) {
        super(3, continuation);
        this.this$0 = baseSortingHatStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(SortingHatQueryArgs sortingHatQueryArgs, SortingHatRecord sortingHatRecord, Continuation<? super Unit> continuation) {
        BaseSortingHatStore5 baseSortingHatStore5 = new BaseSortingHatStore5(this.this$0, continuation);
        baseSortingHatStore5.L$0 = sortingHatQueryArgs;
        baseSortingHatStore5.L$1 = sortingHatRecord;
        return baseSortingHatStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            SortingHatQueryArgs sortingHatQueryArgs = (SortingHatQueryArgs) this.L$0;
            SortingHatRecord sortingHatRecord = (SortingHatRecord) this.L$1;
            this.this$0.sortingHatDao.insert(sortingHatRecord);
            this.this$0.sortingHatRecordInvestedMap.put(sortingHatQueryArgs, boxing.boxBoolean(this.this$0.isInvested(sortingHatRecord)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
