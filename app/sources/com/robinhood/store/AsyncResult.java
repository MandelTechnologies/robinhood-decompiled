package com.robinhood.store;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AsyncResult.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u000e\u000f\u0010R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/AsyncResult;", "T", "", "isSuccess", "", "()Z", "isFailure", "successValue", "getSuccessValue", "()Ljava/lang/Object;", "errorValue", "", "getErrorValue", "()Ljava/lang/Throwable;", "Success", "Failure", "Loading", "Lcom/robinhood/store/AsyncResult$Failure;", "Lcom/robinhood/store/AsyncResult$Loading;", "Lcom/robinhood/store/AsyncResult$Success;", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface AsyncResult<T> {
    Throwable getErrorValue();

    T getSuccessValue();

    boolean isFailure();

    boolean isSuccess();

    /* compiled from: AsyncResult.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/AsyncResult$Success;", "T", "Lcom/robinhood/store/AsyncResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/store/AsyncResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success<T> implements AsyncResult<T> {
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ")";
        }

        public Success(T t) {
            this.value = t;
        }

        @Override // com.robinhood.store.AsyncResult
        public Throwable getErrorValue() {
            return DefaultImpls.getErrorValue(this);
        }

        @Override // com.robinhood.store.AsyncResult
        public T getSuccessValue() {
            return (T) DefaultImpls.getSuccessValue(this);
        }

        public final T getValue() {
            return this.value;
        }

        @Override // com.robinhood.store.AsyncResult
        public boolean isFailure() {
            return DefaultImpls.isFailure(this);
        }

        @Override // com.robinhood.store.AsyncResult
        public boolean isSuccess() {
            return DefaultImpls.isSuccess(this);
        }
    }

    /* compiled from: AsyncResult.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/AsyncResult$Failure;", "Lcom/robinhood/store/AsyncResult;", "", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class Failure implements AsyncResult {
        private final Throwable exception;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.exception;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        public final Failure copy(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Failure(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(exception=" + this.exception + ")";
        }

        public Failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        @Override // com.robinhood.store.AsyncResult
        public Throwable getErrorValue() {
            return DefaultImpls.getErrorValue(this);
        }

        public final Throwable getException() {
            return this.exception;
        }

        @Override // com.robinhood.store.AsyncResult
        public Void getSuccessValue() {
            return (Void) DefaultImpls.getSuccessValue(this);
        }

        @Override // com.robinhood.store.AsyncResult
        public boolean isFailure() {
            return DefaultImpls.isFailure(this);
        }

        @Override // com.robinhood.store.AsyncResult
        public boolean isSuccess() {
            return DefaultImpls.isSuccess(this);
        }
    }

    /* compiled from: AsyncResult.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\nHÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/AsyncResult$Loading;", "Lcom/robinhood/store/AsyncResult;", "", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AsyncResult {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1205565147;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }

        @Override // com.robinhood.store.AsyncResult
        public Throwable getErrorValue() {
            return DefaultImpls.getErrorValue(this);
        }

        @Override // com.robinhood.store.AsyncResult
        public Void getSuccessValue() {
            return (Void) DefaultImpls.getSuccessValue(this);
        }

        @Override // com.robinhood.store.AsyncResult
        public boolean isFailure() {
            return DefaultImpls.isFailure(this);
        }

        @Override // com.robinhood.store.AsyncResult
        public boolean isSuccess() {
            return DefaultImpls.isSuccess(this);
        }
    }

    /* compiled from: AsyncResult.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <T> boolean isSuccess(AsyncResult<? extends T> asyncResult) {
            return asyncResult instanceof Success;
        }

        public static <T> boolean isFailure(AsyncResult<? extends T> asyncResult) {
            return asyncResult instanceof Failure;
        }

        public static <T> T getSuccessValue(AsyncResult<? extends T> asyncResult) {
            Success success = asyncResult instanceof Success ? (Success) asyncResult : null;
            if (success != null) {
                return (T) success.getValue();
            }
            return null;
        }

        public static <T> Throwable getErrorValue(AsyncResult<? extends T> asyncResult) {
            Failure failure = asyncResult instanceof Failure ? (Failure) asyncResult : null;
            if (failure != null) {
                return failure.getException();
            }
            return null;
        }
    }
}
