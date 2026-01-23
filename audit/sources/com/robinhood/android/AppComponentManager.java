package com.robinhood.android;

import android.app.Application;
import com.robinhood.hammer.core.internal.AbstractComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/AppComponentManager;", "Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "Lcom/robinhood/android/AppComponent;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "createComponent", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AppComponentManager extends AbstractComponentManager<AppComponent> {
    private final Application application;

    public AppComponentManager(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.hammer.core.internal.AbstractComponentManager
    public AppComponent createComponent() {
        return MergedAppComponent2.factory().create(this.application);
    }
}
