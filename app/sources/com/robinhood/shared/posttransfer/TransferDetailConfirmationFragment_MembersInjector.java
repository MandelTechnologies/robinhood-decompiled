package com.robinhood.shared.posttransfer;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferDetailConfirmationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TransferDetailConfirmationFragment_MembersInjector implements MembersInjector<TransferDetailConfirmationFragment> {
    private final Provider<StringPreference> goldDepositBoostTransferAmountPref;
    private final Provider<StringPreference> goldDepositBoostTransferIdPref;
    private final Provider<StringPreference> goldDepositBoostTransferTimestampPref;
    private final Provider<Markwon> markwon;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<TransferDetailConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<Markwon> provider2, Provider<StringPreference> provider3, Provider<StringPreference> provider4, Provider<StringPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    @GoldDepositBoostTransferAmountPref
    public static final void injectGoldDepositBoostTransferAmountPref(TransferDetailConfirmationFragment transferDetailConfirmationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferAmountPref(transferDetailConfirmationFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferIdPref
    public static final void injectGoldDepositBoostTransferIdPref(TransferDetailConfirmationFragment transferDetailConfirmationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferIdPref(transferDetailConfirmationFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferTimestampPref
    public static final void injectGoldDepositBoostTransferTimestampPref(TransferDetailConfirmationFragment transferDetailConfirmationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferTimestampPref(transferDetailConfirmationFragment, stringPreference);
    }

    @JvmStatic
    public static final void injectMarkwon(TransferDetailConfirmationFragment transferDetailConfirmationFragment, Markwon markwon) {
        INSTANCE.injectMarkwon(transferDetailConfirmationFragment, markwon);
    }

    public TransferDetailConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
        this.singletons = singletons;
        this.markwon = markwon;
        this.goldDepositBoostTransferIdPref = goldDepositBoostTransferIdPref;
        this.goldDepositBoostTransferAmountPref = goldDepositBoostTransferAmountPref;
        this.goldDepositBoostTransferTimestampPref = goldDepositBoostTransferTimestampPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TransferDetailConfirmationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion2.injectMarkwon(instance, markwon);
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

    /* compiled from: TransferDetailConfirmationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rH\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/posttransfer/TransferDetailConfirmationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "injectMarkwon", "", "instance", "injectGoldDepositBoostTransferIdPref", "injectGoldDepositBoostTransferAmountPref", "injectGoldDepositBoostTransferTimestampPref", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<TransferDetailConfirmationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<Markwon> markwon, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            return new TransferDetailConfirmationFragment_MembersInjector(singletons, markwon, goldDepositBoostTransferIdPref, goldDepositBoostTransferAmountPref, goldDepositBoostTransferTimestampPref);
        }

        @JvmStatic
        public final void injectMarkwon(TransferDetailConfirmationFragment instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        @GoldDepositBoostTransferIdPref
        public final void injectGoldDepositBoostTransferIdPref(TransferDetailConfirmationFragment instance, StringPreference goldDepositBoostTransferIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            instance.setGoldDepositBoostTransferIdPref(goldDepositBoostTransferIdPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferAmountPref
        public final void injectGoldDepositBoostTransferAmountPref(TransferDetailConfirmationFragment instance, StringPreference goldDepositBoostTransferAmountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            instance.setGoldDepositBoostTransferAmountPref(goldDepositBoostTransferAmountPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferTimestampPref
        public final void injectGoldDepositBoostTransferTimestampPref(TransferDetailConfirmationFragment instance, StringPreference goldDepositBoostTransferTimestampPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            instance.setGoldDepositBoostTransferTimestampPref(goldDepositBoostTransferTimestampPref);
        }
    }
}
