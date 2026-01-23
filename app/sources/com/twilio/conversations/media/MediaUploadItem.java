package com.twilio.conversations.media;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.twilio.conversations.MediaCategory;
import com.twilio.conversations.MediaUploadListener;
import io.ktor.utils.p478io.core.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaUploadItem.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/twilio/conversations/media/MediaUploadItem;", "", "input", "Lio/ktor/utils/io/core/Input;", "contentType", "", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/twilio/conversations/MediaCategory;", "filename", "listener", "Lcom/twilio/conversations/MediaUploadListener;", "<init>", "(Lio/ktor/utils/io/core/Input;Ljava/lang/String;Lcom/twilio/conversations/MediaCategory;Ljava/lang/String;Lcom/twilio/conversations/MediaUploadListener;)V", "getInput", "()Lio/ktor/utils/io/core/Input;", "getContentType", "()Ljava/lang/String;", "getCategory", "()Lcom/twilio/conversations/MediaCategory;", "getFilename", "getListener", "()Lcom/twilio/conversations/MediaUploadListener;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MediaUploadItem {
    private final MediaCategory category;
    private final String contentType;
    private final String filename;
    private final Input input;
    private final MediaUploadListener listener;

    public MediaUploadItem(Input input, String contentType, MediaCategory category, String str, MediaUploadListener mediaUploadListener) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(category, "category");
        this.input = input;
        this.contentType = contentType;
        this.category = category;
        this.filename = str;
        this.listener = mediaUploadListener;
    }

    public /* synthetic */ MediaUploadItem(Input input, String str, MediaCategory mediaCategory, String str2, MediaUploadListener mediaUploadListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(input, str, mediaCategory, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : mediaUploadListener);
    }

    public final Input getInput() {
        return this.input;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final MediaCategory getCategory() {
        return this.category;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final MediaUploadListener getListener() {
        return this.listener;
    }
}
