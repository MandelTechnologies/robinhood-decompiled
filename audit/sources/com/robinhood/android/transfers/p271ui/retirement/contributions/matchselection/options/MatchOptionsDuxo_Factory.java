package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.options;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.userleap.SurveyManager3;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchOptionsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo;", "matchRateSelectionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "hasSeenFullscreenMatchSelectionPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MatchOptionsDuxo_Factory implements Factory<MatchOptionsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> hasSeenFullscreenMatchSelectionPref;
    private final Provider<RetirementTransfersMatchRateSelectionStore> matchRateSelectionStore;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchOptionsDuxo_Factory create(Provider<RetirementTransfersMatchRateSelectionStore> provider, Provider<SurveyManager3> provider2, Provider<BooleanPreference> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final MatchOptionsDuxo newInstance(RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore, SurveyManager3 surveyManager3, BooleanPreference booleanPreference, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(retirementTransfersMatchRateSelectionStore, surveyManager3, booleanPreference, duxoBundle);
    }

    public MatchOptionsDuxo_Factory(Provider<RetirementTransfersMatchRateSelectionStore> matchRateSelectionStore, Provider<SurveyManager3> userLeapManager, Provider<BooleanPreference> hasSeenFullscreenMatchSelectionPref, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(matchRateSelectionStore, "matchRateSelectionStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.matchRateSelectionStore = matchRateSelectionStore;
        this.userLeapManager = userLeapManager;
        this.hasSeenFullscreenMatchSelectionPref = hasSeenFullscreenMatchSelectionPref;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public MatchOptionsDuxo get() {
        Companion companion = INSTANCE;
        RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = this.matchRateSelectionStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementTransfersMatchRateSelectionStore, "get(...)");
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenFullscreenMatchSelectionPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(retirementTransfersMatchRateSelectionStore, surveyManager3, booleanPreference, duxoBundle);
    }

    /* compiled from: MatchOptionsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo_Factory;", "matchRateSelectionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "hasSeenFullscreenMatchSelectionPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchOptionsDuxo_Factory create(Provider<RetirementTransfersMatchRateSelectionStore> matchRateSelectionStore, Provider<SurveyManager3> userLeapManager, Provider<BooleanPreference> hasSeenFullscreenMatchSelectionPref, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(matchRateSelectionStore, "matchRateSelectionStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MatchOptionsDuxo_Factory(matchRateSelectionStore, userLeapManager, hasSeenFullscreenMatchSelectionPref, duxoBundle);
        }

        @JvmStatic
        public final MatchOptionsDuxo newInstance(RetirementTransfersMatchRateSelectionStore matchRateSelectionStore, SurveyManager3 userLeapManager, BooleanPreference hasSeenFullscreenMatchSelectionPref, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(matchRateSelectionStore, "matchRateSelectionStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new MatchOptionsDuxo(matchRateSelectionStore, userLeapManager, hasSeenFullscreenMatchSelectionPref, duxoBundle);
        }
    }
}
