package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.wallets.Wallet;
import io.jsonwebtoken.Header;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentMethod.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0012KLMNOPQRJSTUVWXYZ[Bç\u0001\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+HÖ\u0001¢\u0006\u0004\b7\u00108R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u001c\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010=R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010>R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010?R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010@R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010BR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010CR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010DR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010ER\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010FR\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010GR\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010HR\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010I¨\u0006\\"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/core/model/StripeModel;", "", "id", "", "created", "", "liveMode", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "customerId", "Lcom/stripe/android/model/PaymentMethod$Card;", "card", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "cardPresent", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "fpx", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "ideal", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "sepaDebit", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "auBecsDebit", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "bacsDebit", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "sofort", "Lcom/stripe/android/model/PaymentMethod$Upi;", "upi", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "netbanking", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "usBankAccount", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "allowRedisplay", "<init>", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Ljava/lang/Long;", "Z", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "Companion", "AfterRedirectAction", "AllowRedisplay", "AuBecsDebit", "BacsDebit", "BillingDetails", "Builder", "Card", "CardPresent", "Fpx", "Ideal", "Netbanking", "SepaDebit", "Sofort", "Type", "TypeData", "USBankAccount", "Upi", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PaymentMethod implements StripeModel {

    @JvmField
    public final AllowRedisplay allowRedisplay;

    @JvmField
    public final AuBecsDebit auBecsDebit;

    @JvmField
    public final BacsDebit bacsDebit;

    @JvmField
    public final BillingDetails billingDetails;

    @JvmField
    public final Card card;

    @JvmField
    public final CardPresent cardPresent;

    @JvmField
    public final String code;

    @JvmField
    public final Long created;

    @JvmField
    public final String customerId;

    @JvmField
    public final Fpx fpx;

    @JvmField
    public final String id;

    @JvmField
    public final Ideal ideal;

    @JvmField
    public final boolean liveMode;

    @JvmField
    public final Netbanking netbanking;

    @JvmField
    public final SepaDebit sepaDebit;

    @JvmField
    public final Sofort sofort;

    @JvmField
    public final Type type;

    @JvmField
    public final Upi upi;

    @JvmField
    public final USBankAccount usBankAccount;
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            Long l;
            Sofort sofortCreateFromParcel;
            Sofort sofort;
            Upi upiCreateFromParcel;
            Upi upi;
            Netbanking netbankingCreateFromParcel;
            Netbanking netbanking;
            USBankAccount uSBankAccountCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            Type typeCreateFromParcel = parcel.readInt() == 0 ? null : Type.CREATOR.createFromParcel(parcel);
            BillingDetails billingDetailsCreateFromParcel = parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            Card cardCreateFromParcel = parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel);
            CardPresent cardPresentCreateFromParcel = parcel.readInt() == 0 ? null : CardPresent.CREATOR.createFromParcel(parcel);
            Fpx fpxCreateFromParcel = parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel);
            Ideal idealCreateFromParcel = parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel);
            SepaDebit sepaDebitCreateFromParcel = parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel);
            AuBecsDebit auBecsDebitCreateFromParcel = parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel);
            BacsDebit bacsDebitCreateFromParcel = parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                l = lValueOf;
                sofortCreateFromParcel = null;
            } else {
                l = lValueOf;
                sofortCreateFromParcel = Sofort.CREATOR.createFromParcel(parcel);
            }
            Sofort sofort2 = sofortCreateFromParcel;
            if (parcel.readInt() == 0) {
                sofort = sofort2;
                upiCreateFromParcel = null;
            } else {
                sofort = sofort2;
                upiCreateFromParcel = Upi.CREATOR.createFromParcel(parcel);
            }
            Upi upi2 = upiCreateFromParcel;
            if (parcel.readInt() == 0) {
                upi = upi2;
                netbankingCreateFromParcel = null;
            } else {
                upi = upi2;
                netbankingCreateFromParcel = Netbanking.CREATOR.createFromParcel(parcel);
            }
            Netbanking netbanking2 = netbankingCreateFromParcel;
            if (parcel.readInt() == 0) {
                netbanking = netbanking2;
                uSBankAccountCreateFromParcel = null;
            } else {
                netbanking = netbanking2;
                uSBankAccountCreateFromParcel = USBankAccount.CREATOR.createFromParcel(parcel);
            }
            return new PaymentMethod(string2, l, z, string3, typeCreateFromParcel, billingDetailsCreateFromParcel, string4, cardCreateFromParcel, cardPresentCreateFromParcel, fpxCreateFromParcel, idealCreateFromParcel, sepaDebitCreateFromParcel, auBecsDebitCreateFromParcel, bacsDebitCreateFromParcel, sofort, upi, netbanking, uSBankAccountCreateFromParcel, parcel.readInt() == 0 ? null : AllowRedisplay.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.id, paymentMethod.id) && Intrinsics.areEqual(this.created, paymentMethod.created) && this.liveMode == paymentMethod.liveMode && Intrinsics.areEqual(this.code, paymentMethod.code) && this.type == paymentMethod.type && Intrinsics.areEqual(this.billingDetails, paymentMethod.billingDetails) && Intrinsics.areEqual(this.customerId, paymentMethod.customerId) && Intrinsics.areEqual(this.card, paymentMethod.card) && Intrinsics.areEqual(this.cardPresent, paymentMethod.cardPresent) && Intrinsics.areEqual(this.fpx, paymentMethod.fpx) && Intrinsics.areEqual(this.ideal, paymentMethod.ideal) && Intrinsics.areEqual(this.sepaDebit, paymentMethod.sepaDebit) && Intrinsics.areEqual(this.auBecsDebit, paymentMethod.auBecsDebit) && Intrinsics.areEqual(this.bacsDebit, paymentMethod.bacsDebit) && Intrinsics.areEqual(this.sofort, paymentMethod.sofort) && Intrinsics.areEqual(this.upi, paymentMethod.upi) && Intrinsics.areEqual(this.netbanking, paymentMethod.netbanking) && Intrinsics.areEqual(this.usBankAccount, paymentMethod.usBankAccount) && this.allowRedisplay == paymentMethod.allowRedisplay;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.created;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.liveMode)) * 31;
        String str2 = this.code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type2 = this.type;
        int iHashCode4 = (iHashCode3 + (type2 == null ? 0 : type2.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        int iHashCode5 = (iHashCode4 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        String str3 = this.customerId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Card card = this.card;
        int iHashCode7 = (iHashCode6 + (card == null ? 0 : card.hashCode())) * 31;
        CardPresent cardPresent = this.cardPresent;
        int iHashCode8 = (iHashCode7 + (cardPresent == null ? 0 : cardPresent.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int iHashCode9 = (iHashCode8 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int iHashCode10 = (iHashCode9 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int iHashCode11 = (iHashCode10 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int iHashCode12 = (iHashCode11 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int iHashCode13 = (iHashCode12 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int iHashCode14 = (iHashCode13 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int iHashCode15 = (iHashCode14 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int iHashCode16 = (iHashCode15 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int iHashCode17 = (iHashCode16 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        return iHashCode17 + (allowRedisplay != null ? allowRedisplay.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + this.id + ", created=" + this.created + ", liveMode=" + this.liveMode + ", code=" + this.code + ", type=" + this.type + ", billingDetails=" + this.billingDetails + ", customerId=" + this.customerId + ", card=" + this.card + ", cardPresent=" + this.cardPresent + ", fpx=" + this.fpx + ", ideal=" + this.ideal + ", sepaDebit=" + this.sepaDebit + ", auBecsDebit=" + this.auBecsDebit + ", bacsDebit=" + this.bacsDebit + ", sofort=" + this.sofort + ", upi=" + this.upi + ", netbanking=" + this.netbanking + ", usBankAccount=" + this.usBankAccount + ", allowRedisplay=" + this.allowRedisplay + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        Long l = this.created;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.liveMode ? 1 : 0);
        parcel.writeString(this.code);
        Type type2 = this.type;
        if (type2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            type2.writeToParcel(parcel, flags);
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingDetails.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.customerId);
        Card card = this.card;
        if (card == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            card.writeToParcel(parcel, flags);
        }
        CardPresent cardPresent = this.cardPresent;
        if (cardPresent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardPresent.writeToParcel(parcel, flags);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fpx.writeToParcel(parcel, flags);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ideal.writeToParcel(parcel, flags);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sepaDebit.writeToParcel(parcel, flags);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auBecsDebit.writeToParcel(parcel, flags);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bacsDebit.writeToParcel(parcel, flags);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sofort.writeToParcel(parcel, flags);
        }
        Upi upi = this.upi;
        if (upi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            upi.writeToParcel(parcel, flags);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            netbanking.writeToParcel(parcel, flags);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uSBankAccount.writeToParcel(parcel, flags);
        }
        AllowRedisplay allowRedisplay = this.allowRedisplay;
        if (allowRedisplay == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allowRedisplay.writeToParcel(parcel, flags);
        }
    }

    public PaymentMethod(String str, Long l, boolean z, String str2, Type type2, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, AllowRedisplay allowRedisplay) {
        this.id = str;
        this.created = l;
        this.liveMode = z;
        this.code = str2;
        this.type = type2;
        this.billingDetails = billingDetails;
        this.customerId = str3;
        this.card = card;
        this.cardPresent = cardPresent;
        this.fpx = fpx;
        this.ideal = ideal;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.allowRedisplay = allowRedisplay;
    }

    public /* synthetic */ PaymentMethod(String str, Long l, boolean z, String str2, Type type2, BillingDetails billingDetails, String str3, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, AllowRedisplay allowRedisplay, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, z, str2, type2, (i & 32) != 0 ? null : billingDetails, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : card, (i & 256) != 0 ? null : cardPresent, (i & 512) != 0 ? null : fpx, (i & 1024) != 0 ? null : ideal, (i & 2048) != 0 ? null : sepaDebit, (i & 4096) != 0 ? null : auBecsDebit, (i & 8192) != 0 ? null : bacsDebit, (i & 16384) != 0 ? null : sofort, (32768 & i) != 0 ? null : upi, (65536 & i) != 0 ? null : netbanking, (131072 & i) != 0 ? null : uSBankAccount, (i & 262144) != 0 ? null : allowRedisplay);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\u0081\u0002\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001>B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\t\u001a\u00020\u0006H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=¨\u0006?"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Type;", "", "Landroid/os/Parcelable;", "code", "", "isReusable", "", "isVoucher", "requiresMandate", "hasDelayedSettlement", "afterRedirectAction", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "(Ljava/lang/String;ILjava/lang/String;ZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V", "getAfterRedirectAction$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "describeContents", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Link", "Card", "CardPresent", "Fpx", "Ideal", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "Upi", "P24", "Bancontact", "Giropay", "Eps", "Oxxo", "Alipay", "GrabPay", "PayPal", "AfterpayClearpay", "Netbanking", "Blik", "WeChatPay", "Klarna", "Affirm", "RevolutPay", "Sunbit", "Billie", "Satispay", "AmazonPay", "Alma", "MobilePay", "Multibanco", "Zip", "USBankAccount", "CashAppPay", "Boleto", "Konbini", "Swish", "Twint", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Type implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Affirm;
        public static final Type AfterpayClearpay;
        public static final Type Alipay;
        public static final Type Alma;
        public static final Type AmazonPay;
        public static final Type AuBecsDebit;
        public static final Type BacsDebit;
        public static final Type Bancontact;
        public static final Type Billie;
        public static final Type Blik;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type Card;
        public static final Type CardPresent;
        public static final Type CashAppPay;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type Eps;
        public static final Type Fpx;
        public static final Type Giropay;
        public static final Type GrabPay;
        public static final Type Ideal;
        public static final Type Klarna;
        public static final Type Link;
        public static final Type MobilePay;
        public static final Type Multibanco;
        public static final Type Netbanking;
        public static final Type Oxxo;
        public static final Type P24;
        public static final Type PayPal;
        public static final Type RevolutPay;
        public static final Type Satispay;
        public static final Type SepaDebit;
        public static final Type Sofort;
        public static final Type Sunbit;
        public static final Type Swish;
        public static final Type Twint;
        public static final Type USBankAccount;
        public static final Type Upi;
        public static final Type Zip;
        private final AfterRedirectAction afterRedirectAction;

        @JvmField
        public final String code;
        private final boolean hasDelayedSettlement;

        @JvmField
        public final boolean isReusable;

        @JvmField
        public final boolean isVoucher;

        @JvmField
        public final boolean requiresMandate;
        public static final Type WeChatPay = new Type("WeChatPay", 21, "wechat_pay", false, false, false, false, new AfterRedirectAction.Refresh(5));
        public static final Type Boleto = new Type("Boleto", 35, "boleto", false, true, false, true, 0 == true ? 1 : 0, 32, null);
        public static final Type Konbini = new Type("Konbini", 36, "konbini", false, true, false, true, null, 32, null);

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Type> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Type.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Link, Card, CardPresent, Fpx, Ideal, SepaDebit, AuBecsDebit, BacsDebit, Sofort, Upi, P24, Bancontact, Giropay, Eps, Oxxo, Alipay, GrabPay, PayPal, AfterpayClearpay, Netbanking, Blik, WeChatPay, Klarna, Affirm, RevolutPay, Sunbit, Billie, Satispay, AmazonPay, Alma, MobilePay, Multibanco, Zip, USBankAccount, CashAppPay, Boleto, Konbini, Swish, Twint};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(name());
        }

        private Type(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, AfterRedirectAction afterRedirectAction) {
            this.code = str2;
            this.isReusable = z;
            this.isVoucher = z2;
            this.requiresMandate = z3;
            this.hasDelayedSettlement = z4;
            this.afterRedirectAction = afterRedirectAction;
        }

        /* synthetic */ Type(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, AfterRedirectAction afterRedirectAction, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, z, z2, z3, z4, (i2 & 32) != 0 ? AfterRedirectAction.None.INSTANCE : afterRedirectAction);
        }

        /* renamed from: getAfterRedirectAction$payments_core_release, reason: from getter */
        public final AfterRedirectAction getAfterRedirectAction() {
            return this.afterRedirectAction;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            boolean z = false;
            Link = new Type("Link", 0, "link", false, false, true, z, null, 32, null);
            boolean z2 = false;
            boolean z3 = false;
            Card = new Type("Card", 1, "card", true, z2, z, z3, null, 32, null);
            boolean z4 = false;
            CardPresent = new Type("CardPresent", 2, "card_present", z2, z, z3, z4, null, 32, null);
            Fpx = new Type("Fpx", 3, "fpx", z, z3, z4, false, null, 32, null);
            Ideal = new Type("Ideal", 4, "ideal", z3, z4, true, false, null, 32, null);
            boolean z5 = true;
            SepaDebit = new Type("SepaDebit", 5, "sepa_debit", z4, false, true, z5, null, 32, null);
            boolean z6 = true;
            AuBecsDebit = new Type("AuBecsDebit", 6, "au_becs_debit", true, false, z5, z6, null, 32, null);
            boolean z7 = false;
            boolean z8 = true;
            BacsDebit = new Type("BacsDebit", 7, "bacs_debit", true, z7, z6, z8, null, 32, null);
            Sofort = new Type("Sofort", 8, "sofort", z7, false, z8, true, null, 32, null);
            int i = 0;
            int i2 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z9 = false;
            boolean z10 = false;
            Upi = new Type("Upi", 9, "upi", false, false, false, false, new AfterRedirectAction.Refresh(i, i2, defaultConstructorMarker));
            P24 = new Type("P24", 10, "p24", false, z9, z10, false, 0 == true ? 1 : 0, 32, null);
            boolean z11 = false;
            Bancontact = new Type("Bancontact", 11, "bancontact", z9, z10, true, z11, null, 32, null);
            boolean z12 = false;
            Giropay = new Type("Giropay", 12, "giropay", z10, z12, z11, false, null, 32, null);
            boolean z13 = true;
            boolean z14 = false;
            Eps = new Type("Eps", 13, "eps", z12, z11, z13, z14, null, 32, null);
            Oxxo = new Type("Oxxo", 14, "oxxo", z11, z13, z14, true, null, 32, null);
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            Alipay = new Type("Alipay", 15, "alipay", false, z14, false, false, null, 32, defaultConstructorMarker2);
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            GrabPay = new Type("GrabPay", 16, "grabpay", false, z15, z16, z17, null, 32, null);
            boolean z18 = false;
            PayPal = new Type("PayPal", 17, "paypal", z15, z16, z17, z18, null, 32, null);
            boolean z19 = false;
            AfterpayClearpay = new Type("AfterpayClearpay", 18, "afterpay_clearpay", z16, z17, z18, z19, null, 32, null);
            boolean z20 = false;
            Netbanking = new Type("Netbanking", 19, "netbanking", z17, z18, z19, z20, null, 32, null);
            boolean z21 = false;
            Blik = new Type("Blik", 20, "blik", z18, z19, z20, z21, null, 32, null);
            boolean z22 = false;
            boolean z23 = false;
            Klarna = new Type("Klarna", 22, "klarna", z20, z21, z22, z23, 0 == true ? 1 : 0, 32, null);
            boolean z24 = false;
            Affirm = new Type("Affirm", 23, "affirm", z21, z22, z23, z24, null, 32, null);
            boolean z25 = false;
            RevolutPay = new Type("RevolutPay", 24, "revolut_pay", z22, z23, z24, z25, null, 32, null);
            boolean z26 = false;
            Sunbit = new Type("Sunbit", 25, "sunbit", z23, z24, z25, z26, null, 32, 0 == true ? 1 : 0);
            boolean z27 = false;
            Billie = new Type("Billie", 26, "billie", z24, z25, z26, z27, null, 32, null);
            Satispay = new Type("Satispay", 27, "satispay", z25, z26, z27, false, null, 32, defaultConstructorMarker2);
            boolean z28 = false;
            boolean z29 = false;
            boolean z30 = false;
            AmazonPay = new Type("AmazonPay", 28, "amazon_pay", false, z28, z29, z30, null, 32, null);
            boolean z31 = false;
            Alma = new Type("Alma", 29, "alma", z28, z29, z30, z31, null, 32, null);
            boolean z32 = false;
            MobilePay = new Type("MobilePay", 30, "mobilepay", z29, z30, z31, z32, null, 32, null);
            Multibanco = new Type("Multibanco", 31, "multibanco", z30, true, z32, true, null, 32, null);
            boolean z33 = false;
            Zip = new Type("Zip", 32, Header.COMPRESSION_ALGORITHM, false, z32, z33, false, null, 32, null);
            USBankAccount = new Type("USBankAccount", 33, "us_bank_account", true, z33, true, true, null, 32, null);
            CashAppPay = new Type("CashAppPay", 34, "cashapp", false, false, false, false, new AfterRedirectAction.Refresh(i, i2, defaultConstructorMarker));
            Swish = new Type("Swish", 37, "swish", false, false, false, false, new AfterRedirectAction.Poll(i, i2, defaultConstructorMarker));
            Twint = new Type("Twint", 38, "twint", false, false, false, false, new AfterRedirectAction.Poll(i, i2, defaultConstructorMarker));
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(defaultConstructorMarker);
            CREATOR = new Creator();
        }

        /* renamed from: hasDelayedSettlement, reason: from getter */
        public final boolean getHasDelayedSettlement() {
            return this.hasDelayedSettlement;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/PaymentMethod$Type;", "code", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Type fromCode(String code) {
                Type next;
                Iterator<Type> it = Type.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(next.code, code)) {
                        break;
                    }
                }
                return next;
            }
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\n\u000b\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "Landroid/os/Parcelable;", "retryCount", "", "getRetryCount", "()I", "shouldRefresh", "", "getShouldRefresh", "()Z", "None", "Poll", "Refresh", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public interface AfterRedirectAction extends Parcelable {
        int getRetryCount();

        boolean getShouldRefresh();

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u00020\f8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "shouldRefresh", "Z", "getShouldRefresh", "()Z", "getShouldRefresh$annotations", "retryCount", "I", "getRetryCount", "getRetryCount$annotations", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class None implements AfterRedirectAction {
            private static final boolean shouldRefresh = false;
            public static final None INSTANCE = new None();
            private static final int retryCount = 5;
            public static final Parcelable.Creator<None> CREATOR = new Creator();

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<None> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i) {
                    return new None[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -1728259977;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }

            private None() {
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public boolean getShouldRefresh() {
                return shouldRefresh;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public int getRetryCount() {
                return retryCount;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0019\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "", "retryCount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getRetryCount", "shouldRefresh", "Z", "getShouldRefresh", "()Z", "getShouldRefresh$annotations", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Poll implements AfterRedirectAction {
            public static final Parcelable.Creator<Poll> CREATOR = new Creator();
            private final int retryCount;
            private final boolean shouldRefresh;

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Poll> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Poll createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Poll(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Poll[] newArray(int i) {
                    return new Poll[i];
                }
            }

            public Poll() {
                this(0, 1, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Poll) && this.retryCount == ((Poll) other).retryCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.retryCount);
            }

            public String toString() {
                return "Poll(retryCount=" + this.retryCount + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(this.retryCount);
            }

            public Poll(int i) {
                this.retryCount = i;
                this.shouldRefresh = true;
            }

            public /* synthetic */ Poll(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 5 : i);
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public int getRetryCount() {
                return this.retryCount;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public boolean getShouldRefresh() {
                return this.shouldRefresh;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0019\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;", "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;", "", "retryCount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getRetryCount", "shouldRefresh", "Z", "getShouldRefresh", "()Z", "getShouldRefresh$annotations", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Refresh implements AfterRedirectAction {
            public static final Parcelable.Creator<Refresh> CREATOR = new Creator();
            private final int retryCount;
            private final boolean shouldRefresh;

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Refresh> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Refresh createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Refresh(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Refresh[] newArray(int i) {
                    return new Refresh[i];
                }
            }

            public Refresh() {
                this(0, 1, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Refresh) && this.retryCount == ((Refresh) other).retryCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.retryCount);
            }

            public String toString() {
                return "Refresh(retryCount=" + this.retryCount + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(this.retryCount);
            }

            public Refresh(int i) {
                this.retryCount = i;
                this.shouldRefresh = true;
            }

            public /* synthetic */ Refresh(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 1 : i);
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public int getRetryCount() {
                return this.retryCount;
            }

            @Override // com.stripe.android.model.PaymentMethod.AfterRedirectAction
            public boolean getShouldRefresh() {
                return this.shouldRefresh;
            }
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\u0007J\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00002\b\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bK\u0010\u0007J\r\u0010M\u001a\u00020L¢\u0006\u0004\bM\u0010NR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010OR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010PR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010QR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010RR\u001e\u0010J\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010OR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010TR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010UR\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010OR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010VR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010WR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010XR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010YR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010ZR\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010[R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\\R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010]R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010^R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010_R\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010`¨\u0006a"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Builder;", "", "<init>", "()V", "", "id", "setId", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;", "", "created", "setCreated", "(Ljava/lang/Long;)Lcom/stripe/android/model/PaymentMethod$Builder;", "", "liveMode", "setLiveMode", "(Z)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "setType", "(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "setBillingDetails", "(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "allowRedisplay", "setAllowRedisplay", "(Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Card;", "card", "setCard", "(Lcom/stripe/android/model/PaymentMethod$Card;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "cardPresent", "setCardPresent", "(Lcom/stripe/android/model/PaymentMethod$CardPresent;)Lcom/stripe/android/model/PaymentMethod$Builder;", "customerId", "setCustomerId", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "ideal", "setIdeal", "(Lcom/stripe/android/model/PaymentMethod$Ideal;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "fpx", "setFpx", "(Lcom/stripe/android/model/PaymentMethod$Fpx;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "sepaDebit", "setSepaDebit", "(Lcom/stripe/android/model/PaymentMethod$SepaDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "auBecsDebit", "setAuBecsDebit", "(Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "bacsDebit", "setBacsDebit", "(Lcom/stripe/android/model/PaymentMethod$BacsDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "sofort", "setSofort", "(Lcom/stripe/android/model/PaymentMethod$Sofort;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "netbanking", "setNetbanking", "(Lcom/stripe/android/model/PaymentMethod$Netbanking;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "usBankAccount", "setUSBankAccount", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "upi", "setUpi", "(Lcom/stripe/android/model/PaymentMethod$Upi;)Lcom/stripe/android/model/PaymentMethod$Builder;", "code", "setCode", "Lcom/stripe/android/model/PaymentMethod;", "build", "()Lcom/stripe/android/model/PaymentMethod;", "Ljava/lang/String;", "Ljava/lang/Long;", "Z", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Builder {
        private AllowRedisplay allowRedisplay;
        private AuBecsDebit auBecsDebit;
        private BacsDebit bacsDebit;
        private BillingDetails billingDetails;
        private Card card;
        private CardPresent cardPresent;
        private String code;
        private Long created;
        private String customerId;
        private Fpx fpx;
        private String id;
        private Ideal ideal;
        private boolean liveMode;
        private Netbanking netbanking;
        private SepaDebit sepaDebit;
        private Sofort sofort;
        private Type type;
        private Upi upi;
        private USBankAccount usBankAccount;

        public final Builder setId(String id) {
            this.id = id;
            return this;
        }

        public final Builder setCreated(Long created) {
            this.created = created;
            return this;
        }

        public final Builder setLiveMode(boolean liveMode) {
            this.liveMode = liveMode;
            return this;
        }

        public final Builder setType(Type type2) {
            this.type = type2;
            return this;
        }

        public final Builder setBillingDetails(BillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            return this;
        }

        public final Builder setAllowRedisplay(AllowRedisplay allowRedisplay) {
            this.allowRedisplay = allowRedisplay;
            return this;
        }

        public final Builder setCard(Card card) {
            this.card = card;
            return this;
        }

        public final Builder setCardPresent(CardPresent cardPresent) {
            this.cardPresent = cardPresent;
            return this;
        }

        public final Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public final Builder setIdeal(Ideal ideal) {
            this.ideal = ideal;
            return this;
        }

        public final Builder setFpx(Fpx fpx) {
            this.fpx = fpx;
            return this;
        }

        public final Builder setSepaDebit(SepaDebit sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
        }

        public final Builder setAuBecsDebit(AuBecsDebit auBecsDebit) {
            this.auBecsDebit = auBecsDebit;
            return this;
        }

        public final Builder setBacsDebit(BacsDebit bacsDebit) {
            this.bacsDebit = bacsDebit;
            return this;
        }

        public final Builder setSofort(Sofort sofort) {
            this.sofort = sofort;
            return this;
        }

        public final Builder setNetbanking(Netbanking netbanking) {
            this.netbanking = netbanking;
            return this;
        }

        public final Builder setUSBankAccount(USBankAccount usBankAccount) {
            this.usBankAccount = usBankAccount;
            return this;
        }

        public final Builder setUpi(Upi upi) {
            this.upi = upi;
            return this;
        }

        public final Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public final PaymentMethod build() {
            String str = this.id;
            Long l = this.created;
            boolean z = this.liveMode;
            Type type2 = this.type;
            return new PaymentMethod(str, l, z, this.code, type2, this.billingDetails, this.customerId, this.card, this.cardPresent, this.fpx, this.ideal, this.sepaDebit, this.auBecsDebit, this.bacsDebit, this.sofort, null, this.netbanking, this.usBankAccount, this.allowRedisplay, 32768, null);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002\"!B9\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "Lcom/stripe/android/model/Address;", PlaceTypes.ADDRESS, "", "email", "name", "phone", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "toParamMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Address;", "Ljava/lang/String;", "Companion", "Builder", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class BillingDetails implements StripeModel, StripeParamsModel {

        @JvmField
        public final Address address;

        @JvmField
        public final String email;

        @JvmField
        public final String name;

        @JvmField
        public final String phone;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i) {
                return new BillingDetails[i];
            }
        }

        @JvmOverloads
        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) other;
            return Intrinsics.areEqual(this.address, billingDetails.address) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone);
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        @JvmOverloads
        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapEmptyMap = MapsKt.emptyMap();
            Address address = this.address;
            Map mapMapOf = address != null ? MapsKt.mapOf(Tuples4.m3642to(PlaceTypes.ADDRESS, address.toParamMap())) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, mapMapOf);
            String str = this.email;
            Map mapMapOf2 = str != null ? MapsKt.mapOf(Tuples4.m3642to("email", str)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf2);
            String str2 = this.name;
            Map mapMapOf3 = str2 != null ? MapsKt.mapOf(Tuples4.m3642to("name", str2)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf3);
            String str3 = this.phone;
            Map mapMapOf4 = str3 != null ? MapsKt.mapOf(Tuples4.m3642to("phone", str3)) : null;
            if (mapMapOf4 == null) {
                mapMapOf4 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus3, mapMapOf4);
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "", "<init>", "()V", "Lcom/stripe/android/model/Address;", PlaceTypes.ADDRESS, "setAddress", "(Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "build", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/Address;", "", "email", "Ljava/lang/String;", "name", "phone", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Builder {
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder setAddress(Address address) {
                this.address = address;
                return this;
            }

            public final BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final BillingDetails create(ShippingInformation shippingInformation) {
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                return new BillingDetails(shippingInformation.getAddress(), null, shippingInformation.getName(), shippingInformation.getPhone(), 2, null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "", "Lcom/stripe/android/core/model/StripeModel;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$payments_core_release", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", EducationTourScreenNames.UNSPECIFIED_SCREEN, "LIMITED", "ALWAYS", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class AllowRedisplay implements StripeModel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AllowRedisplay[] $VALUES;
        public static final Parcelable.Creator<AllowRedisplay> CREATOR;
        private final String value;
        public static final AllowRedisplay UNSPECIFIED = new AllowRedisplay(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, "unspecified");
        public static final AllowRedisplay LIMITED = new AllowRedisplay("LIMITED", 1, "limited");
        public static final AllowRedisplay ALWAYS = new AllowRedisplay("ALWAYS", 2, "always");

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AllowRedisplay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllowRedisplay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AllowRedisplay.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllowRedisplay[] newArray(int i) {
                return new AllowRedisplay[i];
            }
        }

        private static final /* synthetic */ AllowRedisplay[] $values() {
            return new AllowRedisplay[]{UNSPECIFIED, LIMITED, ALWAYS};
        }

        public static EnumEntries<AllowRedisplay> getEntries() {
            return $ENTRIES;
        }

        public static AllowRedisplay valueOf(String str) {
            return (AllowRedisplay) Enum.valueOf(AllowRedisplay.class, str);
        }

        public static AllowRedisplay[] values() {
            return (AllowRedisplay[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(name());
        }

        private AllowRedisplay(String str, int i, String str2) {
            this.value = str2;
        }

        /* renamed from: getValue$payments_core_release, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        static {
            AllowRedisplay[] allowRedisplayArr$values = $values();
            $VALUES = allowRedisplayArr$values;
            $ENTRIES = EnumEntries2.enumEntries(allowRedisplayArr$values);
            CREATOR = new Creator();
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$TypeData;", "Lcom/stripe/android/core/model/StripeModel;", "<init>", "()V", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class TypeData implements StripeModel {
        public /* synthetic */ TypeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TypeData() {
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0003./0B\u0097\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)¨\u00061"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "Lcom/stripe/android/model/CardBrand;", "brand", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "checks", "", PlaceTypes.COUNTRY, "", "expiryMonth", "expiryYear", "fingerprint", "funding", "last4", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "threeDSecureUsage", "Lcom/stripe/android/model/wallets/Wallet;", "wallet", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "networks", "displayBrand", "<init>", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/CardBrand;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Ljava/lang/String;", "Ljava/lang/Integer;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/model/wallets/Wallet;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Checks", "Networks", "ThreeDSecureUsage", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Card extends TypeData {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();

        @JvmField
        public final CardBrand brand;

        @JvmField
        public final Checks checks;

        @JvmField
        public final String country;

        @JvmField
        public final String displayBrand;

        @JvmField
        public final Integer expiryMonth;

        @JvmField
        public final Integer expiryYear;

        @JvmField
        public final String fingerprint;

        @JvmField
        public final String funding;

        @JvmField
        public final String last4;

        @JvmField
        public final Networks networks;

        @JvmField
        public final ThreeDSecureUsage threeDSecureUsage;

        @JvmField
        public final Wallet wallet;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Checks.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureUsage.CREATOR.createFromParcel(parcel), (Wallet) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() != 0 ? Networks.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return this.brand == card.brand && Intrinsics.areEqual(this.checks, card.checks) && Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.expiryMonth, card.expiryMonth) && Intrinsics.areEqual(this.expiryYear, card.expiryYear) && Intrinsics.areEqual(this.fingerprint, card.fingerprint) && Intrinsics.areEqual(this.funding, card.funding) && Intrinsics.areEqual(this.last4, card.last4) && Intrinsics.areEqual(this.threeDSecureUsage, card.threeDSecureUsage) && Intrinsics.areEqual(this.wallet, card.wallet) && Intrinsics.areEqual(this.networks, card.networks) && Intrinsics.areEqual(this.displayBrand, card.displayBrand);
        }

        public int hashCode() {
            int iHashCode = this.brand.hashCode() * 31;
            Checks checks = this.checks;
            int iHashCode2 = (iHashCode + (checks == null ? 0 : checks.hashCode())) * 31;
            String str = this.country;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.fingerprint;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.funding;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.last4;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            int iHashCode9 = (iHashCode8 + (threeDSecureUsage == null ? 0 : threeDSecureUsage.hashCode())) * 31;
            Wallet wallet = this.wallet;
            int iHashCode10 = (iHashCode9 + (wallet == null ? 0 : wallet.hashCode())) * 31;
            Networks networks = this.networks;
            int iHashCode11 = (iHashCode10 + (networks == null ? 0 : networks.hashCode())) * 31;
            String str5 = this.displayBrand;
            return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.brand + ", checks=" + this.checks + ", country=" + this.country + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", fingerprint=" + this.fingerprint + ", funding=" + this.funding + ", last4=" + this.last4 + ", threeDSecureUsage=" + this.threeDSecureUsage + ", wallet=" + this.wallet + ", networks=" + this.networks + ", displayBrand=" + this.displayBrand + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.brand.name());
            Checks checks = this.checks;
            if (checks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                checks.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.country);
            Integer num = this.expiryMonth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.funding);
            parcel.writeString(this.last4);
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            if (threeDSecureUsage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                threeDSecureUsage.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.wallet, flags);
            Networks networks = this.networks;
            if (networks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                networks.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.displayBrand);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Card(com.stripe.android.model.CardBrand r2, com.stripe.android.model.PaymentMethod.Card.Checks r3, java.lang.String r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage r10, com.stripe.android.model.wallets.Wallet r11, com.stripe.android.model.PaymentMethod.Card.Networks r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r1 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                com.stripe.android.model.CardBrand r2 = com.stripe.android.model.CardBrand.Unknown
            L6:
                r15 = r14 & 2
                r0 = 0
                if (r15 == 0) goto Lc
                r3 = r0
            Lc:
                r15 = r14 & 4
                if (r15 == 0) goto L11
                r4 = r0
            L11:
                r15 = r14 & 8
                if (r15 == 0) goto L16
                r5 = r0
            L16:
                r15 = r14 & 16
                if (r15 == 0) goto L1b
                r6 = r0
            L1b:
                r15 = r14 & 32
                if (r15 == 0) goto L20
                r7 = r0
            L20:
                r15 = r14 & 64
                if (r15 == 0) goto L25
                r8 = r0
            L25:
                r15 = r14 & 128(0x80, float:1.794E-43)
                if (r15 == 0) goto L2a
                r9 = r0
            L2a:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L2f
                r10 = r0
            L2f:
                r15 = r14 & 512(0x200, float:7.175E-43)
                if (r15 == 0) goto L34
                r11 = r0
            L34:
                r15 = r14 & 1024(0x400, float:1.435E-42)
                if (r15 == 0) goto L39
                r12 = r0
            L39:
                r14 = r14 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L4b
                r15 = r0
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L58
            L4b:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L58:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentMethod.Card.<init>(com.stripe.android.model.CardBrand, com.stripe.android.model.PaymentMethod$Card$Checks, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.PaymentMethod$Card$ThreeDSecureUsage, com.stripe.android.model.wallets.Wallet, com.stripe.android.model.PaymentMethod$Card$Networks, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(CardBrand brand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks, String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(brand, "brand");
            this.brand = brand;
            this.checks = checks;
            this.country = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.fingerprint = str2;
            this.funding = str3;
            this.last4 = str4;
            this.threeDSecureUsage = threeDSecureUsage;
            this.wallet = wallet;
            this.networks = networks;
            this.displayBrand = str5;
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Lcom/stripe/android/core/model/StripeModel;", "", "addressLine1Check", "addressPostalCodeCheck", "cvcCheck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Checks implements StripeModel {
            public static final Parcelable.Creator<Checks> CREATOR = new Creator();

            @JvmField
            public final String addressLine1Check;

            @JvmField
            public final String addressPostalCodeCheck;

            @JvmField
            public final String cvcCheck;

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Checks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Checks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Checks(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Checks[] newArray(int i) {
                    return new Checks[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checks)) {
                    return false;
                }
                Checks checks = (Checks) other;
                return Intrinsics.areEqual(this.addressLine1Check, checks.addressLine1Check) && Intrinsics.areEqual(this.addressPostalCodeCheck, checks.addressPostalCodeCheck) && Intrinsics.areEqual(this.cvcCheck, checks.cvcCheck);
            }

            public int hashCode() {
                String str = this.addressLine1Check;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.addressPostalCodeCheck;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cvcCheck;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + this.addressLine1Check + ", addressPostalCodeCheck=" + this.addressPostalCodeCheck + ", cvcCheck=" + this.cvcCheck + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.addressLine1Check);
                parcel.writeString(this.addressPostalCodeCheck);
                parcel.writeString(this.cvcCheck);
            }

            public Checks(String str, String str2, String str3) {
                this.addressLine1Check = str;
                this.addressPostalCodeCheck = str2;
                this.cvcCheck = str3;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/core/model/StripeModel;", "", "isSupported", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class ThreeDSecureUsage implements StripeModel {
            public static final Parcelable.Creator<ThreeDSecureUsage> CREATOR = new Creator();

            @JvmField
            public final boolean isSupported;

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ThreeDSecureUsage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ThreeDSecureUsage(parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage[] newArray(int i) {
                    return new ThreeDSecureUsage[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThreeDSecureUsage) && this.isSupported == ((ThreeDSecureUsage) other).isSupported;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSupported);
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.isSupported + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(this.isSupported ? 1 : 0);
            }

            public ThreeDSecureUsage(boolean z) {
                this.isSupported = z;
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Lcom/stripe/android/core/model/StripeModel;", "", "", "available", "", "selectionMandatory", "preferred", "<init>", "(Ljava/util/Set;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getAvailable", "()Ljava/util/Set;", "Z", "getSelectionMandatory", "()Z", "getSelectionMandatory$annotations", "()V", "Ljava/lang/String;", "getPreferred", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Networks implements StripeModel {
            public static final Parcelable.Creator<Networks> CREATOR = new Creator();
            private final Set<String> available;
            private final String preferred;
            private final boolean selectionMandatory;

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Networks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new Networks(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Networks[] newArray(int i) {
                    return new Networks[i];
                }
            }

            public Networks() {
                this(null, false, null, 7, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Networks)) {
                    return false;
                }
                Networks networks = (Networks) other;
                return Intrinsics.areEqual(this.available, networks.available) && this.selectionMandatory == networks.selectionMandatory && Intrinsics.areEqual(this.preferred, networks.preferred);
            }

            public int hashCode() {
                int iHashCode = ((this.available.hashCode() * 31) + Boolean.hashCode(this.selectionMandatory)) * 31;
                String str = this.preferred;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.available + ", selectionMandatory=" + this.selectionMandatory + ", preferred=" + this.preferred + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                Set<String> set = this.available;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.selectionMandatory ? 1 : 0);
                parcel.writeString(this.preferred);
            }

            public Networks(Set<String> available, boolean z, String str) {
                Intrinsics.checkNotNullParameter(available, "available");
                this.available = available;
                this.selectionMandatory = z;
                this.preferred = str;
            }

            public /* synthetic */ Networks(Set set, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? SetsKt.emptySet() : set, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
            }
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "ignore", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class CardPresent extends TypeData {
        public static final Parcelable.Creator<CardPresent> CREATOR = new Creator();

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final /* synthetic */ CardPresent EMPTY;
        private final boolean ignore;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CardPresent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardPresent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPresent(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardPresent[] newArray(int i) {
                return new CardPresent[i];
            }
        }

        public CardPresent() {
            this(false, 1, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardPresent) && this.ignore == ((CardPresent) other).ignore;
        }

        public int hashCode() {
            return Boolean.hashCode(this.ignore);
        }

        public String toString() {
            return "CardPresent(ignore=" + this.ignore + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.ignore ? 1 : 0);
        }

        public /* synthetic */ CardPresent(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public CardPresent(boolean z) {
            super(null);
            this.ignore = z;
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent$Companion;", "", "()V", "EMPTY", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "getEMPTY$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$CardPresent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CardPresent getEMPTY$payments_core_release() {
                return CardPresent.EMPTY;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            INSTANCE = new Companion(defaultConstructorMarker);
            EMPTY = new CardPresent(false, 1, defaultConstructorMarker);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "bank", "bankIdentifierCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Ideal extends TypeData {
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();

        @JvmField
        public final String bank;

        @JvmField
        public final String bankIdentifierCode;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Ideal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ideal(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ideal[] newArray(int i) {
                return new Ideal[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ideal)) {
                return false;
            }
            Ideal ideal = (Ideal) other;
            return Intrinsics.areEqual(this.bank, ideal.bank) && Intrinsics.areEqual(this.bankIdentifierCode, ideal.bankIdentifierCode);
        }

        public int hashCode() {
            String str = this.bank;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankIdentifierCode;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + this.bank + ", bankIdentifierCode=" + this.bankIdentifierCode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bank);
            parcel.writeString(this.bankIdentifierCode);
        }

        public Ideal(String str, String str2) {
            super(null);
            this.bank = str;
            this.bankIdentifierCode = str2;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "bank", "accountHolderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Fpx extends TypeData {
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();

        @JvmField
        public final String accountHolderType;

        @JvmField
        public final String bank;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Fpx> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Fpx(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fpx[] newArray(int i) {
                return new Fpx[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fpx)) {
                return false;
            }
            Fpx fpx = (Fpx) other;
            return Intrinsics.areEqual(this.bank, fpx.bank) && Intrinsics.areEqual(this.accountHolderType, fpx.accountHolderType);
        }

        public int hashCode() {
            String str = this.bank;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderType;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + this.bank + ", accountHolderType=" + this.accountHolderType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bank);
            parcel.writeString(this.accountHolderType);
        }

        public Fpx(String str, String str2) {
            super(null);
            this.bank = str;
            this.accountHolderType = str2;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "bankCode", "branchCode", PlaceTypes.COUNTRY, "fingerprint", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class SepaDebit extends TypeData {
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();

        @JvmField
        public final String bankCode;

        @JvmField
        public final String branchCode;

        @JvmField
        public final String country;

        @JvmField
        public final String fingerprint;

        @JvmField
        public final String last4;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SepaDebit)) {
                return false;
            }
            SepaDebit sepaDebit = (SepaDebit) other;
            return Intrinsics.areEqual(this.bankCode, sepaDebit.bankCode) && Intrinsics.areEqual(this.branchCode, sepaDebit.branchCode) && Intrinsics.areEqual(this.country, sepaDebit.country) && Intrinsics.areEqual(this.fingerprint, sepaDebit.fingerprint) && Intrinsics.areEqual(this.last4, sepaDebit.last4);
        }

        public int hashCode() {
            String str = this.bankCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerprint;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.bankCode + ", branchCode=" + this.branchCode + ", country=" + this.country + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bankCode);
            parcel.writeString(this.branchCode);
            parcel.writeString(this.country);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerprint = str4;
            this.last4 = str5;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "bsbNumber", "fingerprint", "last4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AuBecsDebit extends TypeData {
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();

        @JvmField
        public final String bsbNumber;

        @JvmField
        public final String fingerprint;

        @JvmField
        public final String last4;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AuBecsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit[] newArray(int i) {
                return new AuBecsDebit[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) other;
            return Intrinsics.areEqual(this.bsbNumber, auBecsDebit.bsbNumber) && Intrinsics.areEqual(this.fingerprint, auBecsDebit.fingerprint) && Intrinsics.areEqual(this.last4, auBecsDebit.last4);
        }

        public int hashCode() {
            String str = this.bsbNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fingerprint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.bsbNumber + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }

        public AuBecsDebit(String str, String str2, String str3) {
            super(null);
            this.bsbNumber = str;
            this.fingerprint = str2;
            this.last4 = str3;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "fingerprint", "last4", "sortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class BacsDebit extends TypeData {
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();

        @JvmField
        public final String fingerprint;

        @JvmField
        public final String last4;

        @JvmField
        public final String sortCode;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) other;
            return Intrinsics.areEqual(this.fingerprint, bacsDebit.fingerprint) && Intrinsics.areEqual(this.last4, bacsDebit.last4) && Intrinsics.areEqual(this.sortCode, bacsDebit.sortCode);
        }

        public int hashCode() {
            String str = this.fingerprint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.last4;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sortCode;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ", sortCode=" + this.sortCode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
            parcel.writeString(this.sortCode);
        }

        public BacsDebit(String str, String str2, String str3) {
            super(null);
            this.fingerprint = str;
            this.last4 = str2;
            this.sortCode = str3;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Sofort extends TypeData {
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();

        @JvmField
        public final String country;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Sofort> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sofort[] newArray(int i) {
                return new Sofort[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sofort) && Intrinsics.areEqual(this.country, ((Sofort) other).country);
        }

        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.country + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.country);
        }

        public Sofort(String str) {
            super(null);
            this.country = str;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "vpa", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Upi extends TypeData {
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();

        @JvmField
        public final String vpa;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Upi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Upi[] newArray(int i) {
                return new Upi[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Upi) && Intrinsics.areEqual(this.vpa, ((Upi) other).vpa);
        }

        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.vpa + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.vpa);
        }

        public Upi(String str) {
            super(null);
            this.vpa = str;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "", "bank", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Netbanking extends TypeData {
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();

        @JvmField
        public final String bank;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Netbanking> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Netbanking[] newArray(int i) {
                return new Netbanking[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Netbanking) && Intrinsics.areEqual(this.bank, ((Netbanking) other).bank);
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.bank);
        }

        public Netbanking(String str) {
            super(null);
            this.bank = str;
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0003()*BU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u0012\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount;", "Lcom/stripe/android/model/PaymentMethod$TypeData;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "accountHolderType", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "accountType", "", "bankName", "fingerprint", "last4", "financialConnectionsAccount", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;", "networks", "routingNumber", "<init>", "(Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "Ljava/lang/String;", "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;", "linkedAccount", "getLinkedAccount$annotations", "()V", "USBankAccountHolderType", "USBankAccountType", "USBankNetworks", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class USBankAccount extends TypeData {
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();

        @JvmField
        public final USBankAccountHolderType accountHolderType;

        @JvmField
        public final USBankAccountType accountType;

        @JvmField
        public final String bankName;

        @JvmField
        public final String financialConnectionsAccount;

        @JvmField
        public final String fingerprint;

        @JvmField
        public final String last4;

        @JvmField
        public final String linkedAccount;

        @JvmField
        public final USBankNetworks networks;

        @JvmField
        public final String routingNumber;

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccount(USBankAccountHolderType.CREATOR.createFromParcel(parcel), USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : USBankNetworks.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i) {
                return new USBankAccount[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return this.accountHolderType == uSBankAccount.accountHolderType && this.accountType == uSBankAccount.accountType && Intrinsics.areEqual(this.bankName, uSBankAccount.bankName) && Intrinsics.areEqual(this.fingerprint, uSBankAccount.fingerprint) && Intrinsics.areEqual(this.last4, uSBankAccount.last4) && Intrinsics.areEqual(this.financialConnectionsAccount, uSBankAccount.financialConnectionsAccount) && Intrinsics.areEqual(this.networks, uSBankAccount.networks) && Intrinsics.areEqual(this.routingNumber, uSBankAccount.routingNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.accountHolderType.hashCode() * 31) + this.accountType.hashCode()) * 31;
            String str = this.bankName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fingerprint;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.financialConnectionsAccount;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            USBankNetworks uSBankNetworks = this.networks;
            int iHashCode6 = (iHashCode5 + (uSBankNetworks == null ? 0 : uSBankNetworks.hashCode())) * 31;
            String str5 = this.routingNumber;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.accountHolderType + ", accountType=" + this.accountType + ", bankName=" + this.bankName + ", fingerprint=" + this.fingerprint + ", last4=" + this.last4 + ", financialConnectionsAccount=" + this.financialConnectionsAccount + ", networks=" + this.networks + ", routingNumber=" + this.routingNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.accountHolderType.writeToParcel(parcel, flags);
            this.accountType.writeToParcel(parcel, flags);
            parcel.writeString(this.bankName);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
            parcel.writeString(this.financialConnectionsAccount);
            USBankNetworks uSBankNetworks = this.networks;
            if (uSBankNetworks == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                uSBankNetworks.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.routingNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public USBankAccount(USBankAccountHolderType accountHolderType, USBankAccountType accountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            this.accountHolderType = accountHolderType;
            this.accountType = accountType;
            this.bankName = str;
            this.fingerprint = str2;
            this.last4 = str3;
            this.financialConnectionsAccount = str4;
            this.networks = uSBankNetworks;
            this.routingNumber = str5;
            this.linkedAccount = str4;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;", "", "Lcom/stripe/android/core/model/StripeModel;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UNKNOWN", "INDIVIDUAL", "COMPANY", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class USBankAccountHolderType implements StripeModel {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ USBankAccountHolderType[] $VALUES;
            public static final Parcelable.Creator<USBankAccountHolderType> CREATOR;
            private final String value;
            public static final USBankAccountHolderType UNKNOWN = new USBankAccountHolderType("UNKNOWN", 0, "unknown");
            public static final USBankAccountHolderType INDIVIDUAL = new USBankAccountHolderType("INDIVIDUAL", 1, "individual");
            public static final USBankAccountHolderType COMPANY = new USBankAccountHolderType("COMPANY", 2, "company");

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<USBankAccountHolderType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return USBankAccountHolderType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType[] newArray(int i) {
                    return new USBankAccountHolderType[i];
                }
            }

            private static final /* synthetic */ USBankAccountHolderType[] $values() {
                return new USBankAccountHolderType[]{UNKNOWN, INDIVIDUAL, COMPANY};
            }

            public static EnumEntries<USBankAccountHolderType> getEntries() {
                return $ENTRIES;
            }

            public static USBankAccountHolderType valueOf(String str) {
                return (USBankAccountHolderType) Enum.valueOf(USBankAccountHolderType.class, str);
            }

            public static USBankAccountHolderType[] values() {
                return (USBankAccountHolderType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(name());
            }

            private USBankAccountHolderType(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                USBankAccountHolderType[] uSBankAccountHolderTypeArr$values = $values();
                $VALUES = uSBankAccountHolderTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(uSBankAccountHolderTypeArr$values);
                CREATOR = new Creator();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;", "", "Lcom/stripe/android/core/model/StripeModel;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UNKNOWN", "CHECKING", "SAVINGS", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class USBankAccountType implements StripeModel {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ USBankAccountType[] $VALUES;
            public static final Parcelable.Creator<USBankAccountType> CREATOR;
            private final String value;
            public static final USBankAccountType UNKNOWN = new USBankAccountType("UNKNOWN", 0, "unknown");
            public static final USBankAccountType CHECKING = new USBankAccountType("CHECKING", 1, "checking");
            public static final USBankAccountType SAVINGS = new USBankAccountType("SAVINGS", 2, "savings");

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<USBankAccountType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return USBankAccountType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccountType[] newArray(int i) {
                    return new USBankAccountType[i];
                }
            }

            private static final /* synthetic */ USBankAccountType[] $values() {
                return new USBankAccountType[]{UNKNOWN, CHECKING, SAVINGS};
            }

            public static EnumEntries<USBankAccountType> getEntries() {
                return $ENTRIES;
            }

            public static USBankAccountType valueOf(String str) {
                return (USBankAccountType) Enum.valueOf(USBankAccountType.class, str);
            }

            public static USBankAccountType[] values() {
                return (USBankAccountType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(name());
            }

            private USBankAccountType(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                USBankAccountType[] uSBankAccountTypeArr$values = $values();
                $VALUES = uSBankAccountTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(uSBankAccountTypeArr$values);
                CREATOR = new Creator();
            }
        }

        /* compiled from: PaymentMethod.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankNetworks;", "Lcom/stripe/android/core/model/StripeModel;", "", "preferred", "", "supported", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPreferred", "Ljava/util/List;", "getSupported", "()Ljava/util/List;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class USBankNetworks implements StripeModel {
            public static final Parcelable.Creator<USBankNetworks> CREATOR = new Creator();
            private final String preferred;
            private final List<String> supported;

            /* compiled from: PaymentMethod.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<USBankNetworks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankNetworks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new USBankNetworks(parcel.readString(), parcel.createStringArrayList());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankNetworks[] newArray(int i) {
                    return new USBankNetworks[i];
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof USBankNetworks)) {
                    return false;
                }
                USBankNetworks uSBankNetworks = (USBankNetworks) other;
                return Intrinsics.areEqual(this.preferred, uSBankNetworks.preferred) && Intrinsics.areEqual(this.supported, uSBankNetworks.supported);
            }

            public int hashCode() {
                String str = this.preferred;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.supported.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + this.preferred + ", supported=" + this.supported + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.preferred);
                parcel.writeStringList(this.supported);
            }

            public USBankNetworks(String str, List<String> supported) {
                Intrinsics.checkNotNullParameter(supported, "supported");
                this.preferred = str;
                this.supported = supported;
            }
        }
    }
}
