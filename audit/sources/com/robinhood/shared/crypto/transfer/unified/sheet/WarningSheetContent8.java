package com.robinhood.shared.crypto.transfer.unified.sheet;

import com.robinhood.utils.compose.ClipboardUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WarningSheetContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$WarningSheetContent$1$1$1$1", m3645f = "WarningSheetContent.kt", m3646l = {89}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.WarningSheetContentKt$WarningSheetContent$1$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class WarningSheetContent8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $addressTag;
    final /* synthetic */ ClipboardUtil $clipboardUtil;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WarningSheetContent8(ClipboardUtil clipboardUtil, String str, Continuation<? super WarningSheetContent8> continuation) {
        super(2, continuation);
        this.$clipboardUtil = clipboardUtil;
        this.$addressTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WarningSheetContent8(this.$clipboardUtil, this.$addressTag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WarningSheetContent8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ClipboardUtil clipboardUtil = this.$clipboardUtil;
            String str = this.$addressTag;
            this.label = 1;
            if (ClipboardUtil.copyToClipboardWithHapticFeedback$default(clipboardUtil, str, false, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
