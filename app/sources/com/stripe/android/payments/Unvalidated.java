package com.stripe.android.payments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.Bundle2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.Source;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.parcelize.Parceler;

/* compiled from: PaymentFlowResult.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J`\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b3\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b7\u0010\u001b¨\u00069"}, m3636d2 = {"com/stripe/android/payments/PaymentFlowResult$Unvalidated", "Landroid/os/Parcelable;", "", "clientSecret", "", "flowOutcome", "Lcom/stripe/android/core/exception/StripeException;", "exception", "", "canCancelSource", "sourceId", "Lcom/stripe/android/model/Source;", "source", "stripeAccountId", "<init>", "(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "validate$payments_core_release", "()Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "validate", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "copy", "(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getClientSecret", "I", "getFlowOutcome", "Lcom/stripe/android/core/exception/StripeException;", "getException", "()Lcom/stripe/android/core/exception/StripeException;", "Z", "getCanCancelSource$payments_core_release", "()Z", "getSourceId$payments_core_release", "Lcom/stripe/android/model/Source;", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getStripeAccountId$payments_core_release", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.PaymentFlowResult$Unvalidated, reason: use source file name and from toString */
/* loaded from: classes22.dex */
public final /* data */ class Unvalidated implements Parcelable {
    private final boolean canCancelSource;
    private final String clientSecret;
    private final StripeException exception;
    private final int flowOutcome;
    private final Source source;
    private final String sourceId;
    private final String stripeAccountId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Unvalidated> CREATOR = new Creator();

    /* compiled from: PaymentFlowResult.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.PaymentFlowResult$Unvalidated$Creator */
    public static final class Creator implements Parcelable.Creator<Unvalidated> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Unvalidated createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Unvalidated.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Unvalidated[] newArray(int i) {
            return new Unvalidated[i];
        }
    }

    public Unvalidated() {
        this(null, 0, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = unvalidated.clientSecret;
        }
        if ((i2 & 2) != 0) {
            i = unvalidated.flowOutcome;
        }
        if ((i2 & 4) != 0) {
            stripeException = unvalidated.exception;
        }
        if ((i2 & 8) != 0) {
            z = unvalidated.canCancelSource;
        }
        if ((i2 & 16) != 0) {
            str2 = unvalidated.sourceId;
        }
        if ((i2 & 32) != 0) {
            source = unvalidated.source;
        }
        if ((i2 & 64) != 0) {
            str3 = unvalidated.stripeAccountId;
        }
        Source source2 = source;
        String str4 = str3;
        String str5 = str2;
        StripeException stripeException2 = stripeException;
        return unvalidated.copy(str, i, stripeException2, z, str5, source2, str4);
    }

    public final Unvalidated copy(String clientSecret, int flowOutcome, StripeException exception, boolean canCancelSource, String sourceId, Source source, String stripeAccountId) {
        return new Unvalidated(clientSecret, flowOutcome, exception, canCancelSource, sourceId, source, stripeAccountId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Unvalidated)) {
            return false;
        }
        Unvalidated unvalidated = (Unvalidated) other;
        return Intrinsics.areEqual(this.clientSecret, unvalidated.clientSecret) && this.flowOutcome == unvalidated.flowOutcome && Intrinsics.areEqual(this.exception, unvalidated.exception) && this.canCancelSource == unvalidated.canCancelSource && Intrinsics.areEqual(this.sourceId, unvalidated.sourceId) && Intrinsics.areEqual(this.source, unvalidated.source) && Intrinsics.areEqual(this.stripeAccountId, unvalidated.stripeAccountId);
    }

    public int hashCode() {
        String str = this.clientSecret;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.flowOutcome)) * 31;
        StripeException stripeException = this.exception;
        int iHashCode2 = (((iHashCode + (stripeException == null ? 0 : stripeException.hashCode())) * 31) + Boolean.hashCode(this.canCancelSource)) * 31;
        String str2 = this.sourceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Source source = this.source;
        int iHashCode4 = (iHashCode3 + (source == null ? 0 : source.hashCode())) * 31;
        String str3 = this.stripeAccountId;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Unvalidated(clientSecret=" + this.clientSecret + ", flowOutcome=" + this.flowOutcome + ", exception=" + this.exception + ", canCancelSource=" + this.canCancelSource + ", sourceId=" + this.sourceId + ", source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write(this, parcel, flags);
    }

    public Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3) {
        this.clientSecret = str;
        this.flowOutcome = i;
        this.exception = stripeException;
        this.canCancelSource = z;
        this.sourceId = str2;
        this.source = source;
        this.stripeAccountId = str3;
    }

    public /* synthetic */ Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : stripeException, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : source, (i2 & 64) != 0 ? null : str3);
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final int getFlowOutcome() {
        return this.flowOutcome;
    }

    public final StripeException getException() {
        return this.exception;
    }

    /* renamed from: getCanCancelSource$payments_core_release, reason: from getter */
    public final boolean getCanCancelSource() {
        return this.canCancelSource;
    }

    /* renamed from: getSourceId$payments_core_release, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: getSource$payments_core_release, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* renamed from: getStripeAccountId$payments_core_release, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public final /* synthetic */ Bundle toBundle() {
        return Bundle2.bundleOf(Tuples4.m3642to("extra_args", this));
    }

    public final Validated validate$payments_core_release() throws StripeException {
        if (this.exception != null) {
            throw this.exception;
        }
        String str = this.clientSecret;
        if (str == null || StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("Invalid client_secret value in result Intent.");
        }
        return new Validated(this.clientSecret, this.flowOutcome, this.canCancelSource, this.sourceId, this.source, this.stripeAccountId);
    }

    /* compiled from: PaymentFlowResult.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "()V", "CLIENT_SECRET_INTENT_ERROR", "", "EXTRA", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "parcel", "Landroid/os/Parcel;", "fromIntent", "intent", "Landroid/content/Intent;", "write", "", "flags", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.stripe.android.payments.PaymentFlowResult$Unvalidated$Companion, reason: from kotlin metadata */
    public static final class Companion implements Parceler<Unvalidated> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public Unvalidated create(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            int i = parcel.readInt();
            Serializable serializable = parcel.readSerializable();
            return new Unvalidated(string2, i, serializable instanceof StripeException ? (StripeException) serializable : null, parcel.readInt() == 1, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
        }

        public void write(Unvalidated unvalidated, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(unvalidated, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(unvalidated.getClientSecret());
            parcel.writeInt(unvalidated.getFlowOutcome());
            parcel.writeSerializable(unvalidated.getException());
            Integer num = unvalidated.getCanCancelSource() ? 1 : null;
            parcel.writeInt(num != null ? num.intValue() : 0);
            parcel.writeString(unvalidated.getSourceId());
            parcel.writeParcelable(unvalidated.getSource(), i);
            parcel.writeString(unvalidated.getStripeAccountId());
        }

        public final /* synthetic */ Unvalidated fromIntent(Intent intent) {
            Unvalidated unvalidated = intent != null ? (Unvalidated) intent.getParcelableExtra("extra_args") : null;
            if (unvalidated == null) {
                return new Unvalidated(null, 0, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
            return unvalidated;
        }
    }
}
