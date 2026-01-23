package io.bitdrift.capture.replay.internal.mappers;

import android.graphics.drawable.Drawable;
import android.view.View;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.internal.ReplayRect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackgroundMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/BackgroundMapper;", "Lio/bitdrift/capture/replay/internal/mappers/Mapper;", "()V", "map", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "view", "Landroid/view/View;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class BackgroundMapper extends Mapper {
    @Override // io.bitdrift.capture.replay.internal.mappers.Mapper
    public List<ReplayRect> map(View view) {
        ReplayType replayType;
        Intrinsics.checkNotNullParameter(view, "view");
        List<ReplayRect> map = super.map(view);
        Drawable background = view.getBackground();
        if (background != null) {
            int opacity = background.getOpacity();
            if (opacity == -3) {
                replayType = ReplayType.TransparentView.INSTANCE;
            } else if (opacity == -1) {
                replayType = ReplayType.BackgroundImage.INSTANCE;
            } else {
                replayType = ReplayType.Ignore.INSTANCE;
            }
            map.add(new ReplayRect(replayType, getViewOriginX(), getViewOriginY(), view.getWidth(), view.getHeight()));
        }
        return map;
    }
}
