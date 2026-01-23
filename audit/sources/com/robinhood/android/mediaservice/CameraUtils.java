package com.robinhood.android.mediaservice;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.FilesKt;

/* compiled from: CameraUtils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/mediaservice/CameraUtils;", "", "<init>", "()V", "getCameraIntent", "Landroid/content/Intent;", "outputFileUri", "Landroid/net/Uri;", "createCameraImageUri", "context", "Landroid/content/Context;", "directoryName", "", "clearCameraImageDirectory", "Lio/reactivex/Completable;", "lib-media-service_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CameraUtils {
    public static final int $stable = 0;

    public final Intent getCameraIntent(Uri outputFileUri) {
        Intrinsics.checkNotNullParameter(outputFileUri, "outputFileUri");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", outputFileUri);
        return intent;
    }

    public final Uri createCameraImageUri(Context context, String directoryName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(directoryName, "directoryName");
        try {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), directoryName);
            file.mkdirs();
            return Files.toFileProviderUri$default(new File(file, "camera_" + new SimpleDateFormat(context.getString(C21792R.string.camera_file_timestamp_format), Locale.US).format(new Date()) + ".jpg"), context, null, 2, null);
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            return null;
        }
    }

    public final Completable clearCameraImageDirectory(final Context context, final String directoryName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(directoryName, "directoryName");
        Completable completableSubscribeOn = Completable.fromAction(new Action() { // from class: com.robinhood.android.mediaservice.CameraUtils.clearCameraImageDirectory.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                try {
                    FilesKt.deleteRecursively(new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), directoryName));
                } catch (Exception e) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                }
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        return completableSubscribeOn;
    }
}
