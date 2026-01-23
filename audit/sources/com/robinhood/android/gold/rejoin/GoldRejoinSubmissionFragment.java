package com.robinhood.android.gold.rejoin;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiGoldPaymentInstrument;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
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

/* compiled from: GoldRejoinSubmissionFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldRejoinSubmissionFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldRejoinSubmissionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public EventLogger eventLogger;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldRejoinSubmissionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GoldRejoinSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Callbacks;", "", "onRejoinLoaded", "", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "enableSweep", "", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Ljava/lang/Boolean;)V", "onRejoinFailed", "error", "", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRejoinFailed(Throwable error);

        void onRejoinLoaded(GoldUpgradeOutcome outcome, Boolean enableSweep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(GoldRejoinSubmissionFragment goldRejoinSubmissionFragment, int i, Composer composer, int i2) {
        goldRejoinSubmissionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(804576018);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(804576018, i2, -1, "com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment.ComposeContent (GoldRejoinSubmissionFragment.kt:33)");
            }
            Boolean enableSweep = ((Args) INSTANCE.getArgs((Fragment) this)).getEnableSweep();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldRejoinSubmissionFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Callbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GoldRejoinSubmissionFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function2 function2 = (Function2) ((KFunction) objRememberedValue2);
            Callbacks callbacks2 = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(callbacks2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new GoldRejoinSubmissionFragment3(callbacks2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            GoldRejoinSubmissionComposable4.GoldRejoinSubmissionComposable(enableSweep, function0, function2, (Function1) ((KFunction) objRememberedValue3), null, null, getRhToolbar(), composerStartRestartGroup, RhToolbar.$stable << 18, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.rejoin.GoldRejoinSubmissionFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldRejoinSubmissionFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(GoldRejoinSubmissionFragment goldRejoinSubmissionFragment) {
        EventLogger.DefaultImpls.logTap$default(goldRejoinSubmissionFragment.getEventLogger(), UserInteractionEventData.Action.GOLD_UPGRADE_SUCCESS, new Screen(null, null, goldRejoinSubmissionFragment.getScreenName(), null, 11, null), null, null, ((Args) INSTANCE.getArgs((Fragment) goldRejoinSubmissionFragment)).getLoggingContext(), false, 44, null);
        return Unit.INSTANCE;
    }

    /* compiled from: GoldRejoinSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Args;", "Landroid/os/Parcelable;", "enableSweep", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "signedAgreementTypes", "", "", "backupPaymentInstrument", "Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)V", "getEnableSweep", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getSignedAgreementTypes", "()Ljava/util/List;", "getBackupPaymentInstrument", "()Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/util/List;Lcom/robinhood/models/api/bonfire/ApiGoldPaymentInstrument;)Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Args;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiGoldPaymentInstrument backupPaymentInstrument;
        private final Boolean enableSweep;
        private final com.robinhood.rosetta.eventlogging.Context loggingContext;
        private final List<String> signedAgreementTypes;

        /* compiled from: GoldRejoinSubmissionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Args(boolValueOf, (com.robinhood.rosetta.eventlogging.Context) parcel.readSerializable(), parcel.createStringArrayList(), (ApiGoldPaymentInstrument) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, Boolean bool, com.robinhood.rosetta.eventlogging.Context context, List list, ApiGoldPaymentInstrument apiGoldPaymentInstrument, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = args.enableSweep;
            }
            if ((i & 2) != 0) {
                context = args.loggingContext;
            }
            if ((i & 4) != 0) {
                list = args.signedAgreementTypes;
            }
            if ((i & 8) != 0) {
                apiGoldPaymentInstrument = args.backupPaymentInstrument;
            }
            return args.copy(bool, context, list, apiGoldPaymentInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getEnableSweep() {
            return this.enableSweep;
        }

        /* renamed from: component2, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        public final List<String> component3() {
            return this.signedAgreementTypes;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
            return this.backupPaymentInstrument;
        }

        public final Args copy(Boolean enableSweep, com.robinhood.rosetta.eventlogging.Context loggingContext, List<String> signedAgreementTypes, ApiGoldPaymentInstrument backupPaymentInstrument) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Args(enableSweep, loggingContext, signedAgreementTypes, backupPaymentInstrument);
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
            return Intrinsics.areEqual(this.enableSweep, args.enableSweep) && Intrinsics.areEqual(this.loggingContext, args.loggingContext) && Intrinsics.areEqual(this.signedAgreementTypes, args.signedAgreementTypes) && Intrinsics.areEqual(this.backupPaymentInstrument, args.backupPaymentInstrument);
        }

        public int hashCode() {
            Boolean bool = this.enableSweep;
            int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.loggingContext.hashCode()) * 31;
            List<String> list = this.signedAgreementTypes;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            ApiGoldPaymentInstrument apiGoldPaymentInstrument = this.backupPaymentInstrument;
            return iHashCode2 + (apiGoldPaymentInstrument != null ? apiGoldPaymentInstrument.hashCode() : 0);
        }

        public String toString() {
            return "Args(enableSweep=" + this.enableSweep + ", loggingContext=" + this.loggingContext + ", signedAgreementTypes=" + this.signedAgreementTypes + ", backupPaymentInstrument=" + this.backupPaymentInstrument + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.enableSweep;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
            dest.writeSerializable(this.loggingContext);
            dest.writeStringList(this.signedAgreementTypes);
            dest.writeParcelable(this.backupPaymentInstrument, flags);
        }

        public Args(Boolean bool, com.robinhood.rosetta.eventlogging.Context loggingContext, List<String> list, ApiGoldPaymentInstrument apiGoldPaymentInstrument) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.enableSweep = bool;
            this.loggingContext = loggingContext;
            this.signedAgreementTypes = list;
            this.backupPaymentInstrument = apiGoldPaymentInstrument;
        }

        public /* synthetic */ Args(Boolean bool, com.robinhood.rosetta.eventlogging.Context context, List list, ApiGoldPaymentInstrument apiGoldPaymentInstrument, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : apiGoldPaymentInstrument);
        }

        public final Boolean getEnableSweep() {
            return this.enableSweep;
        }

        public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
            return this.loggingContext;
        }

        public final List<String> getSignedAgreementTypes() {
            return this.signedAgreementTypes;
        }

        public final ApiGoldPaymentInstrument getBackupPaymentInstrument() {
            return this.backupPaymentInstrument;
        }
    }

    /* compiled from: GoldRejoinSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionFragment$Args;", "<init>", "()V", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldRejoinSubmissionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldRejoinSubmissionFragment goldRejoinSubmissionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldRejoinSubmissionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldRejoinSubmissionFragment newInstance(Args args) {
            return (GoldRejoinSubmissionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldRejoinSubmissionFragment goldRejoinSubmissionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldRejoinSubmissionFragment, args);
        }
    }
}
