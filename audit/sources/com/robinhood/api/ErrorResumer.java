package com.robinhood.api;

import io.reactivex.Maybe;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: ErrorResumer.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0002B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/api/ErrorResumer;", "T", "Lio/reactivex/functions/Function;", "", "Lio/reactivex/Maybe;", "handler", "Lcom/robinhood/api/ErrorHandler;", "allowErrors", "", "<init>", "(Lcom/robinhood/api/ErrorHandler;Z)V", "getHandler", "()Lcom/robinhood/api/ErrorHandler;", "apply", "throwable", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class ErrorResumer<T> implements Function<Throwable, Maybe<T>> {
    private final boolean allowErrors;
    private final ErrorHandler handler;

    public ErrorResumer(ErrorHandler handler, boolean z) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
        this.allowErrors = z;
    }

    public final ErrorHandler getHandler() {
        return this.handler;
    }

    @Override // io.reactivex.functions.Function
    public Maybe<T> apply(Throwable throwable) {
        boolean zOnNetworkError;
        Maybe<T> maybeError;
        String str;
        T next;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CompositeException) {
            List<Throwable> exceptions = ((CompositeException) throwable).getExceptions();
            Intrinsics.checkNotNullExpressionValue(exceptions, "getExceptions(...)");
            Iterator<T> it = exceptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                Throwable th = (Throwable) next;
                if ((th instanceof HttpException) || (th instanceof IOException)) {
                    break;
                }
            }
            Throwable th2 = next;
            if (th2 != null) {
                throwable = th2;
            }
        }
        if (throwable instanceof HttpException) {
            ErrorHandler errorHandler = this.handler;
            Response<?> response = ((HttpException) throwable).response();
            Intrinsics.checkNotNull(response);
            zOnNetworkError = errorHandler.onNon200Error(response);
        } else {
            zOnNetworkError = throwable instanceof IOException ? this.handler.onNetworkError((IOException) throwable) : this.handler.onProgrammingError(throwable);
        }
        if (!zOnNetworkError || this.allowErrors) {
            maybeError = Maybe.error(throwable);
            str = "error(...)";
        } else {
            maybeError = Maybe.empty();
            str = "empty(...)";
        }
        Intrinsics.checkNotNullExpressionValue(maybeError, str);
        return maybeError;
    }
}
