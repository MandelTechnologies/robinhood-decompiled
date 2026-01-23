package com.robinhood.android.paycheckhub.p213ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.PaycheckStore;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "paycheckStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/PaycheckStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PaycheckDetailDuxo extends OldBaseDuxo<PaycheckDetailViewState> implements HasSavedState {
    private final PaycheckStore paycheckStore;
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
    public PaycheckDetailDuxo(PaycheckStore paycheckStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(paycheckStore, "paycheckStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Object[] objArr = 0 == true ? 1 : 0;
        super(new PaycheckDetailViewState(null, 1, 0 == true ? 1 : 0), objArr, 2, 0 == true ? 1 : 0);
        this.paycheckStore = paycheckStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.paycheckStore.getPaycheckByReceivedAchTransferId(((LegacyFragmentKey.PaycheckDetail) INSTANCE.getArgs((HasSavedState) this)).getReceivedAchTransferId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckDetailDuxo.onStart$lambda$1(this.f$0, (PaycheckV2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PaycheckDetailDuxo paycheckDetailDuxo, final PaycheckV2 paycheck) {
        Intrinsics.checkNotNullParameter(paycheck, "paycheck");
        paycheckDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaycheckDetailDuxo.onStart$lambda$1$lambda$0(paycheck, (PaycheckDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckDetailViewState onStart$lambda$1$lambda$0(PaycheckV2 paycheckV2, PaycheckDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(paycheckV2);
    }

    /* compiled from: PaycheckDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckDetail;", "<init>", "()V", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PaycheckDetailDuxo, LegacyFragmentKey.PaycheckDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PaycheckDetail getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.PaycheckDetail) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PaycheckDetail getArgs(PaycheckDetailDuxo paycheckDetailDuxo) {
            return (LegacyFragmentKey.PaycheckDetail) DuxoCompanion.DefaultImpls.getArgs(this, paycheckDetailDuxo);
        }
    }
}
