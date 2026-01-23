package com.robinhood.android.margin.upgrade.agreements;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: MarginUpgradeAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\r\u0010 \u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010!R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u0017\u0010\u0018¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "<init>", "()V", "isUk", "", "()Z", "isUk$delegate", "Lkotlin/Lazy;", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "setStep", "(Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;)V", "callbacks", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementDuxo;", "duxo$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "MarginUpgradeStepComposable", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-margin-upgrade_externalDebug", "viewState", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeAgreementFragment extends BaseMarginUpgradeStepComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: isUk$delegate, reason: from kotlin metadata */
    private final Lazy isUk = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginUpgradeAgreementFragment.isUk_delegate$lambda$0(this.f$0));
        }
    });
    private MarginUpgradeStep step = MarginUpgradeStep.AGREEMENT;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(MarginUpgradeCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarginUpgradeAgreementDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$6(MarginUpgradeAgreementFragment marginUpgradeAgreementFragment, int i, Composer composer, int i2) {
        marginUpgradeAgreementFragment.MarginUpgradeStepComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUk_delegate$lambda$0(MarginUpgradeAgreementFragment marginUpgradeAgreementFragment) {
        return ((Args) INSTANCE.getArgs((Fragment) marginUpgradeAgreementFragment)).isUk();
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    /* renamed from: isUk */
    public boolean getIsUk() {
        return ((Boolean) this.isUk.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return this.step;
    }

    public void setStep(MarginUpgradeStep marginUpgradeStep) {
        Intrinsics.checkNotNullParameter(marginUpgradeStep, "<set-?>");
        this.step = marginUpgradeStep;
    }

    private final MarginUpgradeCallbacks getCallbacks() {
        return (MarginUpgradeCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final MarginUpgradeAgreementDuxo getDuxo() {
        return (MarginUpgradeAgreementDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (((Args) INSTANCE.getArgs((Fragment) this)).isMemberQuickOnboarding()) {
            setStep(MarginUpgradeStep.AGREEMENT_QUICK_ONBOARDING);
        }
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public void MarginUpgradeStepComposable(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(739239200);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(739239200, i2, -1, "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment.MarginUpgradeStepComposable (MarginUpgradeAgreementFragment.kt:50)");
            }
            MarginUpgradeAgreementState3 marginUpgradeAgreementState3MarginUpgradeStepComposable$lambda$1 = MarginUpgradeStepComposable$lambda$1(SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1));
            Companion companion = INSTANCE;
            boolean zIsGold = ((Args) companion.getArgs((Fragment) this)).isGold();
            boolean zIsUk = ((Args) companion.getArgs((Fragment) this)).isUk();
            MarginUpgradeCallbacks callbacks = getCallbacks();
            MarginUpgradeAgreementDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MarginUpgradeAgreementFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            MarginUpgradeAgreementDuxo duxo2 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new MarginUpgradeAgreementFragment3(duxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function12 = (Function1) ((KFunction) objRememberedValue2);
            MarginUpgradeAgreementDuxo duxo3 = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new MarginUpgradeAgreementFragment4(duxo3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function2 function2 = (Function2) ((KFunction) objRememberedValue3);
            ActivityErrorHandler activityErrorHandler = getActivityErrorHandler();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(activityErrorHandler);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new MarginUpgradeAgreementFragment5(activityErrorHandler);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            MarginUpgradeAgreementFragment6.MarginUpgradeAgreementScreen(marginUpgradeAgreementState3MarginUpgradeStepComposable$lambda$1, zIsGold, zIsUk, callbacks, function1, function12, function2, (Function1) ((KFunction) objRememberedValue4), ((Args) companion.getArgs((Fragment) this)).getMarginFlow(), composerStartRestartGroup, MarginEligibilityChecklistViewState4.$stable << 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeAgreementFragment.MarginUpgradeStepComposable$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MarginUpgradeAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "isGold", "", "isUk", "isMemberQuickOnboarding", "sourceType", "Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "<init>", "(Ljava/lang/String;ZZZLcom/robinhood/android/margin/contracts/EnableMarginSourceType;Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;)V", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getSourceType", "()Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "getMarginFlow", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "fromAcats", "getFromAcats", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean isGold;
        private final boolean isMemberQuickOnboarding;
        private final boolean isUk;
        private final MarginEligibilityChecklistViewState4 marginFlow;
        private final EnableMarginInvestingKey2 sourceType;

        /* compiled from: MarginUpgradeAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new Args(string2, z3, z4, z2, (EnableMarginInvestingKey2) parcel.readParcelable(Args.class.getClassLoader()), (MarginEligibilityChecklistViewState4) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, boolean z2, boolean z3, EnableMarginInvestingKey2 enableMarginInvestingKey2, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i, Object obj) {
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
                z3 = args.isMemberQuickOnboarding;
            }
            if ((i & 16) != 0) {
                enableMarginInvestingKey2 = args.sourceType;
            }
            if ((i & 32) != 0) {
                marginEligibilityChecklistViewState4 = args.marginFlow;
            }
            EnableMarginInvestingKey2 enableMarginInvestingKey22 = enableMarginInvestingKey2;
            MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState42 = marginEligibilityChecklistViewState4;
            return args.copy(str, z, z2, z3, enableMarginInvestingKey22, marginEligibilityChecklistViewState42);
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
        public final boolean getIsMemberQuickOnboarding() {
            return this.isMemberQuickOnboarding;
        }

        /* renamed from: component5, reason: from getter */
        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        /* renamed from: component6, reason: from getter */
        public final MarginEligibilityChecklistViewState4 getMarginFlow() {
            return this.marginFlow;
        }

        public final Args copy(String accountNumber, boolean isGold, boolean isUk, boolean isMemberQuickOnboarding, EnableMarginInvestingKey2 sourceType, MarginEligibilityChecklistViewState4 marginFlow) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
            return new Args(accountNumber, isGold, isUk, isMemberQuickOnboarding, sourceType, marginFlow);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.isGold == args.isGold && this.isUk == args.isUk && this.isMemberQuickOnboarding == args.isMemberQuickOnboarding && Intrinsics.areEqual(this.sourceType, args.sourceType) && Intrinsics.areEqual(this.marginFlow, args.marginFlow);
        }

        public int hashCode() {
            return (((((((((this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.isGold)) * 31) + Boolean.hashCode(this.isUk)) * 31) + Boolean.hashCode(this.isMemberQuickOnboarding)) * 31) + this.sourceType.hashCode()) * 31) + this.marginFlow.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", isGold=" + this.isGold + ", isUk=" + this.isUk + ", isMemberQuickOnboarding=" + this.isMemberQuickOnboarding + ", sourceType=" + this.sourceType + ", marginFlow=" + this.marginFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isGold ? 1 : 0);
            dest.writeInt(this.isUk ? 1 : 0);
            dest.writeInt(this.isMemberQuickOnboarding ? 1 : 0);
            dest.writeParcelable(this.sourceType, flags);
            dest.writeParcelable(this.marginFlow, flags);
        }

        public Args(String accountNumber, boolean z, boolean z2, boolean z3, EnableMarginInvestingKey2 sourceType, MarginEligibilityChecklistViewState4 marginFlow) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
            this.accountNumber = accountNumber;
            this.isGold = z;
            this.isUk = z2;
            this.isMemberQuickOnboarding = z3;
            this.sourceType = sourceType;
            this.marginFlow = marginFlow;
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

        public final boolean isMemberQuickOnboarding() {
            return this.isMemberQuickOnboarding;
        }

        public /* synthetic */ Args(String str, boolean z, boolean z2, boolean z3, EnableMarginInvestingKey2 enableMarginInvestingKey2, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? EnableMarginInvestingKey2.Default.INSTANCE : enableMarginInvestingKey2, (i & 32) != 0 ? MarginEligibilityChecklistViewState4.Default.INSTANCE : marginEligibilityChecklistViewState4);
        }

        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        public final MarginEligibilityChecklistViewState4 getMarginFlow() {
            return this.marginFlow;
        }

        public final boolean getFromAcats() {
            return Intrinsics.areEqual(this.sourceType, EnableMarginInvestingKey2.AcatsIn.INSTANCE);
        }
    }

    /* compiled from: MarginUpgradeAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementFragment;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginUpgradeAgreementFragment marginUpgradeAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeAgreementFragment newInstance(Args args) {
            return (MarginUpgradeAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeAgreementFragment marginUpgradeAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeAgreementFragment, args);
        }
    }

    private static final MarginUpgradeAgreementState3 MarginUpgradeStepComposable$lambda$1(SnapshotState4<? extends MarginUpgradeAgreementState3> snapshotState4) {
        return snapshotState4.getValue();
    }
}
