package com.robinhood.android.common.margin.p083ui.limit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.margin.p083ui.limit.BaseMarginUpgradeMarginLimitFragment;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.util.Money;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeMarginLimitDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/regiongate/RegionGateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "setUserSetLimit", "", "limit", "Lcom/robinhood/models/util/Money;", "onCreate", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class MarginUpgradeMarginLimitDuxo extends OldBaseDuxo<MarginUpgradeMarginLimitViewState> implements HasSavedState {
    private final RegionGateProvider regionGateProvider;
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
    public MarginUpgradeMarginLimitDuxo(RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        super(new MarginUpgradeMarginLimitViewState(((BaseMarginUpgradeMarginLimitFragment.Args) INSTANCE.getArgs(savedStateHandle)).getMarginInvestingInfo(), null, null, false, 14, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    public final void setUserSetLimit(final Money limit) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.margin.ui.limit.MarginUpgradeMarginLimitDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginUpgradeMarginLimitDuxo.setUserSetLimit$lambda$0(limit, (MarginUpgradeMarginLimitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginUpgradeMarginLimitViewState setUserSetLimit$lambda$0(Money money, MarginUpgradeMarginLimitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MarginUpgradeMarginLimitViewState.copy$default(applyMutation, null, money, null, false, 13, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable observableDistinctUntilChanged = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, SlipRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.margin.ui.limit.MarginUpgradeMarginLimitDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginUpgradeMarginLimitDuxo.onCreate$lambda$2(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(MarginUpgradeMarginLimitDuxo marginUpgradeMarginLimitDuxo, final Boolean bool) {
        marginUpgradeMarginLimitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.margin.ui.limit.MarginUpgradeMarginLimitDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginUpgradeMarginLimitDuxo.onCreate$lambda$2$lambda$1(bool, (MarginUpgradeMarginLimitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginUpgradeMarginLimitViewState onCreate$lambda$2$lambda$1(Boolean bool, MarginUpgradeMarginLimitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return MarginUpgradeMarginLimitViewState.copy$default(applyMutation, null, null, null, bool.booleanValue(), 7, null);
    }

    /* compiled from: MarginUpgradeMarginLimitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/margin/ui/limit/MarginUpgradeMarginLimitDuxo;", "Lcom/robinhood/android/common/margin/ui/limit/BaseMarginUpgradeMarginLimitFragment$Args;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginUpgradeMarginLimitDuxo, BaseMarginUpgradeMarginLimitFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BaseMarginUpgradeMarginLimitFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BaseMarginUpgradeMarginLimitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BaseMarginUpgradeMarginLimitFragment.Args getArgs(MarginUpgradeMarginLimitDuxo marginUpgradeMarginLimitDuxo) {
            return (BaseMarginUpgradeMarginLimitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginUpgradeMarginLimitDuxo);
        }
    }
}
