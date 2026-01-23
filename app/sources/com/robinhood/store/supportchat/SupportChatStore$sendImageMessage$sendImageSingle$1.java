package com.robinhood.store.supportchat;

import android.graphics.Bitmap;
import android.net.Uri;
import com.robinhood.android.bitmap.BitmapStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SupportChatStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.SupportChatStore$sendImageMessage$sendImageSingle$1", m3645f = "SupportChatStore.kt", m3646l = {692}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SupportChatStore$sendImageMessage$sendImageSingle$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int label;
    final /* synthetic */ SupportChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportChatStore$sendImageMessage$sendImageSingle$1(SupportChatStore supportChatStore, Bitmap bitmap, Continuation<? super SupportChatStore$sendImageMessage$sendImageSingle$1> continuation) {
        super(2, continuation);
        this.this$0 = supportChatStore;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportChatStore$sendImageMessage$sendImageSingle$1(this.this$0, this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((SupportChatStore$sendImageMessage$sendImageSingle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        BitmapStore bitmapStore = this.this$0.bitmapStore;
        Bitmap bitmap = this.$bitmap;
        String strGenerateUnsentImageFileName$default = ChatImageUtils.generateUnsentImageFileName$default(ChatImageUtils.INSTANCE, null, 1, null);
        this.label = 1;
        Object objEncryptBitmapAndSaveToDisk = bitmapStore.encryptBitmapAndSaveToDisk(bitmap, ChatImageUtils.TEMP_UNSENT_IMAGE_FILE_DIR, strGenerateUnsentImageFileName$default, this);
        return objEncryptBitmapAndSaveToDisk == coroutine_suspended ? coroutine_suspended : objEncryptBitmapAndSaveToDisk;
    }
}
