package com.plaid.link;

import com.plaid.internal.C5861H5;
import com.plaid.internal.C5927O5;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C6016Y5;
import com.plaid.internal.C6025Z5;
import com.plaid.internal.C7156n0;
import com.plaid.internal.InterfaceC6013Y2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.plaid.link.Plaid$submitInternal$1", m3645f = "Plaid.kt", m3646l = {96}, m3647m = "invokeSuspend")
/* loaded from: classes24.dex */
public final class Plaid$submitInternal$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubmissionData $submissionData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$submitInternal$1(SubmissionData submissionData, Continuation<? super Plaid$submitInternal$1> continuation) {
        super(2, continuation);
        this.$submissionData = submissionData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Plaid$submitInternal$1 plaid$submitInternal$1 = new Plaid$submitInternal$1(this.$submissionData, continuation);
        plaid$submitInternal$1.L$0 = obj;
        return plaid$submitInternal$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C6025Z5 c6025z5;
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC6013Y2 interfaceC6013Y2 = Plaid.tokenComponent;
            unit = null;
            if (interfaceC6013Y2 != null && (c6025z5 = ((C7156n0) interfaceC6013Y2).f3005n.get()) != null) {
                SubmissionData submissionData = this.$submissionData;
                this.L$0 = coroutineScope;
                this.label = 1;
                C5861H5 c5861h5 = c6025z5.f1872c;
                C5927O5 c5927o5 = c5861h5.f1377b;
                if (c5927o5 == null) {
                    c5927o5 = null;
                    if (c5927o5 != null) {
                        c6025z5.f1876g = submissionData;
                        objWithContext = Unit.INSTANCE;
                    } else {
                        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C6016Y5(c5927o5, submissionData, null), this);
                        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objWithContext = Unit.INSTANCE;
                        }
                    }
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (c5927o5.f1595e.get()) {
                        c5861h5.f1377b = null;
                        c5927o5 = null;
                    }
                    if (c5927o5 != null) {
                    }
                    if (objWithContext == coroutine_suspended) {
                    }
                }
            }
            if (unit == null) {
                C5953R5.a.m1304b(C5953R5.f1671a, "Token component is null, submit is has no effect");
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        unit = Unit.INSTANCE;
        if (unit == null) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Plaid$submitInternal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
