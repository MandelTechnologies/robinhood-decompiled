package com.robinhood.android.engagement.goldevent.p115ui;

import android.annotation.SuppressLint;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Rational;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.AndroidExternalSurfaceScope;
import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.SystemGestureExclusionKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.RectHelper_androidKt;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.util.Consumer;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.view.ComponentActivity;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo;
import com.robinhood.android.engagement.goldevent.LiveEventStreamEvent;
import com.robinhood.android.engagement.goldevent.LiveEventStreamViewState;
import com.robinhood.android.engagement.goldevent.LiveEventStreamViewState2;
import com.robinhood.android.engagement.goldevent.LiveEventStreamViewState3;
import com.robinhood.android.engagement.goldevent.PlaybackController;
import com.robinhood.android.engagement.goldevent.StreamingUtils;
import com.robinhood.android.engagement.goldevent.p115ui.LiveEventStreamComposableKt;
import com.robinhood.android.engagement.goldevent.stream.C14545R;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges3;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import timber.log.Timber;

/* compiled from: LiveEventStreamComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001ae\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rH\u0003\u001a\u0099\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010)2\u0006\u0010*\u001a\u00020\rH\u0003¢\u0006\u0004\b+\u0010,\u001a\r\u0010-\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010.\u001a-\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\r2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010'2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u00102\u001a\u0013\u00103\u001a\u00020\u0011*\u000204H\u0001¢\u0006\u0004\b5\u00106\u001a\u0085\u0001\u00107\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010)2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010'2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u00108\u001a\u00020\rH\u0007¢\u0006\u0004\b9\u0010:\u001a\r\u0010;\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010.\u001a\n\u0010<\u001a\u00020\u0016*\u00020\u0016\u001a!\u0010=\u001a\u00020\r2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010)H\u0007¢\u0006\u0002\u0010?¨\u0006@²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\u0012\u0010C\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010DX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u00020HX\u008a\u008e\u0002²\u0006\n\u0010I\u001a\u00020HX\u008a\u008e\u0002²\u0006\n\u0010J\u001a\u00020HX\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"LiveEventVideoStreamComposable", "", "duxo", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo;", "(Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo;Landroidx/compose/runtime/Composer;II)V", "VideoPlayer", "exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "playbackController", "Lcom/robinhood/android/engagement/goldevent/PlaybackController;", "playbackState", "Lcom/robinhood/android/engagement/goldevent/PlaybackState;", "isInPipMode", "", "shouldShowUpsellBanner", "isLandscape", "landscapeUpsellMarkdown", "", "landscapeUpsellLinkColor", "Landroidx/compose/ui/graphics/Color;", "eventTitle", "modifier", "Landroidx/compose/ui/Modifier;", "VideoPlayer-Z6NMxzw", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/robinhood/android/engagement/goldevent/PlaybackController;Lcom/robinhood/android/engagement/goldevent/PlaybackState;ZZZLjava/lang/String;Landroidx/compose/ui/graphics/Color;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "setRotation", "Landroidx/appcompat/app/AppCompatActivity;", "toLandscape", "VideoControls", "isEventLive", "timeBehindLive", "", "currentPosition", "duration", "windowSize", "seekBarHeight", "Landroidx/compose/ui/unit/Dp;", "showControls", "onSeekStarted", "Lkotlin/Function0;", "onSeekEnded", "Lkotlin/Function1;", "isSeeking", "VideoControls-9UqVb8Q", "(Landroidx/media3/exoplayer/ExoPlayer;Lcom/robinhood/android/engagement/goldevent/PlaybackController;Lcom/robinhood/android/engagement/goldevent/PlaybackState;ZJJJJFZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "ApplyKeepScreenOnFlag", "(Landroidx/compose/runtime/Composer;I)V", "LiveIndicator", "isAtLiveEdge", "onClick", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "formattedTime", "Lkotlin/time/Duration;", "formattedTime-LRDsOJo", "(J)Ljava/lang/String;", "VideoSeekbar", "enabled", "VideoSeekbar-WtlUe4I", "(FJZJJJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;III)V", "HideSystemBars", "applyPipActivityParams", "rememberIsInPipMode", "onPipModeChanged", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Z", "feature-live-event-stream_externalRelease", "viewState", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamEvent;", "dvrWindowSize", "seekPosition", "", "seekStartPosition", "thumbScale", "pipMode"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LiveEventStreamComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ApplyKeepScreenOnFlag$lambda$57(int i, Composer composer, int i2) {
        ApplyKeepScreenOnFlag(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HideSystemBars$lambda$81(int i, Composer composer, int i2) {
        HideSystemBars(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveEventVideoStreamComposable$lambda$0(LiveEventStreamDuxo liveEventStreamDuxo, int i, int i2, Composer composer, int i3) {
        LiveEventVideoStreamComposable(liveEventStreamDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveEventVideoStreamComposable$lambda$8(LiveEventStreamDuxo liveEventStreamDuxo, int i, int i2, Composer composer, int i3) {
        LiveEventVideoStreamComposable(liveEventStreamDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveIndicator$lambda$60(boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LiveIndicator(z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoControls_9UqVb8Q$lambda$52(ExoPlayer exoPlayer, PlaybackController playbackController, LiveEventStreamViewState3 liveEventStreamViewState3, boolean z, long j, long j2, long j3, long j4, float f, boolean z2, String str, boolean z3, Function0 function0, Function1 function1, boolean z4, int i, int i2, Composer composer, int i3) {
        m13509VideoControls9UqVb8Q(exoPlayer, playbackController, liveEventStreamViewState3, z, j, j2, j3, j4, f, z2, str, z3, function0, function1, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoControls_9UqVb8Q$lambda$53(ExoPlayer exoPlayer, PlaybackController playbackController, LiveEventStreamViewState3 liveEventStreamViewState3, boolean z, long j, long j2, long j3, long j4, float f, boolean z2, String str, boolean z3, Function0 function0, Function1 function1, boolean z4, int i, int i2, Composer composer, int i3) {
        m13509VideoControls9UqVb8Q(exoPlayer, playbackController, liveEventStreamViewState3, z, j, j2, j3, j4, f, z2, str, z3, function0, function1, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer_Z6NMxzw$lambda$26(ExoPlayer exoPlayer, PlaybackController playbackController, LiveEventStreamViewState3 liveEventStreamViewState3, boolean z, boolean z2, boolean z3, String str, Color color, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13510VideoPlayerZ6NMxzw(exoPlayer, playbackController, liveEventStreamViewState3, z, z2, z3, str, color, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoPlayer_Z6NMxzw$lambda$49(ExoPlayer exoPlayer, PlaybackController playbackController, LiveEventStreamViewState3 liveEventStreamViewState3, boolean z, boolean z2, boolean z3, String str, Color color, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13510VideoPlayerZ6NMxzw(exoPlayer, playbackController, liveEventStreamViewState3, z, z2, z3, str, color, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoSeekbar_WtlUe4I$lambda$75(float f, long j, boolean z, long j2, long j3, long j4, Function1 function1, Function0 function0, boolean z2, boolean z3, Modifier modifier, boolean z4, int i, int i2, int i3, Composer composer, int i4) {
        m13511VideoSeekbarWtlUe4I(f, j, z, j2, j3, j4, function1, function0, z2, z3, modifier, z4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveEventStreamViewState LiveEventVideoStreamComposable$lambda$1(SnapshotState4<LiveEventStreamViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<LiveEventStreamEvent> LiveEventVideoStreamComposable$lambda$3(SnapshotState4<Event<LiveEventStreamEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VideoPlayer_Z6NMxzw$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VideoPlayer_Z6NMxzw$lambda$31(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VideoPlayer_Z6NMxzw$lambda$35(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float VideoSeekbar_WtlUe4I$lambda$67(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberIsInPipMode$lambda$83(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LiveEventVideoStreamComposable(LiveEventStreamDuxo liveEventStreamDuxo, Composer composer, final int i, final int i2) {
        LiveEventStreamDuxo liveEventStreamDuxo2;
        int i3;
        final BaseActivity baseActivity;
        final LiveEventStreamDuxo liveEventStreamDuxo3;
        EventConsumer<LiveEventStreamEvent> eventConsumerInvoke;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-545235960);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                liveEventStreamDuxo2 = liveEventStreamDuxo;
                if (composerStartRestartGroup.changed(liveEventStreamDuxo2)) {
                    i4 = 4;
                }
                i3 = i4 | i;
            } else {
                liveEventStreamDuxo2 = liveEventStreamDuxo;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            liveEventStreamDuxo2 = liveEventStreamDuxo;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            liveEventStreamDuxo3 = liveEventStreamDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LiveEventStreamDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    liveEventStreamDuxo2 = (LiveEventStreamDuxo) baseDuxo;
                    i3 &= -15;
                }
                final LiveEventStreamDuxo liveEventStreamDuxo4 = liveEventStreamDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-545235960, i3, -1, "com.robinhood.android.engagement.goldevent.ui.LiveEventVideoStreamComposable (LiveEventStreamComposable.kt:139)");
                }
                Intrinsics.checkNotNull(liveEventStreamDuxo4, "null cannot be cast to non-null type com.robinhood.android.engagement.goldevent.PlaybackController");
                AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                baseActivity = !(appCompatActivityFindActivityBaseContext instanceof BaseActivity) ? (BaseActivity) appCompatActivityFindActivityBaseContext : null;
                if (baseActivity != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$0(liveEventStreamDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                boolean z = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(liveEventStreamDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final LiveEventStreamViewState3 playbackState = LiveEventVideoStreamComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle).getPlaybackState();
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i5 = (i3 & 14) ^ 6;
                boolean z2 = (i5 > 4 && composerStartRestartGroup.changed(liveEventStreamDuxo4)) || (i3 & 6) == 4;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C14574xd1a5c3bb(liveEventStreamDuxo4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                final boolean zRememberIsInPipMode = rememberIsInPipMode((Function1) ((KFunction) objRememberedValue2), composerStartRestartGroup, 0);
                Composer composer2 = composerStartRestartGroup;
                final Event<LiveEventStreamEvent> eventLiveEventVideoStreamComposable$lambda$3 = LiveEventVideoStreamComposable$lambda$3(FlowExtKt.collectAsStateWithLifecycle(liveEventStreamDuxo4.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventLiveEventVideoStreamComposable$lambda$3 != null && (eventLiveEventVideoStreamComposable$lambda$3.getData() instanceof LiveEventStreamEvent) && (eventConsumerInvoke = eventLiveEventVideoStreamComposable$lambda$3.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventLiveEventVideoStreamComposable$lambda$3, new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13514invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13514invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LiveEventStreamEvent liveEventStreamEvent = (LiveEventStreamEvent) eventLiveEventVideoStreamComposable$lambda$3.getData();
                            if (Intrinsics.areEqual(liveEventStreamEvent, LiveEventStreamEvent.Dismiss.INSTANCE)) {
                                baseActivity.finish();
                            } else {
                                if (Intrinsics.areEqual(liveEventStreamEvent, LiveEventStreamEvent.StreamEnded.INSTANCE)) {
                                    LiveEventStreamComposableKt.setRotation(baseActivity, false);
                                    liveEventStreamDuxo4.sendPlaybackStatusEnded();
                                    return;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    });
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(liveEventStreamDuxo4) | composer2.changed(z);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new LiveEventStreamComposableKt$LiveEventVideoStreamComposable$2$1(liveEventStreamDuxo4, z, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                composer2.startReplaceGroup(5004770);
                boolean z3 = (i5 > 4 && composer2.changed(liveEventStreamDuxo4)) || (i3 & 6) == 4;
                Object objRememberedValue4 = composer2.rememberedValue();
                if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$7$lambda$6(liveEventStreamDuxo4);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                BackHandler.BackHandler(false, (Function0) objRememberedValue4, composer2, 0, 1);
                composer2.startReplaceGroup(14290009);
                if (z) {
                    HideSystemBars(composer2, 0);
                }
                composer2.endReplaceGroup();
                final BaseActivity baseActivity2 = baseActivity;
                final boolean z4 = z;
                liveEventStreamDuxo3 = liveEventStreamDuxo4;
                BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1338379712, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt.LiveEventVideoStreamComposable.4
                    public final void invoke(Composer composer3, int i6) {
                        Integer toSafeColorInt;
                        Integer toSafeColorInt2;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1338379712, i6, -1, "com.robinhood.android.engagement.goldevent.ui.LiveEventVideoStreamComposable.<anonymous> (LiveEventStreamComposable.kt:173)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer3, i7).getJet(), null, 2, null);
                        boolean z5 = z4;
                        boolean z6 = zRememberIsInPipMode;
                        final LiveEventStreamDuxo liveEventStreamDuxo5 = liveEventStreamDuxo4;
                        PlaybackController playbackController = liveEventStreamDuxo4;
                        LiveEventStreamViewState3 liveEventStreamViewState3 = playbackState;
                        SnapshotState4<LiveEventStreamViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        BaseActivity baseActivity3 = baseActivity2;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z5 || z6) {
                            composer3.startReplaceGroup(-483146947);
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierNavigationBarsPadding);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            ExoPlayer exoPlayerInstance = liveEventStreamDuxo5.getExoPlayerInstance();
                            boolean z7 = z5 && !z6;
                            String landscape_upsell_markdown = LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$1(snapshotState4).getEventConfiguration().getLandscape_upsell_markdown();
                            String event_title = LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$1(snapshotState4).getEventConfiguration().getEvent_title();
                            String accent_color = LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$1(snapshotState4).getEventConfiguration().getAccent_color();
                            LiveEventStreamComposableKt.m13510VideoPlayerZ6NMxzw(exoPlayerInstance, playbackController, liveEventStreamViewState3, z6, z7, z5, landscape_upsell_markdown, (accent_color == null || (toSafeColorInt = LiveEventStreamViewState2.getToSafeColorInt(accent_color)) == null) ? null : Color.m6701boximpl(Color2.Color(toSafeColorInt.intValue())), event_title, null, composer3, 0, 512);
                            composer3.endNode();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-482138486);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            ComposableSingletons$LiveEventStreamComposableKt composableSingletons$LiveEventStreamComposableKt = ComposableSingletons$LiveEventStreamComposableKt.INSTANCE;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$LiveEventStreamComposableKt.getLambda$1675713165$feature_live_event_stream_externalRelease(), modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(-138977567, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$4$1$2$1

                                /* compiled from: LiveEventStreamComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$4$1$2$1$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ LiveEventStreamDuxo $duxo;
                                    final /* synthetic */ BentoAppBarScope $this_BentoAppBar;

                                    AnonymousClass1(BentoAppBarScope bentoAppBarScope, LiveEventStreamDuxo liveEventStreamDuxo) {
                                        this.$this_BentoAppBar = bentoAppBarScope;
                                        this.$duxo = liveEventStreamDuxo;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1938035249, i, -1, "com.robinhood.android.engagement.goldevent.ui.LiveEventVideoStreamComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveEventStreamComposable.kt:205)");
                                        }
                                        BentoAppBarScope bentoAppBarScope = this.$this_BentoAppBar;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$duxo);
                                        final LiveEventStreamDuxo liveEventStreamDuxo = this.$duxo;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: CONSTRUCTOR (r1v2 'objRememberedValue' java.lang.Object) = (r0v2 'liveEventStreamDuxo' com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo A[DONT_INLINE]) A[MD:(com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo):void (m)] (LINE:206) call: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$4$1$2$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo):void type: CONSTRUCTOR in method: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$4$1$2$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$4$1$2$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                this = this;
                                                r0 = r13 & 3
                                                r1 = 2
                                                if (r0 != r1) goto L10
                                                boolean r0 = r12.getSkipping()
                                                if (r0 != 0) goto Lc
                                                goto L10
                                            Lc:
                                                r12.skipToGroupEnd()
                                                return
                                            L10:
                                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r0 == 0) goto L1f
                                                r0 = -1
                                                java.lang.String r1 = "com.robinhood.android.engagement.goldevent.ui.LiveEventVideoStreamComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveEventStreamComposable.kt:205)"
                                                r2 = -1938035249(0xffffffff8c7bedcf, float:-1.94079E-31)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
                                            L1f:
                                                com.robinhood.compose.bento.component.BentoAppBarScope r3 = r11.$this_BentoAppBar
                                                r13 = 5004770(0x4c5de2, float:7.013177E-39)
                                                r12.startReplaceGroup(r13)
                                                com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo r13 = r11.$duxo
                                                boolean r13 = r12.changed(r13)
                                                com.robinhood.android.engagement.goldevent.LiveEventStreamDuxo r0 = r11.$duxo
                                                java.lang.Object r1 = r12.rememberedValue()
                                                if (r13 != 0) goto L3d
                                                androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r13 = r13.getEmpty()
                                                if (r1 != r13) goto L45
                                            L3d:
                                                com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$4$1$2$1$1$$ExternalSyntheticLambda0 r1 = new com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$LiveEventVideoStreamComposable$4$1$2$1$1$$ExternalSyntheticLambda0
                                                r1.<init>(r0)
                                                r12.updateRememberedValue(r1)
                                            L45:
                                                r7 = r1
                                                kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                                                r12.endReplaceGroup()
                                                int r13 = com.robinhood.compose.bento.component.BentoAppBarScope.$stable
                                                int r9 = r13 << 12
                                                r10 = 7
                                                r4 = 0
                                                r5 = 0
                                                r6 = 0
                                                r8 = r12
                                                r3.m20575BentoBackButtondrOMvmE(r4, r5, r6, r7, r8, r9, r10)
                                                boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r12 == 0) goto L60
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            L60:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.engagement.goldevent.p115ui.C14573x496ba552.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(LiveEventStreamDuxo liveEventStreamDuxo) {
                                            liveEventStreamDuxo.onDismiss();
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                        int i9;
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i8 & 6) == 0) {
                                            i9 = i8 | ((i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                                        } else {
                                            i9 = i8;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-138977567, i9, -1, "com.robinhood.android.engagement.goldevent.ui.LiveEventVideoStreamComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveEventStreamComposable.kt:204)");
                                        }
                                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1938035249, true, new AnonymousClass1(BentoAppBar, liveEventStreamDuxo5), composer4, 54), composer4, 805306368, 509);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, true, false, null, null, 0L, null, composer3, 197046, 0, 2008);
                                ExoPlayer exoPlayerInstance2 = liveEventStreamDuxo5.getExoPlayerInstance();
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 7, null);
                                String landscape_upsell_markdown2 = LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$1(snapshotState4).getEventConfiguration().getLandscape_upsell_markdown();
                                String event_title2 = LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$1(snapshotState4).getEventConfiguration().getEvent_title();
                                String accent_color2 = LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$1(snapshotState4).getEventConfiguration().getAccent_color();
                                LiveEventStreamComposableKt.m13510VideoPlayerZ6NMxzw(exoPlayerInstance2, playbackController, liveEventStreamViewState3, z6, false, z5, landscape_upsell_markdown2, (accent_color2 == null || (toSafeColorInt2 = LiveEventStreamViewState2.getToSafeColorInt(accent_color2)) == null) ? null : Color.m6701boximpl(Color2.Color(toSafeColorInt2.intValue())), event_title2, modifierM5146paddingqDBjuR0$default, composer3, 24576, 0);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(Column5.weight$default(column6, WindowInsetsPadding_androidKt.navigationBarsPadding(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer3, 6, 1)), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default2);
                                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor4);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                                RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(liveEventStreamDuxo5.getKey().getMicrogramId(), null, 2, null);
                                String launchArguments = liveEventStreamDuxo5.getKey().getLaunchArguments();
                                FragmentManager supportFragmentManager = baseActivity3.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, null, launchArguments, composableSingletons$LiveEventStreamComposableKt.m13498getLambda$976541305$feature_live_event_stream_externalRelease(), null, null, false, null, composer3, 24576, 484);
                                composer3.endNode();
                                composer3.endNode();
                                composer3.endReplaceGroup();
                            }
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                    final PlaybackController liveEventStreamDuxo42 = liveEventStreamDuxo2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Intrinsics.checkNotNull(liveEventStreamDuxo42, "null cannot be cast to non-null type com.robinhood.android.engagement.goldevent.PlaybackController");
                    AppCompatActivity appCompatActivityFindActivityBaseContext2 = BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                    if (!(appCompatActivityFindActivityBaseContext2 instanceof BaseActivity)) {
                    }
                    if (baseActivity != null) {
                    }
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiveEventStreamComposableKt.LiveEventVideoStreamComposable$lambda$8(liveEventStreamDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit LiveEventVideoStreamComposable$lambda$7$lambda$6(LiveEventStreamDuxo liveEventStreamDuxo) {
            liveEventStreamDuxo.onDismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x021c  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0338  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x07d9  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
        /* renamed from: VideoPlayer-Z6NMxzw, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m13510VideoPlayerZ6NMxzw(final ExoPlayer exoPlayer, final PlaybackController playbackController, final LiveEventStreamViewState3 liveEventStreamViewState3, final boolean z, final boolean z2, final boolean z3, final String str, final Color color, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
            int i3;
            int i4;
            final Modifier modifier2;
            Object objRememberedValue;
            Composer.Companion companion;
            Object objRememberedValue2;
            Object objRememberedValue3;
            Object objRememberedValue4;
            Object objRememberedValue5;
            float f;
            int i5;
            Unit unit;
            SnapshotLongState2 snapshotLongState2;
            SnapshotLongState2 snapshotLongState22;
            SnapshotState snapshotState;
            SnapshotLongState2 snapshotLongState23;
            SnapshotLongState2 snapshotLongState24;
            Continuation continuation;
            LiveEventStreamViewState3 liveEventStreamViewState32;
            Composer composer2;
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
            int i6;
            int i7;
            Composer composerStartRestartGroup = composer.startRestartGroup(432819362);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(exoPlayer) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i2 & 2) != 0) {
                i3 |= 48;
            } else {
                if ((i & 48) == 0) {
                    i3 |= composerStartRestartGroup.changed(playbackController) ? 32 : 16;
                }
                if ((i2 & 4) == 0) {
                    i3 |= 384;
                } else if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(liveEventStreamViewState3.ordinal()) ? 256 : 128;
                }
                if ((i2 & 8) == 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i7 = (1572864 & i) == 0 ? composerStartRestartGroup.changed(str) ? 1048576 : 524288 : 1572864;
                    if ((i2 & 128) == 0) {
                        i6 = (12582912 & i) == 0 ? composerStartRestartGroup.changed(color) ? 8388608 : 4194304 : 12582912;
                        if ((i2 & 256) != 0) {
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changed(str2) ? 67108864 : 33554432;
                            }
                            i4 = i2 & 512;
                            if (i4 != 0) {
                                i3 |= 805306368;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                if ((i & 805306368) == 0) {
                                    i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                                }
                            }
                            if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                            } else {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(432819362, i3, -1, "com.robinhood.android.engagement.goldevent.ui.VideoPlayer (LiveEventStreamComposable.kt:271)");
                                }
                                composerStartRestartGroup.startReplaceGroup(-672407309);
                                float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                                composerStartRestartGroup.endReplaceGroup();
                                float f2 = fMo5013toDpu2uoSUM / 1.7777778f;
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(12);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotLongState3.mutableLongStateOf(0L);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                SnapshotLongState2 snapshotLongState25 = (SnapshotLongState2) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotLongState3.mutableLongStateOf(0L);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                SnapshotLongState2 snapshotLongState26 = (SnapshotLongState2) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                                    objRememberedValue3 = snapshotStateMutableStateOf$default;
                                }
                                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = SnapshotLongState3.mutableLongStateOf(0L);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                SnapshotLongState2 snapshotLongState27 = (SnapshotLongState2) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = SnapshotLongState3.mutableLongStateOf(0L);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                SnapshotLongState2 snapshotLongState28 = (SnapshotLongState2) objRememberedValue5;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-672391505);
                                if (liveEventStreamViewState3 != LiveEventStreamViewState3.ENDED) {
                                    Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.m5155defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(200), 1, null), C2002Dp.m7995constructorimpl(f2));
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i8 = BentoTheme.$stable;
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU(), null, 2, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C14545R.string.feature_live_event_stream_has_ended, composerStartRestartGroup, 0), BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion2.getCenter()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$26(exoPlayer, playbackController, liveEventStreamViewState3, z, z2, z3, str, color, str2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Unit unit2 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(exoPlayer);
                                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                                    f = f2;
                                    i5 = 1849434622;
                                    unit = unit2;
                                    LiveEventStreamComposableKt$VideoPlayer$3$1 liveEventStreamComposableKt$VideoPlayer$3$1 = new LiveEventStreamComposableKt$VideoPlayer$3$1(exoPlayer, snapshotLongState25, snapshotLongState26, snapshotState2, snapshotLongState28, snapshotLongState27, null);
                                    snapshotLongState2 = snapshotLongState25;
                                    snapshotLongState22 = snapshotLongState26;
                                    snapshotState = snapshotState2;
                                    snapshotLongState23 = snapshotLongState28;
                                    snapshotLongState24 = snapshotLongState27;
                                    composerStartRestartGroup.updateRememberedValue(liveEventStreamComposableKt$VideoPlayer$3$1);
                                    objRememberedValue6 = liveEventStreamComposableKt$VideoPlayer$3$1;
                                } else {
                                    snapshotLongState23 = snapshotLongState28;
                                    snapshotLongState22 = snapshotLongState26;
                                    snapshotState = snapshotState2;
                                    f = f2;
                                    snapshotLongState24 = snapshotLongState27;
                                    i5 = 1849434622;
                                    snapshotLongState2 = snapshotLongState25;
                                    unit = unit2;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceGroup(-672345584);
                                composerStartRestartGroup.endReplaceGroup();
                                ApplyKeepScreenOnFlag(composerStartRestartGroup, 0);
                                Object[] objArr = new Object[0];
                                composerStartRestartGroup.startReplaceGroup(i5);
                                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$30$lambda$29();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue7, composerStartRestartGroup, 3072, 6);
                                Object[] objArr2 = new Object[0];
                                composerStartRestartGroup.startReplaceGroup(i5);
                                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue8 == companion.getEmpty()) {
                                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$34$lambda$33();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                final SnapshotState snapshotState4 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue8, composerStartRestartGroup, 3072, 6);
                                Boolean boolValueOf = Boolean.valueOf(z);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                int i9 = i3 & 896;
                                boolean zChanged = composerStartRestartGroup.changed(snapshotState3) | ((i3 & 7168) == 2048) | (i9 == 256);
                                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue9 == companion.getEmpty()) {
                                    continuation = null;
                                    objRememberedValue9 = new LiveEventStreamComposableKt$VideoPlayer$5$1(z, liveEventStreamViewState3, snapshotState3, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                } else {
                                    continuation = null;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf, liveEventStreamViewState3, (Function2) objRememberedValue9, composerStartRestartGroup, ((i3 >> 9) & 14) | ((i3 >> 3) & 112));
                                Boolean boolValueOf2 = Boolean.valueOf(VideoPlayer_Z6NMxzw$lambda$31(snapshotState3));
                                Boolean boolValueOf3 = Boolean.valueOf(VideoPlayer_Z6NMxzw$lambda$35(snapshotState4));
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4) | (i9 == 256) | composerStartRestartGroup.changed(snapshotState3);
                                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue10 == companion.getEmpty()) {
                                    objRememberedValue10 = new LiveEventStreamComposableKt$VideoPlayer$6$1(liveEventStreamViewState3, snapshotState4, snapshotState3, continuation);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf2, boolValueOf3, liveEventStreamViewState3, (Function2) objRememberedValue10, composerStartRestartGroup, i9);
                                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(fM7995constructorimpl + C2002Dp.m7995constructorimpl(2));
                                boolean z4 = (z || z3) ? false : true;
                                Modifier modifierSystemGestureExclusion = SystemGestureExclusionKt.systemGestureExclusion(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, continuation), z4 ? C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f) + fM7995constructorimpl2) : C2002Dp.m7995constructorimpl(f)));
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSystemGestureExclusion);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor2);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                boolean z5 = z4;
                                Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(200), 1, null);
                                if (z5) {
                                    modifierM5155defaultMinSizeVpY3zN4$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM5155defaultMinSizeVpY3zN4$default, 0.0f, 0.0f, 0.0f, fM7995constructorimpl2, 7, null);
                                }
                                Modifier modifierApplyPipActivityParams = applyPipActivityParams(boxScopeInstance.align(AspectRatio3.aspectRatio(SizeKt.m5156height3ABfNKs(modifierM5155defaultMinSizeVpY3zN4$default, C2002Dp.m7995constructorimpl(f)), 1.7777778f, z3), companion4.getCenter()));
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(exoPlayer);
                                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue11 == companion.getEmpty()) {
                                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$48$lambda$41$lambda$40(exoPlayer, (AndroidExternalSurfaceScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i10 = i3;
                                Modifier modifier3 = modifier2;
                                AndroidExternalSurface_androidKt.m4868AndroidExternalSurface58FFMhA(modifierApplyPipActivityParams, false, 0L, 0, false, (Function1) objRememberedValue11, composerStartRestartGroup, 0, 30);
                                Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), companion4.getBottomStart());
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor3);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 1.0f, false, 2, null);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChanged3 = composerStartRestartGroup.changed(snapshotState3) | (i9 == 256);
                                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                if (zChanged3 || objRememberedValue12 == companion.getEmpty()) {
                                    liveEventStreamViewState32 = liveEventStreamViewState3;
                                    objRememberedValue12 = new LiveEventStreamComposableKt$VideoPlayer$7$3$1$1(liveEventStreamViewState32, snapshotState3);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                } else {
                                    liveEventStreamViewState32 = liveEventStreamViewState3;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BoxKt.Box(SuspendingPointerInputFilterKt.pointerInput(modifierWeight$default, liveEventStreamViewState32, (PointerInputEventHandler) objRememberedValue12), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceGroup(736258858);
                                if (z2 && str != null && !StringsKt.isBlank(str)) {
                                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-933018163, true, new LiveEventStreamComposableKt$VideoPlayer$7$3$2(str, color, BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                boolean zVideoPlayer_Z6NMxzw$lambda$17 = VideoPlayer_Z6NMxzw$lambda$17(snapshotState);
                                long longValue = snapshotLongState24.getLongValue();
                                long longValue2 = snapshotLongState2.getLongValue();
                                long longValue3 = snapshotLongState22.getLongValue();
                                long longValue4 = snapshotLongState23.getLongValue();
                                boolean zVideoPlayer_Z6NMxzw$lambda$31 = VideoPlayer_Z6NMxzw$lambda$31(snapshotState3);
                                boolean zVideoPlayer_Z6NMxzw$lambda$35 = VideoPlayer_Z6NMxzw$lambda$35(snapshotState4);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChanged4 = composerStartRestartGroup.changed(snapshotState4);
                                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                if (zChanged4 || objRememberedValue13 == companion.getEmpty()) {
                                    objRememberedValue13 = new Function0() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$48$lambda$45$lambda$44(snapshotState4);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                }
                                Function0 function0 = (Function0) objRememberedValue13;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(exoPlayer) | composerStartRestartGroup.changed(snapshotState4);
                                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue14 == companion.getEmpty()) {
                                    objRememberedValue14 = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$48$lambda$47$lambda$46(exoPlayer, snapshotState4, ((Long) obj).longValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                m13509VideoControls9UqVb8Q(exoPlayer, playbackController, liveEventStreamViewState32, zVideoPlayer_Z6NMxzw$lambda$17, longValue, longValue2, longValue3, longValue4, fM7995constructorimpl, z3, str2, zVideoPlayer_Z6NMxzw$lambda$31, function0, (Function1) objRememberedValue14, zVideoPlayer_Z6NMxzw$lambda$35, composerStartRestartGroup, (i10 & 14) | 100663296 | (i10 & 112) | i9 | ((i10 << 12) & 1879048192), (i10 >> 24) & 14);
                                composer2 = composerStartRestartGroup;
                                composer2.startReplaceGroup(919340584);
                                if (LiveEventStreamViewState2.isInitializingOrBuffering(liveEventStreamViewState3)) {
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(boxScopeInstance.align(SizeKt.m5169size3ABfNKs(companion6, bentoTheme2.getSpacing(composer2, i11).m21592getMediumD9Ej5fM()), companion4.getCenter()), BentoProgressIndicator3.f5151S, bentoTheme2.getColors(composer2, i11).getNova(), composer2, 48, 0);
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return LiveEventStreamComposableKt.VideoPlayer_Z6NMxzw$lambda$49(exoPlayer, playbackController, liveEventStreamViewState3, z, z2, z3, str, color, str2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        i4 = i2 & 512;
                        if (i4 != 0) {
                        }
                        if ((i3 & 306783379) == 306783378) {
                            if (i4 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-672407309);
                            float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32));
                            composerStartRestartGroup.endReplaceGroup();
                            float f22 = fMo5013toDpu2uoSUM2 / 1.7777778f;
                            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(12);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            SnapshotLongState2 snapshotLongState252 = (SnapshotLongState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            SnapshotLongState2 snapshotLongState262 = (SnapshotLongState2) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            SnapshotLongState2 snapshotLongState272 = (SnapshotLongState2) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                            }
                            SnapshotLongState2 snapshotLongState282 = (SnapshotLongState2) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-672391505);
                            if (liveEventStreamViewState3 != LiveEventStreamViewState3.ENDED) {
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i3 |= i6;
                    if ((i2 & 256) != 0) {
                    }
                    i4 = i2 & 512;
                    if (i4 != 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i3 |= i7;
                if ((i2 & 128) == 0) {
                }
                i3 |= i6;
                if ((i2 & 256) != 0) {
                }
                i4 = i2 & 512;
                if (i4 != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 4) == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i3 |= i7;
            if ((i2 & 128) == 0) {
            }
            i3 |= i6;
            if ((i2 & 256) != 0) {
            }
            i4 = i2 & 512;
            if (i4 != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void VideoPlayer_Z6NMxzw$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotState VideoPlayer_Z6NMxzw$lambda$30$lambda$29() {
            return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void VideoPlayer_Z6NMxzw$lambda$32(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotState VideoPlayer_Z6NMxzw$lambda$34$lambda$33() {
            return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }

        private static final void VideoPlayer_Z6NMxzw$lambda$36(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit VideoPlayer_Z6NMxzw$lambda$48$lambda$41$lambda$40(ExoPlayer exoPlayer, AndroidExternalSurfaceScope AndroidExternalSurface) {
            Intrinsics.checkNotNullParameter(AndroidExternalSurface, "$this$AndroidExternalSurface");
            Timber.INSTANCE.mo3350d("Surface initialized", new Object[0]);
            AndroidExternalSurface.onSurface(new LiveEventStreamComposableKt$VideoPlayer$7$2$1$1(exoPlayer, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit VideoPlayer_Z6NMxzw$lambda$48$lambda$45$lambda$44(SnapshotState snapshotState) {
            VideoPlayer_Z6NMxzw$lambda$36(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit VideoPlayer_Z6NMxzw$lambda$48$lambda$47$lambda$46(ExoPlayer exoPlayer, SnapshotState snapshotState, long j) {
            exoPlayer.seekTo(j);
            VideoPlayer_Z6NMxzw$lambda$36(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"SourceLockedOrientationActivity"})
        public static final void setRotation(final AppCompatActivity appCompatActivity, boolean z) {
            Object objM28550constructorimpl;
            if (z) {
                appCompatActivity.setRequestedOrientation(0);
                return;
            }
            appCompatActivity.setRequestedOrientation(1);
            try {
                Result.Companion companion = Result.INSTANCE;
                View decorView = appCompatActivity.getWindow().getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                Runnable runnable = new Runnable() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$setRotation$lambda$51$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (appCompatActivity.isDestroyed() || appCompatActivity.isFinishing()) {
                            return;
                        }
                        appCompatActivity.setRequestedOrientation(-1);
                    }
                };
                decorView.postDelayed(runnable, 1000L);
                objM28550constructorimpl = Result.m28550constructorimpl(runnable);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            Result.m28549boximpl(objM28550constructorimpl);
        }

        @SuppressLint({"SourceLockedOrientationActivity"})
        /* renamed from: VideoControls-9UqVb8Q, reason: not valid java name */
        private static final void m13509VideoControls9UqVb8Q(final ExoPlayer exoPlayer, final PlaybackController playbackController, final LiveEventStreamViewState3 liveEventStreamViewState3, final boolean z, final long j, final long j2, final long j3, final long j4, final float f, final boolean z2, final String str, final boolean z3, final Function0<Unit> function0, final Function1<? super Long, Unit> function1, final boolean z4, Composer composer, final int i, final int i2) {
            ExoPlayer exoPlayer2;
            int i3;
            int i4;
            Composer composerStartRestartGroup = composer.startRestartGroup(1270120915);
            if ((i & 6) == 0) {
                exoPlayer2 = exoPlayer;
                i3 = (composerStartRestartGroup.changedInstance(exoPlayer2) ? 4 : 2) | i;
            } else {
                exoPlayer2 = exoPlayer;
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(playbackController) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(liveEventStreamViewState3.ordinal()) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            int i5 = i3;
            if ((i & 24576) == 0) {
                i5 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                i5 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i5 |= composerStartRestartGroup.changed(j3) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i5 |= composerStartRestartGroup.changed(j4) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i5 |= composerStartRestartGroup.changed(f) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
            }
            int i6 = i5;
            if ((i2 & 6) == 0) {
                i4 = i2 | (composerStartRestartGroup.changed(str) ? 4 : 2);
            } else {
                i4 = i2;
            }
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            }
            int i7 = i4;
            if ((i6 & 306783379) != 306783378 || (i7 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1270120915, i6, i7, "com.robinhood.android.engagement.goldevent.ui.VideoControls (LiveEventStreamComposable.kt:534)");
                }
                AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                if (appCompatActivityFindActivityBaseContext == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final ExoPlayer exoPlayer3 = exoPlayer2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LiveEventStreamComposableKt.VideoControls_9UqVb8Q$lambda$52(exoPlayer3, playbackController, liveEventStreamViewState3, z, j, j2, j3, j4, f, z2, str, z3, function0, function1, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                AnimatedVisibilityKt.AnimatedVisibility(z3, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-1333492565, true, new LiveEventStreamComposableKt$VideoControls$1(liveEventStreamViewState3, z2, str, playbackController, z4, f, j2, z, j3, j4, j, function1, function0, exoPlayer, appCompatActivityFindActivityBaseContext), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 3) & 14) | 200112, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiveEventStreamComposableKt.VideoControls_9UqVb8Q$lambda$53(exoPlayer, playbackController, liveEventStreamViewState3, z, j, j2, j3, j4, f, z2, str, z3, function0, function1, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        public static final void ApplyKeepScreenOnFlag(Composer composer, final int i) {
            Composer composerStartRestartGroup = composer.startRestartGroup(-416256334);
            if (i == 0 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-416256334, i, -1, "com.robinhood.android.engagement.goldevent.ui.ApplyKeepScreenOnFlag (LiveEventStreamComposable.kt:692)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveEventStreamComposableKt.ApplyKeepScreenOnFlag$lambda$56$lambda$55(context, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiveEventStreamComposableKt.ApplyKeepScreenOnFlag$lambda$57(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult ApplyKeepScreenOnFlag$lambda$56$lambda$55(Context context, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
            final Window window = appCompatActivityFindActivityBaseContext != null ? appCompatActivityFindActivityBaseContext.getWindow() : null;
            if (window != null) {
                window.addFlags(128);
            }
            return new DisposableEffectResult() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$ApplyKeepScreenOnFlag$lambda$56$lambda$55$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Window window2 = window;
                    if (window2 != null) {
                        window2.clearFlags(128);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void LiveIndicator(final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
            int i3;
            Function0<Unit> function02;
            Modifier modifier2;
            Object objRememberedValue;
            int currentCompositeKeyHash;
            Composer composerM6388constructorimpl;
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
            long nova;
            Composer composer2;
            final Modifier modifier3;
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
            Composer composerStartRestartGroup = composer.startRestartGroup(-1194186148);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i2 & 2) != 0) {
                i3 |= 48;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i & 48) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
                }
            }
            int i4 = i2 & 4;
            if (i4 == 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1194186148, i3, -1, "com.robinhood.android.engagement.goldevent.ui.LiveIndicator (LiveEventStreamComposable.kt:708)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifier2, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, C2002Dp.m7995constructorimpl(StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET() / 2), 0L, 4, null), false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), function02, 12, null);
                    Modifier modifier4 = modifier2;
                    Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(modifierM4891clickableO2vRcR0$default, StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET(), StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET(), 0.0f, 0.0f, 12, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5173sizeInqDBjuR0$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    if (!z) {
                        composerStartRestartGroup.startReplaceGroup(1120681040);
                        nova = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getSolLight();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1120736468);
                        nova = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BoxKt.Box(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(8)), nova, RoundedCornerShape2.getCircleShape()), composerStartRestartGroup, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw("Live", null, Color.m6701boximpl(nova), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 6, 0, 8186);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LiveEventStreamComposableKt.LiveIndicator$lambda$60(z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) != 146) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifier2, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, C2002Dp.m7995constructorimpl(StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET() / 2), 0L, 4, null), false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), function02, 12, null);
                Modifier modifier42 = modifier2;
                Modifier modifierM5173sizeInqDBjuR0$default2 = SizeKt.m5173sizeInqDBjuR0$default(modifierM4891clickableO2vRcR0$default2, StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET(), StreamingUtils.getVIDEO_CONTROL_TOUCH_TARGET(), 0.0f, 0.0f, 12, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5173sizeInqDBjuR0$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    if (!z) {
                    }
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BoxKt.Box(Background3.m4871backgroundbw27NRU(SizeKt.m5169size3ABfNKs(companion22, C2002Dp.m7995constructorimpl(8)), nova, RoundedCornerShape2.getCircleShape()), composerStartRestartGroup, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw("Live", null, Color.m6701boximpl(nova), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composer2, 6, 0, 8186);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        /* renamed from: formattedTime-LRDsOJo, reason: not valid java name */
        public static final String m13513formattedTimeLRDsOJo(long j) {
            long j2 = 60;
            return (Duration.m28752isNegativeimpl(j) ? "-" : "+") + StringsKt.padStart(String.valueOf(Math.abs(Duration.m28737getInWholeHoursimpl(j))), 2, '0') + ":" + StringsKt.padStart(String.valueOf(Math.abs(Duration.m28739getInWholeMinutesimpl(j)) % j2), 2, '0') + ":" + StringsKt.padStart(String.valueOf(Math.abs(Duration.m28741getInWholeSecondsimpl(j)) % j2), 2, '0');
        }

        /* renamed from: VideoSeekbar-WtlUe4I, reason: not valid java name */
        public static final void m13511VideoSeekbarWtlUe4I(final float f, final long j, final boolean z, final long j2, final long j3, final long j4, final Function1<? super Long, Unit> onSeekEnded, final Function0<Unit> onSeekStarted, final boolean z2, final boolean z3, Modifier modifier, boolean z4, Composer composer, final int i, final int i2, final int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            boolean z5;
            BentoTheme bentoTheme;
            PrimitiveRanges3 primitiveRanges3;
            long j5;
            Composer composer2;
            float fCoerceIn;
            SnapshotState4<Float> snapshotState4;
            float f2;
            Composer composer3;
            int i10;
            BentoColors bentoColors;
            BentoTheme bentoTheme2;
            int i11;
            PrimitiveRanges3 primitiveRanges32;
            Object obj;
            HapticFeedback hapticFeedback;
            float f3;
            SnapshotFloatState2 snapshotFloatState2;
            Modifier modifier2;
            int i12;
            int i13;
            int i14;
            final PrimitiveRanges3 primitiveRanges33;
            final SnapshotFloatState2 snapshotFloatState22;
            final boolean z6;
            Boolean bool;
            Object liveEventStreamComposableKt$VideoSeekbar$3$1$1;
            boolean z7;
            final boolean z8;
            final Modifier modifier3;
            Intrinsics.checkNotNullParameter(onSeekEnded, "onSeekEnded");
            Intrinsics.checkNotNullParameter(onSeekStarted, "onSeekStarted");
            Composer composerStartRestartGroup = composer.startRestartGroup(-696990534);
            if ((i3 & 1) != 0) {
                i4 = i | 6;
            } else if ((i & 6) == 0) {
                i4 = i | (composerStartRestartGroup.changed(f) ? 4 : 2);
            } else {
                i4 = i;
            }
            if ((i3 & 2) != 0) {
                i4 |= 48;
            } else if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            int i15 = i4;
            if ((i3 & 4) != 0) {
                i15 |= 384;
            } else if ((i & 384) == 0) {
                i15 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) != 0) {
                i15 |= 3072;
            } else if ((i & 3072) == 0) {
                i15 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                i15 |= 24576;
            } else if ((i & 24576) == 0) {
                i15 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
            }
            if ((i3 & 32) != 0) {
                i15 |= 196608;
            } else if ((i & 196608) == 0) {
                i15 |= composerStartRestartGroup.changed(j4) ? 131072 : 65536;
            }
            int i16 = i15;
            if ((i3 & 64) != 0) {
                i5 = i16 | 1572864;
            } else if ((i & 1572864) == 0) {
                i5 = i16 | (composerStartRestartGroup.changedInstance(onSeekEnded) ? 1048576 : 524288);
            } else {
                i5 = i16;
            }
            int i17 = 12582912;
            if ((i3 & 128) != 0) {
                i5 |= i17;
            } else if ((i & 12582912) == 0) {
                i17 = composerStartRestartGroup.changedInstance(onSeekStarted) ? 8388608 : 4194304;
                i5 |= i17;
            }
            if ((i3 & 256) != 0) {
                i5 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
            }
            if ((i3 & 512) != 0) {
                i5 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i5 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
            }
            int i18 = i3 & 1024;
            if (i18 != 0) {
                i7 = i2 | 6;
                i6 = i18;
            } else if ((i2 & 6) == 0) {
                i6 = i18;
                i7 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
            } else {
                i6 = i18;
                i7 = i2;
            }
            int i19 = i3 & 2048;
            if (i19 != 0) {
                i8 = i19;
                i9 = i7 | 48;
            } else {
                if ((i2 & 48) == 0) {
                    i8 = i19;
                    i7 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
                } else {
                    i8 = i19;
                }
                i9 = i7;
            }
            if ((i5 & 306783379) == 306783378 && (i9 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                z8 = z4;
                composer3 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier;
                boolean z9 = i8 != 0 ? true : z4;
                if (ComposerKt.isTraceInProgress()) {
                    z5 = z9;
                    ComposerKt.traceEventStart(-696990534, i5, i9, "com.robinhood.android.engagement.goldevent.ui.VideoSeekbar (LiveEventStreamComposable.kt:771)");
                } else {
                    z5 = z9;
                }
                HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                float f4 = f / 2;
                int i20 = i9;
                final float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f4);
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(f / 4);
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i21 = BentoTheme.$stable;
                BentoColors colors = bentoTheme3.getColors(composerStartRestartGroup, i21);
                boolean z10 = z && j4 < 6000;
                if (z && z10) {
                    bentoTheme = bentoTheme3;
                    primitiveRanges3 = new PrimitiveRanges3(j2 - j3, j2);
                    j5 = 0;
                } else {
                    bentoTheme = bentoTheme3;
                    j5 = 0;
                    primitiveRanges3 = new PrimitiveRanges3(0L, j2);
                }
                if (j2 > j5) {
                    composer2 = composerStartRestartGroup;
                    fCoerceIn = RangesKt.coerceIn((j - primitiveRanges3.getFirst()) / (primitiveRanges3.getLast() - primitiveRanges3.getFirst()), 0.0f, 1.0f);
                } else {
                    composer2 = composerStartRestartGroup;
                    fCoerceIn = 0.0f;
                }
                Composer composer4 = composer2;
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue = composer4.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(fCoerceIn);
                    composer4.updateRememberedValue(objRememberedValue);
                }
                SnapshotFloatState2 snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer4.rememberedValue();
                PrimitiveRanges3 primitiveRanges34 = primitiveRanges3;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(fCoerceIn);
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                SnapshotFloatState2 snapshotFloatState24 = (SnapshotFloatState2) objRememberedValue2;
                composer4.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(z3 ? 2.0f : 1.0f, AnimationSpecKt.spring$default(0.5f, 200.0f, null, 4, null), 0.0f, "thumbscale", null, composer4, 3120, 20);
                Float fValueOf = Float.valueOf(fCoerceIn);
                Boolean boolValueOf = Boolean.valueOf(z10);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                composer4.startReplaceGroup(-1224400529);
                int i22 = i5 & 896;
                int i23 = i5;
                boolean zChanged = (i22 == 256) | ((i5 & 1879048192) == 536870912) | composer4.changed(z10) | composer4.changed(fCoerceIn);
                Object objRememberedValue3 = composer4.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    snapshotState4 = snapshotState4AnimateFloatAsState;
                    f2 = fM7995constructorimpl2;
                    composer3 = composer4;
                    i10 = i22;
                    bentoColors = colors;
                    boolean z11 = z10;
                    bentoTheme2 = bentoTheme;
                    i11 = i21;
                    primitiveRanges32 = primitiveRanges34;
                    obj = null;
                    hapticFeedback = hapticFeedback2;
                    f3 = 0.0f;
                    LiveEventStreamComposableKt$VideoSeekbar$1$1 liveEventStreamComposableKt$VideoSeekbar$1$1 = new LiveEventStreamComposableKt$VideoSeekbar$1$1(z3, z, z11, fCoerceIn, snapshotFloatState23, null);
                    snapshotFloatState2 = snapshotFloatState23;
                    composer3.updateRememberedValue(liveEventStreamComposableKt$VideoSeekbar$1$1);
                    objRememberedValue3 = liveEventStreamComposableKt$VideoSeekbar$1$1;
                } else {
                    f2 = fM7995constructorimpl2;
                    snapshotState4 = snapshotState4AnimateFloatAsState;
                    composer3 = composer4;
                    i10 = i22;
                    bentoColors = colors;
                    bentoTheme2 = bentoTheme;
                    i11 = i21;
                    primitiveRanges32 = primitiveRanges34;
                    snapshotFloatState2 = snapshotFloatState23;
                    obj = null;
                    hapticFeedback = hapticFeedback2;
                    f3 = 0.0f;
                }
                composer3.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf, boolValueOf, boolValueOf2, (Function2) objRememberedValue3, composer3, i10);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, f3, 1, obj);
                Boolean boolValueOf3 = Boolean.valueOf(z5);
                composer3.startReplaceGroup(-1224400529);
                int i24 = i20 & 112;
                int i25 = i23 & 29360128;
                int i26 = i23 & 3670016;
                boolean zChangedInstance = (i24 == 32) | (i25 == 8388608) | composer3.changedInstance(primitiveRanges32) | (i26 == 1048576);
                Object objRememberedValue4 = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    modifier2 = modifier4;
                    i12 = i24;
                    i13 = i25;
                    i14 = i26;
                    primitiveRanges33 = primitiveRanges32;
                    snapshotFloatState22 = snapshotFloatState2;
                    z6 = z5;
                    bool = boolValueOf3;
                    PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoSeekbar$2$1

                        /* compiled from: LiveEventStreamComposable.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoSeekbar$2$1$1", m3645f = "LiveEventStreamComposable.kt", m3646l = {837}, m3647m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$VideoSeekbar$2$1$1 */
                        static final class C145751 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Function1<Long, Unit> $onSeekEnded;
                            final /* synthetic */ Function0<Unit> $onSeekStarted;
                            final /* synthetic */ SnapshotFloatState2 $seekPosition$delegate;
                            final /* synthetic */ PrimitiveRanges3 $seekRange;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C145751(Function0<Unit> function0, PrimitiveRanges3 primitiveRanges3, Function1<? super Long, Unit> function1, SnapshotFloatState2 snapshotFloatState2, Continuation<? super C145751> continuation) {
                                super(2, continuation);
                                this.$onSeekStarted = function0;
                                this.$seekRange = primitiveRanges3;
                                this.$onSeekEnded = function1;
                                this.$seekPosition$delegate = snapshotFloatState2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C145751 c145751 = new C145751(this.$onSeekStarted, this.$seekRange, this.$onSeekEnded, this.$seekPosition$delegate, continuation);
                                c145751.L$0 = obj;
                                return c145751;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((C145751) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                                /*
                                    r9 = this;
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r1 = r9.label
                                    r2 = 1
                                    if (r1 == 0) goto L1b
                                    if (r1 != r2) goto L13
                                    java.lang.Object r1 = r9.L$0
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                                    kotlin.ResultKt.throwOnFailure(r10)
                                    goto L2f
                                L13:
                                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r10.<init>(r0)
                                    throw r10
                                L1b:
                                    kotlin.ResultKt.throwOnFailure(r10)
                                    java.lang.Object r10 = r9.L$0
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r10
                                    r1 = r10
                                L23:
                                    r9.L$0 = r1
                                    r9.label = r2
                                    r10 = 0
                                    java.lang.Object r10 = androidx.compose.p011ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r10, r9, r2, r10)
                                    if (r10 != r0) goto L2f
                                    return r0
                                L2f:
                                    androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.p011ui.input.pointer.PointerEvent) r10
                                    int r3 = r10.getType()
                                    androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p011ui.input.pointer.PointerEventType.INSTANCE
                                    int r4 = r4.m7160getPress7fucELk()
                                    boolean r3 = androidx.compose.p011ui.input.pointer.PointerEventType.m7156equalsimpl0(r3, r4)
                                    if (r3 == 0) goto L23
                                    java.util.List r10 = r10.getChanges()
                                    java.lang.Object r10 = kotlin.collections.CollectionsKt.first(r10)
                                    androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r10
                                    long r3 = r10.getPosition()
                                    androidx.compose.runtime.MutableFloatState r10 = r9.$seekPosition$delegate
                                    r5 = 32
                                    long r3 = r3 >> r5
                                    int r3 = (int) r3
                                    float r3 = java.lang.Float.intBitsToFloat(r3)
                                    long r6 = r1.mo7138getSizeYbymL2g()
                                    long r4 = r6 >> r5
                                    int r4 = (int) r4
                                    float r4 = (float) r4
                                    float r3 = r3 / r4
                                    r4 = 0
                                    r5 = 1065353216(0x3f800000, float:1.0)
                                    float r3 = kotlin.ranges.RangesKt.coerceIn(r3, r4, r5)
                                    com.robinhood.android.engagement.goldevent.p115ui.LiveEventStreamComposableKt.access$VideoSeekbar_WtlUe4I$lambda$63(r10, r3)
                                    kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r9.$onSeekStarted
                                    r10.invoke()
                                    kotlin.ranges.LongRange r10 = r9.$seekRange
                                    long r3 = r10.getFirst()
                                    kotlin.ranges.LongRange r10 = r9.$seekRange
                                    long r5 = r10.getLast()
                                    kotlin.ranges.LongRange r10 = r9.$seekRange
                                    long r7 = r10.getFirst()
                                    long r5 = r5 - r7
                                    float r10 = (float) r5
                                    androidx.compose.runtime.MutableFloatState r5 = r9.$seekPosition$delegate
                                    float r5 = com.robinhood.android.engagement.goldevent.p115ui.LiveEventStreamComposableKt.access$VideoSeekbar_WtlUe4I$lambda$62(r5)
                                    float r10 = r10 * r5
                                    long r5 = (long) r10
                                    long r3 = r3 + r5
                                    kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r10 = r9.$onSeekEnded
                                    java.lang.Long r3 = kotlin.coroutines.jvm.internal.boxing.boxLong(r3)
                                    r10.invoke(r3)
                                    goto L23
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.engagement.goldevent.p115ui.LiveEventStreamComposableKt$VideoSeekbar$2$1.C145751.invokeSuspend(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object objAwaitPointerEventScope;
                            return (z6 && (objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C145751(onSeekStarted, primitiveRanges33, onSeekEnded, snapshotFloatState22, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objAwaitPointerEventScope : Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(pointerInputEventHandler);
                    objRememberedValue4 = pointerInputEventHandler;
                } else {
                    modifier2 = modifier4;
                    i12 = i24;
                    i13 = i25;
                    i14 = i26;
                    primitiveRanges33 = primitiveRanges32;
                    snapshotFloatState22 = snapshotFloatState2;
                    z6 = z5;
                    bool = boolValueOf3;
                }
                composer3.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxWidth$default, bool, (PointerInputEventHandler) objRememberedValue4);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composer3, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPointerInput);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                boolean z12 = z6;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer3.startReplaceGroup(-1270574582);
                if (z3) {
                    Duration.Companion companion4 = Duration.INSTANCE;
                    InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(m13513formattedTimeLRDsOJo(Duration3.toDuration((long) ((snapshotFloatState22.getFloatValue() - snapshotFloatState24.getFloatValue()) * j2), DurationUnitJvm.MILLISECONDS)), null, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i11).m21371getBg0d7_KjU()), null, false, Color.m6701boximpl(bentoTheme2.getColors(composer3, i11).m21425getFg0d7_KjU()), null, composer3, 12582912, 54);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composer3, i11).m21592getMediumD9Ej5fM()), composer3, 0);
                }
                composer3.endReplaceGroup();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SystemGestureExclusionKt.systemGestureExclusion(companion5), 0.0f, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 13, null);
                Boolean boolValueOf4 = Boolean.valueOf(z12);
                composer3.startReplaceGroup(-1224400529);
                HapticFeedback hapticFeedback3 = hapticFeedback;
                boolean zChangedInstance2 = (i13 == 8388608) | (i12 == 32) | composer3.changedInstance(hapticFeedback3) | composer3.changedInstance(primitiveRanges33) | (i14 == 1048576);
                Object objRememberedValue5 = composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                    liveEventStreamComposableKt$VideoSeekbar$3$1$1 = new LiveEventStreamComposableKt$VideoSeekbar$3$1$1(z12, hapticFeedback3, onSeekStarted, snapshotFloatState22, snapshotFloatState24, primitiveRanges33, onSeekEnded);
                    z7 = z12;
                    composer3.updateRememberedValue(liveEventStreamComposableKt$VideoSeekbar$3$1$1);
                } else {
                    liveEventStreamComposableKt$VideoSeekbar$3$1$1 = objRememberedValue5;
                    z7 = z12;
                }
                composer3.endReplaceGroup();
                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierM5146paddingqDBjuR0$default, boolValueOf4, (PointerInputEventHandler) liveEventStreamComposableKt$VideoSeekbar$3$1$1);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierPointerInput2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f4));
                composer3.startReplaceGroup(-1224400529);
                final BentoColors bentoColors2 = bentoColors;
                final float f5 = f2;
                final SnapshotState4<Float> snapshotState42 = snapshotState4;
                boolean zChanged2 = composer3.changed(bentoColors2) | composer3.changed(f5) | ((i23 & 234881024) == 67108864) | composer3.changed(fM7995constructorimpl) | composer3.changed(snapshotState42);
                Object objRememberedValue6 = composer3.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    final SnapshotFloatState2 snapshotFloatState25 = snapshotFloatState22;
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LiveEventStreamComposableKt.VideoSeekbar_WtlUe4I$lambda$74$lambda$73$lambda$72$lambda$71(bentoColors2, f5, z2, fM7995constructorimpl, snapshotFloatState25, snapshotState42, (DrawScope) obj2);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                composer3.endReplaceGroup();
                Canvas2.Canvas(modifierM5156height3ABfNKs, (Function1) objRememberedValue6, composer3, 0);
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z8 = z7;
                modifier3 = modifier2;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LiveEventStreamComposableKt.VideoSeekbar_WtlUe4I$lambda$75(f, j, z, j2, j3, j4, onSeekEnded, onSeekStarted, z2, z3, modifier3, z8, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit VideoSeekbar_WtlUe4I$lambda$74$lambda$73$lambda$72$lambda$71(BentoColors bentoColors, float f, boolean z, float f2, SnapshotFloatState2 snapshotFloatState2, SnapshotState4 snapshotState4, DrawScope Canvas) {
            float f3;
            float fMax;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * snapshotFloatState2.getFloatValue();
            if (fIntBitsToFloat > 0.0f) {
                long jM21425getFg0d7_KjU = bentoColors.m21425getFg0d7_KjU();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L));
                long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L));
                f3 = fIntBitsToFloat;
                DrawScope.m6951drawLineNGM6Ib0$default(Canvas, jM21425getFg0d7_KjU, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L)), Canvas.mo5016toPx0680j_4(f), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            } else {
                f3 = fIntBitsToFloat;
            }
            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoColors.m21425getFg0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L));
            long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L));
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32));
            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L));
            DrawScope.m6951drawLineNGM6Ib0$default(Canvas, jM6705copywmQWz5c$default, jM6535constructorimpl2, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat5) << 32)), Canvas.mo5016toPx0680j_4(f), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            if (z) {
                fMax = f3;
            } else {
                fMax = Math.max(Canvas.mo5016toPx0680j_4(f2), Math.min(f3, Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - Canvas.mo5016toPx0680j_4(f2)));
            }
            long jM21425getFg0d7_KjU2 = bentoColors.m21425getFg0d7_KjU();
            float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f2) * VideoSeekbar_WtlUe4I$lambda$67(snapshotState4);
            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (Canvas.mo6962getCenterF1C5BW0() & 4294967295L));
            DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, jM21425getFg0d7_KjU2, fMo5016toPx0680j_4, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat7) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            return Unit.INSTANCE;
        }

        public static final void HideSystemBars(Composer composer, final int i) {
            Composer composerStartRestartGroup = composer.startRestartGroup(-894494635);
            if (i == 0 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-894494635, i, -1, "com.robinhood.android.engagement.goldevent.ui.HideSystemBars (LiveEventStreamComposable.kt:949)");
                }
                final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(view);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveEventStreamComposableKt.HideSystemBars$lambda$80$lambda$79(view, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiveEventStreamComposableKt.HideSystemBars$lambda$81(i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult HideSystemBars$lambda$80$lambda$79(final View view, DisposableEffectScope DisposableEffect) {
            Window window;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
            if (appCompatActivityFindActivityBaseContext != null && (window = appCompatActivityFindActivityBaseContext.getWindow()) != null) {
                WindowCompat.setDecorFitsSystemWindows(window, false);
                WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
                windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.statusBars());
                windowInsetsControllerCompat.setSystemBarsBehavior(2);
            }
            return new DisposableEffectResult() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$HideSystemBars$lambda$80$lambda$79$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Window window2;
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    AppCompatActivity appCompatActivityFindActivityBaseContext2 = BaseContexts.findActivityBaseContext(context2);
                    if (appCompatActivityFindActivityBaseContext2 == null || (window2 = appCompatActivityFindActivityBaseContext2.getWindow()) == null) {
                        return;
                    }
                    new WindowInsetsControllerCompat(window2, view).show(WindowInsetsCompat.Type.statusBars());
                }
            };
        }

        /* compiled from: LiveEventStreamComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$applyPipActivityParams$1 */
        static final class C145761 implements Function3<Modifier, Composer, Integer, Modifier> {
            public static final C145761 INSTANCE = new C145761();

            C145761() {
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(-987521432);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-987521432, i, -1, "com.robinhood.android.engagement.goldevent.ui.applyPipActivityParams.<anonymous> (LiveEventStreamComposable.kt:972)");
                }
                final AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
                if (appCompatActivityFindActivityBaseContext == null) {
                    appCompatActivityFindActivityBaseContext = null;
                }
                if (appCompatActivityFindActivityBaseContext == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return composed;
                }
                if (!appCompatActivityFindActivityBaseContext.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return composed;
                }
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(appCompatActivityFindActivityBaseContext);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$applyPipActivityParams$1$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveEventStreamComposableKt.C145761.invoke$lambda$1$lambda$0(appCompatActivityFindActivityBaseContext, (LayoutCoordinates) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierOnGloballyPositioned;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(ComponentActivity componentActivity, LayoutCoordinates layoutCoordinates) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    try {
                        C14568xc3739f92.m1948m();
                        PictureInPictureParams.Builder builderM1947m = C14567xc3739f91.m1947m();
                        RectF androidRectF = RectHelper_androidKt.toAndroidRectF(LayoutCoordinates2.boundsInWindow(layoutCoordinates));
                        Rect rect = new Rect();
                        androidRectF.roundOut(rect);
                        builderM1947m.setSourceRectHint(rect);
                        int iMo7241getSizeYbymL2g = (int) (layoutCoordinates.mo7241getSizeYbymL2g() >> 32);
                        int iMo7241getSizeYbymL2g2 = (int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L);
                        if (iMo7241getSizeYbymL2g > 0 && iMo7241getSizeYbymL2g2 > 0) {
                            builderM1947m.setAspectRatio(new Rational(iMo7241getSizeYbymL2g, iMo7241getSizeYbymL2g2));
                        }
                        if (i >= 31) {
                            builderM1947m.setAutoEnterEnabled(true);
                        }
                        componentActivity.setPictureInPictureParams(builderM1947m.build());
                    } catch (Exception e) {
                        Timber.INSTANCE.mo3355e(e, "Failed to set PiP params", new Object[0]);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public static final Modifier applyPipActivityParams(Modifier modifier) {
            Intrinsics.checkNotNullParameter(modifier, "<this>");
            return ComposedModifier2.composed$default(modifier, null, C145761.INSTANCE, 1, null);
        }

        public static final boolean rememberIsInPipMode(final Function1<? super Boolean, Unit> onPipModeChanged, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(onPipModeChanged, "onPipModeChanged");
            composer.startReplaceGroup(-1167522191);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1167522191, i, -1, "com.robinhood.android.engagement.goldevent.ui.rememberIsInPipMode (LiveEventStreamComposable.kt:1009)");
            }
            if (Build.VERSION.SDK_INT < 26) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return false;
            }
            final AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
            if (appCompatActivityFindActivityBaseContext == null) {
                appCompatActivityFindActivityBaseContext = null;
            }
            if (appCompatActivityFindActivityBaseContext == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return false;
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(appCompatActivityFindActivityBaseContext.isInPictureInPictureMode()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = ((((i & 14) ^ 6) > 4 && composer.changed(onPipModeChanged)) || (i & 6) == 4) | composer.changedInstance(appCompatActivityFindActivityBaseContext);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiveEventStreamComposableKt.rememberIsInPipMode$lambda$87$lambda$86(appCompatActivityFindActivityBaseContext, onPipModeChanged, snapshotState, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(appCompatActivityFindActivityBaseContext, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
            boolean zRememberIsInPipMode$lambda$83 = rememberIsInPipMode$lambda$83(snapshotState);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return zRememberIsInPipMode$lambda$83;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void rememberIsInPipMode$lambda$84(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult rememberIsInPipMode$lambda$87$lambda$86(final ComponentActivity componentActivity, final Function1 function1, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Consumer<PictureInPictureModeChangedInfo> consumer = new Consumer() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$rememberIsInPipMode$1$1$observer$1
                @Override // androidx.core.util.Consumer
                public final void accept(PictureInPictureModeChangedInfo info) {
                    Intrinsics.checkNotNullParameter(info, "info");
                    LiveEventStreamComposableKt.rememberIsInPipMode$lambda$84(snapshotState, info.getIsInPictureInPictureMode());
                    function1.invoke(Boolean.valueOf(LiveEventStreamComposableKt.rememberIsInPipMode$lambda$83(snapshotState)));
                }
            };
            componentActivity.addOnPictureInPictureModeChangedListener(consumer);
            return new DisposableEffectResult() { // from class: com.robinhood.android.engagement.goldevent.ui.LiveEventStreamComposableKt$rememberIsInPipMode$lambda$87$lambda$86$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    componentActivity.removeOnPictureInPictureModeChangedListener(consumer);
                }
            };
        }
    }
