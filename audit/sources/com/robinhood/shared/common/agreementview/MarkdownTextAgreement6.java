package com.robinhood.shared.common.agreementview;

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

/* compiled from: MarkdownTextAgreement.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$MarkdownTextAgreement$2$1", m3645f = "MarkdownTextAgreement.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.common.agreementview.MarkdownTextAgreementKt$MarkdownTextAgreement$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class MarkdownTextAgreement6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $hasScrolledToBottom$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownTextAgreement6(ScrollState scrollState, SnapshotState<Boolean> snapshotState, Continuation<? super MarkdownTextAgreement6> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$hasScrolledToBottom$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarkdownTextAgreement6(this.$scrollState, this.$hasScrolledToBottom$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarkdownTextAgreement6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!this.$scrollState.getCanScrollForward()) {
            MarkdownTextAgreement.MarkdownTextAgreement$lambda$2(this.$hasScrolledToBottom$delegate, true);
        }
        return Unit.INSTANCE;
    }
}
