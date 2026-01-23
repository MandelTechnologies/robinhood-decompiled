package com.robinhood.android.gdpr;

import kotlin.Metadata;

/* compiled from: GdprConsentStatus.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toConsentStatus", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "", "lib-gdpr_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gdpr.GdprConsentStatusKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GdprConsentStatus2 {
    public static final GdprConsentStatus toConsentStatus(boolean z) {
        return z ? GdprConsentStatus.GRANTED : GdprConsentStatus.REJECTED;
    }
}
