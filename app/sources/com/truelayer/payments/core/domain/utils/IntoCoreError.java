package com.truelayer.payments.core.domain.utils;

import com.truelayer.payments.core.domain.errors.CoreError;
import kotlin.Metadata;

/* compiled from: IntoCoreError.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/utils/IntoCoreError;", "", "intoCoreError", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "IntoHttpError", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface IntoCoreError {

    /* compiled from: IntoCoreError.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/utils/IntoCoreError$IntoHttpError;", "", "intoCoreHttpError", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError;", "httpStatusCode", "", "responseBody", "", "traceId", "autoRetry", "endpoint", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface IntoHttpError {
        CoreError.HttpError intoCoreHttpError(int httpStatusCode, String responseBody, String traceId, int autoRetry, String endpoint);
    }

    CoreError intoCoreError();
}
