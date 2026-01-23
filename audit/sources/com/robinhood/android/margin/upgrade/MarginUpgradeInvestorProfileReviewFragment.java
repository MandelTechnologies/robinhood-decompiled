package com.robinhood.android.margin.upgrade;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.margin.upgrade.investorprofile.MarginUpgradeInvestorProfileProductContext;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.questionnaire.contracts.InvestmentProfileSettings;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginUpgradeInvestorProfileReviewFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "<init>", "()V", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "isUk", "", "()Z", "isUk$delegate", "Lkotlin/Lazy;", "localityStringResources", "Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "getLocalityStringResources", "()Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "setLocalityStringResources", "(Lcom/robinhood/android/margin/upgrade/LocalityStringResources;)V", "MarginUpgradeStepComposable", "", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-margin-upgrade_externalDebug", "fragmentContainerId", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeInvestorProfileReviewFragment extends BaseMarginUpgradeStepComposeFragment {
    private static final String INVESTMENT_PROFILE_FRAGMENT_TAG = "MarginUpgradeInvestmentProfileFragment";
    public LocalityStringResources localityStringResources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final MarginUpgradeStep step = MarginUpgradeStep.INVESTMENT_PROFILE;

    /* renamed from: isUk$delegate, reason: from kotlin metadata */
    private final Lazy isUk = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginUpgradeInvestorProfileReviewFragment.isUk_delegate$lambda$0(this.f$0));
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$12(MarginUpgradeInvestorProfileReviewFragment marginUpgradeInvestorProfileReviewFragment, int i, Composer composer, int i2) {
        marginUpgradeInvestorProfileReviewFragment.MarginUpgradeStepComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return this.step;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUk_delegate$lambda$0(MarginUpgradeInvestorProfileReviewFragment marginUpgradeInvestorProfileReviewFragment) {
        return ((Args) INSTANCE.getArgs((Fragment) marginUpgradeInvestorProfileReviewFragment)).isUk();
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    /* renamed from: isUk */
    public boolean getIsUk() {
        return ((Boolean) this.isUk.getValue()).booleanValue();
    }

    public final LocalityStringResources getLocalityStringResources() {
        LocalityStringResources localityStringResources = this.localityStringResources;
        if (localityStringResources != null) {
            return localityStringResources;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localityStringResources");
        return null;
    }

    public final void setLocalityStringResources(LocalityStringResources localityStringResources) {
        Intrinsics.checkNotNullParameter(localityStringResources, "<set-?>");
        this.localityStringResources = localityStringResources;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public void MarginUpgradeStepComposable(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1331005211);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1331005211, i2, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment.MarginUpgradeStepComposable (MarginUpgradeInvestorProfileReviewFragment.kt:32)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginUpgradeInvestorProfileReviewFragment.MarginUpgradeStepComposable$lambda$2$lambda$1();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginUpgradeInvestorProfileReviewFragment.MarginUpgradeStepComposable$lambda$7$lambda$6(this.f$0, snapshotIntState2, (Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotIntState2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginUpgradeInvestorProfileReviewFragment.MarginUpgradeStepComposable$lambda$11$lambda$10(this.f$0, snapshotIntState2, (FragmentContainerView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, null, null, (Function1) objRememberedValue3, null, composerStartRestartGroup, 0, 22);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeInvestorProfileReviewFragment.MarginUpgradeStepComposable$lambda$12(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 MarginUpgradeStepComposable$lambda$2$lambda$1() {
        return SnapshotIntState3.mutableIntStateOf(View.generateViewId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FragmentContainerView MarginUpgradeStepComposable$lambda$7$lambda$6(MarginUpgradeInvestorProfileReviewFragment marginUpgradeInvestorProfileReviewFragment, SnapshotIntState2 snapshotIntState2, Context context) {
        String investorProfileProductContext;
        Intrinsics.checkNotNullParameter(context, "context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(snapshotIntState2.getIntValue());
        Companion companion = INSTANCE;
        BrokerageAccountType brokerageAccountType = ((Args) companion.getArgs((Fragment) marginUpgradeInvestorProfileReviewFragment)).getBrokerageAccountType();
        if (brokerageAccountType == null || (investorProfileProductContext = MarginUpgradeInvestorProfileProductContext.getInvestorProfileProductContext(brokerageAccountType)) == null) {
            investorProfileProductContext = QuestionnaireContexts.SUITABILITY;
        }
        marginUpgradeInvestorProfileReviewFragment.getChildFragmentManager().beginTransaction().add(fragmentContainerView.getId(), Navigator.DefaultImpls.createFragment$default(marginUpgradeInvestorProfileReviewFragment.getNavigator(), new InvestmentProfileSettings(investorProfileProductContext, ((Args) companion.getArgs((Fragment) marginUpgradeInvestorProfileReviewFragment)).getAccountNumber(), null, false, false, true, InvestmentProfileSettings.SOURCE_MARGIN_UPGRADE, true, false, ((Args) companion.getArgs((Fragment) marginUpgradeInvestorProfileReviewFragment)).isGold(), false, marginUpgradeInvestorProfileReviewFragment.getLocalityStringResources().getMargin_upgrade_review_investment_profile_title(), marginUpgradeInvestorProfileReviewFragment.getString(C21137R.string.margin_upgrade_update_your_answers), 1284, null), null, 2, null), INVESTMENT_PROFILE_FRAGMENT_TAG).commit();
        return fragmentContainerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$11$lambda$10(MarginUpgradeInvestorProfileReviewFragment marginUpgradeInvestorProfileReviewFragment, SnapshotIntState2 snapshotIntState2, FragmentContainerView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentManager childFragmentManager = marginUpgradeInvestorProfileReviewFragment.getChildFragmentManager();
        Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(snapshotIntState2.getIntValue());
        if (fragmentFindFragmentById != null) {
            childFragmentManager.beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MarginUpgradeInvestorProfileReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "isGold", "", "isUk", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final BrokerageAccountType brokerageAccountType;
        private final boolean isGold;
        private final boolean isUk;

        /* compiled from: MarginUpgradeInvestorProfileReviewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BrokerageAccountType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, boolean z2, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                z = args.isGold;
            }
            if ((i & 4) != 0) {
                z2 = args.isUk;
            }
            if ((i & 8) != 0) {
                brokerageAccountType = args.brokerageAccountType;
            }
            return args.copy(str, z, z2, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsUk() {
            return this.isUk;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final Args copy(String accountNumber, boolean isGold, boolean isUk, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Args(accountNumber, isGold, isUk, brokerageAccountType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.isGold == args.isGold && this.isUk == args.isUk && this.brokerageAccountType == args.brokerageAccountType;
        }

        public int hashCode() {
            int iHashCode = ((((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.isGold)) * 31) + Boolean.hashCode(this.isUk)) * 31;
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            return iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode());
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", isGold=" + this.isGold + ", isUk=" + this.isUk + ", brokerageAccountType=" + this.brokerageAccountType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isGold ? 1 : 0);
            dest.writeInt(this.isUk ? 1 : 0);
            BrokerageAccountType brokerageAccountType = this.brokerageAccountType;
            if (brokerageAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(brokerageAccountType.name());
            }
        }

        public Args(String accountNumber, boolean z, boolean z2, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            this.isGold = z;
            this.isUk = z2;
            this.brokerageAccountType = brokerageAccountType;
        }

        public /* synthetic */ Args(String str, boolean z, boolean z2, BrokerageAccountType brokerageAccountType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : brokerageAccountType);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isGold() {
            return this.isGold;
        }

        public final boolean isUk() {
            return this.isUk;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }
    }

    /* compiled from: MarginUpgradeInvestorProfileReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeInvestorProfileReviewFragment$Args;", "<init>", "()V", "INVESTMENT_PROFILE_FRAGMENT_TAG", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeInvestorProfileReviewFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginUpgradeInvestorProfileReviewFragment marginUpgradeInvestorProfileReviewFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeInvestorProfileReviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeInvestorProfileReviewFragment newInstance(Args args) {
            return (MarginUpgradeInvestorProfileReviewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeInvestorProfileReviewFragment marginUpgradeInvestorProfileReviewFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeInvestorProfileReviewFragment, args);
        }
    }
}
