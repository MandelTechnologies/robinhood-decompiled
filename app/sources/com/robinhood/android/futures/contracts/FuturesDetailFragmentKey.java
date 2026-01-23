package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0010R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "entryPoint", "", "getEntryPoint", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "ByContractId", "ByProductId", "Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey$ByContractId;", "Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey$ByProductId;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface FuturesDetailFragmentKey extends FragmentKey, TabFragmentKey {
    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    FragmentTab getDefaultTab();

    String getEntryPoint();

    Screen getSourceScreen();

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static FragmentTab getDefaultTab(FuturesDetailFragmentKey futuresDetailFragmentKey) {
            return FragmentTab.HOME;
        }
    }

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey$ByContractId;", "Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey;", "futuresContractId", "Ljava/util/UUID;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "entryPoint", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;)V", "getFuturesContractId", "()Ljava/util/UUID;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getEntryPoint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ByContractId implements FuturesDetailFragmentKey {
        public static final Parcelable.Creator<ByContractId> CREATOR = new Creator();
        private final String entryPoint;
        private final UUID futuresContractId;
        private final Screen sourceScreen;

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ByContractId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByContractId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByContractId((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByContractId[] newArray(int i) {
                return new ByContractId[i];
            }
        }

        public static /* synthetic */ ByContractId copy$default(ByContractId byContractId, UUID uuid, Screen screen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = byContractId.futuresContractId;
            }
            if ((i & 2) != 0) {
                screen = byContractId.sourceScreen;
            }
            if ((i & 4) != 0) {
                str = byContractId.entryPoint;
            }
            return byContractId.copy(uuid, screen, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getFuturesContractId() {
            return this.futuresContractId;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final ByContractId copy(UUID futuresContractId, Screen sourceScreen, String entryPoint) {
            Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
            return new ByContractId(futuresContractId, sourceScreen, entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ByContractId)) {
                return false;
            }
            ByContractId byContractId = (ByContractId) other;
            return Intrinsics.areEqual(this.futuresContractId, byContractId.futuresContractId) && Intrinsics.areEqual(this.sourceScreen, byContractId.sourceScreen) && Intrinsics.areEqual(this.entryPoint, byContractId.entryPoint);
        }

        public int hashCode() {
            int iHashCode = this.futuresContractId.hashCode() * 31;
            Screen screen = this.sourceScreen;
            int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
            String str = this.entryPoint;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ByContractId(futuresContractId=" + this.futuresContractId + ", sourceScreen=" + this.sourceScreen + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.futuresContractId);
            dest.writeSerializable(this.sourceScreen);
            dest.writeString(this.entryPoint);
        }

        @Override // com.robinhood.android.futures.contracts.FuturesDetailFragmentKey, com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return DefaultImpls.getDefaultTab(this);
        }

        public ByContractId(UUID futuresContractId, Screen screen, String str) {
            Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
            this.futuresContractId = futuresContractId;
            this.sourceScreen = screen;
            this.entryPoint = str;
        }

        public /* synthetic */ ByContractId(UUID uuid, Screen screen, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? null : str);
        }

        public final UUID getFuturesContractId() {
            return this.futuresContractId;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesDetailFragmentKey
        public Screen getSourceScreen() {
            return this.sourceScreen;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesDetailFragmentKey
        public String getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey$ByProductId;", "Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey;", "futuresProductId", "Ljava/util/UUID;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "entryPoint", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;)V", "getFuturesProductId", "()Ljava/util/UUID;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getEntryPoint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ByProductId implements FuturesDetailFragmentKey {
        public static final Parcelable.Creator<ByProductId> CREATOR = new Creator();
        private final String entryPoint;
        private final UUID futuresProductId;
        private final Screen sourceScreen;

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ByProductId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByProductId createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByProductId((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ByProductId[] newArray(int i) {
                return new ByProductId[i];
            }
        }

        public static /* synthetic */ ByProductId copy$default(ByProductId byProductId, UUID uuid, Screen screen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = byProductId.futuresProductId;
            }
            if ((i & 2) != 0) {
                screen = byProductId.sourceScreen;
            }
            if ((i & 4) != 0) {
                str = byProductId.entryPoint;
            }
            return byProductId.copy(uuid, screen, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getFuturesProductId() {
            return this.futuresProductId;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final ByProductId copy(UUID futuresProductId, Screen sourceScreen, String entryPoint) {
            Intrinsics.checkNotNullParameter(futuresProductId, "futuresProductId");
            return new ByProductId(futuresProductId, sourceScreen, entryPoint);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ByProductId)) {
                return false;
            }
            ByProductId byProductId = (ByProductId) other;
            return Intrinsics.areEqual(this.futuresProductId, byProductId.futuresProductId) && Intrinsics.areEqual(this.sourceScreen, byProductId.sourceScreen) && Intrinsics.areEqual(this.entryPoint, byProductId.entryPoint);
        }

        public int hashCode() {
            int iHashCode = this.futuresProductId.hashCode() * 31;
            Screen screen = this.sourceScreen;
            int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
            String str = this.entryPoint;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ByProductId(futuresProductId=" + this.futuresProductId + ", sourceScreen=" + this.sourceScreen + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.futuresProductId);
            dest.writeSerializable(this.sourceScreen);
            dest.writeString(this.entryPoint);
        }

        @Override // com.robinhood.android.futures.contracts.FuturesDetailFragmentKey, com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return DefaultImpls.getDefaultTab(this);
        }

        public ByProductId(UUID futuresProductId, Screen screen, String str) {
            Intrinsics.checkNotNullParameter(futuresProductId, "futuresProductId");
            this.futuresProductId = futuresProductId;
            this.sourceScreen = screen;
            this.entryPoint = str;
        }

        public /* synthetic */ ByProductId(UUID uuid, Screen screen, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? null : str);
        }

        public final UUID getFuturesProductId() {
            return this.futuresProductId;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesDetailFragmentKey
        public Screen getSourceScreen() {
            return this.sourceScreen;
        }

        @Override // com.robinhood.android.futures.contracts.FuturesDetailFragmentKey
        public String getEntryPoint() {
            return this.entryPoint;
        }
    }
}
