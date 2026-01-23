package com.robinhood.shared.stepupverification.kyc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: KycStatusCheckViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckViewState;", "", "hasUploaded", "", "<init>", "(Z)V", "getHasUploaded", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class KycStatusCheckViewState {
    public static final int $stable = 0;
    private final boolean hasUploaded;

    public KycStatusCheckViewState() {
        this(false, 1, null);
    }

    public static /* synthetic */ KycStatusCheckViewState copy$default(KycStatusCheckViewState kycStatusCheckViewState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = kycStatusCheckViewState.hasUploaded;
        }
        return kycStatusCheckViewState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasUploaded() {
        return this.hasUploaded;
    }

    public final KycStatusCheckViewState copy(boolean hasUploaded) {
        return new KycStatusCheckViewState(hasUploaded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KycStatusCheckViewState) && this.hasUploaded == ((KycStatusCheckViewState) other).hasUploaded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasUploaded);
    }

    public String toString() {
        return "KycStatusCheckViewState(hasUploaded=" + this.hasUploaded + ")";
    }

    public KycStatusCheckViewState(boolean z) {
        this.hasUploaded = z;
    }

    public /* synthetic */ KycStatusCheckViewState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getHasUploaded() {
        return this.hasUploaded;
    }
}
