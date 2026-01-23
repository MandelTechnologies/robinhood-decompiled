package com.robinhood.android.trading.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityPendingOrderActionKey.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "rhsAccountNumber", "", "equityOrderId", "Ljava/util/UUID;", "action", "Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey$Action;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey$Action;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;)V", "getRhsAccountNumber", "()Ljava/lang/String;", "getEquityOrderId", "()Ljava/util/UUID;", "getAction", "()Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey$Action;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Action", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class EquityPendingOrderActionKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<EquityPendingOrderActionKey> CREATOR = new Creator();
    private final Action action;
    private final UUID equityOrderId;
    private final EquityOrderFlowSource flowSource;
    private final String rhsAccountNumber;

    /* compiled from: EquityPendingOrderActionKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<EquityPendingOrderActionKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityPendingOrderActionKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EquityPendingOrderActionKey(parcel.readString(), (UUID) parcel.readSerializable(), Action.valueOf(parcel.readString()), EquityOrderFlowSource.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityPendingOrderActionKey[] newArray(int i) {
            return new EquityPendingOrderActionKey[i];
        }
    }

    public static /* synthetic */ EquityPendingOrderActionKey copy$default(EquityPendingOrderActionKey equityPendingOrderActionKey, String str, UUID uuid, Action action, EquityOrderFlowSource equityOrderFlowSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityPendingOrderActionKey.rhsAccountNumber;
        }
        if ((i & 2) != 0) {
            uuid = equityPendingOrderActionKey.equityOrderId;
        }
        if ((i & 4) != 0) {
            action = equityPendingOrderActionKey.action;
        }
        if ((i & 8) != 0) {
            equityOrderFlowSource = equityPendingOrderActionKey.flowSource;
        }
        return equityPendingOrderActionKey.copy(str, uuid, action, equityOrderFlowSource);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getEquityOrderId() {
        return this.equityOrderId;
    }

    /* renamed from: component3, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final EquityOrderFlowSource getFlowSource() {
        return this.flowSource;
    }

    public final EquityPendingOrderActionKey copy(String rhsAccountNumber, UUID equityOrderId, Action action, EquityOrderFlowSource flowSource) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(equityOrderId, "equityOrderId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(flowSource, "flowSource");
        return new EquityPendingOrderActionKey(rhsAccountNumber, equityOrderId, action, flowSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityPendingOrderActionKey)) {
            return false;
        }
        EquityPendingOrderActionKey equityPendingOrderActionKey = (EquityPendingOrderActionKey) other;
        return Intrinsics.areEqual(this.rhsAccountNumber, equityPendingOrderActionKey.rhsAccountNumber) && Intrinsics.areEqual(this.equityOrderId, equityPendingOrderActionKey.equityOrderId) && this.action == equityPendingOrderActionKey.action && this.flowSource == equityPendingOrderActionKey.flowSource;
    }

    public int hashCode() {
        return (((((this.rhsAccountNumber.hashCode() * 31) + this.equityOrderId.hashCode()) * 31) + this.action.hashCode()) * 31) + this.flowSource.hashCode();
    }

    public String toString() {
        return "EquityPendingOrderActionKey(rhsAccountNumber=" + this.rhsAccountNumber + ", equityOrderId=" + this.equityOrderId + ", action=" + this.action + ", flowSource=" + this.flowSource + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rhsAccountNumber);
        dest.writeSerializable(this.equityOrderId);
        dest.writeString(this.action.name());
        dest.writeString(this.flowSource.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public EquityPendingOrderActionKey(String rhsAccountNumber, UUID equityOrderId, Action action, EquityOrderFlowSource flowSource) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(equityOrderId, "equityOrderId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(flowSource, "flowSource");
        this.rhsAccountNumber = rhsAccountNumber;
        this.equityOrderId = equityOrderId;
        this.action = action;
        this.flowSource = flowSource;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final UUID getEquityOrderId() {
        return this.equityOrderId;
    }

    public final Action getAction() {
        return this.action;
    }

    public final EquityOrderFlowSource getFlowSource() {
        return this.flowSource;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityPendingOrderActionKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityPendingOrderActionKey$Action;", "", "<init>", "(Ljava/lang/String;I)V", "CANCEL", "REPLACE", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action CANCEL = new Action("CANCEL", 0);
        public static final Action REPLACE = new Action("REPLACE", 1);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{CANCEL, REPLACE};
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i) {
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }
}
