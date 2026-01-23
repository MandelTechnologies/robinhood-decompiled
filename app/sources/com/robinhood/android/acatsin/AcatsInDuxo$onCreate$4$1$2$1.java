package com.robinhood.android.acatsin;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function4;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "", "isMarginSupported", "isOptionsSupported", "isAcatsBrokerageMatchSupported"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$2$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
final class AcatsInDuxo$onCreate$4$1$2$1 extends ContinuationImpl7 implements Function4<Boolean, Boolean, Boolean, Continuation<? super Tuples3<? extends Boolean, ? extends Boolean, ? extends Boolean>>, Object> {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;

    AcatsInDuxo$onCreate$4$1$2$1(Continuation<? super AcatsInDuxo$onCreate$4$1$2$1> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Continuation<? super Tuples3<? extends Boolean, ? extends Boolean, ? extends Boolean>> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), (Continuation<? super Tuples3<Boolean, Boolean, Boolean>>) continuation);
    }

    public final Object invoke(boolean z, boolean z2, boolean z3, Continuation<? super Tuples3<Boolean, Boolean, Boolean>> continuation) {
        AcatsInDuxo$onCreate$4$1$2$1 acatsInDuxo$onCreate$4$1$2$1 = new AcatsInDuxo$onCreate$4$1$2$1(continuation);
        acatsInDuxo$onCreate$4$1$2$1.Z$0 = z;
        acatsInDuxo$onCreate$4$1$2$1.Z$1 = z2;
        acatsInDuxo$onCreate$4$1$2$1.Z$2 = z3;
        return acatsInDuxo$onCreate$4$1$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Tuples3(boxing.boxBoolean(this.Z$0), boxing.boxBoolean(this.Z$1), boxing.boxBoolean(this.Z$2));
    }
}
