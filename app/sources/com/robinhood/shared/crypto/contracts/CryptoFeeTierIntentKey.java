package com.robinhood.shared.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierIntentKey.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\"#B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "launchType", "Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$LaunchType;", "promoExplainer", "Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$PromoExplainer;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$LaunchType;Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$PromoExplainer;)V", "getLaunchType", "()Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$LaunchType;", "getPromoExplainer", "()Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$PromoExplainer;", "navigationType", "Lcom/robinhood/android/navigation/NavigationType;", "getNavigationType", "()Lcom/robinhood/android/navigation/NavigationType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LaunchType", "PromoExplainer", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoFeeTierIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CryptoFeeTierIntentKey> CREATOR = new Creator();
    private final LaunchType launchType;
    private final PromoExplainer promoExplainer;

    /* compiled from: CryptoFeeTierIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoFeeTierIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoFeeTierIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoFeeTierIntentKey(LaunchType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PromoExplainer.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoFeeTierIntentKey[] newArray(int i) {
            return new CryptoFeeTierIntentKey[i];
        }
    }

    /* compiled from: CryptoFeeTierIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LaunchType.values().length];
            try {
                iArr[LaunchType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LaunchType.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CryptoFeeTierIntentKey copy$default(CryptoFeeTierIntentKey cryptoFeeTierIntentKey, LaunchType launchType, PromoExplainer promoExplainer, int i, Object obj) {
        if ((i & 1) != 0) {
            launchType = cryptoFeeTierIntentKey.launchType;
        }
        if ((i & 2) != 0) {
            promoExplainer = cryptoFeeTierIntentKey.promoExplainer;
        }
        return cryptoFeeTierIntentKey.copy(launchType, promoExplainer);
    }

    /* renamed from: component1, reason: from getter */
    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    /* renamed from: component2, reason: from getter */
    public final PromoExplainer getPromoExplainer() {
        return this.promoExplainer;
    }

    public final CryptoFeeTierIntentKey copy(LaunchType launchType, PromoExplainer promoExplainer) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        return new CryptoFeeTierIntentKey(launchType, promoExplainer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoFeeTierIntentKey)) {
            return false;
        }
        CryptoFeeTierIntentKey cryptoFeeTierIntentKey = (CryptoFeeTierIntentKey) other;
        return this.launchType == cryptoFeeTierIntentKey.launchType && this.promoExplainer == cryptoFeeTierIntentKey.promoExplainer;
    }

    public int hashCode() {
        int iHashCode = this.launchType.hashCode() * 31;
        PromoExplainer promoExplainer = this.promoExplainer;
        return iHashCode + (promoExplainer == null ? 0 : promoExplainer.hashCode());
    }

    public String toString() {
        return "CryptoFeeTierIntentKey(launchType=" + this.launchType + ", promoExplainer=" + this.promoExplainer + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.launchType.name());
        PromoExplainer promoExplainer = this.promoExplainer;
        if (promoExplainer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(promoExplainer.name());
        }
    }

    public CryptoFeeTierIntentKey(LaunchType launchType, PromoExplainer promoExplainer) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        this.launchType = launchType;
        this.promoExplainer = promoExplainer;
    }

    public /* synthetic */ CryptoFeeTierIntentKey(LaunchType launchType, PromoExplainer promoExplainer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(launchType, (i & 2) != 0 ? null : promoExplainer);
    }

    public final LaunchType getLaunchType() {
        return this.launchType;
    }

    public final PromoExplainer getPromoExplainer() {
        return this.promoExplainer;
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.launchType.ordinal()];
        if (i == 1) {
            return NavigationType.PRESENT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return NavigationType.PUSH;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoFeeTierIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$LaunchType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "MODAL", "PUSH", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LaunchType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LaunchType[] $VALUES;
        public static final LaunchType MODAL = new LaunchType("MODAL", 0, "modal");
        public static final LaunchType PUSH = new LaunchType("PUSH", 1, "push");
        private final String serverValue;

        private static final /* synthetic */ LaunchType[] $values() {
            return new LaunchType[]{MODAL, PUSH};
        }

        public static EnumEntries<LaunchType> getEntries() {
            return $ENTRIES;
        }

        private LaunchType(String str, int i, String str2) {
            this.serverValue = str2;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            LaunchType[] launchTypeArr$values = $values();
            $VALUES = launchTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(launchTypeArr$values);
        }

        public static LaunchType valueOf(String str) {
            return (LaunchType) Enum.valueOf(LaunchType.class, str);
        }

        public static LaunchType[] values() {
            return (LaunchType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoFeeTierIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$PromoExplainer;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DEPOSIT_INCENTIVE", "UNKNOWN", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PromoExplainer implements RhEnum<PromoExplainer> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PromoExplainer[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PromoExplainer DEPOSIT_INCENTIVE = new PromoExplainer("DEPOSIT_INCENTIVE", 0, "depositIncentive");
        public static final PromoExplainer UNKNOWN = new PromoExplainer("UNKNOWN", 1, "unknown");
        private final String serverValue;

        private static final /* synthetic */ PromoExplainer[] $values() {
            return new PromoExplainer[]{DEPOSIT_INCENTIVE, UNKNOWN};
        }

        @JvmStatic
        public static PromoExplainer fromServerValue(String str) {
            return INSTANCE.fromServerValue(str);
        }

        public static EnumEntries<PromoExplainer> getEntries() {
            return $ENTRIES;
        }

        @JvmStatic
        public static String toServerValue(PromoExplainer promoExplainer) {
            return INSTANCE.toServerValue(promoExplainer);
        }

        private PromoExplainer(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            PromoExplainer[] promoExplainerArr$values = $values();
            $VALUES = promoExplainerArr$values;
            $ENTRIES = EnumEntries2.enumEntries(promoExplainerArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: CryptoFeeTierIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$PromoExplainer$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey$PromoExplainer;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion extends RhEnum.Converter.Defaulted<PromoExplainer> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super(PromoExplainer.values(), PromoExplainer.UNKNOWN, false, 4, null);
            }

            @Override // com.robinhood.enums.RhEnum.Converter
            @JvmStatic
            public String toServerValue(PromoExplainer enumValue) {
                return super.toServerValue((Enum) enumValue);
            }

            @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
            @JvmStatic
            public PromoExplainer fromServerValue(String serverValue) {
                return (PromoExplainer) super.fromServerValue(serverValue);
            }
        }

        public static PromoExplainer valueOf(String str) {
            return (PromoExplainer) Enum.valueOf(PromoExplainer.class, str);
        }

        public static PromoExplainer[] values() {
            return (PromoExplainer[]) $VALUES.clone();
        }
    }
}
