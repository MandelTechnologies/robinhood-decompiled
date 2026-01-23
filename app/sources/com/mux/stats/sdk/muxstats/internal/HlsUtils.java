package com.mux.stats.sdk.muxstats.internal;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.hls.HlsManifest;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: HlsUtils.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"!\u0010\u0016\u001a\u00020\u00008BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0002¨\u0006\u0017"}, m3636d2 = {"", "isHlsExtensionAvailable", "()Z", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "Landroidx/media3/common/Timeline$Window;", "window", "", "populateLiveStreamData", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;Landroidx/media3/common/Timeline$Window;)V", "currentWindow", "", "tagName", "", "parseManifestTagL", "(Landroidx/media3/common/Timeline$Window;Ljava/lang/String;)J", "parseManifestTag", "(Landroidx/media3/common/Timeline$Window;Ljava/lang/String;)Ljava/lang/String;", "hlsExtensionAvailable$delegate", "Lkotlin/Lazy;", "getHlsExtensionAvailable", "getHlsExtensionAvailable$annotations", "()V", "hlsExtensionAvailable", "library-exo_At_latestRelease"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.internal.HlsUtilsKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class HlsUtils {
    private static final Lazy hlsExtensionAvailable$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: com.mux.stats.sdk.muxstats.internal.HlsUtilsKt$hlsExtensionAvailable$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() throws ClassNotFoundException {
            boolean z = false;
            try {
                String canonicalName = HlsManifest.class.getCanonicalName();
                Intrinsics.checkNotNull(canonicalName);
                Class.forName(canonicalName);
                z = true;
            } catch (ClassNotFoundException unused) {
                MuxLogger.m1118w("isHlsExtensionAvailable", "HLS extension not found. Some features may not work");
            } catch (LinkageError unused2) {
                MuxLogger.m1118w("isHlsExtensionAvailable", "HLS extension not found. Some features may not work");
            }
            return Boolean.valueOf(z);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHlsExtensionAvailable() {
        return ((Boolean) hlsExtensionAvailable$delegate.getValue()).booleanValue();
    }

    public static final /* synthetic */ void populateLiveStreamData(MuxStateCollector muxStateCollector, Timeline.Window window) {
        Intrinsics.checkNotNullParameter(muxStateCollector, "<this>");
        Intrinsics.checkNotNullParameter(window, "window");
        if (window.isLive()) {
            muxStateCollector.setHlsManifestNewestTime(Long.valueOf(window.windowStartTimeMs));
            muxStateCollector.setHlsHoldBack(Long.valueOf(parseManifestTagL(window, "HOLD-BACK")));
            muxStateCollector.setHlsPartHoldBack(Long.valueOf(parseManifestTagL(window, "PART-HOLD-BACK")));
            muxStateCollector.setHlsPartTargetDuration(Long.valueOf(parseManifestTagL(window, "PART-TARGET")));
            muxStateCollector.setHlsTargetDuration(Long.valueOf(parseManifestTagL(window, "EXT-X-TARGETDURATION")));
        }
    }

    public static final /* synthetic */ long parseManifestTagL(Timeline.Window currentWindow, String tagName) {
        Intrinsics.checkNotNullParameter(currentWindow, "currentWindow");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        String strReplace$default = StringsKt.replace$default(parseManifestTag(currentWindow, tagName), ".", "", false, 4, (Object) null);
        try {
            return Long.parseLong(strReplace$default);
        } catch (NumberFormatException e) {
            MuxLogger.exception(e, "Manifest Parsing", "Bad number format for value: " + strReplace$default);
            return -1L;
        }
    }

    public static final /* synthetic */ String parseManifestTag(Timeline.Window currentWindow, String tagName) {
        Intrinsics.checkNotNullParameter(currentWindow, "currentWindow");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        if (getHlsExtensionAvailable() && currentWindow.manifest != null && tagName.length() > 0) {
            Object obj = currentWindow.manifest;
            if (obj instanceof HlsManifest) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.media3.exoplayer.hls.HlsManifest");
                for (String str : ((HlsManifest) obj).mediaPlaylist.tags) {
                    Intrinsics.checkNotNull(str);
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) tagName, false, 2, (Object) null)) {
                        String str2 = ((String[]) StringsKt.split$default((CharSequence) str, new String[]{tagName}, false, 0, 6, (Object) null).toArray(new String[0]))[1];
                        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) ",", false, 2, (Object) null)) {
                            str2 = ((String[]) StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]))[0];
                        }
                        if (!StringsKt.startsWith$default(str2, "=", false, 2, (Object) null) && !StringsKt.startsWith$default(str2, ":", false, 2, (Object) null)) {
                            return str2;
                        }
                        String strSubstring = str2.substring(1, str2.length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        return strSubstring;
                    }
                }
            }
        }
        return "-1";
    }
}
