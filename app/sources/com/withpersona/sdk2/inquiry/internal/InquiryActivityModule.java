package com.withpersona.sdk2.inquiry.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Window;
import coil.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryActivityModule.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryActivityModule;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "context", "Landroid/content/Context;", "application", "Landroid/app/Application;", "window", "Landroid/view/Window;", "imageLoader", "Lcoil/ImageLoader;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InquiryActivityModule {
    private final Activity activity;

    public InquiryActivityModule(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    public final Context context() {
        Context applicationContext = this.activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public final Application application() {
        Application application = this.activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return application;
    }

    public final Window window() {
        Window window = this.activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        return window;
    }

    public final ImageLoader imageLoader(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ImageLoader.Builder(context).crossfade(true).diskCache(null).build();
    }
}
