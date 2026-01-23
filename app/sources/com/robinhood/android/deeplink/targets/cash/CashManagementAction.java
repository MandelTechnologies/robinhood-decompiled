package com.robinhood.android.deeplink.targets.cash;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.shared.models.history.shared.TransactionReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashManagementAction.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "Landroid/os/Parcelable;", "<init>", "()V", "source", "", "getSource", "()Ljava/lang/String;", "CardActions", "CardActivation", "CardRestrictedSupport", "ChangePin", "CheckHistory", "CreateDispute", "History", "Home", "ReportDamaged", "ReportLost", "ReportStolen", "Transaction", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CardActions;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CardActivation;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CardRestrictedSupport;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ChangePin;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CheckHistory;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CreateDispute;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$History;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$Home;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ReportDamaged;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ReportLost;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ReportStolen;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$Transaction;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CashManagementAction implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ CashManagementAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String getSource() {
        return null;
    }

    private CashManagementAction() {
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CardActions;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CardActions extends CashManagementAction {
        public static final int $stable = 0;
        public static final CardActions INSTANCE = new CardActions();
        public static final Parcelable.Creator<CardActions> CREATOR = new Creator();

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CardActions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardActions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardActions.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardActions[] newArray(int i) {
                return new CardActions[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CardActions() {
            super(null);
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CardActivation;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CardActivation extends CashManagementAction {
        public static final int $stable = 0;
        public static final CardActivation INSTANCE = new CardActivation();
        public static final Parcelable.Creator<CardActivation> CREATOR = new Creator();

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CardActivation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardActivation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardActivation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardActivation[] newArray(int i) {
                return new CardActivation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CardActivation() {
            super(null);
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CardRestrictedSupport;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CardRestrictedSupport extends CashManagementAction {
        public static final int $stable = 0;
        public static final CardRestrictedSupport INSTANCE = new CardRestrictedSupport();
        public static final Parcelable.Creator<CardRestrictedSupport> CREATOR = new Creator();

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CardRestrictedSupport> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardRestrictedSupport createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardRestrictedSupport.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardRestrictedSupport[] newArray(int i) {
                return new CardRestrictedSupport[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CardRestrictedSupport() {
            super(null);
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ChangePin;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChangePin extends CashManagementAction {
        public static final int $stable = 0;
        public static final ChangePin INSTANCE = new ChangePin();
        public static final Parcelable.Creator<ChangePin> CREATOR = new Creator();

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangePin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangePin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangePin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangePin[] newArray(int i) {
                return new ChangePin[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ChangePin() {
            super(null);
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CheckHistory;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "checkId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCheckId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CheckHistory extends CashManagementAction {
        public static final int $stable = 8;
        public static final Parcelable.Creator<CheckHistory> CREATOR = new Creator();
        private final UUID checkId;

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CheckHistory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckHistory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckHistory((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CheckHistory[] newArray(int i) {
                return new CheckHistory[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CheckHistory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CheckHistory copy$default(CheckHistory checkHistory, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = checkHistory.checkId;
            }
            return checkHistory.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCheckId() {
            return this.checkId;
        }

        public final CheckHistory copy(UUID checkId) {
            return new CheckHistory(checkId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckHistory) && Intrinsics.areEqual(this.checkId, ((CheckHistory) other).checkId);
        }

        public int hashCode() {
            UUID uuid = this.checkId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "CheckHistory(checkId=" + this.checkId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.checkId);
        }

        public CheckHistory(UUID uuid) {
            super(null);
            this.checkId = uuid;
        }

        public /* synthetic */ CheckHistory(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        public final UUID getCheckId() {
            return this.checkId;
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$CreateDispute;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "transactionId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getTransactionId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateDispute extends CashManagementAction {
        public static final int $stable = 8;
        public static final Parcelable.Creator<CreateDispute> CREATOR = new Creator();
        private final UUID transactionId;

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CreateDispute> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateDispute createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateDispute((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateDispute[] newArray(int i) {
                return new CreateDispute[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CreateDispute() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CreateDispute copy$default(CreateDispute createDispute, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = createDispute.transactionId;
            }
            return createDispute.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getTransactionId() {
            return this.transactionId;
        }

        public final CreateDispute copy(UUID transactionId) {
            return new CreateDispute(transactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateDispute) && Intrinsics.areEqual(this.transactionId, ((CreateDispute) other).transactionId);
        }

        public int hashCode() {
            UUID uuid = this.transactionId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "CreateDispute(transactionId=" + this.transactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.transactionId);
        }

        public CreateDispute(UUID uuid) {
            super(null);
            this.transactionId = uuid;
        }

        public /* synthetic */ CreateDispute(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        public final UUID getTransactionId() {
            return this.transactionId;
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$History;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "itemId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getItemId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class History extends CashManagementAction {
        public static final int $stable = 8;
        public static final Parcelable.Creator<History> CREATOR = new Creator();
        private final UUID itemId;

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<History> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final History createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new History((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final History[] newArray(int i) {
                return new History[i];
            }
        }

        public static /* synthetic */ History copy$default(History history, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = history.itemId;
            }
            return history.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getItemId() {
            return this.itemId;
        }

        public final History copy(UUID itemId) {
            return new History(itemId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof History) && Intrinsics.areEqual(this.itemId, ((History) other).itemId);
        }

        public int hashCode() {
            UUID uuid = this.itemId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "History(itemId=" + this.itemId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.itemId);
        }

        public History(UUID uuid) {
            super(null);
            this.itemId = uuid;
        }

        public final UUID getItemId() {
            return this.itemId;
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$Home;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "source", "", "scrollTo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getScrollTo", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Home extends CashManagementAction {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Home> CREATOR = new Creator();
        private final String scrollTo;
        private final String source;

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Home> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home[] newArray(int i) {
                return new Home[i];
            }
        }

        public static /* synthetic */ Home copy$default(Home home, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = home.source;
            }
            if ((i & 2) != 0) {
                str2 = home.scrollTo;
            }
            return home.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScrollTo() {
            return this.scrollTo;
        }

        public final Home copy(String source, String scrollTo) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Home(source, scrollTo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Home)) {
                return false;
            }
            Home home = (Home) other;
            return Intrinsics.areEqual(this.source, home.source) && Intrinsics.areEqual(this.scrollTo, home.scrollTo);
        }

        public int hashCode() {
            int iHashCode = this.source.hashCode() * 31;
            String str = this.scrollTo;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Home(source=" + this.source + ", scrollTo=" + this.scrollTo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
            dest.writeString(this.scrollTo);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Home(String source, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.scrollTo = str;
        }

        public /* synthetic */ Home(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getScrollTo() {
            return this.scrollTo;
        }

        @Override // com.robinhood.android.deeplink.targets.cash.CashManagementAction
        public String getSource() {
            return this.source;
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ReportDamaged;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReportDamaged extends CashManagementAction {
        public static final int $stable = 0;
        public static final ReportDamaged INSTANCE = new ReportDamaged();
        public static final Parcelable.Creator<ReportDamaged> CREATOR = new Creator();

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReportDamaged> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReportDamaged createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReportDamaged.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReportDamaged[] newArray(int i) {
                return new ReportDamaged[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ReportDamaged() {
            super(null);
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ReportLost;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReportLost extends CashManagementAction {
        public static final int $stable = 0;
        public static final ReportLost INSTANCE = new ReportLost();
        public static final Parcelable.Creator<ReportLost> CREATOR = new Creator();

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReportLost> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReportLost createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReportLost.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReportLost[] newArray(int i) {
                return new ReportLost[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ReportLost() {
            super(null);
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$ReportStolen;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReportStolen extends CashManagementAction {
        public static final int $stable = 0;
        public static final ReportStolen INSTANCE = new ReportStolen();
        public static final Parcelable.Creator<ReportStolen> CREATOR = new Creator();

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ReportStolen> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReportStolen createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReportStolen.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReportStolen[] newArray(int i) {
                return new ReportStolen[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ReportStolen() {
            super(null);
        }
    }

    /* compiled from: CashManagementAction.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction$Transaction;", "Lcom/robinhood/android/deeplink/targets/cash/CashManagementAction;", "reference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "<init>", "(Lcom/robinhood/shared/models/history/shared/TransactionReference;)V", "getReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Transaction extends CashManagementAction {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
        private final TransactionReference reference;

        /* compiled from: CashManagementAction.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Transaction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Transaction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transaction((TransactionReference) parcel.readParcelable(Transaction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Transaction[] newArray(int i) {
                return new Transaction[i];
            }
        }

        public static /* synthetic */ Transaction copy$default(Transaction transaction, TransactionReference transactionReference, int i, Object obj) {
            if ((i & 1) != 0) {
                transactionReference = transaction.reference;
            }
            return transaction.copy(transactionReference);
        }

        /* renamed from: component1, reason: from getter */
        public final TransactionReference getReference() {
            return this.reference;
        }

        public final Transaction copy(TransactionReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return new Transaction(reference);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transaction) && Intrinsics.areEqual(this.reference, ((Transaction) other).reference);
        }

        public int hashCode() {
            return this.reference.hashCode();
        }

        public String toString() {
            return "Transaction(reference=" + this.reference + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.reference, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transaction(TransactionReference reference) {
            super(null);
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.reference = reference;
        }

        public final TransactionReference getReference() {
            return this.reference;
        }
    }
}
