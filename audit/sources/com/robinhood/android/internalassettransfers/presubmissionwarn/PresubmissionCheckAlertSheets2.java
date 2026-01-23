package com.robinhood.android.internalassettransfers.presubmissionwarn;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PresubmissionCheckAlertSheets.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "Landroid/os/Parcelable;", "ContinueTransfer", "Close", "GoBack", "Navigate", "NavigateToTransferSelection", "TryAgain", "ExitFlow", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$Close;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$ContinueTransfer;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$ExitFlow;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$GoBack;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$Navigate;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$NavigateToTransferSelection;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$TryAgain;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction, reason: use source file name */
/* loaded from: classes10.dex */
public interface PresubmissionCheckAlertSheets2 extends Parcelable {

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$ContinueTransfer;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$ContinueTransfer */
    public static final /* data */ class ContinueTransfer implements PresubmissionCheckAlertSheets2 {
        public static final int $stable = 0;
        public static final ContinueTransfer INSTANCE = new ContinueTransfer();
        public static final Parcelable.Creator<ContinueTransfer> CREATOR = new Creator();

        /* compiled from: PresubmissionCheckAlertSheets.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$ContinueTransfer$Creator */
        public static final class Creator implements Parcelable.Creator<ContinueTransfer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContinueTransfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContinueTransfer.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ContinueTransfer[] newArray(int i) {
                return new ContinueTransfer[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ContinueTransfer);
        }

        public int hashCode() {
            return -1897434566;
        }

        public String toString() {
            return "ContinueTransfer";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ContinueTransfer() {
        }
    }

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$Close;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$Close */
    public static final /* data */ class Close implements PresubmissionCheckAlertSheets2 {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();
        public static final Parcelable.Creator<Close> CREATOR = new Creator();

        /* compiled from: PresubmissionCheckAlertSheets.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$Close$Creator */
        public static final class Creator implements Parcelable.Creator<Close> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Close createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Close.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Close[] newArray(int i) {
                return new Close[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Close);
        }

        public int hashCode() {
            return -636607888;
        }

        public String toString() {
            return "Close";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Close() {
        }
    }

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$GoBack;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$GoBack */
    public static final /* data */ class GoBack implements PresubmissionCheckAlertSheets2 {
        public static final int $stable = 0;
        public static final GoBack INSTANCE = new GoBack();
        public static final Parcelable.Creator<GoBack> CREATOR = new Creator();

        /* compiled from: PresubmissionCheckAlertSheets.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$GoBack$Creator */
        public static final class Creator implements Parcelable.Creator<GoBack> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoBack createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GoBack.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoBack[] newArray(int i) {
                return new GoBack[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof GoBack);
        }

        public int hashCode() {
            return 1855921271;
        }

        public String toString() {
            return "GoBack";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private GoBack() {
        }
    }

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$Navigate;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$Navigate, reason: from toString */
    public static final /* data */ class Navigate implements PresubmissionCheckAlertSheets2 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Navigate> CREATOR = new Creator();
        private final FragmentKey key;

        /* compiled from: PresubmissionCheckAlertSheets.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$Navigate$Creator */
        public static final class Creator implements Parcelable.Creator<Navigate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Navigate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Navigate((FragmentKey) parcel.readParcelable(Navigate.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Navigate[] newArray(int i) {
                return new Navigate[i];
            }
        }

        public static /* synthetic */ Navigate copy$default(Navigate navigate, FragmentKey fragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                fragmentKey = navigate.key;
            }
            return navigate.copy(fragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final FragmentKey getKey() {
            return this.key;
        }

        public final Navigate copy(FragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new Navigate(key);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Navigate) && Intrinsics.areEqual(this.key, ((Navigate) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "Navigate(key=" + this.key + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.key, flags);
        }

        public Navigate(FragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final FragmentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$NavigateToTransferSelection;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$NavigateToTransferSelection */
    public static final /* data */ class NavigateToTransferSelection implements PresubmissionCheckAlertSheets2 {
        public static final int $stable = 0;
        public static final NavigateToTransferSelection INSTANCE = new NavigateToTransferSelection();
        public static final Parcelable.Creator<NavigateToTransferSelection> CREATOR = new Creator();

        /* compiled from: PresubmissionCheckAlertSheets.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$NavigateToTransferSelection$Creator */
        public static final class Creator implements Parcelable.Creator<NavigateToTransferSelection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NavigateToTransferSelection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NavigateToTransferSelection.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NavigateToTransferSelection[] newArray(int i) {
                return new NavigateToTransferSelection[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NavigateToTransferSelection);
        }

        public int hashCode() {
            return 490931693;
        }

        public String toString() {
            return "NavigateToTransferSelection";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private NavigateToTransferSelection() {
        }
    }

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$TryAgain;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$TryAgain */
    public static final /* data */ class TryAgain implements PresubmissionCheckAlertSheets2 {
        public static final int $stable = 0;
        public static final TryAgain INSTANCE = new TryAgain();
        public static final Parcelable.Creator<TryAgain> CREATOR = new Creator();

        /* compiled from: PresubmissionCheckAlertSheets.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$TryAgain$Creator */
        public static final class Creator implements Parcelable.Creator<TryAgain> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TryAgain createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TryAgain.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TryAgain[] newArray(int i) {
                return new TryAgain[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TryAgain);
        }

        public int hashCode() {
            return -2071648531;
        }

        public String toString() {
            return "TryAgain";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private TryAgain() {
        }
    }

    /* compiled from: PresubmissionCheckAlertSheets.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction$ExitFlow;", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/ButtonAction;", "exitDestination", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "<init>", "(Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;)V", "getExitDestination", "()Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$ExitFlow, reason: from toString */
    public static final /* data */ class ExitFlow implements PresubmissionCheckAlertSheets2 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ExitFlow> CREATOR = new Creator();
        private final TabLinkIntentKey exitDestination;

        /* compiled from: PresubmissionCheckAlertSheets.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ButtonAction$ExitFlow$Creator */
        public static final class Creator implements Parcelable.Creator<ExitFlow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExitFlow createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExitFlow((TabLinkIntentKey) parcel.readParcelable(ExitFlow.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExitFlow[] newArray(int i) {
                return new ExitFlow[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ExitFlow() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ExitFlow copy$default(ExitFlow exitFlow, TabLinkIntentKey tabLinkIntentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                tabLinkIntentKey = exitFlow.exitDestination;
            }
            return exitFlow.copy(tabLinkIntentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final TabLinkIntentKey getExitDestination() {
            return this.exitDestination;
        }

        public final ExitFlow copy(TabLinkIntentKey exitDestination) {
            return new ExitFlow(exitDestination);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExitFlow) && Intrinsics.areEqual(this.exitDestination, ((ExitFlow) other).exitDestination);
        }

        public int hashCode() {
            TabLinkIntentKey tabLinkIntentKey = this.exitDestination;
            if (tabLinkIntentKey == null) {
                return 0;
            }
            return tabLinkIntentKey.hashCode();
        }

        public String toString() {
            return "ExitFlow(exitDestination=" + this.exitDestination + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.exitDestination, flags);
        }

        public ExitFlow(TabLinkIntentKey tabLinkIntentKey) {
            this.exitDestination = tabLinkIntentKey;
        }

        public /* synthetic */ ExitFlow(TabLinkIntentKey tabLinkIntentKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tabLinkIntentKey);
        }

        public final TabLinkIntentKey getExitDestination() {
            return this.exitDestination;
        }
    }
}
