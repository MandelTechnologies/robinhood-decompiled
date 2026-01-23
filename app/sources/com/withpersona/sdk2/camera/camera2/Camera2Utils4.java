package com.withpersona.sdk2.camera.camera2;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Camera2Utils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/CameraDirection;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "EXTERNAL", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.camera2.CameraDirection, reason: use source file name */
/* loaded from: classes26.dex */
public final class Camera2Utils4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Camera2Utils4[] $VALUES;
    public static final Camera2Utils4 FRONT = new Camera2Utils4("FRONT", 0);
    public static final Camera2Utils4 BACK = new Camera2Utils4("BACK", 1);
    public static final Camera2Utils4 EXTERNAL = new Camera2Utils4("EXTERNAL", 2);

    private static final /* synthetic */ Camera2Utils4[] $values() {
        return new Camera2Utils4[]{FRONT, BACK, EXTERNAL};
    }

    public static EnumEntries<Camera2Utils4> getEntries() {
        return $ENTRIES;
    }

    private Camera2Utils4(String str, int i) {
    }

    static {
        Camera2Utils4[] camera2Utils4Arr$values = $values();
        $VALUES = camera2Utils4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(camera2Utils4Arr$values);
    }

    public static Camera2Utils4 valueOf(String str) {
        return (Camera2Utils4) Enum.valueOf(Camera2Utils4.class, str);
    }

    public static Camera2Utils4[] values() {
        return (Camera2Utils4[]) $VALUES.clone();
    }
}
