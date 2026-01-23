package com.robinhood.android.retirementhistory;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryDetail;
import com.robinhood.android.models.retirement.p194db.RetirementHistoryItem;
import com.robinhood.android.retirement.contracts.RetirementHistoryItemDetails;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementHistoryItemDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDataState;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementHistoryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementHistoryStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementHistoryStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementHistoryItemDetailDuxo extends BaseDuxo<RetirementHistoryItemDataState, RetirementHistoryItemViewState> implements HasSavedState {
    private final RetirementHistoryStore retirementHistoryStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RetirementHistoryItemDetailDuxo(RetirementHistoryStore retirementHistoryStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new RetirementHistoryItemDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), RetirementHistoryItemDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(retirementHistoryStore, "retirementHistoryStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.retirementHistoryStore = retirementHistoryStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        RetirementHistoryStore retirementHistoryStore = this.retirementHistoryStore;
        Companion companion = INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(retirementHistoryStore.getHistoryItem(((RetirementHistoryItemDetails) companion.getArgs((HasSavedState) this)).getId()), this.retirementHistoryStore.getHistoryItemDetails(((RetirementHistoryItemDetails) companion.getArgs((HasSavedState) this)).getId()), new BiFunction() { // from class: com.robinhood.android.retirementhistory.RetirementHistoryItemDetailDuxo.onStart.1
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<RetirementHistoryItem, ApiRetirementFeeHistoryDetail> apply(RetirementHistoryItem item, Optional<ApiRetirementFeeHistoryDetail> details) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(details, "details");
                return Tuples4.m3642to(item, details.getOrNull());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableCombineLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirementhistory.RetirementHistoryItemDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementHistoryItemDetailDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RetirementHistoryItemDetailDuxo retirementHistoryItemDetailDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        retirementHistoryItemDetailDuxo.applyMutation(new RetirementHistoryItemDetailDuxo2((RetirementHistoryItem) objComponent1, (ApiRetirementFeeHistoryDetail) tuples2.component2(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementHistoryItemDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirementhistory/RetirementHistoryItemDetailDuxo;", "Lcom/robinhood/android/retirement/contracts/RetirementHistoryItemDetails;", "<init>", "()V", "feature-retirement-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementHistoryItemDetailDuxo, RetirementHistoryItemDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementHistoryItemDetails getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementHistoryItemDetails) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementHistoryItemDetails getArgs(RetirementHistoryItemDetailDuxo retirementHistoryItemDetailDuxo) {
            return (RetirementHistoryItemDetails) DuxoCompanion.DefaultImpls.getArgs(this, retirementHistoryItemDetailDuxo);
        }
    }
}
