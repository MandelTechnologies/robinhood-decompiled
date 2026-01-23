package com.robinhood.android.rhyonboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.rhy.RhySpendingAccountLearnMoreStore;
import com.robinhood.models.p320db.rhy.RhySpendingAccountLearnMore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyLearnMoreFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/RhyLearnMoreFragmentDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhyonboarding/RhyLearnMoreFragmentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rhySpendingAccountLearnMoreStore", "Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyLearnMoreFragmentDuxo extends OldBaseDuxo<RhyLearnMoreFragmentViewState> implements HasSavedState {
    private final RhySpendingAccountLearnMoreStore rhySpendingAccountLearnMoreStore;
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
    public RhyLearnMoreFragmentDuxo(RhySpendingAccountLearnMoreStore rhySpendingAccountLearnMoreStore, SavedStateHandle savedStateHandle) {
        super(new RhyLearnMoreFragmentViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(rhySpendingAccountLearnMoreStore, "rhySpendingAccountLearnMoreStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.rhySpendingAccountLearnMoreStore = rhySpendingAccountLearnMoreStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        RhySpendingAccountLearnMoreStore rhySpendingAccountLearnMoreStore = this.rhySpendingAccountLearnMoreStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, rhySpendingAccountLearnMoreStore.stream(((LegacyFragmentKey.RhySpendingAccountLearnMore) companion.getArgs((HasSavedState) this)).getKey().getId(), ((LegacyFragmentKey.RhySpendingAccountLearnMore) companion.getArgs((HasSavedState) this)).getP2pContentOverride()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyLearnMoreFragmentDuxo.onStart$lambda$1(this.f$0, (RhySpendingAccountLearnMore) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyLearnMoreFragmentDuxo rhyLearnMoreFragmentDuxo, final RhySpendingAccountLearnMore response) {
        Intrinsics.checkNotNullParameter(response, "response");
        rhyLearnMoreFragmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhyonboarding.RhyLearnMoreFragmentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyLearnMoreFragmentDuxo.onStart$lambda$1$lambda$0(response, (RhyLearnMoreFragmentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyLearnMoreFragmentViewState onStart$lambda$1$lambda$0(RhySpendingAccountLearnMore rhySpendingAccountLearnMore, RhyLearnMoreFragmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(rhySpendingAccountLearnMore);
    }

    /* compiled from: RhyLearnMoreFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/RhyLearnMoreFragmentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhyonboarding/RhyLearnMoreFragmentDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhySpendingAccountLearnMore;", "<init>", "()V", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhyLearnMoreFragmentDuxo, LegacyFragmentKey.RhySpendingAccountLearnMore> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhySpendingAccountLearnMore getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.RhySpendingAccountLearnMore) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.RhySpendingAccountLearnMore getArgs(RhyLearnMoreFragmentDuxo rhyLearnMoreFragmentDuxo) {
            return (LegacyFragmentKey.RhySpendingAccountLearnMore) DuxoCompanion.DefaultImpls.getArgs(this, rhyLearnMoreFragmentDuxo);
        }
    }
}
