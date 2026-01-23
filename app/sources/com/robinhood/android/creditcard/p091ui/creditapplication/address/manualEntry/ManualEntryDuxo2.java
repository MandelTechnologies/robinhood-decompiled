package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ManualEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryDuxo$doneLoading$1", m3645f = "ManualEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualEntryDuxo$doneLoading$1, reason: use source file name */
/* loaded from: classes2.dex */
final class ManualEntryDuxo2 extends ContinuationImpl7 implements Function2<ManualEntryViewState, Continuation<? super ManualEntryViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ManualEntryDuxo2(Continuation<? super ManualEntryDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManualEntryDuxo2 manualEntryDuxo2 = new ManualEntryDuxo2(continuation);
        manualEntryDuxo2.L$0 = obj;
        return manualEntryDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ManualEntryViewState manualEntryViewState, Continuation<? super ManualEntryViewState> continuation) {
        return ((ManualEntryDuxo2) create(manualEntryViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ManualEntryViewState.copy$default((ManualEntryViewState) this.L$0, false, null, 2, null);
    }
}
