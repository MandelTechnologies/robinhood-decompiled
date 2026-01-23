package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001d\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;", "Landroid/os/Parcelable;", "accountNumber", "", "source", "Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "()Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "OptionPositionId", "AggregatePositionId", "StrategyCode", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$AggregatePositionId;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$OptionPositionId;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$StrategyCode;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsDetailPageLaunchMode implements Parcelable {
    private final String accountNumber;
    private final OptionsDetailPageLaunchMode4 source;

    public /* synthetic */ OptionsDetailPageLaunchMode(String str, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, optionsDetailPageLaunchMode4);
    }

    private OptionsDetailPageLaunchMode(String str, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4) {
        this.accountNumber = str;
        this.source = optionsDetailPageLaunchMode4;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ OptionsDetailPageLaunchMode(String str, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? OptionsDetailPageLaunchMode4.OTHER : optionsDetailPageLaunchMode4, null);
    }

    public OptionsDetailPageLaunchMode4 getSource() {
        return this.source;
    }

    /* compiled from: OptionsDetailPageLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$OptionPositionId;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;", "Lcom/robinhood/android/options/contracts/HasInitialPositionId;", "initialOptionPositionId", "Ljava/util/UUID;", "optionPositionIds", "", "accountNumber", "", "source", "Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "<init>", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;)V", "getInitialOptionPositionId", "()Ljava/util/UUID;", "getOptionPositionIds", "()Ljava/util/List;", "getAccountNumber", "()Ljava/lang/String;", "getSource", "()Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "initialPositionId", "getInitialPositionId", "positionIds", "getPositionIds", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionPositionId extends OptionsDetailPageLaunchMode implements OptionsDetailPageLaunchMode2 {
        public static final Parcelable.Creator<OptionPositionId> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID initialOptionPositionId;
        private final List<UUID> optionPositionIds;
        private final OptionsDetailPageLaunchMode4 source;

        /* compiled from: OptionsDetailPageLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionPositionId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionPositionId createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readSerializable());
                    }
                    arrayList = arrayList2;
                }
                return new OptionPositionId(uuid, arrayList, parcel.readString(), OptionsDetailPageLaunchMode4.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionPositionId[] newArray(int i) {
                return new OptionPositionId[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionPositionId copy$default(OptionPositionId optionPositionId, UUID uuid, List list, String str, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = optionPositionId.initialOptionPositionId;
            }
            if ((i & 2) != 0) {
                list = optionPositionId.optionPositionIds;
            }
            if ((i & 4) != 0) {
                str = optionPositionId.accountNumber;
            }
            if ((i & 8) != 0) {
                optionsDetailPageLaunchMode4 = optionPositionId.source;
            }
            return optionPositionId.copy(uuid, list, str, optionsDetailPageLaunchMode4);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInitialOptionPositionId() {
            return this.initialOptionPositionId;
        }

        public final List<UUID> component2() {
            return this.optionPositionIds;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionsDetailPageLaunchMode4 getSource() {
            return this.source;
        }

        public final OptionPositionId copy(UUID initialOptionPositionId, List<UUID> optionPositionIds, String accountNumber, OptionsDetailPageLaunchMode4 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OptionPositionId(initialOptionPositionId, optionPositionIds, accountNumber, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionPositionId)) {
                return false;
            }
            OptionPositionId optionPositionId = (OptionPositionId) other;
            return Intrinsics.areEqual(this.initialOptionPositionId, optionPositionId.initialOptionPositionId) && Intrinsics.areEqual(this.optionPositionIds, optionPositionId.optionPositionIds) && Intrinsics.areEqual(this.accountNumber, optionPositionId.accountNumber) && this.source == optionPositionId.source;
        }

        public int hashCode() {
            UUID uuid = this.initialOptionPositionId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            List<UUID> list = this.optionPositionIds;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.accountNumber;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "OptionPositionId(initialOptionPositionId=" + this.initialOptionPositionId + ", optionPositionIds=" + this.optionPositionIds + ", accountNumber=" + this.accountNumber + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.initialOptionPositionId);
            List<UUID> list = this.optionPositionIds;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UUID> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeSerializable(it.next());
                }
            }
            dest.writeString(this.accountNumber);
            dest.writeString(this.source.name());
        }

        public final UUID getInitialOptionPositionId() {
            return this.initialOptionPositionId;
        }

        public final List<UUID> getOptionPositionIds() {
            return this.optionPositionIds;
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode
        public String getAccountNumber() {
            return this.accountNumber;
        }

        public /* synthetic */ OptionPositionId(UUID uuid, List list, String str, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, list, str, (i & 8) != 0 ? OptionsDetailPageLaunchMode4.OTHER : optionsDetailPageLaunchMode4);
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode
        public OptionsDetailPageLaunchMode4 getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionPositionId(UUID uuid, List<UUID> list, String str, OptionsDetailPageLaunchMode4 source) {
            super(str, source, null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.initialOptionPositionId = uuid;
            this.optionPositionIds = list;
            this.accountNumber = str;
            this.source = source;
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode2
        public UUID getInitialPositionId() {
            return this.initialOptionPositionId;
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode2
        public List<UUID> getPositionIds() {
            return this.optionPositionIds;
        }
    }

    /* compiled from: OptionsDetailPageLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$AggregatePositionId;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;", "Lcom/robinhood/android/options/contracts/HasInitialPositionId;", "initialAggregateOptionPositionId", "Ljava/util/UUID;", "aggregateOptionPositionIds", "", "accountNumber", "", "source", "Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "<init>", "(Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;)V", "getAccountNumber", "()Ljava/lang/String;", "getSource", "()Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "initialPositionId", "getInitialPositionId", "()Ljava/util/UUID;", "positionIds", "getPositionIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AggregatePositionId extends OptionsDetailPageLaunchMode implements OptionsDetailPageLaunchMode2 {
        public static final Parcelable.Creator<AggregatePositionId> CREATOR = new Creator();
        private final String accountNumber;
        private final List<UUID> aggregateOptionPositionIds;
        private final UUID initialAggregateOptionPositionId;
        private final OptionsDetailPageLaunchMode4 source;

        /* compiled from: OptionsDetailPageLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AggregatePositionId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AggregatePositionId createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readSerializable());
                    }
                    arrayList = arrayList2;
                }
                return new AggregatePositionId(uuid, arrayList, parcel.readString(), OptionsDetailPageLaunchMode4.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AggregatePositionId[] newArray(int i) {
                return new AggregatePositionId[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final UUID getInitialAggregateOptionPositionId() {
            return this.initialAggregateOptionPositionId;
        }

        private final List<UUID> component2() {
            return this.aggregateOptionPositionIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AggregatePositionId copy$default(AggregatePositionId aggregatePositionId, UUID uuid, List list, String str, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = aggregatePositionId.initialAggregateOptionPositionId;
            }
            if ((i & 2) != 0) {
                list = aggregatePositionId.aggregateOptionPositionIds;
            }
            if ((i & 4) != 0) {
                str = aggregatePositionId.accountNumber;
            }
            if ((i & 8) != 0) {
                optionsDetailPageLaunchMode4 = aggregatePositionId.source;
            }
            return aggregatePositionId.copy(uuid, list, str, optionsDetailPageLaunchMode4);
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionsDetailPageLaunchMode4 getSource() {
            return this.source;
        }

        public final AggregatePositionId copy(UUID initialAggregateOptionPositionId, List<UUID> aggregateOptionPositionIds, String accountNumber, OptionsDetailPageLaunchMode4 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AggregatePositionId(initialAggregateOptionPositionId, aggregateOptionPositionIds, accountNumber, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AggregatePositionId)) {
                return false;
            }
            AggregatePositionId aggregatePositionId = (AggregatePositionId) other;
            return Intrinsics.areEqual(this.initialAggregateOptionPositionId, aggregatePositionId.initialAggregateOptionPositionId) && Intrinsics.areEqual(this.aggregateOptionPositionIds, aggregatePositionId.aggregateOptionPositionIds) && Intrinsics.areEqual(this.accountNumber, aggregatePositionId.accountNumber) && this.source == aggregatePositionId.source;
        }

        public int hashCode() {
            UUID uuid = this.initialAggregateOptionPositionId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            List<UUID> list = this.aggregateOptionPositionIds;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.accountNumber;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "AggregatePositionId(initialAggregateOptionPositionId=" + this.initialAggregateOptionPositionId + ", aggregateOptionPositionIds=" + this.aggregateOptionPositionIds + ", accountNumber=" + this.accountNumber + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.initialAggregateOptionPositionId);
            List<UUID> list = this.aggregateOptionPositionIds;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UUID> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeSerializable(it.next());
                }
            }
            dest.writeString(this.accountNumber);
            dest.writeString(this.source.name());
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode
        public String getAccountNumber() {
            return this.accountNumber;
        }

        public /* synthetic */ AggregatePositionId(UUID uuid, List list, String str, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : list, str, (i & 8) != 0 ? OptionsDetailPageLaunchMode4.OTHER : optionsDetailPageLaunchMode4);
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode
        public OptionsDetailPageLaunchMode4 getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AggregatePositionId(UUID uuid, List<UUID> list, String str, OptionsDetailPageLaunchMode4 source) {
            super(str, source, null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.initialAggregateOptionPositionId = uuid;
            this.aggregateOptionPositionIds = list;
            this.accountNumber = str;
            this.source = source;
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode2
        public UUID getInitialPositionId() {
            return this.initialAggregateOptionPositionId;
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode2
        public List<UUID> getPositionIds() {
            UUID uuid;
            List<UUID> list = this.aggregateOptionPositionIds;
            if (list != null && list.size() > 20 && (uuid = this.initialAggregateOptionPositionId) != null) {
                return CollectionsKt.listOf(uuid);
            }
            return this.aggregateOptionPositionIds;
        }
    }

    /* compiled from: OptionsDetailPageLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode$StrategyCode;", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;", "initialStrategyCode", "", "isLegContext", "", "strategyCodeList", "", "accountNumber", "source", "Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;)V", "getInitialStrategyCode", "()Ljava/lang/String;", "()Z", "getStrategyCodeList", "()Ljava/util/List;", "getAccountNumber", "getSource", "()Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StrategyCode extends OptionsDetailPageLaunchMode {
        public static final Parcelable.Creator<StrategyCode> CREATOR = new Creator();
        private final String accountNumber;
        private final String initialStrategyCode;
        private final boolean isLegContext;
        private final OptionsDetailPageLaunchMode4 source;
        private final List<String> strategyCodeList;

        /* compiled from: OptionsDetailPageLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StrategyCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StrategyCode(parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString(), OptionsDetailPageLaunchMode4.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyCode[] newArray(int i) {
                return new StrategyCode[i];
            }
        }

        public static /* synthetic */ StrategyCode copy$default(StrategyCode strategyCode, String str, boolean z, List list, String str2, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = strategyCode.initialStrategyCode;
            }
            if ((i & 2) != 0) {
                z = strategyCode.isLegContext;
            }
            if ((i & 4) != 0) {
                list = strategyCode.strategyCodeList;
            }
            if ((i & 8) != 0) {
                str2 = strategyCode.accountNumber;
            }
            if ((i & 16) != 0) {
                optionsDetailPageLaunchMode4 = strategyCode.source;
            }
            OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode42 = optionsDetailPageLaunchMode4;
            List list2 = list;
            return strategyCode.copy(str, z, list2, str2, optionsDetailPageLaunchMode42);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInitialStrategyCode() {
            return this.initialStrategyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLegContext() {
            return this.isLegContext;
        }

        public final List<String> component3() {
            return this.strategyCodeList;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionsDetailPageLaunchMode4 getSource() {
            return this.source;
        }

        public final StrategyCode copy(String initialStrategyCode, boolean isLegContext, List<String> strategyCodeList, String accountNumber, OptionsDetailPageLaunchMode4 source) {
            Intrinsics.checkNotNullParameter(initialStrategyCode, "initialStrategyCode");
            Intrinsics.checkNotNullParameter(strategyCodeList, "strategyCodeList");
            Intrinsics.checkNotNullParameter(source, "source");
            return new StrategyCode(initialStrategyCode, isLegContext, strategyCodeList, accountNumber, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrategyCode)) {
                return false;
            }
            StrategyCode strategyCode = (StrategyCode) other;
            return Intrinsics.areEqual(this.initialStrategyCode, strategyCode.initialStrategyCode) && this.isLegContext == strategyCode.isLegContext && Intrinsics.areEqual(this.strategyCodeList, strategyCode.strategyCodeList) && Intrinsics.areEqual(this.accountNumber, strategyCode.accountNumber) && this.source == strategyCode.source;
        }

        public int hashCode() {
            int iHashCode = ((((this.initialStrategyCode.hashCode() * 31) + Boolean.hashCode(this.isLegContext)) * 31) + this.strategyCodeList.hashCode()) * 31;
            String str = this.accountNumber;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "StrategyCode(initialStrategyCode=" + this.initialStrategyCode + ", isLegContext=" + this.isLegContext + ", strategyCodeList=" + this.strategyCodeList + ", accountNumber=" + this.accountNumber + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.initialStrategyCode);
            dest.writeInt(this.isLegContext ? 1 : 0);
            dest.writeStringList(this.strategyCodeList);
            dest.writeString(this.accountNumber);
            dest.writeString(this.source.name());
        }

        public final String getInitialStrategyCode() {
            return this.initialStrategyCode;
        }

        public final boolean isLegContext() {
            return this.isLegContext;
        }

        public final List<String> getStrategyCodeList() {
            return this.strategyCodeList;
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode
        public String getAccountNumber() {
            return this.accountNumber;
        }

        public /* synthetic */ StrategyCode(String str, boolean z, List list, String str2, OptionsDetailPageLaunchMode4 optionsDetailPageLaunchMode4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? OptionsDetailPageLaunchMode4.OTHER : optionsDetailPageLaunchMode4);
        }

        @Override // com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode
        public OptionsDetailPageLaunchMode4 getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrategyCode(String initialStrategyCode, boolean z, List<String> strategyCodeList, String str, OptionsDetailPageLaunchMode4 source) {
            super(str, source, null);
            Intrinsics.checkNotNullParameter(initialStrategyCode, "initialStrategyCode");
            Intrinsics.checkNotNullParameter(strategyCodeList, "strategyCodeList");
            Intrinsics.checkNotNullParameter(source, "source");
            this.initialStrategyCode = initialStrategyCode;
            this.isLegContext = z;
            this.strategyCodeList = strategyCodeList;
            this.accountNumber = str;
            this.source = source;
        }
    }
}
