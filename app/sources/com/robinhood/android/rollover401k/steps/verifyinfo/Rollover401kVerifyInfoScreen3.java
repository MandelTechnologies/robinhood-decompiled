package com.robinhood.android.rollover401k.steps.verifyinfo;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Rollover401kVerifyInfoScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$RolloverVerifyInfoContent$1$1", m3645f = "Rollover401kVerifyInfoScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$RolloverVerifyInfoContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class Rollover401kVerifyInfoScreen3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $hasScrolledToBottom$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Rollover401kVerifyInfoScreen3(ScrollState scrollState, SnapshotState<Boolean> snapshotState, Continuation<? super Rollover401kVerifyInfoScreen3> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$hasScrolledToBottom$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Rollover401kVerifyInfoScreen3(this.$scrollState, this.$hasScrolledToBottom$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Rollover401kVerifyInfoScreen3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$scrollState.getCanScrollForward()) {
            Rollover401kVerifyInfoScreen2.RolloverVerifyInfoContent$lambda$3(this.$hasScrolledToBottom$delegate, true);
        }
        return Unit.INSTANCE;
    }
}
