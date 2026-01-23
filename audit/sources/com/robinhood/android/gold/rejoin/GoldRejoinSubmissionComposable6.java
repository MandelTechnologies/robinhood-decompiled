package com.robinhood.android.gold.rejoin;

import com.robinhood.android.common.p088ui.view.RhToolbar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldRejoinSubmissionComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$3$1$1", m3645f = "GoldRejoinSubmissionComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionComposableKt$GoldRejoinSubmissionComposable$3$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldRejoinSubmissionComposable6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RhToolbar $rhToolbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldRejoinSubmissionComposable6(RhToolbar rhToolbar, Continuation<? super GoldRejoinSubmissionComposable6> continuation) {
        super(2, continuation);
        this.$rhToolbar = rhToolbar;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldRejoinSubmissionComposable6(this.$rhToolbar, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldRejoinSubmissionComposable6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RhToolbar rhToolbar = this.$rhToolbar;
        if (rhToolbar != null) {
            rhToolbar.setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
