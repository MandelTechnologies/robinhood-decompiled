package com.google.maps.android.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraMoveStartedReason.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "NO_MOVEMENT_YET", "GESTURE", "API_ANIMATION", "DEVELOPER_ANIMATION", "Companion", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class CameraMoveStartedReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraMoveStartedReason[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final CameraMoveStartedReason UNKNOWN = new CameraMoveStartedReason("UNKNOWN", 0, -2);
    public static final CameraMoveStartedReason NO_MOVEMENT_YET = new CameraMoveStartedReason("NO_MOVEMENT_YET", 1, -1);
    public static final CameraMoveStartedReason GESTURE = new CameraMoveStartedReason("GESTURE", 2, 1);
    public static final CameraMoveStartedReason API_ANIMATION = new CameraMoveStartedReason("API_ANIMATION", 3, 2);
    public static final CameraMoveStartedReason DEVELOPER_ANIMATION = new CameraMoveStartedReason("DEVELOPER_ANIMATION", 4, 3);

    private static final /* synthetic */ CameraMoveStartedReason[] $values() {
        return new CameraMoveStartedReason[]{UNKNOWN, NO_MOVEMENT_YET, GESTURE, API_ANIMATION, DEVELOPER_ANIMATION};
    }

    public static EnumEntries<CameraMoveStartedReason> getEntries() {
        return $ENTRIES;
    }

    public static CameraMoveStartedReason valueOf(String str) {
        return (CameraMoveStartedReason) Enum.valueOf(CameraMoveStartedReason.class, str);
    }

    public static CameraMoveStartedReason[] values() {
        return (CameraMoveStartedReason[]) $VALUES.clone();
    }

    private CameraMoveStartedReason(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CameraMoveStartedReason[] cameraMoveStartedReasonArr$values = $values();
        $VALUES = cameraMoveStartedReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cameraMoveStartedReasonArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CameraMoveStartedReason.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/google/maps/android/compose/CameraMoveStartedReason$Companion;", "", "()V", "fromInt", "Lcom/google/maps/android/compose/CameraMoveStartedReason;", "value", "", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CameraMoveStartedReason fromInt(int value) {
            CameraMoveStartedReason cameraMoveStartedReason;
            CameraMoveStartedReason[] cameraMoveStartedReasonArrValues = CameraMoveStartedReason.values();
            int length = cameraMoveStartedReasonArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cameraMoveStartedReason = null;
                    break;
                }
                cameraMoveStartedReason = cameraMoveStartedReasonArrValues[i];
                if (cameraMoveStartedReason.getValue() == value) {
                    break;
                }
                i++;
            }
            return cameraMoveStartedReason == null ? CameraMoveStartedReason.UNKNOWN : cameraMoveStartedReason;
        }
    }
}
