package com.robinhood.utils.p408rx;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.core.content.ContextCompat;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.HttpUrl2;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: DownloadManagerOnSubscribe.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/rx/DownloadManagerOnSubscribe;", "Lio/reactivex/SingleOnSubscribe;", "Ljava/io/File;", "context", "Landroid/content/Context;", "downloadUrl", "Lokhttp3/HttpUrl;", "destinationFile", "showNotification", "", "<init>", "(Landroid/content/Context;Lokhttp3/HttpUrl;Ljava/io/File;Z)V", "subscribe", "", "emitter", "Lio/reactivex/SingleEmitter;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DownloadManagerOnSubscribe implements SingleOnSubscribe<File> {
    private final Context context;
    private final File destinationFile;
    private final HttpUrl downloadUrl;
    private final boolean showNotification;

    public DownloadManagerOnSubscribe(Context context, HttpUrl downloadUrl, File destinationFile, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(destinationFile, "destinationFile");
        this.context = context;
        this.downloadUrl = downloadUrl;
        this.destinationFile = destinationFile;
        this.showNotification = z;
    }

    public /* synthetic */ DownloadManagerOnSubscribe(Context context, HttpUrl httpUrl, File file, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, httpUrl, file, (i & 8) != 0 ? true : z);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.BroadcastReceiver, com.robinhood.utils.rx.DownloadManagerOnSubscribe$subscribe$receiver$1] */
    @Override // io.reactivex.SingleOnSubscribe
    public void subscribe(final SingleEmitter<File> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        final long jEnqueue = ContextSystemServices.getDownloadManager(this.context).enqueue(new DownloadManager.Request(HttpUrl2.toAndroidUri(this.downloadUrl)).setDestinationUri(Uri.fromFile(this.destinationFile)).setNotificationVisibility(this.showNotification ? 0 : 2));
        final ?? r3 = new BroadcastReceiver() { // from class: com.robinhood.utils.rx.DownloadManagerOnSubscribe$subscribe$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.areEqual("android.intent.action.DOWNLOAD_COMPLETE", intent.getAction()) && intent.getLongExtra("extra_download_id", 0L) == jEnqueue) {
                    emitter.onSuccess(this.destinationFile);
                }
            }
        };
        ContextCompat.registerReceiver(this.context, r3, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        emitter.setCancellable(new Cancellable() { // from class: com.robinhood.utils.rx.DownloadManagerOnSubscribe.subscribe.1
            @Override // io.reactivex.functions.Cancellable
            public final void cancel() {
                DownloadManagerOnSubscribe.this.context.unregisterReceiver(r3);
            }
        });
    }
}
