package com.robinhood.android.futures.detail.p140ui.duxo;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.FtuxContextualBarData;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FtuxProgressState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001bB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e\u0082\u0001\u0006\u001c\u001d\u001e\u001f !¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "Landroid/os/Parcelable;", "contextBarData", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData;", "scrimData", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData;", "isDone", "", "<init>", "(Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData;Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData;Z)V", "getContextBarData", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/FtuxContextualBarData;", "getScrimData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData;", "()Z", "nextState", "userIsMiB", "prevState", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "(ZLcom/robinhood/android/regiongate/RegionGateProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ScrimData", "ChartEducation", "MarginRequirementEducation", "MarginRequirementEducationForMiB", "LeverageEducation", "PositionEducation", "FtuxEducationDone", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ChartEducation;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$FtuxEducationDone;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$LeverageEducation;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$MarginRequirementEducation;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$MarginRequirementEducationForMiB;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$PositionEducation;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class FtuxProgressState implements Parcelable {
    public static final int $stable = FtuxContextualBarData.$stable;
    private final FtuxContextualBarData contextBarData;
    private final boolean isDone;
    private final ScrimData scrimData;

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.detail.ui.duxo.FtuxProgressState", m3645f = "FtuxProgressState.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "prevState")
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FtuxProgressState$prevState$1 */
    static final class C171041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C171041(Continuation<? super C171041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FtuxProgressState.this.prevState(false, null, this);
        }
    }

    public /* synthetic */ FtuxProgressState(FtuxContextualBarData ftuxContextualBarData, ScrimData scrimData, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(ftuxContextualBarData, scrimData, z);
    }

    private FtuxProgressState(FtuxContextualBarData ftuxContextualBarData, ScrimData scrimData, boolean z) {
        this.contextBarData = ftuxContextualBarData;
        this.scrimData = scrimData;
        this.isDone = z;
    }

    public final FtuxContextualBarData getContextBarData() {
        return this.contextBarData;
    }

    public final ScrimData getScrimData() {
        return this.scrimData;
    }

    /* renamed from: isDone, reason: from getter */
    public final boolean getIsDone() {
        return this.isDone;
    }

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData;", "Landroid/os/Parcelable;", "showChart", "", "contractSpecScrim", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData$ContractSpecScrim;", "showTradeBar", "<init>", "(ZLcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData$ContractSpecScrim;Z)V", "getShowChart", "()Z", "getContractSpecScrim", "()Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData$ContractSpecScrim;", "getShowTradeBar", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ContractSpecScrim", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrimData implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ScrimData> CREATOR = new Creator();
        private final ContractSpecScrim contractSpecScrim;
        private final boolean showChart;
        private final boolean showTradeBar;

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ScrimData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScrimData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScrimData(parcel.readInt() != 0, ContractSpecScrim.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScrimData[] newArray(int i) {
                return new ScrimData[i];
            }
        }

        public ScrimData() {
            this(false, null, false, 7, null);
        }

        public static /* synthetic */ ScrimData copy$default(ScrimData scrimData, boolean z, ContractSpecScrim contractSpecScrim, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = scrimData.showChart;
            }
            if ((i & 2) != 0) {
                contractSpecScrim = scrimData.contractSpecScrim;
            }
            if ((i & 4) != 0) {
                z2 = scrimData.showTradeBar;
            }
            return scrimData.copy(z, contractSpecScrim, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowChart() {
            return this.showChart;
        }

        /* renamed from: component2, reason: from getter */
        public final ContractSpecScrim getContractSpecScrim() {
            return this.contractSpecScrim;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowTradeBar() {
            return this.showTradeBar;
        }

        public final ScrimData copy(boolean showChart, ContractSpecScrim contractSpecScrim, boolean showTradeBar) {
            Intrinsics.checkNotNullParameter(contractSpecScrim, "contractSpecScrim");
            return new ScrimData(showChart, contractSpecScrim, showTradeBar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrimData)) {
                return false;
            }
            ScrimData scrimData = (ScrimData) other;
            return this.showChart == scrimData.showChart && Intrinsics.areEqual(this.contractSpecScrim, scrimData.contractSpecScrim) && this.showTradeBar == scrimData.showTradeBar;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.showChart) * 31) + this.contractSpecScrim.hashCode()) * 31) + Boolean.hashCode(this.showTradeBar);
        }

        public String toString() {
            return "ScrimData(showChart=" + this.showChart + ", contractSpecScrim=" + this.contractSpecScrim + ", showTradeBar=" + this.showTradeBar + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showChart ? 1 : 0);
            this.contractSpecScrim.writeToParcel(dest, flags);
            dest.writeInt(this.showTradeBar ? 1 : 0);
        }

        public ScrimData(boolean z, ContractSpecScrim contractSpecScrim, boolean z2) {
            Intrinsics.checkNotNullParameter(contractSpecScrim, "contractSpecScrim");
            this.showChart = z;
            this.contractSpecScrim = contractSpecScrim;
            this.showTradeBar = z2;
        }

        public final boolean getShowChart() {
            return this.showChart;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ScrimData(boolean z, ContractSpecScrim contractSpecScrim, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z3 = false;
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ContractSpecScrim(z3, z3, 3, null) : contractSpecScrim, (i & 4) != 0 ? false : z2);
        }

        public final ContractSpecScrim getContractSpecScrim() {
            return this.contractSpecScrim;
        }

        public final boolean getShowTradeBar() {
            return this.showTradeBar;
        }

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ScrimData$ContractSpecScrim;", "Landroid/os/Parcelable;", "showContractSpecs", "", "scrimLeverage", "<init>", "(ZZ)V", "getShowContractSpecs", "()Z", "getScrimLeverage", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContractSpecScrim implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ContractSpecScrim> CREATOR = new Creator();
            private final boolean scrimLeverage;
            private final boolean showContractSpecs;

            /* compiled from: FtuxProgressState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ContractSpecScrim> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContractSpecScrim createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ContractSpecScrim(parcel.readInt() != 0, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContractSpecScrim[] newArray(int i) {
                    return new ContractSpecScrim[i];
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public ContractSpecScrim() {
                boolean z = false;
                this(z, z, 3, null);
            }

            public static /* synthetic */ ContractSpecScrim copy$default(ContractSpecScrim contractSpecScrim, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = contractSpecScrim.showContractSpecs;
                }
                if ((i & 2) != 0) {
                    z2 = contractSpecScrim.scrimLeverage;
                }
                return contractSpecScrim.copy(z, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowContractSpecs() {
                return this.showContractSpecs;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getScrimLeverage() {
                return this.scrimLeverage;
            }

            public final ContractSpecScrim copy(boolean showContractSpecs, boolean scrimLeverage) {
                return new ContractSpecScrim(showContractSpecs, scrimLeverage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContractSpecScrim)) {
                    return false;
                }
                ContractSpecScrim contractSpecScrim = (ContractSpecScrim) other;
                return this.showContractSpecs == contractSpecScrim.showContractSpecs && this.scrimLeverage == contractSpecScrim.scrimLeverage;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.showContractSpecs) * 31) + Boolean.hashCode(this.scrimLeverage);
            }

            public String toString() {
                return "ContractSpecScrim(showContractSpecs=" + this.showContractSpecs + ", scrimLeverage=" + this.scrimLeverage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.showContractSpecs ? 1 : 0);
                dest.writeInt(this.scrimLeverage ? 1 : 0);
            }

            public ContractSpecScrim(boolean z, boolean z2) {
                this.showContractSpecs = z;
                this.scrimLeverage = z2;
            }

            public /* synthetic */ ContractSpecScrim(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
            }

            public final boolean getShowContractSpecs() {
                return this.showContractSpecs;
            }

            public final boolean getScrimLeverage() {
                return this.scrimLeverage;
            }
        }
    }

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$ChartEducation;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "allowCrypto", "", "<init>", "(Z)V", "getAllowCrypto", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChartEducation extends FtuxProgressState {
        public static final int $stable = FtuxContextualBarData.$stable;
        public static final Parcelable.Creator<ChartEducation> CREATOR = new Creator();
        private final boolean allowCrypto;

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ChartEducation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChartEducation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChartEducation(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChartEducation[] newArray(int i) {
                return new ChartEducation[i];
            }
        }

        public static /* synthetic */ ChartEducation copy$default(ChartEducation chartEducation, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = chartEducation.allowCrypto;
            }
            return chartEducation.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAllowCrypto() {
            return this.allowCrypto;
        }

        public final ChartEducation copy(boolean allowCrypto) {
            return new ChartEducation(allowCrypto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChartEducation) && this.allowCrypto == ((ChartEducation) other).allowCrypto;
        }

        public int hashCode() {
            return Boolean.hashCode(this.allowCrypto);
        }

        public String toString() {
            return "ChartEducation(allowCrypto=" + this.allowCrypto + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.allowCrypto ? 1 : 0);
        }

        public final boolean getAllowCrypto() {
            return this.allowCrypto;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public ChartEducation(boolean z) {
            int i;
            if (z) {
                i = C17042R.string.futures_detail_ftux_futures_contract_description;
            } else {
                i = C17042R.string.futures_detail_ftux_futures_contract_description_no_crypto;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            Integer num = null;
            FtuxContextualBarData.ButtonType buttonType = null;
            super(new FtuxContextualBarData(Integer.valueOf(i), num, new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_RIGHT_24, C17042R.string.futures_detail_ftux_continue_content_description, null, 4, null), buttonType, 8, defaultConstructorMarker), new ScrimData(true, null, false, 6, defaultConstructorMarker), false, 0 == true ? 1 : 0);
            this.allowCrypto = z;
        }
    }

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$MarginRequirementEducation;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginRequirementEducation extends FtuxProgressState {
        public static final MarginRequirementEducation INSTANCE = new MarginRequirementEducation();
        public static final int $stable = FtuxContextualBarData.$stable;
        public static final Parcelable.Creator<MarginRequirementEducation> CREATOR = new Creator();

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginRequirementEducation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginRequirementEducation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarginRequirementEducation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginRequirementEducation[] newArray(int i) {
                return new MarginRequirementEducation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MarginRequirementEducation);
        }

        public int hashCode() {
            return -232728219;
        }

        public String toString() {
            return "MarginRequirementEducation";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private MarginRequirementEducation() {
            FtuxContextualBarData ftuxContextualBarData = new FtuxContextualBarData(Integer.valueOf(C17042R.string.futures_detail_ftux_futures_margin_requirement_description), null, new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_RIGHT_24, C17042R.string.futures_detail_ftux_continue_content_description, null, 4, null), new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_LEFT_24, C17042R.string.futures_detail_ftux_back_content_description, BentoIconButton4.Type.Secondary));
            Object[] objArr = 0 == true ? 1 : 0;
            super(ftuxContextualBarData, new ScrimData(false, objArr, true, 3, null), false, null);
        }
    }

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$MarginRequirementEducationForMiB;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarginRequirementEducationForMiB extends FtuxProgressState {
        public static final MarginRequirementEducationForMiB INSTANCE = new MarginRequirementEducationForMiB();
        public static final int $stable = FtuxContextualBarData.$stable;
        public static final Parcelable.Creator<MarginRequirementEducationForMiB> CREATOR = new Creator();

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MarginRequirementEducationForMiB> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginRequirementEducationForMiB createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarginRequirementEducationForMiB.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MarginRequirementEducationForMiB[] newArray(int i) {
                return new MarginRequirementEducationForMiB[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MarginRequirementEducationForMiB);
        }

        public int hashCode() {
            return 1593042530;
        }

        public String toString() {
            return "MarginRequirementEducationForMiB";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private MarginRequirementEducationForMiB() {
            super(new FtuxContextualBarData(Integer.valueOf(C17042R.string.futures_detail_ftux_futures_margin_requirement_description), null, new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_RIGHT_24, C17042R.string.futures_detail_ftux_continue_content_description, null, 4, null), new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_LEFT_24, C17042R.string.futures_detail_ftux_back_content_description, BentoIconButton4.Type.Secondary)), new ScrimData(false, new ScrimData.ContractSpecScrim(true, true), false, 5, null), false, null);
        }
    }

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$LeverageEducation;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LeverageEducation extends FtuxProgressState {
        public static final LeverageEducation INSTANCE = new LeverageEducation();
        public static final int $stable = FtuxContextualBarData.$stable;
        public static final Parcelable.Creator<LeverageEducation> CREATOR = new Creator();

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<LeverageEducation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LeverageEducation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LeverageEducation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LeverageEducation[] newArray(int i) {
                return new LeverageEducation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LeverageEducation);
        }

        public int hashCode() {
            return 1270269377;
        }

        public String toString() {
            return "LeverageEducation";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private LeverageEducation() {
            ScrimData scrimData = new ScrimData(false, new ScrimData.ContractSpecScrim(true, false), false, 5, null);
            super(new FtuxContextualBarData(Integer.valueOf(C17042R.string.futures_detail_ftux_futures_leverage_description), null, new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_RIGHT_24, C17042R.string.futures_detail_ftux_continue_content_description, null, 4, null), new FtuxContextualBarData.ButtonType.IconButton(ServerToBentoAssetMapper2.ARROW_LEFT_24, C17042R.string.futures_detail_ftux_back_content_description, BentoIconButton4.Type.Secondary)), scrimData, false, null);
        }
    }

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$PositionEducation;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PositionEducation extends FtuxProgressState {
        public static final PositionEducation INSTANCE = new PositionEducation();
        public static final int $stable = FtuxContextualBarData.$stable;
        public static final Parcelable.Creator<PositionEducation> CREATOR = new Creator();

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PositionEducation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionEducation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PositionEducation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionEducation[] newArray(int i) {
                return new PositionEducation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PositionEducation);
        }

        public int hashCode() {
            return 809736269;
        }

        public String toString() {
            return "PositionEducation";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private PositionEducation() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            super(new FtuxContextualBarData(Integer.valueOf(C17042R.string.futures_detail_ftux_futures_position_description), null, new FtuxContextualBarData.ButtonType.TextButton(StringResource.INSTANCE.invoke(C17042R.string.futures_details_ftux_done_label, new Object[0])), null, 8, defaultConstructorMarker), new ScrimData(false, new ScrimData.ContractSpecScrim(true, false), false, 5, defaultConstructorMarker), false, null);
        }
    }

    /* compiled from: FtuxProgressState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState$FtuxEducationDone;", "Lcom/robinhood/android/futures/detail/ui/duxo/FtuxProgressState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FtuxEducationDone extends FtuxProgressState {
        public static final FtuxEducationDone INSTANCE = new FtuxEducationDone();
        public static final int $stable = FtuxContextualBarData.$stable;
        public static final Parcelable.Creator<FtuxEducationDone> CREATOR = new Creator();

        /* compiled from: FtuxProgressState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FtuxEducationDone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FtuxEducationDone createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FtuxEducationDone.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FtuxEducationDone[] newArray(int i) {
                return new FtuxEducationDone[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FtuxEducationDone);
        }

        public int hashCode() {
            return -1094871385;
        }

        public String toString() {
            return "FtuxEducationDone";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        private FtuxEducationDone() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Object[] objArr = 0 == true ? 1 : 0;
            super(new FtuxContextualBarData(null, null, null, null, 8, defaultConstructorMarker), new ScrimData(false, objArr, false, 7, defaultConstructorMarker), true, 0 == true ? 1 : 0);
        }
    }

    public final FtuxProgressState nextState(boolean userIsMiB) {
        if (this instanceof ChartEducation) {
            return userIsMiB ? MarginRequirementEducationForMiB.INSTANCE : MarginRequirementEducation.INSTANCE;
        }
        if ((this instanceof MarginRequirementEducation) || Intrinsics.areEqual(this, MarginRequirementEducationForMiB.INSTANCE)) {
            return LeverageEducation.INSTANCE;
        }
        if (this instanceof LeverageEducation) {
            return PositionEducation.INSTANCE;
        }
        if (this instanceof PositionEducation) {
            return FtuxEducationDone.INSTANCE;
        }
        if (this instanceof FtuxEducationDone) {
            throw new IllegalStateException("shouldn't call on final page");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prevState(boolean z, RegionGateProvider regionGateProvider, Continuation<? super FtuxProgressState> continuation) {
        C171041 c171041;
        if (continuation instanceof C171041) {
            c171041 = (C171041) continuation;
            int i = c171041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c171041.label = i - Integer.MIN_VALUE;
            } else {
                c171041 = new C171041(continuation);
            }
        }
        C171041 c1710412 = c171041;
        Object regionGateState$default = c1710412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1710412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(regionGateState$default);
            if (this instanceof ChartEducation) {
                throw new IllegalStateException("shouldn't call on first page");
            }
            if (!(this instanceof MarginRequirementEducation)) {
                MarginRequirementEducationForMiB marginRequirementEducationForMiB = MarginRequirementEducationForMiB.INSTANCE;
                if (!Intrinsics.areEqual(this, marginRequirementEducationForMiB)) {
                    if (this instanceof LeverageEducation) {
                        return z ? marginRequirementEducationForMiB : MarginRequirementEducation.INSTANCE;
                    }
                    if (this instanceof PositionEducation) {
                        return LeverageEducation.INSTANCE;
                    }
                    if (this instanceof FtuxEducationDone) {
                        return PositionEducation.INSTANCE;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            CryptoRegionGate cryptoRegionGate = CryptoRegionGate.INSTANCE;
            c1710412.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, cryptoRegionGate, false, c1710412, 2, null);
            if (regionGateState$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(regionGateState$default);
        }
        return new ChartEducation(((Boolean) regionGateState$default).booleanValue());
    }
}
