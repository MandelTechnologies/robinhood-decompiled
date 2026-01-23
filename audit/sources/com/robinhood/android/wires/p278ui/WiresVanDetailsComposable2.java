package com.robinhood.android.wires.p278ui;

import com.robinhood.models.api.bonfire.transfer.wires.ApiWireVanDetailsInfoRow;
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

/* compiled from: WiresVanDetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.wires.ui.WiresVanDetailsComposableKt$WiresVanDetailsComposable$1$1$1$1$3$1$1$1$1", m3645f = "WiresVanDetailsComposable.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.wires.ui.WiresVanDetailsComposableKt$WiresVanDetailsComposable$1$1$1$1$3$1$1$1$1, reason: use source file name */
/* loaded from: classes16.dex */
final class WiresVanDetailsComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ClipboardUtil $clipboardUtil;
    final /* synthetic */ ApiWireVanDetailsInfoRow $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiresVanDetailsComposable2(ClipboardUtil clipboardUtil, ApiWireVanDetailsInfoRow apiWireVanDetailsInfoRow, Continuation<? super WiresVanDetailsComposable2> continuation) {
        super(2, continuation);
        this.$clipboardUtil = clipboardUtil;
        this.$this_with = apiWireVanDetailsInfoRow;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WiresVanDetailsComposable2(this.$clipboardUtil, this.$this_with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WiresVanDetailsComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ClipboardUtil clipboardUtil = this.$clipboardUtil;
            String secondary_text = this.$this_with.getSecondary_text();
            this.label = 1;
            if (clipboardUtil.copyToClipboardWithHapticFeedback(secondary_text, true, this) == coroutine_suspended) {
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
