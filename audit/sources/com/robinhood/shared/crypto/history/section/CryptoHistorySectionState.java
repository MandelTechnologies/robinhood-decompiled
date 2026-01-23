package com.robinhood.shared.crypto.history.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.ImmutableSet3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHistorySectionState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002 !B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002\"#¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;", "Landroid/os/Parcelable;", "<init>", "()V", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "filterTypes", "Lkotlinx/collections/immutable/ImmutableSet;", "Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;", "getFilterTypes", "()Lkotlinx/collections/immutable/ImmutableSet;", "transactionTypes", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getTransactionTypes", "instrumentFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$InstrumentFilter;", "getInstrumentFilter", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$InstrumentFilter;", "nummusAccountContext", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "getNummusAccountContext", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "state", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "historyStaticFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "getHistoryStaticFilter", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "Crypto", "Perpetuals", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState$Crypto;", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState$Perpetuals;", "lib-history-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoHistorySectionState implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ CryptoHistorySectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ImmutableSet<AllHistoryFragmentKey.Filter> getFilterTypes();

    public abstract HistoryStaticFilter.InstrumentFilter getInstrumentFilter();

    public abstract UUID getInstrumentId();

    public abstract HistoryStaticFilter.NummusAccountContext getNummusAccountContext();

    public abstract HistoryEvent.State getState();

    public abstract ImmutableSet<HistoryTransactionType> getTransactionTypes();

    private CryptoHistorySectionState() {
    }

    /* compiled from: CryptoHistorySectionState.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020 R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState$Crypto;", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;", "instrumentId", "Ljava/util/UUID;", "nummusAccountContext", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;)V", "getInstrumentId", "()Ljava/util/UUID;", "getNummusAccountContext", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "filterTypes", "Lkotlinx/collections/immutable/ImmutableSet;", "Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;", "getFilterTypes", "()Lkotlinx/collections/immutable/ImmutableSet;", "transactionTypes", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getTransactionTypes", "instrumentFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$InstrumentFilter;", "getInstrumentFilter", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$InstrumentFilter;", "state", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-history-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Crypto extends CryptoHistorySectionState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
        private final UUID instrumentId;
        private final HistoryStaticFilter.NummusAccountContext nummusAccountContext;

        /* compiled from: CryptoHistorySectionState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Crypto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Crypto createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto((UUID) parcel.readSerializable(), (HistoryStaticFilter.NummusAccountContext) parcel.readParcelable(Crypto.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Crypto[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public static /* synthetic */ Crypto copy$default(Crypto crypto2, UUID uuid, HistoryStaticFilter.NummusAccountContext nummusAccountContext, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = crypto2.instrumentId;
            }
            if ((i & 2) != 0) {
                nummusAccountContext = crypto2.nummusAccountContext;
            }
            return crypto2.copy(uuid, nummusAccountContext);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final HistoryStaticFilter.NummusAccountContext getNummusAccountContext() {
            return this.nummusAccountContext;
        }

        public final Crypto copy(UUID instrumentId, HistoryStaticFilter.NummusAccountContext nummusAccountContext) {
            return new Crypto(instrumentId, nummusAccountContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Crypto)) {
                return false;
            }
            Crypto crypto2 = (Crypto) other;
            return Intrinsics.areEqual(this.instrumentId, crypto2.instrumentId) && Intrinsics.areEqual(this.nummusAccountContext, crypto2.nummusAccountContext);
        }

        public int hashCode() {
            UUID uuid = this.instrumentId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            HistoryStaticFilter.NummusAccountContext nummusAccountContext = this.nummusAccountContext;
            return iHashCode + (nummusAccountContext != null ? nummusAccountContext.hashCode() : 0);
        }

        public String toString() {
            return "Crypto(instrumentId=" + this.instrumentId + ", nummusAccountContext=" + this.nummusAccountContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeParcelable(this.nummusAccountContext, flags);
        }

        public /* synthetic */ Crypto(UUID uuid, HistoryStaticFilter.NummusAccountContext nummusAccountContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : nummusAccountContext);
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public HistoryStaticFilter.NummusAccountContext getNummusAccountContext() {
            return this.nummusAccountContext;
        }

        public Crypto(UUID uuid, HistoryStaticFilter.NummusAccountContext nummusAccountContext) {
            super(null);
            this.instrumentId = uuid;
            this.nummusAccountContext = nummusAccountContext;
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public ImmutableSet<AllHistoryFragmentKey.Filter> getFilterTypes() {
            return extensions2.persistentSetOf(AllHistoryFragmentKey.Filter.ORDERS, AllHistoryFragmentKey.Filter.CRYPTO_TRANSFERS, AllHistoryFragmentKey.Filter.CRYPTO_STAKING, AllHistoryFragmentKey.Filter.REWARDS, AllHistoryFragmentKey.Filter.TOKENIZED_STOCKS_DIVIDENDS);
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public ImmutableSet<HistoryTransactionType> getTransactionTypes() {
            return extensions2.persistentSetOf(HistoryTransactionType.CRYPTO_TRANSFER, HistoryTransactionType.CRYPTO_ORDER, HistoryTransactionType.ROUNDUP_REWARD, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_BUYING_POWER, HistoryTransactionType.CRYPTO_INVESTMENT_SCHEDULE_WITH_ACH, HistoryTransactionType.CRYPTO_STAKING, HistoryTransactionType.STOCK_REWARD_ITEM, HistoryTransactionType.CRYPTO_CLAWBACK, HistoryTransactionType.TOKENIZED_CORP_ACTION_SPLIT_PAYMENTS, HistoryTransactionType.TOKENIZED_CORP_ACTION_DIVIDENDS);
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public HistoryStaticFilter.InstrumentFilter getInstrumentFilter() {
            if (getInstrumentId() != null) {
                return new HistoryStaticFilter.InstrumentFilter(getInstrumentId(), HistoryStaticFilter.InstrumentFilterType.CRYPTO);
            }
            return null;
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public HistoryEvent.State getState() {
            return HistoryEvent.State.SETTLED;
        }
    }

    /* compiled from: CryptoHistorySectionState.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState$Perpetuals;", "Lcom/robinhood/shared/crypto/history/section/CryptoHistorySectionState;", "instrumentId", "Ljava/util/UUID;", "nummusAccountContext", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "filterOverride", "Lkotlinx/collections/immutable/ImmutableSet;", "Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;Lkotlinx/collections/immutable/ImmutableSet;)V", "getInstrumentId", "()Ljava/util/UUID;", "getNummusAccountContext", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$NummusAccountContext;", "getFilterOverride", "()Lkotlinx/collections/immutable/ImmutableSet;", "filterTypes", "getFilterTypes", "transactionTypes", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getTransactionTypes", "instrumentFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$InstrumentFilter;", "getInstrumentFilter", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$InstrumentFilter;", "state", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-history-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Perpetuals extends CryptoHistorySectionState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Perpetuals> CREATOR = new Creator();
        private final ImmutableSet<AllHistoryFragmentKey.Filter> filterOverride;
        private final UUID instrumentId;
        private final HistoryStaticFilter.NummusAccountContext nummusAccountContext;

        /* compiled from: CryptoHistorySectionState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Perpetuals> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Perpetuals createFromParcel(Parcel parcel) {
                ImmutableSet3 persistentSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                HistoryStaticFilter.NummusAccountContext nummusAccountContext = (HistoryStaticFilter.NummusAccountContext) parcel.readParcelable(Perpetuals.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    persistentSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(AllHistoryFragmentKey.Filter.valueOf(parcel.readString()));
                    }
                    persistentSet = extensions2.toPersistentSet(linkedHashSet);
                }
                return new Perpetuals(uuid, nummusAccountContext, persistentSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Perpetuals[] newArray(int i) {
                return new Perpetuals[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Perpetuals copy$default(Perpetuals perpetuals, UUID uuid, HistoryStaticFilter.NummusAccountContext nummusAccountContext, ImmutableSet immutableSet, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = perpetuals.instrumentId;
            }
            if ((i & 2) != 0) {
                nummusAccountContext = perpetuals.nummusAccountContext;
            }
            if ((i & 4) != 0) {
                immutableSet = perpetuals.filterOverride;
            }
            return perpetuals.copy(uuid, nummusAccountContext, immutableSet);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final HistoryStaticFilter.NummusAccountContext getNummusAccountContext() {
            return this.nummusAccountContext;
        }

        public final ImmutableSet<AllHistoryFragmentKey.Filter> component3() {
            return this.filterOverride;
        }

        public final Perpetuals copy(UUID instrumentId, HistoryStaticFilter.NummusAccountContext nummusAccountContext, ImmutableSet<? extends AllHistoryFragmentKey.Filter> filterOverride) {
            return new Perpetuals(instrumentId, nummusAccountContext, filterOverride);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Perpetuals)) {
                return false;
            }
            Perpetuals perpetuals = (Perpetuals) other;
            return Intrinsics.areEqual(this.instrumentId, perpetuals.instrumentId) && Intrinsics.areEqual(this.nummusAccountContext, perpetuals.nummusAccountContext) && Intrinsics.areEqual(this.filterOverride, perpetuals.filterOverride);
        }

        public int hashCode() {
            UUID uuid = this.instrumentId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            HistoryStaticFilter.NummusAccountContext nummusAccountContext = this.nummusAccountContext;
            int iHashCode2 = (iHashCode + (nummusAccountContext == null ? 0 : nummusAccountContext.hashCode())) * 31;
            ImmutableSet<AllHistoryFragmentKey.Filter> immutableSet = this.filterOverride;
            return iHashCode2 + (immutableSet != null ? immutableSet.hashCode() : 0);
        }

        public String toString() {
            return "Perpetuals(instrumentId=" + this.instrumentId + ", nummusAccountContext=" + this.nummusAccountContext + ", filterOverride=" + this.filterOverride + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeParcelable(this.nummusAccountContext, flags);
            ImmutableSet<AllHistoryFragmentKey.Filter> immutableSet = this.filterOverride;
            if (immutableSet == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(immutableSet.size());
            Iterator<AllHistoryFragmentKey.Filter> it = immutableSet.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
        }

        public /* synthetic */ Perpetuals(UUID uuid, HistoryStaticFilter.NummusAccountContext nummusAccountContext, ImmutableSet immutableSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : nummusAccountContext, (i & 4) != 0 ? null : immutableSet);
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public HistoryStaticFilter.NummusAccountContext getNummusAccountContext() {
            return this.nummusAccountContext;
        }

        public final ImmutableSet<AllHistoryFragmentKey.Filter> getFilterOverride() {
            return this.filterOverride;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Perpetuals(UUID uuid, HistoryStaticFilter.NummusAccountContext nummusAccountContext, ImmutableSet<? extends AllHistoryFragmentKey.Filter> immutableSet) {
            super(null);
            this.instrumentId = uuid;
            this.nummusAccountContext = nummusAccountContext;
            this.filterOverride = immutableSet;
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public ImmutableSet<AllHistoryFragmentKey.Filter> getFilterTypes() {
            ImmutableSet<AllHistoryFragmentKey.Filter> immutableSet = this.filterOverride;
            return immutableSet == null ? extensions2.persistentSetOf(AllHistoryFragmentKey.Filter.PERPETUALS_ORDERS, AllHistoryFragmentKey.Filter.PERPETUALS_MARGIN_CHANGE) : immutableSet;
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public ImmutableSet<HistoryTransactionType> getTransactionTypes() {
            return extensions2.persistentSetOf(HistoryTransactionType.PERPETUALS_ORDER, HistoryTransactionType.PERPETUALS_LIQUIDATION, HistoryTransactionType.PERPETUALS_MARGIN_CHANGE);
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public HistoryStaticFilter.InstrumentFilter getInstrumentFilter() {
            UUID instrumentId = getInstrumentId();
            if (instrumentId != null) {
                return new HistoryStaticFilter.InstrumentFilter(instrumentId, HistoryStaticFilter.InstrumentFilterType.PERPETUALS);
            }
            return null;
        }

        @Override // com.robinhood.shared.crypto.history.section.CryptoHistorySectionState
        public HistoryEvent.State getState() {
            return HistoryEvent.State.SETTLED;
        }
    }

    public final HistoryStaticFilter getHistoryStaticFilter() {
        return new HistoryStaticFilter(getInstrumentFilter(), null, getNummusAccountContext(), null, null, null, null, null, null, null, 1018, null);
    }
}
