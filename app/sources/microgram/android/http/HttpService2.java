package microgram.android.http;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import microgram.Message;
import microgram.android.MessageHandler;

/* compiled from: HttpService.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m3636d2 = {"requestHandler", "Lmicrogram/android/MessageHandler;", "Lmicrogram/android/http/HttpService;", "cancellationHandler", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.http.HttpServiceKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpService2 {
    public static final MessageHandler requestHandler(final HttpService httpService) {
        Intrinsics.checkNotNullParameter(httpService, "<this>");
        return new MessageHandler() { // from class: microgram.android.http.HttpServiceKt.requestHandler.1
            @Override // microgram.android.MessageHandler
            public Object handleWithReplyAsync(Message message, Continuation<? super Deferred<Message>> continuation) {
                return MessageHandler.DefaultImpls.handleWithReplyAsync(this, message, continuation);
            }

            @Override // microgram.android.MessageHandler
            public Object handle(Message message, Continuation<? super Boolean> continuation) {
                return httpService.onRequest(message, continuation);
            }
        };
    }

    public static final MessageHandler cancellationHandler(final HttpService httpService) {
        Intrinsics.checkNotNullParameter(httpService, "<this>");
        return new MessageHandler() { // from class: microgram.android.http.HttpServiceKt.cancellationHandler.1
            @Override // microgram.android.MessageHandler
            public Object handleWithReplyAsync(Message message, Continuation<? super Deferred<Message>> continuation) {
                return MessageHandler.DefaultImpls.handleWithReplyAsync(this, message, continuation);
            }

            @Override // microgram.android.MessageHandler
            public Object handle(Message message, Continuation<? super Boolean> continuation) {
                return httpService.onCancellation(message, continuation);
            }
        };
    }
}
