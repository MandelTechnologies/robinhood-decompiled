package com.robinhood.shared.common.screenshot.sharing.p372ui;

import android.net.Uri;
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

/* compiled from: ShareScreenshotBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$Copy$onClick$2", m3645f = "ShareScreenshotBottomSheet.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareOptionAction$Copy$onClick$2, reason: use source file name */
/* loaded from: classes26.dex */
final class ShareScreenshotBottomSheet4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ClipboardUtil $clipboardUtil;
    final /* synthetic */ Uri $imageUri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareScreenshotBottomSheet4(ClipboardUtil clipboardUtil, Uri uri, Continuation<? super ShareScreenshotBottomSheet4> continuation) {
        super(2, continuation);
        this.$clipboardUtil = clipboardUtil;
        this.$imageUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareScreenshotBottomSheet4(this.$clipboardUtil, this.$imageUri, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareScreenshotBottomSheet4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ClipboardUtil.copyToClipboardWithHapticFeedback$default(this.$clipboardUtil, this.$imageUri, false, 2, null);
        return Unit.INSTANCE;
    }
}
