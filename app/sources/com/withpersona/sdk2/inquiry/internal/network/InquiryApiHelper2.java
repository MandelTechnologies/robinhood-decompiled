package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InquiryApiHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult;", "", "<init>", "()V", "Success", "Error", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult$Error;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult$Success;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryResult, reason: use source file name */
/* loaded from: classes18.dex */
public abstract class InquiryApiHelper2 {
    public /* synthetic */ InquiryApiHelper2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult$Success;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "nextStep", "fallbackSessionToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getNextStep", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "getFallbackSessionToken", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryResult$Success, reason: from toString */
    public static final /* data */ class Success extends InquiryApiHelper2 {
        private final String fallbackSessionToken;
        private final String inquiryId;
        private final NextStep nextStep;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.inquiryId, success.inquiryId) && Intrinsics.areEqual(this.nextStep, success.nextStep) && Intrinsics.areEqual(this.fallbackSessionToken, success.fallbackSessionToken);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.nextStep.hashCode()) * 31;
            String str = this.fallbackSessionToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Success(inquiryId=" + this.inquiryId + ", nextStep=" + this.nextStep + ", fallbackSessionToken=" + this.fallbackSessionToken + ")";
        }

        public /* synthetic */ Success(String str, NextStep nextStep, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, nextStep, (i & 4) != 0 ? null : str2);
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String inquiryId, NextStep nextStep, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(nextStep, "nextStep");
            this.inquiryId = inquiryId;
            this.nextStep = nextStep;
            this.fallbackSessionToken = str;
        }
    }

    private InquiryApiHelper2() {
    }

    /* compiled from: InquiryApiHelper.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult$Error;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquiryResult;", "", "debugMessage", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDebugMessage", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getCause", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryResult$Error, reason: from toString */
    public static final /* data */ class Error extends InquiryApiHelper2 {
        private final InternalErrorInfo cause;
        private final String debugMessage;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.debugMessage, error.debugMessage) && Intrinsics.areEqual(this.cause, error.cause);
        }

        public int hashCode() {
            String str = this.debugMessage;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.cause.hashCode();
        }

        public String toString() {
            return "Error(debugMessage=" + this.debugMessage + ", cause=" + this.cause + ")";
        }

        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public final InternalErrorInfo getCause() {
            return this.cause;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, InternalErrorInfo cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.debugMessage = str;
            this.cause = cause;
        }
    }
}
