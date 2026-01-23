package com.robinhood.android.equities.eventupdates;

import androidx.lifecycle.SavedStateHandle;
import androidx.paging.PagingData;
import com.robinhood.android.equities.contracts.EquityEventUpdatesKey;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.equities.eventupdates.store.EquityEventUpdatesStore;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EquityEventUpdatesScreenDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesScreenDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "", "Lcom/robinhood/android/udf/HasSavedState;", "equityEventUpdatesStore", "Lcom/robinhood/equities/eventupdates/store/EquityEventUpdatesStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/equities/eventupdates/store/EquityEventUpdatesStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pagingData", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdateDto;", "getPagingData", "()Lkotlinx/coroutines/flow/Flow;", "pagingData$delegate", "Lkotlin/Lazy;", "Companion", "feature-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityEventUpdatesScreenDuxo extends BaseDuxo4<Unit> implements HasSavedState {
    private final EquityEventUpdatesStore equityEventUpdatesStore;

    /* renamed from: pagingData$delegate, reason: from kotlin metadata */
    private final Lazy pagingData;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityEventUpdatesScreenDuxo(EquityEventUpdatesStore equityEventUpdatesStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(equityEventUpdatesStore, "equityEventUpdatesStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.equityEventUpdatesStore = equityEventUpdatesStore;
        this.savedStateHandle = savedStateHandle;
        this.pagingData = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equities.eventupdates.EquityEventUpdatesScreenDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityEventUpdatesScreenDuxo.pagingData_delegate$lambda$0(this.f$0);
            }
        });
    }

    public final Flow<PagingData<EquityEventUpdateDto>> getPagingData() {
        return (Flow) this.pagingData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pagingData_delegate$lambda$0(EquityEventUpdatesScreenDuxo equityEventUpdatesScreenDuxo) {
        return EquityEventUpdatesStore.getPagingData$default(equityEventUpdatesScreenDuxo.equityEventUpdatesStore, ((EquityEventUpdatesKey) INSTANCE.getArgs((HasSavedState) equityEventUpdatesScreenDuxo)).getInstrumentId(), 0, 0, false, 14, null);
    }

    /* compiled from: EquityEventUpdatesScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesScreenDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equities/eventupdates/EquityEventUpdatesScreenDuxo;", "Lcom/robinhood/android/equities/contracts/EquityEventUpdatesKey;", "<init>", "()V", "feature-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EquityEventUpdatesScreenDuxo, EquityEventUpdatesKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityEventUpdatesKey getArgs(SavedStateHandle savedStateHandle) {
            return (EquityEventUpdatesKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityEventUpdatesKey getArgs(EquityEventUpdatesScreenDuxo equityEventUpdatesScreenDuxo) {
            return (EquityEventUpdatesKey) DuxoCompanion.DefaultImpls.getArgs(this, equityEventUpdatesScreenDuxo);
        }
    }
}
