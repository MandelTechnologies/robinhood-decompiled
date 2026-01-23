package com.robinhood.android.matcha.p177ui.incentives;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveLearnMoreFragmentKey;
import com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentivesLearnMoreDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDataState;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaIncentivesSummaryStore", "Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaIncentivesLearnMoreDuxo extends BaseDuxo<MatchaIncentivesLearnMoreDataState, MatchaIncentivesLearnMoreViewState> implements HasSavedState {
    private final MatchaIncentivesSummaryStore matchaIncentivesSummaryStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaIncentivesLearnMoreDuxo(MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, MatchaIncentivesLearnMoreStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MatchaIncentivesLearnMoreDataState(null, ((MatchaIncentiveLearnMoreFragmentKey) INSTANCE.getArgs(savedStateHandle)).getFooterContext(), 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(matchaIncentivesSummaryStore, "matchaIncentivesSummaryStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.matchaIncentivesSummaryStore = matchaIncentivesSummaryStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.matchaIncentivesSummaryStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.matchaIncentivesSummaryStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentivesLearnMoreDuxo.onStart$lambda$0(this.f$0, (MatchaIncentivesSummary) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(MatchaIncentivesLearnMoreDuxo matchaIncentivesLearnMoreDuxo, MatchaIncentivesSummary incentivesSummary) {
        Intrinsics.checkNotNullParameter(incentivesSummary, "incentivesSummary");
        matchaIncentivesLearnMoreDuxo.applyMutation(new MatchaIncentivesLearnMoreDuxo2(incentivesSummary, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaIncentivesLearnMoreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo;", "Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaIncentivesLearnMoreDuxo, MatchaIncentiveLearnMoreFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaIncentiveLearnMoreFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaIncentiveLearnMoreFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaIncentiveLearnMoreFragmentKey getArgs(MatchaIncentivesLearnMoreDuxo matchaIncentivesLearnMoreDuxo) {
            return (MatchaIncentiveLearnMoreFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, matchaIncentivesLearnMoreDuxo);
        }
    }
}
