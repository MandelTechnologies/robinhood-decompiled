package com.robinhood.android.engagement.goldevent;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: LiveEventStreamViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"isInitializingOrBuffering", "", "Lcom/robinhood/android/engagement/goldevent/PlaybackState;", "(Lcom/robinhood/android/engagement/goldevent/PlaybackState;)Z", "shouldShowLive", "getShouldShowLive", "toSafeColorInt", "", "", "getToSafeColorInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "feature-live-event-stream_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.engagement.goldevent.LiveEventStreamViewStateKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LiveEventStreamViewState2 {
    public static final boolean isInitializingOrBuffering(LiveEventStreamViewState3 liveEventStreamViewState3) {
        Intrinsics.checkNotNullParameter(liveEventStreamViewState3, "<this>");
        return liveEventStreamViewState3 == LiveEventStreamViewState3.BUFFERING || liveEventStreamViewState3 == LiveEventStreamViewState3.INITIALIZING;
    }

    public static final boolean getShouldShowLive(LiveEventStreamViewState3 liveEventStreamViewState3) {
        Intrinsics.checkNotNullParameter(liveEventStreamViewState3, "<this>");
        return liveEventStreamViewState3 == LiveEventStreamViewState3.PLAYING || liveEventStreamViewState3 == LiveEventStreamViewState3.PAUSED;
    }

    public static final Integer getToSafeColorInt(String str) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
                str = "#" + str;
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Integer.valueOf(Color.parseColor(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
    }
}
