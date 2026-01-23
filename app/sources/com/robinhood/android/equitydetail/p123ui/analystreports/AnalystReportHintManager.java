package com.robinhood.android.equitydetail.p123ui.analystreports;

import androidx.lifecycle.LifecycleOwner;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.librobinhood.data.store.AnalystOverviewStore;
import com.robinhood.models.p320db.AnalystOverview;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RhProcessLifecycleOwner2;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Observables;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: AnalystReportHintManager.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0017J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \u0010*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager;", "Lcom/robinhood/utils/ProcessLifecycleObserver;", "analystOverviewStore", "Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AnalystOverviewStore;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "newReportHintShownRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "onStop", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "streamAnalystReportHint", "Lio/reactivex/Observable;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "instrumentId", "reportHintShown", "reportHintClicked", "hint", "reportHintHidden", "addInstrumentSeen", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AnalystReportHintManager implements RhProcessLifecycleOwner2 {
    private static final long MAX_DAYS_TO_SHOW_NEW_REPORT = 1;
    private final AnalystOverviewStore analystOverviewStore;
    private final AnalyticsLogger analytics;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final BehaviorRelay<Set<UUID>> newReportHintShownRelay;
    public static final int $stable = 8;

    public AnalystReportHintManager(AnalystOverviewStore analystOverviewStore, AnalyticsLogger analytics, MarginSubscriptionStore marginSubscriptionStore, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(analystOverviewStore, "analystOverviewStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.analystOverviewStore = analystOverviewStore;
        this.analytics = analytics;
        this.marginSubscriptionStore = marginSubscriptionStore;
        BehaviorRelay<Set<UUID>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(SetsKt.emptySet());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.newReportHintShownRelay = behaviorRelayCreateDefault;
        rhProcessLifecycleOwner.register(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.newReportHintShownRelay.accept(SetsKt.emptySet());
    }

    public final Observable<AnalystReportHint> streamAnalystReportHint(final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.analystOverviewStore.refresh(instrumentId);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(this.newReportHintShownRelay, this.analystOverviewStore.streamAnalystOverview(instrumentId), this.marginSubscriptionStore.getCurrentMarginSubscriptionOptional(), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintManager$streamAnalystReportHint$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Set set = (Set) t1;
                MarginSubscription marginSubscription = (MarginSubscription) ((Optional) t3).component1();
                boolean z = false;
                if (((AnalystOverview) t2).getReportPublishedAt() != null) {
                    Intrinsics.checkNotNullExpressionValue(LocalDate.now(), "now(...)");
                    if (Instants.daysUntil(r8, r2) < 1) {
                        z = true;
                    }
                }
                if (marginSubscription != null && marginSubscription.is24Karat() && !set.contains(instrumentId) && z) {
                    return (R) Optional3.asOptional(new AnalystReportHint(instrumentId));
                }
                return (R) Optional2.INSTANCE;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        return ObservablesKt.filterIsPresent(observableCombineLatest);
    }

    public final void reportHintShown() {
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_RESEARCH_REPORT_HINT, AnalyticsStrings.BUTTON_TITLE_RESEARCH_REPORT_HINT_NEW_REPORT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final void reportHintClicked(AnalystReportHint hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        addInstrumentSeen(hint.getInstrumentId());
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_RESEARCH_REPORT_HINT, AnalyticsStrings.BUTTON_TITLE_RESEARCH_REPORT_HINT_NEW_REPORT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final void reportHintHidden(AnalystReportHint hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        addInstrumentSeen(hint.getInstrumentId());
        AnalyticsLogger.DefaultImpls.logButtonGroupDismiss$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_RESEARCH_REPORT_HINT, AnalyticsStrings.BUTTON_TITLE_RESEARCH_REPORT_HINT_NEW_REPORT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    private final void addInstrumentSeen(UUID instrumentId) {
        Set<UUID> value = this.newReportHintShownRelay.getValue();
        if (value == null) {
            value = SetsKt.emptySet();
        }
        this.newReportHintShownRelay.accept(SetsKt.plus(value, instrumentId));
    }
}
