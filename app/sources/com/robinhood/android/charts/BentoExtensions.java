package com.robinhood.android.charts;

import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"overlay", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getOverlay", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;)Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.BentoExtensionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BentoExtensions {

    /* compiled from: BentoExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.charts.BentoExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DirectionOverlay getOverlay(Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return DirectionOverlay.POSITIVE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return DirectionOverlay.NEGATIVE;
    }
}
