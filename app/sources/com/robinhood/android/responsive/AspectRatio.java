package com.robinhood.android.responsive;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;

/* compiled from: AspectRatio.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/responsive/AspectRatio;", "", "<init>", "()V", "HDTV", "", "ComputerMonitor", "Cinematic", "UltraPanavision70", "Polyvision", "heroImage", "getHeroImage", "(Landroidx/compose/runtime/Composer;I)F", "lib-responsive_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AspectRatio {
    public static final int $stable = 0;
    private static final float Cinematic = 2.3333333f;
    private static final float ComputerMonitor = 1.6f;
    public static final float HDTV = 1.7777778f;
    public static final AspectRatio INSTANCE = new AspectRatio();
    public static final float Polyvision = 4.0f;
    public static final float UltraPanavision70 = 2.76f;

    /* compiled from: AspectRatio.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WindowSize.values().length];
            try {
                iArr[WindowSize.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowSize.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AspectRatio() {
    }

    @JvmName
    public final float getHeroImage(Composer composer, int i) {
        float f;
        composer.startReplaceGroup(1578482583);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1578482583, i, -1, "com.robinhood.android.responsive.AspectRatio.<get-heroImage> (AspectRatio.kt:18)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer, 6).ordinal()];
        if (i2 == 1) {
            f = ComputerMonitor;
        } else if (i2 == 2) {
            f = Cinematic;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = 2.76f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return f;
    }
}
