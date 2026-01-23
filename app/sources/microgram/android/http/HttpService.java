package microgram.android.http;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.Message;

/* compiled from: HttpService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/http/HttpService;", "", "onRequest", "", "message", "Lmicrogram/Message;", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancellation", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface HttpService {
    Object onCancellation(Message message, Continuation<? super Boolean> continuation);

    Object onRequest(Message message, Continuation<? super Boolean> continuation);
}
