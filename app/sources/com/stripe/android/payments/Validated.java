package com.stripe.android.payments;

import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentFlowResult.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b \u0010\u000f¨\u0006!"}, m3636d2 = {"com/stripe/android/payments/PaymentFlowResult$Validated", "", "", "clientSecret", "", "flowOutcome", "", "canCancelSource", "sourceId", "Lcom/stripe/android/model/Source;", "source", "stripeAccountId", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientSecret", "I", "getFlowOutcome$payments_core_release", "Z", "getCanCancelSource$payments_core_release", "()Z", "getSourceId$payments_core_release", "Lcom/stripe/android/model/Source;", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getStripeAccountId$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.PaymentFlowResult$Validated, reason: use source file name and from toString */
/* loaded from: classes22.dex */
public final /* data */ class Validated {
    private final boolean canCancelSource;
    private final String clientSecret;
    private final int flowOutcome;
    private final Source source;
    private final String sourceId;
    private final String stripeAccountId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Validated)) {
            return false;
        }
        Validated validated = (Validated) other;
        return Intrinsics.areEqual(this.clientSecret, validated.clientSecret) && this.flowOutcome == validated.flowOutcome && this.canCancelSource == validated.canCancelSource && Intrinsics.areEqual(this.sourceId, validated.sourceId) && Intrinsics.areEqual(this.source, validated.source) && Intrinsics.areEqual(this.stripeAccountId, validated.stripeAccountId);
    }

    public int hashCode() {
        int iHashCode = ((((this.clientSecret.hashCode() * 31) + Integer.hashCode(this.flowOutcome)) * 31) + Boolean.hashCode(this.canCancelSource)) * 31;
        String str = this.sourceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Source source = this.source;
        int iHashCode3 = (iHashCode2 + (source == null ? 0 : source.hashCode())) * 31;
        String str2 = this.stripeAccountId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Validated(clientSecret=" + this.clientSecret + ", flowOutcome=" + this.flowOutcome + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + this.sourceId + ", source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
    }

    public Validated(String clientSecret, int i, boolean z, String str, Source source, String str2) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.flowOutcome = i;
        this.canCancelSource = z;
        this.sourceId = str;
        this.source = source;
        this.stripeAccountId = str2;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    /* renamed from: getFlowOutcome$payments_core_release, reason: from getter */
    public final int getFlowOutcome() {
        return this.flowOutcome;
    }

    /* renamed from: getCanCancelSource$payments_core_release, reason: from getter */
    public final boolean getCanCancelSource() {
        return this.canCancelSource;
    }

    /* renamed from: getSourceId$payments_core_release, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: getStripeAccountId$payments_core_release, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }
}
