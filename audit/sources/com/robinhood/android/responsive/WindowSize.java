package com.robinhood.android.responsive;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WindowSize.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/responsive/WindowSize;", "", "<init>", "(Ljava/lang/String;I)V", "Compact", "Medium", "Expanded", "Companion", "lib-responsive_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class WindowSize {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WindowSize[] $VALUES;
    private static final float CompactWidth;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final WindowSize Compact = new WindowSize("Compact", 0);
    public static final WindowSize Medium = new WindowSize("Medium", 1);
    public static final WindowSize Expanded = new WindowSize("Expanded", 2);

    private static final /* synthetic */ WindowSize[] $values() {
        return new WindowSize[]{Compact, Medium, Expanded};
    }

    public static EnumEntries<WindowSize> getEntries() {
        return $ENTRIES;
    }

    private WindowSize(String str, int i) {
    }

    static {
        WindowSize[] windowSizeArr$values = $values();
        $VALUES = windowSizeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(windowSizeArr$values);
        INSTANCE = new Companion(null);
        CompactWidth = C2002Dp.m7995constructorimpl(600);
    }

    /* compiled from: WindowSize.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/responsive/WindowSize$Companion;", "", "<init>", "()V", "CompactWidth", "Landroidx/compose/ui/unit/Dp;", "F", "currentWidth", "Lcom/robinhood/android/responsive/WindowSize;", "getCurrentWidth", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/responsive/WindowSize;", "currentHeight", "getCurrentHeight", "activity", "Landroid/app/Activity;", "windowSizeFromWidthDp", "widthDp", "windowSizeFromWidthDp-0680j_4", "(F)Lcom/robinhood/android/responsive/WindowSize;", "lib-responsive_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmName
        public final WindowSize getCurrentWidth(Composer composer, int i) {
            composer.startReplaceGroup(186156436);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(186156436, i, -1, "com.robinhood.android.responsive.WindowSize.Companion.<get-currentWidth> (WindowSize.kt:35)");
            }
            WindowSize windowSizeM18096windowSizeFromWidthDp0680j_4 = m18096windowSizeFromWidthDp0680j_4(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return windowSizeM18096windowSizeFromWidthDp0680j_4;
        }

        @JvmName
        public final WindowSize getCurrentHeight(Composer composer, int i) {
            WindowSize windowSize;
            composer.startReplaceGroup(1134022378);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1134022378, i, -1, "com.robinhood.android.responsive.WindowSize.Companion.<get-currentHeight> (WindowSize.kt:44)");
            }
            float fMo5013toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
            if (C2002Dp.m7994compareTo0680j_4(fMo5013toDpu2uoSUM, C2002Dp.m7995constructorimpl(480)) < 0) {
                windowSize = WindowSize.Compact;
            } else {
                windowSize = C2002Dp.m7994compareTo0680j_4(fMo5013toDpu2uoSUM, C2002Dp.m7995constructorimpl((float) 900)) < 0 ? WindowSize.Medium : WindowSize.Expanded;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return windowSize;
        }

        public final WindowSize currentWidth(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return m18096windowSizeFromWidthDp0680j_4(C2002Dp.m7995constructorimpl(displayMetrics.widthPixels / displayMetrics.density));
        }

        /* renamed from: windowSizeFromWidthDp-0680j_4, reason: not valid java name */
        private final WindowSize m18096windowSizeFromWidthDp0680j_4(float widthDp) {
            return C2002Dp.m7994compareTo0680j_4(widthDp, WindowSize.CompactWidth) < 0 ? WindowSize.Compact : C2002Dp.m7994compareTo0680j_4(widthDp, C2002Dp.m7995constructorimpl((float) 840)) < 0 ? WindowSize.Medium : WindowSize.Expanded;
        }
    }

    public static WindowSize valueOf(String str) {
        return (WindowSize) Enum.valueOf(WindowSize.class, str);
    }

    public static WindowSize[] values() {
        return (WindowSize[]) $VALUES.clone();
    }
}
