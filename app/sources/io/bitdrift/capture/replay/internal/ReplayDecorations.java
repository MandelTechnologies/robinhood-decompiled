package io.bitdrift.capture.replay.internal;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import io.bitdrift.capture.common.IWindowManager;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.SessionReplayController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReplayDecorations.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n2\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/ReplayDecorations;", "", "displayManager", "Lio/bitdrift/capture/replay/internal/DisplayManagers;", "windowManager", "Lio/bitdrift/capture/common/IWindowManager;", "(Lio/bitdrift/capture/replay/internal/DisplayManagers;Lio/bitdrift/capture/common/IWindowManager;)V", "addDecorations", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "Lio/bitdrift/capture/replay/internal/FilteredCapture;", "filteredCapture", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReplayDecorations {
    private final DisplayManagers displayManager;
    private final IWindowManager windowManager;

    public ReplayDecorations(DisplayManagers displayManager, IWindowManager windowManager) {
        Intrinsics.checkNotNullParameter(displayManager, "displayManager");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        this.displayManager = displayManager;
        this.windowManager = windowManager;
    }

    public final List<ReplayRect> addDecorations(List<ReplayRect> filteredCapture) {
        Intrinsics.checkNotNullParameter(filteredCapture, "filteredCapture");
        ReplayRect replayRectComputeDisplayRect = this.displayManager.computeDisplayRect();
        SessionReplayController.C45498L.INSTANCE.m3326d("Display Screen size " + replayRectComputeDisplayRect);
        List listMutableListOf = CollectionsKt.mutableListOf(replayRectComputeDisplayRect);
        listMutableListOf.addAll(filteredCapture);
        for (View view : this.windowManager.getAllRootViews()) {
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
            if (rootWindowInsets != null) {
                int iIme = WindowInsetsCompat.Type.ime();
                if (rootWindowInsets.isVisible(iIme)) {
                    Insets insets = rootWindowInsets.getInsets(iIme);
                    Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
                    ReplayRect replayRect = new ReplayRect(ReplayType.Keyboard.INSTANCE, view.getLeft(), view.getBottom() - insets.bottom, view.getWidth(), insets.bottom);
                    SessionReplayController.C45498L.INSTANCE.m3326d("Keyboard IME size " + replayRect);
                    listMutableListOf.add(replayRect);
                }
            }
        }
        return CollectionsKt.toList(listMutableListOf);
    }
}
