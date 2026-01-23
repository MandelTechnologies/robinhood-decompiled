package com.robinhood.android.history.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.options.contracts.OptionOrderDetailFragmentKey;
import com.robinhood.android.slip.contracts.SlipGroupedPaymentDetailFragmentKey;
import com.robinhood.android.transfers.contracts.PaymentIntentHistoryDetailKey;
import com.robinhood.android.transfers.contracts.UkBankTransferFragmentKey;
import com.robinhood.shared.crypto.contracts.orderDetail.CryptoOrderDetailFragmentKey;
import com.robinhood.utils.Either;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyDetailFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/LegacyDetailFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "type", "Lcom/robinhood/android/history/contracts/LegacyDetailType;", "uuid", "Ljava/util/UUID;", "tint", "", "fromDeepLink", "", "<init>", "(Lcom/robinhood/android/history/contracts/LegacyDetailType;Ljava/util/UUID;Ljava/lang/String;Z)V", "getType", "()Lcom/robinhood/android/history/contracts/LegacyDetailType;", "getUuid", "()Ljava/util/UUID;", "getTint", "()Ljava/lang/String;", "getFromDeepLink", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LegacyDetailFragmentKey implements FragmentKey, TabFragmentKey {
    private final boolean fromDeepLink;
    private final String tint;
    private final LegacyDetailType type;
    private final UUID uuid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LegacyDetailFragmentKey> CREATOR = new Creator();

    /* compiled from: LegacyDetailFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<LegacyDetailFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyDetailFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegacyDetailFragmentKey(LegacyDetailType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegacyDetailFragmentKey[] newArray(int i) {
            return new LegacyDetailFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type.name());
        dest.writeSerializable(this.uuid);
        dest.writeString(this.tint);
        dest.writeInt(this.fromDeepLink ? 1 : 0);
    }

    public LegacyDetailFragmentKey(LegacyDetailType type2, UUID uuid, String str, boolean z) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.uuid = uuid;
        this.tint = str;
        this.fromDeepLink = z;
    }

    public /* synthetic */ LegacyDetailFragmentKey(LegacyDetailType legacyDetailType, UUID uuid, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(legacyDetailType, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z);
    }

    public final LegacyDetailType getType() {
        return this.type;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public final String getTint() {
        return this.tint;
    }

    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }

    /* compiled from: LegacyDetailFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/history/contracts/LegacyDetailFragmentKey$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "type", "Lcom/robinhood/android/history/contracts/DetailType;", "uuid", "Ljava/util/UUID;", "tint", "", "fromDeepLink", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {

        /* compiled from: LegacyDetailFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DetailType.New.values().length];
                try {
                    iArr[DetailType.New.CRYPTO_ORDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DetailType.New.OPTION_ORDER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DetailType.New.UK_BANK_TRANSFER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DetailType.New.PAYMENT_INTENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DetailType.New.SLIP_GROUPED_PAYMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ FragmentKey from$default(Companion companion, DetailType detailType, UUID uuid, String str, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.from(detailType, uuid, str, z);
        }

        public final FragmentKey from(DetailType type2, UUID uuid, String tint, boolean fromDeepLink) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Either<LegacyDetailType, DetailType.New> subType = type2.getSubType();
            if (!(subType instanceof Either.Right)) {
                if (!(subType instanceof Either.Left)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new LegacyDetailFragmentKey((LegacyDetailType) ((Either.Left) subType).getValue(), uuid, tint, fromDeepLink);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[((DetailType.New) ((Either.Right) subType).getValue()).ordinal()];
            if (i == 1) {
                return new CryptoOrderDetailFragmentKey(uuid);
            }
            if (i == 2) {
                return new OptionOrderDetailFragmentKey(uuid);
            }
            if (i == 3) {
                return new UkBankTransferFragmentKey(uuid);
            }
            if (i == 4) {
                return new PaymentIntentHistoryDetailKey(uuid);
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return new SlipGroupedPaymentDetailFragmentKey(uuid);
        }
    }
}
