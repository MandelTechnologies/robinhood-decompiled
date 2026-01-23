package com.robinhood.android.advisory.tlh.gnl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GainsAndLossesDashboardSection.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSectionKt$GainsAndLossesDashboardSection$1$1", m3645f = "GainsAndLossesDashboardSection.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSectionKt$GainsAndLossesDashboardSection$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class GainsAndLossesDashboardSection2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $activeYear;
    final /* synthetic */ GainsAndLossesDuxo $duxo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GainsAndLossesDashboardSection2(GainsAndLossesDuxo gainsAndLossesDuxo, String str, Continuation<? super GainsAndLossesDashboardSection2> continuation) {
        super(2, continuation);
        this.$duxo = gainsAndLossesDuxo;
        this.$activeYear = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GainsAndLossesDashboardSection2(this.$duxo, this.$activeYear, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GainsAndLossesDashboardSection2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.setActiveYear(this.$activeYear);
        return Unit.INSTANCE;
    }
}
