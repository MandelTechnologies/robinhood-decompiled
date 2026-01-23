package com.withpersona.sdk2.inquiry.selfie;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelfieHintPose.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieHintPose;", "", "<init>", "(Ljava/lang/String;I)V", "Center", "Left", "Right", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelfieHintPose {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelfieHintPose[] $VALUES;
    public static final SelfieHintPose Center = new SelfieHintPose("Center", 0);
    public static final SelfieHintPose Left = new SelfieHintPose("Left", 1);
    public static final SelfieHintPose Right = new SelfieHintPose("Right", 2);

    private static final /* synthetic */ SelfieHintPose[] $values() {
        return new SelfieHintPose[]{Center, Left, Right};
    }

    public static EnumEntries<SelfieHintPose> getEntries() {
        return $ENTRIES;
    }

    private SelfieHintPose(String str, int i) {
    }

    static {
        SelfieHintPose[] selfieHintPoseArr$values = $values();
        $VALUES = selfieHintPoseArr$values;
        $ENTRIES = EnumEntries2.enumEntries(selfieHintPoseArr$values);
    }

    public static SelfieHintPose valueOf(String str) {
        return (SelfieHintPose) Enum.valueOf(SelfieHintPose.class, str);
    }

    public static SelfieHintPose[] values() {
        return (SelfieHintPose[]) $VALUES.clone();
    }
}
