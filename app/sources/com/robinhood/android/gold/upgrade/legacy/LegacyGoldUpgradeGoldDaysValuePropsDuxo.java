package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeGoldDaysValuePropsDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeGoldDaysValuePropsViewState;", "goldUpgradeStore", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/android/udf/DuxoBundle;)V", "perfEvents", "", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "onStart", "", "completePerformanceMetrics", "failPerformanceMetrics", "onSelectPlanOption", "selectedOption", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldPlanSelectionOption;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeGoldDaysValuePropsDuxo extends BaseDuxo4<LegacyGoldUpgradeGoldDaysValuePropsViewState> {
    public static final int $stable = 8;
    private final GoldUpgradeStore goldUpgradeStore;
    private final List<ContextActionEvent> perfEvents;
    private final PerformanceLogger performanceLogger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGoldUpgradeGoldDaysValuePropsDuxo(GoldUpgradeStore goldUpgradeStore, PerformanceLogger performanceLogger, DuxoBundle duxoBundle) {
        super(new LegacyGoldUpgradeGoldDaysValuePropsViewState(null), duxoBundle);
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldUpgradeStore = goldUpgradeStore;
        this.performanceLogger = performanceLogger;
        this.perfEvents = CollectionsKt.listOf((Object[]) new ContextActionEvent[]{new ContextActionEvent.Component(new Component(Component.ComponentType.ACCOUNT_CENTER_UPSELL_BANNER, "gold_upsell_fomo", null, 4, null)), new ContextActionEvent.Action(UserInteractionEventData.Action.GOLD_UPSELL_UPGRADE)});
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.goldUpgradeStore.streamSelectedPlanId(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeGoldDaysValuePropsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LegacyGoldUpgradeGoldDaysValuePropsDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(LegacyGoldUpgradeGoldDaysValuePropsDuxo legacyGoldUpgradeGoldDaysValuePropsDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        legacyGoldUpgradeGoldDaysValuePropsDuxo.applyMutation(new LegacyGoldUpgradeGoldDaysValuePropsDuxo2((UUID) optional.component1(), null));
        return Unit.INSTANCE;
    }

    public final void completePerformanceMetrics() {
        List<ContextActionEvent> list = this.perfEvents;
        PerformanceLogger performanceLogger = this.performanceLogger;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            performanceLogger.completeMetric((ContextActionEvent) it.next());
        }
    }

    public final void failPerformanceMetrics() {
        List<ContextActionEvent> list = this.perfEvents;
        PerformanceLogger performanceLogger = this.performanceLogger;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            performanceLogger.failMetric((ContextActionEvent) it.next());
        }
    }

    public final void onSelectPlanOption(ApiGoldUpgradeFlow.ApiGoldPlanSelectionOption selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.goldUpgradeStore.setSelectedPlanId(selectedOption.getPlanId());
    }
}
