package com.robinhood.android.trading.contracts.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.Order;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderConfiguration.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "Landroid/os/Parcelable;", "orderAmountType", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "getOrderAmountType", "()Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "isBuySellOrder", "", "()Z", "isBuySellSharesOrder", "isBuySellDollarOrder", "isDefaultOrderType", "Resolved", "Direct", "Recurring", "DirectIpoOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Direct;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$DirectIpoOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Recurring;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface EquityOrderConfiguration extends Parcelable {
    DefaultableOrderConfiguration getOrderAmountType();

    boolean isBuySellDollarOrder();

    boolean isBuySellOrder();

    boolean isBuySellSharesOrder();

    boolean isDefaultOrderType();

    /* compiled from: EquityOrderConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$DirectIpoOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Recurring;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Resolved extends EquityOrderConfiguration {

        /* compiled from: EquityOrderConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static DefaultableOrderConfiguration getOrderAmountType(Resolved resolved) {
                return DefaultImpls.getOrderAmountType(resolved);
            }

            public static boolean isBuySellDollarOrder(Resolved resolved) {
                return DefaultImpls.isBuySellDollarOrder(resolved);
            }

            public static boolean isBuySellOrder(Resolved resolved) {
                return DefaultImpls.isBuySellOrder(resolved);
            }

            public static boolean isBuySellSharesOrder(Resolved resolved) {
                return DefaultImpls.isBuySellSharesOrder(resolved);
            }

            public static boolean isDefaultOrderType(Resolved resolved) {
                return DefaultImpls.isDefaultOrderType(resolved);
            }
        }
    }

    /* compiled from: EquityOrderConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Direct;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "Lcom/robinhood/android/trading/contracts/configuration/DollarOrder;", "Lcom/robinhood/android/trading/contracts/configuration/ShareOrder;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Direct extends EquityOrderConfiguration {
        String getAccountNumber();

        Order.Configuration getOrderConfiguration();

        /* compiled from: EquityOrderConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static DefaultableOrderConfiguration getOrderAmountType(Direct direct) {
                return DefaultImpls.getOrderAmountType(direct);
            }

            public static boolean isBuySellDollarOrder(Direct direct) {
                return DefaultImpls.isBuySellDollarOrder(direct);
            }

            public static boolean isBuySellOrder(Direct direct) {
                return DefaultImpls.isBuySellOrder(direct);
            }

            public static boolean isBuySellSharesOrder(Direct direct) {
                return DefaultImpls.isBuySellSharesOrder(direct);
            }

            public static boolean isDefaultOrderType(Direct direct) {
                return DefaultImpls.isDefaultOrderType(direct);
            }
        }
    }

    /* compiled from: EquityOrderConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Recurring;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "<init>", "(Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Recurring implements EquityOrderConfiguration, Resolved {
        public static final Parcelable.Creator<Recurring> CREATOR = new Creator();
        private final RecurringOrderConfiguration configuration;

        /* compiled from: EquityOrderConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Recurring> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recurring createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recurring((RecurringOrderConfiguration) parcel.readParcelable(Recurring.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Recurring[] newArray(int i) {
                return new Recurring[i];
            }
        }

        public static /* synthetic */ Recurring copy$default(Recurring recurring, RecurringOrderConfiguration recurringOrderConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                recurringOrderConfiguration = recurring.configuration;
            }
            return recurring.copy(recurringOrderConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final RecurringOrderConfiguration getConfiguration() {
            return this.configuration;
        }

        public final Recurring copy(RecurringOrderConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Recurring(configuration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Recurring) && Intrinsics.areEqual(this.configuration, ((Recurring) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "Recurring(configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return DefaultImpls.isDefaultOrderType(this);
        }

        public Recurring(RecurringOrderConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final RecurringOrderConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: EquityOrderConfiguration.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$DirectIpoOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration$Resolved;", "source", "Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "<init>", "(Lcom/robinhood/directipo/models/DirectIpoOrderSource;)V", "getSource", "()Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DirectIpoOrderConfiguration implements EquityOrderConfiguration, Resolved {
        public static final Parcelable.Creator<DirectIpoOrderConfiguration> CREATOR = new Creator();
        private final DirectIpoOrderSource source;

        /* compiled from: EquityOrderConfiguration.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DirectIpoOrderConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpoOrderConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectIpoOrderConfiguration(parcel.readInt() == 0 ? null : DirectIpoOrderSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpoOrderConfiguration[] newArray(int i) {
                return new DirectIpoOrderConfiguration[i];
            }
        }

        public static /* synthetic */ DirectIpoOrderConfiguration copy$default(DirectIpoOrderConfiguration directIpoOrderConfiguration, DirectIpoOrderSource directIpoOrderSource, int i, Object obj) {
            if ((i & 1) != 0) {
                directIpoOrderSource = directIpoOrderConfiguration.source;
            }
            return directIpoOrderConfiguration.copy(directIpoOrderSource);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectIpoOrderSource getSource() {
            return this.source;
        }

        public final DirectIpoOrderConfiguration copy(DirectIpoOrderSource source) {
            return new DirectIpoOrderConfiguration(source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DirectIpoOrderConfiguration) && this.source == ((DirectIpoOrderConfiguration) other).source;
        }

        public int hashCode() {
            DirectIpoOrderSource directIpoOrderSource = this.source;
            if (directIpoOrderSource == null) {
                return 0;
            }
            return directIpoOrderSource.hashCode();
        }

        public String toString() {
            return "DirectIpoOrderConfiguration(source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DirectIpoOrderSource directIpoOrderSource = this.source;
            if (directIpoOrderSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(directIpoOrderSource.name());
            }
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public DefaultableOrderConfiguration getOrderAmountType() {
            return DefaultImpls.getOrderAmountType(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellDollarOrder() {
            return DefaultImpls.isBuySellDollarOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellOrder() {
            return DefaultImpls.isBuySellOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isBuySellSharesOrder() {
            return DefaultImpls.isBuySellSharesOrder(this);
        }

        @Override // com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration
        public boolean isDefaultOrderType() {
            return DefaultImpls.isDefaultOrderType(this);
        }

        public DirectIpoOrderConfiguration(DirectIpoOrderSource directIpoOrderSource) {
            this.source = directIpoOrderSource;
        }

        public final DirectIpoOrderSource getSource() {
            return this.source;
        }
    }

    /* compiled from: EquityOrderConfiguration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static DefaultableOrderConfiguration getOrderAmountType(EquityOrderConfiguration equityOrderConfiguration) {
            return null;
        }

        public static boolean isBuySellOrder(EquityOrderConfiguration equityOrderConfiguration) {
            return (equityOrderConfiguration instanceof DirectOrder5) || (equityOrderConfiguration instanceof ShareMarket) || (equityOrderConfiguration instanceof DollarBased3);
        }

        public static boolean isBuySellSharesOrder(EquityOrderConfiguration equityOrderConfiguration) {
            return (equityOrderConfiguration instanceof ShareSimpleLimit) || (equityOrderConfiguration instanceof ShareMarket);
        }

        public static boolean isBuySellDollarOrder(EquityOrderConfiguration equityOrderConfiguration) {
            return (equityOrderConfiguration instanceof DollarBased5) || (equityOrderConfiguration instanceof DollarBased3);
        }

        public static boolean isDefaultOrderType(EquityOrderConfiguration equityOrderConfiguration) {
            return equityOrderConfiguration.isBuySellOrder() || (equityOrderConfiguration instanceof DirectOrder2);
        }
    }
}
