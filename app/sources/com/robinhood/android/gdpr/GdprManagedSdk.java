package com.robinhood.android.gdpr;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: GdprManagedSdk.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/gdpr/GdprManagedSdk;", "", "name", "", "getName", "()Ljava/lang/String;", "consentCategory", "Lcom/robinhood/android/gdpr/GdprConsentCategory;", "getConsentCategory", "()Lcom/robinhood/android/gdpr/GdprConsentCategory;", "onAppInitialized", "", "app", "Landroid/app/Application;", "updateConsentStatus", "isEnabled", "", "lib-gdpr_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface GdprManagedSdk {
    GdprConsentCategory getConsentCategory();

    String getName();

    void onAppInitialized(Application app);

    void updateConsentStatus(boolean isEnabled);
}
