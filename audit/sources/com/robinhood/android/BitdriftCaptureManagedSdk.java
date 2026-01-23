package com.robinhood.android;

import android.app.Application;
import android.content.Context;
import com.robinhood.android.gdpr.GdprConsentCategory;
import com.robinhood.android.gdpr.GdprManagedSdk;
import com.robinhood.shared.bitdrift.BitdriftCapture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BitdriftCaptureManagedSdk.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/BitdriftCaptureManagedSdk;", "Lcom/robinhood/android/gdpr/GdprManagedSdk;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "name", "", "getName", "()Ljava/lang/String;", "consentCategory", "Lcom/robinhood/android/gdpr/GdprConsentCategory;", "getConsentCategory", "()Lcom/robinhood/android/gdpr/GdprConsentCategory;", "onAppInitialized", "", "app", "Landroid/app/Application;", "updateConsentStatus", "isEnabled", "", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class BitdriftCaptureManagedSdk implements GdprManagedSdk {
    private final Context context;

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public void onAppInitialized(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
    }

    public BitdriftCaptureManagedSdk(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public String getName() {
        return "Bitdrift Capture";
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public GdprConsentCategory getConsentCategory() {
        return GdprConsentCategory.PERFORMANCE;
    }

    @Override // com.robinhood.android.gdpr.GdprManagedSdk
    public void updateConsentStatus(boolean isEnabled) {
        BitdriftCapture.INSTANCE.setEnabled(this.context, isEnabled);
    }
}
