package com.twilio.conversations.extensions;

import com.twilio.conversations.CallbackListener;
import com.twilio.conversations.CancellationToken;
import com.twilio.conversations.Media;
import com.twilio.conversations.internal.CallbackListenerForwarder;
import com.twilio.conversations.media.MediaClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: MediaClientExtensions.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0000\u001a<\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0000¨\u0006\u000e"}, m3636d2 = {"getTemporaryContentUrlsForMedia", "Lcom/twilio/conversations/CancellationToken;", "Lcom/twilio/conversations/media/MediaClient;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "media", "", "Lcom/twilio/conversations/Media;", "listener", "Lcom/twilio/conversations/CallbackListener;", "", "", "getTemporaryContentUrlsForMediaSids", "mediaSids", "convo-android_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.conversations.extensions.MediaClientExtensionsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MediaClientExtensions {
    public static final CancellationToken getTemporaryContentUrlsForMedia(MediaClient mediaClient, CoroutineScope coroutineScope, List<? extends Media> media, CallbackListener<Map<String, String>> listener) {
        Intrinsics.checkNotNullParameter(mediaClient, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<? extends Media> list = media;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Media) it.next()).getSid());
        }
        return getTemporaryContentUrlsForMediaSids(mediaClient, coroutineScope, arrayList, listener);
    }

    public static final CancellationToken getTemporaryContentUrlsForMediaSids(MediaClient mediaClient, CoroutineScope coroutineScope, List<String> mediaSids, CallbackListener<Map<String, String>> listener) {
        Intrinsics.checkNotNullParameter(mediaClient, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaSids, "mediaSids");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MediaClientExtensions2(new CallbackListenerForwarder(listener), mediaClient, mediaSids, null), 3, null);
        return new CancellationToken() { // from class: com.twilio.conversations.extensions.MediaClientExtensionsKt$$ExternalSyntheticLambda0
            @Override // com.twilio.conversations.CancellationToken
            public final void cancel() {
                MediaClientExtensions.getTemporaryContentUrlsForMediaSids$lambda$1(jobLaunch$default);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getTemporaryContentUrlsForMediaSids$lambda$1(Job job) {
        Intrinsics.checkNotNullParameter(job, "$job");
        Job.DefaultImpls.cancel$default(job, null, 1, null);
    }
}
