package com.robinhood.shared.posttransfer;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfirmationWithDisclaimerFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TransferConfirmationWithDisclaimerFragment_MembersInjector implements MembersInjector<TransferConfirmationWithDisclaimerFragment> {
    private final Provider<AppType> appType;
    private final Provider<EventLogger> eventLogger;
    private final Provider<StringPreference> goldDepositBoostTransferAmountPref;
    private final Provider<StringPreference> goldDepositBoostTransferIdPref;
    private final Provider<StringPreference> goldDepositBoostTransferTimestampPref;
    private final Provider<Markwon> markwon;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<TransferConfirmationWithDisclaimerFragment> create(Provider<BaseFragmentSingletons> provider, Provider<Markwon> provider2, Provider<AppType> provider3, Provider<EventLogger> provider4, Provider<StringPreference> provider5, Provider<StringPreference> provider6, Provider<StringPreference> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final void injectAppType(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, AppType appType) {
        INSTANCE.injectAppType(transferConfirmationWithDisclaimerFragment, appType);
    }

    @JvmStatic
    public static final void injectEventLogger(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(transferConfirmationWithDisclaimerFragment, eventLogger);
    }

    @JvmStatic
    @GoldDepositBoostTransferAmountPref
    public static final void injectGoldDepositBoostTransferAmountPref(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferAmountPref(transferConfirmationWithDisclaimerFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferIdPref
    public static final void injectGoldDepositBoostTransferIdPref(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferIdPref(transferConfirmationWithDisclaimerFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferTimestampPref
    public static final void injectGoldDepositBoostTransferTimestampPref(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferTimestampPref(transferConfirmationWithDisclaimerFragment, stringPreference);
    }

    @JvmStatic
    public static final void injectMarkwon(TransferConfirmationWithDisclaimerFragment transferConfirmationWithDisclaimerFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(transferConfirmationWithDisclaimerFragment, markwon);
    }

    public TransferConfirmationWithDisclaimerFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<AppType> appType, Provider<EventLogger> eventLogger, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
        this.singletons = singletons;
        this.markwon = markwon;
        this.appType = appType;
        this.eventLogger = eventLogger;
        this.goldDepositBoostTransferIdPref = goldDepositBoostTransferIdPref;
        this.goldDepositBoostTransferAmountPref = goldDepositBoostTransferAmountPref;
        this.goldDepositBoostTransferTimestampPref = goldDepositBoostTransferTimestampPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TransferConfirmationWithDisclaimerFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        companion2.injectAppType(instance, appType);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        StringPreference stringPreference = this.goldDepositBoostTransferIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectGoldDepositBoostTransferIdPref(instance, stringPreference);
        StringPreference stringPreference2 = this.goldDepositBoostTransferAmountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        companion2.injectGoldDepositBoostTransferAmountPref(instance, stringPreference2);
        StringPreference stringPreference3 = this.goldDepositBoostTransferTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        companion2.injectGoldDepositBoostTransferTimestampPref(instance, stringPreference3);
    }

    /* compiled from: TransferConfirmationWithDisclaimerFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0011H\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationWithDisclaimerFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "injectMarkwon", "", "instance", "injectAppType", "injectEventLogger", "injectGoldDepositBoostTransferIdPref", "injectGoldDepositBoostTransferAmountPref", "injectGoldDepositBoostTransferTimestampPref", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TransferConfirmationWithDisclaimerFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<AppType> appType, Provider<EventLogger> eventLogger, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            return new TransferConfirmationWithDisclaimerFragment_MembersInjector(singletons, markwon, appType, eventLogger, goldDepositBoostTransferIdPref, goldDepositBoostTransferAmountPref, goldDepositBoostTransferTimestampPref);
        }

        @JvmStatic
        public final void injectMarkwon(TransferConfirmationWithDisclaimerFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectAppType(TransferConfirmationWithDisclaimerFragment instance, AppType appType) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(appType, "appType");
            instance.setAppType(appType);
        }

        @JvmStatic
        public final void injectEventLogger(TransferConfirmationWithDisclaimerFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        @GoldDepositBoostTransferIdPref
        public final void injectGoldDepositBoostTransferIdPref(TransferConfirmationWithDisclaimerFragment instance, StringPreference goldDepositBoostTransferIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            instance.setGoldDepositBoostTransferIdPref(goldDepositBoostTransferIdPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferAmountPref
        public final void injectGoldDepositBoostTransferAmountPref(TransferConfirmationWithDisclaimerFragment instance, StringPreference goldDepositBoostTransferAmountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            instance.setGoldDepositBoostTransferAmountPref(goldDepositBoostTransferAmountPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferTimestampPref
        public final void injectGoldDepositBoostTransferTimestampPref(TransferConfirmationWithDisclaimerFragment instance, StringPreference goldDepositBoostTransferTimestampPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            instance.setGoldDepositBoostTransferTimestampPref(goldDepositBoostTransferTimestampPref);
        }
    }
}
