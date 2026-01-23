package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C5149a;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes27.dex */
public class IntegrityServiceException extends ApiException {

    /* renamed from: a */
    private final Throwable f679a;

    IntegrityServiceException(int i, Throwable th) {
        super(new Status(i, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i), C5149a.m904a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f679a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f679a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
