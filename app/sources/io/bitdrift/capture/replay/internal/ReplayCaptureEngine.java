package io.bitdrift.capture.replay.internal;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.card.p311db.Card;
import io.bitdrift.capture.common.DefaultClock;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IClock;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.common.MainThreadHandler;
import io.bitdrift.capture.replay.IReplayLogger;
import io.bitdrift.capture.replay.ReplayCaptureMetrics;
import io.bitdrift.capture.replay.SessionReplayConfiguration;
import io.bitdrift.capture.replay.SessionReplayController;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;

/* compiled from: ReplayCaptureEngine.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJg\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2U\u0010\u001f\u001aQ\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020&0%j\u0002`'¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001c0 H\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ReplayCaptureEngine;", "", "sessionReplayConfiguration", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "errorHandler", "Lio/bitdrift/capture/common/ErrorHandler;", "logger", "Lio/bitdrift/capture/replay/IReplayLogger;", "mainThreadHandler", "Lio/bitdrift/capture/common/MainThreadHandler;", "windowManager", "Lio/bitdrift/capture/common/IWindowManager;", "displayManager", "Lio/bitdrift/capture/replay/internal/DisplayManagers;", "executor", "Ljava/util/concurrent/ExecutorService;", "captureParser", "Lio/bitdrift/capture/replay/internal/ReplayParser;", "captureFilter", "Lio/bitdrift/capture/replay/internal/ReplayFilter;", "captureDecorations", "Lio/bitdrift/capture/replay/internal/ReplayDecorations;", "replayEncoder", "Lio/bitdrift/capture/replay/internal/ReplayEncoder;", Card.Icon.CLOCK, "Lio/bitdrift/capture/common/IClock;", "(Lio/bitdrift/capture/replay/SessionReplayConfiguration;Lio/bitdrift/capture/common/ErrorHandler;Lio/bitdrift/capture/replay/IReplayLogger;Lio/bitdrift/capture/common/MainThreadHandler;Lio/bitdrift/capture/common/IWindowManager;Lio/bitdrift/capture/replay/internal/DisplayManagers;Ljava/util/concurrent/ExecutorService;Lio/bitdrift/capture/replay/internal/ReplayParser;Lio/bitdrift/capture/replay/internal/ReplayFilter;Lio/bitdrift/capture/replay/internal/ReplayDecorations;Lio/bitdrift/capture/replay/internal/ReplayEncoder;Lio/bitdrift/capture/common/IClock;)V", "captureScreen", "", "skipReplayComposeViews", "", "completion", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "encodedScreen", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "Lio/bitdrift/capture/replay/internal/FilteredCapture;", "screen", "Lio/bitdrift/capture/replay/ReplayCaptureMetrics;", "metrics", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReplayCaptureEngine {
    private final ReplayDecorations captureDecorations;
    private final ReplayFilter captureFilter;
    private final ReplayParser captureParser;
    private final IClock clock;
    private final ExecutorService executor;
    private final IReplayLogger logger;
    private final MainThreadHandler mainThreadHandler;
    private final ReplayEncoder replayEncoder;

    public ReplayCaptureEngine(SessionReplayConfiguration sessionReplayConfiguration, ErrorHandler errorHandler, IReplayLogger logger, MainThreadHandler mainThreadHandler, IWindowManager windowManager, DisplayManagers displayManager, ExecutorService executor, ReplayParser captureParser, ReplayFilter captureFilter, ReplayDecorations captureDecorations, ReplayEncoder replayEncoder, IClock clock) {
        Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "sessionReplayConfiguration");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(displayManager, "displayManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(captureParser, "captureParser");
        Intrinsics.checkNotNullParameter(captureFilter, "captureFilter");
        Intrinsics.checkNotNullParameter(captureDecorations, "captureDecorations");
        Intrinsics.checkNotNullParameter(replayEncoder, "replayEncoder");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.logger = logger;
        this.mainThreadHandler = mainThreadHandler;
        this.executor = executor;
        this.captureParser = captureParser;
        this.captureFilter = captureFilter;
        this.captureDecorations = captureDecorations;
        this.replayEncoder = replayEncoder;
        this.clock = clock;
    }

    public /* synthetic */ ReplayCaptureEngine(SessionReplayConfiguration sessionReplayConfiguration, ErrorHandler errorHandler, IReplayLogger iReplayLogger, MainThreadHandler mainThreadHandler, IWindowManager iWindowManager, DisplayManagers displayManagers, ExecutorService executorService, ReplayParser replayParser, ReplayFilter replayFilter, ReplayDecorations replayDecorations, ReplayEncoder replayEncoder, IClock iClock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        IWindowManager iWindowManager2;
        DisplayManagers displayManagers2;
        ReplayDecorations replayDecorations2;
        ReplayParser replayParser2 = (i & 128) != 0 ? new ReplayParser(sessionReplayConfiguration, errorHandler, iWindowManager, null, 8, null) : replayParser;
        ReplayFilter replayFilter2 = (i & 256) != 0 ? new ReplayFilter() : replayFilter;
        if ((i & 512) != 0) {
            iWindowManager2 = iWindowManager;
            displayManagers2 = displayManagers;
            replayDecorations2 = new ReplayDecorations(displayManagers2, iWindowManager2);
        } else {
            iWindowManager2 = iWindowManager;
            displayManagers2 = displayManagers;
            replayDecorations2 = replayDecorations;
        }
        this(sessionReplayConfiguration, errorHandler, iReplayLogger, mainThreadHandler, iWindowManager2, displayManagers2, executorService, replayParser2, replayFilter2, replayDecorations2, (i & 1024) != 0 ? new ReplayEncoder() : replayEncoder, (i & 2048) != 0 ? DefaultClock.INSTANCE.getInstance() : iClock);
    }

    public final void captureScreen(final boolean skipReplayComposeViews) {
        this.mainThreadHandler.run(new Function0<Unit>() { // from class: io.bitdrift.capture.replay.internal.ReplayCaptureEngine.captureScreen.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final ReplayCaptureEngine replayCaptureEngine = ReplayCaptureEngine.this;
                replayCaptureEngine.captureScreen(skipReplayComposeViews, new Function3<byte[], List<? extends ReplayRect>, ReplayCaptureMetrics, Unit>() { // from class: io.bitdrift.capture.replay.internal.ReplayCaptureEngine.captureScreen.1.1
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr, List<? extends ReplayRect> list, ReplayCaptureMetrics replayCaptureMetrics) {
                        invoke2(bArr, (List<ReplayRect>) list, replayCaptureMetrics);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(byte[] byteArray, List<ReplayRect> screen, ReplayCaptureMetrics metrics) {
                        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(metrics, "metrics");
                        replayCaptureEngine.logger.onScreenCaptured(byteArray, screen, metrics);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureScreen(boolean skipReplayComposeViews, final Function3<? super byte[], ? super List<ReplayRect>, ? super ReplayCaptureMetrics, Unit> completion) {
        final long jElapsedRealtime = this.clock.elapsedRealtime();
        final ReplayCaptureMetrics replayCaptureMetrics = new ReplayCaptureMetrics(0, 0, 0, 0, 0, 0L, 0L, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        final TimedValue timedValue = new TimedValue(this.captureParser.parse(replayCaptureMetrics, skipReplayComposeViews), TimeSource.Monotonic.ValueTimeMark.m28775elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m28773markNowz9LOYto()), null);
        this.executor.execute(new Runnable() { // from class: io.bitdrift.capture.replay.internal.ReplayCaptureEngine.captureScreen.2
            @Override // java.lang.Runnable
            public final void run() {
                List<ReplayRect> listFilter = ReplayCaptureEngine.this.captureFilter.filter(timedValue.getValue());
                if (listFilter != null) {
                    ReplayCaptureMetrics replayCaptureMetrics2 = replayCaptureMetrics;
                    TimedValue<List<List<ReplayRect>>> timedValue2 = timedValue;
                    ReplayCaptureEngine replayCaptureEngine = ReplayCaptureEngine.this;
                    long j = jElapsedRealtime;
                    Function3<byte[], List<ReplayRect>, ReplayCaptureMetrics, Unit> function3 = completion;
                    replayCaptureMetrics2.m28463setParseDurationLRDsOJo(timedValue2.getDuration());
                    replayCaptureMetrics2.setViewCountAfterFilter(listFilter.size());
                    List<ReplayRect> listAddDecorations = replayCaptureEngine.captureDecorations.addDecorations(listFilter);
                    byte[] bArrEncode = replayCaptureEngine.replayEncoder.encode(listAddDecorations);
                    replayCaptureMetrics2.setEncodingTimeMs((replayCaptureEngine.clock.elapsedRealtime() - j) - Duration.m28738getInWholeMillisecondsimpl(replayCaptureMetrics2.getParseDuration()));
                    SessionReplayController.C45498L.INSTANCE.m3326d("Screen Captured: " + replayCaptureMetrics2);
                    function3.invoke(bArrEncode, listAddDecorations, replayCaptureMetrics2);
                }
            }
        });
    }
}
