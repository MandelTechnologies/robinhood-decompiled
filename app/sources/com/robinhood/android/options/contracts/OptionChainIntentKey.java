package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionChainIntentKey.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0019BK\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u001aB+\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001fBE\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010 J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010;\u001a\u00020\u0013HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u007f\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0006\u0010?\u001a\u00020@J\u0013\u0010A\u001a\u00020\u00132\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020@HÖ\u0001J\t\u0010E\u001a\u00020\u0015HÖ\u0001J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020@R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00102¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "equityInstrumentId", "Ljava/util/UUID;", "optionChainIdLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "targetLegs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetStrikePrice", "Ljava/math/BigDecimal;", "initialFilter", "Lcom/robinhood/models/db/OptionOrderFilter;", "selectedSentiment", "Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "forceOptionWatchlistEducation", "", "initialAccountNumber", "", "source", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionOrderFilter;Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;ZLjava/lang/String;Ljava/lang/String;)V", "(Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/util/UUID;Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/db/OptionOrderFilter;Ljava/lang/String;Ljava/lang/String;)V", "singleChainIdLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode$SingleChainId;", "rollingLaunchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;", "(Ljava/util/UUID;Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode$SingleChainId;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;Ljava/lang/String;)V", "(Ljava/util/UUID;Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionOrderFilter;Ljava/lang/String;Ljava/lang/String;)V", "getEquityInstrumentId", "()Ljava/util/UUID;", "getOptionChainIdLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainIdLaunchMode;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getTargetLegs", "()Lkotlinx/collections/immutable/ImmutableList;", "getTargetStrikePrice", "()Ljava/math/BigDecimal;", "getInitialFilter", "()Lcom/robinhood/models/db/OptionOrderFilter;", "getSelectedSentiment", "()Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "getForceOptionWatchlistEducation", "()Z", "getInitialAccountNumber", "()Ljava/lang/String;", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionChainIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<OptionChainIntentKey> CREATOR = new Creator();
    private final UUID equityInstrumentId;
    private final boolean forceOptionWatchlistEducation;
    private final String initialAccountNumber;
    private final OptionOrderFilter initialFilter;
    private final OptionChainLaunchMode launchMode;
    private final OptionChainIdLaunchMode optionChainIdLaunchMode;
    private final StrategyBuilderSentiment selectedSentiment;
    private final String source;
    private final ImmutableList<UiOptionStrategyLegDisplay> targetLegs;
    private final BigDecimal targetStrikePrice;

    /* compiled from: OptionChainIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionChainIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            OptionChainIdLaunchMode optionChainIdLaunchMode = (OptionChainIdLaunchMode) parcel.readParcelable(OptionChainIntentKey.class.getClassLoader());
            OptionChainLaunchMode optionChainLaunchMode = (OptionChainLaunchMode) parcel.readParcelable(OptionChainIntentKey.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(OptionChainIntentKey.class.getClassLoader()));
            }
            return new OptionChainIntentKey(uuid, optionChainIdLaunchMode, optionChainLaunchMode, extensions2.toPersistentList(arrayList), (BigDecimal) parcel.readSerializable(), (OptionOrderFilter) parcel.readParcelable(OptionChainIntentKey.class.getClassLoader()), parcel.readInt() == 0 ? null : StrategyBuilderSentiment.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainIntentKey[] newArray(int i) {
            return new OptionChainIntentKey[i];
        }
    }

    public static /* synthetic */ OptionChainIntentKey copy$default(OptionChainIntentKey optionChainIntentKey, UUID uuid, OptionChainIdLaunchMode optionChainIdLaunchMode, OptionChainLaunchMode optionChainLaunchMode, ImmutableList immutableList, BigDecimal bigDecimal, OptionOrderFilter optionOrderFilter, StrategyBuilderSentiment strategyBuilderSentiment, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = optionChainIntentKey.equityInstrumentId;
        }
        if ((i & 2) != 0) {
            optionChainIdLaunchMode = optionChainIntentKey.optionChainIdLaunchMode;
        }
        if ((i & 4) != 0) {
            optionChainLaunchMode = optionChainIntentKey.launchMode;
        }
        if ((i & 8) != 0) {
            immutableList = optionChainIntentKey.targetLegs;
        }
        if ((i & 16) != 0) {
            bigDecimal = optionChainIntentKey.targetStrikePrice;
        }
        if ((i & 32) != 0) {
            optionOrderFilter = optionChainIntentKey.initialFilter;
        }
        if ((i & 64) != 0) {
            strategyBuilderSentiment = optionChainIntentKey.selectedSentiment;
        }
        if ((i & 128) != 0) {
            z = optionChainIntentKey.forceOptionWatchlistEducation;
        }
        if ((i & 256) != 0) {
            str = optionChainIntentKey.initialAccountNumber;
        }
        if ((i & 512) != 0) {
            str2 = optionChainIntentKey.source;
        }
        String str3 = str;
        String str4 = str2;
        StrategyBuilderSentiment strategyBuilderSentiment2 = strategyBuilderSentiment;
        boolean z2 = z;
        BigDecimal bigDecimal2 = bigDecimal;
        OptionOrderFilter optionOrderFilter2 = optionOrderFilter;
        return optionChainIntentKey.copy(uuid, optionChainIdLaunchMode, optionChainLaunchMode, immutableList, bigDecimal2, optionOrderFilter2, strategyBuilderSentiment2, z2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainIdLaunchMode getOptionChainIdLaunchMode() {
        return this.optionChainIdLaunchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> component4() {
        return this.targetLegs;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionOrderFilter getInitialFilter() {
        return this.initialFilter;
    }

    /* renamed from: component7, reason: from getter */
    public final StrategyBuilderSentiment getSelectedSentiment() {
        return this.selectedSentiment;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getForceOptionWatchlistEducation() {
        return this.forceOptionWatchlistEducation;
    }

    /* renamed from: component9, reason: from getter */
    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    public final OptionChainIntentKey copy(UUID equityInstrumentId, OptionChainIdLaunchMode optionChainIdLaunchMode, OptionChainLaunchMode launchMode, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, OptionOrderFilter initialFilter, StrategyBuilderSentiment selectedSentiment, boolean forceOptionWatchlistEducation, String initialAccountNumber, String source) {
        Intrinsics.checkNotNullParameter(optionChainIdLaunchMode, "optionChainIdLaunchMode");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        return new OptionChainIntentKey(equityInstrumentId, optionChainIdLaunchMode, launchMode, targetLegs, targetStrikePrice, initialFilter, selectedSentiment, forceOptionWatchlistEducation, initialAccountNumber, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainIntentKey)) {
            return false;
        }
        OptionChainIntentKey optionChainIntentKey = (OptionChainIntentKey) other;
        return Intrinsics.areEqual(this.equityInstrumentId, optionChainIntentKey.equityInstrumentId) && Intrinsics.areEqual(this.optionChainIdLaunchMode, optionChainIntentKey.optionChainIdLaunchMode) && Intrinsics.areEqual(this.launchMode, optionChainIntentKey.launchMode) && Intrinsics.areEqual(this.targetLegs, optionChainIntentKey.targetLegs) && Intrinsics.areEqual(this.targetStrikePrice, optionChainIntentKey.targetStrikePrice) && Intrinsics.areEqual(this.initialFilter, optionChainIntentKey.initialFilter) && this.selectedSentiment == optionChainIntentKey.selectedSentiment && this.forceOptionWatchlistEducation == optionChainIntentKey.forceOptionWatchlistEducation && Intrinsics.areEqual(this.initialAccountNumber, optionChainIntentKey.initialAccountNumber) && Intrinsics.areEqual(this.source, optionChainIntentKey.source);
    }

    public int hashCode() {
        UUID uuid = this.equityInstrumentId;
        int iHashCode = (((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.optionChainIdLaunchMode.hashCode()) * 31) + this.launchMode.hashCode()) * 31) + this.targetLegs.hashCode()) * 31;
        BigDecimal bigDecimal = this.targetStrikePrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        OptionOrderFilter optionOrderFilter = this.initialFilter;
        int iHashCode3 = (iHashCode2 + (optionOrderFilter == null ? 0 : optionOrderFilter.hashCode())) * 31;
        StrategyBuilderSentiment strategyBuilderSentiment = this.selectedSentiment;
        int iHashCode4 = (((iHashCode3 + (strategyBuilderSentiment == null ? 0 : strategyBuilderSentiment.hashCode())) * 31) + Boolean.hashCode(this.forceOptionWatchlistEducation)) * 31;
        String str = this.initialAccountNumber;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainIntentKey(equityInstrumentId=" + this.equityInstrumentId + ", optionChainIdLaunchMode=" + this.optionChainIdLaunchMode + ", launchMode=" + this.launchMode + ", targetLegs=" + this.targetLegs + ", targetStrikePrice=" + this.targetStrikePrice + ", initialFilter=" + this.initialFilter + ", selectedSentiment=" + this.selectedSentiment + ", forceOptionWatchlistEducation=" + this.forceOptionWatchlistEducation + ", initialAccountNumber=" + this.initialAccountNumber + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.equityInstrumentId);
        dest.writeParcelable(this.optionChainIdLaunchMode, flags);
        dest.writeParcelable(this.launchMode, flags);
        ImmutableList<UiOptionStrategyLegDisplay> immutableList = this.targetLegs;
        dest.writeInt(immutableList.size());
        Iterator<UiOptionStrategyLegDisplay> it = immutableList.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
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
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionChainIntentKey(UUID uuid, OptionChainIdLaunchMode optionChainIdLaunchMode, OptionChainLaunchMode launchMode, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal bigDecimal, OptionOrderFilter optionOrderFilter, StrategyBuilderSentiment strategyBuilderSentiment, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(optionChainIdLaunchMode, "optionChainIdLaunchMode");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        this.equityInstrumentId = uuid;
        this.optionChainIdLaunchMode = optionChainIdLaunchMode;
        this.launchMode = launchMode;
        this.targetLegs = targetLegs;
        this.targetStrikePrice = bigDecimal;
        this.initialFilter = optionOrderFilter;
        this.selectedSentiment = strategyBuilderSentiment;
        this.forceOptionWatchlistEducation = z;
        this.initialAccountNumber = str;
        this.source = str2;
        if (!targetLegs.isEmpty() && bigDecimal != null) {
            throw new IllegalArgumentException("Cannot specify both targetLegs and targetStrikePrice");
        }
    }

    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    public final OptionChainIdLaunchMode getOptionChainIdLaunchMode() {
        return this.optionChainIdLaunchMode;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionChainIntentKey(java.util.UUID r14, com.robinhood.android.options.contracts.OptionChainIdLaunchMode r15, com.robinhood.android.options.contracts.OptionChainLaunchMode r16, kotlinx.collections.immutable.ImmutableList r17, java.math.BigDecimal r18, com.robinhood.models.p320db.OptionOrderFilter r19, com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment r20, boolean r21, java.lang.String r22, java.lang.String r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 8
            if (r1 == 0) goto Lc
            kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.extensions2.persistentListOf()
            r6 = r1
            goto Le
        Lc:
            r6 = r17
        Le:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L15
            r7 = r2
            goto L17
        L15:
            r7 = r18
        L17:
            r1 = r0 & 64
            if (r1 == 0) goto L1d
            r9 = r2
            goto L1f
        L1d:
            r9 = r20
        L1f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L26
            r1 = 0
            r10 = r1
            goto L28
        L26:
            r10 = r21
        L28:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L37
            r12 = r2
            r3 = r14
            r4 = r15
            r5 = r16
            r8 = r19
            r11 = r22
            r2 = r13
            goto L42
        L37:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r8 = r19
            r11 = r22
        L42:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.options.contracts.OptionChainIntentKey.<init>(java.util.UUID, com.robinhood.android.options.contracts.OptionChainIdLaunchMode, com.robinhood.android.options.contracts.OptionChainLaunchMode, kotlinx.collections.immutable.ImmutableList, java.math.BigDecimal, com.robinhood.models.db.OptionOrderFilter, com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

    public /* synthetic */ OptionChainIntentKey(OptionChainIdLaunchMode optionChainIdLaunchMode, OptionChainLaunchMode optionChainLaunchMode, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionChainIdLaunchMode, optionChainLaunchMode, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionChainIntentKey(OptionChainIdLaunchMode optionChainIdLaunchMode, OptionChainLaunchMode launchMode, String str, String str2) {
        this(null, optionChainIdLaunchMode, launchMode, null, null, null, null, false, str, str2, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null);
        Intrinsics.checkNotNullParameter(optionChainIdLaunchMode, "optionChainIdLaunchMode");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
    }

    public /* synthetic */ OptionChainIntentKey(UUID uuid, OptionChainIdLaunchMode optionChainIdLaunchMode, ImmutableList immutableList, OptionOrderFilter optionOrderFilter, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, optionChainIdLaunchMode, (ImmutableList<? extends UiOptionStrategyLegDisplay>) ((i & 4) != 0 ? extensions2.persistentListOf() : immutableList), (i & 8) != 0 ? null : optionOrderFilter, str, (i & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionChainIntentKey(UUID uuid, OptionChainIdLaunchMode optionChainIdLaunchMode, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, OptionOrderFilter optionOrderFilter, String initialAccountNumber, String str) {
        this(uuid, optionChainIdLaunchMode, OptionChainLaunchMode.Normal.INSTANCE, targetLegs, null, optionOrderFilter, null, false, initialAccountNumber, str, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, null);
        Intrinsics.checkNotNullParameter(optionChainIdLaunchMode, "optionChainIdLaunchMode");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionChainIntentKey(UUID uuid, OptionChainIdLaunchMode.SingleChainId singleChainIdLaunchMode, OptionChainLaunchMode.RollingContractSelector rollingLaunchMode, String initialAccountNumber) {
        this(uuid, singleChainIdLaunchMode, rollingLaunchMode, null, null, new OptionOrderFilter(singleChainIdLaunchMode.getOptionChainId(), rollingLaunchMode.getOptionInstrumentToRoll().getContractType(), rollingLaunchMode.getPositionType().getSideHavingPositionEffect(OrderPositionEffect.OPEN)), null, false, initialAccountNumber, null, 728, null);
        Intrinsics.checkNotNullParameter(singleChainIdLaunchMode, "singleChainIdLaunchMode");
        Intrinsics.checkNotNullParameter(rollingLaunchMode, "rollingLaunchMode");
        Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
    }

    public /* synthetic */ OptionChainIntentKey(UUID uuid, OptionChainIdLaunchMode optionChainIdLaunchMode, BigDecimal bigDecimal, OptionOrderFilter optionOrderFilter, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, optionChainIdLaunchMode, bigDecimal, (i & 8) != 0 ? null : optionOrderFilter, str, (i & 32) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionChainIntentKey(UUID uuid, OptionChainIdLaunchMode optionChainIdLaunchMode, BigDecimal bigDecimal, OptionOrderFilter optionOrderFilter, String initialAccountNumber, String str) {
        this(uuid, optionChainIdLaunchMode, OptionChainLaunchMode.Normal.INSTANCE, null, bigDecimal, optionOrderFilter, null, false, initialAccountNumber, str, 200, null);
        Intrinsics.checkNotNullParameter(optionChainIdLaunchMode, "optionChainIdLaunchMode");
        Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
    }
}
