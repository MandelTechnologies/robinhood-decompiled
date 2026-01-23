package com.robinhood.android.equitytradeladder;

import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onCreate$6$accountNumberStream$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$onCreate$6$accountNumberStream$3 extends ContinuationImpl7 implements Function3<Optional<? extends String>, Optional<? extends String>, Continuation<? super String>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    EquityTradeLadderDuxo$onCreate$6$accountNumberStream$3(Continuation<? super EquityTradeLadderDuxo$onCreate$6$accountNumberStream$3> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<String> optional, Optional<String> optional2, Continuation<? super String> continuation) {
        EquityTradeLadderDuxo$onCreate$6$accountNumberStream$3 equityTradeLadderDuxo$onCreate$6$accountNumberStream$3 = new EquityTradeLadderDuxo$onCreate$6$accountNumberStream$3(continuation);
        equityTradeLadderDuxo$onCreate$6$accountNumberStream$3.L$0 = optional;
        equityTradeLadderDuxo$onCreate$6$accountNumberStream$3.L$1 = optional2;
        return equityTradeLadderDuxo$onCreate$6$accountNumberStream$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Optional<? extends String> optional2, Continuation<? super String> continuation) {
        return invoke2((Optional<String>) optional, (Optional<String>) optional2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Optional optional = (Optional) this.L$0;
        Optional optional2 = (Optional) this.L$1;
        String str = (String) optional.component1();
        return str == null ? (String) optional2.component1() : str;
    }
}
