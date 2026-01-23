package com.robinhood.android.navigation.app.keys.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardLinkingConfiguration.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B3\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "Landroid/os/Parcelable;", "showIntro", "", "showTransfersCta", "showDoneCta", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "originalEntryPoint", "<init>", "(ZZZLcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;)V", "getShowIntro", "()Z", "getShowTransfersCta", "getShowDoneCta", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "getOriginalEntryPoint", "Standard", "Recommendations", "MatchaOnboardingRequest", "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration$MatchaOnboardingRequest;", "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration$Recommendations;", "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration$Standard;", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class DebitCardLinkingConfiguration implements Parcelable {
    private final PaymentLinkingContext.EntryPoint entryPoint;
    private final PaymentLinkingContext.EntryPoint originalEntryPoint;
    private final boolean showDoneCta;
    private final boolean showIntro;
    private final boolean showTransfersCta;

    public /* synthetic */ DebitCardLinkingConfiguration(boolean z, boolean z2, boolean z3, PaymentLinkingContext.EntryPoint entryPoint, PaymentLinkingContext.EntryPoint entryPoint2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, entryPoint, entryPoint2);
    }

    private DebitCardLinkingConfiguration(boolean z, boolean z2, boolean z3, PaymentLinkingContext.EntryPoint entryPoint, PaymentLinkingContext.EntryPoint entryPoint2) {
        this.showIntro = z;
        this.showTransfersCta = z2;
        this.showDoneCta = z3;
        this.entryPoint = entryPoint;
        this.originalEntryPoint = entryPoint2;
    }

    public boolean getShowIntro() {
        return this.showIntro;
    }

    public boolean getShowTransfersCta() {
        return this.showTransfersCta;
    }

    public boolean getShowDoneCta() {
        return this.showDoneCta;
    }

    public PaymentLinkingContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public PaymentLinkingContext.EntryPoint getOriginalEntryPoint() {
        return this.originalEntryPoint;
    }

    public /* synthetic */ DebitCardLinkingConfiguration(boolean z, boolean z2, boolean z3, PaymentLinkingContext.EntryPoint entryPoint, PaymentLinkingContext.EntryPoint entryPoint2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, entryPoint, (i & 16) != 0 ? PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint2, null);
    }

    /* compiled from: DebitCardLinkingConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration$Standard;", "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "showIntro", "", "showTransfersCta", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "originalEntryPoint", "<init>", "(ZZLcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;)V", "getShowIntro", "()Z", "getShowTransfersCta", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "getOriginalEntryPoint", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Standard extends DebitCardLinkingConfiguration {
        public static final Parcelable.Creator<Standard> CREATOR = new Creator();
        private final PaymentLinkingContext.EntryPoint entryPoint;
        private final PaymentLinkingContext.EntryPoint originalEntryPoint;
        private final boolean showIntro;
        private final boolean showTransfersCta;

        /* compiled from: DebitCardLinkingConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Standard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Standard createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Standard(parcel.readInt() != 0, parcel.readInt() != 0, PaymentLinkingContext.EntryPoint.valueOf(parcel.readString()), PaymentLinkingContext.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Standard[] newArray(int i) {
                return new Standard[i];
            }
        }

        public static /* synthetic */ Standard copy$default(Standard standard, boolean z, boolean z2, PaymentLinkingContext.EntryPoint entryPoint, PaymentLinkingContext.EntryPoint entryPoint2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = standard.showIntro;
            }
            if ((i & 2) != 0) {
                z2 = standard.showTransfersCta;
            }
            if ((i & 4) != 0) {
                entryPoint = standard.entryPoint;
            }
            if ((i & 8) != 0) {
                entryPoint2 = standard.originalEntryPoint;
            }
            return standard.copy(z, z2, entryPoint, entryPoint2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowIntro() {
            return this.showIntro;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowTransfersCta() {
            return this.showTransfersCta;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentLinkingContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentLinkingContext.EntryPoint getOriginalEntryPoint() {
            return this.originalEntryPoint;
        }

        public final Standard copy(boolean showIntro, boolean showTransfersCta, PaymentLinkingContext.EntryPoint entryPoint, PaymentLinkingContext.EntryPoint originalEntryPoint) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(originalEntryPoint, "originalEntryPoint");
            return new Standard(showIntro, showTransfersCta, entryPoint, originalEntryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) other;
            return this.showIntro == standard.showIntro && this.showTransfersCta == standard.showTransfersCta && this.entryPoint == standard.entryPoint && this.originalEntryPoint == standard.originalEntryPoint;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.showIntro) * 31) + Boolean.hashCode(this.showTransfersCta)) * 31) + this.entryPoint.hashCode()) * 31) + this.originalEntryPoint.hashCode();
        }

        public String toString() {
            return "Standard(showIntro=" + this.showIntro + ", showTransfersCta=" + this.showTransfersCta + ", entryPoint=" + this.entryPoint + ", originalEntryPoint=" + this.originalEntryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showIntro ? 1 : 0);
            dest.writeInt(this.showTransfersCta ? 1 : 0);
            dest.writeString(this.entryPoint.name());
            dest.writeString(this.originalEntryPoint.name());
        }

        @Override // com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration
        public boolean getShowIntro() {
            return this.showIntro;
        }

        @Override // com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration
        public boolean getShowTransfersCta() {
            return this.showTransfersCta;
        }

        @Override // com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration
        public PaymentLinkingContext.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        @Override // com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration
        public PaymentLinkingContext.EntryPoint getOriginalEntryPoint() {
            return this.originalEntryPoint;
        }

        public /* synthetic */ Standard(boolean z, boolean z2, PaymentLinkingContext.EntryPoint entryPoint, PaymentLinkingContext.EntryPoint entryPoint2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, entryPoint, (i & 8) != 0 ? PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Standard(boolean z, boolean z2, PaymentLinkingContext.EntryPoint entryPoint, PaymentLinkingContext.EntryPoint originalEntryPoint) {
            super(z, z2, true, entryPoint, originalEntryPoint, null);
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(originalEntryPoint, "originalEntryPoint");
            this.showIntro = z;
            this.showTransfersCta = z2;
            this.entryPoint = entryPoint;
            this.originalEntryPoint = originalEntryPoint;
        }
    }

    /* compiled from: DebitCardLinkingConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration$Recommendations;", "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "amountToTransfer", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;)V", "getAmountToTransfer", "()Ljava/math/BigDecimal;", "getSinkAccount", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Recommendations extends DebitCardLinkingConfiguration {
        public static final Parcelable.Creator<Recommendations> CREATOR = new Creator();
        private final BigDecimal amountToTransfer;
        private final TransferConfiguration.TransferAccountSelection sinkAccount;

        /* compiled from: DebitCardLinkingConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Recommendations> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recommendations createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recommendations((BigDecimal) parcel.readSerializable(), (TransferConfiguration.TransferAccountSelection) parcel.readParcelable(Recommendations.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recommendations[] newArray(int i) {
                return new Recommendations[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Recommendations() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amountToTransfer);
            dest.writeParcelable(this.sinkAccount, flags);
        }

        public final BigDecimal getAmountToTransfer() {
            return this.amountToTransfer;
        }

        public final TransferConfiguration.TransferAccountSelection getSinkAccount() {
            return this.sinkAccount;
        }

        public /* synthetic */ Recommendations(BigDecimal bigDecimal, TransferConfiguration.TransferAccountSelection transferAccountSelection, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? new TransferConfiguration.TransferAccountSelection(null, true, ApiTransferAccount.TransferAccountType.RHS, 1, null) : transferAccountSelection);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recommendations(BigDecimal bigDecimal, TransferConfiguration.TransferAccountSelection sinkAccount) {
            super(false, true, false, PaymentLinkingContext.EntryPoint.FIRST_TRADE_RECOMMENDATION, PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null);
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            this.amountToTransfer = bigDecimal;
            this.sinkAccount = sinkAccount;
        }
    }

    /* compiled from: DebitCardLinkingConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration$MatchaOnboardingRequest;", "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "amount", "Ljava/math/BigDecimal;", "firstName", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFirstName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MatchaOnboardingRequest extends DebitCardLinkingConfiguration {
        public static final Parcelable.Creator<MatchaOnboardingRequest> CREATOR = new Creator();
        private final BigDecimal amount;
        private final String firstName;

        /* compiled from: DebitCardLinkingConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MatchaOnboardingRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MatchaOnboardingRequest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MatchaOnboardingRequest((BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MatchaOnboardingRequest[] newArray(int i) {
                return new MatchaOnboardingRequest[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.amount);
            dest.writeString(this.firstName);
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MatchaOnboardingRequest(BigDecimal amount, String firstName) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            PaymentLinkingContext.EntryPoint entryPoint = PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
            super(false, false, false, entryPoint, entryPoint, null);
            this.amount = amount;
            this.firstName = firstName;
        }
    }
}
