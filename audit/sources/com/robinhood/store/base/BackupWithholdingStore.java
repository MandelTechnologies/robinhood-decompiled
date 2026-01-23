package com.robinhood.store.base;

import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingInfoSheet;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BackupWithholdingStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ&\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J.\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J.\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u0013H&J\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003H&¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/store/base/BackupWithholdingStore;", "", "streamWithholdingStatus", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "refreshWithholdingStatus", "Lkotlinx/coroutines/Job;", "streamTaxWithholdingEstimatedAmount", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "amount", "Ljava/math/BigDecimal;", "pollWithholdingAmount", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "params", "Lkotlin/Pair;", "", "pollOrderWithholdingAmount", "Lkotlinx/coroutines/flow/Flow;", "orderStream", "Lcom/robinhood/models/db/Order;", "getTaxWithholdingInfoSheet", "Lcom/robinhood/models/db/bonfire/WithholdingInfoSheet;", "Stub", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface BackupWithholdingStore {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Observable<WithholdingInfoSheet> getTaxWithholdingInfoSheet();

    Flow<WithholdingAmount> pollOrderWithholdingAmount(Observable<Order> orderStream);

    Observable<Optional<WithholdingAmount>> pollWithholdingAmount(Tuples2<String, ? extends List<UUID>> params);

    Job refreshWithholdingStatus(String accountNumber, UUID instrumentId);

    Observable<Optional<WithholdingEstimatedAmount>> streamTaxWithholdingEstimatedAmount(BigDecimal amount, String accountNumber, UUID instrumentId);

    Observable<Optional<WithholdingStatus>> streamWithholdingStatus(String accountNumber, UUID instrumentId);

    /* compiled from: BackupWithholdingStore.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00052\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00160\u0015H\u0016J\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005H\u0016¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/base/BackupWithholdingStore$Stub;", "Lcom/robinhood/store/base/BackupWithholdingStore;", "<init>", "()V", "streamWithholdingStatus", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "refreshWithholdingStatus", "Lkotlinx/coroutines/Job;", "streamTaxWithholdingEstimatedAmount", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "amount", "Ljava/math/BigDecimal;", "pollWithholdingAmount", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "params", "Lkotlin/Pair;", "", "pollOrderWithholdingAmount", "Lkotlinx/coroutines/flow/Flow;", "orderStream", "Lcom/robinhood/models/db/Order;", "getTaxWithholdingInfoSheet", "Lcom/robinhood/models/db/bonfire/WithholdingInfoSheet;", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.base.BackupWithholdingStore$Stub, reason: from kotlin metadata */
    public static final class Companion implements BackupWithholdingStore {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // com.robinhood.store.base.BackupWithholdingStore
        public Observable<Optional<WithholdingStatus>> streamWithholdingStatus(String accountNumber, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Observable<Optional<WithholdingStatus>> observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.BackupWithholdingStore
        public Job refreshWithholdingStatus(String accountNumber, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return Job6.Job$default(null, 1, null);
        }

        @Override // com.robinhood.store.base.BackupWithholdingStore
        public Observable<Optional<WithholdingEstimatedAmount>> streamTaxWithholdingEstimatedAmount(BigDecimal amount, String accountNumber, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Observable<Optional<WithholdingEstimatedAmount>> observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.BackupWithholdingStore
        public Observable<Optional<WithholdingAmount>> pollWithholdingAmount(Tuples2<String, ? extends List<UUID>> params) {
            Intrinsics.checkNotNullParameter(params, "params");
            Observable<Optional<WithholdingAmount>> observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }

        @Override // com.robinhood.store.base.BackupWithholdingStore
        public Flow<WithholdingAmount> pollOrderWithholdingAmount(Observable<Order> orderStream) {
            Intrinsics.checkNotNullParameter(orderStream, "orderStream");
            return FlowKt.emptyFlow();
        }

        @Override // com.robinhood.store.base.BackupWithholdingStore
        public Observable<WithholdingInfoSheet> getTaxWithholdingInfoSheet() {
            Observable<WithholdingInfoSheet> observableNever = Observable.never();
            Intrinsics.checkNotNullExpressionValue(observableNever, "never(...)");
            return observableNever;
        }
    }
}
