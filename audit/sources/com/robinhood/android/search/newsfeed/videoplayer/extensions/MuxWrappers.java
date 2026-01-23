package com.robinhood.android.search.newsfeed.videoplayer.extensions;

import com.robinhood.android.search.newsfeed.videoplayer.Video;
import com.robinhood.android.search.newsfeed.videoplayer.mux.MuxWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* compiled from: MuxWrappers.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"updateVideo", "", "Lcom/robinhood/android/search/newsfeed/videoplayer/mux/MuxWrapper;", "video", "Lcom/robinhood/android/search/newsfeed/videoplayer/Video;", "feature-search_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.videoplayer.extensions.MuxWrappersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MuxWrappers {
    public static final void updateVideo(MuxWrapper muxWrapper, Video video) throws JSONException {
        Intrinsics.checkNotNullParameter(muxWrapper, "<this>");
        Intrinsics.checkNotNullParameter(video, "video");
        String string2 = video.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        muxWrapper.updateVideo(string2, video.getTitle(), video.getUrl());
    }
}
