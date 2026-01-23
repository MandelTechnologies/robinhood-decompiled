package com.twilio.conversations.extensions;

import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.media.MediaClient;
import com.twilio.util.InternalUtils3;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MediaClientExtensions.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.conversations.extensions.MediaClientExtensionsKt$getTemporaryContentUrlsForMediaSids$job$1", m3645f = "MediaClientExtensions.kt", m3646l = {33, 35}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.twilio.conversations.extensions.MediaClientExtensionsKt$getTemporaryContentUrlsForMediaSids$job$1, reason: use source file name */
/* loaded from: classes12.dex */
final class MediaClientExtensions2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CallbackListenerForwarder<Map<String, String>> $listenerForwarder;
    final /* synthetic */ List<String> $mediaSids;
    final /* synthetic */ MediaClient $this_getTemporaryContentUrlsForMediaSids;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaClientExtensions2(CallbackListenerForwarder<Map<String, String>> callbackListenerForwarder, MediaClient mediaClient, List<String> list, Continuation<? super MediaClientExtensions2> continuation) {
        super(2, continuation);
        this.$listenerForwarder = callbackListenerForwarder;
        this.$this_getTemporaryContentUrlsForMediaSids = mediaClient;
        this.$mediaSids = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MediaClientExtensions2 mediaClientExtensions2 = new MediaClientExtensions2(this.$listenerForwarder, this.$this_getTemporaryContentUrlsForMediaSids, this.$mediaSids, continuation);
        mediaClientExtensions2.L$0 = obj;
        return mediaClientExtensions2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaClientExtensions2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        ?? r1;
        CallbackListenerForwarder<Map<String, String>> callbackListenerForwarder;
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            r1 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ?? r12 = (CoroutineScope) this.L$0;
            MediaClient mediaClient = this.$this_getTemporaryContentUrlsForMediaSids;
            List<String> list = this.$mediaSids;
            Result.Companion companion2 = Result.INSTANCE;
            this.L$0 = r12;
            this.label = 1;
            obj = mediaClient.getTemporaryContentUrlList(list, this);
            i = r12;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                callbackListenerForwarder = (CallbackListenerForwarder) this.L$1;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                TwilioException twilioException = (TwilioException) obj;
                TwilioLogger3.getLogger(coroutineScope).m3192e("Error getting temporary urls", twilioException);
                callbackListenerForwarder.onError(twilioException.getErrorInfo());
                return Unit.INSTANCE;
            }
            ?? r13 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = r13;
        }
        objM28550constructorimpl = Result.m28550constructorimpl((Map) obj);
        r1 = i;
        CallbackListenerForwarder<Map<String, String>> callbackListenerForwarder2 = this.$listenerForwarder;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            TwilioException2 twilioException2 = TwilioException2.MediaFetchError;
            this.L$0 = r1;
            this.L$1 = callbackListenerForwarder2;
            this.label = 2;
            obj = InternalUtils3.toTwilioException(thM28553exceptionOrNullimpl, twilioException2, this);
            if (obj != coroutine_suspended) {
                callbackListenerForwarder = callbackListenerForwarder2;
                coroutineScope = r1;
                TwilioException twilioException3 = (TwilioException) obj;
                TwilioLogger3.getLogger(coroutineScope).m3192e("Error getting temporary urls", twilioException3);
                callbackListenerForwarder.onError(twilioException3.getErrorInfo());
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        this.$listenerForwarder.onSuccess((Map) objM28550constructorimpl);
        return Unit.INSTANCE;
    }
}
