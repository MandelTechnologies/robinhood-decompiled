package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMemoBanList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MemoBanListStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/matcha/api/ApiMemoBanList;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MemoBanListStore$getBanList$2", m3645f = "MemoBanListStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.matcha.MemoBanListStore$getBanList$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MemoBanListStore3 extends ContinuationImpl7 implements Function2<ApiMemoBanList, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MemoBanListStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemoBanListStore3(MemoBanListStore memoBanListStore, Continuation<? super MemoBanListStore3> continuation) {
        super(2, continuation);
        this.this$0 = memoBanListStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MemoBanListStore3 memoBanListStore3 = new MemoBanListStore3(this.this$0, continuation);
        memoBanListStore3.L$0 = obj;
        return memoBanListStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMemoBanList apiMemoBanList, Continuation<? super Unit> continuation) {
        return ((MemoBanListStore3) create(apiMemoBanList, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.banListRelay.accept(((ApiMemoBanList) this.L$0).getBan_list());
        return Unit.INSTANCE;
    }
}
