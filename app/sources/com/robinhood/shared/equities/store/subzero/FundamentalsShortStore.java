package com.robinhood.shared.equities.store.subzero;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.shared.equities.subzero.ApiFundamentalsShortData;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.LocalDate;

/* compiled from: FundamentalsShortStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/FundamentalsShortStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "brokeback", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/api/equity/EquitiesBrokeback;Lcom/robinhood/store/StoreBundle;)V", "", "", "instrumentIds", "j$/time/LocalDate", "startDate", "endDate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/equities/subzero/ApiFundamentalsShortData;", "streamFundamentalsShort", "(Ljava/util/List;Lj$/time/LocalDate;Lj$/time/LocalDate;)Lkotlinx/coroutines/flow/Flow;", "getFundamentalsShortOnce", "(Ljava/util/List;Lj$/time/LocalDate;Lj$/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/equities/store/subzero/FundamentalsShortStore$FundamentalsShortRequest;", "getFundamentalsShort", "Lcom/robinhood/android/moria/network/Endpoint;", "FundamentalsShortRequest", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class FundamentalsShortStore extends Store {
    private final EquitiesBrokeback brokeback;
    private final Endpoint<FundamentalsShortRequest, List<ApiFundamentalsShortData>> getFundamentalsShort;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundamentalsShortStore(EquitiesBrokeback brokeback, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.brokeback = brokeback;
        this.getFundamentalsShort = Endpoint.Companion.create$default(Endpoint.INSTANCE, new FundamentalsShortStore2(this, null), getLogoutKillswitch(), new FundamentalsShortStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FundamentalsShortStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ8\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/FundamentalsShortStore$FundamentalsShortRequest;", "", "", "", "instrumentIds", "j$/time/LocalDate", "startDate", "endDate", "<init>", "(Ljava/util/List;Lj$/time/LocalDate;Lj$/time/LocalDate;)V", "component1", "()Ljava/util/List;", "component2", "()Lj$/time/LocalDate;", "component3", "copy", "(Ljava/util/List;Lj$/time/LocalDate;Lj$/time/LocalDate;)Lcom/robinhood/shared/equities/store/subzero/FundamentalsShortStore$FundamentalsShortRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInstrumentIds", "Lj$/time/LocalDate;", "getStartDate", "getEndDate", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class FundamentalsShortRequest {
        private final LocalDate endDate;
        private final List<String> instrumentIds;
        private final LocalDate startDate;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FundamentalsShortRequest copy$default(FundamentalsShortRequest fundamentalsShortRequest, List list, LocalDate localDate, LocalDate localDate2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = fundamentalsShortRequest.instrumentIds;
            }
            if ((i & 2) != 0) {
                localDate = fundamentalsShortRequest.startDate;
            }
            if ((i & 4) != 0) {
                localDate2 = fundamentalsShortRequest.endDate;
            }
            return fundamentalsShortRequest.copy(list, localDate, localDate2);
        }

        public final List<String> component1() {
            return this.instrumentIds;
        }

        /* renamed from: component2, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalDate getEndDate() {
            return this.endDate;
        }

        public final FundamentalsShortRequest copy(List<String> instrumentIds, LocalDate startDate, LocalDate endDate) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            return new FundamentalsShortRequest(instrumentIds, startDate, endDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FundamentalsShortRequest)) {
                return false;
            }
            FundamentalsShortRequest fundamentalsShortRequest = (FundamentalsShortRequest) other;
            return Intrinsics.areEqual(this.instrumentIds, fundamentalsShortRequest.instrumentIds) && Intrinsics.areEqual(this.startDate, fundamentalsShortRequest.startDate) && Intrinsics.areEqual(this.endDate, fundamentalsShortRequest.endDate);
        }

        public int hashCode() {
            int iHashCode = this.instrumentIds.hashCode() * 31;
            LocalDate localDate = this.startDate;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.endDate;
            return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "FundamentalsShortRequest(instrumentIds=" + this.instrumentIds + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
        }

        public FundamentalsShortRequest(List<String> instrumentIds, LocalDate localDate, LocalDate localDate2) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            this.instrumentIds = instrumentIds;
            this.startDate = localDate;
            this.endDate = localDate2;
        }

        public /* synthetic */ FundamentalsShortRequest(List list, LocalDate localDate, LocalDate localDate2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : localDate, (i & 4) != 0 ? null : localDate2);
        }

        public final List<String> getInstrumentIds() {
            return this.instrumentIds;
        }

        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final LocalDate getEndDate() {
            return this.endDate;
        }
    }

    public static /* synthetic */ Flow streamFundamentalsShort$default(FundamentalsShortStore fundamentalsShortStore, List list, LocalDate localDate, LocalDate localDate2, int i, Object obj) {
        if ((i & 2) != 0) {
            localDate = null;
        }
        if ((i & 4) != 0) {
            localDate2 = null;
        }
        return fundamentalsShortStore.streamFundamentalsShort(list, localDate, localDate2);
    }

    public final Flow<List<ApiFundamentalsShortData>> streamFundamentalsShort(List<String> instrumentIds, LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return Endpoint.DefaultImpls.poll$default(this.getFundamentalsShort, new FundamentalsShortRequest(instrumentIds, startDate, endDate), null, null, 6, null);
    }

    public static /* synthetic */ Object getFundamentalsShortOnce$default(FundamentalsShortStore fundamentalsShortStore, List list, LocalDate localDate, LocalDate localDate2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            localDate = null;
        }
        if ((i & 4) != 0) {
            localDate2 = null;
        }
        return fundamentalsShortStore.getFundamentalsShortOnce(list, localDate, localDate2, continuation);
    }

    public final Object getFundamentalsShortOnce(List<String> list, LocalDate localDate, LocalDate localDate2, Continuation<? super List<ApiFundamentalsShortData>> continuation) {
        return Endpoint.DefaultImpls.fetch$default(this.getFundamentalsShort, new FundamentalsShortRequest(list, localDate, localDate2), null, continuation, 2, null);
    }
}
