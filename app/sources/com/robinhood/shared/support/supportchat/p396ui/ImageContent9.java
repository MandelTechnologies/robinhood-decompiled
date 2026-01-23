package com.robinhood.shared.support.supportchat.p396ui;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.util.ChatImageLoadHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ImageContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.support.supportchat.ui.ImageContentKt$ImageContent$3$1", m3645f = "ImageContent.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.support.supportchat.ui.ImageContentKt$ImageContent$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ImageContent9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Bitmap> $cachedBitmap$delegate;
    final /* synthetic */ ChatImageLoadHelper $helper;
    final /* synthetic */ UiChatMessage.Regular.Image $message;
    final /* synthetic */ SnapshotState<ImageContent3> $visibleComponent$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageContent9(UiChatMessage.Regular.Image image, ChatImageLoadHelper chatImageLoadHelper, SnapshotState<Bitmap> snapshotState, SnapshotState<ImageContent3> snapshotState2, Continuation<? super ImageContent9> continuation) {
        super(2, continuation);
        this.$message = image;
        this.$helper = chatImageLoadHelper;
        this.$cachedBitmap$delegate = snapshotState;
        this.$visibleComponent$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageContent9(this.$message, this.$helper, this.$cachedBitmap$delegate, this.$visibleComponent$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageContent9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SnapshotState<ImageContent3> snapshotState;
        SnapshotState<Bitmap> snapshotState2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Uri encryptedImageUri = this.$message.getEncryptedImageUri();
            if (encryptedImageUri != null) {
                ChatImageLoadHelper chatImageLoadHelper = this.$helper;
                SnapshotState<Bitmap> snapshotState3 = this.$cachedBitmap$delegate;
                SnapshotState<ImageContent3> snapshotState4 = this.$visibleComponent$delegate;
                try {
                    this.L$0 = snapshotState4;
                    this.L$1 = snapshotState3;
                    this.label = 1;
                    obj = chatImageLoadHelper.readBitmapFromUri(encryptedImageUri, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    snapshotState2 = snapshotState3;
                    snapshotState = snapshotState4;
                } catch (Throwable unused) {
                    snapshotState = snapshotState4;
                    snapshotState.setValue(ImageContent3.Error);
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snapshotState2 = (SnapshotState) this.L$1;
        snapshotState = (SnapshotState) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Throwable unused2) {
            snapshotState.setValue(ImageContent3.Error);
            return Unit.INSTANCE;
        }
        snapshotState2.setValue((Bitmap) obj);
        return Unit.INSTANCE;
    }
}
