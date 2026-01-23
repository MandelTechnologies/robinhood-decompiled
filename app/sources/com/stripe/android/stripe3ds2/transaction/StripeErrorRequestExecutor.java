package com.stripe.android.stripe3ds2.transaction;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: StripeErrorRequestExecutor.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "httpClient", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/transaction/HttpClient;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "executeAsync", "", "errorData", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Companion", "Factory", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class StripeErrorRequestExecutor implements ErrorRequestExecutor {
    private static final Companion Companion = new Companion(null);
    private final ErrorReporter errorReporter;
    private final HttpClient httpClient;
    private final CoroutineContext workContext;

    public StripeErrorRequestExecutor(HttpClient httpClient, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.httpClient = httpClient;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor
    public void executeAsync(ErrorData errorData) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(errorData.toJson$3ds2sdk_release().toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            this.errorReporter.reportError(new RuntimeException("Could not convert ErrorData to JSON.\n$" + errorData, thM28553exceptionOrNullimpl));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            objM28550constructorimpl = null;
        }
        String str = (String) objM28550constructorimpl;
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new StripeErrorRequestExecutor2(this, str, null), 3, null);
        }
    }

    /* compiled from: StripeErrorRequestExecutor.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "acsUrl", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ErrorRequestExecutor.Factory {
        private final CoroutineContext workContext;

        public Factory(CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.workContext = workContext;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor.Factory
        public ErrorRequestExecutor create(String acsUrl, ErrorReporter errorReporter) {
            Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            return new StripeErrorRequestExecutor(new StripeHttpClient(acsUrl, null, errorReporter, this.workContext, 2, null), errorReporter, Dispatchers.getIO());
        }
    }

    /* compiled from: StripeErrorRequestExecutor.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeErrorRequestExecutor$Companion;", "", "()V", "CONTENT_TYPE", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
