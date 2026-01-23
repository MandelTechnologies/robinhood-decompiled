package com.twilio.conversations.media;

import com.robinhood.android.util.notification.RhGcmListenerService;
import io.ktor.utils.p478io.core.Input;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MediaTransport.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0011J(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H¦@¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/twilio/conversations/media/MediaTransport;", "", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "uploadFile", "filename", "contentType", RhGcmListenerService.EXTRA_CATEGORY, "fileInput", "Lio/ktor/utils/io/core/Input;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/ktor/utils/io/core/Input;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFileAsText", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemporaryContentUrl", "mediaSid", "getTemporaryContentUrlList", "", "mediaSids", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shutdown", "", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface MediaTransport {
    Object downloadFileAsText(String str, Continuation<? super String> continuation);

    Object getTemporaryContentUrl(String str, Continuation<? super String> continuation);

    Object getTemporaryContentUrlList(List<String> list, Continuation<? super Map<String, String>> continuation);

    String getToken();

    void setToken(String str);

    void shutdown();

    Object uploadFile(String str, String str2, String str3, Input input, Continuation<? super String> continuation);
}
