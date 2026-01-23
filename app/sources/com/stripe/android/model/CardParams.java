package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Token;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardParams.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u008d\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u009c\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b2\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u00107R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010AR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010D¨\u0006J"}, m3636d2 = {"Lcom/stripe/android/model/CardParams;", "Lcom/stripe/android/model/TokenParams;", "Lcom/stripe/android/model/CardBrand;", "brand", "", "", "loggingTokens", InquiryField.FloatField.TYPE2, "", "expMonth", "expYear", "cvc", "name", "Lcom/stripe/android/model/Address;", PlaceTypes.ADDRESS, "currency", "Lcom/stripe/android/model/Networks;", "networks", "", "metadata", "<init>", "(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Lcom/stripe/android/model/Networks;Ljava/util/Map;)V", "copy", "(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Lcom/stripe/android/model/Networks;Ljava/util/Map;)Lcom/stripe/android/model/CardParams;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "Ljava/util/Set;", "Ljava/lang/String;", "getNumber", "getNumber$annotations", "()V", "I", "getExpMonth", "getExpYear", "getCvc", "getCvc$annotations", "getName", "setName", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/Address;", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getCurrency", "setCurrency", "Lcom/stripe/android/model/Networks;", "getNetworks", "()Lcom/stripe/android/model/Networks;", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "getTypeDataParams", "typeDataParams", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class CardParams extends TokenParams {
    private Address address;
    private final CardBrand brand;
    private String currency;
    private final String cvc;
    private final int expMonth;
    private final int expYear;
    private final Set<String> loggingTokens;
    private Map<String, String> metadata;
    private String name;
    private final Networks networks;
    private final String number;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardParams> CREATOR = new Creator();

    /* compiled from: CardParams.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CardParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CardBrand cardBrandValueOf = CardBrand.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readString());
            }
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Address addressCreateFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            Networks networksCreateFromParcel = parcel.readInt() == 0 ? null : Networks.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new CardParams(cardBrandValueOf, linkedHashSet, string2, i3, i4, string3, string4, addressCreateFromParcel, string5, networksCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams[] newArray(int i) {
            return new CardParams[i];
        }
    }

    public static /* synthetic */ CardParams copy$default(CardParams cardParams, CardBrand cardBrand, Set set, String str, int i, int i2, String str2, String str3, Address address, String str4, Networks networks, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            cardBrand = cardParams.brand;
        }
        if ((i3 & 2) != 0) {
            set = cardParams.loggingTokens;
        }
        if ((i3 & 4) != 0) {
            str = cardParams.number;
        }
        if ((i3 & 8) != 0) {
            i = cardParams.expMonth;
        }
        if ((i3 & 16) != 0) {
            i2 = cardParams.expYear;
        }
        if ((i3 & 32) != 0) {
            str2 = cardParams.cvc;
        }
        if ((i3 & 64) != 0) {
            str3 = cardParams.name;
        }
        if ((i3 & 128) != 0) {
            address = cardParams.address;
        }
        if ((i3 & 256) != 0) {
            str4 = cardParams.currency;
        }
        if ((i3 & 512) != 0) {
            networks = cardParams.networks;
        }
        if ((i3 & 1024) != 0) {
            map = cardParams.metadata;
        }
        Networks networks2 = networks;
        Map map2 = map;
        Address address2 = address;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        int i4 = i2;
        String str8 = str;
        return cardParams.copy(cardBrand, set, str8, i, i4, str6, str7, address2, str5, networks2, map2);
    }

    public final CardParams copy(CardBrand brand, Set<String> loggingTokens, String number, int expMonth, int expYear, String cvc, String name, Address address, String currency, Networks networks, Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(loggingTokens, "loggingTokens");
        Intrinsics.checkNotNullParameter(number, "number");
        return new CardParams(brand, loggingTokens, number, expMonth, expYear, cvc, name, address, currency, networks, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardParams)) {
            return false;
        }
        CardParams cardParams = (CardParams) other;
        return this.brand == cardParams.brand && Intrinsics.areEqual(this.loggingTokens, cardParams.loggingTokens) && Intrinsics.areEqual(this.number, cardParams.number) && this.expMonth == cardParams.expMonth && this.expYear == cardParams.expYear && Intrinsics.areEqual(this.cvc, cardParams.cvc) && Intrinsics.areEqual(this.name, cardParams.name) && Intrinsics.areEqual(this.address, cardParams.address) && Intrinsics.areEqual(this.currency, cardParams.currency) && Intrinsics.areEqual(this.networks, cardParams.networks) && Intrinsics.areEqual(this.metadata, cardParams.metadata);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.brand.hashCode() * 31) + this.loggingTokens.hashCode()) * 31) + this.number.hashCode()) * 31) + Integer.hashCode(this.expMonth)) * 31) + Integer.hashCode(this.expYear)) * 31;
        String str = this.cvc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.address;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Networks networks = this.networks;
        int iHashCode6 = (iHashCode5 + (networks == null ? 0 : networks.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "CardParams(brand=" + this.brand + ", loggingTokens=" + this.loggingTokens + ", number=" + this.number + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", cvc=" + this.cvc + ", name=" + this.name + ", address=" + this.address + ", currency=" + this.currency + ", networks=" + this.networks + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.brand.name());
        Set<String> set = this.loggingTokens;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        parcel.writeString(this.number);
        parcel.writeInt(this.expMonth);
        parcel.writeInt(this.expYear);
        parcel.writeString(this.cvc);
        parcel.writeString(this.name);
        Address address = this.address;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.currency);
        Networks networks = this.networks;
        if (networks == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            networks.writeToParcel(parcel, flags);
        }
        Map<String, String> map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CardParams(com.stripe.android.model.CardBrand r15, java.util.Set r16, java.lang.String r17, int r18, int r19, java.lang.String r20, java.lang.String r21, com.stripe.android.model.Address r22, java.lang.String r23, com.stripe.android.model.Networks r24, java.util.Map r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            java.util.Set r1 = kotlin.collections.SetsKt.emptySet()
            r4 = r1
            goto Le
        Lc:
            r4 = r16
        Le:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L15
            r8 = r2
            goto L17
        L15:
            r8 = r20
        L17:
            r1 = r0 & 64
            if (r1 == 0) goto L1d
            r9 = r2
            goto L1f
        L1d:
            r9 = r21
        L1f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L25
            r10 = r2
            goto L27
        L25:
            r10 = r22
        L27:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2d
            r11 = r2
            goto L2f
        L2d:
            r11 = r23
        L2f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L35
            r12 = r2
            goto L37
        L35:
            r12 = r24
        L37:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L45
            r13 = r2
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r2 = r14
            goto L4f
        L45:
            r13 = r25
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
        L4f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardParams.<init>(com.stripe.android.model.CardBrand, java.util.Set, java.lang.String, int, int, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, com.stripe.android.model.Networks, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getNumber() {
        return this.number;
    }

    public final int getExpMonth() {
        return this.expMonth;
    }

    public final int getExpYear() {
        return this.expYear;
    }

    public final String getCvc() {
        return this.cvc;
    }

    public final String getName() {
        return this.name;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final Networks getNetworks() {
        return this.networks;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardParams(CardBrand brand, Set<String> loggingTokens, String number, int i, int i2, String str, String str2, Address address, String str3, Networks networks, Map<String, String> map) {
        super(Token.Type.Card, loggingTokens);
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(loggingTokens, "loggingTokens");
        Intrinsics.checkNotNullParameter(number, "number");
        this.brand = brand;
        this.loggingTokens = loggingTokens;
        this.number = number;
        this.expMonth = i;
        this.expYear = i2;
        this.cvc = str;
        this.name = str2;
        this.address = address;
        this.currency = str3;
        this.networks = networks;
        this.metadata = map;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Tuples2 tuples2M3642to = Tuples4.m3642to(InquiryField.FloatField.TYPE2, this.number);
        Tuples2 tuples2M3642to2 = Tuples4.m3642to("exp_month", Integer.valueOf(this.expMonth));
        Tuples2 tuples2M3642to3 = Tuples4.m3642to("exp_year", Integer.valueOf(this.expYear));
        Tuples2 tuples2M3642to4 = Tuples4.m3642to("cvc", this.cvc);
        Tuples2 tuples2M3642to5 = Tuples4.m3642to("name", this.name);
        Tuples2 tuples2M3642to6 = Tuples4.m3642to("currency", this.currency);
        Address address = this.address;
        Tuples2 tuples2M3642to7 = Tuples4.m3642to("address_line1", address != null ? address.getLine1() : null);
        Address address2 = this.address;
        Tuples2 tuples2M3642to8 = Tuples4.m3642to("address_line2", address2 != null ? address2.getLine2() : null);
        Address address3 = this.address;
        Tuples2 tuples2M3642to9 = Tuples4.m3642to("address_city", address3 != null ? address3.getCity() : null);
        Address address4 = this.address;
        Tuples2 tuples2M3642to10 = Tuples4.m3642to("address_state", address4 != null ? address4.getState() : null);
        Address address5 = this.address;
        Tuples2 tuples2M3642to11 = Tuples4.m3642to("address_zip", address5 != null ? address5.getPostalCode() : null);
        Address address6 = this.address;
        List<Tuples2> listListOf = CollectionsKt.listOf((Object[]) new Tuples2[]{tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, tuples2M3642to7, tuples2M3642to8, tuples2M3642to9, tuples2M3642to10, tuples2M3642to11, Tuples4.m3642to("address_country", address6 != null ? address6.getCountry() : null), Tuples4.m3642to("metadata", this.metadata)});
        Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
        for (Tuples2 tuples2 : listListOf) {
            String str = (String) tuples2.component1();
            Object objComponent2 = tuples2.component2();
            Map mapMapOf = objComponent2 != null ? MapsKt.mapOf(Tuples4.m3642to(str, objComponent2)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
        }
        return mapEmptyMap;
    }

    /* compiled from: CardParams.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/model/CardParams$Companion;", "", "()V", "PARAM_ADDRESS_CITY", "", "PARAM_ADDRESS_COUNTRY", "PARAM_ADDRESS_LINE1", "PARAM_ADDRESS_LINE2", "PARAM_ADDRESS_STATE", "PARAM_ADDRESS_ZIP", "PARAM_CURRENCY", "PARAM_CVC", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_METADATA", "PARAM_NAME", "PARAM_NUMBER", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
