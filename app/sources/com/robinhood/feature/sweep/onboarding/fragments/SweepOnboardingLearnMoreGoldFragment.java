package com.robinhood.feature.sweep.onboarding.fragments;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
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

/* compiled from: SweepOnboardingLearnMoreGoldFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0003#$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\r\u0010\u001a\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "getSweepOnboardingEventLogger", "()Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "setSweepOnboardingEventLogger", "(Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;)V", "callbacks", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getAnalyticsScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "analyticsScreen$delegate", "Lkotlin/Lazy;", "onStart", "", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SweepOnboardingLearnMoreGoldFragment extends GenericComposeFragment implements RegionGated {
    public SweepOnboardingEventLogger sweepOnboardingEventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepOnboardingLearnMoreGoldFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(GoldRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SweepOnboardingLearnMoreGoldFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: analyticsScreen$delegate, reason: from kotlin metadata */
    private final Lazy analyticsScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SweepOnboardingLearnMoreGoldFragment.analyticsScreen_delegate$lambda$0();
        }
    });

    /* compiled from: SweepOnboardingLearnMoreGoldFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Callbacks;", "", "onLearnMoreGoldContinue", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLearnMoreGoldContinue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(SweepOnboardingLearnMoreGoldFragment sweepOnboardingLearnMoreGoldFragment, int i, Composer composer, int i2) {
        sweepOnboardingLearnMoreGoldFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final SweepOnboardingEventLogger getSweepOnboardingEventLogger() {
        SweepOnboardingEventLogger sweepOnboardingEventLogger = this.sweepOnboardingEventLogger;
        if (sweepOnboardingEventLogger != null) {
            return sweepOnboardingEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepOnboardingEventLogger");
        return null;
    }

    public final void setSweepOnboardingEventLogger(SweepOnboardingEventLogger sweepOnboardingEventLogger) {
        Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "<set-?>");
        this.sweepOnboardingEventLogger = sweepOnboardingEventLogger;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final Screen getAnalyticsScreen() {
        return (Screen) this.analyticsScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen analyticsScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.GOLD_VALUE_PROPS, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getSweepOnboardingEventLogger().logScreenAppear(getAnalyticsScreen());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getSweepOnboardingEventLogger().logScreenDisappear(getAnalyticsScreen());
        super.onStop();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1240526608);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240526608, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment.ComposeContent (SweepOnboardingLearnMoreGoldFragment.kt:45)");
            }
            ApiSweepFlow.LearnMoreGold learnMoreGold = ((Args) INSTANCE.getArgs((Fragment) this)).getLearnMoreGold();
            Callbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SweepOnboardingLearnMoreGoldFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SweepOnboardingLearnMoreGoldComposable.SweepOnboardingLearnMoreGoldComposable(learnMoreGold, (Function0) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingLearnMoreGoldFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SweepOnboardingLearnMoreGoldFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Args;", "Landroid/os/Parcelable;", "learnMoreGold", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$LearnMoreGold;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepFlow$LearnMoreGold;)V", "getLearnMoreGold", "()Lcom/robinhood/models/api/bonfire/ApiSweepFlow$LearnMoreGold;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiSweepFlow.LearnMoreGold learnMoreGold;

        /* compiled from: SweepOnboardingLearnMoreGoldFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiSweepFlow.LearnMoreGold) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiSweepFlow.LearnMoreGold learnMoreGold, int i, Object obj) {
            if ((i & 1) != 0) {
                learnMoreGold = args.learnMoreGold;
            }
            return args.copy(learnMoreGold);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSweepFlow.LearnMoreGold getLearnMoreGold() {
            return this.learnMoreGold;
        }

        public final Args copy(ApiSweepFlow.LearnMoreGold learnMoreGold) {
            Intrinsics.checkNotNullParameter(learnMoreGold, "learnMoreGold");
            return new Args(learnMoreGold);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.learnMoreGold, ((Args) other).learnMoreGold);
        }

        public int hashCode() {
            return this.learnMoreGold.hashCode();
        }

        public String toString() {
            return "Args(learnMoreGold=" + this.learnMoreGold + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.learnMoreGold, flags);
        }

        public Args(ApiSweepFlow.LearnMoreGold learnMoreGold) {
            Intrinsics.checkNotNullParameter(learnMoreGold, "learnMoreGold");
            this.learnMoreGold = learnMoreGold;
        }

        public final ApiSweepFlow.LearnMoreGold getLearnMoreGold() {
            return this.learnMoreGold;
        }
    }

    /* compiled from: SweepOnboardingLearnMoreGoldFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingLearnMoreGoldFragment$Args;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepOnboardingLearnMoreGoldFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepOnboardingLearnMoreGoldFragment sweepOnboardingLearnMoreGoldFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepOnboardingLearnMoreGoldFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepOnboardingLearnMoreGoldFragment newInstance(Args args) {
            return (SweepOnboardingLearnMoreGoldFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepOnboardingLearnMoreGoldFragment sweepOnboardingLearnMoreGoldFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepOnboardingLearnMoreGoldFragment, args);
        }
    }
}
