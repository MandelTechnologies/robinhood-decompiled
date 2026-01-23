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

/* compiled from: OptionChainIdLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nB\u0017\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;", "Landroid/os/Parcelable;", "optionChainIds", "", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;)V", "getOptionChainIds", "()Ljava/util/List;", "SingleChainId", "MultipleChainIds", "Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode$MultipleChainIds;", "Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode$SingleChainId;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionChainIdLaunchMode implements Parcelable {
    private final List<UUID> optionChainIds;

    public /* synthetic */ OptionChainIdLaunchMode(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private OptionChainIdLaunchMode(List<UUID> list) {
        this.optionChainIds = list;
    }

    public List<UUID> getOptionChainIds() {
        return this.optionChainIds;
    }

    /* compiled from: OptionChainIdLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode$SingleChainId;", "Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;", "Landroid/os/Parcelable;", "optionChainId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOptionChainId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SingleChainId extends OptionChainIdLaunchMode implements Parcelable {
        public static final Parcelable.Creator<SingleChainId> CREATOR = new Creator();
        private final UUID optionChainId;

        /* compiled from: OptionChainIdLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SingleChainId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SingleChainId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleChainId((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SingleChainId[] newArray(int i) {
                return new SingleChainId[i];
            }
        }

        public static /* synthetic */ SingleChainId copy$default(SingleChainId singleChainId, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = singleChainId.optionChainId;
            }
            return singleChainId.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOptionChainId() {
            return this.optionChainId;
        }

        public final SingleChainId copy(UUID optionChainId) {
            Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
            return new SingleChainId(optionChainId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SingleChainId) && Intrinsics.areEqual(this.optionChainId, ((SingleChainId) other).optionChainId);
        }

        public int hashCode() {
            return this.optionChainId.hashCode();
        }

        public String toString() {
            return "SingleChainId(optionChainId=" + this.optionChainId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.optionChainId);
        }

        public final UUID getOptionChainId() {
            return this.optionChainId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleChainId(UUID optionChainId) {
            super(CollectionsKt.listOf(optionChainId), null);
            Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
            this.optionChainId = optionChainId;
        }
    }

    /* compiled from: OptionChainIdLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode$MultipleChainIds;", "Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;", "Landroid/os/Parcelable;", "optionChainIds", "", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;)V", "getOptionChainIds", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleChainIds extends OptionChainIdLaunchMode implements Parcelable {
        public static final Parcelable.Creator<MultipleChainIds> CREATOR = new Creator();
        private final List<UUID> optionChainIds;

        /* compiled from: OptionChainIdLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleChainIds> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChainIds createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new MultipleChainIds(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChainIds[] newArray(int i) {
                return new MultipleChainIds[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleChainIds copy$default(MultipleChainIds multipleChainIds, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = multipleChainIds.optionChainIds;
            }
            return multipleChainIds.copy(list);
        }

        public final List<UUID> component1() {
            return this.optionChainIds;
        }

        public final MultipleChainIds copy(List<UUID> optionChainIds) {
            Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
            return new MultipleChainIds(optionChainIds);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleChainIds) && Intrinsics.areEqual(this.optionChainIds, ((MultipleChainIds) other).optionChainIds);
        }

        public int hashCode() {
            return this.optionChainIds.hashCode();
        }

        public String toString() {
            return "MultipleChainIds(optionChainIds=" + this.optionChainIds + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UUID> list = this.optionChainIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        @Override // com.robinhood.android.options.contracts.OptionChainIdLaunchMode
        public List<UUID> getOptionChainIds() {
            return this.optionChainIds;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleChainIds(List<UUID> optionChainIds) {
            super(optionChainIds, null);
            Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
            this.optionChainIds = optionChainIds;
        }
    }
}
