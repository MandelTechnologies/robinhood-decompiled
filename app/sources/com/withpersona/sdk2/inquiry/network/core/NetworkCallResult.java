package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes18.dex */
public abstract class NetworkCallResult<T> {

    public static final class Failure<T> extends NetworkCallResult<T> {
        private final InternalErrorInfo.NetworkErrorInfo networkErrorInfo;

        public Failure(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            super(null);
            this.networkErrorInfo = networkErrorInfo;
        }

        public final InternalErrorInfo.NetworkErrorInfo getNetworkErrorInfo() {
            return this.networkErrorInfo;
        }
    }

    public static final class Success<T> extends NetworkCallResult<T> {
        private final T response;

        public Success(T t) {
            super(null);
            this.response = t;
        }

        public final T getResponse() {
            return this.response;
        }
    }

    public /* synthetic */ NetworkCallResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkCallResult() {
    }
}
