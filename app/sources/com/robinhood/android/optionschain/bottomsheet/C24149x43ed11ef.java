package com.robinhood.android.optionschain.bottomsheet;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainBottomSheetComponent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetComponent$7$1", m3645f = "OptionChainBottomSheetComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetComponentKt$OptionChainBottomSheetComponent$7$1 */
/* loaded from: classes11.dex */
final class C24149x43ed11ef extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<OptionChainBottomSheetState, Unit> $onStateChanged;
    final /* synthetic */ OptionChainBottomSheetState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C24149x43ed11ef(Function1<? super OptionChainBottomSheetState, Unit> function1, OptionChainBottomSheetState optionChainBottomSheetState, Continuation<? super C24149x43ed11ef> continuation) {
        super(2, continuation);
        this.$onStateChanged = function1;
        this.$state = optionChainBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C24149x43ed11ef(this.$onStateChanged, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C24149x43ed11ef) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Function1<OptionChainBottomSheetState, Unit> function1 = this.$onStateChanged;
        if (function1 != null) {
            function1.invoke(this.$state);
        }
        return Unit.INSTANCE;
    }
}
