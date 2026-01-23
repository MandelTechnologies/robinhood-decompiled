package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.equityscreener.models.dao.ScreenersDao;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/equityscreener/models/db/Screener;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$screenerEndpoint$2", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class ScreenersStore$screenerEndpoint$2 extends ContinuationImpl7 implements Function2<Optional<? extends Screener>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScreenersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenersStore$screenerEndpoint$2(ScreenersStore screenersStore, Continuation<? super ScreenersStore$screenerEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = screenersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenersStore$screenerEndpoint$2 screenersStore$screenerEndpoint$2 = new ScreenersStore$screenerEndpoint$2(this.this$0, continuation);
        screenersStore$screenerEndpoint$2.L$0 = obj;
        return screenersStore$screenerEndpoint$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<Screener> optional, Continuation<? super Unit> continuation) {
        return ((ScreenersStore$screenerEndpoint$2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Screener> optional, Continuation<? super Unit> continuation) {
        return invoke2((Optional<Screener>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Screener screener = (Screener) ((Optional) this.L$0).getOrNull();
            if (screener != null) {
                ScreenersDao screenersDao = this.this$0.screenersDao;
                this.label = 1;
                if (screenersDao.insert(screener, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
