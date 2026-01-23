package com.withpersona.sdk2.camera.selfie;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelfieError.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/selfie/SelfieError;", "", "<init>", "(Ljava/lang/String;I)V", "FaceNotCentered", "FaceTooClose", "FaceTooFar", "MultipleFaces", "IncompleteFace", "FaceNotFound", "IncorrectPose", "FaceDetectionUnsupported", "Other", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SelfieError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelfieError[] $VALUES;
    public static final SelfieError FaceNotCentered = new SelfieError("FaceNotCentered", 0);
    public static final SelfieError FaceTooClose = new SelfieError("FaceTooClose", 1);
    public static final SelfieError FaceTooFar = new SelfieError("FaceTooFar", 2);
    public static final SelfieError MultipleFaces = new SelfieError("MultipleFaces", 3);
    public static final SelfieError IncompleteFace = new SelfieError("IncompleteFace", 4);
    public static final SelfieError FaceNotFound = new SelfieError("FaceNotFound", 5);
    public static final SelfieError IncorrectPose = new SelfieError("IncorrectPose", 6);
    public static final SelfieError FaceDetectionUnsupported = new SelfieError("FaceDetectionUnsupported", 7);
    public static final SelfieError Other = new SelfieError("Other", 8);

    private static final /* synthetic */ SelfieError[] $values() {
        return new SelfieError[]{FaceNotCentered, FaceTooClose, FaceTooFar, MultipleFaces, IncompleteFace, FaceNotFound, IncorrectPose, FaceDetectionUnsupported, Other};
    }

    public static EnumEntries<SelfieError> getEntries() {
        return $ENTRIES;
    }

    private SelfieError(String str, int i) {
    }

    static {
        SelfieError[] selfieErrorArr$values = $values();
        $VALUES = selfieErrorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(selfieErrorArr$values);
    }

    public static SelfieError valueOf(String str) {
        return (SelfieError) Enum.valueOf(SelfieError.class, str);
    }

    public static SelfieError[] values() {
        return (SelfieError[]) $VALUES.clone();
    }
}
