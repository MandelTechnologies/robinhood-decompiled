package com.robinhood.android.util.p275rx;

import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: AbsErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0011\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0010H$J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH$J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH$J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0003H$J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0003H$¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/util/rx/AbsErrorHandler;", "T", "Lio/reactivex/functions/Function;", "", "Lio/reactivex/Observable;", "Lio/reactivex/functions/Consumer;", "Lkotlin/Function1;", "", "<init>", "()V", "apply", "throwable", "accept", "invoke", "p1", "handleError", "", "t", "handleNonNetworkError", "extractErrorResponse", "Lcom/robinhood/models/api/ErrorResponse;", "handleErrorResponse", "errorResponse", "handleConnectivityError", "handleTopLevelError", "message", "", "handleDetailedError", "handleUnknownHttpError", "handleUnknownError", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AbsErrorHandler<T> implements Function<Throwable, Observable<T>>, Consumer<Throwable>, Function1<Throwable, Unit> {
    public static final int $stable = 0;

    protected abstract boolean handleConnectivityError();

    protected abstract boolean handleDetailedError(String message);

    protected abstract boolean handleTopLevelError(String message);

    protected abstract boolean handleUnknownError(Throwable throwable);

    protected abstract boolean handleUnknownHttpError(Throwable throwable);

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
        invoke2(th);
        return Unit.INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public Observable<T> apply(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (handleError$default(this, throwable, false, 2, null)) {
            Timber.INSTANCE.mo3350d("Handled throwable: %s - %s", throwable.getClass(), throwable.getMessage());
            Observable<T> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        Observable<T> observableError = Observable.error(throwable);
        Intrinsics.checkNotNullExpressionValue(observableError, "error(...)");
        return observableError;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!handleError$default(this, throwable, false, 2, null)) {
            throw throwable;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(Throwable p1) throws Throwable {
        Intrinsics.checkNotNullParameter(p1, "p1");
        if (!handleError$default(this, p1, false, 2, null)) {
            throw p1;
        }
    }

    public static /* synthetic */ boolean handleError$default(AbsErrorHandler absErrorHandler, Throwable th, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleError");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return absErrorHandler.handleError(th, z);
    }

    public boolean handleError(Throwable t, boolean handleNonNetworkError) {
        Intrinsics.checkNotNullParameter(t, "t");
        if (t instanceof CancellationException) {
            return true;
        }
        if (Throwables.isConnectivityException(t)) {
            return handleConnectivityError();
        }
        Integer httpStatusCode = Throwables.getHttpStatusCode(t);
        if (httpStatusCode != null && httpStatusCode.intValue() == 429) {
            return handleUnknownHttpError(t);
        }
        ErrorResponse errorResponseExtractErrorResponse = extractErrorResponse(t);
        if (errorResponseExtractErrorResponse != null && handleErrorResponse(errorResponseExtractErrorResponse)) {
            return true;
        }
        if (Throwables.isNetworkRelated(t)) {
            return handleUnknownHttpError(t);
        }
        if (handleNonNetworkError) {
            return handleUnknownError(t);
        }
        return false;
    }

    protected ErrorResponse extractErrorResponse(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        return NetworkThrowables.extractErrorResponse(t);
    }

    public boolean handleErrorResponse(ErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        String error = errorResponse.getError();
        String displayMessage = errorResponse.getDisplayMessage();
        if (error != null) {
            return handleTopLevelError(error);
        }
        if (displayMessage != null) {
            return handleDetailedError(displayMessage);
        }
        return false;
    }
}
