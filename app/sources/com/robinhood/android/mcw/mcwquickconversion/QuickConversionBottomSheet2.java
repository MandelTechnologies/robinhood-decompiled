package com.robinhood.android.mcw.mcwquickconversion;

import com.robinhood.android.mcw.contracts.QuickConversionKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickConversionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$QuickConversionBottomSheet$1$1", m3645f = "QuickConversionBottomSheet.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheetKt$QuickConversionBottomSheet$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class QuickConversionBottomSheet2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QuickConversionKey $arg;
    final /* synthetic */ QuickConversionDuxo $duxo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuickConversionBottomSheet2(QuickConversionDuxo quickConversionDuxo, QuickConversionKey quickConversionKey, Continuation<? super QuickConversionBottomSheet2> continuation) {
        super(2, continuation);
        this.$duxo = quickConversionDuxo;
        this.$arg = quickConversionKey;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuickConversionBottomSheet2(this.$duxo, this.$arg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((QuickConversionBottomSheet2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.updateArgs(this.$arg);
        return Unit.INSTANCE;
    }
}
