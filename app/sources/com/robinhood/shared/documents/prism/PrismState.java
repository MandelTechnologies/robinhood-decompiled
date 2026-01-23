package com.robinhood.shared.documents.prism;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrismState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismState;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "DARK_ENVIRONMENT", "FACE_NOT_DETECTED", "FACE_NOT_STRAIGHT", "FACE_TOO_CLOSE", "FACE_TOO_FAR", "MULTIPLE_FACES_DETECTED", "FACE_SCANNING", "GLARE_DETECTED", "BLUR_DETECTED", "INSUFFICIENT_MOTION", "PROCESSING", "SUCCESS", "FAILURE", "ERROR", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PrismState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrismState[] $VALUES;
    public static final PrismState STARTED = new PrismState("STARTED", 0);
    public static final PrismState DARK_ENVIRONMENT = new PrismState("DARK_ENVIRONMENT", 1);
    public static final PrismState FACE_NOT_DETECTED = new PrismState("FACE_NOT_DETECTED", 2);
    public static final PrismState FACE_NOT_STRAIGHT = new PrismState("FACE_NOT_STRAIGHT", 3);
    public static final PrismState FACE_TOO_CLOSE = new PrismState("FACE_TOO_CLOSE", 4);
    public static final PrismState FACE_TOO_FAR = new PrismState("FACE_TOO_FAR", 5);
    public static final PrismState MULTIPLE_FACES_DETECTED = new PrismState("MULTIPLE_FACES_DETECTED", 6);
    public static final PrismState FACE_SCANNING = new PrismState("FACE_SCANNING", 7);
    public static final PrismState GLARE_DETECTED = new PrismState("GLARE_DETECTED", 8);
    public static final PrismState BLUR_DETECTED = new PrismState("BLUR_DETECTED", 9);
    public static final PrismState INSUFFICIENT_MOTION = new PrismState("INSUFFICIENT_MOTION", 10);
    public static final PrismState PROCESSING = new PrismState("PROCESSING", 11);
    public static final PrismState SUCCESS = new PrismState("SUCCESS", 12);
    public static final PrismState FAILURE = new PrismState("FAILURE", 13);
    public static final PrismState ERROR = new PrismState("ERROR", 14);

    private static final /* synthetic */ PrismState[] $values() {
        return new PrismState[]{STARTED, DARK_ENVIRONMENT, FACE_NOT_DETECTED, FACE_NOT_STRAIGHT, FACE_TOO_CLOSE, FACE_TOO_FAR, MULTIPLE_FACES_DETECTED, FACE_SCANNING, GLARE_DETECTED, BLUR_DETECTED, INSUFFICIENT_MOTION, PROCESSING, SUCCESS, FAILURE, ERROR};
    }

    public static EnumEntries<PrismState> getEntries() {
        return $ENTRIES;
    }

    private PrismState(String str, int i) {
    }

    static {
        PrismState[] prismStateArr$values = $values();
        $VALUES = prismStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(prismStateArr$values);
    }

    public static PrismState valueOf(String str) {
        return (PrismState) Enum.valueOf(PrismState.class, str);
    }

    public static PrismState[] values() {
        return (PrismState[]) $VALUES.clone();
    }
}
