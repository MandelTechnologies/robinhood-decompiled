package com.robinhood.shared.posttransfer;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.prefs.StringPreference;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfirmationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "markwon", "Lio/noties/markwon/Markwon;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TransferConfirmationFragment_MembersInjector implements MembersInjector<TransferConfirmationFragment> {
    private final Provider<EventLogger> eventLogger;
    private final Provider<StringPreference> goldDepositBoostTransferAmountPref;
    private final Provider<StringPreference> goldDepositBoostTransferIdPref;
    private final Provider<StringPreference> goldDepositBoostTransferTimestampPref;
    private final Provider<Markwon> markwon;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<TransferConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<StringPreference> provider2, Provider<StringPreference> provider3, Provider<StringPreference> provider4, Provider<EventLogger> provider5, Provider<Markwon> provider6, Provider<SurveyManager3> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final void injectEventLogger(TransferConfirmationFragment transferConfirmationFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(transferConfirmationFragment, eventLogger);
    }

    @JvmStatic
    @GoldDepositBoostTransferAmountPref
    public static final void injectGoldDepositBoostTransferAmountPref(TransferConfirmationFragment transferConfirmationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferAmountPref(transferConfirmationFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferIdPref
    public static final void injectGoldDepositBoostTransferIdPref(TransferConfirmationFragment transferConfirmationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferIdPref(transferConfirmationFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferTimestampPref
    public static final void injectGoldDepositBoostTransferTimestampPref(TransferConfirmationFragment transferConfirmationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferTimestampPref(transferConfirmationFragment, stringPreference);
    }

    @JvmStatic
    public static final void injectMarkwon(TransferConfirmationFragment transferConfirmationFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(transferConfirmationFragment, markwon);
    }

    @JvmStatic
    public static final void injectUserLeapManager(TransferConfirmationFragment transferConfirmationFragment, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(transferConfirmationFragment, surveyManager3);
    }

    public TransferConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref, Provider<EventLogger> eventLogger, Provider<Markwon> markwon, Provider<SurveyManager3> userLeapManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.singletons = singletons;
        this.goldDepositBoostTransferIdPref = goldDepositBoostTransferIdPref;
        this.goldDepositBoostTransferAmountPref = goldDepositBoostTransferAmountPref;
        this.goldDepositBoostTransferTimestampPref = goldDepositBoostTransferTimestampPref;
        this.eventLogger = eventLogger;
        this.markwon = markwon;
        this.userLeapManager = userLeapManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TransferConfirmationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        StringPreference stringPreference = this.goldDepositBoostTransferIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectGoldDepositBoostTransferIdPref(instance, stringPreference);
        StringPreference stringPreference2 = this.goldDepositBoostTransferAmountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        companion2.injectGoldDepositBoostTransferAmountPref(instance, stringPreference2);
        StringPreference stringPreference3 = this.goldDepositBoostTransferTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        companion2.injectGoldDepositBoostTransferTimestampPref(instance, stringPreference3);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
    }

    /* compiled from: TransferConfirmationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "markwon", "Lio/noties/markwon/Markwon;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "injectGoldDepositBoostTransferIdPref", "", "instance", "injectGoldDepositBoostTransferAmountPref", "injectGoldDepositBoostTransferTimestampPref", "injectEventLogger", "injectMarkwon", "injectUserLeapManager", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TransferConfirmationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref, Provider<EventLogger> eventLogger, Provider<Markwon> markwon, Provider<SurveyManager3> userLeapManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            return new TransferConfirmationFragment_MembersInjector(singletons, goldDepositBoostTransferIdPref, goldDepositBoostTransferAmountPref, goldDepositBoostTransferTimestampPref, eventLogger, markwon, userLeapManager);
        }

        @JvmStatic
        @GoldDepositBoostTransferIdPref
        public final void injectGoldDepositBoostTransferIdPref(TransferConfirmationFragment instance, StringPreference goldDepositBoostTransferIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            instance.setGoldDepositBoostTransferIdPref(goldDepositBoostTransferIdPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferAmountPref
        public final void injectGoldDepositBoostTransferAmountPref(TransferConfirmationFragment instance, StringPreference goldDepositBoostTransferAmountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            instance.setGoldDepositBoostTransferAmountPref(goldDepositBoostTransferAmountPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferTimestampPref
        public final void injectGoldDepositBoostTransferTimestampPref(TransferConfirmationFragment instance, StringPreference goldDepositBoostTransferTimestampPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            instance.setGoldDepositBoostTransferTimestampPref(goldDepositBoostTransferTimestampPref);
        }

        @JvmStatic
        public final void injectEventLogger(TransferConfirmationFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectMarkwon(TransferConfirmationFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectUserLeapManager(TransferConfirmationFragment instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }
    }
}
