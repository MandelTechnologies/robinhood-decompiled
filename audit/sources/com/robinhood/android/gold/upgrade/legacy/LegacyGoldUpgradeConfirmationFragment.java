package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.gold.contracts.GoldUpgradeConfirmationFragmentContract;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
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

/* compiled from: LegacyGoldUpgradeConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\r\u0010%\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010&R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeConfirmationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeConfirmationFragment extends GenericComposeFragment {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyGoldUpgradeConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(GoldUpgradeConfirmationFragmentContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof GoldUpgradeConfirmationFragmentContract.Callbacks)) {
                parentFragment = null;
            }
            GoldUpgradeConfirmationFragmentContract.Callbacks callbacks = (GoldUpgradeConfirmationFragmentContract.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldUpgradeConfirmationFragmentContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen loggingScreen = new Screen(Screen.Name.GOLD_UPGRADE_SUCCESS, getScreenName(), null, null, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(LegacyGoldUpgradeConfirmationFragment legacyGoldUpgradeConfirmationFragment, int i, Composer composer, int i2) {
        legacyGoldUpgradeConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final GoldUpgradeConfirmationFragmentContract.Callbacks getCallbacks() {
        return (GoldUpgradeConfirmationFragmentContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "GoldUpgradeConfirmationFragment";
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return requireBaseActivity().getScreenDescription();
    }

    private final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
        return ((GoldUpgradeConfirmationFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getLoggingContext();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.loggingScreen, null, null, getLoggingContext(), 13, null);
        requireBaseActivity().overrideStatusBarStyle(false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        requireBaseActivity().resetStatusBarStyleOverride();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.loggingScreen, null, null, getLoggingContext(), 13, null);
        super.onStop();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-75263372);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-75263372, i2, -1, "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationFragment.ComposeContent (LegacyGoldUpgradeConfirmationFragment.kt:70)");
            }
            Companion companion = INSTANCE;
            GoldUpgradeOutcome outcome = ((GoldUpgradeConfirmationFragmentContract.Key) companion.getArgs((Fragment) this)).getOutcome();
            ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation = ((GoldUpgradeConfirmationFragmentContract.Key) companion.getArgs((Fragment) this)).getGoldConfirmation();
            boolean zIsSweepEnabled = ((GoldUpgradeConfirmationFragmentContract.Key) companion.getArgs((Fragment) this)).isSweepEnabled();
            GoldUpgradeConfirmationFragmentContract.Callbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LegacyGoldUpgradeConfirmationFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function2 function2 = (Function2) ((KFunction) objRememberedValue);
            GoldUpgradeConfirmationFragmentContract.Callbacks callbacks2 = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(callbacks2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new LegacyGoldUpgradeConfirmationFragment3(callbacks2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LegacyGoldUpgradeConfirmationComposable.GoldUpgradeConfirmationComposable(outcome, goldConfirmation, zIsSweepEnabled, function2, (Function0) ((KFunction) objRememberedValue2), null, composerStartRestartGroup, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeConfirmationFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LegacyGoldUpgradeConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeConfirmationFragment$Args;", "Landroid/os/Parcelable;", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "goldConfirmation", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "isSweepEnabled", "", "<init>", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;Z)V", "getOutcome", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getGoldConfirmation", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation;
        private final boolean isSweepEnabled;
        private final com.robinhood.rosetta.eventlogging.Context loggingContext;
        private final GoldUpgradeOutcome outcome;

        /* compiled from: LegacyGoldUpgradeConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((GoldUpgradeOutcome) parcel.readParcelable(Args.class.getClassLoader()), (com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable(), (ApiGoldUpgradeFlow.ApiGoldConfirmation) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, GoldUpgradeOutcome goldUpgradeOutcome, com.robinhood.rosetta.eventlogging.Context context, ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                goldUpgradeOutcome = args.outcome;
            }
            if ((i & 2) != 0) {
                context = args.loggingContext;
            }
            if ((i & 4) != 0) {
                apiGoldConfirmation = args.goldConfirmation;
            }
            if ((i & 8) != 0) {
                z = args.isSweepEnabled;
            }
            return args.copy(goldUpgradeOutcome, context, apiGoldConfirmation, z);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldUpgradeOutcome getOutcome() {
            return this.outcome;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiGoldUpgradeFlow.ApiGoldConfirmation getGoldConfirmation() {
            return this.goldConfirmation;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSweepEnabled() {
            return this.isSweepEnabled;
        }

        public final Args copy(GoldUpgradeOutcome outcome, com.robinhood.rosetta.eventlogging.Context loggingContext, ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation, boolean isSweepEnabled) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(goldConfirmation, "goldConfirmation");
            return new Args(outcome, loggingContext, goldConfirmation, isSweepEnabled);
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
            return Intrinsics.areEqual(this.outcome, args.outcome) && Intrinsics.areEqual(this.loggingContext, args.loggingContext) && Intrinsics.areEqual(this.goldConfirmation, args.goldConfirmation) && this.isSweepEnabled == args.isSweepEnabled;
        }

        public int hashCode() {
            return (((((this.outcome.hashCode() * 31) + this.loggingContext.hashCode()) * 31) + this.goldConfirmation.hashCode()) * 31) + Boolean.hashCode(this.isSweepEnabled);
        }

        public String toString() {
            return "Args(outcome=" + this.outcome + ", loggingContext=" + this.loggingContext + ", goldConfirmation=" + this.goldConfirmation + ", isSweepEnabled=" + this.isSweepEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.outcome, flags);
            dest.writeSerializable(this.loggingContext);
            dest.writeParcelable(this.goldConfirmation, flags);
            dest.writeInt(this.isSweepEnabled ? 1 : 0);
        }

        public Args(GoldUpgradeOutcome outcome, com.robinhood.rosetta.eventlogging.Context loggingContext, ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation, boolean z) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            Intrinsics.checkNotNullParameter(goldConfirmation, "goldConfirmation");
            this.outcome = outcome;
            this.loggingContext = loggingContext;
            this.goldConfirmation = goldConfirmation;
            this.isSweepEnabled = z;
        }

        public final GoldUpgradeOutcome getOutcome() {
            return this.outcome;
        }

        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        public final ApiGoldUpgradeFlow.ApiGoldConfirmation getGoldConfirmation() {
            return this.goldConfirmation;
        }

        public final boolean isSweepEnabled() {
            return this.isSweepEnabled;
        }
    }

    /* compiled from: LegacyGoldUpgradeConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeConfirmationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeConfirmationFragment;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeConfirmationFragmentContract$Key;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LegacyGoldUpgradeConfirmationFragment, GoldUpgradeConfirmationFragmentContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldUpgradeConfirmationFragmentContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GoldUpgradeConfirmationFragmentContract.Key getArgs(LegacyGoldUpgradeConfirmationFragment legacyGoldUpgradeConfirmationFragment) {
            return (GoldUpgradeConfirmationFragmentContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LegacyGoldUpgradeConfirmationFragment newInstance(GoldUpgradeConfirmationFragmentContract.Key key) {
            return (LegacyGoldUpgradeConfirmationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LegacyGoldUpgradeConfirmationFragment legacyGoldUpgradeConfirmationFragment, GoldUpgradeConfirmationFragmentContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, legacyGoldUpgradeConfirmationFragment, key);
        }
    }
}
