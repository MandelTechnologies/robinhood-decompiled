package com.robinhood.android.common.recurring.trade;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderArgs.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderArgs;", "Landroid/os/Parcelable;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "orderConfiguration", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "crashlyticsLoggingEntryPoint", "", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;Ljava/lang/String;)V", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getOrderConfiguration", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "getCrashlyticsLoggingEntryPoint", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringOrderArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringOrderArgs> CREATOR = new Creator();
    private final String crashlyticsLoggingEntryPoint;
    private final InvestmentTarget investmentTarget;
    private final RecurringOrderConfiguration orderConfiguration;

    /* compiled from: RecurringOrderArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringOrderArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringOrderArgs((InvestmentTarget) parcel.readParcelable(RecurringOrderArgs.class.getClassLoader()), (RecurringOrderConfiguration) parcel.readParcelable(RecurringOrderArgs.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringOrderArgs[] newArray(int i) {
            return new RecurringOrderArgs[i];
        }
    }

    public static /* synthetic */ RecurringOrderArgs copy$default(RecurringOrderArgs recurringOrderArgs, InvestmentTarget investmentTarget, RecurringOrderConfiguration recurringOrderConfiguration, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentTarget = recurringOrderArgs.investmentTarget;
        }
        if ((i & 2) != 0) {
            recurringOrderConfiguration = recurringOrderArgs.orderConfiguration;
        }
        if ((i & 4) != 0) {
            str = recurringOrderArgs.crashlyticsLoggingEntryPoint;
        }
        return recurringOrderArgs.copy(investmentTarget, recurringOrderConfiguration, str);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    /* renamed from: component2, reason: from getter */
    public final RecurringOrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCrashlyticsLoggingEntryPoint() {
        return this.crashlyticsLoggingEntryPoint;
    }

    public final RecurringOrderArgs copy(InvestmentTarget investmentTarget, RecurringOrderConfiguration orderConfiguration, String crashlyticsLoggingEntryPoint) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        Intrinsics.checkNotNullParameter(crashlyticsLoggingEntryPoint, "crashlyticsLoggingEntryPoint");
        return new RecurringOrderArgs(investmentTarget, orderConfiguration, crashlyticsLoggingEntryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringOrderArgs)) {
            return false;
        }
        RecurringOrderArgs recurringOrderArgs = (RecurringOrderArgs) other;
        return Intrinsics.areEqual(this.investmentTarget, recurringOrderArgs.investmentTarget) && Intrinsics.areEqual(this.orderConfiguration, recurringOrderArgs.orderConfiguration) && Intrinsics.areEqual(this.crashlyticsLoggingEntryPoint, recurringOrderArgs.crashlyticsLoggingEntryPoint);
    }

    public int hashCode() {
        return (((this.investmentTarget.hashCode() * 31) + this.orderConfiguration.hashCode()) * 31) + this.crashlyticsLoggingEntryPoint.hashCode();
    }

    public String toString() {
        return "RecurringOrderArgs(investmentTarget=" + this.investmentTarget + ", orderConfiguration=" + this.orderConfiguration + ", crashlyticsLoggingEntryPoint=" + this.crashlyticsLoggingEntryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.investmentTarget, flags);
        dest.writeParcelable(this.orderConfiguration, flags);
        dest.writeString(this.crashlyticsLoggingEntryPoint);
    }

    public RecurringOrderArgs(InvestmentTarget investmentTarget, RecurringOrderConfiguration orderConfiguration, String crashlyticsLoggingEntryPoint) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        Intrinsics.checkNotNullParameter(crashlyticsLoggingEntryPoint, "crashlyticsLoggingEntryPoint");
        this.investmentTarget = investmentTarget;
        this.orderConfiguration = orderConfiguration;
        this.crashlyticsLoggingEntryPoint = crashlyticsLoggingEntryPoint;
    }

    public final InvestmentTarget getInvestmentTarget() {
        return this.investmentTarget;
    }

    public final RecurringOrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    public final String getCrashlyticsLoggingEntryPoint() {
        return this.crashlyticsLoggingEntryPoint;
    }
}
