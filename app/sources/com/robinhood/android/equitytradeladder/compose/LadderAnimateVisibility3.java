package com.robinhood.android.equitytradeladder.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderAnimateVisibility.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/compose/LadderAnimateVisibilityScope;", "", "onDismissed", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "dismiss", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.compose.LadderAnimateVisibilityScope, reason: use source file name */
/* loaded from: classes3.dex */
public final class LadderAnimateVisibility3 {
    public static final int $stable = 0;
    private final Function0<Unit> onDismissed;

    public LadderAnimateVisibility3(Function0<Unit> onDismissed) {
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        this.onDismissed = onDismissed;
    }

    public final void dismiss() {
        this.onDismissed.invoke();
    }
}
