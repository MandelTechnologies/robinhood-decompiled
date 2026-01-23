package com.mux.stats.sdk.muxstats.internal;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.hls.HlsManifest;
import com.mux.android.util.Weak2;
import com.mux.stats.sdk.core.model.SessionTag;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxPlayerAdapter;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionDataBinding.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/internal/SessionDataPlayerBinding;", "Lcom/mux/stats/sdk/muxstats/MuxPlayerAdapter$PlayerBinding;", "Landroidx/media3/exoplayer/ExoPlayer;", "()V", "<set-?>", "Landroidx/media3/exoplayer/analytics/AnalyticsListener;", "listener", "getListener", "()Landroidx/media3/exoplayer/analytics/AnalyticsListener;", "setListener", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener;)V", "listener$delegate", "Lkotlin/properties/ReadWriteProperty;", "bindPlayer", "", "player", "collector", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "unbindPlayer", "SessionDataListener", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.internal.SessionDataPlayerBinding, reason: use source file name */
/* loaded from: classes27.dex */
public final class SessionDataBinding2 implements MuxPlayerAdapter.PlayerBinding<ExoPlayer> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SessionDataBinding2.class, "listener", "getListener()Landroidx/media3/exoplayer/analytics/AnalyticsListener;", 0))};

    /* renamed from: listener$delegate, reason: from kotlin metadata */
    private final Interfaces3 listener = Weak2.weak(null);

    private final AnalyticsListener getListener() {
        return (AnalyticsListener) this.listener.getValue(this, $$delegatedProperties[0]);
    }

    private final void setListener(AnalyticsListener analyticsListener) {
        this.listener.setValue(this, $$delegatedProperties[0], analyticsListener);
    }

    @Override // com.mux.stats.sdk.muxstats.MuxPlayerAdapter.PlayerBinding
    public void bindPlayer(ExoPlayer player, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        if (HlsUtils.getHlsExtensionAvailable()) {
            SessionDataListener sessionDataListener = new SessionDataListener(player, collector);
            player.addAnalyticsListener(sessionDataListener);
            setListener(sessionDataListener);
        }
    }

    @Override // com.mux.stats.sdk.muxstats.MuxPlayerAdapter.PlayerBinding
    public void unbindPlayer(ExoPlayer player, MuxStateCollector collector) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(collector, "collector");
        AnalyticsListener listener = getListener();
        if (listener != null) {
            player.removeAnalyticsListener(listener);
        }
    }

    /* compiled from: SessionDataBinding.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/internal/SessionDataPlayerBinding$SessionDataListener;", "Landroidx/media3/exoplayer/analytics/AnalyticsListener;", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "collector", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)V", "", "", "hlsTags", "Lcom/mux/stats/sdk/core/model/SessionTag;", "parseHlsSessionData", "(Ljava/util/List;)Ljava/util/List;", "rawTags", "filterHlsSessionTags", "line", "parseHlsSessionTag", "(Ljava/lang/String;)Lcom/mux/stats/sdk/core/model/SessionTag;", "Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;", "eventTime", "", "reason", "", "onTimelineChanged", "(Landroidx/media3/exoplayer/analytics/AnalyticsListener$EventTime;I)V", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "player$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "Companion", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.mux.stats.sdk.muxstats.internal.SessionDataPlayerBinding$SessionDataListener */
    private static final class SessionDataListener implements AnalyticsListener {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SessionDataListener.class, "player", "getPlayer()Landroidx/media3/exoplayer/ExoPlayer;", 0))};

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<Pattern> RX_SESSION_TAG_DATA_ID$delegate = LazyKt.lazy(new Function0<Pattern>() { // from class: com.mux.stats.sdk.muxstats.internal.SessionDataPlayerBinding$SessionDataListener$Companion$RX_SESSION_TAG_DATA_ID$2
            @Override // kotlin.jvm.functions.Function0
            public final Pattern invoke() {
                return Pattern.compile("DATA-ID=\"(.*)\",");
            }
        });
        private static final Lazy<Pattern> RX_SESSION_TAG_VALUES$delegate = LazyKt.lazy(new Function0<Pattern>() { // from class: com.mux.stats.sdk.muxstats.internal.SessionDataPlayerBinding$SessionDataListener$Companion$RX_SESSION_TAG_VALUES$2
            @Override // kotlin.jvm.functions.Function0
            public final Pattern invoke() {
                return Pattern.compile("VALUE=\"(.*)\"");
            }
        });
        private final MuxStateCollector collector;

        /* renamed from: player$delegate, reason: from kotlin metadata */
        private final Interfaces3 player;

        public SessionDataListener(ExoPlayer player, MuxStateCollector collector) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(collector, "collector");
            this.collector = collector;
            this.player = Weak2.weak(player);
        }

        private final ExoPlayer getPlayer() {
            return (ExoPlayer) this.player.getValue(this, $$delegatedProperties[0]);
        }

        /* compiled from: SessionDataBinding.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/internal/SessionDataPlayerBinding$SessionDataListener$Companion;", "", "()V", "HLS_SESSION_LITIX_PREFIX", "", "LOG_TAG", "RX_SESSION_TAG_DATA_ID", "Ljava/util/regex/Pattern;", "getRX_SESSION_TAG_DATA_ID", "()Ljava/util/regex/Pattern;", "RX_SESSION_TAG_DATA_ID$delegate", "Lkotlin/Lazy;", "RX_SESSION_TAG_VALUES", "getRX_SESSION_TAG_VALUES", "RX_SESSION_TAG_VALUES$delegate", "library-exo_At_latestRelease"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.mux.stats.sdk.muxstats.internal.SessionDataPlayerBinding$SessionDataListener$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Pattern getRX_SESSION_TAG_DATA_ID() {
                Object value = SessionDataListener.RX_SESSION_TAG_DATA_ID$delegate.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return (Pattern) value;
            }

            public final Pattern getRX_SESSION_TAG_VALUES() {
                Object value = SessionDataListener.RX_SESSION_TAG_VALUES$delegate.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return (Pattern) value;
            }
        }

        @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
        public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int reason) {
            Intrinsics.checkNotNullParameter(eventTime, "eventTime");
            ExoPlayer player = getPlayer();
            if (player != null) {
                Object currentManifest = player.getCurrentManifest();
                if (currentManifest instanceof HlsManifest) {
                    MuxStateCollector muxStateCollector = this.collector;
                    List<String> tags = ((HlsManifest) currentManifest).multivariantPlaylist.tags;
                    Intrinsics.checkNotNullExpressionValue(tags, "tags");
                    muxStateCollector.onMainPlaylistTags(parseHlsSessionData(tags));
                }
            }
        }

        private final List<SessionTag> parseHlsSessionData(List<String> hlsTags) {
            List<String> listFilterHlsSessionTags = filterHlsSessionTags(hlsTags);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterHlsSessionTags, 10));
            Iterator<T> it = listFilterHlsSessionTags.iterator();
            while (it.hasNext()) {
                arrayList.add(parseHlsSessionTag((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String key = ((SessionTag) obj).key;
                if (key != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    if (StringsKt.contains$default((CharSequence) key, (CharSequence) "io.litix.data.", false, 2, (Object) null)) {
                        arrayList2.add(obj);
                    }
                }
            }
            return arrayList2;
        }

        private final List<String> filterHlsSessionTags(List<String> rawTags) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : rawTags) {
                String strSubstring = ((String) obj).substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (StringsKt.startsWith$default(strSubstring, "EXT-X-SESSION-DATA", false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final SessionTag parseHlsSessionTag(String line) {
            String strReplace$default;
            Companion companion = INSTANCE;
            Matcher matcher = companion.getRX_SESSION_TAG_DATA_ID().matcher(line);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            Matcher matcher2 = companion.getRX_SESSION_TAG_VALUES().matcher(line);
            Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
            String strGroup = "";
            if (matcher.find()) {
                String strGroup2 = matcher.group(1);
                strReplace$default = strGroup2 != null ? StringsKt.replace$default(strGroup2, "io.litix.data.", "", false, 4, (Object) null) : null;
            } else {
                MuxLogger.m1117d("SessionDataListener", "Data-ID not found in session data: " + line);
                strReplace$default = "";
            }
            if (matcher2.find()) {
                strGroup = matcher2.group(1);
            } else {
                MuxLogger.m1117d("SessionDataListener", "Value not found in session data: " + line);
            }
            return new SessionTag(strReplace$default, strGroup);
        }
    }
}
