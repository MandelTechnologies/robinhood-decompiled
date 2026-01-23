package com.robinhood.android.navigation.app.keys.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountArgs.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/RecurringOrderAmountArgs;", "Landroid/os/Parcelable;", "investmentScheduleId", "Ljava/util/UUID;", "initialAmount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "loggingFlowType", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "targetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "fromInsights", "", "fromInvestFlow", "<init>", "(Ljava/util/UUID;Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;Lcom/robinhood/recurring/models/api/ApiAssetType;ZZ)V", "getInvestmentScheduleId", "()Ljava/util/UUID;", "getInitialAmount", "()Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "getLoggingFlowType", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext$FlowType;", "getTargetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getFromInsights", "()Z", "getFromInvestFlow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RecurringOrderAmountArgs implements Parcelable {
    public static final Parcelable.Creator<RecurringOrderAmountArgs> CREATOR = new Creator();
    private final boolean fromInsights;
    private final boolean fromInvestFlow;
    private final InvestmentScheduleAmount initialAmount;
    private final UUID investmentScheduleId;
    private final RecurringContext.FlowType loggingFlowType;
    private final ApiAssetType targetType;

    /* compiled from: RecurringOrderAmountArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringOrderAmountArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderAmountArgs createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            InvestmentScheduleAmount investmentScheduleAmount = (InvestmentScheduleAmount) parcel.readParcelable(RecurringOrderAmountArgs.class.getClassLoader());
            RecurringContext.FlowType flowTypeValueOf = RecurringContext.FlowType.valueOf(parcel.readString());
            ApiAssetType apiAssetTypeValueOf = ApiAssetType.valueOf(parcel.readString());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new RecurringOrderAmountArgs(uuid, investmentScheduleAmount, flowTypeValueOf, apiAssetTypeValueOf, z2, parcel.readInt() == 0 ? z : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderAmountArgs[] newArray(int i) {
            return new RecurringOrderAmountArgs[i];
        }
    }

    public static /* synthetic */ RecurringOrderAmountArgs copy$default(RecurringOrderAmountArgs recurringOrderAmountArgs, UUID uuid, InvestmentScheduleAmount investmentScheduleAmount, RecurringContext.FlowType flowType, ApiAssetType apiAssetType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = recurringOrderAmountArgs.investmentScheduleId;
        }
        if ((i & 2) != 0) {
            investmentScheduleAmount = recurringOrderAmountArgs.initialAmount;
        }
        if ((i & 4) != 0) {
            flowType = recurringOrderAmountArgs.loggingFlowType;
        }
        if ((i & 8) != 0) {
            apiAssetType = recurringOrderAmountArgs.targetType;
        }
        if ((i & 16) != 0) {
            z = recurringOrderAmountArgs.fromInsights;
        }
        if ((i & 32) != 0) {
            z2 = recurringOrderAmountArgs.fromInvestFlow;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return recurringOrderAmountArgs.copy(uuid, investmentScheduleAmount, flowType, apiAssetType, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    /* renamed from: component2, reason: from getter */
    public final InvestmentScheduleAmount getInitialAmount() {
        return this.initialAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final RecurringContext.FlowType getLoggingFlowType() {
        return this.loggingFlowType;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiAssetType getTargetType() {
        return this.targetType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFromInsights() {
        return this.fromInsights;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getFromInvestFlow() {
        return this.fromInvestFlow;
    }

    public final RecurringOrderAmountArgs copy(UUID investmentScheduleId, InvestmentScheduleAmount initialAmount, RecurringContext.FlowType loggingFlowType, ApiAssetType targetType, boolean fromInsights, boolean fromInvestFlow) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
        Intrinsics.checkNotNullParameter(loggingFlowType, "loggingFlowType");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        return new RecurringOrderAmountArgs(investmentScheduleId, initialAmount, loggingFlowType, targetType, fromInsights, fromInvestFlow);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderAmountArgs)) {
            return false;
        }
        RecurringOrderAmountArgs recurringOrderAmountArgs = (RecurringOrderAmountArgs) other;
        return Intrinsics.areEqual(this.investmentScheduleId, recurringOrderAmountArgs.investmentScheduleId) && Intrinsics.areEqual(this.initialAmount, recurringOrderAmountArgs.initialAmount) && this.loggingFlowType == recurringOrderAmountArgs.loggingFlowType && this.targetType == recurringOrderAmountArgs.targetType && this.fromInsights == recurringOrderAmountArgs.fromInsights && this.fromInvestFlow == recurringOrderAmountArgs.fromInvestFlow;
    }

    public int hashCode() {
        return (((((((((this.investmentScheduleId.hashCode() * 31) + this.initialAmount.hashCode()) * 31) + this.loggingFlowType.hashCode()) * 31) + this.targetType.hashCode()) * 31) + Boolean.hashCode(this.fromInsights)) * 31) + Boolean.hashCode(this.fromInvestFlow);
    }

    public String toString() {
        return "RecurringOrderAmountArgs(investmentScheduleId=" + this.investmentScheduleId + ", initialAmount=" + this.initialAmount + ", loggingFlowType=" + this.loggingFlowType + ", targetType=" + this.targetType + ", fromInsights=" + this.fromInsights + ", fromInvestFlow=" + this.fromInvestFlow + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.investmentScheduleId);
        dest.writeParcelable(this.initialAmount, flags);
        dest.writeString(this.loggingFlowType.name());
        dest.writeString(this.targetType.name());
        dest.writeInt(this.fromInsights ? 1 : 0);
        dest.writeInt(this.fromInvestFlow ? 1 : 0);
    }

    public RecurringOrderAmountArgs(UUID investmentScheduleId, InvestmentScheduleAmount initialAmount, RecurringContext.FlowType loggingFlowType, ApiAssetType targetType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
        Intrinsics.checkNotNullParameter(loggingFlowType, "loggingFlowType");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        this.investmentScheduleId = investmentScheduleId;
        this.initialAmount = initialAmount;
        this.loggingFlowType = loggingFlowType;
        this.targetType = targetType;
        this.fromInsights = z;
        this.fromInvestFlow = z2;
    }

    public final UUID getInvestmentScheduleId() {
        return this.investmentScheduleId;
    }

    public final InvestmentScheduleAmount getInitialAmount() {
        return this.initialAmount;
    }

    public /* synthetic */ RecurringOrderAmountArgs(UUID uuid, InvestmentScheduleAmount investmentScheduleAmount, RecurringContext.FlowType flowType, ApiAssetType apiAssetType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, investmentScheduleAmount, (i & 4) != 0 ? RecurringContext.FlowType.FLOW_TYPE_UNSPECIFIED : flowType, apiAssetType, z, (i & 32) != 0 ? false : z2);
    }

    public final RecurringContext.FlowType getLoggingFlowType() {
        return this.loggingFlowType;
    }

    public final ApiAssetType getTargetType() {
        return this.targetType;
    }

    public final boolean getFromInsights() {
        return this.fromInsights;
    }

    public final boolean getFromInvestFlow() {
        return this.fromInvestFlow;
    }
}
