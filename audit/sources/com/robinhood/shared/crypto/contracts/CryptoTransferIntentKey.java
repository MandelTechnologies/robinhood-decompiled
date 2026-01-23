package com.robinhood.shared.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.utils.Preconditions;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+,B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003J?\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "action", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "currencyPairId", "Ljava/util/UUID;", "source", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "checkForUpsell", "", "exitDeeplinkEnrollmentCompleted", "", "<init>", "(Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;Ljava/util/UUID;Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;ZLjava/lang/String;)V", "getAction", "()Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "getCurrencyPairId", "()Ljava/util/UUID;", "getSource", "()Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "getCheckForUpsell", "()Z", "getExitDeeplinkEnrollmentCompleted", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Action", "Source", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class CryptoTransferIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CryptoTransferIntentKey> CREATOR = new Creator();
    private final Action action;
    private final boolean checkForUpsell;
    private final UUID currencyPairId;
    private final String exitDeeplinkEnrollmentCompleted;
    private final Source source;

    /* compiled from: CryptoTransferIntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CryptoTransferIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTransferIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTransferIntentKey(Action.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (Source) parcel.readParcelable(CryptoTransferIntentKey.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTransferIntentKey[] newArray(int i) {
            return new CryptoTransferIntentKey[i];
        }
    }

    public static /* synthetic */ CryptoTransferIntentKey copy$default(CryptoTransferIntentKey cryptoTransferIntentKey, Action action, UUID uuid, Source source, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            action = cryptoTransferIntentKey.action;
        }
        if ((i & 2) != 0) {
            uuid = cryptoTransferIntentKey.currencyPairId;
        }
        if ((i & 4) != 0) {
            source = cryptoTransferIntentKey.source;
        }
        if ((i & 8) != 0) {
            z = cryptoTransferIntentKey.checkForUpsell;
        }
        if ((i & 16) != 0) {
            str = cryptoTransferIntentKey.exitDeeplinkEnrollmentCompleted;
        }
        String str2 = str;
        Source source2 = source;
        return cryptoTransferIntentKey.copy(action, uuid, source2, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component3, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExitDeeplinkEnrollmentCompleted() {
        return this.exitDeeplinkEnrollmentCompleted;
    }

    public final CryptoTransferIntentKey copy(Action action, UUID currencyPairId, Source source, boolean checkForUpsell, String exitDeeplinkEnrollmentCompleted) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        return new CryptoTransferIntentKey(action, currencyPairId, source, checkForUpsell, exitDeeplinkEnrollmentCompleted);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferIntentKey)) {
            return false;
        }
        CryptoTransferIntentKey cryptoTransferIntentKey = (CryptoTransferIntentKey) other;
        return this.action == cryptoTransferIntentKey.action && Intrinsics.areEqual(this.currencyPairId, cryptoTransferIntentKey.currencyPairId) && Intrinsics.areEqual(this.source, cryptoTransferIntentKey.source) && this.checkForUpsell == cryptoTransferIntentKey.checkForUpsell && Intrinsics.areEqual(this.exitDeeplinkEnrollmentCompleted, cryptoTransferIntentKey.exitDeeplinkEnrollmentCompleted);
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        UUID uuid = this.currencyPairId;
        int iHashCode2 = (((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.checkForUpsell)) * 31;
        String str = this.exitDeeplinkEnrollmentCompleted;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTransferIntentKey(action=" + this.action + ", currencyPairId=" + this.currencyPairId + ", source=" + this.source + ", checkForUpsell=" + this.checkForUpsell + ", exitDeeplinkEnrollmentCompleted=" + this.exitDeeplinkEnrollmentCompleted + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.action.name());
        dest.writeSerializable(this.currencyPairId);
        dest.writeParcelable(this.source, flags);
        dest.writeInt(this.checkForUpsell ? 1 : 0);
        dest.writeString(this.exitDeeplinkEnrollmentCompleted);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CryptoTransferIntentKey(Action action, UUID uuid, Source source, boolean z, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(source, "source");
        this.action = action;
        this.currencyPairId = uuid;
        this.source = source;
        this.checkForUpsell = z;
        this.exitDeeplinkEnrollmentCompleted = str;
    }

    public final Action getAction() {
        return this.action;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public /* synthetic */ CryptoTransferIntentKey(Action action, UUID uuid, Source source, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(action, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? Source.Default.INSTANCE : source, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str);
    }

    public final Source getSource() {
        return this.source;
    }

    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }

    public final String getExitDeeplinkEnrollmentCompleted() {
        return this.exitDeeplinkEnrollmentCompleted;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransferIntentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "", "queryParamString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ENROLL", "RECEIVE", "SEND", "SAVE", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String queryParamString;
        public static final Action ENROLL = new Action("ENROLL", 0, "enroll");
        public static final Action RECEIVE = new Action("RECEIVE", 1, "receive");
        public static final Action SEND = new Action("SEND", 2, "send");
        public static final Action SAVE = new Action("SAVE", 3, AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{ENROLL, RECEIVE, SEND, SAVE};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i, String str2) {
            this.queryParamString = str2;
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: CryptoTransferIntentKeys.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action$Companion;", "", "<init>", "()V", "fromQueryParam", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Action;", "queryParam", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Action fromQueryParam(String queryParam) {
                Intrinsics.checkNotNullParameter(queryParam, "queryParam");
                Action action = Action.ENROLL;
                if (Intrinsics.areEqual(queryParam, action.queryParamString)) {
                    return action;
                }
                Action action2 = Action.RECEIVE;
                if (Intrinsics.areEqual(queryParam, action2.queryParamString)) {
                    return action2;
                }
                Action action3 = Action.SEND;
                if (Intrinsics.areEqual(queryParam, action3.queryParamString)) {
                    return action3;
                }
                Action action4 = Action.SAVE;
                if (Intrinsics.areEqual(queryParam, action4.queryParamString)) {
                    return action4;
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(queryParam);
                throw new ExceptionsH();
            }
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: CryptoTransferIntentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "Landroid/os/Parcelable;", "<init>", "()V", "isFromGateway", "", "()Z", "Default", "Gateway", "CryptoFeesDepositIncentive", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source$CryptoFeesDepositIncentive;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source$Default;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source$Gateway;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class Source implements Parcelable {
        public /* synthetic */ Source(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Source() {
        }

        /* compiled from: CryptoTransferIntentKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source$Default;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Default extends Source {
            public static final Default INSTANCE = new Default();
            public static final Parcelable.Creator<Default> CREATOR = new Creator();

            /* compiled from: CryptoTransferIntentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Default> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i) {
                    return new Default[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Default);
            }

            public int hashCode() {
                return -325007989;
            }

            public String toString() {
                return "Default";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Default() {
                super(null);
            }
        }

        /* compiled from: CryptoTransferIntentKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source$Gateway;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", PlaceTypes.ADDRESS, "", "network", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getNetwork", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Gateway extends Source {
            public static final Parcelable.Creator<Gateway> CREATOR = new Creator();
            private final String address;
            private final String network;

            /* compiled from: CryptoTransferIntentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Gateway> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Gateway createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Gateway(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Gateway[] newArray(int i) {
                    return new Gateway[i];
                }
            }

            public static /* synthetic */ Gateway copy$default(Gateway gateway, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = gateway.address;
                }
                if ((i & 2) != 0) {
                    str2 = gateway.network;
                }
                return gateway.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAddress() {
                return this.address;
            }

            /* renamed from: component2, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            public final Gateway copy(String address, String network) {
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(network, "network");
                return new Gateway(address, network);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Gateway)) {
                    return false;
                }
                Gateway gateway = (Gateway) other;
                return Intrinsics.areEqual(this.address, gateway.address) && Intrinsics.areEqual(this.network, gateway.network);
            }

            public int hashCode() {
                return (this.address.hashCode() * 31) + this.network.hashCode();
            }

            public String toString() {
                return "Gateway(address=" + this.address + ", network=" + this.network + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.address);
                dest.writeString(this.network);
            }

            public final String getAddress() {
                return this.address;
            }

            public final String getNetwork() {
                return this.network;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Gateway(String address, String network) {
                super(null);
                Intrinsics.checkNotNullParameter(address, "address");
                Intrinsics.checkNotNullParameter(network, "network");
                this.address = address;
                this.network = network;
            }
        }

        /* compiled from: CryptoTransferIntentKeys.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source$CryptoFeesDepositIncentive;", "Lcom/robinhood/shared/crypto/contracts/CryptoTransferIntentKey$Source;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CryptoFeesDepositIncentive extends Source {
            public static final CryptoFeesDepositIncentive INSTANCE = new CryptoFeesDepositIncentive();
            public static final Parcelable.Creator<CryptoFeesDepositIncentive> CREATOR = new Creator();

            /* compiled from: CryptoTransferIntentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CryptoFeesDepositIncentive> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CryptoFeesDepositIncentive createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CryptoFeesDepositIncentive.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CryptoFeesDepositIncentive[] newArray(int i) {
                    return new CryptoFeesDepositIncentive[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CryptoFeesDepositIncentive);
            }

            public int hashCode() {
                return 1913801489;
            }

            public String toString() {
                return "CryptoFeesDepositIncentive";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private CryptoFeesDepositIncentive() {
                super(null);
            }
        }

        public final boolean isFromGateway() {
            return this instanceof Gateway;
        }
    }
}
