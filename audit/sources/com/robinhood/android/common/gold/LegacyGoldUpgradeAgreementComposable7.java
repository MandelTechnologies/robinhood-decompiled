package com.robinhood.android.common.gold;

import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementViewState2;
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

/* compiled from: LegacyGoldUpgradeAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$2$2$1", m3645f = "LegacyGoldUpgradeAgreementComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementComposableKt$GoldUpgradeAgreementComposable$3$2$2$1, reason: use source file name */
/* loaded from: classes2.dex */
final class LegacyGoldUpgradeAgreementComposable7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Throwable, Unit> $onError;
    final /* synthetic */ LegacyGoldUpgradeAgreementViewState2 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyGoldUpgradeAgreementComposable7(Function1<? super Throwable, Unit> function1, LegacyGoldUpgradeAgreementViewState2 legacyGoldUpgradeAgreementViewState2, Continuation<? super LegacyGoldUpgradeAgreementComposable7> continuation) {
        super(2, continuation);
        this.$onError = function1;
        this.$state = legacyGoldUpgradeAgreementViewState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LegacyGoldUpgradeAgreementComposable7(this.$onError, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LegacyGoldUpgradeAgreementComposable7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onError.invoke(((LegacyGoldUpgradeAgreementViewState2.Error) this.$state).getThrowable());
        return Unit.INSTANCE;
    }
}
