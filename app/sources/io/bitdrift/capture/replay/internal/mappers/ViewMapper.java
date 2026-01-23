package io.bitdrift.capture.replay.internal.mappers;

import android.content.res.Resources;
import android.view.View;
import io.bitdrift.capture.replay.ReplayCaptureMetrics;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.SessionReplayConfiguration;
import io.bitdrift.capture.replay.SessionReplayController;
import io.bitdrift.capture.replay.internal.ReplayRect;
import io.bitdrift.capture.replay.internal.ScannableView;
import io.bitdrift.capture.replay.internal.ViewMapperConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewMapper.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/ViewMapper;", "", "sessionReplayConfiguration", "Lio/bitdrift/capture/replay/SessionReplayConfiguration;", "viewMapperConfiguration", "Lio/bitdrift/capture/replay/internal/ViewMapperConfiguration;", "buttonMapper", "Lio/bitdrift/capture/replay/internal/mappers/ButtonMapper;", "textMapper", "Lio/bitdrift/capture/replay/internal/mappers/TextMapper;", "backgroundMapper", "Lio/bitdrift/capture/replay/internal/mappers/BackgroundMapper;", "(Lio/bitdrift/capture/replay/SessionReplayConfiguration;Lio/bitdrift/capture/replay/internal/ViewMapperConfiguration;Lio/bitdrift/capture/replay/internal/mappers/ButtonMapper;Lio/bitdrift/capture/replay/internal/mappers/TextMapper;Lio/bitdrift/capture/replay/internal/mappers/BackgroundMapper;)V", "isValidResId", "", "resId", "", "mapView", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "node", "Lio/bitdrift/capture/replay/internal/ScannableView;", "updateMetrics", "", "replayCaptureMetrics", "Lio/bitdrift/capture/replay/ReplayCaptureMetrics;", "viewIsVisible", "viewToReplayRect", "Landroid/view/View;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ViewMapper {
    private final BackgroundMapper backgroundMapper;
    private final ButtonMapper buttonMapper;
    private final TextMapper textMapper;
    private final ViewMapperConfiguration viewMapperConfiguration;

    public ViewMapper(SessionReplayConfiguration sessionReplayConfiguration, ViewMapperConfiguration viewMapperConfiguration, ButtonMapper buttonMapper, TextMapper textMapper, BackgroundMapper backgroundMapper) {
        Intrinsics.checkNotNullParameter(sessionReplayConfiguration, "sessionReplayConfiguration");
        Intrinsics.checkNotNullParameter(viewMapperConfiguration, "viewMapperConfiguration");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        Intrinsics.checkNotNullParameter(textMapper, "textMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        this.viewMapperConfiguration = viewMapperConfiguration;
        this.buttonMapper = buttonMapper;
        this.textMapper = textMapper;
        this.backgroundMapper = backgroundMapper;
    }

    public /* synthetic */ ViewMapper(SessionReplayConfiguration sessionReplayConfiguration, ViewMapperConfiguration viewMapperConfiguration, ButtonMapper buttonMapper, TextMapper textMapper, BackgroundMapper backgroundMapper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionReplayConfiguration, (i & 2) != 0 ? new ViewMapperConfiguration(sessionReplayConfiguration, null, 2, null) : viewMapperConfiguration, (i & 4) != 0 ? new ButtonMapper(null, null, 3, null) : buttonMapper, (i & 8) != 0 ? new TextMapper(null, 1, null) : textMapper, (i & 16) != 0 ? new BackgroundMapper() : backgroundMapper);
    }

    public final void updateMetrics(ScannableView node, ReplayCaptureMetrics replayCaptureMetrics) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(replayCaptureMetrics, "replayCaptureMetrics");
        if (node instanceof ScannableView.AndroidView) {
            replayCaptureMetrics.setViewCount(replayCaptureMetrics.getViewCount() + 1);
        } else {
            if (!(node instanceof ScannableView.ComposeView)) {
                throw new NoWhenBranchMatchedException();
            }
            replayCaptureMetrics.setComposeViewCount(replayCaptureMetrics.getComposeViewCount() + 1);
        }
    }

    public final boolean viewIsVisible(ScannableView node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node instanceof ScannableView.AndroidView) {
            ScannableView.AndroidView androidView = (ScannableView.AndroidView) node;
            return androidView.getView().getVisibility() == 0 && androidView.getView().getWidth() > 0 && androidView.getView().getHeight() > 0;
        }
        if (node instanceof ScannableView.ComposeView) {
            return !(node instanceof ScannableView.IgnoredComposeView);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<ReplayRect> mapView(ScannableView node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node instanceof ScannableView.AndroidView) {
            return viewToReplayRect(((ScannableView.AndroidView) node).getView());
        }
        if (node instanceof ScannableView.ComposeView) {
            return CollectionsKt.listOf(((ScannableView.ComposeView) node).getReplayRect());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final List<ReplayRect> viewToReplayRect(View view) throws Resources.NotFoundException {
        String resourceEntryName;
        ArrayList arrayList = new ArrayList();
        if (isValidResId(view.getId())) {
            try {
                resourceEntryName = view.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException e) {
                SessionReplayController.C45498L.INSTANCE.m3327e(e, "Ignoring view due to:" + e.getMessage() + " for " + view.getId());
                resourceEntryName = "Failed to retrieve ID";
            }
        } else {
            resourceEntryName = "invalid_resource_id";
        }
        ReplayType replayType = this.viewMapperConfiguration.getMapper().get(view.getClass().getSimpleName());
        if (replayType == null) {
            arrayList.addAll(this.buttonMapper.map(view));
            arrayList.addAll(this.textMapper.map(view));
            arrayList.addAll(this.backgroundMapper.map(view));
            if (arrayList.isEmpty()) {
                SessionReplayController.C45498L.INSTANCE.m3328v("Ignoring Unknown view: " + resourceEntryName + ' ' + view.getClass().getSimpleName() + ": w=" + view.getWidth() + ", h=" + view.getHeight());
            } else {
                SessionReplayController.C45498L.INSTANCE.m3328v("Matched " + arrayList.size() + " views with ButtonMapper and TextMapper and BackgroundMapper");
            }
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            SessionReplayController.C45498L.INSTANCE.m3328v("Successfully mapped Android view=" + view.getClass().getSimpleName() + " to=" + replayType + ": " + iArr[0] + ", " + iArr[1] + ", " + view.getWidth() + ", " + view.getHeight());
            arrayList.add(new ReplayRect(replayType, iArr[0], iArr[1], view.getWidth(), view.getHeight()));
        }
        return arrayList;
    }

    private final boolean isValidResId(int resId) {
        return (resId == -1 || resId == 0 || UInt.m28582constructorimpl(UInt.m28582constructorimpl(resId) & 16711680) == 0 || UInt.m28582constructorimpl(UInt.m28582constructorimpl(resId) & (-16777216)) == 0) ? false : true;
    }
}
