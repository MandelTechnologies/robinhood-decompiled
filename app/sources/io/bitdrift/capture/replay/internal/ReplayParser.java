package io.bitdrift.capture.replay.internal;

import android.view.View;
import io.bitdrift.capture.common.ErrorHandler;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.replay.ReplayCaptureMetrics;
import io.bitdrift.capture.replay.SessionReplayConfiguration;
import io.bitdrift.capture.replay.SessionReplayController;
import io.bitdrift.capture.replay.internal.ScannableView;
import io.bitdrift.capture.replay.internal.mappers.ViewMapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* compiled from: ReplayParser.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\fj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ReplayParser;", "", "sessionReplayConfiguration", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "errorHandler", "Lio/bitdrift/capture/common/ErrorHandler;", "windowManager", "Lio/bitdrift/capture/common/IWindowManager;", "viewMapper", "Lio/bitdrift/capture/replay/internal/mappers/ViewMapper;", "(Lio/bitdrift/capture/replay/SessionReplayConfiguration;Lio/bitdrift/capture/common/ErrorHandler;Lio/bitdrift/capture/common/IWindowManager;Lio/bitdrift/capture/replay/internal/mappers/ViewMapper;)V", "parse", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "Lio/bitdrift/capture/replay/internal/Capture;", "replayCaptureMetrics", "Lio/bitdrift/capture/replay/ReplayCaptureMetrics;", "skipReplayComposeViews", "", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReplayParser {
    private final ErrorHandler errorHandler;
    private final ViewMapper viewMapper;
    private final IWindowManager windowManager;

    public ReplayParser(SessionReplayConfiguration sessionReplayConfiguration, ErrorHandler errorHandler, IWindowManager windowManager, ViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "sessionReplayConfiguration");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        this.errorHandler = errorHandler;
        this.windowManager = windowManager;
        this.viewMapper = viewMapper;
    }

    public /* synthetic */ ReplayParser(SessionReplayConfiguration sessionReplayConfiguration, ErrorHandler errorHandler, IWindowManager iWindowManager, ViewMapper viewMapper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SessionReplayConfiguration sessionReplayConfiguration2;
        if ((i & 8) != 0) {
            sessionReplayConfiguration2 = sessionReplayConfiguration;
            viewMapper = new ViewMapper(sessionReplayConfiguration2, null, null, null, null, 30, null);
        } else {
            sessionReplayConfiguration2 = sessionReplayConfiguration;
        }
        this(sessionReplayConfiguration2, errorHandler, iWindowManager, viewMapper);
    }

    public final List<List<ReplayRect>> parse(ReplayCaptureMetrics replayCaptureMetrics, boolean skipReplayComposeViews) {
        Intrinsics.checkNotNullParameter(replayCaptureMetrics, "replayCaptureMetrics");
        ArrayList arrayList = new ArrayList();
        List<View> allRootViews = this.windowManager.getAllRootViews();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allRootViews, 10));
        for (View view : allRootViews) {
            SessionReplayController.C45498L.INSTANCE.m3328v("Root view found and added to list: " + view.getClass().getSimpleName());
            arrayList2.add(new ScannableView.AndroidView(view, skipReplayComposeViews));
        }
        ArrayDeque arrayDeque = new ArrayDeque(arrayList2);
        while (!arrayDeque.isEmpty()) {
            ScannableView scannableView = (ScannableView) arrayDeque.removeLast();
            try {
                this.viewMapper.updateMetrics(scannableView, replayCaptureMetrics);
            } catch (Throwable th) {
                String str = "Error parsing view, Skipping " + scannableView + " and children";
                SessionReplayController.C45498L.INSTANCE.m3327e(th, str);
                replayCaptureMetrics.setExceptionCausingViewCount(replayCaptureMetrics.getExceptionCausingViewCount() + 1);
                this.errorHandler.handleError(str, th);
            }
            if (!this.viewMapper.viewIsVisible(scannableView)) {
                SessionReplayController.C45498L.INSTANCE.m3328v("Ignoring not visible view: " + scannableView.getDisplayName());
            } else {
                arrayList.add(this.viewMapper.mapView(scannableView));
                List list = SequencesKt.toList(scannableView.getChildren());
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 < size) {
                        arrayDeque.addLast(list.get(size));
                    }
                }
            }
        }
        return arrayList;
    }
}
