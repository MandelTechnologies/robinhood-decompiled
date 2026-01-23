package com.twilio.conversations.media;

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
import kotlinx.coroutines.sync.Semaphore;

/* compiled from: MediaClient.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.conversations.media.MediaClient$upload$2$jobs$1$1", m3645f = "MediaClient.kt", m3646l = {105, 31}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.twilio.conversations.media.MediaClient$upload$2$jobs$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class MediaClient2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ MediaUploadItem $item;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MediaClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaClient2(MediaClient mediaClient, MediaUploadItem mediaUploadItem, Continuation<? super MediaClient2> continuation) {
        super(2, continuation);
        this.this$0 = mediaClient;
        this.$item = mediaUploadItem;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaClient2(this.this$0, this.$item, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((MediaClient2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Semaphore semaphore;
        MediaClient mediaClient;
        MediaUploadItem mediaUploadItem;
        Semaphore semaphore2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                semaphore = this.this$0.semaphore;
                MediaClient mediaClient2 = this.this$0;
                MediaUploadItem mediaUploadItem2 = this.$item;
                this.L$0 = semaphore;
                this.L$1 = mediaClient2;
                this.L$2 = mediaUploadItem2;
                this.label = 1;
                if (semaphore.acquire(this) != coroutine_suspended) {
                    mediaClient = mediaClient2;
                    mediaUploadItem = mediaUploadItem2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                semaphore2 = (Semaphore) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) obj;
                    semaphore2.release();
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    semaphore2.release();
                    throw th;
                }
            }
            mediaUploadItem = (MediaUploadItem) this.L$2;
            mediaClient = (MediaClient) this.L$1;
            Semaphore semaphore3 = (Semaphore) this.L$0;
            ResultKt.throwOnFailure(obj);
            semaphore = semaphore3;
            this.L$0 = semaphore;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object objUploadItem = mediaClient.uploadItem(mediaUploadItem, this);
            if (objUploadItem != coroutine_suspended) {
                semaphore2 = semaphore;
                obj = objUploadItem;
                String str2 = (String) obj;
                semaphore2.release();
                return str2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            semaphore2 = semaphore;
            th = th3;
            semaphore2.release();
            throw th;
        }
    }
}
