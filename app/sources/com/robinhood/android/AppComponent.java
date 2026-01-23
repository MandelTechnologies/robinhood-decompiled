package com.robinhood.android;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;

/* compiled from: AppComponent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/AppComponent;", "", "Factory", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface AppComponent {

    /* compiled from: AppComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/AppComponent$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/AppComponent;", "application", "Landroid/app/Application;", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory {
        AppComponent create(Application application);
    }
}
