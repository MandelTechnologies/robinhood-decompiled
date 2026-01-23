package com.robinhood.android.charts.overlay;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Overlays.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/charts/overlay/ChartOverlay;", "", "Lcom/robinhood/android/charts/overlay/OverlayPosition;", "position", "", "coerceXInBounds", "coerceYInBounds", "Lkotlin/Function0;", "", "content", "<init>", "(Lcom/robinhood/android/charts/overlay/OverlayPosition;ZZLkotlin/jvm/functions/Function2;)V", "Lcom/robinhood/android/charts/overlay/OverlayPosition;", "getPosition", "()Lcom/robinhood/android/charts/overlay/OverlayPosition;", "Z", "getCoerceXInBounds", "()Z", "getCoerceYInBounds", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.overlay.ChartOverlay, reason: use source file name */
/* loaded from: classes7.dex */
public final class Overlays {
    public static final int $stable = 0;
    private final boolean coerceXInBounds;
    private final boolean coerceYInBounds;
    private final Function2<Composer, Integer, Unit> content;
    private final OverlayPosition position;

    /* JADX WARN: Multi-variable type inference failed */
    public Overlays(OverlayPosition position, boolean z, boolean z2, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(content, "content");
        this.position = position;
        this.coerceXInBounds = z;
        this.coerceYInBounds = z2;
        this.content = content;
    }

    public /* synthetic */ Overlays(OverlayPosition overlayPosition, boolean z, boolean z2, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(overlayPosition, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, function2);
    }

    public final OverlayPosition getPosition() {
        return this.position;
    }

    public final boolean getCoerceXInBounds() {
        return this.coerceXInBounds;
    }

    public final boolean getCoerceYInBounds() {
        return this.coerceYInBounds;
    }

    public final Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }
}
