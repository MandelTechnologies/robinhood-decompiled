package com.robinhood.android.common.recurring.amount.type;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeViewState;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import io.reactivex.Scheduler;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderAmountTypeDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "directDepositRelationshipId", "Ljava/util/UUID;", "onStart", "", "onAmountTypeSelected", "amountType", "Lcom/robinhood/recurring/models/AmountType;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringOrderAmountTypeDuxo extends OldBaseDuxo<RecurringOrderAmountTypeViewState> implements HasSavedState {
    private final UUID directDepositRelationshipId;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringOrderAmountTypeDuxo(DirectDepositRelationshipStore directDepositRelationshipStore, SavedStateHandle savedStateHandle) {
        InvestmentSchedule investmentSchedule;
        InvestmentScheduleAmount investmentScheduleAmount;
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        ApiAssetType assetType = ((RecurringOrderAmountTypeArgs) companion.getArgs(savedStateHandle)).getAssetType();
        RecurringOrderActionType actionType = ((RecurringOrderAmountTypeArgs) companion.getArgs(savedStateHandle)).getActionType();
        Scheduler scheduler = null;
        Object[] objArr = 0;
        RecurringOrderActionType.Edit edit = actionType instanceof RecurringOrderActionType.Edit ? (RecurringOrderActionType.Edit) actionType : null;
        super(new RecurringOrderAmountTypeViewState(assetType, null, null, (edit == null || (investmentSchedule = edit.getInvestmentSchedule()) == null || (investmentScheduleAmount = investmentSchedule.getInvestmentScheduleAmount()) == null) ? null : investmentScheduleAmount.getAmountType(), ((RecurringOrderAmountTypeArgs) companion.getArgs(savedStateHandle)).getFrequency(), 6, null), scheduler, 2, objArr == true ? 1 : 0);
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.savedStateHandle = savedStateHandle;
        this.directDepositRelationshipId = ((RecurringOrderAmountTypeArgs) companion.getArgs((HasSavedState) this)).getDirectDepositRelationshipId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        UUID uuid = this.directDepositRelationshipId;
        if (uuid == null) {
            applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderAmountTypeDuxo.onStart$lambda$0((RecurringOrderAmountTypeViewState) obj);
                }
            });
        } else {
            LifecycleHost.DefaultImpls.bind$default(this, this.directDepositRelationshipStore.getDirectDepositRelationship(uuid), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderAmountTypeDuxo.onStart$lambda$2(this.f$0, (DirectDepositRelationship) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountTypeViewState onStart$lambda$0(RecurringOrderAmountTypeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountTypeViewState.copy$default(applyMutation, null, null, RecurringOrderAmountTypeViewState.DirectDepositRelationshipState.None.INSTANCE, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(RecurringOrderAmountTypeDuxo recurringOrderAmountTypeDuxo, final DirectDepositRelationship directDepositRelationship) {
        Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
        recurringOrderAmountTypeDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountTypeDuxo.onStart$lambda$2$lambda$1(directDepositRelationship, (RecurringOrderAmountTypeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountTypeViewState onStart$lambda$2$lambda$1(DirectDepositRelationship directDepositRelationship, RecurringOrderAmountTypeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountTypeViewState.copy$default(applyMutation, null, null, new RecurringOrderAmountTypeViewState.DirectDepositRelationshipState.Some(directDepositRelationship), null, null, 27, null);
    }

    public final void onAmountTypeSelected(final AmountType amountType) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.amount.type.RecurringOrderAmountTypeDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderAmountTypeDuxo.onAmountTypeSelected$lambda$3(amountType, (RecurringOrderAmountTypeViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderAmountTypeViewState onAmountTypeSelected$lambda$3(AmountType amountType, RecurringOrderAmountTypeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderAmountTypeViewState.copy$default(applyMutation, null, null, null, amountType, null, 23, null);
    }

    /* compiled from: RecurringOrderAmountTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeDuxo;", "Lcom/robinhood/android/common/recurring/amount/type/RecurringOrderAmountTypeArgs;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringOrderAmountTypeDuxo, RecurringOrderAmountTypeArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderAmountTypeArgs getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringOrderAmountTypeArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringOrderAmountTypeArgs getArgs(RecurringOrderAmountTypeDuxo recurringOrderAmountTypeDuxo) {
            return (RecurringOrderAmountTypeArgs) DuxoCompanion.DefaultImpls.getArgs(this, recurringOrderAmountTypeDuxo);
        }
    }
}
