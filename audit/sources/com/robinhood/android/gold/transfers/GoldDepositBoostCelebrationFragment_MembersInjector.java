package com.robinhood.android.gold.transfers;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostCelebrationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-gold-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldDepositBoostCelebrationFragment_MembersInjector implements MembersInjector<GoldDepositBoostCelebrationFragment> {
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<StringPreference> goldDepositBoostTransferAmountPref;
    private final Provider<StringPreference> goldDepositBoostTransferIdPref;
    private final Provider<StringPreference> goldDepositBoostTransferTimestampPref;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<GoldDepositBoostCelebrationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<StringPreference> provider3, Provider<StringPreference> provider4, Provider<StringPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    @GoldDepositBoostTransferAmountPref
    public static final void injectGoldDepositBoostTransferAmountPref(GoldDepositBoostCelebrationFragment goldDepositBoostCelebrationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferAmountPref(goldDepositBoostCelebrationFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferIdPref
    public static final void injectGoldDepositBoostTransferIdPref(GoldDepositBoostCelebrationFragment goldDepositBoostCelebrationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferIdPref(goldDepositBoostCelebrationFragment, stringPreference);
    }

    @JvmStatic
    @GoldDepositBoostTransferTimestampPref
    public static final void injectGoldDepositBoostTransferTimestampPref(GoldDepositBoostCelebrationFragment goldDepositBoostCelebrationFragment, StringPreference stringPreference) {
        INSTANCE.injectGoldDepositBoostTransferTimestampPref(goldDepositBoostCelebrationFragment, stringPreference);
    }

    public GoldDepositBoostCelebrationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
        Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.goldDepositBoostTransferIdPref = goldDepositBoostTransferIdPref;
        this.goldDepositBoostTransferAmountPref = goldDepositBoostTransferAmountPref;
        this.goldDepositBoostTransferTimestampPref = goldDepositBoostTransferTimestampPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GoldDepositBoostCelebrationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        StringPreference stringPreference = this.goldDepositBoostTransferIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion3.injectGoldDepositBoostTransferIdPref(instance, stringPreference);
        StringPreference stringPreference2 = this.goldDepositBoostTransferAmountPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        companion3.injectGoldDepositBoostTransferAmountPref(instance, stringPreference2);
        StringPreference stringPreference3 = this.goldDepositBoostTransferTimestampPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference3, "get(...)");
        companion3.injectGoldDepositBoostTransferTimestampPref(instance, stringPreference3);
    }

    /* compiled from: GoldDepositBoostCelebrationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "goldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "injectGoldDepositBoostTransferIdPref", "", "instance", "injectGoldDepositBoostTransferAmountPref", "injectGoldDepositBoostTransferTimestampPref", "lib-gold-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<GoldDepositBoostCelebrationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<StringPreference> goldDepositBoostTransferIdPref, Provider<StringPreference> goldDepositBoostTransferAmountPref, Provider<StringPreference> goldDepositBoostTransferTimestampPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            return new GoldDepositBoostCelebrationFragment_MembersInjector(singletons, genericComposeSingletons, goldDepositBoostTransferIdPref, goldDepositBoostTransferAmountPref, goldDepositBoostTransferTimestampPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferIdPref
        public final void injectGoldDepositBoostTransferIdPref(GoldDepositBoostCelebrationFragment instance, StringPreference goldDepositBoostTransferIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferIdPref, "goldDepositBoostTransferIdPref");
            instance.setGoldDepositBoostTransferIdPref(goldDepositBoostTransferIdPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferAmountPref
        public final void injectGoldDepositBoostTransferAmountPref(GoldDepositBoostCelebrationFragment instance, StringPreference goldDepositBoostTransferAmountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferAmountPref, "goldDepositBoostTransferAmountPref");
            instance.setGoldDepositBoostTransferAmountPref(goldDepositBoostTransferAmountPref);
        }

        @JvmStatic
        @GoldDepositBoostTransferTimestampPref
        public final void injectGoldDepositBoostTransferTimestampPref(GoldDepositBoostCelebrationFragment instance, StringPreference goldDepositBoostTransferTimestampPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostTransferTimestampPref, "goldDepositBoostTransferTimestampPref");
            instance.setGoldDepositBoostTransferTimestampPref(goldDepositBoostTransferTimestampPref);
        }
    }
}
