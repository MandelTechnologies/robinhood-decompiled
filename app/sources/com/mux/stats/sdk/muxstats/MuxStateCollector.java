package com.mux.stats.sdk.muxstats;

import com.mux.android.util.UtilKt;
import com.mux.android.util.Weak2;
import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.InternalErrorEvent;
import com.mux.stats.sdk.core.events.playback.EndedEvent;
import com.mux.stats.sdk.core.events.playback.PauseEvent;
import com.mux.stats.sdk.core.events.playback.PlayEvent;
import com.mux.stats.sdk.core.events.playback.PlayingEvent;
import com.mux.stats.sdk.core.events.playback.RebufferEndEvent;
import com.mux.stats.sdk.core.events.playback.RebufferStartEvent;
import com.mux.stats.sdk.core.events.playback.RenditionChangeEvent;
import com.mux.stats.sdk.core.events.playback.SeekedEvent;
import com.mux.stats.sdk.core.events.playback.SeekingEvent;
import com.mux.stats.sdk.core.events.playback.TimeUpdateEvent;
import com.mux.stats.sdk.core.model.BandwidthMetricData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.SessionTag;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.muxstats.MuxStateCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MuxStateCollector.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000 À\u00012\u00020\u0001:\u0004À\u0001Á\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\u0019\u0010 \u001a\u00020\n2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J-\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001b\u00104\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020201¢\u0006\u0004\b4\u00105J\u0017\u0010:\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR(\u0010C\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bI\u0010\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR(\u0010M\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bM\u0010A\u0012\u0004\bQ\u0010\f\u001a\u0004\bN\u0010\u001b\"\u0004\bO\u0010PR*\u0010S\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010Z\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b`\u0010\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R(\u0010a\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\ba\u0010D\u0012\u0004\bd\u0010\f\u001a\u0004\bb\u0010F\"\u0004\bc\u0010HR\"\u0010e\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010D\u001a\u0004\bf\u0010F\"\u0004\bg\u0010HR(\u0010h\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bh\u0010i\u0012\u0004\bm\u0010\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u0018R(\u0010n\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bn\u0010o\u0012\u0004\bt\u0010\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR(\u0010)\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b)\u0010i\u0012\u0004\bw\u0010\f\u001a\u0004\bu\u0010k\"\u0004\bv\u0010\u0018R(\u0010*\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b*\u0010i\u0012\u0004\bz\u0010\f\u001a\u0004\bx\u0010k\"\u0004\by\u0010\u0018R(\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010i\u0012\u0004\b}\u0010\f\u001a\u0004\b{\u0010k\"\u0004\b|\u0010\u0018R5\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020~\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u001d\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0084\u0001\u0010\f\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0005\b\u0083\u0001\u00105R2\u0010\u0085\u0001\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u001f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u0012\u0005\b\u008b\u0001\u0010\f\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R2\u0010\u008c\u0001\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u001f\n\u0006\b\u008c\u0001\u0010\u0086\u0001\u0012\u0005\b\u008f\u0001\u0010\f\u001a\u0006\b\u008d\u0001\u0010\u0088\u0001\"\u0006\b\u008e\u0001\u0010\u008a\u0001R2\u0010\u0090\u0001\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u001f\n\u0006\b\u0090\u0001\u0010\u0086\u0001\u0012\u0005\b\u0093\u0001\u0010\f\u001a\u0006\b\u0091\u0001\u0010\u0088\u0001\"\u0006\b\u0092\u0001\u0010\u008a\u0001R2\u0010\u0094\u0001\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u001f\n\u0006\b\u0094\u0001\u0010\u0086\u0001\u0012\u0005\b\u0097\u0001\u0010\f\u001a\u0006\b\u0095\u0001\u0010\u0088\u0001\"\u0006\b\u0096\u0001\u0010\u008a\u0001R2\u0010\u0098\u0001\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u001f\n\u0006\b\u0098\u0001\u0010\u0086\u0001\u0012\u0005\b\u009b\u0001\u0010\f\u001a\u0006\b\u0099\u0001\u0010\u0088\u0001\"\u0006\b\u009a\u0001\u0010\u008a\u0001RH\u0010¥\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u009c\u00012\u000e\u0010\u009d\u0001\u001a\t\u0012\u0002\b\u0003\u0018\u00010\u009c\u00018F@FX\u0086\u008e\u0002¢\u0006\u001f\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u0012\u0005\b¤\u0001\u0010\f\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u0080\u0001R\u0018\u0010§\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010DR\u0018\u0010¨\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010AR\u0018\u0010©\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010AR\u0018\u0010ª\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010iR\u0018\u0010«\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b«\u0001\u0010iR\u0018\u0010¬\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010iR\u0018\u0010\u00ad\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010iR\u0018\u0010®\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010iR7\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020R0¯\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u001f\n\u0006\b°\u0001\u0010±\u0001\u0012\u0005\b¶\u0001\u0010\f\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R'\u0010¼\u0001\u001a\u00020J8FX\u0086\u0084\u0002¢\u0006\u0017\u0012\u0005\b¹\u0001\u0010\f\u001a\u0006\b·\u0001\u0010¸\u0001*\u0006\bº\u0001\u0010»\u0001R\u001d\u0010¿\u0001\u001a\u0004\u0018\u00010B8F¢\u0006\u000f\u0012\u0005\b¾\u0001\u0010\f\u001a\u0006\b½\u0001\u0010\u0088\u0001¨\u0006Â\u0001"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "", "Lcom/mux/stats/sdk/muxstats/MuxStats;", "muxStats", "Lcom/mux/stats/sdk/core/events/IEventDispatcher;", "dispatcher", "", "trackFirstFrameRendered", "<init>", "(Lcom/mux/stats/sdk/muxstats/MuxStats;Lcom/mux/stats/sdk/core/events/IEventDispatcher;Z)V", "", "rebufferingStarted", "()V", "rebufferingEnded", "reset", "buffering", "play", "playing", "pause", "seeked", "seeking", "", "droppedFrames", "incrementDroppedFrames", "(I)V", "ended", "isPaused", "()Z", "onFirstFrameRendered", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "internalError", "(Ljava/lang/Exception;)V", "Lcom/mux/stats/sdk/core/model/CustomerVideoData;", "customerVideoData", "videoChange", "(Lcom/mux/stats/sdk/core/model/CustomerVideoData;)V", "advertisedBitrate", "", "advertisedFrameRate", "sourceWidth", "sourceHeight", "renditionChange", "(IFII)V", "Lcom/mux/stats/sdk/core/model/VideoData;", "videoData", "videoDataChange", "(Lcom/mux/stats/sdk/core/model/VideoData;)V", "", "Lcom/mux/stats/sdk/core/model/SessionTag;", "tags", "onMainPlaylistTags", "(Ljava/util/List;)V", "Lcom/mux/stats/sdk/core/events/IEvent;", "event", "dispatch$core_android_release", "(Lcom/mux/stats/sdk/core/events/IEvent;)V", "dispatch", "Lcom/mux/stats/sdk/muxstats/MuxStats;", "getMuxStats", "()Lcom/mux/stats/sdk/muxstats/MuxStats;", "Lcom/mux/stats/sdk/core/events/IEventDispatcher;", "getDispatcher", "()Lcom/mux/stats/sdk/core/events/IEventDispatcher;", "Z", "", "timeToWaitAfterFirstFrameReceived", "J", "getTimeToWaitAfterFirstFrameReceived", "()J", "setTimeToWaitAfterFirstFrameReceived", "(J)V", "getTimeToWaitAfterFirstFrameReceived$annotations", "Lcom/mux/stats/sdk/muxstats/MuxPlayerState;", "_playerState", "Lcom/mux/stats/sdk/muxstats/MuxPlayerState;", "detectMimeType", "getDetectMimeType", "setDetectMimeType", "(Z)V", "getDetectMimeType$annotations", "", "mimeType", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "setMimeType", "(Ljava/lang/String;)V", "getMimeType$annotations", "mediaHasVideoTrack", "Ljava/lang/Boolean;", "getMediaHasVideoTrack", "()Ljava/lang/Boolean;", "setMediaHasVideoTrack", "(Ljava/lang/Boolean;)V", "getMediaHasVideoTrack$annotations", "sourceDurationMs", "getSourceDurationMs", "setSourceDurationMs", "getSourceDurationMs$annotations", "playbackPositionMills", "getPlaybackPositionMills", "setPlaybackPositionMills", "sourceAdvertisedBitrate", "I", "getSourceAdvertisedBitrate", "()I", "setSourceAdvertisedBitrate", "getSourceAdvertisedBitrate$annotations", "sourceAdvertisedFrameRate", "F", "getSourceAdvertisedFrameRate", "()F", "setSourceAdvertisedFrameRate", "(F)V", "getSourceAdvertisedFrameRate$annotations", "getSourceWidth", "setSourceWidth", "getSourceWidth$annotations", "getSourceHeight", "setSourceHeight", "getSourceHeight$annotations", "getDroppedFrames", "setDroppedFrames", "getDroppedFrames$annotations", "Lcom/mux/stats/sdk/core/model/BandwidthMetricData$Rendition;", "renditionList", "Ljava/util/List;", "getRenditionList", "()Ljava/util/List;", "setRenditionList", "getRenditionList$annotations", "hlsManifestNewestTime", "Ljava/lang/Long;", "getHlsManifestNewestTime", "()Ljava/lang/Long;", "setHlsManifestNewestTime", "(Ljava/lang/Long;)V", "getHlsManifestNewestTime$annotations", "hlsHoldBack", "getHlsHoldBack", "setHlsHoldBack", "getHlsHoldBack$annotations", "hlsPartHoldBack", "getHlsPartHoldBack", "setHlsPartHoldBack", "getHlsPartHoldBack$annotations", "hlsPartTargetDuration", "getHlsPartTargetDuration", "setHlsPartTargetDuration", "getHlsPartTargetDuration$annotations", "hlsTargetDuration", "getHlsTargetDuration", "setHlsTargetDuration", "getHlsTargetDuration$annotations", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector$PlayerWatcher;", "<set-?>", "playerWatcher$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPlayerWatcher", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector$PlayerWatcher;", "setPlayerWatcher", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector$PlayerWatcher;)V", "getPlayerWatcher$annotations", "playerWatcher", "sessionTags", "firstFrameRenderedAtMillis", "seekingInProgress", "firstFrameReceived", "pauseEventsSent", "playEventsSent", "totalEventsSent", "seekingEventsSent", "seekedEventsSent", "Ljava/util/ArrayList;", "allowedHeaders", "Ljava/util/ArrayList;", "getAllowedHeaders", "()Ljava/util/ArrayList;", "setAllowedHeaders", "(Ljava/util/ArrayList;)V", "getAllowedHeaders$annotations", "getMuxPlayerState", "()Lcom/mux/stats/sdk/muxstats/MuxPlayerState;", "getMuxPlayerState$annotations", "getMuxPlayerState$delegate", "(Lcom/mux/stats/sdk/muxstats/MuxStateCollector;)Ljava/lang/Object;", "muxPlayerState", "getHlsPlayerProgramTime", "getHlsPlayerProgramTime$annotations", "hlsPlayerProgramTime", "Companion", "PlayerWatcher", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public class MuxStateCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MuxStateCollector.class, "playerWatcher", "getPlayerWatcher()Lcom/mux/stats/sdk/muxstats/MuxStateCollector$PlayerWatcher;", 0))};
    private MuxPlayerState _playerState;
    private ArrayList<String> allowedHeaders;
    private boolean detectMimeType;
    private final IEventDispatcher dispatcher;
    private int droppedFrames;
    private boolean firstFrameReceived;
    private long firstFrameRenderedAtMillis;
    private Long hlsHoldBack;
    private Long hlsManifestNewestTime;
    private Long hlsPartHoldBack;
    private Long hlsPartTargetDuration;
    private Long hlsTargetDuration;
    private Boolean mediaHasVideoTrack;
    private String mimeType;
    private final MuxStats muxStats;
    private int pauseEventsSent;
    private int playEventsSent;
    private long playbackPositionMills;

    /* renamed from: playerWatcher$delegate, reason: from kotlin metadata */
    private final Interfaces3 playerWatcher;
    private List<? extends BandwidthMetricData.Rendition> renditionList;
    private int seekedEventsSent;
    private int seekingEventsSent;
    private boolean seekingInProgress;
    private List<? extends SessionTag> sessionTags;
    private int sourceAdvertisedBitrate;
    private float sourceAdvertisedFrameRate;
    private long sourceDurationMs;
    private int sourceHeight;
    private int sourceWidth;
    private long timeToWaitAfterFirstFrameReceived;
    private int totalEventsSent;
    private final boolean trackFirstFrameRendered;

    public MuxStateCollector(MuxStats muxStats, IEventDispatcher dispatcher, boolean z) {
        Intrinsics.checkNotNullParameter(muxStats, "muxStats");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.muxStats = muxStats;
        this.dispatcher = dispatcher;
        this.trackFirstFrameRendered = z;
        this.timeToWaitAfterFirstFrameReceived = 50L;
        this._playerState = MuxPlayerState.INIT;
        this.detectMimeType = true;
        this.mediaHasVideoTrack = Boolean.TRUE;
        this.sourceDurationMs = -1L;
        this.playbackPositionMills = -1L;
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.playerWatcher = new ObservableProperty<PlayerWatcher<?>>(obj) { // from class: com.mux.stats.sdk.muxstats.MuxStateCollector$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, MuxStateCollector.PlayerWatcher<?> oldValue, MuxStateCollector.PlayerWatcher<?> newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                MuxStateCollector.PlayerWatcher<?> playerWatcher = oldValue;
                if (playerWatcher != null) {
                    playerWatcher.stop("watcher replaced");
                }
            }
        };
        List<? extends SessionTag> list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList(...)");
        this.sessionTags = list;
        this.firstFrameRenderedAtMillis = -1L;
        this.allowedHeaders = new ArrayList<>();
    }

    public final IEventDispatcher getDispatcher() {
        return this.dispatcher;
    }

    /* renamed from: getMuxPlayerState, reason: from getter */
    public final MuxPlayerState get_playerState() {
        return this._playerState;
    }

    public final boolean getDetectMimeType() {
        return this.detectMimeType;
    }

    public final void setDetectMimeType(boolean z) {
        this.detectMimeType = z;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setMediaHasVideoTrack(Boolean bool) {
        this.mediaHasVideoTrack = bool;
    }

    public final long getSourceDurationMs() {
        return this.sourceDurationMs;
    }

    public final void setSourceDurationMs(long j) {
        this.sourceDurationMs = j;
    }

    public final long getPlaybackPositionMills() {
        return this.playbackPositionMills;
    }

    public final void setPlaybackPositionMills(long j) {
        this.playbackPositionMills = j;
    }

    public final int getSourceAdvertisedBitrate() {
        return this.sourceAdvertisedBitrate;
    }

    public final float getSourceAdvertisedFrameRate() {
        return this.sourceAdvertisedFrameRate;
    }

    public final int getSourceWidth() {
        return this.sourceWidth;
    }

    public final void setSourceWidth(int i) {
        this.sourceWidth = i;
    }

    public final int getSourceHeight() {
        return this.sourceHeight;
    }

    public final void setSourceHeight(int i) {
        this.sourceHeight = i;
    }

    public final List<BandwidthMetricData.Rendition> getRenditionList() {
        return this.renditionList;
    }

    public final void setRenditionList(List<? extends BandwidthMetricData.Rendition> list) {
        this.renditionList = list;
    }

    public final Long getHlsPlayerProgramTime() {
        Long l = this.hlsManifestNewestTime;
        if (l != null) {
            return Long.valueOf(l.longValue() + this.playbackPositionMills);
        }
        return null;
    }

    public final Long getHlsManifestNewestTime() {
        return this.hlsManifestNewestTime;
    }

    public final void setHlsManifestNewestTime(Long l) {
        this.hlsManifestNewestTime = l;
    }

    public final Long getHlsHoldBack() {
        return this.hlsHoldBack;
    }

    public final void setHlsHoldBack(Long l) {
        this.hlsHoldBack = l;
    }

    public final Long getHlsPartHoldBack() {
        return this.hlsPartHoldBack;
    }

    public final void setHlsPartHoldBack(Long l) {
        this.hlsPartHoldBack = l;
    }

    public final Long getHlsPartTargetDuration() {
        return this.hlsPartTargetDuration;
    }

    public final void setHlsPartTargetDuration(Long l) {
        this.hlsPartTargetDuration = l;
    }

    public final Long getHlsTargetDuration() {
        return this.hlsTargetDuration;
    }

    public final void setHlsTargetDuration(Long l) {
        this.hlsTargetDuration = l;
    }

    public final PlayerWatcher<?> getPlayerWatcher() {
        return (PlayerWatcher) this.playerWatcher.getValue(this, $$delegatedProperties[0]);
    }

    public final void setPlayerWatcher(PlayerWatcher<?> playerWatcher) {
        this.playerWatcher.setValue(this, $$delegatedProperties[0], playerWatcher);
    }

    public final void buffering() {
        MuxPlayerState muxPlayerState = this._playerState;
        MuxPlayerState muxPlayerState2 = MuxPlayerState.BUFFERING;
        if (!UtilKt.noneOf(muxPlayerState, muxPlayerState2, MuxPlayerState.REBUFFERING, MuxPlayerState.SEEKED) || this.seekingInProgress) {
            return;
        }
        if (this._playerState == MuxPlayerState.PLAYING) {
            rebufferingStarted();
        } else {
            this._playerState = muxPlayerState2;
            dispatch$core_android_release(new TimeUpdateEvent(null));
        }
    }

    public final void play() {
        if (this.playEventsSent <= 0 || (!this.seekingInProgress && UtilKt.noneOf(this._playerState, MuxPlayerState.REBUFFERING, MuxPlayerState.SEEKED))) {
            this._playerState = MuxPlayerState.PLAY;
            dispatch$core_android_release(new PlayEvent(null));
        }
    }

    public final void playing() {
        if (this.seekingInProgress) {
            MuxLogger.m1117d("MuxStats", "Ignoring playing event, seeking in progress !!!");
            return;
        }
        if (UtilKt.oneOf(this._playerState, MuxPlayerState.PAUSED, MuxPlayerState.FINISHED_PLAYING_ADS, MuxPlayerState.INIT)) {
            play();
        } else {
            MuxPlayerState muxPlayerState = this._playerState;
            if (muxPlayerState == MuxPlayerState.REBUFFERING) {
                rebufferingEnded();
            } else if (muxPlayerState == MuxPlayerState.PLAYING) {
                return;
            }
        }
        this._playerState = MuxPlayerState.PLAYING;
        dispatch$core_android_release(new PlayingEvent(null));
    }

    public final void pause() {
        MuxPlayerState muxPlayerState = this._playerState;
        if (muxPlayerState != MuxPlayerState.SEEKED || this.pauseEventsSent <= 0) {
            if (muxPlayerState == MuxPlayerState.REBUFFERING) {
                rebufferingEnded();
            }
            if (this.seekingInProgress) {
                seeked();
            } else {
                this._playerState = MuxPlayerState.PAUSED;
                dispatch$core_android_release(new PauseEvent(null));
            }
        }
    }

    public final void seeked() {
        if (this.seekingInProgress) {
            dispatch$core_android_release(new SeekedEvent(null));
            this.seekingInProgress = false;
            this._playerState = MuxPlayerState.SEEKED;
        }
        if (this.seekingEventsSent == 0) {
            this.seekingInProgress = false;
        }
    }

    public final void seeking() {
        if (this.playEventsSent == 0) {
            return;
        }
        if (get_playerState() == MuxPlayerState.PLAYING) {
            dispatch$core_android_release(new PauseEvent(null));
        }
        this._playerState = MuxPlayerState.SEEKING;
        this.seekingInProgress = true;
        this.firstFrameRenderedAtMillis = -1L;
        dispatch$core_android_release(new SeekingEvent(null));
        this.firstFrameReceived = false;
    }

    public final void incrementDroppedFrames(int droppedFrames) {
        this.droppedFrames += droppedFrames;
    }

    public final void ended() {
        dispatch$core_android_release(new PauseEvent(null));
        dispatch$core_android_release(new EndedEvent(null));
        this._playerState = MuxPlayerState.ENDED;
    }

    public final boolean isPaused() {
        MuxPlayerState muxPlayerState = this._playerState;
        return muxPlayerState == MuxPlayerState.PAUSED || muxPlayerState == MuxPlayerState.ENDED || muxPlayerState == MuxPlayerState.ERROR || muxPlayerState == MuxPlayerState.INIT;
    }

    public final void onFirstFrameRendered() {
        this.firstFrameRenderedAtMillis = System.currentTimeMillis();
        this.firstFrameReceived = true;
    }

    public final void internalError(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof MuxErrorException) {
            dispatch$core_android_release(new InternalErrorEvent(((MuxErrorException) error).getCode(), error.getMessage()));
            return;
        }
        dispatch$core_android_release(new InternalErrorEvent(-1, error.getClass().getCanonicalName() + " - " + error.getMessage()));
    }

    public final void videoChange(CustomerVideoData customerVideoData) {
        Intrinsics.checkNotNullParameter(customerVideoData, "customerVideoData");
        this._playerState = MuxPlayerState.INIT;
        reset();
        this.muxStats.videoChange(customerVideoData);
    }

    public final void renditionChange(int advertisedBitrate, float advertisedFrameRate, int sourceWidth, int sourceHeight) {
        this.sourceAdvertisedBitrate = advertisedBitrate;
        this.sourceAdvertisedFrameRate = advertisedFrameRate;
        this.sourceWidth = sourceWidth;
        this.sourceHeight = sourceHeight;
        dispatch$core_android_release(new RenditionChangeEvent(null));
    }

    public final void videoDataChange(VideoData videoData) {
        Intrinsics.checkNotNullParameter(videoData, "videoData");
        this.muxStats.videoDataChange(videoData);
    }

    public final void onMainPlaylistTags(List<? extends SessionTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (Intrinsics.areEqual(this.sessionTags, tags)) {
            return;
        }
        this.sessionTags = tags;
        this.muxStats.setSessionData(tags);
    }

    private final void rebufferingStarted() {
        this._playerState = MuxPlayerState.REBUFFERING;
        dispatch$core_android_release(new RebufferStartEvent(null));
    }

    private final void rebufferingEnded() {
        dispatch$core_android_release(new RebufferEndEvent(null));
    }

    private final void reset() {
        this.mimeType = null;
        this.playEventsSent = 0;
        this.pauseEventsSent = 0;
        this.totalEventsSent = 0;
        this.seekingEventsSent = 0;
        this.seekedEventsSent = 0;
        this.firstFrameReceived = false;
        this.firstFrameRenderedAtMillis = -1L;
        this.allowedHeaders.clear();
    }

    public final /* synthetic */ void dispatch$core_android_release(IEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.totalEventsSent++;
        String type2 = event.getType();
        if (type2 != null) {
            int iHashCode = type2.hashCode();
            if (iHashCode != 3443508) {
                if (iHashCode != 106440182) {
                    if (iHashCode == 1971820138 && type2.equals("seeking")) {
                        this.seekingEventsSent++;
                    }
                } else if (type2.equals("pause")) {
                    this.pauseEventsSent++;
                }
            } else if (type2.equals("play")) {
                this.playEventsSent++;
            }
        }
        this.dispatcher.dispatch(event);
    }

    /* compiled from: MuxStateCollector.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxStateCollector$PlayerWatcher;", "Player", "", "", "updateIntervalMillis", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "stateCollector", "player", "Lkotlin/Function2;", "checkPositionMillis", "<init>", "(JLcom/mux/stats/sdk/muxstats/MuxStateCollector;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "getTimeMillis", "()Ljava/lang/Long;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "updateOnMain", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "message", "stop", "(Ljava/lang/String;)V", "start", "()V", "J", "getUpdateIntervalMillis", "()J", "Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "getStateCollector", "()Lcom/mux/stats/sdk/muxstats/MuxStateCollector;", "Lkotlin/jvm/functions/Function2;", "getCheckPositionMillis", "()Lkotlin/jvm/functions/Function2;", "timerScope", "Lkotlinx/coroutines/CoroutineScope;", "player$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPlayer", "()Ljava/lang/Object;", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class PlayerWatcher<Player> {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PlayerWatcher.class, "player", "getPlayer()Ljava/lang/Object;", 0))};
        private final Function2<Player, MuxStateCollector, Long> checkPositionMillis;

        /* renamed from: player$delegate, reason: from kotlin metadata */
        private final Interfaces3 player;
        private final MuxStateCollector stateCollector;
        private final CoroutineScope timerScope;
        private final long updateIntervalMillis;

        /* JADX WARN: Multi-variable type inference failed */
        public PlayerWatcher(long j, MuxStateCollector stateCollector, Player player, Function2<? super Player, ? super MuxStateCollector, Long> checkPositionMillis) {
            Intrinsics.checkNotNullParameter(stateCollector, "stateCollector");
            Intrinsics.checkNotNullParameter(checkPositionMillis, "checkPositionMillis");
            this.updateIntervalMillis = j;
            this.stateCollector = stateCollector;
            this.checkPositionMillis = checkPositionMillis;
            this.timerScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault());
            this.player = Weak2.weak(player);
        }

        public final long getUpdateIntervalMillis() {
            return this.updateIntervalMillis;
        }

        public final MuxStateCollector getStateCollector() {
            return this.stateCollector;
        }

        private final Player getPlayer() {
            return (Player) this.player.getValue(this, $$delegatedProperties[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Long getTimeMillis() {
            Player player = getPlayer();
            if (player != null) {
                return this.checkPositionMillis.invoke(player, this.stateCollector);
            }
            return null;
        }

        public final void stop(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            CoroutineScope2.cancel$default(this.timerScope, message, null, 2, null);
        }

        public final void start() {
            BuildersKt__Builders_commonKt.launch$default(this.timerScope, null, null, new MuxStateCollector2(this, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateOnMain(CoroutineScope coroutineScope) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new MuxStateCollector3(this, null), 2, null);
        }
    }
}
