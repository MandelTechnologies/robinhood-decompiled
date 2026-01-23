package com.robinhood.android.matcha.p177ui.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.models.matcha.api.ApiMatchaIdentifier2;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: ConfirmationType.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001aR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0007\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/util/Money;", "getAmount", "()Lcom/robinhood/models/util/Money;", "transactorName", "", "getTransactorName", "()Ljava/lang/String;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "transactionId", "Ljava/util/UUID;", "getTransactionId", "()Ljava/util/UUID;", "PaymentComplete", "PaymentPending", "PaymentClaimed", "PaymentProcessing", "RequestSent", "MultiuserPayment", "MultiuserRequest", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$MultiuserPayment;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$MultiuserRequest;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentClaimed;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentComplete;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentPending;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentProcessing;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$RequestSent;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface ConfirmationType extends Parcelable {
    Money getAmount();

    StringResource getSubtitle();

    StringResource getTitle();

    UUID getTransactionId();

    String getTransactorName();

    /* compiled from: ConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentComplete;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "amount", "Lcom/robinhood/models/util/Money;", "transactorName", "", "transactionId", "Ljava/util/UUID;", "incentiveGranted", "", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/util/UUID;Z)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactorName", "()Ljava/lang/String;", "getTransactionId", "()Ljava/util/UUID;", "getIncentiveGranted", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PaymentComplete implements ConfirmationType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PaymentComplete> CREATOR = new Creator();
        private final Money amount;
        private final boolean incentiveGranted;
        private final UUID transactionId;
        private final String transactorName;

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentComplete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentComplete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentComplete((Money) parcel.readParcelable(PaymentComplete.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentComplete[] newArray(int i) {
                return new PaymentComplete[i];
            }
        }

        public static /* synthetic */ PaymentComplete copy$default(PaymentComplete paymentComplete, Money money, String str, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                money = paymentComplete.amount;
            }
            if ((i & 2) != 0) {
                str = paymentComplete.transactorName;
            }
            if ((i & 4) != 0) {
                uuid = paymentComplete.transactionId;
            }
            if ((i & 8) != 0) {
                z = paymentComplete.incentiveGranted;
            }
            return paymentComplete.copy(money, str, uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTransactorName() {
            return this.transactorName;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIncentiveGranted() {
            return this.incentiveGranted;
        }

        public final PaymentComplete copy(Money amount, String transactorName, UUID transactionId, boolean incentiveGranted) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new PaymentComplete(amount, transactorName, transactionId, incentiveGranted);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentComplete)) {
                return false;
            }
            PaymentComplete paymentComplete = (PaymentComplete) other;
            return Intrinsics.areEqual(this.amount, paymentComplete.amount) && Intrinsics.areEqual(this.transactorName, paymentComplete.transactorName) && Intrinsics.areEqual(this.transactionId, paymentComplete.transactionId) && this.incentiveGranted == paymentComplete.incentiveGranted;
        }

        public int hashCode() {
            return (((((this.amount.hashCode() * 31) + this.transactorName.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + Boolean.hashCode(this.incentiveGranted);
        }

        public String toString() {
            return "PaymentComplete(amount=" + this.amount + ", transactorName=" + this.transactorName + ", transactionId=" + this.transactionId + ", incentiveGranted=" + this.incentiveGranted + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.transactorName);
            dest.writeSerializable(this.transactionId);
            dest.writeInt(this.incentiveGranted ? 1 : 0);
        }

        public PaymentComplete(Money amount, String transactorName, UUID transactionId, boolean z) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.amount = amount;
            this.transactorName = transactorName;
            this.transactionId = transactionId;
            this.incentiveGranted = z;
        }

        public /* synthetic */ PaymentComplete(Money money, String str, UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(money, str, uuid, (i & 8) != 0 ? false : z);
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public String getTransactorName() {
            return this.transactorName;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public UUID getTransactionId() {
            return this.transactionId;
        }

        public final boolean getIncentiveGranted() {
            return this.incentiveGranted;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getTitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_complete_title, getTransactorName(), Money.format$default(getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getSubtitle() {
            int i;
            StringResource.Companion companion = StringResource.INSTANCE;
            if (this.incentiveGranted) {
                i = C21284R.string.matcha_transfer_complete_with_incentive_subtitle;
            } else {
                i = C21284R.string.matcha_transfer_complete_subtitle;
            }
            return companion.invoke(i, getTransactorName());
        }
    }

    /* compiled from: ConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010 R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentPending;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifierType;", "transactorType", "j$/time/Instant", "expirationDate", "Lcom/robinhood/models/util/Money;", "amount", "", "transactorName", "Ljava/util/UUID;", "transactionId", "<init>", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifierType;Lj$/time/Instant;Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/util/UUID;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifierType;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/models/util/Money;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/UUID;", "copy", "(Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifierType;Lj$/time/Instant;Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/util/UUID;)Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentPending;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIdentifierType;", "getTransactorType", "Lj$/time/Instant;", "getExpirationDate", "Lcom/robinhood/models/util/Money;", "getAmount", "Ljava/lang/String;", "getTransactorName", "Ljava/util/UUID;", "getTransactionId", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "title", "getSubtitle", "subtitle", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class PaymentPending implements ConfirmationType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PaymentPending> CREATOR = new Creator();
        private final Money amount;
        private final Instant expirationDate;
        private final UUID transactionId;
        private final String transactorName;
        private final ApiMatchaIdentifier2 transactorType;

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentPending> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPending createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentPending(ApiMatchaIdentifier2.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (Money) parcel.readParcelable(PaymentPending.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPending[] newArray(int i) {
                return new PaymentPending[i];
            }
        }

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiMatchaIdentifier2.values().length];
                try {
                    iArr[ApiMatchaIdentifier2.USER_UUID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiMatchaIdentifier2.EMAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiMatchaIdentifier2.PHONE_NUMBER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ PaymentPending copy$default(PaymentPending paymentPending, ApiMatchaIdentifier2 apiMatchaIdentifier2, Instant instant, Money money, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMatchaIdentifier2 = paymentPending.transactorType;
            }
            if ((i & 2) != 0) {
                instant = paymentPending.expirationDate;
            }
            if ((i & 4) != 0) {
                money = paymentPending.amount;
            }
            if ((i & 8) != 0) {
                str = paymentPending.transactorName;
            }
            if ((i & 16) != 0) {
                uuid = paymentPending.transactionId;
            }
            UUID uuid2 = uuid;
            Money money2 = money;
            return paymentPending.copy(apiMatchaIdentifier2, instant, money2, str, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMatchaIdentifier2 getTransactorType() {
            return this.transactorType;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTransactorName() {
            return this.transactorName;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        public final PaymentPending copy(ApiMatchaIdentifier2 transactorType, Instant expirationDate, Money amount, String transactorName, UUID transactionId) {
            Intrinsics.checkNotNullParameter(transactorType, "transactorType");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new PaymentPending(transactorType, expirationDate, amount, transactorName, transactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentPending)) {
                return false;
            }
            PaymentPending paymentPending = (PaymentPending) other;
            return this.transactorType == paymentPending.transactorType && Intrinsics.areEqual(this.expirationDate, paymentPending.expirationDate) && Intrinsics.areEqual(this.amount, paymentPending.amount) && Intrinsics.areEqual(this.transactorName, paymentPending.transactorName) && Intrinsics.areEqual(this.transactionId, paymentPending.transactionId);
        }

        public int hashCode() {
            return (((((((this.transactorType.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.transactorName.hashCode()) * 31) + this.transactionId.hashCode();
        }

        public String toString() {
            return "PaymentPending(transactorType=" + this.transactorType + ", expirationDate=" + this.expirationDate + ", amount=" + this.amount + ", transactorName=" + this.transactorName + ", transactionId=" + this.transactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.transactorType.name());
            dest.writeSerializable(this.expirationDate);
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.transactorName);
            dest.writeSerializable(this.transactionId);
        }

        public PaymentPending(ApiMatchaIdentifier2 transactorType, Instant expirationDate, Money amount, String transactorName, UUID transactionId) {
            Intrinsics.checkNotNullParameter(transactorType, "transactorType");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.transactorType = transactorType;
            this.expirationDate = expirationDate;
            this.amount = amount;
            this.transactorName = transactorName;
            this.transactionId = transactionId;
        }

        public final ApiMatchaIdentifier2 getTransactorType() {
            return this.transactorType;
        }

        public final Instant getExpirationDate() {
            return this.expirationDate;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public String getTransactorName() {
            return this.transactorName;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public UUID getTransactionId() {
            return this.transactionId;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getTitle() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.transactorType.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_pending_user_title, getTransactorName(), Money.format$default(getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            }
            if (i == 2 || i == 3) {
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_pending_non_user_title, Money.format$default(getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), getTransactorName());
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getSubtitle() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.transactorType.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_pending_user_subtitle, InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) this.expirationDate));
            }
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_pending_non_user_subtitle, InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) this.expirationDate));
        }
    }

    /* compiled from: ConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentClaimed;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "amount", "Lcom/robinhood/models/util/Money;", "transactorName", "", "transactionId", "Ljava/util/UUID;", "incentiveGranted", "", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/util/UUID;Z)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactorName", "()Ljava/lang/String;", "getTransactionId", "()Ljava/util/UUID;", "getIncentiveGranted", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PaymentClaimed implements ConfirmationType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PaymentClaimed> CREATOR = new Creator();
        private final Money amount;
        private final boolean incentiveGranted;
        private final UUID transactionId;
        private final String transactorName;

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentClaimed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentClaimed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentClaimed((Money) parcel.readParcelable(PaymentClaimed.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentClaimed[] newArray(int i) {
                return new PaymentClaimed[i];
            }
        }

        public static /* synthetic */ PaymentClaimed copy$default(PaymentClaimed paymentClaimed, Money money, String str, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                money = paymentClaimed.amount;
            }
            if ((i & 2) != 0) {
                str = paymentClaimed.transactorName;
            }
            if ((i & 4) != 0) {
                uuid = paymentClaimed.transactionId;
            }
            if ((i & 8) != 0) {
                z = paymentClaimed.incentiveGranted;
            }
            return paymentClaimed.copy(money, str, uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTransactorName() {
            return this.transactorName;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIncentiveGranted() {
            return this.incentiveGranted;
        }

        public final PaymentClaimed copy(Money amount, String transactorName, UUID transactionId, boolean incentiveGranted) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new PaymentClaimed(amount, transactorName, transactionId, incentiveGranted);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentClaimed)) {
                return false;
            }
            PaymentClaimed paymentClaimed = (PaymentClaimed) other;
            return Intrinsics.areEqual(this.amount, paymentClaimed.amount) && Intrinsics.areEqual(this.transactorName, paymentClaimed.transactorName) && Intrinsics.areEqual(this.transactionId, paymentClaimed.transactionId) && this.incentiveGranted == paymentClaimed.incentiveGranted;
        }

        public int hashCode() {
            return (((((this.amount.hashCode() * 31) + this.transactorName.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + Boolean.hashCode(this.incentiveGranted);
        }

        public String toString() {
            return "PaymentClaimed(amount=" + this.amount + ", transactorName=" + this.transactorName + ", transactionId=" + this.transactionId + ", incentiveGranted=" + this.incentiveGranted + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.transactorName);
            dest.writeSerializable(this.transactionId);
            dest.writeInt(this.incentiveGranted ? 1 : 0);
        }

        public PaymentClaimed(Money amount, String transactorName, UUID transactionId, boolean z) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.amount = amount;
            this.transactorName = transactorName;
            this.transactionId = transactionId;
            this.incentiveGranted = z;
        }

        public /* synthetic */ PaymentClaimed(Money money, String str, UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(money, str, uuid, (i & 8) != 0 ? false : z);
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public String getTransactorName() {
            return this.transactorName;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public UUID getTransactionId() {
            return this.transactionId;
        }

        public final boolean getIncentiveGranted() {
            return this.incentiveGranted;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getTitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_claimed_title, new Object[0]);
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getSubtitle() {
            int i;
            StringResource.Companion companion = StringResource.INSTANCE;
            if (this.incentiveGranted) {
                i = C21284R.string.matcha_transfer_claimed_with_incentive_subtitle;
            } else {
                i = C21284R.string.matcha_transfer_claimed_subtitle;
            }
            return companion.invoke(i, Money.format$default(getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), getTransactorName());
        }
    }

    /* compiled from: ConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$PaymentProcessing;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "amount", "Lcom/robinhood/models/util/Money;", "transactorName", "", "transactionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/util/UUID;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactorName", "()Ljava/lang/String;", "getTransactionId", "()Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PaymentProcessing implements ConfirmationType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PaymentProcessing> CREATOR = new Creator();
        private final Money amount;
        private final UUID transactionId;
        private final String transactorName;

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentProcessing> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentProcessing createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentProcessing((Money) parcel.readParcelable(PaymentProcessing.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentProcessing[] newArray(int i) {
                return new PaymentProcessing[i];
            }
        }

        public static /* synthetic */ PaymentProcessing copy$default(PaymentProcessing paymentProcessing, Money money, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                money = paymentProcessing.amount;
            }
            if ((i & 2) != 0) {
                str = paymentProcessing.transactorName;
            }
            if ((i & 4) != 0) {
                uuid = paymentProcessing.transactionId;
            }
            return paymentProcessing.copy(money, str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTransactorName() {
            return this.transactorName;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        public final PaymentProcessing copy(Money amount, String transactorName, UUID transactionId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new PaymentProcessing(amount, transactorName, transactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentProcessing)) {
                return false;
            }
            PaymentProcessing paymentProcessing = (PaymentProcessing) other;
            return Intrinsics.areEqual(this.amount, paymentProcessing.amount) && Intrinsics.areEqual(this.transactorName, paymentProcessing.transactorName) && Intrinsics.areEqual(this.transactionId, paymentProcessing.transactionId);
        }

        public int hashCode() {
            return (((this.amount.hashCode() * 31) + this.transactorName.hashCode()) * 31) + this.transactionId.hashCode();
        }

        public String toString() {
            return "PaymentProcessing(amount=" + this.amount + ", transactorName=" + this.transactorName + ", transactionId=" + this.transactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.transactorName);
            dest.writeSerializable(this.transactionId);
        }

        public PaymentProcessing(Money amount, String transactorName, UUID transactionId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.amount = amount;
            this.transactorName = transactorName;
            this.transactionId = transactionId;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public String getTransactorName() {
            return this.transactorName;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public UUID getTransactionId() {
            return this.transactionId;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getTitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_processing_title, getTransactorName());
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getSubtitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_processing_subtitle, getTransactorName());
        }
    }

    /* compiled from: ConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$RequestSent;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "amount", "Lcom/robinhood/models/util/Money;", "transactorName", "", "transactionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;Ljava/util/UUID;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactorName", "()Ljava/lang/String;", "getTransactionId", "()Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestSent implements ConfirmationType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RequestSent> CREATOR = new Creator();
        private final Money amount;
        private final UUID transactionId;
        private final String transactorName;

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RequestSent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RequestSent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestSent((Money) parcel.readParcelable(RequestSent.class.getClassLoader()), parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RequestSent[] newArray(int i) {
                return new RequestSent[i];
            }
        }

        public static /* synthetic */ RequestSent copy$default(RequestSent requestSent, Money money, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                money = requestSent.amount;
            }
            if ((i & 2) != 0) {
                str = requestSent.transactorName;
            }
            if ((i & 4) != 0) {
                uuid = requestSent.transactionId;
            }
            return requestSent.copy(money, str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTransactorName() {
            return this.transactorName;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        public final RequestSent copy(Money amount, String transactorName, UUID transactionId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new RequestSent(amount, transactorName, transactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestSent)) {
                return false;
            }
            RequestSent requestSent = (RequestSent) other;
            return Intrinsics.areEqual(this.amount, requestSent.amount) && Intrinsics.areEqual(this.transactorName, requestSent.transactorName) && Intrinsics.areEqual(this.transactionId, requestSent.transactionId);
        }

        public int hashCode() {
            return (((this.amount.hashCode() * 31) + this.transactorName.hashCode()) * 31) + this.transactionId.hashCode();
        }

        public String toString() {
            return "RequestSent(amount=" + this.amount + ", transactorName=" + this.transactorName + ", transactionId=" + this.transactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.transactorName);
            dest.writeSerializable(this.transactionId);
        }

        public RequestSent(Money amount, String transactorName, UUID transactionId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorName, "transactorName");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.amount = amount;
            this.transactorName = transactorName;
            this.transactionId = transactionId;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public Money getAmount() {
            return this.amount;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public String getTransactorName() {
            return this.transactorName;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public UUID getTransactionId() {
            return this.transactionId;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getTitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_request_sent_title, Money.format$default(getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null), getTransactorName());
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getSubtitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_request_sent_subtitle, new Object[0]);
        }
    }

    /* compiled from: ConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u001dR\u0014\u00101\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010!R\u0016\u00103\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$MultiuserPayment;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "Lcom/robinhood/models/util/Money;", "amount", "", "", "transactorNames", "Ljava/util/UUID;", "transactionId", "j$/time/Instant", "expirationDate", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/List;Ljava/util/UUID;Lj$/time/Instant;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/robinhood/models/util/Money;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/UUID;", "component4", "()Lj$/time/Instant;", "copy", "(Lcom/robinhood/models/util/Money;Ljava/util/List;Ljava/util/UUID;Lj$/time/Instant;)Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$MultiuserPayment;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/util/Money;", "getAmount", "Ljava/util/List;", "getTransactorNames", "Ljava/util/UUID;", "getTransactionId", "Lj$/time/Instant;", "getExpirationDate", "getUsersString", "usersString", "getTransactorName", "transactorName", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "title", "getSubtitle", "subtitle", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MultiuserPayment implements ConfirmationType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<MultiuserPayment> CREATOR = new Creator();
        private final Money amount;
        private final Instant expirationDate;
        private final UUID transactionId;
        private final List<String> transactorNames;

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiuserPayment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiuserPayment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultiuserPayment((Money) parcel.readParcelable(MultiuserPayment.class.getClassLoader()), parcel.createStringArrayList(), (UUID) parcel.readSerializable(), (Instant) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiuserPayment[] newArray(int i) {
                return new MultiuserPayment[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiuserPayment copy$default(MultiuserPayment multiuserPayment, Money money, List list, UUID uuid, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                money = multiuserPayment.amount;
            }
            if ((i & 2) != 0) {
                list = multiuserPayment.transactorNames;
            }
            if ((i & 4) != 0) {
                uuid = multiuserPayment.transactionId;
            }
            if ((i & 8) != 0) {
                instant = multiuserPayment.expirationDate;
            }
            return multiuserPayment.copy(money, list, uuid, instant);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        public final List<String> component2() {
            return this.transactorNames;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getExpirationDate() {
            return this.expirationDate;
        }

        public final MultiuserPayment copy(Money amount, List<String> transactorNames, UUID transactionId, Instant expirationDate) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorNames, "transactorNames");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new MultiuserPayment(amount, transactorNames, transactionId, expirationDate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiuserPayment)) {
                return false;
            }
            MultiuserPayment multiuserPayment = (MultiuserPayment) other;
            return Intrinsics.areEqual(this.amount, multiuserPayment.amount) && Intrinsics.areEqual(this.transactorNames, multiuserPayment.transactorNames) && Intrinsics.areEqual(this.transactionId, multiuserPayment.transactionId) && Intrinsics.areEqual(this.expirationDate, multiuserPayment.expirationDate);
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public String getTransactorName() {
            return null;
        }

        public int hashCode() {
            int iHashCode = ((((this.amount.hashCode() * 31) + this.transactorNames.hashCode()) * 31) + this.transactionId.hashCode()) * 31;
            Instant instant = this.expirationDate;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "MultiuserPayment(amount=" + this.amount + ", transactorNames=" + this.transactorNames + ", transactionId=" + this.transactionId + ", expirationDate=" + this.expirationDate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeStringList(this.transactorNames);
            dest.writeSerializable(this.transactionId);
            dest.writeSerializable(this.expirationDate);
        }

        public MultiuserPayment(Money amount, List<String> transactorNames, UUID transactionId, Instant instant) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorNames, "transactorNames");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.amount = amount;
            this.transactorNames = transactorNames;
            this.transactionId = transactionId;
            this.expirationDate = instant;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public Money getAmount() {
            return this.amount;
        }

        public final List<String> getTransactorNames() {
            return this.transactorNames;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public UUID getTransactionId() {
            return this.transactionId;
        }

        public final Instant getExpirationDate() {
            return this.expirationDate;
        }

        private final String getUsersString() {
            if (this.transactorNames.size() <= 3) {
                List<String> list = this.transactorNames;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj;
                    if (i == CollectionsKt.getLastIndex(this.transactorNames)) {
                        str = "and " + str;
                    }
                    arrayList.add(str);
                    i = i2;
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((String) next) + ", " + ((String) it.next());
                }
                return (String) next;
            }
            return "them";
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getTitle() {
            int i;
            StringResource.Companion companion = StringResource.INSTANCE;
            if (this.expirationDate == null) {
                i = C21284R.string.matcha_multiuser_transfer_complete_title;
            } else {
                i = C21284R.string.matcha_multiuser_transfer_pending_title;
            }
            return companion.invoke(i, Integer.valueOf(this.transactorNames.size()), Money.format$default(getAmount().div(new BigDecimal(this.transactorNames.size())), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getSubtitle() {
            if (this.expirationDate == null) {
                return StringResource.INSTANCE.invoke(C21284R.string.matcha_transfer_complete_subtitle, getUsersString());
            }
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_multiuser_transfer_pending_subtitle, getUsersString(), InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) this.expirationDate));
        }
    }

    /* compiled from: ConfirmationType.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J-\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType$MultiuserRequest;", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "amount", "Lcom/robinhood/models/util/Money;", "transactorNames", "", "", "transactionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/List;Ljava/util/UUID;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactorNames", "()Ljava/util/List;", "getTransactionId", "()Ljava/util/UUID;", "usersString", "getUsersString", "()Ljava/lang/String;", "transactorName", "getTransactorName", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MultiuserRequest implements ConfirmationType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<MultiuserRequest> CREATOR = new Creator();
        private final Money amount;
        private final UUID transactionId;
        private final List<String> transactorNames;

        /* compiled from: ConfirmationType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiuserRequest> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiuserRequest createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultiuserRequest((Money) parcel.readParcelable(MultiuserRequest.class.getClassLoader()), parcel.createStringArrayList(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiuserRequest[] newArray(int i) {
                return new MultiuserRequest[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiuserRequest copy$default(MultiuserRequest multiuserRequest, Money money, List list, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                money = multiuserRequest.amount;
            }
            if ((i & 2) != 0) {
                list = multiuserRequest.transactorNames;
            }
            if ((i & 4) != 0) {
                uuid = multiuserRequest.transactionId;
            }
            return multiuserRequest.copy(money, list, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        public final List<String> component2() {
            return this.transactorNames;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        public final MultiuserRequest copy(Money amount, List<String> transactorNames, UUID transactionId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorNames, "transactorNames");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new MultiuserRequest(amount, transactorNames, transactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiuserRequest)) {
                return false;
            }
            MultiuserRequest multiuserRequest = (MultiuserRequest) other;
            return Intrinsics.areEqual(this.amount, multiuserRequest.amount) && Intrinsics.areEqual(this.transactorNames, multiuserRequest.transactorNames) && Intrinsics.areEqual(this.transactionId, multiuserRequest.transactionId);
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public String getTransactorName() {
            return null;
        }

        public int hashCode() {
            return (((this.amount.hashCode() * 31) + this.transactorNames.hashCode()) * 31) + this.transactionId.hashCode();
        }

        public String toString() {
            return "MultiuserRequest(amount=" + this.amount + ", transactorNames=" + this.transactorNames + ", transactionId=" + this.transactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeStringList(this.transactorNames);
            dest.writeSerializable(this.transactionId);
        }

        public MultiuserRequest(Money amount, List<String> transactorNames, UUID transactionId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactorNames, "transactorNames");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.amount = amount;
            this.transactorNames = transactorNames;
            this.transactionId = transactionId;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public Money getAmount() {
            return this.amount;
        }

        public final List<String> getTransactorNames() {
            return this.transactorNames;
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public UUID getTransactionId() {
            return this.transactionId;
        }

        private final String getUsersString() {
            if (this.transactorNames.size() <= 3) {
                List<String> list = this.transactorNames;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj;
                    if (i == CollectionsKt.getLastIndex(this.transactorNames)) {
                        str = "and " + str;
                    }
                    arrayList.add(str);
                    i = i2;
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((String) next) + ", " + ((String) it.next());
                }
                return (String) next;
            }
            return "they";
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getTitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_multiuser_request_sent_title, getAmount().div(new BigDecimal(this.transactorNames.size())), Integer.valueOf(this.transactorNames.size()));
        }

        @Override // com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType
        public StringResource getSubtitle() {
            return StringResource.INSTANCE.invoke(C21284R.string.matcha_multiuser_request_sent_subtitle, getUsersString());
        }
    }
}
