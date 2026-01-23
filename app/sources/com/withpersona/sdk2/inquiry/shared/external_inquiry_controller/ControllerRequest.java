package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import kotlin.Metadata;

/* compiled from: ControllerRequest.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ControllerRequest;", "", "CancelRequest", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ControllerRequest$CancelRequest;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface ControllerRequest {

    /* compiled from: ControllerRequest.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ControllerRequest$CancelRequest;", "Lcom/withpersona/sdk2/inquiry/shared/external_inquiry_controller/ControllerRequest;", "", "force", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getForce", "()Z", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CancelRequest implements ControllerRequest {
        private final boolean force;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelRequest) && this.force == ((CancelRequest) other).force;
        }

        public int hashCode() {
            return Boolean.hashCode(this.force);
        }

        public String toString() {
            return "CancelRequest(force=" + this.force + ")";
        }

        public CancelRequest(boolean z) {
            this.force = z;
        }

        public final boolean getForce() {
            return this.force;
        }
    }
}
