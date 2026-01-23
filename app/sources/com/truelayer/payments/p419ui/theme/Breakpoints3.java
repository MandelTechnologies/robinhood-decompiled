package com.truelayer.payments.p419ui.theme;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Breakpoints.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/ui/theme/ContainerBreakpoint;", "", "width", "Landroidx/compose/ui/unit/Dp;", "(Ljava/lang/String;IF)V", "getWidth-D9Ej5fM", "()F", "F", "Small", "Medium", "Large", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.theme.ContainerBreakpoint, reason: use source file name */
/* loaded from: classes12.dex */
public final class Breakpoints3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Breakpoints3[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final float width;
    public static final Breakpoints3 Small = new Breakpoints3("Small", 0, C2002Dp.m7995constructorimpl(600));
    public static final Breakpoints3 Medium = new Breakpoints3("Medium", 1, C2002Dp.m7995constructorimpl(768));
    public static final Breakpoints3 Large = new Breakpoints3("Large", 2, C2002Dp.m7995constructorimpl(992));

    private static final /* synthetic */ Breakpoints3[] $values() {
        return new Breakpoints3[]{Small, Medium, Large};
    }

    public static EnumEntries<Breakpoints3> getEntries() {
        return $ENTRIES;
    }

    public static Breakpoints3 valueOf(String str) {
        return (Breakpoints3) Enum.valueOf(Breakpoints3.class, str);
    }

    public static Breakpoints3[] values() {
        return (Breakpoints3[]) $VALUES.clone();
    }

    private Breakpoints3(String str, int i, float f) {
        this.width = f;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    static {
        Breakpoints3[] breakpoints3Arr$values = $values();
        $VALUES = breakpoints3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(breakpoints3Arr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Breakpoints.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/ui/theme/ContainerBreakpoint$Companion;", "", "()V", "fromDp", "Lcom/truelayer/payments/ui/theme/ContainerBreakpoint;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "fromDp-0680j_4", "(F)Lcom/truelayer/payments/ui/theme/ContainerBreakpoint;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.theme.ContainerBreakpoint$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: fromDp-0680j_4, reason: not valid java name */
        public final Breakpoints3 m27163fromDp0680j_4(float minWidth) {
            Breakpoints3 breakpoints3 = Breakpoints3.Small;
            if (C2002Dp.m7994compareTo0680j_4(minWidth, breakpoints3.getWidth()) < 0) {
                return breakpoints3;
            }
            Breakpoints3 breakpoints32 = Breakpoints3.Medium;
            return (C2002Dp.m7994compareTo0680j_4(minWidth, breakpoints32.getWidth()) < 0 || C2002Dp.m7994compareTo0680j_4(minWidth, Breakpoints3.Large.getWidth()) >= 0) ? Breakpoints3.Large : breakpoints32;
        }
    }
}
