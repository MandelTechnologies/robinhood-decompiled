package io.bitdrift.capture.replay.internal.mappers;

import android.graphics.Rect;
import android.view.View;
import io.bitdrift.capture.replay.ReplayType;
import io.bitdrift.capture.replay.internal.ReplayRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mapper.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/Mapper;", "", "()V", "<set-?>", "", "viewOriginX", "getViewOriginX", "()I", "viewOriginY", "getViewOriginY", "addView", "", "type", "Lio/bitdrift/capture/replay/ReplayType;", "view", "Landroid/view/View;", "list", "", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "alignInScreen", "bounds", "Landroid/graphics/Rect;", "map", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public class Mapper {
    private int viewOriginX;
    private int viewOriginY;

    public final int getViewOriginX() {
        return this.viewOriginX;
    }

    public final int getViewOriginY() {
        return this.viewOriginY;
    }

    public List<ReplayRect> map(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.viewOriginX = iArr[0];
        this.viewOriginY = iArr[1];
        return arrayList;
    }

    public static /* synthetic */ void addView$default(Mapper mapper, ReplayType replayType, View view, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addView");
        }
        if ((i & 1) != 0) {
            replayType = ReplayType.View.INSTANCE;
        }
        mapper.addView(replayType, view, list);
    }

    public final void addView(ReplayType type2, View view, List<ReplayRect> list) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(list, "list");
        list.add(new ReplayRect(type2, this.viewOriginX, this.viewOriginY, view.getWidth(), view.getHeight()));
    }

    public final void alignInScreen(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        bounds.offset(this.viewOriginX, this.viewOriginY);
    }
}
