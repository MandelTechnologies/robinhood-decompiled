package com.robinhood.android.trade.equity.p261ui.loadoptionchain;

import com.robinhood.models.p355ui.UiOptionChain;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: LoadOptionChainViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState;", "", "<init>", "()V", "Loading", "Error", "Loaded", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState$Error;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState$Loaded;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState$Loading;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class LoadOptionChainViewState {
    public static final int $stable = 0;

    public /* synthetic */ LoadOptionChainViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LoadOptionChainViewState() {
    }

    /* compiled from: LoadOptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState$Loading;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends LoadOptionChainViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: LoadOptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState$Error;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends LoadOptionChainViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    /* compiled from: LoadOptionChainViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState$Loaded;", "Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState;", "Ljava/util/UUID;", "instrumentId", "Lcom/robinhood/models/ui/UiOptionChain;", "optionChain", "", "accountNumber", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/UiOptionChain;Ljava/lang/String;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/ui/UiOptionChain;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/ui/UiOptionChain;Ljava/lang/String;)Lcom/robinhood/android/trade/equity/ui/loadoptionchain/LoadOptionChainViewState$Loaded;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getInstrumentId", "Lcom/robinhood/models/ui/UiOptionChain;", "getOptionChain", "Ljava/lang/String;", "getAccountNumber", "getOptionChainId", "optionChainId", "", "j$/time/LocalDate", "getOptionChainExpirationDates", "()Ljava/util/List;", "optionChainExpirationDates", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends LoadOptionChainViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID instrumentId;
        private final UiOptionChain optionChain;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UUID uuid, UiOptionChain uiOptionChain, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = loaded.instrumentId;
            }
            if ((i & 2) != 0) {
                uiOptionChain = loaded.optionChain;
            }
            if ((i & 4) != 0) {
                str = loaded.accountNumber;
            }
            return loaded.copy(uuid, uiOptionChain, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final UiOptionChain getOptionChain() {
            return this.optionChain;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Loaded copy(UUID instrumentId, UiOptionChain optionChain, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(optionChain, "optionChain");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Loaded(instrumentId, optionChain, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.instrumentId, loaded.instrumentId) && Intrinsics.areEqual(this.optionChain, loaded.optionChain) && Intrinsics.areEqual(this.accountNumber, loaded.accountNumber);
        }

        public int hashCode() {
            return (((this.instrumentId.hashCode() * 31) + this.optionChain.hashCode()) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "Loaded(instrumentId=" + this.instrumentId + ", optionChain=" + this.optionChain + ", accountNumber=" + this.accountNumber + ")";
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final UiOptionChain getOptionChain() {
            return this.optionChain;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(UUID instrumentId, UiOptionChain optionChain, String accountNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(optionChain, "optionChain");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentId = instrumentId;
            this.optionChain = optionChain;
            this.accountNumber = accountNumber;
        }

        public final UUID getOptionChainId() {
            return this.optionChain.getOptionChain().getId();
        }

        public final List<LocalDate> getOptionChainExpirationDates() {
            return this.optionChain.getOptionChain().getExpirationDates();
        }
    }
}
