package com.robinhood.android.mcw.fxswitcher.ftux.constants;

import kotlin.Metadata;

/* compiled from: FxSwitcherFtuxAnimationConstants.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/mcw/fxswitcher/ftux/constants/FxSwitcherFtuxAnimationConstants;", "", "<init>", "()V", "fgAlpha", "", "bgAlpha", "animationDurationMillis", "", "decelCurveSpec", "Lcom/robinhood/android/mcw/fxswitcher/ftux/constants/BezierControlPoints;", "getDecelCurveSpec", "()Lcom/robinhood/android/mcw/fxswitcher/ftux/constants/BezierControlPoints;", "lib-fx-switcher-ftux-constants_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class FxSwitcherFtuxAnimationConstants {
    public static final int $stable = 0;
    public static final int animationDurationMillis = 600;
    public static final float bgAlpha = 0.1f;
    public static final float fgAlpha = 1.0f;
    public static final FxSwitcherFtuxAnimationConstants INSTANCE = new FxSwitcherFtuxAnimationConstants();
    private static final BezierControlPoints decelCurveSpec = new BezierControlPoints(0.17f, 0.17f, 0.1f, 1.0f);

    private FxSwitcherFtuxAnimationConstants() {
    }

    public final BezierControlPoints getDecelCurveSpec() {
        return decelCurveSpec;
    }
}
