package com.withpersona.sdk2.camera.video;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCaptureMethod.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Stream", "Upload", "None", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class VideoCaptureMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoCaptureMethod[] $VALUES;
    public static final VideoCaptureMethod Stream = new VideoCaptureMethod("Stream", 0);
    public static final VideoCaptureMethod Upload = new VideoCaptureMethod("Upload", 1);
    public static final VideoCaptureMethod None = new VideoCaptureMethod("None", 2);

    private static final /* synthetic */ VideoCaptureMethod[] $values() {
        return new VideoCaptureMethod[]{Stream, Upload, None};
    }

    public static EnumEntries<VideoCaptureMethod> getEntries() {
        return $ENTRIES;
    }

    private VideoCaptureMethod(String str, int i) {
    }

    static {
        VideoCaptureMethod[] videoCaptureMethodArr$values = $values();
        $VALUES = videoCaptureMethodArr$values;
        $ENTRIES = EnumEntries2.enumEntries(videoCaptureMethodArr$values);
    }

    public static VideoCaptureMethod valueOf(String str) {
        return (VideoCaptureMethod) Enum.valueOf(VideoCaptureMethod.class, str);
    }

    public static VideoCaptureMethod[] values() {
        return (VideoCaptureMethod[]) $VALUES.clone();
    }
}
