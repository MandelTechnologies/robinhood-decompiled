package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;

/* compiled from: InstrumentDetailTradeBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "accounts", "", "Lcom/robinhood/models/db/Account;", "isNotPreIpo"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$accountSwitchVisibleFlow$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$accountSwitchVisibleFlow$2, reason: use source file name */
/* loaded from: classes3.dex */
final class InstrumentDetailTradeBarDuxo4 extends ContinuationImpl7 implements Function3<List<? extends Account>, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    InstrumentDetailTradeBarDuxo4(Continuation<? super InstrumentDetailTradeBarDuxo4> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke((List<Account>) list, bool.booleanValue(), continuation);
    }

    public final Object invoke(List<Account> list, boolean z, Continuation<? super Boolean> continuation) {
        InstrumentDetailTradeBarDuxo4 instrumentDetailTradeBarDuxo4 = new InstrumentDetailTradeBarDuxo4(continuation);
        instrumentDetailTradeBarDuxo4.L$0 = list;
        instrumentDetailTradeBarDuxo4.Z$0 = z;
        return instrumentDetailTradeBarDuxo4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(((List) this.L$0).size() > 1 && this.Z$0);
    }
}
