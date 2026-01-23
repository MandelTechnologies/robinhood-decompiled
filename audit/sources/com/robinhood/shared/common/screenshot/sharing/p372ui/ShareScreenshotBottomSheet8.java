package com.robinhood.shared.common.screenshot.sharing.p372ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.plaid.internal.EnumC7081g;
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
@DebugMetadata(m3644c = "com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt$ShareScreenshotBottomSheet$1$1$1$1$1$1$1$1", m3645f = "ShareScreenshotBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.common.screenshot.sharing.ui.ShareScreenshotBottomSheetKt$ShareScreenshotBottomSheet$1$1$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class ShareScreenshotBottomSheet8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ ClipboardUtil $clipboardUtil;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $message;
    final /* synthetic */ ShareOption $shareOption;
    final /* synthetic */ String $shareTitle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareScreenshotBottomSheet8(ShareOption shareOption, Context context, Bitmap bitmap, String str, String str2, ClipboardUtil clipboardUtil, Continuation<? super ShareScreenshotBottomSheet8> continuation) {
        super(2, continuation);
        this.$shareOption = shareOption;
        this.$context = context;
        this.$bitmap = bitmap;
        this.$shareTitle = str;
        this.$message = str2;
        this.$clipboardUtil = clipboardUtil;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareScreenshotBottomSheet8(this.$shareOption, this.$context, this.$bitmap, this.$shareTitle, this.$message, this.$clipboardUtil, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareScreenshotBottomSheet8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ShareScreenshotBottomSheet2 action = this.$shareOption.getAction();
            Context context = this.$context;
            Bitmap bitmap = this.$bitmap;
            String str = this.$shareTitle;
            String str2 = this.$message;
            ClipboardUtil clipboardUtil = this.$clipboardUtil;
            this.label = 1;
            if (action.onClick(context, bitmap, str, str2, clipboardUtil, this) == coroutine_suspended) {
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
