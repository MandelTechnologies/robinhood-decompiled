package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InternalOptionChainFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bB3\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001eJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010?\u001a\u00020\u0015HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010B\u001a\u00020\u0015HÆ\u0003J\u009b\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0015HÆ\u0001J\u0006\u0010D\u001a\u00020EJ\u0013\u0010F\u001a\u00020\u00152\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020EHÖ\u0001J\t\u0010J\u001a\u00020\u0017HÖ\u0001J\u0016\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020ER\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0019\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u00105\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b6\u0010 ¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/InternalOptionChainFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "equityInstrumentId", "Ljava/util/UUID;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "uiOptionChains", "", "Lcom/robinhood/models/ui/UiOptionChain;", "targetExpirationDate", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "targetLegs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetStrikePrice", "Ljava/math/BigDecimal;", "initialFilter", "Lcom/robinhood/models/db/OptionOrderFilter;", "selectedSentiment", "Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "forceOptionWatchlistEducation", "", "initialAccountNumber", "", "source", "inSbsChainPerfExperiment", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Ljava/util/List;Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionOrderFilter;Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;ZLjava/lang/String;Ljava/lang/String;Z)V", "optionChainIntentKey", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "(ZLcom/robinhood/android/options/contracts/OptionChainIntentKey;Ljava/util/List;Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;)V", "getEquityInstrumentId", "()Ljava/util/UUID;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getUiOptionChains", "()Ljava/util/List;", "getTargetExpirationDate", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getTargetLegs", "()Lkotlinx/collections/immutable/ImmutableList;", "getTargetStrikePrice", "()Ljava/math/BigDecimal;", "getInitialFilter", "()Lcom/robinhood/models/db/OptionOrderFilter;", "getSelectedSentiment", "()Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "getForceOptionWatchlistEducation", "()Z", "getInitialAccountNumber", "()Ljava/lang/String;", "getSource", "getInSbsChainPerfExperiment", "optionChainId", "getOptionChainId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InternalOptionChainFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<InternalOptionChainFragmentKey> CREATOR = new Creator();
    private final UUID equityInstrumentId;
    private final boolean forceOptionWatchlistEducation;
    private final boolean inSbsChainPerfExperiment;
    private final String initialAccountNumber;
    private final OptionOrderFilter initialFilter;
    private final OptionChainLaunchMode launchMode;
    private final StrategyBuilderSentiment selectedSentiment;
    private final String source;
    private final OptionChainExpirationDateState targetExpirationDate;
    private final ImmutableList<UiOptionStrategyLegDisplay> targetLegs;
    private final BigDecimal targetStrikePrice;
    private final List<UiOptionChain> uiOptionChains;

    /* compiled from: InternalOptionChainFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<InternalOptionChainFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalOptionChainFragmentKey createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            OptionChainLaunchMode optionChainLaunchMode = (OptionChainLaunchMode) parcel.readParcelable(InternalOptionChainFragmentKey.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InternalOptionChainFragmentKey.class.getClassLoader()));
            }
            OptionChainExpirationDateState optionChainExpirationDateState = (OptionChainExpirationDateState) parcel.readParcelable(InternalOptionChainFragmentKey.class.getClassLoader());
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(InternalOptionChainFragmentKey.class.getClassLoader()));
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList2);
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            OptionOrderFilter optionOrderFilter = (OptionOrderFilter) parcel.readParcelable(InternalOptionChainFragmentKey.class.getClassLoader());
            StrategyBuilderSentiment strategyBuilderSentimentValueOf = parcel.readInt() == 0 ? null : StrategyBuilderSentiment.valueOf(parcel.readString());
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new InternalOptionChainFragmentKey(uuid, optionChainLaunchMode, arrayList, optionChainExpirationDateState, persistentList, bigDecimal, optionOrderFilter, strategyBuilderSentimentValueOf, z2, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalOptionChainFragmentKey[] newArray(int i) {
            return new InternalOptionChainFragmentKey[i];
        }
    }

    public static /* synthetic */ InternalOptionChainFragmentKey copy$default(InternalOptionChainFragmentKey internalOptionChainFragmentKey, UUID uuid, OptionChainLaunchMode optionChainLaunchMode, List list, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList immutableList, BigDecimal bigDecimal, OptionOrderFilter optionOrderFilter, StrategyBuilderSentiment strategyBuilderSentiment, boolean z, String str, String str2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = internalOptionChainFragmentKey.equityInstrumentId;
        }
        if ((i & 2) != 0) {
            optionChainLaunchMode = internalOptionChainFragmentKey.launchMode;
        }
        if ((i & 4) != 0) {
            list = internalOptionChainFragmentKey.uiOptionChains;
        }
        if ((i & 8) != 0) {
            optionChainExpirationDateState = internalOptionChainFragmentKey.targetExpirationDate;
        }
        if ((i & 16) != 0) {
            immutableList = internalOptionChainFragmentKey.targetLegs;
        }
        if ((i & 32) != 0) {
            bigDecimal = internalOptionChainFragmentKey.targetStrikePrice;
        }
        if ((i & 64) != 0) {
            optionOrderFilter = internalOptionChainFragmentKey.initialFilter;
        }
        if ((i & 128) != 0) {
            strategyBuilderSentiment = internalOptionChainFragmentKey.selectedSentiment;
        }
        if ((i & 256) != 0) {
            z = internalOptionChainFragmentKey.forceOptionWatchlistEducation;
        }
        if ((i & 512) != 0) {
            str = internalOptionChainFragmentKey.initialAccountNumber;
        }
        if ((i & 1024) != 0) {
            str2 = internalOptionChainFragmentKey.source;
        }
        if ((i & 2048) != 0) {
            z2 = internalOptionChainFragmentKey.inSbsChainPerfExperiment;
        }
        String str3 = str2;
        boolean z3 = z2;
        boolean z4 = z;
        String str4 = str;
        OptionOrderFilter optionOrderFilter2 = optionOrderFilter;
        StrategyBuilderSentiment strategyBuilderSentiment2 = strategyBuilderSentiment;
        ImmutableList immutableList2 = immutableList;
        BigDecimal bigDecimal2 = bigDecimal;
        return internalOptionChainFragmentKey.copy(uuid, optionChainLaunchMode, list, optionChainExpirationDateState, immutableList2, bigDecimal2, optionOrderFilter2, strategyBuilderSentiment2, z4, str4, str3, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getInSbsChainPerfExperiment() {
        return this.inSbsChainPerfExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final List<UiOptionChain> component3() {
        return this.uiOptionChains;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionChainExpirationDateState getTargetExpirationDate() {
        return this.targetExpirationDate;
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> component5() {
        return this.targetLegs;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionOrderFilter getInitialFilter() {
        return this.initialFilter;
    }

    /* renamed from: component8, reason: from getter */
    public final StrategyBuilderSentiment getSelectedSentiment() {
        return this.selectedSentiment;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getForceOptionWatchlistEducation() {
        return this.forceOptionWatchlistEducation;
    }

    public final InternalOptionChainFragmentKey copy(UUID equityInstrumentId, OptionChainLaunchMode launchMode, List<UiOptionChain> uiOptionChains, OptionChainExpirationDateState targetExpirationDate, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, OptionOrderFilter initialFilter, StrategyBuilderSentiment selectedSentiment, boolean forceOptionWatchlistEducation, String initialAccountNumber, String source, boolean inSbsChainPerfExperiment) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        return new InternalOptionChainFragmentKey(equityInstrumentId, launchMode, uiOptionChains, targetExpirationDate, targetLegs, targetStrikePrice, initialFilter, selectedSentiment, forceOptionWatchlistEducation, initialAccountNumber, source, inSbsChainPerfExperiment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalOptionChainFragmentKey)) {
            return false;
        }
        InternalOptionChainFragmentKey internalOptionChainFragmentKey = (InternalOptionChainFragmentKey) other;
        return Intrinsics.areEqual(this.equityInstrumentId, internalOptionChainFragmentKey.equityInstrumentId) && Intrinsics.areEqual(this.launchMode, internalOptionChainFragmentKey.launchMode) && Intrinsics.areEqual(this.uiOptionChains, internalOptionChainFragmentKey.uiOptionChains) && Intrinsics.areEqual(this.targetExpirationDate, internalOptionChainFragmentKey.targetExpirationDate) && Intrinsics.areEqual(this.targetLegs, internalOptionChainFragmentKey.targetLegs) && Intrinsics.areEqual(this.targetStrikePrice, internalOptionChainFragmentKey.targetStrikePrice) && Intrinsics.areEqual(this.initialFilter, internalOptionChainFragmentKey.initialFilter) && this.selectedSentiment == internalOptionChainFragmentKey.selectedSentiment && this.forceOptionWatchlistEducation == internalOptionChainFragmentKey.forceOptionWatchlistEducation && Intrinsics.areEqual(this.initialAccountNumber, internalOptionChainFragmentKey.initialAccountNumber) && Intrinsics.areEqual(this.source, internalOptionChainFragmentKey.source) && this.inSbsChainPerfExperiment == internalOptionChainFragmentKey.inSbsChainPerfExperiment;
    }

    public int hashCode() {
        UUID uuid = this.equityInstrumentId;
        int iHashCode = (((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.launchMode.hashCode()) * 31) + this.uiOptionChains.hashCode()) * 31;
        OptionChainExpirationDateState optionChainExpirationDateState = this.targetExpirationDate;
        int iHashCode2 = (((iHashCode + (optionChainExpirationDateState == null ? 0 : optionChainExpirationDateState.hashCode())) * 31) + this.targetLegs.hashCode()) * 31;
        BigDecimal bigDecimal = this.targetStrikePrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        OptionOrderFilter optionOrderFilter = this.initialFilter;
        int iHashCode4 = (iHashCode3 + (optionOrderFilter == null ? 0 : optionOrderFilter.hashCode())) * 31;
        StrategyBuilderSentiment strategyBuilderSentiment = this.selectedSentiment;
        int iHashCode5 = (((iHashCode4 + (strategyBuilderSentiment == null ? 0 : strategyBuilderSentiment.hashCode())) * 31) + Boolean.hashCode(this.forceOptionWatchlistEducation)) * 31;
        String str = this.initialAccountNumber;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        return ((iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.inSbsChainPerfExperiment);
    }

    public String toString() {
        return "InternalOptionChainFragmentKey(equityInstrumentId=" + this.equityInstrumentId + ", launchMode=" + this.launchMode + ", uiOptionChains=" + this.uiOptionChains + ", targetExpirationDate=" + this.targetExpirationDate + ", targetLegs=" + this.targetLegs + ", targetStrikePrice=" + this.targetStrikePrice + ", initialFilter=" + this.initialFilter + ", selectedSentiment=" + this.selectedSentiment + ", forceOptionWatchlistEducation=" + this.forceOptionWatchlistEducation + ", initialAccountNumber=" + this.initialAccountNumber + ", source=" + this.source + ", inSbsChainPerfExperiment=" + this.inSbsChainPerfExperiment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.equityInstrumentId);
        dest.writeParcelable(this.launchMode, flags);
        List<UiOptionChain> list = this.uiOptionChains;
        dest.writeInt(list.size());
        Iterator<UiOptionChain> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.targetExpirationDate, flags);
        ImmutableList<UiOptionStrategyLegDisplay> immutableList = this.targetLegs;
        dest.writeInt(immutableList.size());
        Iterator<UiOptionStrategyLegDisplay> it2 = immutableList.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeSerializable(this.targetStrikePrice);
        dest.writeParcelable(this.initialFilter, flags);
        StrategyBuilderSentiment strategyBuilderSentiment = this.selectedSentiment;
        if (strategyBuilderSentiment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(strategyBuilderSentiment.name());
        }
        dest.writeInt(this.forceOptionWatchlistEducation ? 1 : 0);
        dest.writeString(this.initialAccountNumber);
        dest.writeString(this.source);
        dest.writeInt(this.inSbsChainPerfExperiment ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternalOptionChainFragmentKey(UUID uuid, OptionChainLaunchMode launchMode, List<UiOptionChain> uiOptionChains, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal bigDecimal, OptionOrderFilter optionOrderFilter, StrategyBuilderSentiment strategyBuilderSentiment, boolean z, String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        this.equityInstrumentId = uuid;
        this.launchMode = launchMode;
        this.uiOptionChains = uiOptionChains;
        this.targetExpirationDate = optionChainExpirationDateState;
        this.targetLegs = targetLegs;
        this.targetStrikePrice = bigDecimal;
        this.initialFilter = optionOrderFilter;
        this.selectedSentiment = strategyBuilderSentiment;
        this.forceOptionWatchlistEducation = z;
        this.initialAccountNumber = str;
        this.source = str2;
        this.inSbsChainPerfExperiment = z2;
    }

    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final List<UiOptionChain> getUiOptionChains() {
        return this.uiOptionChains;
    }

    public final OptionChainExpirationDateState getTargetExpirationDate() {
        return this.targetExpirationDate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InternalOptionChainFragmentKey(UUID uuid, OptionChainLaunchMode optionChainLaunchMode, List list, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList immutableList, BigDecimal bigDecimal, OptionOrderFilter optionOrderFilter, StrategyBuilderSentiment strategyBuilderSentiment, boolean z, String str, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        String str3;
        optionChainExpirationDateState = (i & 8) != 0 ? null : optionChainExpirationDateState;
        immutableList = (i & 16) != 0 ? extensions2.persistentListOf() : immutableList;
        bigDecimal = (i & 32) != 0 ? null : bigDecimal;
        strategyBuilderSentiment = (i & 128) != 0 ? null : strategyBuilderSentiment;
        z = (i & 256) != 0 ? false : z;
        if ((i & 1024) != 0) {
            z3 = z2;
            str3 = null;
        } else {
            z3 = z2;
            str3 = str2;
        }
        this(uuid, optionChainLaunchMode, list, optionChainExpirationDateState, immutableList, bigDecimal, optionOrderFilter, strategyBuilderSentiment, z, str, str3, z3);
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> getTargetLegs() {
        return this.targetLegs;
    }

    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    public final OptionOrderFilter getInitialFilter() {
        return this.initialFilter;
    }

    public final StrategyBuilderSentiment getSelectedSentiment() {
        return this.selectedSentiment;
    }

    public final boolean getForceOptionWatchlistEducation() {
        return this.forceOptionWatchlistEducation;
    }

    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getInSbsChainPerfExperiment() {
        return this.inSbsChainPerfExperiment;
    }

    public final UUID getOptionChainId() {
        return ((UiOptionChain) CollectionsKt.first((List) this.uiOptionChains)).getOptionChain().getId();
    }

    public /* synthetic */ InternalOptionChainFragmentKey(boolean z, OptionChainIntentKey optionChainIntentKey, List list, OptionChainExpirationDateState optionChainExpirationDateState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, optionChainIntentKey, list, (i & 8) != 0 ? null : optionChainExpirationDateState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalOptionChainFragmentKey(boolean z, OptionChainIntentKey optionChainIntentKey, List<UiOptionChain> uiOptionChains, OptionChainExpirationDateState optionChainExpirationDateState) {
        this(optionChainIntentKey.getEquityInstrumentId(), optionChainIntentKey.getLaunchMode(), uiOptionChains, optionChainExpirationDateState, optionChainIntentKey.getTargetLegs(), optionChainIntentKey.getTargetStrikePrice(), optionChainIntentKey.getInitialFilter(), optionChainIntentKey.getSelectedSentiment(), optionChainIntentKey.getForceOptionWatchlistEducation(), optionChainIntentKey.getInitialAccountNumber(), optionChainIntentKey.getSource(), z);
        Intrinsics.checkNotNullParameter(optionChainIntentKey, "optionChainIntentKey");
        Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
    }
}
