package com.robinhood.android.advisory.returns;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/BarHeight;", "", "<init>", "(Ljava/lang/String;I)V", "SHORT", "MEDIUM", "TALL", "Companion", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.returns.BarHeight, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsChart3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReturnsChart3[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ReturnsChart3 SHORT = new ReturnsChart3("SHORT", 0);
    public static final ReturnsChart3 MEDIUM = new ReturnsChart3("MEDIUM", 1);
    public static final ReturnsChart3 TALL = new ReturnsChart3("TALL", 2);

    private static final /* synthetic */ ReturnsChart3[] $values() {
        return new ReturnsChart3[]{SHORT, MEDIUM, TALL};
    }

    public static EnumEntries<ReturnsChart3> getEntries() {
        return $ENTRIES;
    }

    private ReturnsChart3(String str, int i) {
    }

    static {
        ReturnsChart3[] returnsChart3Arr$values = $values();
        $VALUES = returnsChart3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(returnsChart3Arr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/BarHeight$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/advisory/returns/BarHeight;", "valueRatio", "", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.returns.BarHeight$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ReturnsChart3 from(float valueRatio) {
            if (valueRatio < 0.2f) {
                return ReturnsChart3.SHORT;
            }
            if (valueRatio < 0.5f) {
                return ReturnsChart3.MEDIUM;
            }
            return ReturnsChart3.TALL;
        }
    }

    public static ReturnsChart3 valueOf(String str) {
        return (ReturnsChart3) Enum.valueOf(ReturnsChart3.class, str);
    }

    public static ReturnsChart3[] values() {
        return (ReturnsChart3[]) $VALUES.clone();
    }
}
