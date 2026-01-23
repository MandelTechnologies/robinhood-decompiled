package com.robinhood.android.optionschain.sbschain.table;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1", m3645f = "OptionSideBySideChainTable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionSideBySideChainTableDuxo $duxo;
    final /* synthetic */ boolean $isNuxAnimationFinished;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, boolean z, Continuation<? super OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1> continuation) {
        super(2, continuation);
        this.$duxo = optionSideBySideChainTableDuxo;
        this.$isNuxAnimationFinished = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1(this.$duxo, this.$isNuxAnimationFinished, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.bindIsNuxAnimationFinished(this.$isNuxAnimationFinished);
        return Unit.INSTANCE;
    }
}
