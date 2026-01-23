package com.robinhood.android.common.util.p090rx;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.time.android.format.DurationFormatter;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.Throwables;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import p479j$.time.Duration;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: ContextErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0014J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\rH\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\rH\u0014J\b\u0010 \u001a\u00020\rH\u0016R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00040\u00040\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\rX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/ContextErrorHandler;", "T", "Lcom/robinhood/android/util/rx/AbsErrorHandler;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "contextRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getContextRef", "()Ljava/lang/ref/WeakReference;", "name", "", "noConnection", "genericError", "downtimeError", "genericNonNetworkError", "getGenericNonNetworkError", "()Ljava/lang/String;", "handleConnectivityError", "", "handleTopLevelError", "message", "handleDetailedError", "handleUnknownHttpError", "throwable", "", "handleUnknownError", "showShortError", "", "showLongError", "toString", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class ContextErrorHandler<T> extends AbsErrorHandler<T> {
    private final WeakReference<Context> contextRef;
    private final String downtimeError;
    private final String genericError;
    private final String genericNonNetworkError;
    private final String name;
    private final String noConnection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ContextErrorHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.contextRef = new WeakReference<>(context);
        this.name = getClass().getSimpleName() + "(" + context.getClass().getSimpleName() + ")";
        String string2 = context.getString(C11048R.string.general_error_no_connection);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.noConnection = string2;
        String string3 = context.getString(C11048R.string.general_error_summary);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        this.genericError = string3;
        String string4 = context.getString(C11048R.string.general_error_downtime);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        this.downtimeError = string4;
        String string5 = context.getString(C11048R.string.error_description_something_went_wrong);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        this.genericNonNetworkError = string5;
    }

    protected final WeakReference<Context> getContextRef() {
        return this.contextRef;
    }

    protected final String getGenericNonNetworkError() {
        return this.genericNonNetworkError;
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    protected boolean handleConnectivityError() {
        showShortError(this.noConnection);
        return true;
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    protected boolean handleTopLevelError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        showShortError(message);
        return true;
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    protected boolean handleDetailedError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        showLongError(message);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean handleUnknownHttpError(Throwable throwable) throws Resources.NotFoundException {
        String string2;
        Headers headers;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        HttpException httpException = (HttpException) Throwables.findCause(throwable, HttpException.class);
        if (httpException == null) {
            return false;
        }
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if (errorResponseExtractErrorResponse != null && (string2 = errorResponseExtractErrorResponse.getDisplayMessage()) != null) {
            if (StringsKt.isBlank(string2)) {
                string2 = this.genericError;
            }
            if (string2 == null) {
            }
        } else {
            string2 = this.genericError;
        }
        int iCode = httpException.code();
        if (iCode == 429) {
            Context context = this.contextRef.get();
            Response<?> response = httpException.response();
            String str = (response == null || (headers = response.headers()) == null) ? null : headers.get(com.robinhood.utils.http.Headers.RETRY_AFTER);
            if (str != null && context != null) {
                try {
                    Duration durationOfSeconds = Duration.ofSeconds(Long.parseLong(str));
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNull(durationOfSeconds);
                    string2 = resources.getString(C11048R.string.general_error_too_many_requests, DurationFormatter.formatWide(durationOfSeconds));
                } catch (NumberFormatException unused) {
                }
                Intrinsics.checkNotNull(string2);
            }
        } else if (iCode == 521) {
            string2 = this.downtimeError;
        }
        showLongError(string2);
        return true;
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    protected boolean handleUnknownError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        showLongError(this.genericNonNetworkError);
        return true;
    }

    protected void showShortError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Context context = this.contextRef.get();
        if (context != null) {
            ContextsUiExtensions.showShortToast(context, message);
        }
    }

    protected void showLongError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Context context = this.contextRef.get();
        if (context != null) {
            ContextsUiExtensions.showLongToast(context, message);
        }
    }

    /* renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* compiled from: ContextErrorHandler.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/ContextErrorHandler$Companion;", "", "<init>", "()V", "handle", "", "context", "Landroid/content/Context;", "throwable", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void handle(Context context, Throwable throwable) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (!AbsErrorHandler.handleError$default(new ContextErrorHandler(context), throwable, false, 2, null)) {
                throw new RuntimeException(throwable);
            }
        }
    }
}
