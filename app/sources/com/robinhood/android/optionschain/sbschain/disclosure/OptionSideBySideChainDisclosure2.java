package com.robinhood.android.optionschain.sbschain.disclosure;

import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureKt$OptionSideBySideChainDisclosure$1$1", m3645f = "OptionSideBySideChainDisclosure.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.disclosure.OptionSideBySideChainDisclosureKt$OptionSideBySideChainDisclosure$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainDisclosure2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionSideBySideChainDisclosureDuxo $duxo;
    final /* synthetic */ OptionChainLaunchMode $launchMode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainDisclosure2(OptionSideBySideChainDisclosureDuxo optionSideBySideChainDisclosureDuxo, OptionChainLaunchMode optionChainLaunchMode, Continuation<? super OptionSideBySideChainDisclosure2> continuation) {
        super(2, continuation);
        this.$duxo = optionSideBySideChainDisclosureDuxo;
        this.$launchMode = optionChainLaunchMode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainDisclosure2(this.$duxo, this.$launchMode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainDisclosure2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.bindLaunchMode(this.$launchMode);
        return Unit.INSTANCE;
    }
}
