package com.robinhood.android.mcw.fxswitcher.ftux.constants;

import kotlin.Metadata;

/* compiled from: FxSwitcherAnimationConstants.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/mcw/fxswitcher/ftux/constants/FxSwitcherAnimationConstants;", "", "<init>", "()V", "outroDuration", "", "introDelay", "introDuration", "introCurveSpec", "Lcom/robinhood/android/mcw/fxswitcher/ftux/constants/BezierControlPoints;", "getIntroCurveSpec", "()Lcom/robinhood/android/mcw/fxswitcher/ftux/constants/BezierControlPoints;", "lib-fx-switcher-ftux-constants_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class FxSwitcherAnimationConstants {
    public static final int $stable = 0;
    public static final FxSwitcherAnimationConstants INSTANCE = new FxSwitcherAnimationConstants();
    private static final BezierControlPoints introCurveSpec = new BezierControlPoints(1.0f, 0.0f, 0.0f, 1.0f);
    public static final int introDelay = 225;
    public static final int introDuration = 600;
    public static final int outroDuration = 300;

    private FxSwitcherAnimationConstants() {
    }

    public final BezierControlPoints getIntroCurveSpec() {
        return introCurveSpec;
    }
}
