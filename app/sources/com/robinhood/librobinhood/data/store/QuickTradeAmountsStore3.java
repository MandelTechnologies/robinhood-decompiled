package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiQuickTradeAmounts;
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

/* compiled from: QuickTradeAmountsStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "quickTradeAmounts", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuickTradeAmountsStore$quickTradeAmountsEndpoint$2", m3645f = "QuickTradeAmountsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.QuickTradeAmountsStore$quickTradeAmountsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class QuickTradeAmountsStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends String, ? extends UUID>, ApiQuickTradeAmounts, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ QuickTradeAmountsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuickTradeAmountsStore3(QuickTradeAmountsStore quickTradeAmountsStore, Continuation<? super QuickTradeAmountsStore3> continuation) {
        super(3, continuation);
        this.this$0 = quickTradeAmountsStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends UUID> tuples2, ApiQuickTradeAmounts apiQuickTradeAmounts, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<String, UUID>) tuples2, apiQuickTradeAmounts, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, UUID> tuples2, ApiQuickTradeAmounts apiQuickTradeAmounts, Continuation<? super Unit> continuation) {
        QuickTradeAmountsStore3 quickTradeAmountsStore3 = new QuickTradeAmountsStore3(this.this$0, continuation);
        quickTradeAmountsStore3.L$0 = tuples2;
        quickTradeAmountsStore3.L$1 = apiQuickTradeAmounts;
        return quickTradeAmountsStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            ApiQuickTradeAmounts apiQuickTradeAmounts = (ApiQuickTradeAmounts) this.L$1;
            String str = (String) tuples2.component1();
            this.this$0.updateInMemoryCache((UUID) tuples2.component2(), str, apiQuickTradeAmounts);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
