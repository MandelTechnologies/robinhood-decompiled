package com.robinhood.android.camera.process;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessPhotoException.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/camera/process/ProcessPhotoException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "message", "", "(Ljava/lang/String;)V", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ProcessPhotoException extends Exception {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessPhotoException(Throwable throwable) {
        super(throwable);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessPhotoException(String message) {
        this(new Throwable(message));
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
