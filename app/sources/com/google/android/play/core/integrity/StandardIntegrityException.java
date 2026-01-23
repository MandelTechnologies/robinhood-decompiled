package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C5150b;
import java.util.Locale;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes27.dex */
public class StandardIntegrityException extends ApiException {

    /* renamed from: a */
    private final Throwable f680a;

    StandardIntegrityException(int i, Throwable th) {
        super(new Status(i, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i), C5150b.m905a(i))));
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f680a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f680a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
