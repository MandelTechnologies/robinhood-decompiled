package com.robinhood.android.common.view;

import android.graphics.drawable.Drawable;
import com.robinhood.android.common.C11048R;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;

/* compiled from: RhCardView.kt */
@Metadata(m3635d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0005R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m3636d2 = {"com/robinhood/android/common/view/RhCardView$backgrounds$1", "", ApiRenderablePlatforms.VERSIONS_ALL, "Landroid/graphics/drawable/Drawable;", "getAll", "()Landroid/graphics/drawable/Drawable;", "top", "getTop", "middle", "getMiddle", "bottom", "getBottom", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.view.RhCardView$backgrounds$1, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhCardView2 {
    private final Drawable all;
    private final Drawable bottom;
    private final Drawable middle;
    private final Drawable top;

    RhCardView2(RhCardView rhCardView) {
        this.all = ViewsKt.getDrawable(rhCardView, C11048R.drawable.rounded_background_all);
        this.top = ViewsKt.getDrawable(rhCardView, C11048R.drawable.rounded_background_top);
        this.middle = ViewsKt.getDrawable(rhCardView, C11048R.drawable.rounded_background_middle);
        this.bottom = ViewsKt.getDrawable(rhCardView, C11048R.drawable.rounded_background_bottom);
    }

    public final Drawable getAll() {
        return this.all;
    }

    public final Drawable getTop() {
        return this.top;
    }

    public final Drawable getMiddle() {
        return this.middle;
    }

    public final Drawable getBottom() {
        return this.bottom;
    }
}
